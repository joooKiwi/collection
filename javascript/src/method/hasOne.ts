/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}                           from "../CollectionHolder"
import type {PossibleIterableArraySetOrCollectionHolder} from "../CollectionHolder.types"
import type {MinimalistCollectionHolder}                 from "../MinimalistCollectionHolder"
import type {CollectionIterator}                         from "../iterator/CollectionIterator"

import {hasOneWithArray, hasOneWithArrayByArray, hasOneWithArrayByCollectionHolder, hasOneWithArrayByMinimalistCollectionHolder}                                                                                     from "./hasOne.withArray"
import {hasOneWithCollectionHolder, hasOneWithCollectionHolderByArray, hasOneWithCollectionHolderByCollectionHolder, hasOneWithCollectionHolderByMinimalistCollectionHolder}                                         from "./hasOne.withCollectionHolder"
import {hasOneWithCollectionIterator, hasOneWithCollectionIteratorByArray, hasOneWithCollectionIteratorByCollectionHolder, hasOneWithCollectionIteratorByMinimalistCollectionHolder}                                 from "./hasOne.withCollectionIterator"
import {hasOneWithIterable, hasOneWithIterableByArray, hasOneWithIterableByCollectionHolder, hasOneWithIterableByMinimalistCollectionHolder}                                                                         from "./hasOne.withIterable"
import {hasOneWithMinimalistCollectionHolder, hasOneWithMinimalistCollectionHolderByArray, hasOneWithMinimalistCollectionHolderByCollectionHolder, hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "./hasOne.withMinimalistCollectionHolder"
import {hasOneWithSet, hasOneWithSetByArray, hasOneWithSetByCollectionHolder, hasOneWithSetByMinimalistCollectionHolder}                                                                                             from "./hasOne.withSet"
import {isArray}                                                                                                                                                                                                     from "./isArray"
import {isArrayByStructure}                                                                                                                                                                                          from "./isArrayByStructure"
import {isCollectionIterator}                                                                                                                                                                                        from "./isCollectionIterator"
import {isCollectionIteratorByStructure}                                                                                                                                                                             from "./isCollectionIteratorByStructure"
import {isCollectionHolder}                                                                                                                                                                                          from "./isCollectionHolder"
import {isCollectionHolderByStructure}                                                                                                                                                                               from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}                                                                                                                                                                                from "./isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}                                                                                                                                                                     from "./isMinimalistCollectionHolderByStructure"
import {isSet}                                                                                                                                                                                                       from "./isSet"
import {isSetByStructure}                                                                                                                                                                                            from "./isSetByStructure"

//#region -------------------- Facade method --------------------

/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: readonly T[],): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: ReadonlySet<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: CollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: CollectionIterator<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: Iterable<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function hasOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly unknown[],): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<unknown>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<unknown>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
export function hasOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | readonly T[]>, values: PossibleIterableArraySetOrCollectionHolder<T>,) {
    if (isArray(values,))
        return hasOneWithArray(collection, values,)
    if (isSet(values,))
        return hasOneWithSet(collection, values,)
    if (isCollectionHolder(values,))
        return hasOneWithCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasOneWithMinimalistCollectionHolder(collection, values,)
    if (isCollectionIterator(values,))
        return hasOneWithCollectionIterator(collection, values,)

    if (isArrayByStructure<T>(values,))
        return hasOneWithArray(collection, values,)
    if (isSetByStructure<T>(values,))
        return hasOneWithSet(collection, values,)
    if (isCollectionHolderByStructure<T>(values,))
        return hasOneWithCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolderByStructure<T>(values,))
        return hasOneWithMinimalistCollectionHolder(collection, values,)
    if (isCollectionIteratorByStructure<T>(values,))
        return hasOneWithCollectionIterator(collection, values,)

    return hasOneWithIterable(collection, values,)
}


