/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullOrNumber} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {ReverseBooleanCallback}     from "../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {__endingIndex, __maximumIndex, __startingIndex} from "./_indexes utility"
import {isCollectionHolder}                             from "./isCollectionHolder"
import {isCollectionHolderByStructure}                  from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get the first index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param predicate  The given predicate
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOrNumber} The index matching the {@link predicate} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.findIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfFirstIndexed<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null, limit: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (isCollectionHolder<T>(collection,))
        return indexOfFirstIndexedByCollectionHolder(collection, predicate, fromIndex, toIndex, limit,)
    if (isCollectionHolderByStructure<T>(collection,))
        return indexOfFirstIndexedByCollectionHolder(collection, predicate, fromIndex, toIndex, limit,)
    return indexOfFirstIndexedByMinimalistCollectionHolder(collection, predicate, fromIndex, toIndex, limit,)
}


/**
 * Get the first index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOrNumber} The index matching the {@link predicate} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.findIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfFirstIndexedByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null, limit: NullableNumber = null,): NullOrNumber {
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

    if (limit == null) {
        if (predicate.length == 1)
            return __withoutALimitAnd1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex,)
        if (predicate.length >= 2)
            return __withoutALimitAnd2Argument(collection, predicate, startingIndex, endingIndex,)
        return __withoutALimitAnd0Argument(predicate as () => boolean, startingIndex, endingIndex,)
    }

    //#region -------------------- Initialization (maximum index) --------------------

    const maximumIndex = __maximumIndex(limit, size,)
    if (maximumIndex == size) {
        if (predicate.length == 1)
            return __withoutALimitAnd1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex,)
        if (predicate.length >= 2)
            return __withoutALimitAnd2Argument(collection, predicate, startingIndex, endingIndex,)
        return __withoutALimitAnd0Argument(predicate as () => boolean, startingIndex, endingIndex,)
    }
    if (endingIndex - startingIndex < maximumIndex - 1)
        return null

    //#endregion -------------------- Initialization (maximum index) --------------------

    if (predicate.length == 1)
        return __withALimitAnd1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex, maximumIndex,)
    if (predicate.length >= 2)
        return __withALimitAnd2Argument(collection, predicate, startingIndex, endingIndex, maximumIndex,)
    return __withALimitAnd0Argument(predicate as () => boolean, startingIndex, endingIndex, maximumIndex,)
}

/**
 * Get the first index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOrNumber} The index matching the {@link predicate} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.findIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfFirstIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null, limit: NullableNumber = null,): NullOrNumber {
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

    if (limit == null) {
        if (predicate.length == 1)
            return __withoutALimitAnd1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex,)
        if (predicate.length >= 2)
            return __withoutALimitAnd2Argument(collection, predicate, startingIndex, endingIndex,)
        return __withoutALimitAnd0Argument(predicate as () => boolean, startingIndex, endingIndex,)
    }

    //#region -------------------- Initialization (maximum index) --------------------

    const maximumIndex = __maximumIndex(limit, size,)
    if (maximumIndex == size) {
        if (predicate.length == 1)
            return __withoutALimitAnd1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex,)
        if (predicate.length >= 2)
            return __withoutALimitAnd2Argument(collection, predicate, startingIndex, endingIndex,)
        return __withoutALimitAnd0Argument(predicate as () => boolean, startingIndex, endingIndex,)
    }
    if (endingIndex - startingIndex < maximumIndex - 1)
        return null

    //#endregion -------------------- Initialization (maximum index) --------------------

    if (predicate.length == 1)
        return __withALimitAnd1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex, maximumIndex,)
    if (predicate.length >= 2)
        return __withALimitAnd2Argument(collection, predicate, startingIndex, endingIndex, maximumIndex,)
    return __withALimitAnd0Argument(predicate as () => boolean, startingIndex, endingIndex, maximumIndex,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __withoutALimitAnd0Argument(predicate: () => boolean, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (predicate())
            return index
    return null
}

function __withoutALimitAnd1Argument(predicate: (index: number,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (predicate(index,))
            return index
    return null
}

function __withoutALimitAnd2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (index: number, value: T,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (predicate(index, collection.get(index,),))
            return index
    return null
}


function __withALimitAnd0Argument(predicate: () => boolean, startingIndex: number, endingIndex: number, maximumIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (index >= maximumIndex)
            return null
        else if (predicate())
            return index
    return null
}

function __withALimitAnd1Argument(predicate: (index: number,) => boolean, startingIndex: number, endingIndex: number, maximumIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (index >= maximumIndex)
            return null
        else if (predicate(index,))
            return index
    return null
}

function __withALimitAnd2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (index: number, value: T,) => boolean, startingIndex: number, endingIndex: number, maximumIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (index >= maximumIndex)
            return null
        else if (predicate(index, collection.get(index,),))
            return index
    return null
}

//#endregion -------------------- Loop methods --------------------
