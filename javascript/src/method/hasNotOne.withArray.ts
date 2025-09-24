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
export function hasNotOneWithArray<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: readonly T[],): boolean {
    if (collection == null)
        return true
    if (isCollectionHolder(collection,))
        return hasNotOneWithArrayByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasNotOneWithArrayByArray(collection, values,)
    if (isMinimalistCollectionHolder(collection,))
        return hasNotOneWithArrayByMinimalistCollectionHolder(collection, values,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasNotOneWithArrayByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasNotOneWithArrayByArray(collection, values,)
    return hasNotOneWithArrayByMinimalistCollectionHolder(collection, values,)
}


/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotOneWithArrayByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly T[],): boolean {
    if (collection == null)
        return true

    const size = collection.size
    if (size == 0)
        return true

    const valuesSize = values.length
    if (valuesSize == 0)
        return false
    return __validate(collection, values, size, valuesSize,)
}

/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotOneWithArrayByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: readonly T[],): boolean {
    if (collection == null)
        return true
    if (collection.isEmpty)
        return true

    const valuesSize = values.length
    if (valuesSize == 0)
        return false
    return __validate(collection, values, collection.size, valuesSize,)
}

/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotOneWithArrayByArray<const T, >(collection: Nullable<readonly T[]>, values: readonly T[],): boolean {
    if (collection == null)
        return true

    const size = collection.length
    if (size == 0)
        return true

    const valuesSize = values.length
    if (valuesSize == 0)
        return false
    return __validateByArray(collection, values, size, valuesSize,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __validate<const T, >(collection: MinimalistCollectionHolder<T>, values: readonly T[], size: number, valuesSize: number,) {
    let valueIndex = -1
    while (++valueIndex < valuesSize) {
        const value = values[valueIndex]
        let index = -1
        while (++index < size)
            if (collection.get(index,) === value)
                return false
    }
    return true
}

function __validateByArray<const T, >(collection: readonly T[], values: readonly T[], size: number, valuesSize: number,) {
    let valueIndex = -1
    while (++valueIndex < valuesSize) {
        const value = values[valueIndex]
        let index = -1
        while (++index < size)
            if (collection[index] === value)
                return false
    }
    return true
}

//#endregion -------------------- Loop methods --------------------

