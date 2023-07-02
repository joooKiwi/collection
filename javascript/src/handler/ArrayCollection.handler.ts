/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
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
    #elementRetrieved?: number

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

    protected get _elementRetrieved(): number {
        return this.#elementRetrieved ?? 0
    }

    protected set _elementRetrieved(value: number,) {
        this.#elementRetrieved = value
    }

    //#endregion -------------------- Getter methods --------------------

    public get(index: number,): ValueHolder<T> {
        const collection = this._collection
        if (index in collection)
            return { value: collection[index] as T, cause: null, }

        const size = this.size
        const indexToRetrieve = index < 0 ? size + index : index
        if (indexToRetrieve < 0)
            return { value: null, get cause() { return new ReferenceError(`The index ${index}${index === indexToRetrieve ? '' : ` (${indexToRetrieve} after calculation)`} is under 0.`,) }, }
        if (indexToRetrieve > size)
            return { value: null, get cause() { return new ReferenceError(`The index ${index}${index === indexToRetrieve ? '' : ` (${indexToRetrieve} after calculation)`} is over the size of the collection (${size}).`,) }, }

        if (this._hasFinished)
            return { value: collection[index] as T, cause: null, }

        if (size - 1 === this._elementRetrieved++)
            this._hasFinished = true
        return { value: collection[index] = this.reference[index] as T, cause: null, }
    }

}
