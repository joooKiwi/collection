/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}           from "../CollectionHolder"
import type {Nullable}                   from "../general type"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link Map mutable map}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableMap<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): Map<number, T> {
    if (collection == null)
        return new Map()

    const size = collection.size
    if (size == 0)
        return new Map()
    return __newMutableMap(collection, size,)
}

/**
 * Convert the {@link collection} to an {@link Map mutable map}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableMapByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): Map<number, T> {
    if (collection == null)
        return new Map()
    if (collection.isEmpty)
        return new Map()
    return __newMutableMap(collection, collection.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

function __newMutableMap<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    const map = new Map<number, T>()
    let index = size
    while (index-- > 0)
        map.set(index, collection.get(index,),)
    return map
}

//#endregion -------------------- Loop method --------------------
