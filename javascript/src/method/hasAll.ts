/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {Nullable}         from "../general type"

/**
 * Tell that the {@link values} are in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values The values to compare
 * @returns {boolean} Every {@link values} are in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 *
 * @extensionFunction
 */
export function hasAll<const T, >(collection: Nullable<CollectionHolder<T>>, ...values: readonly T[]): boolean
/**
 * Tell that the {@link values} are in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values The values to compare
 * @returns {boolean} Every {@link values} are in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 *
 * @extensionFunction
 */
export function hasAll(collection: Nullable<CollectionHolder>, ...values: readonly unknown[]): boolean
export function hasAll(collection: Nullable<CollectionHolder>, ...values: readonly unknown[]): boolean {
    if (collection == null)
        return false
    const size = collection.size
    if (size === 0)
        return false

    const valueSize = values.length
    if (valueSize === 0)
        return true

    let valueIndex = -1
    valueLoop: while (++valueIndex < valueSize) {
        let index = -1
        while (++index < size)
            if (collection.get(index,) === values[valueIndex])
                continue valueLoop
        return false
    }
    return true
}
