//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································


import type {CollectionHolder} from "../CollectionHolder"

import {AbstractCollectionHandlerWithIterableOrIterator} from "./AbstractCollectionHandlerWithIterableOrIterator"

/**
 * An implementation of a {@link CollectionHandler} for an {@link Iterable}
 *
 * @beta
 * @see CollectionHandlerByIterableWithSize
 * @see CollectionHandlerByIterableWithSizeOf1
 * @see CollectionHandlerByIterableWithSizeOf2
 */
export class CollectionHandlerByIterable<const T = unknown,
    const REFERENCE extends Iterable<T> = Iterable<T>,
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerWithIterableOrIterator<T, REFERENCE, COLLECTION> {

    #iterator?: Iterator<T, unknown, unknown>

    public constructor(collection: COLLECTION, reference: REFERENCE,) { super(collection, reference,) }

    protected get _iterator(): Iterator<T, unknown, unknown> {
        return this.#iterator ??= this._reference[Symbol.iterator]()
    }

}
