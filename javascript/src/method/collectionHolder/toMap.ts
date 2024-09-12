/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder} from "../../CollectionHolder"

import {CollectionConstants} from "../../CollectionConstants"
import {__newMap}            from "../toMap"

/**
 * Convert the {@link collection} to an {@link ReadonlyMap map}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMap<const T, >(collection: Nullable<CollectionHolder<T>>,): ReadonlyMap<number, T> {
    if (collection == null)
        return CollectionConstants.EMPTY_MAP
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_MAP
    return __newMap(collection, collection.size,)
}
