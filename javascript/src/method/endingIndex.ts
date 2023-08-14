/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}         from "../CollectionHolder"
import type {Nullable, NullOr}         from "../general type"
import type {NonEmptyCollectionHolder} from "../NonEmptyCollectionHolder"

/**
 * Get the ending index from a value between 0 and the {@link collection} {@link CollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param toIndex The ending index (or {@link CollectionHolder.size size} by default)
 * @param size The size compared (or the {@link collection} {@link CollectionHolder.size size} by default)
 *
 * @canReceiveNegativeValue
 * @onlyReturnsPositiveValue
 * @throws {RangeError} The index is under 0 or the {@link collection} {@link CollectionHolder.size size} after calculation
 */
export function endingIndex(collection: NonEmptyCollectionHolder, toIndex?: Nullable<number>, size?: Nullable<number>,): number
/**
 * Get the ending index from a value between 0 and the {@link collection} {@link CollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param toIndex The ending index (or {@link CollectionHolder.size size} by default)
 * @param size The size compared (or the {@link collection} {@link CollectionHolder.size size} by default)
 *
 * @canReceiveNegativeValue
 * @onlyReturnsPositiveValue
 * @throws {RangeError} The index is under 0 or the {@link collection} {@link CollectionHolder.size size} after calculation
 */
export function endingIndex(collection: Nullable<CollectionHolder>, toIndex?: Nullable<number>, size?: Nullable<number>,): NullOr<number>
export function endingIndex(collection: Nullable<CollectionHolder>, toIndex: Nullable<number> = null, size: Nullable<number> = null,): NullOr<number> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null
    if (toIndex == null)
        return size ?? collection.size

    const collectionSize = size ?? collection.size

    let endingIndex = toIndex
    if (endingIndex < 0)
        endingIndex += collectionSize
    if (endingIndex < 0)
        throw new RangeError(`The ending index "${toIndex}" is under 0 after calculation from "${collectionSize} - ${Math.abs(toIndex)}".`,)
    if (endingIndex > collectionSize)
        throw new RangeError(`The ending index "${toIndex}" is over the collection size "${collectionSize}".`,)
    return endingIndex
}
