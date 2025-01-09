//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Nullable, NullOr} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get the first element in the {@link collection}
 * or <b>null</b> if it <b>is empty</b>
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
 * @extensionFunction
 */
export function getFirstOrNull<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>,): NullOr<T> {
    if (collection == null)
        return null
    if (isCollectionHolder<T>(collection,))
        return getFirstOrNullByCollectionHolder(collection,)
    if (isArray(collection,))
        return getFirstOrNullByArray(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return getFirstOrNullByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return getFirstOrNullByArray(collection,)
    return getFirstOrNullByMinimalistCollectionHolder(collection,)
}


/**
 * Get the first element in the {@link collection}
 * or <b>null</b> if it <b>is empty</b>
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
 * @extensionFunction
 */
export function getFirstOrNullByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): NullOr<T> {
    if (collection == null)
        return null

    const size = collection.size
    if (size == 0)
        return null
    return collection.get(0,)
}

/**
 * Get the first element in the {@link collection}
 * or <b>null</b> if it {@link CollectionHolder.isEmpty is empty}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
 * @extensionFunction
 */
export function getFirstOrNullByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): NullOr<T> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null
    if (0 in collection)
        return collection[0] as T
    return collection.get(0,)
}

/**
 * Get the first element in the {@link collection}
 * or <b>null</b> if it <b>is empty</b>
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
 * @extensionFunction
 */
export function getFirstOrNullByArray<const T, >(collection: Nullable<readonly T[]>,): NullOr<T> {
    if (collection == null)
        return null

    const size = collection.length
    if (size == 0)
        return null
    return collection[0] as T
}

//#endregion -------------------- Facade method --------------------