/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly T[],): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly unknown[],): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<unknown>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<unknown>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
export function hasOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<T>,) {
    if (isArray(values,))
        return hasOneWithArrayByMinimalistCollectionHolder(collection, values,)
    if (isSet(values,))
        return hasOneWithSetByMinimalistCollectionHolder(collection, values,)
    if (isCollectionHolder(values,))
        return hasOneWithCollectionHolderByMinimalistCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(collection, values,)
    if (isCollectionIterator(values,))
        return hasOneWithCollectionIteratorByMinimalistCollectionHolder(collection, values,)

    if (isArrayByStructure<T>(values,))
        return hasOneWithArrayByMinimalistCollectionHolder(collection, values,)
    if (isSetByStructure<T>(values,))
        return hasOneWithSetByMinimalistCollectionHolder(collection, values,)
    if (isCollectionHolderByStructure<T>(values,))
        return hasOneWithCollectionHolderByMinimalistCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolderByStructure<T>(values,))
        return hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(collection, values,)
    if (isCollectionIteratorByStructure<T>(values,))
        return hasOneWithCollectionIteratorByMinimalistCollectionHolder(collection, values,)

    return hasOneWithIterableByMinimalistCollectionHolder(collection, values,)
}

/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: readonly T[],): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionIterator<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: readonly unknown[],): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: ReadonlySet<unknown>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionHolder,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: MinimalistCollectionHolder,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionIterator,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<unknown>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<T>,) {
    if (isArray(values,))
        return hasOneWithArrayByCollectionHolder(collection, values,)
    if (isSet(values,))
        return hasOneWithSetByCollectionHolder(collection, values,)
    if (isCollectionHolder(values,))
        return hasOneWithCollectionHolderByCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasOneWithMinimalistCollectionHolderByCollectionHolder(collection, values,)
    if (isCollectionIterator(values,))
        return hasOneWithCollectionIteratorByCollectionHolder(collection, values,)

    if (isArrayByStructure<T>(values,))
        return hasOneWithArrayByCollectionHolder(collection, values,)
    if (isSetByStructure<T>(values,))
        return hasOneWithSetByCollectionHolder(collection, values,)
    if (isCollectionHolderByStructure<T>(values,))
        return hasOneWithCollectionHolderByCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolderByStructure<T>(values,))
        return hasOneWithMinimalistCollectionHolderByCollectionHolder(collection, values,)
    if (isCollectionIteratorByStructure<T>(values,))
        return hasOneWithCollectionIteratorByCollectionHolder(collection, values,)

    return hasOneWithIterableByCollectionHolder(collection, values,)
}

/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByArray<const T, >(collection: Nullable<readonly T[]>, values: readonly T[],): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByArray<const T, >(collection: Nullable<readonly T[]>, values: ReadonlySet<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByArray<const T, >(collection: Nullable<readonly T[]>, values: CollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByArray<const T, >(collection: Nullable<readonly T[]>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByArray<const T, >(collection: Nullable<readonly T[]>, values: CollectionIterator<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByArray<const T, >(collection: Nullable<readonly T[]>, values: Iterable<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link ReadonlyArray collection}
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByArray<const T, >(collection: Nullable<readonly T[]>, values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
export function hasOneByArray<const T, >(collection: Nullable<readonly T[]>, values: PossibleIterableArraySetOrCollectionHolder<T>,) {
    if (isArray(values,))
        return hasOneWithArrayByArray(collection, values,)
    if (isSet(values,))
        return hasOneWithSetByArray(collection, values,)
    if (isCollectionHolder(values,))
        return hasOneWithCollectionHolderByArray(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasOneWithMinimalistCollectionHolderByArray(collection, values,)
    if (isCollectionIterator(values,))
        return hasOneWithCollectionIteratorByArray(collection, values,)

    if (isArrayByStructure<T>(values,))
        return hasOneWithArrayByArray(collection, values,)
    if (isSetByStructure<T>(values,))
        return hasOneWithSetByArray(collection, values,)
    if (isCollectionHolderByStructure<T>(values,))
        return hasOneWithCollectionHolderByArray(collection, values,)
    if (isMinimalistCollectionHolderByStructure<T>(values,))
        return hasOneWithMinimalistCollectionHolderByArray(collection, values,)
    if (isCollectionIteratorByStructure<T>(values,))
        return hasOneWithCollectionIteratorByArray(collection, values,)

    return hasOneWithIterableByArray(collection, values,)
}

//#endregion -------------------- Facade method --------------------
