/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}                   from "../CollectionConstants"
import {__uniqueValues, __values}              from "./_tables utility"
import {isCollectionHolder}                    from "./isCollectionHolder"
import {isCollectionHolderByStructure}         from "./isCollectionHolderByStructure"
import {toSet as byCollectionHolder}           from "./collectionHolder/toSet"
import {toSet as byMinimalistCollectionHolder} from "./minimalistCollectionHolder/toSet"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link ReadonlySet set}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) to convert
 * @extensionFunction
 */
export function toSet<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): ReadonlySet<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_SET
    if (isCollectionHolder<T>(collection,))
        return byCollectionHolder(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return byCollectionHolder(collection,)
    return byMinimalistCollectionHolder(collection,)
}

/**
 * Convert the {@link collection} to an {@link ReadonlySet set}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 * @deprecated Use toSet from import("@joookiwi/collection/method/collectionHolder")
 */
export function toSetByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): ReadonlySet<T> {
    return byCollectionHolder(collection,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

/** @internal */
export function __withDuplicate<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    return Object.freeze(new Set(__uniqueValues(collection, size,),),)
}

/** @internal */
export function __withoutDuplicate<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    return Object.freeze(new Set(__values(collection, size,),),)
}

//#endregion -------------------- Loop method --------------------
