/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {Nullable}         from "../general type"

/**
 * Convert the {@link collection} to an {@link Array mutable array}
 *
 * @param collection The {@link CollectionHolder} to convert
 *
 * @extensionFunction
 */
export function toMutableArray<const T, >(collection: Nullable<CollectionHolder<T>>,): T[] {
    if (collection == null)
        return []
    if (collection.isEmpty)
        return []

    const size = collection.size,
        array = new Array<T>(size,)
    let index = size
    while (index-- > 0)
        array[index] = collection.get(index,)
    return array
}
