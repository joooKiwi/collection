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

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}           from "../CollectionConstants"
import {ForbiddenIndexException}       from "../exception/ForbiddenIndexException"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder} without the last {@link n} elements
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param n          The number of arguments (if negative, then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html Kotlin dropLast(n)
 * @canReceiveNegativeValue
 */
export function dropLast<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder(collection,))
        return __coreByCollectionHolder(collection, n,)
    if (isArray(collection,))
        return __coreByArray(collection, n,)
    if (isMinimalistCollectionHolder(collection,))
        return __coreByMinimalistCollectionHolder(collection, n,)

    if (isCollectionHolderByStructure<T>(collection,))
        return __coreByCollectionHolder(collection, n,)
    if (isArrayByStructure<T>(collection,))
        return __coreByArray(collection, n,)
    return __coreByMinimalistCollectionHolder(collection, n,)
}


/**
 * Get a new {@link CollectionHolder} without the last {@link n} elements
 *
 * @param collection The nullable collection
 * @param n          The number of arguments (if negative, then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html Kotlin dropLast(n)
 * @canReceiveNegativeValue
 */
export function dropLastByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return __coreByMinimalistCollectionHolder(collection, n,)
}

/**
 * Get a new {@link CollectionHolder} without the last {@link n} elements
 *
 * @param collection The nullable collection
 * @param n          The number of arguments (if negative, then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html Kotlin dropLast(n)
 * @canReceiveNegativeValue
 */
export function dropLastByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return __coreByCollectionHolder(collection, n,)
}

/**
 * Get a new {@link CollectionHolder} without the last {@link n} elements
 *
 * @param collection The nullable collection
 * @param n          The number of arguments (if negative, then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html Kotlin dropLast(n)
 * @canReceiveNegativeValue
 */
export function dropLastByArray<const T, >(collection: Nullable<readonly T[]>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    return __coreByArray(collection, n,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Core method --------------------

function __coreByMinimalistCollectionHolder<const T,>(collection: MinimalistCollectionHolder<T>, n: number,): CollectionHolder<T> {
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

    const sizeMinus1 = size - 1
    if (n === sizeMinus1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection.get(0,),],)
    if (n > 0)
        if (n >= size)
            return CollectionConstants.EMPTY_COLLECTION_HOLDER
        else
            return new CollectionConstants.LazyGenericCollectionHolder(() => __getAll(collection, size - n,),)
    if (n <= -size)
        return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)

    const n2 = n + size
    if (n2 === sizeMinus1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection.get(0,),],)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __getAll(collection, size - n2,),)
}

function __coreByCollectionHolder<const T,>(collection: CollectionHolder<T>, n: number,): CollectionHolder<T> {
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
    const sizeMinus1 = size - 1
    if (n === sizeMinus1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection.getFirst(),],)
    if (n > 0)
        if (n >= size)
            return CollectionConstants.EMPTY_COLLECTION_HOLDER
        else
            return new CollectionConstants.LazyGenericCollectionHolder(() => __getAll(collection, size - n,),)
    if (n <= -size)
        return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)

    const n2 = n + size
    if (n2 === sizeMinus1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection.getFirst(),],)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __getAll(collection, size - n2,),)
}

function __coreByArray<const T,>(collection: readonly T[], n: number,): CollectionHolder<T> {
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

    const sizeMinus1 = size - 1
    if (n === sizeMinus1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection[0] as T,],)
    if (n >= size)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (n > 0)
        if (n >= size)
            return CollectionConstants.EMPTY_COLLECTION_HOLDER
        else
            return new CollectionConstants.LazyGenericCollectionHolder(() => __getAllByArray(collection, size - n,),)
    if (n <= -size)
        return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)

    const n2 = n + size
    if (n2 === sizeMinus1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection[0] as T,],)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __getAllByArray(collection, size - n2,),)
}

//#endregion -------------------- Core method --------------------
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
