/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable}                   from "../general type"
import type {SimplisticCollectionHolder} from "../SimplisticCollectionHolder"

import {asLowerCaseString} from "./asString"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toLowerCase toLowerCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @see String.toLowerCase
 * @extensionFunction
 */
export function toLowerCaseString<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>,): string {
    if (collection == null)
        return "[]"
    if (collection.isEmpty)
        return "[]"

    let string = ""
    const sizeMinus1 = collection.size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asLowerCaseString(collection.get(index,),)}, `
    return `[${string}${asLowerCaseString(collection.get(index,),)}]`
}

//#endregion -------------------- Facade method --------------------
