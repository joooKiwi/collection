/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}           from "../CollectionConstants"
import {__values, __valuesByArray}     from "./_tables utility"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Convert the {@link collection} to an {@link ReadonlyArray array}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array}) to convert
 * @extensionFunction
 */
export function toArray<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>,): readonly T[] {
    if (collection == null)
        return CollectionConstants.EMPTY_ARRAY
    if (isCollectionHolder<T>(collection,))
        return toArrayByCollectionHolder(collection,)
    if (isArray(collection,))
        return toArrayByArray(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return toArrayByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return toArrayByArray(collection,)
    return toArrayByMinimalistCollectionHolder(collection,)
}


/**
 * Convert the {@link collection} to an {@link ReadonlyArray array}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection} to convert
 * @extensionFunction
 */
export function toArrayByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): readonly T[] {
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

/**
 * Convert the {@link collection} to an {@link ReadonlyArray array}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection} to convert
 * @extensionFunction
 */
export function toArrayByArray<const T, >(collection: Nullable<readonly T[]>,): readonly T[] {
    if (collection == null)
        return CollectionConstants.EMPTY_ARRAY

    const size = collection.length
    if (size == 0)
        return CollectionConstants.EMPTY_ARRAY
    return __newArrayByArray(collection, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

function __newArray<const T, >(collection: MinimalistCollectionHolder<T>, size: number,) {
    return Object.freeze(__values(collection, size,),)
}

function __newArrayByArray<const T, >(collection: readonly T[], size: number,) {
    return Object.freeze(__valuesByArray(collection, size,),)
}

//#endregion -------------------- Loop method --------------------
