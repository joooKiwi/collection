/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Tell that all of the {@link values} (as an {@link Iterable}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @extensionFunction
 */
export function hasAllWithIterable<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<T>,): boolean
/**
 * Tell that all of the {@link values} (as an {@link Iterable}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @extensionFunction
 */
export function hasAllWithIterable<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<unknown>,): boolean
export function hasAllWithIterable<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<unknown>,) {
    if (collection == null)
        return false

    const iterator = values[Symbol.iterator]() as IterableIterator<unknown>
    const iteratorResult: IteratorResult<unknown, unknown> = iterator.next()
    if (iteratorResult.done)
        return true

    const size = collection.size
    if (size == 0)
        return false

    return __hasAll(collection, iterator, iteratorResult.value, size,)
}

/**
 * Tell that all of the {@link values} (as an {@link Iterable}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @extensionFunction
 */
export function hasAllWithIterableByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<T>,): boolean
/**
 * Tell that all of the {@link values} (as an {@link Iterable}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @extensionFunction
 */
export function hasAllWithIterableByCollectionHolder(collection: Nullable<CollectionHolder>, values: Iterable<unknown>,): boolean
export function hasAllWithIterableByCollectionHolder(collection: Nullable<CollectionHolder>, values: Iterable<unknown>,) {
    if (collection == null)
        return false

    const iterator = values[Symbol.iterator]() as IterableIterator<unknown>
    const iteratorResult: IteratorResult<unknown, unknown> = iterator.next()
    if (iteratorResult.done)
        return true
    if (collection.isEmpty)
        return false

    return __hasAll(collection, iterator, iteratorResult.value, collection.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasAll(collection: MinimalistCollectionHolder, iterator: IterableIterator<unknown>, firstValue: unknown, size: number,) {
    firstValueLoop: {
        let index1 = -1
        while (++index1 < size)
            if (collection.get(index1,) === firstValue)
                break firstValueLoop
        return false
    }

    let iteratorResult: IteratorResult<unknown, unknown>
    valueLoop: while (!(iteratorResult = iterator.next()).done) {
        const value = iteratorResult.value
        let index2 = -1
        while (++index2 < size)
            if (collection.get(index2,) === value)
                continue valueLoop
        return false
    }
    return true
}

//#endregion -------------------- Loop methods --------------------

