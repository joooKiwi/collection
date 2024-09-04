/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"

import {AbstractCollectionHandlerBy2Values} from "./AbstractCollectionHandlerBy2Values"

/**
 * An implementation of a {@link CollectionHolder} for an {@link ReadonlySet set} of two elements
 *
 * @beta
 * @see CollectionHandlerBySet
 * @see CollectionHandlerBySetOf1
 */
export class CollectionHandlerBySetOf2<const T = unknown,
    const REFERENCE extends ReadonlySet<T> = ReadonlySet<T>,
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerBy2Values<T, REFERENCE, COLLECTION> {

    #iterator?: Iterator<T, unknown>

    public constructor(collection: COLLECTION, reference: REFERENCE, size: number = reference.size,) {
        super(collection, reference,)
        if (size !== 2)
            throw new TypeError(`The set received in the "${this.constructor.name}" cannot have a different size than 2.`,)
    }

    get #__iterator(): Iterator<T, unknown> { return this.#iterator ??= this._reference[Symbol.iterator]() }

    protected override _retrieveFirst(): T { return this.#__iterator.next().value as T }

    protected override _retrieveSecond(): T {
        this._first
        const value = this.#__iterator.next().value as T
        this._hasFinished = true
        return value
    }

    public override get hasDuplicate(): false { return false }

}
