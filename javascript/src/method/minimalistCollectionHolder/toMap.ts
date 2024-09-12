/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {MinimalistCollectionHolder} from "../../MinimalistCollectionHolder"

import {CollectionConstants} from "../../CollectionConstants"
import {__newMap}            from "../toMap"

/**
 * Convert the {@link collection} to an {@link ReadonlyMap map}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMap<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): ReadonlyMap<number, T> {
    if (collection == null)
        return CollectionConstants.EMPTY_MAP

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_MAP
    return __newMap(collection, size,)
}
