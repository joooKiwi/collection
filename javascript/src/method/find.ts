/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                           from "../CollectionHolder"
import type {BooleanCallback, RestrainedBooleanCallback} from "../CollectionHolder.types"
import type {NonEmptyCollectionHolder}                   from "../NonEmptyCollectionHolder"
import type {Nullable, NullOr}                           from "../general type"

//#region -------------------- Facade method --------------------

/**
 * Get the first element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate The given predicate
 * @see ReadonlyArray.find
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find.html Kotlin find(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 * @typescriptDefinition
 * @extensionFunction
 */
export function find<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
/**
 * Get the first element found or <b>null</b> if nothing was found
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate The given predicate
 * @see ReadonlyArray.find
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find.html Kotlin find(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
 * @extensionFunction
 */
export function find<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,): NullOr<T>
export function find<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: | BooleanCallback<T> | RestrainedBooleanCallback<T, S>,): NullOr<| T | S> {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    if (predicate.length === 1)
        return __with1Argument(collection as NonEmptyCollectionHolder<T>, predicate as (value: T,) => boolean,)
    if (predicate.length >= 2)
        return __with2Argument(collection as NonEmptyCollectionHolder<T>, predicate,)
    return __with0Argument(collection as NonEmptyCollectionHolder<T>, predicate as () => boolean,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, >(collection: NonEmptyCollectionHolder<T>, predicate: () => boolean,) {
    const size = collection.size
    let index = -1
    while (++index < size)
        if (predicate())
            return collection.get(index,)
    return null
}

function __with1Argument<const T, >(collection: NonEmptyCollectionHolder<T>, predicate: (value: T,) => boolean,) {
    const size = collection.size
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (predicate(value,))
            return value
    }
    return null
}

function __with2Argument<const T, >(collection: NonEmptyCollectionHolder<T>, predicate: (value: T, index: number,) => boolean,) {
    const size = collection.size
    let index = -1
    while (++index < size) {
        const value = collection.get(index,)
        if (predicate(value, index,))
            return value
    }
    return null
}

//#endregion -------------------- Loop methods --------------------
