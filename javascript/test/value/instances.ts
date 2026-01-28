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

import type {CollectionHolder}               from "../../src/CollectionHolder"
import type {CollectionHolder_FromExtension} from "../instance/CollectionHolder_FromExtension"

import {EmptyCollectionException}                                  from "../../src/exception/EmptyCollectionException"
import {NullCollectionException}                                   from "../../src/exception/NullCollectionException"
import {Holder}                                                    from "../Holder"
import {CollectionHolder_ByMinimalistCollection}                   from "../instance/CollectionHolder_ByMinimalistCollection"
import {CollectionHolder_ByGenericCollection}                      from "../instance/CollectionHolder_ByGenericCollection"
import {CollectionHolder_ByLazyCollection}                         from "../instance/CollectionHolder_ByLazyCollection"
import {CollectionHolder_ByStructure}                              from "../instance/CollectionHolder_ByStructure"
import {CollectionHolder_FromArrayExtensionFunction}               from "../instance/CollectionHolder_FromArrayExtensionFunction"
import {CollectionHolder_FromExtensionFunction}                    from "../instance/CollectionHolder_FromExtensionFunction"
import {CollectionHolder_FromMinimalistExtensionFunction}          from "../instance/CollectionHolder_FromMinimalistExtensionFunction"
import {CollectionHolder_FromNullArrayExtensionFunction}           from "../instance/CollectionHolder_FromNullArrayExtensionFunction"
import {CollectionHolder_FromNullExtensionFunction}                from "../instance/CollectionHolder_FromNullExtensionFunction"
import {CollectionHolder_FromNullMinimalistExtensionFunction}      from "../instance/CollectionHolder_FromNullMinimalistExtensionFunction"
import {CollectionHolder_FromNullPublicExtensionFunction}          from "../instance/CollectionHolder_FromNullPublicExtensionFunction"
import {CollectionHolder_FromUndefinedArrayExtensionFunction}      from "../instance/CollectionHolder_FromUndefinedArrayExtensionFunction"
import {CollectionHolder_FromUndefinedExtensionFunction}           from "../instance/CollectionHolder_FromUndefinedExtensionFunction"
import {CollectionHolder_FromUndefinedMinimalistExtensionFunction} from "../instance/CollectionHolder_FromUndefinedMinimalistExtensionFunction"
import {CollectionHolder_FromUndefinedPublicExtensionFunction}     from "../instance/CollectionHolder_FromUndefinedPublicExtensionFunction"
import {CollectionHolderFromArray}                                 from "../instance/CollectionHolderFromArray"
import {CollectionIterator_ByStructure}                            from "../instance/CollectionIterator_ByStructure"
import {CollectionIteratorFromArray}                               from "../instance/CollectionIteratorFromArray"
import {IterableForTest}                                           from "../instance/IterableForTest"
import {IterableWithCountForTest}                                  from "../instance/IterableWithCountForTest"
import {IterableWithLengthForTest}                                 from "../instance/IterableWithLengthForTest"
import {IterableWithLengthThatFailOnCount}                         from "../instance/IterableWithLengthThatFailOnCount"
import {IterableWithNullPossibleSize}                              from "../instance/IterableWithNullPossibleSize"
import {IterableWithSizeForTest}                                   from "../instance/IterableWithSizeForTest"
import {IterableWithSizeThatFailOnLength}                          from "../instance/IterableWithSizeThatFailOnLength"
import {IteratorForTest}                                           from "../instance/IteratorForTest"
import {MinimalistCollectionHolder_ByStructure}                    from "../instance/MinimalistCollectionHolder_ByStructure"
import {MinimalistCollectionHolderFromArray}                       from "../instance/MinimalistCollectionHolderFromArray"
import {EMPTY}                                                     from "./arrays"

/**
 * The possible instances and extension function currently exported to the public as a mocked {@link CollectionHolder}
 * to apply on tests
 */
