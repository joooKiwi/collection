/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableString} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {asLocaleLowerCaseString}       from "./asString"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toLocaleLowerCase toLocaleLowerCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param locale     The possible locale to apply on each value
 * @see String.toLocaleLowerCase
 * @extensionFunction
 */
export function toLocaleLowerCaseString<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, locale?: NullableString,): string {
    if (collection == null)
        return "[]"
    if (isCollectionHolder(collection,))
        return toLocaleLowerCaseStringByCollectionHolder(collection, locale,)
    if (isCollectionHolderByStructure<T>(collection,))
        return toLocaleLowerCaseStringByCollectionHolder(collection, locale,)
    return toLocaleLowerCaseStringByMinimalistCollectionHolder(collection, locale,)
}


/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toLocaleLowerCase toLocaleLowerCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param locale     The possible locale to apply on each value
 * @see String.toLocaleLowerCase
 * @extensionFunction
 */
export function toLocaleLowerCaseStringByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, locale?: NullableString,): string {
    if (collection == null)
        return "[]"

    const size = collection.size
    if (size == 0)
        return "[]"
    if (locale == null)
        return __withNoLocale(collection, size,)
    return __withLocale(collection, locale, size,)
}

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toLocaleLowerCase toLocaleLowerCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param locale     The possible locale to apply on each value
 * @see String.toLocaleLowerCase
 * @extensionFunction
 */
export function toLocaleLowerCaseStringByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, locale?: NullableString,): string {
    if (collection == null)
        return "[]"
    if (collection.isEmpty)
        return "[]"
    if (locale == null)
        return __withNoLocale(collection, collection.size,)
    return __withLocale(collection, locale, collection.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

function __withNoLocale(collection: MinimalistCollectionHolder, size: number,) {
    let string = ""
    const sizeMinus1 = size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asLocaleLowerCaseString(collection.get(index,),)}, `
    return `[${string}${asLocaleLowerCaseString(collection.get(index,),)}]`
}

function __withLocale(collection: MinimalistCollectionHolder, locale: string, size: number,) {
    let string = ""
    const sizeMinus1 = size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asLocaleLowerCaseString(collection.get(index,), locale,)}, `
    return `[${string}${asLocaleLowerCaseString(collection.get(index,), locale,)}]`
}

//#endregion -------------------- Loop method --------------------
