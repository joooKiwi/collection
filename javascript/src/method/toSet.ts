/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable}                   from "../general type"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants} from "../CollectionConstants"

/**
 * Convert the {@link collection} to an {@link ReadonlySet set}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toSet<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): ReadonlySet<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_SET
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_SET

    const size = collection.size
    const set = new Set<T>()
    let index = -1
    while (++index < size)
        set.add(collection.get(index,),)
    return Object.freeze(set,)
}
