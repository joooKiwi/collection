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
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotOneWithIterator<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Iterator<T>,): boolean {
    if (collection == null)
        return true
    if (isCollectionHolder(collection,))
        return hasNotOneWithIteratorByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasNotOneWithIteratorByArray(collection, values,)
    if (isMinimalistCollectionHolder(collection,))
        return hasNotOneWithIteratorByMinimalistCollectionHolder(collection, values,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasNotOneWithIteratorByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasNotOneWithIteratorByArray(collection, values,)
    return hasNotOneWithIteratorByMinimalistCollectionHolder(collection, values,)
}


/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotOneWithIteratorByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterator<T>,): boolean {
    if (collection == null)
        return true

    const size = collection.size
    if (size == 0)
        return true

    const iteratorResult = values.next()
    if (iteratorResult.done)
        return false

    return __validate(collection, values, iteratorResult.value, size,)
}

/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotOneWithIteratorByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterator<T>,): boolean {
    if (collection == null)
        return true
    if (collection.isEmpty)
        return true

    const iteratorResult = values.next()
    if (iteratorResult.done)
        return false

    return __validate(collection, values, iteratorResult.value, collection.size,)
}

/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotOneWithIteratorByArray<const T, >(collection: Nullable<readonly T[]>, values: Iterator<T>,): boolean {
    if (collection == null)
        return true

    const size = collection.length
    if (size == 0)
        return true

    const iteratorResult = values.next()
    if (iteratorResult.done)
        return false

    return __validateByArray(collection, values, iteratorResult.value, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __validate<const T, >(collection: MinimalistCollectionHolder<T>, values: Iterator<T, unknown, unknown>, firstValue: T, size: number,) {
    let index1 = -1
    while (++index1 < size)
        if (collection.get(index1,) === firstValue)
            return false

    let iteratorResult: IteratorResult<T, unknown>
    while (!(iteratorResult = values.next()).done) {
        const value = iteratorResult.value
        let index2 = -1
        while (++index2 < size)
            if (collection.get(index2,) === value)
                return false
    }
    return true
}

function __validateByArray<const T, >(collection: readonly T[], values: Iterator<T, unknown, unknown>, firstValue: T, size: number,) {
    let index1 = -1
    while (++index1 < size)
        if (collection[index1] === firstValue)
            return false

    let iteratorResult: IteratorResult<T, unknown>
    while (!(iteratorResult = values.next()).done) {
        const value = iteratorResult.value
        let index2 = -1
        while (++index2 < size)
            if (collection[index2] === value)
                return false
    }
    return true
}

//#endregion -------------------- Loop methods --------------------

