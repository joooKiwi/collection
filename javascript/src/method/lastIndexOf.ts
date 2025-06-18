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

import {EmptyCollectionException}                          from "../exception/EmptyCollectionException"
import {IndexOutOfBoundsException}                         from "../exception/IndexOutOfBoundsException"
import {NullCollectionException}                           from "../exception/NullCollectionException"
import {__endingIndex, __startingIndex, __validateInRange} from "./_indexes utility"
import {isArray}                                           from "./isArray"
import {isArrayByStructure}                                from "./isArrayByStructure"
import {isCollectionHolder}                                from "./isCollectionHolder"
import {isCollectionHolderByStructure}                     from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}                      from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param element    The element to find
 * @return {number} The last index associated to the {@link element} found
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException No index could be found
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOf<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, element: T,): number
/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting index} and the end of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param element    The element to find
 * @param from       The inclusive starting index (<code>0</code> by default)
 * @return {number} The last index associated to the {@link element} found after {@link from}
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException {@link from} is not within a valid range
 * @throws IndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOf<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, element: T, from: NullableNumber,): number
/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param element    The element to find
 * @param from       The inclusive starting index (<code>0</code> by default)
 * @param to         The inclusive ending index (<code>size - 1</code> by default)
 * @return {number} The last index associated to the {@link element} found between {@link from} and {@link to}
 * @throws NullCollectionException    The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException   The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
 * @throws IndexOutOfBoundsException  No index could be found
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOf<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, element: T, from: NullableNumber, to: NullableNumber,): number
export function lastIndexOf<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, element: T, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        throw new NullCollectionException()
    if (to == null)
        if (from == null)
            return __core0(collection, element,)
        else
            return __core1(collection, element, from,)
    if (from == null)
        return __coreWithNoFrom(collection, element, to,)
    return __core2(collection, element, from, to,)
}


/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param element    The element to find
 * @return {number} The last index associated to the {@link element} found
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException No index could be found
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOfByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: T,): number
/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting index} and the end of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param element    The element to find
 * @param from       The inclusive starting index (<code>0</code> by default)
 * @return {number} The last index associated to the {@link element} found after {@link from}
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException {@link from} is not within a valid range
 * @throws IndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOfByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: T, from: NullableNumber,): number
/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param element    The element to find
 * @param from       The inclusive starting index (<code>0</code> by default)
 * @param to         The inclusive ending index (<code>{@link MinimalistCollectionHolder.size size} - 1</code> by default)
 * @return {number} The last index associated to the {@link element} found between {@link from} and {@link to}
 * @throws NullCollectionException    The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException   The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
 * @throws IndexOutOfBoundsException  No index could be found
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOfByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: T, from: NullableNumber, to: NullableNumber,): number
export function lastIndexOfByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: T, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        throw new NullCollectionException()
    if (to == null)
        if (from == null)
            return __core0ByMinimalistCollectionHolder(collection, element,)
        else
            return __core1ByMinimalistCollectionHolder(collection, element, from,)
    if (from == null)
        return __coreWithNoFromByMinimalistCollectionHolder(collection, element, to,)
    return __core2ByMinimalistCollectionHolder(collection, element, from, to,)
}

/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param element    The element to find
 * @return {number} The last index associated to the {@link element} found
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException No index could be found
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOfByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, element: T,): number
/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting index} and the end of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param element    The element to find
 * @param from       The inclusive starting index (<code>0</code> by default)
 * @return {number} The last index associated to the {@link element} found after {@link from}
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException {@link from} is not within a valid range
 * @throws IndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOfByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, element: T, from: NullableNumber,): number
/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param element    The element to find
 * @param from       The inclusive starting index (<code>0</code> by default)
 * @param to         The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
 * @return {number} The last index associated to the {@link element} found between {@link from} and {@link to}
 * @throws NullCollectionException    The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException   The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
 * @throws IndexOutOfBoundsException  No index could be found
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOfByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, element: T, from: NullableNumber, to: NullableNumber,): number
export function lastIndexOfByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, element: T, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        throw new NullCollectionException()
    if (to == null)
        if (from == null)
            return __core0ByCollectionHolder(collection, element,)
        else
            return __core1ByCollectionHolder(collection, element, from,)
    if (from == null)
        return __coreWithNoFromByCollectionHolder(collection, element, to,)
    return __core2ByCollectionHolder(collection, element, from, to,)
}

