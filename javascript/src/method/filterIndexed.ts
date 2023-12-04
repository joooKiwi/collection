/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                                         from "../CollectionHolder"
import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../CollectionHolder.types"
import type {NonEmptyCollectionHolder}                                 from "../NonEmptyCollectionHolder"
import type {Nullable}                                                 from "../general type"

import {CollectionConstants} from "../CollectionConstants"

//#region -------------------- Facade method --------------------

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
export function filterIndexed<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
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
export function filterIndexed<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
export function filterIndexed<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    if (predicate.length === 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection as NonEmptyCollectionHolder<T>, predicate as (index: number,) => boolean,),)
    if (predicate.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection as NonEmptyCollectionHolder<T>, predicate,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(collection as NonEmptyCollectionHolder<T>, predicate as () => boolean,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, >(collection: NonEmptyCollectionHolder<T>, predicate: () => boolean,) {
    const newArray = [] as T[]
    const size = collection.size
    let index = -1
    while (++index < size)
        if (predicate())
            newArray.push(collection.get(index,),)
    return newArray
}

function __with1Argument<const T, >(collection: NonEmptyCollectionHolder<T>, predicate: (index: number,) => boolean,) {
    const newArray = [] as T[]
    const size = collection.size
    let index = -1
    while (++index < size)
        if (predicate(index,))
            newArray.push(collection.get(index,),)
    return newArray
}

function __with2Argument<const T, >(collection: NonEmptyCollectionHolder<T>, predicate: (index: number, value: T,) => boolean,) {
    const newArray = [] as T[]
    const size = collection.size
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (predicate(index, value,))
            newArray.push(value,)
    }
    return newArray
}

//#endregion -------------------- Loop methods --------------------
