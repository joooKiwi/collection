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
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithIterable<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>, indices: Iterable<number>,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (isCollectionHolder(collection,))
        return sliceWithIterableByCollectionHolder(collection, indices,)
    if (collection instanceof Array)
        return sliceWithIterableByArray(collection, indices,)
    if (isMinimalistCollectionHolder(collection,))
        return sliceWithIterableByMinimalistCollectionHolder(collection, indices,)

    if (isCollectionHolderByStructure<T>(collection,))
        return sliceWithIterableByCollectionHolder(collection, indices,)
    if (isArrayByStructure<T>(collection,))
        return sliceWithIterableByArray(collection, indices,)
    return sliceWithIterableByMinimalistCollectionHolder(collection, indices,)
}


/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The nullable collection
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithIterableByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: Iterable<number>,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (collection.size === 0)
        return EmptyCollectionHolder.get

    const iterator: Iterator<number, unknown, unknown> = indices[Symbol.iterator]()
    const iteratorResult = iterator.next()
    if (iteratorResult.done)
        return EmptyCollectionHolder.get
    return new LazyCollectionHolder(() => __newArray(collection, iterator, iteratorResult.value,),)
}

/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The nullable collection
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithIterableByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: Iterable<number>,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (collection.isEmpty)
        return EmptyCollectionHolder.get

    const iterator: Iterator<number, unknown, unknown> = indices[Symbol.iterator]()
    const iteratorResult = iterator.next()
    if (iteratorResult.done)
        return EmptyCollectionHolder.get
    return new LazyCollectionHolder(() => __newArray(collection, iterator, iteratorResult.value,),)
}

/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The nullable collection
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithIterableByArray<const T, >(collection: Nullable<Array<T>>, indices: Iterable<number>,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (collection.length === 0)
        return EmptyCollectionHolder.get

    const iterator: Iterator<number, unknown, unknown> = indices[Symbol.iterator]()
    const iteratorResult = iterator.next()
    if (iteratorResult.done)
        return EmptyCollectionHolder.get
    return new LazyCollectionHolder(() => __newArrayByArray(collection, iterator, iteratorResult.value,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __newArray<const T, >(collection: MinimalistCollectionHolder<T>, iterator: Iterator<number, unknown, unknown>, firstValue: number,) {
    const newArray = [collection.get(firstValue,),]
    let iteratorResult: IteratorResult<number, unknown>
    while (!(iteratorResult = iterator.next()).done)
        newArray.push(collection.get(iteratorResult.value,),)
    return newArray
}

function __newArrayByArray<const T, >(collection: Array<T>, iterator: Iterator<number, unknown, unknown>, firstValue: number,) {
    const newArray = [__get(collection, firstValue,),]
    let iteratorResult: IteratorResult<number, unknown>
    while (!(iteratorResult = iterator.next()).done)
        newArray.push(__get(collection, iteratorResult.value,),)
    return newArray
}

//#endregion -------------------- Loop methods --------------------
