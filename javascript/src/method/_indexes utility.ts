//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {NullOrNumber} from "@joookiwi/type"

import {ForbiddenIndexException}    from "../exception/ForbiddenIndexException"
import {IndexOutOfBoundsException}  from "../exception/IndexOutOfBoundsException"
import {InvalidIndexRangeException} from "../exception/InvalidIndexRangeException"

/**
 * Get the starting index between 0 and the <code>{@link size} - 1</code>
 *
 * @param value The value to calculate
 * @param size  The size (either in an {@link ReadonlyArray Array} or a {@link MinimalistCollectionHolder})
 * @throws IndexOutOfBoundsException The value is equal or over to the {@link size} (before or after calculation)
 * @throws ForbiddenIndexException   The value is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @internal
 */
export function __startingIndex(value: number, size: number,): number {
    if (Number.isNaN(value,))
        throw new ForbiddenIndexException("Forbidden index. The starting index cannot be an index with NaN.", value,)
    if (value == Number.NEGATIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The starting index cannot be an index with -∞.", value,)
    if (value == Number.POSITIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The starting index cannot be an index with +∞.", value,)

    if (value > size)
        throw new IndexOutOfBoundsException(`Index out of bound. The starting index “${value}” is over the collection size “${size}”.`, value,)
    if (value == size)
        throw new IndexOutOfBoundsException(`Index out of bound. The starting index “${value}” is the collection size “${size}”.`, value,)

    let startingIndex = value
    if (startingIndex < 0)
        startingIndex += size
    if (startingIndex < 0)
        throw new IndexOutOfBoundsException(`Index out of bound. The starting index “${value}” (“${startingIndex}” after calculation) is under 0.`, value,)
    return startingIndex
}

/**
 * Get the starting index between 0 and the <code>{@link size} - 1</code>
 * or <b>null</b> otherwise
 *
 * @param value The value to calculate
 * @param size  The size (either in a {@link ReadonlyArray Array} or a {@link MinimalistCollectionHolder})
 * @internal
 */
export function __startingIndexOrNull(value: number, size: number,): NullOrNumber {
    if (Number.isNaN(value,))
        return null
    if (value == Number.NEGATIVE_INFINITY)
        return null
    if (value == Number.POSITIVE_INFINITY)
        return null

    if (value > size)
        return null
    if (value == size)
        return null

    let startingIndex = value
    if (startingIndex < 0)
        startingIndex += size
    if (startingIndex < 0)
        return null
    return startingIndex
}


/**
 * Get the ending index between 0 and the <code>{@link size} - 1</code>
 *
 * @param value The value to calculate
 * @param size  The size (either in an {@link ReadonlyArray Array} or a {@link MinimalistCollectionHolder})
 * @throws IndexOutOfBoundsException The value is equal or over to the {@link size} (before or after calculation)
 * @throws ForbiddenIndexException   The value is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @internal
 */
export function __endingIndex(value: number, size: number,) {
    if (Number.isNaN(value,))
        throw new ForbiddenIndexException("Forbidden index. The ending index cannot be determined with NaN.", value,)
    if (value == Number.NEGATIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The ending index cannot be an index with -∞.", value,)
    if (value == Number.POSITIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The ending index cannot be an index with +∞.", value,)

    if (value > size)
        throw new IndexOutOfBoundsException(`Index out of bound. The ending index “${value}” is over the collection size “${size}”.`, value,)
    if (value == size)
        throw new IndexOutOfBoundsException(`Index out of bound. The ending index “${value}” is the collection size “${size}”.`, value,)

    let endingIndex = value
    if (endingIndex < 0)
        endingIndex += size
    if (endingIndex < 0)
        throw new IndexOutOfBoundsException(`Index out of bound. The ending index “${value}” (“${endingIndex}” after calculation) is under 0.`, value,)
    return endingIndex
}

/**
 * Get the ending index between 0 and the <code>{@link size} - 1</code>
 * or <b>null</b>
 *
 * @param value The value to calculate
 * @param size  The size (either in an {@link ReadonlyArray Array} or a {@link MinimalistCollectionHolder})
 * @internal
 */
export function __endingIndexOrNull(value: number, size: number,): NullOrNumber {
    if (Number.isNaN(value,))
        return null
    if (value == Number.NEGATIVE_INFINITY)
        return null
    if (value == Number.POSITIVE_INFINITY)
        return null

    if (value > size)
        return null
    if (value == size)
        return null

    let endingIndex = value
    if (endingIndex < 0)
        endingIndex += size
    if (endingIndex < 0)
        return null
    return endingIndex
}


/**
 * Get the last index possible between 0 and the {@link size}
 *
 * @param value The value to calculate
 * @param size  The size (either in an {@link ReadonlyArray Array} or a {@link MinimalistCollectionHolder})
 * @throws ForbiddenIndexException The {@link value} is {@link Number.NaN NaN}
 * @internal
 */
export function __lastIndex(value: number, size: number,): number {
    if (Number.isNaN(value,))
        throw new ForbiddenIndexException("Forbidden index. The value cannot be determined with NaN.", value,)
    if (value == Number.NEGATIVE_INFINITY)
        return 0
    if (value == Number.POSITIVE_INFINITY)
        return size
    if (value >= size)
        return size

    let maximumIndex = value
    if (maximumIndex < 0)
        maximumIndex += size
    if (maximumIndex < 0)
        return 0
    return maximumIndex
}


/**
 * Validate that the {@link endingIndex} is not under the {@link startingIndex}
 *
 * @param from          The initial starting index
 * @param startingIndex The computed starting index
 * @param to            The initial ending index
 * @param endingIndex   The computed ending index
 * @throws InvalidIndexRangeException The {@link endingIndex} is under the {@link startingIndex}
 * @internal
 */
export function __validateInRange(from: number, startingIndex: number, to: number, endingIndex: number,): void {
    if (endingIndex >= startingIndex)
        return

    if (to == endingIndex)
        if (from == startingIndex)
            throw new InvalidIndexRangeException(`Invalid index range. The ending index “${to}” is over the starting index “${from}”.`, from, to,)
        else
            throw new InvalidIndexRangeException(`Invalid index range. The ending index “${to}” is over the starting index “${from}” (“${startingIndex}” after calculation).`, from, to,)
    if (from == startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index “${to}” (“${endingIndex}” after calculation) is over the starting index “${from}”.`, from, to,)
    throw new InvalidIndexRangeException(`Invalid index range. The ending index “${to}” (“${endingIndex}” after calculation) is over the starting index “${from}” (“${startingIndex}” after calculation).`, from, to,)
}
