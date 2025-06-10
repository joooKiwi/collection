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
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Perform a given {@link action} on each element
 * and return the {@link collection} afterwards
 *
 * @param collection The {@link Nullable nullable} collection (({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java Iterable.forEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#forEach(java.util.function.Consumer) Java Stream.forEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#forEach(java.util.function.IntConsumer) Java IntStream.forEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#forEach(java.util.function.LongConsumer) Java LongStream.forEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#forEach(java.util.function.DoubleConsumer) Java DoubleStream.forEach(action)
 * @extensionFunction
 */
export function onEach<const T, const COLLECTION extends Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]> = Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, >(collection: COLLECTION, action: ValueIndexCallback<T>,): COLLECTION
export function onEach<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, action: ValueIndexCallback<T>,) {
    if (collection == null)
        return collection
    if (isCollectionHolder(collection,))
        return onEachByCollectionHolder(collection, action,)
    if (isArray(collection,))
        return onEachByArray(collection, action,)
    if (isMinimalistCollectionHolder(collection,))
        return onEachByMinimalistCollectionHolder(collection, action,)

    if (isCollectionHolderByStructure<T>(collection,))
        return onEachByCollectionHolder(collection, action,)
    if (isArrayByStructure<T>(collection,))
        return onEachByArray(collection, action,)
    return onEachByMinimalistCollectionHolder(collection, action,)
}


/**
 * Perform a given {@link action} on each element
 * and return the {@link collection} afterwards
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java Iterable.forEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#forEach(java.util.function.Consumer) Java Stream.forEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#forEach(java.util.function.IntConsumer) Java IntStream.forEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#forEach(java.util.function.LongConsumer) Java LongStream.forEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#forEach(java.util.function.DoubleConsumer) Java DoubleStream.forEach(action)
 * @extensionFunction
 */
export function onEachByMinimalistCollectionHolder<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION, action: ValueIndexCallback<T>,): COLLECTION {
    if (collection == null)
        return collection

    const size = collection.size
    if (size == 0)
        return collection
    if (action.length == 1)
        return __with1Argument(collection, action as (value: T,) => void, size,)
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
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java Iterable.forEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#forEach(java.util.function.Consumer) Java Stream.forEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#forEach(java.util.function.IntConsumer) Java IntStream.forEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#forEach(java.util.function.LongConsumer) Java LongStream.forEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#forEach(java.util.function.DoubleConsumer) Java DoubleStream.forEach(action)
 * @extensionFunction
 */
export function onEachByCollectionHolder<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION, action: ValueIndexCallback<T>,): COLLECTION {
    if (collection == null)
        return collection
    if (collection.isEmpty)
        return collection
    if (action.length == 1)
        return __with1Argument(collection, action as (value: T,) => void, collection.size,)
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
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java Iterable.forEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#forEach(java.util.function.Consumer) Java Stream.forEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#forEach(java.util.function.IntConsumer) Java IntStream.forEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#forEach(java.util.function.LongConsumer) Java LongStream.forEach(action)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#forEach(java.util.function.DoubleConsumer) Java DoubleStream.forEach(action)
 * @extensionFunction
 */
export function onEachByArray<const T, const COLLECTION extends Nullable<readonly T[]> = Nullable<readonly T[]>, >(collection: COLLECTION, action: ValueIndexCallback<T>,): COLLECTION {
    if (collection == null)
        return collection

    const size = collection.length
    if (size == 0)
        return collection
    if (action.length == 1)
        return __with1ArgumentByArray(collection, action as (value: T,) => void, size,)
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


function __with1Argument<const T, const COLLECTION extends MinimalistCollectionHolder<T>, >(collection: COLLECTION, action: (value: T,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(collection.get(index,),)
    return collection
}

function __with1ArgumentByArray<const T, const COLLECTION extends readonly T[], >(collection: COLLECTION, action: (value: T,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(collection[index] as T,)
    return collection
}


function __with2Argument<const T, const COLLECTION extends MinimalistCollectionHolder<T>, >(collection: COLLECTION, action: (value: T, index: number,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(collection.get(index,), index,)
    return collection
}

function __with2ArgumentByArray<const T, const COLLECTION extends readonly T[], >(collection: COLLECTION, action: (value: T, index: number,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(collection[index] as T, index,)
    return collection
}

//#endregion -------------------- Loop methods --------------------
