/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}        from "../CollectionHolder"
import type {IndexWithReturnCallback} from "../CollectionHolder.types"

import {isCollectionHolder}                                 from "./isCollectionHolder"
import {getOrElse as getOrElseByCollectionHolder}           from "./collectionHolder/getOrElse"
import {getOrElse as getOrElseByMinimalistCollectionHolder} from "./minimalistCollectionHolder/getOrElse"

/**
 * Get the element at the specified index in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param index        The index to retrieve a value
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function getOrElse<const T, const U, >(collection: Nullable<CollectionHolder<T>>, index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
/**
 * Get the element at the specified index in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param index        The index to retrieve a value
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function getOrElse<const T, >(collection: Nullable<CollectionHolder<T>>, index: number, defaultValue: IndexWithReturnCallback<T>,): T
export function getOrElse<const T, >(collection: Nullable<CollectionHolder<T>>, index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
    if (collection == null)
        return defaultValue(index,)
    if (isCollectionHolder<T>(collection,))
        return getOrElseByCollectionHolder(collection, index, defaultValue,)
    return getOrElseByMinimalistCollectionHolder(collection, index, defaultValue,)
}