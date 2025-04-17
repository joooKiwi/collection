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

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {IndexWithReturnCallback}    from "../type/callback"

import {isArray}                       from "./isArray"
import {isArrayByStructure}            from "./isArrayByStructure"
import {isCollectionHolder}            from "./isCollectionHolder"
import {isCollectionHolderByStructure} from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}  from "./isMinimalistCollectionHolder"

//#region -------------------- Facade methods --------------------

/**
 * Get the first element in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param defaultValue The callback to retrieve the default value if it is over the size (after calculation)
 * @extensionFunction
 */
export function getFirstOrElse<const T, const U, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, defaultValue: IndexWithReturnCallback<U>,): | T | U
/**
 * Get the first element in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @extensionFunction
 */
export function getFirstOrElse<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, defaultValue: IndexWithReturnCallback<T>,): T
export function getFirstOrElse<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, defaultValue: IndexWithReturnCallback<unknown>,) {
    if (collection == null)
        return defaultValue(0,)
    if (isCollectionHolder(collection,))
        return getFirstOrElseByCollectionHolder(collection, defaultValue,)
    if (isArray(collection,))
        return getFirstOrElseByArray(collection, defaultValue,)
    if (isMinimalistCollectionHolder(collection,))
        return getFirstOrElseByMinimalistCollectionHolder(collection, defaultValue,)

    if (isCollectionHolderByStructure<T>(collection,))
        return getFirstOrElseByCollectionHolder(collection, defaultValue,)
    if (isArrayByStructure<T>(collection,))
        return getFirstOrElseByArray(collection, defaultValue,)
    return getFirstOrElseByMinimalistCollectionHolder(collection, defaultValue,)
}


/**
 * Get the first element in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @extensionFunction
 */
export function getFirstOrElseByMinimalistCollectionHolder<const T, const U, >(collection: Nullable<MinimalistCollectionHolder<T>>, defaultValue: IndexWithReturnCallback<U>,): | T | U
/**
 * Get the first element in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @extensionFunction
 */
export function getFirstOrElseByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, defaultValue: IndexWithReturnCallback<T>,): T
export function getFirstOrElseByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, defaultValue: IndexWithReturnCallback<unknown>,) {
    if (collection == null)
        return defaultValue(0,)

    const size = collection.size
    if (size == 0)
        return defaultValue(0,)
    return collection.get(0,)
}

/**
 * Get the first element in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @extensionFunction
 */
export function getFirstOrElseByCollectionHolder<const T, const U, >(collection: Nullable<CollectionHolder<T>>, defaultValue: IndexWithReturnCallback<U>,): | T | U
/**
 * Get the first element in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @extensionFunction
 */
export function getFirstOrElseByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, defaultValue: IndexWithReturnCallback<T>,): T
export function getFirstOrElseByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, defaultValue: IndexWithReturnCallback<unknown>,) {
    if (collection == null)
        return defaultValue(0,)
    if (collection.isEmpty)
        return defaultValue(0,)
    return collection.getFirst()
}


/**
 * Get the first element in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @extensionFunction
 */
export function getFirstOrElseByArray<const T, const U, >(collection: Nullable<readonly T[]>, defaultValue: IndexWithReturnCallback<U>,): | T | U
/**
 * Get the first element in the {@link collection}
 * or calling the {@link defaultValue} function
 * if it is out of bound of the {@link collection}
 *
 * @param collection   The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
 * @extensionFunction
 */
export function getFirstOrElseByArray<const T, >(collection: Nullable<readonly T[]>, defaultValue: IndexWithReturnCallback<T>,): T
export function getFirstOrElseByArray<const T, >(collection: Nullable<readonly T[]>, defaultValue: IndexWithReturnCallback<unknown>,) {
    if (collection == null)
        return defaultValue(0,)
    const size = collection.length
    if (size == 0)
        return defaultValue(0,)
    return collection[0]
}

//#endregion -------------------- Facade methods --------------------
