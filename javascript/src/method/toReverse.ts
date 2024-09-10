/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}                       from "../CollectionConstants"
import {isCollectionHolder}                        from "./isCollectionHolder"
import {isCollectionHolderByStructure}             from "./isCollectionHolderByStructure"
import {toReverse as byCollectionHolder}           from "./collectionHolder/toReverse"
import {toReverse as byMinimalistCollectionHolder} from "./minimalistCollectionHolder/toReverse"

//#region -------------------- Facade method --------------------

/**
 * Reverse the {@link collection} from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @throws CollectionHolderIndexOutOfBoundsException     The {@link fromIndex}, {@link toIndex} and {@link limit} are not within the {@link collection} {@link MinimalistCollectionHolder.size size}
 * @throws CollectionHolderRangeIndexOutOfBoundException The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @throws ForbiddenIndexException                       The {@link fromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverse<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null, limit: NullableNumber = null,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return byCollectionHolder(collection, fromIndex, toIndex, limit,)
    if (isCollectionHolderByStructure<T>(collection,))
        return byCollectionHolder(collection, fromIndex, toIndex, limit,)
    return byMinimalistCollectionHolder(collection, fromIndex, toIndex, limit,)
}

/**
 * Reverse the {@link collection} from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @throws CollectionHolderIndexOutOfBoundsException     The {@link fromIndex}, {@link toIndex} and {@link limit} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws CollectionHolderRangeIndexOutOfBoundException The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @throws ForbiddenIndexException                       The {@link fromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 * @deprecated Use toReverse from import("@joookiwi/collection/method/collectionHolder")
 */
export function toReverseByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null, limit: NullableNumber = null,): CollectionHolder<T> {
    return byCollectionHolder(collection, fromIndex, toIndex, limit,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

/** @internal */
export function __withoutALimit<const T, >(collection: MinimalistCollectionHolder<T>, startingIndex: number, endingIndex: number,) {
    const newArray = new Array<T>(endingIndex - startingIndex,)
    let indexAdded = -1
    let index = endingIndex + 1
    while (--index >= startingIndex)
        newArray[++indexAdded] = collection.get(index,)
    return newArray
}

/** @internal */
export function __withALimit<const T, >(collection: MinimalistCollectionHolder<T>, startingIndex: number, endingIndex: number, maximumIndex: number,) {
    const newArray: T[] = []
    let index = endingIndex + 1
    while (--index >= startingIndex) {
        if (newArray.length >= maximumIndex)
            return newArray
        newArray.push(collection.get(index,),)
    }
    return newArray
}

//#endregion -------------------- Loop method --------------------
