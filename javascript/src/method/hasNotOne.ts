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

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}                                   from "../CollectionHolder"
import type {MinimalistCollectionHolder}                         from "../MinimalistCollectionHolder"
import type {CollectionIterator}                                 from "../iterator/CollectionIterator"
import type {PossibleIterableIteratorArraySetOrCollectionHolder} from "../type/possibleInstance"

import {hasNotOneWithArray, hasNotOneWithArrayByArray, hasNotOneWithArrayByCollectionHolder, hasNotOneWithArrayByMinimalistCollectionHolder}                                                                                     from "./hasNotOne.withArray"
import {hasNotOneWithCollectionHolder, hasNotOneWithCollectionHolderByArray, hasNotOneWithCollectionHolderByCollectionHolder, hasNotOneWithCollectionHolderByMinimalistCollectionHolder}                                         from "./hasNotOne.withCollectionHolder"
import {hasNotOneWithCollectionIterator, hasNotOneWithCollectionIteratorByArray, hasNotOneWithCollectionIteratorByCollectionHolder, hasNotOneWithCollectionIteratorByMinimalistCollectionHolder}                                 from "./hasNotOne.withCollectionIterator"
import {hasNotOneWithIterable, hasNotOneWithIterableByArray, hasNotOneWithIterableByCollectionHolder, hasNotOneWithIterableByMinimalistCollectionHolder}                                                                         from "./hasNotOne.withIterable"
import {hasNotOneWithIterator, hasNotOneWithIteratorByArray, hasNotOneWithIteratorByCollectionHolder, hasNotOneWithIteratorByMinimalistCollectionHolder}                                                                         from "./hasNotOne.withIterator"
import {hasNotOneWithMinimalistCollectionHolder, hasNotOneWithMinimalistCollectionHolderByArray, hasNotOneWithMinimalistCollectionHolderByCollectionHolder, hasNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "./hasNotOne.withMinimalistCollectionHolder"
import {hasNotOneWithSet, hasNotOneWithSetByArray, hasNotOneWithSetByCollectionHolder, hasNotOneWithSetByMinimalistCollectionHolder}                                                                                             from "./hasNotOne.withSet"
import {isArray}                                                                                                                                                                                                                 from "./isArray"
import {isArrayByStructure}                                                                                                                                                                                                      from "./isArrayByStructure"
import {isCollectionIterator}                                                                                                                                                                                                    from "./isCollectionIterator"
import {isCollectionIteratorByStructure}                                                                                                                                                                                         from "./isCollectionIteratorByStructure"
import {isCollectionHolder}                                                                                                                                                                                                      from "./isCollectionHolder"
import {isCollectionHolderByStructure}                                                                                                                                                                                           from "./isCollectionHolderByStructure"
import {isIterator}                                                                                                                                                                                                              from "./isIterator"
import {isIteratorByStructure}                                                                                                                                                                                                   from "./isIteratorByStructure"
import {isMinimalistCollectionHolder}                                                                                                                                                                                            from "./isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}                                                                                                                                                                                 from "./isMinimalistCollectionHolderByStructure"
import {isSet}                                                                                                                                                                                                                   from "./isSet"
import {isSetByStructure}                                                                                                                                                                                                        from "./isSetByStructure"

//#region -------------------- Facade method --------------------

/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: readonly T[],): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: ReadonlySet<T>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: CollectionHolder<T>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: CollectionIterator<T>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Iterator<T, unknown, unknown>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Iterable<T, unknown, unknown>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function hasNotOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: PossibleIterableIteratorArraySetOrCollectionHolder<T>,): boolean
export function hasNotOne<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: PossibleIterableIteratorArraySetOrCollectionHolder<T>,) {
    if (isArray(values,))
        return hasNotOneWithArray(collection, values,)
    if (isSet(values,))
        return hasNotOneWithSet(collection, values,)
    if (isCollectionHolder(values,))
        return hasNotOneWithCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasNotOneWithMinimalistCollectionHolder(collection, values,)
    if (isCollectionIterator(values,))
        return hasNotOneWithCollectionIterator(collection, values,)
    if (isIterator(values,))
        return hasNotOneWithIterator(collection, values,)

    if (isArrayByStructure<T>(values,))
        return hasNotOneWithArray(collection, values,)
    if (isSetByStructure<T>(values,))
        return hasNotOneWithSet(collection, values,)
    if (isCollectionHolderByStructure<T>(values,))
        return hasNotOneWithCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolderByStructure<T>(values,))
        return hasNotOneWithMinimalistCollectionHolder(collection, values,)
    if (isCollectionIteratorByStructure<T>(values,))
        return hasNotOneWithCollectionIterator(collection, values,)
    if (isIteratorByStructure<T>(values,))
        return hasNotOneWithIterator(collection, values,)

    return hasNotOneWithIterable(collection, values,)
}


