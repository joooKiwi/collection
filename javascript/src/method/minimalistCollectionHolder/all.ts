/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {BooleanCallback}            from "../../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../../MinimalistCollectionHolder"

import {__with0Argument, __with1Argument, __with2Argument} from "../all"

/**
 * Check if <b>every</b> element in the {@link collection}
 * match the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The matching predicate
 * @return {boolean} <b>true</b> only if every value in the {@link collection} is applicable to the {@link predicate}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java allMatch(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
 * @extensionFunction
 */
export function all<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,): boolean {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false

    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, size,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, size,)
    return __with0Argument(predicate as () => boolean, size,)
}
