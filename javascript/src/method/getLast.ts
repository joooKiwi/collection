/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {EmptyCollectionException}      from "../exception/EmptyCollectionException"
import {NullCollectionException}       from "../exception/NullCollectionException"
import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get the last element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @throws NullCollectionException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException The {@link collection} <b</b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 * @extensionFunction
 */
export function getLast<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>,): T {
    if (collection == null)
        throw new NullCollectionException()
    if (isCollectionHolder<T>(collection,))
        return getLastByCollectionHolder(collection,)
    if (isArray(collection,))
        return getLastByArray(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return getLastByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return getLastByArray(collection,)
    return getLastByMinimalistCollectionHolder(collection,)
}


/**
 * Get the last element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @throws NullCollectionException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException The {@link collection} <b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 * @extensionFunction
 */
export function getLastByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): T {
    if (collection == null)
        throw new NullCollectionException()

    const size = collection.size
    if (size == 0)
        throw new EmptyCollectionException()
    return collection.get(size - 1,)
}

/**
 * Get the last element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @throws NullCollectionException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 * @extensionFunction
 */
export function getLastByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): T {
    if (collection == null)
        throw new NullCollectionException()
    if (collection.isEmpty)
        throw new EmptyCollectionException()

    const lastIndex = collection.size - 1
    if (lastIndex in collection)
        return collection[lastIndex] as T
    return collection.get(lastIndex,)
}

/**
 * Get the last element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @throws NullCollectionException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException The {@link collection} <b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
 * @extensionFunction
 */
export function getLastByArray<const T, >(collection: Nullable<readonly T[]>,): T {
    if (collection == null)
        throw new NullCollectionException()

    const size = collection.length
    if (size == 0)
        throw new EmptyCollectionException()
    return collection[size - 1] as T
}

//#endregion -------------------- Facade method --------------------
