/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable}                           from "../general type"
import type {MinimalistCollectionHolder}         from "../MinimalistCollectionHolder"
import type {NonEmptyMinimalistCollectionHolder} from "../NonEmptyMinimalistCollectionHolder"

import {asLocaleUpperCaseString} from "./asString"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toLocaleUpperCase toLocaleUpperCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param locale     The possible locale to apply on each value
 * @see String.toLocaleUpperCase
 * @extensionFunction
 */
export function toLocaleUpperCaseString<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, locale?: Nullable<string>,): string {
    if (collection == null)
        return "[]"
    if (collection.isEmpty)
        return "[]"

    if (locale == null)
        return __withNoLocale(collection as NonEmptyMinimalistCollectionHolder<T>,)
    return __withLocale(collection as NonEmptyMinimalistCollectionHolder<T>, locale,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Locale method --------------------

function __withNoLocale<const T, >(collection: NonEmptyMinimalistCollectionHolder<T>,) {
    let string = ""
    const sizeMinus1 = collection.size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asLocaleUpperCaseString(collection.get(index,),)}, `
    return `[${string}${asLocaleUpperCaseString(collection.get(index,),)}]`
}

function __withLocale<const T, >(collection: NonEmptyMinimalistCollectionHolder<T>, locale: string,) {
    let string = ""
    const sizeMinus1 = collection.size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asLocaleUpperCaseString(collection.get(index,), locale,)}, `
    return `[${string}${asLocaleUpperCaseString(collection.get(index,), locale,)}]`
}

//#endregion -------------------- Locale method --------------------
