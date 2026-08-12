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

import {AbstractCollectionHolderOf2} from "./AbstractCollectionHolderOf2"

/**
 * An instance of [CollectionHolder] with only 2 values from its `constructor`
 *
 * @typeParam T The type (by default `unknown`)
 * @typeParam T1 The 1st type (by default `T`)
 * @typeParam T2 The 2nd type (by default `T`)
 * @see LazyCollectionHolderOf2
 * @see ArrayOf2AsCollectionHolder
 * @see SetOf2AsCollectionHolder
 */
export class CollectionHolderOf2<const T = unknown,
    const T1 extends T = T,
    const T2 extends T = T,>
    extends AbstractCollectionHolderOf2<T, T1, T2> {

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

    public constructor(value1: T1, value2: T2,) {
        super()
        this[0] = this.#value1 = value1
        this[1] = this.#value2 = value2
    }

    /** The internal 1st value (out of 2) passed through the {@link constructor} */
    public override get value1(): T1 { return this.#value1 }

    /** The internal 2nd value (out of 2) passed through the {@link constructor} */
    public override get value2(): T2 { return this.#value2 }

    public override get hasNull(): boolean { return this.#hasNull ?? super.hasNull }

    public override get hasNoNulls(): boolean { return this.#hasNoNulls ?? super.hasNoNulls }

    public override get hasDuplicate(): boolean { return this.#hasDuplicate ?? super.hasDuplicate }

    public override get hasNoDuplicates(): boolean { return this.#hasNoDuplicates ?? super.hasNoDuplicates }

}
