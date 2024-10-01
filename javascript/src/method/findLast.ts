/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr} from "@joookiwi/type"

import type {CollectionHolder}                           from "../CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {MinimalistCollectionHolder}                 from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get the last element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function findLast<const T, const S extends T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
/**
 * Get the last element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @extensionFunction
 */
export function findLast<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>,): NullOr<T>
export function findLast<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        return null
    if (isCollectionHolder<T>(collection,))
        return findLastByCollectionHolder(collection, predicate,)
    if (isArray(collection,))
        return findLastByArray(collection, predicate,)
    if (isCollectionHolderByStructure<T>(collection,))
        return findLastByCollectionHolder(collection, predicate,)
    if (isArrayByStructure<T>(collection,))
        return findLastByArray(collection, predicate,)
    return findLastByMinimalistCollectionHolder(collection, predicate,)
}


/**
 * Get the last element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function findLastByMinimalistCollectionHolder<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
/**
 * Get the last element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @extensionFunction
 */
export function findLastByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,): NullOr<T>
export function findLastByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,): NullOr<T> {
    if (collection == null)
        return null

    const size = collection.size
    if (size == 0)
        return null

    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, size,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, size,)
    return __with0Argument(collection, predicate as () => boolean, size,)
}

/**
 * Get the last element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function findLastByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
/**
 * Get the last element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @extensionFunction
 */
export function findLastByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,): NullOr<T>
export function findLastByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,): NullOr<T> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, collection.size,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, collection.size,)
    return __with0Argument(collection, predicate as () => boolean, collection.size,)
}

/**
 * Get the last element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function findLastByArray<const T, const S extends T, >(collection: Nullable<readonly T[]>, predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
/**
 * Get the last element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @extensionFunction
 */
export function findLastByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>,): NullOr<T>
export function findLastByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        return null

    const size = collection.length
    if (size == 0)
        return null
    if (predicate.length == 1)
        return __with1ArgumentByArray(collection, predicate as (value: T,) => boolean, size,)
    if (predicate.length >= 2)
        return __with2ArgumentByArray(collection, predicate, size,)
    return __with0ArgumentByArray(collection, predicate as () => boolean, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: () => boolean, size: number,) {
    let index = size
    while (index-- > 0)
        if (predicate())
            return collection.get(index,)
    return null
}

function __with0ArgumentByArray<const T, >(collection: readonly T[], predicate: () => boolean, size: number,) {
    let index = size
    while (index-- > 0)
        if (predicate())
            return collection[index] as T
    return null
}


function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T,) => boolean, size: number,) {
    let index = size
    while (index-- > 0) {
        const value = collection.get(index,)
        if (predicate(value,))
            return value
    }
    return null
}

function __with1ArgumentByArray<const T, >(collection: readonly T[], predicate: (value: T,) => boolean, size: number,) {
    let index = size
    while (index-- > 0) {
        const value = collection[index] as T
        if (predicate(value,))
            return value
    }
    return null
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T, index: number,) => boolean, size: number,) {
    let index = size
    while (index-- > 0) {
        const value = collection.get(index,)
        if (predicate(value, index,))
            return value
    }
    return null
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], predicate: (value: T, index: number,) => boolean, size: number,) {
    let index = size
    while (index-- > 0) {
        const value = collection[index] as T
        if (predicate(value, index,))
            return value
    }
    return null
}

//#endregion -------------------- Loop methods --------------------
