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

/** An {@link Iterator} that is made for the tests with an {@link ReadonlyArray Array} under the hood */
export class IteratorForTest<const T, >
    extends Iterator<T, undefined> {

    public readonly array
    public iterator?: ArrayIterator<T>

    public constructor(array: readonly T[],) {
        super()
        this.array = array
    }

    next(): IteratorResult<T, undefined> {
        const iterator = this.iterator ??= this.array[Symbol.iterator]()
        return iterator.next()
    }

}
