/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {MinimalistCollectionHolder} from "../../MinimalistCollectionHolder"

import {__toString} from "../toString"

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link Object.toString toString()}</i>" method
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @see Array.toString
 * @see Object.toString
 * @extensionFunction
 */
export function toString<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): string {
    if (collection == null)
        return "[]"

    const size = collection.size
    if (size == 0)
        return "[]"
    return __toString(collection, size,)
}
