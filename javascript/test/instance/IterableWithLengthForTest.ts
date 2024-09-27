/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {IterableWithLength} from "../../src/iterable/IterableWithLength"

/** An {@link IterableWithLength} that is made for the tests with an {@link ReadonlyArray Array} under the hood */
export class IterableWithLengthForTest<const T, >
    implements IterableWithLength<T> {

    public readonly array
    public readonly length

    public constructor(array: readonly T[],) {
        this.array = array
        this.length = array.length
    }

    public [Symbol.iterator](): IterableIterator<T> { return this.array[Symbol.iterator]() }

}
