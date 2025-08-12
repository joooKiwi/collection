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

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}                                         from "../CollectionHolder"
import type {MinimalistCollectionHolder}                               from "../MinimalistCollectionHolder"
import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../type/callback"

import {CollectionConstants}           from "../CollectionConstants"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link CollectionHolder}, {@link MinimalistCollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
 * @typescriptDefinition
 */
export function dropWhileIndexed<const T, const S extends T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link CollectionHolder}, {@link MinimalistCollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
 */
export function dropWhileIndexed<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
export function dropWhileIndexed<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: ReverseBooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder(collection,))
        return dropWhileIndexedByCollectionHolder(collection, predicate,)
    if (isArray(collection,))
        return dropWhileIndexedByArray(collection, predicate,)
    if (isMinimalistCollectionHolder(collection,))
        return dropWhileIndexedByMinimalistCollectionHolder(collection, predicate,)

    if (isCollectionHolderByStructure<T>(collection,))
        return dropWhileIndexedByCollectionHolder(collection, predicate,)
    if (isArrayByStructure<T>(collection,))
        return dropWhileIndexedByArray(collection, predicate,)
    return dropWhileIndexedByMinimalistCollectionHolder(collection, predicate,)
}


/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
 * @typescriptDefinition
 */
export function dropWhileIndexedByMinimalistCollectionHolder<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
 */
export function dropWhileIndexedByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
export function dropWhileIndexedByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection, size, predicate as (index: number,) => boolean,),)
    if (predicate.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection, size, predicate,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(collection, size, predicate as () => boolean,),)
}

/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
 * @typescriptDefinition
 */
export function dropWhileIndexedByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
 */
export function dropWhileIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
export function dropWhileIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection, collection.size, predicate as (index: number,) => boolean,),)
    if (predicate.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection, collection.size, predicate,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(collection, collection.size, predicate as () => boolean,),)
}

/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
 * @typescriptDefinition
 */
export function dropWhileIndexedByArray<const T, const S extends T, >(collection: Nullable<readonly T[]>, predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
 */
export function dropWhileIndexedByArray<const T, >(collection: Nullable<readonly T[]>, predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
export function dropWhileIndexedByArray<const T, >(collection: Nullable<readonly T[]>, predicate: ReverseBooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.length
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1ArgumentByArray(collection, size, predicate as (index: number,) => boolean,),)
    if (predicate.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2ArgumentByArray(collection, size, predicate,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0ArgumentByArray(collection, size, predicate as () => boolean,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, >(collection: MinimalistCollectionHolder<T>, size: number, predicate: () => boolean,): readonly T[] {
    let index = -1
    while (++index < size)
        if (!predicate()) {
            const newArray = new Array<T>(size - index,)
            let indexToRetrieve = index - 1
            let indexToAdd = -1
            while (++indexToRetrieve < size)
                newArray[++indexToAdd] = collection.get(indexToRetrieve,)
            return newArray
        }
    return CollectionConstants.EMPTY_ARRAY
}

function __with0ArgumentByArray<const T, >(collection: readonly T[], size: number, predicate: () => boolean,): readonly T[] {
    let index = -1
    while (++index < size)
        if (!predicate()) {
            const newArray = new Array<T>(size - index,)
            let indexToRetrieve = index - 1
            let indexToAdd = -1
            while (++indexToRetrieve < size)
                newArray[++indexToAdd] = collection[indexToRetrieve] as T
            return newArray
        }
    return CollectionConstants.EMPTY_ARRAY
}


function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, size: number, predicate: (index: number,) => boolean,): readonly T[] {
    let index = -1
    while (++index < size)
        if (!predicate(index,)) {
            const newArray = new Array<T>(size - index,)
            let indexToRetrieve = index - 1
            let indexToAdd = -1
            while (++indexToRetrieve < size)
                newArray[++indexToAdd] = collection.get(indexToRetrieve,)
            return newArray
        }
    return CollectionConstants.EMPTY_ARRAY
}

function __with1ArgumentByArray<const T, >(collection: readonly T[], size: number, predicate: (index: number,) => boolean,): readonly T[] {
    let index = -1
    while (++index < size)
        if (!predicate(index,)) {
            const newArray = new Array<T>(size - index,)
            let indexToRetrieve = index - 1
            let indexToAdd = -1
            while (++indexToRetrieve < size)
                newArray[++indexToAdd] = collection[indexToRetrieve] as T
            return newArray
        }
    return CollectionConstants.EMPTY_ARRAY
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, size: number, predicate: (index: number, value: T,) => boolean,): readonly T[] {
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (!predicate(index, value,)) {
            const newArray = new Array<T>(size - index,)
            newArray[0] = value
            let indexToRetrieve = index
            let indexToAdd = 0
            while (++indexToRetrieve < size)
                newArray[++indexToAdd] = collection.get(indexToRetrieve,)
            return newArray
        }
    }
    return CollectionConstants.EMPTY_ARRAY
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], size: number, predicate: (index: number, value: T,) => boolean,): readonly T[] {
    let index = -1
    while (++index < size) {
        const value = collection[index] as T
        if (!predicate(index, value,)) {
            const newArray = new Array<T>(size - index,)
            newArray[0] = value
            let indexToRetrieve = index
            let indexToAdd = 0
            while (++indexToRetrieve < size)
                newArray[++indexToAdd] = collection[indexToRetrieve] as T
            return newArray
        }
    }
    return CollectionConstants.EMPTY_ARRAY
}

//#endregion -------------------- Loop methods --------------------
