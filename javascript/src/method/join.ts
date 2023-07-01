/*
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi
 *
 * This project is free to use.
 * All the right is reserved to the author of this project.
 */

import type {CollectionHolder}              from "../CollectionHolder"
import type {ValueWithStringReturnCallback} from "../CollectionHolder.types"
import type {Nullable}                      from "../general type"

import {CollectionConstants} from "../CollectionConstants"

/**
 * Create a new {@link String} from every element in the {@link collection} using a {@link separator}
 * utilizing the given {@link prefix} and {@link postfix} if supplied.
 *
 * Note that if the {@link collection} is huge, a {@link limit} can be specified followed by a {@link truncated} value.
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param separator The separator for the result ({@link CollectionConstants.DEFAULT_JOIN_SEPARATOR ", "} by default)
 * @param prefix The character before the join ({@link CollectionConstants.DEFAULT_JOIN_PREFIX "["} by default)
 * @param postfix The character after the join ({@link CollectionConstants.DEFAULT_JOIN_POSTFIX  "]"} by default)
 * @param limit The maximum amount of values in the join (null by default)
 * @param truncated The truncated string if there is a limit ({@link CollectionConstants.DEFAULT_JOIN_TRUNCATED "…"} by default)
 * @param transform A callback to transform into a {@link String}
 *
 * @canReceiveNegativeValue
 * @see ReadonlyArray.join
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/join-to-string.html Kotlin joinToString()
 * @see https://learn.microsoft.com/dotnet/api/system.string.join C# string.Join()
 */
export function join<const T, >(collection: Nullable<CollectionHolder<T>>, separator: Nullable<string> = null, prefix: Nullable<string> = null, postfix: Nullable<string> = null, limit: Nullable<number> = null, truncated: Nullable<string> = null, transform: Nullable<ValueWithStringReturnCallback<T>> = null,): string {
    if (collection == null)
        return `${prefix ?? CollectionConstants.DEFAULT_JOIN_PREFIX}${postfix ?? CollectionConstants.DEFAULT_JOIN_POSTFIX}`

    if (collection.isEmpty)
        return `${prefix ?? CollectionConstants.DEFAULT_JOIN_PREFIX}${postfix ?? CollectionConstants.DEFAULT_JOIN_POSTFIX}`

    separator ??= CollectionConstants.DEFAULT_JOIN_SEPARATOR
    transform ??= it => it == null ? `${it}` : it.toString()

    let string = ''
    const hasALimit = limit != null,
        sizeMinus1 = (limit == null ? collection.size : limit < 0 ? collection.size + limit : limit) - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${transform(collection.get(index,),)}${separator}`
    return `${prefix ?? CollectionConstants.DEFAULT_JOIN_PREFIX}${string}${transform(collection.get(index,),)}${hasALimit ? `${separator}${truncated ?? CollectionConstants.DEFAULT_JOIN_TRUNCATED}` : CollectionConstants.EMPTY_STRING}${postfix ?? CollectionConstants.DEFAULT_JOIN_POSTFIX}`
}
