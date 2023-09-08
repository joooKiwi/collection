/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}         from "../CollectionHolder"
import type {Nullable, NullOr}         from "../general type"
import type {NonEmptyCollectionHolder} from "../NonEmptyCollectionHolder"

/**
 * Get a limit from a value between zero
 * and the {@link collection} {@link CollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param limit The limit (or {@link CollectionHolder.size size} by default)
 * @param size The size compared (or the {@link collection} {@link CollectionHolder.size size} by default)
 * @throws {RangeError} The limit is under 0 or over the {@link collection} {@link CollectionHolder.size size} after calculation
 * @canReceiveNegativeValue
 * @onlyReturnsPositiveValue
 */
export function maximumIndex<const T, >(collection: Nullable<NonEmptyCollectionHolder<T>>, limit: Nullable<number>, size?: Nullable<number>,): number
/**
 * Get a limit from a value between zero
 * and the {@link collection} {@link CollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param limit The limit (or {@link CollectionHolder.size size} by default)
 * @param size The size compared (or the {@link collection} {@link CollectionHolder.size size} by default)
 * @throws {RangeError} The limit is under 0 or over the {@link collection} {@link CollectionHolder.size size} after calculation
 * @canReceiveNegativeValue
 * @onlyReturnsPositiveValue
 */
export function maximumIndex<const T, >(collection: Nullable<CollectionHolder<T>>, limit: Nullable<number>, size?: Nullable<number>,): NullOr<number>
export function maximumIndex(collection: Nullable<CollectionHolder>, limit: Nullable<number>, size: Nullable<number> = null,): NullOr<number> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null
    if (limit == null)
        return size ?? collection.size

    const collectionSize = size ?? collection.size

    let amountOfItem = limit
    if (amountOfItem > collectionSize)
        throw new RangeError(`The limit "${limit}"${limit} cannot over the collection size "${collectionSize}".`,)
    if (amountOfItem < 0)
        amountOfItem += collectionSize
    if (amountOfItem < 0)
        throw new RangeError(`The limit "${limit}" cannot under 0 after calculation from "${collectionSize} - ${Math.abs(limit)}".`,)

    return amountOfItem

}
