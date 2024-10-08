/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants}           from "../CollectionConstants"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {ForbiddenIndexException}       from "../exception"

//#region -------------------- Facade method --------------------

/**
 * Get a new {@link CollectionHolder} from the last {@link n} elements
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param n          The number of arguments (if negative then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html Kotlin takeLast(n)
 * @canReceiveNegativeValue
 */
export function takeLast<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, n: number,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (isCollectionHolder<T>(collection,))
        return takeLastByCollectionHolder(collection, n,)
    if (isArray(collection,))
        return takeLastByArray(collection, n,)
    if (isCollectionHolderByStructure<T>(collection,))
        return takeLastByCollectionHolder(collection, n,)
    if (isArrayByStructure<T>(collection,))
        return takeLastByArray(collection, n,)
    return takeLastByMinimalistCollectionHolder(collection, n,)
}

/**
 * Get a new {@link CollectionHolder} from the last {@link n} elements
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param n          The number of arguments (if negative then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html Kotlin takeLast(n)
 * @canReceiveNegativeValue
 */
export function takeLastByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, n: number,): CollectionHolder<T> {
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
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection.get(size - 1,),],)
    if (n > 0)
        if (n >= size)
            return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
        else
            return new CollectionConstants.LazyGenericCollectionHolder(() => __getAll(collection, size, n,),)
    if (n <= -size)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const n2 = n + size
    if (n2 === 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection.get(size - 1,),],)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __getAll(collection, size, n2,),)
}

/**
 * Get a new {@link CollectionHolder} from the last {@link n} elements
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param n          The number of arguments (if negative then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html Kotlin takeLast(n)
 * @canReceiveNegativeValue
 */
export function takeLastByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, n: number,): CollectionHolder<T> {
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
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection.last(),],)

    const size = collection.size
    if (n > 0)
        if (n >= size)
            return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
        else
            return new CollectionConstants.LazyGenericCollectionHolder(() => __getAll(collection, size, n,),)
    if (n <= -size)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const n2 = n + size
    if (n2 === 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection.last(),],)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __getAll(collection, size, n2,),)
}

/**
 * Get a new {@link CollectionHolder} from the last {@link n} elements
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param n          The number of arguments (if negative then it is plus {@link size})
 * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html Kotlin takeLast(n)
 * @canReceiveNegativeValue
 */
export function takeLastByArray<const T, >(collection: Nullable<readonly T[]>, n: number,): CollectionHolder<T> {
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
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection[size - 1] as T,],)
    if (n > 0)
        if (n >= size)
            return new CollectionConstants.LazyGenericCollectionHolder(() => collection,)
        else
            return new CollectionConstants.LazyGenericCollectionHolder(() => __getAllByArray(collection, size, n,),)
    if (n <= -size)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const n2 = n + size
    if (n2 === 1)
        return new CollectionConstants.LazyGenericCollectionHolder(() => [collection[size - 1] as T,],)
    return new CollectionConstants.LazyGenericCollectionHolder(() => __getAllByArray(collection, size, n2,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __getAll<const T, >(collection: MinimalistCollectionHolder<T>, size: number, amount: number,): readonly T[] {
    const newArray = new Array<T>(amount,)
    let indexAdded = -1
    let index = size - amount - 1
    while (++index < size)
        newArray[++indexAdded] = collection.get(index,)
    return newArray
}

function __getAllByArray<const T, >(collection: readonly T[], size: number, amount: number,): readonly T[] {
    const newArray = new Array<T>(amount,)
    let indexAdded = -1
    let index = size - amount - 1
    while (++index < size)
        newArray[++indexAdded] = collection[index] as T
    return newArray
}

//#endregion -------------------- Loop methods --------------------
