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

//#region -------------------- Facade method --------------------

/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithArray<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: readonly T[],): boolean {
    if (collection == null)
        return false
    if (isCollectionHolder<T>(collection,))
        return hasOneWithArrayByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasOneWithArrayByArray(collection, values,)
    if (isCollectionHolderByStructure<T>(collection,))
        return hasOneWithArrayByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasOneWithArrayByArray(collection, values,)
    return hasOneWithArrayByMinimalistCollectionHolder(collection, values,)
}


/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithArrayByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly T[],): boolean {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false

    const valuesSize = values.length
    if (valuesSize == 0)
        return true
    return __hasOne(collection, values, size, valuesSize,)
}

/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithArrayByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: readonly T[],): boolean {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false

    const valuesSize = values.length
    if (valuesSize == 0)
        return true
    return __hasOne(collection, values, collection.size, valuesSize,)
}

/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithArrayByArray<const T, >(collection: Nullable<readonly T[]>, values: readonly T[],): boolean {
    if (collection == null)
        return false

    const size = collection.length
    if (size == 0)
        return false

    const valuesSize = values.length
    if (valuesSize == 0)
        return true
    return __hasOneByArray(collection, values, size, valuesSize,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasOne<const T, >(collection: MinimalistCollectionHolder<T>, values: readonly T[], size: number, valuesSize: number,) {
    let valueIndex = -1
    while (++valueIndex < valuesSize) {
        const value = values[valueIndex]
        let index = -1
        while (++index < size)
            if (collection.get(index,) === value)
                return true
    }
    return false
}

function __hasOneByArray<const T, >(collection: readonly T[], values: readonly T[], size: number, valuesSize: number,) {
    let valueIndex = -1
    while (++valueIndex < valuesSize) {
        const value = values[valueIndex]
        let index = -1
        while (++index < size)
            if (collection[index] === value)
                return true
    }
    return false
}

//#endregion -------------------- Loop methods --------------------

