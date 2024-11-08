/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                             from "../CollectionHolder"
import type {IsNotEmptyOn, IsNotEmptyOnArray, IsNotEmptyOnCollectionHolder, IsNotEmptyOnMinimalistCollectionHolder, IsNotEmptyOnNullable, IsNotEmptyOnNullableArray, IsNotEmptyOnNullableCollectionHolder, IsNotEmptyOnNullableMinimalistCollectionHolder} from "../type/isNotEmpty"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                   from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

/**
 * The {@link collection} has at least one value
 *
 * @param collection The {@link MinimalistCollectionHolder}, {@link CollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 * @extensionFunction
 */
export function isNotEmpty<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): IsNotEmptyOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has at least one value
 *
 * @param collection The {@link MinimalistCollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 * @extensionFunction
 */
export function isNotEmpty<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION,): IsNotEmptyOnMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has at least one value
 *
 * @param collection The {@link ReadonlyArray collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 * @extensionFunction
 */
export function isNotEmpty<const T, const COLLECTION extends readonly T[] = readonly T[], >(collection: COLLECTION,): IsNotEmptyOnArray<COLLECTION>
/**
 * The {@link collection} has at least one value
 *
 * @param collection The collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 * @extensionFunction
 */
export function isNotEmpty<const T, const COLLECTION extends | MinimalistCollectionHolder<T> | readonly T[] = | MinimalistCollectionHolder<T> | readonly T[], >(collection: COLLECTION,): IsNotEmptyOn<COLLECTION>
/**
 * The {@link collection} has at least one value
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 * @extensionFunction
 */
export function isNotEmpty<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): IsNotEmptyOnNullableCollectionHolder<COLLECTION>
/**
 * The {@link collection} has at least one value
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 * @extensionFunction
 */
export function isNotEmpty<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION,): IsNotEmptyOnNullableMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has at least one value
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 * @extensionFunction
 */
export function isNotEmpty<const T, const COLLECTION extends Nullable<readonly T[]> = Nullable<readonly T[]>, >(collection: COLLECTION,): IsNotEmptyOnNullableArray<COLLECTION>
/**
 * The {@link collection} has at least one value
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 * @extensionFunction
 */
export function isNotEmpty<const T, const COLLECTION extends Nullable<| MinimalistCollectionHolder<T> | readonly T[]> = Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, >(collection: COLLECTION,): IsNotEmptyOnNullable<COLLECTION>
export function isNotEmpty<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>,) {
    if (collection == null)
        return false
    if (isCollectionHolder<T>(collection,))
        return isNotEmptyByCollectionHolder(collection,)
    if (isArray(collection,))
        return isNotEmptyByArray(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return isNotEmptyByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return isNotEmptyByArray(collection,)
    return isNotEmptyByMinimalistCollectionHolder(collection,)
}


/**
 * The {@link collection} has at least one value
 *
 * @param collection The {@link CollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 * @extensionFunction
 */
export function isNotEmptyByMinimalistCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): IsNotEmptyOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has at least one value
 *
 * @param collection The {@link MinimalistCollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 * @extensionFunction
 */
export function isNotEmptyByMinimalistCollectionHolder<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION,): IsNotEmptyOnMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has at least one value
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 * @extensionFunction
 */
export function isNotEmptyByMinimalistCollectionHolder<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): IsNotEmptyOnNullableCollectionHolder<COLLECTION>
/**
 * The {@link collection} has at least one value
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 * @extensionFunction
 */
export function isNotEmptyByMinimalistCollectionHolder<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION,): IsNotEmptyOnNullableMinimalistCollectionHolder<COLLECTION>
export function isNotEmptyByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,) {
    if (collection == null)
        return false
    return collection.size != 0
}

/**
 * The {@link collection} has at least one value
 *
 * @param collection The {@link CollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 * @extensionFunction
 */
export function isNotEmptyByCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): IsNotEmptyOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has at least one value
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 * @extensionFunction
 */
export function isNotEmptyByCollectionHolder<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): IsNotEmptyOnNullableCollectionHolder<COLLECTION>
export function isNotEmptyByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,) {
    if (collection == null)
        return false
    return !collection.isEmpty
}

/**
 * The {@link collection} has at least one value
 *
 * @param collection The {@link ReadonlyArray collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 * @extensionFunction
 */
export function isNotEmptyByArray<const T, const COLLECTION extends readonly T[] = readonly T[], >(collection: COLLECTION,): IsNotEmptyOnArray<COLLECTION>
/**
 * The {@link collection} has at least one value
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 * @extensionFunction
 */
export function isNotEmptyByArray<const T, const COLLECTION extends Nullable<readonly T[]> = Nullable<readonly T[]>, >(collection: COLLECTION,): IsNotEmptyOnNullableArray<COLLECTION>
export function isNotEmptyByArray<const T, >(collection: Nullable<readonly T[]>,) {
    if (collection == null)
        return false
    return collection.length != 0
}

