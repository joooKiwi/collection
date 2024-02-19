/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}           from "../src/CollectionHolder"
import type {MinimalistCollectionHolder} from "../src/MinimalistCollectionHolder"
import type {IterableWithCount}          from "../src/iterable/IterableWithCount"
import type {IterableWithLength}         from "../src/iterable/IterableWithLength"
import type {IterableWithPossibleSize}   from "../src/iterable/IterableWithPossibleSize"
import type {IterableWithSize}           from "../src/iterable/IterableWithSize"
import type {PossibleIterable}           from "../src/iterable/types"
import type {CollectionIterator}         from "../src/iterator/CollectionIterator"

import {GenericCollectionHolder}           from "../src/GenericCollectionHolder"
import {GenericMinimalistCollectionHolder} from "../src/GenericMinimalistCollectionHolder"
import {LazyGenericCollectionHolder}       from "../src/LazyGenericCollectionHolder"
import {GenericCollectionIterator}         from "../src/iterator/GenericCollectionIterator"

import {Holder}                                           from "./Holder"
import {CollectionHolder_ByGenericMinimalistCollection}   from "./instance/CollectionHolder_ByGenericMinimalistCollection"
import {CollectionHolder_ByGenericCollection}             from "./instance/CollectionHolder_ByGenericCollection"
import {CollectionHolder_ByLazyCollection}                from "./instance/CollectionHolder_ByLazyCollection"
import {CollectionHolder_FromExtensionFunction}           from "./instance/CollectionHolder_FromExtensionFunction"
import {CollectionHolder_FromMinimalistExtensionFunction} from "./instance/CollectionHolder_FromMinimalistExtensionFunction"

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

type IterableCreation<T,> = (array: readonly T[],) => | Array<T> | Set<T> | PossibleIterable<T> | CollectionIterator<T> | MinimalistCollectionHolder<T> | CollectionHolder<T>
/**
 * The possible instance creation from a {@link IterableCreation} and a {@link ReadonlyArray} of from
 * {@link GenericMinimalistCollectionHolder}, {@link GenericCollectionHolder} or {@link LazyGenericCollectionHolder}
 */
export const everyCollectionInstanceByIterable = [
    new Holder({ isMinimalist: true,  isLazy: false, isExtensionOnly: false, newInstance: <const T, >(iterableCreation: IterableCreation<T>, array: readonly T[],): MinimalistCollectionHolder<T> => new GenericMinimalistCollectionHolder(iterableCreation(array,),), }, "minimalist",),
    new Holder({ isMinimalist: false, isLazy: false, isExtensionOnly: false, newInstance: <const T, >(iterableCreation: IterableCreation<T>, array: readonly T[],): CollectionHolder<T> => new GenericCollectionHolder(iterableCreation(array,),), },                     "normal",),
    new Holder({ isMinimalist: false, isLazy: true,  isExtensionOnly: false, newInstance: <const T, >(iterableCreation: IterableCreation<T>, array: readonly T[],): CollectionHolder<T> => new LazyGenericCollectionHolder(iterableCreation(array,),), },                 "lazy",),
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
    new Holder({ isMinimalist: true,  isLazy: false, isExtensionOnly: true,  newInstance: <const T, >(array: readonly T[],): CollectionHolder<T> => new CollectionHolder_FromMinimalistExtensionFunction(array,), }, "collection (from minimalist extension function)",),
    new Holder({ isMinimalist: false, isLazy: false, isExtensionOnly: true,  newInstance: <const T, >(array: readonly T[],): CollectionHolder<T> => new CollectionHolder_FromExtensionFunction(array,), },           "collection (from extension function)",),
    new Holder({ isMinimalist: true,  isLazy: false, isExtensionOnly: false, newInstance: <const T, >(array: readonly T[],): CollectionHolder<T> => new CollectionHolder_ByGenericMinimalistCollection(array,), },   "collection (by generic minimalist collection)",),
    new Holder({ isMinimalist: false, isLazy: false, isExtensionOnly: false, newInstance: <const T, >(array: readonly T[],): CollectionHolder<T> => new CollectionHolder_ByGenericCollection(array,), },             "collection (by generic collection)",),
    new Holder({ isMinimalist: false, isLazy: true,  isExtensionOnly: false, newInstance: <const T, >(array: readonly T[],): CollectionHolder<T> => new CollectionHolder_ByLazyCollection(array,), },                "collection (by lazy collection)",),
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
    new Holder(<T>(array: readonly T[],) => Array.from(array,), "array",),
    new Holder(<T>(array: readonly T[],) => new Set(array,), "set",),
    new Holder(<T>(array: readonly T[],) => ({
        [Symbol.iterator](): IterableIterator<T> { return array[Symbol.iterator]() },
    }) as Iterable<T>, "iterable",),
    new Holder(<T>(array: readonly T[],) => ({
        [Symbol.iterator](): IterableIterator<T> { return array[Symbol.iterator]() },
        size: array.length,
    }) as IterableWithSize<T>, "iterable with size",),
    new Holder(<T>(array: readonly T[],) => ({
        [Symbol.iterator](): IterableIterator<T> { return array[Symbol.iterator]() },
        length: array.length,
    }) as IterableWithLength<T>, "iterable with length",),
    new Holder(<T>(array: readonly T[],) => ({
        [Symbol.iterator](): IterableIterator<T> { return array[Symbol.iterator]() },
        count: array.length,
    }) as IterableWithCount<T>, "iterable with count",),
    new Holder(<T>(array: readonly T[],) => ({
        [Symbol.iterator](): IterableIterator<T> { return array[Symbol.iterator]() },
        size: null,
        length: null,
        count: null,
    }) as IterableWithPossibleSize<T>, "iterable with null size, length and count",),
    new Holder(<T>(array: readonly T[],) => new GenericCollectionIterator(new GenericMinimalistCollectionHolder(array,),), "collection iterator + generic minimalist collection",),
    new Holder(<T>(array: readonly T[],) => new GenericCollectionIterator(new GenericCollectionHolder(array,),), "collection iterator + generic collection",),
    new Holder(<T>(array: readonly T[],) => new GenericCollectionIterator(new LazyGenericCollectionHolder(array,),), "collection iterator + lazy collection",),
    new Holder(<T>(array: readonly T[],) => new GenericMinimalistCollectionHolder(array,), "generic minimalist collection",),
    new Holder(<T>(array: readonly T[],) => new GenericCollectionHolder(array,), "generic collection",),
    new Holder(<T>(array: readonly T[],) => new LazyGenericCollectionHolder(array,), "lazy collection",),
]

export const nonPresentItem = Symbol("Non present item",)
