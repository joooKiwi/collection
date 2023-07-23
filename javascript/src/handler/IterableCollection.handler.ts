/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {ValueHolder}      from "./ValueHolder"

import {AbstractCollectionHandler} from "./AbstractCollection.handler"

/** A simple implementation of a {@link CollectionHolder} for an {@link Iterable} */
export class IterableCollectionHandler<const out T = unknown, const REFERENCE extends Iterable<T> = Iterable<T>, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    #iterator?: Iterator<T>

    #isEmpty?: boolean
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

    public override get isEmpty(): boolean {
        if (this.#isEmpty != null)
            return this.#isEmpty

        if (this.hasFinished)
            return this.#isEmpty = this._amountOfElementRetrieved === 0

        const iteratorValue = this._iterator.next()
        if (iteratorValue.done) {
            this._amountOfElementRetrieved = 0
            return this.#isEmpty = this._hasFinished = true
        }
        this._collection[0] = iteratorValue.value
        this._amountOfElementRetrieved = 1
        return this.#isEmpty = false
    }

    public override get size(): number {
        if (this.#size != null)
            return this.#size

        if (this.hasFinished)
            return this.#size = this._amountOfElementRetrieved + 1

        const iterator = this._iterator
        let iteratorValue = iterator.next()
        if (iteratorValue.done) {
            this._hasFinished = true
            return this.#size = this._amountOfElementRetrieved = 0
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


    protected get _iterator(): Iterator<T> {
        return this.#iterator ??= this._reference[Symbol.iterator]()
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
        const collection = this._collection
        if (index in collection)
            return { value: collection[index] as T, cause: null, }
        if (index < 0)
            return { value: null, get cause() { return new ReferenceError(`The index ${index} could not be retrieved from a value under 0.`,) }, }

        if (this.hasFinished)
            return { value: collection[this._amountOfElementRetrieved - 1] as T, cause: null, }

        const amountOfElementRetrieved = this._amountOfElementRetrieved,
            iterator = this._iterator
        let iteratorIndex = amountOfElementRetrieved - 1,
            iteratorValue = iterator.next() as IteratorResult<T>
        while (!iteratorValue.done) {
            collection[++iteratorIndex] = iteratorValue.value
            if (iteratorIndex !== index) {
                iteratorValue = iterator.next() as IteratorResult<T>
                continue
            }

            this._amountOfElementRetrieved = iteratorIndex
            if (index > iteratorIndex)
                return { value: null, get cause() { return new ReferenceError(`The index ${index} cannot be over the size of the collection (${iteratorIndex}).`,) }, }
            return { value: collection[index] as T, cause: null, }
        }
        this._hasFinished = true

        if (index > iteratorIndex)
            return { value: null, get cause() { return new ReferenceError(`The index ${index} cannot be over the size of the collection (${iteratorIndex}).`,) }, }
        return { value: collection[iteratorIndex - 1] as T, cause: null, }
    }

    //#endregion -------------------- Get property methods --------------------

    //#endregion -------------------- Methods --------------------

}
