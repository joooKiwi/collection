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
import type {CollectionIterator}         from "../iterator/CollectionIterator"

import {EmptyCollectionHolder}         from "../EmptyCollectionHolder"
import {LazyCollectionHolder}          from "../LazyCollectionHolder"
import {__get}                         from "./_array utility"
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
export function sliceWithCollectionIterator<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>, indices: CollectionIterator<number>,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (isCollectionHolder(collection,))
        return sliceWithCollectionIteratorByCollectionHolder(collection, indices,)
    if (collection instanceof Array)
        return sliceWithCollectionIteratorByArray(collection, indices,)
    if (isMinimalistCollectionHolder(collection,))
        return sliceWithCollectionIteratorByMinimalistCollectionHolder(collection, indices,)

    if (isCollectionHolderByStructure<T>(collection,))
        return sliceWithCollectionIteratorByCollectionHolder(collection, indices,)
    if (isArrayByStructure<T>(collection,))
        return sliceWithCollectionIteratorByArray(collection, indices,)
    return sliceWithCollectionIteratorByMinimalistCollectionHolder(collection, indices,)
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
export function sliceWithCollectionIteratorByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: CollectionIterator<number>,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (collection.size === 0)
        return EmptyCollectionHolder.get

    const indicesSize = indices.size
    if (indicesSize === 0)
        return EmptyCollectionHolder.get
    return new LazyCollectionHolder(() => __newArray(collection, indices, indicesSize,),)
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
export function sliceWithCollectionIteratorByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: CollectionIterator<number>,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (collection.isEmpty)
        return EmptyCollectionHolder.get

    const indicesSize = indices.size
    if (indicesSize === 0)
        return EmptyCollectionHolder.get
    return new LazyCollectionHolder(() => __newArray(collection, indices, indicesSize,),)
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
export function sliceWithCollectionIteratorByArray<const T, >(collection: Nullable<Array<T>>, indices: CollectionIterator<number>,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (collection.length === 0)
        return EmptyCollectionHolder.get

    const indicesSize = indices.size
    if (indicesSize === 0)
        return EmptyCollectionHolder.get
    return new LazyCollectionHolder(() => __newArrayByArray(collection, indices, indicesSize,),)
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

function __newArrayByArray<const T, >(collection: Array<T>, indices: CollectionIterator<number>, indicesSize: number,) {
    const newArray = new Array<T>(indicesSize,)
    let index = indicesSize
    while (index-- > 0)
        newArray[index] = __get(collection, indices.previousValue,)
    return newArray
}

//#endregion -------------------- Loop methods --------------------
