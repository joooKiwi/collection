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
export function hasOneWithMinimalistCollectionHolder<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
    if (collection == null)
        return false
    if (isCollectionHolder(collection,))
        return hasOneWithMinimalistCollectionHolderByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasOneWithMinimalistCollectionHolderByArray(collection, values,)
    if (isMinimalistCollectionHolder(collection,))
        return hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(collection, values,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasOneWithMinimalistCollectionHolderByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasOneWithMinimalistCollectionHolderByArray(collection, values,)
    return hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(collection, values,)
}


/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false
    if (values == null)
        return true

    const valuesSize = values.size
    if (valuesSize == 0)
        return true
    return __validate(collection, values, size, valuesSize,)
}

/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithMinimalistCollectionHolderByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false
    if (values == null)
        return true

    const valuesSize = values.size
    if (valuesSize == 0)
        return true
    return __validate(collection, values, collection.size, valuesSize,)
}

/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithMinimalistCollectionHolderByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
    if (collection == null)
        return false

    const size = collection.length
    if (size == 0)
        return false
    if (values == null)
        return true

    const valuesSize = values.size
    if (valuesSize == 0)
        return true
    return __validateByArray(collection, values, size, valuesSize,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __validate<const T, >(collection: MinimalistCollectionHolder<T>, values: MinimalistCollectionHolder<T>, size: number, valuesSize: number,) {
    let valueIndex = -1
    while (++valueIndex < valuesSize) {
        const value = values.get(valueIndex,)
        let index = -1
        while (++index < size)
            if (collection.get(index,) === value)
                return true
    }
    return false
}

function __validateByArray<const T, >(collection: readonly T[], values: MinimalistCollectionHolder<T>, size: number, valuesSize: number,) {
    let valueIndex = -1
    while (++valueIndex < valuesSize) {
        const value = values.get(valueIndex,)
        let index = -1
        while (++index < size)
            if (collection[index] === value)
                return true
    }
    return false
}

//#endregion -------------------- Loop methods --------------------

