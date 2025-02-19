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
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param element    The element to find
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (`size - 1` by default)
 * @return {NullOrNumber} The index associated to the {@link element} found or <b>null</b>
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function firstIndexOfOrNull<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, element: T, from: NullableNumber = null, to: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (to == null)
        if (from == null)
            return __core0(collection, element,)
        else
            return __core1(collection, element, from,)
    if (from == null)
        return __coreWithNoFrom(collection, element, to,)
    return __core2(collection, element, from, to,)
}


/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param element    The element to find
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link MinimalistCollectionHolder.size size} - 1</code> by default)
 * @return {NullOrNumber} The index associated to the {@link element} found or <b>null</b>
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function firstIndexOfOrNullByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, element: T, from: NullableNumber = null, to: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (to == null)
        if (from == null)
            return __core0ByMinimalistCollectionHolder(collection, element,)
        else
            return __core1ByMinimalistCollectionHolder(collection, element, from,)
    if (from == null)
        return __coreWithNoFromByMinimalistCollectionHolder(collection, element, to,)
    return __core2ByMinimalistCollectionHolder(collection, element, from, to,)
}

/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param element    The element to find
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
 * @return {NullOrNumber} The index associated to the {@link element} found or <b>null</b>
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function firstIndexOfOrNullByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, element: T, from: NullableNumber = null, to: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (to == null)
        if (from == null)
            return __core0ByCollectionHolder(collection, element,)
        else
            return __core1ByCollectionHolder(collection, element, from,)
    if (from == null)
        return __coreWithNoFromByCollectionHolder(collection, element, to,)
    return __core2ByCollectionHolder(collection, element, from, to,)
}

/**
 * Get the <b>first</b> occurrence equivalent to the value received
 * or <b>null</b> if it was not in the {@link collection}
 * between the {@link from starting} and the {@link to ending} index
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param element    The element to find
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link ReadonlyArray.length size} - 1</code> by default)
 * @return {NullOrNumber} The index associated to the {@link element} found or <b>null</b>
 * @canReceiveNegativeValue
 * @onlyGivePositiveValue
 * @extensionFunction
 */
export function firstIndexOfOrNullByArray<const T, >(collection: Nullable<readonly T[]>, element: T, from: NullableNumber = null, to: NullableNumber = null,): NullOrNumber {
    if (collection == null)
        return null
    if (to == null)
        if (from == null)
            return __core0ByArray(collection, element,)
        else
            return __core1ByArray(collection, element, from,)
    if (from == null)
        return __coreWithNoFromByArray(collection, element, to,)
    return __core2ByArray(collection, element, from, to,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Core methods --------------------

//#region -------------------- element --------------------

function __core0<const T, >(collection: | MinimalistCollectionHolder<T> | readonly T[], element: T,) {
    if (isCollectionHolder<T>(collection,))
        return __core0ByCollectionHolder(collection, element,)
    if (isArray(collection,))
        return __core0ByArray(collection, element,)
    if (isCollectionHolderByStructure<T>(collection,))
        return __core0ByCollectionHolder(collection, element,)
    if (isArrayByStructure<T>(collection,))
        return __core0ByArray(collection, element,)
    return __core0ByMinimalistCollectionHolder(collection, element,)
}

function __core0ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, element: T,) {
    const size = collection.size
    if (size === 0)
        return null
    return __findInRange(collection, element, 0, size - 1,)
}

function __core0ByCollectionHolder<const T, >(collection: CollectionHolder<T>, element: T,) {
    if (collection.isEmpty)
        return null
    return __findInRange(collection, element, 0, collection.size - 1,)
}

function __core0ByArray<const T, >(collection: readonly T[], element: T,): NullOrNumber {
    const size = collection.length
    if (size === 0)
        return null
    return __findInRangeByArray(collection, element, 0, size - 1,)
}

//#endregion -------------------- element --------------------
//#region -------------------- element, from --------------------

function __core1<const T, >(collection: | MinimalistCollectionHolder<T> | readonly T[], element: T, from: number,) {
    if (isCollectionHolder<T>(collection,))
        return __core1ByCollectionHolder(collection, element, from,)
    if (isArray(collection,))
        return __core1ByArray(collection, element, from,)
    if (isCollectionHolderByStructure<T>(collection,))
        return __core1ByCollectionHolder(collection, element, from,)
    if (isArrayByStructure<T>(collection,))
        return __core1ByArray(collection, element, from,)
    return __core1ByMinimalistCollectionHolder(collection, element, from,)
}

function __core1ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, element: T, from: number,) {
    const size = collection.size
    if (size === 0)
        return null

    const startingIndex = __startingIndexOrNull(from, size,)
    if (startingIndex == null)
        return null
    return __findInRange(collection, element, startingIndex, size - 1,)
}

