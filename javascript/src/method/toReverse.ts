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

import {CollectionConstants}            from "../CollectionConstants"
import {InvalidIndexRangeException}     from "../exception/InvalidIndexRangeException"
import {__endingIndex, __startingIndex} from "./_indexes utility"
import {isArray}                        from "./isArray"
import {isArrayByStructure}             from "./isArrayByStructure"
import {isCollectionHolder}             from "./isCollectionHolder"
import {isCollectionHolderByStructure}  from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Reverse the {@link collection} to a new {@link CollectionHolder}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) to reverse
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverse<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>,): CollectionHolder<T>
/**
 * Reverse to a new {@link CollectionHolder}
 * from the start of the {@link collection} to the {@link from starting} index
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) to reverse
 * @param from       The inclusive starting index (`0` by default)
 * @throws IndexOutOfBoundsException  {@link from} is not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException    {@link from} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverse<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, from: NullableNumber,): CollectionHolder<T>
/**
 * Reverse to a new {@link CollectionHolder}
 * from the {@link to ending} to the {@link from starting} index
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) to reverse
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (`size - 1` by default)
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException    {@link from} or {@link to} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverse<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, from: NullableNumber, to: NullableNumber,): CollectionHolder<T>
export function toReverse<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return toReverseByCollectionHolder(collection, from, to,)
    if (isArray(collection,))
        return toReverseByArray(collection, from, to,)
    if (isCollectionHolderByStructure<T>(collection,))
        return toReverseByCollectionHolder(collection, from, to,)
    if (isArrayByStructure<T>(collection,))
        return toReverseByArray(collection, from, to,)
    return toReverseByMinimalistCollectionHolder(collection, from, to,)
}


/**
 * Reverse the {@link collection} to a new {@link CollectionHolder}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to reverse
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverseByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): CollectionHolder<T>
/**
 * Reverse to a new {@link CollectionHolder}
 * from the start of the {@link collection} to the {@link from starting} index
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to reverse
 * @param from       The inclusive starting index (`0` by default)
 * @throws IndexOutOfBoundsException  {@link from} is not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException    {@link from} s a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverseByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, from: NullableNumber,): CollectionHolder<T>
/**
 * Reverse to a new {@link CollectionHolder}
 * from the {@link to ending} to the {@link from starting} index
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to reverse
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link MinimalistCollectionHolder.size size} - 1</code> by default)
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException    {@link from} or {@link to} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverseByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, from: NullableNumber, to: NullableNumber,): CollectionHolder<T>
export function toReverseByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index “${to}”${to == endingIndex ? "" : ` (“${endingIndex}” after calculation)`} is over the starting index “${from}”${from == startingIndex ? "" : ` (“${startingIndex}” after calculation)`}.`, from, to,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRange(collection, startingIndex, endingIndex,),)
}

/**
 * Reverse the {@link collection} to a new {@link CollectionHolder}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to reverse
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverseByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): CollectionHolder<T>
/**
 * Reverse to a new {@link CollectionHolder}
 * from the start of the {@link collection} to the {@link from starting} index
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to reverse
 * @param from       The inclusive starting index (`0` by default)
 * @throws IndexOutOfBoundsException  {@link from} is not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException    {@link from} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverseByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, from: NullableNumber,): CollectionHolder<T>
/**
 * Reverse to a new {@link CollectionHolder}
 * from the {@link to ending} to the {@link from starting} index
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to reverse
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException    {@link from} or {@link to} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverseByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, from: NullableNumber, to: NullableNumber,): CollectionHolder<T>
export function toReverseByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index “${to}”${to == endingIndex ? "" : ` (“${endingIndex}” after calculation)`} is over the starting index “${from}”${from == startingIndex ? "" : ` (“${startingIndex}” after calculation)`}.`, from, to,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRange(collection, startingIndex, endingIndex,),)
}

/**
 * Reverse the {@link collection} to a new {@link CollectionHolder}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection} to reverse
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverseByArray<const T, >(collection: Nullable<readonly T[]>,): CollectionHolder<T>
/**
 * Reverse to a new {@link CollectionHolder}
 * from the start of the {@link collection} to the {@link from starting} index
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection} to reverse
 * @param from       The inclusive starting index (`0` by default)
 * @throws IndexOutOfBoundsException  {@link from} is not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException    {@link from} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverseByArray<const T, >(collection: Nullable<readonly T[]>, from: NullableNumber,): CollectionHolder<T>
/**
 * Reverse to a new {@link CollectionHolder}
 * from the {@link to ending} to the {@link from starting} index in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection} to reverse
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link ReadonlyArray.length size} - 1</code> by default)
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException    {@link from} or {@link to} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverseByArray<const T, >(collection: Nullable<readonly T[]>, from: NullableNumber, to: NullableNumber,): CollectionHolder<T>
export function toReverseByArray<const T, >(collection: Nullable<readonly T[]>, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.length
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index “${to}”${to == endingIndex ? "" : ` (“${endingIndex}” after calculation)`} is over the starting index “${from}”${from == startingIndex ? "" : ` (“${startingIndex}” after calculation)`}.`, from, to,)
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
