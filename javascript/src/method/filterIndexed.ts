/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                                         from "../CollectionHolder"
import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../CollectionHolder.types"
import type {Nullable}                                                 from "../general type"
import type {MinimalistCollectionHolder}                               from "../MinimalistCollectionHolder"

import {CollectionConstants} from "../CollectionConstants"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder}
 * matching only the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-indexed.html Kotlin filterIndexed(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @see filterIndexedNot
 * @typescriptDefinition
 * @extensionFunction
 */
export function filterIndexed<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder}
 * matching only the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-indexed.html Kotlin filterIndexed(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @see filterIndexedNot
 * @extensionFunction
 */
export function filterIndexed<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
export function filterIndexed<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection, predicate as (index: number,) => boolean, size,),)
    if (predicate.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection, predicate, size,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(collection, predicate as () => boolean, size,),)
}

/**
 * Get a new {@link CollectionHolder}
 * matching only the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-indexed.html Kotlin filterIndexed(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @see filterIndexedNot
 * @typescriptDefinition
 * @extensionFunction
 */
export function filterIndexedByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder}
 * matching only the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-indexed.html Kotlin filterIndexed(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @see filterIndexedNot
 * @extensionFunction
 */
export function filterIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
export function filterIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection, predicate as (index: number,) => boolean, collection.size,),)
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
        if (predicate())
            newArray.push(collection.get(index,),)
    return newArray
}

function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (index: number,) => boolean, size: number,) {
    const newArray = [] as T[]
    let index = -1
    while (++index < size)
        if (predicate(index,))
            newArray.push(collection.get(index,),)
    return newArray
}

function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (index: number, value: T,) => boolean, size: number,) {
    const newArray = [] as T[]
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (predicate(index, value,))
            newArray.push(value,)
    }
    return newArray
}

//#endregion -------------------- Loop methods --------------------
