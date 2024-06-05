/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Lazy} from "@joookiwi/lazy"
import {lazy}      from "@joookiwi/lazy"

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

    //#region -------------------- Fields --------------------

    readonly #first: Lazy<T>
    readonly #second: Lazy<T>

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE, size: number,) {
        super(collection, reference,)
        if (size !== 2)
            throw new TypeError(`The collection holder received in the "${this.constructor.name}" cannot have a different size than 2.`,)

        this.#first = lazy(() => reference.get(0,),)
        this.#second = lazy(() => reference.get(1,),)
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    protected override get _first(): T { return this.#first.value }

    protected override get _second(): T { return this.#second.value }

    //#endregion -------------------- Getter methods --------------------

}
