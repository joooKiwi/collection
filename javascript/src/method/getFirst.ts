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
 * Get the first element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @throws NullCollectionException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException The {@link collection} <b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
 * @extensionFunction
 */
export function getFirst<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>,): T {
    if (collection == null)
        throw new NullCollectionException()
    if (isCollectionHolder<T>(collection,))
        return getFirstByCollectionHolder(collection,)
    if (isArray(collection,))
        return getFirstByArray(collection,)
    if (isCollectionHolderByStructure<T>(collection,))
        return getFirstByCollectionHolder(collection,)
    if (isArrayByStructure<T>(collection,))
        return getFirstByArray(collection,)
    return getFirstByMinimalistCollectionHolder(collection,)
}


/**
 * Get the first element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @throws NullCollectionException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException The {@link collection} <b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
 * @extensionFunction
 */
export function getFirstByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): T {
    if (collection == null)
        throw new NullCollectionException()

    const size = collection.size
    if (size == 0)
        throw new EmptyCollectionException()
    return collection.get(0,)
}

/**
 * Get the first element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @throws NullCollectionException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException The {@link collection} {@link CollectionHolder.isEmpty is empty}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
 * @extensionFunction
 */
export function getFirstByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): T {
    if (collection == null)
        throw new NullCollectionException()
    if (collection.isEmpty)
        throw new EmptyCollectionException()
    if (0 in collection)
        return collection[0] as T
    return collection.get(0,)
}

/**
 * Get the first element in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @throws NullCollectionException  The {@link collection} was <b>null</b> or <b>undefined</b>
 * @throws EmptyCollectionException The {@link collection} <b>is empty</b>
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
 * @extensionFunction
 */
export function getFirstByArray<const T, >(collection: Nullable<readonly T[]>,): T {
    if (collection == null)
        throw new NullCollectionException()

    const size = collection.length
    if (size == 0)
        throw new EmptyCollectionException()
    return collection[0] as T
}

//#endregion -------------------- Facade method --------------------
