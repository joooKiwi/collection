/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr}                           from "../general type"
import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {NonEmptySimplisticCollectionHolder}         from "../NonEmptySimplisticCollectionHolder"
import type {SimplisticCollectionHolder}                 from "../SimplisticCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Get the last element in the current {@link collection}
 * or <b>null</b> if the {@link collection} {@link SimplisticCollectionHolder.isEmpty is empty}
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault()
 * @extensionFunction
 */
export function lastOrNull<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>,): NullOr<T>
/**
 * Get the last element in the current {@link collection}
 * matching the given {@link predicate}
 * or <b>null</b> if the {@link collection} {@link SimplisticCollectionHolder.isEmpty is empty}
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @param predicate  The matching predicate
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function lastOrNull<const T, const S extends T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
/**
 * Get the last element in the current {@link collection}
 * matching the given {@link predicate}
 * or <b>null</b> if the {@link collection} {@link SimplisticCollectionHolder.isEmpty is empty}
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @param predicate  The matching predicate
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
 * @extensionFunction
 */
export function lastOrNull<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
export function lastOrNull<const T, const S extends T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    if (predicate == null)
        return __withNoPredicate(collection as NonEmptySimplisticCollectionHolder<T>,)
    if (predicate.length == 1)
        return __with1Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate as (value: T,) => boolean,)
    if (predicate.length >= 2)
        return __with2Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate,)
    return __with0Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate as () => boolean,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __withNoPredicate<const T, >(collection: NonEmptySimplisticCollectionHolder<T>,) {
    return collection.get(collection.size - 1,)
}

function __with0Argument<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, predicate: () => boolean,) {
    let index = collection.size
    while (index-- > 0)
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
