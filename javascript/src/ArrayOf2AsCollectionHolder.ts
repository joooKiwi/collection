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

import type {Nullable, UndefinedOr} from "@joookiwi/type"

import type {CollectionHolder}    from "./CollectionHolder"
import type {CollectionHolderOf2} from "./CollectionHolderOf2"
import type {Optional}            from "./optional/Optional"

import {AbstractCollectionHolderOf2}   from "./AbstractCollectionHolderOf2"
import {DualValueCollectionHolder}     from "./DualValueCollectionHolder"
import {LazyCollectionHolderOf0Or1Or2} from "./LazyCollectionHolderOf0Or1Or2"
import {LazyCollectionHolderOf2}       from "./LazyCollectionHolderOf2"
import {Couple}                        from "./tuple/Couple"

/**
 * An instance of {@link CollectionHolder} adapted from an {@link ReadonlyArray Array} having 2 values inside.
 *
 * Note that the value is directly retrieved from the array and it is kept
 *
 * @typeParam T1 The 1st type (by default `unknown`)
 * @typeParam T2 The 2nd type (by default `unknown`)
 * @see ArrayAsCollectionHolder
 * @see DualValueCollectionHolder
 * @see SetOf2AsCollectionHolder
 * @see LazyCollectionHolderOf2
 */
export class ArrayOf2AsCollectionHolder<const T1 = unknown,
    const T2 = unknown,
    const REFERENCE extends readonly [T1, T2,] = readonly [T1, T2,], >
    extends AbstractCollectionHolderOf2<T1, T2> {

    //#region -------------------- Field --------------------

    /** The internal value passed through the {@link constructor} in the {@link _reference} first field */
    public override readonly 0: T1
    /** The internal value passed through the {@link constructor} in the {@link _reference} second field */
    public override readonly 1: T2
    readonly #reference: WeakRef<REFERENCE>
    readonly #value1: T1
    readonly #value2: T2
    readonly #hasNull: boolean
    readonly #hasNoNulls: boolean
    readonly #hasDuplicate: boolean
    readonly #hasNoDuplicates: boolean

    //#endregion -------------------- Field --------------------
    //#region -------------------- Constructor --------------------

    public constructor(reference: & readonly [T1, T2,] & REFERENCE,)
    public constructor(reference: REFERENCE,) {
        super()
        if (reference.length !== 2)
            throw new TypeError(`The array received in the “${this.constructor.name}” cannot have a different size than 2.`,)
        this.#reference = new WeakRef(reference,)
        const value1 = this[0] = this.#value1 = reference[0]
        const value2 = this[1] = this.#value2 = reference[1]
        this.#hasNoNulls = !(this.#hasNull = (value1 == null || value2 == null))
        this.#hasNoDuplicates = !(this.#hasDuplicate = value1 as (| T1 | T2) === value2)
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    protected override _createCouple<const U1, const U2, >(value1: U1, value2: U2,): Couple<U1, U2> {
        return new Couple(value1, value2,)
    }

    protected override _create2(value2: T2, value1: T1,): CollectionHolderOf2<T2, T1> {
        return new DualValueCollectionHolder(value2, value1,)
    }

    protected _createLazy2<const U1, const U2, >(lateValue: () => Couple<U1, U2>,): CollectionHolderOf2<U1, U2> {
        return new LazyCollectionHolderOf2(lateValue,)
    }

    protected override _create0Or1Or2<const U1, const U2, >(latePossibleValue: () => Nullable<Couple<Optional<| U1 | U2>, Optional<U2>>>,): CollectionHolder<| U1 | U2> {
        return new LazyCollectionHolderOf0Or1Or2(latePossibleValue,)
    }


    /** The internal value passed through the {@link constructor} in the {@link _reference} first field */
    public override get value1(): T1 { return this.#value1 }

    /** The internal value passed through the {@link constructor} in the {@link _reference} second field */
    public override get value2(): T2 { return this.#value2 }

    /**
     * The internal referenced passed through the {@link constructor}.
     *
     * It returns `undefined` if the reference has been garbed-collected.
     */
    protected get _reference(): UndefinedOr<REFERENCE> { return this.#reference.deref() }

    public override get hasNull(): boolean { return this.#hasNull }

    public override get hasNoNulls(): boolean { return this.#hasNoNulls }

    public override get hasDuplicate(): boolean { return this.#hasDuplicate }

    public override get hasNoDuplicates(): boolean { return this.#hasNoDuplicates }

    //#endregion -------------------- Methods --------------------

}
