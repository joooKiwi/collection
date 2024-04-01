/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link Set mutable set}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableSet<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): Set<T> {
    if (collection == null)
        return new Set()

    const size = collection.size
    if (size == 0)
        return new Set()
    return __newMutableSet(collection, size,)
}

/**
 * Convert the {@link collection} to an {@link Set mutable set}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableSetByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): Set<T> {
    if (collection == null)
        return new Set()
    if (collection.isEmpty)
        return new Set()
    return __newMutableSet(collection, collection.size,)

}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

function __newMutableSet<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    const set = new Set<T>()
    let index = -1
    while (++index < size)
        set.add(collection.get(index,),)
    return set
}

//#region -------------------- Loop method --------------------
