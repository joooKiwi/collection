/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}           from "../CollectionConstants"
import {__get}                         from "./_array utility"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithSet<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, indices: ReadonlySet<number>,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return sliceWithSetByCollectionHolder(collection, indices,)
    if (isArray<T>(collection,))
        return sliceWithSetByArray(collection, indices,)
    if (isCollectionHolderByStructure<T>(collection,))
        return sliceWithSetByCollectionHolder(collection, indices,)
    if (isArrayByStructure<T>(collection,))
        return sliceWithSetByArray(collection, indices,)
    return sliceWithSetByMinimalistCollectionHolder(collection, indices,)
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
export function sliceWithSetByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: ReadonlySet<number>,): CollectionHolder<T> {
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
export function sliceWithSetByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: ReadonlySet<number>,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const indicesSize = indices.size
    if (indicesSize == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArray(collection, indices, indicesSize,),)
}

/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithSetByArray<const T, >(collection: Nullable<readonly T[]>, indices: ReadonlySet<number>,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.length == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const indicesSize = indices.size
    if (indicesSize == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayByArray(collection, indices, indicesSize,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __newArray<const T, >(collection: MinimalistCollectionHolder<T>, indices: ReadonlySet<number>, indicesSize: number,) {
    const newArray = new Array<T>(indicesSize,)
    const iterator = indices[Symbol.iterator]()
    let index = -1
    while (++index < indicesSize)
        newArray[index] = collection.get(iterator.next().value!,)
    return Object.freeze(newArray,)
}

function __newArrayByArray<const T, >(collection: readonly T[], indices: ReadonlySet<number>, indicesSize: number,) {
    const newArray = new Array<T>(indicesSize,)
    const iterator = indices[Symbol.iterator]()
    let index = -1
    while (++index < indicesSize)
        newArray[index] = __get(collection, iterator.next().value!,)
    return Object.freeze(newArray,)
}

//#endregion -------------------- Loop methods --------------------
