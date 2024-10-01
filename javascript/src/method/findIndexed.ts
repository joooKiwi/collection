/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr} from "@joookiwi/type"

import type {CollectionHolder}                                         from "../CollectionHolder"
import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../CollectionHolder.types"
import type {MinimalistCollectionHolder}                               from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get the first element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see ReadonlyArray.find
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function findIndexed<const T, const S extends T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
/**
 * Get the first element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see ReadonlyArray.find
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 * @extensionFunction
 */
export function findIndexed<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: ReverseBooleanCallback<T>,): NullOr<T>
export function findIndexed<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: ReverseBooleanCallback<T>,) {
    if (collection == null)
        return null
    if (isCollectionHolder<T>(collection,))
        return findIndexedByCollectionHolder(collection, predicate,)
    if (isArray(collection,))
        return findIndexedByArray(collection, predicate,)
    if (isCollectionHolderByStructure<T>(collection,))
        return findIndexedByCollectionHolder(collection, predicate,)
    if (isArrayByStructure<T>(collection,))
        return findIndexedByArray(collection, predicate,)
    return findIndexedByMinimalistCollectionHolder(collection, predicate,)
}


/**
 * Get the first element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.find
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function findIndexedByMinimalistCollectionHolder<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
/**
 * Get the first element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.find
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 * @extensionFunction
 */
export function findIndexedByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,): NullOr<T>
export function findIndexedByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,): NullOr<T> {
    if (collection == null)
        return null

    const size = collection.size
    if (size == 0)
        return null

    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (index: number,) => boolean, size,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, size,)
    return __with0Argument(collection, predicate as () => boolean, size,)
}

/**
 * Get the first element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.find
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function findIndexedByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
/**
 * Get the first element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.find
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 * @extensionFunction
 */
export function findIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,): NullOr<T>
export function findIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,): NullOr<T> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (index: number,) => boolean, collection.size,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, collection.size,)
    return __with0Argument(collection, predicate as () => boolean, collection.size,)
}

/**
 * Get the first element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.find
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function findIndexedByArray<const T, const S extends T, >(collection: Nullable<readonly T[]>, predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
/**
 * Get the first element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.find
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 * @extensionFunction
 */
export function findIndexedByArray<const T, >(collection: Nullable<readonly T[]>, predicate: ReverseBooleanCallback<T>,): NullOr<T>
export function findIndexedByArray<const T, >(collection: Nullable<readonly T[]>, predicate: ReverseBooleanCallback<T>,) {
    if (collection == null)
        return null

    const size = collection.length
    if (size == 0)
        return null
    if (predicate.length == 1)
        return __with1ArgumentByArray(collection, predicate as (index: number,) => boolean, size,)
    if (predicate.length >= 2)
        return __with2ArgumentByArray(collection, predicate, size,)
    return __with0ArgumentByArray(collection, predicate as () => boolean, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: () => boolean, size: number,) {
    let index = -1
    while (++index < size)
        if (predicate())
            return collection.get(index,)
    return null
}

function __with0ArgumentByArray<const T, >(collection: readonly T[], predicate: () => boolean, size: number,) {
    let index = -1
    while (++index < size)
        if (predicate())
            return collection[index] as T
    return null
}


function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (index: number,) => boolean, size: number,) {
    let index = -1
    while (++index < size)
        if (predicate(index,))
            return collection.get(index,)
    return null
}

function __with1ArgumentByArray<const T, >(collection: readonly T[], predicate: (index: number,) => boolean, size: number,) {
    let index = -1
    while (++index < size)
        if (predicate(index,))
            return collection[index] as T
    return null
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (index: number, value: T,) => boolean, size: number,) {
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (predicate(index, value,))
            return value
    }
    return null
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], predicate: (index: number, value: T,) => boolean, size: number,) {
    let index = -1
    while (++index < size) {
        const value = collection[index] as T
        if (predicate(index, value,))
            return value
    }
    return null
}

//#endregion -------------------- Loop methods --------------------
