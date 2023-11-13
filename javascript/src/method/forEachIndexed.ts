/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}   from "../CollectionHolder"
import type {IndexValueCallback} from "../CollectionHolder.types"

//#region -------------------- Facade method --------------------

/**
 * Perform a given {@link action} on each element
 * and return the {@link collection} afterwards
 *
 * @param collection The {@link CollectionHolder collection}
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/for-each.html Kotlin forEach(action)
 * @extensionFunction
 */
export function forEachIndexed<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION, action: IndexValueCallback<T>,): COLLECTION {
    if (action.length === 1)
        return __with1Argument(collection, action as (index: number,) => void,)
    if (action.length >= 2)
        return __with2Argument(collection, action,)
    return __with0Argument(collection, action as () => void,)
}
//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION, action: () => void,) {
    const size = collection.size
    let index = -1
    while (++index < size)
        action()
    return collection
}

function __with1Argument<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION, action: (index: number,) => void,) {
    const size = collection.size
    let index = -1
    while (++index < size)
        action(index,)
    return collection
}

function __with2Argument<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION, action: (index: number,value: T, ) => void,) {
    const size = collection.size
    let index = -1
    while (++index < size)
        action(index,collection.get(index,), )
    return collection
}

//#endregion -------------------- Loop methods --------------------
