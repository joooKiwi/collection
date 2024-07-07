/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}   from "../CollectionHolder"
import type {CollectionIterator} from "../iterator/CollectionIterator"

import {AbstractCollectionHandlerBy1Value} from "./AbstractCollectionHandlerBy1Value"

/**
 * An implementation of a {@link CollectionHandler} for a {@link CollectionIterator} of one element
 * with only one element
 *
 * @beta
 * @see CollectionHandlerByCollectionIterator
 * @see CollectionHandlerByCollectionIteratorOf2
 */
export class CollectionHandlerByCollectionIteratorOf1<const out T = unknown,
    const out REFERENCE extends CollectionIterator<T> = CollectionIterator<T>,
    const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerBy1Value<T, REFERENCE, COLLECTION> {

    public constructor(collection: COLLECTION, reference: REFERENCE, size: number,) {
        super(collection, reference,)
        if (size !== 1)
            throw new TypeError(`The collection iterator received in the "${this.constructor.name}" cannot have a different size than 1.`,)
    }

    protected override _retrieveFirst(): T { return this._reference[Symbol.iterator]().nextValue }

}
