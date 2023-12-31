/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}         from "../CollectionHolder"
import type {BooleanCallback}          from "../CollectionHolder.types"
import type {NonEmptyCollectionHolder} from "../NonEmptyCollectionHolder"
import type {Nullable}                 from "../general type"

//#region -------------------- Facade method --------------------

/**
 * Check if <b>every</b> element in the {@link collection}
 * match the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The matching predicate
 * @return {boolean} <b>true</b> only if every value in the {@link collection} is applicable to the {@link predicate}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/all.html Kotlin all(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
 * @extensionFunction
 */
export function all<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,): boolean {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false

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
        if (!predicate())
            return false
    return true
}

function __with1Argument<const T, >(collection: NonEmptyCollectionHolder<T>, predicate: (value: T,) => boolean,) {
    const size = collection.size
    let index = -1
    while (++index < size)
        if (!predicate(collection.get(index,),))
            return false
    return true
}

function __with2Argument<const T, >(collection: NonEmptyCollectionHolder<T>, predicate: (value: T, index: number,) => boolean,) {
    const size = collection.size
    let index = -1
    while (++index < size)
        if (!predicate(collection.get(index,), index,))
            return false
    return true
}

//#endregion -------------------- Loop methods --------------------
