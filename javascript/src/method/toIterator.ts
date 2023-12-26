/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable}                   from "../general type"
import type {SimplisticCollectionHolder} from "../SimplisticCollectionHolder"
import type {CollectionIterator}         from "../iterator/CollectionIterator"

import {CollectionConstants}       from "../CollectionConstants"
import {GenericCollectionIterator} from "../iterator/GenericCollectionIterator"

/**
 * Convert the {@link collection} to a new {@link CollectionIterator}
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @extensionFunction
 */
export function toIterator<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>,): CollectionIterator<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_ITERATOR
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_ITERATOR

    return new GenericCollectionIterator(collection,)
}
