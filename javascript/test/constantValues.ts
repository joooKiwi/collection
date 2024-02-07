/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {IterableWithCount}        from "../src/iterable/IterableWithCount"
import type {IterableWithLength}       from "../src/iterable/IterableWithLength"
import type {IterableWithPossibleSize} from "../src/iterable/IterableWithPossibleSize"
import type {IterableWithSize}         from "../src/iterable/IterableWithSize"

import {GenericCollectionHolder}           from "../src/GenericCollectionHolder"
import {GenericMinimalistCollectionHolder} from "../src/GenericMinimalistCollectionHolder"
import {LazyGenericCollectionHolder}       from "../src/LazyGenericCollectionHolder"
import {GenericCollectionIterator}         from "../src/iterator/GenericCollectionIterator"

import {Holder} from "./Holder"

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
export const everySimplisticInstances = [
    new Holder(GenericMinimalistCollectionHolder, "minimalist",),
    new Holder(GenericCollectionHolder, "normal",),
    new Holder(LazyGenericCollectionHolder, "lazy (normal)",),
] as const
export const everyInstances = [
    new Holder(GenericCollectionHolder, "GenericCollectionHolder",),
    new Holder(LazyGenericCollectionHolder, "LazyGenericCollectionHolder",),
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
    new Holder(<T>(array: readonly T[],) => new GenericCollectionIterator(new GenericCollectionHolder(array,),), "collection iterator + generic collection",),
    new Holder(<T>(array: readonly T[],) => new GenericCollectionIterator(new LazyGenericCollectionHolder(array,),), "collection iterator + lazy collection",),
    new Holder(<T>(array: readonly T[],) => new GenericCollectionHolder(array,), "generic collection",),
    new Holder(<T>(array: readonly T[],) => new LazyGenericCollectionHolder(array,), "lazy collection",),
]
export const nonPresentItem = Symbol()
