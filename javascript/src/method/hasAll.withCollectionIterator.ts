/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}           from "../CollectionHolder"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {CollectionIterator}         from "../iterator/CollectionIterator"

//#region -------------------- Facade method --------------------

/**
 * Tell that all of the {@link values} (as a {@link CollectionIterator}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithCollectionIterator<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator<T>,): boolean
/**
 * Tell that all of the {@link values} (as a {@link CollectionIterator}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithCollectionIterator<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator,): boolean
export function hasAllWithCollectionIterator<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator,) {
    if (collection == null)
        return false

    const valuesSize = values.size
    if (valuesSize == 0)
        return true

    const size = collection.size
    if (size == 0)
        return false

    return __hasAll(collection, values, size, valuesSize,)
}

/**
 * Tell that all of the {@link values} (as a {@link CollectionIterator}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithCollectionIteratorByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionIterator<T>,): boolean
/**
 * Tell that all of the {@link values} (as a {@link CollectionIterator}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithCollectionIteratorByCollectionHolder(collection: Nullable<CollectionHolder>, values: CollectionIterator,): boolean
export function hasAllWithCollectionIteratorByCollectionHolder(collection: Nullable<CollectionHolder>, values: CollectionIterator,) {
    if (collection == null)
        return false

    const valuesSize = values.size
    if (valuesSize == 0)
        return true
    if (collection.isEmpty)
        return false

    return __hasAll(collection, values, collection.size, valuesSize,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasAll(collection: MinimalistCollectionHolder, values: CollectionIterator, size: number, valuesSize: number,) {
    let valueIndex = valuesSize
    valueLoop: while (valueIndex-- > 0) {
        const value = values.nextValue
        let index = -1
        while (++index < size)
            if (collection.get(index,) === value)
                continue valueLoop
        return false
    }
    return true
}

//#endregion -------------------- Loop methods --------------------

