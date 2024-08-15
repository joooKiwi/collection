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

import {hasOneWithArray, hasOneWithArrayByCollectionHolder}                                           from "./hasOne.withArray"
import {hasOneWithCollectionHolder, hasOneWithCollectionHolderByCollectionHolder}                     from "./hasOne.withCollectionHolder"
import {hasOneWithCollectionIterator, hasOneWithCollectionIteratorByCollectionHolder}                 from "./hasOne.withCollectionIterator"
import {hasOneWithIterable, hasOneWithIterableByCollectionHolder}                                     from "./hasOne.withIterable"
import {hasOneWithMinimalistCollectionHolder, hasOneWithMinimalistCollectionHolderByCollectionHolder} from "./hasOne.withMinimalistCollectionHolder"
import {hasOneWithSet, hasOneWithSetByCollectionHolder}                                               from "./hasOne.withSet"
import {isCollectionIterator}                                                                         from "./isCollectionIterator"
import {isCollectionIteratorByStructure}                                                              from "./isCollectionIteratorByStructure"
import {isCollectionHolder}                                                                           from "./isCollectionHolder"
import {isCollectionHolderByStructure}                                                                from "./isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}                                                                 from "./isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}                                                      from "./isMinimalistCollectionHolderByStructure"

//#region -------------------- Facade method --------------------

/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly T[],): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: readonly unknown[],): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: ReadonlySet<unknown>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionHolder,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: MinimalistCollectionHolder,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: CollectionIterator,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: Iterable<unknown>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 * @typescriptDefinition
 */
export function hasOne<const T, >(collection: Nullable<MinimalistCollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
export function hasOne(collection: Nullable<MinimalistCollectionHolder>, values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean {
    if (values instanceof Array)
        return hasOneWithArray(collection, values,)
    if (values instanceof Set)
        return hasOneWithSet(collection, values,)
    if (isCollectionHolder(values,))
        return hasOneWithCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasOneWithMinimalistCollectionHolder(collection, values,)
    if (isCollectionIterator(values,))
        return hasOneWithCollectionIterator(collection, values,)

    if (isCollectionHolderByStructure<unknown>(values,))
        return hasOneWithCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolderByStructure<unknown>(values,))
        return hasOneWithMinimalistCollectionHolder(collection, values,)
    if (isCollectionIteratorByStructure<unknown>(values,))
        return hasOneWithCollectionIterator(collection, values,)
    return hasOneWithIterable(collection, values,)
}

/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: readonly T[],): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: ReadonlySet<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: MinimalistCollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionIterator<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: readonly unknown[],): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: ReadonlySet<unknown>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionHolder,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: MinimalistCollectionHolder,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: CollectionIterator,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: Iterable<unknown>,): boolean
/**
 * Tell whenever at least one value of the {@link values} exist in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
 * @param values     The values to compare
 * @return {boolean} <b>true</b> if at least one value is equals to one value in the {@link collection}
 * @extensionFunction
 * @facadeFunction
 */
export function hasOneByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
export function hasOneByCollectionHolder(collection: Nullable<CollectionHolder>, values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean {
    if (values instanceof Array)
        return hasOneWithArrayByCollectionHolder(collection, values,)
    if (values instanceof Set)
        return hasOneWithSetByCollectionHolder(collection, values,)
    if (isCollectionHolder(values,))
        return hasOneWithCollectionHolderByCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolder(values,))
        return hasOneWithMinimalistCollectionHolderByCollectionHolder(collection, values,)
    if (isCollectionIterator(values,))
        return hasOneWithCollectionIteratorByCollectionHolder(collection, values,)

    if (isCollectionHolderByStructure<unknown>(values,))
        return hasOneWithCollectionHolderByCollectionHolder(collection, values,)
    if (isMinimalistCollectionHolderByStructure<unknown>(values,))
        return hasOneWithMinimalistCollectionHolderByCollectionHolder(collection, values,)
    if (isCollectionIteratorByStructure<unknown>(values,))
        return hasOneWithCollectionIteratorByCollectionHolder(collection, values,)
    return hasOneWithIterableByCollectionHolder(collection, values,)
}

//#endregion -------------------- Facade method --------------------
