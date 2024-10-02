/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade methods --------------------

/**
 * Get the element at the specified index in the {@link collection}
 * or <b>null</b> if it is over the {@link size}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param index      The index to retrieve a value
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function getOrNull<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, index: number,): NullOr<T> {
    if (collection == null)
        return null
    if (isCollectionHolder<T>(collection,))
        return getOrNullByCollectionHolder(collection, index,)
    if (isArray(collection,))
        return getOrNullByArray(collection, index,)
    if (isCollectionHolderByStructure<T>(collection,))
        return getOrNullByCollectionHolder(collection, index,)
    if (isArrayByStructure<T>(collection,))
        return getOrNullByArray(collection, index,)
    return getOrNullByMinimalistCollectionHolder(collection, index,)
}


/**
 * Get the element at the specified index in the {@link collection}
 * or <b>null</b> if it is over the {@link size}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param index      The index to retrieve a value
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function getOrNullByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, index: number,): NullOr<T> {
    if (collection == null)
        return null
    if (Number.isNaN(index,))
        return null
    if (index == Number.NEGATIVE_INFINITY)
        return null
    if (index == Number.POSITIVE_INFINITY)
        return null

    const size = collection.size
    if (size == 0)
        return null
    if (index >= size)
        return null
    if (index >= 0)
        return collection.get(index,)

    const indexToRetrieve = index + size
    if (indexToRetrieve < 0)
        return null
    if (indexToRetrieve > size)
        return null
    return collection.get(indexToRetrieve,)

}

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
export function getOrNullByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, index: number,): NullOr<T> {
    if (collection == null)
        return null
    if (Number.isNaN(index,))
        return null
    if (index == Number.NEGATIVE_INFINITY)
        return null
    if (index == Number.POSITIVE_INFINITY)
        return null
    if (collection.isEmpty)
        return null

    const size = collection.size
    if (index >= size)
        return null
    if (index >= 0)
        return collection.get(index,)

    const indexToRetrieve = index + size
    if (indexToRetrieve < 0)
        return null
    if (indexToRetrieve > size)
        return null
    return collection.get(indexToRetrieve,)

}

/**
 * Get the element at the specified index in the {@link collection}
 * or <b>null</b> if it is over the {@link size}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param index      The index to retrieve a value
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function getOrNullByArray<const T, >(collection: Nullable<readonly T[]>, index: number,): NullOr<T> {
    if (collection == null)
        return null
    if (Number.isNaN(index,))
        return null
    if (index == Number.NEGATIVE_INFINITY)
        return null
    if (index == Number.POSITIVE_INFINITY)
        return null

    const size = collection.length
    if (size == 0)
        return null
    if (index >= size)
        return null
    if (index >= 0)
        return collection[index] as T

    const indexToRetrieve = index + size
    if (indexToRetrieve < 0)
        return null
    return collection[indexToRetrieve] as T
}

//#endregion -------------------- Facade methods --------------------
