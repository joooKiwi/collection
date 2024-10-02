/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}            from "../CollectionConstants"
import {InvalidIndexRangeException}     from "../exception/InvalidIndexRangeException"
import {__endingIndex, __startingIndex} from "./_indexes utility"
import {isArray}                        from "./isArray"
import {isArrayByStructure}             from "./isArrayByStructure"
import {isCollectionHolder}             from "./isCollectionHolder"
import {isCollectionHolderByStructure}  from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Reverse to a new {@link CollectionHolder}
 * from the {@link toIndex ending} to the {@link fromIndex starting} index
 * in the {@link collection}.
 *
 * If the {@link MinimalistCollectionHolder.size size} is 1 (<i>with valid indexes</i>),
 * then the {@link collection} is returned.
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) to reverse
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverse<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
/**
 * Reverse to a new {@link CollectionHolder}
 * from the {@link toIndex ending} to the {@link fromIndex starting} index
 * in the {@link collection}.
 *
 * If the {@link MinimalistCollectionHolder.size size} is 1 (<i>with valid indexes</i>),
 * then the {@link collection} is returned.
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) to reverse
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The never used limit
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @deprecated Remove the {@link limit} or use {@link CollectionHolder.drop} or {@link CollectionHolder.takeLast} instead. This will be removed in version 1.11
 * @canReceiveNegativeValue
 */
export function toReverse<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
export function toReverse<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return toReverseByCollectionHolder(collection, fromIndex, toIndex,)
    if (isArray(collection,))
        return toReverseByArray(collection, fromIndex, toIndex,)
    if (isCollectionHolderByStructure<T>(collection,))
        return toReverseByCollectionHolder(collection, fromIndex, toIndex,)
    if (isArrayByStructure<T>(collection,))
        return toReverseByArray(collection, fromIndex, toIndex,)
    return toReverseByMinimalistCollectionHolder(collection, fromIndex, toIndex,)
}


/**
 * Reverse to a new {@link CollectionHolder}
 * from the {@link toIndex ending} to the {@link fromIndex starting} index
 * in the {@link collection}.
 *
 * If the {@link MinimalistCollectionHolder.size size} is 1 (<i>with valid indexes</i>),
 * then the {@link collection} is returned.
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to reverse
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverseByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
/**
 * Reverse to a new {@link CollectionHolder}
 * from the {@link toIndex ending} to the {@link fromIndex starting} index
 * in the {@link collection}.
 *
 * If the {@link MinimalistCollectionHolder.size size} is 1 (<i>with valid indexes</i>),
 * then the {@link collection} is returned.
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to reverse
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The never used limit
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @deprecated Remove the {@link limit} or use {@link CollectionHolder.drop} or {@link CollectionHolder.takeLast} instead. This will be removed in version 1.11
 * @canReceiveNegativeValue
 */
export function toReverseByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
export function toReverseByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index "${toIndex}"${toIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`} is over the starting index "${fromIndex}"${fromIndex == startingIndex ? "" : ` ("${startingIndex}" after calculation)`}.`, fromIndex, toIndex,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRange(collection, startingIndex, endingIndex,),)
}

/**
 * Reverse to a new {@link CollectionHolder}
 * from the {@link toIndex ending} to the {@link fromIndex starting} index
 * in the {@link collection}.
 *
 * If the {@link CollectionHolder.size size} is 1 (<i>with valid indexes</i>),
 * then the {@link collection} is returned.
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to reverse
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverseByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
/**
 * Reverse to a new {@link CollectionHolder}
 * from the {@link toIndex ending} to the {@link fromIndex starting} index
 * in the {@link collection}.
 *
 * If the {@link CollectionHolder.size size} is 1 (<i>with valid indexes</i>),
 * then the {@link collection} is returned.
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to reverse
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The never used limit
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @deprecated Remove the {@link limit} or use {@link CollectionHolder.drop} or {@link CollectionHolder.takeLast} instead. This will be removed in version 1.11
 * @canReceiveNegativeValue
 */
export function toReverseByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
export function toReverseByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size == 1)
        if (fromIndex == toIndex)
            return collection

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index "${toIndex}"${toIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`} is over the starting index "${fromIndex}"${fromIndex == startingIndex ? "" : ` ("${startingIndex}" after calculation)`}.`, fromIndex, toIndex,)
    if (size == 1)
        if (startingIndex == endingIndex)
            return collection
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRange(collection, startingIndex, endingIndex,),)
}

/**
 * Reverse to a new {@link CollectionHolder}
 * from the {@link toIndex ending} to the {@link fromIndex starting} index
 * in the {@link collection}.
 *
 * If the {@link ReadonlyArray.length size} is 1 (<i>with valid indexes</i>),
 * then the {@link collection} is returned.
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection} to reverse
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverseByArray<const T, >(collection: Nullable<readonly T[]>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.length
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index "${toIndex}"${toIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`} is over the starting index "${fromIndex}"${fromIndex == startingIndex ? "" : ` ("${startingIndex}" after calculation)`}.`, fromIndex, toIndex,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRangeByArray(collection, startingIndex, endingIndex,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

function __newReverseArrayByRange<const T, >(collection: MinimalistCollectionHolder<T>, startingIndex: number, endingIndex: number,) {
    const newArray = new Array<T>(endingIndex - startingIndex,)
    let indexAdded = -1
    let index = endingIndex + 1
    while (--index >= startingIndex)
        newArray[++indexAdded] = collection.get(index,)
    return newArray
}

function __newReverseArrayByRangeByArray<const T, >(collection: readonly T[], startingIndex: number, endingIndex: number,) {
    const newArray = new Array<T>(endingIndex - startingIndex,)
    let indexAdded = -1
    let index = endingIndex + 1
    while (--index >= startingIndex)
        newArray[++indexAdded] = collection[index] as T
    return newArray
}

//#endregion -------------------- Loop method --------------------
