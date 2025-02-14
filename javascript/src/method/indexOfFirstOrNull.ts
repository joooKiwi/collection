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
import type {BooleanCallback}            from "../type/callback"

import {__endingIndexOrNull, __startingIndexOrNull} from "./_indexes utility"
import {isArray}                                    from "./isArray"
import {isArrayByStructure}                         from "./isArrayByStructure"
import {isCollectionHolder}                         from "./isCollectionHolder"
import {isCollectionHolderByStructure}              from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get the first index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (`size - 1` by default)
 * @return {NullOrNumber} The index matching the {@link predicate} found or <b>null</b>
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfFirstOrNull<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>, from: NullableNumber = null, to: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (isCollectionHolder<T>(collection,))
        return indexOfFirstOrNullByCollectionHolder(collection, predicate, fromIndex, toIndex,)
    if (isArray(collection,))
        return indexOfFirstOrNullByArray(collection, predicate, fromIndex, toIndex,)
    if (isCollectionHolderByStructure<T>(collection,))
        return indexOfFirstOrNullByCollectionHolder(collection, predicate, fromIndex, toIndex,)
    if (isArrayByStructure<T>(collection,))
        return indexOfFirstOrNullByArray(collection, predicate, fromIndex, toIndex,)
    return indexOfFirstOrNullByMinimalistCollectionHolder(collection, predicate, fromIndex, toIndex,)
}


/**
 * Get the first index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link MinimalistCollectionHolder.size size} - 1</code> by default)
 * @return {NullOrNumber} The index matching the {@link predicate} found or <b>null</b>
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfFirstOrNullByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>, from: NullableNumber = null, to: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null

    const size = collection.size
    if (size === 0)
        return null

    const startingIndex = __startingIndexOrNull(fromIndex, size,)
    if (startingIndex == null)
        return null

    const endingIndex = __endingIndexOrNull(toIndex, size,)
    if (endingIndex == null)
        return null
    if (endingIndex < startingIndex)
        return null
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, startingIndex, endingIndex,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, startingIndex, endingIndex,)
    return __with0Argument(predicate as () => boolean, startingIndex, endingIndex,)
}

/**
 * Get the first index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
 * @return {NullOrNumber} The index matching the {@link predicate} found or <b>null</b>
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfFirstOrNullByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>, from: NullableNumber = null, to: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    const size = collection.size
    const startingIndex = __startingIndexOrNull(fromIndex, size,)
    if (startingIndex == null)
        return null

    const endingIndex = __endingIndexOrNull(toIndex, size,)
    if (endingIndex == null)
        return null
    if (endingIndex < startingIndex)
        return null
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, startingIndex, endingIndex,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, startingIndex, endingIndex,)
    return __with0Argument(predicate as () => boolean, startingIndex, endingIndex,)
}

/**
 * Get the first index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link ReadonlyArray.length size} - 1</code> by default)
 * @return {NullOrNumber} The index matching the {@link predicate} found or <b>null</b>
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfFirstOrNullByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>, from: NullableNumber = null, to: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null

    const size = collection.length
    if (size === 0)
        return null

    const startingIndex = __startingIndexOrNull(fromIndex, size,)
    if (startingIndex == null)
        return null

    const endingIndex = __endingIndexOrNull(toIndex, size,)
    if (endingIndex == null)
        return null
    if (endingIndex < startingIndex)
        return null
    if (predicate.length == 1)
        return __with1ArgumentByArray(collection, predicate as (value: T,) => boolean, startingIndex, endingIndex,)
    if (predicate.length >= 2)
        return __with2ArgumentByArray(collection, predicate, startingIndex, endingIndex,)
    return __with0Argument(predicate as () => boolean, startingIndex, endingIndex,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument(predicate: () => boolean, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (predicate())
            return index
    return null
}


function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (predicate(collection.get(index,),))
            return index
    return null
}

function __with1ArgumentByArray<const T, >(collection: readonly T[], predicate: (value: T,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (predicate(collection[index] as T,))
            return index
    return null
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T, index: number,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (predicate(collection.get(index,), index,))
            return index
    return null
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], predicate: (value: T, index: number,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (predicate(collection[index] as T, index,))
            return index
    return null
}

//#endregion -------------------- Loop methods --------------------
