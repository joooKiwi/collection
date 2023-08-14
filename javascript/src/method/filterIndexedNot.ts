/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                                         from "../CollectionHolder"
import type {CollectionHolderConstructor}                              from "../CollectionHolderConstructor"
import type {ReverseBooleanCallback, ReverseRestrainedBooleanCallback} from "../CollectionHolder.types"
import type {Nullable}                                                 from "../general type"

import {CollectionConstants} from "../CollectionConstants"
import {newInstance}         from "./newInstance"

/**
 * Get a new {@link CollectionHolder}
 * not matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate The given predicate
 * @param constructorInstance The class to create (the {@link collection} constructor by default)
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @see filterIndexed
 *
 * @typescriptDefinition
 * @extensionFunction
 */
export function filterIndexedNot<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseRestrainedBooleanCallback<T, S>, constructorInstance?: Nullable<CollectionHolderConstructor<T>>,): CollectionHolder<S>
/**
 * Get a new {@link CollectionHolder}
 * not matching the given {@link predicate}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate The given predicate
 * @param constructorInstance The class to create (the {@link collection} constructor by default)
 * @see ReadonlyArray.filter
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
 * @see filterIndexed
 *
 * @extensionFunction
 */
export function filterIndexedNot<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>, constructorInstance?: Nullable<CollectionHolderConstructor<T>>,): CollectionHolder<T>
export function filterIndexedNot<const T, const S extends T, >(collection: Nullable<CollectionHolder<T>>, predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>, constructorInstance: Nullable<CollectionHolderConstructor<T>> = null,) {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    return newInstance(constructorInstance ?? collection.constructor as CollectionHolderConstructor<T>, () => {
        const newArray = [] as T[],
            size = collection.size
        let index = -1
        while (++index < size) {
            const value = collection.get(index,)
            if (!predicate(index, value,))
                newArray.push(value,)
        }
        return newArray
    },)
}
