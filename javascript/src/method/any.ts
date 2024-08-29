/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {BooleanCallback}            from "../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isCollectionHolder}                  from "./isCollectionHolder"
import {any as byCollectionHolder}           from "./collectionHolder/any"
import {any as byMinimalistCollectionHolder} from "./minimalistCollectionHolder/any"

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
 * Tell if the {@link collection} {@link MinimalistCollectionHolder.isEmpty is (not) empty}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @return {boolean} <b>false</b> if null is received or !{@link MinimalistCollectionHolder.isEmpty isEmpty} otherwise
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
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param predicate  The matching predicate
 * @return {boolean} <b>true</b> if at least one {@link predicate} is true on a value of the {@link collection}
 * @see ReadonlyArray.some
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any(predicate)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#anyMatch(java.util.function.Predicate) Java anyMatch(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any(predicate)
 * @extensionFunction
 */
export function any<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): boolean
export function any<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,): boolean {
    if (collection == null)
        return false
    if (isCollectionHolder<T>(collection,))
        return byCollectionHolder(collection, predicate,)
    return byMinimalistCollectionHolder(collection, predicate,)
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
 * @deprecated Use all from import("@joookiwi/collection/collectionHolder")
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
 * @deprecated Use all from import("@joookiwi/collection/collectionHolder")
 */
export function anyByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): boolean
export function anyByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,): boolean {
    return byCollectionHolder(collection, predicate,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

/** @internal */
export function __with0Argument(predicate: () => boolean, size: number,) {
    let index = size
    while (index-- > 0)
        if (predicate())
            return true
    return false
}

/** @internal */
export function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T,) => boolean, size: number,) {
    let index = -1
    while (++index < size)
        if (predicate(collection.get(index,),))
            return true
    return false
}

/** @internal */
export function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T, index: number,) => boolean, size: number,) {
    let index = -1
    while (++index < size)
        if (predicate(collection.get(index,), index,))
            return true
    return false
}

//#endregion -------------------- Loop methods --------------------
