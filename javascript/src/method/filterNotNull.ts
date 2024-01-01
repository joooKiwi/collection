/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                   from "../CollectionHolder"
import type {Nullable}                           from "../general type"
import type {MinimalistCollectionHolder}         from "../MinimalistCollectionHolder"
import type {NonEmptyCollectionHolder}           from "../NonEmptyCollectionHolder"
import type {NonEmptyMinimalistCollectionHolder} from "../NonEmptyMinimalistCollectionHolder"

import {CollectionConstants} from "../CollectionConstants"
import {isCollectionHolder}  from "./isCollectionHolder"

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
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    if (isCollectionHolder(collection,))
        return __fromComplete(collection as NonEmptyCollectionHolder<T>,)
    return __fromMinimalist(collection as NonEmptyMinimalistCollectionHolder<T>,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __fromComplete<const T, >(collection: NonEmptyCollectionHolder<T>,): CollectionHolder<NonNullable<T>> {
    if (!collection.hasNull)
        return collection as CollectionHolder<NonNullable<T>>

    return new CollectionConstants.LazyGenericCollectionHolder(() => {
        const newArray = [] as NonNullable<T>[]
        const size = collection.size
        let index = -1
        while (++index < size) {
            const value = collection.get(index,)
            if (value != null)
                newArray.push(value,)
        }
        return newArray
    },)
}

function __fromMinimalist<const T, >(collection: NonEmptyMinimalistCollectionHolder<T>,): CollectionHolder<NonNullable<T>> {
    const size = collection.size
    let index = -1
    while (++index < size)
        if (collection.get(index) == null)
            return new CollectionConstants.LazyGenericCollectionHolder(() => {
                const newArray = new Array<NonNullable<T>>(index,)
                let index2 = -1
                while (++index2 < index) // We add the non-null items without a need to confirm its nullability
                    newArray.push(collection.get(index2,) as NonNullable<T>,)

                const size = collection.size
                while (++index2 < size) { // We add the nullable items from the remaining items
                    const value = collection.get(index2,)
                    if (value != null)
                        newArray.push(value,)
                }
                return newArray
            },)

    return new CollectionConstants.LazyGenericCollectionHolder(collection as MinimalistCollectionHolder<NonNullable<T>>,)
}

//#endregion -------------------- Loop methods --------------------
