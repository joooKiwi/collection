//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Array, Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithIterable<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>, values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
    if (collection == null)
        return false
    if (isCollectionHolder(collection,))
        return hasOneWithIterableByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasOneWithIterableByArray(collection, values,)
    if (isMinimalistCollectionHolder(collection,))
        return hasOneWithIterableByMinimalistCollectionHolder(collection, values,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasOneWithIterableByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasOneWithIterableByArray(collection, values,)
    return hasOneWithIterableByMinimalistCollectionHolder(collection, values,)
}


/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithIterableByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false
    if (values == null)
        return true

    const iterator: Iterator<T, unknown, unknown> = values[Symbol.iterator]()
    const iteratorResult = iterator.next()
    if (iteratorResult.done)
        return true

    return __validate(collection, iterator, iteratorResult.value, size,)
}

/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithIterableByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false
    if (values == null)
        return true

    const iterator: Iterator<T, unknown, unknown> = values[Symbol.iterator]()
    const iteratorResult = iterator.next()
    if (iteratorResult.done)
        return true

    return __validate(collection, iterator, iteratorResult.value, collection.size,)
}

/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithIterableByArray<const T, >(collection: Nullable<Array<T>>, values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
    if (collection == null)
        return false

    const size = collection.length
    if (size == 0)
        return false
    if (values == null)
        return true

    const iterator: Iterator<T, unknown, unknown> = values[Symbol.iterator]()
    const iteratorResult = iterator.next()
    if (iteratorResult.done)
        return true

    return __validateByArray(collection, iterator, iteratorResult.value, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __validate<const T, >(collection: MinimalistCollectionHolder<T>, iterator: Iterator<T, unknown, unknown>, firstValue: T, size: number,) {
    let tempArrayIndex = -1
    const tempArray = new Array<T>(size,)
    let index1 = -1
    while (++index1 < size)
        if ((tempArray[++tempArrayIndex] = collection.get(index1,)) === firstValue)
            return true

    const sizeMinus1 = size - 1
    let iteratorResult: IteratorResult<T, unknown>
    while (!(iteratorResult = iterator.next()).done) {
        const value = iteratorResult.value
        let index2 = -1
        if (tempArrayIndex === sizeMinus1)
            // We just loop through the tempArray since we have already reached all the elements for validation
            while (++index2 < size)
                if (tempArray[index2] === value)
                    return true
                else;
        else
            while (++index2 < size)
                if ((tempArray[++tempArrayIndex] = collection.get(index2,)) === value)
                    return true
    }
    return false
}

function __validateByArray<const T, >(collection: Array<T>, iterator: Iterator<T, unknown, unknown>, firstValue: T, size: number,) {
    let tempArrayIndex = -1
    const tempArray = new Array<T>(size,)
    let index1 = -1
    while (++index1 < size)
        if ((tempArray[++tempArrayIndex] = collection[index1] as T) === firstValue)
            return true

    const sizeMinus1 = size - 1
    let iteratorResult: IteratorResult<T, unknown>
    while (!(iteratorResult = iterator.next()).done) {
        const value = iteratorResult.value
        let index2 = -1
        if (tempArrayIndex === sizeMinus1)
            // We just loop through the tempArray since we have already reached all the elements for validation
            while (++index2 < size)
                if (tempArray[index2] === value)
                    return true
                else;
        else
            while (++index2 < size)
                if ((tempArray[++tempArrayIndex] = collection[index2] as T) === value)
                    return true
    }
    return false
}

//#endregion -------------------- Loop methods --------------------

