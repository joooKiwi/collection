/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder} from "../../CollectionHolder"

import {__newMutableWeakSet} from "../toMutableWeakSet"

/**
 * Convert the {@link collection} to an {@link WeakSet mutable weak set}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableWeakSet<const T extends WeakKey, >(collection: Nullable<CollectionHolder<T>>,): WeakSet<T> {
    if (collection == null)
        return new WeakSet()
    if (collection.isEmpty)
        return new WeakSet()
    return __newMutableWeakSet(collection, collection.size,)
}
