/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants} from "../CollectionConstants"

/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @return {CollectionHolder<NonNullable<T>>} The {@link collection} or an {@link EmptyCollectionHolder}
 *                                            if it is <b>null</b> or empty
 * @throws {TypeError} There is <b>null</b> or <b>undefined</b> value in the current collection
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: Nullable<CollectionHolder<T>>,): CollectionHolder<NonNullable<T>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @return {CollectionHolder<NonNullable<T>>} The {@link collection} or an {@link EmptyCollectionHolder}
 *                                            if it is <b>null</b> or empty
 * @throws {TypeError} There is <b>null</b> or <b>undefined</b> value in the current collection
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): MinimalistCollectionHolder<NonNullable<T>>
export function requireNoNulls<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    let index = -1
    while (++index < size)
        if (collection.get(index) == null)
            throw new TypeError("Forbidden null value. The current collection contains null values.",)

    return collection
}

/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @return {CollectionHolder<NonNullable<T>>} The {@link collection} or an {@link EmptyCollectionHolder}
 *                                            if it is <b>null</b> or empty
 * @throws {TypeError} There is <b>null</b> or <b>undefined</b> value in the current collection
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): CollectionHolder<NonNullable<T>>
export function requireNoNullsByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.hasNull)
        throw new TypeError("Forbidden null value. The current collection contains null values.",)
    return collection
}
