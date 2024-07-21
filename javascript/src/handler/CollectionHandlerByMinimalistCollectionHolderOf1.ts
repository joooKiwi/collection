/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 ******************************************************************************/

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {AbstractCollectionHandlerBy1Value} from "./AbstractCollectionHandlerBy1Value"

/**
 * An implementation of a {@link CollectionHandler} for a {@link MinimalistCollectionHolder} of one element
 *
 * @beta
 * @see CollectionHandlerByMinimalistCollectionHolder
 * @see CollectionHandlerByMinimalistCollectionHolderOf2
 */
export class CollectionHandlerByMinimalistCollectionHolderOf1<const T = unknown,
    const REFERENCE extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>,
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerBy1Value<T, REFERENCE, COLLECTION> {

    public constructor(collection: COLLECTION, reference: REFERENCE, size: number,) {
        super(collection, reference,)
        if (size !== 1)
            throw new TypeError(`The minimalist collection holder received in the "${this.constructor.name}" cannot have a different size than 1.`,)
    }

    protected override _retrieveFirst(): T { return this._reference.get(0,) }

}
