/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {ReverseBooleanCallback}             from "../CollectionHolder.types"
import type {Nullable, NullOr}                   from "../general type"
import type {MinimalistCollectionHolder}         from "../MinimalistCollectionHolder"
import type {NonEmptyMinimalistCollectionHolder} from "../NonEmptyMinimalistCollectionHolder"

import {endingIndex as endingIndexFunction}     from "./endingIndex"
import {maximumIndex as maximumIndexFunction}   from "./maximumIndex"
import {startingIndex as startingIndexFunction} from "./startingIndex"

//#region -------------------- Facade method --------------------

/**
 * Get the last index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOr<number>} The index matching the {@link predicate} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastIndexed<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>, fromIndex: Nullable<number> = null, toIndex: Nullable<number> = null, limit: Nullable<number> = null,): NullOr<number> {
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

    if (limit == null) {
        if (predicate.length == 1)
            return __withoutALimitAnd1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex,)
        if (predicate.length >= 2)
            return __withoutALimitAnd2Argument(collection as NonEmptyMinimalistCollectionHolder<T>, predicate, startingIndex, endingIndex,)
        return __withoutALimitAnd0Argument(predicate as () => boolean, startingIndex, endingIndex,)
    }

    //#region -------------------- Initialization (maximum index) --------------------

    const maximumIndex = maximumIndexFunction(collection, limit, size,)
    if (maximumIndex == null)
        return null
    if (maximumIndex == size) {
        if (predicate.length == 1)
            return __withoutALimitAnd1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex,)
        if (predicate.length >= 2)
            return __withoutALimitAnd2Argument(collection as NonEmptyMinimalistCollectionHolder<T>, predicate, startingIndex, endingIndex,)
        return __withoutALimitAnd0Argument(predicate as () => boolean, startingIndex, endingIndex,)
    }
    if (endingIndex - startingIndex < maximumIndex - 1)
        return null

    //#endregion -------------------- Initialization (maximum index) --------------------

    if (predicate.length == 1)
        return __withALimitAnd1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex, maximumIndex,)
    if (predicate.length >= 2)
        return __withALimitAnd2Argument(collection as NonEmptyMinimalistCollectionHolder<T>, predicate, startingIndex, endingIndex, maximumIndex,)
    return __withALimitAnd0Argument(predicate as () => boolean, startingIndex, endingIndex, maximumIndex,)

    //#endregion -------------------- Return index --------------------
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __withoutALimitAnd0Argument(predicate: () => boolean, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate())
            return index
    return null
}

function __withoutALimitAnd1Argument(predicate: (index: number,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate(index,))
            return index
    return null
}

function __withoutALimitAnd2Argument<const T, >(collection: NonEmptyMinimalistCollectionHolder<T>, predicate: (index: number, value: T,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate(index, collection.get(index,),))
            return index
    return null
}


function __withALimitAnd0Argument(predicate: () => boolean, startingIndex: number, endingIndex: number, maximumIndex: number,) {
    let index = endingIndex + 1
    if (index >= maximumIndex)
        index = maximumIndex
    while (--index >= startingIndex)
        if (predicate())
            return index
    return null
}

function __withALimitAnd1Argument(predicate: (index: number,) => boolean, startingIndex: number, endingIndex: number, maximumIndex: number,) {
    let index = endingIndex + 1
    if (index >= maximumIndex)
        index = maximumIndex
    while (--index >= startingIndex)
        if (predicate(index,))
            return index
    return null
}

function __withALimitAnd2Argument<const T, >(collection: NonEmptyMinimalistCollectionHolder<T>, predicate: (index: number, value: T,) => boolean, startingIndex: number, endingIndex: number, maximumIndex: number,) {
    let index = endingIndex + 1
    if (index >= maximumIndex)
        index = maximumIndex
    while (--index >= startingIndex)
        if (predicate(index, collection.get(index,),))
            return index
    return null
}

//#endregion -------------------- Loop methods --------------------
