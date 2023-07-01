/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder}                           from "../CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {Nullable, NullOr}                           from "../general type"

import {getOrNull} from "./getOrNull"

/**
 * Get the first element in the {@link collection}
 * or <b>null</b> if the {@link collection} {@link CollectionHolder.isEmpty is empty}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
 *
 * @extensionFunction
 */
export function firstOrNull<const T, >(collection: Nullable<CollectionHolder<T>>,): NullOr<T>
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 * or <b>null</b> if the {@link collection} {@link CollectionHolder.isEmpty is empty}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate The matching predicate
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 *
 * @extensionFunction
 */
export function firstOrNull<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 * or <b>null</b> if the {@link collection} {@link CollectionHolder.isEmpty is empty}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate The matching predicate
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 *
 * @extensionFunction
 */
export function firstOrNull<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
export function firstOrNull<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null
    if (predicate != null)
        return collection.find(predicate,)

    return getOrNull(collection, 0,) as NullOr<T>
}
