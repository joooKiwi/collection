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
export function hasOneWithCollectionHolder<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: CollectionHolder<T>,): boolean {
    if (collection == null)
        return false
    if (isCollectionHolder<T>(collection,))
        return hasOneWithCollectionHolderByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasOneWithCollectionHolderByArray(collection, values,)
    if (isCollectionHolderByStructure<T>(collection,))
        return hasOneWithCollectionHolderByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasOneWithCollectionHolderByArray(collection, values,)
    return hasOneWithCollectionHolderByMinimalistCollectionHolder(collection, values,)
}


/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithCollectionHolderByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder<T>,): boolean {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false
    if (values.isEmpty)
        return true
    return __hasOne(collection, values, size, values.size,)
}

/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithCollectionHolderByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionHolder<T>,): boolean {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false
    if (values.isEmpty)
        return true
    return __hasOne(collection, values, collection.size, values.size,)
}

/**
 * Tell that one of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithCollectionHolderByArray<const T, >(collection: Nullable<readonly T[]>, values: CollectionHolder<T>,): boolean {
    if (collection == null)
        return false

    const size = collection.length
    if (size == 0)
        return false
    if (values.isEmpty)
        return true
    return __hasOneByArray(collection, values, size, values.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasOne<const T, >(collection: MinimalistCollectionHolder<T>, values: CollectionHolder<T>, size: number, valuesSize: number,) {
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

function __hasOneByArray<const T, >(collection: readonly T[], values: CollectionHolder<T>, size: number, valuesSize: number,) {
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

