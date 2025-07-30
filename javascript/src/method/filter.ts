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
import {__reduceTo}                    from "./_array utility"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder}
 * matching only the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter.html Kotlin filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function filter<const T, const S extends T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder}
 * matching only the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter.html Kotlin filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @extensionFunction
 */
export function filter<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function filter<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder(collection,))
        return filterByCollectionHolder(collection, predicate,)
    if (isArray(collection,))
        return filterByArray(collection, predicate,)
    if (isMinimalistCollectionHolder(collection,))
        return filterByMinimalistCollectionHolder(collection, predicate,)

    if (isCollectionHolderByStructure<T>(collection,))
        return filterByCollectionHolder(collection, predicate,)
    if (isArrayByStructure<T>(collection,))
        return filterByArray(collection, predicate,)
    return filterByMinimalistCollectionHolder(collection, predicate,)
}


/**
 * Get a new {@link CollectionHolder}
 * matching only the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter.html Kotlin filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function filterByMinimalistCollectionHolder<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder}
 * matching only the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter.html Kotlin filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @extensionFunction
 */
export function filterByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function filterByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,) {
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
 * matching only the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter.html Kotlin filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function filterByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder}
 * matching only the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter.html Kotlin filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @extensionFunction
 */
export function filterByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function filterByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,) {
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
 * matching only the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter.html Kotlin filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function filterByArray<const T, const S extends T, >(collection: Nullable<readonly T[]>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder}
 * matching only the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter.html Kotlin filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @extensionFunction
 */
export function filterByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function filterByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>,) {
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
    const tempArray = new Array<T>(size,)
    let amountOfItemsAdded = -1;
    let index = -1
    while (++index < size)
        if (predicate())
            tempArray[++amountOfItemsAdded] = collection.get(index,)
    return __reduceTo(tempArray, amountOfItemsAdded + 1,)
}

function __with0ArgumentByArray<const T, >(collection: readonly T[], predicate: () => boolean, size: number,) {
    const tempArray = new Array<T>(size,)
    let amountOfItemsAdded = -1;
    let index = -1
    while (++index < size)
        if (predicate())
            tempArray[++amountOfItemsAdded] = collection[index] as T
    return __reduceTo(tempArray, amountOfItemsAdded + 1,)
}


function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T,) => boolean, size: number,) {
    const tempArray = new Array<T>(size,)
    let amountOfItemsAdded = -1;
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (predicate(value,))
            tempArray[++amountOfItemsAdded] = value
    }
    return __reduceTo(tempArray, amountOfItemsAdded + 1,)
}

function __with1ArgumentByArray<const T, >(collection: readonly T[], predicate: (value: T,) => boolean, size: number,) {
    const tempArray = new Array<T>(size,)
    let amountOfItemsAdded = -1;
    let index = -1
    while (++index < size) {
        const value = collection[index] as T
        if (predicate(value,))
            tempArray[++amountOfItemsAdded] = value
    }
    return __reduceTo(tempArray, amountOfItemsAdded + 1,)
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T, index: number,) => boolean, size: number,) {
    const tempArray = new Array<T>(size,)
    let amountOfItemsAdded = -1;
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (predicate(value, index,))
            tempArray[++amountOfItemsAdded] = value
    }
    return __reduceTo(tempArray, amountOfItemsAdded + 1,)
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], predicate: (value: T, index: number,) => boolean, size: number,) {
    const tempArray = new Array<T>(size,)
    let amountOfItemsAdded = -1;
    let index = -1
    while (++index < size) {
        const value = collection[index] as T
        if (predicate(value, index,))
            tempArray[++amountOfItemsAdded] = value
    }
    return __reduceTo(tempArray, amountOfItemsAdded + 1,)
}

//#endregion -------------------- Loop methods --------------------
