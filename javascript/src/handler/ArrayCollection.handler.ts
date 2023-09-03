/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {ValueHolder}      from "./ValueHolder"

import {AbstractCollectionHandler} from "./AbstractCollection.handler"

/** A simple implementation of a {@link CollectionHolder} for an {@link ReadonlyArray array} */
export class ArrayCollectionHandler<const out T = unknown, REFERENCE extends readonly T[] = readonly T[], const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    readonly #size: number
    readonly #isEmpty: boolean
    #amountOfElementRetrieved?: number

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
        this.#isEmpty = (this.#size = reference.length) === 0
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    public override get size(): REFERENCE["length"] {
        return this.#size
    }

    public override get isEmpty(): boolean {
        return this.#isEmpty
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
        const collection = this._collection
        if (index in collection)
            return { value: collection[index] as T, cause: null, }

        const size = this.size,
            indexToRetrieve = index < 0 ? size + index : index
        if (indexToRetrieve < 0)
            return { value: null, get cause() { return new ReferenceError(`The index ${index}${index === indexToRetrieve ? '' : ` (${indexToRetrieve} after calculation)`} is under 0.`,) }, }
        if (indexToRetrieve > size)
            return { value: null, get cause() { return new ReferenceError(`The index ${index}${index === indexToRetrieve ? '' : ` (${indexToRetrieve} after calculation)`} is over the size of the collection (${size}).`,) }, }

        if (this._hasFinished)
            return { value: collection[indexToRetrieve] as T, cause: null, }
        if (indexToRetrieve in collection)
            return { value: collection[indexToRetrieve] as T, cause: null, }

        if (size - 1 === this._amountOfElementRetrieved++)
            this._hasFinished = true
        return { value: collection[indexToRetrieve] = this._reference[indexToRetrieve] as T, cause: null, }
    }

}
