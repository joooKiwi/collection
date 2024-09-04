/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}   from "../../CollectionHolder"
import type {ValueIndexCallback} from "../../CollectionHolder.types"

import {__with0Argument, __with1Argument, __with2Argument} from "../forEach"

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
export function forEach<const T, >(collection: Nullable<CollectionHolder<T>>, action: ValueIndexCallback<T>,): void {
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
