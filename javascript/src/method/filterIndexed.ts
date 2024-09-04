/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}                                         from "../CollectionHolder"
import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../CollectionHolder.types"
import type {MinimalistCollectionHolder}                               from "../MinimalistCollectionHolder"

import {CollectionConstants}                           from "../CollectionConstants"
import {isCollectionHolder}                            from "./isCollectionHolder"
import {filterIndexed as byCollectionHolder}           from "./collectionHolder/filterIndexed"
import {filterIndexed as byMinimalistCollectionHolder} from "./minimalistCollectionHolder/filterIndexed"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder}
 * matching only the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html Kotlin filterIndexed(predicate)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function filterIndexed<const T, const S extends T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder}
 * matching only the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html Kotlin filterIndexed(predicate)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @extensionFunction
 */
export function filterIndexed<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
export function filterIndexed<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return byCollectionHolder(collection, predicate,)
    return byMinimalistCollectionHolder(collection, predicate,)
}

/**
 * Get a new {@link CollectionHolder}
 * matching only the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html Kotlin filterIndexed(predicate)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @typescriptDefinition
 * @extensionFunction
 * @deprecated Use "filterIndexed" from import("@joookiwi/collection/collectionHolder")
 */
export function filterIndexedByCollectionHolder<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder}
 * matching only the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html Kotlin filterIndexed(predicate)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @extensionFunction
 * @deprecated Use "filterIndexed" from import("@joookiwi/collection/collectionHolder")
 */
export function filterIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
export function filterIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,) {
    return byCollectionHolder(collection, predicate,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

/** @internal */
export function __with0Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: () => boolean, size: number,) {
    const newArray = [] as T[]
    let index = -1
    while (++index < size)
        if (predicate())
            newArray.push(collection.get(index,),)
    return newArray
}

/** @internal */
export function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (index: number,) => boolean, size: number,) {
    const newArray = [] as T[]
    let index = -1
    while (++index < size)
        if (predicate(index,))
            newArray.push(collection.get(index,),)
    return newArray
}

/** @internal */
export function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (index: number, value: T,) => boolean, size: number,) {
    const newArray = [] as T[]
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (predicate(index, value,))
            newArray.push(value,)
    }
    return newArray
}

//#endregion -------------------- Loop methods --------------------
