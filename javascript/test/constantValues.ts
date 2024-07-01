/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                           from "../src/CollectionHolder"
import type {MinimalistCollectionHolder}                 from "../src/MinimalistCollectionHolder"
import type {IterableWithCount}                          from "../src/iterable/IterableWithCount"
import type {IterableWithLength}                         from "../src/iterable/IterableWithLength"
import type {IterableWithPossibleSize}                   from "../src/iterable/IterableWithPossibleSize"
import type {IterableWithSize}                           from "../src/iterable/IterableWithSize"
import type {PossibleIterableArraySetOrCollectionHolder} from "../src/CollectionHolder.types"

import {GenericCollectionHolder}           from "../src/GenericCollectionHolder"
import {GenericMinimalistCollectionHolder} from "../src/GenericMinimalistCollectionHolder"
import {LazyGenericCollectionHolder}       from "../src/LazyGenericCollectionHolder"
import {GenericCollectionIterator}         from "../src/iterator/GenericCollectionIterator"

import {Holder}                                           from "./Holder"
import {CollectionHolder_ByGenericMinimalistCollection}   from "./instance/CollectionHolder_ByGenericMinimalistCollection"
import {CollectionHolder_ByGenericCollection}             from "./instance/CollectionHolder_ByGenericCollection"
import {CollectionHolder_ByLazyCollection}                from "./instance/CollectionHolder_ByLazyCollection"
import {CollectionHolder_ByStructure}                     from "./instance/CollectionHolder_ByStructure"
import {CollectionHolder_FromExtensionFunction}           from "./instance/CollectionHolder_FromExtensionFunction"
import {CollectionHolder_FromMinimalistExtensionFunction} from "./instance/CollectionHolder_FromMinimalistExtensionFunction"
import {MinimalistCollectionHolder_ByStructure}           from "./instance/MinimalistCollectionHolder_ByStructure"

export const sizeValues = () => [
    new Holder({array: [], size: 0,}, "0",),
    new Holder({array: [Symbol(),], size: 1,}, "1",),
    new Holder({array: [Symbol(), Symbol(),], size: 2,}, "2",),
] as const
/**
 * An array containing multiple items ranging from
 * - numbers (0 to 10 in {@link Number}, {@link BigInt}, space-even {@link String})
 * - letters ('a' to 'j' with and without accents)
 * - space character (tab, enter, space)
 * - slash (slash, vertical bar, backslash)
 * - open/close characters (curly, parenthesis, square, angle)
 * - quotes characters
 * - booleans (true and false)
 *
 * And some characters even have a differentiation between the space-even and space-uneven characters
 */
export const TEMPLATE_ITEMS = [
    1, 2, 3, 4, 5, 6, 7, 8, 9, 0,
    1n, 2n, 3n, 4n, 5n, 6n, 7n, 8n, 9n, 0n,
    '１', '２', '３', '４', '５', '６', '７', '８', '９', '０',
    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
    'à', 'â', 'á', 'ä', 'è', 'ê', 'é', 'ë', 'í', 'î', 'ì', 'ï', 'ó', 'ô', 'ò', 'ö', 'œ', 'ú', 'û', 'ù', 'ü', 'ç',
    'À', 'Â', 'Á', 'Ä', 'È', 'Ê', 'É', 'Ë', 'Í', 'Î', 'Ì', 'Ï', 'Ó', 'Ô', 'Ò', 'Ö', 'Œ', 'Ú', 'Û', 'Ù', 'Ü', 'Ç',
    'ａ', 'ｂ', 'ｃ', 'ｄ', 'ｅ', 'ｆ', 'ｇ', 'ｈ', 'ｉ', 'ｊ',
    'Ａ', 'Ｂ', 'Ｃ', 'Ｄ', 'Ｅ', 'Ｆ', 'Ｇ', 'Ｈ', 'Ｉ', 'Ｊ',
    '\t', '\n', ' ',
    '/', '／', '|', '｜', '\\',
    ':', '：', ';',  '；', ',', '，', '.', '．',
    '{', '}', '｛', '｝', '(', ')', '[', ']', '［', '］', '⟨', '⟩', '⟪', '⟫', '<', '>',
    '«', '»', '"', '\'',
    true, false,
] as const
export const FORBIDDEN_INDEXES = [Number.NaN, Number.NEGATIVE_INFINITY, Number.POSITIVE_INFINITY,] as const
export const ZERO_AND_FORBIDDEN_INDEXES = [0, Number.NaN, Number.NEGATIVE_INFINITY, Number.POSITIVE_INFINITY,] as const

