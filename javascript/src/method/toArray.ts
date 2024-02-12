/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}           from "../CollectionHolder"
import type {Nullable}                   from "../general type"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants} from "../CollectionConstants"

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

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_ARRAY
    return __newArray(collection, size,)
}

/**
 * Convert the {@link collection} to an {@link ReadonlyArray array}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection} to convert
 * @extensionFunction
 */
export function toArrayByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): readonly T[] {
    if (collection == null)
        return CollectionConstants.EMPTY_ARRAY
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_ARRAY
    return __newArray(collection, collection.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

function __newArray<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    const array = new Array<T>(size,)
    let index = size
    while (index-- > 0)
        array[index] = collection.get(index,)
    return Object.freeze(array,)
}

//#endregion -------------------- Loop method --------------------
