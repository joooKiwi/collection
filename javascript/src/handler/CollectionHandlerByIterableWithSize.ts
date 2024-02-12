/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}         from "../CollectionHolder"
import type {ValueHolder}              from "./ValueHolder"
import type {PossibleIterableWithSize} from "../iterable/types"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "../exception/EmptyCollectionHolderException"
import {ForbiddenIndexException}                   from "../exception/ForbiddenIndexException"
import {CollectionHandlerByIterable}               from "./CollectionHandlerByIterable"

/**
 * An implementation of a {@link CollectionHandler} for an iterable with
 * a {@link IterableWithSize size}, {@link IterableWithLength length} or {@link IterableWithCount count} field
 */
export class CollectionHandlerByIterableWithSize<const out T = unknown, const out REFERENCE extends PossibleIterableWithSize<T> = PossibleIterableWithSize<T>, const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends CollectionHandlerByIterable<T, REFERENCE, COLLECTION> {

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
            if (size != null) {
                this.#isEmpty = size == 0
                this.#hasNoNumberSize = false
                return this.#size = size
            }
        }
        if ("length" in reference) {
            const size = reference.length
            if (size != null) {
                this.#isEmpty = size == 0
                this.#hasNoNumberSize = false
                return this.#size = size
            }
        }
        if ("count" in reference) {
            const size = reference.count
            if (size != null) {
                this.#isEmpty = size == 0
                this.#hasNoNumberSize = false
                return this.#size = size
            }
        }

        this.#isEmpty = true
        this.#hasNoNumberSize = true
        return this.#size = super.size
    }

    public override get isEmpty(): boolean {
        if (this.#isEmpty != null)
            return this.#isEmpty

        if (!this._hasNoNumberSize)
            return this.#isEmpty = super.isEmpty

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
                this.#isEmpty = size == 0
                this.#size = size
                return this.#hasNoNumberSize = true
            }
        }
        if ("length" in reference) {
            const size = reference.length
            if (size != null) {
                this.#isEmpty = size == 0
                this.#size = size
                return this.#hasNoNumberSize = true
            }
        }
        if ("count" in reference) {
            const size = reference.count
            if (size != null) {
                this.#isEmpty = size == 0
                this.#size = size
                return this.#hasNoNumberSize = true
            }
        }
        return this.#hasNoNumberSize = false
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    public override get(index: number,): ValueHolder<T> {
        if (this.isEmpty)
            return { value: null, get isForbidden() { return Number.isNaN(index,) || index == Number.NEGATIVE_INFINITY || index == Number.POSITIVE_INFINITY }, get cause() { return new EmptyCollectionHolderException(null, index,) }, }

        if (Number.isNaN(index,))
            return { value: null, isForbidden: true, get cause() { return new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", index,) }, }
        if (index == Number.NEGATIVE_INFINITY)
            return { value: null, isForbidden: true, get cause() { return new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", index,) }, }
        if (index == Number.POSITIVE_INFINITY)
            return { value: null, isForbidden: true, get cause() { return new ForbiddenIndexException("Forbidden index. The index cannot be +∞.", index,) }, }

        if (!this._hasNoNumberSize)
            return super.get(index,)

        const collection = this._collection
        if (index in collection)
            return { value: collection[index] as T, isForbidden: false, cause: null, }

        const size = this.size
        if (index > size)
            return { value: null, isForbidden: false, get cause() { return new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index ${index} is over the size of the collection (${size}).`, index,) }, }

        if (index >= 0) {
            if (this.hasFinished)
                return { value: collection[index] as T, isForbidden: false, cause: null, }

            const amountOfElementRetrieved = this._amountOfElementRetrieved
            const iterator = this._iterator
            let iteratorIndex = amountOfElementRetrieved - 1
            let iteratorValue = iterator.next() as IteratorResult<T, unknown>
            while (!iteratorValue.done) {
                collection[++iteratorIndex] = iteratorValue.value
                if (iteratorIndex !== index) {
                    iteratorValue = iterator.next() as IteratorResult<T>
                    continue
                }

                this._amountOfElementRetrieved = iteratorIndex + 1
                return { value: collection[index] as T, isForbidden: false, cause: null, }
            }
            this._hasFinished = true

            return { value: collection[iteratorIndex - 1] as T, isForbidden: false, cause: null, }
        }

        const indexToRetrieve = size + index
        if (indexToRetrieve < 0)
            return { value: null, isForbidden: false, get cause() { return new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index ${index} (${indexToRetrieve} after calculation) is under 0.`, index,) }, }
        if (indexToRetrieve > size)
            return { value: null, isForbidden: false, get cause() { return new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index ${index} (${indexToRetrieve} after calculation) is over the size of the collection (${size}).`, index,) }, }

        if (this.hasFinished)
            return { value: collection[indexToRetrieve] as T, isForbidden: false, cause: null, }

        const amountOfElementRetrieved = this._amountOfElementRetrieved
        const iterator = this._iterator
        let iteratorIndex = amountOfElementRetrieved - 1
        let iteratorValue = iterator.next() as IteratorResult<T, unknown>
        while (!iteratorValue.done) {
            collection[++iteratorIndex] = iteratorValue.value
            if (iteratorIndex !== indexToRetrieve) {
                iteratorValue = iterator.next() as IteratorResult<T>
                continue
            }

            this._amountOfElementRetrieved = iteratorIndex + 1
            if (indexToRetrieve > iteratorIndex)
                return { value: null, isForbidden: false, get cause() { return new CollectionHolderIndexOutOfBoundsException(`Index out of bound. index ${index} cannot be over the size of the collection (${iteratorIndex}).`, index,) }, }
            return { value: collection[indexToRetrieve] as T, isForbidden: false, cause: null, }
        }
        this._hasFinished = true

        return { value: collection[iteratorIndex - 1] as T, isForbidden: false, cause: null, }
    }

    //#endregion -------------------- Methods --------------------

}
