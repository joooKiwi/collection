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
 * Tell that all of the {@link values} (as a {@link MinimalistCollectionHolder}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} (as a {@link MinimalistCollectionHolder}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder,): boolean
export function hasAllWithMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder,) {
    if (collection == null)
        return false

    const valuesSize = values.size
    if (valuesSize)
        return true

    const size = collection.size
    if (size == 0)
        return false

    return __hasAll(collection, values, size, valuesSize,)
}

/**
 * Tell that all of the {@link values} (as a {@link MinimalistCollectionHolder}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithMinimalistCollectionHolderByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} (as a {@link MinimalistCollectionHolder}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithMinimalistCollectionHolderByCollectionHolder(collection: Nullable<CollectionHolder>, values: MinimalistCollectionHolder,): boolean
export function hasAllWithMinimalistCollectionHolderByCollectionHolder(collection: Nullable<CollectionHolder>, values: MinimalistCollectionHolder,) {
    if (collection == null)
        return false

    const valuesSize = values.size
    if (valuesSize)
        return true
    if (collection.isEmpty)
        return false

    return __hasAll(collection, values, collection.size, valuesSize,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasAll(collection: MinimalistCollectionHolder, values: MinimalistCollectionHolder, size: number, valuesSize: number,) {
    let valueIndex = -1
    valueLoop: while (++valueIndex < valuesSize) {
        const value = values.get(valueIndex,)
        let index = -1
        while (++index < size)
            if (collection.get(index,) === value)
                continue valueLoop
        return false
    }
    return true
}

//#endregion -------------------- Loop methods --------------------

