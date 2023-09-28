/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                           from "../CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {Nullable}                                   from "../general type"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"

/**
 * Get the last element in the current {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @throws {ReferenceError} The {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
 * @throws {ReferenceError} The element was <b>null</b> or <b>undefined</b>
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 * @extensionFunction
 */
export function last<const T, >(collection: Nullable<CollectionHolder<T>>,): T
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
 * @extensionFunction
 */
export function last<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
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
 * @extensionFunction
 */
export function last<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): T
export function last<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
    if (collection == null)
        throw new TypeError("No element could be retrieved from a null value.",)
    if (collection.isEmpty) {
        const size = collection.size
        throw new CollectionHolderIndexOutOfBoundsException(`No element at the index ${size} could be found since it it empty.`, size,)
    }

    if (predicate == null) {
        const lastIndex = collection.size - 1
        if (lastIndex in collection)
            return collection[lastIndex]
        return collection.get(lastIndex,)
    }

    const size = collection.size
    let index = size
    while (index-- > 0) {
        const value = collection.get(index,)
        if (predicate(value, index,))
            return value
    }
    throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", size,)
}
