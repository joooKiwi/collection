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
 * and return the {@link collection} afterwards
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each-indexed.html Kotlin onEachIndexed(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
 * @extensionFunction
 */
export function onEachIndexed<const T, const COLLECTION extends Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]> = Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, >(collection: COLLECTION, action: IndexValueCallback<T>,): COLLECTION
export function onEachIndexed<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, action: IndexValueCallback<T>,) {
    if (collection == null)
        return collection
    if (isCollectionHolder(collection,))
        return onEachIndexedByCollectionHolder(collection, action,)
    if (isArray(collection,))
        return onEachIndexedByArray(collection, action,)
    if (isMinimalistCollectionHolder(collection,))
        return onEachIndexedByMinimalistCollectionHolder(collection, action,)

    if (isCollectionHolderByStructure<T>(collection,))
        return onEachIndexedByCollectionHolder(collection, action,)
    if (isArrayByStructure<T>(collection,))
        return onEachIndexedByArray(collection, action,)
    return onEachIndexedByMinimalistCollectionHolder(collection, action,)
}


/**
 * Perform a given {@link action} on each element
 * and return the {@link collection} afterwards
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each-indexed.html Kotlin onEachIndexed(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
 * @extensionFunction
 */
export function onEachIndexedByMinimalistCollectionHolder<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION, action: IndexValueCallback<T>,): COLLECTION {
    if (collection == null)
        return collection

    const size = collection.size
    if (size == 0)
        return collection
    if (action.length == 1)
        return __with1Argument(collection, action as (index: number,) => void, size,)
    if (action.length >= 2)
        return __with2Argument(collection, action, size,)
    return __with0Argument(collection, action as () => void, size,)
}

/**
 * Perform a given {@link action} on each element
 * and return the {@link collection} afterwards
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each-indexed.html Kotlin onEachIndexed(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
 * @extensionFunction
 */
export function onEachIndexedByCollectionHolder<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION, action: IndexValueCallback<T>,): COLLECTION {
    if (collection == null)
        return collection
    if (collection.isEmpty)
        return collection
    if (action.length == 1)
        return __with1Argument(collection, action as (index: number,) => void, collection.size,)
    if (action.length >= 2)
        return __with2Argument(collection, action, collection.size,)
    return __with0Argument(collection, action as () => void, collection.size,)
}

/**
 * Perform a given {@link action} on each element
 * and return the {@link collection} afterwards
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each-indexed.html Kotlin onEachIndexed(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
 * @extensionFunction
 */
export function onEachIndexedByArray<const T, const COLLECTION extends Nullable<readonly T[]> = Nullable<readonly T[]>, >(collection: COLLECTION, action: IndexValueCallback<T>,): COLLECTION {
    if (collection == null)
        return collection

    const size = collection.length
    if (size == 0)
        return collection
    if (action.length == 1)
        return __with1Argument(collection, action as (index: number,) => void, size,)
    if (action.length >= 2)
        return __with2ArgumentByArray(collection, action, size,)
    return __with0Argument(collection, action as () => void, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const COLLECTION, >(collection: COLLECTION, action: () => void, size: number,) {
    let index = size
    while (index-- > 0)
        action()
    return collection
}


function __with1Argument<const COLLECTION, >(collection: COLLECTION, action: (index: number,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(index,)
    return collection
}


function __with2Argument<const T, const COLLECTION extends MinimalistCollectionHolder<T>, >(collection: COLLECTION, action: (index: number, value: T,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(index, collection.get(index,),)
    return collection
}

function __with2ArgumentByArray<const T, const COLLECTION extends readonly T[], >(collection: COLLECTION, action: (index: number, value: T,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(index, collection[index] as T,)
    return collection
}

//#endregion -------------------- Loop methods --------------------
