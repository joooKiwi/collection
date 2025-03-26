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

import {getFirst, getFirstByArray, getFirstByCollectionHolder, getFirstByMinimalistCollectionHolder}     from "./getFirst"
import {findFirst, findFirstByArray, findFirstByCollectionHolder, findFirstByMinimalistCollectionHolder} from "./findFirst"

//#region -------------------- Facade method --------------------

/**
 * Get the first element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @throws NullCollectionException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException The {@link collection} <b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
 * @alias CollectionHolder.getFirst
 * @extensionFunction
 * @facadeFunction
 */
export function first<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,): T
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The matching predicate
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @alias CollectionHolder.findFirst
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function first<const T, const S extends T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The matching predicate
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @alias CollectionHolder.findFirst
 * @extensionFunction
 * @facadeFunction
 */
export function first<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: Nullable<BooleanCallback<T>>,): T
export function first<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (predicate == null)
        return getFirst(collection,)
    return findFirst(collection, predicate,)
}


/**
 * Get the first element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @throws NullCollectionException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException The {@link collection} <b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
 * @alias CollectionHolder.getFirst
 * @extensionFunction
 * @facadeFunction
 */
export function firstByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): T
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The matching predicate
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @alias CollectionHolder.findFirst
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function firstByMinimalistCollectionHolder<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The matching predicate
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @alias CollectionHolder.findFirst
 * @extensionFunction
 * @facadeFunction
 */
export function firstByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): T
export function firstByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (predicate == null)
        return getFirstByMinimalistCollectionHolder(collection,)
    return findFirstByMinimalistCollectionHolder(collection, predicate,)
}

/**
 * Get the first element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @throws NullCollectionException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
 * @alias CollectionHolder.getFirst
 * @extensionFunction
 * @facadeFunction
 */
export function firstByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): T
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The matching predicate
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @alias CollectionHolder.findFirst
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function firstByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The matching predicate
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @alias CollectionHolder.findFirst
 * @extensionFunction
 * @facadeFunction
 */
export function firstByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): T
export function firstByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (predicate == null)
        return getFirstByCollectionHolder(collection,)
    return findFirstByCollectionHolder(collection, predicate,)
}

/**
 * Get the first element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @throws NullCollectionException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException The {@link collection} <b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
 * @alias CollectionHolder.getFirst
 * @extensionFunction
 * @facadeFunction
 */
export function firstByArray<const T, >(collection: Nullable<readonly T[]>,): T
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The matching predicate
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @alias CollectionHolder.findFirst
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function firstByArray<const T, const S extends T, >(collection: Nullable<readonly T[]>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The matching predicate
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @alias CollectionHolder.findFirst
 * @extensionFunction
 * @facadeFunction
 */
export function firstByArray<const T, >(collection: Nullable<readonly T[]>, predicate: Nullable<BooleanCallback<T>>,): T
export function firstByArray<const T, >(collection: Nullable<readonly T[]>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (predicate == null)
        return getFirstByArray(collection,)
    return findFirstByArray(collection, predicate,)
}

//#endregion -------------------- Facade method --------------------
