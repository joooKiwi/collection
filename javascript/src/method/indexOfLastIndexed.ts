/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}       from "../CollectionHolder"
import type {ReverseBooleanCallback} from "../CollectionHolder.types"
import type {Nullable, NullOr}       from "../general type"

import {endingIndex as endingIndexFunction}     from "./endingIndex"
import {maximumIndex as maximumIndexFunction}   from "./maximumIndex"
import {startingIndex as startingIndexFunction} from "./startingIndex"

/**
 * Get the last index matching the {@link predicate}
 * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate The given predicate
 * @param fromIndex The inclusive starting index
 * @param toIndex The inclusive ending index
 * @param limit The maximum index
 * @returns {NullOr<number>} The index matching the {@link predicate} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function indexOfLastIndexed<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>, fromIndex: Nullable<number> = null, toIndex: Nullable<number> = null, limit: Nullable<number> = null,): NullOr<number> {
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
        return withoutALimit(collection, predicate, startingIndex, endingIndex,)

    const maximumIndex = maximumIndexFunction(collection, limit, size,)
    if (maximumIndex == size)
        return withoutALimit(collection, predicate, startingIndex, endingIndex,)

    if (maximumIndex == null)
        return null
    if (endingIndex - startingIndex < maximumIndex - 1)
        return null

    return withALimit(collection, predicate, startingIndex, endingIndex, maximumIndex,)

    //#endregion -------------------- Return index --------------------
}

function withoutALimit<const T, >(collection: CollectionHolder<T>, predicate: ReverseBooleanCallback<T>, startingIndex: number, endingIndex: number,): NullOr<number> {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate(index, collection.get(index,),))
            return index
    return null
}

function withALimit<const T, >(collection: CollectionHolder<T>, predicate: ReverseBooleanCallback<T>, startingIndex: number, endingIndex: number, maximumIndex: number,): NullOr<number> {
    let index = endingIndex + 1
    if (index >= maximumIndex)
        index = maximumIndex
    while (--index >= startingIndex)
        if (predicate(index, collection.get(index,),))
            return index
    return null
}