type IterableCreation<T,> = (array: readonly T[],) => PossibleIterableArraySetOrCollectionHolder<T>
/**
 * The possible instance creation from a {@link IterableCreation} and a {@link ReadonlyArray} to a
 * {@link GenericMinimalistCollectionHolder}, {@link GenericCollectionHolder} or {@link LazyGenericCollectionHolder}
 */
export const everyCollectionInstanceByIterable = [
    new Holder({ isMinimalist: true,  isLazy: false, isExtensionOnly: false, newInstance: <const T, >(iterableCreation: IterableCreation<T>, array: readonly T[],): MinimalistCollectionHolder<T> => new GenericMinimalistCollectionHolder(iterableCreation(array,),), }, "minimalist",),
    new Holder({ isMinimalist: false, isLazy: false, isExtensionOnly: false, newInstance: <const T, >(iterableCreation: IterableCreation<T>, array: readonly T[],): CollectionHolder<T> => new GenericCollectionHolder<T>(iterableCreation(array,),), },                  "normal",),
    new Holder({ isMinimalist: false, isLazy: true,  isExtensionOnly: false, newInstance: <const T, >(iterableCreation: IterableCreation<T>, array: readonly T[],): CollectionHolder<T> => new LazyGenericCollectionHolder<T>(iterableCreation(array,),), },              "lazy",),
] as const
/**
 * The possible instance for a {@link CollectionHolder} via a
 *  - {@link AbstractCollectionHolder}
 *  - {@link AbstractMinimalistCollectionHolder}
 *  - {@link GenericMinimalistCollectionHolder}
 *  - {@link GenericCollectionHolder}
 *  - {@link LazyGenericCollectionHolder}
 */
export const everyInstance = [
    new Holder({ isMinimalist: true,  isLazy: false, isExtensionOnly: true,  newInstance: <const T, >(array: readonly T[],): CollectionHolder<T> => new CollectionHolder_FromMinimalistExtensionFunction<T>(array,), }, "collection (from minimalist extension function)",),
    new Holder({ isMinimalist: false, isLazy: false, isExtensionOnly: true,  newInstance: <const T, >(array: readonly T[],): CollectionHolder<T> => new CollectionHolder_FromExtensionFunction(array,), },              "collection (from extension function)",),
    new Holder({ isMinimalist: true,  isLazy: false, isExtensionOnly: false, newInstance: <const T, >(array: readonly T[],): CollectionHolder<T> => new CollectionHolder_ByGenericMinimalistCollection(array,), },      "collection (by generic minimalist collection)",),
    new Holder({ isMinimalist: false, isLazy: false, isExtensionOnly: false, newInstance: <const T, >(array: readonly T[],): CollectionHolder<T> => new CollectionHolder_ByGenericCollection(array,), },                "collection (by generic collection)",),
    new Holder({ isMinimalist: false, isLazy: true,  isExtensionOnly: false, newInstance: <const T, >(array: readonly T[],): CollectionHolder<T> => new CollectionHolder_ByLazyCollection(array,), },                   "collection (by lazy collection)",),
] as const
/**
 * The possible instance for a {@link CollectionHolder} (from a known instance) via a
 *  - {@link GenericMinimalistCollectionHolder}
 *  - {@link GenericCollectionHolder}
 *  - {@link LazyGenericCollectionHolder}
 */
export const everyCollectionInstance = [
    new Holder({ isMinimalist: true,  isLazy: false, isExtensionOnly: false, newInstance: <const T, >(array: readonly T[],): CollectionHolder<T> => new CollectionHolder_ByGenericMinimalistCollection(array,), },   "collection (by generic minimalist collection)",),
    new Holder({ isMinimalist: false, isLazy: false, isExtensionOnly: false, newInstance: <const T, >(array: readonly T[],): CollectionHolder<T> => new CollectionHolder_ByGenericCollection(array,), },             "collection (by generic collection)",),
    new Holder({ isMinimalist: false, isLazy: true,  isExtensionOnly: false, newInstance: <const T, >(array: readonly T[],): CollectionHolder<T> => new CollectionHolder_ByLazyCollection(array,), },                "collection (by lazy collection)",),
] as const

