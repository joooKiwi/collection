/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr}           from "../general type"
import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {NonEmptyCollectionHolder}   from "../NonEmptyCollectionHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"

/**
 * Get the starting index from a value between zero
 * and the {@link collection} {@link MinimalistCollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param fromIndex The starting index (or 0 by default)
 * @param size The size compared (or the {@link collection} {@link MinimalistCollectionHolder.size size} by default)
 * @throws CollectionHolderIndexOutOfBoundsException The index is under 0 or over the {@link collection} {@link MinimalistCollectionHolder.size size} after calculation
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @deprecated This utility function is no longer used and will be removed in version 1.8.
 */
export function startingIndex<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, fromIndex?: Nullable<number>, size?: Nullable<number>,): NullOr<number> {
    if (collection == null)
        return null

    const collectionSize = collection.size
    if (collectionSize == 0)
        return null
    if (fromIndex == null)
        return 0

    if (size == null)
        return __startingIndex(fromIndex, collectionSize,)
    return __startingIndex(fromIndex, size,)
}

/**
 * Get the starting index from a value between zero
 * and the {@link collection} {@link CollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param fromIndex The starting index (or 0 by default)
 * @param size The size compared (or the {@link collection} {@link CollectionHolder.size size} by default)
 * @throws CollectionHolderIndexOutOfBoundsException The index is under 0 or the {@link collection} {@link CollectionHolder.size size} after calculation
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @deprecated This utility function is no longer used and will be removed in version 1.8.
 */
export function startingIndexByCollectionHolder<const T, >(collection: NonEmptyCollectionHolder<T>, fromIndex?: Nullable<number>, size?: Nullable<number>,): number
/**
 * Get the starting index from a value between zero
 * and the {@link collection} {@link CollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param fromIndex The starting index (or 0 by default)
 * @param size The size compared (or the {@link collection} {@link CollectionHolder.size size} by default)
 * @throws CollectionHolderIndexOutOfBoundsException The index is under 0 or over the {@link collection} {@link CollectionHolder.size size} after calculation
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @deprecated This utility function is no longer used and will be removed in version 1.8.
 */
export function startingIndexByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, fromIndex?: Nullable<number>, size?: Nullable<number>,): NullOr<number>
export function startingIndexByCollectionHolder(collection: Nullable<CollectionHolder>, fromIndex: Nullable<number> = null, size: Nullable<number> = null,) {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null
    if (fromIndex == null)
        return 0

    if (size == null)
        return __startingIndex(fromIndex, collection.size,)
    return __startingIndex(fromIndex, size,)
}

function __startingIndex(fromIndex: number, size: number,): number {
    if (fromIndex == size)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The starting index "${fromIndex}" is the collection size "${size}".`, fromIndex,)
    if (fromIndex > size)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The starting index "${fromIndex}" is over the collection size "${size}".`, fromIndex,)

    let startingIndex = fromIndex
    if (startingIndex < 0)
        startingIndex += size
    if (startingIndex == size)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The starting index "${fromIndex}" ("${startingIndex}" after calculation) is the collection size "${size}".`, fromIndex,)
    if (startingIndex < 0)
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The starting index "${fromIndex}" ("${startingIndex}" after calculation) is under 0.`, fromIndex,)
    return startingIndex
}
