//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Array, Nullable} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                                                                     from "../CollectionHolder"
import type {HasExactly2ElementsOn, HasExactly2ElementsOnArray, HasExactly2ElementsOnCollectionHolder, HasExactly2ElementsOnMinimalistCollectionHolder, HasExactly2ElementsOnNullable, HasExactly2ElementsOnNullableArray, HasExactly2ElementsOnNullableCollectionHolder, HasExactly2ElementsOnNullableMinimalistCollectionHolder} from "../type/hasExactly2Elements"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                                                           from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

/**
 * The {@link collection} has exactly 2 elements
 *
 * @param collection The {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly2Elements<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): HasExactly2ElementsOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 2 elements
 *
 * @param collection The {@link MinimalistCollectionHolder collection} to compare its {@link MinimalistCollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly2Elements<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION,): HasExactly2ElementsOnMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 2 elements
 *
 * @param collection The {@link ReadonlyArray collection} to compare its {@link ReadonlyArray.length size}
 * @extensionFunction
 */
export function hasExactly2Elements<const T, const COLLECTION extends Array<T> = Array<T>, >(collection: COLLECTION,): HasExactly2ElementsOnArray<COLLECTION>
/**
 * The {@link collection} has exactly 2 elements
 *
 * @param collection The collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) to compare its `size`
 * @extensionFunction
 */
export function hasExactly2Elements<const T, const COLLECTION extends | MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T> = | MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>, >(collection: COLLECTION,): HasExactly2ElementsOn<COLLECTION>
/**
 * The {@link collection} has exactly 2 elements
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly2Elements<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): HasExactly2ElementsOnNullableCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 2 elements
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to compare its {@link MinimalistCollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly2Elements<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION,): HasExactly2ElementsOnNullableMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 2 elements
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection} to compare its {@link ReadonlyArray.length size}
 * @extensionFunction
 */
export function hasExactly2Elements<const T, const COLLECTION extends Nullable<Array<T>> = Nullable<Array<T>>, >(collection: COLLECTION,): HasExactly2ElementsOnNullableArray<COLLECTION>
/**
 * The {@link collection} has exactly 2 elements
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) to compare its `size`
 * @extensionFunction
 */
export function hasExactly2Elements<const T, const COLLECTION extends Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>> = Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>, >(collection: COLLECTION,): HasExactly2ElementsOnNullable<COLLECTION>
export function hasExactly2Elements<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>,) {
    if (collection == null)
        return false
    if (isCollectionHolder(collection,))
        return hasExactly2ElementsByCollectionHolder(collection,)
    if (isArray(collection,))
        return hasExactly2ElementsByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return hasExactly2ElementsByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasExactly2ElementsByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return hasExactly2ElementsByArray(collection,)
    return hasExactly2ElementsByMinimalistCollectionHolder(collection,)
}


/**
 * The {@link collection} has exactly 2 elements
 *
 * @param collection The {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly2ElementsByMinimalistCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): HasExactly2ElementsOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 2 elements
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly2ElementsByMinimalistCollectionHolder<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): HasExactly2ElementsOnNullableCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 2 elements
 *
 * @param collection The {@link MinimalistCollectionHolder collection} to compare its {@link MinimalistCollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly2ElementsByMinimalistCollectionHolder<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION,): HasExactly2ElementsOnMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 2 elements
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to compare its {@link MinimalistCollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly2ElementsByMinimalistCollectionHolder<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION,): HasExactly2ElementsOnNullableMinimalistCollectionHolder<COLLECTION>
export function hasExactly2ElementsByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,) {
    if (collection == null)
        return false
    return collection.size === 2
}

/**
 * The {@link collection} has exactly 2 elements
 *
 * @param collection The {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly2ElementsByCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): HasExactly2ElementsOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 2 elements
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly2ElementsByCollectionHolder<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): HasExactly2ElementsOnNullableCollectionHolder<COLLECTION>
export function hasExactly2ElementsByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,) {
    if (collection == null)
        return false
    return collection.size === 2
}

/**
 * The {@link collection} has exactly 2 elements
 *
 * @param collection The {@link ReadonlyArray collection} to compare its {@link ReadonlyArray.length size}
 * @extensionFunction
 */
export function hasExactly2ElementsByArray<const T, const COLLECTION extends Array<T> = Array<T>, >(collection: COLLECTION,): HasExactly2ElementsOnArray<COLLECTION>
/**
 * The {@link collection} has exactly 2 elements
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection} to compare its {@link ReadonlyArray.length size}
 * @extensionFunction
 */
export function hasExactly2ElementsByArray<const T, const COLLECTION extends Nullable<Array<T>> = Nullable<Array<T>>, >(collection: COLLECTION,): HasExactly2ElementsOnNullableArray<COLLECTION>
export function hasExactly2ElementsByArray<const T, >(collection: Nullable<Array<T>>,) {
    if (collection == null)
        return false
    return collection.length === 2
}
