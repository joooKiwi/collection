/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber} from "@joookiwi/type"

import type {CollectionHolder}                           from "../CollectionHolder"
import type {CollectionIterator}                         from "../iterator/CollectionIterator"
import type {MinimalistCollectionHolder}                 from "../MinimalistCollectionHolder"
import type {PossibleIterableArraySetOrCollectionHolder} from "../type/possibleInstance"

import {isArray}                                                                                                                                                                                                 from "./isArray"
import {isArrayByStructure}                                                                                                                                                                                      from "./isArrayByStructure"
import {isCollectionIterator}                                                                                                                                                                                    from "./isCollectionIterator"
import {isCollectionIteratorByStructure}                                                                                                                                                                         from "./isCollectionIteratorByStructure"
import {isCollectionHolder}                                                                                                                                                                                      from "./isCollectionHolder"
import {isCollectionHolderByStructure}                                                                                                                                                                           from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}                                                                                                                                                                            from "./isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}                                                                                                                                                                 from "./isMinimalistCollectionHolderByStructure"
import {isSet}                                                                                                                                                                                                   from "./isSet"
import {isSetByStructure}                                                                                                                                                                                        from "./isSetByStructure"
import {sliceWithARange, sliceWithARangeByArray, sliceWithARangeByCollectionHolder, sliceWithARangeByMinimalistCollectionHolder}                                                                                 from "./slice.withARange"
import {sliceWithArray, sliceWithArrayByArray, sliceWithArrayByCollectionHolder, sliceWithArrayByMinimalistCollectionHolder}                                                                                     from "./slice.withArray"
import {sliceWithCollectionHolder, sliceWithCollectionHolderByArray, sliceWithCollectionHolderByCollectionHolder, sliceWithCollectionHolderByMinimalistCollectionHolder}                                         from "./slice.withCollectionHolder"
import {sliceWithCollectionIterator, sliceWithCollectionIteratorByArray, sliceWithCollectionIteratorByCollectionHolder, sliceWithCollectionIteratorByMinimalistCollectionHolder}                                 from "./slice.withCollectionIterator"
import {sliceWithIterable, sliceWithIterableByArray, sliceWithIterableByCollectionHolder, sliceWithIterableByMinimalistCollectionHolder}                                                                         from "./slice.withIterable"
import {sliceWithMinimalistCollectionHolder, sliceWithMinimalistCollectionHolderByArray, sliceWithMinimalistCollectionHolderByCollectionHolder, sliceWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "./slice.withMinimalistCollectionHolder"
import {sliceWithSet, sliceWithSetByArray, sliceWithSetByCollectionHolder, sliceWithSetByMinimalistCollectionHolder}                                                                                             from "./slice.withSet"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, indices: readonly number[],): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, indices: ReadonlySet<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, indices: CollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, indices: CollectionIterator<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, indices: Iterable<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link fromIndex starting} to the {@link toIndex ending} index
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param fromIndex  The starting index
 * @param toIndex    The ending index
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(fromIndex, toIndex)
 * @throws IndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the {@link collection} {@link MinimalistCollectionHolder.size size}
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link indicesOrFromIndex indices}
 * or from the {@link indicesOrFromIndex starting} to the {@link toIndex ending} index
 * in the {@link collection}
 *
 * @param collection         The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param indicesOrFromIndex The given indices (or starting index)
 * @param toIndex            The ending index
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(fromIndex, toIndex)
 * @throws IndexOutOfBoundsException The {@link indicesOrFromIndex} or {@link toIndex} are not within the {@link collection} {@link MinimalistCollectionHolder.size size}
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @throws ForbiddenIndexException                   The {@link indicesOrFromIndex} or {@link toIndex} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link indicesOrFromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function slice<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,): CollectionHolder<T>
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, indicesOrFromIndex: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number> = null, toIndex: NullableNumber = null,) {
    if (indicesOrFromIndex == null)
        return sliceWithARange(collection, indicesOrFromIndex, toIndex,)
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
    if (typeof indicesOrFromIndex == "number")
        return sliceWithARange(collection, indicesOrFromIndex, toIndex,)

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
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
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
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
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
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
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
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
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
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
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
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
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
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link fromIndex starting} to the {@link toIndex ending} index
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param fromIndex  The starting index
 * @param toIndex    The ending index
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(fromIndex, toIndex)
 * @throws IndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link indicesOrFromIndex indices}
 * or from the {@link indicesOrFromIndex starting} to the {@link toIndex ending} index
 * in the {@link collection}
 *
 * @param collection         The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param indicesOrFromIndex The given indices (or starting index)
 * @param toIndex            The ending index
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(fromIndex, toIndex)
 * @throws IndexOutOfBoundsException The {@link indicesOrFromIndex} or {@link toIndex} are not within the {@link collection} {@link MinimalistCollectionHolder.size size}
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @throws ForbiddenIndexException                   The {@link indicesOrFromIndex} or {@link toIndex} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link indicesOrFromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,): CollectionHolder<T>
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indicesOrFromIndex: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number> = null, toIndex: NullableNumber = null,) {
    if (indicesOrFromIndex == null)
        return sliceWithARangeByMinimalistCollectionHolder(collection, indicesOrFromIndex, toIndex,)
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
    if (typeof indicesOrFromIndex == "number")
        return sliceWithARangeByMinimalistCollectionHolder(collection, indicesOrFromIndex, toIndex,)

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
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
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
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
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
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
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
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
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
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
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
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
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
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link fromIndex starting} to the {@link toIndex ending} index
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param fromIndex  The starting index
 * @param toIndex    The ending index
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(fromIndex, toIndex)
 * @throws IndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link indicesOrFromIndex indices}
 * or from the {@link indicesOrFromIndex starting} to the {@link toIndex ending} index
 * in the {@link collection}
 *
 * @param collection         The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indicesOrFromIndex The given indices (or starting index)
 * @param toIndex            The ending index
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(fromIndex, toIndex)
 * @throws IndexOutOfBoundsException The {@link indicesOrFromIndex} or {@link toIndex} are not within the {@link collection} {@link MinimalistCollectionHolder.size size}
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @throws ForbiddenIndexException                   The {@link indicesOrFromIndex} or {@link toIndex} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link indicesOrFromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,): CollectionHolder<T>
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indicesOrFromIndex: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number> = null, toIndex: NullableNumber = null,) {
    if (indicesOrFromIndex == null)
        return sliceWithARangeByCollectionHolder(collection, indicesOrFromIndex, toIndex,)
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
    if (typeof indicesOrFromIndex == "number")
        return sliceWithARangeByCollectionHolder(collection, indicesOrFromIndex, toIndex,)

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

/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, indices: readonly number[],): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, indices: ReadonlySet<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, indices: CollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, indices: CollectionIterator<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, indices: Iterable<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices} in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param indices    The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link fromIndex starting} to the {@link toIndex ending} index
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param fromIndex  The starting index
 * @param toIndex    The ending index
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(fromIndex, toIndex)
 * @throws IndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link indicesOrFromIndex indices}
 * or from the {@link indicesOrFromIndex starting} to the {@link toIndex ending} index
 * in the {@link collection}
 *
 * @param collection         The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param indicesOrFromIndex The given indices (or starting index)
 * @param toIndex            The ending index
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(fromIndex, toIndex)
 * @throws IndexOutOfBoundsException The {@link indicesOrFromIndex} or {@link toIndex} are not within the {@link collection} {@link MinimalistCollectionHolder.size size}
 * @throws IndexOutOfBoundsException An indice is not in the {@link collection}
 * @throws ForbiddenIndexException                   The {@link indicesOrFromIndex} or {@link toIndex} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link indicesOrFromIndex} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,): CollectionHolder<T>
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, indicesOrFromIndex: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number> = null, toIndex: NullableNumber = null,) {
    if (indicesOrFromIndex == null)
        return sliceWithARangeByArray(collection, indicesOrFromIndex, toIndex,)
    if (isArray(indicesOrFromIndex,))
        return sliceWithArrayByArray(collection, indicesOrFromIndex,)
    if (isSet(indicesOrFromIndex,))
        return sliceWithSetByArray(collection, indicesOrFromIndex,)
    if (isCollectionHolder(indicesOrFromIndex,))
        return sliceWithCollectionHolderByArray(collection, indicesOrFromIndex,)
    if (isMinimalistCollectionHolder(indicesOrFromIndex,))
        return sliceWithMinimalistCollectionHolderByArray(collection, indicesOrFromIndex,)
    if (isCollectionIterator(indicesOrFromIndex,))
        return sliceWithCollectionIteratorByArray(collection, indicesOrFromIndex,)
    if (typeof indicesOrFromIndex == "number")
        return sliceWithARangeByArray(collection, indicesOrFromIndex, toIndex,)

    if (isArrayByStructure<number>(indicesOrFromIndex,))
        return sliceWithArrayByArray(collection, indicesOrFromIndex,)
    if (isSetByStructure<number>(indicesOrFromIndex,))
        return sliceWithSetByArray(collection, indicesOrFromIndex,)
    if (isCollectionHolderByStructure<number>(indicesOrFromIndex,))
        return sliceWithCollectionHolderByArray(collection, indicesOrFromIndex,)
    if (isMinimalistCollectionHolderByStructure<number>(indicesOrFromIndex,))
        return sliceWithMinimalistCollectionHolderByArray(collection, indicesOrFromIndex,)
    if (isCollectionIteratorByStructure<number>(indicesOrFromIndex,))
        return sliceWithCollectionIteratorByArray(collection, indicesOrFromIndex,)
    return sliceWithIterableByArray(collection, indicesOrFromIndex,)
}

//#endregion -------------------- Facade method --------------------
