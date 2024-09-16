/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {ValueIndexCallback}         from "../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Perform a given {@link action} on each element
 * and return the {@link collection} afterwards
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
 * @extensionFunction
 */
export function onEach<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION, action: ValueIndexCallback<T>,): COLLECTION {
    if (collection == null)
        return collection
    if (isCollectionHolder<T>(collection,))
        return onEachByCollectionHolder(collection, action,)
    if (isCollectionHolderByStructure<T>(collection,))
        return onEachByCollectionHolder(collection, action,)
    return onEachByMinimalistCollectionHolder(collection, action,)
}


/**
 * Perform a given {@link action} on each element
 * and return the {@link collection} afterwards
 *
 * @param collection The {@link MinimalistCollectionHolder collection}
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
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
 * @param collection The {@link CollectionHolder collection}
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
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

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION, action: () => void, size: number,) {
    let index = size
    while (index-- > 0)
        action()
    return collection
}

function __with1Argument<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION, action: (value: T,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(collection.get(index,),)
    return collection
}

function __with2Argument<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION, action: (value: T, index: number,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(collection.get(index,), index,)
    return collection
}

//#endregion -------------------- Loop methods --------------------
