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

import {hasAllWithArray, hasAllWithArrayByArray, hasAllWithArrayByCollectionHolder, hasAllWithArrayByMinimalistCollectionHolder}                                                                                     from "./hasAll.withArray"
import {hasAllWithCollectionHolder, hasAllWithCollectionHolderByArray, hasAllWithCollectionHolderByCollectionHolder, hasAllWithCollectionHolderByMinimalistCollectionHolder}                                         from "./hasAll.withCollectionHolder"
import {hasAllWithCollectionIterator, hasAllWithCollectionIteratorByArray, hasAllWithCollectionIteratorByCollectionHolder, hasAllWithCollectionIteratorByMinimalistCollectionHolder}                                 from "./hasAll.withCollectionIterator"
import {hasAllWithIterable, hasAllWithIterableByArray, hasAllWithIterableByCollectionHolder, hasAllWithIterableByMinimalistCollectionHolder}                                                                         from "./hasAll.withIterable"
import {hasAllWithIterator, hasAllWithIteratorByArray, hasAllWithIteratorByCollectionHolder, hasAllWithIteratorByMinimalistCollectionHolder}                                                                         from "./hasAll.withIterator"
import {hasAllWithMinimalistCollectionHolder, hasAllWithMinimalistCollectionHolderByArray, hasAllWithMinimalistCollectionHolderByCollectionHolder, hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "./hasAll.withMinimalistCollectionHolder"
import {hasAllWithSet, hasAllWithSetByArray, hasAllWithSetByCollectionHolder, hasAllWithSetByMinimalistCollectionHolder}                                                                                             from "./hasAll.withSet"
import {isArray}                                                                                                                                                                                                     from "./isArray"
import {isArrayByStructure}                                                                                                                                                                                          from "./isArrayByStructure"
import {isCollectionIterator}                                                                                                                                                                                        from "./isCollectionIterator"
import {isCollectionIteratorByStructure}                                                                                                                                                                             from "./isCollectionIteratorByStructure"
import {isCollectionHolder}                                                                                                                                                                                          from "./isCollectionHolder"
import {isCollectionHolderByStructure}                                                                                                                                                                               from "./isCollectionHolderByStructure"
import {isIterator}                                                                                                                                                                                                  from "./isIterator"
import {isIteratorByStructure}                                                                                                                                                                                       from "./isIteratorByStructure"
import {isMinimalistCollectionHolder}                                                                                                                                                                                from "./isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}                                                                                                                                                                     from "./isMinimalistCollectionHolderByStructure"
import {isSet}                                                                                                                                                                                                       from "./isSet"
import {isSetByStructure}                                                                                                                                                                                            from "./isSetByStructure"

//#region -------------------- Facade method --------------------

/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<readonly T[]>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<ReadonlySet<T>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<CollectionHolder<T>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<MinimalistCollectionHolder<T>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<CollectionIterator<T>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<Iterator<T, unknown, unknown>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<Iterable<T, unknown, unknown>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder}, {@link CollectionHolder} or {@link ReadonlyArray Array})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
export function hasAll<const T, >(collection: Nullable<| MinimalistCollectionHolder<T> | CollectionHolder<T> | readonly T[]>, values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
    if (values == null)
        return true

    if (isArray(values,))
        return hasAllWithArray(collection, values,)
    if (isSet(values,))
        return hasAllWithSet(collection, values,)
    if (isCollectionHolder(values,))
        return hasAllWithCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasAllWithMinimalistCollectionHolder(collection, values,)
    if (isCollectionIterator(values,))
        return hasAllWithCollectionIterator(collection, values,)
    if (isIterator(values,))
        return hasAllWithIterator(collection, values,)

    if (isArrayByStructure<T>(values,))
        return hasAllWithArray(collection, values,)
    if (isSetByStructure<T>(values,))
        return hasAllWithSet(collection, values,)
    if (isCollectionHolderByStructure<T>(values,))
        return hasAllWithCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolderByStructure<T>(values,))
        return hasAllWithMinimalistCollectionHolder(collection, values,)
    if (isCollectionIteratorByStructure<T>(values,))
        return hasAllWithCollectionIterator(collection, values,)
    if (isIteratorByStructure<T>(values,))
        return hasAllWithIterator(collection, values,)

    return hasAllWithIterable(collection, values,)
}


