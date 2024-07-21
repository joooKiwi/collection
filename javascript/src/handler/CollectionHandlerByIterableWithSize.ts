/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}         from "../CollectionHolder"
import type {ValueHolder}              from "./value/ValueHolder"
import type {PossibleIterableWithSize} from "../iterable/types"

import {CollectionHandlerByIterable}               from "./CollectionHandlerByIterable"
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
 * An implementation of a {@link CollectionHandler} for an iterable with
 * a {@link IterableWithSize size}, {@link IterableWithLength length} or {@link IterableWithCount count} field
 *
 * @beta
 * @see CollectionHandlerByIterable
 * @see CollectionHandlerByIterableWithSizeOf1
 * @see CollectionHandlerByIterableWithSizeOf2
 */
export class CollectionHandlerByIterableWithSize<const T = unknown,
    const REFERENCE extends PossibleIterableWithSize<T> = PossibleIterableWithSize<T>,
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends CollectionHandlerByIterable<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    readonly #size: number
    readonly #isEmpty: boolean
    #hasNull?: boolean
    readonly #hasDuplicate?: boolean
    #hasFinished: boolean

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE, size: number,) {
        super(collection, reference,)
        this.#size = size
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

    public override get size(): number { return this.#size }

    public override get isEmpty(): boolean { return this.#isEmpty }

    public override get hasNull(): boolean {
        const value = this.#hasNull
        if (value != null)
            return value

        if (this.hasFinished)
            return this.#hasNull = this._collection.hasNull

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
        this._lastIndexRetrieved = index
        this._hasFinished = true
        return this.#hasNull = false
    }

    public override get hasDuplicate(): boolean {
        const value = this.#hasDuplicate
        if (value != null)
            return value
        return super.hasDuplicate
    }


    public override get hasFinished(): boolean { return this._hasFinished }
    /** Tell if the {@link CollectionHandlerByIterableWithSize handler} has finished processing every single value */
    protected override get _hasFinished(): boolean { return this.#hasFinished }
    /** The {@link CollectionHandlerByIterableWithSize handler} has finished processing every single value */
    protected override set _hasFinished(value: true,) { this.#hasFinished = value }

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

            const lastIndexRetrieved = this._lastIndexRetrieved
            const iterator = this._iterator
            let iteratorIndex = lastIndexRetrieved == -1 ? -1 : lastIndexRetrieved
            let iteratorValue: IteratorResult<T, unknown>
            while (!(iteratorValue = iterator.next()).done) {
                const value = collection[++iteratorIndex] = iteratorValue.value
                if (iteratorIndex !== index)
                    continue

                this._lastIndexRetrieved = iteratorIndex
                return new ValidValueHolder(value,)
            }
            this._hasFinished = true

            return new ValidValueHolder(collection[iteratorIndex - 1] as T,)
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

        const lastIndexRetrieved = this._lastIndexRetrieved
        const iterator = this._iterator
        let iteratorIndex = lastIndexRetrieved == -1 ? -1 : lastIndexRetrieved
        let iteratorValue: IteratorResult<T, unknown>
        while (!(iteratorValue = iterator.next()).done) {
            const value = collection[++iteratorIndex] = iteratorValue.value
            if (iteratorIndex !== indexToRetrieve)
                continue

            this._lastIndexRetrieved = iteratorIndex
            if (indexToRetrieve > iteratorIndex)
                return new OverSizeIndexValueHolder(index, iteratorIndex,)
            return new ValidValueHolder(value,)
        }
        this._hasFinished = true

        return new ValidValueHolder(collection[iteratorIndex - 1] as T,)
    }

    //#endregion -------------------- Methods --------------------

}
