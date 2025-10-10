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

import {expectToBeInstance}                                                                                                                                                                        from "./expect/expectToBeInstance"
import {EmptyCollectionHolderForTest}                                                                                                                                                              from "./instance/EmptyCollectionHolderForTest"
import {A, A_NULL, A_NULL_C_NULL, AB, ABCD, AC, B, BD, EMPTY, NULL, NULL_B, NULL_B_NULL_D, NULL_UNDEFINED, NULL_x2, NULL_x4, UNDEFINED, UNDEFINED_x2, UNDEFINED_x4, UPPER_E, UPPER_EE, UPPER_EEEE} from "./value/arrays"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                                                                                         from "./value/callbacks (fail)"
import {callbackAsNull0, callbackAsUndefined0, callbackOnlyIfEven, callbackOnlyIfEvenAlt, callbackOnlyIfOdd, callbackOnlyIfOddAlt}                                                                 from "./value/callbacks (null)"
import {callbackAsString0, callbackAsString1, callbackAsString2, callbackToString0}                                                                                                                from "./value/callbacks (string)"
import {everyCollectionInstances}                                                                                                                                                                  from "./value/instances"

import {CollectionConstants}                                                                                                             from "../src/CollectionConstants"
import {map, mapByArray, mapByCollectionHolder, mapByMinimalistCollectionHolder}                                                         from "../src/method/map"
import {mapIndexed, mapIndexedByArray, mapIndexedByCollectionHolder, mapIndexedByMinimalistCollectionHolder}                             from "../src/method/mapIndexed"
import {mapNotNull, mapNotNullByArray, mapNotNullByCollectionHolder, mapNotNullByMinimalistCollectionHolder}                             from "../src/method/mapNotNull"
import {mapNotNullIndexed, mapNotNullIndexedByArray, mapNotNullIndexedByCollectionHolder, mapNotNullIndexedByMinimalistCollectionHolder} from "../src/method/mapNotNullIndexed"

