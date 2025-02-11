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

import {CollectionConstants}           from "../CollectionConstants"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link CollectionHolder}, {@link MinimalistCollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeWhile(predicate)
 * @typescriptDefinition
 */
export function takeLastWhile<const T, const S extends T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link CollectionHolder}, {@link MinimalistCollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
 */
export function takeLastWhile<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function takeLastWhile<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return takeLastWhileByCollectionHolder(collection, predicate,)
    if (isArray(collection,))
        return takeLastWhileByArray(collection, predicate,)
    if (isCollectionHolderByStructure<T>(collection,))
        return takeLastWhileByCollectionHolder(collection, predicate,)
    if (isArrayByStructure<T>(collection,))
        return takeLastWhileByArray(collection, predicate,)
    return takeLastWhileByMinimalistCollectionHolder(collection, predicate,)
}


/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
 * @typescriptDefinition
 */
export function takeLastWhileByMinimalistCollectionHolder<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
 */
export function takeLastWhileByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function takeLastWhileByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,) {
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
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
 * @typescriptDefinition
 */
export function takeLastWhileByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
 */
export function takeLastWhileByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function takeLastWhileByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,) {
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
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
 * @typescriptDefinition
 */
export function takeLastWhileByArray<const T, const S extends T, >(collection: Nullable<readonly T[]>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
 */
export function takeLastWhileByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function takeLastWhileByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>,) {
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
    let index = size
    while (--index >= 0)
        if (!predicate()) {
            const newSize = size - index - 1
            if (newSize === 0)
                return CollectionConstants.EMPTY_ARRAY
            if (newSize === 1)
                return [collection.get(index + 1,),]
            const newArrayFromIndexToLast = new Array<T>(newSize,)
            let indexAdded = 0
            while (++index < size)
                newArrayFromIndexToLast[indexAdded++] = collection.get(index,)
            return newArrayFromIndexToLast
        }

    const newArray = new Array<T>(size,)
    while (++index < size)
        newArray[index] = collection.get(index,)
    return newArray
}

function __with0ArgumentByArray<const T, >(collection: readonly T[], size: number, predicate: () => boolean,): readonly T[] {
    let index = size
    while (--index >= 0)
        if (!predicate()) {
            const newSize = size - index - 1
            if (newSize === 0)
                return CollectionConstants.EMPTY_ARRAY
            if (newSize === 1)
                return [collection[index + 1] as T,]
            const newArrayFromIndexToLast = new Array<T>(newSize,)
            let indexAdded = 0
            while (++index < size)
                newArrayFromIndexToLast[indexAdded++] = collection[index] as T
            return newArrayFromIndexToLast
        }
    return collection
}


function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, size: number, predicate: (value: T,) => boolean,): readonly T[] {
    const newArray = new Array<T>(size,)
    let index = size
    while (--index >= 0)
        if (!predicate(newArray[index] = collection.get(index,),)) {
            const newSize = size - index - 1
            if (newSize === 0)
                return CollectionConstants.EMPTY_ARRAY
            if (newSize === 1)
                return [newArray[index + 1] as T,]
            const newArrayFromIndexToLast = new Array<T>(newSize,)
            let indexAdded = 0
            while (++index < size)
                newArrayFromIndexToLast[indexAdded++] = newArray[index] as T
            return newArrayFromIndexToLast
        }
    return newArray
}

function __with1ArgumentByArray<const T, >(collection: readonly T[], size: number, predicate: (value: T,) => boolean,): readonly T[] {
    const newArray = new Array<T>(size,)
    let index = size
    while (--index >= 0)
        if (!predicate(newArray[index] = collection[index] as T,)) {
            const newSize = size - index - 1
            if (newSize === 0)
                return CollectionConstants.EMPTY_ARRAY
            if (newSize === 1)
                return [newArray[index + 1] as T,]
            const newArrayFromIndexToLast = new Array<T>(newSize,)
            let indexAdded = 0
            while (++index < size)
                newArrayFromIndexToLast[indexAdded++] = newArray[index] as T
            return newArrayFromIndexToLast
        }
    return newArray
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, size: number, predicate: (value: T, index: number,) => boolean,): readonly T[] {
    const newArray = new Array<T>(size,)
    let index = size
    while (--index >= 0)
        if (!predicate(newArray[index] = collection.get(index,), index,)) {
            const newSize = size - index - 1
            if (newSize === 0)
                return CollectionConstants.EMPTY_ARRAY
            if (newSize === 1)
                return [newArray[index + 1] as T,]
            const newArrayFromIndexToLast = new Array<T>(newSize,)
            let indexAdded = 0
            while (++index < size)
                newArrayFromIndexToLast[indexAdded++] = newArray[index] as T
            return newArrayFromIndexToLast
        }
    return newArray
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], size: number, predicate: (value: T, index: number,) => boolean,): readonly T[] {
    const newArray = new Array<T>(size,)
    let index = size
    while (--index >= 0)
        if (!predicate(newArray[index] = collection[index] as T, index,)) {
            const newSize = size - index - 1
            if (newSize === 0)
                return CollectionConstants.EMPTY_ARRAY
            if (newSize === 1)
                return [newArray[index + 1] as T,]
            const newArrayFromIndexToLast = new Array<T>(newSize,)
            let indexAdded = 0
            while (++index < size)
                newArrayFromIndexToLast[indexAdded++] = newArray[index] as T
            return newArrayFromIndexToLast
        }
    return newArray
}

//#endregion -------------------- Loop methods --------------------
