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

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

/**
 * The {@link collection} has a minimum of 2 values
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @extensionFunction
 */
export function hasAtLeast2Elements<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>,): boolean {
    if (collection == null)
        return true
    if (isCollectionHolder(collection,))
        return hasAtLeast2ElementsByCollectionHolder(collection,)
    if (isArray(collection,))
        return hasAtLeast2ElementsByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return hasAtLeast2ElementsByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return hasAtLeast2ElementsByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return hasAtLeast2ElementsByArray(collection,)
    return hasAtLeast2ElementsByMinimalistCollectionHolder(collection,)
}


/**
 * The {@link collection} has a minimum of 2 values
 *
 * @param collection The nullable collection
 * @extensionFunction
 */
export function hasAtLeast2ElementsByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): boolean {
    if (collection == null)
        return true

    const size = collection.size
    return size == 0 || size == 1 || size == 2
}

/**
 * The {@link collection} has a minimum of 2 values
 *
 * @param collection The nullable collection
 * @extensionFunction
 */
export function hasAtLeast2ElementsByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): boolean {
    if (collection == null)
        return true
    return collection.isEmpty || collection.hasExactly1Element || collection.hasExactly2Elements
}

/**
 * The {@link collection} has a minimum of 2 values
 *
 * @param collection The nullable collection
 * @extensionFunction
 */
export function hasAtLeast2ElementsByArray<const T, >(collection: Nullable<Array<T>>,): boolean {
    if (collection == null)
        return true

    const size = collection.length
    return size == 0 || size == 1 || size == 2
}
