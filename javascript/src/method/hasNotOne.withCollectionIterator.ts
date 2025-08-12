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
import type {CollectionIterator}         from "../iterator/CollectionIterator"

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
export function hasNotOneWithCollectionIterator<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: CollectionIterator<T>,): boolean {
    if (collection == null)
        return true
    if (isCollectionHolder(collection,))
        return hasNotOneWithCollectionIteratorByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasNotOneWithCollectionIteratorByArray(collection, values,)
    if (isMinimalistCollectionHolder(collection,))
        return hasNotOneWithCollectionIteratorByMinimalistCollectionHolder(collection, values,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasNotOneWithCollectionIteratorByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasNotOneWithCollectionIteratorByArray(collection, values,)
    return hasNotOneWithCollectionIteratorByMinimalistCollectionHolder(collection, values,)
}


/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotOneWithCollectionIteratorByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator<T>,): boolean {
    if (collection == null)
        return true

    const size = collection.size
    if (size == 0)
        return true

    const valuesSize = values.size
    if (valuesSize == 0)
        return false
    return __hasNotOne(collection, values, size, valuesSize,)
}

/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotOneWithCollectionIteratorByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionIterator<T>,): boolean {
    if (collection == null)
        return true
    if (collection.isEmpty)
        return true

    const valuesSize = values.size
    if (valuesSize == 0)
        return false
    return __hasNotOne(collection, values, collection.size, valuesSize,)
}

/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotOneWithCollectionIteratorByArray<const T, >(collection: Nullable<readonly T[]>, values: CollectionIterator<T>,): boolean {
    if (collection == null)
        return true

    const size = collection.length
    if (size == 0)
        return true

    const valuesSize = values.size
    if (valuesSize == 0)
        return false
    return __hasNotOneByArray(collection, values, size, valuesSize,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasNotOne<const T, >(collection: MinimalistCollectionHolder<T>, values: CollectionIterator<T>, size: number, valuesSize: number,) {
    let valueIndex = valuesSize
    while (valueIndex-- > 0) {
        const value = values.nextValue
        let index = -1
        while (++index < size)
            if (collection.get(index,) === value)
                return false
    }
    return true
}

function __hasNotOneByArray<const T, >(collection: readonly T[], values: CollectionIterator<T>, size: number, valuesSize: number,) {
    let valueIndex = valuesSize
    while (valueIndex-- > 0) {
        const value = values.nextValue
        let index = -1
        while (++index < size)
            if (collection[index] === value)
                return false
    }
    return true
}

//#endregion -------------------- Loop methods --------------------

