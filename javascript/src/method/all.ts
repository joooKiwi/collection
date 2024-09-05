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
import {isCollectionHolderByStructure}       from "./isCollectionHolderByStructure"
import {all as byCollectionHolder}           from "./collectionHolder/all"
import {all as byMinimalistCollectionHolder} from "./minimalistCollectionHolder/all"

//#region -------------------- Facade method --------------------

/**
 * Check if <b>every</b> element in the {@link collection}
 * match the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
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
    if (isCollectionHolder<T>(collection,))
        return byCollectionHolder(collection, predicate,)
    if (isCollectionHolderByStructure<T>(collection,))
        return byCollectionHolder(collection, predicate,)
    return byMinimalistCollectionHolder(collection, predicate,)
}

/**
 * Check if <b>every</b> element in the {@link collection}
 * match the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The matching predicate
 * @return {boolean} <b>true</b> only if every value in the {@link collection} is applicable to the {@link predicate}
 * @extensionFunction
 * @deprecated Use all from import("@joookiwi/collection/method/collectionHolder")
 */
export function allByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,): boolean {
    return byCollectionHolder(collection, predicate,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

/** @internal */
export function __with0Argument(predicate: () => boolean, size: number,) {
    let index = size
    while (index-- > 0)
        if (!predicate())
            return false
    return true
}

/** @internal */
export function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T,) => boolean, size: number,) {
    let index = -1
    while (++index < size)
        if (!predicate(collection.get(index,),))
            return false
    return true
}

/** @internal */
export function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T, index: number,) => boolean, size: number,) {
    let index = -1
    while (++index < size)
        if (!predicate(collection.get(index,), index,))
            return false
    return true
}

//#endregion -------------------- Loop methods --------------------
