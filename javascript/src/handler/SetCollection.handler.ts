/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {ValueHolder}      from "./ValueHolder"

import {AbstractCollectionHandler} from "./AbstractCollection.handler"

/** A simple implementation of a {@link CollectionHolder} for an {@link ReadonlySet set} */
export class SetCollectionHandler<const out T = unknown, const REFERENCE extends ReadonlySet<T> = ReadonlySet<T>, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    #iterator?: IterableIterator<T>
    readonly #size: REFERENCE["size"]
    readonly #isEmpty: boolean
    #lastIndex?: number

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
        this.#isEmpty = (this.#size = reference.size) === 0
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter & setter methods --------------------

    public get size(): REFERENCE["size"] {
        return this.#size
    }

    public override get isEmpty(): boolean {
        return this.#isEmpty
    }

    protected get _iterator(): IterableIterator<T> {
        return this.#iterator ??= this._reference[Symbol.iterator]()
    }

    /** The last index retrieved from the value */
    protected get _lastIndex(): number {
        return this.#lastIndex ?? 0
    }

    /** Set the last index retrieved from the value */
    protected set _lastIndex(value: number,) {
        this.#lastIndex = value
    }

    //#endregion -------------------- Getter & setter methods --------------------

    public override get(index: number,): ValueHolder<T> {
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
            return { value: collection[this._lastIndex - 1] as T, cause: null, }

        const iterator = this._iterator,
            indexToRetrievePlus1 = indexToRetrieve + 1
        let indexToFind = this._lastIndex - 1
        while (++indexToFind < indexToRetrievePlus1)
            collection[indexToFind] = iterator.next().value

        if (indexToFind == size)
            this._hasFinished = true

        return { value: collection[(this._lastIndex = indexToFind) - 1] as T, cause: null, }
    }

}
