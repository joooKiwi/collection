/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr}           from "../general type"
import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {NonEmptyCollectionHolder}   from "../NonEmptyCollectionHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"
import {ForbiddenIndexException}                   from "../exception/ForbiddenIndexException"

/**
 * Get a limit from a value between zero
 * and the {@link collection} {@link MinimalistCollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param limit      The limit (or {@link MinimalistCollectionHolder.size size} by default)
 * @param size       The size compared (or the {@link collection} {@link MinimalistCollectionHolder.size size} by default)
 * @throws CollectionHolderIndexOutOfBoundsException The {@link limit} is under 0 or over the {@link collection} {@link MinimalistCollectionHolder.size size} after calculation
 * @throws ForbiddenIndexException                   The {@link limit} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @deprecated This utility function is no longer used and will be removed in version 1.8.
 */
export function maximumIndex<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, limit: Nullable<number>, size?: Nullable<number>,): NullOr<number> {
    if (collection == null)
        return null

    const collectionSize = size ?? collection.size
    if (collectionSize == 0)
        return null
    if (limit == null)
        if (size == null)
            return collectionSize
        else
            return size

    if (size == null)
        return __maximumIndex(limit, collectionSize,)
    return __maximumIndex(limit, size,)
}

/**
 * Get a limit from a value between zero
 * and the {@link collection} {@link CollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param limit      The limit (or {@link CollectionHolder.size size} by default)
 * @param size       The size compared (or the {@link collection} {@link CollectionHolder.size size} by default)
 * @throws CollectionHolderIndexOutOfBoundsException The {@link limit} is under 0 or over the {@link collection} {@link CollectionHolder.size size} after calculation
 * @throws ForbiddenIndexException                   The {@link limit} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @deprecated This utility function is no longer used and will be removed in version 1.8.
 */
export function maximumIndexByCollectionHolder<const T, >(collection: NonEmptyCollectionHolder<T>, limit: Nullable<number>, size?: Nullable<number>,): number
/**
 * Get a limit from a value between zero
 * and the {@link collection} {@link CollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param limit      The limit (or {@link CollectionHolder.size size} by default)
 * @param size       The size compared (or the {@link collection} {@link CollectionHolder.size size} by default)
 * @throws CollectionHolderIndexOutOfBoundsException The {@link limit} is under 0 or over the {@link collection} {@link CollectionHolder.size size} after calculation
 * @throws ForbiddenIndexException                   The {@link limit} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @deprecated This utility function is no longer used and will be removed in version 1.8.
 */
export function maximumIndexByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, limit: Nullable<number>, size?: Nullable<number>,): NullOr<number>
export function maximumIndexByCollectionHolder(collection: Nullable<CollectionHolder>, limit: Nullable<number>, size: Nullable<number> = null,) {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null
    if (limit == null)
        if (size == null)
            return collection.size
        else
            return size

    if (size == null)
        return __maximumIndex(limit, collection.size,)
    return __maximumIndex(limit, size,)
}

function __maximumIndex(limit: number, size: number,): number {
    if (Number.isNaN(limit,))
        throw new ForbiddenIndexException("Forbidden index. The limit cannot be NaN.", limit,)
    if (limit == Number.NEGATIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The limit cannot be -∞.", limit,)
    if (limit == Number.POSITIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The limit cannot be +∞.", limit,)

    if (limit > size)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The limit "${limit}" cannot over the collection size "${size}".`, limit,)

    let maximumIndex = limit
    if (maximumIndex < 0)
        maximumIndex += size
    if (maximumIndex < 0)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The limit "${limit}" ("${maximumIndex}" after calculation) cannot under 0.`, limit,)

    return maximumIndex
}
