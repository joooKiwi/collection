/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}           from "../CollectionConstants"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder} without <b>null</b> or <b>undefined</b>
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not-null.html Kotlin filterNotNull()
 * @see requireNoNulls
 * @extensionFunction
 */
export function filterNotNull<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): CollectionHolder<NonNullable<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return filterNotNullByCollectionHolder(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return filterNotNullByCollectionHolder(collection,)
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
    return __fromMinimalist(collection, size,)
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
        return new CollectionConstants.LazyGenericCollectionHolder(() => __fromComplete(collection,),)
    return collection as CollectionHolder<NonNullable<T>>
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __fromComplete<const T, >(collection: MinimalistCollectionHolder<Nullable<T>>,): readonly NonNullable<T>[] {
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

function __fromMinimalist<const T, >(collection: MinimalistCollectionHolder<Nullable<T>>, size: number,): CollectionHolder<NonNullable<T>> {
    let index = -1
    while (++index < size)
        if (collection.get(index,) == null)
            return new CollectionConstants.LazyGenericCollectionHolder(() => {
                const newArray: NonNullable<T>[] = []
                let index2 = -1
                while (++index2 < index) // We add the non-null items from 0 to the index (they cannot be null)
                    newArray.push(collection.get(index2,) as NonNullable<T>,)

                while (++index2 < size) { // We add the remaining items while validating the nullability
                    const value = collection.get(index2,)
                    if (value != null)
                        newArray.push(value,)
                }
                return newArray
            },)

    return new CollectionConstants.LazyGenericCollectionHolder(collection as MinimalistCollectionHolder<NonNullable<T>>,)
}

//#endregion -------------------- Loop methods --------------------
