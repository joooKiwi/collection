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

import type {Couple} from "./tuple/Couple"

import {AbstractCollectionHolderOf2} from "./AbstractCollectionHolderOf2"

/**
 * An instance of [CollectionHolder] with 2 values but lazily retrieved.
 *
 * It does retrieve the value only once from the callback received in its `constructor`.
 *
 * @typeParam T The type (by default `unknown`)
 * @typeParam T1 The 1st type (by default `T`)
 * @typeParam T2 The 2nd type (by default `T`)
 * @see CollectionHolderOf2
 * @see ArrayOf2AsCollectionHolder
 * @see SetOf2AsCollectionHolder
 */
export class LazyCollectionHolderOf2<const T = unknown,
    const T1 extends T = T,
    const T2 extends T = T, >
    extends AbstractCollectionHolderOf2<T, T1, T2> {

    readonly #value1: Lazy<T1>
    readonly #value2: Lazy<T2>
    #hasNull?: boolean
    #hasNoNulls?: boolean
    #hasDuplicate?: boolean
    #hasNoDuplicates?: boolean

    public constructor(lateValues: () => Couple<T, T1, T2>,) {
        super()
        const values = lazy(lateValues,)
        const lazyValue1 = this.#value1 = lazy(() => values.value.value1,)
        this.#value2 = lazy(() => {
            if (lazyValue1.isInitialized)
                return values.value.value2

            lazyValue1.value // We initialize the 1st value since it should always be initialized before the second value
            return values.value.value2
        },)
    }

    /** The internal 1st value (out of 2) passed through the {@link constructor} */
    public get 0(): T1 { return this.value1 }

    /** The internal 2nd value (out of 2) passed through the {@link constructor} */
    public get 1(): T2 { return this.value2 }

    /** The internal 1st value (out of 2) passed through the {@link constructor} */
    public override get value1(): T1 { return this.#value1.value }

    /** The internal 2nd value (out of 2) passed through the {@link constructor} */
    public override get value2(): T2 { return this.#value2.value }

    public override get hasNull(): boolean { return this.#hasNull ?? super.hasNull }

    public override get hasNoNulls(): boolean { return this.#hasNoNulls ?? super.hasNoNulls }

    public override get hasDuplicate(): boolean { return this.#hasDuplicate ?? super.hasDuplicate }

    public override get hasNoDuplicates(): boolean { return this.#hasNoDuplicates ?? super.hasNoDuplicates }

}
