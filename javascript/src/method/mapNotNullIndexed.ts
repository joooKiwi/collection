/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}             from "../CollectionHolder"
import type {IndexValueWithReturnCallback} from "../CollectionHolder.types"
import type {MinimalistCollectionHolder}   from "../MinimalistCollectionHolder"

import {CollectionConstants}           from "../CollectionConstants"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link CollectionHolder} applying a {@link transform} function
 * on each non-null element of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param transform  The given transform
 * @see ReadonlyArray.map
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map-indexed-not-null.html Kotlin mapIndexedNotNull(transform)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java map(transform)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
 * @extensionFunction
 */
export function mapNotNullIndexed<const T, const U extends NonNullable<unknown>, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return mapNotNullIndexedByCollectionHolder(collection, transform,)
    if (isArray(collection,))
        return mapNotNullIndexedByArray(collection, transform,)
    if (isCollectionHolderByStructure<T>(collection,))
        return mapNotNullIndexedByCollectionHolder(collection, transform,)
    if (isArrayByStructure<T>(collection,))
        return mapNotNullIndexedByArray(collection, transform,)
    return mapNotNullIndexedByMinimalistCollectionHolder(collection, transform,)
}


/**
 * Create a new {@link CollectionHolder} applying a {@link transform} function
 * on each non-null element of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param transform  The given transform
 * @see ReadonlyArray.map
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map-indexed-not-null.html Kotlin mapIndexedNotNull(transform)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java map(transform)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
 * @extensionFunction
 */
export function mapNotNullIndexedByMinimalistCollectionHolder<const T, const U extends NonNullable<unknown>, >(collection: Nullable<MinimalistCollectionHolder<T>>, transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (transform.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(transform as (index: number,) => Nullable<U>, size,),)
    if (transform.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection, transform, size,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(transform as () => Nullable<U>, size,),)
}

/**
 * Create a new {@link CollectionHolder} applying a {@link transform} function
 * on each non-null element of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param transform  The given transform
 * @see ReadonlyArray.map
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map-indexed-not-null.html Kotlin mapIndexedNotNull(transform)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java map(transform)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
 * @extensionFunction
 */
export function mapNotNullIndexedByCollectionHolder<const T, const U extends NonNullable<unknown>, >(collection: Nullable<CollectionHolder<T>>, transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (transform.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(transform as (index: number,) => Nullable<U>, collection.size,),)
    if (transform.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection, transform, collection.size,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(transform as () => Nullable<U>, collection.size,),)
}

/**
 * Create a new {@link CollectionHolder} applying a {@link transform} function
 * on each non-null element of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param transform  The given transform
 * @see ReadonlyArray.map
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map-indexed-not-null.html Kotlin mapIndexedNotNull(transform)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java map(transform)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
 * @extensionFunction
 */
export function mapNotNullIndexedByArray<const T, const U extends NonNullable<unknown>, >(collection: Nullable<readonly T[]>, transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.length
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (transform.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(transform as (index: number,) => Nullable<U>, size,),)
    if (transform.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2ArgumentByArray(collection, transform, size,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(transform as () => Nullable<U>, size,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const U extends NonNullable<unknown>, >(transform: () => Nullable<U>, size: number,) {
    const newArray: U[] = []
    let index = size
    while (index-- > 0) {
        const value = transform()
        if (value != null)
            newArray.push(value,)
    }
    return newArray
}

function __with1Argument<const U extends NonNullable<unknown>, >(transform: (index: number,) => Nullable<U>, size: number,) {
    const newArray: U[] = []
    let index = -1
    while (++index < size) {
        const value = transform(index,)
        if (value != null)
            newArray.push(value,)
    }
    return newArray
}


function __with2Argument<const T, const U extends NonNullable<unknown>, >(collection: MinimalistCollectionHolder<T>, transform: (index: number, value: T,) => Nullable<U>, size: number,) {
    const newArray: U[] = []
    let index = -1
    while (++index < size) {
        const value = transform(index, collection.get(index,),)
        if (value != null)
            newArray.push(value,)
    }
    return newArray
}

function __with2ArgumentByArray<const T, const U extends NonNullable<unknown>, >(collection: readonly T[], transform: (index: number, value: T,) => Nullable<U>, size: number,) {
    const newArray: U[] = []
    let index = -1
    while (++index < size) {
        const value = transform(index, collection[index] as T,)
        if (value != null)
            newArray.push(value,)
    }
    return newArray
}

//#endregion -------------------- Loop methods --------------------
