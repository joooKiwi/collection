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
import type {CollectionIterator}         from "../iterator/CollectionIterator"

import {CollectionConstants}           from "../CollectionConstants"
import {GenericCollectionIterator}     from "../iterator/GenericCollectionIterator"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

/**
 * Convert the {@link collection} to a new {@link CollectionIterator}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @extensionFunction
 */
export function toIterator<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>,): CollectionIterator<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_ITERATOR
    if (isCollectionHolder<T>(collection,))
        return toIteratorByCollectionHolder(collection,)
    if (isArray(collection,))
        return toIteratorByArray(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return toIteratorByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return toIteratorByArray(collection,)
    return toIteratorByMinimalistCollectionHolder(collection,)
}


/**
 * Convert the {@link collection} to a new {@link CollectionIterator}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @extensionFunction
 */
export function toIteratorByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): CollectionIterator<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_ITERATOR
    if (collection.size == 0)
        return CollectionConstants.EMPTY_COLLECTION_ITERATOR
    return new GenericCollectionIterator(collection,)
}

/**
 * Convert the {@link collection} to a new {@link CollectionIterator}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @extensionFunction
 */
export function toIteratorByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): CollectionIterator<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_ITERATOR
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_ITERATOR
    return new GenericCollectionIterator(collection,)
}

/**
 * Convert the {@link collection} to a new {@link CollectionIterator}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @extensionFunction
 */
export function toIteratorByArray<const T, >(collection: Nullable<readonly T[]>,): CollectionIterator<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_ITERATOR
    if (collection.length == 0)
        return CollectionConstants.EMPTY_COLLECTION_ITERATOR
    return new GenericCollectionIterator(new CollectionConstants.GenericMinimalistCollectionHolder(collection,),)
}
