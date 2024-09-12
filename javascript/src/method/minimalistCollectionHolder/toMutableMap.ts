/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {MinimalistCollectionHolder} from "../../MinimalistCollectionHolder"

import {__newMutableMap} from "../toMutableMap"

/**
 * Convert the {@link collection} to an {@link Map mutable map}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableMap<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): Map<number, T> {
    if (collection == null)
        return new Map()

    const size = collection.size
    if (size == 0)
        return new Map()
    return __newMutableMap(collection, size,)
}
