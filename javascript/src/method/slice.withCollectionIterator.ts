/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {CollectionIterator}         from "../iterator/CollectionIterator"

import {CollectionConstants}           from "../CollectionConstants"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithCollectionIterator<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: CollectionIterator<number>,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return sliceWithCollectionIteratorByCollectionHolder(collection, indices,)
    if (isCollectionHolderByStructure<T>(collection,))
        return sliceWithCollectionIteratorByCollectionHolder(collection, indices,)
    return sliceWithCollectionIteratorByMinimalistCollectionHolder(collection, indices,)
}


/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithCollectionIteratorByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: CollectionIterator<number>,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const indicesSize = indices.size
    if (indicesSize == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArray(collection, indices, indicesSize,),)
}

/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithCollectionIteratorByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: CollectionIterator<number>,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const indicesSize = indices.size
    if (indicesSize == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArray(collection, indices, indicesSize,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __newArray<const T, >(collection: MinimalistCollectionHolder<T>, indices: CollectionIterator<number>, indicesSize: number,) {
    const newArray = new Array<T>(indicesSize,)
    let index = indicesSize
    while (index-- > 0)
        newArray[index] = collection.get(indices.previousValue,)
    return newArray
}

//#endregion -------------------- Loop methods --------------------
