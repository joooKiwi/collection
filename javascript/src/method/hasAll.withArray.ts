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
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithArray<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>, values: Nullable<Array<T>>,): boolean {
    if (isCollectionHolder(collection,))
        return hasAllWithArrayByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasAllWithArrayByArray(collection, values,)
    if (isMinimalistCollectionHolder(collection,))
        return hasAllWithArrayByMinimalistCollectionHolder(collection, values,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasAllWithArrayByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasAllWithArrayByArray(collection, values,)
    return hasAllWithArrayByMinimalistCollectionHolder(collection, values,)
}


/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithArrayByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<Array<T>>,): boolean {
    if (values == null)
        return true

    const valuesSize = values.length
    if (valuessize === 0)
        return true
    if (collection == null)
        return false

    const size = collection.size
    if (size === 0)
        return false
    return __validate(collection, values, size, valuesSize,)
}

/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithArrayByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<Array<T>>,): boolean {
    if (values == null)
        return true

    const valuesSize = values.length
    if (valuessize === 0)
        return true
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false
    return __validate(collection, values, collection.size, valuesSize,)
}

/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithArrayByArray<const T, >(collection: Nullable<Array<T>>, values: Nullable<Array<T>>,): boolean {
    if (values == null)
        return true

    const valuesSize = values.length
    if (valuessize === 0)
        return true
    if (collection == null)
        return false

    const size = collection.length
    if (size === 0)
        return false
    return __validateByArray(collection, values, size, valuesSize,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __validate<const T, >(collection: MinimalistCollectionHolder<T>, values: Array<T>, size: number, valuesSize: number,) {
    let tempArrayIndex = -1
    const tempArray = new Array<T>(size,)
    firstValueValidation: {
        const firstValue = values[0]
        let index1 = -1
        while (++index1 < size)
            if ((tempArray[++tempArrayIndex] = collection.get(index1,)) === firstValue)
                break firstValueValidation
        return false
    }

    const sizeMinus1 = size - 1
    let valueIndex = 0
    valueLoop: while (++valueIndex < valuesSize) {
        const value = values[valueIndex]
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
            return false
        }
        // We just loop through the tempArray since we have already reached all the elements for validation
        while (++index2 < size)
            if (tempArray[index2] === value)
                continue valueLoop
        return false
    }
    return true
}

function __validateByArray<const T, >(collection: Array<T>, values: Array<T>, size: number, valuesSize: number,) {
    let tempArrayIndex = -1
    const tempArray = new Array<T>(size,)
    firstValueValidation: {
        const firstValue = values[0]
        let index1 = -1
        while (++index1 < size)
            if ((tempArray[++tempArrayIndex] = collection[index1] as T) === firstValue)
                break firstValueValidation
        return false
    }

    const sizeMinus1 = size - 1
    let valueIndex = 0
    valueLoop: while (++valueIndex < valuesSize) {
        const value = values[valueIndex]
        let index2 = -1
        if (tempArrayIndex !== sizeMinus1) {
            // We retrieve in tempArray until tempArrayIndex and then continue assigning to tempArray
            while (++index2 <= tempArrayIndex)
                if (tempArray[index2] === value)
                    continue valueLoop
            index2--
            while (++index2 < size)
                if ((tempArray[++tempArrayIndex] = collection[index2] as T) === value)
                    continue valueLoop
            return false
        }
        // We just loop through the tempArray since we have already reached all the elements for validation
        while (++index2 < size)
            if (tempArray[index2] === value)
                continue valueLoop
        return false
    }
    return true
}

//#endregion -------------------- Loop methods --------------------

