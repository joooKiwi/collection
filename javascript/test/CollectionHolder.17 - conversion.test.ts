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

import {EmptyCollectionHolderForTest}                                   from "./instance/EmptyCollectionHolderForTest"
import {everyCollectionInstancesAndExtensionFunctionAsCollectionHolder} from "./value/instances"
import {A, A_A, AA, AB, AB_AB, ABAB, ABCD, EMPTY}                       from "./value/arrays"

import {CollectionConstants}       from "../src/CollectionConstants"
import {GenericCollectionIterator} from "../src/iterator/GenericCollectionIterator"

describe("CollectionHolderTest (conversion)", () => {

    describe("EmptyCollectionHolder", () => {
        test("toIterator",               () => expect(new EmptyCollectionHolderForTest().toIterator(),).toEqual(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
        test("toArray",                  () => expect(new EmptyCollectionHolderForTest().toArray(),).toEqual(CollectionConstants.EMPTY_ARRAY,),)
        test("toMutableArray",           () => expect(new EmptyCollectionHolderForTest().toMutableArray(),).toEqual([],),)
        test("toMutableArray: frozen",   () => expect(new EmptyCollectionHolderForTest().toMutableArray(),).not.toBeFrozen(),)
        test("toSet",                    () => expect(new EmptyCollectionHolderForTest().toSet(),).toEqual(CollectionConstants.EMPTY_SET,),)
        test("toMutableSet",             () => expect(new EmptyCollectionHolderForTest().toMutableSet(),).toEqual(new Set(),),)
        test("toMutableSet: frozen",     () => expect(new EmptyCollectionHolderForTest().toMutableSet(),).not.toBeFrozen(),)
        test("toWeakSet",                () => expect(new EmptyCollectionHolderForTest().toWeakSet(),).toEqual(CollectionConstants.EMPTY_WEAK_SET,),)
        test("toMutableWeakWet",         () => expect(new EmptyCollectionHolderForTest().toMutableWeakSet(),).toEqual(new WeakSet(),),)
        test("toMutableWeakWet: frozen", () => expect(new EmptyCollectionHolderForTest().toMutableWeakSet(),).not.toBeFrozen(),)
        test("toMap",                    () => expect(new EmptyCollectionHolderForTest().toMap(),).toEqual(CollectionConstants.EMPTY_MAP,),)
        test("toMutableMap",             () => expect(new EmptyCollectionHolderForTest().toMutableMap(),).toEqual(new Map(),),)
        test("toMutableMap: frozen",     () => expect(new EmptyCollectionHolderForTest().toMutableMap(),).not.toBeFrozen(),)
        test("toWeakMap",                () => expect(new EmptyCollectionHolderForTest().toWeakMap(),).toEqual(CollectionConstants.EMPTY_WEAK_MAP,),)
        test("toMutableWeakMap",         () => expect(new EmptyCollectionHolderForTest().toMutableWeakMap(),).toEqual(new WeakMap(),),)
        test("toMutableWeakMap: frozen", () => expect(new EmptyCollectionHolderForTest().toMutableWeakMap(),).not.toBeFrozen(),)
        test("toString",                 () => expect(new EmptyCollectionHolderForTest().toString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleString",           () => expect(new EmptyCollectionHolderForTest().toLocaleString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLowerCaseString",        () => expect(new EmptyCollectionHolderForTest().toLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleLowerCaseString",  () => expect(new EmptyCollectionHolderForTest().toLocaleLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toUpperCaseString",        () => expect(new EmptyCollectionHolderForTest().toUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleUpperCaseString",  () => expect(new EmptyCollectionHolderForTest().toLocaleUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
    },)

    describe.each(everyCollectionInstancesAndExtensionFunctionAsCollectionHolder,)("%s", ({value: {instance,},},) => {
        test("toIterator: empty",                    () => expect(new instance(EMPTY,).toIterator(),).toEqual(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
        test("toIterator: 1 field",                  () => expect(new instance(A,).toIterator(),).toBeInstanceOf(GenericCollectionIterator,),)
        test("toIterator: 2 fields",                 () => expect(new instance(AB,).toIterator(),).toBeInstanceOf(GenericCollectionIterator,),)
        test("toIterator: 4 fields",                 () => expect(new instance(ABCD,).toIterator(),).toBeInstanceOf(GenericCollectionIterator,),)

        test("toArray: empty",                       () => expect(new instance(EMPTY,).toArray(),).toEqual(CollectionConstants.EMPTY_ARRAY,),)
        test("toArray: 1 field",                     () => expect(new instance(A,).toArray(),).toEqual(A,),)
        test("toArray: 2 unique fields",             () => expect(new instance(AB,).toArray(),).toEqual(AB,),)
        test("toArray: 2 duplicated fields",         () => expect(new instance(AA,).toArray(),).toEqual(AA,),)
        test("toArray: 4 unique fields",             () => expect(new instance(ABCD,).toArray(),).toEqual(ABCD,),)
        test("toArray: 4 duplicating fields",        () => expect(new instance(ABAB,).toArray(),).toEqual(ABAB,),)
        test("toArray: frozen",                      () => expect(new instance(ABAB,).toArray(),).toBeFrozen(),)
        test("toMutableArray: empty",                () => expect(new instance(EMPTY,).toMutableArray(),).toEqual([],),)
        test("toMutableArray: 1 field",              () => expect(new instance(A,).toMutableArray(),).toEqual(A,),)
        test("toMutableArray: 2 unique fields",      () => expect(new instance(AB,).toMutableArray(),).toEqual(AB,),)
        test("toMutableArray: 2 duplicated fields",  () => expect(new instance(AA,).toMutableArray(),).toEqual(AA,),)
        test("toMutableArray: 4 unique fields",      () => expect(new instance(ABCD,).toMutableArray(),).toEqual(ABCD,),)
        test("toMutableArray: 4 duplicating fields", () => expect(new instance(ABAB,).toMutableArray(),).toEqual(ABAB,),)
        test("toMutableArray: frozen",               () => expect(new instance(ABAB,).toMutableArray(),).not.toBeFrozen(),)

        test("toSet: empty",                         () => expect(new instance(EMPTY,).toSet(),).toEqual(CollectionConstants.EMPTY_SET,),)
        test("toSet: 1 field",                       () => expect(new instance(A,).toSet(),).toEqual(new Set(A,),),)
        test("toSet: 2 unique fields",               () => expect(new instance(AB,).toSet(),).toEqual(new Set(AB,),),)
        test("toSet: 2 duplicated fields",           () => expect(new instance(AA,).toSet(),).toEqual(new Set(A,),),)
        test("toSet: 4 unique fields",               () => expect(new instance(ABCD,).toSet(),).toEqual(new Set(ABCD,),),)
        test("toSet: 4 duplicating fields",          () => expect(new instance(ABAB,).toSet(),).toEqual(new Set(AB,),),)
        test("toSet: frozen",                        () => expect(new instance(ABAB,).toSet(),).toBeFrozen(),)
        test("toMutableSet: empty",                  () => expect(new instance(EMPTY,).toMutableSet(),).toEqual(new Set(),),)
        test("toMutableSet: 1 field",                () => expect(new instance(A,).toMutableSet(),).toEqual(new Set(A,),),)
        test("toMutableSet: 2 unique fields",        () => expect(new instance(AB,).toMutableSet(),).toEqual(new Set(AB,),),)
        test("toMutableSet: 2 duplicated fields",    () => expect(new instance(AA,).toMutableSet(),).toEqual(new Set(A,),),)
        test("toMutableSet: 4 unique fields",        () => expect(new instance(ABCD,).toMutableSet(),).toEqual(new Set(ABCD,),),)
        test("toMutableSet: 4 duplicating fields",   () => expect(new instance(ABAB,).toMutableSet(),).toEqual(new Set(AB,),),)
        test("toMutableSet: frozen",                 () => expect(new instance(ABAB,).toMutableSet(),).not.toBeFrozen(),)

        test("toMap: empty",                         () => expect(new instance(EMPTY,).toMap(),).toEqual(CollectionConstants.EMPTY_MAP,),)
        test("toMap: 1 field",                       () => expect(new instance(A,).toMap(),).toEqual(new Map([[0, 'a',],],),),)
        test("toMap: 2 unique fields",               () => expect(new instance(AB,).toMap(),).toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
        test("toMap: 2 duplicated fields",           () => expect(new instance(AA,).toMap(),).toEqual(new Map([[0, 'a',], [1, 'a',],],),),)
        test("toMap: 4 unique fields",               () => expect(new instance(ABCD,).toMap(),).toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'c',], [3, 'd',],],),),)
        test("toMap: 4 duplicating fields",          () => expect(new instance(ABAB,).toMap(),).toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'a',], [3, 'b',],],),),)
        test("toMap: frozen",                        () => expect(new instance(ABAB,).toMap(),).toBeFrozen(),)
        test("toMutableMap: empty",                  () => expect(new instance(EMPTY,).toMutableMap(),).toEqual(new Map(),),)
        test("toMutableMap: 1 field",                () => expect(new instance(A,).toMutableMap(),).toEqual(new Map([[0, 'a',],],),),)
        test("toMutableMap: 2 unique fields",        () => expect(new instance(AB,).toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
        test("toMutableMap: 2 duplicated fields",    () => expect(new instance(AA,).toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'a',],],),),)
        test("toMutableMap: 4 unique fields",        () => expect(new instance(ABCD,).toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'c',], [3, 'd',],],),),)
        test("toMutableMap: 4 duplicating fields",   () => expect(new instance(ABAB,).toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'a',], [3, 'b',],],),),)
        test("toMutableMap: frozen",                 () => expect(new instance(ABAB,).toMutableMap(),).not.toBeFrozen(),)

        test("toString: empty",                      () => expect(new instance(EMPTY,).toString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toString: 1 field",                    () => expect(new instance(A,).toString(),).toBe("[a]",),)
        test("toString: 2 fields",                   () => expect(new instance(A_A,).toString(),).toBe("[a, A]",),)
        test("toString: 4 fields",                   () => expect(new instance(AB_AB,).toString(),).toBe("[a, b, A, B]",),)
        test("toLocaleString: empty",                () => expect(new instance(EMPTY,).toLocaleString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleString: 1 field",              () => expect(new instance(A,).toLocaleString(),).toBe("[a]",),)
        test("toLocaleString: 2 fields",             () => expect(new instance(A_A,).toLocaleString(),).toBe("[a, A]",),)
        test("toLocaleString: 4 fields",             () => expect(new instance(AB_AB,).toLocaleString(),).toBe("[a, b, A, B]",),)
        test("toLowerCaseString: empty",             () => expect(new instance(EMPTY,).toLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLowerCaseString: 1 field",           () => expect(new instance(A,).toLowerCaseString(),).toBe("[a]",),)
        test("toLowerCaseString: 2 fields",          () => expect(new instance(A_A,).toLowerCaseString(),).toBe("[a, a]",),)
        test("toLowerCaseString: 4 fields",          () => expect(new instance(AB_AB,).toLowerCaseString(),).toBe("[a, b, a, b]",),)
        test("toLocaleLowerCaseString: empty",       () => expect(new instance(EMPTY,).toLocaleLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleLowerCaseString: 1 field",     () => expect(new instance(A,).toLocaleLowerCaseString(),).toBe("[a]",),)
        test("toLocaleLowerCaseString: 2 fields",    () => expect(new instance(A_A,).toLocaleLowerCaseString(),).toBe("[a, a]",),)
        test("toLocaleLowerCaseString: 4 fields",    () => expect(new instance(AB_AB,).toLocaleLowerCaseString(),).toBe("[a, b, a, b]",),)
        test("toUpperCaseString: empty",             () => expect(new instance(EMPTY,).toUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toUpperCaseString: 1 field",           () => expect(new instance(A,).toUpperCaseString(),).toBe("[A]",),)
        test("toUpperCaseString: 2 fields",          () => expect(new instance(A_A,).toUpperCaseString(),).toBe("[A, A]",),)
        test("toUpperCaseString: 4 fields",          () => expect(new instance(AB_AB,).toUpperCaseString(),).toBe("[A, B, A, B]",),)
        test("toLocaleUpperCaseString: empty",       () => expect(new instance(EMPTY,).toLocaleUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleUpperCaseString: 1 field",     () => expect(new instance(A,).toLocaleUpperCaseString(),).toBe("[A]",),)
        test("toLocaleUpperCaseString: 2 fields",    () => expect(new instance(A_A,).toLocaleUpperCaseString(),).toBe("[A, A]",),)
        test("toLocaleUpperCaseString: 4 fields",    () => expect(new instance(AB_AB,).toLocaleUpperCaseString(),).toBe("[A, B, A, B]",),)
    },)

},)
