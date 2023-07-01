/*
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi
 *
 * This project is free to use.
 * All the right is reserved to the author of this project.
 */

import type {CollectionHolder} from "../CollectionHolder"
import type {Nullable, NullOr} from "../general type"

/**
 * Get the element at the specified index in the {@link collection}
 * or <b>null</b> if it is over the {@link CollectionHolder.size size}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param index The index to retrieve a value
 * @returns {} The value from {@link CollectionHolder.get} if not <b>null</b>, not empty and is under the {@link CollectionHolder.size size} or <b>null</b>
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
 * @see getOrElse
 *
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function getOrNull<const T, >(collection: Nullable<CollectionHolder<T>>, index: number,): NullOr<T> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    const size = collection.size,
        indexToRetrieve = index < 0 ? size + index : index
    if (indexToRetrieve > size)
        return null
    if (indexToRetrieve < 0)
        return null
    return collection.get(indexToRetrieve,)
}
