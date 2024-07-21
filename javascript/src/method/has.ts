/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {CollectionHolder}           from "../CollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Tell whenever the {@link value} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param value      The value to compare
 * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
 */
export function has<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, value: T,): boolean
/**
 * Tell whenever the {@link value} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param value      The value to compare
 * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
 */
export function has<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, value: unknown,): boolean
export function has<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, value: unknown,): boolean {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false

    return __has(collection, value, size,)
}

/**
 * Tell whenever the {@link value} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param value      The value to compare
 * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
 */
export function hasByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, value: T,): boolean
/**
 * Tell whenever the {@link value} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param value      The value to compare
 * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
 */
export function hasByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, value: unknown,): boolean
export function hasByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, value: unknown,): boolean {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false
    return __has(collection, value, collection.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __has(collection: MinimalistCollectionHolder, value: unknown, size: number,) {
    let index = -1
    while (++index < size)
        if (collection.get(index,) === value)
            return true
    return false
}

//#endregion -------------------- Loop methods --------------------