describe("CollectionHolderTest (map)", () => {

    describe("EmptyCollectionHolder", () => {
        test("map",                 () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.map(),),)
        test("mapIndexed",          () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.mapIndexed(),),)
        test("mapNotNull",          () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.mapNotNull(),),)
        test("mapNotNullIndexed",   () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.mapNotNullIndexed(),),)
    },)

    describe.each(NULL_UNDEFINED,)("%s", it => {
        describe("map", () => {
            test("all",                          () => expect(map(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(mapByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(mapByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(mapByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("mapIndexed", () => {
            test("all",                          () => expect(mapIndexed(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(mapIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(mapIndexedByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(mapIndexedByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)

        describe("mapNotNull", () => {
            test("all",                          () => expect(mapNotNull(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(mapNotNullByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(mapNotNullByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(mapNotNullByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("mapNotNullIndexed", () => {
            test("all",                          () => expect(mapNotNullIndexed(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(mapNotNullIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(mapNotNullIndexedByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(mapNotNullIndexedByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
    },)

    describe.each(everyCollectionInstances,)("%s", ({value: {instance, isExtension,},},) => {
        if (!isExtension)
            describe("get() being called", () => {
                describe("map", () => {
                    test("empty: 0 arguments",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.map(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                    test("empty: 1 argument",     () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.map(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                    test("empty: 2 arguments",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.map(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    test("1 field: 0 arguments",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.map(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("1 field: 1 argument",   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.map(callbackAsString1,),).amountOfCall,).toBe(1,),)
                    test("1 field: 2 arguments",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.map(callbackAsString2,),).amountOfCall,).toBe(1,),)
                    test("2 fields: 0 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.map(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("2 fields: 1 argument",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.map(callbackAsString1,),).amountOfCall,).toBe(2,),)
                    test("2 fields: 2 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.map(callbackAsString2,),).amountOfCall,).toBe(2,),)
                    test("4 fields: 0 arguments", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.map(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("4 fields: 1 argument",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.map(callbackAsString1,),).amountOfCall,).toBe(4,),)
                    test("4 fields: 2 arguments", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.map(callbackAsString2,),).amountOfCall,).toBe(4,),)
                },)
                describe("mapIndexed", () => {
                    test("empty: 0 arguments",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                    test("empty: 1 argument",     () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                    test("empty: 2 arguments",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    test("1 field: 0 arguments",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("1 field: 1 argument",   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                    test("1 field: 2 arguments",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString2,),).amountOfCall,).toBe(1,),)
                    test("2 fields: 0 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("2 fields: 1 argument",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                    test("2 fields: 2 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString2,),).amountOfCall,).toBe(2,),)
                    test("4 fields: 0 arguments", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("4 fields: 1 argument",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                    test("4 fields: 2 arguments", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString2,),).amountOfCall,).toBe(4,),)
                },)
                describe("mapNotNull", () => {
                    test("empty: 0 arguments",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                    test("empty: 1 argument",     () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                    test("empty: 2 arguments",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    test("1 field: 0 arguments",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("1 field: 1 argument",   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString1,),).amountOfCall,).toBe(1,),)
                    test("1 field: 2 arguments",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString2,),).amountOfCall,).toBe(1,),)
                    test("2 fields: 0 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("2 fields: 1 argument",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString1,),).amountOfCall,).toBe(2,),)
                    test("2 fields: 2 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString2,),).amountOfCall,).toBe(2,),)
                    test("4 fields: 0 arguments", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("4 fields: 1 argument",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString1,),).amountOfCall,).toBe(4,),)
                    test("4 fields: 2 arguments", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString2,),).amountOfCall,).toBe(4,),)
                },)
                describe("mapNotNullIndexed", () => {
                    test("empty: 0 arguments",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                    test("empty: 1 argument",     () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                    test("empty: 2 arguments",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    test("1 field: 0 arguments",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("1 field: 1 argument",   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                    test("1 field: 2 arguments",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString2,),).amountOfCall,).toBe(1,),)
                    test("2 fields: 0 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("2 fields: 1 argument",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                    test("2 fields: 2 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString2,),).amountOfCall,).toBe(2,),)
                    test("4 fields: 0 arguments", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("4 fields: 1 argument",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                    test("4 fields: 2 arguments", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString2,),).amountOfCall,).toBe(4,),)
                },)
            },)

        describe("map", () => {
            test("empty",               () => expect(new instance(EMPTY,).map(callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("1 field: value",      () => expect(new instance(A,).map(callbackToString0,).toArray(),).toEqual(UPPER_E,),)
            test("1 field: null",       () => expect(new instance(A,).map(callbackAsNull0,).toArray(),).toEqual(NULL,),)
            test("1 field: undefined",  () => expect(new instance(A,).map(callbackAsUndefined0,).toArray(),).toEqual(UNDEFINED,),)
            test("1 field: even",       () => expect(new instance(A,).map(callbackOnlyIfEven,).toArray(),).toEqual(A,),)
            test("1 field: odd",        () => expect(new instance(A,).map(callbackOnlyIfOdd,).toArray(),).toEqual(NULL,),)
            test("2 fields: value",     () => expect(new instance(AB,).map(callbackToString0,).toArray(),).toEqual(UPPER_EE,),)
            test("2 fields: null",      () => expect(new instance(AB,).map(callbackAsNull0,).toArray(),).toEqual(NULL_x2,),)
            test("2 fields: undefined", () => expect(new instance(AB,).map(callbackAsUndefined0,).toArray(),).toEqual(UNDEFINED_x2,),)
            test("2 fields: even",      () => expect(new instance(AB,).map(callbackOnlyIfEven,).toArray(),).toEqual(A_NULL,),)
            test("2 fields: odd",       () => expect(new instance(AB,).map(callbackOnlyIfOdd,).toArray(),).toEqual(NULL_B,),)
            test("4 fields: value",     () => expect(new instance(ABCD,).map(callbackToString0,).toArray(),).toEqual(UPPER_EEEE,),)
            test("4 fields: null",      () => expect(new instance(ABCD,).map(callbackAsNull0,).toArray(),).toEqual(NULL_x4,),)
            test("4 fields: undefined", () => expect(new instance(ABCD,).map(callbackAsUndefined0,).toArray(),).toEqual(UNDEFINED_x4,),)
            test("4 fields: even",      () => expect(new instance(ABCD,).map(callbackOnlyIfEven,).toArray(),).toEqual(A_NULL_C_NULL,),)
            test("4 fields: odd",       () => expect(new instance(ABCD,).map(callbackOnlyIfOdd,).toArray(),).toEqual(NULL_B_NULL_D,),)
        },)
        describe("mapIndexed", () => {
            test("empty",               () => expect(new instance(EMPTY,).mapIndexed(callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("1 field: value",      () => expect(new instance(A,).mapIndexed(callbackToString0,).toArray(),).toEqual(UPPER_E,),)
            test("1 field: null",       () => expect(new instance(A,).mapIndexed(callbackAsNull0,).toArray(),).toEqual(NULL,),)
            test("1 field: undefined",  () => expect(new instance(A,).mapIndexed(callbackAsUndefined0,).toArray(),).toEqual(UNDEFINED,),)
            test("1 field: even",       () => expect(new instance(A,).mapIndexed(callbackOnlyIfEvenAlt,).toArray(),).toEqual(A,),)
            test("1 field: odd",        () => expect(new instance(A,).mapIndexed(callbackOnlyIfOddAlt,).toArray(),).toEqual(NULL,),)
            test("2 fields: value",     () => expect(new instance(AB,).mapIndexed(callbackToString0,).toArray(),).toEqual(UPPER_EE,),)
            test("2 fields: null",      () => expect(new instance(AB,).mapIndexed(callbackAsNull0,).toArray(),).toEqual(NULL_x2,),)
            test("2 fields: undefined", () => expect(new instance(AB,).mapIndexed(callbackAsUndefined0,).toArray(),).toEqual(UNDEFINED_x2,),)
            test("2 fields: even",      () => expect(new instance(AB,).mapIndexed(callbackOnlyIfEvenAlt,).toArray(),).toEqual(A_NULL,),)
            test("2 fields: odd",       () => expect(new instance(AB,).mapIndexed(callbackOnlyIfOddAlt,).toArray(),).toEqual(NULL_B,),)
            test("4 fields: value",     () => expect(new instance(ABCD,).mapIndexed(callbackToString0,).toArray(),).toEqual(UPPER_EEEE,),)
            test("4 fields: null",      () => expect(new instance(ABCD,).mapIndexed(callbackAsNull0,).toArray(),).toEqual(NULL_x4,),)
            test("4 fields: undefined", () => expect(new instance(ABCD,).mapIndexed(callbackAsUndefined0,).toArray(),).toEqual(UNDEFINED_x4,),)
            test("4 fields: even",      () => expect(new instance(ABCD,).mapIndexed(callbackOnlyIfEvenAlt,).toArray(),).toEqual(A_NULL_C_NULL,),)
            test("4 fields: odd",       () => expect(new instance(ABCD,).mapIndexed(callbackOnlyIfOddAlt,).toArray(),).toEqual(NULL_B_NULL_D,),)
        },)

        describe("mapNotNull", () => {
            test("empty",               () => expect(new instance(EMPTY,).mapNotNull(callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("1 field: value",      () => expect(new instance(A,).mapNotNull(callbackToString0,).toArray(),).toEqual(UPPER_E,),)
            test("1 field: null",       () => expect(new instance(A,).mapNotNull(callbackAsNull0,),).toBeEmpty(),)
            test("1 field: undefined",  () => expect(new instance(A,).mapNotNull(callbackAsUndefined0,),).toBeEmpty(),)
            test("1 field: even",       () => expect(new instance(A,).mapNotNull(callbackOnlyIfEven,).toArray(),).toEqual(A,),)
            test("1 field: odd",        () => expect(new instance(A,).mapNotNull(callbackOnlyIfOdd,),).toBeEmpty(),)
            test("2 fields: value",     () => expect(new instance(AB,).mapNotNull(callbackToString0,).toArray(),).toEqual(UPPER_EE,),)
            test("2 fields: null",      () => expect(new instance(AB,).mapNotNull(callbackAsNull0,),).toBeEmpty(),)
            test("2 fields: undefined", () => expect(new instance(AB,).mapNotNull(callbackAsUndefined0,),).toBeEmpty(),)
            test("2 fields: even",      () => expect(new instance(AB,).mapNotNull(callbackOnlyIfEven,).toArray(),).toEqual(A,),)
            test("2 fields: odd",       () => expect(new instance(AB,).mapNotNull(callbackOnlyIfOdd,).toArray(),).toEqual(B,),)
            test("4 fields: value",     () => expect(new instance(ABCD,).mapNotNull(callbackToString0,).toArray(),).toEqual(UPPER_EEEE,),)
            test("4 fields: null",      () => expect(new instance(ABCD,).mapNotNull(callbackAsNull0,),).toBeEmpty(),)
            test("4 fields: undefined", () => expect(new instance(ABCD,).mapNotNull(callbackAsUndefined0,),).toBeEmpty(),)
            test("4 fields: even",      () => expect(new instance(ABCD,).mapNotNull(callbackOnlyIfEven,).toArray(),).toEqual(AC,),)
            test("4 fields: odd",       () => expect(new instance(ABCD,).mapNotNull(callbackOnlyIfOdd,).toArray(),).toEqual(BD,),)
        },)
        describe("mapNotNullIndexed", () => {
            test("empty",               () => expect(new instance(EMPTY,).mapNotNullIndexed(callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("1 field: value",      () => expect(new instance(A,).mapNotNullIndexed(callbackToString0,).toArray(),).toEqual(UPPER_E,),)
            test("1 field: null",       () => expect(new instance(A,).mapNotNullIndexed(callbackAsNull0,),).toBeEmpty(),)
            test("1 field: undefined",  () => expect(new instance(A,).mapNotNullIndexed(callbackAsUndefined0,),).toBeEmpty(),)
            test("1 field: even",       () => expect(new instance(A,).mapNotNullIndexed(callbackOnlyIfEvenAlt,).toArray(),).toEqual(A,),)
            test("1 field: odd",        () => expect(new instance(A,).mapNotNullIndexed(callbackOnlyIfOddAlt,),).toBeEmpty(),)
            test("2 fields: value",     () => expect(new instance(AB,).mapNotNullIndexed(callbackToString0,).toArray(),).toEqual(UPPER_EE,),)
            test("2 fields: null",      () => expect(new instance(AB,).mapNotNullIndexed(callbackAsNull0,),).toBeEmpty(),)
            test("2 fields: undefined", () => expect(new instance(AB,).mapNotNullIndexed(callbackAsUndefined0,),).toBeEmpty(),)
            test("2 fields: even",      () => expect(new instance(AB,).mapNotNullIndexed(callbackOnlyIfEvenAlt,).toArray(),).toEqual(A,),)
            test("2 fields: odd",       () => expect(new instance(AB,).mapNotNullIndexed(callbackOnlyIfOddAlt,).toArray(),).toEqual(B,),)
            test("4 fields: value",     () => expect(new instance(ABCD,).mapNotNullIndexed(callbackToString0,).toArray(),).toEqual(UPPER_EEEE,),)
            test("4 fields: null",      () => expect(new instance(ABCD,).mapNotNullIndexed(callbackAsNull0,),).toBeEmpty(),)
            test("4 fields: undefined", () => expect(new instance(ABCD,).mapNotNullIndexed(callbackAsUndefined0,),).toBeEmpty(),)
            test("4 fields: even",      () => expect(new instance(ABCD,).mapNotNullIndexed(callbackOnlyIfEvenAlt,).toArray(),).toEqual(AC,),)
            test("4 fields: odd",       () => expect(new instance(ABCD,).mapNotNullIndexed(callbackOnlyIfOddAlt,).toArray(),).toEqual(BD,),)
        },)
    },)

},)
