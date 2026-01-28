//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
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

import {__uniqueValues, __uniqueValuesByArray, __values} from "./_tables utility"
import {isArray}                                         from "./isArray"
import {isArrayByStructure}                              from "./isArrayByStructure"
import {isCollectionHolder}                              from "./isCollectionHolder"
import {isCollectionHolderByStructure}                   from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}                    from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to a new {@link Set mutable set}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) to convert
 * @extensionFunction
 */
export function toMutableSet<const T, >(collection: Nullable<MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,): Set<T> {
    if (collection == null)
        return new Set()
    if (isCollectionHolder(collection,))
        return toMutableSetByCollectionHolder(collection,)
    if (isArray(collection,))
        return toMutableSetByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return toMutableSetByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return toMutableSetByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return toMutableSetByArray(collection,)
    return toMutableSetByMinimalistCollectionHolder(collection,)
}


/**
 * Convert the {@link collection} to a new {@link Set mutable set}
 *
 * @param collection The nullable collection to convert
 * @extensionFunction
 */
export function toMutableSetByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): Set<T> {
    if (collection == null)
        return new Set()

    const size = collection.size
    if (size == 0)
        return new Set()
    return __withDuplicate(collection, size,)
}

/**
 * Convert the {@link collection} to a new {@link Set mutable set}
 *
 * @param collection The nullable collection to convert
 * @extensionFunction
 */
export function toMutableSetByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): Set<T> {
    if (collection == null)
        return new Set()
    if (collection.isEmpty)
        return new Set()
    if (collection.hasDuplicate)
        return __withDuplicate(collection, collection.size,)
    return __withoutDuplicate(collection, collection.size,)
}

/**
 * Convert the {@link collection} to a new {@link Set mutable set}
 *
 * @param collection The nullable collection to convert
 * @extensionFunction
 */
export function toMutableSetByArray<const T, >(collection: Nullable<readonly T[]>,): Set<T> {
    if (collection == null)
        return new Set()

    const size = collection.length
    if (size == 0)
        return new Set()
    return __withDuplicateByArray(collection, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

function __withDuplicate<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    return new Set(__uniqueValues(collection, size,),)
}

function __withDuplicateByArray<const T, >(collection: readonly T[], size: number,) {
    return new Set(__uniqueValuesByArray(collection, size,),)
}


function __withoutDuplicate<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    return new Set(__values(collection, size,),)
}

//#endregion -------------------- Loop method --------------------
