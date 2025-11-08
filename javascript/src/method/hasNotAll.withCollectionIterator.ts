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
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotAllWithCollectionIterator<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<CollectionIterator<T>>,): boolean {
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
    if (size == 0)
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
export function hasNotAllWithCollectionIteratorByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<CollectionIterator<T>>,): boolean {
    if (values == null)
        return false
    if (values.isEmpty)
        return false
    if (collection == null)
        return true

    const size = collection.length
    if (size == 0)
        return true
    return __validateByArray(collection, values, size, values.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __validate<const T, >(collection: MinimalistCollectionHolder<T>, values: CollectionIterator<T>, size: number, valuesSize: number,) {
    let valueIndex = valuesSize
    valueLoop: while (valueIndex-- > 0) {
        const value = values.nextValue
        let index = -1
        while (++index < size)
            if (collection.get(index,) === value)
                continue valueLoop
        return true
    }
    return false
}

function __validateByArray<const T, >(collection: readonly T[], values: CollectionIterator<T>, size: number, valuesSize: number,) {
    let valueIndex = valuesSize
    valueLoop: while (valueIndex-- > 0) {
        const value = values.nextValue
        let index = -1
        while (++index < size)
            if (collection[index] === value)
                continue valueLoop
        return true
    }
    return false
}

//#endregion -------------------- Loop methods --------------------
