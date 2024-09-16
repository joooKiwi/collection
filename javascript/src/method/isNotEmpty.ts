/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {CollectionHolder}           from "../CollectionHolder"

import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

/**
 * The collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) has at least one value
 *
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/is-not-empty.html Kotlin isNotEmpty()
 */
export function isNotEmpty<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["size"] extends 0 ? false : COLLECTION["size"] extends number ? boolean : true
export function isNotEmpty<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,) {
    if (collection == null)
        return false
    if (isCollectionHolder(collection,))
        return isNotEmptyByCollectionHolder(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return isNotEmptyByCollectionHolder(collection,)
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
export function isNotEmptyByCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["size"] extends 0 ? false : COLLECTION["size"] extends number ? boolean : true
export function isNotEmptyByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,) {
    if (collection == null)
        return false
    return collection.size != 0
}
