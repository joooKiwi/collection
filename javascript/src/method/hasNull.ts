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

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * The {@link collection} has at least one <b>null</b> or <b>undefined</b>
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @return {boolean} <b>true</b> only if one element is <b>null</b> or <b>undefined</b>
 * @extensionFunction
 */
export function hasNull<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,): boolean {
    if (collection == null)
        return false
    if (isCollectionHolder(collection,))
        return hasNullByCollectionHolder(collection,)
    if (isArray(collection,))
        return hasNullByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return hasNullByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasNullByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return hasNullByArray(collection,)
    return hasNullByMinimalistCollectionHolder(collection,)
}


/**
 * The {@link collection} has at least one <b>null</b> or <b>undefined</b>
 *
 * @param collection The nullable collection
 * @return {boolean} <b>true</b> only if one element is <b>null</b> or <b>undefined</b>
 * @extensionFunction
 */
export function hasNullByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): boolean {
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
 * @param collection The nullable collection
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

/**
 * The {@link collection} has at least one <b>null</b> or <b>undefined</b>
 *
 * @param collection The nullable collection
 * @return {boolean} <b>true</b> only if one element is <b>null</b> or <b>undefined</b>
 * @extensionFunction
 */
export function hasNullByArray<const T, >(collection: Nullable<readonly T[]>,): boolean {
    if (collection == null)
        return false

    const size = collection.length
    if (size == 0)
        return false
    return __hasNullByArray(collection, size,)
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

function __hasNullByArray(collection: readonly unknown[], size: number,) {
    let index = -1
    while (++index < size)
        if (collection[index] == null)
            return true
    return false
}

//#endregion -------------------- Loop methods --------------------
