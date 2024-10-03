/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullableNumber} from "@joookiwi/type"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"
import {ForbiddenIndexException}                   from "../exception/ForbiddenIndexException"

/**
 * Get the starting index between 0 and the <code>{@link size} - 1</code>
 *
 * @param fromIndex The value to calculate
 * @param size      The last value that should be equivalent to the {@link MinimalistCollectionHolder.size size}
 * @throws CollectionHolderIndexOutOfBoundsException The value is equal or over to the {@link size} (before or after calculation)
 * @throws ForbiddenIndexException                   The value is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @internal
 */
export function __startingIndex(fromIndex: NullableNumber, size: number,) {
    if (fromIndex == null)
        return 0

    if (Number.isNaN(fromIndex,))
        throw new ForbiddenIndexException("Forbidden index. The starting index cannot be an index with NaN.", fromIndex,)
    if (fromIndex == Number.NEGATIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The starting index cannot be an index with -∞.", fromIndex,)
    if (fromIndex == Number.POSITIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The starting index cannot be an index with +∞.", fromIndex,)

    if (fromIndex == size)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The starting index "${fromIndex}" is the collection size "${size}".`, fromIndex,)
    if (fromIndex > size)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The starting index "${fromIndex}" is over the collection size "${size}".`, fromIndex,)

    let startingIndex = fromIndex
    if (startingIndex < 0)
        startingIndex += size
    if (startingIndex < 0)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The starting index "${fromIndex}" ("${startingIndex}" after calculation) is under 0.`, fromIndex,)
    return startingIndex
}

/**
 * Get the ending index between 0 and the <code>{@link size} - 1</code>
 *
 * @param toIndex The value to calculate
 * @param size    The last value that should be equivalent to the {@link MinimalistCollectionHolder.size size}
 * @throws CollectionHolderIndexOutOfBoundsException The value is equal or over to the {@link size} (before or after calculation)
 * @throws ForbiddenIndexException                   The value is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @internal
 */
export function __endingIndex(toIndex: NullableNumber, size: number,) {
    if (toIndex == null)
        return size - 1

    if (Number.isNaN(toIndex,))
        throw new ForbiddenIndexException("Forbidden index. The ending index cannot be determined with NaN.", toIndex,)
    if (toIndex == Number.NEGATIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The ending index cannot be an index with -∞.", toIndex,)
    if (toIndex == Number.POSITIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The ending index cannot be an index with +∞.", toIndex,)

    if (toIndex == size)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The ending index "${toIndex}" is the collection size "${size}".`, toIndex,)
    if (toIndex > size)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The ending index "${toIndex}" is over the collection size "${size}".`, toIndex,)

    let endingIndex = toIndex
    if (endingIndex < 0)
        endingIndex += size
    if (endingIndex < 0)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The ending index "${toIndex}" ("${endingIndex}" after calculation) is under 0.`, toIndex,)
    return endingIndex
}

/**
 * Get the index possible between 0 and the {@link size}
 *
 * @param limit The value to calculate
 * @param size  The last value that should be equivalent to the {@link MinimalistCollectionHolder.size size}
 * @throws ForbiddenIndexException The {@link limit} is {@link Number.NaN NaN}
 * @internal
 */
export function __index(limit: number, size: number,) {
    if (Number.isNaN(limit,))
        throw new ForbiddenIndexException("Forbidden index. The limit cannot be determined with NaN.", limit,)
    if (limit == Number.NEGATIVE_INFINITY)
        return 0
    if (limit == Number.POSITIVE_INFINITY)
        return size
    if (limit >= size)
        return size

    let maximumIndex = limit
    if (maximumIndex < 0)
        maximumIndex += size
    if (maximumIndex < 0)
        return 0
    return maximumIndex
}

/**
 * Get the maximum amount of iteration that can be done.
 * The value can only be between the 0 and the {@link size}.
 *
 * @param limit The value to calculate
 * @param size  The last value that should be equivalent to the {@link MinimalistCollectionHolder.size size}
 * @throws CollectionHolderIndexOutOfBoundsException The value is equal or over to the {@link size} (before or after calculation)
 * @throws ForbiddenIndexException                   The value is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @deprecated This method has no longer any use case. This should be removed in version 1.11
 * @internal
 */
export function __maximumIndex(limit: number, size: number,) {
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
