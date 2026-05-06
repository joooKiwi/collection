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

import {AbstractCollectionHolderOf1} from "./AbstractCollectionHolderOf1"

/**
 * An instance of [CollectionHolder] with only a single value from its `constructor`
 *
 * @typeParam T The type
 * @see LazyCollectionHolderOf1
 * @see ArrayOf1AsCollectionHolder
 */
export class CollectionHolderOf1<const T = unknown, >
    extends AbstractCollectionHolderOf1<T> {

    /** The internal value passed through the {@link constructor} */
    public override readonly 0: T
    readonly #value: T
    readonly #hasNull: boolean
    readonly #hasNoNulls: boolean

    public constructor(value: T,) {
        super()
        this.#hasNoNulls = !(this.#hasNull = (this[0] = this.#value = value) == null)
    }

    /** The internal value passed through the {@link constructor} */
    public override get value(): T { return this.#value }

    public override get hasNull(): boolean { return this.#hasNull }

    public override get hasNoNulls(): boolean { return this.#hasNoNulls }

}
