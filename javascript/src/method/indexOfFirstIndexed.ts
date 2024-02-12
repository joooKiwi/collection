/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}           from "../CollectionHolder"
import type {ReverseBooleanCallback}     from "../CollectionHolder.types"
import type {Nullable, NullOr}           from "../general type"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"
import {ForbiddenIndexException}                   from "../exception/ForbiddenIndexException"

//#region -------------------- Facade method --------------------

/**
 * Get the first index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param predicate  The given predicate
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOr<number>} The index matching the {@link predicate} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @see ReadonlyArray.findIndex
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfFirstIndexed<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, predicate: ReverseBooleanCallback<T>, fromIndex: Nullable<number> = null, toIndex: Nullable<number> = null, limit: Nullable<number> = null,): NullOr<number> {
    //#region -------------------- Early returns --------------------

    if (collection == null)
        return null

    const size = collection.size
    if (size == 0)
        return null
    if (fromIndex === 0 && toIndex === 0)
        return null
    if (limit === 0)
        return null

    //#endregion -------------------- Early returns --------------------
    //#region -------------------- Initialization (starting/ending index) --------------------

    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        return null

    //#endregion -------------------- Initialization (starting/ending index) --------------------

    if (limit == null) {
        if (predicate.length == 1)
            return __withoutALimitAnd1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex,)
        if (predicate.length >= 2)
            return __withoutALimitAnd2Argument(collection, predicate, startingIndex, endingIndex,)
        return __withoutALimitAnd0Argument(predicate as () => boolean, startingIndex, endingIndex,)
    }

    //#region -------------------- Initialization (maximum index) --------------------

    const maximumIndex = __maximumIndex(limit, size,)
    if (maximumIndex == size) {
        if (predicate.length == 1)
            return __withoutALimitAnd1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex,)
        if (predicate.length >= 2)
            return __withoutALimitAnd2Argument(collection, predicate, startingIndex, endingIndex,)
        return __withoutALimitAnd0Argument(predicate as () => boolean, startingIndex, endingIndex,)
    }
    if (endingIndex - startingIndex < maximumIndex - 1)
        return null

    //#endregion -------------------- Initialization (maximum index) --------------------

    if (predicate.length == 1)
        return __withALimitAnd1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex, maximumIndex,)
    if (predicate.length >= 2)
        return __withALimitAnd2Argument(collection, predicate, startingIndex, endingIndex, maximumIndex,)
    return __withALimitAnd0Argument(predicate as () => boolean, startingIndex, endingIndex, maximumIndex,)
}

/**
 * Get the first index matching the {@link predicate}
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param predicate  The given predicate
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOr<number>} The index matching the {@link predicate} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @see ReadonlyArray.findIndex
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function indexOfFirstIndexedByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, predicate: ReverseBooleanCallback<T>, fromIndex: Nullable<number> = null, toIndex: Nullable<number> = null, limit: Nullable<number> = null,): NullOr<number> {
    //#region -------------------- Early returns --------------------

    if (collection == null)
        return null
    if (collection.isEmpty)
        return null
    if (fromIndex === 0 && toIndex === 0)
        return null
    if (limit === 0)
        return null

    //#endregion -------------------- Early returns --------------------
    //#region -------------------- Initialization (starting/ending index) --------------------

    const size = collection.size
    const startingIndex = __startingIndex(fromIndex, size,)
    const endingIndex = __endingIndex(toIndex, size,)
    if (endingIndex < startingIndex)
        return null

    //#endregion -------------------- Initialization (starting/ending index) --------------------

    if (limit == null) {
        if (predicate.length == 1)
            return __withoutALimitAnd1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex,)
        if (predicate.length >= 2)
            return __withoutALimitAnd2Argument(collection, predicate, startingIndex, endingIndex,)
        return __withoutALimitAnd0Argument(predicate as () => boolean, startingIndex, endingIndex,)
    }

    //#region -------------------- Initialization (maximum index) --------------------

    const maximumIndex = __maximumIndex(limit, size,)
    if (maximumIndex == size) {
        if (predicate.length == 1)
            return __withoutALimitAnd1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex,)
        if (predicate.length >= 2)
            return __withoutALimitAnd2Argument(collection, predicate, startingIndex, endingIndex,)
        return __withoutALimitAnd0Argument(predicate as () => boolean, startingIndex, endingIndex,)
    }
    if (endingIndex - startingIndex < maximumIndex - 1)
        return null

    //#endregion -------------------- Initialization (maximum index) --------------------

    if (predicate.length == 1)
        return __withALimitAnd1Argument(predicate as (index: number,) => boolean, startingIndex, endingIndex, maximumIndex,)
    if (predicate.length >= 2)
        return __withALimitAnd2Argument(collection, predicate, startingIndex, endingIndex, maximumIndex,)
    return __withALimitAnd0Argument(predicate as () => boolean, startingIndex, endingIndex, maximumIndex,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Utility methods --------------------

function __startingIndex(fromIndex: Nullable<number>, size: number,) {
    if (fromIndex == null)
        return 0

    if (Number.isNaN(fromIndex,))
        throw new ForbiddenIndexException("Forbidden index. The starting index cannot be NaN.", fromIndex,)
    if (fromIndex == Number.NEGATIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The starting index cannot be -∞.", fromIndex,)
    if (fromIndex == Number.POSITIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The starting index cannot be +∞.", fromIndex,)

    if (fromIndex == size)
        throw new CollectionHolderIndexOutOfBoundsException(`The starting index "${fromIndex}" is the collection size "${size}".`, fromIndex,)
    if (fromIndex > size)
        throw new CollectionHolderIndexOutOfBoundsException(`The starting index "${fromIndex}" is over the collection size "${size}".`, fromIndex,)

    let startingIndex = fromIndex
    if (startingIndex < 0)
        startingIndex += size
    if (startingIndex == size)
        throw new CollectionHolderIndexOutOfBoundsException(`The starting index "${fromIndex}" ("${startingIndex}" after calculation) is the collection size "${size}".`, fromIndex,)
    if (startingIndex < 0)
        throw new CollectionHolderIndexOutOfBoundsException(`The starting index "${fromIndex}" ("${startingIndex}" after calculation) is under 0.`, fromIndex,)
    return startingIndex
}

function __endingIndex(toIndex: Nullable<number>, size: number,) {
    if (toIndex == null)
        return size - 1

    if (Number.isNaN(toIndex,))
        throw new ForbiddenIndexException("Forbidden index. The ending index cannot be NaN.", toIndex,)
    if (toIndex == Number.NEGATIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The ending index cannot be -∞.", toIndex,)
    if (toIndex == Number.POSITIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The ending index cannot be +∞.", toIndex,)

    if (toIndex == size)
        throw new CollectionHolderIndexOutOfBoundsException(`The ending index "${toIndex}" is the collection size "${size}".`, toIndex,)

    let endingIndex = toIndex
    if (endingIndex < 0)
        endingIndex += size
    if (endingIndex < 0)
        throw new CollectionHolderIndexOutOfBoundsException(`The ending index "${toIndex}" ("${endingIndex}" after calculation) is under 0.`, toIndex,)
    if (endingIndex == size)
        throw new CollectionHolderIndexOutOfBoundsException(`The ending index "${toIndex}" ("${endingIndex}" after calculation) is the collection size "${size}".`, toIndex,)
    if (endingIndex > size)
        throw new CollectionHolderIndexOutOfBoundsException(`The ending index "${toIndex}" ("${endingIndex}" after calculation) is over the collection size "${size}".`, toIndex,)
    return endingIndex
}

function __maximumIndex(limit: number, size: number,) {
    if (limit > size)
        throw new CollectionHolderIndexOutOfBoundsException(`The limit "${limit}" cannot over the collection size "${size}".`, limit,)

    if (Number.isNaN(limit,))
        throw new ForbiddenIndexException("Forbidden index. The limit cannot be NaN.", limit,)
    if (limit == Number.NEGATIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The limit cannot be -∞.", limit,)
    if (limit == Number.POSITIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The limit cannot be +∞.", limit,)

    let maximumIndex = limit
    if (maximumIndex < 0)
        maximumIndex += size
    if (maximumIndex < 0)
        throw new CollectionHolderIndexOutOfBoundsException(`The limit "${limit}" ("${maximumIndex}" after calculation) cannot under 0.`, limit,)

    return maximumIndex
}

//#endregion -------------------- Utility methods --------------------
//#region -------------------- Loop methods --------------------

function __withoutALimitAnd0Argument(predicate: () => boolean, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (predicate())
            return index
    return null
}

function __withoutALimitAnd1Argument(predicate: (index: number,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (predicate(index,))
            return index
    return null
}

function __withoutALimitAnd2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (index: number, value: T,) => boolean, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (predicate(index, collection.get(index,),))
            return index
    return null
}


function __withALimitAnd0Argument(predicate: () => boolean, startingIndex: number, endingIndex: number, maximumIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (index >= maximumIndex)
            return null
        else if (predicate())
            return index
    return null
}

function __withALimitAnd1Argument(predicate: (index: number,) => boolean, startingIndex: number, endingIndex: number, maximumIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (index >= maximumIndex)
            return null
        else if (predicate(index,))
            return index
    return null
}

function __withALimitAnd2Argument<const T, >(collection: MinimalistCollectionHolder<T>, predicate: (index: number, value: T,) => boolean, startingIndex: number, endingIndex: number, maximumIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (index >= maximumIndex)
            return null
        else if (predicate(index, collection.get(index,),))
            return index
    return null
}

//#endregion -------------------- Loop methods --------------------
