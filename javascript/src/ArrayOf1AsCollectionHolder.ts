//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {UndefinedOr} from "@joookiwi/type"

import {AbstractCollectionHolderOf1} from "./AbstractCollectionHolderOf1"

/**
 * An instance of {@link CollectionHolder} adapted from an {@link ReadonlyArray Array} having a lone value inside.
 *
 * Note that the value is directly retrieved from the array and it is kept
 *
 * @typeParam T The type
 * @see ArrayAsCollectionHolder
 * @see SetOf1AsCollectionHolder
 * @see CollectionHolderOf1
 * @see LazyCollectionHolderOf1
 */
export class ArrayOf1AsCollectionHolder<const T = unknown,
    const REFERENCE extends readonly [T,] = readonly [T,], >
    extends AbstractCollectionHolderOf1<T> {

    /** The internal value passed through the {@link constructor} in the {@link _reference} first field */
    public override readonly 0: T
    readonly #reference: WeakRef<REFERENCE>
    readonly #value: T
    readonly #hasNull: boolean
    readonly #hasNoNulls: boolean

    public constructor(reference: REFERENCE,) {
        super()
        if (reference.length !== 1)
            throw new TypeError(`The array received in the “${this.constructor.name}” cannot have a different size than 1.`,)
        this.#reference = new WeakRef(reference,)
        this.#hasNoNulls = !(this.#hasNull = (this.#value = this[0] = reference[0]) == null)
    }

    /** The internal value passed through the {@link constructor} in the {@link _reference} first field */
    public override get value(): T { return this.#value }

    /**
     * The internal referenced passed through the {@link constructor}.
     *
     * It returns `undefined` if the reference has been garbed-collected.
     */
    protected get _reference(): UndefinedOr<REFERENCE> { return this.#reference.deref() }

    public override get hasNull(): boolean { return this.#hasNull }

    public override get hasNoNulls(): boolean { return this.#hasNoNulls }

}
