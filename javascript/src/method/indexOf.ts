/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullOrNumber} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {__endingIndex, __startingIndex} from "./_indexes utility"
import {isArray}                        from "./isArray"
import {isArrayByStructure}             from "./isArrayByStructure"
import {isCollectionHolder}             from "./isCollectionHolder"
import {isCollectionHolderByStructure}  from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.indexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, fromIndex?, toIndex?)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOf<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (isCollectionHolder<T>(collection,))
        return indexOfByCollectionHolder(collection, element, fromIndex, toIndex,)
    if (isArray(collection,))
        return indexOfByArray(collection, element, fromIndex, toIndex,)
    if (isCollectionHolderByStructure<T>(collection,))
        return indexOfByCollectionHolder(collection, element, fromIndex, toIndex,)
    if (isArrayByStructure<T>(collection,))
        return indexOfByArray(collection, element, fromIndex, toIndex,)
    return indexOfByMinimalistCollectionHolder(collection, element, fromIndex, toIndex,)
}


/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.indexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, fromIndex?, toIndex?)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null

    const size = collection.size
    if (size === 0)
        return null

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        return null
    return __findInRange(collection, element, startingIndex, endingIndex,)
}

/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.indexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, fromIndex?, toIndex?)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    const size = collection.size
    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        return null
    return __findInRange(collection, element, startingIndex, endingIndex,)
}

/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.indexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, fromIndex?, toIndex?)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfByArray<const T, >(collection: Nullable<readonly T[]>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null

    const size = collection.length
    if (size === 0)
        return null

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        return null
    return __findInRangeByArray(collection, element, startingIndex, endingIndex,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __findInRange<const T, >(collection: MinimalistCollectionHolder<T>, element: T, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (collection.get(index,) === element)
            return index
    return null
}

function __findInRangeByArray<const T, >(collection: readonly T[], element: T, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (collection[index] === element)
            return index
    return null
}

//#endregion -------------------- Loop methods --------------------
