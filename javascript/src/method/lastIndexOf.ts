/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}           from "../CollectionHolder"
import type {Nullable, NullOr}           from "../general type"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"
import {ForbiddenIndexException}                   from "../exception/ForbiddenIndexException"

//#region -------------------- Facade method --------------------

/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOr<number>} The index associated to the {@link element} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOf<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOr<number>} The index associated to the {@link element} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOf<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
export function lastIndexOf(collection: Nullable<MinimalistCollectionHolder>, element: unknown, fromIndex: Nullable<number> = null, toIndex: Nullable<number> = null, limit: Nullable<number> = null,): NullOr<number> {
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

    if (limit == null)
        return __withoutALimit(collection, element, startingIndex, endingIndex,)

    //#region -------------------- Initialization (maximum index) --------------------

    const maximumIndex = __maximumIndex(limit, size,)
    if (maximumIndex == size)
        return __withoutALimit(collection, element, startingIndex, endingIndex,)
    if (endingIndex - startingIndex < maximumIndex - 1)
        return null

    //#endregion -------------------- Initialization (maximum index) --------------------

    return __withALimit(collection, element, startingIndex, endingIndex, maximumIndex,)
}

/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOr<number>} The index associated to the {@link element} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOfByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
/**
 * Get the <b>last</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @param limit      The maximum index
 * @return {NullOr<number>} The index associated to the {@link element} within the range or <b>null</b>
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @see ReadonlyArray.lastIndexOf
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item)
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function lastIndexOfByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
export function lastIndexOfByCollectionHolder(collection: Nullable<CollectionHolder>, element: unknown, fromIndex: Nullable<number> = null, toIndex: Nullable<number> = null, limit: Nullable<number> = null,): NullOr<number> {
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

    if (limit == null)
        return __withoutALimit(collection, element, startingIndex, endingIndex,)

    //#region -------------------- Initialization (maximum index) --------------------

    const maximumIndex = __maximumIndex(limit, size,)
    if (maximumIndex == size)
        return __withoutALimit(collection, element, startingIndex, endingIndex,)
    if (endingIndex - startingIndex < maximumIndex - 1)
        return null

    //#endregion -------------------- Initialization (maximum index) --------------------

    return __withALimit(collection, element, startingIndex, endingIndex, maximumIndex,)
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
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The limit "${limit}" cannot over the collection size "${size}".`, limit,)

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
        throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The limit "${limit}" ("${maximumIndex}" after calculation) cannot under 0.`, limit,)

    return maximumIndex
}

//#endregion -------------------- Utility methods --------------------
//#region -------------------- Loop methods --------------------

function __withoutALimit(collection: MinimalistCollectionHolder, element: unknown, startingIndex: number, endingIndex: number,) {
    let index = endingIndex + 1
    while (--index >= startingIndex)
        if (collection.get(index,) === element)
            return index
    return null
}

function __withALimit(collection: MinimalistCollectionHolder, element: unknown, startingIndex: number, endingIndex: number, maximumIndex: number,) {
    let index = endingIndex + 1
    if (index >= maximumIndex)
        index = maximumIndex
    while (--index >= startingIndex)
        if (collection.get(index,) === element)
            return index
    return null
}

//#endregion -------------------- Loop methods --------------------
