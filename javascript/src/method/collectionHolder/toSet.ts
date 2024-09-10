/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder} from "../../CollectionHolder"

import {CollectionConstants}                 from "../../CollectionConstants"
import {__withDuplicate, __withoutDuplicate} from "../toSet"

/**
 * Convert the {@link collection} to an {@link ReadonlySet set}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toSet<const T, >(collection: Nullable<CollectionHolder<T>>,): ReadonlySet<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_SET
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_SET
    if (collection.hasDuplicate)
        return __withDuplicate(collection, collection.size,)
    return __withoutDuplicate(collection, collection.size,)
}
