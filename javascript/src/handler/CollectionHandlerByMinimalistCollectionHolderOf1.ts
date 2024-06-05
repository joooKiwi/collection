/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 ******************************************************************************/

import type {Lazy} from "@joookiwi/lazy"
import {lazy}      from "@joookiwi/lazy"

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
export class CollectionHandlerByMinimalistCollectionHolderOf1<const out T = unknown,
    const out REFERENCE extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>,
    const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerBy1Value<T, REFERENCE, COLLECTION> {

    readonly #first: Lazy<T>

    public constructor(collection: COLLECTION, reference: REFERENCE, size: number,) {
        super(collection, reference,)
        if (size !== 1)
            throw new TypeError(`The minimalist collection holder received in the "${this.constructor.name}" cannot have a different size than 1.`,)

        this.#first = lazy(() => reference.get(0,),)
    }

    protected override get _first(): T { return this.#first.value }

}
