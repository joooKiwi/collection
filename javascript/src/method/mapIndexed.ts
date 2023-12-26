/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}             from "../CollectionHolder"
import type {IndexValueWithReturnCallback} from "../CollectionHolder.types"
import type {NonEmptyCollectionHolder}     from "../NonEmptyCollectionHolder"
import type {Nullable}                     from "../general type"

import {CollectionConstants} from "../CollectionConstants"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link CollectionHolder} applying a {@link transform} function
 * on each element of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param transform  The given transform
 * @see ReadonlyArray.map
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map-indexed.html Kotlin mapIndexed(transform)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(selector)
 * @extensionFunction
 */
export function mapIndexed<const T, const U, >(collection: Nullable<CollectionHolder<T>>, transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection as NonEmptyCollectionHolder<T>, transform as (index: number,) => U,),)
    if (transform.length == 1)
    if (transform.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection as NonEmptyCollectionHolder<T>, transform,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(collection as NonEmptyCollectionHolder<T>, transform as () => U,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, const U, >(collection: NonEmptyCollectionHolder<T>, transform: () => U,) {
    const size = collection.size
    const newArray = new Array<U>(size,)
    let index = -1
    while (++index < size)
        newArray[index] = transform()
    return newArray
}

function __with1Argument<const T, const U, >(collection: NonEmptyCollectionHolder<T>, transform: (index: number,) => U,) {
    const size = collection.size
    const newArray = new Array<U>(size,)
    let index = -1
    while (++index < size)
        newArray[index] = transform(index,)
    return newArray
}

function __with2Argument<const T, const U, >(collection: NonEmptyCollectionHolder<T>, transform: (index: number, value: T,) => U,) {
    const size = collection.size
    const newArray = new Array<U>(size,)
    let index = -1
    while (++index < size)
        newArray[index] = transform(index, collection.get(index,),)
    return newArray
}

//#endregion -------------------- Loop methods --------------------
