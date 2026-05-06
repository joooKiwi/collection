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

import type {NullOr, NullOrNumber, Set} from "@joookiwi/type"

import type {IsEmptyOnSet}    from "./type/isEmpty"
import type {IsNotEmptyOnSet} from "./type/isNotEmpty"

import {AbstractCollectionHolder}  from "./AbstractCollectionHolder"
import {EmptyCollectionException}  from "./exception/EmptyCollectionException"
import {ForbiddenIndexException}   from "./exception/ForbiddenIndexException"
import {IndexOutOfBoundsException} from "./exception/IndexOutOfBoundsException"

/**
 * A {@link ReadonlySet Set} adaptor class that provide all the feature of a {@link CollectionHolder}
 *
 * Note that nothing excepting the {@link ReadonlySet Set}
 * are kept in the instance.
 *
 * @note This class is still under construction, but the core feature ({@link #get} and {@link #size}) is stable.
 * @typeParam T         The element type
 * @typeParam REFERENCE The reference passed in the constructor
 * @adaptor
 * @beta
 */
export class SetAsCollectionHolder<const T = unknown,
    const REFERENCE extends Set<T> = Set<T>, >
    extends AbstractCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    readonly #reference: REFERENCE
    #iterator?: NullOr<SetIterator<T>>
    #lastIndexRetrieved?: NullOrNumber
    readonly #size: REFERENCE["size"]
    readonly #isEmpty: boolean

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(reference: REFERENCE,) {
        super()
        this.#reference = reference
        this.#isEmpty = (this.#size = reference.size) == 0
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

    public override get size(): REFERENCE["size"] { return this.#size }

    public override get isEmpty(): IsEmptyOnSet<REFERENCE> { return this.#isEmpty as IsEmptyOnSet<REFERENCE> }

    public override get isNotEmpty(): IsNotEmptyOnSet<REFERENCE> { return !this.isEmpty as IsNotEmptyOnSet<REFERENCE> }

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

        const size = this.size
        if (index > size)
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is over the size of the collection (${size}).`, index,)
        if (index == size)
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is the size of the collection (${size}).`, index,)
        if (index >= 0)
            return this.#getUntil(index, size,)

        const indexToRetrieve = index + size
        if (indexToRetrieve in this)
            return this[indexToRetrieve] as T
        if (indexToRetrieve < 0)
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” (${indexToRetrieve} after calculation) is under 0.`, index,)
        return this.#getUntil(indexToRetrieve, size,)
    }

    #getUntil(index: number, size: this["size"],): T {
        // We will only search until the index on the SetIterator has been reached.
        // After that, it will return the value found by its iterator
        const iterator = this.#iterator ??= this._reference[Symbol.iterator]()
        const indexPlus1 = index + 1
        const lastIndexRetrieved = this.#lastIndexRetrieved ?? -1
        /**
         * The last index to find is equals to `-1` if it has not been initialized.
         * Otherwise, it should be the value directly
         */
        let indexToFind = lastIndexRetrieved === -1 ? -1 : lastIndexRetrieved
        while (++indexToFind < indexPlus1)
            this[indexToFind] = iterator.next().value

        if (lastIndexRetrieved === size) {
            // We set the temporary values to `null` since we don't need them anymore
            this.#iterator = null
            this.#lastIndexRetrieved = null
        }
        return this[this.#lastIndexRetrieved = indexToFind - 1] as T
    }

    //#endregion -------------------- Get --------------------

    //#endregion -------------------- Research methods --------------------

    //#endregion -------------------- Methods --------------------

}
