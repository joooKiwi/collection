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

import type {Array} from "@joookiwi/type"

import type {IterableWithPossibleSize} from "../../src/iterable/IterableWithPossibleSize"

/**
 * An {@link IterableWithPossibleSize} that is made for the tests with an {@link ReadonlyArray Array} under the hood.
 * Plus, the {@link #size}, {@link #length} & {@link #count} always returns `null`
 *
 * @typeParam T The type (**mandatory**)
 */
export class IterableWithNullPossibleSize<const T, >
    implements IterableWithPossibleSize<T> {

    public readonly array
    public readonly size = null
    public readonly length = null
    public readonly count = null

    public constructor(array: Array<T>,) {
        this.array = array
    }

    public [Symbol.iterator](): IterableIterator<T> { return this.array[Symbol.iterator]() }

}
