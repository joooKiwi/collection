/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}                   from "../CollectionConstants"
import {isCollectionHolder}                    from "./isCollectionHolder"
import {isCollectionHolderByStructure}         from "./isCollectionHolderByStructure"
import {toMap as byCollectionHolder}           from "./collectionHolder/toMap"
import {toMap as byMinimalistCollectionHolder} from "./minimalistCollectionHolder/toMap"

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
        return byCollectionHolder(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return byCollectionHolder(collection,)
    return byMinimalistCollectionHolder(collection,)
}

/**
 * Convert the {@link collection} to an {@link ReadonlyMap map}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 * @deprecated Use toMap from import("@joookiwi/collection/method/collectionHolder")
 */
export function toMapByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): ReadonlyMap<number, T> {
    return byCollectionHolder(collection,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

/** @internal */
export function __newMap<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    const array = new Array<readonly [number, T,]>(size,)
    let index = size
    while (index-- > 0)
        array[index] = [index, collection.get(index,),]
    return Object.freeze(new Map(array,),)
}

//#endregion -------------------- Loop method --------------------
