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
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithMinimalistCollectionHolder<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
    if (isCollectionHolder(collection,))
        return hasAllWithMinimalistCollectionHolderByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasAllWithMinimalistCollectionHolderByArray(collection, values,)
    if (isMinimalistCollectionHolder(collection,))
        return hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(collection, values,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasAllWithMinimalistCollectionHolderByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasAllWithMinimalistCollectionHolderByArray(collection, values,)
    return hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(collection, values,)
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
export function hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
    if (values == null)
        return true

    const valuesSize = values.size
    if (valuesSize == 0)
        return true
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
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
export function hasAllWithMinimalistCollectionHolderByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
    if (values == null)
        return true

    const valuesSize = values.size
    if (valuesSize == 0)
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
export function hasAllWithMinimalistCollectionHolderByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
    if (values == null)
        return true

    const valuesSize = values.size
    if (valuesSize == 0)
        return true
    if (collection == null)
        return false

    const size = collection.length
    if (size == 0)
        return false
    return __validateByArray(collection, values, size, valuesSize,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __validate<const T, >(collection: MinimalistCollectionHolder<T>, values: MinimalistCollectionHolder<T>, size: number, valuesSize: number,) {
    let valueIndex = -1
    valueLoop: while (++valueIndex < valuesSize) {
        const value = values.get(valueIndex,)
        let index = -1
        while (++index < size)
            if (collection.get(index,) === value)
                continue valueLoop
        return false
    }
    return true
}

function __validateByArray<const T, >(collection: readonly T[], values: MinimalistCollectionHolder<T>, size: number, valuesSize: number,) {
    let valueIndex = -1
    valueLoop: while (++valueIndex < valuesSize) {
        const value = values.get(valueIndex,)
        let index = -1
        while (++index < size)
            if (collection[index] === value)
                continue valueLoop
        return false
    }
    return true
}

//#endregion -------------------- Loop methods --------------------

