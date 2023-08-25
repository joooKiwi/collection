/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}             from "../CollectionHolder"
import type {CollectionHolderConstructor}  from "../CollectionHolderConstructor"
import type {ValueIndexWithReturnCallback} from "../CollectionHolder.types"
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
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map.html Kotlin map(transform)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(selector)
 *
 * @extensionFunction
 */
export function map<const T, const U, >(collection: Nullable<CollectionHolder<T>>, transform: ValueIndexWithReturnCallback<T, U>, constructorInstance: Nullable<CollectionHolderConstructor<U>> = null,): CollectionHolder<U> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    return newInstance(constructorInstance ?? collection.constructor as CollectionHolderConstructor<U>, () => {
        const size = collection.size,
            newArray = new Array<U>(size,)
        let index = -1
        while (++index < size)
            newArray[index] = transform(collection.get(index,), index,)
        return newArray
    },)
}
