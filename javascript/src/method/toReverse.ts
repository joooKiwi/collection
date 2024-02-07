/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                   from "../CollectionHolder"
import type {Nullable}                           from "../general type"
import type {MinimalistCollectionHolder}         from "../MinimalistCollectionHolder"
import type {NonEmptyMinimalistCollectionHolder} from "../NonEmptyMinimalistCollectionHolder"

import {CollectionConstants}                       from "../CollectionConstants"
import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"
import {endingIndex as endingIndexFunction}        from "./endingIndex"
import {maximumIndex as maximumIndexFunction}      from "./maximumIndex"
import {startingIndex as startingIndexFunction}    from "./startingIndex"

/**
 * Reverse the {@link collection} from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @see Array.reverse
 * @see ReadonlyArray.toReversed
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reverse.html Kotlin reverse()
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
 * @canReceiveNegativeValue
 */
export function toReverse<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, fromIndex: Nullable<number> = null, toIndex: Nullable<number> = null, limit: Nullable<number> = null,): CollectionHolder<T> {
    //#region -------------------- Early returns --------------------

    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (fromIndex === 0 && toIndex === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (limit === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    //#endregion -------------------- Early returns --------------------

    if (limit == null)
        return new CollectionConstants.LazyGenericCollectionHolder(() => {
            //#region -------------------- Initialization (starting/ending index) --------------------

            const size = collection.size
            const startingIndex = startingIndexFunction(collection as NonEmptyMinimalistCollectionHolder<T>, fromIndex, size,)
            const endingIndex = endingIndexFunction(collection as NonEmptyMinimalistCollectionHolder<T>, toIndex, size,)

            if (endingIndex < startingIndex)
                throw new CollectionHolderIndexOutOfBoundsException(`The ending index "${toIndex}"${(toIndex == startingIndex ? "" : ` ("${startingIndex}" after calculation)`)} is over the starting index "${fromIndex}"${fromIndex == endingIndex ? "" : ` ("${endingIndex}" after calculation)`}.`, toIndex,)

            //#endregion -------------------- Initialization (starting/ending index) --------------------

            return __withoutALimit(collection as NonEmptyMinimalistCollectionHolder<T>, startingIndex, endingIndex,)
        },)
    return new CollectionConstants.LazyGenericCollectionHolder(() => {
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        const size = collection.size
        const startingIndex = startingIndexFunction(collection as NonEmptyMinimalistCollectionHolder<T>, fromIndex, size,)
        const endingIndex = endingIndexFunction(collection as NonEmptyMinimalistCollectionHolder<T>, toIndex, size,)

        if (endingIndex < startingIndex)
            throw new CollectionHolderIndexOutOfBoundsException(`The ending index "${toIndex}"${(toIndex == startingIndex ? "" : ` ("${startingIndex}" after calculation)`)} is over the starting index "${fromIndex}"${fromIndex == endingIndex ? "" : `("${endingIndex}" after calculation)`}.`, limit,)

        const maximumIndex = maximumIndexFunction(collection as NonEmptyMinimalistCollectionHolder<T>, limit, size,)
        if (endingIndex - startingIndex < maximumIndex - 1)
            throw new CollectionHolderIndexOutOfBoundsException(`The limit "${limit}"${limit == maximumIndex ? "" : `("${maximumIndex}" after calculation)`} cannot be applied within the range "${fromIndex ?? ""}"${fromIndex == startingIndex ? "" : `("${startingIndex}" after calculation)`} to "${toIndex ?? ""}"${toIndex == endingIndex ? "" : `("${endingIndex}" after calculation)`}`, limit,)

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(collection as NonEmptyMinimalistCollectionHolder<T>, startingIndex, endingIndex, maximumIndex,)
    },)
}

function __withoutALimit<const T, >(collection: NonEmptyMinimalistCollectionHolder<T>, startingIndex: number, endingIndex: number,) {
    const newArray = new Array<T>(endingIndex - startingIndex,)
    let indexAdded = -1
    let index = endingIndex + 1
    while (--index >= startingIndex)
        newArray[++indexAdded] = collection.get(index,)
    return newArray
}

function __withALimit<const T, >(collection: NonEmptyMinimalistCollectionHolder<T>, startingIndex: number, endingIndex: number, maximumIndex: number,) {
    const newArray = [] as T[]
    let index = endingIndex + 1
    while (--index >= startingIndex) {
        if (newArray.length >= maximumIndex)
            return newArray
        newArray.push(collection.get(index,),)
    }
    return newArray
}
