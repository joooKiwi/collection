/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithIterable<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @extensionFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneWithIterable<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<unknown>,): boolean
export function hasOneWithIterable<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<T>,) {
    if (collection == null)
        return false
    if (isCollectionHolder<T>(collection,))
        return hasOneWithIterableByCollectionHolder(collection, values,)
    if (isCollectionHolderByStructure<T>(collection,))
        return hasOneWithIterableByCollectionHolder(collection, values,)
    return hasOneWithIterableByMinimalistCollectionHolder(collection, values,)
}


/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithIterableByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneWithIterableByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<unknown>,): boolean
export function hasOneWithIterableByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<T>,) {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false

    const iterator: Iterator<T, unknown> = values[Symbol.iterator]()
    const iteratorResult = iterator.next()
    if (iteratorResult.done)
        return true

    return __hasOne(collection, iterator, iteratorResult.value, size,)
}

/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithIterableByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneWithIterableByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<unknown>,): boolean
export function hasOneWithIterableByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<T>,) {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false

    const iterator: Iterator<T, unknown> = values[Symbol.iterator]()
    const iteratorResult = iterator.next()
    if (iteratorResult.done)
        return true

    return __hasOne(collection, iterator, iteratorResult.value, collection.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasOne<const T, >(collection: MinimalistCollectionHolder<T>, iterator: Iterator<T, unknown>, firstValue: T, size: number,) {
    let index1 = -1
    while (++index1 < size)
        if (collection.get(index1,) === firstValue)
            return true

    let iteratorResult: IteratorResult<T, unknown>
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

