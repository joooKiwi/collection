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

import {getLast, getLastByArray, getLastByCollectionHolder, getLastByMinimalistCollectionHolder}                                 from "./getLast"
import {findLastIndexed, findLastIndexedByArray, findLastIndexedByCollectionHolder, findLastIndexedByMinimalistCollectionHolder} from "./findLastIndexed"

//#region -------------------- Facade method --------------------

/**
 * Get the last element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @throws NullCollectionException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException The {@link collection} <b</b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexed<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,): T
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The matching predicate
 * @throws NullCollectionException   The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexed<const T, const S extends T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The matching predicate
 * @throws NullCollectionException   The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexed<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: Nullable<ReverseBooleanCallback<T>>,): T
export function lastIndexed<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate?: Nullable<ReverseBooleanCallback<T>>,) {
    if (predicate == null)
        return getLast(collection,)
    return findLastIndexed(collection, predicate,)
}


/**
 * Get the last element in the {@link collection}
 *
 * @param collection The nullable collection
 * @throws NullCollectionException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException The {@link collection} <b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): T
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @throws NullCollectionException   The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedByMinimalistCollectionHolder<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @throws NullCollectionException   The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<ReverseBooleanCallback<T>>,): T
export function lastIndexedByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate?: Nullable<ReverseBooleanCallback<T>>,) {
    if (predicate == null)
        return getLastByMinimalistCollectionHolder(collection,)
    return findLastIndexedByMinimalistCollectionHolder(collection, predicate,)
}

/**
 * Get the last element in the {@link collection}
 *
 * @param collection The nullable collection
 * @throws NullCollectionException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): T
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @throws NullCollectionException   The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S

/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @throws NullCollectionException   The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<ReverseBooleanCallback<T>>,): T
export function lastIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate?: Nullable<ReverseBooleanCallback<T>>,) {
    if (predicate == null)
        return getLastByCollectionHolder(collection,)
    return findLastIndexedByCollectionHolder(collection, predicate,)
}

/**
 * Get the last element in the {@link collection}
 *
 * @param collection The nullable collection
 * @throws NullCollectionException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException The {@link collection} <b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedByArray<const T, >(collection: Nullable<readonly T[]>,): T
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @throws NullCollectionException   The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedByArray<const T, const S extends T, >(collection: Nullable<readonly T[]>, predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @throws NullCollectionException   The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @extensionFunction
 * @facadeFunction
 */
export function lastIndexedByArray<const T, >(collection: Nullable<readonly T[]>, predicate: Nullable<ReverseBooleanCallback<T>>,): T
export function lastIndexedByArray<const T, >(collection: Nullable<readonly T[]>, predicate?: Nullable<ReverseBooleanCallback<T>>,) {
    if (predicate == null)
        return getLastByArray(collection,)
    return findLastIndexedByArray(collection, predicate,)
}

//#endregion -------------------- Facade method --------------------
