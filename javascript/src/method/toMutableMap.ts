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

import {__associativeValues, __associativeValuesByArray} from "./_tables utility"
import {isArray}                                         from "./isArray"
import {isArrayByStructure}                              from "./isArrayByStructure"
import {isCollectionHolder}                              from "./isCollectionHolder"
import {isCollectionHolderByStructure}                   from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}                    from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to a new {@link Map mutable map}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) to convert
 * @extensionFunction
 */
export function toMutableMap<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,): Map<number, T> {
    if (collection == null)
        return new Map()
    if (isCollectionHolder(collection,))
        return toMutableMapByCollectionHolder(collection,)
    if (isArray(collection,))
        return toMutableMapByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return toMutableMapByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return toMutableMapByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection))
        return toMutableMapByArray(collection,)
    return toMutableMapByMinimalistCollectionHolder(collection,)
}


/**
 * Convert the {@link collection} to a new {@link Map mutable map}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableMapByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): Map<number, T> {
    if (collection == null)
        return new Map()

    const size = collection.size
    if (size == 0)
        return new Map()
    return __newMutableMap(collection, size,)
}

/**
 * Convert the {@link collection} to a new {@link Map mutable map}
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

/**
 * Convert the {@link collection} to a new {@link Map mutable map}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection} to convert
 * @extensionFunction
 */
export function toMutableMapByArray<const T, >(collection: Nullable<readonly T[]>,): Map<number, T> {
    if (collection == null)
        return new Map()

    const size = collection.length
    if (size == 0)
        return new Map()
    return __newMutableMapByArray(collection, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

function __newMutableMap<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    return new Map(__associativeValues(collection, size,),)
}

function __newMutableMapByArray<const T, >(collection: readonly T[], size: number,) {
    return new Map(__associativeValuesByArray(collection, size,),)
}

//#endregion -------------------- Loop method --------------------
