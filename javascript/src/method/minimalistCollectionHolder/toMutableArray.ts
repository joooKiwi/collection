/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {MinimalistCollectionHolder} from "../../MinimalistCollectionHolder"

import {__newMutableArray} from "../toMutableArray"

/**
 * Convert the {@link collection} to an {@link Array mutable array}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableArray<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): T[] {
    if (collection == null)
        return []

    const size = collection.size
    if (size == 0)
        return []
    return __newMutableArray(collection, size,)
}
