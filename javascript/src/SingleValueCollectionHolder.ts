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

import type {Array}                  from "@joookiwi/type"

import type {CollectionHolder}    from "./CollectionHolder"
import type {CollectionHolderOf1} from "./CollectionHolderOf1"
import type {Optional}            from "./optional/Optional"

import {AbstractIndependentCollectionHolderOf1} from "./AbstractIndependentCollectionHolderOf1"
import {LazyArrayAsCollectionHolder}            from "./LazyArrayAsCollectionHolder"
import {LazyCollectionHolderOf0Or1}             from "./LazyCollectionHolderOf0Or1"
import {LazyCollectionHolderOf1}                from "./LazyCollectionHolderOf1"

/**
 * An instance of [CollectionHolder] with only a single value from its `constructor`
 *
 * @typeParam T The type (`unknown` by default)
 * @see ArrayOf1AsCollectionHolder
 * @see SetOf1AsCollectionHolder
 * @see IteratorOf1AsCollectionHolder
 * @see LazyCollectionHolderOf1
 */
export class SingleValueCollectionHolder<const T = unknown, >
    extends AbstractIndependentCollectionHolderOf1<T> {

    readonly #value: T
    readonly #hasNull: boolean
    readonly #hasNoNulls: boolean

    public constructor(value: T,) {
        super()
        this.#hasNoNulls = !(this.#hasNull = (this.#value = value) == null)
    }

    protected override _create<const U, >(lateValue: () => U,): CollectionHolderOf1<U> {
        return new LazyCollectionHolderOf1(lateValue,)
    }

    protected override _create0Or1<const U, >(latePossibleValue: () => Optional<U>,): CollectionHolder<U> {
        return new LazyCollectionHolderOf0Or1(latePossibleValue,)
    }

    protected override _createLazyArray(lateArray: () => Array<T>,): CollectionHolder<T> {
        return new LazyArrayAsCollectionHolder(lateArray,)
    }

    /** The internal value passed through the {@link constructor} */
    public override get value(): T { return this.#value }

    public override get hasNull(): boolean { return this.#hasNull }

    public override get hasNoNulls(): boolean { return this.#hasNoNulls }

}
