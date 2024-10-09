/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullOrNumber} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {ReverseBooleanCallback}     from "../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {__endingIndex, __startingIndex} from "./_indexes utility"
import {isArray}                        from "./isArray"
import {isArrayByStructure}             from "./isArrayByStructure"
import {isCollectionHolder}             from "./isCollectionHolder"
import {isCollectionHolderByStructure}  from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get the last index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {NullOrNumber} The index matching the {@link predicate} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastIndexed<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: ReverseBooleanCallback<T>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (isCollectionHolder<T>(collection,))
        return indexOfLastIndexedByCollectionHolder(collection, predicate, fromIndex, toIndex,)
    if (isArray(collection,))
        return indexOfLastIndexedByArray(collection, predicate, fromIndex, toIndex,)
    if (isCollectionHolderByStructure<T>(collection,))
        return indexOfLastIndexedByCollectionHolder(collection, predicate, fromIndex, toIndex,)
    if (isArrayByStructure<T>(collection,))
        return indexOfLastIndexedByArray(collection, predicate, fromIndex, toIndex,)
    return indexOfLastIndexedByMinimalistCollectionHolder(collection, predicate, fromIndex, toIndex,)
}


/**
 * Get the last index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {NullOrNumber} The index matching the {@link predicate} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastIndexedByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null

    const size = collection.size
    if (size === 0)
        return null

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        return null
    if (predicate.length == 1)
        return __with1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, startingIndex, endingIndex,)
    return __with0Argument(predicate as () => boolean, startingIndex, endingIndex,)
}

/**
 * Get the last index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {NullOrNumber} The index matching the {@link predicate} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    const size = collection.size
    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        return null
    if (predicate.length == 1)
        return __with1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, startingIndex, endingIndex,)
    return __with0Argument(predicate as () => boolean, startingIndex, endingIndex,)
}

/**
 * Get the last index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {NullOrNumber} The index matching the {@link predicate} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastIndexedByArray<const T, >(collection: Nullable<readonly T[]>, predicate: ReverseBooleanCallback<T>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null

    const size = collection.length
    if (size === 0)
        return null

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        return null
    if (predicate.length == 1)
        return __with1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex,)
    if (predicate.length >= 2)
        return __with2ArgumentByArray(collection, predicate, startingIndex, endingIndex,)
    return __with0Argument(predicate as () => boolean, startingIndex, endingIndex,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument(predicate: () => boolean, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate())
            return index
    return null
}


function __with1Argument(predicate: (index: number,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate(index,))
            return index
    return null
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (index: number, value: T,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate(index, collection.get(index,),))
            return index
    return null
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], predicate: (index: number, value: T,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate(index, collection[index] as T,))
            return index
    return null
}

//#endregion -------------------- Loop methods --------------------
