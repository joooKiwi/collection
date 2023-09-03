/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable}         from "../general type"
import type {CollectionHolder} from "../CollectionHolder"

import {CollectionConstants} from "../CollectionConstants"

/**
 * Convert the {@link collection} to an {@link ReadonlyArray array}
 *
 * @param collection The {@link CollectionHolder} to convert
 * @extensionFunction
 */
export function toArray<const T, >(collection: Nullable<CollectionHolder<T>>,): readonly T[] {
    if (collection == null)
        return CollectionConstants.EMPTY_ARRAY
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_ARRAY

    const size = collection.size,
        array = new Array<T>(size,)
    let index = size
    while (index-- > 0)
        array[index] = collection.get(index,)
    return Object.freeze(array,)
}
