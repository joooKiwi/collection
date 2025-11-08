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

import {hasNotAllWithArray, hasNotAllWithArrayByArray, hasNotAllWithArrayByCollectionHolder, hasNotAllWithArrayByMinimalistCollectionHolder}                                                                                     from "./hasNotAll.withArray"
import {hasNotAllWithCollectionHolder, hasNotAllWithCollectionHolderByArray, hasNotAllWithCollectionHolderByCollectionHolder, hasNotAllWithCollectionHolderByMinimalistCollectionHolder}                                         from "./hasNotAll.withCollectionHolder"
import {hasNotAllWithCollectionIterator, hasNotAllWithCollectionIteratorByArray, hasNotAllWithCollectionIteratorByCollectionHolder, hasNotAllWithCollectionIteratorByMinimalistCollectionHolder}                                 from "./hasNotAll.withCollectionIterator"
import {hasNotAllWithIterable, hasNotAllWithIterableByArray, hasNotAllWithIterableByCollectionHolder, hasNotAllWithIterableByMinimalistCollectionHolder}                                                                         from "./hasNotAll.withIterable"
import {hasNotAllWithIterator, hasNotAllWithIteratorByArray, hasNotAllWithIteratorByCollectionHolder, hasNotAllWithIteratorByMinimalistCollectionHolder}                                                                         from "./hasNotAll.withIterator"
import {hasNotAllWithMinimalistCollectionHolder, hasNotAllWithMinimalistCollectionHolderByArray, hasNotAllWithMinimalistCollectionHolderByCollectionHolder, hasNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "./hasNotAll.withMinimalistCollectionHolder"
import {hasNotAllWithSet, hasNotAllWithSetByArray, hasNotAllWithSetByCollectionHolder, hasNotAllWithSetByMinimalistCollectionHolder}                                                                                             from "./hasNotAll.withSet"
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
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<readonly T[]>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<ReadonlySet<T>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<CollectionHolder<T>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<MinimalistCollectionHolder<T>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<CollectionIterator<T>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<Iterator<T, unknown, unknown>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<Iterable<T, unknown, unknown>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
export function hasNotAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
    if (values == null)
        return false

    if (isArray(values,))
        return hasNotAllWithArray(collection, values,)
    if (isSet(values,))
        return hasNotAllWithSet(collection, values,)
    if (isCollectionHolder(values,))
        return hasNotAllWithCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasNotAllWithMinimalistCollectionHolder(collection, values,)
    if (isCollectionIterator(values,))
        return hasNotAllWithCollectionIterator(collection, values,)
    if (isIterator(values,))
        return hasNotAllWithIterator(collection, values,)

    if (isArrayByStructure<T>(values,))
        return hasNotAllWithArray(collection, values,)
    if (isSetByStructure<T>(values,))
        return hasNotAllWithSet(collection, values,)
    if (isCollectionHolderByStructure<T>(values,))
        return hasNotAllWithCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolderByStructure<T>(values,))
        return hasNotAllWithMinimalistCollectionHolder(collection, values,)
    if (isCollectionIteratorByStructure<T>(values,))
        return hasNotAllWithCollectionIterator(collection, values,)
    if (isIteratorByStructure<T>(values,))
        return hasNotAllWithIterator(collection, values,)

    return hasNotAllWithIterable(collection, values,)
}


/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<readonly T[]>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<ReadonlySet<T>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<CollectionHolder<T>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<MinimalistCollectionHolder<T>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<CollectionIterator<T>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<Iterator<T, unknown, unknown>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<Iterable<T, unknown, unknown>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
export function hasNotAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
    if (values == null)
        return false

    if (isArray(values,))
        return hasNotAllWithArrayByMinimalistCollectionHolder(collection, values,)
    if (isSet(values,))
        return hasNotAllWithSetByMinimalistCollectionHolder(collection, values,)
    if (isCollectionHolder(values,))
        return hasNotAllWithCollectionHolderByMinimalistCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(collection, values,)
    if (isCollectionIterator(values,))
        return hasNotAllWithCollectionIteratorByMinimalistCollectionHolder(collection, values,)
    if (isIterator(values,))
        return hasNotAllWithIteratorByMinimalistCollectionHolder(collection, values,)

    if (isArrayByStructure<T>(values,))
        return hasNotAllWithArrayByMinimalistCollectionHolder(collection, values,)
    if (isSetByStructure<T>(values,))
        return hasNotAllWithSetByMinimalistCollectionHolder(collection, values,)
    if (isCollectionHolderByStructure<T>(values,))
        return hasNotAllWithCollectionHolderByMinimalistCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolderByStructure<T>(values,))
        return hasNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(collection, values,)
    if (isCollectionIteratorByStructure<T>(values,))
        return hasNotAllWithCollectionIteratorByMinimalistCollectionHolder(collection, values,)
    if (isIteratorByStructure<T>(values,))
        return hasNotAllWithIteratorByMinimalistCollectionHolder(collection, values,)

    return hasNotAllWithIterableByMinimalistCollectionHolder(collection, values,)
}

