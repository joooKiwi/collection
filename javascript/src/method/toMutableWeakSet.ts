/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {ObjectOf}         from "../CollectionHolder.types"
import type {Nullable}         from "../general type"

/**
 * Convert the {@link collection} to an {@link WeakSet mutable weak set}
 *
 * @param collection The {@link CollectionHolder} to convert
 *
 * @extensionFunction
 */
export function toMutableWeakSet<const T, >(collection: Nullable<CollectionHolder<T>>,): WeakSet<ObjectOf<T>> {
    if (collection == null)
        return new WeakSet()
    if (collection.isEmpty)
        return new WeakSet()

    const weakSet = new WeakSet<ObjectOf<T>>,
        size = collection.size,
        objectValues = collection.objectValuesMap
    let index = -1
    while (++index < size)
        weakSet.add(objectValues.get(collection.get(index,),) as ObjectOf<T>,)
    return weakSet
}
