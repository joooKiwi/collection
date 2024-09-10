/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber} from "@joookiwi/type"

import type {CollectionHolder} from "../../CollectionHolder"

import {CollectionConstants}                            from "../../CollectionConstants"
import {CollectionHolderIndexOutOfBoundsException}      from "../../exception/CollectionHolderIndexOutOfBoundsException"
import {CollectionHolderRangeIndexOutOfBoundException}  from "../../exception/CollectionHolderRangeIndexOutOfBoundException"
import {__endingIndex, __maximumIndex, __startingIndex} from "../_indexes utility"
import {__withALimit, __withoutALimit}                  from "../toReverse"

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
 */
export function toReverse<const T, >(collection: Nullable<CollectionHolder<T>>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null, limit: NullableNumber = null,): CollectionHolder<T> {
    //#region -------------------- Early returns --------------------

    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (fromIndex === 0 && toIndex === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (limit === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    //#endregion -------------------- Early returns --------------------
    //#region -------------------- Initialization (starting/ending index) --------------------

    const size = collection.size
    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)

    if (endingIndex < startingIndex)
        throw new CollectionHolderRangeIndexOutOfBoundException(`Range index out of bound. The ending index "${toIndex}"${(toIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`)} is over the starting index "${fromIndex}"${fromIndex == startingIndex ? "" : ` ("${startingIndex}" after calculation)`}.`, fromIndex, toIndex,)

    //#endregion -------------------- Initialization (starting/ending index) --------------------

    if (limit == null)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __withoutALimit(collection, startingIndex, endingIndex,),)

    //#region -------------------- Initialization (maximum index) --------------------

    const maximumIndex = __maximumIndex(limit, size,)
    if (maximumIndex == size)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __withoutALimit(collection, startingIndex, endingIndex,),)
    if (endingIndex - startingIndex < maximumIndex - 1)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The limit "${limit}"${limit == maximumIndex ? "" : `("${maximumIndex}" after calculation)`} cannot be applied within the range "${fromIndex ?? ""}"${fromIndex == startingIndex ? "" : `("${startingIndex}" after calculation)`} to "${toIndex ?? ""}"${toIndex == endingIndex ? "" : `("${endingIndex}" after calculation)`}`, limit,)

    //#endregion -------------------- Initialization (maximum index) --------------------

    return new CollectionConstants.LazyGenericCollectionHolder(() => __withALimit(collection, startingIndex, endingIndex, maximumIndex,),)
}
