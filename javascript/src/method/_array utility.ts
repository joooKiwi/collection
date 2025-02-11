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

import {EmptyCollectionException}  from "../exception/EmptyCollectionException"
import {ForbiddenIndexException}   from "../exception/ForbiddenIndexException"
import {IndexOutOfBoundsException} from "../exception/IndexOutOfBoundsException"

/** @internal */
export function __get<const T, >(array: readonly T[], index: number,): T {
    const size = array.length
    if (size == 0)
        throw new EmptyCollectionException(null, index,)
    if (Number.isNaN(index,))
        throw new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", index,)
    if (index == Number.NEGATIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", index,)
    if (index == Number.POSITIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The index cannot be +∞.", index,)
    if (index in array)
        return array[index] as T
    if (index > size)
        throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is over the size of the collection (${size}).`, index,)
    if (index == size)
        throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is the size of the collection (${size}).`, index,)
    if (index >= 0)
        return array[index] as T

    const indexToRetrieve = index + size
    if (indexToRetrieve < 0)
        throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” (${indexToRetrieve} after calculation) is under 0.`, index,)
    return array[indexToRetrieve] as T
}
