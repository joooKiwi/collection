/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}       from "../CollectionHolder"
import type {ReverseBooleanCallback} from "../CollectionHolder.types"
import type {Nullable, NullOr}       from "../general type"

import {endingIndex as endingIndexFunction}     from "./endingIndex"
import {startingIndex as startingIndexFunction} from "./startingIndex"

/**
 * Get the first index matching the {@link predicate}
 * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate The given predicate
 * @param fromIndex The inclusive starting index
 * @param toIndex The exclusive ending index
 * @returns {NullOr<number>} The index matching the {@link predicate} within the range or <b>null</b>
 * @see ReadonlyArray.findIndex
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
 *
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function indexOfFirstIndexed<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>, fromIndex: Nullable<number> = null, toIndex: Nullable<number> = null,): NullOr<number> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    const size = collection.size

    const startingIndex = startingIndexFunction(collection, fromIndex, size,)
    if (startingIndex == null)
        return null

    const endingIndex = endingIndexFunction(collection, toIndex, size,)
    if (endingIndex == null)
        return null

    if (endingIndex < startingIndex)
        return null

    let index = startingIndex - 1
    while (++index < size)
        if (predicate(index, collection.get(index,),))
            return index
    return null
}
