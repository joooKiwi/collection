//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import {A, A_A, AA, AB, AB_AB, ABAB, ABCD, EMPTY}      from "./value/arrays"
import {everyExtensionMethodInstances, everyInstances} from "./value/instances"

import {CollectionConstants}       from "../src/CollectionConstants"
import {EmptyCollectionHolder}     from "../src/EmptyCollectionHolder"
import {GenericCollectionIterator} from "../src/iterator/GenericCollectionIterator"

describe("CollectionHolderTest (conversion)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("toIterator",               () => expect(instance.toIterator(),).toBe(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
        test("toArray",                  () => expect(instance.toArray(),).toBe(CollectionConstants.EMPTY_ARRAY,),)
        test("toArray: frozen",          () => expect(instance.toArray(),).toBeFrozen(),)
        test("toMutableArray",           () => expect(instance.toMutableArray(),).toEqual([],),)
        test("toMutableArray: frozen",   () => expect(instance.toMutableArray(),).not.toBeFrozen(),)
        test("toSet",                    () => expect(instance.toSet(),).toBe(CollectionConstants.EMPTY_SET,),)
        test("toSet: frozen",            () => expect(instance.toSet(),).toBeFrozen(),)
        test("toMutableSet",             () => expect(instance.toMutableSet(),).toEqual(new Set(),),)
        test("toMutableSet: frozen",     () => expect(instance.toMutableSet(),).not.toBeFrozen(),)
        test("toWeakSet",                () => expect(instance.toWeakSet(),).toBe(CollectionConstants.EMPTY_WEAK_SET,),)
        test("toWeakSet: frozen",        () => expect(instance.toWeakSet(),).toBeFrozen(),)
        test("toMutableWeakWet",         () => expect(instance.toMutableWeakSet(),).toEqual(new WeakSet(),),)
        test("toMutableWeakWet: frozen", () => expect(instance.toMutableWeakSet(),).not.toBeFrozen(),)
        test("toMap",                    () => expect(instance.toMap(),).toBe(CollectionConstants.EMPTY_MAP,),)
        test("toMap: frozen",            () => expect(instance.toMap(),).toBeFrozen(),)
        test("toMutableMap",             () => expect(instance.toMutableMap(),).toEqual(new Map(),),)
        test("toMutableMap: frozen",     () => expect(instance.toMutableMap(),).not.toBeFrozen(),)
        test("toWeakMap",                () => expect(instance.toWeakMap(),).toBe(CollectionConstants.EMPTY_WEAK_MAP,),)
        test("toWeakMap: frozen",        () => expect(instance.toWeakMap(),).toBeFrozen(),)
        test("toMutableWeakMap",         () => expect(instance.toMutableWeakMap(),).toEqual(new WeakMap(),),)
        test("toMutableWeakMap: frozen", () => expect(instance.toMutableWeakMap(),).not.toBeFrozen(),)
        test("toString",                 () => expect(instance.toString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleString",           () => expect(instance.toLocaleString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLowerCaseString",        () => expect(instance.toLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleLowerCaseString",  () => expect(instance.toLocaleLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toUpperCaseString",        () => expect(instance.toUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleUpperCaseString",  () => expect(instance.toLocaleUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance: instance,},},) => {
        describe("toIterator",              () => expect(instance.toIterator(),).toBe(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
        describe("toArray",                 () => expect(instance.toArray(),).toBe(CollectionConstants.EMPTY_ARRAY,),)
        describe("toMutableArray",          () => expect(instance.toMutableArray(),).toEqual(CollectionConstants.EMPTY_ARRAY,),)
        describe("toSet",                   () => expect(instance.toSet(),).toBe(CollectionConstants.EMPTY_SET,),)
        describe("toMutableSet",            () => expect(instance.toMutableSet(),).toEqual(CollectionConstants.EMPTY_SET,),)
        // describe("toWeakSet",               () => expect(instance.toWeakSet(),).toBe(CollectionConstants.EMPTY_WEAK_SET,),)
        // describe("toMutableWeakSet",        () => expect(instance.toMutableWeakSet(),).toEqual(CollectionConstants.EMPTY_WEAK_SET,),)
        describe("toMap",                   () => expect(instance.toMap(),).toBe(CollectionConstants.EMPTY_MAP,),)
        describe("toMutableMap",            () => expect(instance.toMutableMap(),).toEqual(CollectionConstants.EMPTY_MAP,),)

        describe("toString",                () => expect(instance.toString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        describe("toLocaleString",          () => expect(instance.toLocaleString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        describe("toLowerCaseString",       () => expect(instance.toLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        describe("toLocaleLowerCaseString", () => expect(instance.toLocaleLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        describe("toUpperCaseString",       () => expect(instance.toUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        describe("toLocaleUpperCaseString", () => expect(instance.toLocaleUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
    },)},)

    describe("instances", () => {
    describe.each(everyInstances,)("%s", ({value: {instance,},},) => {
        test("toIterator: empty",                    () => expect(new instance(EMPTY,).toIterator(),).toBe(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
        test("toIterator: 1 field",                  () => expect(new instance(A,)    .toIterator(),).toBeInstanceOf(GenericCollectionIterator,),)
        test("toIterator: 2 fields",                 () => expect(new instance(AB,)   .toIterator(),).toBeInstanceOf(GenericCollectionIterator,),)
        test("toIterator: 4 fields",                 () => expect(new instance(ABCD,) .toIterator(),).toBeInstanceOf(GenericCollectionIterator,),)

        test("toArray: empty",                       () => expect(new instance(EMPTY,).toArray(),).toBe(CollectionConstants.EMPTY_ARRAY,),)
        test("toArray: 1 field",                     () => expect(new instance(A,)    .toArray(),).toStrictEqual(A,),)
        test("toArray: 2 unique fields",             () => expect(new instance(AB,)   .toArray(),).toStrictEqual(AB,),)
        test("toArray: 2 duplicated fields",         () => expect(new instance(AA,)   .toArray(),).toStrictEqual(AA,),)
        test("toArray: 4 unique fields",             () => expect(new instance(ABCD,) .toArray(),).toStrictEqual(ABCD,),)
        test("toArray: 4 duplicating fields",        () => expect(new instance(ABAB,) .toArray(),).toStrictEqual(ABAB,),)
        test("toArray: frozen",                      () => expect(new instance(ABAB,) .toArray(),).toBeFrozen(),)
        test("toMutableArray: empty",                () => expect(new instance(EMPTY,).toMutableArray(),).toStrictEqual(CollectionConstants.EMPTY_ARRAY,),)
        test("toMutableArray: 1 field",              () => expect(new instance(A,)    .toMutableArray(),).toStrictEqual(A,),)
        test("toMutableArray: 2 unique fields",      () => expect(new instance(AB,)   .toMutableArray(),).toStrictEqual(AB,),)
        test("toMutableArray: 2 duplicated fields",  () => expect(new instance(AA,)   .toMutableArray(),).toStrictEqual(AA,),)
        test("toMutableArray: 4 unique fields",      () => expect(new instance(ABCD,) .toMutableArray(),).toStrictEqual(ABCD,),)
        test("toMutableArray: 4 duplicating fields", () => expect(new instance(ABAB,) .toMutableArray(),).toStrictEqual(ABAB,),)
        test("toMutableArray: frozen",               () => expect(new instance(ABAB,) .toMutableArray(),).not.toBeFrozen(),)

        test("toSet: empty",                         () => expect(new instance(EMPTY,).toSet(),).toBe(CollectionConstants.EMPTY_SET,),)
        test("toSet: 1 field",                       () => expect(new instance(A,)    .toSet(),).toEqual(new Set(A,),),)
        test("toSet: 2 unique fields",               () => expect(new instance(AB,)   .toSet(),).toEqual(new Set(AB,),),)
        test("toSet: 2 duplicated fields",           () => expect(new instance(AA,)   .toSet(),).toEqual(new Set(A,),),)
        test("toSet: 4 unique fields",               () => expect(new instance(ABCD,) .toSet(),).toEqual(new Set(ABCD,),),)
        test("toSet: 4 duplicating fields",          () => expect(new instance(ABAB,) .toSet(),).toEqual(new Set(AB,),),)
        test("toSet: frozen",                        () => expect(new instance(ABAB,) .toSet(),).toBeFrozen(),)
        test("toMutableSet: empty",                  () => expect(new instance(EMPTY,).toMutableSet(),).toEqual(new Set(),),)
        test("toMutableSet: 1 field",                () => expect(new instance(A,)    .toMutableSet(),).toEqual(new Set(A,),),)
        test("toMutableSet: 2 unique fields",        () => expect(new instance(AB,)   .toMutableSet(),).toEqual(new Set(AB,),),)
        test("toMutableSet: 2 duplicated fields",    () => expect(new instance(AA,)   .toMutableSet(),).toEqual(new Set(A,),),)
        test("toMutableSet: 4 unique fields",        () => expect(new instance(ABCD,) .toMutableSet(),).toEqual(new Set(ABCD,),),)
        test("toMutableSet: 4 duplicating fields",   () => expect(new instance(ABAB,) .toMutableSet(),).toEqual(new Set(AB,),),)
        test("toMutableSet: frozen",                 () => expect(new instance(ABAB,) .toMutableSet(),).not.toBeFrozen(),)

        test("toMap: empty",                         () => expect(new instance(EMPTY,).toMap(),).toBe(CollectionConstants.EMPTY_MAP,),)
        test("toMap: 1 field",                       () => expect(new instance(A,)    .toMap(),).toEqual(new Map([[0, 'a',],],),),)
        test("toMap: 2 unique fields",               () => expect(new instance(AB,)   .toMap(),).toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
        test("toMap: 2 duplicated fields",           () => expect(new instance(AA,)   .toMap(),).toEqual(new Map([[0, 'a',], [1, 'a',],],),),)
        test("toMap: 4 unique fields",               () => expect(new instance(ABCD,) .toMap(),).toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'c',], [3, 'd',],],),),)
        test("toMap: 4 duplicating fields",          () => expect(new instance(ABAB,) .toMap(),).toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'a',], [3, 'b',],],),),)
        test("toMap: frozen",                        () => expect(new instance(ABAB,) .toMap(),).toBeFrozen(),)
        test("toMutableMap: empty",                  () => expect(new instance(EMPTY,).toMutableMap(),).toEqual(new Map(),),)
        test("toMutableMap: 1 field",                () => expect(new instance(A,)    .toMutableMap(),).toEqual(new Map([[0, 'a',],],),),)
        test("toMutableMap: 2 unique fields",        () => expect(new instance(AB,)   .toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
        test("toMutableMap: 2 duplicated fields",    () => expect(new instance(AA,)   .toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'a',],],),),)
        test("toMutableMap: 4 unique fields",        () => expect(new instance(ABCD,) .toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'c',], [3, 'd',],],),),)
        test("toMutableMap: 4 duplicating fields",   () => expect(new instance(ABAB,) .toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'a',], [3, 'b',],],),),)
        test("toMutableMap: frozen",                 () => expect(new instance(ABAB,) .toMutableMap(),).not.toBeFrozen(),)

        test("toString: empty",                      () => expect(new instance(EMPTY,).toString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toString: 1 field",                    () => expect(new instance(A,)    .toString(),).toBe("[a]",),)
        test("toString: 2 fields",                   () => expect(new instance(A_A,)  .toString(),).toBe("[a, A]",),)
        test("toString: 4 fields",                   () => expect(new instance(AB_AB,).toString(),).toBe("[a, b, A, B]",),)
        test("toLocaleString: empty",                () => expect(new instance(EMPTY,).toLocaleString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleString: 1 field",              () => expect(new instance(A,)    .toLocaleString(),).toBe("[a]",),)
        test("toLocaleString: 2 fields",             () => expect(new instance(A_A,)  .toLocaleString(),).toBe("[a, A]",),)
        test("toLocaleString: 4 fields",             () => expect(new instance(AB_AB,).toLocaleString(),).toBe("[a, b, A, B]",),)
        test("toLowerCaseString: empty",             () => expect(new instance(EMPTY,).toLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLowerCaseString: 1 field",           () => expect(new instance(A,)    .toLowerCaseString(),).toBe("[a]",),)
        test("toLowerCaseString: 2 fields",          () => expect(new instance(A_A,)  .toLowerCaseString(),).toBe("[a, a]",),)
        test("toLowerCaseString: 4 fields",          () => expect(new instance(AB_AB,).toLowerCaseString(),).toBe("[a, b, a, b]",),)
        test("toLocaleLowerCaseString: empty",       () => expect(new instance(EMPTY,).toLocaleLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleLowerCaseString: 1 field",     () => expect(new instance(A,)    .toLocaleLowerCaseString(),).toBe("[a]",),)
        test("toLocaleLowerCaseString: 2 fields",    () => expect(new instance(A_A,)  .toLocaleLowerCaseString(),).toBe("[a, a]",),)
        test("toLocaleLowerCaseString: 4 fields",    () => expect(new instance(AB_AB,).toLocaleLowerCaseString(),).toBe("[a, b, a, b]",),)
        test("toUpperCaseString: empty",             () => expect(new instance(EMPTY,).toUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toUpperCaseString: 1 field",           () => expect(new instance(A,)    .toUpperCaseString(),).toBe("[A]",),)
        test("toUpperCaseString: 2 fields",          () => expect(new instance(A_A,)  .toUpperCaseString(),).toBe("[A, A]",),)
        test("toUpperCaseString: 4 fields",          () => expect(new instance(AB_AB,).toUpperCaseString(),).toBe("[A, B, A, B]",),)
        test("toLocaleUpperCaseString: empty",       () => expect(new instance(EMPTY,).toLocaleUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleUpperCaseString: 1 field",     () => expect(new instance(A,)    .toLocaleUpperCaseString(),).toBe("[A]",),)
        test("toLocaleUpperCaseString: 2 fields",    () => expect(new instance(A_A,)  .toLocaleUpperCaseString(),).toBe("[A, A]",),)
        test("toLocaleUpperCaseString: 4 fields",    () => expect(new instance(AB_AB,).toLocaleUpperCaseString(),).toBe("[A, B, A, B]",),)
    },)},)

},)
