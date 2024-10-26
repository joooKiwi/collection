/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}                           from "../CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {MinimalistCollectionHolder}                 from "../MinimalistCollectionHolder"

import {getLast, getLastByArray, getLastByCollectionHolder, getLastByMinimalistCollectionHolder}     from "./getLast"
import {findLast, findLastByArray, findLastByCollectionHolder, findLastByMinimalistCollectionHolder} from "./findLast"

//#region -------------------- Facade method --------------------

/**
 * Get the last element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @throws NullCollectionHolderException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException The {@link collection} <b</b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 * @extensionFunction
 * @facadeFunction
 */
export function last<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>,): T
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The matching predicate
 * @throws NullCollectionHolderException             The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function last<const T, const S extends T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The matching predicate
 * @throws NullCollectionHolderException             The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @extensionFunction
 * @facadeFunction
 */
export function last<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: Nullable<BooleanCallback<T>>,): T
export function last<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (predicate == null)
        return getLast(collection,)
    return findLast(collection, predicate,)
}


/**
 * Get the last element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @throws NullCollectionHolderException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException The {@link collection} <b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 * @extensionFunction
 * @facadeFunction
 */
export function lastByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): T
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @throws NullCollectionHolderException             The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function lastByMinimalistCollectionHolder<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @throws NullCollectionHolderException             The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @extensionFunction
 * @facadeFunction
 */
export function lastByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): T
export function lastByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (predicate == null)
        return getLastByMinimalistCollectionHolder(collection,)
    return findLastByMinimalistCollectionHolder(collection, predicate,)
}

/**
 * Get the last element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @throws NullCollectionHolderException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 * @extensionFunction
 * @facadeFunction
 */
export function lastByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): T
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @throws NullCollectionHolderException             The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function lastByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @throws NullCollectionHolderException             The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @extensionFunction
 * @facadeFunction
 */
export function lastByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): T
export function lastByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (predicate == null)
        return getLastByCollectionHolder(collection,)
    return findLastByCollectionHolder(collection, predicate,)
}

/**
 * Get the last element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @throws NullCollectionHolderException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException The {@link collection} <b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 * @extensionFunction
 * @facadeFunction
 */
export function lastByArray<const T, >(collection: Nullable<readonly T[]>,): T
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @throws NullCollectionHolderException             The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function lastByArray<const T, const S extends T, >(collection: Nullable<readonly T[]>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @throws NullCollectionHolderException             The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @extensionFunction
 * @facadeFunction
 */
export function lastByArray<const T, >(collection: Nullable<readonly T[]>, predicate: Nullable<BooleanCallback<T>>,): T
export function lastByArray<const T, >(collection: Nullable<readonly T[]>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (predicate == null)
        return getLastByArray(collection,)
    return findLastByArray(collection, predicate,)
}

//#endregion -------------------- Facade method --------------------
