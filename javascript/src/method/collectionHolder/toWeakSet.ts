/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder} from "../../CollectionHolder"

import {CollectionConstants} from "../../CollectionConstants"
import {__newWeakSet}        from "../toWeakSet"

/**
 * Convert the {@link collection} to an {@link WeakSet weak set}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toWeakSet<const T extends WeakKey, >(collection: Nullable<CollectionHolder<T>>,): Readonly<WeakSet<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_WEAK_SET
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_WEAK_SET
    return __newWeakSet(collection, collection.size,)
}
