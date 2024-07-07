/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"

import {AbstractCollectionHandlerBy1Value} from "./AbstractCollectionHandlerBy1Value"

/**
 * An implementation of a {@link CollectionHolder} for an {@link ReadonlyArray array} of one element
 *
 * @see CollectionHandlerByArray
 * @see CollectionHandlerByArrayOf2
 */
export class CollectionHandlerByArrayOf1<const out T = unknown,
    const out REFERENCE extends readonly [T,] = readonly [T,],
    const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerBy1Value<T, REFERENCE, COLLECTION> {

    public constructor(collection: COLLECTION, reference: readonly T[],) {
        super(collection, reference as REFERENCE,)
        if (reference.length !== 1)
            throw new TypeError(`The array received in the "${this.constructor.name}" cannot have a different size than 1.`,)
    }

    protected override _retrieveFirst(): T { return this._reference[0] }

}
