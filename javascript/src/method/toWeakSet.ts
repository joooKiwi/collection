/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}           from "../CollectionConstants"
import {__uniqueValues, __values}      from "./_tables utility"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link WeakSet weak set}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) to convert
 * @extensionFunction
 */
export function toWeakSet<const T extends WeakKey, >(collection: Nullable<MinimalistCollectionHolder<T>>,): Readonly<WeakSet<T>> {
    if (isCollectionHolder<T>(collection,))
        return toWeakSetByCollectionHolder(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return toWeakSetByCollectionHolder(collection,)
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
    return __withoutDuplicate(collection, size,)
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

//#endregion -------------------- Facade method --------------------
//#region -------------------- Core method --------------------

function __withDuplicate<const T extends WeakKey, >(collection: MinimalistCollectionHolder<T>, size: number,): Readonly<WeakSet<T>> {
    return Object.freeze(new WeakSet(__uniqueValues(collection, size,),),)
}

function __withoutDuplicate<const T extends WeakKey, >(collection: MinimalistCollectionHolder<T>, size: number,): Readonly<WeakSet<T>> {
    return Object.freeze(new WeakSet(__values(collection, size,),),)
}

//#endregion -------------------- Core method --------------------
