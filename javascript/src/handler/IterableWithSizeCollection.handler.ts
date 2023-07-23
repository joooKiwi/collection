/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder}         from "../CollectionHolder"
import type {ValueHolder}              from "./ValueHolder"
import type {IterableWithCount}        from "../iterable/IterableWithCount"
import type {IterableWithLength}       from "../iterable/IterableWithLength"
import type {IterableWithPossibleSize} from "../iterable/IterableWithPossibleSize"
import type {IterableWithSize}         from "../iterable/IterableWithSize"

import {IterableCollectionHandler} from "./IterableCollection.handler"

/**
 * A simple implementation of a {@link CollectionHandler} for an iterable with
 * a {@link IterableWithSize size}, {@link IterableWithLength length} or {@link IterableWithCount count} field
 */
export class IterableWithSizeCollectionHandler<const out T = unknown, REFERENCE extends (| IterableWithPossibleSize<T> | IterableWithSize<T> | IterableWithLength<T> | IterableWithCount<T>) = (| IterableWithPossibleSize<T> | IterableWithSize<T> | IterableWithLength<T> | IterableWithCount<T>), const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends IterableCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    #size?: number
    #isEmpty?: boolean
    #hasNoNumberSize?: boolean

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Getter methods --------------------

    public override get size(): number {
        if (this.#size != null)
            return this.#size

        const reference = this._reference
        if ("size" in reference) {
            const size = reference.size
            if (size != null)
                return this.#size = size
        }
        if ("length" in reference) {
            const size = reference.length
            if (size != null)
                return this.#size = size
        }
        if ("count" in reference) {
            const size = reference.count
            if (size != null)
                return this.#size = size
        }
        this.#hasNoNumberSize = true
        return this.#size = super.size
    }

    public override get isEmpty(): boolean {
        if (this.#isEmpty != null)
            return this.#isEmpty

        if (!this._hasNoNumberSize)
            this.#isEmpty = super.isEmpty

        const size = this.size
        if (size == 0)
            this._hasFinished = true
        return this.#isEmpty ??= size == 0
    }

    /** Tell if the size retrieved from the {@link CollectionHandler.reference reference} has a retrievable size */
    protected get _hasNoNumberSize(): boolean {
        if (this.#hasNoNumberSize != null)
            return this.#hasNoNumberSize

        const reference = this._reference
        if ("size" in reference) {
            const size = reference.size
            if (size != null) {
                this.#size = size
                return this.#hasNoNumberSize = true
            }
        }
        if ("length" in reference) {
            const size = reference.length
            if (size != null) {
                this.#size = size
                return this.#hasNoNumberSize = true
            }
        }
        if ("count" in reference) {
            const size = reference.count
            if (size != null) {
                this.#size = size
                return this.#hasNoNumberSize = true
            }
        }
        return this.#hasNoNumberSize = false
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    public override get(index: number,): ValueHolder<T> {
        if (!this._hasNoNumberSize)
            return super.get(index,)

        const collection = this._collection
        if (index in collection)
            return { value: collection[index] as T, cause: null, }

        const size = this.size
        const indexToRetrieve = index < 0 ? size + index : index
        if (indexToRetrieve < 0)
            return { value: null, get cause() { return new ReferenceError(`The index ${index}${index === indexToRetrieve ? '' : ` (${indexToRetrieve} after calculation)`} is under 0.`,) }, }
        if (indexToRetrieve > size)
            return { value: null, get cause() { return new ReferenceError(`The index ${index}${index === indexToRetrieve ? '' : ` (${indexToRetrieve} after calculation)`} is over the size of the collection (${size}).`,) }, }

        if (this.hasFinished)
            return { value: collection[indexToRetrieve] as T, cause: null, }

        const amountOfElementRetrieved = this._amountOfElementRetrieved,
            iterator = this._iterator
        let iteratorIndex = amountOfElementRetrieved - 1,
            iteratorValue = iterator.next() as IteratorResult<T>
        while (!iteratorValue.done) {
            collection[++iteratorIndex] = iteratorValue.value
            if (iteratorIndex !== indexToRetrieve) {
                iteratorValue = iterator.next() as IteratorResult<T>
                continue
            }

            this._amountOfElementRetrieved = iteratorIndex + 1
            if (indexToRetrieve > iteratorIndex)
                return { value: null, get cause() { return new ReferenceError(`The index ${index} cannot be over the size of the collection (${iteratorIndex}).`,) }, }
            return { value: collection[indexToRetrieve] as T, cause: null, }
        }
        this._hasFinished = true

        return { value: collection[iteratorIndex - 1] as T, cause: null, }
    }

    //#endregion -------------------- Methods --------------------

}
