//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}                           from "../CollectionHolder"
import type {MinimalistCollectionHolder}                 from "../MinimalistCollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../type/callback"

import {EmptyCollectionException}      from "../exception/EmptyCollectionException"
import {IndexOutOfBoundsException}     from "../exception/IndexOutOfBoundsException"
import {NullCollectionException}       from "../exception/NullCollectionException"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @throws NullCollectionException   The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function findLast<const T, const S extends T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: RestrainedBooleanCallback<T, S>,): S
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @throws NullCollectionException   The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @extensionFunction
 */
export function findLast<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>,): T
export function findLast<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        throw new NullCollectionException()
    if (isCollectionHolder(collection,))
        return findLastByCollectionHolder(collection, predicate,)
    if (isArray(collection,))
        return findLastByArray(collection, predicate,)
    if (isMinimalistCollectionHolder(collection,))
        return findLastByMinimalistCollectionHolder(collection, predicate,)

    if (isCollectionHolderByStructure<T>(collection,))
        return findLastByCollectionHolder(collection, predicate,)
    if (isArrayByStructure<T>(collection,))
        return findLastByArray(collection, predicate,)
    return findLastByMinimalistCollectionHolder(collection, predicate,)
}


/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @throws NullCollectionException   The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function findLastByMinimalistCollectionHolder<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): S
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @throws NullCollectionException   The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @extensionFunction
 */
export function findLastByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,): T
export function findLastByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        throw new NullCollectionException()

    const size = collection.size
    if (size == 0)
        throw new EmptyCollectionException()
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, size,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, size,)
    return __with0Argument(collection, predicate as () => boolean, size,)
}

/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @throws NullCollectionException   The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function findLastByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): S
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @throws NullCollectionException   The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @extensionFunction
 */
export function findLastByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,): T
export function findLastByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        throw new NullCollectionException()
    if (collection.isEmpty)
        throw new EmptyCollectionException()
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, collection.size,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, collection.size,)
    return __with0Argument(collection, predicate as () => boolean, collection.size,)
}

/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @throws NullCollectionException   The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function findLastByArray<const T, const S extends T, >(collection: Nullable<readonly T[]>, predicate: RestrainedBooleanCallback<T, S>,): S
/**
 * Find the last element from the {@link predicate} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @throws NullCollectionException   The {@link collection} is <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
 * @extensionFunction
 */
export function findLastByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>,): T
export function findLastByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        throw new NullCollectionException()

    const size = collection.length
    if (size == 0)
        throw new EmptyCollectionException()
    if (predicate.length == 1)
        return __with1ArgumentByArray(collection, predicate as (value: T,) => boolean, size,)
    if (predicate.length >= 2)
        return __with2ArgumentByArray(collection, predicate, size,)
    return __with0ArgumentByArray(collection, predicate as () => boolean, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: () => boolean, size: number,) {
    let index = size
    while (index-- > 0)
        if (predicate())
            return collection.get(index,)
    throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLast” predicate received in the collection.", size - 1,)
}

function __with0ArgumentByArray<const T, >(collection: readonly T[], predicate: () => boolean, size: number,) {
    let index = size
    while (index-- > 0)
        if (predicate())
            return collection[index] as T
    throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLast” predicate received in the collection.", size - 1,)
}


function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T,) => boolean, size: number,) {
    let index = size
    while (index-- > 0) {
        const value = collection.get(index,)
        if (predicate(value,))
            return value
    }
    throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLast” predicate received in the collection.", size - 1,)
}

function __with1ArgumentByArray<const T, >(collection: readonly T[], predicate: (value: T,) => boolean, size: number,) {
    let index = size
    while (index-- > 0) {
        const value = collection[index] as T
        if (predicate(value,))
            return value
    }
    throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLast” predicate received in the collection.", size - 1,)
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T, index: number,) => boolean, size: number,) {
    let index = size
    while (index-- > 0) {
        const value = collection.get(index,)
        if (predicate(value, index,))
            return value
    }
    throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLast” predicate received in the collection.", size - 1,)
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], predicate: (value: T, index: number,) => boolean, size: number,) {
    let index = size
    while (index-- > 0) {
        const value = collection[index] as T
        if (predicate(value, index,))
            return value
    }
    throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLast” predicate received in the collection.", size - 1,)
}

//#endregion -------------------- Loop methods --------------------
