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

import {asUpperCaseString}             from "./asString"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toUpperCase toUpperCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @see String.toUpperCase
 * @extensionFunction
 */
export function toUpperCaseString<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,): string {
    if (collection == null)
        return "[]"
    if (isCollectionHolder(collection,))
        return toUpperCaseStringByCollectionHolder(collection,)
    if (isArray(collection,))
        return toUpperCaseStringByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return toUpperCaseStringByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return toUpperCaseStringByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return toUpperCaseStringByArray(collection,)
    return toUpperCaseStringByMinimalistCollectionHolder(collection,)
}


/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toUpperCase toUpperCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @see String.toUpperCase
 * @extensionFunction
 */
export function toUpperCaseStringByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): string {
    if (collection == null)
        return "[]"

    const size = collection.size
    if (size == 0)
        return "[]"
    return __toString(collection, size,)
}

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toUpperCase toUpperCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see String.toUpperCase
 * @extensionFunction
 */
export function toUpperCaseStringByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): string {
    if (collection == null)
        return "[]"
    if (collection.isEmpty)
        return "[]"
    return __toString(collection, collection.size,)
}

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toUpperCase toUpperCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @see String.toUpperCase
 * @extensionFunction
 */
export function toUpperCaseStringByArray<const T, >(collection: Nullable<readonly T[]>,): string {
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
        string += `${asUpperCaseString(collection.get(index,),)}, `
    return `[${string}${asUpperCaseString(collection.get(index,),)}]`
}

function __toStringByArray(collection: readonly unknown[], size: number,) {
    let string = ""
    const sizeMinus1 = size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asUpperCaseString(collection[index],)}, `
    return `[${string}${asUpperCaseString(collection[index],)}]`
}

//#endregion -------------------- Loop method --------------------
