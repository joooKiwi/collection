//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Array, MutableArray} from "@joookiwi/type"

import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants} from "../CollectionConstants"

/** @internal */
export function __values<const T, >(collection: MinimalistCollectionHolder<T>, size: number,): MutableArray<T> {
    const array = new Array<T>(size,)
    let index = size
    while (index-- > 0)
        array[index] = collection.get(index,)
    return array
}

/** @internal */
export function __valuesByArray<const T, >(collection: Array<T>, size: number,): MutableArray<T> {
    const array = new Array<T>(size,)
    let index = size
    while (index-- > 0)
        array[index] = collection[index] as T
    return array
}


/** @internal */
export function __uniqueValues<const T, >(collection: MinimalistCollectionHolder<T>, size: number,): MutableArray<T> {
    //#region -------------------- Possibly remove duplicates --------------------

    const array1 = new Array<T>(size,)
    array1[0] = collection.get(0,)
    let amountOfItemAdded = 1
    let index1 = -1
    loopToRemoveDuplicate: while (++index1 < size) {
        const value = collection.get(index1,)
        let index2 = -1
        while (++index2 < amountOfItemAdded)
            if (array1[index2] === value)
                continue loopToRemoveDuplicate // It is equal, so we don't add it to the duplicates
            else
                array1[amountOfItemAdded++] = value
    }

    if (amountOfItemAdded === size)
        return array1

    //#endregion -------------------- Possibly remove duplicates --------------------
    //#region -------------------- Return the non-duplicated values --------------------

    const array2 = new Array<T>(amountOfItemAdded,)
    let index3 = amountOfItemAdded
    while (index3-- > 0)
        array2[index3] = array1[index3] as T
    return array2

    //#endregion -------------------- Return the non-duplicated values --------------------
}

/** @internal */
export function __uniqueValuesByArray<const T, >(collection: Array<T>, size: number,): MutableArray<T> {
    //#region -------------------- Possibly remove duplicates --------------------

    const array1 = new Array<T>(size,)
    array1[0] = collection[0] as T
    let amountOfItemAdded = 1
    let index1 = -1
    loopToRemoveDuplicate: while (++index1 < size) {
        const value = collection[index1] as T
        let index2 = -1
        while (++index2 < amountOfItemAdded)
            if (array1[index2] === value)
                continue loopToRemoveDuplicate // It is equal, so we don't add it to the duplicates
            else
                array1[amountOfItemAdded++] = value
    }

    if (amountOfItemAdded === size)
        return array1

    //#endregion -------------------- Possibly remove duplicates --------------------
    //#region -------------------- Return the non-duplicated values --------------------

    const array2 = new Array<T>(amountOfItemAdded,)
    let index3 = amountOfItemAdded
    while (index3-- > 0)
        array2[index3] = array1[index3] as T
    return array2

    //#endregion -------------------- Return the non-duplicated values --------------------
}


/** @internal */
export function __associativeValues<const T, >(collection: MinimalistCollectionHolder<T>, size: number,): MutableArray<readonly [number, T,]> {
    const array = new Array<readonly [number, T,]>(size,)
    let index = size
    while (index-- > 0)
        array[index] = [index, collection.get(index,),]
    return array
}

/** @internal */
export function __associativeValuesByArray<const T, >(collection: Array<T>, size: number,): MutableArray<readonly [number, T,]> {
    const array = new Array<readonly [number, T,]>(size,)
    let index = size
    while (index-- > 0)
        array[index] = [index, collection[index] as T,]
    return array
}



/**
 * Reduce the given {@link collection} to a {@link newSize new size}
 *
 * @param collection The collection to reduce its size
 * @param newSize    The new size of the {@link collection} that will be returned
 * @note It imply that {@link newSize} is under the size of the {@link collection}
 * @internal
 */
export function __reduceTo<const T, >(collection: MinimalistCollectionHolder<T>, newSize: number,): Array<T> {
    if (newSize === 0)
        return CollectionConstants.EMPTY_ARRAY

    const newArray = new Array<T>(newSize,)
    let index = -1
    while (++index < newSize)
        newArray[index] = collection.get(index,)
    return newArray
}

/**
 * Reduce the given {@link collection} to a {@link newSize new size}
 *
 * @param collection The collection to reduce its size
 * @param newSize    The new size of the {@link collection} that will be returned
 * @note It imply that {@link newSize} is under the size of the {@link collection}
 * @internal
 */
export function __reduceToByArray<const T, >(collection: Array<T>, newSize: number,): Array<T> {
    if (newSize === 0)
        return CollectionConstants.EMPTY_ARRAY

    const newArray = new Array<T>(newSize,)
    let index = -1
    while (++index < newSize)
        newArray[index] = collection[index] as T
    return newArray
}


/**
 * Reduce the given {@link collection} from a {@link startingIndex starting point} to its end
 *
 * @param collection    The collection to reduce its size
 * @param startingIndex The first index to retrieve the values
 * @param size          The size of the {@link collection}
 * @note It imply that {@link startingIndex} is under the size of the {@link collection}
 * @internal
 */
export function __reduceFrom<const T, >(collection: MinimalistCollectionHolder<T>, startingIndex: number, size: number,): Array<T> {
    const newSize = size - startingIndex - 1
    if (newSize === 0)
        return CollectionConstants.EMPTY_ARRAY
    if (newSize === 1)
        return [collection.get(startingIndex + 1,),]

    const newArray = new Array<T>(newSize,)
    let indexAdded = 0
    let index = startingIndex
    while (++index < size)
        newArray[indexAdded++] = collection.get(index,)
    return newArray
}

/**
 * Reduce the given {@link collection} from a {@link startingIndex starting point} to its end
 *
 * @param collection    The collection to reduce its size
 * @param startingIndex The first index to retrieve the values
 * @param size          The size of the {@link collection}
 * @note It imply that {@link startingIndex} is under the size of the {@link collection}
 * @internal
 */
export function __reduceFromByArray<const T, >(collection: Array<T>, startingIndex: number, size: number,): Array<T> {
    const newSize = size - startingIndex - 1
    if (newSize === 0)
        return CollectionConstants.EMPTY_ARRAY
    if (newSize === 1)
        return [collection[startingIndex + 1] as T,]

    const newArray = new Array<T>(newSize,)
    let indexAdded = 0
    let index = startingIndex
    while (++index < size)
        newArray[indexAdded++] = collection[index] as T
    return newArray
}
