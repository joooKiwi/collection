/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {asLowerCaseString}             from "./asString"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toLowerCase toLowerCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @see String.toLowerCase
 * @extensionFunction
 */
export function toLowerCaseString<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>,): string {
    if (collection == null)
        return "[]"
    if (isCollectionHolder<T>(collection,))
        return toLowerCaseStringByCollectionHolder(collection,)
    if (isArray(collection,))
        return toLowerCaseStringByArray(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return toLowerCaseStringByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return toLowerCaseStringByArray(collection,)
    return toLowerCaseStringByMinimalistCollectionHolder(collection,)
}


/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toLowerCase toLowerCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @see String.toLowerCase
 * @extensionFunction
 */
export function toLowerCaseStringByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): string {
    if (collection == null)
        return "[]"

    const size = collection.size
    if (size == 0)
        return "[]"
    return __toString(collection, size,)
}

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toLowerCase toLowerCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see String.toLowerCase
 * @extensionFunction
 */
export function toLowerCaseStringByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): string {
    if (collection == null)
        return "[]"
    if (collection.isEmpty)
        return "[]"
    return __toString(collection, collection.size,)
}

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toLowerCase toLowerCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @see String.toLowerCase
 * @extensionFunction
 */
export function toLowerCaseStringByArray<const T, >(collection: Nullable<readonly T[]>,): string {
    if (collection == null)
        return "[]"

    const size = collection.length
    if (size == 0)
        return "[]"
    return __toStringByArray(collection, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

function __toString(collection: MinimalistCollectionHolder, size: number,) {
    let string = ""
    const sizeMinus1 = size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asLowerCaseString(collection.get(index,),)}, `
    return `[${string}${asLowerCaseString(collection.get(index,),)}]`
}

function __toStringByArray(collection: readonly unknown[], size: number,) {
    let string = ""
    const sizeMinus1 = size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asLowerCaseString(collection[index],)}, `
    return `[${string}${asLowerCaseString(collection[index],)}]`
}

//#endregion -------------------- Loop method --------------------
