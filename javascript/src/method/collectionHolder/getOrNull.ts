/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr} from "@joookiwi/type"

import type {CollectionHolder} from "../../CollectionHolder"

/**
 * Get the element at the specified index in the {@link collection}
 * or <b>null</b> if it is over the {@link size}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param index      The index to retrieve a value
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function getOrNull<const T, >(collection: Nullable<CollectionHolder<T>>, index: number,): NullOr<T> {
    if (collection == null)
        return null

    if (Number.isNaN(index,))
        return null
    if (index == Number.NEGATIVE_INFINITY)
        return null
    if (index == Number.POSITIVE_INFINITY)
        return null

    if (collection.isEmpty)
        if (index < 0)
            return null
        else
            return null

    if (index < 0) {
        const size = collection.size
        const indexToRetrieve = size + index
        if (indexToRetrieve < 0)
            return null
        if (indexToRetrieve > size)
            return null
        return collection.get(indexToRetrieve,)
    }

    if (index < 0)
        return null
    if (index > collection.size)
        return null
    return collection.get(index,)
}
