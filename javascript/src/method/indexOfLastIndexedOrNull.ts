//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Nullable, NullableNumber, NullOrNumber} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {ReverseBooleanCallback}     from "../type/callback"

import {__endingIndexOrNull, __startingIndexOrNull} from "./_indexes utility"
import {isArray}                                    from "./isArray"
import {isArrayByStructure}                         from "./isArrayByStructure"
import {isCollectionHolder}                         from "./isCollectionHolder"
import {isCollectionHolderByStructure}              from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}               from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Get the last index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (`size - 1` by default)
 * @return {NullOrNumber} The last index found by the {@link predicate} between {@link from} and {@link to} or <b>null</b>
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastIndexedOrNull<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, predicate: ReverseBooleanCallback<T>, from: NullableNumber = null, to: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (to == null)
        if (from == null)
            return __core0(collection, predicate,)
        else
            return __core1(collection, predicate, from,)
    if (from == null)
        return __coreWithNoFrom(collection, predicate, to,)
    return __core2(collection, predicate, from, to,)
}


/**
 * Get the last index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link MinimalistCollectionHolder.size size} - 1</code> by default)
 * @return {NullOrNumber} The last index found by the {@link predicate} between {@link from} and {@link to} or <b>null</b>
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastIndexedOrNullByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>, from: NullableNumber = null, to: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (to == null)
        if (from == null)
            return __core0ByMinimalistCollectionHolder(collection, predicate,)
        else
            return __core1ByMinimalistCollectionHolder(collection, predicate, from,)
    if (from == null)
        return __coreWithNoFromByMinimalistCollectionHolder(collection, predicate, to,)
    return __core2ByMinimalistCollectionHolder(collection, predicate, from, to,)
}

/**
 * Get the last index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
 * @return {NullOrNumber} The last index found by the {@link predicate} between {@link from} and {@link to} or <b>null</b>
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastIndexedOrNullByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>, from: NullableNumber = null, to: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (to == null)
        if (from == null)
            return __core0ByCollectionHolder(collection, predicate,)
        else
            return __core1ByCollectionHolder(collection, predicate, from,)
    if (from == null)
        return __coreWithNoFromByCollectionHolder(collection, predicate, to,)
    return __core2ByCollectionHolder(collection, predicate, from, to,)
}

/**
 * Get the last index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link ReadonlyArray.length size} - 1</code> by default)
 * @return {NullOrNumber} The last index found by the {@link predicate} between {@link from} and {@link to} or <b>null</b>
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastIndexedOrNullByArray<const T, >(collection: Nullable<readonly T[]>, predicate: ReverseBooleanCallback<T>, from: NullableNumber = null, to: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (to == null)
        if (from == null)
            return __core0ByArray(collection, predicate,)
        else
            return __core1ByArray(collection, predicate, from,)
    if (from == null)
        return __coreWithNoFromByArray(collection, predicate, to,)
    return __core2ByArray(collection, predicate, from, to,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Core methods --------------------

//#region -------------------- predicate --------------------

function __core0<const T, >(collection: | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[], predicate: ReverseBooleanCallback<T>,) {
    if (isCollectionHolder(collection,))
        return __core0ByCollectionHolder(collection, predicate,)
    if (isArray(collection,))
        return __core0ByArray(collection, predicate,)
    if (isMinimalistCollectionHolder(collection,))
        return __core0ByMinimalistCollectionHolder(collection, predicate,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __core0ByCollectionHolder(collection, predicate,)
    if (isArrayByStructure<T>(collection,))
        return __core0ByArray(collection, predicate,)
    return __core0ByMinimalistCollectionHolder(collection, predicate,)
}

function __core0ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, predicate: ReverseBooleanCallback<T>,) {
    const size = collection.size
    if (size === 0)
        return null
    if (predicate.length == 1)
        return __with1Argument(predicate as (value: number,) => boolean, 0, size - 1,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, 0, size - 1,)
    return __with0Argument(predicate as () => boolean, 0, size - 1,)
}

function __core0ByCollectionHolder<const T, >(collection: CollectionHolder<T>, predicate: ReverseBooleanCallback<T>,) {
    if (collection.isEmpty)
        return null
    if (predicate.length == 1)
        return __with1Argument(predicate as (value: number,) => boolean, 0, collection.size - 1,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, 0, collection.size - 1,)
    return __with0Argument(predicate as () => boolean, 0, collection.size - 1,)
}

function __core0ByArray<const T, >(collection: readonly T[], predicate: ReverseBooleanCallback<T>,): NullOrNumber {
    const size = collection.length
    if (size === 0)
        return null
    if (predicate.length == 1)
        return __with1Argument(predicate as (value: number,) => boolean, 0, size - 1,)
    if (predicate.length >= 2)
        return __with2ArgumentByArray(collection, predicate, 0, size - 1,)
    return __with0Argument(predicate as () => boolean, 0, size - 1,)
}

//#endregion -------------------- predicate --------------------
//#region -------------------- predicate, from --------------------

function __core1<const T, >(collection: | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[], predicate: ReverseBooleanCallback<T>, from: number,) {
    if (isCollectionHolder(collection,))
        return __core1ByCollectionHolder(collection, predicate, from,)
    if (isArray(collection,))
        return __core1ByArray(collection, predicate, from,)
    if (isMinimalistCollectionHolder(collection,))
        return __core1ByMinimalistCollectionHolder(collection, predicate, from,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __core1ByCollectionHolder(collection, predicate, from,)
    if (isArrayByStructure<T>(collection,))
        return __core1ByArray(collection, predicate, from,)
    return __core1ByMinimalistCollectionHolder(collection, predicate, from,)
}

function __core1ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, predicate: ReverseBooleanCallback<T>, from: number,) {
    const size = collection.size
    if (size === 0)
        return null

    const startingIndex = __startingIndexOrNull(from, size,)
    if (startingIndex == null)
        return null
    if (predicate.length == 1)
        return __with1Argument(predicate as (value: number,) => boolean, startingIndex, size - 1,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, startingIndex, size - 1,)
    return __with0Argument(predicate as () => boolean, startingIndex, size - 1,)
}

function __core1ByCollectionHolder<const T, >(collection: CollectionHolder<T>, predicate: ReverseBooleanCallback<T>, from: number,) {
    if (collection.isEmpty)
        return null

    const size = collection.size
    const startingIndex = __startingIndexOrNull(from, size,)
    if (startingIndex == null)
        return null
    if (predicate.length == 1)
        return __with1Argument(predicate as (value: number,) => boolean, startingIndex, size - 1,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, startingIndex, size - 1,)
    return __with0Argument(predicate as () => boolean, startingIndex, size - 1,)
}

function __core1ByArray<const T, >(collection: readonly T[], predicate: ReverseBooleanCallback<T>, from: number,) {
    const size = collection.length
    if (size === 0)
        return null

    const startingIndex = __startingIndexOrNull(from, size,)
    if (startingIndex == null)
        return null
    if (predicate.length == 1)
        return __with1Argument(predicate as (value: number,) => boolean, startingIndex, size - 1,)
    if (predicate.length >= 2)
        return __with2ArgumentByArray(collection, predicate, startingIndex, size - 1,)
    return __with0Argument(predicate as () => boolean, startingIndex, size - 1,)
}

//#endregion -------------------- predicate, from --------------------
//#region -------------------- predicate, from, to --------------------

function __core2<const T, >(collection: | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[], predicate: ReverseBooleanCallback<T>, from: number, to: number,) {
    if (isCollectionHolder(collection,))
        return __core2ByCollectionHolder(collection, predicate, from, to,)
    if (isArray(collection,))
        return __core2ByArray(collection, predicate, from, to,)
    if (isMinimalistCollectionHolder(collection,))
        return __core2ByMinimalistCollectionHolder(collection, predicate, from, to,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __core2ByCollectionHolder(collection, predicate, from, to,)
    if (isArrayByStructure<T>(collection,))
        return __core2ByArray(collection, predicate, from, to,)
    return __core2ByMinimalistCollectionHolder(collection, predicate, from, to,)
}

function __core2ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, predicate: ReverseBooleanCallback<T>, from: number, to: number,) {
    const size = collection.size
    if (size === 0)
        return null

    const startingIndex = __startingIndexOrNull(from, size,)
    if (startingIndex == null)
        return null

    const endingIndex = __endingIndexOrNull(to, size,)
    if (endingIndex == null)
        return null
    if (endingIndex < startingIndex)
        return null
    if (predicate.length == 1)
        return __with1Argument(predicate as (value: number,) => boolean, startingIndex, endingIndex,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, startingIndex, endingIndex,)
    return __with0Argument(predicate as () => boolean, startingIndex, endingIndex,)
}

function __core2ByCollectionHolder<const T, >(collection: CollectionHolder<T>, predicate: ReverseBooleanCallback<T>, from: number, to: number,) {
    if (collection.isEmpty)
        return null

    const size = collection.size
    const startingIndex = __startingIndexOrNull(from, size,)
    if (startingIndex == null)
        return null

    const endingIndex = __endingIndexOrNull(to, size,)
    if (endingIndex == null)
        return null
    if (endingIndex < startingIndex)
        return null
    if (predicate.length == 1)
        return __with1Argument(predicate as (value: number,) => boolean, startingIndex, endingIndex,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, startingIndex, endingIndex,)
    return __with0Argument(predicate as () => boolean, startingIndex, endingIndex,)
}

function __core2ByArray<const T, >(collection: readonly T[], predicate: ReverseBooleanCallback<T>, from: number, to: number,) {
    const size = collection.length
    if (size === 0)
        return null

    const startingIndex = __startingIndexOrNull(from, size,)
    if (startingIndex == null)
        return null

    const endingIndex = __endingIndexOrNull(to, size,)
    if (endingIndex == null)
        return null
    if (endingIndex < startingIndex)
        return null
    if (predicate.length == 1)
        return __with1Argument(predicate as (value: number,) => boolean, startingIndex, endingIndex,)
    if (predicate.length >= 2)
        return __with2ArgumentByArray(collection, predicate, startingIndex, endingIndex,)
    return __with0Argument(predicate as () => boolean, startingIndex, endingIndex,)
}

//#endregion -------------------- predicate, from, to --------------------
//#region -------------------- predicate, to --------------------

function __coreWithNoFrom<const T, >(collection: | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[], predicate: ReverseBooleanCallback<T>, to: number,) {
    if (isCollectionHolder(collection,))
        return __coreWithNoFromByCollectionHolder(collection, predicate, to,)
    if (isArray(collection,))
        return __coreWithNoFromByArray(collection, predicate, to,)
    if (isMinimalistCollectionHolder(collection,))
        return __coreWithNoFromByMinimalistCollectionHolder(collection, predicate, to,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __coreWithNoFromByCollectionHolder(collection, predicate, to,)
    if (isArrayByStructure<T>(collection,))
        return __coreWithNoFromByArray(collection, predicate, to,)
    return __coreWithNoFromByMinimalistCollectionHolder(collection, predicate, to,)
}

function __coreWithNoFromByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, predicate: ReverseBooleanCallback<T>, to: number,) {
    const size = collection.size
    if (size === 0)
        return null

    const endingIndex = __endingIndexOrNull(to, size,)
    if (endingIndex == null)
        return null
    if (predicate.length == 1)
        return __with1Argument(predicate as (value: number,) => boolean, 0, endingIndex,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, 0, endingIndex,)
    return __with0Argument(predicate as () => boolean, 0, endingIndex,)
}

function __coreWithNoFromByCollectionHolder<const T, >(collection: CollectionHolder<T>, predicate: ReverseBooleanCallback<T>, to: number,) {
    if (collection.isEmpty)
        return null

    const endingIndex = __endingIndexOrNull(to, collection.size,)
    if (endingIndex == null)
        return null
    if (predicate.length == 1)
        return __with1Argument(predicate as (value: number,) => boolean, 0, endingIndex,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, 0, endingIndex,)
    return __with0Argument(predicate as () => boolean, 0, endingIndex,)
}

function __coreWithNoFromByArray<const T, >(collection: readonly T[], predicate: ReverseBooleanCallback<T>, to: number,) {
    const size = collection.length
    if (size === 0)
        return null

    const endingIndex = __endingIndexOrNull(to, size,)
    if (endingIndex == null)
        return null
    if (predicate.length == 1)
        return __with1Argument(predicate as (value: number,) => boolean, 0, endingIndex,)
    if (predicate.length >= 2)
        return __with2ArgumentByArray(collection, predicate, 0, endingIndex,)
    return __with0Argument(predicate as () => boolean, 0, endingIndex,)
}

//#endregion -------------------- predicate, to --------------------

//#endregion -------------------- Core methods --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument(predicate: () => boolean, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate())
            return index
    return null
}


function __with1Argument(predicate: (index: number,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate(index,))
            return index
    return null
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (index: number, value: T,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate(index, collection.get(index,),))
            return index
    return null
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], predicate: (index: number, value: T,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate(index, collection[index] as T,))
            return index
    return null
}

//#endregion -------------------- Loop methods --------------------
