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
import type {HasExactly1ElementOn, HasExactly1ElementOnArray, HasExactly1ElementOnCollectionHolder, HasExactly1ElementOnMinimalistCollectionHolder, HasExactly1ElementOnNullable, HasExactly1ElementOnNullableArray, HasExactly1ElementOnNullableCollectionHolder, HasExactly1ElementOnNullableMinimalistCollectionHolder} from "../type/hasExactly1Element"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                                                   from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

/**
 * The {@link collection} has exactly 1 element
 *
 * @param collection The {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly1Element<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): HasExactly1ElementOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 1 element
 *
 * @param collection The {@link MinimalistCollectionHolder collection} to compare its {@link MinimalistCollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly1Element<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION,): HasExactly1ElementOnMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 1 element
 *
 * @param collection The {@link ReadonlyArray collection} to compare its {@link ReadonlyArray.length size}
 * @extensionFunction
 */
export function hasExactly1Element<const T, const COLLECTION extends Array<T> = Array<T>, >(collection: COLLECTION,): HasExactly1ElementOnArray<COLLECTION>
/**
 * The {@link collection} has exactly 1 element
 *
 * @param collection The collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) to compare its `size`
 * @extensionFunction
 */
export function hasExactly1Element<const T, const COLLECTION extends | MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T> = | MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>, >(collection: COLLECTION,): HasExactly1ElementOn<COLLECTION>
/**
 * The {@link collection} has exactly 1 element
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly1Element<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): HasExactly1ElementOnNullableCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 1 element
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to compare its {@link MinimalistCollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly1Element<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION,): HasExactly1ElementOnNullableMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 1 element
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection} to compare its {@link ReadonlyArray.length size}
 * @extensionFunction
 */
export function hasExactly1Element<const T, const COLLECTION extends Nullable<Array<T>> = Nullable<Array<T>>, >(collection: COLLECTION,): HasExactly1ElementOnNullableArray<COLLECTION>
/**
 * The {@link collection} has exactly 1 element
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) to compare its `size`
 * @extensionFunction
 */
export function hasExactly1Element<const T, const COLLECTION extends Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>> = Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>, >(collection: COLLECTION,): HasExactly1ElementOnNullable<COLLECTION>
export function hasExactly1Element<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>,) {
    if (collection == null)
        return false
    if (isCollectionHolder(collection,))
        return hasExactly1ElementByCollectionHolder(collection,)
    if (isArray(collection,))
        return hasExactly1ElementByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return hasExactly1ElementByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasExactly1ElementByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return hasExactly1ElementByArray(collection,)
    return hasExactly1ElementByMinimalistCollectionHolder(collection,)
}


/**
 * The {@link collection} has exactly 1 element
 *
 * @param collection The {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly1ElementByMinimalistCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): HasExactly1ElementOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 1 element
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly1ElementByMinimalistCollectionHolder<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): HasExactly1ElementOnNullableCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 1 element
 *
 * @param collection The {@link MinimalistCollectionHolder collection} to compare its {@link MinimalistCollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly1ElementByMinimalistCollectionHolder<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION,): HasExactly1ElementOnMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 1 element
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to compare its {@link MinimalistCollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly1ElementByMinimalistCollectionHolder<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION,): HasExactly1ElementOnNullableMinimalistCollectionHolder<COLLECTION>
export function hasExactly1ElementByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,) {
    if (collection == null)
        return false
    return collection.size === 1
}

/**
 * The {@link collection} has exactly 1 element
 *
 * @param collection The {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly1ElementByCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): HasExactly1ElementOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 1 element
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasExactly1ElementByCollectionHolder<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): HasExactly1ElementOnNullableCollectionHolder<COLLECTION>
export function hasExactly1ElementByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,) {
    if (collection == null)
        return false
    return collection.size === 1
}

/**
 * The {@link collection} has exactly 1 element
 *
 * @param collection The {@link ReadonlyArray collection} to compare its {@link ReadonlyArray.length size}
 * @extensionFunction
 */
export function hasExactly1ElementByArray<const T, const COLLECTION extends Array<T> = Array<T>, >(collection: COLLECTION,): HasExactly1ElementOnArray<COLLECTION>
/**
 * The {@link collection} has exactly 1 element
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection} to compare its {@link ReadonlyArray.length size}
 * @extensionFunction
 */
export function hasExactly1ElementByArray<const T, const COLLECTION extends Nullable<Array<T>> = Nullable<Array<T>>, >(collection: COLLECTION,): HasExactly1ElementOnNullableArray<COLLECTION>
export function hasExactly1ElementByArray<const T, >(collection: Nullable<Array<T>>,) {
    if (collection == null)
        return false
    return collection.length === 1
}
