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
 * An implementation of a {@link CollectionHolder} for an {@link ReadonlyArray array}
 *
 * @beta
 * @see CollectionHandlerByArrayOf1
 * @see CollectionHandlerByArrayOf2
 */
export class CollectionHandlerByArray<const out T = unknown, const out REFERENCE extends readonly T[] = readonly T[], const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    readonly #size: number
    readonly #isEmpty: boolean
    #hasNull?: boolean
    #hasDuplicate?: boolean
    #amountOfElementRetrieved?: number

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
        this.#isEmpty = (this.#size = reference.length) == 0
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    public override get size(): REFERENCE["length"] { return this.#size }

    public override get isEmpty(): boolean { return this.#isEmpty }

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

        // We loop to find by only the array
        const reference = this._reference
        let index = this.size
        while (--index > 0)
            if (reference[index] == null)
                return this.#hasNull = true
        return this.#hasNull = false
    }

    public get hasDuplicate(): boolean {
        if (this.#hasDuplicate != null)
            return this.#hasDuplicate

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
        return this.#hasDuplicate = false
    }

    /** The amount of element that was retrieved so far */
    protected get _amountOfElementRetrieved(): number { return this.#amountOfElementRetrieved ?? 0 }

    /** Set the amount of element that was retrieved so far */
    protected set _amountOfElementRetrieved(value: number,) { this.#amountOfElementRetrieved = value }

    //#endregion -------------------- Getter methods --------------------

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

}
