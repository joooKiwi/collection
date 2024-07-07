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
export class CollectionHandlerByCollectionHolderOf2<const out T = unknown,
    const out REFERENCE extends CollectionHolder<T> = CollectionHolder<T>,
    const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandlerBy2Values<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    readonly #first: T
    readonly #second: T

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE, size: number,) {
        super(collection, reference,)
        if (size !== 2)
            throw new TypeError(`The collection holder received in the "${this.constructor.name}" cannot have a different size than 2.`,)

        this.#first = reference.first()
        this.#second = reference.last()
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    protected override get _first(): T { return this.#first }

    protected override get _second(): T { return this.#second }

    public override get hasNull(): REFERENCE["hasNull"] { return this._reference.hasNull }

    public override get hasDuplicate(): REFERENCE["hasDuplicate"] { return this._reference.hasDuplicate }

    //#endregion -------------------- Getter methods --------------------

}
