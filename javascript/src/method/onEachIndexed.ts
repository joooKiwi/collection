/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {IndexValueCallback}         from "../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isCollectionHolder}                            from "./isCollectionHolder"
import {isCollectionHolderByStructure}                 from "./isCollectionHolderByStructure"
import {onEachIndexed as byCollectionHolder}           from "./collectionHolder/onEachIndexed"
import {onEachIndexed as byMinimalistCollectionHolder} from "./minimalistCollectionHolder/onEachIndexed"

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
export function onEachIndexed<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION, action: IndexValueCallback<T>,): COLLECTION {
    if (collection == null)
        return collection
    if (isCollectionHolder<T>(collection,))
        return byCollectionHolder(collection, action,)
    if (isCollectionHolderByStructure<T>(collection,))
        return byCollectionHolder(collection, action,)
    return byMinimalistCollectionHolder(collection, action,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

export function __with0Argument<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION, action: () => void, size: number,) {
    let index = size
    while (index-- > 0)
        action()
    return collection
}

export function __with1Argument<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION, action: (index: number,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(index,)
    return collection
}

export function __with2Argument<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION, action: (index: number, value: T,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(index, collection.get(index,),)
    return collection
}

//#endregion -------------------- Loop methods --------------------
