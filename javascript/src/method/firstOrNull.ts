/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr} from "@joookiwi/type"

import type {CollectionHolder}                           from "../CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {MinimalistCollectionHolder}                 from "../MinimalistCollectionHolder"
import type {NonEmptyCollectionHolder}                   from "../NonEmptyCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Get the first element in the {@link collection}
 * or <b>null</b> if the {@link collection} <b>is empty</b>
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
 * @extensionFunction
 */
export function firstOrNull<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): NullOr<T>
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 * or <b>null</b> if the {@link collection} <b>is empty</b>
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The matching predicate
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function firstOrNull<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 * or <b>null</b> if the {@link collection} <b>is empty</b>
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The matching predicate
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 * @extensionFunction
 */
export function firstOrNull<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
export function firstOrNull<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (collection == null)
        return null

    const size = collection.size
    if (size == 0)
        return null

    if (predicate == null)
        return collection.get(0,)
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, size,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, size,)
    return __with0Argument(collection, predicate as () => boolean, size,)
}

/**
 * Get the first element in the {@link collection}
 * or <b>null</b> if the {@link collection} {@link CollectionHolder.isEmpty is empty}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
 * @extensionFunction
 */
export function firstOrNullByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): NullOr<T>
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 * or <b>null</b> if the {@link collection} {@link CollectionHolder.isEmpty is empty}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The matching predicate
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function firstOrNullByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 * or <b>null</b> if the {@link collection} {@link CollectionHolder.isEmpty is empty}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The matching predicate
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 * @extensionFunction
 */
export function firstOrNullByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
export function firstOrNullByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    if (predicate == null)
        return __withNoPredicate(collection as NonEmptyCollectionHolder<T>,)
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, collection.size,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, collection.size,)
    return __with0Argument(collection, predicate as () => boolean, collection.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __withNoPredicate<const T, >(collection: NonEmptyCollectionHolder<T>,) {
    if (0 in collection)
        return collection[0] as T
    return collection.get(0,)
}

function __with0Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: () => boolean, size: number,) {
    let index = -1
    while (++index < size)
        if (predicate())
            return collection.get(index,)
    return null
}

function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T,) => boolean, size: number,) {
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (predicate(value,))
            return value
    }
    return null
}

function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T, index: number,) => boolean, size: number,) {
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (predicate(value, index,))
            return value
    }
    return null
}

//#endregion -------------------- Loop methods --------------------
