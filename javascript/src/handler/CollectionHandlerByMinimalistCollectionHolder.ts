/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {ValueHolder}                from "./value/ValueHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "../exception/EmptyCollectionHolderException"
import {ForbiddenIndexException}                   from "../exception/ForbiddenIndexException"
import {AbstractCollectionHandler}                 from "./AbstractCollectionHandler"

/** An implementation of a {@link CollectionHandler} for a {@link MinimalistCollectionHolder} */
export class CollectionHandlerByMinimalistCollectionHolder<const out T = unknown, const out REFERENCE extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    #isEmpty?: boolean
    #amountOfElementRetrieved?: number

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    public get isEmpty(): boolean {
        return this.#isEmpty ??= this._reference.size == 0
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
            return { value: null, get isForbidden() { return Number.isNaN(index,) || index == Number.NEGATIVE_INFINITY || index == Number.POSITIVE_INFINITY }, get cause() { return new EmptyCollectionHolderException(null, index,) }, }

        if (Number.isNaN(index,))
            return { value: null, isForbidden: true, get cause() { return new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", index,) }, }
        if (index == Number.NEGATIVE_INFINITY)
            return { value: null, isForbidden: true, get cause() { return new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", index,) }, }
        if (index == Number.POSITIVE_INFINITY)
            return { value: null, isForbidden: true, get cause() { return new ForbiddenIndexException("Forbidden index. The index cannot be +∞.", index,) }, }

        const collection = this._collection
        if (index in collection)
            return { value: collection[index] as T, isForbidden: false, cause: null, }

        const size = this.size
        if (index > size)
            return { value: null, isForbidden: false, get cause() { return new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index ${index} is over the size of the collection (${size}).`, index,) }, }

        if (index >= 0) {
            if (this._hasFinished)
                return { value: collection[index] as T, isForbidden: false, cause: null, }

            if (size - 1 == this._amountOfElementRetrieved++)
                this._hasFinished = true
            return { value: collection[index] = this._reference.get(index,), isForbidden: false, cause: null, }
        }

        const indexToRetrieve = size + index
        if (indexToRetrieve < 0)
            return { value: null, isForbidden: false, get cause() { return new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index ${index} (${indexToRetrieve} after calculation) is under 0.`, index,) }, }
        if (indexToRetrieve > size)
            return { value: null, isForbidden: false, get cause() { return new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index ${index} (${indexToRetrieve} after calculation) is over the size of the collection (${size}).`, index,) }, }

        if (this._hasFinished)
            return { value: collection[indexToRetrieve] as T, isForbidden: false, cause: null, }
        if (indexToRetrieve in collection)
            return { value: collection[indexToRetrieve] as T, isForbidden: false, cause: null, }

        if (size - 1 == this._amountOfElementRetrieved++)
            this._hasFinished = true
        return { value: collection[indexToRetrieve] = this._reference.get(indexToRetrieve,), isForbidden: false, cause: null, }
    }

}
