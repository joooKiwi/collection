/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {PossibleIterableArraySetOrCollectionHolder} from "../../src/CollectionHolder.types"
import type {CollectionHolder}                           from "../../src/CollectionHolder"

import {GenericMinimalistCollectionHolder} from "../../src/GenericMinimalistCollectionHolder"
import {GenericCollectionHolder}           from "../../src/GenericCollectionHolder"
import {LazyGenericCollectionHolder}       from "../../src/LazyGenericCollectionHolder"

import {Holder}                                           from "../Holder"
import {CollectionHolder_ByMinimalistCollection}          from "../instance/CollectionHolder_ByMinimalistCollection"
import {CollectionHolder_ByGenericCollection}             from "../instance/CollectionHolder_ByGenericCollection"
import {CollectionHolder_ByLazyCollection}                from "../instance/CollectionHolder_ByLazyCollection"
import {CollectionHolder_ByStructure}                     from "../instance/CollectionHolder_ByStructure"
import {CollectionHolder_FromMinimalistExtensionFunction} from "../instance/CollectionHolder_FromMinimalistExtensionFunction"
import {CollectionHolder_FromExtensionFunction}           from "../instance/CollectionHolder_FromExtensionFunction"
import {CollectionHolderFromArray}                        from "../instance/CollectionHolderFromArray"
import {CollectionIterator_ByStructure}                   from "../instance/CollectionIterator_ByStructure"
import {CollectionIteratorFromArray}                      from "../instance/CollectionIteratorFromArray"
import {IterableForTest}                                  from "../instance/IterableForTest"
import {IterableWithCountForTest}                         from "../instance/IterableWithCountForTest"
import {IterableWithLengthForTest}                        from "../instance/IterableWithLengthForTest"
import {IterableWithLengthThatFailOnCount}                from "../instance/IterableWithLengthThatFailOnCount"
import {IterableWithNullPossibleSize}                     from "../instance/IterableWithNullPossibleSize"
import {IterableWithSizeForTest}                          from "../instance/IterableWithSizeForTest"
import {IterableWithSizeThatFailOnLength}                 from "../instance/IterableWithSizeThatFailOnLength"
import {MinimalistCollectionHolder_ByStructure}           from "../instance/MinimalistCollectionHolder_ByStructure"
import {MinimalistCollectionHolderFromArray}              from "../instance/MinimalistCollectionHolderFromArray"

/** The possible instances currently exported to the public */
export const everyCollectionInstances = [
    new Holder({ isMinimalist: true,  isLazy: false, isExtension: false, type: 'minimalist', instance: GenericMinimalistCollectionHolder,}, "minimalist",),
    new Holder({ isMinimalist: false, isLazy: false, isExtension: false, type: 'normal',     instance: GenericCollectionHolder,},           "normal",),
    new Holder({ isMinimalist: false, isLazy: true,  isExtension: false, type: 'lazy',       instance: LazyGenericCollectionHolder,},       "lazy",),
] as const

/**
 * The possible extension function currently exported to the public grouped together as a {@link CollectionHolder}
 * to apply on tests
 */
export const everyExtensionFunctionAsCollectionHolder = [
    new Holder({isMinimalist: true,  isLazy: false, isExtension: true, type: 'minimalist', instance: CollectionHolder_FromMinimalistExtensionFunction,}, "collection (on minimalist extension)",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true, type: 'normal',     instance: CollectionHolder_FromExtensionFunction,},           "collection (on extension)",),
] as const

/**
 * The possible instances currently exported to the public mocked as an {@link CollectionHolder}
 * to apply on tests
 */
export const everyCollectionInstancesAsCollectionHolder = [
    new Holder({ isMinimalist: true,  isLazy: false, isExtension: false, type: 'minimalist', instance: CollectionHolder_ByMinimalistCollection, }, "collection (by minimalist)",),
    new Holder({ isMinimalist: false, isLazy: false, isExtension: false, type: 'normal',     instance: CollectionHolder_ByGenericCollection, },    "collection (by normal)",),
    new Holder({ isMinimalist: false, isLazy: true,  isExtension: false, type: 'lazy',       instance: CollectionHolder_ByLazyCollection, },       "collection (by lazy)",),
] as const


/**
 * The possible instances applicable to the type-alias {@link PossibleIterableArraySetOrCollectionHolder}
 * to apply on tests
 *
 * @todo Replace the callback nature with the constructor instance
 */
export const everyIterableInstances = [
    new Holder(<const T,> (array: readonly T[],) => Array.from(array,),                                 "array",),
    //TODO add array by structure
    new Holder(<const T, >(array: readonly T[],) => new Set(array,),                                    "set",),
    //TODO add set by structure
    new Holder(<const T, >(array: readonly T[],) => new IterableForTest(array,),                        "iterable",),
    new Holder(<const T, >(array: readonly T[],) => new IterableWithSizeForTest(array,),                "iterable with size",),
    new Holder(<const T, >(array: readonly T[],) => new IterableWithLengthForTest(array,),              "iterable with length",),
    new Holder(<const T, >(array: readonly T[],) => new IterableWithCountForTest(array,),               "iterable with count",),
    new Holder(<const T, >(array: readonly T[],) => new IterableWithNullPossibleSize(array,),           "iterable with possible size (all null)",),
    new Holder(<const T, >(array: readonly T[],) => new IterableWithSizeThatFailOnLength(array,),       "iterable with possible size (with size & fail on length)",),
    new Holder(<const T, >(array: readonly T[],) => new IterableWithLengthThatFailOnCount(array,),      "iterable with possible size (with length & fail on count)",),
    //TODO add iterator when it is handled
    new Holder(<const T, >(array: readonly T[],) => new CollectionIteratorFromArray(array,),            "collection iterator",),
    new Holder(<const T, >(array: readonly T[],) => new CollectionIterator_ByStructure(array,),         "collection iterator (by structure)",),
    new Holder(<const T, >(array: readonly T[],) => new CollectionHolderFromArray(array,),              "collection holder",),
    new Holder(<const T, >(array: readonly T[],) => new CollectionHolder_ByStructure(array,),           "collection holder (by structure)",),
    new Holder(<const T, >(array: readonly T[],) => new MinimalistCollectionHolderFromArray(array,),    "minimalist collection holder",),
    new Holder(<const T, >(array: readonly T[],) => new MinimalistCollectionHolder_ByStructure(array,), "minimalist collection holder (by structure)",),
] as const
