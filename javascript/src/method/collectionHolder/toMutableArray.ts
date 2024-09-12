/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder} from "../../CollectionHolder"

import {__newMutableArray} from "../toMutableArray"

/**
 * Convert the {@link collection} to an {@link Array mutable array}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableArray<const T, >(collection: Nullable<CollectionHolder<T>>,): T[] {
    if (collection == null)
        return []
    if (collection.isEmpty)
        return []
    return __newMutableArray(collection, collection.size,)
}
