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
 * The {@link collection} has at least one <b>null</b> or <b>undefined</b>
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @return {boolean} <b>true</b> only if one element is <b>null</b> or <b>undefined</b>
 * @extensionFunction
 */
export function hasNull<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): boolean {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false
    return __hasNull(collection, size,)
}

/**
 * The {@link collection} has at least one <b>null</b> or <b>undefined</b>
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @return {boolean} <b>true</b> only if one element is <b>null</b> or <b>undefined</b>
 * @extensionFunction
 */
export function hasNullByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): boolean {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false
    return __hasNull(collection, collection.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasNull(collection: MinimalistCollectionHolder, size: number,) {
    let index = -1
    while (++index < size)
        if (collection.get(index,) == null)
            return true
    return false
}

//#endregion -------------------- Loop methods --------------------
