/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}         from "../CollectionHolder"
import type {NonEmptyCollectionHolder} from "../NonEmptyCollectionHolder"
import type {Nullable, NullOr}         from "../general type"

import {endingIndex as endingIndexFunction}     from "./endingIndex"
import {maximumIndex as maximumIndexFunction}   from "./maximumIndex"
import {startingIndex as startingIndexFunction} from "./startingIndex"

//#region -------------------- Facade method --------------------

/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the current {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOr<number>} The index associated to the {@link element} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOf<const T, >(collection: Nullable<CollectionHolder<T>>, element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the current {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOr<number>} The index associated to the {@link element} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOf<const T, >(collection: Nullable<CollectionHolder<T>>, element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
export function lastIndexOf(collection: Nullable<CollectionHolder>, element: unknown, fromIndex: Nullable<number> = null, toIndex: Nullable<number> = null, limit: Nullable<number> = null,): NullOr<number> {
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

    if (limit == null)
        return __withoutALimit(collection as NonEmptyCollectionHolder, element, startingIndex, endingIndex,)

    //#region -------------------- Initialization (maximum index) --------------------

    const maximumIndex = maximumIndexFunction(collection, limit, size,)
    if (maximumIndex == null)
        return null
    if (maximumIndex == size)
        return __withoutALimit(collection as NonEmptyCollectionHolder, element, startingIndex, endingIndex,)
    if (endingIndex - startingIndex < maximumIndex - 1)
        return null

    //#endregion -------------------- Initialization (maximum index) --------------------

    return __withALimit(collection as NonEmptyCollectionHolder, element, startingIndex, endingIndex, maximumIndex,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __withoutALimit(collection: NonEmptyCollectionHolder, element: unknown, startingIndex: number, endingIndex: number,): NullOr<number> {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (collection.get(index,) === element)
            return index
    return null
}

function __withALimit(collection: NonEmptyCollectionHolder, element: unknown, startingIndex: number, endingIndex: number, maximumIndex: number,): NullOr<number> {
    let index = endingIndex + 1
    if (index >= maximumIndex)
        index = maximumIndex
    while (--index >= startingIndex)
        if (collection.get(index,) === element)
            return index
    return null
}

//#endregion -------------------- Loop methods --------------------
