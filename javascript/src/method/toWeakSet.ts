/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder} from "../CollectionHolder"
import type {ObjectOf}         from "../CollectionHolder.types"

import {CollectionConstants} from "../CollectionConstants"

/**
 * Convert the {@link collection} to an {@link WeakSet weak set}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toWeakSet<const T, >(collection: Nullable<CollectionHolder<T>>,): Readonly<WeakSet<ObjectOf<T>>> {
    if (collection == null)
        return CollectionConstants.EMPTY_WEAK_SET as Readonly<WeakSet<ObjectOf<T>>>
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_WEAK_SET as Readonly<WeakSet<ObjectOf<T>>>

    const size = collection.size
    const weakSet = new WeakSet<ObjectOf<T>>
    const objectValues = collection.objectValuesMap
    let index = -1
    while (++index < size)
        weakSet.add(objectValues.get(collection.get(index,),)!,)
    return Object.freeze(weakSet,)
}
