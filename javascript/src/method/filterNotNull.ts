/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {Nullable}         from "../general type"

import {CollectionConstants} from "../CollectionConstants"

/**
 * Get a new {@link CollectionHolder} without <b>null</b> or <b>undefined</b>
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not-null.html Kotlin filterNotNull()
 * @see requireNoNulls
 * @extensionFunction
 */
export function filterNotNull<const T, >(collection: Nullable<CollectionHolder<T>>,): CollectionHolder<NonNullable<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
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
