/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"

import {AbstractCollectionHandlerBy2Values} from "./AbstractCollectionHandlerBy2Values"

/**
 * An implementation of a {@link CollectionHandler} for an {@link CollectionHolder} of two elements
 *
 * @beta
 * @see CollectionHandlerByCollectionHolder
 * @see CollectionHandlerByCollectionHolderOf1
 */
export class CollectionHandlerByCollectionHolderOf2<const T = unknown,
    const REFERENCE extends CollectionHolder<T> = CollectionHolder<T>,
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerBy2Values<T, REFERENCE, COLLECTION> {

    public constructor(collection: COLLECTION, reference: REFERENCE, size: number = reference.size,) {
        super(collection, reference,)
        if (size !== 2)
            throw new TypeError(`The collection holder received in the "${this.constructor.name}" cannot have a different size than 2.`,)
    }

    protected override _retrieveFirst(): T { return this._reference.getFirst() }

    protected override _retrieveSecond(): T { return this._reference.getLast() }

    public override get hasNull(): REFERENCE["hasNull"] { return this._reference.hasNull }

    public override get hasDuplicate(): REFERENCE["hasDuplicate"] { return this._reference.hasDuplicate }

}
