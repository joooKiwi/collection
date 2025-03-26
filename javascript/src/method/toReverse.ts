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

import {CollectionConstants}                               from "../CollectionConstants"
import {__endingIndex, __startingIndex, __validateInRange} from "./_indexes utility"
import {isArray}                                           from "./isArray"
import {isArrayByStructure}                                from "./isArrayByStructure"
import {isCollectionHolder}                                from "./isCollectionHolder"
import {isCollectionHolderByStructure}                     from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}                      from "./isMinimalistCollectionHolder"

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
export function toReverse<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,): CollectionHolder<T>
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
export function toReverse<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, from: NullableNumber,): CollectionHolder<T>
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
export function toReverse<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, from: NullableNumber, to: NullableNumber,): CollectionHolder<T>
export function toReverse<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (to == null)
        if (from == null)
            return __core0(collection,)
        else
            return __core1(collection, from,)
    if (from == null)
        return __coreWithNoFrom(collection, to,)
    return __core2(collection, from, to,)
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
    if (to == null)
        if (from == null)
            return __core0ByMinimalistCollectionHolder(collection,)
        else
            return __core1ByMinimalistCollectionHolder(collection, from,)
    if (from == null)
        return __coreWithNoFromByMinimalistCollectionHolder(collection, to,)
    return __core2ByMinimalistCollectionHolder(collection, from, to,)
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
    if (to == null)
        if (from == null)
            return __core0ByMinimalistCollectionHolder(collection,)
        else
            return __core1ByMinimalistCollectionHolder(collection, from,)
    if (from == null)
        return __coreWithNoFromByMinimalistCollectionHolder(collection, to,)
    return __core2ByMinimalistCollectionHolder(collection, from, to,)
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
    if (to == null)
        if (from == null)
            return __core0ByArray(collection,)
        else
            return __core1ByArray(collection, from,)
    if (from == null)
        return __coreWithNoFromByArray(collection, to,)
    return __core2ByArray(collection, from, to,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Core method --------------------

//#region -------------------- ∅ --------------------

function __core0<const T, >(collection: | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[],): CollectionHolder<T> {
    if (isCollectionHolder(collection,))
        return __core0ByCollectionHolder(collection,)
    if (isArray(collection,))
        return __core0ByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return __core0ByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __core0ByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return __core0ByArray(collection,)
    return __core0ByMinimalistCollectionHolder(collection,)
}

function __core0ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>,): CollectionHolder<T> {
    const size = collection.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRange(collection, 0, size - 1,),)
}

function __core0ByCollectionHolder<const T, >(collection: CollectionHolder<T>,): CollectionHolder<T> {
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRange(collection, 0, collection.size - 1,),)
}

function __core0ByArray<const T, >(collection: readonly T[],): CollectionHolder<T> {
    const size = collection.length
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRangeByArray(collection, 0, size - 1,),)
}

//#endregion -------------------- ∅ --------------------
//#region -------------------- from --------------------

function __core1<const T, >(collection: | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[], from: number,): CollectionHolder<T> {
    if (isCollectionHolder(collection,))
        return __core1ByCollectionHolder(collection, from,)
    if (isArray(collection,))
        return __core1ByArray(collection, from,)
    if (isMinimalistCollectionHolder(collection,))
        return __core1ByMinimalistCollectionHolder(collection, from,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __core1ByCollectionHolder(collection, from,)
    if (isArrayByStructure<T>(collection,))
        return __core1ByArray(collection, from,)
    return __core1ByMinimalistCollectionHolder(collection, from,)
}

function __core1ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, from: number,): CollectionHolder<T> {
    const size = collection.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const startingIndex = __startingIndex(from, size,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRange(collection, startingIndex, size - 1,),)
}

function __core1ByCollectionHolder<const T, >(collection: CollectionHolder<T>, from: number,): CollectionHolder<T> {
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    const startingIndex = __startingIndex(from, size,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRange(collection, startingIndex, size - 1,),)
}

function __core1ByArray<const T, >(collection: readonly T[], from: number,): CollectionHolder<T> {
    const size = collection.length
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const startingIndex = __startingIndex(from, size,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRangeByArray(collection, startingIndex, size - 1,),)
}

//#endregion -------------------- from --------------------
//#region -------------------- from, to --------------------

function __core2<const T, >(collection: | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[], from: number, to: number,): CollectionHolder<T> {
    if (isCollectionHolder(collection,))
        return __core2ByCollectionHolder(collection, from, to,)
    if (isArray(collection,))
        return __core2ByArray(collection, from, to,)
    if (isMinimalistCollectionHolder(collection,))
        return __core2ByMinimalistCollectionHolder(collection, from, to,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __core2ByCollectionHolder(collection, from, to,)
    if (isArrayByStructure<T>(collection,))
        return __core2ByArray(collection, from, to,)
    return __core2ByMinimalistCollectionHolder(collection, from, to,)
}

function __core2ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, from: number, to: number,): CollectionHolder<T> {
    const size = collection.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    __validateInRange(from, startingIndex, to, endingIndex,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRange(collection, startingIndex, endingIndex,),)
}

function __core2ByCollectionHolder<const T, >(collection: CollectionHolder<T>, from: number, to: number,): CollectionHolder<T> {
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    __validateInRange(from, startingIndex, to, endingIndex,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRange(collection, startingIndex, endingIndex,),)
}

function __core2ByArray<const T, >(collection: readonly T[], from: number, to: number,): CollectionHolder<T> {
    const size = collection.length
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    __validateInRange(from, startingIndex, to, endingIndex,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRangeByArray(collection, startingIndex, endingIndex,),)
}

//#endregion -------------------- from, to --------------------
//#region -------------------- to --------------------

function __coreWithNoFrom<const T, >(collection: | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[], to: number,): CollectionHolder<T> {
    if (isCollectionHolder(collection,))
        return __coreWithNoFromByCollectionHolder(collection, to,)
    if (isArray(collection,))
        return __coreWithNoFromByArray(collection, to,)
    if (isMinimalistCollectionHolder(collection,))
        return __coreWithNoFromByMinimalistCollectionHolder(collection, to,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __coreWithNoFromByCollectionHolder(collection, to,)
    if (isArrayByStructure<T>(collection,))
        return __coreWithNoFromByArray(collection, to,)
    return __coreWithNoFromByMinimalistCollectionHolder(collection, to,)
}

function __coreWithNoFromByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, to: number,): CollectionHolder<T> {
    const size = collection.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const endingIndex = __endingIndex(to, size,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRange(collection, 0, endingIndex,),)
}

function __coreWithNoFromByCollectionHolder<const T, >(collection: CollectionHolder<T>, to: number,): CollectionHolder<T> {
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const endingIndex = __endingIndex(to, collection.size,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRange(collection, 0, endingIndex,),)
}

function __coreWithNoFromByArray<const T, >(collection: readonly T[], to: number,): CollectionHolder<T> {
    const size = collection.length
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const endingIndex = __endingIndex(to, size,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newReverseArrayByRangeByArray(collection, 0, endingIndex,),)
}

//#endregion -------------------- to --------------------

//#endregion -------------------- Core method --------------------
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
