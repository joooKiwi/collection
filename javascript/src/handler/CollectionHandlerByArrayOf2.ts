/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"

import {AbstractCollectionHandlerBy2Values} from "./AbstractCollectionHandlerBy2Values"

/**
 * An implementation of a {@link CollectionHolder} for an {@link ReadonlyArray array} of two elements
 *
 * @see CollectionHandlerByArray
 * @see CollectionHandlerByArrayOf1
 */
export class CollectionHandlerByArrayOf2<const T = unknown,
    const REFERENCE extends readonly [T, T,] = readonly [T, T,],
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerBy2Values<T, REFERENCE, COLLECTION> {

    public constructor(collection: COLLECTION, reference: readonly T[], size: number = reference.length,) {
        super(collection, reference as REFERENCE,)
        if (size !== 2)
            throw new TypeError(`The array received in the "${this.constructor.name}" cannot have a different size than 2.`,)
    }

    protected override _retrieveFirst(): T { return this._reference[0] }

    protected override _retrieveSecond(): T { return this._reference[1] }

}
