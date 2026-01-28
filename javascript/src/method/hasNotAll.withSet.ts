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
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotAllWithSet<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<ReadonlySet<T>>,): boolean {
    if (isCollectionHolder(collection,))
        return hasNotAllWithSetByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasNotAllWithSetByArray(collection, values,)
    if (isMinimalistCollectionHolder(collection,))
        return hasNotAllWithSetByMinimalistCollectionHolder(collection, values,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasNotAllWithSetByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasNotAllWithSetByArray(collection, values,)
    return hasNotAllWithSetByMinimalistCollectionHolder(collection, values,)
}


/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotAllWithSetByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<ReadonlySet<T>>,): boolean {
    if (values == null)
        return false

    const valuesSize = values.size
    if (valuesSize == 0)
        return false
    if (collection == null)
        return true

    const size = collection.size
    if (size == 0)
        return true
    return __validate(collection, values, size, valuesSize,)
}

/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotAllWithSetByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<ReadonlySet<T>>,): boolean {
    if (values == null)
        return false

    const valuesSize = values.size
    if (valuesSize == 0)
        return false
    if (collection == null)
        return true
    if (collection.isEmpty)
        return true
    return __validate(collection, values, collection.size, valuesSize,)
}

/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasNotAllWithSetByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<ReadonlySet<T>>,): boolean {
    if (values == null)
        return false

    const valuesSize = values.size
    if (valuesSize == 0)
        return false
    if (collection == null)
        return true

    const size = collection.length
    if (size == 0)
        return true
    return __validateByArray(collection, values, size, valuesSize,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __validate<const T, >(collection: MinimalistCollectionHolder<T>, values: ReadonlySet<T>, size: number, valuesSize: number,) {
    const iterator = values[Symbol.iterator]()
    let valuesIndex = valuesSize + 1
    valueLoop: while (--valuesIndex > 0) {
        const value = iterator.next().value
        let index = -1
        while (++index < size)
            if (collection.get(index,) === value)
                continue valueLoop
        return true
    }
    return false
}

function __validateByArray<const T, >(collection: readonly T[], values: ReadonlySet<T>, size: number, valuesSize: number,) {
    const iterator = values[Symbol.iterator]()
    let valuesIndex = valuesSize + 1
    valueLoop: while (--valuesIndex > 0) {
        const value = iterator.next().value
        let index = -1
        while (++index < size)
            if (collection[index] === value)
                continue valueLoop
        return true
    }
    return false
}

//#endregion -------------------- Loop methods --------------------

