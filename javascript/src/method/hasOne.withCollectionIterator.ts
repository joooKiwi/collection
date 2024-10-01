/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {CollectionIterator}         from "../iterator/CollectionIterator"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithCollectionIterator<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: CollectionIterator<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @extensionFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneWithCollectionIterator<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator,): boolean
export function hasOneWithCollectionIterator<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: CollectionIterator<T>,) {
    if (collection == null)
        return false
    if (isCollectionHolder<T>(collection,))
        return hasOneWithCollectionIteratorByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasOneWithCollectionIteratorByArray(collection, values,)
    if (isCollectionHolderByStructure<T>(collection,))
        return hasOneWithCollectionIteratorByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasOneWithCollectionIteratorByArray(collection, values,)
    return hasOneWithCollectionIteratorByMinimalistCollectionHolder(collection, values,)
}


/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithCollectionIteratorByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneWithCollectionIteratorByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator,): boolean
export function hasOneWithCollectionIteratorByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator<T>,) {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false

    const valuesSize = values.size
    if (valuesSize == 0)
        return true
    return __hasOne(collection, values, size, valuesSize,)
}

/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithCollectionIteratorByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionIterator<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneWithCollectionIteratorByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionIterator,): boolean
export function hasOneWithCollectionIteratorByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionIterator<T>,) {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false

    const valuesSize = values.size
    if (valuesSize == 0)
        return true
    return __hasOne(collection, values, collection.size, valuesSize,)
}

/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithCollectionIteratorByArray<const T, >(collection: Nullable<readonly T[]>, values: CollectionIterator<T>,): boolean {
    if (collection == null)
        return false

    const size = collection.length
    if (size == 0)
        return false

    const valuesSize = values.size
    if (valuesSize == 0)
        return true
    return __hasOneByArray(collection, values, size, valuesSize,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasOne<const T, >(collection: MinimalistCollectionHolder<T>, values: CollectionIterator<T>, size: number, valuesSize: number,) {
    let valueIndex = valuesSize
    while (valueIndex-- > 0) {
        const value = values.nextValue
        let index = -1
        while (++index < size)
            if (collection.get(index,) === value)
                return true
    }
    return false
}

function __hasOneByArray<const T, >(collection: readonly T[], values: CollectionIterator<T>, size: number, valuesSize: number,) {
    let valueIndex = valuesSize
    while (valueIndex-- > 0) {
        const value = values.nextValue
        let index = -1
        while (++index < size)
            if (collection[index] === value)
                return true
    }
    return false
}

//#endregion -------------------- Loop methods --------------------

