/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {IndexValueCallback}         from "../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Perform a given {@link action} on each element
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html Kotlin forEach(action)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
 * @extensionFunction
 */
export function forEachIndexed<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, action: IndexValueCallback<T>,): void {
    if (collection == null)
        return
    if (isCollectionHolder<T>(collection,))
        forEachIndexedByCollectionHolder(collection, action,)
    else if (isCollectionHolderByStructure<T>(collection,))
        return forEachIndexedByCollectionHolder(collection, action,)
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
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html Kotlin forEach(action)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
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
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html Kotlin forEach(action)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
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

//#endregion -------------------- Loop methods --------------------
