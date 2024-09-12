/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}                     from "../CollectionConstants"
import {__values}                                from "./_tables utility"
import {isCollectionHolder}                      from "./isCollectionHolder"
import {isCollectionHolderByStructure}           from "./isCollectionHolderByStructure"
import {toArray as byCollectionHolder}           from "./collectionHolder/toArray"
import {toArray as byMinimalistCollectionHolder} from "./minimalistCollectionHolder/toArray"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link ReadonlyArray array}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toArray<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): readonly T[] {
    if (collection == null)
        return CollectionConstants.EMPTY_ARRAY
    if (isCollectionHolder<T>(collection,))
        return byCollectionHolder(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return byCollectionHolder(collection,)
    return byMinimalistCollectionHolder(collection,)
}

/**
 * Convert the {@link collection} to an {@link ReadonlyArray array}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toArrayByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): readonly T[] {
    return byCollectionHolder(collection,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

/** @internal */
export function __newArray<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    return Object.freeze(__values(collection, size,),)
}

//#endregion -------------------- Loop method --------------------
