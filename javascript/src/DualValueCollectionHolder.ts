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

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}    from "./CollectionHolder"
import type {CollectionHolderOf2} from "./CollectionHolderOf2"
import type {Optional}            from "./optional/Optional"

import {AbstractCollectionHolderOf2}   from "./AbstractCollectionHolderOf2"
import {LazyCollectionHolderOf0Or1Or2} from "./LazyCollectionHolderOf0Or1Or2"
import {LazyCollectionHolderOf2}       from "./LazyCollectionHolderOf2"
import {Couple}                        from "./tuple/Couple"

/**
 * An instance of [CollectionHolder] with only 2 values from its `constructor`
 *
 * @typeParam T1 The 1st type (by default `unknown`)
 * @typeParam T2 The 2nd type (by default `unknown`)
 * @see LazyCollectionHolderOf2
 * @see ArrayOf2AsCollectionHolder
 * @see SetOf2AsCollectionHolder
 */
export class DualValueCollectionHolder<const T1 = unknown,
    const T2 = unknown, >
    extends AbstractCollectionHolderOf2<T1, T2> {

    //#region -------------------- Field --------------------

    /** The internal 1st value (out of 2) passed through the {@link constructor} */
    public override readonly 0: T1
    /** The internal 2nd value (out of 2) passed through the {@link constructor} */
    public override readonly 1: T2
    readonly #value1: T1
    readonly #value2: T2
    readonly #hasNull?: boolean
    readonly #hasNoNulls?: boolean
    readonly #hasDuplicate?: boolean
    readonly #hasNoDuplicates?: boolean

    //#endregion -------------------- Field --------------------
    //#region -------------------- Constructor --------------------

    public constructor(value1: T1, value2: T2,) {
        super()
        this[0] = this.#value1 = value1
        this[1] = this.#value2 = value2
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


    /** The internal 1st value (out of 2) passed through the {@link constructor} */
    public override get value1(): T1 { return this.#value1 }

    /** The internal 2nd value (out of 2) passed through the {@link constructor} */
    public override get value2(): T2 { return this.#value2 }

    public override get hasNull(): boolean { return this.#hasNull ?? super.hasNull }

    public override get hasNoNulls(): boolean { return this.#hasNoNulls ?? super.hasNoNulls }

    public override get hasDuplicate(): boolean { return this.#hasDuplicate ?? super.hasDuplicate }

    public override get hasNoDuplicates(): boolean { return this.#hasNoDuplicates ?? super.hasNoDuplicates }

    //#endregion -------------------- Methods --------------------

}
