/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

export function newSet<const T, >(array: readonly T[],): ReadonlySet<T> {
    return new Set(array,)
}
