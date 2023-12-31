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

/** A simple implementation of a {@link CollectionHandler} for a {@link CollectionHolder} */
export class CollectionCollectionHandler<out T = unknown, const REFERENCE extends CollectionHolder<T> = CollectionHolder<T>, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    #amountOfElementRetrieved?: number

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    public get isEmpty(): REFERENCE["isEmpty"] {
        return this._reference.isEmpty
    }

    public get size(): REFERENCE["size"] {
        return this._reference.size
    }

    /** The amount of element that was retrieved so far */
    protected get _amountOfElementRetrieved(): number {
        return this.#amountOfElementRetrieved ?? 0
    }

    /** Set the amount of element that was retrieved so far */
    protected set _amountOfElementRetrieved(value: number,) {
        this.#amountOfElementRetrieved = value
    }

    //#endregion -------------------- Getter methods --------------------

    public get(index: number,): ValueHolder<T> {
        if (this.isEmpty)
            return { value: null, get cause() { return new EmptyCollectionHolderException("No element at any index could be found since it it empty.", index,) }, }

        const collection = this._collection
        if (index in collection)
            return { value: collection[index] as T, cause: null, }

        const size = this.size
        if (index > size)
            return { value: null, get cause() { return new CollectionHolderIndexOutOfBoundsException(`The index ${index} is over the size of the collection (${size}).`, index,) }, }

        if (index >= 0) {
            if (this._hasFinished)
                return { value: collection[index] as T, cause: null, }

            if (size - 1 === this._amountOfElementRetrieved++)
                this._hasFinished = true
            return { value: collection[index] = this._reference.get(index,), cause: null, }
        }

        const indexToRetrieve = size + index
        if (indexToRetrieve < 0)
            return { value: null, get cause() { return new CollectionHolderIndexOutOfBoundsException(`The index ${index} (${indexToRetrieve} after calculation) is under 0.`, index,) }, }
        if (indexToRetrieve > size)
            return { value: null, get cause() { return new CollectionHolderIndexOutOfBoundsException(`The index ${index} (${indexToRetrieve} after calculation) is over the size of the collection (${size}).`, index,) }, }

        if (this._hasFinished)
            return { value: collection[indexToRetrieve] as T, cause: null, }
        if (indexToRetrieve in collection)
            return { value: collection[indexToRetrieve] as T, cause: null, }

        if (size - 1 === this._amountOfElementRetrieved++)
            this._hasFinished = true
        return { value: collection[indexToRetrieve] = this._reference.get(indexToRetrieve,), cause: null, }
    }

}
