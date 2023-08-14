/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}            from "../CollectionHolder"
import type {CollectionHolderConstructor} from "../CollectionHolderConstructor"
import type {Nullable}                    from "../general type"
import type {NonEmptyCollectionHolder}    from "../NonEmptyCollectionHolder"

import {CollectionConstants}                    from "../CollectionConstants"
import {endingIndex as endingIndexFunction}     from "./endingIndex"
import {startingIndex as startingIndexFunction} from "./startingIndex"
import {newInstance}                            from "./newInstance"

/**
 * Reverse the {@link collection} from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param fromIndex The inclusive starting index
 * @param toIndex The exclusive ending index
 * @param constructorInstance The class to create (the {@link collection} constructor by default)
 * @throws {RangeError} The indexes "from" and "to" are not within a valid range
 * @see Array.reverse
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 *
 * @canReceiveNegativeValue
 */
export function toReverse<const T, >(collection: Nullable<CollectionHolder<T>>, fromIndex: Nullable<number> = null, toIndex: Nullable<number> = null, constructorInstance: Nullable<CollectionHolderConstructor<T>> = null,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    return newInstance(constructorInstance ?? collection.constructor as CollectionHolderConstructor<T>, () => {
        const size = collection.size,
            startingIndex = startingIndexFunction(collection as NonEmptyCollectionHolder<T>, fromIndex, size,),
            endingIndex = endingIndexFunction(collection as NonEmptyCollectionHolder<T>, toIndex, size,)

        if (endingIndex < startingIndex)
            throw new RangeError(`The ending index "${toIndex}"${(toIndex == startingIndex ? "" : ` ("${startingIndex}" after calculation)`)} is over the starting index "${fromIndex}"${fromIndex == endingIndex ? "" : `("${endingIndex}" after calculation)`}.`,)

        const newArray = [] as T[]
        let index = endingIndex
        while (--index >= startingIndex)
            newArray.push(collection.get(index,),)
        return newArray
    },)
}
