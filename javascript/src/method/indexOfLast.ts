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
import type {BooleanCallback}            from "../type/callback"

import {EmptyCollectionException}                          from "../exception/EmptyCollectionException"
import {IndexOutOfBoundsException}                         from "../exception/IndexOutOfBoundsException"
import {NullCollectionException}                           from "../exception/NullCollectionException"
import {__endingIndex, __startingIndex, __validateInRange} from "./_indexes utility"
import {isArray}                                           from "./isArray"
import {isArrayByStructure}                                from "./isArrayByStructure"
import {isCollectionHolder}                                from "./isCollectionHolder"
import {isCollectionHolderByStructure}                     from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get the last index matching the {@link predicate}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @return {number} The last index found by the {@link predicate}
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException No index could be found
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLast<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>,): number
/**
 * Get the last index matching the {@link predicate}
 * between the {@link from starting index} and the end of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @param from       The inclusive starting index (`0` by default)
 * @return {number} The last index found by the {@link predicate} after {@link from}
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException {@link from} is not within a valid range
 * @throws IndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLast<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>, from: NullableNumber,): number
/**
 * Get the last index matching the {@link predicate}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param predicate  The given predicate
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (`size - 1` by default)
 * @return {number} The last index found by the {@link predicate} between {@link from} and {@link to}
 * @throws NullCollectionException    The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException   The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
 * @throws IndexOutOfBoundsException  No index could be found
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLast<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>, from: NullableNumber, to: NullableNumber,): number
export function indexOfLast<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, predicate: BooleanCallback<T>, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        throw new NullCollectionException()
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
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @return {number} The last index found by the {@link predicate}
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException No index could be found
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>,): number
/**
 * Get the last index matching the {@link predicate}
 * between the {@link from starting index} and the end of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @param from       The inclusive starting index (`0` by default)
 * @return {number} The last index found by the {@link predicate} after {@link from}
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException {@link from} is not within a valid range
 * @throws IndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>, from: NullableNumber,): number
/**
 * Get the last index matching the {@link predicate}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link MinimalistCollectionHolder.size size} - 1</code> by default)
 * @return {number} The last index found by the {@link predicate} between {@link from} and {@link to}
 * @throws NullCollectionException    The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException   The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
 * @throws IndexOutOfBoundsException  No index could be found
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>, from: NullableNumber, to: NullableNumber,): number
export function indexOfLastByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: BooleanCallback<T>, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        throw new NullCollectionException()
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
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @return {number} The last index found by the {@link predicate}
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No index could be found
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>,): number
/**
 * Get the last index matching the {@link predicate}
 * between the {@link from starting index} and the end of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @param from       The inclusive starting index (`0` by default)
 * @return {number} The last index found by the {@link predicate} after {@link from}
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException {@link from} is not within a valid range
 * @throws IndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>, from: NullableNumber,): number
/**
 * Get the last index matching the {@link predicate}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
 * @return {number} The last index found by the {@link predicate} between {@link from} and {@link to}
 * @throws NullCollectionException    The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException   The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
 * @throws IndexOutOfBoundsException  No index could be found
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>, from: NullableNumber, to: NullableNumber,): number
export function indexOfLastByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: BooleanCallback<T>, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        throw new NullCollectionException()
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
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @return {number} The last index found by the {@link predicate}
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException No index could be found
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>,): number
/**
 * Get the last index matching the {@link predicate}
 * between the {@link from starting index} and the end of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @param from       The inclusive starting index (`0` by default)
 * @return {number} The last index found by the {@link predicate} after {@link from}
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException {@link from} is not within a valid range
 * @throws IndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>, from: NullableNumber,): number
/**
 * Get the last index matching the {@link predicate}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param predicate  The given predicate
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link ReadonlyArray.length size} - 1</code> by default)
 * @return {number} The last index found by the {@link predicate} between {@link from} and {@link to}
 * @throws NullCollectionException    The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException   The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
 * @throws IndexOutOfBoundsException  No index could be found
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @see ReadonlyArray.findLastIndex
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfLastByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>, from: NullableNumber, to: NullableNumber,): number
export function indexOfLastByArray<const T, >(collection: Nullable<readonly T[]>, predicate: BooleanCallback<T>, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        throw new NullCollectionException()
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

function __core0<const T, >(collection: | MinimalistCollectionHolder<T> | readonly T[], predicate: BooleanCallback<T>,): number {
    if (isCollectionHolder<T>(collection,))
        return __core0ByCollectionHolder(collection, predicate,)
    if (isArray(collection,))
        return __core0ByArray(collection, predicate,)
    if (isCollectionHolderByStructure<T>(collection,))
        return __core0ByCollectionHolder(collection, predicate,)
    if (isArrayByStructure<T>(collection,))
        return __core0ByArray(collection, predicate,)
    return __core0ByMinimalistCollectionHolder(collection, predicate,)
}

function __core0ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, predicate: BooleanCallback<T>,): number {
    const size = collection.size
    if (size === 0)
        throw new EmptyCollectionException()
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, 0, size - 1,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, 0, size - 1,)
    return __with0Argument(predicate as () => boolean, 0, size - 1,)
}

function __core0ByCollectionHolder<const T, >(collection: CollectionHolder<T>, predicate: BooleanCallback<T>,): number {
    if (collection.isEmpty)
        throw new EmptyCollectionException()
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, 0, collection.size - 1,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, 0, collection.size - 1,)
    return __with0Argument(predicate as () => boolean, 0, collection.size - 1,)
}

function __core0ByArray<const T, >(collection: readonly T[], predicate: BooleanCallback<T>,): number {
    const size = collection.length
    if (size === 0)
        throw new EmptyCollectionException()
    if (predicate.length == 1)
        return __with1ArgumentByArray(collection, predicate as (value: T,) => boolean, 0, size - 1,)
    if (predicate.length >= 2)
        return __with2ArgumentByArray(collection, predicate, 0, size - 1,)
    return __with0Argument(predicate as () => boolean, 0, size - 1,)
}

//#endregion -------------------- predicate --------------------
//#region -------------------- predicate, from --------------------

function __core1<const T, >(collection: | MinimalistCollectionHolder<T> | readonly T[], predicate: BooleanCallback<T>, from: number,): number {
    if (isCollectionHolder<T>(collection,))
        return __core1ByCollectionHolder(collection, predicate, from,)
    if (isArray(collection,))
        return __core1ByArray(collection, predicate, from,)
    if (isCollectionHolderByStructure<T>(collection,))
        return __core1ByCollectionHolder(collection, predicate, from,)
    if (isArrayByStructure<T>(collection,))
        return __core1ByArray(collection, predicate, from,)
    return __core1ByMinimalistCollectionHolder(collection, predicate, from,)
}

function __core1ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, predicate: BooleanCallback<T>, from: number,): number {
    const size = collection.size
    if (size === 0)
        throw new EmptyCollectionException()
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, __startingIndex(from, size,), size - 1,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, __startingIndex(from, size,), size - 1,)
    return __with0Argument(predicate as () => boolean, __startingIndex(from, size,), size - 1,)
}

function __core1ByCollectionHolder<const T, >(collection: CollectionHolder<T>, predicate: BooleanCallback<T>, from: number,): number {
    if (collection.isEmpty)
        throw new EmptyCollectionException()

    const size = collection.size
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, __startingIndex(from, size,), size - 1,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, __startingIndex(from, size,), size - 1,)
    return __with0Argument(predicate as () => boolean, __startingIndex(from, size,), size - 1,)
}

function __core1ByArray<const T, >(collection: readonly T[], predicate: BooleanCallback<T>, from: number,): number {
    const size = collection.length
    if (size === 0)
        throw new EmptyCollectionException()
    if (predicate.length == 1)
        return __with1ArgumentByArray(collection, predicate as (value: T,) => boolean, __startingIndex(from, size,), size - 1,)
    if (predicate.length >= 2)
        return __with2ArgumentByArray(collection, predicate, __startingIndex(from, size,), size - 1,)
    return __with0Argument(predicate as () => boolean, __startingIndex(from, size,), size - 1,)
}

//#endregion -------------------- predicate, from --------------------
//#region -------------------- predicate, from, to --------------------

function __core2<const T, >(collection: | MinimalistCollectionHolder<T> | readonly T[], predicate: BooleanCallback<T>, from: number, to: number,): number {
    if (isCollectionHolder<T>(collection,))
        return __core2ByCollectionHolder(collection, predicate, from, to,)
    if (isArray(collection,))
        return __core2ByArray(collection, predicate, from, to,)
    if (isCollectionHolderByStructure<T>(collection,))
        return __core2ByCollectionHolder(collection, predicate, from, to,)
    if (isArrayByStructure<T>(collection,))
        return __core2ByArray(collection, predicate, from, to,)
    return __core2ByMinimalistCollectionHolder(collection, predicate, from, to,)
}

function __core2ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, predicate: BooleanCallback<T>, from: number, to: number,): number {
    const size = collection.size
    if (size === 0)
        throw new EmptyCollectionException()

    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    __validateInRange(from, startingIndex, to, endingIndex,)
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, startingIndex, endingIndex,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, startingIndex, endingIndex,)
    return __with0Argument(predicate as () => boolean, startingIndex, endingIndex,)
}

function __core2ByCollectionHolder<const T, >(collection: CollectionHolder<T>, predicate: BooleanCallback<T>, from: number, to: number,): number {
    if (collection.isEmpty)
        throw new EmptyCollectionException()

    const size = collection.size
    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    __validateInRange(from, startingIndex, to, endingIndex,)
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, startingIndex, endingIndex,)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, startingIndex, endingIndex,)
    return __with0Argument(predicate as () => boolean, startingIndex, endingIndex,)
}

function __core2ByArray<const T, >(collection: readonly T[], predicate: BooleanCallback<T>, from: number, to: number,): number {
    const size = collection.length
    if (size === 0)
        throw new EmptyCollectionException()

    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    __validateInRange(from, startingIndex, to, endingIndex,)
    if (predicate.length == 1)
        return __with1ArgumentByArray(collection, predicate as (value: T,) => boolean, startingIndex, endingIndex,)
    if (predicate.length >= 2)
        return __with2ArgumentByArray(collection, predicate, startingIndex, endingIndex,)
    return __with0Argument(predicate as () => boolean, startingIndex, endingIndex,)
}

//#endregion -------------------- predicate, from, to --------------------
//#region -------------------- predicate, to --------------------

function __coreWithNoFrom<const T, >(collection: | MinimalistCollectionHolder<T> | readonly T[], predicate: BooleanCallback<T>, to: number,): number {
    if (isCollectionHolder<T>(collection,))
        return __coreWithNoFromByCollectionHolder(collection, predicate, to,)
    if (isArray(collection,))
        return __coreWithNoFromByArray(collection, predicate, to,)
    if (isCollectionHolderByStructure<T>(collection,))
        return __coreWithNoFromByCollectionHolder(collection, predicate, to,)
    if (isArrayByStructure<T>(collection,))
        return __coreWithNoFromByArray(collection, predicate, to,)
    return __coreWithNoFromByMinimalistCollectionHolder(collection, predicate, to,)
}

function __coreWithNoFromByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, predicate: BooleanCallback<T>, to: number,): number {
    const size = collection.size
    if (size === 0)
        throw new EmptyCollectionException()
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, 0, __endingIndex(to, size,),)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, 0, __endingIndex(to, size,),)
    return __with0Argument(predicate as () => boolean, 0, __endingIndex(to, size,),)
}

function __coreWithNoFromByCollectionHolder<const T, >(collection: CollectionHolder<T>, predicate: BooleanCallback<T>, to: number,): number {
    if (collection.isEmpty)
        throw new EmptyCollectionException()
    if (predicate.length == 1)
        return __with1Argument(collection, predicate as (value: T,) => boolean, 0, __endingIndex(to, collection.size,),)
    if (predicate.length >= 2)
        return __with2Argument(collection, predicate, 0, __endingIndex(to, collection.size,),)
    return __with0Argument(predicate as () => boolean, 0, __endingIndex(to, collection.size,),)
}

function __coreWithNoFromByArray<const T, >(collection: readonly T[], predicate: BooleanCallback<T>, to: number,): number {
    const size = collection.length
    if (size === 0)
        throw new EmptyCollectionException()
    if (predicate.length == 1)
        return __with1ArgumentByArray(collection, predicate as (value: T,) => boolean, 0, __endingIndex(to, size,),)
    if (predicate.length >= 2)
        return __with2ArgumentByArray(collection, predicate, 0, __endingIndex(to, size,),)
    return __with0Argument(predicate as () => boolean, 0, __endingIndex(to, size,),)
}

//#endregion -------------------- predicate, to --------------------

//#endregion -------------------- Core methods --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument(predicate: () => boolean, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate())
            return index
    throw new IndexOutOfBoundsException(`Index out of bound. No index could be found from the starting (“${startingIndex}”) to the ending (“${endingIndex}”) indexes in the collection.`, index,)
}


function __with1Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate(collection.get(index,),))
            return index
    throw new IndexOutOfBoundsException(`Index out of bound. No index could be found from the starting (“${startingIndex}”) to the ending (“${endingIndex}”) indexes in the collection.`, index,)
}

function __with1ArgumentByArray<const T, >(collection: readonly T[], predicate: (value: T,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate(collection[index] as T,))
            return index
    throw new IndexOutOfBoundsException(`Index out of bound. No index could be found from the starting (“${startingIndex}”) to the ending (“${endingIndex}”) indexes in the collection.`, index,)
}


function __with2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (value: T, index: number,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate(collection.get(index,), index,))
            return index
    throw new IndexOutOfBoundsException(`Index out of bound. No index could be found from the starting (“${startingIndex}”) to the ending (“${endingIndex}”) indexes in the collection.`, index,)
}

function __with2ArgumentByArray<const T, >(collection: readonly T[], predicate: (value: T, index: number,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (predicate(collection[index] as T, index,))
            return index
    throw new IndexOutOfBoundsException(`Index out of bound. No index could be found from the starting (“${startingIndex}”) to the ending (“${endingIndex}”) indexes in the collection.`, index,)
}

//#endregion -------------------- Loop methods --------------------
