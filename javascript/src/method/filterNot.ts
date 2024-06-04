/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}                           from "../CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {MinimalistCollectionHolder}                 from "../MinimalistCollectionHolder"

import {CollectionConstants} from "../CollectionConstants"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder}
 * not matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @see filter
 * @typescriptDefinition
 * @extensionFunction
 */
export function filterNot<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder}
 * not matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @see filter
 * @extensionFunction
 */
export function filterNot<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function filterNot<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection, predicate as (value: T,) => boolean, size,),)
    if (predicate.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection, predicate, size,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(collection, predicate as () => boolean, size,),)
}

/**
 * Get a new {@link CollectionHolder}
 * not matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @see filterByCollectionHolder
 * @typescriptDefinition
 * @extensionFunction
 */
export function filterNotByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder}
 * not matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @see filterByCollectionHolder
 * @extensionFunction
 */
export function filterNotByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function filterNotByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection, predicate as (value: T,) => boolean, collection.size,),)
    if (predicate.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection, predicate, collection.size,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(collection, predicate as () => boolean, collection.size,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: () => boolean, size: number,) {
    const newArray = [] as T[]
    let index = -1
    while (++index < size)
        if (!predicate())
            newArray.push(collection.get(index,),)
    return newArray
}

function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T,) => boolean, size: number,) {
    const newArray = [] as T[]
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (!predicate(value,))
            newArray.push(value,)
    }
    return newArray
}

function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T, index: number,) => boolean, size: number,) {
    const newArray = [] as T[]
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (!predicate(value, index,))
            newArray.push(value,)
    }
    return newArray
}

//#endregion -------------------- Loop methods --------------------
