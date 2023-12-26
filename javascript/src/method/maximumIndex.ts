/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr}                   from "../general type"
import type {NonEmptySimplisticCollectionHolder} from "../NonEmptySimplisticCollectionHolder"
import type {SimplisticCollectionHolder}         from "../SimplisticCollectionHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"

/**
 * Get a limit from a value between zero
 * and the {@link collection} {@link SimplisticCollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @param limit The limit (or {@link SimplisticCollectionHolder.size size} by default)
 * @param size The size compared (or the {@link collection} {@link SimplisticCollectionHolder.size size} by default)
 * @throws CollectionHolderIndexOutOfBoundsException The limit is under 0 or over the {@link collection} {@link SimplisticCollectionHolder.size size} after calculation
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 */
export function maximumIndex<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, limit: Nullable<number>, size?: Nullable<number>,): number
/**
 * Get a limit from a value between zero
 * and the {@link collection} {@link SimplisticCollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @param limit The limit (or {@link SimplisticCollectionHolder.size size} by default)
 * @param size The size compared (or the {@link collection} {@link SimplisticCollectionHolder.size size} by default)
 * @throws CollectionHolderIndexOutOfBoundsException The limit is under 0 or over the {@link collection} {@link SimplisticCollectionHolder.size size} after calculation
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 */
export function maximumIndex<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>, limit: Nullable<number>, size?: Nullable<number>,): NullOr<number>
export function maximumIndex(collection: Nullable<SimplisticCollectionHolder>, limit: Nullable<number>, size: Nullable<number> = null,): NullOr<number> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null
    if (limit == null)
        return size ?? collection.size

    const collectionSize = size ?? collection.size

    if (limit > collectionSize)
        throw new CollectionHolderIndexOutOfBoundsException(`The limit "${limit}" cannot over the collection size "${collectionSize}".`, limit,)

    let maximumIndex = limit
    if (maximumIndex < 0)
        maximumIndex += collectionSize
    if (maximumIndex < 0)
        throw new CollectionHolderIndexOutOfBoundsException(`The limit "${limit}" ("${maximumIndex}" after calculation) cannot under 0.`, limit,)

    return maximumIndex

}
