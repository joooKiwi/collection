/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder}                                         from "../CollectionHolder"
import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../CollectionHolder.types"
import type {Nullable, NullOr}                                         from "../general type"

/**
 * Get the first element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param callback The given predicate
 * @see ReadonlyArray.find
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find.html Kotlin find(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 *
 * @extensionFunction
 */
export function findIndexed<const T, const S extends T, >(collection: Nullable<CollectionHolder>, callback: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
/**
 * Get the first element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param callback The given predicate
 * @see ReadonlyArray.find
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find.html Kotlin find(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 *
 * @extensionFunction
 */
export function findIndexed<const T, >(collection: Nullable<CollectionHolder>, callback: ReverseBooleanCallback<T>,): NullOr<T>
export function findIndexed<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, callback: | ReverseBooleanCallback<T> | ReverseRestrainedBooleanCallback<T, S>,): NullOr<| T | S> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    const size = collection.size
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (callback(index, value,))
            return value
    }
    return null
}
