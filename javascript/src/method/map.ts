/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}             from "../CollectionHolder"
import type {MinimalistCollectionHolder}   from "../MinimalistCollectionHolder"
import type {ValueIndexWithReturnCallback} from "../type/callback"

import {CollectionConstants}           from "../CollectionConstants"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link CollectionHolder} applying a {@link transform} function
 * on each element of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param transform  The given transform
 * @see ReadonlyArray.map
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html Kotlin map(transform)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java map(transform)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
 * @extensionFunction
 */
export function map<const T, const U, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return mapByCollectionHolder(collection, transform,)
    if (isArray(collection,))
        return mapByArray(collection, transform,)
    if (isCollectionHolderByStructure<T>(collection,))
        return mapByCollectionHolder(collection, transform,)
    if (isArrayByStructure<T>(collection,))
        return mapByArray(collection, transform,)
    return mapByMinimalistCollectionHolder(collection, transform,)
}


/**
 * Create a new {@link CollectionHolder} applying a {@link transform} function
 * on each element of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param transform  The given transform
 * @see ReadonlyArray.map
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html Kotlin map(transform)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java map(transform)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
 * @extensionFunction
 */
export function mapByMinimalistCollectionHolder<const T, const U, >(collection: Nullable<MinimalistCollectionHolder<T>>, transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (transform.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection, transform as (value: T,) => U, size,),)
    if (transform.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection, transform, size,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(transform as () => U, size,),)
}

/**
 * Create a new {@link CollectionHolder} applying a {@link transform} function
 * on each element of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param transform  The given transform
 * @see ReadonlyArray.map
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html Kotlin map(transform)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java map(transform)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
 * @extensionFunction
 */
export function mapByCollectionHolder<const T, const U, >(collection: Nullable<CollectionHolder<T>>, transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (transform.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection, transform as (value: T,) => U, collection.size,),)
    if (transform.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection, transform, collection.size,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(transform as () => U, collection.size,),)
}

/**
 * Create a new {@link CollectionHolder} applying a {@link transform} function
 * on each element of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param transform  The given transform
 * @see ReadonlyArray.map
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html Kotlin map(transform)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java map(transform)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
 * @extensionFunction
 */
export function mapByArray<const T, const U, >(collection: Nullable<readonly T[]>, transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.length
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (transform.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1ArgumentByArray(collection, transform as (value: T,) => U, size,),)
    if (transform.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2ArgumentByArray(collection, transform, size,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(transform as () => U, size,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const U, >(transform: () => U, size: number,) {
    const newArray = new Array<U>(size,)
    let index = -1
    while (++index < size)
        newArray[index] = transform()
    return newArray
}


function __with1Argument<const T, const U, >(collection: MinimalistCollectionHolder<T>, transform: (value: T,) => U, size: number,) {
    const newArray = new Array<U>(size,)
    let index = -1
    while (++index < size)
        newArray[index] = transform(collection.get(index,),)
    return newArray
}

function __with1ArgumentByArray<const T, const U, >(collection: readonly T[], transform: (value: T,) => U, size: number,) {
    const newArray = new Array<U>(size,)
    let index = -1
    while (++index < size)
        newArray[index] = transform(collection[index] as T,)
    return newArray
}


function __with2Argument<const T, const U, >(collection: MinimalistCollectionHolder<T>, transform: (value: T, index: number,) => U, size: number,) {
    const newArray = new Array<U>(size,)
    let index = -1
    while (++index < size)
        newArray[index] = transform(collection.get(index,), index,)
    return newArray
}

function __with2ArgumentByArray<const T, const U, >(collection: readonly T[], transform: (value: T, index: number,) => U, size: number,) {
    const newArray = new Array<U>(size,)
    let index = -1
    while (++index < size)
        newArray[index] = transform(collection[index] as T, index,)
    return newArray
}

//#endregion -------------------- Loop methods --------------------
