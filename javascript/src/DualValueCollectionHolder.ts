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

import type {Array, Nullable} from "@joookiwi/type"

import type {CollectionHolder}    from "./CollectionHolder"
import type {CollectionHolderOf1} from "./CollectionHolderOf1"
import type {CollectionHolderOf2} from "./CollectionHolderOf2"
import type {Optional}            from "./optional/Optional"

import {AbstractIndependentCollectionHolderOf2} from "./AbstractIndependentCollectionHolderOf2"
import {LazyArrayAsCollectionHolder}            from "./LazyArrayAsCollectionHolder"
import {LazyCollectionHolderOf0Or1Or2}          from "./LazyCollectionHolderOf0Or1Or2"
import {LazyCollectionHolderOf2}                from "./LazyCollectionHolderOf2"
import {SingleValueCollectionHolder}            from "./SingleValueCollectionHolder"
import {Couple}                                 from "./tuple/Couple"

/**
 * An instance of [CollectionHolder] with only 2 values from its `constructor`
 *
 * @typeParam T1 The 1st type (`unknown` by default)
 * @typeParam T2 The 2nd type (`unknown` by default)
 * @see ArrayOf2AsCollectionHolder
 * @see SetOf2AsCollectionHolder
 * @see IteratorOf2AsCollectionHolder
 * @see LazyCollectionHolderOf2
 */
export class DualValueCollectionHolder<const T1 = unknown,
    const T2 = unknown, >
    extends AbstractIndependentCollectionHolderOf2<T1, T2> {

    //#region -------------------- Field --------------------

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
        this.#value1 = value1
        this.#value2 = value2
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    protected override _createCouple<const U1, const U2, >(value1: U1, value2: U2,): Couple<U1, U2> {
        return new Couple(value1, value2,)
    }

    protected override _create1<const U,>(value: U,): CollectionHolderOf1<U>  {
        return new SingleValueCollectionHolder(value,)
    }

    protected override _create2(value2: T2, value1: T1,): CollectionHolderOf2<T2, T1> {
        return new DualValueCollectionHolder(value2, value1,)
    }

    protected override _createLazy2<const U1, const U2, >(lateValue: () => Couple<U1, U2>,): CollectionHolderOf2<U1, U2> {
        return new LazyCollectionHolderOf2(lateValue,)
    }

    protected override _create0Or1Or2<const U1, const U2, >(latePossibleValue: () => Nullable<Couple<Optional<| U1 | U2>, Optional<U2>>>,): CollectionHolder<| U1 | U2> {
        return new LazyCollectionHolderOf0Or1Or2(latePossibleValue,)
    }

    protected override _createLazyArray(lateArray: () => Array<| T1 | T2>,): CollectionHolder<| T1 | T2> {
        return new LazyArrayAsCollectionHolder(lateArray,)
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
