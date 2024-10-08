/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithSet<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: ReadonlySet<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
 */
export function hasAllWithSet<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<unknown>,): boolean
export function hasAllWithSet<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: ReadonlySet<T>,) {
    if (collection == null)
        return false
    if (isCollectionHolder<T>(collection,))
        return hasAllWithSetByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasAllWithSetByArray(collection, values,)
    if (isCollectionHolderByStructure<T>(collection,))
        return hasAllWithSetByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasAllWithSetByArray(collection, values,)
    return hasAllWithSetByMinimalistCollectionHolder(collection, values,)
}


/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithSetByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
 */
export function hasAllWithSetByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<unknown>,): boolean
export function hasAllWithSetByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<T>,) {
    if (collection == null)
        return false

    const valuesSize = values.size
    if (valuesSize == 0)
        return true

    const size = collection.size
    if (size == 0)
        return false
    return __hasAll(collection, values, size, valuesSize,)
}

/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithSetByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
 */
export function hasAllWithSetByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: ReadonlySet<unknown>,): boolean
export function hasAllWithSetByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: ReadonlySet<T>,) {
    if (collection == null)
        return false

    const valuesSize = values.size
    if (valuesSize == 0)
        return true
    if (collection.isEmpty)
        return false
    return __hasAll(collection, values, collection.size, valuesSize,)
}

/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithSetByArray<const T, >(collection: Nullable<readonly T[]>, values: ReadonlySet<T>,): boolean {
    if (collection == null)
        return false

    const valuesSize = values.size
    if (valuesSize == 0)
        return true

    const size = collection.length
    if (size == 0)
        return false
    return __hasAllByArray(collection, values, size, valuesSize,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasAll<const T, >(collection: MinimalistCollectionHolder<T>, values: ReadonlySet<T>, size: number, valuesSize: number,) {
    const iterator = values[Symbol.iterator]()
    let valuesIndex = valuesSize + 1
    valueLoop: while (--valuesIndex > 0) {
        const value = iterator.next().value
        let index = -1
        while (++index < size)
            if (collection.get(index,) === value)
                continue valueLoop
        return false
    }
    return true
}

function __hasAllByArray<const T, >(collection: readonly T[], values: ReadonlySet<T>, size: number, valuesSize: number,) {
    const iterator = values[Symbol.iterator]()
    let valuesIndex = valuesSize + 1
    valueLoop: while (--valuesIndex > 0) {
        const value = iterator.next().value
        let index = -1
        while (++index < size)
            if (collection[index] === value)
                continue valueLoop
        return false
    }
    return true
}

//#endregion -------------------- Loop methods --------------------

