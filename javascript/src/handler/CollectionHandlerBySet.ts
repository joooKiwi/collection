/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {ValueHolder}      from "./value/ValueHolder"

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
 * An implementation of a {@link CollectionHolder} for an {@link ReadonlySet set}
 *
 * @beta
 * @see CollectionHandlerBySetOf1
 * @see CollectionHandlerBySetOf2
 */
export class CollectionHandlerBySet<const T = unknown,
    const REFERENCE extends ReadonlySet<T> = ReadonlySet<T>,
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    #iterator?: IterableIterator<T>
    readonly #size: REFERENCE["size"]
    readonly #isEmpty: boolean
    #hasNull?: boolean
    #hasFinished: boolean

    #lastIndexRetrieved?: number

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
        const size = this.#size = reference.size
        if (size == 0) {
            this.#hasFinished = this.#isEmpty = true
            this.#hasNull = false
            return
        }

        this.#hasFinished = this.#isEmpty = false
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter & setter methods --------------------

    public get size(): REFERENCE["size"] { return this.#size }
    public override get isEmpty(): boolean { return this.#isEmpty }

    public override get hasNull(): boolean {
        const value = this.#hasNull
        if (value != null)
            return value

        if (this.hasFinished)
            return this.#hasNull = this._collection.hasNull

        if (this.isEmpty) {
            this._lastIndexRetrieved = 0
            this._hasFinished = true
            return this.#hasNull = false
        }

        // We first try to find any null in the collection from the values already set
        const collection = this._collection
        const lastIndexPlus1 = this._lastIndexRetrieved + 1
        let index = -1
        while (++index < lastIndexPlus1)
            if (collection[index] == null)
                return this.#hasNull = true

        // We continue the process from the followed iterator to starting setting to the collection
        index--
        const iterator = this._iterator
        const size = this.size
        while (++index < size)
            if ((collection[index] = iterator.next().value as T) == null) {
                this._lastIndexRetrieved = index
                return this.#hasNull = true
            }

        // We are now at the end, and every value had been retrieved and set to the collection
        this._lastIndexRetrieved = index - 1
        this._hasFinished = true
        return this.#hasNull = false
    }

    public override get hasDuplicate(): false { return false }

    public override get hasFinished(): boolean { return this._hasFinished }
    /** Tell if the {@link CollectionHandlerBySet handler} has finished processing every single value */
    protected get _hasFinished(): boolean { return this.#hasFinished }
    /** The {@link CollectionHandlerBySet handler} has finished processing every single value */
    protected set _hasFinished(value: true,) { this.#hasFinished = value }


    protected get _iterator(): IterableIterator<T> { return this.#iterator ??= this._reference[Symbol.iterator]() }

    /** The last index retrieved (<b>-1</b> by default) */
    protected get _lastIndexRetrieved(): number { return this.#lastIndexRetrieved ?? -1 }

    /** Set the last index retrieved */
    protected set _lastIndexRetrieved(value: number,) { this.#lastIndexRetrieved = value }

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

            const iterator = this._iterator
            const indexPlus1 = index + 1
            const lastIndexRetrieved = this._lastIndexRetrieved
            let indexToFind = lastIndexRetrieved == -1 ? -1 : lastIndexRetrieved
            while (++indexToFind < indexPlus1)
                collection[indexToFind] = iterator.next().value

            if (lastIndexRetrieved == size)
                this._hasFinished = true

            return new ValidValueHolder(collection[this._lastIndexRetrieved = indexToFind - 1] as T,)
        }

        const indexToRetrieve = index < 0 ? size + index : index
        if (indexToRetrieve < 0)
            return new UnderZeroIndexAfterCalculationValueHolder(index, indexToRetrieve,)
        if (indexToRetrieve > size)
            return new OverSizeIndexAfterCalculationValueHolder(index, indexToRetrieve, size,)

        if (this.hasFinished)
            return new ValidValueHolder(collection[indexToRetrieve] as T,)
        if (indexToRetrieve in collection)
            return new ValidValueHolder(collection[indexToRetrieve] as T,)

        const iterator = this._iterator
        const indexToRetrievePlus1 = indexToRetrieve + 1
        const lastIndexRetrieved = this._lastIndexRetrieved
        let indexToFind = lastIndexRetrieved == -1 ? -1 : lastIndexRetrieved
        while (++indexToFind < indexToRetrievePlus1)
            collection[indexToFind] = iterator.next().value

        if (indexToFind == size)
            this._hasFinished = true

        return new ValidValueHolder(collection[this._lastIndexRetrieved = indexToFind - 1] as T,)
    }

    //#endregion -------------------- Methods --------------------

}
