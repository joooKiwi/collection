/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {ObjectOf}                   from "../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants} from "../CollectionConstants"

//#region -------------------- Facade method --------------------

/**
 * Get an every object associated to the typed value
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @deprecated This extension method is no longer useful. The replacement should be to transform the collection instead. It will be removed in the version 1.11
 */
export function objectValuesMap<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): ReadonlyMap<T, ObjectOf<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_MAP

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_MAP
    return __newMap(collection, size,)
}

/**
 * Get an every object associated to the typed value
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @deprecated This extension method is no longer useful. The replacement should be to transform the collection instead. It will be removed in the version 1.11
 */
export function objectValuesMapByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): ReadonlyMap<T, ObjectOf<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_MAP
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_MAP
    return __newMap(collection, collection.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __newMap<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    const map = new Map<T, ObjectOf<T>>
    let index = size
    while (index-- > 0) {
        const value = collection.get(index,)
        map.set(value, Object(value,),)
    }
    return Object.freeze(map,)
}

//#endregion -------------------- Loop methods --------------------
