/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../CollectionHolder.types"
import type {Nullable, NullOr}                                         from "../general type"
import type {NonEmptySimplisticCollectionHolder}                       from "../NonEmptySimplisticCollectionHolder"
import type {SimplisticCollectionHolder}                               from "../SimplisticCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Get the first element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.find
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find.html Kotlin find(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function findIndexed<const T, const S extends T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
/**
 * Get the first element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link SimplisticCollectionHolder collection}
 * @param predicate  The given predicate
 * @see ReadonlyArray.find
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find.html Kotlin find(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 * @extensionFunction
 */
export function findIndexed<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,): NullOr<T>
export function findIndexed<const T, >(collection: Nullable<SimplisticCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>,): NullOr<T> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    if (predicate.length == 1)
        return __with1Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate as (index: number,) => boolean,)
    if (predicate.length >= 2)
        return __with2Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate,)
    return __with0Argument(collection as NonEmptySimplisticCollectionHolder<T>, predicate as () => boolean,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, predicate: () => boolean,) {
    const size = collection.size
    let index = -1
    while (++index < size)
        if (predicate())
            return collection.get(index,)
    return null
}

function __with1Argument<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, predicate: (index: number,) => boolean,) {
    const size = collection.size
    let index = -1
    while (++index < size)
        if (predicate(index,))
            return collection.get(index,)
    return null
}

function __with2Argument<const T, >(collection: NonEmptySimplisticCollectionHolder<T>, predicate: (index: number, value: T,) => boolean,) {
    const size = collection.size
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (predicate(index, value,))
            return value
    }
    return null
}

//#endregion -------------------- Loop methods --------------------
