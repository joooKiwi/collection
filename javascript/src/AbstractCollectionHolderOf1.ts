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

import type {Array,} from "@joookiwi/type"

import type {CollectionHolder}    from "./CollectionHolder"
import type {CollectionHolderOf1} from "./CollectionHolderOf1"
import type {Optional}            from "./optional/Optional"

import {AbstractIndependentCollectionHolderOf1} from "./AbstractIndependentCollectionHolderOf1"
import {LazyArrayAsCollectionHolder}            from "./LazyArrayAsCollectionHolder"
import {LazyCollectionHolderOf0Or1}             from "./LazyCollectionHolderOf0Or1"
import {LazyCollectionHolderOf1}                from "./LazyCollectionHolderOf1"

/**
 * A {@link CollectionHolder} having a single value.
 * No state or reference is held in this instance.
 *
 * Most of the methods are being optimized for a single value comparison
 * instead of using the extension function.
 *
 * @typeParam T The type (**mandatory**)
 * @see AbstractCollectionHolder
 * @see AbstractCollectionHolderOf2
 * @see SingleValueCollectionHolder
 * @see ArrayOf1AsCollectionHolder
 * @see SetOf1AsCollectionHolder
 * @see IteratorOf1AsCollectionHolder
 * @see LazyCollectionHolderOf1
 */
export abstract class AbstractCollectionHolderOf1<const T, >
    extends AbstractIndependentCollectionHolderOf1<T> {

    protected constructor() { super() }


    public override _create<const U, >(lateValue: () => U,): CollectionHolderOf1<U> {
        return new LazyCollectionHolderOf1(lateValue,)
    }

    protected override _create0Or1<const U, >(latePossibleValue: () => Optional<U>,): CollectionHolder<U> {
        return new LazyCollectionHolderOf0Or1(latePossibleValue,)
    }

    protected override _createLazyArray(lateArray: () => Array<T>,): CollectionHolder<T> {
        return new LazyArrayAsCollectionHolder(lateArray,)
    }

}
