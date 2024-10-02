/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {CollectionHolder}           from "../CollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Tell whenever the {@link value} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param value      The value to compare
 * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
 */
export function has<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, value: T,): boolean
/**
 * Tell whenever the {@link value} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param value      The value to compare
 * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
 * @deprecated Use a value present in the {@link collection} instead. This will be removed in version 1.11
 */
export function has<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, value: unknown,): boolean
export function has<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, value: T,) {
    if (collection == null)
        return false
    if (isCollectionHolder<T>(collection,))
        return hasByCollectionHolder(collection, value,)
    if (isArray(collection,))
        return hasByArray(collection, value,)
    if (isCollectionHolderByStructure<T>(collection,))
        return hasByCollectionHolder(collection, value,)
    if (isArrayByStructure<T>(collection,))
        return hasByArray(collection, value,)
    return hasByMinimalistCollectionHolder(collection, value,)
}


/**
 * Tell whenever the {@link value} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param value      The value to compare
 * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
 */
export function hasByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, value: T,): boolean
/**
 * Tell whenever the {@link value} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param value      The value to compare
 * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
 * @deprecated Use a value present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, value: unknown,): boolean
export function hasByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, value: T,) {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false
    return __has(collection, value, size,)
}

/**
 * Tell whenever the {@link value} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param value      The value to compare
 * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
 */
export function hasByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, value: T,): boolean
/**
 * Tell whenever the {@link value} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param value      The value to compare
 * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
 * @deprecated Use a value present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, value: unknown,): boolean
export function hasByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, value: T,) {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false
    return __has(collection, value, collection.size,)
}

/**
 * Tell whenever the {@link value} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param value      The value to compare
 * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
 */
export function hasByArray<const T, >(collection: Nullable<readonly T[]>, value: T,): boolean {
    if (collection == null)
        return false

    const size = collection.length
    if (size == 0)
        return false
    return __hasByArray(collection, value, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __has<const T, >(collection: MinimalistCollectionHolder<T>, value: T, size: number,) {
    let index = -1
    while (++index < size)
        if (collection.get(index,) === value)
            return true
    return false
}

function __hasByArray<const T, >(collection: readonly T[], value: T, size: number,) {
    let index = -1
    while (++index < size)
        if (collection[index] === value)
            return true
    return false
}

//#endregion -------------------- Loop methods --------------------
