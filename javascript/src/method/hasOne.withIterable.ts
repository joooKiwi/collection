/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithIterable<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: Iterable<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @extensionFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneWithIterable<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<unknown>,): boolean
export function hasOneWithIterable<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: Iterable<T>,) {
    if (collection == null)
        return false
    if (isCollectionHolder<T>(collection,))
        return hasOneWithIterableByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasOneWithIterableByArray(collection, values,)
    if (isCollectionHolderByStructure<T>(collection,))
        return hasOneWithIterableByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasOneWithIterableByArray(collection, values,)
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

    const iterator: Iterator<T, unknown, unknown> = values[Symbol.iterator]()
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

    const iterator: Iterator<T, unknown, unknown> = values[Symbol.iterator]()
    const iteratorResult = iterator.next()
    if (iteratorResult.done)
        return true

    return __hasOne(collection, iterator, iteratorResult.value, collection.size,)
}

/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithIterableByArray<const T, >(collection: Nullable<readonly T[]>, values: Iterable<T>,): boolean {
    if (collection == null)
        return false

    const size = collection.length
    if (size == 0)
        return false

    const iterator: Iterator<T, unknown, unknown> = values[Symbol.iterator]()
    const iteratorResult = iterator.next()
    if (iteratorResult.done)
        return true

    return __hasOneByArray(collection, iterator, iteratorResult.value, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasOne<const T, >(collection: MinimalistCollectionHolder<T>, iterator: Iterator<T, unknown, unknown>, firstValue: T, size: number,) {
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

function __hasOneByArray<const T, >(collection: readonly T[], iterator: Iterator<T, unknown, unknown>, firstValue: T, size: number,) {
    let index1 = -1
    while (++index1 < size)
        if (collection[index1] === firstValue)
            return true

    let iteratorResult: IteratorResult<T, unknown>
    while (!(iteratorResult = iterator.next()).done) {
        const value = iteratorResult.value
        let index2 = -1
        while (++index2 < size)
            if (collection[index2] === value)
                return true
    }
    return false
}

//#endregion -------------------- Loop methods --------------------

