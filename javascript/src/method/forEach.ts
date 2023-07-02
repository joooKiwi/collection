/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder}   from "../CollectionHolder"
import type {ValueIndexCallback} from "../CollectionHolder.types"

/**
 * Perform a given {@link action} on each element
 * and return the {@link collection} afterwards
 *
 * @param collection The {@link CollectionHolder collection}
 * @param action The given action
 * @see ReadonlyArray.forEach
 * @see ReadonlySet.forEach
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/for-each.html Kotlin forEach(action)
 *
 * @extensionFunction
 */
export function forEach<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION, action: ValueIndexCallback<T>,): COLLECTION {
    const size = collection.size
    let index = -1
    while (++index < size)
        action(collection.get(index,), index,)
    return collection
}