function __core1ByCollectionHolder<const T, >(collection: CollectionHolder<T>, element: T, from: number,) {
    if (collection.isEmpty)
        return null

    const size = collection.size
    const startingIndex = __startingIndexOrNull(from, size,)
    if (startingIndex == null)
        return null
    return __findInRange(collection, element, startingIndex, size - 1,)
}

function __core1ByArray<const T, >(collection: readonly T[], element: T, from: number,) {
    const size = collection.length
    if (size === 0)
        return null

    const startingIndex = __startingIndexOrNull(from, size,)
    if (startingIndex == null)
        return null
    return __findInRangeByArray(collection, element, startingIndex, size - 1,)
}

//#endregion -------------------- element, from --------------------
//#region -------------------- element, from, to --------------------

function __core2<const T, >(collection: | MinimalistCollectionHolder<T> | readonly T[], element: T, from: number, to: number,) {
    if (isCollectionHolder<T>(collection,))
        return __core2ByCollectionHolder(collection, element, from, to,)
    if (isArray(collection,))
        return __core2ByArray(collection, element, from, to,)
    if (isCollectionHolderByStructure<T>(collection,))
        return __core2ByCollectionHolder(collection, element, from, to,)
    if (isArrayByStructure<T>(collection,))
        return __core2ByArray(collection, element, from, to,)
    return __core2ByMinimalistCollectionHolder(collection, element, from, to,)
}

function __core2ByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, element: T, from: number, to: number,) {
    const size = collection.size
    if (size === 0)
        return null

    const startingIndex = __startingIndexOrNull(from, size,)
    if (startingIndex == null)
        return null

    const endingIndex = __endingIndexOrNull(to, size,)
    if (endingIndex == null)
        return null
    if (endingIndex < startingIndex)
        return null
    return __findInRange(collection, element, startingIndex, endingIndex,)
}

function __core2ByCollectionHolder<const T, >(collection: CollectionHolder<T>, element: T, from: number, to: number,) {
    if (collection.isEmpty)
        return null

    const size = collection.size
    const startingIndex = __startingIndexOrNull(from, size,)
    if (startingIndex == null)
        return null

    const endingIndex = __endingIndexOrNull(to, size,)
    if (endingIndex == null)
        return null
    if (endingIndex < startingIndex)
        return null
    return __findInRange(collection, element, startingIndex, endingIndex,)
}

function __core2ByArray<const T, >(collection: readonly T[], element: T, from: number, to: number,) {
    const size = collection.length
    if (size === 0)
        return null

    const startingIndex = __startingIndexOrNull(from, size,)
    if (startingIndex == null)
        return null

    const endingIndex = __endingIndexOrNull(to, size,)
    if (endingIndex == null)
        return null
    if (endingIndex < startingIndex)
        return null
    return __findInRangeByArray(collection, element, startingIndex, endingIndex,)
}

//#endregion -------------------- element, from, to --------------------
//#region -------------------- element, to --------------------

function __coreWithNoFrom<const T, >(collection: | MinimalistCollectionHolder<T> | readonly T[], element: T, to: number,) {
    if (isCollectionHolder<T>(collection,))
        return __coreWithNoFromByCollectionHolder(collection, element, to,)
    if (isArray(collection,))
        return __coreWithNoFromByArray(collection, element, to,)
    if (isCollectionHolderByStructure<T>(collection,))
        return __coreWithNoFromByCollectionHolder(collection, element, to,)
    if (isArrayByStructure<T>(collection,))
        return __coreWithNoFromByArray(collection, element, to,)
    return __coreWithNoFromByMinimalistCollectionHolder(collection, element, to,)
}

function __coreWithNoFromByMinimalistCollectionHolder<const T, >(collection: MinimalistCollectionHolder<T>, element: T, to: number,) {
    const size = collection.size
    if (size === 0)
        return null

    const endingIndex = __endingIndexOrNull(to, size,)
    if (endingIndex == null)
        return null
    return __findInRange(collection, element, 0, endingIndex,)
}

function __coreWithNoFromByCollectionHolder<const T, >(collection: CollectionHolder<T>, element: T, to: number,) {
    if (collection.isEmpty)
        return null

    const endingIndex = __endingIndexOrNull(to, collection.size,)
    if (endingIndex == null)
        return null
    return __findInRange(collection, element, 0, endingIndex,)
}

function __coreWithNoFromByArray<const T, >(collection: readonly T[], element: T, to: number,) {
    const size = collection.length
    if (size === 0)
        return null

    const endingIndex = __endingIndexOrNull(to, size,)
    if (endingIndex == null)
        return null
    return __findInRangeByArray(collection, element, 0, endingIndex,)
}

//#endregion -------------------- element, to --------------------

//#endregion -------------------- Core methods --------------------
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
