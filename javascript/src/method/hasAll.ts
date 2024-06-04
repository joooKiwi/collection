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

import {hasAllWithArray, hasAllWithArrayByCollectionHolder}                                           from "./hasAll.withArray"
import {hasAllWithCollectionHolder, hasAllWithCollectionHolderByCollectionHolder}                     from "./hasAll.withCollectionHolder"
import {hasAllWithCollectionIterator, hasAllWithCollectionIteratorByCollectionHolder}                 from "./hasAll.withCollectionIterator"
import {hasAllWithIterable, hasAllWithIterableByCollectionHolder}                                     from "./hasAll.withIterable"
import {hasAllWithMinimalistCollectionHolder, hasAllWithMinimalistCollectionHolderByCollectionHolder} from "./hasAll.withMinimalistCollectionHolder"
import {hasAllWithSet, hasAllWithSetByCollectionHolder}                                               from "./hasAll.withSet"
import {isCollectionIterator}                                                                         from "./isCollectionIterator"
import {isCollectionIteratorByStructure}                                                              from "./isCollectionIteratorByStructure"
import {isCollectionHolder}                                                                           from "./isCollectionHolder"
import {isCollectionHolderByStructure}                                                                from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}                                                                 from "./isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}                                                      from "./isMinimalistCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly T[],): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly unknown[],): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<unknown>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<unknown>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
/**
 * Tell that the {@link values} are in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} Every {@link values} are in the {@link collection}
 * @deprecated Replace with has or use a non-variadic arguments. It will be removed in version 1.10
 * @extensionFunction
 */
export function hasAll<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, ...values: readonly T[]): boolean
/**
 * Tell that the {@link values} are in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} Every {@link values} are in the {@link collection}
 * @deprecated Replace with has or use a non-variadic arguments. It will be removed in version 1.10
 * @extensionFunction
 */
export function hasAll(collection: Nullable<MinimalistCollectionHolder>, ...values: readonly unknown[]): boolean
export function hasAll(collection: Nullable<MinimalistCollectionHolder>,): boolean {
    if (arguments.length != 1)
        return hasAllWithArray(collection, arguments as unknown as readonly unknown[],) // TODO Remove once the version 1.10 is in progress

    const values = arguments[0] as PossibleIterableArraySetOrCollectionHolder<unknown>
    if (values instanceof Array)
        return hasAllWithArray(collection, values,)
    if (values instanceof Set)
        return hasAllWithSet(collection, values,)
    if (isCollectionHolder(values,))
        return hasAllWithCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasAllWithMinimalistCollectionHolder(collection, values,)
    if (isCollectionIterator(values,))
        return hasAllWithCollectionIterator(collection, values,)

    if (isCollectionHolderByStructure<unknown>(values,))
        return hasAllWithCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolderByStructure<unknown>(values,))
        //@ts-ignore
        return hasAllWithMinimalistCollectionHolder(collection, values,)
    if (isCollectionIteratorByStructure<unknown>(values,))
        return hasAllWithCollectionIterator(collection, values,)

    return hasAllWithIterable(collection, values,)
}

/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: readonly T[],): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionIterator<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<T>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
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
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: readonly unknown[],): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: ReadonlySet<unknown>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionHolder,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: MinimalistCollectionHolder,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionIterator,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<unknown>,): boolean
/**
 * Tell that all of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
 * @typescriptDefinition
 * @extensionFunction
 * @facadeFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
/**
 * Tell that the {@link values} are in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} Every {@link values} are in the {@link collection}
 * @deprecated Replace with has or use a non-variadic arguments. It will be removed in version 1.10
 * @extensionFunction
 */
export function hasAllByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, ...values: readonly T[]): boolean
/**
 * Tell that the {@link values} are in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} Every {@link values} are in the {@link collection}
 * @deprecated Replace with has or use a non-variadic arguments. It will be removed in version 1.10
 * @extensionFunction
 */
export function hasAllByCollectionHolder(collection: Nullable<CollectionHolder>, ...values: readonly unknown[]): boolean
export function hasAllByCollectionHolder(collection: Nullable<CollectionHolder>,): boolean {
    if (arguments.length != 1)
        return hasAllWithArrayByCollectionHolder(collection, arguments as unknown as readonly unknown[],) // TODO Remove once the version 1.10 is in progress

    const values = arguments[0] as PossibleIterableArraySetOrCollectionHolder<unknown>
    if (values instanceof Array)
        return hasAllWithArrayByCollectionHolder(collection, values,)
    if (values instanceof Set)
        return hasAllWithSetByCollectionHolder(collection, values,)
    if (isCollectionHolder(values,))
        return hasAllWithCollectionHolderByCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasAllWithMinimalistCollectionHolderByCollectionHolder(collection, values,)
    if (isCollectionIterator(values,))
        return hasAllWithCollectionIteratorByCollectionHolder(collection, values,)

    if (isCollectionHolderByStructure<unknown>(values,))
        return hasAllWithCollectionHolderByCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolderByStructure<unknown>(values,))
        return hasAllWithMinimalistCollectionHolderByCollectionHolder(collection, values,)
    if (isCollectionIteratorByStructure<unknown>(values,))
        return hasAllWithCollectionIteratorByCollectionHolder(collection, values,)

    return hasAllWithIterableByCollectionHolder(collection, values,)
}

//#endregion -------------------- Facade method --------------------