export const iterableCreation = [
    new Holder(<const T, >(array: readonly T[],) => Array.from(array,), "array",),
    new Holder(<const T, >(array: readonly T[],) => new Set(array,), "set",),
    new Holder(<const T, >(array: readonly T[],) => ({
        [Symbol.iterator](): IterableIterator<T> { return array[Symbol.iterator]() },
    }) satisfies Iterable<T>, "iterable",),
    new Holder(<const T, >(array: readonly T[],) => ({
        [Symbol.iterator](): IterableIterator<T> { return array[Symbol.iterator]() },
        size: array.length,
    }) satisfies IterableWithSize<T>, "iterable with size",),
    new Holder(<const T, >(array: readonly T[],) => ({
        [Symbol.iterator](): IterableIterator<T> { return array[Symbol.iterator]() },
        length: array.length,
    }) satisfies IterableWithLength<T>, "iterable with length",),
    new Holder(<const T, >(array: readonly T[],) => ({
        [Symbol.iterator](): IterableIterator<T> { return array[Symbol.iterator]() },
        count: array.length,
    }) satisfies IterableWithCount<T>, "iterable with count",),
    new Holder(<const T, >(array: readonly T[],) => ({
        [Symbol.iterator](): IterableIterator<T> { return array[Symbol.iterator]() },
        size: null,
        length: null,
        count: null,
    }) satisfies IterableWithPossibleSize<T>, "iterable with null size, length and count",),
    new Holder(<const T, >(array: readonly T[],) => ({
        [Symbol.iterator](): IterableIterator<T> { return array[Symbol.iterator]() },
        size: array.length,
        get length(): never { throw new Error() },
    }) satisfies IterableWithPossibleSize<T>, "iterable with non-null size and fail length",),
    new Holder(<const T, >(array: readonly T[],) => ({
        [Symbol.iterator](): IterableIterator<T> { return array[Symbol.iterator]() },
        size: null,
        length: array.length,
        get count(): never { throw new Error() },
    }) satisfies IterableWithPossibleSize<T>, "iterable with null size, not-null length and fail count",),
    new Holder(<const T, >(array: readonly T[],) => new GenericCollectionIterator(new GenericMinimalistCollectionHolder(array,),), "collection iterator + minimalist",),
    new Holder(<const T, >(array: readonly T[],) => new GenericCollectionIterator(new MinimalistCollectionHolder_ByStructure(array,),), "collection iterator + minimalist structure",),
    new Holder(<const T, >(array: readonly T[],) => new GenericCollectionIterator(new GenericCollectionHolder(array,),), "collection iterator + normal",),
    new Holder(<const T, >(array: readonly T[],) => new GenericCollectionIterator(new CollectionHolder_ByStructure(array,),), "collection iterator + normal structure",),
    new Holder(<const T, >(array: readonly T[],) => new GenericCollectionIterator(new LazyGenericCollectionHolder(array,),), "collection iterator + lazy",),
    new Holder(<const T, >(array: readonly T[],) => new GenericMinimalistCollectionHolder(array,), "minimalist",),
    new Holder(<const T, >(array: readonly T[],) => new MinimalistCollectionHolder_ByStructure(array,), "minimalist structure",),
    new Holder(<const T, >(array: readonly T[],) => new GenericCollectionHolder(array,), "normal",),
    new Holder(<const T, >(array: readonly T[],) => new CollectionHolder_ByStructure(array,), "normal structure",),
    new Holder(<const T, >(array: readonly T[],) => new LazyGenericCollectionHolder(array,), "lazy",),
]
export const possibleCollectionCreation = [
    new Holder(<const T,>(array: readonly T[],) => new GenericMinimalistCollectionHolder(array,), "minimalist",),
    new Holder(<const T,>(array: readonly T[],) => new MinimalistCollectionHolder_ByStructure(array,), "minimalist structure",),
    new Holder(<const T,>(array: readonly T[],) => new GenericCollectionHolder(array,), "normal",),
    new Holder(<const T,>(array: readonly T[],) => new CollectionHolder_ByStructure(array,), "normal structure",),
    new Holder(<const T,>(array: readonly T[],) => new LazyGenericCollectionHolder(array,), "lazy",),
]
export const minimalistCollectionCreation = [
    new Holder(<const T,>(array: readonly T[],) => new GenericMinimalistCollectionHolder(array,), "minimalist",),
    new Holder(<const T,>(array: readonly T[],) => new MinimalistCollectionHolder_ByStructure(array,), "minimalist structure",),
]
export const collectionCreation = [
    new Holder(<const T,>(array: readonly T[],) => new GenericCollectionHolder(array,), "normal",),
    new Holder(<const T,>(array: readonly T[],) => new CollectionHolder_ByStructure(array,), "normal structure",),
    new Holder(<const T,>(array: readonly T[],) => new LazyGenericCollectionHolder(array,), "lazy",),
]

export const nonPresentItem = Symbol("Non present item",)
