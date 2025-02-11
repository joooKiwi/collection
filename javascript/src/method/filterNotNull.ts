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

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}           from "../CollectionConstants"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder} without <b>null</b> or <b>undefined</b>
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not-null.html Kotlin filterNotNull()
 * @see requireNoNulls
 * @extensionFunction
 */
export function filterNotNull<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>,): CollectionHolder<NonNullable<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return filterNotNullByCollectionHolder(collection,)
    if (isArray(collection,))
        return filterNotNullByArray(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return filterNotNullByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return filterNotNullByArray(collection,)
    return filterNotNullByMinimalistCollectionHolder(collection,)
}


/**
 * Get a new {@link CollectionHolder} without <b>null</b> or <b>undefined</b>
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not-null.html Kotlin filterNotNull()
 * @see requireNoNulls
 * @extensionFunction
 */
export function filterNotNullByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): CollectionHolder<NonNullable<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const temporaryArray = new Array<T>(size,)
    let index = -1
    while (++index < size)
        if ((temporaryArray[index] = collection.get(index,) as T) == null)
            return new CollectionConstants.LazyGenericCollectionHolder(() => __filterNotNullByMinimalist(collection, size, index, temporaryArray,),)
    return new CollectionConstants.LazyGenericCollectionHolder(collection as MinimalistCollectionHolder<NonNullable<T>>,)
}

/**
 * Get a new {@link CollectionHolder} without <b>null</b> or <b>undefined</b>
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not-null.html Kotlin filterNotNull()
 * @see requireNoNulls
 * @extensionFunction
 */
export function filterNotNullByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): CollectionHolder<NonNullable<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.hasNull)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __filterNotNull(collection,),)
    return collection as CollectionHolder<NonNullable<T>>
}

/**
 * Get a new {@link CollectionHolder} without <b>null</b> or <b>undefined</b>
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not-null.html Kotlin filterNotNull()
 * @see requireNoNulls
 * @extensionFunction
 */
export function filterNotNullByArray<const T, >(collection: Nullable<readonly T[]>,): CollectionHolder<NonNullable<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.length
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const temporaryArray = new Array<T>(size,)
    let index = -1
    while (++index < size)
        if ((temporaryArray[index] = collection[index] as T) == null)
                return new CollectionConstants.LazyGenericCollectionHolder(() => __filterNotNullByArray(collection, size, index, temporaryArray,),)
    return new CollectionConstants.LazyGenericCollectionHolder(collection as readonly NonNullable<T>[],)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __filterNotNull<const T, >(collection: MinimalistCollectionHolder<T>,): readonly NonNullable<T>[] {
    const newArray: NonNullable<T>[] = []
    const size = collection.size
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (value != null)
            newArray.push(value,)
    }
    return newArray
}

function __filterNotNullByMinimalist<const T, >(collection: MinimalistCollectionHolder<T>, size: number, index: number, temporaryArray: readonly T[],): readonly NonNullable<T>[] {
    const newArray: NonNullable<T>[] = []
    let index2 = -1
    while (++index2 < index) // We add the non-null items from 0 to the index (they cannot be null)
        newArray.push(temporaryArray[index2] as NonNullable<T>,)

    while (++index2 < size) { // We add the remaining items while validating the nullability
        const value = collection.get(index2,)
        if (value != null)
            newArray.push(value,)
    }
    return newArray
}

function __filterNotNullByArray<const T, >(collection: readonly T[], size: number, index: number, temporaryArray: readonly T[],): readonly NonNullable<T>[] {
    const newArray: NonNullable<T>[] = []
    let index2 = -1
    while (++index2 < index) // We add the non-null items from 0 to the index (they cannot be null)
        newArray.push(temporaryArray[index2] as NonNullable<T>,)

    while (++index2 < size) { // We add the remaining items while validating the nullability
        const value = collection[index2]
        if (value != null)
            newArray.push(value,)
    }
    return newArray
}

//#endregion -------------------- Loop methods --------------------
