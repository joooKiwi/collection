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
 * An implementation of a {@link CollectionHandler} for an {@link Iterable}
 *
 * @beta
 * @see CollectionHandlerByIterableWithSize
 * @see CollectionHandlerByIterableWithSizeOf1
 * @see CollectionHandlerByIterableWithSizeOf2
 */
export class CollectionHandlerByIterable<const out T = unknown,
    const out REFERENCE extends Iterable<T> = Iterable<T>,
    const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    #iterator?: Iterator<T, unknown>

    #isEmpty?: boolean
    #hasNull?: boolean
    #hasDuplicate?: boolean
    #size?: number

    #lastIndex: number

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
        this.#lastIndex = 0
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter & setter methods --------------------

    public override get size(): number {
        const value = this.#size
        if (value != null)
            return value

        if (this.hasFinished)
            return this.#size = this._lastIndex + 1

        const iterator = this._iterator
        let iteratorValue = iterator.next() as IteratorResult<T, unknown>
        if (iteratorValue.done) {
            this._hasFinished = true
            if (this._isTheFirstElementRetrieved) {
                this.#isEmpty = true
                return this.#size = this._lastIndex = 0
            }
            this.#isEmpty = false
            return this.#size = 1
        }

        const collection = this._collection
        let index = this._lastIndex
        while (!iteratorValue.done) {
            collection[index++] = iteratorValue.value
            iteratorValue = iterator.next()
        }

        this._hasFinished = true
        return this.#size = this._lastIndex = index
    }

    public override get isEmpty(): boolean {
        const value = this.#isEmpty
        if (value != null)
            return value

        if (this.hasFinished)
            return this.#isEmpty = this._isTheFirstElementRetrieved

        const iteratorValue = this._iterator.next() as IteratorResult<T, unknown>
        if (iteratorValue.done) {
            this._hasFinished = true
            if (this._isTheFirstElementRetrieved) {
                this.#size = this._lastIndex = 0
                return this.#isEmpty = true
            }
            this.#size = 1
            return this.#isEmpty = false
        }

        this._collection[0] = iteratorValue.value
        this._lastIndex = 1
        return this.#isEmpty = false
    }

    public override get hasNull(): boolean {
        const value = this.#hasNull
        if (value != null)
            return value

        if (this.hasFinished)
            return this.#hasNull = this._collection.hasNull

        // We first try to find any null in the collection from the values already set
        const collection = this._collection
        const lastIndex = this._lastIndex
        let index = -1
        while (++index > lastIndex)
            if (collection[index] == null)
                return this.#hasNull = true

        // We continue the process from the followed iterator to starting setting to the collection
        index--
        const iterator = this._iterator
        let iteratorResult: IteratorResult<T, unknown>
        while (!(iteratorResult = iterator.next()).done)
            if ((collection[++index] = iteratorResult.value as T) == null) {
                this._lastIndex = index
                return this.#hasNull = true
            }

        // We are now at the end, and every value had been retrieved and set to the collection
        this._lastIndex = index
        this._hasFinished = true
        return this.#hasNull = false
    }

    public override get hasDuplicate(): boolean {
        const hasDuplicate = this.#hasDuplicate
        if (hasDuplicate != null)
            return hasDuplicate

        if (this.hasFinished)
            return this.#hasDuplicate = this._collection.hasDuplicate

        //FIXME: use the same logic as the CollectionHandler-by-CollectionIterator instance
        //TODO add logic to compare if it exist and _lastIndex++ logic
        const reference = this._reference
        const iterator = reference[Symbol.iterator]() as IterableIterator<T>
        const collection = this._collection
        const temporaryArray = []
        collection[0] = temporaryArray[0] = iterator.next().value
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

                        const amountOfElementRetrieved = this._lastIndex
                        if (amountOfElementRetrieved < amountOfItemAdded) {
                            let amountOfTimeToLoop = amountOfItemAdded - amountOfElementRetrieved
                            const iterator2 = this._iterator
                            while(amountOfTimeToLoop-- > 0)
                                iterator2.next()
                            this._lastIndex = amountOfItemAdded
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

                        const amountOfElementRetrieved = this._lastIndex
                        if (amountOfElementRetrieved < amountOfItemAdded) {
                            let amountOfTimeToLoop = amountOfItemAdded - amountOfElementRetrieved
                            const iterator2 = this._iterator
                            while(amountOfTimeToLoop-- > 0)
                                iterator2.next()
                            this._lastIndex = amountOfItemAdded
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

                    const amountOfElementRetrieved = this._lastIndex
                    if (amountOfElementRetrieved < amountOfItemAdded) {
                        let amountOfTimeToLoop = amountOfItemAdded - amountOfElementRetrieved
                        const iterator2 = this._iterator
                        while(amountOfTimeToLoop-- > 0)
                            iterator2.next()
                        this._lastIndex = amountOfItemAdded
                    }

                    //#endregion -------------------- Iterator held to be at the same point --------------------
                    return this.#hasDuplicate = true
                }
            temporaryArray[amountOfItemAdded++] = value
        }

        this._lastIndex = amountOfItemAdded
        this._hasFinished = true
        return this.#hasDuplicate = false
    }


    protected get _iterator(): Iterator<T, unknown> {
        return this.#iterator ??= this._reference[Symbol.iterator]()
    }

    /** Tell that the {@link _lastIndex} is equal to 0 */
    protected get _isTheFirstElementRetrieved(): boolean {
        return this._lastIndex == 0
    }

    /** The amount of element retrieved */
    protected get _lastIndex(): number {
        return this.#lastIndex
    }

    /** Set the amount of element retrieved */
    protected set _lastIndex(value: number,) {
        this.#lastIndex = value
    }

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
            if (this.hasFinished)
                return this.#getInCollectionIfNegativeIndexAndHasFinished(index, collection,)

            const amountOfElementRetrieved = this._lastIndex
            const iterator = this._iterator
            let iteratorIndex = amountOfElementRetrieved - 1
            let iteratorResult: IteratorResult<T, unknown>
            while (!(iteratorResult = iterator.next()).done)
                collection[++iteratorIndex] = iteratorResult.value

            const size = (this._lastIndex = iteratorIndex) + 1
            const indexToRetrieve = size + index
            if (indexToRetrieve < 0)
                return new UnderZeroIndexAfterCalculationValueHolder(index, indexToRetrieve,)
            if (indexToRetrieve > size)
                return new OverSizeIndexAfterCalculationValueHolder(index, indexToRetrieve, size,)
            return new ValidValueHolder(collection.get(indexToRetrieve,),)
        }

        if (this.hasFinished)
            return this.#getInCollectionIfZeroOrPositiveIndexAndHasFinished(index, collection,)

        const lastIndex = this._lastIndex
        const iterator = this._iterator
        let iteratorIndex = lastIndex - 1
        let iteratorResult: IteratorResult<T, unknown>
        while (++iteratorIndex, !(iteratorResult = iterator.next()).done) {
            collection[iteratorIndex] = iteratorResult.value
            if (iteratorIndex !== index)
                continue

            this._lastIndex = iteratorIndex
            if (index > iteratorIndex)
                return new OverSizeIndexValueHolder(index, iteratorIndex,)
            return new ValidValueHolder(collection[index] as T,)
        }
        this._lastIndex = iteratorIndex
        this._hasFinished = true

        if (index == iteratorIndex)
            return new SizeIndexValueHolder(index, iteratorIndex,)
        if (index > iteratorIndex)
            return new OverSizeIndexValueHolder(index, iteratorIndex,)
        return new ValidValueHolder(collection[iteratorIndex - 1] as T,)
    }

    #getInCollectionIfNegativeIndexAndHasFinished(index: number, collection: COLLECTION,) : ValueHolder<T> {
        const amountOfElementRetrieved = this._lastIndex
        const amountOfElementRetrievedPlusIndex = amountOfElementRetrieved + index
        if (amountOfElementRetrievedPlusIndex < 0)
            return new UnderZeroIndexAfterCalculationValueHolder(index, amountOfElementRetrievedPlusIndex,)
        if (amountOfElementRetrievedPlusIndex > amountOfElementRetrieved)
            return new OverSizeIndexAfterCalculationValueHolder(index, amountOfElementRetrievedPlusIndex, amountOfElementRetrieved,)
        return new ValidValueHolder(collection.get(amountOfElementRetrievedPlusIndex,),)
    }

    #getInCollectionIfZeroOrPositiveIndexAndHasFinished(index: number, collection: COLLECTION,) : ValueHolder<T> {
        const amountOfElementRetrieved = this._lastIndex
        const amountOfElementRetrievedMinus1 = amountOfElementRetrieved - 1
        if (index == amountOfElementRetrieved)
            return new SizeIndexValueHolder(index, amountOfElementRetrieved,)
        if (index > amountOfElementRetrievedMinus1)
            return new OverSizeIndexValueHolder(index, amountOfElementRetrieved,)
        return new ValidValueHolder(collection[index] as T,)
    }

    //#endregion -------------------- Methods --------------------

}
