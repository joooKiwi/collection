/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"

import {CollectionHandlerByMinimalistCollectionHolder} from "./CollectionHandlerByMinimalistCollectionHolder"

/**
 * An implementation of a {@link CollectionHandler} for a {@link CollectionHolder}
 *
 * @beta
 * @see CollectionHandlerByMinimalistCollectionHolder
 */
export class CollectionHandlerByCollectionHolder<const out T = unknown,
    const out REFERENCE extends CollectionHolder<T> = CollectionHolder<T>,
    const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends CollectionHandlerByMinimalistCollectionHolder<T, REFERENCE, COLLECTION> {

    public constructor(collection: COLLECTION, reference: REFERENCE,) { super(collection, reference,) }

    public override get isEmpty(): REFERENCE["isEmpty"] { return this._reference.isEmpty }

    public override get hasNull(): REFERENCE["hasNull"] { return this._reference.hasNull }

    public override get hasDuplicate(): REFERENCE["hasDuplicate"] { return this._reference.hasDuplicate }

}
