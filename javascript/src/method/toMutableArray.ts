/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {__values}                      from "./_tables utility"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link Array mutable array}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) to convert
 * @extensionFunction
 */
export function toMutableArray<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): T[] {
    if (collection == null)
        return []
    if (isCollectionHolder<T>(collection,))
        return toMutableArrayByCollectionHolder(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return toMutableArrayByCollectionHolder(collection,)
    return toMutableArrayByMinimalistCollectionHolder(collection,)
}


/**
 * Convert the {@link collection} to an {@link Array mutable array}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableArrayByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): T[] {
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
    return __values(collection, size,)
}

//#endregion -------------------- Loop method --------------------
