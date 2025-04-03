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
import type {IndexValueCallback}         from "../type/callback"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Perform a given {@link action} on each element
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each-indexed.html Kotlin forEachIndexed(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
 * @extensionFunction
 */
export function forEachIndexed<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, action: IndexValueCallback<T>,): void {
    if (collection == null)
        return
    if (isCollectionHolder(collection,))
        forEachIndexedByCollectionHolder(collection, action,)
    else if (isArray(collection,))
        forEachIndexedByArray(collection, action,)
    else if (isMinimalistCollectionHolder(collection,))
        forEachIndexedByMinimalistCollectionHolder(collection, action,)

    else if (isCollectionHolderByStructure<T>(collection,))
        return forEachIndexedByCollectionHolder(collection, action,)
    else if (isArrayByStructure<T>(collection,))
        return forEachIndexedByArray(collection, action,)
    else
        forEachIndexedByMinimalistCollectionHolder(collection, action,)

}


/**
 * Perform a given {@link action} on each element
 *
 * @param collection The {@link MinimalistCollectionHolder collection}
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each-indexed.html Kotlin forEachIndexed(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
 * @extensionFunction
 */
export function forEachIndexedByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, action: IndexValueCallback<T>,): void {
    if (collection == null)
        return

    const size = collection.size
    if (size == 0)
        return
    if (action.length == 1)
        __with1Argument(action as (index: number,) => void, size,)
    else if (action.length >= 2)
        __with2Argument(collection, action, size,)
    else
        __with0Argument(action as () => void, size,)
}

/**
 * Perform a given {@link action} on each element
 *
 * @param collection The {@link CollectionHolder collection}
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each-indexed.html Kotlin forEachIndexed(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
 * @extensionFunction
 */
export function forEachIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, action: IndexValueCallback<T>,): void {
    if (collection == null)
        return
    if (collection.isEmpty)
        return
    if (action.length == 1)
        __with1Argument(action as (index: number,) => void, collection.size,)
    else if (action.length >= 2)
        __with2Argument(collection, action, collection.size,)
    else
        __with0Argument(action as () => void, collection.size,)
}

/**
 * Perform a given {@link action} on each element
 *
 * @param collection The {@link ReadonlyArray collection}
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each-indexed.html Kotlin forEachIndexed(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
 * @extensionFunction
 */
export function forEachIndexedByArray<const T, >(collection: Nullable<readonly T[]>, action: IndexValueCallback<T>,): void {
    if (collection == null)
        return

    const size = collection.length
    if (size == 0)
        return
    if (action.length == 1)
        __with1Argument(action as (index: number,) => void, size,)
    else if (action.length >= 2)
        __with2ArgumentByArray(collection, action, size,)
    else
        __with0Argument(action as () => void, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument(action: () => void, size: number,) {
    let index = size
    while (index-- > 0)
        action()
}


function __with1Argument(action: (index: number,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(index,)
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, action: (index: number, value: T,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(index, collection.get(index,),)
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], action: (index: number, value: T,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(index, collection[index] as T,)
}

//#endregion -------------------- Loop methods --------------------
