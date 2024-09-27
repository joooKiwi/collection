/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {StringCallback}             from "../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {__lastIndex}                   from "./_indexes utility"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link String} from every element in the {@link collection} using a {@link separator}
 * utilizing the given {@link prefix} and {@link postfix} if supplied.
 *
 * Note that if the {@link collection} is huge,
 * a {@link limit} can be specified followed by a {@link truncated} value.
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param separator  The {@link String} to separate the values ({@link CollectionConstants.DEFAULT_JOIN_SEPARATOR ", "} by default)
 * @param prefix     The {@link String} before the join ({@link CollectionConstants.DEFAULT_JOIN_PREFIX '['} by default)
 * @param postfix    The {@link String} after the join ({@link CollectionConstants.DEFAULT_JOIN_POSTFIX ']'} by default)
 * @param limit     The maximum number of values to loop (<b>null</b> by default)
 * @param truncated  The truncated string if there is a limit ({@link CollectionConstants.DEFAULT_JOIN_TRUNCATED '…'} by default)
 * @param transform  A callback to transform into a {@link String}
 * @throws ForbiddenIndexException  The {@link limit} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see ReadonlyArray.join
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/join-to-string.html Kotlin joinToString()
 * @see https://learn.microsoft.com/dotnet/api/system.string.join C# string.Join()
 * @canReceiveNegativeValue
 */
export function joinToString<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, separator: NullableString = null, prefix: NullableString = null, postfix: NullableString = null, limit: NullableNumber = null, truncated: NullableString = null, transform: Nullable<StringCallback<T>> = null,): string {
    if (collection == null)
        return prefixAndPostfixOnly(prefix, postfix,)
    if (isCollectionHolder<T>(collection,))
        return joinToStringByCollectionHolder(collection, separator, prefix, postfix, limit, truncated, transform,)
    if (isCollectionHolderByStructure<T>(collection,))
        return joinToStringByCollectionHolder(collection, separator, prefix, postfix, limit, truncated, transform,)
    return joinToStringByMinimalistCollectionHolder(collection, separator, prefix, postfix, limit, truncated, transform,)
}


/**
 * Create a new {@link String} from every element in the {@link collection} using a {@link separator}
 * utilizing the given {@link prefix} and {@link postfix} if supplied.
 *
 * Note that if the {@link collection} is huge,
 * a {@link limit} can be specified followed by a {@link truncated} value.
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param separator  The {@link String} to separate the values ({@link CollectionConstants.DEFAULT_JOIN_SEPARATOR ", "} by default)
 * @param prefix     The {@link String} before the join ({@link CollectionConstants.DEFAULT_JOIN_PREFIX '['} by default)
 * @param postfix    The {@link String} after the join ({@link CollectionConstants.DEFAULT_JOIN_POSTFIX ']'} by default)
 * @param limit     The maximum number of values to loop (<b>null</b> by default)
 * @param truncated  The truncated string if there is a limit ({@link CollectionConstants.DEFAULT_JOIN_TRUNCATED '…'} by default)
 * @param transform  A callback to transform into a {@link String}
 * @throws ForbiddenIndexException  The {@link limit} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see ReadonlyArray.join
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/join-to-string.html Kotlin joinToString()
 * @see https://learn.microsoft.com/dotnet/api/system.string.join C# string.Join()
 * @canReceiveNegativeValue
 */
export function joinToStringByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, separator: NullableString = null, prefix: NullableString = null, postfix: NullableString = null, limit: NullableNumber = null, truncated: NullableString = null, transform: Nullable<StringCallback<T>> = null,): string {
    if (collection == null)
        return prefixAndPostfixOnly(prefix, postfix,)

    const size = collection.size
    if (size == 0)
        return prefixAndPostfixOnly(prefix, postfix,)

    if (limit == 0)
        return "[]"
    if (transform == null) {
        if (limit == null)
            return __withNothing(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size,)

        const lastIndex = __lastIndex(limit, size,)
        if (lastIndex == 0)
            return "[]"
        if (lastIndex == size)
            return __withNothing(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size,)
        return __withTruncated(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', lastIndex, truncated ?? '…',)
    }

    if (limit == null) {
        if (transform.length == 1)
            return __with1Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size, transform as (value: T,) => string,)
        if (transform.length >= 2)
            return __with2Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size, transform,)
        return __with0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size, transform as () => string,)
    }

    const lastIndex = __lastIndex(limit, size,)
    if (lastIndex == 0)
        return "[]"
    if (lastIndex == size) {
        if (transform.length == 1)
            return __with1Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as (value: T,) => string,)
        if (transform.length >= 2)
            return __with2Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform,)
        return __with0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as () => string,)
    }

    if (transform.length == 1)
        return __withTruncatedAnd1Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', lastIndex, truncated ?? '…', transform as (value: T,) => string,)
    if (transform.length >= 2)
        return __withTruncatedAnd2Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', lastIndex, truncated ?? '…', transform,)
    return __withTruncatedAnd0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', lastIndex, truncated ?? '…', transform as () => string,)
}

/**
 * Create a new {@link String} from every element in the {@link collection} using a {@link separator}
 * utilizing the given {@link prefix} and {@link postfix} if supplied.
 *
 * Note that if the {@link collection} is huge,
 * a {@link limit} can be specified followed by a {@link truncated} value.
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param separator  The {@link String} to separate the values ({@link CollectionConstants.DEFAULT_JOIN_SEPARATOR ", "} by default)
 * @param prefix     The {@link String} before the join ({@link CollectionConstants.DEFAULT_JOIN_PREFIX '['} by default)
 * @param postfix    The {@link String} after the join ({@link CollectionConstants.DEFAULT_JOIN_POSTFIX ']'} by default)
 * @param limit     The maximum number of values to loop (<b>null</b> by default)
 * @param truncated  The truncated string if there is a limit ({@link CollectionConstants.DEFAULT_JOIN_TRUNCATED '…'} by default)
 * @param transform  A callback to transform into a {@link String}
 * @throws ForbiddenIndexException  The {@link limit} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see ReadonlyArray.join
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/join-to-string.html Kotlin joinToString()
 * @see https://learn.microsoft.com/dotnet/api/system.string.join C# string.Join()
 * @canReceiveNegativeValue
 */
