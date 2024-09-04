/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}   from "../../CollectionHolder"
import type {ValueIndexCallback} from "../../CollectionHolder.types"

import {__with0Argument, __with1Argument, __with2Argument} from "../onEach"

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
export function onEach<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION, action: ValueIndexCallback<T>,): COLLECTION {
    if (collection == null)
        return null as COLLECTION
    if (collection.isEmpty)
        return collection
    if (action.length == 1)
        return __with1Argument(collection, action as (value: T,) => void, collection.size,)
    if (action.length >= 2)
        return __with2Argument(collection, action, collection.size,)
    return __with0Argument(collection, action as () => void, collection.size,)
}
