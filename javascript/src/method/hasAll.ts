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

import {hasAllWithArray, hasAllWithArrayByCollectionHolder, hasAllWithArrayByMinimalistCollectionHolder}                                                                from "./hasAll.withArray"
import {hasAllWithCollectionHolder, hasAllWithCollectionHolderByCollectionHolder, hasAllWithCollectionHolderByMinimalistCollectionHolder}                               from "./hasAll.withCollectionHolder"
import {hasAllWithCollectionIterator, hasAllWithCollectionIteratorByCollectionHolder, hasAllWithCollectionIteratorByMinimalistCollectionHolder}                         from "./hasAll.withCollectionIterator"
import {hasAllWithIterable, hasAllWithIterableByCollectionHolder, hasAllWithIterableByMinimalistCollectionHolder}                                                       from "./hasAll.withIterable"
import {hasAllWithMinimalistCollectionHolder, hasAllWithMinimalistCollectionHolderByCollectionHolder, hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "./hasAll.withMinimalistCollectionHolder"
import {hasAllWithSet, hasAllWithSetByCollectionHolder, hasAllWithSetByMinimalistCollectionHolder}                                                                      from "./hasAll.withSet"
import {isArray}                                                                                                                                                        from "./isArray"
import {isArrayByStructure}                                                                                                                                             from "./isArrayByStructure"
import {isCollectionIterator}                                                                                                                                           from "./isCollectionIterator"
import {isCollectionIteratorByStructure}                                                                                                                                from "./isCollectionIteratorByStructure"
import {isCollectionHolder}                                                                                                                                             from "./isCollectionHolder"
import {isCollectionHolderByStructure}                                                                                                                                  from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}                                                                                                                                   from "./isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}                                                                                                                        from "./isMinimalistCollectionHolderByStructure"
import {isSet}                                                                                                                                                          from "./isSet"
import {isSetByStructure}                                                                                                                                               from "./isSetByStructure"

//#region -------------------- Facade method --------------------

/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly T[],): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly unknown[],): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<unknown>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<unknown>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} collection ({@link MinimalistCollectionHolder} or {@link CollectionHolder})
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean {
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

    return hasAllWithIterable(collection, values,)
}


/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly T[],): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly unknown[],): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<unknown>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<unknown>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
export function hasAllByMinimalistCollectionHolder<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean {
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

    return hasAllWithIterableByMinimalistCollectionHolder(collection, values,)
}

/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: readonly T[],): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionIterator<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: readonly unknown[],): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: ReadonlySet<unknown>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionHolder,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: MinimalistCollectionHolder,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionIterator,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<unknown>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 * @deprecated Use values present in the {@link collection} instead. This will be removed in version 1.11
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean {
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

    return hasAllWithIterableByCollectionHolder(collection, values,)
}

//#endregion -------------------- Facade method --------------------
