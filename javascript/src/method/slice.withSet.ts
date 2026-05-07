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

import type {Array, Nullable, NumberSet} from "@joookiwi/type"

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
export function sliceWithSet<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>, indices: NumberSet,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (isCollectionHolder(collection,))
        return sliceWithSetByCollectionHolder(collection, indices,)
    if (isArray(collection,))
        return sliceWithSetByArray(collection, indices,)
    if (isMinimalistCollectionHolder(collection,))
        return sliceWithSetByMinimalistCollectionHolder(collection, indices,)

    if (isCollectionHolderByStructure<T>(collection,))
        return sliceWithSetByCollectionHolder(collection, indices,)
    if (isArrayByStructure<T>(collection,))
        return sliceWithSetByArray(collection, indices,)
    return sliceWithSetByMinimalistCollectionHolder(collection, indices,)
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
export function sliceWithSetByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: NumberSet,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (collection.size == 0)
        return EmptyCollectionHolder.get

    const indicesSize = indices.size
    if (indicesSize == 0)
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
export function sliceWithSetByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: NumberSet,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (collection.isEmpty)
        return EmptyCollectionHolder.get

    const indicesSize = indices.size
    if (indicesSize == 0)
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
export function sliceWithSetByArray<const T, >(collection: Nullable<Array<T>>, indices: NumberSet,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (collection.length == 0)
        return EmptyCollectionHolder.get

    const indicesSize = indices.size
    if (indicesSize == 0)
        return EmptyCollectionHolder.get
    return new LazyCollectionHolder(() => __newArrayByArray(collection, indices, indicesSize,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __newArray<const T, >(collection: MinimalistCollectionHolder<T>, indices: NumberSet, indicesSize: number,) {
    const newArray = new Array<T>(indicesSize,)
    const iterator = indices[Symbol.iterator]()
    let index = -1
    while (++index < indicesSize)
        newArray[index] = collection.get(iterator.next().value!,)
    return Object.freeze(newArray,)
}

function __newArrayByArray<const T, >(collection: Array<T>, indices: NumberSet, indicesSize: number,) {
    const newArray = new Array<T>(indicesSize,)
    const iterator = indices[Symbol.iterator]()
    let index = -1
    while (++index < indicesSize)
        newArray[index] = __get(collection, iterator.next().value!,)
    return Object.freeze(newArray,)
}

//#endregion -------------------- Loop methods --------------------
