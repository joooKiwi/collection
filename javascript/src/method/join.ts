/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {StringCallback}             from "../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {joinToString, joinToStringByCollectionHolder, prefixAndPostfixOnly as new_prefixAndPostfixOnly} from "./joinToString"

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
 * @param prefix     The character before the join ({@link CollectionConstants.DEFAULT_JOIN_PREFIX '['} by default)
 * @param postfix    The character after the join ({@link CollectionConstants.DEFAULT_JOIN_POSTFIX ']'} by default)
 * @param limit      The maximum amount of values in the join (null by default)
 * @param truncated  The truncated string if there is a limit ({@link CollectionConstants.DEFAULT_JOIN_TRUNCATED '…'} by default)
 * @param transform  A callback to transform into a {@link String}
 * @throws CollectionHolderIndexOutOfBoundsException The {@link limit} is not within a valid range
 * @throws ForbiddenIndexException                   The {@link limit} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @deprecated Use joinToString instead. It will be removed in version 1.10
 */
export function join<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, separator: NullableString = null, prefix: NullableString = null, postfix: NullableString = null, limit: NullableNumber = null, truncated: NullableString = null, transform: Nullable<StringCallback<T>> = null,): string {
    return joinToString(collection, separator, prefix, postfix, limit, truncated, transform,)
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
 * @param prefix     The character before the join ({@link CollectionConstants.DEFAULT_JOIN_PREFIX '['} by default)
 * @param postfix    The character after the join ({@link CollectionConstants.DEFAULT_JOIN_POSTFIX ']'} by default)
 * @param limit      The maximum amount of values in the join (null by default)
 * @param truncated  The truncated string if there is a limit ({@link CollectionConstants.DEFAULT_JOIN_TRUNCATED '…'} by default)
 * @param transform  A callback to transform into a {@link String}
 * @throws CollectionHolderIndexOutOfBoundsException The {@link limit} is not within a valid range
 * @throws ForbiddenIndexException                   The {@link limit} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @deprecated Use joinToStringByCollectionHolder instead. It will be removed in version 1.10
 */
export function joinByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, separator: NullableString = null, prefix: NullableString = null, postfix: NullableString = null, limit: NullableNumber = null, truncated: NullableString = null, transform: Nullable<StringCallback<T>> = null,): string {
    return joinToStringByCollectionHolder(collection, separator, prefix, postfix, limit, truncated, transform,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Prefix & postfix method --------------------

/**
 * Join both {@link prefix} and {@link postfix} together
 *
 * @param prefix The prefix to apply (or {@link CollectionConstants.DEFAULT_JOIN_PREFIX '['} by default)
 * @param postfix The prefix to apply (or {@link CollectionConstants.DEFAULT_JOIN_POSTFIX ']'} by default)
 * @deprecated Use prefixAndPostfixOnly in the import "joinToString" instead. It will be removed in version 1.10
 */
export function prefixAndPostfixOnly(prefix: NullableString = null, postfix: NullableString = null,): string {
    return new_prefixAndPostfixOnly(prefix, postfix,)
}

//#endregion -------------------- Prefix & postfix method --------------------
