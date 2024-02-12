/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                           from "../CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {Nullable}                                   from "../general type"
import type {MinimalistCollectionHolder}                 from "../MinimalistCollectionHolder"
import type {NonEmptyCollectionHolder}                   from "../NonEmptyCollectionHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "../exception/EmptyCollectionHolderException"

//#region -------------------- Facade method --------------------

/**
 * Get the first element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @throws TypeError                      The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException The {@link collection} <b>is empty</b>
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html Kotlin first()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
 * @extensionFunction
 */
export function first<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): T
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The matching predicate
 * @throws TypeError                                 The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} <b>is empty</b>
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function first<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The matching predicate
 * @throws TypeError                                 The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} <b>is empty</b>
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @extensionFunction
 */
export function first<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): T
export function first<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (collection == null)
        throw new TypeError("No element could be retrieved from a null collection.",) // TODO change to custom exception

    const size = collection.size
    if (size == 0)
        throw new EmptyCollectionHolderException()

    if (predicate == null)
        return collection.get(0,)
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, size,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, size,)
    return __with0Argument(collection, predicate as () => boolean, size,)
}

/**
 * Get the first element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @throws TypeError                      The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html Kotlin first()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
 * @extensionFunction
 */
export function firstByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): T
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The matching predicate
 * @throws TypeError                                 The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function firstByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The matching predicate
 * @throws TypeError                                 The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @extensionFunction
 */
export function firstByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): T
export function firstByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (collection == null)
        throw new TypeError("No element could be retrieved from a null collection.",) // TODO change to custom exception
    if (collection.isEmpty)
        throw new EmptyCollectionHolderException()

    if (predicate == null)
        return __withNoPredicate(collection as NonEmptyCollectionHolder<T>,)
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, collection.size,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, collection.size,)
    return __with0Argument(collection, predicate as () => boolean, collection.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __withNoPredicate<const T, >(collection: NonEmptyCollectionHolder<T>,) {
    if (0 in collection)
        return collection[0] as T
    return collection.get(0,)
}

function __with0Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: () => boolean, size: number,) {
    let index = -1
    while (++index < size)
        if (predicate())
            return collection.get(index,)
    throw new CollectionHolderIndexOutOfBoundsException("Index out of bound. No element could be found from the filter predicate received in the collection.", 0,)
}

function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T,) => boolean, size: number,) {
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (predicate(value,))
            return value
    }
    throw new CollectionHolderIndexOutOfBoundsException("Index out of bound. No element could be found from the filter predicate received in the collection.", 0,)
}

function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T, index: number,) => boolean, size: number,) {
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (predicate(value, index,))
            return value
    }
    throw new CollectionHolderIndexOutOfBoundsException("Index out of bound. No element could be found from the filter predicate received in the collection.", 0,)
}

//#endregion -------------------- Loop methods --------------------
