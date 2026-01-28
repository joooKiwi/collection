//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {NullOrBoolean} from "@joookiwi/type"

import type {CollectionHolder}   from "../CollectionHolder"
import type {ValueHolder}        from "./value/ValueHolder"
import type {CollectionIterator} from "../iterator/CollectionIterator"

import {AbstractCollectionHandler}                 from "./AbstractCollectionHandler"
import {EmptyCollectionValueHolder}                from "./value/EmptyCollectionValueHolder"
import {NaNIndexValueHolder}                       from "./value/NaNIndexValueHolder"
import {NegativeInfinityIndexValueHolder}          from "./value/NegativeInfinityIndexValueHolder"
import {OverSizeIndexValueHolder}                  from "./value/OverSizeIndexValueHolder"
import {OverSizeIndexAfterCalculationValueHolder}  from "./value/OverSizeIndexAfterCalculationValueHolder"
import {PositiveInfinityIndexValueHolder}          from "./value/PositiveInfinityIndexValueHolder"
import {SizeIndexValueHolder}                      from "./value/SizeIndexValueHolder"
import {ValidValueHolder}                          from "./value/ValidValueHolder"
import {UnderZeroIndexAfterCalculationValueHolder} from "./value/UnderZeroIndexAfterCalculationValueHolder"

/**
 * An implementation of a {@link CollectionHandler} for a {@link CollectionIterator}
 *
 * @beta
 * @see CollectionHandlerByCollectionIteratorOf1
 * @see CollectionHandlerByCollectionIteratorOf2
 */
