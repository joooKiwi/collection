/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}             from "../CollectionHolder"
import type {ValueIndexWithReturnCallback} from "../CollectionHolder.types"
import type {NonEmptyCollectionHolder}     from "../NonEmptyCollectionHolder"
import type {Nullable}                     from "../general type"

import {CollectionConstants} from "../CollectionConstants"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link CollectionHolder} applying a {@link transform} function
 * on each non-null element of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param transform  The given transform
 * @see ReadonlyArray.map
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map-not-null.html Kotlin mapNotNull(transform)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(selector)
 * @extensionFunction
 */
export function mapNotNull<const T, const U extends NonNullable<unknown>, >(collection: Nullable<CollectionHolder<T>>, transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection as NonEmptyCollectionHolder<T>, transform as (value: T,) => Nullable<U>,),)
    if (transform.length == 1)
    if (transform.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection as NonEmptyCollectionHolder<T>, transform,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(collection as NonEmptyCollectionHolder<T>, transform as () => Nullable<U>,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, const U extends NonNullable<unknown>, >(collection: NonEmptyCollectionHolder<T>, transform: () => Nullable<U>,) {
    const size = collection.size
    const newArray = [] as U[]
    let index = -1
    while (++index < size) {
        const value = transform()
        if (value == null)
            continue
        newArray.push(value,)
    }
    return newArray
}

function __with1Argument<const T, const U extends NonNullable<unknown>, >(collection: NonEmptyCollectionHolder<T>, transform: (value: T,) => Nullable<U>,) {
    const size = collection.size
    const newArray = [] as U[]
    let index = -1
    while (++index < size) {
        const value = transform(collection.get(index,),)
        if (value == null)
            continue
        newArray.push(value,)
    }
    return newArray
}

function __with2Argument<const T, const U extends NonNullable<unknown>, >(collection: NonEmptyCollectionHolder<T>, transform: (value: T, index: number,) => Nullable<U>,) {
    const size = collection.size
    const newArray = [] as U[]
    let index = -1
    while (++index < size) {
        const value = transform(collection.get(index,), index,)
        if (value == null)
            continue
        newArray.push(value,)
    }
    return newArray
}

//#endregion -------------------- Loop methods --------------------
