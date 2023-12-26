/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                           from "../CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {NonEmptyCollectionHolder}                   from "../NonEmptyCollectionHolder"
import type {Nullable}                                   from "../general type"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "../exception/EmptyCollectionHolderException"

//#region -------------------- Facade method --------------------

/**
 * Get the last element in the current {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @throws TypeError                      The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 * @extensionFunction
 */
export function last<const T, >(collection: Nullable<CollectionHolder<T>>,): T
/**
 * Get the last element in the current {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The matching predicate
 * @throws TypeError                                 The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 * @typescriptDefinition
 * @extensionFunction
 */
export function last<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
/**
 * Get the last element in the current {@link collection}
 * matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The matching predicate
 * @throws TypeError                                 The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionHolderException            The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 * @extensionFunction
 */
export function last<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): T
export function last<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
    if (collection == null)
        throw new TypeError("No element could be retrieved from a null value.",)
    if (collection.isEmpty)
        throw new EmptyCollectionHolderException(`No element at the index ${collection.size - 1} could be found since it it empty.`,)

    if (predicate == null)
        return __withNoPredicate(collection as NonEmptyCollectionHolder<T>,)
        return __with1Argument(collection as NonEmptyCollectionHolder<T>, predicate as (value: T,) => boolean,)
    if (predicate.length == 1)
    if (predicate.length >= 2)
        return __with2Argument(collection as NonEmptyCollectionHolder<T>, predicate,)
    return __with0Argument(collection as NonEmptyCollectionHolder<T>, predicate as () => boolean,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __withNoPredicate<const T, >(collection: NonEmptyCollectionHolder<T>,) {
    const lastIndex = collection.size - 1
    if (lastIndex in collection)
        return collection[lastIndex] as T
    return collection.get(lastIndex,)
}

function __with0Argument<const T, >(collection: NonEmptyCollectionHolder<T>, predicate: () => boolean,) {
    const size = collection.size
    let index = size
    while (index-- > 0)
        if (predicate())
            return collection.get(index,)
    throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", size - 1,)
}

function __with1Argument<const T, >(collection: NonEmptyCollectionHolder<T>, predicate: (value: T,) => boolean,) {
    const size = collection.size
    let index = size
    while (index-- > 0) {
        const value = collection.get(index,)
        if (predicate(value,))
            return value
    }
    throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", size - 1,)
}

function __with2Argument<const T, >(collection: NonEmptyCollectionHolder<T>, predicate: (value: T, index: number,) => boolean,) {
    const size = collection.size
    let index = size
    while (index-- > 0) {
        const value = collection.get(index,)
        if (predicate(value, index,))
            return value
    }
    throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", size - 1,)
}

//#endregion -------------------- Loop methods --------------------
