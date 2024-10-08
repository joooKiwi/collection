/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}                           from "../CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {MinimalistCollectionHolder}                 from "../MinimalistCollectionHolder"

import {CollectionConstants}           from "../CollectionConstants"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder} having the first elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link CollectionHolder}, {@link MinimalistCollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
 * @typescriptDefinition
 */
export function takeWhile<const T, const S extends T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} having the first elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link CollectionHolder}, {@link MinimalistCollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
 */
export function takeWhile<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function takeWhile<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return takeWhileByCollectionHolder(collection, predicate,)
    if (isArray(collection,))
        return takeWhileByArray(collection, predicate,)
    if (isCollectionHolderByStructure<T>(collection,))
        return takeWhileByCollectionHolder(collection, predicate,)
    if (isArrayByStructure<T>(collection,))
        return takeWhileByArray(collection, predicate,)
    return takeWhileByMinimalistCollectionHolder(collection, predicate,)
}


/**
 * Get a new {@link CollectionHolder} having the first elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
 * @typescriptDefinition
 */
export function takeWhileByMinimalistCollectionHolder<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} having the first elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
 */
export function takeWhileByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function takeWhileByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection, size, predicate as (value: T,) => boolean,),)
    if (predicate.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection, size, predicate,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(collection, size, predicate as () => boolean,),)
}

/**
 * Get a new {@link CollectionHolder} having the first elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
 * @typescriptDefinition
 */
export function takeWhileByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} having the first elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
 */
export function takeWhileByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function takeWhileByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection, collection.size, predicate as (value: T,) => boolean,),)
    if (predicate.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2Argument(collection, collection.size, predicate,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0Argument(collection, collection.size, predicate as () => boolean,),)
}

/**
 * Get a new {@link CollectionHolder} having the first elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
 * @typescriptDefinition
 */
export function takeWhileByArray<const T, const S extends T, >(collection: Nullable<readonly T[]>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} having the first elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
 */
export function takeWhileByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function takeWhileByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.length
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1ArgumentByArray(collection, size, predicate as (value: T,) => boolean,),)
    if (predicate.length >= 2)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with2ArgumentByArray(collection, size, predicate,),)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __with0ArgumentByArray(collection, size, predicate as () => boolean,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, >(collection: MinimalistCollectionHolder<T>, size: number, predicate: () => boolean,): readonly T[] {
    const newArray: T[] = []
    let index = -1
    while (++index < size)
        if (!predicate())
            break
        else
            newArray.push(collection.get(index,),)
    return newArray
}

function __with0ArgumentByArray<const T, >(collection: readonly T[], size: number, predicate: () => boolean,): readonly T[] {
    const newArray: T[] = []
    let index = -1
    while (++index < size)
        if (!predicate())
            break
        else
            newArray.push(collection[index] as T,)
    return newArray
}


function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, size: number, predicate: (value: T,) => boolean,): readonly T[] {
    const newArray: T[] = []
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (!predicate(value,))
            break
        else
            newArray.push(value,)
    }
    return newArray
}

function __with1ArgumentByArray<const T, >(collection: readonly T[], size: number, predicate: (value: T,) => boolean,): readonly T[] {
    const newArray: T[] = []
    let index = -1
    while (++index < size) {
        const value = collection[index] as T
        if (!predicate(value,))
            break
        else
            newArray.push(value,)
    }
    return newArray
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, size: number, predicate: (value: T, index: number,) => boolean,): readonly T[] {
    const newArray: T[] = []
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (!predicate(value, index,))
            break
        else
            newArray.push(value,)
    }
    return newArray
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], size: number, predicate: (value: T, index: number,) => boolean,): readonly T[] {
    const newArray: T[] = []
    let index = -1
    while (++index < size) {
        const value = collection[index] as T
        if (!predicate(value, index,))
            break
        else
            newArray.push(value,)
    }
    return newArray
}

//#endregion -------------------- Loop methods --------------------