export const everyCollectionInstances = [
    new Holder({isMinimalist: true,  isLazy: false, isExtension: false, isNull: false, emptyException: EmptyCollectionException, type: "minimalist",                     instance: CollectionHolder_ByMinimalistCollection, },                            "collection (by minimalist)",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: false, isNull: false, emptyException: EmptyCollectionException, type: "normal",                         instance: CollectionHolder_ByGenericCollection, },                               "collection (by normal)",),
    // new Holder({isMinimalist: false, isLazy: false, isExtension: false, isNull: false, emptyException: EmptyCollectionException, type: "array",                          instance: CollectionHolder_ByArrayCollection, },                                 "collection (by array)",),
    new Holder({isMinimalist: false, isLazy: true,  isExtension: false, isNull: false, emptyException: EmptyCollectionException, type: "lazy",                           instance: CollectionHolder_ByLazyCollection, },                                  "collection (by lazy)",),
    new Holder({isMinimalist: true,  isLazy: false, isExtension: true,  isNull: false, emptyException: EmptyCollectionException, type: "minimalist extension",           instance: CollectionHolder_FromMinimalistExtensionFunction,},                    "minimalist extension",),
    new Holder({isMinimalist: true,  isLazy: false, isExtension: true,  isNull: true,  emptyException: NullCollectionException,  type: "null minimalist extension",      instance: CollectionHolder_FromNullMinimalistExtensionFunction,},           "null minimalist extension",),
    new Holder({isMinimalist: true,  isLazy: false, isExtension: true,  isNull: true,  emptyException: NullCollectionException,  type: "undefined minimalist extension", instance: CollectionHolder_FromUndefinedMinimalistExtensionFunction,}, "undefined minimalist extension",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true,  isNull: false, emptyException: EmptyCollectionException, type: "normal extension",               instance: CollectionHolder_FromExtensionFunction,},                                  "normal extension",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true,  isNull: true,  emptyException: NullCollectionException,  type: "null normal extension",          instance: CollectionHolder_FromNullExtensionFunction,},                         "null normal extension",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true,  isNull: true,  emptyException: NullCollectionException,  type: "undefined normal extension",     instance: CollectionHolder_FromUndefinedExtensionFunction,},               "undefined normal extension",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true,  isNull: false, emptyException: EmptyCollectionException, type: "array extension",                instance: CollectionHolder_FromArrayExtensionFunction,},                              "array extension",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true,  isNull: true,  emptyException: NullCollectionException,  type: "null array extension",           instance: CollectionHolder_FromNullArrayExtensionFunction,},                     "null array extension",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true,  isNull: true,  emptyException: NullCollectionException,  type: "undefined array extension",      instance: CollectionHolder_FromUndefinedArrayExtensionFunction,},           "undefined array extension",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true,  isNull: true,  emptyException: NullCollectionException,  type: "null extension",                 instance: CollectionHolder_FromNullPublicExtensionFunction,},                          "null extension",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true,  isNull: true,  emptyException: NullCollectionException,  type: "undefined extension",            instance: CollectionHolder_FromUndefinedPublicExtensionFunction,},                "undefined extension",),
] as const

/**
 * The possible instances currently exported to the public as a mocked {@link CollectionHolder}
 * to apply on tests
 */
export const everyInstances = [
    new Holder({isMinimalist: true,  isLazy: false, isExtension: false, isNull: false, emptyException: EmptyCollectionException, type: "minimalist", instance: CollectionHolder_ByMinimalistCollection, }, "collection (by minimalist)",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: false, isNull: false, emptyException: EmptyCollectionException, type: "normal",     instance: CollectionHolder_ByGenericCollection, },    "collection (by normal)",),
    // new Holder({isMinimalist: false, isLazy: false, isExtension: false, isNull: false, type: "array",     instance: CollectionHolder_ByArrayCollection, },      "collection (by array)",),
    new Holder({isMinimalist: false, isLazy: true,  isExtension: false, isNull: false, emptyException: EmptyCollectionException, type: "lazy",       instance: CollectionHolder_ByLazyCollection, },       "collection (by lazy)",),
] as const satisfies readonly Holder<{readonly isExtension: false, isNull: false, emptyException: typeof EmptyCollectionException, }, string>[]

