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
 * Convert the {@link collection} to an {@link Set mutable set}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) to convert
 * @extensionFunction
 */
export function toMutableSet<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): Set<T> {
    if (collection == null)
        return new Set()
    if (isCollectionHolder<T>(collection,))
        return toMutableSetByCollectionHolder(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return toMutableSetByCollectionHolder(collection,)
    return toMutableSetByMinimalistCollectionHolder(collection,)
}


/**
 * Convert the {@link collection} to an {@link Set mutable set}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableSetByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): Set<T> {
    if (collection == null)
        return new Set()

    const size = collection.size
    if (size == 0)
        return new Set()
    return __withDuplicate(collection, size,)
}

/**
 * Convert the {@link collection} to an {@link Set mutable set}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toMutableSetByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): Set<T> {
    if (collection == null)
        return new Set()
    if (collection.isEmpty)
        return new Set()
    if (collection.hasDuplicate)
        return __withDuplicate(collection, collection.size,)
    return __withoutDuplicate(collection, collection.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

/** @internal */
export function __withDuplicate<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    return new Set(__uniqueValues(collection, size,),)
}

/** @internal */
export function __withoutDuplicate<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    return new Set(__values(collection, size,),)
}

//#endregion -------------------- Loop method --------------------
