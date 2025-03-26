//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}                             from "../CollectionConstants"
import {__associativeValues, __associativeValuesByArray} from "./_tables utility"
import {isArray}                                         from "./isArray"
import {isArrayByStructure}                              from "./isArrayByStructure"
import {isCollectionHolder}                              from "./isCollectionHolder"
import {isCollectionHolderByStructure}                   from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}                    from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link ReadonlyMap map}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) to convert
 * @extensionFunction
 */
export function toMap<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,): ReadonlyMap<number, T> {
    if (collection == null)
        return CollectionConstants.EMPTY_MAP
    if (isCollectionHolder(collection,))
        return toMapByCollectionHolder(collection,)
    if (isArray(collection,))
        return toMapByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return toMapByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return toMapByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return toMapByArray(collection,)
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

/**
 * Convert the {@link collection} to an {@link ReadonlyMap map}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection} to convert
 * @extensionFunction
 */
export function toMapByArray<const T, >(collection: Nullable<readonly T[]>,): ReadonlyMap<number, T> {
    if (collection == null)
        return CollectionConstants.EMPTY_MAP

    const size = collection.length
    if (size == 0)
        return CollectionConstants.EMPTY_MAP
    return __newMapByArray(collection, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

function __newMap<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    return Object.freeze(new Map(__associativeValues(collection, size,),),)
}

function __newMapByArray<const T, >(collection: readonly T[], size: number,) {
    return Object.freeze(new Map(__associativeValuesByArray(collection, size,),),)
}

//#endregion -------------------- Loop method --------------------
