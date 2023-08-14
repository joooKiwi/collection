/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {ObjectOf}         from "../CollectionHolder.types"
import type {Nullable}         from "../general type"

import {CollectionConstants} from "../CollectionConstants"

/**
 * Get an every object associated to the typed value
 *
 * @param collection
 */
export function objectValuesMap<const T, >(collection: Nullable<CollectionHolder<T>>,): ReadonlyMap<T, ObjectOf<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_MAP as ReadonlyMap<T, ObjectOf<T>>
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_MAP as ReadonlyMap<T, ObjectOf<T>>

    const map = new Map<T, ObjectOf<T>>
    let index = collection.size
    while (index-- > 0) {
        const value = collection.get(index,)
        map.set(value, Object(value,),)
    }
    return Object.freeze(map,)
}
