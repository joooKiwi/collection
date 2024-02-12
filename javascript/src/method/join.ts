/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}           from "../CollectionHolder"
import type {StringCallback}             from "../CollectionHolder.types"
import type {Nullable}                   from "../general type"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link String} from every element in the {@link collection} using a {@link separator}
 * utilizing the given {@link prefix} and {@link postfix} if supplied.
 *
 * Note that if the {@link collection} is huge,
 * a {@link limit} can be specified followed by a {@link truncated} value.
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param separator  The separator for the result ({@link CollectionConstants.DEFAULT_JOIN_SEPARATOR ", "} by default)
 * @param prefix     The character before the join ({@link CollectionConstants.DEFAULT_JOIN_PREFIX "["} by default)
 * @param postfix    The character after the join ({@link CollectionConstants.DEFAULT_JOIN_POSTFIX "]"} by default)
 * @param limit      The maximum amount of values in the join (null by default)
 * @param truncated  The truncated string if there is a limit ({@link CollectionConstants.DEFAULT_JOIN_TRUNCATED "…"} by default)
 * @param transform  A callback to transform into a {@link String}
 * @throws CollectionHolderIndexOutOfBoundsException The {@link limit} is not within a valid range
 * @see ReadonlyArray.join
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/join-to-string.html Kotlin joinToString()
 * @see https://learn.microsoft.com/dotnet/api/system.string.join C# string.Join()
 * @canReceiveNegativeValue
 */
export function join<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, separator: Nullable<string> = null, prefix: Nullable<string> = null, postfix: Nullable<string> = null, limit: Nullable<number> = null, truncated: Nullable<string> = null, transform: Nullable<StringCallback<T>> = null,): string {
    if (collection == null)
        return prefixAndPostfixOnly(prefix, postfix,)

    const size = collection.size
    if (size == 0)
        return prefixAndPostfixOnly(prefix, postfix,)

    if (transform == null) {
        if (limit == null)
            return __withNothing(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size,)

        if (size === limit)
            return __withNothing(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size,)
        return __withTruncated(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', limit, truncated ?? '…',)
    }

    if (limit == null) {
        if (transform.length == 1)
            return __with1Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size, transform as (value: T,) => string,)
        if (transform.length >= 2)
            return __with2Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size, transform,)
        return __with0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size, transform as () => string,)
    }

    const maximumIndex = __maximumIndex(limit, size,)
    if (maximumIndex == size) {
        if (transform.length == 1)
            return __with1Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as (value: T,) => string,)
        if (transform.length >= 2)
            return __with2Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform,)
        return __with0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as () => string,)
    }

    if (transform.length == 1)
        return __withTruncatedAnd1Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', maximumIndex, truncated ?? '…', transform as (value: T,) => string,)
    if (transform.length >= 2)
        return __withTruncatedAnd2Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', maximumIndex, truncated ?? '…', transform,)
    return __withTruncatedAnd0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', maximumIndex, truncated ?? '…', transform as () => string,)
}

/**
 * Create a new {@link String} from every element in the {@link collection} using a {@link separator}
 * utilizing the given {@link prefix} and {@link postfix} if supplied.
 *
 * Note that if the {@link collection} is huge,
 * a {@link limit} can be specified followed by a {@link truncated} value.
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param separator  The separator for the result ({@link CollectionConstants.DEFAULT_JOIN_SEPARATOR ", "} by default)
 * @param prefix     The character before the join ({@link CollectionConstants.DEFAULT_JOIN_PREFIX "["} by default)
 * @param postfix    The character after the join ({@link CollectionConstants.DEFAULT_JOIN_POSTFIX "]"} by default)
 * @param limit      The maximum amount of values in the join (null by default)
 * @param truncated  The truncated string if there is a limit ({@link CollectionConstants.DEFAULT_JOIN_TRUNCATED "…"} by default)
 * @param transform  A callback to transform into a {@link String}
 * @throws CollectionHolderIndexOutOfBoundsException The {@link limit} is not within a valid range
 * @see ReadonlyArray.join
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/join-to-string.html Kotlin joinToString()
 * @see https://learn.microsoft.com/dotnet/api/system.string.join C# string.Join()
 * @canReceiveNegativeValue
 */
