/*
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi
 *
 * This project is free to use.
 * All the right is reserved to the author of this project.
 */

import type {CollectionHolder} from "../CollectionHolder"
import type {BooleanCallback}  from "../CollectionHolder.types"
import type {Nullable}         from "../general type"

/**
 * Tell if the {@link collection} {@link CollectionHolder.isNotEmpty is not empty}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @returns {boolean} <b>false</b> if null is received or {@link CollectionHolder.isNotEmpty} otherwise
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html Kotlin any()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any()
 *
 * @extensionFunction
 */
export function any<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["isNotEmpty"]
/**
 * Check if <b>one</b> of the elements in the {@link collection}
 * match the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate The matching predicate
 * @returns {boolean} <b>true</b> if at least one {@link predicate} is true on a value of the {@link collection}
 * @see ReadonlyArray.some
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html Kotlin any(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any(predicate)
 *
 * @extensionFunction
 */
export function any<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): boolean
export function any<const T, >(collection: Nullable<CollectionHolder<T>>, callback?: Nullable<BooleanCallback<T>>,): boolean {
    if (collection == null)
        return false
    if (callback == null)
        return collection.isNotEmpty
    if (collection.isEmpty)
        return false

    const size = collection.size
    let index = -1
    while (++index < size)
        if (callback(collection.get(index,), index,))
            return true
    return false
}
