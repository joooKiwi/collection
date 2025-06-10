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

import type {CollectionHolder}                           from "../CollectionHolder"
import type {MinimalistCollectionHolder}                 from "../MinimalistCollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../type/callback"

import {CollectionConstants}           from "../CollectionConstants"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder}
 * not matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function filterNot<const T, const S extends T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder}
 * not matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @extensionFunction
 */
export function filterNot<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function filterNot<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder(collection,))
        return filterNotByCollectionHolder(collection, predicate,)
    if (isArray(collection,))
        return filterNotByArray(collection, predicate,)
    if (isMinimalistCollectionHolder(collection,))
        return filterNotByMinimalistCollectionHolder(collection, predicate,)

    if (isCollectionHolderByStructure<T>(collection,))
        return filterNotByCollectionHolder(collection, predicate,)
    if (isArrayByStructure<T>(collection,))
        return filterNotByArray(collection, predicate,)
    return filterNotByMinimalistCollectionHolder(collection, predicate,)
}


/**
 * Get a new {@link CollectionHolder}
 * not matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function filterNotByMinimalistCollectionHolder<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder}
 * not matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @extensionFunction
 */
export function filterNotByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function filterNotByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection, predicate as (value: T,) => boolean, size,),)
    if (predicate.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection, predicate, size,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(collection, predicate as () => boolean, size,),)
}

/**
 * Get a new {@link CollectionHolder}
 * not matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function filterNotByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder}
 * not matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @extensionFunction
 */
export function filterNotByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function filterNotByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection, predicate as (value: T,) => boolean, collection.size,),)
    if (predicate.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection, predicate, collection.size,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(collection, predicate as () => boolean, collection.size,),)
}

/**
 * Get a new {@link CollectionHolder}
 * not matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function filterNotByArray<const T, const S extends T, >(collection: Nullable<readonly T[]>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder}
 * not matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @extensionFunction
 */
export function filterNotByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function filterNotByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.length
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1ArgumentByArray(collection, predicate as (value: T,) => boolean, size,),)
    if (predicate.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2ArgumentByArray(collection, predicate, size,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0ArgumentByArray(collection, predicate as () => boolean, size,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: () => boolean, size: number,) {
    const newArray: T[] = []
    let index = -1
    while (++index < size)
        if (!predicate())
            newArray.push(collection.get(index,),)
    return newArray
}

function __with0ArgumentByArray<const T, >(collection: readonly T[], predicate: () => boolean, size: number,) {
    const newArray: T[] = []
    let index = -1
    while (++index < size)
        if (!predicate())
            newArray.push(collection[index] as T,)
    return newArray
}


function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T,) => boolean, size: number,) {
    const newArray: T[] = []
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (!predicate(value,))
            newArray.push(value,)
    }
    return newArray
}

function __with1ArgumentByArray<const T, >(collection: readonly T[], predicate: (value: T,) => boolean, size: number,) {
    const newArray: T[] = []
    let index = -1
    while (++index < size) {
        const value = collection[index] as T
        if (!predicate(value,))
            newArray.push(value,)
    }
    return newArray
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T, index: number,) => boolean, size: number,) {
    const newArray: T[] = []
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (!predicate(value, index,))
            newArray.push(value,)
    }
    return newArray
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], predicate: (value: T, index: number,) => boolean, size: number,) {
    const newArray: T[] = []
    let index = -1
    while (++index < size) {
        const value = collection[index] as T
        if (!predicate(value, index,))
            newArray.push(value,)
    }
    return newArray
}

//#endregion -------------------- Loop methods --------------------
