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

import type {CollectionHolder} from "../CollectionHolder"
import type {ValueHolder}      from "./value/ValueHolder"

import {AbstractCollectionHandler}                 from "./AbstractCollectionHandler"
import {EmptyCollectionValueHolder}                from "./value/EmptyCollectionValueHolder"
import {NaNIndexValueHolder}                       from "./value/NaNIndexValueHolder"
import {NegativeInfinityIndexValueHolder}          from "./value/NegativeInfinityIndexValueHolder"
import {OverSizeIndexValueHolder}                  from "./value/OverSizeIndexValueHolder"
import {OverSizeIndexAfterCalculationValueHolder}  from "./value/OverSizeIndexAfterCalculationValueHolder"
import {PositiveInfinityIndexValueHolder}          from "./value/PositiveInfinityIndexValueHolder"
import {ValidValueHolder}                          from "./value/ValidValueHolder"
import {SizeIndexValueHolder}                      from "./value/SizeIndexValueHolder"
import {UnderZeroIndexAfterCalculationValueHolder} from "./value/UnderZeroIndexAfterCalculationValueHolder"

/**
 * An implementation of a {@link CollectionHolder} for an {@link ReadonlyArray array}
 *
 * @see CollectionHandlerByArrayOf1
 * @see CollectionHandlerByArrayOf2
 * @deprecated Replace with {@link ArrayAsCollectionHolder}. This will be removed in v2.0
 */
export class CollectionHandlerByArray<const T = unknown,
    const REFERENCE extends readonly T[] = readonly T[],
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    readonly #size: number
    readonly #isEmpty: boolean
    #hasNull?: boolean
    #hasDuplicate?: boolean
    #hasFinished: boolean

    #amountOfElementRetrieved?: number

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
        const size = this.#size = reference.length
        if (size == 0) {
            this.#hasFinished = this.#isEmpty = true
            this.#hasNull = this.#hasDuplicate = false
            return
        }

        this.#hasFinished = this.#isEmpty = false
        if (size != 1)
            return
        this.#hasDuplicate = false
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter & setter methods --------------------

    public override get size(): REFERENCE["length"] { return this.#size }
    public override get isEmpty(): boolean { return this.#isEmpty }

    public override get hasNull(): boolean {
        const value = this.#hasNull
        if (value != null)
            return value

        if (this.hasFinished)
            return this.#hasNull = this._collection.hasNull

        if (this.isEmpty) {
            this._amountOfElementRetrieved = 0
            this._hasFinished = true
            return this.#hasNull = false
        }

        // We check if the value exists in the collection,
        // it compares its nullability
        // and then, if it does exist in the collection, it is added to the "amountOfElementRetrieved"
        const reference = this._reference
        const collection = this._collection
        let index = this.size
        while (--index >= 0) {
            if (index in collection)
                if (collection[index] == null)
                    return this.#hasNull = true
                else
                    continue

            const value = reference[index]
            this._amountOfElementRetrieved++
            if ((collection[index] = value) == null)
                return this.#hasNull = true
        }

        // We are now at the end, and every value had been retrieved and set to the collection
        this._hasFinished = true
        return this.#hasNull = false
    }

    public get hasDuplicate(): boolean {
        const hasDuplicate = this.#hasDuplicate
        if (hasDuplicate != null)
            return hasDuplicate

        if (this.hasFinished)
            return this.#hasDuplicate = this._collection.hasDuplicate

        if (this.isEmpty) {
            this._amountOfElementRetrieved = 0
            this._hasFinished = true
            return this.#hasDuplicate = false
        }

        //TODO add logic to compare if it exist and _lastIndex++ logic
        const reference = this._reference
        const collection = this._collection
        const size = this.size
        const temporaryArray = new Array<T>(size,)
        collection[0] = temporaryArray[0] = reference[0] as T
        let amountOfItemAdded = 1
        let index = 0
        while (++index < size) {
            const value = collection[index] = reference[index] as T
            let index2 = -1

            if (value === null) {
                while (++index2 < amountOfItemAdded)
                    if (temporaryArray[index2] === null) {
                        this._amountOfElementRetrieved = temporaryArray.length
                        return this.#hasDuplicate = true
                    }
                temporaryArray[amountOfItemAdded++] = null as T
                continue
            }

            if (value === undefined) {
                while (++index2 < amountOfItemAdded)
                    if (temporaryArray[index2] === undefined) {
                        this._amountOfElementRetrieved = temporaryArray.length
                        return this.#hasDuplicate = true
                    }
                temporaryArray[amountOfItemAdded++] = undefined as T
                continue
            }

            while (++index2 < amountOfItemAdded)
                if (temporaryArray[index2] === value) {
                    this._amountOfElementRetrieved = temporaryArray.length
                    return this.#hasDuplicate = true
                }
            temporaryArray[amountOfItemAdded++] = value
        }

        // We are now at the end, and every value had been retrieved and set to the collection
        this._amountOfElementRetrieved = size - 1
        this._hasFinished = true
        return this.#hasDuplicate = false
    }

    public override get hasFinished(): boolean { return this._hasFinished }
    /** Tell if the {@link CollectionHandlerByArray handler} has finished processing every single value */
    protected get _hasFinished(): boolean { return this.#hasFinished }
    /** The {@link CollectionHandlerByArray handler} has finished processing every single value */
    protected set _hasFinished(value: true,) { this.#hasFinished = value }


    /** The amount of element that was retrieved so far */
    protected get _amountOfElementRetrieved(): number { return this.#amountOfElementRetrieved ?? 0 }

    /** Set the amount of element that was retrieved so far */
    protected set _amountOfElementRetrieved(value: number,) { this.#amountOfElementRetrieved = value }

    //#endregion -------------------- Getter & setter methods --------------------
    //#region -------------------- Methods --------------------

    public get(index: number,): ValueHolder<T> {
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

            if (size - 1 == this._amountOfElementRetrieved++)
                this._hasFinished = true
            return new ValidValueHolder(collection[index] = this._reference[index] as T,)
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

        if (size - 1 == this._amountOfElementRetrieved++)
            this._hasFinished = true
        return new ValidValueHolder(collection[indexToRetrieve] = this._reference[indexToRetrieve] as T,)
    }

    //#endregion -------------------- Methods --------------------

}
