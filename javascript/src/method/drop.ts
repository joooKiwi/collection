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

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}           from "../CollectionConstants"
import {ForbiddenIndexException}       from "../exception/ForbiddenIndexException"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder} without the first {@link n} elements
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param n          The number of arguments (if negative, then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop.html Kotlin drop(n)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/stream/Stream.html#skip(long) Java skip(n)
 * @canReceiveNegativeValue
 */
export function drop<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return __dropByCollectionHolder(collection, n,)
    if (isArray(collection,))
        return __dropByArray(collection, n,)
    if (isCollectionHolderByStructure<T>(collection,))
        return __dropByCollectionHolder(collection, n,)
    if (isArrayByStructure<T>(collection,))
        return __dropByArray(collection, n,)
    return __dropByMinimalistCollectionHolder(collection, n,)
}


/**
 * Get a new {@link CollectionHolder} from the last {@link n} elements
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param n          The number of arguments (if negative, then it is plus {@link MinimalistCollectionHolder.size size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop.html Kotlin drop(n)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/stream/Stream.html#skip(long) Java skip(n)
 * @canReceiveNegativeValue
 */
export function dropByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return __dropByCollectionHolder(collection, n,)
    if (isCollectionHolderByStructure<T>(collection,))
        return __dropByCollectionHolder(collection, n,)
    return __dropByMinimalistCollectionHolder(collection, n,)
}

/**
 * Get a new {@link CollectionHolder} from the last {@link n} elements
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param n          The number of arguments (if negative, then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop.html Kotlin drop(n)
 * @see https:/     * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/stream/Stream.html#skip(long) Java skip(n)
 * @canReceiveNegativeValue
 */
export function dropByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return __dropByCollectionHolder(collection, n,)
}

/**
 * Get a new {@link CollectionHolder} from the last {@link n} elements
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param n          The number of arguments (if negative, then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop.html Kotlin drop(n)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/stream/Stream.html#skip(long) Java skip(n)
 * @canReceiveNegativeValue
 */
export function dropByArray<const T, >(collection: Nullable<readonly T[]>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return __dropByArray(collection, n,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Core method --------------------

function __dropByMinimalistCollectionHolder<const T,>(collection: MinimalistCollectionHolder<T>, n: number,): CollectionHolder<T> {
    const size = collection.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (Number.isNaN(n,))
        throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
    if (n === Number.NEGATIVE_INFINITY)
        return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
    if (n === Number.POSITIVE_INFINITY)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (n === 0)
        return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
    if (n > 0)
        if (n >= size)
            return CollectionConstants.EMPTY_COLLECTION_HOLDER
        else
            return new CollectionConstants.LazyGenericCollectionHolder(() => __getAll(collection, size, n,),)
    if (n <= -size)
        return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __getAll(collection, size, n + size,),)
}

function __dropByCollectionHolder<const T,>(collection: CollectionHolder<T>, n: number,): CollectionHolder<T> {
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (Number.isNaN(n,))
        throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
    if (n === Number.NEGATIVE_INFINITY)
        return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
    if (n === Number.POSITIVE_INFINITY)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (n === 0)
        return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)

    const size = collection.size
    if (n > 0)
        if (n >= size)
            return CollectionConstants.EMPTY_COLLECTION_HOLDER
        else
            return new CollectionConstants.LazyGenericCollectionHolder(() => __getAll(collection, size, n,),)
    if (n <= -size)
        return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __getAll(collection, size, n + size,),)
}

function __dropByArray<const T,>(collection: readonly T[], n: number,): CollectionHolder<T> {
    const size = collection.length
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (Number.isNaN(n,))
        throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
    if (n === Number.NEGATIVE_INFINITY)
        return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
    if (n === Number.POSITIVE_INFINITY)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (n === 0)
        return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
    if (n > 0)
        if (n >= size)
            return CollectionConstants.EMPTY_COLLECTION_HOLDER
        else
            return new CollectionConstants.LazyGenericCollectionHolder(() => __getAllByArray(collection, size, n,),)
    if (n <= -size)
        return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __getAllByArray(collection, size, n + size,),)
}

//#endregion -------------------- Core method --------------------
//#region -------------------- Loop methods --------------------

function __getAll<const T, >(collection: MinimalistCollectionHolder<T>, size: number, amount: number,): readonly T[] {
    const newArray = new Array<T>(size - amount,)
    let indexAdded = 0
    let index = amount - 1
    while (++index < size)
        newArray[indexAdded++] = collection.get(index,)
    return newArray

}

function __getAllByArray<const T, >(collection: readonly T[], size: number, amount: number,): readonly T[] {
    const newArray = new Array<T>(size - amount,)
    let indexAdded = 0
    let index = amount - 1
    while (++index < size)
        newArray[indexAdded++] = collection[index] as T
    return newArray

}

//#endregion -------------------- Loop methods --------------------
