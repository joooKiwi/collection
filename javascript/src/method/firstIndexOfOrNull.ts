//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Nullable, NullableNumber, NullOrNumber} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {__endingIndexOrNull, __startingIndexOrNull} from "./_indexes utility"
import {isArray}                                    from "./isArray"
import {isArrayByStructure}                         from "./isArrayByStructure"
import {isCollectionHolder}                         from "./isCollectionHolder"
import {isCollectionHolderByStructure}              from "./isCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function firstIndexOfOrNull<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (isCollectionHolder<T>(collection,))
        return firstIndexOfOrNullByCollectionHolder(collection, element, fromIndex, toIndex,)
    if (isArray(collection,))
        return firstIndexOfOrNullByArray(collection, element, fromIndex, toIndex,)
    if (isCollectionHolderByStructure<T>(collection,))
        return firstIndexOfOrNullByCollectionHolder(collection, element, fromIndex, toIndex,)
    if (isArrayByStructure<T>(collection,))
        return firstIndexOfOrNullByArray(collection, element, fromIndex, toIndex,)
    return firstIndexOfOrNullByMinimalistCollectionHolder(collection, element, fromIndex, toIndex,)
}


/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function firstIndexOfOrNullByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null

    const size = collection.size
    if (size === 0)
        return null

    const startingIndex = __startingIndexOrNull(fromIndex, size,)
    if (startingIndex == null)
        return null

    const endingIndex = __endingIndexOrNull(toIndex, size,)
    if (endingIndex == null)
        return null
    if (endingIndex < startingIndex)
        return null
    return __findInRange(collection, element, startingIndex, endingIndex,)
}

/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function firstIndexOfOrNullByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (collection.isEmpty)
        return null

    const size = collection.size
    const startingIndex = __startingIndexOrNull(fromIndex, size,)
    if (startingIndex == null)
        return null

    const endingIndex = __endingIndexOrNull(toIndex, size,)
    if (endingIndex == null)
        return null
    if (endingIndex < startingIndex)
        return null
    return __findInRange(collection, element, startingIndex, endingIndex,)
}

/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * from a range (if provided)
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param element    The element to find
 * @param fromIndex  The inclusive starting index
 * @param toIndex    The inclusive ending index
 * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function firstIndexOfOrNullByArray<const T, >(collection: Nullable<readonly T[]>, element: T, fromIndex: NullableNumber = null, toIndex: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null

    const size = collection.length
    if (size === 0)
        return null

    const startingIndex = __startingIndexOrNull(fromIndex, size,)
    if (startingIndex == null)
        return null

    const endingIndex = __endingIndexOrNull(toIndex, size,)
    if (endingIndex == null)
        return null
    if (endingIndex < startingIndex)
        return null
    return __findInRangeByArray(collection, element, startingIndex, endingIndex,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __findInRange<const T, >(collection: MinimalistCollectionHolder<T>, element: T, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (collection.get(index,) === element)
            return index
    return null
}

function __findInRangeByArray<const T, >(collection: readonly T[], element: T, startingIndex: number, endingIndex: number,) {
    let index = startingIndex - 1
    while (++index <= endingIndex)
        if (collection[index] === element)
            return index
    return null
}

//#endregion -------------------- Loop methods --------------------
