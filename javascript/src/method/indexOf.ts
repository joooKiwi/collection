/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {Nullable, NullOr} from "../general type"

import {endingIndex as endingIndexFunction}     from "./endingIndex"
import {startingIndex as startingIndexFunction} from "./startingIndex"
import {amountOfItem as amountOfItemFunction}   from "./amountOfItem"

/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection the {@link Nullable nullable} {@link CollectionHolder collection}
 * @param element The element to find
 * @param fromIndex The inclusive starting index
 * @param toIndex The inclusive ending index
 * @param limit The maximum amount of elements
 * @returns {NullOr<number>} The index associated to the {@link element} within the range or <b>null</b>
 * @throws {RangeError} The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @see ReadonlyArray.indexOf
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index-of.html Kotlin indexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item)
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function indexOf<const T, >(collection: Nullable<CollectionHolder<T>>, element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection the {@link Nullable nullable} {@link CollectionHolder collection}
 * @param element The element to find
 * @param fromIndex The inclusive starting index
 * @param toIndex The inclusive ending index
 * @param limit The maximum amount of elements
 * @returns {NullOr<number>} The index associated to the {@link element} within the range or <b>null</b>
 * @throws {RangeError} The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @see ReadonlyArray.indexOf
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index-of.html Kotlin indexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item)
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function indexOf<const T, >(collection: Nullable<CollectionHolder<T>>, element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
export function indexOf(collection: Nullable<CollectionHolder>, element: unknown, fromIndex: Nullable<number> = null, toIndex: Nullable<number> = null, limit: Nullable<number> = null,): NullOr<number> {
    //#region -------------------- Early returns --------------------

    if (collection == null)
        return null
    if (collection.isEmpty)
        return null
    if (fromIndex === 0 && toIndex === 0)
        return null
    if (limit === 0)
        return null

    //#endregion -------------------- Early returns --------------------
    //#region -------------------- Initialization (starting/ending index) --------------------

    const size = collection.size

    const startingIndex = startingIndexFunction(collection, fromIndex, size,)
    if (startingIndex == null)
        return null

    const endingIndex = endingIndexFunction(collection, toIndex, size,)
    if (endingIndex == null)
        return null

    if (endingIndex < startingIndex)
        return null

    //#endregion -------------------- Initialization (starting/ending index) --------------------
    //#region -------------------- Return index --------------------

    if (limit == null)
        return withoutALimit(collection, element, startingIndex, endingIndex,)

    const amountOfItem = amountOfItemFunction(collection, limit, size,)
    if (amountOfItem == size)
        return withoutALimit(collection, element, startingIndex, endingIndex,)

    if (amountOfItem == null)
        return null
    if (endingIndex - startingIndex < amountOfItem - 1)
        return null

    return withALimit(collection, element, startingIndex, endingIndex, amountOfItem,)

    //#endregion -------------------- Return index --------------------
}

function withoutALimit(collection: CollectionHolder, element: unknown, startingIndex: number, endingIndex: number,): NullOr<number> {
    let index = startingIndex - 1
    while (++index < endingIndex)
        if (collection.get(index,) === element)
            return index
    return null
}

function withALimit(collection: CollectionHolder, element: unknown, startingIndex: number, endingIndex: number, amountOfItem: number,): NullOr<number> {
    let index = startingIndex - 1
    while (++index < endingIndex)
        if (index >= amountOfItem)
            return null
        else if (collection.get(index,) === element)
            return index
    return null
}
