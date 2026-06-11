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

import type {CollectionHolder}                                                                                                                                                                                                                                                                                             from "../CollectionHolder"
import type {HasAtMost2ElementsOn, HasAtMost2ElementsOnArray, HasAtMost2ElementsOnCollectionHolder, HasAtMost2ElementsOnMinimalistCollectionHolder, HasAtMost2ElementsOnNullable, HasAtMost2ElementsOnNullableArray, HasAtMost2ElementsOnNullableCollectionHolder, HasAtMost2ElementsOnNullableMinimalistCollectionHolder} from "../type/hasAtMost2Elements"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                                                   from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

/**
 * The {@link collection} has exactly 0, 1 or 2 values
 *
 * @param collection The collection {@link CollectionHolder collection}
 * @extensionFunction
 */
export function hasAtMost2Elements<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): HasAtMost2ElementsOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 0, 1 or 2 values
 *
 * @param collection The collection {@link MinimalistCollectionHolder collection}
 * @extensionFunction
 */
export function hasAtMost2Elements<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION,): HasAtMost2ElementsOnMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 0, 1 or 2 values
 *
 * @param collection The {@link ReadonlyArray collection}
 * @extensionFunction
 */
export function hasAtMost2Elements<const T, const COLLECTION extends Array<T> = Array<T>, >(collection: COLLECTION,): HasAtMost2ElementsOnArray<COLLECTION>
/**
 * The {@link collection} has exactly 0, 1 or 2 values
 *
 * @param collection The collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @extensionFunction
 */
export function hasAtMost2Elements<const T, const COLLECTION extends | MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T> = | MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>, >(collection: COLLECTION,): HasAtMost2ElementsOn<COLLECTION>
/**
 * The {@link collection} has exactly 0, 1 or 2 values
 *
 * @param collection The nullable collection
 * @extensionFunction
 */
export function hasAtMost2Elements<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): HasAtMost2ElementsOnNullableCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 0, 1 or 2 values
 *
 * @param collection The nullable collection
 * @extensionFunction
 */
export function hasAtMost2Elements<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION,): HasAtMost2ElementsOnNullableMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 0, 1 or 2 values
 *
 * @param collection The nullable collection
 * @extensionFunction
 */
export function hasAtMost2Elements<const T, const COLLECTION extends Nullable<Array<T>> = Nullable<Array<T>>, >(collection: COLLECTION,): HasAtMost2ElementsOnNullableArray<COLLECTION>
/**
 * The {@link collection} has exactly 0, 1 or 2 values
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @extensionFunction
 */
export function hasAtMost2Elements<const T, const COLLECTION extends Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>> = Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>, >(collection: COLLECTION,): HasAtMost2ElementsOnNullable<COLLECTION>
export function hasAtMost2Elements<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>,) {
    if (collection == null)
        return true
    if (isCollectionHolder(collection,))
        return hasAtMost2ElementsByCollectionHolder(collection,)
    if (isArray(collection,))
        return hasAtMost2ElementsByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return hasAtMost2ElementsByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasAtMost2ElementsByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return hasAtMost2ElementsByArray(collection,)
    return hasAtMost2ElementsByMinimalistCollectionHolder(collection,)
}


/**
 * The {@link collection} has exactly 0, 1 or 2 values
 *
 * @param collection The nullable collection
 * @extensionFunction
 */
export function hasAtMost2ElementsByMinimalistCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): HasAtMost2ElementsOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 0, 1 or 2 values
 *
 * @param collection The nullable collection
 * @extensionFunction
 */
export function hasAtMost2ElementsByMinimalistCollectionHolder<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): HasAtMost2ElementsOnNullableCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 0, 1 or 2 values
 *
 * @param collection The nullable collection
 * @extensionFunction
 */
export function hasAtMost2ElementsByMinimalistCollectionHolder<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION,): HasAtMost2ElementsOnMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 0, 1 or 2 values
 *
 * @param collection The nullable collection
 * @extensionFunction
 */
export function hasAtMost2ElementsByMinimalistCollectionHolder<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION,): HasAtMost2ElementsOnNullableMinimalistCollectionHolder<COLLECTION>
export function hasAtMost2ElementsByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,) {
    if (collection == null)
        return true

    const size = collection.size
    return size === 0 || size === 1 || size === 2
}

/**
 * The {@link collection} has exactly 0, 1 or 2 values
 *
 * @param collection The {@link CollectionHolder collection}
 * @extensionFunction
 */
export function hasAtMost2ElementsByCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): HasAtMost2ElementsOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 0, 1 or 2 values
 *
 * @param collection The nullable collection
 * @extensionFunction
 */
export function hasAtMost2ElementsByCollectionHolder<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): HasAtMost2ElementsOnNullableCollectionHolder<COLLECTION>
export function hasAtMost2ElementsByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,) {
    if (collection == null)
        return true
    return collection.isEmpty || collection.hasExactly1Element || collection.hasExactly2Elements
}

/**
 * The {@link collection} has exactly 0, 1 or 2 values
 *
 * @param collection The {@link ReadonlyArray collection}
 * @extensionFunction
 */
export function hasAtMost2ElementsByArray<const T, const COLLECTION extends Array<T> = Array<T>, >(collection: COLLECTION,): HasAtMost2ElementsOnArray<COLLECTION>
/**
 * The {@link collection} has exactly 0, 1 or 2 values
 *
 * @param collection The nullable collection
 * @extensionFunction
 */
export function hasAtMost2ElementsByArray<const T, const COLLECTION extends Nullable<Array<T>> = Nullable<Array<T>>, >(collection: COLLECTION,): HasAtMost2ElementsOnNullableArray<COLLECTION>
export function hasAtMost2ElementsByArray<const T, >(collection: Nullable<Array<T>>,) {
    if (collection == null)
        return true

    const size = collection.length
    return size === 0 || size === 1 || size === 2
}
