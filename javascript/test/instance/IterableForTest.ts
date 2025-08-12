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

/** An {@link Iterable} that is made for the tests with an {@link ReadonlyArray Array} under the hood */
export class IterableForTest<const T, >
    implements Iterable<T> {

    public readonly array

    public constructor(array: readonly T[],) { this.array = array }

    public [Symbol.iterator](): ArrayIterator<T> { return this.array[Symbol.iterator]() }

}
