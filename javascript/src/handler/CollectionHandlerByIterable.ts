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

    #iterator?: Iterator<T>

    #isEmpty?: boolean
    #hasNull?: boolean
    #hasDuplicate?: boolean
    #size?: number

    #amountOfElementRetrieved: number

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
        this.#amountOfElementRetrieved = 0
        this._hasFinished = false
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter & setter methods --------------------

    public override get size(): number {
        if (this.#size != null)
            return this.#size

        if (this.hasFinished)
            return this.#size = this._amountOfElementRetrieved + 1

        const iterator = this._iterator
        let iteratorValue = iterator.next() as IteratorResult<T, T>
        if (iteratorValue.done) {
            this._hasFinished = true
            if (this._isTheFirstElementRetrieved) {
                this.#isEmpty = true
                return this.#size = this._amountOfElementRetrieved = 0
            }
            this.#isEmpty = false
            return this.#size = 1
        }

        const collection = this._collection
        let index = this._amountOfElementRetrieved
        while (!iteratorValue.done) {
            collection[index++] = iteratorValue.value
            iteratorValue = iterator.next()
        }

        this._hasFinished = true
        return this.#size = this._amountOfElementRetrieved = index
    }

    public override get isEmpty(): boolean {
        if (this.#isEmpty != null)
            return this.#isEmpty

        if (this.hasFinished)
            return this.#isEmpty = this._isTheFirstElementRetrieved

        const iteratorValue = this._iterator.next() as IteratorResult<T, T>
        if (iteratorValue.done) {
            this._hasFinished = true
            if (this._isTheFirstElementRetrieved) {
                this.#size = this._amountOfElementRetrieved = 0
                return this.#isEmpty = true
            }
            this.#size = 1
            return this.#isEmpty = false
        }

        this._collection[0] = iteratorValue.value
        this._amountOfElementRetrieved = 1
        return this.#isEmpty = false
    }

    public override get hasNull(): boolean {
        const value = this.#hasNull
        if (value != null)
            return value

        // If it is finished, we just loop over the collection to find any null value
        if (this.hasFinished) {
            const collection = this._collection
            let index = this.size
            while (--index > 0)
                if (collection[index] == null)
                    return this.#hasNull = true
            return this.#hasNull = true
        }

        // We first try to find any null in the collection from the values already set
        const collection = this._collection
        const amountOfElementRetrieved = this._amountOfElementRetrieved
        let index = -1
        while (index++ < amountOfElementRetrieved)
            if (collection[index] == null)
                return this.#hasNull = true

        // We continue the process from the followed iterator to starting setting to the collection
        const iterator = this._iterator
        let iteratorResult: IteratorResult<T, void>
        while (index++, !(iteratorResult = iterator.next()).done)
            if ((collection[index] = iteratorResult.value as T) == null) {
                this._amountOfElementRetrieved = index
                return this.#hasNull = true
            }

        // We are now at the end, and every value had been retrieved and set to the collection
        this._amountOfElementRetrieved = index
        return this.#hasNull = false
    }

    public override get hasDuplicate(): boolean {
        if (this.#hasDuplicate != null)
            return this.#hasDuplicate

        const reference = this._reference
        const iterator = reference[Symbol.iterator]() as IterableIterator<T>
        const collection = this._collection
        const size = this.size //TODO change the implementation to not retrieve the size on the iterator
        const temporaryArray = new Array<T>(size,)
        let amountOfItemAdded = 1
        let index = -1
        while (++index < size) {
            const value = collection[index] = iterator.next().value as T
            let index2 = -1

            if (value === null) {
                while (++index2 < amountOfItemAdded)
                    if (temporaryArray[index2] === null) {
                        //#region -------------------- Iterator held to be at the same point --------------------

                        const amountOfElementRetrieved = this._amountOfElementRetrieved
                        if (amountOfElementRetrieved < amountOfItemAdded) {
                            let amountOfTimeToLoop = amountOfItemAdded - amountOfElementRetrieved
                            const iterator2 = this._iterator
                            while(amountOfTimeToLoop-- > 0)
                                iterator2.next()
                            this._amountOfElementRetrieved = amountOfItemAdded
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

                        const amountOfElementRetrieved = this._amountOfElementRetrieved
                        if (amountOfElementRetrieved < amountOfItemAdded) {
                            let amountOfTimeToLoop = amountOfItemAdded - amountOfElementRetrieved
                            const iterator2 = this._iterator
                            while(amountOfTimeToLoop-- > 0)
                                iterator2.next()
                            this._amountOfElementRetrieved = amountOfItemAdded
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

                    const amountOfElementRetrieved = this._amountOfElementRetrieved
                    if (amountOfElementRetrieved < amountOfItemAdded) {
                        let amountOfTimeToLoop = amountOfItemAdded - amountOfElementRetrieved
                        const iterator2 = this._iterator
                        while(amountOfTimeToLoop-- > 0)
                            iterator2.next()
                        this._amountOfElementRetrieved = amountOfItemAdded
                    }

                    //#endregion -------------------- Iterator held to be at the same point --------------------
                    return this.#hasDuplicate = true
                }
            temporaryArray[amountOfItemAdded++] = value
        }

        this._hasFinished = true
        return this.#hasDuplicate = false
    }


    protected get _iterator(): Iterator<T> {
        return this.#iterator ??= this._reference[Symbol.iterator]()
    }

    /** Tell that the {@link _amountOfElementRetrieved} is equal to 0 */
    protected get _isTheFirstElementRetrieved(): boolean {
        return this._amountOfElementRetrieved == 0
    }

    /** The amount of element retrieved */
    protected get _amountOfElementRetrieved(): number {
        return this.#amountOfElementRetrieved
    }

    /** Set the amount of element retrieved */
    protected set _amountOfElementRetrieved(value: number,) {
        this.#amountOfElementRetrieved = value
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
            if (this.hasFinished) {
                const size = this._amountOfElementRetrieved
                const indexToRetrieve = size + index
                if (indexToRetrieve < 0)
                    return new UnderZeroIndexAfterCalculationValueHolder(index, indexToRetrieve,)
                if (indexToRetrieve > size)
                    return new OverSizeIndexAfterCalculationValueHolder(index, indexToRetrieve, size,)
                return new ValidValueHolder(collection.get(indexToRetrieve,),)
            }

            const amountOfElementRetrieved = this._amountOfElementRetrieved
            const iterator = this._iterator
            let iteratorIndex = amountOfElementRetrieved - 1
            let iteratorResult: IteratorResult<T, unknown>
            while (!(iteratorResult = iterator.next()).done)
                collection[++iteratorIndex] = iteratorResult.value

            const size = (this._amountOfElementRetrieved = iteratorIndex) + 1
            const indexToRetrieve = size + index
            if (indexToRetrieve < 0)
                return new UnderZeroIndexAfterCalculationValueHolder(index, indexToRetrieve,)
            if (indexToRetrieve > size)
                return new OverSizeIndexAfterCalculationValueHolder(index, indexToRetrieve, size,)
            return new ValidValueHolder(collection.get(indexToRetrieve,),)
        }

        if (this.hasFinished) {
            const amountOfElementRetrieved = this._amountOfElementRetrieved
            const amountOfElementRetrievedMinus1 = amountOfElementRetrieved - 1
            if (index > amountOfElementRetrievedMinus1)
                return new OverSizeIndexValueHolder(index, amountOfElementRetrieved,)
            return new ValidValueHolder(collection[amountOfElementRetrievedMinus1] as T,)
        }

        const amountOfElementRetrieved = this._amountOfElementRetrieved
        const iterator = this._iterator
        let iteratorIndex = amountOfElementRetrieved - 1
        let iteratorResult = iterator.next() as IteratorResult<T, unknown>
        while (!iteratorResult.done) {
            collection[++iteratorIndex] = iteratorResult.value
            if (iteratorIndex !== index) {
                iteratorResult = iterator.next() as IteratorResult<T>
                continue
            }

            this._amountOfElementRetrieved = iteratorIndex
            if (index > iteratorIndex)
                return new OverSizeIndexValueHolder(index, iteratorIndex,)
            return new ValidValueHolder(collection[index] as T,)
        }
        this._hasFinished = true

        if (index > iteratorIndex)
            return new OverSizeIndexValueHolder(index, iteratorIndex,)
        return new ValidValueHolder(collection[iteratorIndex - 1] as T,)
    }

    //#endregion -------------------- Methods --------------------

}
