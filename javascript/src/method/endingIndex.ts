/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr}                   from "../general type"
import type {MinimalistCollectionHolder}         from "../MinimalistCollectionHolder"
import type {NonEmptyMinimalistCollectionHolder} from "../NonEmptyMinimalistCollectionHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"

/**
 * Get the ending index from a value between zero
 * and the {@link collection} {@link MinimalistCollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param toIndex The ending index (or {@link MinimalistCollectionHolder.size size} by default)
 * @param size The size compared (or the {@link collection} {@link MinimalistCollectionHolder.size size} by default)
 * @throws CollectionHolderIndexOutOfBoundsException The index is under 0 or over or equal to the {@link collection} {@link MinimalistCollectionHolder.size size} after calculation
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 */
export function endingIndex<const T, >(collection: NonEmptyMinimalistCollectionHolder<T>, toIndex?: Nullable<number>, size?: Nullable<number>,): number
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
 */
export function endingIndex<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, toIndex?: Nullable<number>, size?: Nullable<number>,): NullOr<number>
export function endingIndex(collection: Nullable<MinimalistCollectionHolder>, toIndex: Nullable<number> = null, size: Nullable<number> = null,): NullOr<number> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null
    if (toIndex == null)
        return (size ?? collection.size) - 1

    const collectionSize = size ?? collection.size

    if (toIndex == collectionSize)
        throw new CollectionHolderIndexOutOfBoundsException(`The ending index "${toIndex}" is the collection size "${collectionSize}".`, toIndex,)

    let endingIndex = toIndex
    if (endingIndex < 0)
        endingIndex += collectionSize
    if (endingIndex < 0)
        throw new CollectionHolderIndexOutOfBoundsException(`The ending index "${toIndex}" ("${endingIndex}" after calculation) is under 0.`, toIndex,)
    if (endingIndex == collectionSize)
        throw new CollectionHolderIndexOutOfBoundsException(`The ending index "${toIndex}" ("${endingIndex}" after calculation) is the collection size "${collectionSize}".`, toIndex,)
    if (endingIndex > collectionSize)
        throw new CollectionHolderIndexOutOfBoundsException(`The ending index "${toIndex}" ("${endingIndex}" after calculation) is over the collection size "${collectionSize}".`, toIndex,)
    return endingIndex
}
