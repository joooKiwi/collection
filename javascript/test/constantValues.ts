/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import {GenericCollectionHolder}     from "../src/GenericCollectionHolder"
import {LazyGenericCollectionHolder} from "../src/LazyGenericCollectionHolder"

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
        new Holder(<T>(iterable:Iterable<T>,) => Array.from(iterable,), "array",),
        new Holder(<T>(iterable: Iterable<T>,) => new Set(iterable,), "set",),
        new Holder(<T>(iterable: Iterable<T>,) => iterable[Symbol.iterator]() as IterableIterator<T>, "iterable",),
        new Holder(<T>(iterable: Iterable<T>,) => new GenericCollectionHolder(iterable,), "generic collection holder",),
        new Holder(<T>(iterable: Iterable<T>,) => new LazyGenericCollectionHolder(iterable,), "lazy generic collection holder",),
    ],
    nonPresentItem = Symbol()
