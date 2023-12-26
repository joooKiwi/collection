/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable}                   from "../general type"
import type {SimplisticCollectionHolder} from "../SimplisticCollectionHolder"

/**
 * Convert the {@link collection} to an {@link Map mutable map}
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableMap<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>,): Map<number, T> {
    if (collection == null)
        return new Map()
    if (collection.isEmpty)
        return new Map()

    const map = new Map<number, T>()
    let index = collection.size
    while (index-- > 0)
        map.set(index, collection.get(index,),)
    return map
}
