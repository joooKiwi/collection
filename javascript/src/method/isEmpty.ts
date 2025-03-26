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

import type {CollectionHolder}                                                                                                                                                                                                     from "../CollectionHolder"
import type {IsEmptyOn, IsEmptyOnArray, IsEmptyOnCollectionHolder, IsEmptyOnMinimalistCollectionHolder, IsEmptyOnNullable, IsEmptyOnNullableArray, IsEmptyOnNullableCollectionHolder, IsEmptyOnNullableMinimalistCollectionHolder} from "../type/isEmpty"
import type {MinimalistCollectionHolder}                                                                                                                                                                                           from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

/**
 * The {@link collection} has no values
 *
 * @param collection The collection {@link CollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 * @extensionFunction
 */
export function isEmpty<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): IsEmptyOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has no values
 *
 * @param collection The collection {@link MinimalistCollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 * @extensionFunction
 */
export function isEmpty<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION,): IsEmptyOnMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has no values
 *
 * @param collection The {@link ReadonlyArray collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 * @extensionFunction
 */
export function isEmpty<const T, const COLLECTION extends readonly T[] = readonly T[], >(collection: COLLECTION,): IsEmptyOnArray<COLLECTION>
/**
 * The {@link collection} has no values
 *
 * @param collection The collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 * @extensionFunction
 */
export function isEmpty<const T, const COLLECTION extends | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[] = | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[], >(collection: COLLECTION,): IsEmptyOn<COLLECTION>
/**
 * The {@link collection} has no values
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 * @extensionFunction
 */
export function isEmpty<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): IsEmptyOnNullableCollectionHolder<COLLECTION>
/**
 * The {@link collection} has no values
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 * @extensionFunction
 */
export function isEmpty<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION,): IsEmptyOnNullableMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has no values
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 * @extensionFunction
 */
export function isEmpty<const T, const COLLECTION extends Nullable<readonly T[]> = Nullable<readonly T[]>, >(collection: COLLECTION,): IsEmptyOnNullableArray<COLLECTION>
/**
 * The {@link collection} has no values
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 * @extensionFunction
 */
export function isEmpty<const T, const COLLECTION extends Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]> = Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, >(collection: COLLECTION,): IsEmptyOnNullable<COLLECTION>
export function isEmpty<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,) {
    if (collection == null)
        return true
    if (isCollectionHolder(collection,))
        return isEmptyByCollectionHolder(collection,)
    if (isArray(collection,))
        return isEmptyByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return isEmptyByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return isEmptyByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return isEmptyByArray(collection,)
    return isEmptyByMinimalistCollectionHolder(collection,)
}


/**
 * The {@link collection} has no values
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 * @extensionFunction
 */
export function isEmptyByMinimalistCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): IsEmptyOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has no values
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 * @extensionFunction
 */
export function isEmptyByMinimalistCollectionHolder<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): IsEmptyOnNullableCollectionHolder<COLLECTION>
/**
 * The {@link collection} has no values
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 * @extensionFunction
 */
export function isEmptyByMinimalistCollectionHolder<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION,): IsEmptyOnMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has no values
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 * @extensionFunction
 */
export function isEmptyByMinimalistCollectionHolder<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION,): IsEmptyOnNullableMinimalistCollectionHolder<COLLECTION>
export function isEmptyByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,) {
    if (collection == null)
        return true
    return collection.size == 0
}

/**
 * The {@link collection} has no values
 *
 * @param collection The {@link CollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 * @extensionFunction
 */
export function isEmptyByCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): IsEmptyOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has no values
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 * @extensionFunction
 */
export function isEmptyByCollectionHolder<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): IsEmptyOnNullableCollectionHolder<COLLECTION>
export function isEmptyByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,) {
    if (collection == null)
        return true
    return collection.size == 0
}

/**
 * The {@link collection} has no values
 *
 * @param collection The {@link ReadonlyArray collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 * @extensionFunction
 */
export function isEmptyByArray<const T, const COLLECTION extends readonly T[] = readonly T[], >(collection: COLLECTION,): IsEmptyOnArray<COLLECTION>
/**
 * The {@link collection} has no values
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 * @extensionFunction
 */
export function isEmptyByArray<const T, const COLLECTION extends Nullable<readonly T[]> = Nullable<readonly T[]>, >(collection: COLLECTION,): IsEmptyOnNullableArray<COLLECTION>
export function isEmptyByArray<const T, >(collection: Nullable<readonly T[]>,) {
    if (collection == null)
        return true
    return collection.length == 0
}
