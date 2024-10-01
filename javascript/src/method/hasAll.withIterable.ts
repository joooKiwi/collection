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
export function hasAllWithIterable<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: Iterable<T>,): boolean
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
export function hasAllWithIterable<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<unknown>,): boolean
export function hasAllWithIterable<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: Iterable<T>,) {
    if (collection == null)
        return false
    if (isCollectionHolder<T>(collection,))
        return hasAllWithIterableByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasAllWithIterableByArray(collection, values,)
    if (isCollectionHolderByStructure<T>(collection,))
        return hasAllWithIterableByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasAllWithIterableByArray(collection, values,)
    return hasAllWithIterableByMinimalistCollectionHolder(collection, values,)
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
export function hasAllWithIterableByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<T>,): boolean
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
export function hasAllWithIterableByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<unknown>,): boolean
export function hasAllWithIterableByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<T>,) {
    if (collection == null)
        return false

    const iterator = values[Symbol.iterator]() as IterableIterator<unknown>
    const iteratorResult: IteratorResult<unknown, unknown> = iterator.next()
    if (iteratorResult.done)
        return true

    const size = collection.size
    if (size == 0)
        return false
    return __hasAll(collection, iterator, iteratorResult.value, size,)
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
export function hasAllWithIterableByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<T>,): boolean
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
export function hasAllWithIterableByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<unknown>,): boolean
export function hasAllWithIterableByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<T>,) {
    if (collection == null)
        return false

    const iterator = values[Symbol.iterator]() as IterableIterator<T, unknown, unknown>
    const iteratorResult: IteratorResult<T, unknown> = iterator.next()
    if (iteratorResult.done)
        return true
    if (collection.isEmpty)
        return false
    return __hasAll(collection, iterator, iteratorResult.value, collection.size,)
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
export function hasAllWithIterableByArray<const T, >(collection: Nullable<readonly T[]>, values: Iterable<T>,): boolean {
    if (collection == null)
        return false

    const iterator = values[Symbol.iterator]() as IterableIterator<T, unknown, unknown>
    const iteratorResult: IteratorResult<T, unknown> = iterator.next()
    if (iteratorResult.done)
        return true

    const size = collection.length
    if (size == 0)
        return false
    return __hasAllByArray(collection, iterator, iteratorResult.value, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasAll<const T, >(collection: MinimalistCollectionHolder<T>, iterator: IterableIterator<T>, firstValue: T, size: number,) {
    firstValueLoop: {
        let index1 = -1
        while (++index1 < size)
            if (collection.get(index1,) === firstValue)
                break firstValueLoop
        return false
    }

    let iteratorResult: IteratorResult<T, unknown>
    valueLoop: while (!(iteratorResult = iterator.next()).done) {
        const value = iteratorResult.value
        let index2 = -1
        while (++index2 < size)
            if (collection.get(index2,) === value)
                continue valueLoop
        return false
    }
    return true
}

function __hasAllByArray<const T, >(collection: readonly T[], iterator: IterableIterator<T>, firstValue: T, size: number,) {
    firstValueLoop: {
        let index1 = -1
        while (++index1 < size)
            if (collection[index1] === firstValue)
                break firstValueLoop
        return false
    }

    let iteratorResult: IteratorResult<T, unknown>
    valueLoop: while (!(iteratorResult = iterator.next()).done) {
        const value = iteratorResult.value
        let index2 = -1
        while (++index2 < size)
            if (collection[index2] === value)
                continue valueLoop
        return false
    }
    return true
}

//#endregion -------------------- Loop methods --------------------

