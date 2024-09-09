/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {MinimalistCollectionHolder} from "../../MinimalistCollectionHolder"

import {CollectionConstants} from "../../CollectionConstants"
import {__newWeakSet}        from "../toWeakSet"

/**
 * Convert the {@link collection} to an {@link WeakSet weak set}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toWeakSet<const T extends WeakKey, >(collection: Nullable<MinimalistCollectionHolder<T>>,): Readonly<WeakSet<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_WEAK_SET

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_WEAK_SET
    return __newWeakSet(collection, size,)
}
