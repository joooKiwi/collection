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

import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {CollectionHolder}           from "../CollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Tell whenever the {@link value} <b>does not</b> exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param value      The value to compare
 * @return {boolean} <b>true</b> if the {@link value} is not present in the {@link collection}
 */
export function hasNot<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, value: T,): boolean {
    if (collection == null)
        return true
    if (isCollectionHolder(collection,))
        return hasNotByCollectionHolder(collection, value,)
    if (isArray(collection,))
        return hasNotByArray(collection, value,)
    if (isMinimalistCollectionHolder(collection,))
        return hasNotByMinimalistCollectionHolder(collection, value,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasNotByCollectionHolder(collection, value,)
    if (isArrayByStructure<T>(collection,))
        return hasNotByArray(collection, value,)
    return hasNotByMinimalistCollectionHolder(collection, value,)
}


/**
 * Tell whenever the {@link value} <b>does not</b> exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param value      The value to compare
 * @return {boolean} <b>true</b> if the {@link value} is not present in the {@link collection}
 */
export function hasNotByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, value: T,): boolean {
    if (collection == null)
        return true

    const size = collection.size
    if (size == 0)
        return true
    return __validate(collection, value, size,)
}

/**
 * Tell whenever the {@link value} <b>does not</b> exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param value      The value to compare
 * @return {boolean} <b>true</b> if the {@link value} is not present in the {@link collection}
 */
export function hasNotByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, value: T,): boolean {
    if (collection == null)
        return true
    if (collection.isEmpty)
        return true
    return __validate(collection, value, collection.size,)
}

/**
 * Tell whenever the {@link value} <b>does not</b> exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param value      The value to compare
 * @return {boolean} <b>true</b> if the {@link value} is not present in the {@link collection}
 */
export function hasNotByArray<const T, >(collection: Nullable<readonly T[]>, value: T,): boolean {
    if (collection == null)
        return true

    const size = collection.length
    if (size == 0)
        return true
    return __validateByArray(collection, value, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __validate<const T, >(collection: MinimalistCollectionHolder<T>, value: T, size: number,) {
    let index = -1
    while (++index < size)
        if (collection.get(index,) === value)
            return false
    return true
}

function __validateByArray<const T, >(collection: readonly T[], value: T, size: number,) {
    let index = -1
    while (++index < size)
        if (collection[index] === value)
            return false
    return true
}

//#endregion -------------------- Loop methods --------------------
