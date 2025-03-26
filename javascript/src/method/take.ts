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
 * Get a new {@link CollectionHolder} from the first {@link n} elements
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param n          The number of arguments (if negative, then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take.html Kotlin take(n)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/stream/Stream.html#limit(long) Java limit(n)
 * @canReceiveNegativeValue
 */
export function take<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return takeByCollectionHolder(collection, n,)
    if (isArray(collection,))
        return takeByArray(collection, n,)
    if (isCollectionHolderByStructure<T>(collection,))
        return takeByCollectionHolder(collection, n,)
    if (isArrayByStructure<T>(collection,))
        return takeByArray(collection, n,)
    return takeByMinimalistCollectionHolder(collection, n,)
}


/**
 * Get a new {@link CollectionHolder} until the {@link n} received
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param n          The number of arguments (if negative, then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take.html Kotlin take(n)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/stream/Stream.html#limit(long) Java limit(n)
 * @canReceiveNegativeValue
 */
export function takeByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (Number.isNaN(n,))
        throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
    if (n === Number.NEGATIVE_INFINITY)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (n === Number.POSITIVE_INFINITY)
        return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
    if (n === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (n === 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection.get(0,),],)
    if (n > 0)
        if (n >= size)
            return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
        else
            return new CollectionConstants.LazyGenericCollectionHolder(() => __getAll(collection, n,),)
    if (n <= -size)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const n2 = n + size
    if (n2 === 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection.get(0,),],)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __getAll(collection, n2,),)
}

/**
 * Get a new {@link CollectionHolder} from the first {@link n} elements
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param n          The number of arguments (if negative, then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take.html Kotlin take(n)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/stream/Stream.html#limit(long) Java limit(n)
 * @canReceiveNegativeValue
 */
export function takeByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (Number.isNaN(n,))
        throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
    if (n === Number.NEGATIVE_INFINITY)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (n === Number.POSITIVE_INFINITY)
        return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
    if (n === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (n === 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection.getFirst(),],)
    if (n > 0)
        if (n >= collection.size)
            return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
        else
            return new CollectionConstants.LazyGenericCollectionHolder(() => __getAll(collection, n,),)

    const size = collection.size
    if (n <= -size)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const n2 = n + size
    if (n2 === 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection.getFirst(),],)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __getAll(collection, n + size,),)
}

/**
 * Get a new {@link CollectionHolder} from the first {@link n} elements
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param n          The number of arguments (if negative, then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take.html Kotlin take(n)
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/stream/Stream.html#limit(long) Java limit(n)
 * @canReceiveNegativeValue
 */
export function takeByArray<const T, >(collection: Nullable<readonly T[]>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.length
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (Number.isNaN(n,))
        throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
    if (n === Number.NEGATIVE_INFINITY)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (n === Number.POSITIVE_INFINITY)
        return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
    if (n === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (n === 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection[0] as T,],)
    if (n > 0)
        if (n >= size)
            return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
        else
            return new CollectionConstants.LazyGenericCollectionHolder(() => __getAllByArray(collection, n,),)
    if (n <= -size)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const n2 = n + size
    if (n2 === 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection[0] as T,],)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __getAllByArray(collection, n + size,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __getAll<const T, >(collection: MinimalistCollectionHolder<T>, amount: number,): readonly T[] {
    const newArray = new Array<T>(amount,)
    let index = -1
    while (++index < amount)
        newArray[index] = collection.get(index,)
    return newArray

}

function __getAllByArray<const T, >(collection: readonly T[], amount: number,): readonly T[] {
    const newArray = new Array<T>(amount,)
    let index = -1
    while (++index < amount)
        newArray[index] = collection[index] as T
    return newArray

}

//#endregion -------------------- Loop methods --------------------
