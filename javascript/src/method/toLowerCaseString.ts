/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {asLowerCaseString}             from "./asString"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toLowerCase toLowerCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @see String.toLowerCase
 * @extensionFunction
 */
export function toLowerCaseString<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): string {
    if (collection == null)
        return "[]"
    if (isCollectionHolder(collection,))
        return toLowerCaseStringByCollectionHolder(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return toLowerCaseStringByCollectionHolder(collection,)
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

//#endregion -------------------- Loop method --------------------