export function joinByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, separator: Nullable<string> = null, prefix: Nullable<string> = null, postfix: Nullable<string> = null, limit: Nullable<number> = null, truncated: Nullable<string> = null, transform: Nullable<StringCallback<T>> = null,): string {
    if (collection == null)
        return prefixAndPostfixOnly(prefix, postfix,)
    if (collection.isEmpty)
        return prefixAndPostfixOnly(prefix, postfix,)

    if (transform == null) {
        if (limit == null)
            return __withNothing(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size,)

        const size = collection.size
        if (size === limit)
            return __withNothing(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size,)
        return __withTruncated(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', limit, truncated ?? '…',)
    }

    if (limit == null) {
        if (transform.length == 1)
            return __with1Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size, transform as (value: T,) => string,)
        if (transform.length >= 2)
            return __with2Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size, transform,)
        return __with0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size, transform as () => string,)
    }

    const size = collection.size
    if (size === limit) {
        if (transform.length == 1)
            return __with1Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as (value: T,) => string,)
        if (transform.length >= 2)
            return __with2Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform,)
        return __with0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as () => string,)
    }

    if (transform.length == 1)
        return __withTruncatedAnd1Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', __maximumIndex(limit, size,), truncated ?? '…', transform as (value: T,) => string,)
    if (transform.length >= 2)
        return __withTruncatedAnd2Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', __maximumIndex(limit, size,), truncated ?? '…', transform,)
    return __withTruncatedAnd0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', __maximumIndex(limit, size,), truncated ?? '…', transform as () => string,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Prefix & postfix method --------------------

/**
 * Join both {@link prefix} and {@link postfix} together
 *
 * @param prefix The prefix to apply (or {@link CollectionConstants.DEFAULT_JOIN_PREFIX "["} by default)
 * @param postfix The prefix to apply (or {@link CollectionConstants.DEFAULT_JOIN_POSTFIX "]"} by default)
 * @see join
 * @see joinByCollectionHolder
 */
export function prefixAndPostfixOnly(prefix: Nullable<string> = null, postfix: Nullable<string> = null,): string {
    return `${prefix ?? '['}${postfix ?? ']'}`
}

//#endregion -------------------- Prefix & postfix method --------------------
//#region -------------------- Utility methods --------------------

function __maximumIndex(limit: number, size: number,) {
    if (limit > size)
        throw new CollectionHolderIndexOutOfBoundsException(`The limit "${limit}" cannot over the collection size "${size}".`, limit,)

    let maximumIndex = limit
    if (maximumIndex < 0)
        maximumIndex += size
    if (maximumIndex < 0)
        throw new CollectionHolderIndexOutOfBoundsException(`The limit "${limit}" ("${maximumIndex}" after calculation) cannot under 0.`, limit,)

    return maximumIndex
}

//#endregion -------------------- Utility methods --------------------
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
    const lastIndexMinus1 = lastIndex - 1
    let index = -1
    while (++index < lastIndexMinus1)
        string += `${collection.get(index,)}${separator}`
    return `${prefix}${string}${collection.get(index,)}${separator}${truncated}${postfix}`
}


function __withTruncatedAnd0Argument(separator: string, prefix: string, postfix: string, lastIndex: number, truncated: string, transform: () => string,) {
    let string = ""
    const lastIndexMinus1 = lastIndex - 1
    let index = -1
    while (++index < lastIndexMinus1)
        string += `${transform()}${separator}`
    return `${prefix}${string}${transform()}${separator}${truncated}${postfix}`
}

function __withTruncatedAnd1Argument<const T, >(collection: MinimalistCollectionHolder<T>, separator: string, prefix: string, postfix: string, lastIndex: number, truncated: string, transform: (value: T,) => string,) {
    let string = ""
    const lastIndexMinus1 = lastIndex - 1
    let index = -1
    while (++index < lastIndexMinus1)
        string += `${transform(collection.get(index,),)}${separator}`
    return `${prefix}${string}${transform(collection.get(index,),)}${separator}${truncated}${postfix}`
}

function __withTruncatedAnd2Argument<const T, >(collection: MinimalistCollectionHolder<T>, separator: string, prefix: string, postfix: string, lastIndex: number, truncated: string, transform: (value: T, index: number,) => string,) {
    let string = ""
    const lastIndexMinus1 = lastIndex - 1
    let index = -1
    while (++index < lastIndexMinus1)
        string += `${transform(collection.get(index,), index,)}${separator}`
    return `${prefix}${string}${transform(collection.get(index,), index,)}${separator}${truncated}${postfix}`
}

//#endregion -------------------- Loop methods --------------------
