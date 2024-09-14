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

//#region -------------------- Facade method --------------------

/**
 * Tell if the {@link collection} {@link CollectionHolder.isEmpty is empty}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @return {boolean} <b>true</b> if null is received or the {@link collection} <b>is empty</b> otherwise
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none()
 * @extensionFunction
 */
export function none<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["isEmpty"]
/**
 * Tell if the {@link collection} <b>is empty</b>
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
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
export function none<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (collection == null)
        return true
    if (isCollectionHolder<T>(collection,))
        return noneByCollectionHolder(collection, predicate,)
    if (isCollectionHolderByStructure<T>(collection,))
        return noneByCollectionHolder(collection, predicate,)
    return noneByMinimalistCollectionHolder(collection, predicate,)
}


/**
 * Tell if the {@link collection} <b>is empty</b>
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @return {boolean} <b>true</b> if null is received or the {@link collection} <b>is empty</b> otherwise
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none()
 * @extensionFunction
 */
export function noneByMinimalistCollectionHolder<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: Nullable<COLLECTION>,): COLLECTION["size"] extends 0 ? true : COLLECTION["size"] extends number ? boolean : false
/**
 * Check if <b>no</b> element in the {@link collection}
 * match the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate The given predicate
 * @return {boolean} <b>false</b> if at least one {@link predicate} is <b>true</b> on a value of the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none(predicate)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#noneMatch(java.util.function.Predicate) Java noneMatch(predicate)
 * @extensionFunction
 */
export function noneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): boolean
export function noneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (collection == null)
        return true
    if (predicate == null)
        return collection.size == 0

    const size = collection.size
    if (size == 0)
        return true
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, size,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, size,)
    return __with0Argument(predicate as () => boolean, size,)
}

/**
 * Tell if the {@link collection} {@link CollectionHolder.isEmpty is empty}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @return {boolean} <b>true</b> if null is received or the {@link collection} <b>is empty</b> otherwise
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none()
 * @extensionFunction
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
 */
export function noneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: Nullable<BooleanCallback<T>>,): boolean
export function noneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate?: Nullable<BooleanCallback<T>>,) {
    if (collection == null)
        return true
    if (predicate == null)
        return collection.isEmpty
    if (collection.isEmpty)
        return true
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, collection.size,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, collection.size,)
    return __with0Argument(predicate as () => boolean, collection.size,)
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
