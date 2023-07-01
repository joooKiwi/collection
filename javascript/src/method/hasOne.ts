/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {Nullable}         from "../general type"

/**
 * Tell whenever at least one value exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values The values to compare
 * @returns {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains.html Kotlin contains(element)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
 *
 * @extensionFunction
 */
export function hasOne<const T, >(collection: Nullable<CollectionHolder<T>>, ...values: readonly T[]): boolean
/**
 * Tell whenever at least one value exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values The values to compare
 * @returns {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains.html Kotlin contains(element)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
 *
 * @extensionFunction
 */
export function hasOne(collection: Nullable<CollectionHolder>, ...values: readonly unknown[]): boolean
export function hasOne(collection: Nullable<CollectionHolder>, ...values: readonly unknown[]): boolean {
    if (collection == null)
        return false
    const size = collection.size
    if (size === 0)
        return false

    const valueSize = values.length
    if (valueSize === 0)
        return true

    let valueIndex = -1
    while (++valueIndex < valueSize) {
        let index = -1
        while (++index < size)
            if (collection.get(index,) === values[valueIndex])
                return true
    }
    return false
}
