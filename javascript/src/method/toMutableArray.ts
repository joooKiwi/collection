/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}           from "../CollectionHolder"
import type {Nullable}                   from "../general type"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link Array mutable array}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableArray<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): T[] {
    if (collection == null)
        return []

    const size = collection.size
    if (size == 0)
        return []
    return __newMutableArray(collection, size,)
}

/**
 * Convert the {@link collection} to an {@link Array mutable array}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableArrayByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): T[] {
    if (collection == null)
        return []
    if (collection.isEmpty)
        return []
    return __newMutableArray(collection, collection.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

function __newMutableArray<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    const array = new Array<T>(size,)
    let index = size
    while (index-- > 0)
        array[index] = collection.get(index,)
    return array
}

//#endregion -------------------- Loop method --------------------
