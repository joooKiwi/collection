/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {__uniqueValues, __values}                         from "./_tables utility"
import {isCollectionHolder}                               from "./isCollectionHolder"
import {isCollectionHolderByStructure}                    from "./isCollectionHolderByStructure"
import {toMutableWeakSet as byCollectionHolder}           from "./collectionHolder/toMutableWeakSet"
import {toMutableWeakSet as byMinimalistCollectionHolder} from "./minimalistCollectionHolder/toMutableWeakSet"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link WeakSet mutable weak set}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) to convert
 * @extensionFunction
 */
export function toMutableWeakSet<const T extends WeakKey, >(collection: Nullable<CollectionHolder<T>>,): WeakSet<T> {
    if (isCollectionHolder<T>(collection,))
        return byCollectionHolder(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return byCollectionHolder(collection,)
    return byMinimalistCollectionHolder(collection,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Core method --------------------

/** @internal */
export function __withDuplicate<const T extends WeakKey, >(collection: MinimalistCollectionHolder<T>, size: number,): WeakSet<T> {
    return new WeakSet(__uniqueValues(collection, size,),)
}

/** @internal */
export function __withoutDuplicate<const T extends WeakKey, >(collection: MinimalistCollectionHolder<T>, size: number,): WeakSet<T> {
    return new WeakSet(__values(collection, size,),)
}

//#endregion -------------------- Core method --------------------
