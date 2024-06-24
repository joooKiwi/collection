/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants} from "../CollectionConstants"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link CollectionHolder} from the {@link indices} (as an {@link Iterable})
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithIterable<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: Iterable<number>,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const iterator = indices[Symbol.iterator]() as Iterator<number, unknown>
    const iteratorResult: IteratorResult<number, unknown> = iterator.next()
    if (iteratorResult.done)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArray(collection, iterator, iteratorResult.value,),)
}

/**
 * Create a new {@link CollectionHolder} from the {@link indices} (as an {@link Iterable})
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithIterableByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: Iterable<number>,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const iterator = indices[Symbol.iterator]() as Iterator<number, unknown>
    const iteratorResult: IteratorResult<number, unknown> = iterator.next()
    if (iteratorResult.done)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArray(collection, iterator, iteratorResult.value,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __newArray<const T, >(collection: MinimalistCollectionHolder<T>, iterator: Iterator<number, unknown>, firstValue: number,) {
    const newArray = [collection.get(firstValue,),]
    let iteratorResult: IteratorResult<number, unknown>
    while (!(iteratorResult = iterator.next()).done)
        newArray.push(collection.get(iteratorResult.value,),)
    return newArray
}

//#endregion -------------------- Loop methods --------------------
