/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {CollectionHolder}           from "../CollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

/**
 * The {@link CollectionHolder collection} has at least one value
 *
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 */
export function isNotEmpty<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["isEmpty"] extends true ? false : COLLECTION["isEmpty"] extends boolean ? boolean : false
/**
 * The collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) has at least one value
 *
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 */
export function isNotEmpty<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["size"] extends 0 ? false : COLLECTION["size"] extends number ? boolean : true
/**
 * The {@link ReadonlyArray collection} has at least one value
 *
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 */
export function isNotEmpty<const T, const COLLECTION extends readonly T[] = readonly T[], >(collection: Nullable<COLLECTION>,): COLLECTION["length"] extends 0 ? false : COLLECTION["length"] extends number ? boolean : true
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
 * The {@link MinimalistCollectionHolder collection} has at least one value
 *
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 */
export function isNotEmptyByMinimalistCollectionHolder<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["size"] extends 0 ? false : COLLECTION["size"] extends number ? boolean : true
export function isNotEmptyByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,) {
    if (collection == null)
        return false
    return collection.size != 0
}

/**
 * The {@link CollectionHolder collection} has at least one value
 *
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 */
export function isNotEmptyByCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["isEmpty"] extends true ? false : COLLECTION["isEmpty"] extends boolean ? boolean : false
export function isNotEmptyByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,) {
    if (collection == null)
        return false
    return collection.size != 0
}

/**
 * The {@link ReadonlyArray collection} has at least one value
 *
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 */
export function isNotEmptyByArray<const T, const COLLECTION extends readonly T[] = readonly T[], >(collection: Nullable<COLLECTION>,): COLLECTION["length"] extends 0 ? false : COLLECTION["length"] extends number ? boolean : true
export function isNotEmptyByArray<const T, >(collection: Nullable<readonly T[]>,) {
    if (collection == null)
        return false
    return collection.length != 0
}
