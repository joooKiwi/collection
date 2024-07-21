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
 * Tell whenever at least one value in the {@link values} (as an {@link ReadonlyArray Array}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 */
export function hasOneWithArray<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly T[],): boolean
/**
 * Tell whenever at least one value in the {@link values} (as an {@link ReadonlyArray Array}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 */
export function hasOneWithArray<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly unknown[],): boolean
export function hasOneWithArray<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly unknown[],) {
    if (collection == null)
        return false

    const size = collection.size
    if (size == 0)
        return false

    const valuesSize = values.length
    if (valuesSize == 0)
        return true

    return __hasOne(collection, values, size, valuesSize,)
}

/**
 * Tell whenever at least one value in the {@link values} (as an {@link ReadonlyArray Array}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 */
export function hasOneWithArrayByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: readonly T[],): boolean
/**
 * Tell whenever at least one value in the {@link values} (as an {@link ReadonlyArray Array}) exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 */
export function hasOneWithArrayByCollectionHolder(collection: Nullable<CollectionHolder>, values: readonly unknown[],): boolean
export function hasOneWithArrayByCollectionHolder(collection: Nullable<CollectionHolder>, values: readonly unknown[],) {
    if (collection == null)
        return false
    if (collection.isEmpty)
        return false

    const valuesSize = values.length
    if (valuesSize == 0)
        return true

    return __hasOne(collection, values, collection.size, valuesSize,)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function __hasOne(collection: MinimalistCollectionHolder, values: readonly unknown[], size: number, valuesSize: number,) {
    let valueIndex = -1
    while (++valueIndex < valuesSize) {
        const value = values[valueIndex]
        let index = -1
        while (++index < size)
            if (collection.get(index,) === value)
                return true
    }
    return false
}

//#endregion -------------------- Loop methods --------------------

