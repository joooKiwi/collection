/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable}                   from "../general type"
import type {SimplisticCollectionHolder} from "../SimplisticCollectionHolder"

/**
 * Convert the {@link collection} to an {@link Set mutable set}
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableSet<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>,): Set<T> {
    if (collection == null)
        return new Set()
    if (collection.isEmpty)
        return new Set()

    const size = collection.size
    const set = new Set<T>()
    let index = -1
    while (++index < size)
        set.add(collection.get(index,),)
    return set
}
