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
export function hasAllWithIterator<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Iterator<T>,): boolean {
    if (isCollectionHolder(collection,))
        return hasAllWithIteratorByCollectionHolder(collection, values,)
    if (isArray(collection,))
        return hasAllWithIteratorByArray(collection, values,)
    if (isMinimalistCollectionHolder(collection,))
        return hasAllWithIteratorByMinimalistCollectionHolder(collection, values,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasAllWithIteratorByCollectionHolder(collection, values,)
    if (isArrayByStructure<T>(collection,))
        return hasAllWithIteratorByArray(collection, values,)
    return hasAllWithIteratorByMinimalistCollectionHolder(collection, values,)
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
export function hasAllWithIteratorByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterator<T>,): boolean {
    const iteratorResult: IteratorResult<unknown, unknown> = values.next()
    if (iteratorResult.done)
        return true
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false
    return __validate(collection, values, iteratorResult.value, size,)
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
export function hasAllWithIteratorByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterator<T>,): boolean {
    const iteratorResult: IteratorResult<T, unknown> = values.next()
    if (iteratorResult.done)
        return true
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false
    return __validate(collection, values, iteratorResult.value, collection.size,)
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
export function hasAllWithIteratorByArray<const T, >(collection: Nullable<readonly T[]>, values: Iterator<T>,): boolean {
    const iteratorResult: IteratorResult<T, unknown> = values.next()
    if (iteratorResult.done)
        return true
    if (collection == null)
        return false

    const size = collection.length
    if (size == 0)
        return false
    return __validateByArray(collection, values, iteratorResult.value, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __validate<const T, >(collection: MinimalistCollectionHolder<T>, values: Iterator<T, unknown, unknown>, firstValue: T, size: number,) {
    firstValueLoop: {
        let index1 = -1
        while (++index1 < size)
            if (collection.get(index1,) === firstValue)
                break firstValueLoop
        return false
    }

    let iteratorResult: IteratorResult<T, unknown>
    valueLoop: while (!(iteratorResult = values.next()).done) {
        const value = iteratorResult.value
        let index2 = -1
        while (++index2 < size)
            if (collection.get(index2,) === value)
                continue valueLoop
        return false
    }
    return true
}

function __validateByArray<const T, >(collection: readonly T[], values: Iterator<T, unknown, unknown>, firstValue: T, size: number,) {
    firstValueLoop: {
        let index1 = -1
        while (++index1 < size)
            if (collection[index1] === firstValue)
                break firstValueLoop
        return false
    }

    let iteratorResult: IteratorResult<T, unknown>
    valueLoop: while (!(iteratorResult = values.next()).done) {
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