export class CollectionHandlerByCollectionIterator<const T = unknown,
    const REFERENCE extends CollectionIterator<T> = CollectionIterator<T>,
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    #size?: REFERENCE["size"]
    #isEmpty?: boolean
    #hasNull?: boolean
    #hasDuplicate?: boolean
    #hasFinished?: boolean

    #lastIndex?: number

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE,) { super(collection, reference,) }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter & setter methods --------------------

    public override get size(): REFERENCE["size"] { return this.#size ??= this._reference.size }

    public override get isEmpty(): boolean { return this.#isEmpty ??= this.size == 0 }

    public override get hasNull(): boolean {
        const value = this.#hasNull
        if (value != null)
            return value

        if (this.hasFinished)
            return this.#hasNull = this._collection.hasNull

        if (this.isEmpty) {
            this._lastIndex = 0
            this._hasFinished = true
            return this.#hasNull = false
        }

        // We first try to find any null in the collection from the values already set
        const collection = this._collection
        const lastIndex = this._lastIndex
        let index = -1
        while (++index < lastIndex)
            if (collection[index] == null)
                return this.#hasNull = true

        // We continue the process from the followed iterator to starting setting to the collection
        index--
        const reference = this._reference
        while (reference.hasNext)
            if ((collection[++index] = reference.nextValue) == null) {
                this._lastIndex = index
                return this.#hasNull = true
            }

        // We are now at the end, and every value had been retrieved and set to the collection
        this._lastIndex = index
        this._hasFinished = true
        return this.#hasNull = false
    }

    public override get hasDuplicate(): boolean {
        const value = this.#hasDuplicate
        if (value != null)
            return value

        if (this.hasFinished)
            return this.#hasDuplicate = this._collection.hasDuplicate

        if (this.isEmpty) {
            this._lastIndex = 0
            this._hasFinished = true
            return this.#hasDuplicate = false
        }

        const size = this.size
        if (size == 1)
            return this.#hasDuplicate = false

        //TODO add logic to compare if it exist and _lastIndex++ logic
        const reference = this._reference
        const collection = this._collection
        const temporaryArray = []
        collection[0] = temporaryArray[0] = reference.nextValue
        let amountOfItemAdded = 1
        let index = 0
        while (reference.hasNext) {
            const value = collection[++index] = reference.nextValue
            let index2 = -1

            if (value === null) {
                while (++index2 < amountOfItemAdded)
                    if (temporaryArray[index2] === null) {
                        this._lastIndex = index
                        return this.#hasDuplicate = true
                    }
                temporaryArray[amountOfItemAdded++] = null as T
                continue
            }

            if (value === undefined) {
                while (++index2 < amountOfItemAdded)
                    if (temporaryArray[index2] === undefined) {
                        this._lastIndex = index
                        return this.#hasDuplicate = true
                    }
                temporaryArray[amountOfItemAdded++] = undefined as T
                continue
            }

            while (++index2 < amountOfItemAdded)
                if (temporaryArray[index2] === value) {
                    this._lastIndex = index
                    return this.#hasDuplicate = true
                }
            temporaryArray[amountOfItemAdded++] = value
        }

        // We are now at the end, and every value had been retrieved and set to the collection
        this._lastIndex = index
        this._hasFinished = true
        return this.#hasDuplicate = false
    }


    public override get hasFinished(): boolean { return this._hasFinished ??= !this._reference.hasNext }

    /** Tell if the {@link CollectionHandlerByCollectionIterator handler} might have finished processing every single value */
    protected get _hasFinished(): NullOrBoolean { return this.#hasFinished ?? null }

    /** Set the state to tell if the {@link CollectionHandlerByCollectionIterator handler} has finished processing every single value */
    protected set _hasFinished(value: boolean,) { this.#hasFinished = value }

    /** The last index retrieved from the value */
    protected get _lastIndex(): number { return this.#lastIndex ?? 0 }

    /** Set the last index retrieved from the value */
    protected set _lastIndex(value: number,) { this.#lastIndex = value }

    //#endregion -------------------- Getter & setter methods --------------------
    //#region -------------------- Methods --------------------

    public override get(index: number,): ValueHolder<T> {
        if (this.isEmpty)
            return new EmptyCollectionValueHolder(index,)

        if (Number.isNaN(index,))
            return new NaNIndexValueHolder(index,)
        if (index == Number.NEGATIVE_INFINITY)
            return new NegativeInfinityIndexValueHolder(index,)
        if (index == Number.POSITIVE_INFINITY)
            return new PositiveInfinityIndexValueHolder(index,)

        const collection = this._collection
        if (index in collection)
            return new ValidValueHolder(collection[index] as T,)

        const size = this.size
        if (index == size)
            return new SizeIndexValueHolder(index, size,)
        if (index > size)
            return new OverSizeIndexValueHolder(index, size,)

        if (index >= 0) {
            if (this.hasFinished)
                return new ValidValueHolder(collection[index] as T,)

            const reference = this._reference
            const indexPlus1 = index + 1
            let indexToFind = this._lastIndex - 1
            while(++indexToFind < indexPlus1)
                collection[indexToFind] = reference.nextValue

            if (indexToFind == size)
                this._hasFinished = true

            return new ValidValueHolder(collection[(this._lastIndex = indexToFind) - 1] as T,)
        }

        const indexToRetrieve = size + index
        if (indexToRetrieve < 0)
            return new UnderZeroIndexAfterCalculationValueHolder(index, indexToRetrieve,)
        if (indexToRetrieve > size)
            return new OverSizeIndexAfterCalculationValueHolder(index, indexToRetrieve, size,)

        if (this.hasFinished)
            return new ValidValueHolder(collection[indexToRetrieve] as T,)
        if (indexToRetrieve in collection)
            return new ValidValueHolder(collection[indexToRetrieve] as T,)

        const reference = this._reference
        const indexToRetrievePlus1 = indexToRetrieve + 1
        let indexToFind = this._lastIndex - 1
        while(++indexToFind < indexToRetrievePlus1)
            collection[indexToFind] = reference.nextValue

        if (indexToFind == size)
            this._hasFinished = true

        return new ValidValueHolder(collection[(this._lastIndex = indexToFind) - 1] as T,)
    }

    //#endregion -------------------- Methods --------------------

}
