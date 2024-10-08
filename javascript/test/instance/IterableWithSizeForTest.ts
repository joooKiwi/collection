/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {IterableWithSize} from "../../src/iterable/IterableWithSize"

/** An {@link IterableWithSize} that is made for the tests with an {@link ReadonlyArray Array} under the hood */
export class IterableWithSizeForTest<const T, >
    implements IterableWithSize<T> {

    public readonly array
    public readonly size

    public constructor(array: readonly T[],) {
        this.array = array
        this.size = array.length
    }

    public [Symbol.iterator](): IterableIterator<T> { return this.array[Symbol.iterator]() }

}
