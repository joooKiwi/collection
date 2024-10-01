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
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithCollectionHolder<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: CollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
 */
export function hasAllWithCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder,): boolean
export function hasAllWithCollectionHolder<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: CollectionHolder<T>,) {
    if (collection == null)
        return false
    if (isCollectionHolder<T>(collection,))
        return hasAllWithCollectionHolderByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasAllWithCollectionHolderByArray(collection, values,)
    if (isCollectionHolderByStructure<T>(collection,))
        return hasAllWithCollectionHolderByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasAllWithCollectionHolderByArray(collection, values,)
    return hasAllWithCollectionHolderByMinimalistCollectionHolder(collection, values,)
}


/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithCollectionHolderByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
 */
export function hasAllWithCollectionHolderByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder,): boolean
export function hasAllWithCollectionHolderByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder<T>,) {
    if (collection == null)
        return false
    if (values.isEmpty)
        return true

    const size = collection.size
    if (size == 0)
        return false
    return __hasAll(collection, values, size, values.size,)
}

/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithCollectionHolderByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
 */
export function hasAllWithCollectionHolderByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionHolder,): boolean
export function hasAllWithCollectionHolderByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionHolder<T>,) {
    if (collection == null)
        return false
    if (values.isEmpty)
        return true
    if (collection.isEmpty)
        return false

    return __hasAll(collection, values, collection.size, values.size,)
}

/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithCollectionHolderByArray<const T, >(collection: Nullable<readonly T[]>, values: CollectionHolder<T>,): boolean {
    if (collection == null)
        return false
    if (values.isEmpty)
        return true

    const size = collection.length
    if (size == 0)
        return false
    return __hasAllByArray(collection, values, size, values.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasAll<const T, >(collection: MinimalistCollectionHolder<T>, values: MinimalistCollectionHolder<T>, size: number, valuesSize: number,) {
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

function __hasAllByArray<const T, >(collection: readonly T[], values: MinimalistCollectionHolder<T>, size: number, valuesSize: number,) {
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

