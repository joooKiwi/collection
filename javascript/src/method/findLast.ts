/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {Nullable, NullOr}                           from "../general type"
import type {NonEmptySimplisticCollectionHolder}         from "../NonEmptySimplisticCollectionHolder"
import type {SimplisticCollectionHolder}                 from "../SimplisticCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Get the last element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function findLast<const T, const S extends T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
/**
 * Get the last element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.findLast
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @extensionFunction
 */
export function findLast<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate: BooleanCallback<T>,): NullOr<T>
export function findLast<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate: BooleanCallback<T>,): NullOr<T> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    if (predicate.length == 1)
        return __with1Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate as (value: T,) => boolean,)
    if (predicate.length >= 2)
        return __with2Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate,)
    return __with0Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate as () => boolean,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, predicate: () => boolean,) {
    let index = collection.size
    while (--index > 0)
        if (predicate())
            return collection.get(index,)
    return null
}

function __with1Argument<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, predicate: (value: T,) => boolean,) {
    let index = collection.size
    while (index-- > 0) {
        const value = collection.get(index,)
        if (predicate(value,))
            return value
    }
    return null
}

function __with2Argument<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, predicate: (value: T, index: number,) => boolean,) {
    let index = collection.size
    while (index-- > 0) {
        const value = collection.get(index,)
        if (predicate(value, index,))
            return value
    }
    return null
}

//#endregion -------------------- Loop methods --------------------
