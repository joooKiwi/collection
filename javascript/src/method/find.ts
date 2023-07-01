/*
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi
 *
 * This project is free to use.
 * All the right is reserved to the author of this project.
 */

import type {CollectionHolder}                           from "../CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {Nullable, NullOr}                           from "../general type"

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
export function find<const T, const S extends T, >(collection: Nullable<CollectionHolder>, callback: RestrainedBooleanCallback<T, S>,): NullOr<S>
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
export function find<const T, >(collection: Nullable<CollectionHolder>, callback: BooleanCallback<T>,): NullOr<T>
export function find<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, callback: | BooleanCallback<T> | RestrainedBooleanCallback<T, S>,): NullOr<| T | S> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    const size = collection.size
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (callback(value, index,))
            return value
    }
    return null
}
