/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}                                         from "../CollectionHolder"
import type {MinimalistCollectionHolder}                               from "../MinimalistCollectionHolder"
import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../type/callback"

import {getFirst, getFirstByArray, getFirstByCollectionHolder, getFirstByMinimalistCollectionHolder}                                 from "./getFirst"
import {findFirstIndexed, findFirstIndexedByArray, findFirstIndexedByCollectionHolder, findFirstIndexedByMinimalistCollectionHolder} from "./findFirstIndexed"

//#region -------------------- Facade method --------------------

/**
 * Get the first element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @throws NullCollectionHolderException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException The {@link collection} <b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
 * @alias CollectionHolder.getFirst
 * @extensionFunction
 * @facadeFunction
 */
export function firstIndexed<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>,): T
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The matching predicate
 * @throws NullCollectionHolderException             The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} <b>is empty</b>
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @alias CollectionHolder.findFirst
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function firstIndexed<const T, const S extends T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The matching predicate
 * @throwsNullCollectionHolderException              The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} <b>is empty</b>
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @alias CollectionHolder.findFirst
 * @extensionFunction
 * @facadeFunction
 */
export function firstIndexed<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: Nullable<ReverseBooleanCallback<T>>,): T
export function firstIndexed<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate?: Nullable<ReverseBooleanCallback<T>>,) {
    if (predicate == null)
        return getFirst(collection,)
    return findFirstIndexed(collection, predicate,)
}


/**
 * Get the first element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @throws NullCollectionHolderException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException The {@link collection} <b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
 * @alias CollectionHolder.getFirst
 * @extensionFunction
 * @facadeFunction
 */
export function firstIndexedByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): T
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The matching predicate
 * @throws NullCollectionHolderException             The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} <b>is empty</b>
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @alias CollectionHolder.findFirst
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function firstIndexedByMinimalistCollectionHolder<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The matching predicate
 * @throws NullCollectionHolderException             The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} <b>is empty</b>
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @alias CollectionHolder.findFirst
 * @extensionFunction
 * @facadeFunction
 */
export function firstIndexedByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<ReverseBooleanCallback<T>>,): T
export function firstIndexedByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate?: Nullable<ReverseBooleanCallback<T>>,) {
    if (predicate == null)
        return getFirstByMinimalistCollectionHolder(collection,)
    return findFirstIndexedByMinimalistCollectionHolder(collection, predicate,)
}

/**
 * Get the first element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @throws NullCollectionHolderException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
 * @alias CollectionHolder.getFirst
 * @extensionFunction
 * @facadeFunction
 */
export function firstIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): T
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The matching predicate
 * @throws NullCollectionHolderException             The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @alias CollectionHolder.findFirst
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function firstIndexedByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The matching predicate
 * @throws NullCollectionHolderException             The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @alias CollectionHolder.findFirst
 * @extensionFunction
 * @facadeFunction
 */
export function firstIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<ReverseBooleanCallback<T>>,): T
export function firstIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate?: Nullable<ReverseBooleanCallback<T>>,) {
    if (predicate == null)
        return getFirstByCollectionHolder(collection,)
    return findFirstIndexedByCollectionHolder(collection, predicate,)
}

/**
 * Get the first element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @throws NullCollectionHolderException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException The {@link collection} <b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
 * @alias CollectionHolder.getFirst
 * @extensionFunction
 * @facadeFunction
 */
export function firstIndexedByArray<const T, >(collection: Nullable<readonly T[]>,): T
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The matching predicate
 * @throws NullCollectionHolderException             The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} <b>is empty</b>
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @alias CollectionHolder.findFirst
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function firstIndexedByArray<const T, const S extends T, >(collection: Nullable<readonly T[]>, predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The matching predicate
 * @throws NullCollectionHolderException             The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} <b>is empty</b>
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @alias CollectionHolder.findFirst
 * @extensionFunction
 * @facadeFunction
 */
export function firstIndexedByArray<const T, >(collection: Nullable<readonly T[]>, predicate: Nullable<ReverseBooleanCallback<T>>,): T
export function firstIndexedByArray<const T, >(collection: Nullable<readonly T[]>, predicate?: Nullable<ReverseBooleanCallback<T>>,) {
    if (predicate == null)
        return getFirstByArray(collection,)
    return findFirstIndexedByArray(collection, predicate,)
}

//#endregion -------------------- Facade method --------------------
