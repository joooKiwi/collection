/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOrBoolean} from "@joookiwi/type"

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
 * An implementation of a {@link CollectionHandler} for an {@link Iterable}
 *
 * @beta
 * @see CollectionHandlerByIterableWithSize
 * @see CollectionHandlerByIterableWithSizeOf1
 * @see CollectionHandlerByIterableWithSizeOf2
 */
export class CollectionHandlerByIterable<const T = unknown,
    const REFERENCE extends Iterable<T> = Iterable<T>,
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    #iterator?: Iterator<T, unknown, unknown>

    #size?: number
    #isEmpty?: boolean
    #hasNull?: boolean
    #hasDuplicate?: boolean
    #hasFinished?: boolean

    #lastIndexRetrieved?: number

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE,) { super(collection, reference,) }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter & setter methods --------------------

    public override get size(): number {
        const value = this.#size
        if (value != null)
            return value

        if (this._hasFinished === true)
            return this.#size = this._collection.size

        const iterator = this._iterator
        let iteratorValue = iterator.next()
        if (iteratorValue.done) {
            this._hasFinished = true
            if (this._isTheFirstElementRetrieved) {
                this.#isEmpty = true
                return this.#size = 0
            }
            this.#isEmpty = false
            return this.#size = this._lastIndexRetrieved + 1
        }

        const collection = this._collection
        let index = this._lastIndexRetrieved
        while (!iteratorValue.done) {
            collection[++index] = iteratorValue.value
            iteratorValue = iterator.next()
        }

        this._hasFinished = true
        const size = this.#size = (this._lastIndexRetrieved = index) + 1
        this.#isEmpty = size == 0
        return size
    }

    public override get isEmpty(): boolean {
        const value = this.#isEmpty
        if (value != null)
            return value

        if (this._hasFinished === true)
            return this.#isEmpty = this._collection.isEmpty

        const iteratorValue = this._iterator.next()
        if (iteratorValue.done) {
            this._hasFinished = true
            if (this._isTheFirstElementRetrieved) {
                this.#size = 0
                return this.#isEmpty = true
            }
            this.#size = this._lastIndexRetrieved + 1
            return this.#isEmpty = false
        }

        this._collection[0] = iteratorValue.value
        this._lastIndexRetrieved = 0
        return this.#isEmpty = false
    }

    public override get hasNull(): boolean {
        const value = this.#hasNull
        if (value != null)
            return value

        if (this._hasFinished === true)
            return this.#hasNull = this._collection.hasNull

        // We first try to find any null in the collection from the values already set
        const collection = this._collection
        const lastIndexPlus1 = this._lastIndexRetrieved + 1
        let index = -1
        while (++index > lastIndexPlus1)
            if (collection[index] == null)
                return this.#hasNull = true

        // We continue the process from the followed iterator to starting setting to the collection
        index--
        const iterator = this._iterator
        let iteratorResult: IteratorResult<T, unknown>
        while (!(iteratorResult = iterator.next()).done)
            if ((collection[++index] = iteratorResult.value as T) == null) {
                this._lastIndexRetrieved = index
                return this.#hasNull = true
            }

        // We are now at the end, and every value had been retrieved and set to the collection
        this._lastIndexRetrieved = index
        this._hasFinished = true
        return this.#hasNull = false
    }

    public override get hasDuplicate(): boolean {
        const hasDuplicate = this.#hasDuplicate
        if (hasDuplicate != null)
            return hasDuplicate

        if (this._hasFinished === true)
            return this.#hasDuplicate = this._collection.hasDuplicate

        //FIXME: use the same logic as the CollectionHandler-by-CollectionIterator instance
        //TODO add logic to compare if it exist and _lastIndexRetrieved++ logic
        const reference = this._reference
        const iterator: Iterator<T, unknown, unknown> = reference[Symbol.iterator]()
        const collection = this._collection
        const temporaryArray = []
        collection[0] = temporaryArray[0] = iterator.next().value as T
        let iteratorResult: IteratorResult<T, unknown>
        let amountOfItemAdded = 1
        let index = 0
        while (!(iteratorResult = iterator.next()).done) {
            const value = collection[++index] = iteratorResult.value
            let index2 = -1

            if (value === null) {
                while (++index2 < amountOfItemAdded)
                    if (temporaryArray[index2] === null) {
                        //#region -------------------- Iterator held to be at the same point --------------------

                        const amountOfElementRetrieved = this._lastIndexRetrieved
                        if (amountOfElementRetrieved < amountOfItemAdded) {
                            let amountOfTimeToLoop = amountOfItemAdded - amountOfElementRetrieved
                            const iterator2 = this._iterator
                            while(amountOfTimeToLoop-- > 0)
                                iterator2.next()
                            this._lastIndexRetrieved = amountOfItemAdded
                        }

                        //#endregion -------------------- Iterator held to be at the same point --------------------
                        return this.#hasDuplicate = true
                    }
                temporaryArray[amountOfItemAdded++] = null as T
                continue
            }

            if (value === undefined) {
                while (++index2 < amountOfItemAdded)
                    if (temporaryArray[index2] === undefined) {
                        //#region -------------------- Iterator held to be at the same point --------------------

                        const amountOfElementRetrieved = this._lastIndexRetrieved
                        if (amountOfElementRetrieved < amountOfItemAdded) {
                            let amountOfTimeToLoop = amountOfItemAdded - amountOfElementRetrieved
                            const iterator2 = this._iterator
                            while(amountOfTimeToLoop-- > 0)
                                iterator2.next()
                            this._lastIndexRetrieved = amountOfItemAdded
                        }

                        //#endregion -------------------- Iterator held to be at the same point --------------------
                        return this.#hasDuplicate = true
                    }
                temporaryArray[amountOfItemAdded++] = undefined as T
                continue
            }

            while (++index2 < amountOfItemAdded)
                if (temporaryArray[index2] === value) {
                    //#region -------------------- Iterator held to be at the same point --------------------

                    const amountOfElementRetrieved = this._lastIndexRetrieved
                    if (amountOfElementRetrieved < amountOfItemAdded) {
                        let amountOfTimeToLoop = amountOfItemAdded - amountOfElementRetrieved
                        const iterator2 = this._iterator
                        while(amountOfTimeToLoop-- > 0)
                            iterator2.next()
                        this._lastIndexRetrieved = amountOfItemAdded
                    }

                    //#endregion -------------------- Iterator held to be at the same point --------------------
                    return this.#hasDuplicate = true
                }
            temporaryArray[amountOfItemAdded++] = value
        }

        this._lastIndexRetrieved = amountOfItemAdded
        this._hasFinished = true
        return this.#hasDuplicate = false
    }


    public override get hasFinished(): boolean {
        const value = this._hasFinished
        if (value != null)
            return value

        const iteratorValue = this._iterator.next()
        if (iteratorValue.done)
            return this._hasFinished = true

        this._collection[0] = iteratorValue.value
        return this._hasFinished = false
    }

    /** Tell if the {@link CollectionHandlerByIterable handler} might have finished processing every single value */
    protected get _hasFinished(): NullOrBoolean { return this.#hasFinished ?? null }

    /** Set the state to tell if the {@link CollectionHandlerByIterable handler} has finished processing every single value */
    protected set _hasFinished(value: boolean,) { this.#hasFinished = value }


    protected get _iterator(): Iterator<T, unknown, unknown> {
        return this.#iterator ??= this._reference[Symbol.iterator]()
    }

    /** Tell that the {@link _lastIndexRetrieved} is equal to -1 */
    protected get _isTheFirstElementRetrieved(): boolean { return this._lastIndexRetrieved == -1 }

    /** The last index retrieved (<b>-1</b> by default) */
    protected get _lastIndexRetrieved(): number { return this.#lastIndexRetrieved ?? -1 }

    /** Set the last index retrieved */
    protected set _lastIndexRetrieved(value: number,) { this.#lastIndexRetrieved = value }

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

        if (index < 0) {
            if (this._hasFinished === true)
                return this.#getInCollectionIfNegativeIndexAndHasFinished(index, collection,)

            const lastIndex = this._lastIndexRetrieved
            const iterator = this._iterator
            let iteratorIndex = lastIndex
            let iteratorResult: IteratorResult<T, unknown>
            while (!(iteratorResult = iterator.next()).done)
                collection[++iteratorIndex] = iteratorResult.value

            const size = (this._lastIndexRetrieved = iteratorIndex) + 1
            const indexToRetrieve = size + index
            if (indexToRetrieve < 0)
                return new UnderZeroIndexAfterCalculationValueHolder(index, indexToRetrieve,)
            if (indexToRetrieve > size)
                return new OverSizeIndexAfterCalculationValueHolder(index, indexToRetrieve, size,)
            return new ValidValueHolder(collection[indexToRetrieve] as T,)
        }

        if (this._hasFinished === true)
            return this.#getInCollectionIfZeroOrPositiveIndexAndHasFinished(index, collection,)

        const lastIndex = this._lastIndexRetrieved
        const iterator = this._iterator
        let iteratorIndex = lastIndex
        let iteratorResult: IteratorResult<T, unknown>
        while (++iteratorIndex, !(iteratorResult = iterator.next()).done) {
            collection[iteratorIndex] = iteratorResult.value
            if (iteratorIndex !== index)
                continue

            this._lastIndexRetrieved = iteratorIndex
            if (index > iteratorIndex)
                return new OverSizeIndexValueHolder(index, iteratorIndex,)
            return new ValidValueHolder(collection[index] as T,)
        }
        this._lastIndexRetrieved = iteratorIndex
        this._hasFinished = true

        if (index == iteratorIndex)
            return new SizeIndexValueHolder(index, iteratorIndex,)
        if (index > iteratorIndex)
            return new OverSizeIndexValueHolder(index, iteratorIndex,)
        return new ValidValueHolder(collection[iteratorIndex - 1] as T,)
    }

    #getInCollectionIfNegativeIndexAndHasFinished(index: number, collection: COLLECTION,) : ValueHolder<T> {
        const lastIndex = this._lastIndexRetrieved
        const lastIndexPlusIndex = lastIndex + index
        if (lastIndexPlusIndex < 0)
            return new UnderZeroIndexAfterCalculationValueHolder(index, lastIndexPlusIndex,)
        if (lastIndexPlusIndex > lastIndex)
            return new OverSizeIndexAfterCalculationValueHolder(index, lastIndexPlusIndex, lastIndex,)
        return new ValidValueHolder(collection.get(lastIndexPlusIndex,),)
    }

    #getInCollectionIfZeroOrPositiveIndexAndHasFinished(index: number, collection: COLLECTION,) : ValueHolder<T> {
        const lastIndex = this._lastIndexRetrieved
        const lastIndexMinus1 = lastIndex - 1
        if (index == lastIndex)
            return new SizeIndexValueHolder(index, lastIndex,)
        if (index > lastIndexMinus1)
            return new OverSizeIndexValueHolder(index, lastIndex,)
        return new ValidValueHolder(collection[index] as T,)
    }

    //#endregion -------------------- Methods --------------------

}
