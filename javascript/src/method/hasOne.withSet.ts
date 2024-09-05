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
 * Tell whenever at least one value of the {@link values} (as a {@link ReadonlySet Set}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithSet<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} (as a {@link ReadonlySet Set}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithSet<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<unknown>,): boolean
export function hasOneWithSet<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<unknown>,) {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false
    if (values.size == 0)
        return true

    return __hasOne(collection, values, size,)
}

/**
 * Tell whenever at least one value of the {@link values} (as a {@link ReadonlySet Set}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithSetByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} (as a {@link ReadonlySet Set}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithSetByCollectionHolder(collection: Nullable<CollectionHolder>, values: ReadonlySet<unknown>,): boolean
export function hasOneWithSetByCollectionHolder(collection: Nullable<CollectionHolder>, values: ReadonlySet<unknown>,) {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false
    if (values.size == 0)
        return true

    return __hasOne(collection, values, collection.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasOne(collection: MinimalistCollectionHolder, values: ReadonlySet<unknown>, size: number,) {
    const iterator: Iterator<unknown, unknown> = values[Symbol.iterator]()
    let iteratorResult: IteratorResult<unknown, unknown>
    while (!(iteratorResult = iterator.next()).done) {
        const value = iteratorResult.value
        let index = -1
        while (++index < size)
            if (collection.get(index,) === value)
                return true
    }
    return false
}

//#endregion -------------------- Loop methods --------------------

