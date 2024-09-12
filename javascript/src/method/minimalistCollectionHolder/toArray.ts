/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {MinimalistCollectionHolder} from "../../MinimalistCollectionHolder"

import {CollectionConstants} from "../../CollectionConstants"
import {__newArray}          from "../toArray"

/**
 * Convert the {@link collection} to an {@link ReadonlyArray array}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toArray<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): readonly T[] {
    if (collection == null)
        return CollectionConstants.EMPTY_ARRAY

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_ARRAY
    return __newArray(collection, size,)
}
