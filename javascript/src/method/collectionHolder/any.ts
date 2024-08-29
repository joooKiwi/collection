/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder} from "../../CollectionHolder"
import type {BooleanCallback}  from "../../CollectionHolder.types"

import {__with0Argument, __with1Argument, __with2Argument} from "../any"

/**
 * Tell if the {@link collection} {@link CollectionHolder.isNotEmpty is not empty}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @return {boolean} <b>false</b> if null is received or {@link CollectionHolder.isNotEmpty isNotEmpty} otherwise
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any()
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#findAny() Java findAny()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any()
 * @extensionFunction
 */
export function any<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["isNotEmpty"]
/**
 * Check if <b>one</b> of the elements in the {@link collection}
 * match the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The matching predicate
 * @return {boolean} <b>true</b> if at least one {@link predicate} is true on a value of the {@link collection}
 * @see ReadonlyArray.some
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any(predicate)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#anyMatch(java.util.function.Predicate) Java anyMatch(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any(predicate)
 * @extensionFunction
 */
export function any<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): boolean
export function any<const T, >(collection: Nullable<CollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (collection == null)
        return false
    if (predicate == null)
        return collection.size != 0

    const size = collection.size
    if (size == 0)
        return false

    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, size,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, size,)
    return __with0Argument(predicate as () => boolean, size,)
}
