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

import type {Nullable, NullableNumber} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}            from "../CollectionConstants"
import {InvalidIndexRangeException}     from "../exception/InvalidIndexRangeException"
import {__endingIndex, __startingIndex} from "./_indexes utility"
import {isArray}                        from "./isArray"
import {isArrayByStructure}             from "./isArrayByStructure"
import {isCollectionHolder}             from "./isCollectionHolder"
import {isCollectionHolderByStructure}  from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link CollectionHolder}
 * from the {@link fromIndex starting} to the {@link toIndex ending} index
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param fromIndex The inclusive starting index
 * @param toIndex   The inclusive ending index
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws IndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARange<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return sliceWithARangeByCollectionHolder(collection, fromIndex, toIndex,)
    if (isArray(collection,))
        return sliceWithARangeByArray(collection, fromIndex, toIndex,)
    if (isCollectionHolderByStructure<T>(collection,))
        return sliceWithARangeByCollectionHolder(collection, fromIndex, toIndex,)
    if (isArrayByStructure<T>(collection,))
        return sliceWithARangeByArray(collection, fromIndex, toIndex,)
    return sliceWithARangeByMinimalistCollectionHolder(collection, fromIndex, toIndex,)
}


/**
 * Create a new {@link CollectionHolder}
 * from the {@link fromIndex starting} to the {@link toIndex ending} index
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param fromIndex The inclusive starting index
 * @param toIndex   The inclusive ending index
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws IndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARangeByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index "${toIndex}"${toIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`} is over the starting index "${fromIndex}"${fromIndex == startingIndex ? "" : `("${startingIndex}" after calculation)`}.`, fromIndex, toIndex,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRange(collection, startingIndex, endingIndex,),)
}

/**
 * Create a new {@link CollectionHolder}
 * from the {@link fromIndex starting} to the {@link toIndex ending} index
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param fromIndex The inclusive starting index
 * @param toIndex   The inclusive ending index
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws IndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARangeByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index "${toIndex}"${toIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`} is over the starting index "${fromIndex}"${fromIndex == startingIndex ? "" : `("${startingIndex}" after calculation)`}.`, fromIndex, toIndex,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRange(collection, startingIndex, endingIndex,),)
}

/**
 * Create a new {@link CollectionHolder}
 * from the {@link fromIndex starting} to the {@link toIndex ending} index
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param fromIndex The inclusive starting index
 * @param toIndex   The inclusive ending index
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws IndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARangeByArray<const T, >(collection: Nullable<readonly T[]>, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.length
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index "${toIndex}"${toIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`} is over the starting index "${fromIndex}"${fromIndex == startingIndex ? "" : `("${startingIndex}" after calculation)`}.`, fromIndex, toIndex,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRangeByArray(collection, startingIndex, endingIndex,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __newArrayInRange<const T, >(collection: MinimalistCollectionHolder<T>, startingIndex: number, endingIndex: number,) {
    const newArray: T[] = []
    let index = startingIndex - 1
    while (++index <= endingIndex)
        newArray.push(collection.get(index,),)
    return Object.freeze(newArray,)
}

function __newArrayInRangeByArray<const T, >(collection: readonly T[], startingIndex: number, endingIndex: number,) {
    const newArray: T[] = []
    let index = startingIndex - 1
    while (++index <= endingIndex)
        newArray.push(collection[index] as T,)
    return Object.freeze(newArray,)
}

//#endregion -------------------- Loop methods --------------------
