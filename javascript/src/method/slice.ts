/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber} from "@joookiwi/type"

import type {CollectionHolder}                           from "../CollectionHolder"
import type {PossibleIterableArraySetOrCollectionHolder} from "../CollectionHolder.types"
import type {CollectionIterator}                         from "../iterator/CollectionIterator"
import type {MinimalistCollectionHolder}                 from "../MinimalistCollectionHolder"

import {isArray}                                                                                                                                                     from "./isArray"
import {isArrayByStructure}                                                                                                                                          from "./isArrayByStructure"
import {isCollectionIterator}                                                                                                                                        from "./isCollectionIterator"
import {isCollectionIteratorByStructure}                                                                                                                             from "./isCollectionIteratorByStructure"
import {isCollectionHolder}                                                                                                                                          from "./isCollectionHolder"
import {isCollectionHolderByStructure}                                                                                                                               from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}                                                                                                                                from "./isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}                                                                                                                     from "./isMinimalistCollectionHolderByStructure"
import {isSet}                                                                                                                                                       from "./isSet"
import {isSetByStructure}                                                                                                                                            from "./isSetByStructure"
import {sliceWithARange, sliceWithARangeByCollectionHolder, sliceWithARangeByMinimalistCollectionHolder}                                                             from "./slice.withARange"
import {sliceWithArray, sliceWithArrayByCollectionHolder, sliceWithArrayByMinimalistCollectionHolder}                                                                from "./slice.withArray"
import {sliceWithCollectionHolder, sliceWithCollectionHolderByCollectionHolder, sliceWithCollectionHolderByMinimalistCollectionHolder}                               from "./slice.withCollectionHolder"
import {sliceWithCollectionIterator, sliceWithCollectionIteratorByCollectionHolder, sliceWithCollectionIteratorByMinimalistCollectionHolder}                         from "./slice.withCollectionIterator"
import {sliceWithIterable, sliceWithIterableByCollectionHolder, sliceWithIterableByMinimalistCollectionHolder}                                                       from "./slice.withIterable"
import {sliceWithMinimalistCollectionHolder, sliceWithMinimalistCollectionHolderByCollectionHolder, sliceWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "./slice.withMinimalistCollectionHolder"
import {sliceWithSet, sliceWithSetByCollectionHolder, sliceWithSetByMinimalistCollectionHolder}                                                                      from "./slice.withSet"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: readonly number[],): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: ReadonlySet<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: CollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: CollectionIterator<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: Iterable<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link fromIndex starting}
 * to the {@link toIndex ending} index with a {@link limit} applied
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param fromIndex  The starting index
 * @param toIndex    The ending index
 * @param limit      The maximum index
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within the {@link collection} {@link MinimalistCollectionHolder.size size}
 * @throws ForbiddenIndexException                   The {@link fromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indicesOrFromIndex indices}
 * or from the {@link indicesOrFromIndex starting} to the {@link toIndex ending} index with a {@link limit} applied
 * in the {@link collection}
 *
 * @param collection         The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param indicesOrFromIndex The given indices (or starting index)
 * @param toIndex            The ending index
 * @param limit              The maximum index
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException The {@link indicesOrFromIndex}, {@link toIndex} and {@link limit} are not within the {@link collection} {@link MinimalistCollectionHolder.size size}
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @throws ForbiddenIndexException                   The {@link indicesOrFromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link indicesOrFromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indicesOrFromIndex: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number> = null, toIndex: NullableNumber = null, limit: NullableNumber = null,): CollectionHolder<T> {
    if (isArray(indicesOrFromIndex,))
        return sliceWithArray(collection, indicesOrFromIndex,)
    if (isSet(indicesOrFromIndex,))
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

    if (isArrayByStructure<number>(indicesOrFromIndex,))
        return sliceWithArray(collection, indicesOrFromIndex,)
    if (isSetByStructure<number>(indicesOrFromIndex,))
        return sliceWithSet(collection, indicesOrFromIndex,)
    if (isCollectionHolderByStructure<number>(indicesOrFromIndex,))
        return sliceWithCollectionHolder(collection, indicesOrFromIndex,)
    if (isMinimalistCollectionHolderByStructure<number>(indicesOrFromIndex,))
        return sliceWithMinimalistCollectionHolder(collection, indicesOrFromIndex,)
    if (isCollectionIteratorByStructure<number>(indicesOrFromIndex,))
        return sliceWithCollectionIterator(collection, indicesOrFromIndex,)
    return sliceWithIterable(collection, indicesOrFromIndex,)
}


