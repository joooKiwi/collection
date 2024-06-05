/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {ValueHolder}                from "./value/ValueHolder"

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
 * An implementation of a {@link CollectionHandler} for a {@link MinimalistCollectionHolder}
 *
 * @beta
 * @see CollectionHandlerByCollectionHolder
 */
export class CollectionHandlerByMinimalistCollectionHolder<const out T = unknown,
    const out REFERENCE extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>,
    const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    #isEmpty?: boolean
    #hasDuplicate?: boolean
    #amountOfElementRetrieved?: number

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE,) { super(collection, reference,) }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    public get size(): REFERENCE["size"] { return this._reference.size }

    public get isEmpty(): boolean { return this.#isEmpty ??= this._reference.size == 0 }

    public get hasDuplicate(): boolean {
        if (this.#hasDuplicate != null)
            return this.#hasDuplicate

        const reference = this._reference
        const collection = this._collection
        const size = this.size
        const temporaryArray = new Array<T>(size,)
        collection[0] = temporaryArray[0] = reference.get(0,)
        let amountOfItemAdded = 1
        let index = 0
        while (++index < size) {
            const value = collection[index] = reference.get(index,)
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
            return new ValidValueHolder(collection[index] = this._reference.get(index,),)
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
        return new ValidValueHolder(collection[indexToRetrieve] = this._reference.get(indexToRetrieve,),)
    }

}
