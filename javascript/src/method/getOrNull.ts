/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr} from "@joookiwi/type"

import type {CollectionHolder} from "../CollectionHolder"

import {isCollectionHolder}                                 from "./isCollectionHolder"
import {getOrNull as getOrNullByCollectionHolder}           from "./collectionHolder/getOrNull"
import {getOrNull as getOrNullByMinimalistCollectionHolder} from "./minimalistCollectionHolder/getOrNull"

/**
 * Get the element at the specified index in the {@link collection}
 * or <b>null</b> if it is over the {@link size}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param index      The index to retrieve a value
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function getOrNull<const T, >(collection: Nullable<CollectionHolder<T>>, index: number,): NullOr<T> {
    if (collection == null)
        return null
    if (isCollectionHolder<T>(collection,))
        return getOrNullByCollectionHolder(collection, index,)
    return getOrNullByMinimalistCollectionHolder(collection, index,)
}
