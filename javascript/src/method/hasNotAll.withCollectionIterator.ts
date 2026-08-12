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
import type {CollectionIterator}         from "../iterator/CollectionIterator"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotAllWithCollectionIterator<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>, values: Nullable<CollectionIterator<T>>,): boolean {
    if (isCollectionHolder(collection,))
        return hasNotAllWithCollectionIteratorByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasNotAllWithCollectionIteratorByArray(collection, values,)
    if (isMinimalistCollectionHolder(collection,))
        return hasNotAllWithCollectionIteratorByMinimalistCollectionHolder(collection, values,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasNotAllWithCollectionIteratorByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasNotAllWithCollectionIteratorByArray(collection, values,)
    return hasNotAllWithCollectionIteratorByMinimalistCollectionHolder(collection, values,)
}


/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotAllWithCollectionIteratorByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<CollectionIterator<T>>,): boolean {
    if (values == null)
        return false
    if (values.isEmpty)
        return false
    if (collection == null)
        return true

    const size = collection.size
    if (size === 0)
        return true
    return __validate(collection, values, size, values.size,)
}

/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotAllWithCollectionIteratorByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<CollectionIterator<T>>,): boolean {
    if (values == null)
        return false
    if (values.isEmpty)
        return false
    if (collection == null)
        return true
    if (collection.isEmpty)
        return true
    return __validate(collection, values, collection.size, values.size,)
}

/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotAllWithCollectionIteratorByArray<const T, >(collection: Nullable<Array<T>>, values: Nullable<CollectionIterator<T>>,): boolean {
    if (values == null)
        return false
    if (values.isEmpty)
        return false
    if (collection == null)
        return true

    const size = collection.length
    if (size === 0)
        return true
    return __validateByArray(collection, values, size, values.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __validate<const T, >(collection: MinimalistCollectionHolder<T>, values: CollectionIterator<T>, size: number, valuesSize: number,) {
    let tempArrayIndex = -1
    const tempArray = new Array<T>(size,)
    firstValueValidation: {
        const firstValue = values.nextValue
        let index1 = -1
        while (++index1 < size)
            if ((tempArray[++tempArrayIndex] = collection.get(index1,)) === firstValue)
                break firstValueValidation
        return true
    }

    const sizeMinus1 = size - 1
    let valueIndex = valuesSize - 1
    valueLoop: while (valueIndex-- > 0) {
        const value = values.nextValue
        let index2 = -1
        if (tempArrayIndex !== sizeMinus1) {
            // We compare in the tempArray until tempArrayIndex and then continue assigning to tempArray
            while (++index2 <= tempArrayIndex)
                if (tempArray[index2] === value)
                    continue valueLoop
            index2--
            while (++index2 < size)
                if ((tempArray[++tempArrayIndex] = collection.get(index2,)) === value)
                    continue valueLoop
            return true
        }
        // We just loop through the tempArray since we have already reached all the elements for validation
        while (++index2 < size)
            if (tempArray[index2] === value)
                continue valueLoop
        return true
    }
    return false
}

function __validateByArray<const T, >(collection: Array<T>, values: CollectionIterator<T>, size: number, valuesSize: number,) {
    let tempArrayIndex = -1
    const tempArray = new Array<T>(size,)
    firstValueValidation: {
        const firstValue = values.nextValue
        let index1 = -1
        while (++index1 < size)
            if ((tempArray[++tempArrayIndex] = collection[index1] as T) === firstValue)
                break firstValueValidation
        return true
    }

    const sizeMinus1 = size - 1
    let valueIndex = valuesSize - 1
    valueLoop: while (valueIndex-- > 0) {
        const value = values.nextValue
        let index2 = -1
        if (tempArrayIndex !== sizeMinus1) {
            // We compare in the tempArray until tempArrayIndex and then continue assigning to tempArray
            while (++index2 <= tempArrayIndex)
                if (tempArray[index2] === value)
                    continue valueLoop
            index2--
            while (++index2 < size)
                if ((tempArray[++tempArrayIndex] = collection[index2] as T) === value)
                    continue valueLoop
            return true
        }
        // We just loop through the tempArray since we have already reached all the elements for validation
        while (++index2 < size)
            if (tempArray[index2] === value)
                continue valueLoop
        return true
    }
    return false
}

//#endregion -------------------- Loop methods --------------------
