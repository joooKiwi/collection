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
 * Tell whenever at least one value of the {@link values} (as an {@link Iterable}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 */
export function hasOneWithIterable<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} (as an {@link Iterable}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 */
export function hasOneWithIterable<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<unknown>,): boolean
export function hasOneWithIterable<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<unknown>,) {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false

    const iterator = values[Symbol.iterator]() as Iterator<unknown, unknown>
    const iteratorResult: IteratorResult<unknown, unknown> = iterator.next()
    if (iteratorResult.done)
        return true

    return __hasOne(collection, iterator, iteratorResult.value, size,)
}

/**
 * Tell whenever at least one value of the {@link values} (as an {@link Iterable}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 */
export function hasOneWithIterableByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} (as an {@link Iterable}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 */
export function hasOneWithIterableByCollectionHolder(collection: Nullable<CollectionHolder>, values: Iterable<unknown>,): boolean
export function hasOneWithIterableByCollectionHolder(collection: Nullable<CollectionHolder>, values: Iterable<unknown>,) {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false

    const iterator = values[Symbol.iterator]() as Iterator<unknown, unknown>
    const iteratorResult: IteratorResult<unknown, unknown> = iterator.next()
    if (iteratorResult.done)
        return true

    return __hasOne(collection, iterator, iteratorResult.value, collection.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasOne(collection: MinimalistCollectionHolder, iterator: Iterator<unknown, unknown>, firstValue: unknown, size: number,) {
    let index1 = -1
    while (++index1 < size)
        if (collection.get(index1,) === firstValue)
            return true

    let iteratorResult: IteratorResult<unknown, unknown>
    while (!(iteratorResult = iterator.next()).done) {
        const value = iteratorResult.value
        let index2 = -1
        while (++index2 < size)
            if (collection.get(index2,) === value)
                return true
    }
    return false
}

//#endregion -------------------- Loop methods --------------------

