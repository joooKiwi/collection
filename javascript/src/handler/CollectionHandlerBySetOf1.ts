/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Lazy} from "@joookiwi/lazy"
import {lazy}      from "@joookiwi/lazy"

import type {CollectionHolder} from "../CollectionHolder"

import {AbstractCollectionHandlerBy1Value} from "./AbstractCollectionHandlerBy1Value"

/**
 * An implementation of a {@link CollectionHolder} for an {@link ReadonlySet set} or one element
 *
 * @beta
 * @see CollectionHandlerBySet
 * @see CollectionHandlerBySetOf2
 */
export class CollectionHandlerBySetOf1<const out T = unknown,
    const out REFERENCE extends ReadonlySet<T> = ReadonlySet<T>,
    const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerBy1Value<T, REFERENCE, COLLECTION> {

    readonly #first: Lazy<T>

    public constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
        if (reference.size !== 1)
            throw new TypeError(`The set received in the "${this.constructor.name}" cannot have a different size than 1.`,)

        this.#first = lazy(() => reference[Symbol.iterator]().next().value,)
    }

    protected override get _first(): T { return this.#first.value }

}
