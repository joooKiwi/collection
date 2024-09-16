/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {__uniqueValues, __values}      from "./_tables utility"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link WeakSet mutable weak set}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) to convert
 * @extensionFunction
 */
export function toMutableWeakSet<const T extends WeakKey, >(collection: Nullable<CollectionHolder<T>>,): WeakSet<T> {
    if (isCollectionHolder<T>(collection,))
        return toMutableWeakSetByCollectionHolder(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return toMutableWeakSetByCollectionHolder(collection,)
    return toMutableWeakSetByMinimalistCollectionHolder(collection,)
}


/**
 * Convert the {@link collection} to an {@link WeakSet mutable weak set}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableWeakSetByMinimalistCollectionHolder<const T extends WeakKey, >(collection: Nullable<MinimalistCollectionHolder<T>>,): WeakSet<T> {
    if (collection == null)
        return new WeakSet()

    const size = collection.size
    if (size == 0)
        return new WeakSet()
    return __withoutDuplicate(collection, size,)
}

/**
 * Convert the {@link collection} to an {@link WeakSet mutable weak set}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
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

//#endregion -------------------- Facade method --------------------
//#region -------------------- Core method --------------------

function __withDuplicate<const T extends WeakKey, >(collection: MinimalistCollectionHolder<T>, size: number,): WeakSet<T> {
    return new WeakSet(__uniqueValues(collection, size,),)
}

function __withoutDuplicate<const T extends WeakKey, >(collection: MinimalistCollectionHolder<T>, size: number,): WeakSet<T> {
    return new WeakSet(__values(collection, size,),)
}

//#endregion -------------------- Core method --------------------
