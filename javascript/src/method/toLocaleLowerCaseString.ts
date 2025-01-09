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

import type {Nullable, NullableString} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {asLocaleLowerCaseString}       from "./asString"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toLocaleLowerCase toLocaleLowerCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param locale     The possible locale to apply on each value
 * @see String.toLocaleLowerCase
 * @extensionFunction
 */
export function toLocaleLowerCaseString<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, locale?: NullableString,): string {
    if (collection == null)
        return "[]"
    if (isCollectionHolder<T>(collection,))
        return toLocaleLowerCaseStringByCollectionHolder(collection, locale,)
    if (isArray(collection,))
        return toLocaleLowerCaseStringByArray(collection, locale,)
    if (isCollectionHolderByStructure<T>(collection,))
        return toLocaleLowerCaseStringByCollectionHolder(collection, locale,)
    if (isArrayByStructure<T>(collection,))
        return toLocaleLowerCaseStringByArray(collection, locale,)
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

/**
 * Convert the {@link collection} to a {@link String} on every value
 * by calling its "<i>{@link String.toLocaleLowerCase toLocaleLowerCase()}</i>" method
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param locale     The possible locale to apply on each value
 * @see String.toLocaleLowerCase
 * @extensionFunction
 */
export function toLocaleLowerCaseStringByArray<const T, >(collection: Nullable<readonly T[]>, locale?: NullableString,): string {
    if (collection == null)
        return "[]"

    const size = collection.length
    if (size == 0)
        return "[]"
    if (locale == null)
        return __withNoLocaleByArray(collection, size,)
    return __withLocaleByArray(collection, locale, size,)
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

function __withNoLocaleByArray(collection: readonly unknown[], size: number,) {
    let string = ""
    const sizeMinus1 = size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asLocaleLowerCaseString(collection[index],)}, `
    return `[${string}${asLocaleLowerCaseString(collection[index],)}]`
}

function __withLocale(collection: MinimalistCollectionHolder, locale: string, size: number,) {
    let string = ""
    const sizeMinus1 = size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asLocaleLowerCaseString(collection.get(index,), locale,)}, `
    return `[${string}${asLocaleLowerCaseString(collection.get(index,), locale,)}]`
}


function __withLocaleByArray(collection: readonly unknown[], locale: string, size: number,) {
    let string = ""
    const sizeMinus1 = size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asLocaleLowerCaseString(collection[index], locale,)}, `
    return `[${string}${asLocaleLowerCaseString(collection[index], locale,)}]`
}

//#endregion -------------------- Loop method --------------------
