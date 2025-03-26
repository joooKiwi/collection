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

import type {Nullable, NullableNumber, NullableString} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {StringCallback}             from "../type/callback"

import {__lastIndex}                   from "./_indexes utility"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link String} from every element in the {@link collection} using a {@link separator}
 * utilizing the given {@link prefix} and {@link postfix} if supplied.
 *
 * Note that if the {@link collection} is huge,
 * a {@link limit} can be specified followed by a {@link truncated} value.
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
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
export function joinToString<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, separator: NullableString = null, prefix: NullableString = null, postfix: NullableString = null, limit: NullableNumber = null, truncated: NullableString = null, transform: Nullable<StringCallback<T>> = null,): string {
    if (collection == null)
        return prefixAndPostfixOnly(prefix, postfix,)
    if (isCollectionHolder(collection,))
        return joinToStringByCollectionHolder(collection, separator, prefix, postfix, limit, truncated, transform,)
    if (isArray(collection,))
        return joinToStringByArray(collection, separator, prefix, postfix, limit, truncated, transform,)
    if (isMinimalistCollectionHolder(collection,))
        return joinToStringByMinimalistCollectionHolder(collection, separator, prefix, postfix, limit, truncated, transform,)

    if (isCollectionHolderByStructure<T>(collection,))
        return joinToStringByCollectionHolder(collection, separator, prefix, postfix, limit, truncated, transform,)
    if (isArrayByStructure<T>(collection,))
        return joinToStringByArray(collection, separator, prefix, postfix, limit, truncated, transform,)
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
    if (limit == null)
        if (transform.length == 1)
            return __with1Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as (value: T,) => string,)
        else if (transform.length >= 2)
            return __with2Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform,)
        else
            return __with0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as () => string,)

    const lastIndex = __lastIndex(limit, size,)
    if (lastIndex == 0)
        return "[]"
    if (lastIndex == size)
        if (transform.length == 1)
            return __with1Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as (value: T,) => string,)
        else if (transform.length >= 2)
            return __with2Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform,)
        else
            return __with0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as () => string,)
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

    if (limit == null)
        if (transform.length == 1)
            return __with1Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size, transform as (value: T,) => string,)
        else if (transform.length >= 2)
            return __with2Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size, transform,)
        else
            return __with0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.size, transform as () => string,)

    const size = collection.size
    const lastIndex = __lastIndex(limit, size,)
    if (lastIndex == 0)
        return "[]"
    if (lastIndex == size)
        if (transform.length == 1)
            return __with1Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as (value: T,) => string,)
        else if (transform.length >= 2)
            return __with2Argument(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform,)
        else
            return __with0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as () => string,)
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
export function joinToStringByArray<const T, >(collection: Nullable<readonly T[]>, separator: NullableString = null, prefix: NullableString = null, postfix: NullableString = null, limit: NullableNumber = null, truncated: NullableString = null, transform: Nullable<StringCallback<T>> = null,): string {
    if (collection == null)
        return prefixAndPostfixOnly(prefix, postfix,)

    const size = collection.length
    if (size == 0)
        return prefixAndPostfixOnly(prefix, postfix,)

    if (limit == 0)
        return "[]"
    if (transform == null) {
        if (limit == null)
            return __withNothingByArray(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', collection.length,)

        const lastIndex = __lastIndex(limit, size,)
        if (lastIndex == 0)
            return "[]"
        if (lastIndex == size)
            return __withNothingByArray(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size,)
        return __withTruncatedByArray(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', lastIndex, truncated ?? '…',)
    }
    if (limit == null)
        if (transform.length == 1)
            return __with1ArgumentByArray(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as (value: T,) => string,)
        else if (transform.length >= 2)
            return __with2ArgumentByArray(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform,)
        else
            return __with0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as () => string,)

    const lastIndex = __lastIndex(limit, size,)
    if (lastIndex == 0)
        return "[]"
    if (lastIndex == size)
        if (transform.length == 1)
            return __with1ArgumentByArray(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as (value: T,) => string,)
        else if (transform.length >= 2)
            return __with2ArgumentByArray(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform,)
        else
            return __with0Argument(separator ?? ", ", prefix ?? '[', postfix ?? ']', size, transform as () => string,)
    if (transform.length == 1)
        return __withTruncatedAnd1ArgumentByArray(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', lastIndex, truncated ?? '…', transform as (value: T,) => string,)
    if (transform.length >= 2)
        return __withTruncatedAnd2ArgumentByArray(collection, separator ?? ", ", prefix ?? '[', postfix ?? ']', lastIndex, truncated ?? '…', transform,)
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

function __withNothingByArray(collection: readonly unknown[], separator: string, prefix: string, postfix: string, lastIndex: number,) {
    let string = ""
    const sizeMinus1 = lastIndex - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${collection[index]}${separator}`
    return `${prefix}${string}${collection[index]}${postfix}`
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

function __with1ArgumentByArray<const T, >(collection: readonly T[], separator: string, prefix: string, postfix: string, lastIndex: number, transform: (value: T,) => string,) {
    let string = ""
    const sizeMinus1 = lastIndex - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${transform(collection[index] as T,)}${separator}`
    return `${prefix}${string}${transform(collection[index] as T,)}${postfix}`
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, separator: string, prefix: string, postfix: string, lastIndex: number, transform: (value: T, index: number,) => string,) {
    let string = ""
    const sizeMinus1 = lastIndex - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${transform(collection.get(index,), index,)}${separator}`
    return `${prefix}${string}${transform(collection.get(index,), index,)}${postfix}`
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], separator: string, prefix: string, postfix: string, lastIndex: number, transform: (value: T, index: number,) => string,) {
    let string = ""
    const sizeMinus1 = lastIndex - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${transform(collection[index] as T, index,)}${separator}`
    return `${prefix}${string}${transform(collection[index] as T, index,)}${postfix}`
}


function __withTruncated(collection: MinimalistCollectionHolder, separator: string, prefix: string, postfix: string, lastIndex: number, truncated: string,) {
    let string = ""
    let index = -1
    while (++index < lastIndex)
        string += `${collection.get(index,)}${separator}`
    return `${prefix}${string}${truncated}${postfix}`
}

function __withTruncatedByArray(collection: readonly unknown[], separator: string, prefix: string, postfix: string, lastIndex: number, truncated: string,) {
    let string = ""
    let index = -1
    while (++index < lastIndex)
        string += `${collection[index]}${separator}`
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

function __withTruncatedAnd1ArgumentByArray<const T, >(collection: readonly T[], separator: string, prefix: string, postfix: string, lastIndex: number, truncated: string, transform: (value: T,) => string,) {
    let string = ""
    let index = -1
    while (++index < lastIndex)
        string += `${transform(collection[index] as T,)}${separator}`
    return `${prefix}${string}${truncated}${postfix}`
}


function __withTruncatedAnd2Argument<const T, >(collection: MinimalistCollectionHolder<T>, separator: string, prefix: string, postfix: string, lastIndex: number, truncated: string, transform: (value: T, index: number,) => string,) {
    let string = ""
    let index = -1
    while (++index < lastIndex)
        string += `${transform(collection.get(index,), index,)}${separator}`
    return `${prefix}${string}${truncated}${postfix}`
}

function __withTruncatedAnd2ArgumentByArray<const T, >(collection: readonly T[], separator: string, prefix: string, postfix: string, lastIndex: number, truncated: string, transform: (value: T, index: number,) => string,) {
    let string = ""
    let index = -1
    while (++index < lastIndex)
        string += `${transform(collection[index] as T, index,)}${separator}`
    return `${prefix}${string}${truncated}${postfix}`
}

//#endregion -------------------- Loop methods --------------------
