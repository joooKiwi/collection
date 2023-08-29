/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {IterableWithCount}        from "../src/iterable/IterableWithCount"
import type {IterableWithLength}       from "../src/iterable/IterableWithLength"
import type {IterableWithPossibleSize} from "../src/iterable/IterableWithPossibleSize"
import type {IterableWithSize}         from "../src/iterable/IterableWithSize"

import {GenericCollectionHolder}     from "../src/GenericCollectionHolder"
import {LazyGenericCollectionHolder} from "../src/LazyGenericCollectionHolder"
import {GenericCollectionIterator}   from "../src/iterator/GenericCollectionIterator"

import {Holder} from "./Holder"

export const sizeValues = () => [
        new Holder({array: [], size: 0,}, '0',),
        new Holder({array: [Symbol(),], size: 1,}, '1',),
        new Holder({array: [Symbol(), Symbol(),], size: 2,}, '2',),
    ] as const,
    TEMPLATE_ITEMS = [
        1, 2, 3, 4, 5, 6, 7, 8, 9, 0,
        1n, 2n, 3n, 4n, 5n, 6n, 7n, 8n, 9n, 0n,
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
        'à', 'â', 'á', 'ä', 'è', 'ê', 'é', 'ë', 'í', 'î', 'í', 'ï', 'ó', 'ô', 'ó', 'ö', 'ù', 'û', 'ú', 'ü', 'ç',
        'À', 'Â', 'Á', 'Ä', 'È', 'Ê', 'É', 'Ë', 'Í', 'Î', 'Í', 'Ï', 'Ó', 'Ô', 'Ó', 'Ö', 'Ù', 'Û', 'Ú', 'Ü', 'Ç',
        true, false,
    ] as const,
    everyInstances = [
        new Holder(GenericCollectionHolder, GenericCollectionHolder.name,),
        new Holder(LazyGenericCollectionHolder, LazyGenericCollectionHolder.name,),
    ] as const,
    iterableCreation = [
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
    ],
    nonPresentItem = Symbol()
