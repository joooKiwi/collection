/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {__associativeValues}                          from "./_tables utility"
import {isCollectionHolder}                           from "./isCollectionHolder"
import {isCollectionHolderByStructure}                from "./isCollectionHolderByStructure"
import {toMutableMap as byCollectionHolder}           from "./collectionHolder/toMutableMap"
import {toMutableMap as byMinimalistCollectionHolder} from "./minimalistCollectionHolder/toMutableMap"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link Map mutable map}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) to convert
 * @extensionFunction
 */
export function toMutableMap<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): Map<number, T> {
    if (collection == null)
        return new Map()
    if (isCollectionHolder<T>(collection,))
        return byCollectionHolder(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return byCollectionHolder(collection,)
    return byMinimalistCollectionHolder(collection,)
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

/** @internal */
export function __newMutableMap<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    return new Map(__associativeValues(collection, size,),)
}

//#endregion -------------------- Loop method --------------------
