/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable}                   from "../general type"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {asUpperCaseString} from "./asString"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toUpperCase toUpperCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @see String.toUpperCase
 * @extensionFunction
 */
export function toUpperCaseString<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): string {
    if (collection == null)
        return "[]"
    if (collection.isEmpty)
        return "[]"

    let string = ""
    const sizeMinus1 = collection.size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asUpperCaseString(collection.get(index,))}, `
    return `[${string}${asUpperCaseString(collection.get(index,))}]`
}

//#endregion -------------------- Facade method --------------------
