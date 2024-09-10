/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}                   from "../CollectionConstants"
import {isCollectionHolder}                    from "./isCollectionHolder"
import {isCollectionHolderByStructure}         from "./isCollectionHolderByStructure"
import {toSet as byCollectionHolder}           from "./collectionHolder/toSet"
import {toSet as byMinimalistCollectionHolder} from "./minimalistCollectionHolder/toSet"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link ReadonlySet set}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
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
    //#region -------------------- Possibly remove duplicates --------------------

    const array1 = new Array<T>(size,)
    array1[0] = collection.get(0,)
    let amountOfItemAdded = 1
    let index1 = -1
    loopToRemoveDuplicate: while (++index1 < size) {
        const value = collection.get(index1,)
        let index2 = -1
        while (++index2 < amountOfItemAdded) {
            if (array1[index2] === value)
                continue loopToRemoveDuplicate // It is equal, so we don't add it to the duplicates
            array1[amountOfItemAdded++] = value
        }
    }

    if (amountOfItemAdded == size)
        return Object.freeze(new Set(array1,),)

    //#endregion -------------------- Possibly remove duplicates --------------------
    //#region -------------------- Return the non-duplicated values --------------------

    const array2 = new Array<T>(amountOfItemAdded,)
    let index3 = amountOfItemAdded
    while (index3-- > 0)
        array2[index3] = array1[index3] as T
    return Object.freeze(new Set(array2,),)

    //#endregion -------------------- Return the non-duplicated values --------------------
}

/** @internal */
export function __withoutDuplicate<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    const array = new Array<T>(size,)
    let index = size
    while (index-- > 0)
        array[index] = collection.get(index,)
    return Object.freeze(new Set(array,),)
}

//#endregion -------------------- Loop method --------------------
