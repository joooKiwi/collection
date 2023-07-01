/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {IndexWithReturnCallback} from "../CollectionHolder.types"
import type {CollectionHolder}        from "../CollectionHolder"

/**
 * Get the element at the specified index in the {@link collection}
 * or the return value of the {@link defaultValue callback}
 *
 * @param collection The {@link CollectionHolder collection}
 * @param index The index to retrieve a value
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
 * @see getOrNull
 *
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function getOrElse<const T, const U, >(collection: CollectionHolder<T>, index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U

/**
 * Get the element at the specified index in the {@link collection}
 * or the return value of the {@link defaultValue callback}
 *
 * @param collection The {@link CollectionHolder collection}
 * @param index The index to retrieve a value
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
 * @see getOrNull
 *
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function getOrElse<const T, >(collection: CollectionHolder<T>, index: number, defaultValue: IndexWithReturnCallback<T>,): T
export function getOrElse<const T, const U, >(collection: CollectionHolder<T>, index: number, defaultValue: IndexWithReturnCallback<| T | U>,) {
    if (collection.isEmpty)
        return defaultValue(index < 0 ? collection.size + index : index)

    const size = collection.size,
        indexToRetrieve = index < 0 ? size + index : index
    if (indexToRetrieve > size)
        return defaultValue(indexToRetrieve,)
    if (indexToRetrieve < 0)
        return defaultValue(indexToRetrieve,)
    return collection.get(indexToRetrieve,)
}
