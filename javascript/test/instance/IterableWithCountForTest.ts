/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {IterableWithCount} from "../../src/iterable/IterableWithCount"

/** An {@link IterableWithCount} that is made for the tests with an {@link ReadonlyArray Array} under the hood */
export class IterableWithCountForTest<const T, >
    implements IterableWithCount<T> {

    public readonly array
    public readonly count

    public constructor(array: readonly T[],) {
        this.array = array
        this.count = array.length
    }

    public [Symbol.iterator](): IterableIterator<T> { return this.array[Symbol.iterator]() }

}
