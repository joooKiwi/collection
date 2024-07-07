/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

export function newIterable<const T, >(array: readonly T[],): Iterable<T> {
    return {
        [Symbol.iterator](): IterableIterator<T> {
            return array[Symbol.iterator]()
        },
    }
}
