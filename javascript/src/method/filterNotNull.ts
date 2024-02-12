/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}           from "../CollectionHolder"
import type {Nullable}                   from "../general type"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {NonEmptyCollectionHolder}   from "../NonEmptyCollectionHolder"

import {CollectionConstants} from "../CollectionConstants"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder} without <b>null</b> or <b>undefined</b>
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not-null.html Kotlin filterNotNull()
 * @see requireNoNulls
 * @extensionFunction
 */
export function filterNotNull<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): CollectionHolder<NonNullable<T>> {
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
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not-null.html Kotlin filterNotNull()
 * @see requireNoNulls
 * @extensionFunction
 */
export function filterNotNullByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): CollectionHolder<NonNullable<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    if (collection.hasNull)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __fromComplete(collection as NonEmptyCollectionHolder<T>,),)
    return collection as CollectionHolder<NonNullable<T>>
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __fromComplete<const T, >(collection: NonEmptyCollectionHolder<T>,): readonly NonNullable<T>[] {
    const newArray = [] as NonNullable<T>[]
    const size = collection.size
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (value != null)
            newArray.push(value,)
    }
    return newArray
}

function __fromMinimalist<const T, >(collection: MinimalistCollectionHolder<T>, size: number,): CollectionHolder<NonNullable<T>> {
    let index = -1
    while (++index < size)
        if (collection.get(index) == null)
            return new CollectionConstants.LazyGenericCollectionHolder(() => {
                const newArray = new Array<NonNullable<T>>(index,)
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
