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

import {CollectionConstants}                               from "../CollectionConstants"
import {__endingIndex, __startingIndex, __validateInRange} from "./_indexes utility"
import {isArray}                                           from "./isArray"
import {isArrayByStructure}                                from "./isArrayByStructure"
import {isCollectionHolder}                                from "./isCollectionHolder"
import {isCollectionHolderByStructure}                     from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}                      from "./isMinimalistCollectionHolder"

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
export function sliceWithARange<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting} to the {@link to ending} index in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param from       The inclusive starting index (<code>0</code> by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException {@link from} is not within a valid range
 * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARange<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, from: NullableNumber,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting} to the {@link to ending} index
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param from       The inclusive starting index (<code>0</code> by default)
 * @param to         The inclusive ending index (<code>size - 1</code> by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithARange<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, from: NullableNumber, to: NullableNumber,): CollectionHolder<T>
export function sliceWithARange<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (to == null)
        if (from == null)
            return __core0(collection,)
        else
            return __core1(collection, from,)
    if (from == null)
        return __coreWithNoFrom(collection, to,)
    return __core2(collection, from, to,)
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
 * @param from       The inclusive starting index (<code>0</code> by default)
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
 * @param from       The inclusive starting index (<code>0</code> by default)
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
    if (to == null)
        if (from == null)
            return __core0ByMinimalistCollectionHolder(collection,)
        else
            return __core1ByMinimalistCollectionHolder(collection, from,)
    if (from == null)
        return __coreWithNoFromByMinimalistCollectionHolder(collection, to,)
    return __core2ByMinimalistCollectionHolder(collection, from, to,)
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
 * @param from       The inclusive starting index (<code>0</code> by default)
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
 * @param from       The inclusive starting index (<code>0</code> by default)
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
    if (to == null)
        if (from == null)
            return __core0ByCollectionHolder(collection,)
        else
            return __core1ByCollectionHolder(collection, from,)
    if (from == null)
        return __coreWithNoFromByCollectionHolder(collection, to,)
    return __core2ByCollectionHolder(collection, from, to,)
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
 * @param from       The inclusive starting index (<code>0</code> by default)
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
 * @param from       The inclusive starting index (<code>0</code> by default)
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
    if (to == null)
        if (from == null)
            return __core0ByArray(collection,)
        else
            return __core1ByArray(collection, from,)
    if (from == null)
        return __coreWithNoFromByArray(collection, to,)
    return __core2ByArray(collection, from, to,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Core method --------------------

//#region -------------------- ∅ --------------------

function __core0<const T, >(collection: | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[],) {
    if (isCollectionHolder(collection,))
        return __core0ByCollectionHolder(collection,)
    if (isArray(collection,))
        return __core0ByArray(collection,)
    if (isMinimalistCollectionHolder(collection,))
        return __core0ByMinimalistCollectionHolder(collection,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __core0ByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return __core0ByArray(collection,)
    return __core0ByMinimalistCollectionHolder(collection,)
}

function __core0ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>,) {
    const size = collection.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRange(collection, 0, size - 1,),)
}

function __core0ByCollectionHolder<const T, >(collection: CollectionHolder<T>,) {
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRange(collection, 0, collection.size - 1,),)
}

function __core0ByArray<const T, >(collection: readonly T[],) {
    const size = collection.length
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRangeByArray(collection, 0, size - 1,),)
}

//#endregion -------------------- ∅ --------------------
//#region -------------------- from --------------------

function __core1<const T, >(collection: | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[], from: number,) {
    if (isCollectionHolder(collection,))
        return __core1ByCollectionHolder(collection, from,)
    if (isArray(collection,))
        return __core1ByArray(collection, from,)
    if (isMinimalistCollectionHolder(collection,))
        return __core1ByMinimalistCollectionHolder(collection, from,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __core1ByCollectionHolder(collection, from,)
    if (isArrayByStructure<T>(collection,))
        return __core1ByArray(collection, from,)
    return __core1ByMinimalistCollectionHolder(collection, from,)
}

function __core1ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, from: number,) {
    const size = collection.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const startingIndex = __startingIndex(from, size,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRange(collection, startingIndex, size - 1,),)
}

function __core1ByCollectionHolder<const T, >(collection: CollectionHolder<T>, from: number,) {
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    const startingIndex = __startingIndex(from, size,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRange(collection, startingIndex, size - 1,),)
}

function __core1ByArray<const T, >(collection: readonly T[], from: number,) {
    const size = collection.length
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const startingIndex = __startingIndex(from, size,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRangeByArray(collection, startingIndex, size - 1,),)
}

//#endregion -------------------- from --------------------
//#region -------------------- from, to --------------------

function __core2<const T, >(collection: | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[], from: number, to: number,) {
    if (isCollectionHolder(collection,))
        return __core2ByCollectionHolder(collection, from, to,)
    if (isArray(collection,))
        return __core2ByArray(collection, from, to,)
    if (isMinimalistCollectionHolder(collection,))
        return __core2ByMinimalistCollectionHolder(collection, from, to,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __core2ByCollectionHolder(collection, from, to,)
    if (isArrayByStructure<T>(collection,))
        return __core2ByArray(collection, from, to,)
    return __core2ByMinimalistCollectionHolder(collection, from, to,)
}

function __core2ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, from: number, to: number,) {
    const size = collection.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    __validateInRange(from, startingIndex, to, endingIndex,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRange(collection, startingIndex, endingIndex,),)
}

function __core2ByCollectionHolder<const T, >(collection: CollectionHolder<T>, from: number, to: number,) {
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    __validateInRange(from, startingIndex, to, endingIndex,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRange(collection, startingIndex, endingIndex,),)
}

function __core2ByArray<const T, >(collection: readonly T[], from: number, to: number,) {
    const size = collection.length
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    __validateInRange(from, startingIndex, to, endingIndex,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRangeByArray(collection, startingIndex, endingIndex,),)
}

//#endregion -------------------- from, to --------------------
//#region -------------------- to --------------------

function __coreWithNoFrom<const T, >(collection: | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[], to: number,) {
    if (isCollectionHolder(collection,))
        return __coreWithNoFromByCollectionHolder(collection, to,)
    if (isArray(collection,))
        return __coreWithNoFromByArray(collection, to,)
    if (isMinimalistCollectionHolder(collection,))
        return __coreWithNoFromByMinimalistCollectionHolder(collection, to,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __coreWithNoFromByCollectionHolder(collection, to,)
    if (isArrayByStructure<T>(collection,))
        return __coreWithNoFromByArray(collection, to,)
    return __coreWithNoFromByMinimalistCollectionHolder(collection, to,)
}

function __coreWithNoFromByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, to: number,) {
    const size = collection.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const endingIndex = __endingIndex(to, size,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRange(collection, 0, endingIndex,),)
}

function __coreWithNoFromByCollectionHolder<const T, >(collection: CollectionHolder<T>, to: number,) {
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const endingIndex = __endingIndex(to, collection.size,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRange(collection, 0, endingIndex,),)
}

function __coreWithNoFromByArray<const T, >(collection: readonly T[], to: number,) {
    const size = collection.length
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const endingIndex = __endingIndex(to, size,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __newArrayInRangeByArray(collection, 0, endingIndex,),)
}

//#endregion -------------------- to --------------------

//#endregion -------------------- Core method --------------------
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
