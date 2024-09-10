/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isCollectionHolder}                                from "./isCollectionHolder"
import {isCollectionHolderByStructure}                     from "./isCollectionHolderByStructure"
import {asUpperCaseString}                                 from "./asString"
import {toUpperCaseString as byCollectionHolder}           from "./collectionHolder/toUpperCaseString"
import {toUpperCaseString as byMinimalistCollectionHolder} from "./minimalistCollectionHolder/toUpperCaseString"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toUpperCase toUpperCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @see String.toUpperCase
 * @extensionFunction
 */
export function toUpperCaseString<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): string {
    if (collection == null)
        return "[]"
    if (isCollectionHolder(collection,))
        return byCollectionHolder(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return byCollectionHolder(collection,)
    return byMinimalistCollectionHolder(collection,)
}

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toUpperCase toUpperCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see String.toUpperCase
 * @extensionFunction
 * @deprecated Use toUpperCaseString from import("@joookiwi/collection/method/collectionHolder")
 */
export function toUpperCaseStringByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): string {
    return byCollectionHolder(collection,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

/** @internal */
export function __toString(collection: MinimalistCollectionHolder, size: number,) {
    let string = ""
    const sizeMinus1 = size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asUpperCaseString(collection.get(index,),)}, `
    return `[${string}${asUpperCaseString(collection.get(index,),)}]`
}

//#endregion -------------------- Loop method --------------------
