/*
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi
 *
 * This project is free to use.
 * All the right is reserved to the author of this project.
 */

import type {CollectionHolder} from "../CollectionHolder"
import type {Nullable, NullOr} from "../general type"

import {endingIndex as endingIndexFunction}     from "./endingIndex"
import {startingIndex as startingIndexFunction} from "./startingIndex"

/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection the {@link Nullable nullable} {@link CollectionHolder collection}
 * @param element The element to find
 * @param fromIndex The inclusive starting index
 * @param toIndex The exclusive ending index
 * @returns {NullOr<number>} The index associated to the {@link element} within the range or <b>null</b>
 * @see ReadonlyArray.indexOf
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index-of.html Kotlin indexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item)
 *
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function indexOf<const T, >(collection: Nullable<CollectionHolder<T>>, element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number>
/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection the {@link Nullable nullable} {@link CollectionHolder collection}
 * @param element The element to find
 * @param fromIndex The inclusive starting index
 * @param toIndex The exclusive ending index
 * @returns {NullOr<number>} The index associated to the {@link element} within the range or <b>null</b>
 * @see ReadonlyArray.indexOf
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index-of.html Kotlin indexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item)
 *
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function indexOf(collection: Nullable<CollectionHolder>, element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number>
export function indexOf(collection: Nullable<CollectionHolder>, element: unknown, fromIndex: Nullable<number> = null, toIndex: Nullable<number> = null,): NullOr<number> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    const size = collection.size

    const startingIndex = startingIndexFunction(collection, fromIndex, size,)
    if (startingIndex == null)
        return null

    const endingIndex = endingIndexFunction(collection, toIndex, size,)
    if (endingIndex == null)
        return null

    if (endingIndex < startingIndex)
        return null

    let index = startingIndex - 1
    while (++index < endingIndex)
        if (collection.get(index,) === element)
            return index
    return null
}
