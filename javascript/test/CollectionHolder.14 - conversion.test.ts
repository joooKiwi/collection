/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AAB, AAB_AAB, AAB_OBJECT, AB, AB_AB, AB_OBJECT, EMPTY, SINGULAR_A_OBJECT, SINGULAR_B_OBJECT} from "./constantCollections"
import {everyInstance}                                                                               from "./constantValues"

import {CollectionConstants}       from "../src/CollectionConstants"
import {GenericCollectionIterator} from "../src/iterator/GenericCollectionIterator"

describe("CollectionHolderTest (conversion)", () => {
describe.each(everyInstance,)("%s", ({value: {newInstance, isMinimalist,},},) => {
    describe("to iterator", () => {
        test("empty",     () => expect(newInstance(EMPTY,).toIterator(),).toBe(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
        test("non-empty", () => expect(newInstance(AB,).toIterator(),).toBeInstanceOf(GenericCollectionIterator,),)
    })

    describe("to array", () => {
        test("empty",     () => expect(newInstance(EMPTY,).toArray(),).toBe(CollectionConstants.EMPTY_ARRAY,),)
        test("basic",     () => expect(newInstance(AB,).toArray(),).toEqual(['a', 'b',],),)
        test("duplicate", () => expect(newInstance(AAB,).toArray(),).toEqual(['a', 'a', 'b',],),)
        test("frozen",    () => expect(newInstance(AB,).toArray(),).toBeFrozen(),)
        test("size",      () => expect(newInstance(AB,).toArray(),).toHaveLength(2,),)
    },)
    describe("to mutable array", () => {
        test("empty",     () => expect(newInstance(EMPTY,).toMutableArray(),).toEqual([],),)
        test("basic",     () => expect(newInstance(AB,).toMutableArray(),).toEqual(['a', 'b',],),)
        test("duplicate", () => expect(newInstance(AAB,).toMutableArray(),).toEqual(['a', 'a', 'b',],),)
        test("frozen",    () => expect(newInstance(AB,).toMutableArray(),).not.toBeFrozen(),)
        test("size",      () => expect(newInstance(AB,).toMutableArray(),).toHaveLength(2,),)
    },)

    describe("to set", () => {
        test("empty",     () => expect(newInstance(EMPTY,).toSet(),).toBe(CollectionConstants.EMPTY_SET,),)
        test("basic",     () => expect(newInstance(AB,).toSet(),).toEqual(new Set(['a', 'b',],),),)
        test("duplicate", () => expect(newInstance(AAB,).toSet(),).toEqual(new Set(['a', 'b',],),),)
        test("frozen",    () => expect(newInstance(AB,).toSet(),).toBeFrozen(),)
        test("size",      () => expect(newInstance(AB,).toSet().size,).toBe(2,),)
    },)
    describe("to mutable set", () => {
        test("empty",     () => expect(newInstance(EMPTY,).toMutableSet(),).toEqual(new Set(),),)
        test("basic",     () => expect(newInstance(AB,).toMutableSet(),).toEqual(new Set(['a', 'b',],),),)
        test("duplicate", () => expect(newInstance(AAB,).toMutableSet(),).toEqual(new Set(['a', 'b',],),),)
        test("frozen",    () => expect(newInstance(AB,).toMutableSet(),).not.toBeFrozen(),)
        test("size",      () => expect(newInstance(AB,).toMutableSet().size,).toBe(2,),)
    },)

    describe("object values map", () => {
        test("empty",     () => expect(newInstance(EMPTY,).objectValuesMap,).toBe(CollectionConstants.EMPTY_MAP,),)
        test("basic",     () => {
            const map = newInstance(AB,).objectValuesMap
            expect(map,).toEqual(new Map(AB.map(it => [it, map.get(it,),],)),)
        },)
        test("duplicate", () => {
            const map = newInstance(AAB,).objectValuesMap
            expect(map,).toEqual(new Map(AAB.map(it => [it, map.get(it,),],)),)
        },)
        test("frozen",    () => expect(newInstance(AB,).objectValuesMap,).toBeFrozen(),)
    },)

    if (!isMinimalist) {
        describe("to weak set", () => {
            test("empty",     () => expect(newInstance(EMPTY,).toWeakSet(),).toBe(CollectionConstants.EMPTY_WEAK_SET,),)
            test("basic",     () => expect(newInstance(AB_OBJECT,).toWeakSet(),).toEqual(new WeakSet([SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,],),),)
            test("duplicate", () => expect(newInstance(AAB_OBJECT,).toWeakSet(),).toEqual(new WeakSet([SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,],),),)
            test("frozen",    () => expect(newInstance(AB,).toWeakSet(),).toBeFrozen(),)
        },)
        describe("to mutable weak set", () => {
            test("empty",     () => expect(newInstance(EMPTY,).toMutableWeakSet(),).toEqual(new WeakSet(),),)
            test("basic",     () => expect(newInstance(AB_OBJECT,).toMutableWeakSet(),).toEqual(new WeakSet([SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,],),),)
            test("duplicate", () => expect(newInstance(AAB_OBJECT,).toMutableWeakSet(),).toEqual(new WeakSet([SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,],),),)
            test("frozen",    () => expect(newInstance(AB,).toMutableWeakSet(),).not.toBeFrozen(),)
        },)
    }

    describe("to map", () => {
        test("empty",     () => expect(newInstance(EMPTY,).toMap(),).toBe(CollectionConstants.EMPTY_MAP,),)
        test("basic",     () => expect(newInstance(AB,).toMap(),).toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
        test("duplicate", () => expect(newInstance(AAB,).toMap(),).toEqual(new Map([[0, 'a',], [1, 'a',], [2, 'b',],],),),)
        test("frozen",    () => expect(newInstance(AB,).toMap(),).toBeFrozen(),)
        test("size",      () => expect(newInstance(AB,).toMap().size,).toBe(2,),)
    },)
    describe("to mutable map", () => {
        test("empty",     () => expect(newInstance(EMPTY,).toMutableMap(),).toEqual(new Map(),),)
        test("basic",     () => expect(newInstance(AB,).toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
        test("duplicate", () => expect(newInstance(AAB,).toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'a',], [2, 'b',],],),),)
        test("frozen",    () => expect(newInstance(AB,).toMutableMap(),).not.toBeFrozen(),)
        test("size",      () => expect(newInstance(AB,).toMutableMap().size,).toBe(2,),)
    },)

    describe("to string", () => {
        test("empty",     () => expect(newInstance(EMPTY,).toString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("basic",     () => expect(newInstance(AB,).toString(),).toBe("[a, b]"),)
        test("duplicate", () => expect(newInstance(AAB,).toString(),).toBe("[a, a, b]"),)
    },)
    describe("to locale string", () => {
        test("empty",        () => expect(newInstance(EMPTY,).toLocaleString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("no arguments", () => expect(newInstance(AB,).toLocaleString(),).toBe("[a, b]"),)
        test("duplicate",    () => expect(newInstance(AAB,).toLocaleString(),).toBe("[a, a, b]"),)
    },)
    describe("to lower case string", () => {
        test("empty",     () => expect(newInstance(EMPTY,).toLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("basic",     () => expect(newInstance(AB_AB,).toLowerCaseString(),).toBe("[a, b, a, b]"),)
        test("duplicate", () => expect(newInstance(AAB_AAB,).toLowerCaseString(),).toBe("[a, a, b, a, a, b]"),)
    },)
    describe("to locale lower case string", () => {
        test("empty",        () => expect(newInstance(EMPTY,).toLocaleLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("no arguments", () => expect(newInstance(AB_AB,).toLocaleLowerCaseString(),).toBe("[a, b, a, b]"),)
        test("duplicate",    () => expect(newInstance(AAB_AAB,).toLocaleLowerCaseString(),).toBe("[a, a, b, a, a, b]"),)
    },)
    describe("to upper case string", () => {
        test("empty",     () => expect(newInstance(EMPTY,).toUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("basic",     () => expect(newInstance(AB_AB,).toUpperCaseString(),).toBe("[A, B, A, B]"),)
        test("duplicate", () => expect(newInstance(AAB_AAB,).toUpperCaseString(),).toBe("[A, A, B, A, A, B]"),)
    },)
    describe("to locale upper case string", () => {
        test("empty",        () => expect(newInstance(EMPTY,).toLocaleUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("no arguments", () => expect(newInstance(AB_AB,).toLocaleUpperCaseString(),).toBe("[A, B, A, B]"),)
        test("duplicate",    () => expect(newInstance(AAB_AAB,).toLocaleUpperCaseString(),).toBe("[A, A, B, A, A, B]"),)
    },)
},)},)
