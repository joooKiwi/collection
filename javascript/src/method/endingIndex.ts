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

/**
 * Get the ending index from a value between zero
 * and the {@link collection} {@link CollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param toIndex The ending index (or {@link CollectionHolder.size size} minus 1 by default)
 * @param size The size compared (or the {@link collection} {@link CollectionHolder.size size} by default)
 * @throws CollectionHolderIndexOutOfBoundsException The index is under 0 or over or equal to the {@link collection} {@link CollectionHolder.size size} after calculation
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @deprecated This utility function is no longer used and will be removed in version 1.8.
 */
export function endingIndex<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, toIndex?: Nullable<number>, size?: Nullable<number>,): NullOr<number> {
    if (collection == null)
        return null

    const collectionSize = collection.size
    if (collectionSize == 0)
        return null
    if (toIndex == null)
        if (size == null)
            return collectionSize - 1
        else
            return size - 1

    if (size == null)
        return __endingIndex(toIndex, collectionSize,)
    return __endingIndex(toIndex, size,)
}

/**
 * Get the ending index from a value between zero
 * and the {@link collection} {@link CollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param toIndex The ending index (or {@link CollectionHolder.size size} by default)
 * @param size The size compared (or the {@link collection} {@link CollectionHolder.size size} by default)
 * @throws CollectionHolderIndexOutOfBoundsException The index is under 0 or over or equal to the {@link collection} {@link CollectionHolder.size size} after calculation
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @deprecated This utility function is no longer used and will be removed in version 1.8.
 */
export function endingIndexByCollectionHolder<const T, >(collection: NonEmptyCollectionHolder<T>, toIndex?: Nullable<number>, size?: Nullable<number>,): number
/**
 * Get the ending index from a value between zero
 * and the {@link collection} {@link CollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param toIndex The ending index (or {@link CollectionHolder.size size} minus 1 by default)
 * @param size The size compared (or the {@link collection} {@link CollectionHolder.size size} by default)
 * @throws CollectionHolderIndexOutOfBoundsException The index is under 0 or over or equal to the {@link collection} {@link CollectionHolder.size size} after calculation
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @deprecated This utility function is no longer used and will be removed in version 1.8.
 */
export function endingIndexByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, toIndex?: Nullable<number>, size?: Nullable<number>,): NullOr<number>
export function endingIndexByCollectionHolder(collection: Nullable<CollectionHolder>, toIndex: Nullable<number> = null, size: Nullable<number> = null,) {
    if (collection == null)
        return null

    if (collection.isEmpty)
        return null
    if (toIndex == null)
        if (size == null)
            return collection.size - 1
        else
            return size - 1

    if (size == null)
        return __endingIndex(toIndex, collection.size,)
    return __endingIndex(toIndex, size,)
}


function __endingIndex(toIndex: number, size: number,): number {
    if (toIndex == size)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The ending index "${toIndex}" is the collection size "${size}".`, toIndex,)

    let endingIndex = toIndex
    if (endingIndex < 0)
        endingIndex += size
    if (endingIndex < 0)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The ending index "${toIndex}" ("${endingIndex}" after calculation) is under 0.`, toIndex,)
    if (endingIndex == size)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The ending index "${toIndex}" ("${endingIndex}" after calculation) is the collection size "${size}".`, toIndex,)
    if (endingIndex > size)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The ending index "${toIndex}" ("${endingIndex}" after calculation) is over the collection size "${size}".`, toIndex,)
    return endingIndex
}
