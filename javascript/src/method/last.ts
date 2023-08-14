/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                           from "../CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {Nullable}                                   from "../general type"

import {lastOrNull} from "./lastOrNull"

/**
 * Get the last element in the current {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @throws {ReferenceError} The {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
 * @throws {ReferenceError} The element was <b>null</b> or <b>undefined</b>
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 *
 * @extensionFunction
 */
export function last<const T, >(collection: CollectionHolder<T>,): NonNullable<T>
/**
 * Get the last element in the current {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate The matching predicate
 * @throws {ReferenceError} The {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
 * @throws {ReferenceError} The element was <b>null</b> or <b>undefined</b>
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 *
 * @extensionFunction
 */
export function last<const T, const S extends T, >(collection: CollectionHolder<T>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
/**
 * Get the last element in the current {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate The matching predicate
 * @throws {ReferenceError} The {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
 * @throws {ReferenceError} The element was <b>null</b> or <b>undefined</b>
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 *
 * @extensionFunction
 */
export function last<const T, >(collection: CollectionHolder<T>, predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
export function last<const T, const S extends T, >(collection: CollectionHolder<T>, predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
    if (collection.isEmpty)
        throw new ReferenceError("No element at the index 0 could be found since it it empty.",)
    if (predicate == null) {
        const element = lastOrNull(collection,)
        if (element == null)
            throw new ReferenceError("The last element is null in the collection.",)
        return element
    }
    const element = lastOrNull(collection, predicate,)
    if (element == null)
        throw new ReferenceError("The last element (with filter) is null in the collection.",)
    return element
}
