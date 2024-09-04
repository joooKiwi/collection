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
 * Tell whenever at least one value of the {@link values} (as a {@link MinimalistCollectionHolder}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} (as a {@link MinimalistCollectionHolder}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder,): boolean
export function hasOneWithMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder,) {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false

    const valuesSize = values.size
    if (valuesSize == 0)
        return true

    return __hasOne(collection, values, size, valuesSize,)
}

/**
 * Tell whenever at least one value of the {@link values} (as a {@link MinimalistCollectionHolder}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithMinimalistCollectionHolderByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} (as a {@link MinimalistCollectionHolder}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 */
export function hasOneWithMinimalistCollectionHolderByCollectionHolder(collection: Nullable<CollectionHolder>, values: MinimalistCollectionHolder,): boolean
export function hasOneWithMinimalistCollectionHolderByCollectionHolder(collection: Nullable<CollectionHolder>, values: MinimalistCollectionHolder,) {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false

    const valuesSize = values.size
    if (valuesSize == 0)
        return true

    return __hasOne(collection, values, collection.size, valuesSize,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasOne(collection: MinimalistCollectionHolder, values: MinimalistCollectionHolder, size: number, valuesSize: number,) {
    let valueIndex = -1
    while (++valueIndex < valuesSize) {
        const value = values.get(valueIndex,)
        let index = -1
        while (++index < size)
            if (collection.get(index,) === value)
                return true
    }
    return false
}

//#endregion -------------------- Loop methods --------------------

