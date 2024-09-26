/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

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
