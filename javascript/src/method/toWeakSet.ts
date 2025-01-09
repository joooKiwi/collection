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

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link WeakSet weak set}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) to convert
 * @extensionFunction
 */
export function toWeakSet<const T extends WeakKey, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>,): Readonly<WeakSet<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_WEAK_SET
    if (isCollectionHolder<T>(collection,))
        return toWeakSetByCollectionHolder(collection,)
    if (isArray(collection,))
        return toWeakSetByArray(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return toWeakSetByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return toWeakSetByArray(collection,)
    return toWeakSetByMinimalistCollectionHolder(collection,)
}


/**
 * Convert the {@link collection} to an {@link WeakSet weak set}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toWeakSetByMinimalistCollectionHolder<const T extends WeakKey, >(collection: Nullable<MinimalistCollectionHolder<T>>,): Readonly<WeakSet<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_WEAK_SET

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_WEAK_SET
    return __withDuplicate(collection, size,)
}

/**
 * Convert the {@link collection} to an {@link WeakSet weak set}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toWeakSetByCollectionHolder<const T extends WeakKey, >(collection: Nullable<CollectionHolder<T>>,): Readonly<WeakSet<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_WEAK_SET
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_WEAK_SET
    if (collection.hasDuplicate)
        return __withDuplicate(collection, collection.size,)
    return __withoutDuplicate(collection, collection.size,)
}

/**
 * Convert the {@link collection} to an {@link WeakSet weak set}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection} to convert
 * @extensionFunction
 */
export function toWeakSetByArray<const T extends WeakKey, >(collection: Nullable<readonly T[]>,): Readonly<WeakSet<T>> {
    if (collection == null)
        return CollectionConstants.EMPTY_WEAK_SET

    const size = collection.length
    if (size == 0)
        return CollectionConstants.EMPTY_WEAK_SET
    return __withDuplicateByArray(collection, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Core method --------------------

function __withDuplicate<const T extends WeakKey, >(collection: MinimalistCollectionHolder<T>, size: number,): Readonly<WeakSet<T>> {
    return Object.freeze(new WeakSet(__uniqueValues(collection, size,),),)
}

function __withDuplicateByArray<const T extends WeakKey, >(collection: readonly T[], size: number,): Readonly<WeakSet<T>> {
    return Object.freeze(new WeakSet(__uniqueValuesByArray(collection, size,),),)
}


function __withoutDuplicate<const T extends WeakKey, >(collection: MinimalistCollectionHolder<T>, size: number,): Readonly<WeakSet<T>> {
    return Object.freeze(new WeakSet(__values(collection, size,),),)
}

//#endregion -------------------- Core method --------------------
