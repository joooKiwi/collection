/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                                         from "../CollectionHolder"
import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../CollectionHolder.types"
import type {Nullable}                                                 from "../general type"
import type {NonEmptySimplisticCollectionHolder}                       from "../NonEmptySimplisticCollectionHolder"
import type {SimplisticCollectionHolder}                               from "../SimplisticCollectionHolder"

import {CollectionConstants} from "../CollectionConstants"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder}
 * not matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @see filterIndexed
 * @typescriptDefinition
 * @extensionFunction
 */
export function filterIndexedNot<const T, const S extends T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder}
 * not matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @see filterIndexed
 * @extensionFunction
 */
export function filterIndexedNot<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
export function filterIndexedNot<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate as (index: number,) => boolean,),)
    if (predicate.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate as () => boolean,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, predicate: () => boolean,) {
    const newArray = [] as T[]
    const size = collection.size
    let index = -1
    while (++index < size)
        if (!predicate())
            newArray.push(collection.get(index,),)
    return newArray
}

function __with1Argument<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, predicate: (index: number,) => boolean,) {
    const newArray = [] as T[]
    const size = collection.size
    let index = -1
    while (++index < size)
        if (!predicate(index,))
            newArray.push(collection.get(index,),)
    return newArray
}

function __with2Argument<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, predicate: (index: number, value: T,) => boolean,) {
    const newArray = [] as T[]
    const size = collection.size
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (!predicate(index, value,))
            newArray.push(value,)
    }
    return newArray
}

//#endregion -------------------- Loop methods --------------------