/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<readonly T[]>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<ReadonlySet<T>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<CollectionHolder<T>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<MinimalistCollectionHolder<T>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<CollectionIterator<T>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<Iterator<T, unknown, unknown>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<Iterable<T, unknown, unknown>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
export function hasNotAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
    if (values == null)
        return false

    if (isArray(values,))
        return hasNotAllWithArrayByCollectionHolder(collection, values,)
    if (isSet(values,))
        return hasNotAllWithSetByCollectionHolder(collection, values,)
    if (isCollectionHolder(values,))
        return hasNotAllWithCollectionHolderByCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasNotAllWithMinimalistCollectionHolderByCollectionHolder(collection, values,)
    if (isCollectionIterator(values,))
        return hasNotAllWithCollectionIteratorByCollectionHolder(collection, values,)
    if (isIterator(values,))
        return hasNotAllWithIteratorByCollectionHolder(collection, values,)

    if (isArrayByStructure<T>(values,))
        return hasNotAllWithArrayByCollectionHolder(collection, values,)
    if (isSetByStructure<T>(values,))
        return hasNotAllWithSetByCollectionHolder(collection, values,)
    if (isCollectionHolderByStructure<T>(values,))
        return hasNotAllWithCollectionHolderByCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolderByStructure<T>(values,))
        return hasNotAllWithMinimalistCollectionHolderByCollectionHolder(collection, values,)
    if (isCollectionIteratorByStructure<T>(values,))
        return hasNotAllWithCollectionIteratorByCollectionHolder(collection, values,)
    if (isIteratorByStructure<T>(values,))
        return hasNotAllWithIteratorByCollectionHolder(collection, values,)

    return hasNotAllWithIterableByCollectionHolder(collection, values,)
}

/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<readonly T[]>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<ReadonlySet<T>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<CollectionHolder<T>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<MinimalistCollectionHolder<T>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<CollectionIterator<T>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<Iterator<T, unknown, unknown>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<Iterable<T, unknown, unknown>>,): boolean
/**
 * Tell that not a single item in the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function hasNotAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
export function hasNotAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
    if (values == null)
        return false

    if (isArray(values,))
        return hasNotAllWithArrayByArray(collection, values,)
    if (isSet(values,))
        return hasNotAllWithSetByArray(collection, values,)
    if (isCollectionHolder(values,))
        return hasNotAllWithCollectionHolderByArray(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasNotAllWithMinimalistCollectionHolderByArray(collection, values,)
    if (isCollectionIterator(values,))
        return hasNotAllWithCollectionIteratorByArray(collection, values,)
    if (isIterator(values,))
        return hasNotAllWithIteratorByArray(collection, values,)

    if (isArrayByStructure<T>(values,))
        return hasNotAllWithArrayByArray(collection, values,)
    if (isSetByStructure<T>(values,))
        return hasNotAllWithSetByArray(collection, values,)
    if (isCollectionHolderByStructure<T>(values,))
        return hasNotAllWithCollectionHolderByArray(collection, values,)
    if (isMinimalistCollectionHolderByStructure<T>(values,))
        return hasNotAllWithMinimalistCollectionHolderByArray(collection, values,)
    if (isCollectionIteratorByStructure<T>(values,))
        return hasNotAllWithCollectionIteratorByArray(collection, values,)
    if (isIteratorByStructure<T>(values,))
        return hasNotAllWithIteratorByArray(collection, values,)

    return hasNotAllWithIterableByArray(collection, values,)
}

//#endregion -------------------- Facade method --------------------
