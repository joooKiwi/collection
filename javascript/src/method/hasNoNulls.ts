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
 * The {@link collection} has no <b>null</b> or <b>undefined</b>
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @return {boolean} <b>true</b> only if no element is <b>null</b> or <b>undefined</b>
 * @extensionFunction
 */
export function hasNoNulls<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,): boolean {
    if (collection == null)
        return true
    if (isCollectionHolder(collection,))
        return hasNoNullsByCollectionHolder(collection,)
    if (isArray(collection,))
        return hasNoNullsByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return hasNoNullsByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasNoNullsByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return hasNoNullsByArray(collection,)
    return hasNoNullsByMinimalistCollectionHolder(collection,)
}


/**
 * The {@link collection} has no <b>null</b> or <b>undefined</b>
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @return {boolean} <b>true</b> only if no element is <b>null</b> or <b>undefined</b>
 * @extensionFunction
 */
export function hasNoNullsByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): boolean {
    if (collection == null)
        return true

    const size = collection.size
    if (size == 0)
        return true
    return __hasNoNulls(collection, size,)
}

/**
 * The {@link collection} has no <b>null</b> or <b>undefined</b>
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @return {boolean} <b>true</b> only if no element is <b>null</b> or <b>undefined</b>
 * @extensionFunction
 */
export function hasNoNullsByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): boolean {
    if (collection == null)
        return true
    if (collection.isEmpty)
        return true
    return __hasNoNulls(collection, collection.size,)
}

/**
 * The {@link collection} has no <b>null</b> or <b>undefined</b>
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @return {boolean} <b>true</b> only if no element is <b>null</b> or <b>undefined</b>
 * @extensionFunction
 */
export function hasNoNullsByArray<const T, >(collection: Nullable<readonly T[]>,): boolean {
    if (collection == null)
        return true

    const size = collection.length
    if (size == 0)
        return true
    return __hasNoNullsByArray(collection, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasNoNulls(collection: MinimalistCollectionHolder, size: number,) {
    let index = -1
    while (++index < size)
        if (collection.get(index,) == null)
            return false
    return true
}

function __hasNoNullsByArray(collection: readonly unknown[], size: number,) {
    let index = -1
    while (++index < size)
        if (collection[index] == null)
            return false
    return true
}

//#endregion -------------------- Loop methods --------------------
