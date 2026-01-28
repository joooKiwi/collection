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

import type {CollectionHolder}   from "../CollectionHolder"
import type {CollectionIterator} from "../iterator/CollectionIterator"

import {AbstractCollectionHandlerBy2Values} from "./AbstractCollectionHandlerBy2Values"

/**
 * An implementation of a {@link CollectionHolder} for an {@link CollectionIterator} of two elements
 *
 * @beta
 * @see CollectionHandlerByCollectionIterator
 * @see CollectionHandlerByCollectionIteratorOf1
 */
export class CollectionHandlerByCollectionIteratorOf2<const T = unknown,
    const REFERENCE extends CollectionIterator<T> = CollectionIterator<T>,
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerBy2Values<T, REFERENCE, COLLECTION> {

    public constructor(collection: COLLECTION, reference: REFERENCE, size: number = reference.size,) {
        super(collection, reference,)
        if (size !== 2)
            throw new TypeError(`The collection iterator received in the “${this.constructor.name}” cannot have a different size than 2.`,)
    }

    protected override _retrieveFirst(): T { return this._reference.nextValue }

    protected override _retrieveSecond(): T {
        this._first
        const value = this._reference.nextValue
        this._hasFinished = true
        return value
    }

}
