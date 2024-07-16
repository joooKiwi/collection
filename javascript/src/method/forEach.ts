/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {ValueIndexCallback}         from "../CollectionHolder.types"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

/**
 * Perform a given {@link action} on each element
 * and return the {@link collection} afterwards
 *
 * @param collection The {@link MinimalistCollectionHolder collection}
 * @param action     The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html Kotlin forEach(action)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
 * @extensionFunction
 */
export function forEach<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION, action: ValueIndexCallback<T>,): COLLECTION {
    if (action.length == 1)
        return __with1Argument(collection, action as (value: T,) => void,)
    if (action.length >= 2)
        return __with2Argument(collection, action,)
    return __with0Argument(collection, action as () => void,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __with0Argument<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION, action: () => void,) {
    let index = collection.size
    while (index-- > 0)
        action()
    return collection
}

function __with1Argument<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION, action: (value: T,) => void,) {
    const size = collection.size
    let index = -1
    while (++index < size)
        action(collection.get(index,),)
    return collection
}

function __with2Argument<const T, const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(collection: COLLECTION, action: (value: T, index: number,) => void,) {
    const size = collection.size
    let index = -1
    while (++index < size)
        action(collection.get(index,), index,)
    return collection
}

//#endregion -------------------- Loop methods --------------------
