//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

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
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithIterable<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, indices: Iterable<number>,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return sliceWithIterableByCollectionHolder(collection, indices,)
    if (isArray(collection,))
        return sliceWithIterableByArray(collection, indices,)
    if (isCollectionHolderByStructure<T>(collection,))
        return sliceWithIterableByCollectionHolder(collection, indices,)
    if (isArrayByStructure<T>(collection,))
        return sliceWithIterableByArray(collection, indices,)
    return sliceWithIterableByMinimalistCollectionHolder(collection, indices,)
}


/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithIterableByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: Iterable<number>,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const iterator: Iterator<number, unknown, unknown> = indices[Symbol.iterator]()
    const iteratorResult = iterator.next()
    if (iteratorResult.done)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArray(collection, iterator, iteratorResult.value,),)
}

/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithIterableByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: Iterable<number>,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const iterator: Iterator<number, unknown, unknown> = indices[Symbol.iterator]()
    const iteratorResult = iterator.next()
    if (iteratorResult.done)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArray(collection, iterator, iteratorResult.value,),)
}

/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithIterableByArray<const T, >(collection: Nullable<readonly T[]>, indices: Iterable<number>,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.length == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const iterator: Iterator<number, unknown, unknown> = indices[Symbol.iterator]()
    const iteratorResult = iterator.next()
    if (iteratorResult.done)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayByArray(collection, iterator, iteratorResult.value,),)
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

function __newArrayByArray<const T, >(collection: readonly T[], iterator: Iterator<number, unknown, unknown>, firstValue: number,) {
    const newArray = [__get(collection, firstValue,),]
    let iteratorResult: IteratorResult<number, unknown>
    while (!(iteratorResult = iterator.next()).done)
        newArray.push(__get(collection, iteratorResult.value,),)
    return newArray
}

//#endregion -------------------- Loop methods --------------------
