/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {Nullable}         from "../general type"

import {CollectionConstants} from "../CollectionConstants"

/**
 * Convert the {@link collection} to an {@link ReadonlyMap map}
 *
 * @param collection The {@link CollectionHolder} to convert
 *
 * @extensionFunction
 */
export function toMap<const T, >(collection: Nullable<CollectionHolder<T>>,): ReadonlyMap<number, T> {
    if (collection == null)
        return CollectionConstants.EMPTY_MAP
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_MAP

    const map = new Map<number, T>()
    let index = collection.size
    while (index-- > 0)
        map.set(index, collection.get(index,),)
    return Object.freeze(map,)
}