export function joinToStringByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, separator: NullableString = null, prefix: NullableString = null, postfix: NullableString = null, limit: NullableNumber = null, truncated: NullableString = null, transform: Nullable<StringCallback<T>> = null,): string {
    if (collection == null)
        return prefixAndPostfixOnly(prefix, postfix,)
    if (collection.isEmpty)
        return prefixAndPostfixOnly(prefix, postfix,)

    if (limit == 0)
        return "[]"
    if (transform == null) {
        if (limit == null)
            return __withNothing(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size,)

        const size = collection.size
        const lastIndex = __lastIndex(limit, size,)
        if (lastIndex == 0)
            return "[]"
        if (lastIndex == size)
            return __withNothing(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size,)
        return __withTruncated(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', lastIndex, truncated ?? '…',)
    }

    if (limit == null) {
        if (transform.length == 1)
            return __with1Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size, transform as (value: T,) => string,)
        if (transform.length >= 2)
            return __with2Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size, transform,)
        return __with0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size, transform as () => string,)
    }

    const size = collection.size
    const lastIndex = __lastIndex(limit, size,)
    if (lastIndex == 0)
        return "[]"
    if (lastIndex == size) {
        if (transform.length == 1)
            return __with1Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as (value: T,) => string,)
        if (transform.length >= 2)
            return __with2Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform,)
        return __with0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as () => string,)
    }

    if (transform.length == 1)
        return __withTruncatedAnd1Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', lastIndex, truncated ?? '…', transform as (value: T,) => string,)
    if (transform.length >= 2)
        return __withTruncatedAnd2Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', lastIndex, truncated ?? '…', transform,)
    return __withTruncatedAnd0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', lastIndex, truncated ?? '…', transform as () => string,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Prefix & postfix method --------------------

/**
 * Join both {@link prefix} and {@link postfix} together
 *
 * @param prefix The prefix to apply (or {@link CollectionConstants.DEFAULT_JOIN_PREFIX '['} by default)
 * @param postfix The prefix to apply (or {@link CollectionConstants.DEFAULT_JOIN_POSTFIX ']'} by default)
 * @see joinToString
 * @see joinToStringByMinimalistCollectionHolder
 * @see joinToStringByCollectionHolder
 */
export function prefixAndPostfixOnly(prefix: NullableString = null, postfix: NullableString = null,): string {
    return `${prefix ?? '['}${postfix ?? ']'}`
}

//#endregion -------------------- Prefix & postfix method --------------------
//#region -------------------- Loop methods --------------------

function __withNothing(collection: MinimalistCollectionHolder, separator: string, prefix: string, postfix: string, lastIndex: number,) {
    let string = ""
    const sizeMinus1 = lastIndex - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${collection.get(index,)}${separator}`
    return `${prefix}${string}${collection.get(index,)}${postfix}`
}


function __with0Argument(separator: string, prefix: string, postfix: string, lastIndex: number, transform: () => string,) {
    let string = ""
    const sizeMinus1 = lastIndex - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${transform()}${separator}`
    return `${prefix}${string}${transform()}${postfix}`
}

function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, separator: string, prefix: string, postfix: string, lastIndex: number, transform: (value: T,) => string,) {
    let string = ""
    const sizeMinus1 = lastIndex - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${transform(collection.get(index,),)}${separator}`
    return `${prefix}${string}${transform(collection.get(index,),)}${postfix}`
}

function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, separator: string, prefix: string, postfix: string, lastIndex: number, transform: (value: T, index: number,) => string,) {
    let string = ""
    const sizeMinus1 = lastIndex - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${transform(collection.get(index,), index,)}${separator}`
    return `${prefix}${string}${transform(collection.get(index,), index,)}${postfix}`
}


function __withTruncated(collection: MinimalistCollectionHolder, separator: string, prefix: string, postfix: string, lastIndex: number, truncated: string,) {
    let string = ""
    let index = -1
    while (++index < lastIndex)
        string += `${collection.get(index,)}${separator}`
    return `${prefix}${string}${truncated}${postfix}`
}


function __withTruncatedAnd0Argument(separator: string, prefix: string, postfix: string, lastIndex: number, truncated: string, transform: () => string,) {
    let string = ""
    let index = -1
    while (++index < lastIndex)
        string += `${transform()}${separator}`
    return `${prefix}${string}${truncated}${postfix}`
}

function __withTruncatedAnd1Argument<const T, >(collection: MinimalistCollectionHolder<T>, separator: string, prefix: string, postfix: string, lastIndex: number, truncated: string, transform: (value: T,) => string,) {
    let string = ""
    let index = -1
    while (++index < lastIndex)
        string += `${transform(collection.get(index,),)}${separator}`
    return `${prefix}${string}${truncated}${postfix}`
}

function __withTruncatedAnd2Argument<const T, >(collection: MinimalistCollectionHolder<T>, separator: string, prefix: string, postfix: string, lastIndex: number, truncated: string, transform: (value: T, index: number,) => string,) {
    let string = ""
    let index = -1
    while (++index < lastIndex)
        string += `${transform(collection.get(index,), index,)}${separator}`
    return `${prefix}${string}${truncated}${postfix}`
}

//#endregion -------------------- Loop methods --------------------
