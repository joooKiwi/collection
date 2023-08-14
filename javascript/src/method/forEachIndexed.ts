/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}   from "../CollectionHolder"
import type {IndexValueCallback} from "../CollectionHolder.types"

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
export function forEachIndexed<const T, const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >(collection: COLLECTION, action: IndexValueCallback<T>,): COLLECTION {
    const size = collection.size
    let index = -1
    while (++index < size)
        action(index, collection.get(index,),)
    return collection
}
