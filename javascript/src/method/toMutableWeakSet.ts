/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder} from "../CollectionHolder"
import type {ObjectOf}         from "../CollectionHolder.types"

/**
 * Convert the {@link collection} to an {@link WeakSet mutable weak set}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableWeakSet<const T, >(collection: Nullable<CollectionHolder<T>>,): WeakSet<ObjectOf<T>> {
    if (collection == null)
        return new WeakSet()
    if (collection.isEmpty)
        return new WeakSet()

    const size = collection.size
    const weakSet = new WeakSet<ObjectOf<T>>
    const objectValues = collection.objectValuesMap
    let index = -1
    while (++index < size)
        weakSet.add(objectValues.get(collection.get(index,),)!,)
    return weakSet
}
