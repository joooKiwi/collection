/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}           from "../CollectionHolder"
import type {Nullable}                   from "../general type"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {CollectionConstants} from "../CollectionConstants"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link CollectionHolder} from the {@link indices} (as an {@link ReadonlyArray array})
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithArray<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: readonly number[],): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.size == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const indicesSize = indices.length
    if (indicesSize == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    return new CollectionConstants.LazyGenericCollectionHolder(() => _newArray(collection, indices, indicesSize,),)
}

/**
 * Create a new {@link CollectionHolder} from the {@link indices} (as an {@link ReadonlyArray array})
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceWithArrayByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: readonly number[],): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const indicesSize = indices.length
    if (indicesSize == 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    return new CollectionConstants.LazyGenericCollectionHolder(() => _newArray(collection, indices, indicesSize,),)
}

//#endregion -------------------- Facade method --------------------
//#region -------------------- Loop methods --------------------

function _newArray<const T, >(collection: MinimalistCollectionHolder<T>, indices: readonly number[], indicesSize: number,) {
    const newArray = new Array<T>(indicesSize,)
    let index = indicesSize
    while (index-- > 0)
        newArray[index] = collection.get(indices[index]!,)
    return Object.freeze(newArray,)
}

//#endregion -------------------- Loop methods --------------------
