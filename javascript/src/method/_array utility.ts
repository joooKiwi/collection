/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "../exception/EmptyCollectionHolderException"
import {ForbiddenIndexException}                   from "../exception/ForbiddenIndexException"

/** @internal */
export function __get<const T, >(array: readonly T[], index: number,): T {
    const size = array.length
    if (size == 0)
        throw new EmptyCollectionHolderException(null, index,)
    if (Number.isNaN(index,))
        throw new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", index,)
    if (index == Number.NEGATIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", index,)
    if (index == Number.POSITIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The index cannot be +∞.", index,)
    if (index in array)
        return array[index] as T
    if (index > size)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index “${index}” is over the size of the collection (${size}).`, index,)
    if (index == size)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index “${index}” is the size of the collection (${size}).`, index,)
    if (index >= 0)
        return array[index] as T

    const indexToRetrieve = index + size
    if (indexToRetrieve < 0)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index “${index}” (${indexToRetrieve} after calculation) is under 0.`, index,)
    return array[indexToRetrieve] as T
}
