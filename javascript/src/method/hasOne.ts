/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {Nullable}         from "../general type"

/**
 * Tell whenever at least one value exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains.html Kotlin contains(element)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
 * @extensionFunction
 */
export function hasOne<const T, >(collection: Nullable<CollectionHolder<T>>, ...values: readonly T[]): boolean
/**
 * Tell whenever at least one value exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains.html Kotlin contains(element)
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
 * @extensionFunction
 */
export function hasOne(collection: Nullable<CollectionHolder>, ...values: readonly unknown[]): boolean
export function hasOne(collection: Nullable<CollectionHolder>, ...values: readonly unknown[]): boolean {
    //#region -------------------- Early returns --------------------

    if (collection == null)
        return false
    if (collection.isEmpty)
        return false

    const valuesSize = values.length
    if (valuesSize == 0)
        return true

    //#endregion -------------------- Early returns --------------------

    const size = collection.size
    let valueIndex = -1
    while (++valueIndex < valuesSize) {
        let index = -1
        const value = values[valueIndex]
        while (++index < size)
            if (collection.get(index,) === value)
                return true
    }
    return false
}
