/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {ValueIndexCallback}         from "../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isCollectionHolder}                      from "./isCollectionHolder"
import {isCollectionHolderByStructure}           from "./isCollectionHolderByStructure"
import {forEach as byCollectionHolder}           from "./collectionHolder/forEach"
import {forEach as byMinimalistCollectionHolder} from "./minimalistCollectionHolder/forEach"

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
export function forEach<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, action: ValueIndexCallback<T>,): void {
    if (collection == null)
        return
    if (isCollectionHolder<T>(collection,))
        byCollectionHolder(collection, action,)
    else if (isCollectionHolderByStructure<T>(collection,))
        byCollectionHolder(collection, action,)
    else
        byMinimalistCollectionHolder(collection, action,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

/** @internal */
export function __with0Argument(action: () => void, size: number,) {
    let index = size
    while (index-- > 0)
        action()
}

/** @internal */
export function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, action: (value: T,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(collection.get(index,),)
}

/** @internal */
export function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, action: (value: T, index: number,) => void, size: number,) {
    let index = -1
    while (++index < size)
        action(collection.get(index,), index,)
}

//#endregion -------------------- Loop methods --------------------
