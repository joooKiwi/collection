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

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {ReturnCallback}             from "../type/callback"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade methods --------------------

/**
 * Get the last element in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param defaultValue The callback to retrieve the default value if it is over the size (after calculation)
 * @extensionFunction
 */
export function getLastOrElse<const T, const U, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, defaultValue: ReturnCallback<U>,): | T | U
/**
 * Get the last element in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @extensionFunction
 */
export function getLastOrElse<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, defaultValue: ReturnCallback<T>,): T
export function getLastOrElse<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, defaultValue: ReturnCallback<unknown>,) {
    if (collection == null)
        return defaultValue()
    if (isCollectionHolder(collection,))
        return getLastOrElseByCollectionHolder(collection, defaultValue,)
    if (isArray(collection,))
        return getLastOrElseByArray(collection, defaultValue,)
    if (isMinimalistCollectionHolder(collection,))
        return getLastOrElseByMinimalistCollectionHolder(collection, defaultValue,)

    if (isCollectionHolderByStructure<T>(collection,))
        return getLastOrElseByCollectionHolder(collection, defaultValue,)
    if (isArrayByStructure<T>(collection,))
        return getLastOrElseByArray(collection, defaultValue,)
    return getLastOrElseByMinimalistCollectionHolder(collection, defaultValue,)
}


/**
 * Get the last element in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The nullable collection
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @extensionFunction
 */
export function getLastOrElseByMinimalistCollectionHolder<const T, const U, >(collection: Nullable<MinimalistCollectionHolder<T>>, defaultValue: ReturnCallback<U>,): | T | U
/**
 * Get the last element in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The nullable collection
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @extensionFunction
 */
export function getLastOrElseByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, defaultValue: ReturnCallback<T>,): T
export function getLastOrElseByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, defaultValue: ReturnCallback<unknown>,) {
    if (collection == null)
        return defaultValue()

    const size = collection.size
    if (size == 0)
        return defaultValue()
    return collection.get(collection.size - 1,)
}

/**
 * Get the last element in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The nullable collection
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @extensionFunction
 */
export function getLastOrElseByCollectionHolder<const T, const U, >(collection: Nullable<CollectionHolder<T>>, defaultValue: ReturnCallback<U>,): | T | U
/**
 * Get the last element in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The nullable collection
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @extensionFunction
 */
export function getLastOrElseByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, defaultValue: ReturnCallback<T>,): T
export function getLastOrElseByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, defaultValue: ReturnCallback<unknown>,) {
    if (collection == null)
        return defaultValue()
    if (collection.isEmpty)
        return defaultValue()
    return collection.getLast()
}


/**
 * Get the last element in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The nullable collection
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @extensionFunction
 */
export function getLastOrElseByArray<const T, const U, >(collection: Nullable<readonly T[]>, defaultValue: ReturnCallback<U>,): | T | U
/**
 * Get the last element in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The nullable collection
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @extensionFunction
 */
export function getLastOrElseByArray<const T, >(collection: Nullable<readonly T[]>, defaultValue: ReturnCallback<T>,): T
export function getLastOrElseByArray<const T, >(collection: Nullable<readonly T[]>, defaultValue: ReturnCallback<unknown>,) {
    if (collection == null)
        return defaultValue()
    const size = collection.length
    if (size == 0)
        return defaultValue()
    return collection[collection.length - 1]
}

//#endregion -------------------- Facade methods --------------------
