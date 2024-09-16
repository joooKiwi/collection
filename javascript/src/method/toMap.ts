/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}           from "../CollectionConstants"
import {__associativeValues}           from "./_tables utility"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link ReadonlyMap map}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) to convert
 * @extensionFunction
 */
export function toMap<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): ReadonlyMap<number, T> {
    if (collection == null)
        return CollectionConstants.EMPTY_MAP
    if (isCollectionHolder<T>(collection,))
        return toMapByCollectionHolder(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return toMapByCollectionHolder(collection,)
    return toMapByMinimalistCollectionHolder(collection,)
}


/**
 * Convert the {@link collection} to an {@link ReadonlyMap map}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMapByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): ReadonlyMap<number, T> {
    if (collection == null)
        return CollectionConstants.EMPTY_MAP

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_MAP
    return __newMap(collection, size,)
}

/**
 * Convert the {@link collection} to an {@link ReadonlyMap map}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMapByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): ReadonlyMap<number, T> {
    if (collection == null)
        return CollectionConstants.EMPTY_MAP
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_MAP
    return __newMap(collection, collection.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

function __newMap<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    return Object.freeze(new Map(__associativeValues(collection, size,),),)
}

//#endregion -------------------- Loop method --------------------
