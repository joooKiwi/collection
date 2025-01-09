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
import type {ValueIndexCallback}         from "../type/callback"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Perform a given {@link action} on each element
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html Kotlin forEach(action)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
 * @extensionFunction
 */
export function forEach<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, action: ValueIndexCallback<T>,): void {
    if (collection == null)
        return
    if (isCollectionHolder<T>(collection,))
        forEachByCollectionHolder(collection, action,)
    else if (isArray(collection,))
        forEachByArray(collection, action,)
    else if (isCollectionHolderByStructure<T>(collection,))
        forEachByCollectionHolder(collection, action,)
    else if (isArrayByStructure<T>(collection,))
        forEachByArray(collection, action,)
    else
        forEachByMinimalistCollectionHolder(collection, action,)
}


/**
 * Perform a given {@link action} on each element
 *
 * @param collection The {@link MinimalistCollectionHolder collection}
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html Kotlin forEach(action)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
 * @extensionFunction
 */
export function forEachByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, action: ValueIndexCallback<T>,): void {
    if (collection == null)
        return

    const size = collection.size
    if (size == 0)
        return
    if (action.length == 1)
        __with1Argument(collection, action as (value: T,) => void, size,)
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
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html Kotlin forEach(action)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
 * @extensionFunction
 */
export function forEachByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, action: ValueIndexCallback<T>,): void {
    if (collection == null)
        return
    if (collection.isEmpty)
        return
    if (action.length == 1)
        __with1Argument(collection, action as (value: T,) => void, collection.size,)
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
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html Kotlin forEach(action)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
 * @extensionFunction
 */
export function forEachByArray<const T, >(collection: Nullable<readonly T[]>, action: ValueIndexCallback<T>,): void {
    if (collection == null)
        return

    const size = collection.length
    if (size == 0)
        return
    if (action.length == 1)
        __with1ArgumentByArray(collection, action as (value: T,) => void, size,)
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


function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, action: (value: T,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(collection.get(index,),)
}

function __with1ArgumentByArray<const T, >(collection: readonly T[], action: (value: T,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(collection[index] as T,)
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, action: (value: T, index: number,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(collection.get(index,), index,)
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], action: (value: T, index: number,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(collection[index] as T, index,)
}

//#endregion -------------------- Loop methods --------------------
