/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {IndexValueCallback}         from "../../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../../MinimalistCollectionHolder"

import {__with0Argument, __with1Argument, __with2Argument} from "../onEachIndexed"

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
export function onEachIndexed<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION, action: IndexValueCallback<T>,): COLLECTION {
    if (collection == null)
        return null as COLLECTION

    const size = collection.size
    if (size == 0)
        return collection
    if (action.length == 1)
        return __with1Argument(collection, action as (index: number,) => void, size,)
    if (action.length >= 2)
        return __with2Argument(collection, action, size,)
    return __with0Argument(collection, action as () => void, size,)
}
