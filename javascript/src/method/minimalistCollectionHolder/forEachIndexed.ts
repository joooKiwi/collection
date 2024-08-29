/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {IndexValueCallback}         from "../../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../../MinimalistCollectionHolder"

import {__with0Argument, __with1Argument, __with2Argument} from "../forEachIndexed"

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
export function forEachIndexed<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, action: IndexValueCallback<T>,): void {
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
