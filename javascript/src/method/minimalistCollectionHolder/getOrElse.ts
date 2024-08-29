/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {IndexWithReturnCallback}    from "../../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../../MinimalistCollectionHolder"

/**
 * Get the element at the specified index in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param index        The index to retrieve a value
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function getOrElse<const T, const U, >(collection: Nullable<MinimalistCollectionHolder<T>>, index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
/**
 * Get the element at the specified index in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param index        The index to retrieve a value
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function getOrElse<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, index: number, defaultValue: IndexWithReturnCallback<T>,): T
export function getOrElse<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
    if (collection == null)
        return defaultValue(index,)

    if (Number.isNaN(index,))
        return defaultValue(index,)
    if (index == Number.NEGATIVE_INFINITY)
        return defaultValue(index,)
    if (index == Number.POSITIVE_INFINITY)
        return defaultValue(index,)

    const size = collection.size
    if (size == 0)
        return defaultValue(index,)
    if (index > size)
        return defaultValue(index,)
    if (index >= 0)
        return collection.get(index,)

    const indexToRetrieve = size + index
    if (indexToRetrieve < 0)
        return defaultValue(index,)
    if (indexToRetrieve > size)
        return defaultValue(index,)
    return collection.get(indexToRetrieve,)
}