/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: readonly number[],): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: ReadonlySet<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: CollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: CollectionIterator<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: Iterable<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
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
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException                   The {@link fromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indicesOrFromIndex indices}
 * or from the {@link indicesOrFromIndex starting} to the {@link toIndex ending} index with a {@link limit} applied
 * in the {@link collection}
 *
 * @param collection         The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param indicesOrFromIndex The given indices (or starting index)
 * @param toIndex            The ending index
 * @param limit              The maximum index
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException The {@link indicesOrFromIndex}, {@link toIndex} and {@link limit} are not within the {@link collection} {@link MinimalistCollectionHolder.size size}
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @throws ForbiddenIndexException                   The {@link indicesOrFromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link indicesOrFromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indicesOrFromIndex: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number> = null, toIndex: NullableNumber = null, limit: NullableNumber = null,): CollectionHolder<T> {
    if (isArray(indicesOrFromIndex,))
        return sliceWithArrayByMinimalistCollectionHolder(collection, indicesOrFromIndex,)
    if (isSet(indicesOrFromIndex,))
        return sliceWithSetByMinimalistCollectionHolder(collection, indicesOrFromIndex,)
    if (isCollectionHolder(indicesOrFromIndex,))
        return sliceWithCollectionHolderByMinimalistCollectionHolder(collection, indicesOrFromIndex,)
    if (isMinimalistCollectionHolder(indicesOrFromIndex,))
        return sliceWithMinimalistCollectionHolderByMinimalistCollectionHolder(collection, indicesOrFromIndex,)
    if (isCollectionIterator(indicesOrFromIndex,))
        return sliceWithCollectionIteratorByMinimalistCollectionHolder(collection, indicesOrFromIndex,)
    if (indicesOrFromIndex == null)
        return sliceWithARangeByMinimalistCollectionHolder(collection, indicesOrFromIndex, toIndex, limit,)
    if (typeof indicesOrFromIndex == "number")
        return sliceWithARangeByMinimalistCollectionHolder(collection, indicesOrFromIndex, toIndex, limit,)

    if (isArrayByStructure<number>(indicesOrFromIndex,))
        return sliceWithArrayByMinimalistCollectionHolder(collection, indicesOrFromIndex,)
    if (isSetByStructure<number>(indicesOrFromIndex,))
        return sliceWithSetByMinimalistCollectionHolder(collection, indicesOrFromIndex,)
    if (isCollectionHolderByStructure<number>(indicesOrFromIndex,))
        return sliceWithCollectionHolderByMinimalistCollectionHolder(collection, indicesOrFromIndex,)
    if (isMinimalistCollectionHolderByStructure<number>(indicesOrFromIndex,))
        return sliceWithMinimalistCollectionHolderByMinimalistCollectionHolder(collection, indicesOrFromIndex,)
    if (isCollectionIteratorByStructure<number>(indicesOrFromIndex,))
        return sliceWithCollectionIteratorByMinimalistCollectionHolder(collection, indicesOrFromIndex,)
    return sliceWithIterableByMinimalistCollectionHolder(collection, indicesOrFromIndex,)
}

/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: readonly number[],): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: ReadonlySet<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: CollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: CollectionIterator<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: Iterable<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
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
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException                   The {@link fromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indicesOrFromIndex indices}
 * or from the {@link indicesOrFromIndex starting} to the {@link toIndex ending} index with a {@link limit} applied
 * in the {@link collection}
 *
 * @param collection         The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indicesOrFromIndex The given indices (or starting index)
 * @param toIndex            The ending index
 * @param limit              The maximum index
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws CollectionHolderIndexOutOfBoundsException The {@link indicesOrFromIndex}, {@link toIndex} and {@link limit} are not within the {@link collection} {@link MinimalistCollectionHolder.size size}
 * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the {@link collection}
 * @throws ForbiddenIndexException                   The {@link indicesOrFromIndex}, {@link toIndex} or {@link limit} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link indicesOrFromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indicesOrFromIndex: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number> = null, toIndex: NullableNumber = null, limit: NullableNumber = null,): CollectionHolder<T> {
    if (isArray(indicesOrFromIndex,))
        return sliceWithArrayByCollectionHolder(collection, indicesOrFromIndex,)
    if (isSet(indicesOrFromIndex,))
        return sliceWithSetByCollectionHolder(collection, indicesOrFromIndex,)
    if (isCollectionHolder(indicesOrFromIndex,))
        return sliceWithCollectionHolderByCollectionHolder(collection, indicesOrFromIndex,)
    if (isMinimalistCollectionHolder(indicesOrFromIndex,))
        return sliceWithMinimalistCollectionHolderByCollectionHolder(collection, indicesOrFromIndex,)
    if (isCollectionIterator(indicesOrFromIndex,))
        return sliceWithCollectionIteratorByCollectionHolder(collection, indicesOrFromIndex,)
    if (indicesOrFromIndex == null)
        return sliceWithARangeByCollectionHolder(collection, indicesOrFromIndex, toIndex, limit,)
    if (typeof indicesOrFromIndex == "number")
        return sliceWithARangeByCollectionHolder(collection, indicesOrFromIndex, toIndex, limit,)

    if (isArrayByStructure<number>(indicesOrFromIndex,))
        return sliceWithArrayByCollectionHolder(collection, indicesOrFromIndex,)
    if (isSetByStructure<number>(indicesOrFromIndex,))
        return sliceWithSetByCollectionHolder(collection, indicesOrFromIndex,)
    if (isCollectionHolderByStructure<number>(indicesOrFromIndex,))
        return sliceWithCollectionHolderByCollectionHolder(collection, indicesOrFromIndex,)
    if (isMinimalistCollectionHolderByStructure<number>(indicesOrFromIndex,))
        return sliceWithMinimalistCollectionHolderByCollectionHolder(collection, indicesOrFromIndex,)
    if (isCollectionIteratorByStructure<number>(indicesOrFromIndex,))
        return sliceWithCollectionIteratorByCollectionHolder(collection, indicesOrFromIndex,)
    return sliceWithIterableByCollectionHolder(collection, indicesOrFromIndex,)
}

//#endregion -------------------- Facade method --------------------
