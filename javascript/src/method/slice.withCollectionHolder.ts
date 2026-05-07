//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Array, Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {EmptyCollectionHolder}         from "../EmptyCollectionHolder"
import {LazyCollectionHolder}          from "../LazyCollectionHolder"
import {__get}                         from "./_array utility"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithCollectionHolder<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>, indices: CollectionHolder<number>,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (isCollectionHolder(collection,))
        return sliceWithCollectionHolderByCollectionHolder(collection, indices,)
    if (isArray(collection,))
        return sliceWithCollectionHolderByArray(collection, indices,)
    if (isMinimalistCollectionHolder(collection,))
        return sliceWithCollectionHolderByMinimalistCollectionHolder(collection, indices,)

    if (isCollectionHolderByStructure<T>(collection,))
        return sliceWithCollectionHolderByCollectionHolder(collection, indices,)
    if (isArrayByStructure<T>(collection,))
        return sliceWithCollectionHolderByArray(collection, indices,)
    return sliceWithCollectionHolderByMinimalistCollectionHolder(collection, indices,)
}


/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The nullable collection
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithCollectionHolderByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: CollectionHolder<number>,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (collection.size == 0)
        return EmptyCollectionHolder.get
    if (indices.isEmpty)
        return EmptyCollectionHolder.get
    return new LazyCollectionHolder(() => __newArray(collection, indices, indices.size,),)
}

/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The nullable collection
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithCollectionHolderByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: CollectionHolder<number>,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (collection.isEmpty)
        return EmptyCollectionHolder.get
    if (indices.isEmpty)
        return EmptyCollectionHolder.get
    return new LazyCollectionHolder(() => __newArray(collection, indices, indices.size,),)
}

/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The nullable collection
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithCollectionHolderByArray<const T, >(collection: Nullable<Array<T>>, indices: CollectionHolder<number>,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (collection.length == 0)
        return EmptyCollectionHolder.get
    if (indices.isEmpty)
        return EmptyCollectionHolder.get
    return new LazyCollectionHolder(() => __newArrayByArray(collection, indices, indices.size,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __newArray<const T, >(collection: MinimalistCollectionHolder<T>, indices: MinimalistCollectionHolder<number>, indicesSize: number,) {
    const newArray = new Array<T>(indicesSize,)
    let index = indicesSize
    while (index-- > 0)
        newArray[index] = collection.get(indices.get(index,),)
    return Object.freeze(newArray,)
}

function __newArrayByArray<const T, >(collection: Array<T>, indices: MinimalistCollectionHolder<number>, indicesSize: number,) {
    const newArray = new Array<T>(indicesSize,)
    let index = indicesSize
    while (index-- > 0)
        newArray[index] = __get(collection, indices.get(index,),)
    return Object.freeze(newArray,)
}

//#endregion -------------------- Loop methods --------------------
