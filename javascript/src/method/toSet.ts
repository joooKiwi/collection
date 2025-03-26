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

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}                             from "../CollectionConstants"
import {__uniqueValues, __uniqueValuesByArray, __values} from "./_tables utility"
import {isArray}                                         from "./isArray"
import {isArrayByStructure}                              from "./isArrayByStructure"
import {isCollectionHolder}                              from "./isCollectionHolder"
import {isCollectionHolderByStructure}                   from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}                    from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link ReadonlySet set}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) to convert
 * @extensionFunction
 */
export function toSet<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,): ReadonlySet<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_SET
    if (isCollectionHolder(collection,))
        return toSetByCollectionHolder(collection,)
    if (isArray(collection,))
        return toSetByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return toSetByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return toSetByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return toSetByArray(collection,)
    return toSetByMinimalistCollectionHolder(collection,)
}


/**
 * Convert the {@link collection} to an {@link ReadonlySet set}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toSetByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): ReadonlySet<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_SET

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_SET
    return __withDuplicate(collection, size,)
}

/**
 * Convert the {@link collection} to an {@link ReadonlySet set}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toSetByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): ReadonlySet<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_SET
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_SET
    if (collection.hasDuplicate)
        return __withDuplicate(collection, collection.size,)
    return __withoutDuplicate(collection, collection.size,)
}

/**
 * Convert the {@link collection} to an {@link ReadonlySet set}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection} to convert
 * @extensionFunction
 */
export function toSetByArray<const T, >(collection: Nullable<readonly T[]>,): ReadonlySet<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_SET

    const size = collection.length
    if (size == 0)
        return CollectionConstants.EMPTY_SET
    return __withDuplicateByArray(collection, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

function __withDuplicate<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    return Object.freeze(new Set(__uniqueValues(collection, size,),),)
}

function __withDuplicateByArray<const T, >(collection: readonly T[], size: number,) {
    return Object.freeze(new Set(__uniqueValuesByArray(collection, size,),),)
}


function __withoutDuplicate<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    return Object.freeze(new Set(__values(collection, size,),),)
}

//#endregion -------------------- Loop method --------------------
