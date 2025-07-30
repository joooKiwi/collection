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

import type {Nullable, NullOr} from "@joookiwi/type"

import type {CollectionHolder}                                         from "../CollectionHolder"
import type {MinimalistCollectionHolder}                               from "../MinimalistCollectionHolder"
import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../type/callback"

import {getLastOrNull, getLastOrNullByArray, getLastOrNullByCollectionHolder, getLastOrNullByMinimalistCollectionHolder}                                 from "./getLastOrNull"
import {findLastIndexedOrNull, findLastIndexedOrNullByArray, findLastIndexedOrNullByCollectionHolder, findLastIndexedOrNullByMinimalistCollectionHolder} from "./findLastIndexedOrNull"

//#region -------------------- Facade method --------------------

/**
 * Get the last element in the {@link collection}
 * or <b>null</b> if the {@link collection} <b>is empty</b>
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault()
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedOrNull<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,): NullOr<T>
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 * or <b>null</b> otherwise
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The matching predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedOrNull<const T, const S extends T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 * or <b>null</b> otherwise
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The matching predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedOrNull<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: Nullable<ReverseBooleanCallback<T>>,): NullOr<T>
export function lastIndexedOrNull<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate?: Nullable<ReverseBooleanCallback<T>>,) {
    if (predicate == null)
        return getLastOrNull(collection,)
    return findLastIndexedOrNull(collection, predicate,)
}


/**
 * Get the last element in the {@link collection}
 * or <b>null</b> if the {@link collection} <b>is empty</b>
 *
 * @param collection The nullable collection
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault()
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedOrNullByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): NullOr<T>
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 * or <b>null</b> otherwise
 *
 * @param collection The nullable collection
 * @param predicate  The matching predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedOrNullByMinimalistCollectionHolder<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 * or <b>null</b> otherwise
 *
 * @param collection The nullable collection
 * @param predicate  The matching predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedOrNullByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<ReverseBooleanCallback<T>>,): NullOr<T>
export function lastIndexedOrNullByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate?: Nullable<ReverseBooleanCallback<T>>,) {
    if (predicate == null)
        return getLastOrNullByMinimalistCollectionHolder(collection,)
    return findLastIndexedOrNullByMinimalistCollectionHolder(collection, predicate,)
}

/**
 * Get the last element in the {@link collection}
 * or <b>null</b> if the {@link collection} {@link CollectionHolder.isEmpty is empty}
 *
 * @param collection The nullable collection
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault()
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedOrNullByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): NullOr<T>
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 * or <b>null</b> otherwise
 *
 * @param collection The nullable collection
 * @param predicate  The matching predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedOrNullByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 * or <b>null</b> otherwise
 *
 * @param collection The nullable collection
 * @param predicate  The matching predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedOrNullByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<ReverseBooleanCallback<T>>,): NullOr<T>
export function lastIndexedOrNullByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate?: Nullable<ReverseBooleanCallback<T>>,) {
    if (predicate == null)
        return getLastOrNullByCollectionHolder(collection,)
    return findLastIndexedOrNullByCollectionHolder(collection, predicate,)
}

/**
 * Get the last element in the {@link collection}
 * or <b>null</b> if the {@link collection} <b>is empty</b>
 *
 * @param collection The nullable collection
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault()
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedOrNullByArray<const T, >(collection: Nullable<readonly T[]>,): NullOr<T>
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 * or <b>null</b> otherwise
 *
 * @param collection The nullable collection
 * @param predicate  The matching predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedOrNullByArray<const T, const S extends T, >(collection: Nullable<readonly T[]>, predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 * or <b>null</b> otherwise
 *
 * @param collection The nullable collection
 * @param predicate  The matching predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedOrNullByArray<const T, >(collection: Nullable<readonly T[]>, predicate: Nullable<ReverseBooleanCallback<T>>,): NullOr<T>
export function lastIndexedOrNullByArray<const T, >(collection: Nullable<readonly T[]>, predicate?: Nullable<ReverseBooleanCallback<T>>,) {
    if (predicate == null)
        return getLastOrNullByArray(collection,)
    return findLastIndexedOrNullByArray(collection, predicate,)
}

//#endregion -------------------- Facade method --------------------
