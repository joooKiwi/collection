/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Lazy} from "@joookiwi/lazy"
import {lazy}      from "@joookiwi/lazy"

import type {CollectionHolder} from "../CollectionHolder"

import {AbstractCollectionHandlerBy2Values} from "./AbstractCollectionHandlerBy2Values"

/**
 * An implementation of a {@link CollectionHolder} for an {@link ReadonlySet set} of two elements
 *
 * @beta
 * @see CollectionHandlerBySet
 * @see CollectionHandlerBySetOf1
 */
export class CollectionHandlerBySetOf2<const out T = unknown,
    const out REFERENCE extends ReadonlySet<T> = ReadonlySet<T>,
    const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerBy2Values<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    readonly #first: Lazy<T>
    readonly #second: Lazy<T>

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
        if (reference.size !== 2)
            throw new TypeError(`The set received in the "${this.constructor.name}" cannot have a different size than 2.`,)

        const iterator = lazy(() => reference[Symbol.iterator](),)
        const first = this.#first = lazy(() => collection[0] = iterator.value.next().value,)
        this.#second = lazy(() => {
            first.value
            const value = collection[1] = iterator.value.next().value
            this._hasFinished = true
            return value
        },)
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    protected override get _first(): T { return this.#first.value }

    protected override get _second(): T { return this.#second.value }

    //#endregion -------------------- Getter methods --------------------

}
