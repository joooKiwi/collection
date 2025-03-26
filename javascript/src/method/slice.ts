//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Nullable, NullableNumber} from "@joookiwi/type"

import type {CollectionHolder}                                   from "../CollectionHolder"
import type {CollectionIterator}                                 from "../iterator/CollectionIterator"
import type {MinimalistCollectionHolder}                         from "../MinimalistCollectionHolder"
import type {PossibleIterableIteratorArraySetOrCollectionHolder} from "../type/possibleInstance"

import {isArray}                                                                                                                                                                                                 from "./isArray"
import {isArrayByStructure}                                                                                                                                                                                      from "./isArrayByStructure"
import {isCollectionIterator}                                                                                                                                                                                    from "./isCollectionIterator"
import {isCollectionIteratorByStructure}                                                                                                                                                                         from "./isCollectionIteratorByStructure"
import {isCollectionHolder}                                                                                                                                                                                      from "./isCollectionHolder"
import {isCollectionHolderByStructure}                                                                                                                                                                           from "./isCollectionHolderByStructure"
import {isIterator}                                                                                                                                                                                              from "./isIterator"
import {isIteratorByStructure}                                                                                                                                                                                   from "./isIteratorByStructure"
import {isMinimalistCollectionHolder}                                                                                                                                                                            from "./isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}                                                                                                                                                                 from "./isMinimalistCollectionHolderByStructure"
import {isSet}                                                                                                                                                                                                   from "./isSet"
import {isSetByStructure}                                                                                                                                                                                        from "./isSetByStructure"
import {sliceWithARange, sliceWithARangeByArray, sliceWithARangeByCollectionHolder, sliceWithARangeByMinimalistCollectionHolder}                                                                                 from "./slice.withARange"
import {sliceWithArray, sliceWithArrayByArray, sliceWithArrayByCollectionHolder, sliceWithArrayByMinimalistCollectionHolder}                                                                                     from "./slice.withArray"
import {sliceWithCollectionHolder, sliceWithCollectionHolderByArray, sliceWithCollectionHolderByCollectionHolder, sliceWithCollectionHolderByMinimalistCollectionHolder}                                         from "./slice.withCollectionHolder"
import {sliceWithCollectionIterator, sliceWithCollectionIteratorByArray, sliceWithCollectionIteratorByCollectionHolder, sliceWithCollectionIteratorByMinimalistCollectionHolder}                                 from "./slice.withCollectionIterator"
import {sliceWithIterable, sliceWithIterableByArray, sliceWithIterableByCollectionHolder, sliceWithIterableByMinimalistCollectionHolder}                                                                         from "./slice.withIterable"
import {sliceWithIterator, sliceWithIteratorByArray, sliceWithIteratorByCollectionHolder, sliceWithIteratorByMinimalistCollectionHolder}                                                                         from "./slice.withIterator"
import {sliceWithMinimalistCollectionHolder, sliceWithMinimalistCollectionHolderByArray, sliceWithMinimalistCollectionHolderByCollectionHolder, sliceWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "./slice.withMinimalistCollectionHolder"
import {sliceWithSet, sliceWithSetByArray, sliceWithSetByCollectionHolder, sliceWithSetByMinimalistCollectionHolder}                                                                                             from "./slice.withSet"

//#region -------------------- Facade method --------------------

/**
 * Create a new {@link CollectionHolder}
 * with all the values in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting index} to the end of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param from       The inclusive starting index (`0` by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link from} is not within the {@link collection} `size`
 * @throws ForbiddenIndexException    {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, from: NullableNumber,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting} to the {@link to ending} index in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link MinimalistCollectionHolder.size size} - 1</code> by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within the {@link collection} `size`
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, from: NullableNumber, to: NullableNumber,): CollectionHolder<T>
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
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, indices: readonly number[],): CollectionHolder<T>
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
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, indices: ReadonlySet<number>,): CollectionHolder<T>
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
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, indices: CollectionHolder<number>,): CollectionHolder<T>
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
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
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
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, indices: CollectionIterator<number>,): CollectionHolder<T>
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
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, indices: Iterator<number, unknown, unknown>,): CollectionHolder<T>
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
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, indices: Iterable<number, unknown, unknown>,): CollectionHolder<T>
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
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link indicesOrFrom indices}
 * or from the {@link indicesOrFrom starting} to the {@link to ending} index
 * in the {@link collection}
 *
 * @param collection    The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param indicesOrFrom The given indices (or inclusive starting index)
 * @param to            The inclusive ending index
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link indicesOrFrom from} or {@link to} are not within the {@link collection} `size`
 * @throws IndexOutOfBoundsException  An indice is not in the {@link collection}
 * @throws ForbiddenIndexException    {@link indicesOrFrom from} or {@link to} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link indicesOrFrom from} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<T>
export function slice<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, indicesOrFrom: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number> = null, to: NullableNumber = null,) {
    if (indicesOrFrom == null)
        return sliceWithARange(collection, indicesOrFrom, to,)
    if (isArray(indicesOrFrom,))
        return sliceWithArray(collection, indicesOrFrom,)
    if (isSet(indicesOrFrom,))
        return sliceWithSet(collection, indicesOrFrom,)
    if (isCollectionHolder(indicesOrFrom,))
        return sliceWithCollectionHolder(collection, indicesOrFrom,)
    if (isMinimalistCollectionHolder(indicesOrFrom,))
        return sliceWithMinimalistCollectionHolder(collection, indicesOrFrom,)
    if (isCollectionIterator(indicesOrFrom,))
        return sliceWithCollectionIterator(collection, indicesOrFrom,)
    if (isIterator(indicesOrFrom,))
        return sliceWithIterator(collection, indicesOrFrom,)
    if (typeof indicesOrFrom == "number")
        return sliceWithARange(collection, indicesOrFrom, to,)

    if (isArrayByStructure<number>(indicesOrFrom,))
        return sliceWithArray(collection, indicesOrFrom,)
    if (isSetByStructure<number>(indicesOrFrom,))
        return sliceWithSet(collection, indicesOrFrom,)
    if (isCollectionHolderByStructure<number>(indicesOrFrom,))
        return sliceWithCollectionHolder(collection, indicesOrFrom,)
    if (isMinimalistCollectionHolderByStructure<number>(indicesOrFrom,))
        return sliceWithMinimalistCollectionHolder(collection, indicesOrFrom,)
    if (isCollectionIteratorByStructure<number>(indicesOrFrom,))
        return sliceWithCollectionIterator(collection, indicesOrFrom,)
    if (isIteratorByStructure<number>(indicesOrFrom,))
        return sliceWithIterator(collection, indicesOrFrom,)
    return sliceWithIterable(collection, indicesOrFrom,)
}


/**
 * Create a new {@link CollectionHolder}
 * with all the values in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting index} to the end of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param from       The inclusive starting index (`0` by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link from} is not within the {@link collection} {@link MinimalistCollectionHolder.size size}
 * @throws ForbiddenIndexException    {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, from: NullableNumber,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting} to the {@link to ending} index in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link MinimalistCollectionHolder.size size} - 1</code> by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within the {@link collection} {@link MinimalistCollectionHolder.size size}
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, from: NullableNumber, to: NullableNumber,): CollectionHolder<T>
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
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: Iterator<number, unknown, unknown>,): CollectionHolder<T>
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
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: Iterable<number, unknown, unknown>,): CollectionHolder<T>
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
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link indicesOrFrom indices}
 * or from the {@link indicesOrFrom starting} to the {@link to ending} index
 * in the {@link collection}
 *
 * @param collection    The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param indicesOrFrom The given indices (or inclusive starting index)
 * @param to            The inclusive ending index
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link indicesOrFrom from} or {@link to} are not within the {@link collection} {@link MinimalistCollectionHolder.size size}
 * @throws IndexOutOfBoundsException  An indice is not in the {@link collection}
 * @throws ForbiddenIndexException    {@link indicesOrFrom from} or {@link to} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link indicesOrFrom from} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<T>
export function sliceByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, indicesOrFrom: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number> = null, to: NullableNumber = null,) {
    if (indicesOrFrom == null)
        return sliceWithARangeByMinimalistCollectionHolder(collection, indicesOrFrom, to,)
    if (isArray(indicesOrFrom,))
        return sliceWithArrayByMinimalistCollectionHolder(collection, indicesOrFrom,)
    if (isSet(indicesOrFrom,))
        return sliceWithSetByMinimalistCollectionHolder(collection, indicesOrFrom,)
    if (isCollectionHolder(indicesOrFrom,))
        return sliceWithCollectionHolderByMinimalistCollectionHolder(collection, indicesOrFrom,)
    if (isMinimalistCollectionHolder(indicesOrFrom,))
        return sliceWithMinimalistCollectionHolderByMinimalistCollectionHolder(collection, indicesOrFrom,)
    if (isCollectionIterator(indicesOrFrom,))
        return sliceWithCollectionIteratorByMinimalistCollectionHolder(collection, indicesOrFrom,)
    if (isIterator(indicesOrFrom,))
        return sliceWithIteratorByMinimalistCollectionHolder(collection, indicesOrFrom,)
    if (typeof indicesOrFrom == "number")
        return sliceWithARangeByMinimalistCollectionHolder(collection, indicesOrFrom, to,)

    if (isArrayByStructure<number>(indicesOrFrom,))
        return sliceWithArrayByMinimalistCollectionHolder(collection, indicesOrFrom,)
    if (isSetByStructure<number>(indicesOrFrom,))
        return sliceWithSetByMinimalistCollectionHolder(collection, indicesOrFrom,)
    if (isCollectionHolderByStructure<number>(indicesOrFrom,))
        return sliceWithCollectionHolderByMinimalistCollectionHolder(collection, indicesOrFrom,)
    if (isMinimalistCollectionHolderByStructure<number>(indicesOrFrom,))
        return sliceWithMinimalistCollectionHolderByMinimalistCollectionHolder(collection, indicesOrFrom,)
    if (isCollectionIteratorByStructure<number>(indicesOrFrom,))
        return sliceWithCollectionIteratorByMinimalistCollectionHolder(collection, indicesOrFrom,)
    if (isIteratorByStructure<number>(indicesOrFrom,))
        return sliceWithIteratorByMinimalistCollectionHolder(collection, indicesOrFrom,)
    return sliceWithIterableByMinimalistCollectionHolder(collection, indicesOrFrom,)
}

/**
 * Create a new {@link CollectionHolder}
 * with all the values in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting index} to the end of the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param from       The inclusive starting index (`0` by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link from} is not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException    {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, from: NullableNumber,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting} to the {@link to ending} index in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, from: NullableNumber, to: NullableNumber,): CollectionHolder<T>
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
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: Iterator<number, unknown, unknown>,): CollectionHolder<T>
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
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: Iterable<number, unknown, unknown>,): CollectionHolder<T>
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
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link indicesOrFrom indices}
 * or from the {@link indicesOrFrom starting} to the {@link to ending} index
 * in the {@link collection}
 *
 * @param collection    The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indicesOrFrom The given indices (or inclusive starting index)
 * @param to            The inclusive ending index
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link indicesOrFrom from} or {@link to} are not within the {@link collection} {@link CollectionHolder.size size}
 * @throws IndexOutOfBoundsException  An indice is not in the {@link collection}
 * @throws ForbiddenIndexException    {@link indicesOrFrom from} or {@link to} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link indicesOrFrom from} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<T>
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indicesOrFrom: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number> = null, to: NullableNumber = null,) {
    if (indicesOrFrom == null)
        return sliceWithARangeByCollectionHolder(collection, indicesOrFrom, to,)
    if (isArray(indicesOrFrom,))
        return sliceWithArrayByCollectionHolder(collection, indicesOrFrom,)
    if (isSet(indicesOrFrom,))
        return sliceWithSetByCollectionHolder(collection, indicesOrFrom,)
    if (isCollectionHolder(indicesOrFrom,))
        return sliceWithCollectionHolderByCollectionHolder(collection, indicesOrFrom,)
    if (isMinimalistCollectionHolder(indicesOrFrom,))
        return sliceWithMinimalistCollectionHolderByCollectionHolder(collection, indicesOrFrom,)
    if (isCollectionIterator(indicesOrFrom,))
        return sliceWithCollectionIteratorByCollectionHolder(collection, indicesOrFrom,)
    if (isIterator(indicesOrFrom,))
        return sliceWithIteratorByCollectionHolder(collection, indicesOrFrom,)
    if (typeof indicesOrFrom == "number")
        return sliceWithARangeByCollectionHolder(collection, indicesOrFrom, to,)

    if (isArrayByStructure<number>(indicesOrFrom,))
        return sliceWithArrayByCollectionHolder(collection, indicesOrFrom,)
    if (isSetByStructure<number>(indicesOrFrom,))
        return sliceWithSetByCollectionHolder(collection, indicesOrFrom,)
    if (isCollectionHolderByStructure<number>(indicesOrFrom,))
        return sliceWithCollectionHolderByCollectionHolder(collection, indicesOrFrom,)
    if (isMinimalistCollectionHolderByStructure<number>(indicesOrFrom,))
        return sliceWithMinimalistCollectionHolderByCollectionHolder(collection, indicesOrFrom,)
    if (isCollectionIteratorByStructure<number>(indicesOrFrom,))
        return sliceWithCollectionIteratorByCollectionHolder(collection, indicesOrFrom,)
    if (isIteratorByStructure<number>(indicesOrFrom,))
        return sliceWithIteratorByCollectionHolder(collection, indicesOrFrom,)
    return sliceWithIterableByCollectionHolder(collection, indicesOrFrom,)
}

/**
 * Create a new {@link CollectionHolder}
 * with all the values in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting} to the {@link to ending} index in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param from       The inclusive starting index (`0` by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException {@link from} is not within the {@link collection} {@link ReadonyArray.length size}
 * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, from: NullableNumber,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link from starting} to the {@link to ending} index in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param from       The inclusive starting index (`0` by default)
 * @param to         The inclusive ending index (<code>{@link ReadonlyArray.length size} - 1</code> by default)
 * @see ReadonlyArray.slice
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within the {@link collection} {@link ReadonyArray.length size}
 * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 */
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, from: NullableNumber, to: NullableNumber,): CollectionHolder<T>
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
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, indices: Iterator<number, unknown, unknown>,): CollectionHolder<T>
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
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, indices: Iterable<number, unknown, unknown>,): CollectionHolder<T>
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
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder}
 * from the {@link indicesOrFrom indices}
 * or from the {@link indicesOrFrom starting} to the {@link to ending} index
 * in the {@link collection}
 *
 * @param collection    The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param indicesOrFrom The given indices (or inclusive starting index)
 * @param to            The inclusive ending index
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
 * @throws IndexOutOfBoundsException  {@link indicesOrFrom from} or {@link to} are not within the {@link collection} {@link ReadonlyArray.length size}
 * @throws IndexOutOfBoundsException  An indice is not in the {@link collection}
 * @throws ForbiddenIndexException    {@link indicesOrFrom from} or {@link to} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
 * @throws InvalidIndexRangeException {@link to} is before {@link indicesOrFrom from} after the calculation
 * @canReceiveNegativeValue
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<T>
export function sliceByArray<const T, >(collection: Nullable<readonly T[]>, indicesOrFrom: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number> = null, to: NullableNumber = null,) {
    if (indicesOrFrom == null)
        return sliceWithARangeByArray(collection, indicesOrFrom, to,)
    if (isArray(indicesOrFrom,))
        return sliceWithArrayByArray(collection, indicesOrFrom,)
    if (isSet(indicesOrFrom,))
        return sliceWithSetByArray(collection, indicesOrFrom,)
    if (isCollectionHolder(indicesOrFrom,))
        return sliceWithCollectionHolderByArray(collection, indicesOrFrom,)
    if (isMinimalistCollectionHolder(indicesOrFrom,))
        return sliceWithMinimalistCollectionHolderByArray(collection, indicesOrFrom,)
    if (isCollectionIterator(indicesOrFrom,))
        return sliceWithCollectionIteratorByArray(collection, indicesOrFrom,)
    if (isIterator(indicesOrFrom,))
        return sliceWithIteratorByArray(collection, indicesOrFrom,)
    if (typeof indicesOrFrom == "number")
        return sliceWithARangeByArray(collection, indicesOrFrom, to,)

    if (isArrayByStructure<number>(indicesOrFrom,))
        return sliceWithArrayByArray(collection, indicesOrFrom,)
    if (isSetByStructure<number>(indicesOrFrom,))
        return sliceWithSetByArray(collection, indicesOrFrom,)
    if (isCollectionHolderByStructure<number>(indicesOrFrom,))
        return sliceWithCollectionHolderByArray(collection, indicesOrFrom,)
    if (isMinimalistCollectionHolderByStructure<number>(indicesOrFrom,))
        return sliceWithMinimalistCollectionHolderByArray(collection, indicesOrFrom,)
    if (isCollectionIteratorByStructure<number>(indicesOrFrom,))
        return sliceWithCollectionIteratorByArray(collection, indicesOrFrom,)
    if (isIteratorByStructure<number>(indicesOrFrom,))
        return sliceWithIteratorByArray(collection, indicesOrFrom,)
    return sliceWithIterableByArray(collection, indicesOrFrom,)
}

//#endregion -------------------- Facade method --------------------
