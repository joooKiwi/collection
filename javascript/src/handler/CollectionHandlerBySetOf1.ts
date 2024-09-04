/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"

import {AbstractCollectionHandlerBy1Value} from "./AbstractCollectionHandlerBy1Value"

/**
 * An implementation of a {@link CollectionHolder} for an {@link ReadonlySet set} or one element
 *
 * @beta
 * @see CollectionHandlerBySet
 * @see CollectionHandlerBySetOf2
 */
export class CollectionHandlerBySetOf1<const T = unknown,
    const REFERENCE extends ReadonlySet<T> = ReadonlySet<T>,
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerBy1Value<T, REFERENCE, COLLECTION> {

    public constructor(collection: COLLECTION, reference: REFERENCE, size: number = reference.size,) {
        super(collection, reference,)
        if (size !== 1)
            throw new TypeError(`The set received in the "${this.constructor.name}" cannot have a different size than 1.`,)
    }

    protected override _retrieveFirst(): T { return this._reference[Symbol.iterator]().next().value }

}
