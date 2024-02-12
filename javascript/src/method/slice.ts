/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}           from "../CollectionHolder"
import type {Nullable}                   from "../general type"
import type {CollectionIterator}         from "../iterator/CollectionIterator"
import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {isCollectionIterator}                                                                       from "./isCollectionIterator"
import {isMinimalistCollectionHolder}                                                               from "./isMinimalistCollectionHolder"
import {isCollectionHolder}                                                                         from "./isCollectionHolder"
import {sliceWithARange, sliceWithARangeByCollectionHolder}                                         from "./slice.withARange"
import {sliceWithArray, sliceWithArrayByCollectionHolder}                                           from "./slice.withArray"
import {sliceWithCollectionHolder, sliceWithCollectionHolderByCollectionHolder}                     from "./slice.withCollectionHolder"
import {sliceWithCollectionIterator, sliceWithCollectionIteratorByCollectionHolder}                 from "./slice.withCollectionIterator"
import {sliceWithIterable, sliceWithIterableByCollectionHolder}                                     from "./slice.withIterable"
import {sliceWithMinimalistCollectionHolder, sliceWithMinimalistCollectionHolderByCollectionHolder} from "./slice.withMinimalistCollectionHolder"
import {sliceByCollectionHolderWithSet, sliceWithSet}                                               from "./slice.withSet"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link CollectionHolder} from the {@link indices}
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
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: readonly number[],): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices}
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
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: ReadonlySet<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices}
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
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: CollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices}
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
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices}
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
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: CollectionIterator<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices}
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
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: Iterable<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link fromIndex starting}
 * to the {@link toIndex ending} index with a {@link limit} applied
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param fromIndex  The starting index
 * @param toIndex    The ending index
 * @param limit      The maximum index
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indicesOrFromIndex}
 * in the {@link collection}
 *
 * @param collection         The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param indicesOrFromIndex The given indices (or starting index)
 * @param toIndex            The ending index
 * @param limit              The maximum index
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException The {@link indicesOrFromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @typescriptDefinition
 */
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indicesOrFromIndex?: Nullable<| readonly number[] | ReadonlySet<number> | MinimalistCollectionHolder<number> | CollectionHolder<number> | CollectionIterator<number> | Iterable<number> | number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indicesOrFromIndex: Nullable<| readonly number[] | ReadonlySet<number> | MinimalistCollectionHolder<number> | CollectionHolder<number> | CollectionIterator<number> | Iterable<number> | number> = null, toIndex: Nullable<number> = null, limit: Nullable<number> = null,): CollectionHolder<T> {
    if (indicesOrFromIndex instanceof Array)
        return sliceWithArray(collection, indicesOrFromIndex,)
    if (indicesOrFromIndex instanceof Set)
        return sliceWithSet(collection, indicesOrFromIndex,)
    if (isCollectionHolder(indicesOrFromIndex,))
        return sliceWithCollectionHolder(collection, indicesOrFromIndex,)
    if (isMinimalistCollectionHolder(indicesOrFromIndex,))
        return sliceWithMinimalistCollectionHolder(collection, indicesOrFromIndex,)
    if (isCollectionIterator<number>(indicesOrFromIndex,))
        return sliceWithCollectionIterator(collection, indicesOrFromIndex,)
    if (indicesOrFromIndex == null)
        return sliceWithARange(collection, indicesOrFromIndex, toIndex, limit,)
    if (typeof indicesOrFromIndex == "number")
        return sliceWithARange(collection, indicesOrFromIndex, toIndex, limit,)
    return sliceWithIterable(collection, indicesOrFromIndex,)
}

/**
 * Create a new {@link CollectionHolder} from the {@link indices}
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
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: readonly number[],): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices}
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
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: ReadonlySet<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices}
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
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: CollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices}
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
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices}
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
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: CollectionIterator<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices}
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
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: Iterable<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link fromIndex starting}
 * to the {@link toIndex ending} index with a {@link limit} applied
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param fromIndex  The starting index
 * @param toIndex    The ending index
 * @param limit      The maximum index
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indicesOrFromIndex}
 * in the {@link collection}
 *
 * @param collection         The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indicesOrFromIndex The given indices (or starting index)
 * @param toIndex            The ending index
 * @param limit              The maximum index
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException The {@link indicesOrFromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @typescriptDefinition
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indicesOrFromIndex?: Nullable<| readonly number[] | ReadonlySet<number> | MinimalistCollectionHolder<number> | CollectionHolder<number> | CollectionIterator<number> | Iterable<number> | number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indicesOrFromIndex: Nullable<| readonly number[] | ReadonlySet<number> | MinimalistCollectionHolder<number> | CollectionHolder<number> | CollectionIterator<number> | Iterable<number> | number> = null, toIndex: Nullable<number> = null, limit: Nullable<number> = null,): CollectionHolder<T> {
    if (indicesOrFromIndex instanceof Array)
        return sliceWithArrayByCollectionHolder(collection, indicesOrFromIndex,)
    if (indicesOrFromIndex instanceof Set)
        return sliceByCollectionHolderWithSet(collection, indicesOrFromIndex,)
    if (isCollectionHolder(indicesOrFromIndex,))
        return sliceWithCollectionHolderByCollectionHolder(collection, indicesOrFromIndex,)
    if (isMinimalistCollectionHolder(indicesOrFromIndex,))
        return sliceWithMinimalistCollectionHolderByCollectionHolder(collection, indicesOrFromIndex,)
    if (isCollectionIterator<number>(indicesOrFromIndex,))
        return sliceWithCollectionIteratorByCollectionHolder(collection, indicesOrFromIndex,)
    if (indicesOrFromIndex == null)
        return sliceWithARangeByCollectionHolder(collection, indicesOrFromIndex, toIndex, limit,)
    if (typeof indicesOrFromIndex == "number")
        return sliceWithARangeByCollectionHolder(collection, indicesOrFromIndex, toIndex, limit,)
    return sliceWithIterableByCollectionHolder(collection, indicesOrFromIndex,)
}

//#endregion -------------------- Facade method --------------------
