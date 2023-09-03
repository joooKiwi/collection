/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {Nullable}         from "../general type"

import {CollectionConstants} from "../CollectionConstants"

/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @throws {TypeError} There is <b>null</b> or <b>undefined</b> value in the current collection
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: Nullable<CollectionHolder<T>>,): CollectionHolder<NonNullable<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    if (collection.hasNull)
        throw new TypeError("The current collection contains null values.",)
    return collection as CollectionHolder<NonNullable<T>>
}
