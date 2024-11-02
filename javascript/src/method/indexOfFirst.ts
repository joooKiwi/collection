/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {BooleanCallback}            from "../type/callback"

import {EmptyCollectionException}       from "../exception/EmptyCollectionException"
import {IndexOutOfBoundsException}      from "../exception/IndexOutOfBoundsException"
import {InvalidIndexRangeException}     from "../exception/InvalidIndexRangeException"
import {NullCollectionException}        from "../exception/NullCollectionException"
import {__endingIndex, __startingIndex} from "./_indexes utility"
import {isArray}                        from "./isArray"
import {isArrayByStructure}             from "./isArrayByStructure"
import {isCollectionHolder}             from "./isCollectionHolder"
import {isCollectionHolderByStructure}  from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get the first index matching the {@link predicate}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {number} The index matching the {@link predicate} within the range
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws IndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see ReadonlyArray.findIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfFirst<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): number {
    if (collection == null)
        throw new NullCollectionException()
    if (isCollectionHolder<T>(collection,))
        return indexOfFirstByCollectionHolder(collection, predicate, fromIndex, toIndex,)
    if (isArray(collection,))
        return indexOfFirstByArray(collection, predicate, fromIndex, toIndex,)
    if (isCollectionHolderByStructure<T>(collection,))
        return indexOfFirstByCollectionHolder(collection, predicate, fromIndex, toIndex,)
    if (isArrayByStructure<T>(collection,))
        return indexOfFirstByArray(collection, predicate, fromIndex, toIndex,)
    return indexOfFirstByMinimalistCollectionHolder(collection, predicate, fromIndex, toIndex,)
}


/**
 * Get the first index matching the {@link predicate}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {number} The index matching the {@link predicate} within the range
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws IndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see ReadonlyArray.findIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfFirstByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): number {
    if (collection == null)
        throw new NullCollectionException()

    const size = collection.size
    if (size === 0)
        throw new EmptyCollectionException()

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index "${toIndex}"${toIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`} is over the starting index "${fromIndex}"${fromIndex == startingIndex ? "" : `("${startingIndex}" after calculation)`}.`, fromIndex, toIndex,)
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, startingIndex, endingIndex,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, startingIndex, endingIndex,)
    return __with0Argument(predicate as () => boolean, startingIndex, endingIndex,)
}

/**
 * Get the first index matching the {@link predicate}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {number} The index matching the {@link predicate} within the range
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws IndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see ReadonlyArray.findIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfFirstByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): number {
    if (collection == null)
        throw new NullCollectionException()
    if (collection.isEmpty)
        throw new EmptyCollectionException()

    const size = collection.size
    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index "${toIndex}"${toIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`} is over the starting index "${fromIndex}"${fromIndex == startingIndex ? "" : `("${startingIndex}" after calculation)`}.`, fromIndex, toIndex,)
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, startingIndex, endingIndex,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, startingIndex, endingIndex,)
    return __with0Argument(predicate as () => boolean, startingIndex, endingIndex,)
}

/**
 * Get the first index matching the {@link predicate}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {number} The index matching the {@link predicate} within the range
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws IndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @see ReadonlyArray.findIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfFirstByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): number {
    if (collection == null)
        throw new NullCollectionException()

    const size = collection.length
    if (size === 0)
        throw new EmptyCollectionException()

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index "${toIndex}"${toIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`} is over the starting index "${fromIndex}"${fromIndex == startingIndex ? "" : `("${startingIndex}" after calculation)`}.`, fromIndex, toIndex,)
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
    throw new IndexOutOfBoundsException(`Index out of bound. No index could be found from the starting (“${startingIndex}”) to the ending (“${endingIndex}”) indexes in the collection.`, index,)
}


function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (predicate(collection.get(index,),))
            return index
    throw new IndexOutOfBoundsException(`Index out of bound. No index could be found from the starting (“${startingIndex}”) to the ending (“${endingIndex}”) indexes in the collection.`, index,)
}

function __with1ArgumentByArray<const T, >(collection: readonly T[], predicate: (value: T,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (predicate(collection[index] as T,))
            return index
    throw new IndexOutOfBoundsException(`Index out of bound. No index could be found from the starting (“${startingIndex}”) to the ending (“${endingIndex}”) indexes in the collection.`, index,)
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T, index: number,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (predicate(collection.get(index,), index,))
            return index
    throw new IndexOutOfBoundsException(`Index out of bound. No index could be found from the starting (“${startingIndex}”) to the ending (“${endingIndex}”) indexes in the collection.`, index,)
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], predicate: (value: T, index: number,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (predicate(collection[index] as T, index,))
            return index
    throw new IndexOutOfBoundsException(`Index out of bound. No index could be found from the starting (“${startingIndex}”) to the ending (“${endingIndex}”) indexes in the collection.`, index,)
}

//#endregion -------------------- Loop methods --------------------
