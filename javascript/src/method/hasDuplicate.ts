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

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * The {@link collection} has at least one duplicate value
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @return {boolean} <b>true</b> only if one element is equal (===) to another one
 * @extensionFunction
 */
export function hasDuplicate<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,): boolean {
    if (collection == null)
        return false
    if (isCollectionHolder(collection,))
        return hasDuplicateByCollectionHolder(collection,)
    if (isArray(collection,))
        return hasDuplicateByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return hasDuplicateByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasDuplicateByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return hasDuplicateByArray(collection,)
    return hasDuplicateByMinimalistCollectionHolder(collection,)
}


/**
 * The {@link collection} has at least one duplicate value
 *
 * @param collection The nullable collection
 * @return {boolean} <b>true</b> only if one element is equal (===) to another one
 * @extensionFunction
 */
export function hasDuplicateByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): boolean {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false
    if (size == 1)
        return false
    return __validate(collection, size,)
}

/**
 * The {@link collection} has at least one duplicate value
 *
 * @param collection The nullable collection
 * @return {boolean} <b>true</b> only if one element is equal (===) to another one
 * @extensionFunction
 */
export function hasDuplicateByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): boolean {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false

    const size = collection.size
    if (size == 1)
        return false
    return __validate(collection, size,)
}

/**
 * The {@link collection} has at least one duplicate value
 *
 * @param collection The nullable collection
 * @return {boolean} <b>true</b> only if one element is equal (===) to another one
 * @extensionFunction
 */
export function hasDuplicateByArray<const T, >(collection: Nullable<readonly T[]>,): boolean {
    if (collection == null)
        return false

    const size = collection.length
    if (size == 0)
        return false
    if (size == 1)
        return false
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
                return true
        temporaryArray[amountOfItemAdded++] = value
    }

    return false
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
                return true
        temporaryArray[amountOfItemAdded++] = value
    }

    return false
}

//#endregion -------------------- Loop methods --------------------
