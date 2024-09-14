/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullOrNumber} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {__endingIndex, __maximumIndex, __startingIndex} from "./_indexes utility"
import {isCollectionHolder}                             from "./isCollectionHolder"
import {isCollectionHolderByStructure}                  from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOf<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 * @deprecated Use a value that is present in the {@link collection} instead
 */
export function lastIndexOf<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
export function lastIndexOf<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null, limit: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (isCollectionHolder<T>(collection,))
        return lastIndexOfByCollectionHolder(collection, element, fromIndex, toIndex, limit,)
    if (isCollectionHolderByStructure<T>(collection,))
        return lastIndexOfByCollectionHolder(collection, element, fromIndex, toIndex, limit,)
    return lastIndexOfByMinimalistCollectionHolder(collection, element, fromIndex, toIndex, limit,)
}


/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOfByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 * @deprecated Use a value that is present in the {@link collection} instead
 */
export function lastIndexOfByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
export function lastIndexOfByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null, limit: NullableNumber = null,): NullOrNumber {
    //#region -------------------- Early returns --------------------

    if (collection == null)
        return null

    const size = collection.size
    if (size == 0)
        return null
    if (fromIndex === 0 && toIndex === 0)
        return null
    if (limit === 0)
        return null

    //#endregion -------------------- Early returns --------------------
    //#region -------------------- Initialization (starting/ending index) --------------------

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        return null

    //#endregion -------------------- Initialization (starting/ending index) --------------------

    if (limit == null)
        return __withoutALimit(collection, element, startingIndex, endingIndex,)

    //#region -------------------- Initialization (maximum index) --------------------

    const maximumIndex = __maximumIndex(limit, size,)
    if (maximumIndex == size)
        return __withoutALimit(collection, element, startingIndex, endingIndex,)
    if (endingIndex - startingIndex < maximumIndex - 1)
        return null

    //#endregion -------------------- Initialization (maximum index) --------------------

    return __withALimit(collection, element, startingIndex, endingIndex, maximumIndex,)
}

/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOfByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 * @deprecated Use a value that is present in the {@link collection} instead
 */
export function lastIndexOfByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
export function lastIndexOfByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null, limit: NullableNumber = null,): NullOrNumber {
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

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        return null

    //#endregion -------------------- Initialization (starting/ending index) --------------------

    if (limit == null)
        return __withoutALimit(collection, element, startingIndex, endingIndex,)

    //#region -------------------- Initialization (maximum index) --------------------

    const maximumIndex = __maximumIndex(limit, size,)
    if (maximumIndex == size)
        return __withoutALimit(collection, element, startingIndex, endingIndex,)
    if (endingIndex - startingIndex < maximumIndex - 1)
        return null

    //#endregion -------------------- Initialization (maximum index) --------------------

    return __withALimit(collection, element, startingIndex, endingIndex, maximumIndex,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __withoutALimit<const T, >(collection: MinimalistCollectionHolder<T>, element: T, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (collection.get(index,) === element)
            return index
    return null
}

function __withALimit<const T, >(collection: MinimalistCollectionHolder<T>, element: T, startingIndex: number, endingIndex: number, maximumIndex: number,) {
    let index = endingIndex + 1
    if (index >= maximumIndex)
        index = maximumIndex
    while (--index >= startingIndex)
        if (collection.get(index,) === element)
            return index
    return null
}

//#endregion -------------------- Loop methods --------------------
