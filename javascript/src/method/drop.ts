//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Array, Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {EmptyCollectionHolder}         from "../EmptyCollectionHolder"
import {LateRetriever}                 from "../LateRetriever"
import {LazyCollectionHolder}          from "../LazyCollectionHolder"
import {ForbiddenIndexException}       from "../exception/ForbiddenIndexException"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder} without the first {@link n} elements
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param n          The number of arguments (if negative, then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop.html Kotlin drop(n)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#skip(long) Java Stream.skip(n)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#skip(long) Java IntStream.skip(n)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#skip(long) Java LongStream.skip(n)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#skip(long) Java DoubleStream.skip(n)
 * @canReceiveNegativeValue
 */
export function drop<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | Array<T>>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    if (isCollectionHolder(collection,))
        return __coreByCollectionHolder(collection, n,)
    if (isArray(collection,))
        return __coreByArray(collection, n,)
    if (isMinimalistCollectionHolder(collection,))
        return __coreByMinimalistCollectionHolder(collection, n,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __coreByCollectionHolder(collection, n,)
    if (isArrayByStructure<T>(collection,))
        return __coreByArray<T>(collection, n,)
    return __coreByMinimalistCollectionHolder<T>(collection, n,)
}


/**
 * Get a new {@link CollectionHolder} from the last {@link n} elements
 *
 * @param collection The nullable collection
 * @param n          The number of arguments (if negative, then it is plus {@link MinimalistCollectionHolder.size size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop.html Kotlin drop(n)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#skip(long) Java Stream.skip(n)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#skip(long) Java IntStream.skip(n)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#skip(long) Java LongStream.skip(n)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#skip(long) Java DoubleStream.skip(n)
 * @canReceiveNegativeValue
 */
export function dropByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    return __coreByMinimalistCollectionHolder(collection, n,)
}

/**
 * Get a new {@link CollectionHolder} from the last {@link n} elements
 *
 * @param collection The nullable collection
 * @param n          The number of arguments (if negative, then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop.html Kotlin drop(n)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#skip(long) Java Stream.skip(n)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#skip(long) Java IntStream.skip(n)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#skip(long) Java LongStream.skip(n)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#skip(long) Java DoubleStream.skip(n)
 * @canReceiveNegativeValue
 */
export function dropByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    return __coreByCollectionHolder(collection, n,)
}

/**
 * Get a new {@link CollectionHolder} from the last {@link n} elements
 *
 * @param collection The nullable collection
 * @param n          The number of arguments (if negative, then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop.html Kotlin drop(n)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#skip(long) Java Stream.skip(n)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/IntStream.html#skip(long) Java IntStream.skip(n)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/LongStream.html#skip(long) Java LongStream.skip(n)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/DoubleStream.html#skip(long) Java DoubleStream.skip(n)
 * @canReceiveNegativeValue
 */
export function dropByArray<const T, >(collection: Nullable<Array<T>>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return EmptyCollectionHolder.get
    return __coreByArray(collection, n,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Core method --------------------

function __coreByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, n: number,) {
    const size = collection.size
    if (size === 0)
        return EmptyCollectionHolder.get
    if (Number.isNaN(n,))
        throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
    if (n === Number.NEGATIVE_INFINITY)
        return new LateRetriever.MinimalistAsCollectionHolder<T>(collection,)
    if (n === Number.POSITIVE_INFINITY)
        return EmptyCollectionHolder.get
    if (n === 0)
        return new LateRetriever.MinimalistAsCollectionHolder<T>(collection,)

    const sizeMinus1 = size - 1
    if (n === sizeMinus1)
        return new LateRetriever.LazyCollectionHolderOf1(() => collection.get(sizeMinus1,),)
    if (n > 0)
        if (n >= size)
            return EmptyCollectionHolder.get
        else
            return new LazyCollectionHolder(() => __getAll(collection, size, n,),)
    if (n <= -size)
        return new LateRetriever.MinimalistAsCollectionHolder<T>(collection,)

    const n2 = n + size
    if (n2 === sizeMinus1)
        return new LateRetriever.LazyCollectionHolderOf1(() => collection.get(sizeMinus1,),)
    return new LazyCollectionHolder(() => __getAll(collection, size, n2,),)
}

function __coreByCollectionHolder<const T, >(collection: CollectionHolder<T>, n: number,) {
    if (collection.isEmpty)
        return EmptyCollectionHolder.get
    if (Number.isNaN(n,))
        throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
    if (n === Number.NEGATIVE_INFINITY)
        return collection
    if (n === Number.POSITIVE_INFINITY)
        return EmptyCollectionHolder.get
    if (n === 0)
        return collection

    const size = collection.size
    const sizeMinus1 = size - 1
    if (n === sizeMinus1)
        return new LateRetriever.LazyCollectionHolderOf1(() => collection.getLast(),)
    if (n > 0)
        if (n >= size)
            return EmptyCollectionHolder.get
        else
            return new LazyCollectionHolder(() => __getAll(collection, size, n,),)
    if (n <= -size)
        return collection

    const n2 = n + size
    if (n2 === sizeMinus1)
        return new LateRetriever.LazyCollectionHolderOf1(() => collection.getLast(),)
    return new LazyCollectionHolder(() => __getAll(collection, size, n2,),)
}

function __coreByArray<const T, >(collection: Array<T>, n: number,) {
    const size = collection.length
    if (size === 0)
        return EmptyCollectionHolder.get
    if (Number.isNaN(n,))
        throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
    if (n === Number.NEGATIVE_INFINITY)
        return new LateRetriever.ArrayAsCollectionHolder<T>(collection,)
    if (n === Number.POSITIVE_INFINITY)
        return EmptyCollectionHolder.get
    if (n === 0)
        return new LateRetriever.ArrayAsCollectionHolder<T>(collection,)

    const sizeMinus1 = size - 1
    if (n === sizeMinus1)
        return new LateRetriever.LazyCollectionHolderOf1(() => collection[sizeMinus1] as T,)
    if (n > 0)
        if (n >= size)
            return EmptyCollectionHolder.get
        else
            return new LazyCollectionHolder(() => __getAllByArray(collection, size, n,),)
    if (n <= -size)
        return new LateRetriever.ArrayAsCollectionHolder<T>(collection,)

    const n2 = n + size
    if (n2 === sizeMinus1)
        return new LateRetriever.LazyCollectionHolderOf1(() => collection[sizeMinus1] as T,)
    return new LazyCollectionHolder(() => __getAllByArray(collection, size, n2,),)
}

//#endregion -------------------- Core method --------------------
//#region -------------------- Loop methods --------------------

function __getAll<const T, >(collection: MinimalistCollectionHolder<T>, size: number, amount: number,) {
    const newArray = new Array<T>(size - amount,)
    let indexAdded = 0
    let index = amount - 1
    while (++index < size)
        newArray[indexAdded++] = collection.get(index,)
    return newArray

}

function __getAllByArray<const T, >(collection: Array<T>, size: number, amount: number,) {
    const newArray = new Array<T>(size - amount,)
    let indexAdded = 0
    let index = amount - 1
    while (++index < size)
        newArray[indexAdded++] = collection[index] as T
    return newArray

}

//#endregion -------------------- Loop methods --------------------
