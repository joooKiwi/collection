/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {__values}                                  from "./_tables utility"
import {isCollectionHolder}                        from "./isCollectionHolder"
import {isCollectionHolderByStructure}             from "./isCollectionHolderByStructure"
import {toWeakSet as byCollectionHolder}           from "./collectionHolder/toWeakSet"
import {toWeakSet as byMinimalistCollectionHolder} from "./minimalistCollectionHolder/toWeakSet"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link WeakSet weak set}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder}) to convert
 * @extensionFunction
 */
export function toWeakSet<const T extends WeakKey, >(collection: Nullable<MinimalistCollectionHolder<T>>,): Readonly<WeakSet<T>> {
    if (isCollectionHolder<T>(collection,))
        return byCollectionHolder(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return byCollectionHolder(collection,)
    return byMinimalistCollectionHolder(collection,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Core method --------------------

/** @internal */
export function __newWeakSet<const T extends WeakKey, >(collection: MinimalistCollectionHolder<T>, size: number,): Readonly<WeakSet<T>> {
    return Object.freeze(new WeakSet(__values(collection, size,),),)
}

//#endregion -------------------- Core method --------------------
