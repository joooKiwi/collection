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

import type {CollectionHolder} from "../CollectionHolder"

import {AbstractCollectionHandlerWithIterableOrIterator} from "./AbstractCollectionHandlerWithIterableOrIterator"

/**
 * An implementation of a {@link CollectionHandler} for an {@link Iterator}
 *
 * @beta
 */
export class CollectionHandlerByIterator<const T = unknown,
    const REFERENCE extends Iterator<T, unknown, unknown> = Iterator<T, unknown, unknown>,
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerWithIterableOrIterator<T, REFERENCE, COLLECTION> {

    public constructor(collection: COLLECTION, reference: REFERENCE,) { super(collection, reference,) }

    protected override get _iterator(): Iterator<T, unknown, unknown> {
        return this._reference
    }

}
