//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {IterableWithPossibleSize} from "../../src/iterable/IterableWithPossibleSize"

export class IterableWithNullPossibleSize<const T, >
    implements IterableWithPossibleSize<T> {

    public readonly array
    public readonly size = null
    public readonly length = null
    public readonly count = null

    public constructor(array: readonly T[],) {
        this.array = array
    }

    public [Symbol.iterator](): IterableIterator<T> { return this.array[Symbol.iterator]() }

}
