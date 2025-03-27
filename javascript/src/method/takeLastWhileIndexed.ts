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

import type {CollectionHolder}                                         from "../CollectionHolder"
import type {MinimalistCollectionHolder}                               from "../MinimalistCollectionHolder"
import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../type/callback"

import {CollectionConstants}           from "../CollectionConstants"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link CollectionHolder}, {@link MinimalistCollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
 * @typescriptDefinition
 */
export function takeLastWhileIndexed<const T, const S extends T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link CollectionHolder}, {@link MinimalistCollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
 */
export function takeLastWhileIndexed<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
export function takeLastWhileIndexed<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: ReverseBooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder(collection,))
        return takeLastWhileIndexedByCollectionHolder(collection, predicate,)
    if (isArray(collection,))
        return takeLastWhileIndexedByArray(collection, predicate,)
    if (isMinimalistCollectionHolder(collection,))
        return takeLastWhileIndexedByMinimalistCollectionHolder(collection, predicate,)

    if (isCollectionHolderByStructure<T>(collection,))
        return takeLastWhileIndexedByCollectionHolder(collection, predicate,)
    if (isArrayByStructure<T>(collection,))
        return takeLastWhileIndexedByArray(collection, predicate,)
    return takeLastWhileIndexedByMinimalistCollectionHolder(collection, predicate,)
}


/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
 * @typescriptDefinition
 */
export function takeLastWhileIndexedByMinimalistCollectionHolder<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
 */
export function takeLastWhileIndexedByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
export function takeLastWhileIndexedByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection, size, predicate as (index: number,) => boolean,),)
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
export function takeLastWhileIndexedByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
 */
export function takeLastWhileIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
export function takeLastWhileIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1Argument(collection, collection.size, predicate as (index: number,) => boolean,),)
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
export function takeLastWhileIndexedByArray<const T, const S extends T, >(collection: Nullable<readonly T[]>, predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
 */
export function takeLastWhileIndexedByArray<const T, >(collection: Nullable<readonly T[]>, predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
export function takeLastWhileIndexedByArray<const T, >(collection: Nullable<readonly T[]>, predicate: ReverseBooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.length
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (predicate.length == 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __with1ArgumentByArray(collection, size, predicate as (index: number,) => boolean,),)
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
            const newArrayWithDrop = new Array<T>(newSize,)

            let indexAdded = 0
            while (++index < size)
                newArrayWithDrop[indexAdded++] = collection.get(index,)
            return newArrayWithDrop
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
            const newArrayWithDrop = new Array<T>(newSize,)

            let indexAdded = 0
            while (++index < size)
                newArrayWithDrop[indexAdded++] = collection[index] as T
            return newArrayWithDrop
        }
    return collection
}


function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, size: number, predicate: (index: number,) => boolean,): readonly T[] {
    let index = size
    while (--index >= 0)
        if (!predicate(index,)) {
            const newSize = size - index - 1
            if (newSize === 0)
                return CollectionConstants.EMPTY_ARRAY
            if (newSize === 1)
                return [collection.get(index + 1,),]
            const newArrayWithDrop = new Array<T>(newSize,)

            let indexAdded = 0
            while (++index < size)
                newArrayWithDrop[indexAdded++] = collection.get(index,)
            return newArrayWithDrop
        }

    const newArray = new Array<T>(size,)
    while (++index < size)
        newArray[index] = collection.get(index,)
    return newArray
}

function __with1ArgumentByArray<const T, >(collection: readonly T[], size: number, predicate: (index: number,) => boolean,): readonly T[] {
    let index = size
    while (--index >= 0)
        if (!predicate(index,)) {
            const newSize = size - index - 1
            if (newSize === 0)
                return CollectionConstants.EMPTY_ARRAY
            if (newSize === 1)
                return [collection[index + 1] as T,]
            const newArrayWithDrop = new Array<T>(newSize,)

            let indexAdded = 0
            while (++index < size)
                newArrayWithDrop[indexAdded++] = collection[index] as T
            return newArrayWithDrop
        }
    return collection
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, size: number, predicate: (index: number, value: T,) => boolean,): readonly T[] {
    const newArray = new Array<T>(size,)
    let index = size
    while (--index >= 0)
        if (!predicate(index, newArray[index] = collection.get(index,),)) {
            const newSize = size - index - 1
            if (newSize === 0)
                return CollectionConstants.EMPTY_ARRAY
            if (newSize === 1)
                return [newArray[index + 1] as T,]
            const newArrayWithDrop = new Array<T>(newSize,)

            let indexAdded = 0
            while (++index < size)
                newArrayWithDrop[indexAdded++] = newArray[index] as T
            return newArrayWithDrop
        }
    return newArray
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], size: number, predicate: (index: number, value: T,) => boolean,): readonly T[] {
    const newArray = new Array<T>(size,)
    let index = size
    while (--index >= 0)
        if (!predicate(index, newArray[index] = collection[index] as T,)) {
            const newSize = size - index - 1
            if (newSize === 0)
                return CollectionConstants.EMPTY_ARRAY
            if (newSize === 1)
                return [newArray[index + 1] as T,]
            const newArrayWithDrop = new Array<T>(newSize,)

            let indexAdded = 0
            while (++index < size)
                newArrayWithDrop[indexAdded++] = newArray[index] as T
            return newArrayWithDrop
        }
    return newArray
}

//#endregion -------------------- Loop methods --------------------
