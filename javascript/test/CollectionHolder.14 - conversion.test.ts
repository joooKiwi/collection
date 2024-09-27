/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {EmptyCollectionHolderForTest}               from "./instance/EmptyCollectionHolderForTest"
import {everyCollectionInstancesAsCollectionHolder} from "./value/instances"
import {A, A_A, AA, AB, AB_AB, ABAB, ABCD, EMPTY}   from "./value/arrays"

import {CollectionConstants}       from "../src/CollectionConstants"
import {GenericCollectionIterator} from "../src/iterator/GenericCollectionIterator"

describe("CollectionHolderTest (conversion)", () => {

    describe("EmptyCollectionHolder", () => {
        test("to iterator",                 () => expect(new EmptyCollectionHolderForTest().toIterator(),).toEqual(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
        test("to array",                    () => expect(new EmptyCollectionHolderForTest().toArray(),).toEqual(CollectionConstants.EMPTY_ARRAY,),)
        test("to mutable array",            () => expect(new EmptyCollectionHolderForTest().toMutableArray(),).toEqual([],),)
        test("to mutable array: frozen",    () => expect(new EmptyCollectionHolderForTest().toMutableArray(),).not.toBeFrozen(),)
        test("to set",                      () => expect(new EmptyCollectionHolderForTest().toSet(),).toEqual(CollectionConstants.EMPTY_SET,),)
        test("to mutable set",              () => expect(new EmptyCollectionHolderForTest().toMutableSet(),).toEqual(new Set(),),)
        test("to mutable set: frozen",      () => expect(new EmptyCollectionHolderForTest().toMutableSet(),).not.toBeFrozen(),)
        test("to weak set",                 () => expect(new EmptyCollectionHolderForTest().toWeakSet(),).toEqual(CollectionConstants.EMPTY_WEAK_SET,),)
        test("to mutable weak set",         () => expect(new EmptyCollectionHolderForTest().toMutableWeakSet(),).toEqual(new WeakSet(),),)
        test("to mutable weak set: frozen", () => expect(new EmptyCollectionHolderForTest().toMutableWeakSet(),).not.toBeFrozen(),)
        test("to map",                      () => expect(new EmptyCollectionHolderForTest().toMap(),).toEqual(CollectionConstants.EMPTY_MAP,),)
        test("to mutable map",              () => expect(new EmptyCollectionHolderForTest().toMutableMap(),).toEqual(new Map(),),)
        test("to mutable map: frozen",      () => expect(new EmptyCollectionHolderForTest().toMutableMap(),).not.toBeFrozen(),)
        test("to weak map",                 () => expect(new EmptyCollectionHolderForTest().toWeakMap(),).toEqual(CollectionConstants.EMPTY_WEAK_MAP,),)
        test("to mutable weak map",         () => expect(new EmptyCollectionHolderForTest().toMutableWeakMap(),).toEqual(new WeakMap(),),)
        test("to mutable weak map: frozen", () => expect(new EmptyCollectionHolderForTest().toMutableWeakMap(),).not.toBeFrozen(),)
        test("to string",                   () => expect(new EmptyCollectionHolderForTest().toString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("to locale string",            () => expect(new EmptyCollectionHolderForTest().toLocaleString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("to lower case string",        () => expect(new EmptyCollectionHolderForTest().toLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("to locale lower case string", () => expect(new EmptyCollectionHolderForTest().toLocaleLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("to upper case string",        () => expect(new EmptyCollectionHolderForTest().toUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("to locale upper case string", () => expect(new EmptyCollectionHolderForTest().toLocaleUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
    },)

    describe.each(everyCollectionInstancesAsCollectionHolder,)("%s", ({value: {instance,},},) => {
        test("to iterator: empty",                     () => expect(new instance(EMPTY,).toIterator(),).toEqual(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
        test("to iterator: 1 field",                   () => expect(new instance(A,).toIterator(),).toBeInstanceOf(GenericCollectionIterator,),)
        test("to iterator: 2 fields",                  () => expect(new instance(AB,).toIterator(),).toBeInstanceOf(GenericCollectionIterator,),)
        test("to iterator: 4 fields",                  () => expect(new instance(ABCD,).toIterator(),).toBeInstanceOf(GenericCollectionIterator,),)

        test("to array: empty",                        () => expect(new instance(EMPTY,).toArray(),).toEqual(CollectionConstants.EMPTY_ARRAY,),)
        test("to array: 1 field",                      () => expect(new instance(A,).toArray(),).toEqual(A,),)
        test("to array: 2 unique fields",              () => expect(new instance(AB,).toArray(),).toEqual(AB,),)
        test("to array: 2 duplicated fields",          () => expect(new instance(AA,).toArray(),).toEqual(AA,),)
        test("to array: 4 unique fields",              () => expect(new instance(ABCD,).toArray(),).toEqual(ABCD,),)
        test("to array: 4 duplicating fields",         () => expect(new instance(ABAB,).toArray(),).toEqual(ABAB,),)
        test("to array: frozen",                       () => expect(new instance(ABAB,).toArray(),).toBeFrozen(),)
        test("to mutable array: empty",                () => expect(new instance(EMPTY,).toMutableArray(),).toEqual([],),)
        test("to mutable array: 1 field",              () => expect(new instance(A,).toMutableArray(),).toEqual(A,),)
        test("to mutable array: 2 unique fields",      () => expect(new instance(AB,).toMutableArray(),).toEqual(AB,),)
        test("to mutable array: 2 duplicated fields",  () => expect(new instance(AA,).toMutableArray(),).toEqual(AA,),)
        test("to mutable array: 4 unique fields",      () => expect(new instance(ABCD,).toMutableArray(),).toEqual(ABCD,),)
        test("to mutable array: 4 duplicating fields", () => expect(new instance(ABAB,).toMutableArray(),).toEqual(ABAB,),)
        test("to mutable array: frozen",               () => expect(new instance(ABAB,).toMutableArray(),).not.toBeFrozen(),)

        test("to set: empty",                          () => expect(new instance(EMPTY,).toSet(),).toEqual(CollectionConstants.EMPTY_SET,),)
        test("to set: 1 field",                        () => expect(new instance(A,).toSet(),).toEqual(new Set(A,),),)
        test("to set: 2 unique fields",                () => expect(new instance(AB,).toSet(),).toEqual(new Set(AB,),),)
        test("to set: 2 duplicated fields",            () => expect(new instance(AA,).toSet(),).toEqual(new Set(A,),),)
        test("to set: 4 unique fields",                () => expect(new instance(ABCD,).toSet(),).toEqual(new Set(ABCD,),),)
        test("to set: 4 duplicating fields",           () => expect(new instance(ABAB,).toSet(),).toEqual(new Set(AB,),),)
        test("to set: frozen",                         () => expect(new instance(ABAB,).toSet(),).toBeFrozen(),)
        test("to mutable set: empty",                  () => expect(new instance(EMPTY,).toMutableSet(),).toEqual(new Set(),),)
        test("to mutable set: 1 field",                () => expect(new instance(A,).toMutableSet(),).toEqual(new Set(A,),),)
        test("to mutable set: 2 unique fields",        () => expect(new instance(AB,).toMutableSet(),).toEqual(new Set(AB,),),)
        test("to mutable set: 2 duplicated fields",    () => expect(new instance(AA,).toMutableSet(),).toEqual(new Set(A,),),)
        test("to mutable set: 4 unique fields",        () => expect(new instance(ABCD,).toMutableSet(),).toEqual(new Set(ABCD,),),)
        test("to mutable set: 4 duplicating fields",   () => expect(new instance(ABAB,).toMutableSet(),).toEqual(new Set(AB,),),)
        test("to mutable set: frozen",                 () => expect(new instance(ABAB,).toMutableSet(),).not.toBeFrozen(),)

        test("to map: empty",                          () => expect(new instance(EMPTY,).toMap(),).toEqual(CollectionConstants.EMPTY_MAP,),)
        test("to map: 1 field",                        () => expect(new instance(A,).toMap(),).toEqual(new Map([[0, 'a',],],),),)
        test("to map: 2 unique fields",                () => expect(new instance(AB,).toMap(),).toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
        test("to map: 2 duplicated fields",            () => expect(new instance(AA,).toMap(),).toEqual(new Map([[0, 'a',], [1, 'a',],],),),)
        test("to map: 4 unique fields",                () => expect(new instance(ABCD,).toMap(),).toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'c',], [3, 'd',],],),),)
        test("to map: 4 duplicating fields",           () => expect(new instance(ABAB,).toMap(),).toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'a',], [3, 'b',],],),),)
        test("to map: frozen",                         () => expect(new instance(ABAB,).toMap(),).toBeFrozen(),)
        test("to mutable map: empty",                  () => expect(new instance(EMPTY,).toMutableMap(),).toEqual(new Map(),),)
        test("to mutable map: 1 field",                () => expect(new instance(A,).toMutableMap(),).toEqual(new Map([[0, 'a',],],),),)
        test("to mutable map: 2 unique fields",        () => expect(new instance(AB,).toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
        test("to mutable map: 2 duplicated fields",    () => expect(new instance(AA,).toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'a',],],),),)
        test("to mutable map: 4 unique fields",        () => expect(new instance(ABCD,).toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'c',], [3, 'd',],],),),)
        test("to mutable map: 4 duplicating fields",   () => expect(new instance(ABAB,).toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'a',], [3, 'b',],],),),)
        test("to mutable map: frozen",                 () => expect(new instance(ABAB,).toMutableMap(),).not.toBeFrozen(),)

        test("to string: empty",                       () => expect(new instance(EMPTY,).toString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("to string: 1 field",                     () => expect(new instance(A,).toString(),).toBe("[a]",),)
        test("to string: 2 fields",                    () => expect(new instance(A_A,).toString(),).toBe("[a, A]",),)
        test("to string: 4 fields",                    () => expect(new instance(AB_AB,).toString(),).toBe("[a, b, A, B]",),)
        test("to locale string: empty",                () => expect(new instance(EMPTY,).toLocaleString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("to locale string: 1 field",              () => expect(new instance(A,).toLocaleString(),).toBe("[a]",),)
        test("to locale string: 2 fields",             () => expect(new instance(A_A,).toLocaleString(),).toBe("[a, A]",),)
        test("to locale string: 4 fields",             () => expect(new instance(AB_AB,).toLocaleString(),).toBe("[a, b, A, B]",),)
        test("to lower case string: empty",            () => expect(new instance(EMPTY,).toLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("to lower case string: 1 field",          () => expect(new instance(A,).toLowerCaseString(),).toBe("[a]",),)
        test("to lower case string: 2 fields",         () => expect(new instance(A_A,).toLowerCaseString(),).toBe("[a, a]",),)
        test("to lower case string: 4 fields",         () => expect(new instance(AB_AB,).toLowerCaseString(),).toBe("[a, b, a, b]",),)
        test("to locale lower case string: empty",     () => expect(new instance(EMPTY,).toLocaleLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("to locale lower case string: 1 field",   () => expect(new instance(A,).toLocaleLowerCaseString(),).toBe("[a]",),)
        test("to locale lower case string: 2 fields",  () => expect(new instance(A_A,).toLocaleLowerCaseString(),).toBe("[a, a]",),)
        test("to locale lower case string: 4 fields",  () => expect(new instance(AB_AB,).toLocaleLowerCaseString(),).toBe("[a, b, a, b]",),)
        test("to upper case string: empty",            () => expect(new instance(EMPTY,).toUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("to upper case string: 1 field",          () => expect(new instance(A,).toUpperCaseString(),).toBe("[A]",),)
        test("to upper case string: 2 fields",         () => expect(new instance(A_A,).toUpperCaseString(),).toBe("[A, A]",),)
        test("to upper case string: 4 fields",         () => expect(new instance(AB_AB,).toUpperCaseString(),).toBe("[A, B, A, B]",),)
        test("to locale upper case string: empty",     () => expect(new instance(EMPTY,).toLocaleUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("to locale upper case string: 1 field",   () => expect(new instance(A,).toLocaleUpperCaseString(),).toBe("[A]",),)
        test("to locale upper case string: 2 fields",  () => expect(new instance(A_A,).toLocaleUpperCaseString(),).toBe("[A, A]",),)
        test("to locale upper case string: 4 fields",  () => expect(new instance(AB_AB,).toLocaleUpperCaseString(),).toBe("[A, B, A, B]",),)
    },)

},)
