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
 * Tell whenever at least one value of the {@link values} (as a {@link CollectionHolder}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 */
export function hasOneWithCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} (as a {@link CollectionHolder}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 */
export function hasOneWithCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder,): boolean
export function hasOneWithCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder,) {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false
    if (values.isEmpty)
        return true

    return __hasOne(collection, values, size, values.size,)
}

/**
 * Tell whenever at least one value of the {@link values} (as a {@link CollectionHolder}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 */
export function hasOneWithCollectionHolderByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} (as a {@link CollectionHolder}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 */
export function hasOneWithCollectionHolderByCollectionHolder(collection: Nullable<CollectionHolder>, values: CollectionHolder,): boolean
export function hasOneWithCollectionHolderByCollectionHolder(collection: Nullable<CollectionHolder>, values: CollectionHolder,) {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false
    if (values.isEmpty)
        return true

    return __hasOne(collection, values, collection.size, values.size,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasOne(collection: MinimalistCollectionHolder, values: CollectionHolder, size: number, valuesSize: number,) {
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