/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly T[],): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder<T>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator<T>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterator<T, unknown, unknown>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<T, unknown, unknown>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: PossibleIterableIteratorArraySetOrCollectionHolder<T>,): boolean
export function hasNotOneByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: PossibleIterableIteratorArraySetOrCollectionHolder<T>,) {
    if (isArray(values,))
        return hasNotOneWithArrayByMinimalistCollectionHolder(collection, values,)
    if (isSet(values,))
        return hasNotOneWithSetByMinimalistCollectionHolder(collection, values,)
    if (isCollectionHolder(values,))
        return hasNotOneWithCollectionHolderByMinimalistCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(collection, values,)
    if (isCollectionIterator(values,))
        return hasNotOneWithCollectionIteratorByMinimalistCollectionHolder(collection, values,)
    if (isIterator(values,))
        return hasNotOneWithIteratorByMinimalistCollectionHolder(collection, values,)

    if (isArrayByStructure<T>(values,))
        return hasNotOneWithArrayByMinimalistCollectionHolder(collection, values,)
    if (isSetByStructure<T>(values,))
        return hasNotOneWithSetByMinimalistCollectionHolder(collection, values,)
    if (isCollectionHolderByStructure<T>(values,))
        return hasNotOneWithCollectionHolderByMinimalistCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolderByStructure<T>(values,))
        return hasNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(collection, values,)
    if (isCollectionIteratorByStructure<T>(values,))
        return hasNotOneWithCollectionIteratorByMinimalistCollectionHolder(collection, values,)
    if (isIteratorByStructure<T>(values,))
        return hasNotOneWithIteratorByMinimalistCollectionHolder(collection, values,)

    return hasNotOneWithIterableByMinimalistCollectionHolder(collection, values,)
}

/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: readonly T[],): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionHolder<T>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionIterator<T>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterator<T, unknown, unknown>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<T, unknown, unknown>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: PossibleIterableIteratorArraySetOrCollectionHolder<T>,): boolean
export function hasNotOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: PossibleIterableIteratorArraySetOrCollectionHolder<T>,) {
    if (isArray(values,))
        return hasNotOneWithArrayByCollectionHolder(collection, values,)
    if (isSet(values,))
        return hasNotOneWithSetByCollectionHolder(collection, values,)
    if (isCollectionHolder(values,))
        return hasNotOneWithCollectionHolderByCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasNotOneWithMinimalistCollectionHolderByCollectionHolder(collection, values,)
    if (isCollectionIterator(values,))
        return hasNotOneWithCollectionIteratorByCollectionHolder(collection, values,)
    if (isIterator(values,))
        return hasNotOneWithIteratorByCollectionHolder(collection, values,)

    if (isArrayByStructure<T>(values,))
        return hasNotOneWithArrayByCollectionHolder(collection, values,)
    if (isSetByStructure<T>(values,))
        return hasNotOneWithSetByCollectionHolder(collection, values,)
    if (isCollectionHolderByStructure<T>(values,))
        return hasNotOneWithCollectionHolderByCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolderByStructure<T>(values,))
        return hasNotOneWithMinimalistCollectionHolderByCollectionHolder(collection, values,)
    if (isCollectionIteratorByStructure<T>(values,))
        return hasNotOneWithCollectionIteratorByCollectionHolder(collection, values,)
    if (isIteratorByStructure<T>(values,))
        return hasNotOneWithIteratorByCollectionHolder(collection, values,)

    return hasNotOneWithIterableByCollectionHolder(collection, values,)
}

/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByArray<const T, >(collection: Nullable<readonly T[]>, values: readonly T[],): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByArray<const T, >(collection: Nullable<readonly T[]>, values: ReadonlySet<T>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByArray<const T, >(collection: Nullable<readonly T[]>, values: CollectionHolder<T>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByArray<const T, >(collection: Nullable<readonly T[]>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByArray<const T, >(collection: Nullable<readonly T[]>, values: CollectionIterator<T>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByArray<const T, >(collection: Nullable<readonly T[]>, values: Iterator<T, unknown, unknown>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByArray<const T, >(collection: Nullable<readonly T[]>, values: Iterable<T, unknown, unknown>,): boolean
/**
 * Tell that none of the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotOneByArray<const T, >(collection: Nullable<readonly T[]>, values: PossibleIterableIteratorArraySetOrCollectionHolder<T>,): boolean
export function hasNotOneByArray<const T, >(collection: Nullable<readonly T[]>, values: PossibleIterableIteratorArraySetOrCollectionHolder<T>,) {
    if (isArray(values,))
        return hasNotOneWithArrayByArray(collection, values,)
    if (isSet(values,))
        return hasNotOneWithSetByArray(collection, values,)
    if (isCollectionHolder(values,))
        return hasNotOneWithCollectionHolderByArray(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasNotOneWithMinimalistCollectionHolderByArray(collection, values,)
    if (isCollectionIterator(values,))
        return hasNotOneWithCollectionIteratorByArray(collection, values,)
    if (isIterator(values,))
        return hasNotOneWithIteratorByArray(collection, values,)

    if (isArrayByStructure<T>(values,))
        return hasNotOneWithArrayByArray(collection, values,)
    if (isSetByStructure<T>(values,))
        return hasNotOneWithSetByArray(collection, values,)
    if (isCollectionHolderByStructure<T>(values,))
        return hasNotOneWithCollectionHolderByArray(collection, values,)
    if (isMinimalistCollectionHolderByStructure<T>(values,))
        return hasNotOneWithMinimalistCollectionHolderByArray(collection, values,)
    if (isCollectionIteratorByStructure<T>(values,))
        return hasNotOneWithCollectionIteratorByArray(collection, values,)
    if (isIteratorByStructure<T>(values,))
        return hasNotOneWithIteratorByArray(collection, values,)

    return hasNotOneWithIterableByArray(collection, values,)
}

//#endregion -------------------- Facade method --------------------
