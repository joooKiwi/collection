//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Nullable} from "@joookiwi/type"

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
export function hasOneWithIterator<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Iterator<T>,): boolean {
    if (collection == null)
        return false
    if (isCollectionHolder(collection,))
        return hasOneWithIteratorByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasOneWithIteratorByArray(collection, values,)
    if (isMinimalistCollectionHolder(collection,))
        return hasOneWithIteratorByMinimalistCollectionHolder(collection, values,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasOneWithIteratorByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasOneWithIteratorByArray(collection, values,)
    return hasOneWithIteratorByMinimalistCollectionHolder(collection, values,)
}


/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithIteratorByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterator<T>,): boolean {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false

    const iteratorResult = values.next()
    if (iteratorResult.done)
        return true

    return __hasOne(collection, values, iteratorResult.value, size,)
}

/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithIteratorByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterator<T>,): boolean {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false

    const iteratorResult = values.next()
    if (iteratorResult.done)
        return true

    return __hasOne(collection, values, iteratorResult.value, collection.size,)
}

/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithIteratorByArray<const T, >(collection: Nullable<readonly T[]>, values: Iterator<T>,): boolean {
    if (collection == null)
        return false

    const size = collection.length
    if (size == 0)
        return false

    const iteratorResult = values.next()
    if (iteratorResult.done)
        return true

    return __hasOneByArray(collection, values, iteratorResult.value, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasOne<const T, >(collection: MinimalistCollectionHolder<T>, values: Iterator<T, unknown, unknown>, firstValue: T, size: number,) {
    let index1 = -1
    while (++index1 < size)
        if (collection.get(index1,) === firstValue)
            return true

    let iteratorResult: IteratorResult<T, unknown>
    while (!(iteratorResult = values.next()).done) {
        const value = iteratorResult.value
        let index2 = -1
        while (++index2 < size)
            if (collection.get(index2,) === value)
                return true
    }
    return false
}

function __hasOneByArray<const T, >(collection: readonly T[], values: Iterator<T, unknown, unknown>, firstValue: T, size: number,) {
    let index1 = -1
    while (++index1 < size)
        if (collection[index1] === firstValue)
            return true

    let iteratorResult: IteratorResult<T, unknown>
    while (!(iteratorResult = values.next()).done) {
        const value = iteratorResult.value
        let index2 = -1
        while (++index2 < size)
            if (collection[index2] === value)
                return true
    }
    return false
}

//#endregion -------------------- Loop methods --------------------

