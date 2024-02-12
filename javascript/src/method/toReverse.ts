/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}           from "../CollectionHolder"
import type {Nullable}                   from "../general type"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {NonEmptyCollectionHolder}   from "../NonEmptyCollectionHolder"

import {CollectionConstants}                                                     from "../CollectionConstants"
import {CollectionHolderIndexOutOfBoundsException}                               from "../exception/CollectionHolderIndexOutOfBoundsException"
import {endingIndex as endingIndexFunction, endingIndexByCollectionHolder}       from "./endingIndex"
import {maximumIndex as maximumIndexFunction, maximumIndexByCollectionHolder}    from "./maximumIndex"
import {startingIndex as startingIndexFunction, startingIndexByCollectionHolder} from "./startingIndex"

//#region -------------------- Facade method --------------------

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

    const size = collection.size
    if (size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (fromIndex === 0 && toIndex === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (limit === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    //#endregion -------------------- Early returns --------------------
    //#region -------------------- Initialization (starting/ending index) --------------------

    const startingIndex = startingIndexFunction(collection, fromIndex, size,) ?? 0
    const endingIndex = endingIndexFunction(collection, toIndex, size,) ?? (size - 1)

    if (endingIndex < startingIndex)
        throw new CollectionHolderIndexOutOfBoundsException(`The ending index "${toIndex}"${(toIndex == startingIndex ? '' : ` ("${startingIndex}" after calculation)`)} is over the starting index "${fromIndex}"${fromIndex == endingIndex ? '' : ` ("${endingIndex}" after calculation)`}.`, toIndex,)

    //#endregion -------------------- Initialization (starting/ending index) --------------------

    if (limit == null)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __withoutALimit(collection, startingIndex, endingIndex,),)

    //#region -------------------- Initialization (maximum index) --------------------

    const maximumIndex = maximumIndexFunction(collection, limit, size,) ?? size
    if (endingIndex - startingIndex < maximumIndex - 1)
        throw new CollectionHolderIndexOutOfBoundsException(`The limit "${limit}"${limit == maximumIndex ? '' : `("${maximumIndex}" after calculation)`} cannot be applied within the range "${fromIndex ?? ''}"${fromIndex == startingIndex ? '' : `("${startingIndex}" after calculation)`} to "${toIndex ?? ''}"${toIndex == endingIndex ? '' : `("${endingIndex}" after calculation)`}`, limit,)

    //#endregion -------------------- Initialization (maximum index) --------------------

    return new CollectionConstants.LazyGenericCollectionHolder(() => __withALimit(collection, startingIndex, endingIndex, maximumIndex,),)
}

/**
 * Reverse the {@link collection} from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
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
export function toReverseByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, fromIndex: Nullable<number> = null, toIndex: Nullable<number> = null, limit: Nullable<number> = null,): CollectionHolder<T> {
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
    //#region -------------------- Initialization (starting/ending index) --------------------

    const size = collection.size
    const startingIndex = startingIndexByCollectionHolder(collection as NonEmptyCollectionHolder, fromIndex, size,)
    const endingIndex = endingIndexByCollectionHolder(collection as NonEmptyCollectionHolder, toIndex, size,)

    if (endingIndex < startingIndex)
        throw new CollectionHolderIndexOutOfBoundsException(`The ending index "${toIndex}"${(toIndex == startingIndex ? '' : ` ("${startingIndex}" after calculation)`)} is over the starting index "${fromIndex}"${fromIndex == endingIndex ? '' : ` ("${endingIndex}" after calculation)`}.`, toIndex,)

    //#endregion -------------------- Initialization (starting/ending index) --------------------

    if (limit == null)
        return new CollectionConstants.LazyGenericCollectionHolder(() => __withoutALimit(collection, startingIndex, endingIndex,),)

    //#region -------------------- Initialization (maximum index) --------------------

    const maximumIndex = maximumIndexByCollectionHolder(collection as NonEmptyCollectionHolder, limit, size,)
    if (endingIndex - startingIndex < maximumIndex - 1)
        throw new CollectionHolderIndexOutOfBoundsException(`The limit "${limit}"${limit == maximumIndex ? '' : `("${maximumIndex}" after calculation)`} cannot be applied within the range "${fromIndex ?? ''}"${fromIndex == startingIndex ? '' : `("${startingIndex}" after calculation)`} to "${toIndex ?? ''}"${toIndex == endingIndex ? '' : `("${endingIndex}" after calculation)`}`, limit,)

    //#endregion -------------------- Initialization (maximum index) --------------------

    return new CollectionConstants.LazyGenericCollectionHolder(() => __withALimit(collection, startingIndex, endingIndex, maximumIndex,),)
}

//#region -------------------- Facade method --------------------
//#region -------------------- Loop method --------------------

function __withoutALimit<const T, >(collection: MinimalistCollectionHolder<T>, startingIndex: number, endingIndex: number,) {
    const newArray = new Array<T>(endingIndex - startingIndex,)
    let indexAdded = -1
    let index = endingIndex + 1
    while (--index >= startingIndex)
        newArray[++indexAdded] = collection.get(index,)
    return newArray
}

function __withALimit<const T, >(collection: MinimalistCollectionHolder<T>, startingIndex: number, endingIndex: number, maximumIndex: number,) {
    const newArray = [] as T[]
    let index = endingIndex + 1
    while (--index >= startingIndex) {
        if (newArray.length >= maximumIndex)
            return newArray
        newArray.push(collection.get(index,),)
    }
    return newArray
}

//#endregion -------------------- Loop method --------------------
