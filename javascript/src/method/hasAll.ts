/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

//#region -------------------- Facade method --------------------

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
    if (collection == null)
        return false

    const valueSize = values.length
    if (valueSize == 0)
        return true

    const size = collection.size
    if (size == 0)
        return false
    return __hasAll(collection, values, size, valueSize,)
}

/**
 * Tell that the {@link values} are in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} Every {@link values} are in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, ...values: readonly T[]): boolean
/**
 * Tell that the {@link values} are in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} Every {@link values} are in the {@link collection}
 * @see ReadonlyArray.includes
 * @see ReadonlySet.has
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 */
export function hasAllByCollectionHolder(collection: Nullable<CollectionHolder>, ...values: readonly unknown[]): boolean
export function hasAllByCollectionHolder(collection: Nullable<CollectionHolder>, ...values: readonly unknown[]): boolean {
    if (collection == null)
        return false

    const valueSize = values.length
    if (valueSize == 0)
        return true

    if (collection.isEmpty)
        return false
    return __hasAll(collection, values, collection.size, valueSize,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasAll(collection: MinimalistCollectionHolder, values: readonly unknown[], size: number, valuesSize: number,) {
    let valueIndex = -1
    valueLoop: while (++valueIndex < valuesSize) {
        let index = -1
        const value = values[valueIndex]
        while (++index < size)
            if (collection.get(index,) === value)
                continue valueLoop
        return false
    }
    return true
}

//#endregion -------------------- Loop methods --------------------
