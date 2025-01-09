//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @return {CollectionHolder} The {@link collection} or an {@link EmptyCollectionHolder} if it is <b>null</b> or empty
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection} or it is <b>null</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: Nullable<CollectionHolder<T>>,): CollectionHolder<NonNullable<T>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @return {CollectionHolder} The {@link collection} or an {@link EmptyCollectionHolder} if it is <b>null</b> or empty
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection} or it is <b>null</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): MinimalistCollectionHolder<NonNullable<T>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @return {CollectionHolder} The {@link collection} or an {@link CollectionConstants.EMPTY_ARRAY empty array} if it is empty
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection} or it is <b>null</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNulls<const T, >(collection: Nullable<readonly T[]>,): readonly NonNullable<T>[]
export function requireNoNulls<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>,) {
    if (collection == null)
        throw new TypeError("Forbidden null value. The current collection cannot be null.",)
    if (isCollectionHolder<T>(collection,))
        return requireNoNullsByCollectionHolder(collection,)
    if (isArray(collection,))
        return requireNoNullsByArray(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return requireNoNullsByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return requireNoNullsByArray(collection,)
    return requireNoNullsByMinimalistCollectionHolder(collection,)
}


/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @return {CollectionHolder} The {@link collection} or an {@link EmptyCollectionHolder} if it is <b>null</b> or empty
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection} or it is <b>null</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByMinimalistCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): CollectionHolder<NonNullable<T>>
/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @return {CollectionHolder} The {@link collection} or an {@link EmptyCollectionHolder} if it is <b>null</b> or empty
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection} or it is <b>null</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): MinimalistCollectionHolder<NonNullable<T>>
export function requireNoNullsByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,) {
    if (collection == null)
        throw new TypeError("Forbidden null value. The current collection cannot be null.",)

    const size = collection.size
    if (size == 0)
        return collection

    let index = -1
    while (++index < size)
        if (collection.get(index,) == null)
            throw new TypeError("Forbidden null value. The current collection contains null values.",)
    return collection
}

/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @return {CollectionHolder} The {@link collection} or an {@link EmptyCollectionHolder} if it is <b>null</b> or empty
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection} or it is <b>null</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): CollectionHolder<NonNullable<T>>
export function requireNoNullsByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,) {
    if (collection == null)
        throw new TypeError("Forbidden null value. The current collection cannot be null.",)
    if (collection.isEmpty)
        return collection
    if (collection.hasNull)
        throw new TypeError("Forbidden null value. The current collection contains null values.",)
    return collection
}

/**
 * Require that no items are <b>null</b> or <b>undefined</b> in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @return {CollectionHolder} The {@link collection} or an {@link CollectionConstants.EMPTY_ARRAY empty array}{@link EmptyCollectionHolder} if it is <b>null</b> or empty
 * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the {@link collection} or it is <b>null</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
 * @see filterNotNull
 * @extensionFunction
 */
export function requireNoNullsByArray<const T, >(collection: Nullable<readonly T[]>,): readonly NonNullable<T>[]
export function requireNoNullsByArray<const T, >(collection: Nullable<readonly T[]>,) {
    if (collection == null)
        throw new TypeError("Forbidden null value. The current collection cannot be null.",)

    const size = collection.length
    if (size == 0)
        return collection

    let index = -1
    while (++index < size)
        if (collection[index] == null)
            throw new TypeError("Forbidden null value. The current collection contains null values.",)
    return collection
}
