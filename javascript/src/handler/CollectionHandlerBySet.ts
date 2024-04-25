/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {ValueHolder}      from "./value/ValueHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "../exception/EmptyCollectionHolderException"
import {ForbiddenIndexException}                   from "../exception/ForbiddenIndexException"
import {AbstractCollectionHandler}                 from "./AbstractCollectionHandler"

/** An implementation of a {@link CollectionHolder} for an {@link ReadonlySet set} */
export class CollectionHandlerBySet<const out T = unknown, const out REFERENCE extends ReadonlySet<T> = ReadonlySet<T>, const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
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
        this.#isEmpty = (this.#size = reference.size) == 0
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

            const iterator = this._iterator
            const indexPlus1 = index + 1
            let indexToFind = this._lastIndex - 1
            while (++indexToFind < indexPlus1)
                collection[indexToFind] = iterator.next().value

            if (indexToFind == size)
                this._hasFinished = true

            return { value: collection[(this._lastIndex = indexToFind) - 1] as T, isForbidden: false, cause: null, }
        }

        const indexToRetrieve = index < 0 ? size + index : index
        if (indexToRetrieve < 0)
            return { value: null, isForbidden: false, get cause() { return new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index ${index} (${indexToRetrieve} after calculation) is under 0.`, index,) }, }
        if (indexToRetrieve > size)
            return { value: null, isForbidden: false, get cause() { return new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index ${index} (${indexToRetrieve} after calculation) is over the size of the collection (${size}).`, index,) }, }

        if (this._hasFinished)
            return { value: collection[this._lastIndex - 1] as T, isForbidden: false, cause: null, }

        const iterator = this._iterator
        const indexToRetrievePlus1 = indexToRetrieve + 1
        let indexToFind = this._lastIndex - 1
        while (++indexToFind < indexToRetrievePlus1)
            collection[indexToFind] = iterator.next().value

        if (indexToFind == size)
            this._hasFinished = true

        return { value: collection[(this._lastIndex = indexToFind) - 1] as T, isForbidden: false, cause: null, }
    }

}
