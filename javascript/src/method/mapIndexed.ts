/*
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi
 *
 * This project is free to use.
 * All the right is reserved to the author of this project.
 */

import type {CollectionHolder}             from "../CollectionHolder"
import type {CollectionHolderConstructor}  from "../CollectionHolderConstructor"
import type {IndexValueWithReturnCallback} from "../CollectionHolder.types"
import type {Nullable}                     from "../general type"

import {CollectionConstants} from "../CollectionConstants"
import {newInstance}         from "./newInstance"

/**
 * Create a new {@link CollectionHolder} applying a {@link transform} function
 * on each element of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param transform The given transform
 * @param constructorInstance The class to create (the {@link collection} constructor by default)
 * @see ReadonlyArray.map
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map-indexed.html Kotlin mapIndexed(transform)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(selector)
 *
 * @extensionFunction
 */
export function mapIndexed<const T, const U, >(collection: Nullable<CollectionHolder<T>>, transform: IndexValueWithReturnCallback<T, U>, constructorInstance: Nullable<CollectionHolderConstructor<U>> = null,): CollectionHolder<U> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = collection.size,
        array = new Array(size,)
    let index = -1
    while (++index < size)
        array[index] = transform(index, collection.get(index,),)
    return newInstance(constructorInstance ?? collection.constructor as CollectionHolderConstructor<U>, array,)
}
