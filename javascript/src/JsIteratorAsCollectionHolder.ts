//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {NullOrNumber} from "@joookiwi/type"

import {AbstractCollectionHolder}  from "./AbstractCollectionHolder"
import {EmptyCollectionException}  from "./exception/EmptyCollectionException"
import {ForbiddenIndexException}   from "./exception/ForbiddenIndexException"
import {IndexOutOfBoundsException} from "./exception/IndexOutOfBoundsException"

/**
 * A {@link Iterator Javascript Iterator} adaptor class that provide all the feature of a {@link CollectionHolder}
 *
 * Note that nothing excepting the {@link Iterator}
 * are kept in the instance.
 *
 * @note This class is still under construction, but the core feature ({@link #get} and {@link #size}) is stable.
 * @typeParam T         The element type
 * @typeParam REFERENCE The reference passed in the constructor
 * @adaptor
 * @beta
 */
export class JsIteratorAsCollectionHolder<const T = unknown,
    const REFERENCE extends Iterator<T, unknown, unknown> = Iterator<T, unknown, unknown>, >
    extends AbstractCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    #size?: number
    readonly #reference: REFERENCE
    #lastIndexRetrieved?: NullOrNumber

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(reference: REFERENCE,) {
        super()
        this.#reference = reference
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Reference methods --------------------

    /** The internal referenced passed through the {@link constructor} */
    protected get _reference(): REFERENCE {
        return this.#reference
    }

    //#endregion -------------------- Reference methods --------------------

    //#region -------------------- Size methods --------------------

    public override get size(): number {
        const value = this.#size
        if (value != null)
            return value

        const reference = this._reference
        const lastIndexRetrieved = this.#lastIndexRetrieved
        let iteratorValue = reference.next()
        if (lastIndexRetrieved == null) {
            // We retrieve every element of the iterator in one loop
            if (iteratorValue.done)
                // We have no element in the iterator
                return this.#size = 0

            this[0] = iteratorValue.value
            let indexToSet = 0
            while (!(iteratorValue = reference.next()).done)
                this[++indexToSet] = iteratorValue.value
            return this.#size = indexToSet + 1
        }

        let indexToSet = lastIndexRetrieved
        while (!(iteratorValue = reference.next()).done)
            this[++indexToSet] = iteratorValue.value

        this.#lastIndexRetrieved = null
        return this.#size = indexToSet + 1
    }

    public override get isEmpty(): boolean { return this.size === 0 }

    public override get isNotEmpty(): boolean { return !this.isEmpty }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index: number,): T {
        if (this.isEmpty)
            throw new EmptyCollectionException(null, index,)

        if (Number.isNaN(index,))
            throw new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", index,)
        if (index == Number.NEGATIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", index,)
        if (index == Number.POSITIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be +∞.", index,)

        if (index in this)
            return this[index] as T

        if (index < 0) {
            // We retrieve all the items and get calculate to get a positive index
            const indexToRetrieve = this.size + index
            if (indexToRetrieve in this)
                return this[indexToRetrieve] as T
            if (indexToRetrieve < 0)
                throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” (${indexToRetrieve} after calculation) is under 0.`, index,)
            throw new Error("The code should not happen in normal circumstance",)
        }

        // We will only search until the index on the Iterator has been reached.
        // It is still possible to have the index not being possible from an iterator
        // After that, it will return the value found by its iterator (if it is valid)
        const reference = this._reference
        const indexPlus1 = index + 1
        const lastIndexRetrieved = this.#lastIndexRetrieved ?? -1
        let iteratorValue: IteratorResult<T, unknown>
        /**
         * The last index to find is equals to `-1` if it has not been initialized.
         * Otherwise, it should be the value directly
         */
        let indexToFind = lastIndexRetrieved === -1 ? -1 : lastIndexRetrieved
        while (++indexToFind < indexPlus1) {
            iteratorValue = reference.next()
            if (iteratorValue.done) {
                // We are at the end of the iterator and thus,
                // nothing can be returned from the iterator that should be found
                this.#lastIndexRetrieved = null
                if (indexToFind === index)
                    throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is the size of the collection (${index}).`, index,)
                throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is over the size of the collection (${index}).`, index,)
            }
            this[indexToFind] = iteratorValue.value
        }
        return this[this.#lastIndexRetrieved = indexToFind - 1] as T
    }

    //#endregion -------------------- Get --------------------


    //#endregion -------------------- Research methods --------------------

    //#endregion -------------------- Methods --------------------

}
