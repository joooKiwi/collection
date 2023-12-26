/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {ValueHolder}      from "./ValueHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "../exception/EmptyCollectionHolderException"
import {AbstractCollectionHandler}                 from "./AbstractCollection.handler"

/** An implementation of a {@link CollectionHandler} for an {@link Iterable} */
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


    protected get _iterator(): Iterator<T> {
        return this.#iterator ??= this._reference[Symbol.iterator]()
    }

    /** Tell that the {@link _amountOfElementRetrieved} is equal to 0 */
    protected get _isTheFirstElementRetrieved(): boolean {
        return this._amountOfElementRetrieved === 0
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
            return { value: null, get cause() { return new EmptyCollectionHolderException("No element at any index could be found since it it empty.", index,) }, }

        const collection = this._collection
        if (index in collection)
            return { value: collection[index] as T, cause: null, }

        if (index < 0) {
            if (this.hasFinished){
                const size = this._amountOfElementRetrieved
                const indexToRetrieve = size + index
                if (indexToRetrieve < 0)
                    return { value: null, get cause() { return new CollectionHolderIndexOutOfBoundsException(`The index ${index} (${indexToRetrieve} after calculation) is under 0.`, index,) }, }
                if (indexToRetrieve > size)
                    return { value: null, get cause() { return new CollectionHolderIndexOutOfBoundsException(`The index ${index} (${indexToRetrieve} after calculation) is under over the size of the collection (${size}).`, index,) }, }
                return { value: collection.get(indexToRetrieve,), cause: null, }
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
                return { value: null, get cause() { return new CollectionHolderIndexOutOfBoundsException(`The index ${index} (${indexToRetrieve} after calculation) is under 0.`, index,) }, }
            if (indexToRetrieve > size)
                return { value: null, get cause() { return new CollectionHolderIndexOutOfBoundsException(`The index ${index} (${indexToRetrieve} after calculation) is under over the size of the collection (${size}).`, index,) }, }
            return { value: collection.get(indexToRetrieve,), cause: null, }
        }

        if (this.hasFinished) {
            const amountOfElementRetrieved = this._amountOfElementRetrieved
            const amountOfElementRetrievedMinus1 = amountOfElementRetrieved - 1
            if (index > amountOfElementRetrievedMinus1)
                return { value: null, get cause() { return new CollectionHolderIndexOutOfBoundsException(`The index ${index} cannot be over the size of the collection (${amountOfElementRetrieved}).`, index,) }, }
            return { value: collection[amountOfElementRetrievedMinus1] as T, cause: null, }
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
                return { value: null, get cause() { return new CollectionHolderIndexOutOfBoundsException(`The index ${index} cannot be over the size of the collection (${iteratorIndex}).`, index,) }, }
            return { value: collection[index] as T, cause: null, }
        }
        this._hasFinished = true

        if (index > iteratorIndex)
            return { value: null, get cause() { return new CollectionHolderIndexOutOfBoundsException(`The index ${index} cannot be over the size of the collection (${iteratorIndex}).`, index,) }, }
        return { value: collection[iteratorIndex - 1] as T, cause: null, }
    }

    //#endregion -------------------- Methods --------------------

}
