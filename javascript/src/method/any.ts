/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {BooleanCallback}            from "../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

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
 * Tell if the {@link collection} <b>is not empty</b>
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @return {boolean} <b>false</b> if null is received or <b>is not empty</b> otherwise
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any()
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#findAny() Java findAny()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any()
 * @extensionFunction
 */
export function any<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["size"] extends 0 ? false : COLLECTION["size"] extends number ? boolean : true
/**
 * Tell if the {@link collection} <b>is not empty</b>
 *
 * @param collection The {@link Nullable nullable} collection ({@link ReadonlyArray Array})
 * @return {boolean} <b>false</b> if null is received or <b>is not empty</b> otherwise
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any()
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#findAny() Java findAny()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any()
 * @extensionFunction
 */
export function any<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["size"] extends 0 ? false : COLLECTION["size"] extends number ? boolean : true
/**
 * Check if <b>one</b> of the elements in the {@link collection}
 * match the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The matching predicate
 * @return {boolean} <b>true</b> if at least one {@link predicate} is true on a value of the {@link collection}
 * @see ReadonlyArray.some
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any(predicate)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#anyMatch(java.util.function.Predicate) Java anyMatch(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any(predicate)
 * @extensionFunction
 */
export function any<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: Nullable<BooleanCallback<T>>,): boolean
export function any<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (collection == null)
        return false
    if (isCollectionHolder<T>(collection,))
        return anyByCollectionHolder(collection, predicate,)
    if (isArray(collection,))
        return anyByArray(collection, predicate,)
    if (isCollectionHolderByStructure<T>(collection,))
        return anyByCollectionHolder(collection, predicate,)
    if (isArrayByStructure<T>(collection,))
        return anyByArray(collection, predicate,)
    return anyByMinimalistCollectionHolder(collection, predicate,)
}


/**
 * Tell if the {@link collection} <b>is not empty</b>
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @return {boolean} <b>false</b> if null is received or <b>is not empty</b> otherwise
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any()
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#findAny() Java findAny()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any()
 * @extensionFunction
 */
export function anyByMinimalistCollectionHolder<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["size"] extends 0 ? false : COLLECTION["size"] extends number ? boolean : true
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
export function anyByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): boolean
export function anyByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,) {
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
export function anyByCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["isNotEmpty"]
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
export function anyByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): boolean
export function anyByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (collection == null)
        return false
    if (predicate == null)
        return collection.size != 0
    if (collection.isEmpty)
        return false
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, collection.size,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, collection.size,)
    return __with0Argument(predicate as () => boolean, collection.size,)
}

/**
 * Tell if the {@link collection} <b>is not empty</b>
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @return {boolean} <b>false</b> if null is received or <b>is not empty</b> otherwise
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any()
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#findAny() Java findAny()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any()
 * @extensionFunction
 */
export function anyByArray<const T, const COLLECTION extends readonly T[] = readonly T[], >(collection: Nullable<COLLECTION>,): COLLECTION["length"] extends 0 ? false : COLLECTION["length"] extends number ? boolean : true
/**
 * Check if <b>one</b> of the elements in the {@link collection}
 * match the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The matching predicate
 * @return {boolean} <b>true</b> if at least one {@link predicate} is true on a value of the {@link collection}
 * @see ReadonlyArray.some
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any(predicate)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#anyMatch(java.util.function.Predicate) Java anyMatch(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any(predicate)
 * @extensionFunction
 */
export function anyByArray<const T, >(collection: Nullable<readonly T[]>, predicate: Nullable<BooleanCallback<T>>,): boolean
export function anyByArray<const T, >(collection: Nullable<readonly T[]>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (collection == null)
        return false
    if (predicate == null)
        return collection.length != 0

    const size = collection.length
    if (size == 0)
        return false
    if (predicate.length == 1)
        return __with1ArgumentByArray(collection, predicate as (value: T,) => boolean, size,)
    if (predicate.length >= 2)
        return __with2ArgumentByArray(collection, predicate, size,)
    return __with0Argument(predicate as () => boolean, size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument(predicate: () => boolean, size: number,) {
    let index = size
    while (index-- > 0)
        if (predicate())
            return true
    return false
}


function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T,) => boolean, size: number,) {
    let index = -1
    while (++index < size)
        if (predicate(collection.get(index,),))
            return true
    return false
}

function __with1ArgumentByArray<const T, >(collection: readonly T[], predicate: (value: T,) => boolean, size: number,) {
    let index = -1
    while (++index < size)
        if (predicate(collection[index] as T,))
            return true
    return false
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T, index: number,) => boolean, size: number,) {
    let index = -1
    while (++index < size)
        if (predicate(collection.get(index,), index,))
            return true
    return false
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], predicate: (value: T, index: number,) => boolean, size: number,) {
    let index = -1
    while (++index < size)
        if (predicate(collection[index] as T, index,))
            return true
    return false
}

//#endregion -------------------- Loop methods --------------------