/**
 * The possible instances as extension function currently exported to the public as a mocked {@link CollectionHolder}
 * to apply on tests
 */
export const everyExtensionMethodInstances = [
    new Holder({isMinimalist: true,  isLazy: false, isExtension: true, isNull: false, emptyException: EmptyCollectionException, type: "minimalist extension",           instance: new CollectionHolder_FromMinimalistExtensionFunction<unknown>(EMPTY,),},              "minimalist extension",),
    new Holder({isMinimalist: true,  isLazy: false, isExtension: true, isNull: true,  emptyException: NullCollectionException,  type: "null minimalist extension",      instance: new CollectionHolder_FromNullMinimalistExtensionFunction<unknown>(),},           "null minimalist extension",),
    new Holder({isMinimalist: true,  isLazy: false, isExtension: true, isNull: true,  emptyException: NullCollectionException,  type: "undefined minimalist extension", instance: new CollectionHolder_FromUndefinedMinimalistExtensionFunction<unknown>(),}, "undefined minimalist extension",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true, isNull: false, emptyException: EmptyCollectionException, type: "normal extension",               instance: new CollectionHolder_FromExtensionFunction<unknown>(EMPTY,),},                            "normal extension",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true, isNull: true,  emptyException: NullCollectionException,  type: "null normal extension",          instance: new CollectionHolder_FromNullExtensionFunction<unknown>(),},                         "null normal extension",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true, isNull: true,  emptyException: NullCollectionException,  type: "undefined normal extension",     instance: new CollectionHolder_FromUndefinedExtensionFunction<unknown>(),},               "undefined normal extension",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true, isNull: false, emptyException: EmptyCollectionException, type: "array extension",                instance: new CollectionHolder_FromArrayExtensionFunction<unknown>(EMPTY,),},                        "array extension",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true, isNull: true,  emptyException: NullCollectionException,  type: "null array extension",           instance: new CollectionHolder_FromNullArrayExtensionFunction<unknown>(),},                     "null array extension",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true, isNull: true,  emptyException: NullCollectionException,  type: "undefined array extension",      instance: new CollectionHolder_FromUndefinedArrayExtensionFunction<unknown>(),},           "undefined array extension",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true, isNull: true,  emptyException: NullCollectionException,  type: "null extension",                 instance: new CollectionHolder_FromNullPublicExtensionFunction<unknown>(),},                          "null extension",),
    new Holder({isMinimalist: false, isLazy: false, isExtension: true, isNull: true,  emptyException: NullCollectionException,  type: "undefined extension",            instance: new CollectionHolder_FromUndefinedPublicExtensionFunction<unknown>(),},                "undefined extension",),
] as const satisfies readonly Holder<{readonly isLazy: false, readonly isExtension: true, readonly instance: CollectionHolder_FromExtension<unknown>,}, string>[]


/**
 * The possible instances applicable to the type-alias {@link PossibleIterableIteratorArraySetOrCollectionHolder}
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
    new Holder(<const T, >(array: readonly T[],) => new IteratorForTest(array,),                        "iterator",),
    //TODO add iterator by structure
    new Holder(<const T, >(array: readonly T[],) => new CollectionIteratorFromArray(array,),            "collection iterator",),
    new Holder(<const T, >(array: readonly T[],) => new CollectionIterator_ByStructure(array,),         "collection iterator (by structure)",),
    new Holder(<const T, >(array: readonly T[],) => new CollectionHolderFromArray(array,),              "collection holder",),
    new Holder(<const T, >(array: readonly T[],) => new CollectionHolder_ByStructure(array,),           "collection holder (by structure)",),
    new Holder(<const T, >(array: readonly T[],) => new MinimalistCollectionHolderFromArray(array,),    "minimalist collection holder",),
    new Holder(<const T, >(array: readonly T[],) => new MinimalistCollectionHolder_ByStructure(array,), "minimalist collection holder (by structure)",),
] as const
