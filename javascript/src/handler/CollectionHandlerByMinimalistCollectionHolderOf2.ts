/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {AbstractCollectionHandlerBy2Values} from "./AbstractCollectionHandlerBy2Values"

/**
 * An implementation of a {@link CollectionHandler} for an {@link MinimalistCollectionHolder} of two elements
 *
 * @beta
 * @see CollectionHandlerByMinimalistCollectionHolder
 * @see CollectionHandlerByMinimalistCollectionHolderOf1
 */
export class CollectionHandlerByMinimalistCollectionHolderOf2<const out T = unknown,
    const out REFERENCE extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>,
    const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerBy2Values<T, REFERENCE, COLLECTION> {

    public constructor(collection: COLLECTION, reference: REFERENCE, size: number,) {
        super(collection, reference,)
        if (size !== 2)
            throw new TypeError(`The collection holder received in the "${this.constructor.name}" cannot have a different size than 2.`,)
    }

    protected override _retrieveFirst(): T { return this._reference.get(0,) }

    protected override _retrieveSecond(): T { return this._reference.get(1,) }

}
