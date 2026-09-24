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

import {AbstractIndependentCollectionHolderOf2} from "./AbstractIndependentCollectionHolderOf2"
import {DualValueCollectionHolder}              from "./DualValueCollectionHolder"
import {LazyArrayAsCollectionHolder}            from "./LazyArrayAsCollectionHolder"
import {LazyCollectionHolderOf0Or1Or2}          from "./LazyCollectionHolderOf0Or1Or2"
import {LazyCollectionHolderOf2}                from "./LazyCollectionHolderOf2"
import {SingleValueCollectionHolder}            from "./SingleValueCollectionHolder"
import {Optional}                               from "./optional/Optional"
import {Couple}                                 from "./tuple/Couple"

/**
 * A {@link CollectionHolder} having 2 values.
 * No state or reference is held in this instance.
 *
 * Most of the methods are being optimized for two value comparison
 * instead of using the extension function.
 *
 * @typeParam T1 The 1st type (**mandatory**)
 * @typeParam T2 The 2nd type (**mandatory**)
 * @see AbstractCollectionHolder
 * @see AbstractCollectionHolderOf1
 * @see DualValueCollectionHolder
 * @see ArrayOf2AsCollectionHolder
 * @see SetOf2AsCollectionHolder
 * @see IteratorOf2AsCollectionHolder
 * @see LazyCollectionHolderOf2
 */
export abstract class AbstractCollectionHolderOf2<const T1,
    const T2, >
    extends AbstractIndependentCollectionHolderOf2<T1, T2> {

    protected constructor() { super() }


    protected override _createCouple<const U1, const U2, >(value1: U1, value2: U2,): Couple<U1, U2> {
        return new Couple(value1, value2,)
    }

    protected override _create1<const U, >(value: U,): CollectionHolderOf1<U> {
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

}
