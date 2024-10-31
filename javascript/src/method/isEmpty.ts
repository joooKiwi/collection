/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

/**
 * The collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) has no values
 *
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 */
export function isEmpty<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["size"] extends 0 ? true : COLLECTION["size"] extends number ? boolean : false
/**
 * The {@link ReadonlyArray collection} has no values
 *
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 */
export function isEmpty<const T, const COLLECTION extends readonly T[] = readonly T[], >(collection: Nullable<COLLECTION>,): COLLECTION["length"] extends 0 ? true : COLLECTION["length"] extends number ? boolean : false
export function isEmpty<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>,) {
    if (collection == null)
        return true
    if (isCollectionHolder<T>(collection,))
        return isEmptyByCollectionHolder(collection,)
    if (isArray(collection,))
        return isEmptyByArray(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return isEmptyByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return isEmptyByArray(collection,)
    return isEmptyByMinimalistCollectionHolder(collection,)
}


/**
 * The {@link MinimalistCollectionHolder collection} has no values
 *
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 */
export function isEmptyByMinimalistCollectionHolder<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["size"] extends 0 ? true : COLLECTION["size"] extends number ? boolean : false
export function isEmptyByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,) {
    if (collection == null)
        return true
    return collection.size == 0
}

/**
 * The {@link CollectionHolder collection} has no values
 *
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 */
export function isEmptyByCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["size"] extends 0 ? true : COLLECTION["size"] extends number ? boolean : false
export function isEmptyByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,) {
    if (collection == null)
        return true
    return collection.size == 0
}

/**
 * The {@link ReadonlyArray collection} has no values
 *
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
 */
export function isEmptyByArray<const T, const COLLECTION extends readonly T[] = readonly T[], >(collection: Nullable<COLLECTION>,): COLLECTION["length"] extends 0 ? true : COLLECTION["length"] extends number ? boolean : false
export function isEmptyByArray<const T, >(collection: Nullable<readonly T[]>,) {
    if (collection == null)
        return true
    return collection.length == 0
}
