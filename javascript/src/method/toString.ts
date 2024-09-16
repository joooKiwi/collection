/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {asString}                      from "./asString"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link Object.toString toString()}</i>" method
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @see Array.toString
 * @see Object.toString
 * @extensionFunction
 */
export function toString<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): string {
    if (collection == null)
        return "[]"
    if (isCollectionHolder(collection,))
        return toStringByCollectionHolder(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return toStringByCollectionHolder(collection,)
    return toStringByMinimalistCollectionHolder(collection,)
}


/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link Object.toString toString()}</i>" method
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @see Array.toString
 * @see Object.toString
 * @extensionFunction
 */
export function toStringByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): string {
    if (collection == null)
        return "[]"

    const size = collection.size
    if (size == 0)
        return "[]"
    return __toString(collection, size,)
}

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link Object.toString toString()}</i>" method
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see Array.toString
 * @see Object.toString
 * @extensionFunction
 */
export function toStringByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): string {
    if (collection == null)
        return "[]"

    const size = collection.size
    if (size == 0)
        return "[]"
    return __toString(collection, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

function __toString(collection: MinimalistCollectionHolder, size: number,) {
    let string = ""
    const sizeMinus1 = size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asString(collection.get(index,),)}, `
    return `[${string}${asString(collection.get(index),)}]`
}

//#endregion -------------------- Loop method --------------------
