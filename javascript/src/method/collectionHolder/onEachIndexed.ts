/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}   from "../../CollectionHolder"
import type {IndexValueCallback} from "../../CollectionHolder.types"

import {__with0Argument, __with1Argument, __with2Argument} from "../onEachIndexed"

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
export function onEachIndexed<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION, action: IndexValueCallback<T>,): COLLECTION {
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
