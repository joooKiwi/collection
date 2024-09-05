/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {BooleanCallback}            from "../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isCollectionHolder}                   from "./isCollectionHolder"
import {isCollectionHolderByStructure}        from "./isCollectionHolderByStructure"
import {none as byCollectionHolder}           from "./collectionHolder/none"
import {none as byMinimalistCollectionHolder} from "./minimalistCollectionHolder/none"

//#region -------------------- Facade method --------------------

/**
 * Tell if the {@link collection} {@link CollectionHolder.isEmpty is empty}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @return {boolean} <b>true</b> if null is received or the {@link collection} <b>is empty</b> otherwise
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none()
 * @extensionFunction
 */
export function none<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["isEmpty"]
/**
 * Tell if the {@link collection} <b>is empty</b>
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @return {boolean} <b>true</b> if null is received or the {@link collection} <b>is empty</b> otherwise
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none()
 * @extensionFunction
 */
export function none<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["size"] extends 0 ? true : COLLECTION["size"] extends number ? boolean : false
/**
 * Check if <b>no</b> element in the {@link collection}
 * match the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param predicate The given predicate
 * @return {boolean} <b>false</b> if at least one {@link predicate} is <b>true</b> on a value of the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none(predicate)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#noneMatch(java.util.function.Predicate) Java noneMatch(predicate)
 * @extensionFunction
 */
export function none<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): boolean
export function none<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,): boolean {
    if (collection == null)
        return true
    if (isCollectionHolder<T>(collection,))
        return byCollectionHolder(collection, predicate,)
    if (isCollectionHolderByStructure<T>(collection,))
        return byCollectionHolder(collection, predicate,)
    return byMinimalistCollectionHolder(collection, predicate,)
}

/**
 * Tell if the {@link collection} {@link CollectionHolder.isEmpty is empty}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @return {boolean} <b>true</b> if null is received or the {@link collection} <b>is empty</b> otherwise
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none()
 * @extensionFunction
 * @deprecated Use "none" from import("@joookiwi/collection/method/collectionHolder")
 */
export function noneByCollectionHolder<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["isEmpty"]
/**
 * Check if <b>no</b> element in the {@link collection}
 * match the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate The given predicate
 * @return {boolean} <b>false</b> if at least one {@link predicate} is <b>true</b> on a value of the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none(predicate)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#noneMatch(java.util.function.Predicate) Java noneMatch(predicate)
 * @extensionFunction
 * @deprecated Use "none" from import("@joookiwi/collection/method/collectionHolder")
 */
export function noneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): boolean
export function noneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,): boolean {
    return byCollectionHolder(collection, predicate,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

/** @internal */
export function __with0Argument(predicate: () => boolean, size: number,) {
    let index = size - 1
    while (index-- > 0)
        if (predicate())
            return false
    return true
}

/** @internal */
export function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T,) => boolean, size: number,) {
    let index = -1
    while (++index < size)
        if (predicate(collection.get(index,),))
            return false
    return true
}

/** @internal */
export function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T, index: number,) => boolean, size: number,) {
    let index = -1
    while (++index < size)
        if (predicate(collection.get(index,), index,))
            return false
    return true
}

//#endregion -------------------- Loop methods --------------------
