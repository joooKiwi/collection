/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "../exception/EmptyCollectionHolderException"
import {InvalidIndexRangeException}                from "../exception/InvalidIndexRangeException"
import {NullCollectionHolderException}             from "../exception/NullCollectionHolderException"
import {__endingIndex, __startingIndex}            from "./_indexes utility"
import {isArray}                                   from "./isArray"
import {isArrayByStructure}                        from "./isArrayByStructure"
import {isCollectionHolder}                        from "./isCollectionHolder"
import {isCollectionHolderByStructure}             from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {number} The index associated to the {@link element} within the range
 * @throws NullCollectionHolderException             The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} <b>is empty</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws CollectionHolderIndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see ReadonlyArray.indexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, fromIndex?, toIndex?)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function firstIndexOf<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): number {
    if (collection == null)
        throw new NullCollectionHolderException()
    if (isCollectionHolder<T>(collection,))
        return firstIndexOfByCollectionHolder(collection, element, fromIndex, toIndex,)
    if (isArray(collection,))
        return firstIndexOfByArray(collection, element, fromIndex, toIndex,)
    if (isCollectionHolderByStructure<T>(collection,))
        return firstIndexOfByCollectionHolder(collection, element, fromIndex, toIndex,)
    if (isArrayByStructure<T>(collection,))
        return firstIndexOfByArray(collection, element, fromIndex, toIndex,)
    return firstIndexOfByMinimalistCollectionHolder(collection, element, fromIndex, toIndex,)
}


/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {number} The index associated to the {@link element} within the range
 * @throws NullCollectionHolderException             The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} <b>is empty</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws CollectionHolderIndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see ReadonlyArray.indexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, fromIndex?, toIndex?)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function firstIndexOfByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): number {
    if (collection == null)
        throw new NullCollectionHolderException()

    const size = collection.size
    if (size === 0)
        throw new EmptyCollectionHolderException()

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index "${toIndex}"${toIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`} is over the starting index "${fromIndex}"${fromIndex == startingIndex ? "" : `("${startingIndex}" after calculation)`}.`, fromIndex, toIndex,)
    return __findInRange(collection, element, startingIndex, endingIndex,)
}

/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {number} The index associated to the {@link element} within the range
 * @throws NullCollectionHolderException             The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws CollectionHolderIndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see ReadonlyArray.indexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, fromIndex?, toIndex?)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function firstIndexOfByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): number {
    if (collection == null)
        throw new NullCollectionHolderException()
    if (collection.isEmpty)
        throw new EmptyCollectionHolderException()

    const size = collection.size
    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index "${toIndex}"${toIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`} is over the starting index "${fromIndex}"${fromIndex == startingIndex ? "" : `("${startingIndex}" after calculation)`}.`, fromIndex, toIndex,)
    return __findInRange(collection, element, startingIndex, endingIndex,)
}

/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {number} The index associated to the {@link element} within the range
 * @throws NullCollectionHolderException             The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} <b>is empty</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws CollectionHolderIndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see ReadonlyArray.indexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, fromIndex?, toIndex?)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function firstIndexOfByArray<const T, >(collection: Nullable<readonly T[]>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): number {
    if (collection == null)
        throw new NullCollectionHolderException()

    const size = collection.length
    if (size === 0)
        throw new EmptyCollectionHolderException()

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index "${toIndex}"${toIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`} is over the starting index "${fromIndex}"${fromIndex == startingIndex ? "" : `("${startingIndex}" after calculation)`}.`, fromIndex, toIndex,)
    return __findInRangeByArray(collection, element, startingIndex, endingIndex,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __findInRange<const T, >(collection: MinimalistCollectionHolder<T>, element: T, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (collection.get(index,) === element)
            return index
    throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. No index could be found from the starting (“${startingIndex}”) to the ending (“${endingIndex}”) indexes in the collection.`, index,)
}

function __findInRangeByArray<const T, >(collection: readonly T[], element: T, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (collection[index] === element)
            return index
    throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. No index could be found from the starting (“${startingIndex}”) to the ending (“${endingIndex}”) indexes in the collection.`, index,)
}

//#endregion -------------------- Loop methods --------------------