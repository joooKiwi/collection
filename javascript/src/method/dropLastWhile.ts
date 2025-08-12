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
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder} <b>not</b> having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link CollectionHolder}, {@link MinimalistCollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
 * @typescriptDefinition
 */
export function dropLastWhile<const T, const S extends T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} <b>not</b> having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link CollectionHolder}, {@link MinimalistCollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
 */
export function dropLastWhile<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function dropLastWhile<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder(collection,))
        return dropLastWhileByCollectionHolder(collection, predicate,)
    if (isArray(collection,))
        return dropLastWhileByArray(collection, predicate,)
    if (isMinimalistCollectionHolder(collection,))
        return dropLastWhileByMinimalistCollectionHolder(collection, predicate,)

    if (isCollectionHolderByStructure<T>(collection,))
        return dropLastWhileByCollectionHolder(collection, predicate,)
    if (isArrayByStructure<T>(collection,))
        return dropLastWhileByArray(collection, predicate,)
    return dropLastWhileByMinimalistCollectionHolder(collection, predicate,)
}


/**
 * Get a new {@link CollectionHolder} <b>not</b> having the last elements satisfying the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
 * @typescriptDefinition
 */
export function dropLastWhileByMinimalistCollectionHolder<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} <b>not</b> having the last elements satisfying the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
 */
export function dropLastWhileByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function dropLastWhileByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,) {
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
 * Get a new {@link CollectionHolder} <b>not</b> having the last elements satisfying the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
 * @typescriptDefinition
 */
export function dropLastWhileByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} <b>not</b> having the last elements satisfying the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
 */
export function dropLastWhileByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function dropLastWhileByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,) {
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
 * Get a new {@link CollectionHolder} <b>not</b> having the last elements satisfying the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
 * @typescriptDefinition
 */
export function dropLastWhileByArray<const T, const S extends T, >(collection: Nullable<readonly T[]>, predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} <b>not</b> having the last elements satisfying the given {@link predicate}
 *
 * @param collection The nullable collection
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
 */
export function dropLastWhileByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>,): CollectionHolder<T>
export function dropLastWhileByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>,) {
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
            const newArrayFrom0ToIndex = new Array<T>(index + 1,)
            let index2 = -1
            while (++index2 <= index)
                newArrayFrom0ToIndex[index2] = collection.get(index2,)
            return newArrayFrom0ToIndex
        }
    return CollectionConstants.EMPTY_ARRAY
}

function __with0ArgumentByArray<const T, >(collection: readonly T[], size: number, predicate: () => boolean,): readonly T[] {
    let index = size
    while (--index >= 0)
        if (!predicate()) {
            const newArrayFrom0ToIndex = new Array<T>(index + 1,)
            let index2 = -1
            while (++index2 <= index)
                newArrayFrom0ToIndex[index2] = collection[index2] as T
            return newArrayFrom0ToIndex
        }
    return CollectionConstants.EMPTY_ARRAY
}


function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, size: number, predicate: (value: T,) => boolean,): readonly T[] {
    let index = size
    while (--index >= 0) {
        const value = collection.get(index,)
        if (!predicate(value,)) {
            const newArrayFrom0ToIndex = new Array<T>(index + 1,)
            newArrayFrom0ToIndex[index] = value
            let index2 = -1
            while (++index2 < index)
                newArrayFrom0ToIndex[index2] = collection.get(index2,)
            return newArrayFrom0ToIndex
        }
    }
    return CollectionConstants.EMPTY_ARRAY
}

function __with1ArgumentByArray<const T, >(collection: readonly T[], size: number, predicate: (value: T,) => boolean,): readonly T[] {
    let index = size
    while (--index >= 0) {
        const value = collection[index] as T
        if (!predicate(value,)) {
            const newArrayFrom0ToIndex = new Array<T>(index + 1,)
            newArrayFrom0ToIndex[index] = value
            let index2 = -1
            while (++index2 < index)
                newArrayFrom0ToIndex[index2] = collection[index2] as T
            return newArrayFrom0ToIndex
        }
    }
    return CollectionConstants.EMPTY_ARRAY
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, size: number, predicate: (value: T, index: number,) => boolean,): readonly T[] {
    let index = size
    while (--index >= 0) {
        const value = collection.get(index,)
        if (!predicate(value, index,)) {
            const newArrayFrom0ToIndex = new Array<T>(index + 1,)
            newArrayFrom0ToIndex[index] = value
            let index2 = -1
            while (++index2 < index)
                newArrayFrom0ToIndex[index2] = collection.get(index2,)
            return newArrayFrom0ToIndex
        }
    }
    return CollectionConstants.EMPTY_ARRAY
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], size: number, predicate: (value: T, index: number,) => boolean,): readonly T[] {
    let index = size
    while (--index >= 0) {
        const value = collection[index] as T
        if (!predicate(value, index,)) {
            const newArrayFrom0ToIndex = new Array<T>(index + 1,)
            newArrayFrom0ToIndex[index] = value
            let index2 = -1
            while (++index2 < index)
                newArrayFrom0ToIndex[index2] = collection[index2] as T
            return newArrayFrom0ToIndex
        }
    }
    return CollectionConstants.EMPTY_ARRAY
}

//#endregion -------------------- Loop methods --------------------
