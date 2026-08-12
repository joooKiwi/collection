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
import type {HasAtMost1ElementOn, HasAtMost1ElementOnArray, HasAtMost1ElementOnCollectionHolder, HasAtMost1ElementOnMinimalistCollectionHolder, HasAtMost1ElementOnNullable, HasAtMost1ElementOnNullableArray, HasAtMost1ElementOnNullableCollectionHolder, HasAtMost1ElementOnNullableMinimalistCollectionHolder} from "../type/hasAtMost1Element"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                                                   from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

/**
 * The {@link collection} has exactly 0 or 1 value
 *
 * @param collection The {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasAtMost1Element<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): HasAtMost1ElementOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 0 or 1 value
 *
 * @param collection The {@link MinimalistCollectionHolder collection} to compare its {@link MinimalistCollectionHolder.size size}
 * @extensionFunction
 */
export function hasAtMost1Element<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION,): HasAtMost1ElementOnMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 0 or 1 value
 *
 * @param collection The {@link ReadonlyArray collection} to compare its {@link ReadonlyArray.length size}
 * @extensionFunction
 */
export function hasAtMost1Element<const T, const COLLECTION extends Array<T> = Array<T>, >(collection: COLLECTION,): HasAtMost1ElementOnArray<COLLECTION>
/**
 * The {@link collection} has exactly 0 or 1 value
 *
 * @param collection The collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) to compare its `size`
 * @extensionFunction
 */
export function hasAtMost1Element<const T, const COLLECTION extends | MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T> = | MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>, >(collection: COLLECTION,): HasAtMost1ElementOn<COLLECTION>
/**
 * The {@link collection} has exactly 0 or 1 value
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasAtMost1Element<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): HasAtMost1ElementOnNullableCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 0 or 1 value
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to compare its {@link MinimalistCollectionHolder.size size}
 * @extensionFunction
 */
export function hasAtMost1Element<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION,): HasAtMost1ElementOnNullableMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 0 or 1 value
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection} to compare its {@link ReadonlyArray.length size}
 * @extensionFunction
 */
export function hasAtMost1Element<const T, const COLLECTION extends Nullable<Array<T>> = Nullable<Array<T>>, >(collection: COLLECTION,): HasAtMost1ElementOnNullableArray<COLLECTION>
/**
 * The {@link collection} has exactly 0 or 1 value
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) to compare its `size`
 * @extensionFunction
 */
export function hasAtMost1Element<const T, const COLLECTION extends Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>> = Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>, >(collection: COLLECTION,): HasAtMost1ElementOnNullable<COLLECTION>
export function hasAtMost1Element<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>,) {
    if (collection == null)
        return true
    if (isCollectionHolder(collection,))
        return hasAtMost1ElementByCollectionHolder(collection,)
    if (isArray(collection,))
        return hasAtMost1ElementByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return hasAtMost1ElementByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasAtMost1ElementByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return hasAtMost1ElementByArray(collection,)
    return hasAtMost1ElementByMinimalistCollectionHolder(collection,)
}


/**
 * The {@link collection} has exactly 0 or 1 value
 *
 * @param collection The {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasAtMost1ElementByMinimalistCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): HasAtMost1ElementOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 0 or 1 value
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasAtMost1ElementByMinimalistCollectionHolder<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): HasAtMost1ElementOnNullableCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 0 or 1 value
 *
 * @param collection The {@link MinimalistCollectionHolder collection} to compare its {@link MinimalistCollectionHolder.size size}
 * @extensionFunction
 */
export function hasAtMost1ElementByMinimalistCollectionHolder<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION,): HasAtMost1ElementOnMinimalistCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 0 or 1 value
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to compare its {@link MinimalistCollectionHolder.size size}
 * @extensionFunction
 */
export function hasAtMost1ElementByMinimalistCollectionHolder<const T, const COLLECTION extends Nullable<MinimalistCollectionHolder<T>> = Nullable<MinimalistCollectionHolder<T>>, >(collection: COLLECTION,): HasAtMost1ElementOnNullableMinimalistCollectionHolder<COLLECTION>
export function hasAtMost1ElementByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,) {
    if (collection == null)
        return true

    const size = collection.size
    return size === 0 || size === 1
}

/**
 * The {@link collection} has exactly 0 or 1 value
 *
 * @param collection The {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasAtMost1ElementByCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION,): HasAtMost1ElementOnCollectionHolder<COLLECTION>
/**
 * The {@link collection} has exactly 0 or 1 value
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to compare its {@link CollectionHolder.size size}
 * @extensionFunction
 */
export function hasAtMost1ElementByCollectionHolder<const T, const COLLECTION extends Nullable<CollectionHolder<T>> = Nullable<CollectionHolder<T>>, >(collection: COLLECTION,): HasAtMost1ElementOnNullableCollectionHolder<COLLECTION>
export function hasAtMost1ElementByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,) {
    if (collection == null)
        return true
    return collection.isEmpty || collection.hasExactly1Element
}

/**
 * The {@link collection} has exactly 0 or 1 value
 *
 * @param collection The {@link ReadonlyArray collection} to compare its {@link ReadonlyArray.length size}
 * @extensionFunction
 */
export function hasAtMost1ElementByArray<const T, const COLLECTION extends Array<T> = Array<T>, >(collection: COLLECTION,): HasAtMost1ElementOnArray<COLLECTION>
/**
 * The {@link collection} has exactly 0 or 1 value
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection} to compare its {@link ReadonlyArray.length size}
 * @extensionFunction
 */
export function hasAtMost1ElementByArray<const T, const COLLECTION extends Nullable<Array<T>> = Nullable<Array<T>>, >(collection: COLLECTION,): HasAtMost1ElementOnNullableArray<COLLECTION>
export function hasAtMost1ElementByArray<const T, >(collection: Nullable<Array<T>>,) {
    if (collection == null)
        return true

    const size = collection.length
    return size === 0 || size === 1
}
