/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder}         from "../CollectionHolder"
import type {Nullable, NullOr}         from "../general type"
import type {NonEmptyCollectionHolder} from "../NonEmptyCollectionHolder"

/**
 * Get the starting index from a value between 0 and the {@link collection} {@link CollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param fromIndex The starting index (or 0 by default)
 * @param size The size compared (or the {@link collection} {@link CollectionHolder.size size} by default)
 *
 * @canReceiveNegativeValue
 * @onlyReturnsPositiveValue
 */
export function startingIndex(collection: NonEmptyCollectionHolder, fromIndex?: Nullable<number>, size?: Nullable<number>,): number
/**
 * Get the starting index from a value between 0 and the {@link collection} {@link CollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param fromIndex The starting index (or 0 by default)
 * @param size The size compared (or the {@link collection} {@link CollectionHolder.size size} by default)
 *
 * @canReceiveNegativeValue
 * @onlyReturnsPositiveValue
 */
export function startingIndex(collection: Nullable<CollectionHolder>, fromIndex?: Nullable<number>, size?: Nullable<number>,): NullOr<number>
export function startingIndex(collection: Nullable<CollectionHolder>, fromIndex: Nullable<number> = null, size: Nullable<number> = null,): NullOr<number> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null
    if (fromIndex == null)
        return 0

    const collectionSize = size ?? collection.size

    let startingIndex = fromIndex
    if (startingIndex > collectionSize)
        return collectionSize
    if (startingIndex < 0)
        startingIndex += collectionSize
    if (startingIndex < 0)
        return 0
    return startingIndex
}
