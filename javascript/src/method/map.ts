/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}             from "../CollectionHolder"
import type {ValueIndexWithReturnCallback} from "../CollectionHolder.types"
import type {MinimalistCollectionHolder}   from "../MinimalistCollectionHolder"

import {CollectionConstants} from "../CollectionConstants"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link CollectionHolder} applying a {@link transform} function
 * on each element of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param transform  The given transform
 * @see ReadonlyArray.map
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html Kotlin map(transform)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
 * @extensionFunction
 */
export function map<const T, const U, >(collection: Nullable<MinimalistCollectionHolder<T>>, transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    if (transform.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection, transform as (value: T,) => U, size,),)
    if (transform.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection, transform, size,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(transform as () => U, size,),)
}

/**
 * Create a new {@link CollectionHolder} applying a {@link transform} function
 * on each element of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param transform  The given transform
 * @see ReadonlyArray.map
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html Kotlin map(transform)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
 * @extensionFunction
 */
export function mapByCollectionHolder<const T, const U, >(collection: Nullable<CollectionHolder<T>>, transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    if (transform.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection, transform as (value: T,) => U, collection.size,),)
    if (transform.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection, transform, collection.size,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(transform as () => U, collection.size,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const U, >(transform: () => U, size: number,) {
    const newArray = new Array<U>(size,)
    let index = -1
    while (++index < size)
        newArray[index] = transform()
    return newArray
}

function __with1Argument<const T, const U, >(collection: MinimalistCollectionHolder<T>, transform: (value: T,) => U, size: number,) {
    const newArray = new Array<U>(size,)
    let index = -1
    while (++index < size)
        newArray[index] = transform(collection.get(index,),)
    return newArray
}

function __with2Argument<const T, const U, >(collection: MinimalistCollectionHolder<T>, transform: (value: T, index: number,) => U, size: number,) {
    const newArray = new Array<U>(size,)
    let index = -1
    while (++index < size)
        newArray[index] = transform(collection.get(index,), index,)
    return newArray
}

//#endregion -------------------- Loop methods --------------------
