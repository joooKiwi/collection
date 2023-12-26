/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {Nullable}                                   from "../general type"
import type {NonEmptyCollectionHolder}                   from "../NonEmptyCollectionHolder"
import type {NonEmptySimplisticCollectionHolder}         from "../NonEmptySimplisticCollectionHolder"
import type {SimplisticCollectionHolder}                 from "../SimplisticCollectionHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "../exception/EmptyCollectionHolderException"

//#region -------------------- Facade method --------------------

/**
 * Get the first element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @throws TypeError                      The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException The {@link collection} {@link SimplisticCollectionHolder.isEmpty is empty}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html Kotlin first()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
 * @extensionFunction
 */
export function first<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>,): T
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @param predicate  The matching predicate
 * @throws TypeError                                 The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link SimplisticCollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function first<const T, const S extends T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
/**
 * Get the first element in the {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @param predicate  The matching predicate
 * @throws TypeError                                 The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link SimplisticCollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html Kotlin first(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
 * @extensionFunction
 */
export function first<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): T
export function first<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (collection == null)
        throw new TypeError("No element could be retrieved from a null collection.",) // TODO change to custom exception
    if (collection.isEmpty)
        throw new EmptyCollectionHolderException("No element at the index 0 could be found since it it empty.",)

    if (predicate == null)
        return __withNoPredicate(collection as NonEmptyCollectionHolder<T>,)
    if (predicate.length == 1)
        return __with1Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate as (value: T,) => boolean,)
    if (predicate.length >= 2)
        return __with2Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate,)
    return __with0Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate as () => boolean,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __withNoPredicate<const T, >(collection: NonEmptyCollectionHolder<T>,) {
    if (0 in collection)
        return collection[0] as T
    return collection.get(0,)
}

function __with0Argument<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, predicate: () => boolean,) {
    const size = collection.size
    let index = -1
    while (++index < size)
        if (predicate())
            return collection.get(index,)
    throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0,)
}

function __with1Argument<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, predicate: (value: T,) => boolean,) {
    const size = collection.size
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (predicate(value,))
            return value
    }
    throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0,)
}

function __with2Argument<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, predicate: (value: T, index: number,) => boolean,) {
    const size = collection.size
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (predicate(value, index,))
            return value
    }
    throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0,)
}

//#endregion -------------------- Loop methods --------------------
