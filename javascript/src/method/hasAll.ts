/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable}                   from "../general type"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

/**
 * Tell that the {@link values} are in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} Every {@link values} are in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, ...values: readonly T[]): boolean
/**
 * Tell that the {@link values} are in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} Every {@link values} are in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 */
export function hasAll(collection: Nullable<MinimalistCollectionHolder>, ...values: readonly unknown[]): boolean
export function hasAll(collection: Nullable<MinimalistCollectionHolder>, ...values: readonly unknown[]): boolean {
    //#region -------------------- Early returns --------------------

    if (collection == null)
        return false

    const valueSize = values.length
    if (valueSize == 0)
        return true

    if (collection.isEmpty)
        return false

    //#endregion -------------------- Early returns --------------------

    const size = collection.size
    let valueIndex = -1
    valueLoop: while (++valueIndex < valueSize) {
        let index = -1
        const value = values[valueIndex]
        while (++index < size)
            if (collection.get(index,) === value)
                continue valueLoop
        return false
    }
    return true
}
