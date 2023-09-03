/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                           from "../CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {Nullable}                                   from "../general type"

import {firstOrNull} from "./firstOrNull"

/**
 * Get the first element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @throws {TypeError} The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws {ReferenceError} The first element was <b>null</b> or <b>undefined</b>
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html Kotlin first()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
 * @extensionFunction
 */
export function first<const T, >(collection: Nullable<CollectionHolder<T>>,): NonNullable<T>
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate The matching predicate
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @throws {TypeError} The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws {ReferenceError}  The first element found was <b>null</b> or <b>undefined</b>
 * @extensionFunction
 */
export function first<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate The matching predicate
 * @throws {TypeError} The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws {ReferenceError}  The first element found was <b>null</b> or <b>undefined</b>
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @extensionFunction
 */
export function first<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
export function first<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
    if (collection == null)
        throw new TypeError("No element could be retrieved from a null value.",)
    if (collection.isEmpty)
        throw new ReferenceError("No element at the index 0 could be found since it it empty.",)
    if (predicate == null) {
        const element = firstOrNull(collection,)
        if (element == null)
            throw new ReferenceError("The first element is null in the collection.",)
        return element
    }
    const element = firstOrNull(collection, predicate,)
    if (element == null)
        throw new ReferenceError("The first element (with filter) is null in the collection.",)
    return element
}
