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

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {__uniqueValues, __uniqueValuesByArray, __values} from "./_tables utility"
import {isArray}                                         from "./isArray"
import {isArrayByStructure}                              from "./isArrayByStructure"
import {isCollectionHolder}                              from "./isCollectionHolder"
import {isCollectionHolderByStructure}                   from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}                    from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to a new {@link WeakSet mutable weak set}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) to convert
 * @extensionFunction
 */
export function toMutableWeakSet<const T extends WeakKey, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,): WeakSet<T> {
    if (collection == null)
        return new WeakSet()
    if (isCollectionHolder(collection,))
        return toMutableWeakSetByCollectionHolder(collection,)
    if (isArray(collection,))
        return toMutableWeakSetByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return toMutableWeakSetByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return toMutableWeakSetByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return toMutableWeakSetByArray(collection,)
    return toMutableWeakSetByMinimalistCollectionHolder(collection,)
}


/**
 * Convert the {@link collection} to a new {@link WeakSet mutable weak set}
 *
 * @param collection The nullable collection to convert
 * @extensionFunction
 */
export function toMutableWeakSetByMinimalistCollectionHolder<const T extends WeakKey, >(collection: Nullable<MinimalistCollectionHolder<T>>,): WeakSet<T> {
    if (collection == null)
        return new WeakSet()

    const size = collection.size
    if (size == 0)
        return new WeakSet()
    return __withDuplicate(collection, size,)
}

/**
 * Convert the {@link collection} to a new {@link WeakSet mutable weak set}
 *
 * @param collection The nullable collection to convert
 * @extensionFunction
 */
export function toMutableWeakSetByCollectionHolder<const T extends WeakKey, >(collection: Nullable<CollectionHolder<T>>,): WeakSet<T> {
    if (collection == null)
        return new WeakSet()
    if (collection.isEmpty)
        return new WeakSet()
    if (collection.hasDuplicate)
        return __withDuplicate(collection, collection.size,)
    return __withoutDuplicate(collection, collection.size,)
}

/**
 * Convert the {@link collection} to a new {@link WeakSet mutable weak set}
 *
 * @param collection The nullable collection to convert
 * @extensionFunction
 */
export function toMutableWeakSetByArray<const T extends WeakKey, >(collection: Nullable<readonly T[]>,): WeakSet<T> {
    if (collection == null)
        return new WeakSet()

    const size = collection.length
    if (size == 0)
        return new WeakSet()
    return __withDuplicateByArray(collection, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Core method --------------------

function __withDuplicate<const T extends WeakKey, >(collection: MinimalistCollectionHolder<T>, size: number,): WeakSet<T> {
    return new WeakSet(__uniqueValues(collection, size,),)
}

function __withDuplicateByArray<const T extends WeakKey, >(collection: readonly T[], size: number,): WeakSet<T> {
    return new WeakSet(__uniqueValuesByArray(collection, size,),)
}


function __withoutDuplicate<const T extends WeakKey, >(collection: MinimalistCollectionHolder<T>, size: number,): WeakSet<T> {
    return new WeakSet(__values(collection, size,),)
}

//#endregion -------------------- Core method --------------------
