//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Nullable, NullableNumber} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {EmptyCollectionException}       from "../exception/EmptyCollectionException"
import {IndexOutOfBoundsException}      from "../exception/IndexOutOfBoundsException"
import {InvalidIndexRangeException}     from "../exception/InvalidIndexRangeException"
import {NullCollectionException}        from "../exception/NullCollectionException"
import {__endingIndex, __startingIndex} from "./_indexes utility"
import {isArray}                        from "./isArray"
import {isArrayByStructure}             from "./isArrayByStructure"
import {isCollectionHolder}             from "./isCollectionHolder"
import {isCollectionHolderByStructure}  from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {number} The index associated to the {@link element} within the range or <b>null</b>
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws IndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOf<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): number {
    if (collection == null)
        throw new NullCollectionException()
    if (isCollectionHolder<T>(collection,))
        return lastIndexOfByCollectionHolder(collection, element, fromIndex, toIndex,)
    if (isArray(collection,))
        return lastIndexOfByArray(collection, element, fromIndex, toIndex,)
    if (isCollectionHolderByStructure<T>(collection,))
        return lastIndexOfByCollectionHolder(collection, element, fromIndex, toIndex,)
    if (isArrayByStructure<T>(collection,))
        return lastIndexOfByArray(collection, element, fromIndex, toIndex,)
    return lastIndexOfByMinimalistCollectionHolder(collection, element, fromIndex, toIndex,)
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
 * @return {number} The index associated to the {@link element} within the range or <b>null</b>
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws IndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOfByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): number {
    if (collection == null)
        throw new NullCollectionException()

    const size = collection.size
    if (size === 0)
        throw new EmptyCollectionException()

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index "${toIndex}"${toIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`} is over the starting index "${fromIndex}"${fromIndex == startingIndex ? "" : `("${startingIndex}" after calculation)`}.`, fromIndex, toIndex,)
    return __findLastInRange(collection, element, startingIndex, endingIndex,)
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
 * @return {number} The index associated to the {@link element} within the range or <b>null</b>
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws IndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOfByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): number {
    if (collection == null)
        throw new NullCollectionException()
    if (collection.isEmpty)
        throw new EmptyCollectionException()

    const size = collection.size
    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index "${toIndex}"${toIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`} is over the starting index "${fromIndex}"${fromIndex == startingIndex ? "" : `("${startingIndex}" after calculation)`}.`, fromIndex, toIndex,)
    return __findLastInRange(collection, element, startingIndex, endingIndex,)
}

/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {number} The index associated to the {@link element} within the range or <b>null</b>
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws IndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOfByArray<const T, >(collection: Nullable<readonly T[]>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): number {
    if (collection == null)
        throw new NullCollectionException()

    const size = collection.length
    if (size === 0)
        throw new EmptyCollectionException()

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index "${toIndex}"${toIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`} is over the starting index "${fromIndex}"${fromIndex == startingIndex ? "" : `("${startingIndex}" after calculation)`}.`, fromIndex, toIndex,)
    return __findLastInRangeByArray(collection, element, startingIndex, endingIndex,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __findLastInRange<const T, >(collection: MinimalistCollectionHolder<T>, element: T, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (collection.get(index,) === element)
            return index
    throw new IndexOutOfBoundsException(`Index out of bound. No index could be found from the starting (“${startingIndex}”) to the ending (“${endingIndex}”) indexes in the collection.`, index,)
}

function __findLastInRangeByArray<const T, >(collection: readonly T[], element: T, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (collection[index] === element)
            return index
    throw new IndexOutOfBoundsException(`Index out of bound. No index could be found from the starting (“${startingIndex}”) to the ending (“${endingIndex}”) indexes in the collection.`, index,)
}

//#endregion -------------------- Loop methods --------------------
