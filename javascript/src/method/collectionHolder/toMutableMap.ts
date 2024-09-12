/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder} from "../../CollectionHolder"

import {__newMutableMap} from "../toMutableMap"

/**
 * Convert the {@link collection} to an {@link Map mutable map}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableMap<const T, >(collection: Nullable<CollectionHolder<T>>,): Map<number, T> {
    if (collection == null)
        return new Map()
    if (collection.isEmpty)
        return new Map()
    return __newMutableMap(collection, collection.size,)
}
