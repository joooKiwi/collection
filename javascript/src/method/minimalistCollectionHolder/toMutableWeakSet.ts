/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {MinimalistCollectionHolder} from "../../MinimalistCollectionHolder"

import {__withoutDuplicate} from "../toMutableWeakSet"

/**
 * Convert the {@link collection} to an {@link WeakSet mutable weak set}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableWeakSet<const T extends WeakKey, >(collection: Nullable<MinimalistCollectionHolder<T>>,): WeakSet<T> {
    if (collection == null)
        return new WeakSet()

    const size = collection.size
    if (size == 0)
        return new WeakSet()
    return __withoutDuplicate(collection, size,)
}
