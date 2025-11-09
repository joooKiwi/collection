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
 * The {@link collection} has no duplicated value
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @return {boolean} <b>true</b> only if no element is equal (===) to another one
 * @extensionFunction
 */
export function hasNoDuplicates<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,): boolean {
    if (collection == null)
        return true
    if (isCollectionHolder(collection,))
        return hasNoDuplicatesByCollectionHolder(collection,)
    if (isArray(collection,))
        return hasNoDuplicatesByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return hasNoDuplicatesByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasNoDuplicatesByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return hasNoDuplicatesByArray(collection,)
    return hasNoDuplicatesByMinimalistCollectionHolder(collection,)
}


/**
 * The {@link collection} has no duplicated value
 *
 * @param collection The nullable collection
 * @return {boolean} <b>true</b> only if no element is equal (===) to another one
 * @extensionFunction
 */
export function hasNoDuplicatesByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): boolean {
    if (collection == null)
        return true

    const size = collection.size
    if (size == 0)
        return true
    if (size == 1)
        return true
    return __validate(collection, size,)
}

/**
 * The {@link collection} has no duplicated value
 *
 * @param collection The nullable collection
 * @return {boolean} <b>true</b> only if no element is equal (===) to another one
 * @extensionFunction
 */
export function hasNoDuplicatesByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): boolean {
    if (collection == null)
        return true
    if (collection.isEmpty)
        return true

    const size = collection.size
    if (size == 1)
        return true
    return __validate(collection, size,)
}

/**
 * The {@link collection} has no duplicated value
 *
 * @param collection The nullable collection
 * @return {boolean} <b>true</b> only if no element is equal (===) to another one
 * @extensionFunction
 */
export function hasNoDuplicatesByArray<const T, >(collection: Nullable<readonly T[]>,): boolean {
    if (collection == null)
        return true

    const size = collection.length
    if (size == 0)
        return true
    if (size == 1)
        return true
    return __validateByArray(collection, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __validate(collection: MinimalistCollectionHolder, size: number,) {
    const temporaryArray = new Array(size,)
    temporaryArray[0] = collection.get(0,)
    let amountOfItemAdded = 1
    let index = 0
    while (++index < size) {
        const value = collection.get(index,)
        let index2 = -1
        while (++index2 < amountOfItemAdded)
            if (temporaryArray[index2] === value)
                return false
        temporaryArray[amountOfItemAdded++] = value
    }

    return true
}

function __validateByArray(collection: readonly unknown[], size: number,) {
    const temporaryArray = new Array(size,)
    temporaryArray[0] = collection[0]
    let amountOfItemAdded = 1
    let index = 0
    while (++index < size) {
        const value = collection[index]
        let index2 = -1
        while (++index2 < amountOfItemAdded)
            if (temporaryArray[index2] === value)
                return false
        temporaryArray[amountOfItemAdded++] = value
    }

    return true
}

//#endregion -------------------- Loop methods --------------------
