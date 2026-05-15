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

import type {Lazy} from "@joookiwi/lazy"
import {lazy}      from "@joookiwi/lazy"

import {AbstractCollectionHolderOf1} from "./AbstractCollectionHolderOf1"

/**
 * An instance of [CollectionHolder] with only a single value but lazily retrieved.
 *
 * It does retrieve the value only once from the callback received in its `constructor`.
 *
 * @typeParam T The type
 * @see CollectionHolderOf1
 * @see ArrayOf1AsCollectionHolder
 */
export class LazyCollectionHolderOf1<const T = unknown, >
    extends AbstractCollectionHolderOf1<T> {

    readonly #value: Lazy<T>
    #hasNull?: boolean
    #hasNoNulls?: boolean

    public constructor(lateValue: () => T,) {
        super()
        this.#value = lazy(lateValue,)
    }

    /** The internal value passed through the {@link constructor} */
    public override get 0() { return this.value }

    /** The internal value passed through the {@link constructor} */
    public override get value(): T { return this.#value.value }

    public override get hasNull(): boolean { return this.#hasNull ?? super.hasNull }

    public override get hasNoNulls(): boolean { return this.#hasNoNulls ?? super.hasNoNulls }

}