/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<readonly T[]>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<ReadonlySet<T>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<CollectionHolder<T>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<MinimalistCollectionHolder<T>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<CollectionIterator<T>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<Iterator<T, unknown, unknown>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<Iterable<T, unknown, unknown>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
    if (values == null)
        return true

    if (isArray(values,))
        return hasAllWithArrayByMinimalistCollectionHolder(collection, values,)
    if (isSet(values,))
        return hasAllWithSetByMinimalistCollectionHolder(collection, values,)
    if (isCollectionHolder(values,))
        return hasAllWithCollectionHolderByMinimalistCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(collection, values,)
    if (isCollectionIterator(values,))
        return hasAllWithCollectionIteratorByMinimalistCollectionHolder(collection, values,)
    if (isIterator(values,))
        return hasAllWithIteratorByMinimalistCollectionHolder(collection, values,)

    if (isArrayByStructure<T>(values,))
        return hasAllWithArrayByMinimalistCollectionHolder(collection, values,)
    if (isSetByStructure<T>(values,))
        return hasAllWithSetByMinimalistCollectionHolder(collection, values,)
    if (isCollectionHolderByStructure<T>(values,))
        return hasAllWithCollectionHolderByMinimalistCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolderByStructure<T>(values,))
        return hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(collection, values,)
    if (isCollectionIteratorByStructure<T>(values,))
        return hasAllWithCollectionIteratorByMinimalistCollectionHolder(collection, values,)
    if (isIteratorByStructure<T>(values,))
        return hasAllWithIteratorByMinimalistCollectionHolder(collection, values,)

    return hasAllWithIterableByMinimalistCollectionHolder(collection, values,)
}

/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<readonly T[]>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<ReadonlySet<T>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<CollectionHolder<T>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<MinimalistCollectionHolder<T>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<CollectionIterator<T>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<Iterator<T, unknown, unknown>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<Iterable<T, unknown, unknown>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
    if (values == null)
        return true

    if (isArray(values,))
        return hasAllWithArrayByCollectionHolder(collection, values,)
    if (isSet(values,))
        return hasAllWithSetByCollectionHolder(collection, values,)
    if (isCollectionHolder(values,))
        return hasAllWithCollectionHolderByCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasAllWithMinimalistCollectionHolderByCollectionHolder(collection, values,)
    if (isCollectionIterator(values,))
        return hasAllWithCollectionIteratorByCollectionHolder(collection, values,)
    if (isIterator(values,))
        return hasAllWithIteratorByCollectionHolder(collection, values,)

    if (isArrayByStructure<T>(values,))
        return hasAllWithArrayByCollectionHolder(collection, values,)
    if (isSetByStructure<T>(values,))
        return hasAllWithSetByCollectionHolder(collection, values,)
    if (isCollectionHolderByStructure<T>(values,))
        return hasAllWithCollectionHolderByCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolderByStructure<T>(values,))
        return hasAllWithMinimalistCollectionHolderByCollectionHolder(collection, values,)
    if (isCollectionIteratorByStructure<T>(values,))
        return hasAllWithCollectionIteratorByCollectionHolder(collection, values,)
    if (isIteratorByStructure<T>(values,))
        return hasAllWithIteratorByCollectionHolder(collection, values,)

    return hasAllWithIterableByCollectionHolder(collection, values,)
}

/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<readonly T[]>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<ReadonlySet<T>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<CollectionHolder<T>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<MinimalistCollectionHolder<T>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<CollectionIterator<T>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<Iterator<T, unknown, unknown>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<Iterable<T, unknown, unknown>>,): boolean
/**
 * Tell that all the {@link values} exist in the {@link collection}
 *
 * @param collection The nullable collection
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
export function hasAllByArray<const T, >(collection: Nullable<readonly T[]>, values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
    if (values == null)
        return true

    if (isArray(values,))
        return hasAllWithArrayByArray(collection, values,)
    if (isSet(values,))
        return hasAllWithSetByArray(collection, values,)
    if (isCollectionHolder(values,))
        return hasAllWithCollectionHolderByArray(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasAllWithMinimalistCollectionHolderByArray(collection, values,)
    if (isCollectionIterator(values,))
        return hasAllWithCollectionIteratorByArray(collection, values,)
    if (isIterator(values,))
        return hasAllWithIteratorByArray(collection, values,)

    if (isArrayByStructure<T>(values,))
        return hasAllWithArrayByArray(collection, values,)
    if (isSetByStructure<T>(values,))
        return hasAllWithSetByArray(collection, values,)
    if (isCollectionHolderByStructure<T>(values,))
        return hasAllWithCollectionHolderByArray(collection, values,)
    if (isMinimalistCollectionHolderByStructure<T>(values,))
        return hasAllWithMinimalistCollectionHolderByArray(collection, values,)
    if (isCollectionIteratorByStructure<T>(values,))
        return hasAllWithCollectionIteratorByArray(collection, values,)
    if (isIteratorByStructure<T>(values,))
        return hasAllWithIteratorByArray(collection, values,)

    return hasAllWithIterableByArray(collection, values,)
}

//#endregion -------------------- Facade method --------------------
