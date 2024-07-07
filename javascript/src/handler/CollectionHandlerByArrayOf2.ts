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
export class CollectionHandlerByArrayOf2<const out T = unknown,
    const out REFERENCE extends readonly [T, T,] = readonly [T, T,],
    const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerBy2Values<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    readonly #first: T
    readonly #second: T

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: readonly T[],) {
        super(collection, reference as REFERENCE,)
        if (reference.length !== 2)
            throw new TypeError(`The array received in the "${this.constructor.name}" cannot have a different size than 2.`,)

        this.#first = reference[0] as T
        this.#second = reference[1] as T
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    protected override get _first(): T { return this.#first }

    protected override get _second(): T { return this.#second }

    //#endregion -------------------- Getter methods --------------------

}