/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param element    The element to find
 * @return {number} The last index associated to the {@link element} found
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException No index could be found
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOfByArray<const T, >(collection: Nullable<readonly T[]>, element: T,): number
/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting index} and the end of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param element    The element to find
 * @param from       The inclusive starting index (<code>0</code> by default)
 * @return {number} The last index associated to the {@link element} found after {@link from}
 * @throws NullCollectionException   The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException  The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException {@link from} is not within a valid range
 * @throws IndexOutOfBoundsException No index could be found
 * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOfByArray<const T, >(collection: Nullable<readonly T[]>, element: T, from: NullableNumber,): number
/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param element    The element to find
 * @param from       The inclusive starting index (<code>0</code> by default)
 * @param to         The inclusive ending index (<code>{@link ReadonlyArray.length size} - 1</code> by default)
 * @return {number} The last index associated to the {@link element} found between {@link from} and {@link to}
 * @throws NullCollectionException    The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException   The {@link collection} <b>is empty</b>
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
 * @throws IndexOutOfBoundsException  No index could be found
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOfByArray<const T, >(collection: Nullable<readonly T[]>, element: T, from: NullableNumber, to: NullableNumber,): number
export function lastIndexOfByArray<const T, >(collection: Nullable<readonly T[]>, element: T, from: NullableNumber = null, to: NullableNumber = null,) {
    if (collection == null)
        throw new NullCollectionException()
    if (to == null)
        if (from == null)
            return __core0ByArray(collection, element,)
        else
            return __core1ByArray(collection, element, from,)
    if (from == null)
        return __coreWithNoFromByArray(collection, element, to,)
    return __core2ByArray(collection, element, from, to,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Core method --------------------

//#region -------------------- element --------------------

function __core0<const T, >(collection: | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[], element: T,) {
    if (isCollectionHolder(collection,))
        return __core0ByCollectionHolder(collection, element,)
    if (isArray(collection,))
        return __core0ByArray(collection, element,)
    if (isMinimalistCollectionHolder(collection,))
        return __core0ByMinimalistCollectionHolder(collection, element,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __core0ByCollectionHolder(collection, element,)
    if (isArrayByStructure<T>(collection,))
        return __core0ByArray(collection, element,)
    return __core0ByMinimalistCollectionHolder(collection, element,)
}

function __core0ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, element: T,) {
    const size = collection.size
    if (size === 0)
        throw new EmptyCollectionException()
    return __findInRange(collection, element, 0, size - 1,)
}

function __core0ByCollectionHolder<const T, >(collection: CollectionHolder<T>, element: T,) {
    if (collection.isEmpty)
        throw new EmptyCollectionException()
    return __findInRange(collection, element, 0, collection.size - 1,)
}

function __core0ByArray<const T, >(collection: readonly T[], element: T,) {
    const size = collection.length
    if (size === 0)
        throw new EmptyCollectionException()
    return __findInRangeByArray(collection, element, 0, size - 1,)
}

//#endregion -------------------- element --------------------
//#region -------------------- element, from --------------------

function __core1<const T, >(collection: | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[], element: T, from: number,) {
    if (isCollectionHolder(collection,))
        return __core1ByCollectionHolder(collection, element, from,)
    if (isArray(collection,))
        return __core1ByArray(collection, element, from,)
    if (isMinimalistCollectionHolder(collection,))
        return __core1ByMinimalistCollectionHolder(collection, element, from,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __core1ByCollectionHolder(collection, element, from,)
    if (isArrayByStructure<T>(collection,))
        return __core1ByArray(collection, element, from,)
    return __core1ByMinimalistCollectionHolder(collection, element, from,)
}

function __core1ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, element: T, from: number,) {
    const size = collection.size
    if (size === 0)
        throw new EmptyCollectionException()
    return __findInRange(collection, element, __startingIndex(from, size,), size - 1,)
}

function __core1ByCollectionHolder<const T, >(collection: CollectionHolder<T>, element: T, from: number,) {
    if (collection.isEmpty)
        throw new EmptyCollectionException()

    const size = collection.size
    return __findInRange(collection, element, __startingIndex(from, size,), size - 1,)
}

function __core1ByArray<const T, >(collection: readonly T[], element: T, from: number,) {
    const size = collection.length
    if (size === 0)
        throw new EmptyCollectionException()
    return __findInRangeByArray(collection, element, __startingIndex(from, size,), size - 1,)
}

//#endregion -------------------- element, from --------------------
//#region -------------------- element, from, to --------------------

function __core2<const T, >(collection: | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[], element: T, from: number, to: number,) {
    if (isCollectionHolder(collection,))
        return __core2ByCollectionHolder(collection, element, from, to,)
    if (isArray(collection,))
        return __core2ByArray(collection, element, from, to,)
    if (isMinimalistCollectionHolder(collection,))
        return __core2ByMinimalistCollectionHolder(collection, element, from, to,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __core2ByCollectionHolder(collection, element, from, to,)
    if (isArrayByStructure<T>(collection,))
        return __core2ByArray(collection, element, from, to,)
    return __core2ByMinimalistCollectionHolder(collection, element, from, to,)
}

function __core2ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, element: T, from: number, to: number,) {
    const size = collection.size
    if (size === 0)
        throw new EmptyCollectionException()

    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    __validateInRange(from, startingIndex, to, endingIndex,)
    return __findInRange(collection, element, startingIndex, endingIndex,)
}

function __core2ByCollectionHolder<const T, >(collection: CollectionHolder<T>, element: T, from: number, to: number,) {
    if (collection.isEmpty)
        throw new EmptyCollectionException()

    const size = collection.size
    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    __validateInRange(from, startingIndex, to, endingIndex,)
    return __findInRange(collection, element, startingIndex, endingIndex,)
}

function __core2ByArray<const T, >(collection: readonly T[], element: T, from: number, to: number,) {
    const size = collection.length
    if (size === 0)
        throw new EmptyCollectionException()

    const startingIndex = __startingIndex(from, size,)
    const endingIndex = __endingIndex(to, size,)
    __validateInRange(from, startingIndex, to, endingIndex,)
    return __findInRangeByArray(collection, element, startingIndex, endingIndex,)
}

//#endregion -------------------- element, from, to --------------------
//#region -------------------- element, to --------------------

function __coreWithNoFrom<const T, >(collection: | MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[], element: T, to: number,) {
    if (isCollectionHolder(collection,))
        return __coreWithNoFromByCollectionHolder(collection, element, to,)
    if (isArray(collection,))
        return __coreWithNoFromByArray(collection, element, to,)
    if (isMinimalistCollectionHolder(collection,))
        return __coreWithNoFromByMinimalistCollectionHolder(collection, element, to,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __coreWithNoFromByCollectionHolder(collection, element, to,)
    if (isArrayByStructure<T>(collection,))
        return __coreWithNoFromByArray(collection, element, to,)
    return __coreWithNoFromByMinimalistCollectionHolder(collection, element, to,)
}

function __coreWithNoFromByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, element: T, to: number,) {
    const size = collection.size
    if (size === 0)
        throw new EmptyCollectionException()
    return __findInRange(collection, element, 0, __endingIndex(to, size,),)
}

function __coreWithNoFromByCollectionHolder<const T, >(collection: CollectionHolder<T>, element: T, to: number,) {
    if (collection.isEmpty)
        throw new EmptyCollectionException()
    return __findInRange(collection, element, 0, __endingIndex(to, collection.size,),)
}

function __coreWithNoFromByArray<const T, >(collection: readonly T[], element: T, to: number,) {
    const size = collection.length
    if (size === 0)
        throw new EmptyCollectionException()
    return __findInRangeByArray(collection, element, 0, __endingIndex(to, size,),)
}

//#endregion -------------------- element, to --------------------

//#endregion -------------------- Core method --------------------
//#region -------------------- Loop methods --------------------

function __findInRange<const T, >(collection: MinimalistCollectionHolder<T>, element: T, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (collection.get(index,) === element)
            return index
    throw new IndexOutOfBoundsException(`Index out of bound. No index could be found from the starting (“${startingIndex}”) to the ending (“${endingIndex}”) indexes in the collection.`, index,)
}

function __findInRangeByArray<const T, >(collection: readonly T[], element: T, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (collection[index] === element)
            return index
    throw new IndexOutOfBoundsException(`Index out of bound. No index could be found from the starting (“${startingIndex}”) to the ending (“${endingIndex}”) indexes in the collection.`, index,)
}

//#endregion -------------------- Loop methods --------------------
