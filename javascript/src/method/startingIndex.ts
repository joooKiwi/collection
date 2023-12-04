/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}         from "../CollectionHolder"
import type {Nullable, NullOr}         from "../general type"
import type {NonEmptyCollectionHolder} from "../NonEmptyCollectionHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"

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
 */
export function startingIndex<const T, >(collection: NonEmptyCollectionHolder<T>, fromIndex?: Nullable<number>, size?: Nullable<number>,): number
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
 */
export function startingIndex<const T, >(collection: Nullable<CollectionHolder<T>>, fromIndex?: Nullable<number>, size?: Nullable<number>,): NullOr<number>
export function startingIndex(collection: Nullable<CollectionHolder>, fromIndex: Nullable<number> = null, size: Nullable<number> = null,): NullOr<number> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null
    if (fromIndex == null)
        return 0

    const collectionSize = size ?? collection.size

    if (fromIndex == collectionSize)
        throw new CollectionHolderIndexOutOfBoundsException(`The starting index "${fromIndex}" is the collection size "${collectionSize}".`, fromIndex,)
    if (fromIndex > collectionSize)
        throw new CollectionHolderIndexOutOfBoundsException(`The starting index "${fromIndex}" is over the collection size "${collectionSize}".`, fromIndex,)

    let startingIndex = fromIndex
    if (startingIndex < 0)
        startingIndex += collectionSize
    if (startingIndex == collectionSize)
        throw new CollectionHolderIndexOutOfBoundsException(`The starting index "${fromIndex}" ("${startingIndex}" after calculation) is the collection size "${collectionSize}".`, fromIndex,)
    if (startingIndex < 0)
        throw new CollectionHolderIndexOutOfBoundsException(`The starting index "${fromIndex}" ("${startingIndex}" after calculation) is under 0.`, fromIndex,)
    return startingIndex
}
