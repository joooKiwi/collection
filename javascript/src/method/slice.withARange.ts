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
 * with all the values in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARange<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting} to the {@link to ending} index in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param from       The inclusive starting index (`0` by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException {@link from} is not within a valid range
 * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARange<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, from: NullableNumber,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting} to the {@link to ending} index
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (`size - 1` by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARange<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, from: NullableNumber, to: NullableNumber,): CollectionHolder<T>
export function sliceWithARange<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return sliceWithARangeByCollectionHolder(collection, from, to,)
    if (isArray(collection,))
        return sliceWithARangeByArray(collection, from, to,)
    if (isCollectionHolderByStructure<T>(collection,))
        return sliceWithARangeByCollectionHolder(collection, from, to,)
    if (isArrayByStructure<T>(collection,))
        return sliceWithARangeByArray(collection, from, to,)
    return sliceWithARangeByMinimalistCollectionHolder(collection, from, to,)
}


/**
 * Create a new {@link CollectionHolder}
 * with all the values in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARangeByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting} to the {@link to ending} index in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param from       The inclusive starting index (`0` by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link from} is not within a valid range
 * @throws ForbiddenIndexException    {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARangeByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, from: NullableNumber,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting} to the {@link to ending} index
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link MinimalistCollectionHolder.size size} - 1</code> by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARangeByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, from: NullableNumber, to: NullableNumber,): CollectionHolder<T>
export function sliceWithARangeByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index “${to}”${to == endingIndex ? "" : ` (“${endingIndex}” after calculation)`} is over the starting index “${from}”${from == startingIndex ? "" : ` (“${startingIndex}” after calculation)`}.`, from, to,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRange(collection, startingIndex, endingIndex,),)
}

/**
 * Create a new {@link CollectionHolder}
 * with all the values in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARangeByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting} to the {@link to ending} index in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param from       The inclusive starting index (`0` by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException {@link from} is not within a valid range
 * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARangeByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, from: NullableNumber,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting} to the {@link to ending} index
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before the {@link from} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARangeByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, from: NullableNumber, to: NullableNumber,): CollectionHolder<T>
export function sliceWithARangeByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index “${to}”${to == endingIndex ? "" : ` (“${endingIndex}” after calculation)`} is over the starting index “${from}”${from == startingIndex ? "" : ` (“${startingIndex}” after calculation)`}.`, from, to,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRange(collection, startingIndex, endingIndex,),)
}

/**
 * Create a new {@link CollectionHolder}
 * with all the values in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARangeByArray<const T, >(collection: Nullable<readonly T[]>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting} to the {@link to ending} index in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param from       The inclusive starting index (`0` by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException {@link from} is not within a valid range
 * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARangeByArray<const T, >(collection: Nullable<readonly T[]>, from: NullableNumber,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting} to the {@link to ending} index in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link ReadonlyArray.length size} - 1</code> by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARangeByArray<const T, >(collection: Nullable<readonly T[]>, from: NullableNumber, to: NullableNumber,): CollectionHolder<T>
export function sliceWithARangeByArray<const T, >(collection: Nullable<readonly T[]>, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.length
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    if (endingIndex < startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index “${to}”${to == endingIndex ? "" : ` (“${endingIndex}” after calculation)`} is over the starting index “${from}”${from == startingIndex ? "" : ` (“${startingIndex}” after calculation)`}.`, from, to,)
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
