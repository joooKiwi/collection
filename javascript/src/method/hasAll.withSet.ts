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
 * Tell that all of the {@link values} (as an {@link ReadonlySet Set}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithSet<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell that all of the {@link values} (as an {@link ReadonlySet Set}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithSet<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<unknown>,): boolean
export function hasAllWithSet<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<unknown>,) {
    if (collection == null)
        return false
    if (values.size == 0)
        return true

    const size = collection.size
    if (size == 0)
        return false

    return __hasAll(collection, values, size, )
}

/**
 * Tell that all of the {@link values} (as an {@link ReadonlySet Set}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithSetByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell that all of the {@link values} (as an {@link ReadonlySet Set}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 */
export function hasAllWithSetByCollectionHolder(collection: Nullable<CollectionHolder>, values: ReadonlySet<unknown>,): boolean
export function hasAllWithSetByCollectionHolder(collection: Nullable<CollectionHolder>, values: ReadonlySet<unknown>,) {
    if (collection == null)
        return false
    if (values.size == 0)
        return true
    if (collection.isEmpty)
        return false

    return __hasAll(collection, values, collection.size, )
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasAll(collection: MinimalistCollectionHolder, values: ReadonlySet<unknown>, size: number, ) {
    const iterator = values[Symbol.iterator]() as IterableIterator<unknown>
    let iteratorResult: IteratorResult<unknown, unknown>
    valueLoop: while (!(iteratorResult = iterator.next()).done) {
        const value = iteratorResult.value
        let index = -1
        while (++index < size)
            if (collection.get(index,) === value)
                continue valueLoop
        return false
    }
    return true
}

//#endregion -------------------- Loop methods --------------------

