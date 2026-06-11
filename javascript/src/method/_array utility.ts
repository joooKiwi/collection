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

import type {Array} from "@joookiwi/type"

import {CollectionConstants}       from "../CollectionConstants"
import {EmptyCollectionException}  from "../exception/EmptyCollectionException"
import {ForbiddenIndexException}   from "../exception/ForbiddenIndexException"
import {IndexOutOfBoundsException} from "../exception/IndexOutOfBoundsException"

/**
 * Get the element at the specified index in the current {@link array}
 *
 * @internal
 * @param array The array to retrieve a value from the {@link index}
 * @param index The index to retrieve a value
 * @throws EmptyCollectionException  The current {@link CollectionHolder instance} is empty
 * @throws IndexOutOfBoundsException The {@link index} calculated is under zero or over the {@link size} (after calculation)
 * @throws ForbiddenIndexException   The {@link index} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 */
export function __get<const T, >(array: Array<T>, index: number,): T {
    const size = array.length
    if (size === 0)
        throw new EmptyCollectionException(null, index,)
    if (Number.isNaN(index,))
        throw new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", index,)
    if (index === Number.NEGATIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", index,)
    if (index === Number.POSITIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The index cannot be +∞.", index,)
    if (index in array)
        return array[index] as T
    if (index > size)
        throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is over the size of the collection (${size}).`, index,)
    if (index === size)
        throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is the size of the collection (${size}).`, index,)
    if (index >= 0)
        return array[index] as T

    const indexToRetrieve = index + size
    if (indexToRetrieve < 0)
        throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” (“${indexToRetrieve}” after calculation) is under 0.`, index,)
    return array[indexToRetrieve] as T
}

/**
 * Reduce the given {@link array} to a {@link newSize new size}
 *
 * @param array   The array to reduce its size
 * @param newSize The new size of the {@link array} that will be returned
 * @note It imply that {@link newSize} is under the size of the {@link array}
 * @internal
 */
export function __reduceTo<const T, >(array: Array<T>, newSize: number,): Array<T> {
    if (newSize === 0)
        return CollectionConstants.EMPTY_ARRAY

    const newArray = new Array<T>(newSize,)
    let index = -1
    while (++index < newSize)
        newArray[index] = array[index] as T
    return newArray
}
