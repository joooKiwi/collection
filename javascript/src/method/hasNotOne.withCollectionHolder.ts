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
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotOneWithCollectionHolder<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>, values: Nullable<CollectionHolder<T>>,): boolean {
    if (collection == null)
        return true
    if (isCollectionHolder(collection,))
        return hasNotOneWithCollectionHolderByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasNotOneWithCollectionHolderByArray(collection, values,)
    if (isMinimalistCollectionHolder(collection,))
        return hasNotOneWithCollectionHolderByMinimalistCollectionHolder(collection, values,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasNotOneWithCollectionHolderByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasNotOneWithCollectionHolderByArray(collection, values,)
    return hasNotOneWithCollectionHolderByMinimalistCollectionHolder(collection, values,)
}


/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotOneWithCollectionHolderByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<CollectionHolder<T>>,): boolean {
    if (collection == null)
        return true

    const size = collection.size
    if (size == 0)
        return true
    if (values == null)
        return false
    if (values.isEmpty)
        return false
    return __validate(collection, values, size, values.size,)
}

/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotOneWithCollectionHolderByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<CollectionHolder<T>>,): boolean {
    if (collection == null)
        return true
    if (collection.isEmpty)
        return true
    if (values == null)
        return false
    if (values.isEmpty)
        return false
    return __validate(collection, values, collection.size, values.size,)
}

/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotOneWithCollectionHolderByArray<const T, >(collection: Nullable<Array<T>>, values: Nullable<CollectionHolder<T>>,): boolean {
    if (collection == null)
        return true

    const size = collection.length
    if (size == 0)
        return true
    if (values == null)
        return false
    if (values.isEmpty)
        return false
    return __validateByArray(collection, values, size, values.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __validate<const T, >(collection: MinimalistCollectionHolder<T>, values: CollectionHolder<T>, size: number, valuesSize: number,) {
    let tempArrayIndex = -1
    const tempArray = new Array<T>(size,)
    const firstValue = values.getFirst()
    let index1 = -1
    while (++index1 < size)
        if ((tempArray[++tempArrayIndex] = collection.get(index1,)) == firstValue)
            return false

    const sizeMinus1 = size - 1
    let valueIndex = 0
    while (++valueIndex < valuesSize) {
        const value = values.get(valueIndex,)
        let index2 = -1
        if (tempArrayIndex === sizeMinus1)
            // We just loop through the tempArray since we have already reached all the elements for validation
            while (++index2 < size)
                if (tempArray[index2] === value)
                    return false
                else;
        else
            while (++index2 < size)
                if ((tempArray[++tempArrayIndex] = collection.get(index2,)) === value)
                    return false
    }
    return true
}

function __validateByArray<const T, >(collection: Array<T>, values: CollectionHolder<T>, size: number, valuesSize: number,) {
    let tempArrayIndex = -1
    const tempArray = new Array<T>(size,)
    const firstValue = values.getFirst()
    let index1 = -1
    while (++index1 < size)
        if ((tempArray[++tempArrayIndex] = collection[index1] as T) == firstValue)
            return false

    const sizeMinus1 = size - 1
    let valueIndex = 0
    while (++valueIndex < valuesSize) {
        const value = values.get(valueIndex,)
        let index2 = -1
        if (tempArrayIndex === sizeMinus1)
            // We just loop through the tempArray since we have already reached all the elements for validation
            while (++index2 < size)
                if (tempArray[index2] === value)
                    return false
                else;
        else
            while (++index2 < size)
                if ((tempArray[++tempArrayIndex] = collection[index2] as T) === value)
                    return false
    }
    return true
}

//#endregion -------------------- Loop methods --------------------

