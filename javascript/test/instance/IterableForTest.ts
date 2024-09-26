/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

export class IterableForTest<const T, >
    implements Iterable<T> {

    public readonly array

    public constructor(array: readonly T[],) { this.array = array }

    public [Symbol.iterator](): IterableIterator<T> { return this.array[Symbol.iterator]() }

}
