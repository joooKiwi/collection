/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                           from "../CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {Nullable, NullOr}                           from "../general type"

/**
 * Get the last element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate The given predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 *
 * @typescriptDefinition
 * @extensionFunction
 */
export function findLast<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
/**
 * Get the last element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate The given predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 *
 * @extensionFunction
 */
export function findLast<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,): NullOr<T>
export function findLast<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,): NullOr<| T | S> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    let index = collection.size
    while (index-- > 0) {
        const value = collection.get(index,)
        if (predicate(value, index,))
            return value
    }
    return null
}
