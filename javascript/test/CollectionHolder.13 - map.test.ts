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

import {A, A_NULL, A_NULL_C_NULL, ABCD, AC, B, BD, NULL, NULL_B, NULL_B_NULL_D, NULL_x2, NULL_x4, UNDEFINED, UNDEFINED_x2, UNDEFINED_x4, UPPER_E, UPPER_EE, UPPER_EEEE} from "./value/arrays"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                                                              from "./value/callbacks (fail)"
import {callbackAsNull0, callbackAsUndefined0, callbackOnlyIfEven, callbackOnlyIfEvenAlt, callbackOnlyIfOdd, callbackOnlyIfOddAlt}                                      from "./value/callbacks (null)"
import {callbackAsString0, callbackAsString1, callbackAsString2, callbackToString0}                                                                                     from "./value/callbacks (string)"
import {emptyCollectionHolder, every0Instances, every1Instances, every2Instances, everyExtensionMethodInstances, everyNInstances}                                       from "./value/instances"

import {EmptyCollectionHolder} from "../src/EmptyCollectionHolder"

describe("CollectionHolderTest (map)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("map",                 () => expect(instance.map(),)              .toBe(instance,),)
        test("mapIndexed",          () => expect(instance.mapIndexed(),)       .toBe(instance,),)
        test("mapNotNull",          () => expect(instance.mapNotNull(),)       .toBe(instance,),)
        test("mapNotNullIndexed",   () => expect(instance.mapNotNullIndexed(),).toBe(instance,),)
    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance,},},) => {
        describe("map",               () => expect(instance.map(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
        describe("mapIndexed",        () => expect(instance.mapIndexed(callbackAsFail0,),).toBe(emptyCollectionHolder,),)

        describe("mapNotNull",        () => expect(instance.mapNotNull(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
        describe("mapNotNullIndexed", () => expect(instance.mapNotNullIndexed(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
    },)},)

    describe("instances", () => {
        describe("empty", () => {
        describe.each(every0Instances,)("%s", ({value: {newInstance, isLazy, isViewer, isAdaptor,},},) => {

            // The adaptor instances are ignored since they do not rely on get() directly
            // The lazy instances are ignored since they are only an encapsulator class
            // The viewer instances are ignored since they do rely on inner instances
            if (!isAdaptor && !isLazy && !isViewer)
                describe("get() being called", () => {
                    describe("map", () => {
                        test("(T, number) → U", () => expect(newInstance().executeWhileHavingIndexesOnField(it => it.map(callbackAsFail0,),)  .amountOfCall,).toBe(0,),)
                        test("(T) → U",         () => expect(newInstance().executeWhileHavingIndexesOnField(it => it.map(callbackAsFail1,),)  .amountOfCall,).toBe(0,),)
                        test("() → U",          () => expect(newInstance().executeWhileHavingIndexesOnField(it => it.map(callbackAsFail2,),)  .amountOfCall,).toBe(0,),)
                    },)
                    describe("mapIndexed", () => {
                        test("(number, T) → U", () => expect(newInstance().executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsFail0,),)  .amountOfCall,).toBe(0,),)
                        test("(number) → U",    () => expect(newInstance().executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsFail1,),)  .amountOfCall,).toBe(0,),)
                        test("() → U",          () => expect(newInstance().executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsFail2,),)  .amountOfCall,).toBe(0,),)
                    },)

                    describe("mapNotNull", () => {
                        test("(T, number) → U?", () => expect(newInstance().executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsFail0,),)  .amountOfCall,).toBe(0,),)
                        test("(T) → U?",         () => expect(newInstance().executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsFail1,),)  .amountOfCall,).toBe(0,),)
                        test("() → U?",          () => expect(newInstance().executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsFail2,),)  .amountOfCall,).toBe(0,),)
                    },)
                    describe("mapNotNullIndexed", () => {
                        test("(number, T) → U?", () => expect(newInstance().executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsFail0,),)  .amountOfCall,).toBe(0,),)
                        test("(number) → U?",    () => expect(newInstance().executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsFail1,),)  .amountOfCall,).toBe(0,),)
                        test("() → U?",          () => expect(newInstance().executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsFail2,),)  .amountOfCall,).toBe(0,),)
                    },)
                },)

            test("map",               () => expect(newInstance().map(callbackAsFail0,),)              .toBe(emptyCollectionHolder,),)
            test("mapIndexed",        () => expect(newInstance().mapIndexed(callbackAsFail0,),)       .toBe(emptyCollectionHolder,),)
            test("mapNotNull",        () => expect(newInstance().mapNotNull(callbackAsFail0,),)       .toBe(emptyCollectionHolder,),)
            test("mapNotNullIndexed", () => expect(newInstance().mapNotNullIndexed(callbackAsFail0,),).toBe(emptyCollectionHolder,),)

        },)},)
        describe("1 field", () => {
        describe.each(every1Instances,)("%s", ({value: {newInstance, isAdaptor, isLazy, isOf1, isViewer,},},) => {

            // The adaptor instances are ignored since they do not rely on get() directly
            // The lazy instances are ignored since they are only an encapsulator class
            // The instances of 1 are ignored since the get() is never called, it is "get value1" being called
            // The viewer instances are ignored since they do rely on inner instances
            if (!isAdaptor && !isLazy && !isOf1 && !isViewer)
                describe("get() being called", () => {
                    describe("map", () => {
                        test("(T, number) → U",  () => expect(newInstance('a',).executeWhileHavingIndexesOnField(it => it.map(callbackAsString0,),).amountOfCall,).toBe(0,),)
                        test("(T) → U",          () => expect(newInstance('a',).executeWhileHavingIndexesOnField(it => it.map(callbackAsString1,),).amountOfCall,).toBe(1,),)
                        test("() → U",           () => expect(newInstance('a',).executeWhileHavingIndexesOnField(it => it.map(callbackAsString2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("mapIndexed", () => {
                        test("(number, T) → U",  () => expect(newInstance('a',).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                        test("(number) → U",     () => expect(newInstance('a',).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                        test("() → U",           () => expect(newInstance('a',).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString2,),).amountOfCall,).toBe(1,),)
                    },)

                    describe("mapNotNull", () => {
                        test("(T, number) → U?",  () => expect(newInstance('a',) .executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString0,),).amountOfCall,).toBe(0,),)
                        test("(T) → U?",          () => expect(newInstance('a',) .executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString1,),).amountOfCall,).toBe(1,),)
                        test("() → U?",           () => expect(newInstance('a',) .executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("mapNotNullIndexed", () => {
                        test("(number, T) → U?",  () => expect(newInstance('a',) .executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                        test("(number) → U?",     () => expect(newInstance('a',) .executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                        test("() → U?",           () => expect(newInstance('a',) .executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString2,),).amountOfCall,).toBe(1,),)
                    },)
                },)

            describe("map", () => {
                test("value",     () => expect(newInstance('a',).map(callbackToString0,).toArray(),)   .toStrictEqual(UPPER_E,),)
                test("null",      () => expect(newInstance('a',).map(callbackAsNull0,).toArray(),)     .toStrictEqual(NULL,),)
                test("undefined", () => expect(newInstance('a',).map(callbackAsUndefined0,).toArray(),).toStrictEqual(UNDEFINED,),)
                test("even",      () => expect(newInstance('a',).map(callbackOnlyIfEven,).toArray(),)  .toStrictEqual(A,),)
                test("odd",       () => expect(newInstance('a',).map(callbackOnlyIfOdd,).toArray(),)   .toStrictEqual(NULL,),)
            },)
            describe("mapIndexed", () => {
                test("value",     () => expect(newInstance('a',).mapIndexed(callbackToString0,).toArray(),)    .toStrictEqual(UPPER_E,),)
                test("null",      () => expect(newInstance('a',).mapIndexed(callbackAsNull0,).toArray(),)      .toStrictEqual(NULL,),)
                test("undefined", () => expect(newInstance('a',).mapIndexed(callbackAsUndefined0,).toArray(),) .toStrictEqual(UNDEFINED,),)
                test("even",      () => expect(newInstance('a',).mapIndexed(callbackOnlyIfEvenAlt,).toArray(),).toStrictEqual(A,),)
                test("odd",       () => expect(newInstance('a',).mapIndexed(callbackOnlyIfOddAlt,).toArray(),) .toStrictEqual(NULL,),)
            },)

            describe("mapNotNull", () => {
                test("value",     () => expect(newInstance('a',).mapNotNull(callbackToString0,).toArray(),) .toStrictEqual(UPPER_E,),)
                test("null",      () => expect(newInstance('a',).mapNotNull(callbackAsNull0,),)             .toBeEmpty(),)
                test("undefined", () => expect(newInstance('a',).mapNotNull(callbackAsUndefined0,),)        .toBeEmpty(),)
                test("even",      () => expect(newInstance('a',).mapNotNull(callbackOnlyIfEven,).toArray(),).toStrictEqual(A,),)
                test("odd",       () => expect(newInstance('a',).mapNotNull(callbackOnlyIfOdd,),)           .toBeEmpty(),)
            },)
            describe("mapNotNullIndexed", () => {
                test("value",     () => expect(newInstance('a',).mapNotNullIndexed(callbackToString0,).toArray(),)    .toStrictEqual(UPPER_E,),)
                test("null",      () => expect(newInstance('a',).mapNotNullIndexed(callbackAsNull0,),)                .toBeEmpty(),)
                test("undefined", () => expect(newInstance('a',).mapNotNullIndexed(callbackAsUndefined0,),)           .toBeEmpty(),)
                test("even",      () => expect(newInstance('a',).mapNotNullIndexed(callbackOnlyIfEvenAlt,).toArray(),).toStrictEqual(A,),)
                test("odd",       () => expect(newInstance('a',).mapNotNullIndexed(callbackOnlyIfOddAlt,),)           .toBeEmpty(),)
            },)

        },)},)
        describe("2 fields", () => {
        describe.each(every2Instances,)("%s", ({value: {newInstance, isAdaptor, isLazy, isOf2, isViewer,},},) => {

            // The adaptor instances are ignored since they do not rely on get() directly
            // The lazy instances are ignored since they are only an encapsulator class
            // The instances of 2 are ignored since the get() is never called, it is "get value1|2" being called
            // The viewer instances are ignored since they do rely on inner instances
            if (!isAdaptor && !isLazy && !isOf2 && !isViewer)
                describe("get() being called", () => {
                    describe("map", () => {
                        test("(T, number) → U", () => expect(newInstance('a', 'b',).executeWhileHavingIndexesOnField(it => it.map(callbackAsString0,),).amountOfCall,).toBe(0,),)
                        test("(T) → U",         () => expect(newInstance('a', 'b',).executeWhileHavingIndexesOnField(it => it.map(callbackAsString1,),).amountOfCall,).toBe(2,),)
                        test("() → U",          () => expect(newInstance('a', 'b',).executeWhileHavingIndexesOnField(it => it.map(callbackAsString2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("mapIndexed", () => {
                        test("(number, T) → U", () => expect(newInstance('a', 'b',).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                        test("(number) → U",    () => expect(newInstance('a', 'b',).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                        test("() → U",          () => expect(newInstance('a', 'b',).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString2,),).amountOfCall,).toBe(2,),)
                    },)

                    describe("mapNotNull", () => {
                        test("(T, number) → U?", () => expect(newInstance('a', 'b',).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString0,),).amountOfCall,).toBe(0,),)
                        test("(T) → U?",         () => expect(newInstance('a', 'b',).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString1,),).amountOfCall,).toBe(2,),)
                        test("() → U?",          () => expect(newInstance('a', 'b',).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("mapNotNullIndexed", () => {
                        test("(number, T) → U?", () => expect(newInstance('a', 'b',).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                        test("(number) → U?",    () => expect(newInstance('a', 'b',).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                        test("() → U?",          () => expect(newInstance('a', 'b',).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString2,),).amountOfCall,).toBe(2,),)
                    },)
                },)

            describe("map", () => {
                test("value",     () => expect(newInstance('a', 'b',).map(callbackToString0,).toArray(),)   .toStrictEqual(UPPER_EE,),)
                test("null",      () => expect(newInstance('a', 'b',).map(callbackAsNull0,).toArray(),)     .toStrictEqual(NULL_x2,),)
                test("undefined", () => expect(newInstance('a', 'b',).map(callbackAsUndefined0,).toArray(),).toStrictEqual(UNDEFINED_x2,),)
                test("even",      () => expect(newInstance('a', 'b',).map(callbackOnlyIfEven,).toArray(),)  .toStrictEqual(A_NULL,),)
                test("odd",       () => expect(newInstance('a', 'b',).map(callbackOnlyIfOdd,).toArray(),)   .toStrictEqual(NULL_B,),)
            },)
            describe("mapIndexed", () => {
                test("value",     () => expect(newInstance('a', 'b',).mapIndexed(callbackToString0,).toArray(),)    .toStrictEqual(UPPER_EE,),)
                test("null",      () => expect(newInstance('a', 'b',).mapIndexed(callbackAsNull0,).toArray(),)      .toStrictEqual(NULL_x2,),)
                test("undefined", () => expect(newInstance('a', 'b',).mapIndexed(callbackAsUndefined0,).toArray(),) .toStrictEqual(UNDEFINED_x2,),)
                test("even",      () => expect(newInstance('a', 'b',).mapIndexed(callbackOnlyIfEvenAlt,).toArray(),).toStrictEqual(A_NULL,),)
                test("odd",       () => expect(newInstance('a', 'b',).mapIndexed(callbackOnlyIfOddAlt,).toArray(),) .toStrictEqual(NULL_B,),)
            },)

            describe("mapNotNull", () => {
                test("value",     () => expect(newInstance('a', 'b',).mapNotNull(callbackToString0,).toArray(),) .toStrictEqual(UPPER_EE,),)
                test("null",      () => expect(newInstance('a', 'b',).mapNotNull(callbackAsNull0,),)             .toBeEmpty(),)
                test("undefined", () => expect(newInstance('a', 'b',).mapNotNull(callbackAsUndefined0,),)        .toBeEmpty(),)
                test("even",      () => expect(newInstance('a', 'b',).mapNotNull(callbackOnlyIfEven,).toArray(),).toStrictEqual(A,),)
                test("odd",       () => expect(newInstance('a', 'b',).mapNotNull(callbackOnlyIfOdd,).toArray(),) .toStrictEqual(B,),)
            },)
            describe("mapNotNullIndexed", () => {
                test("value",     () => expect(newInstance('a', 'b',).mapNotNullIndexed(callbackToString0,).toArray(),)    .toStrictEqual(UPPER_EE,),)
                test("null",      () => expect(newInstance('a', 'b',).mapNotNullIndexed(callbackAsNull0,),)                .toBeEmpty(),)
                test("undefined", () => expect(newInstance('a', 'b',).mapNotNullIndexed(callbackAsUndefined0,),)           .toBeEmpty(),)
                test("even",      () => expect(newInstance('a', 'b',).mapNotNullIndexed(callbackOnlyIfEvenAlt,).toArray(),).toStrictEqual(A,),)
                test("odd",       () => expect(newInstance('a', 'b',).mapNotNullIndexed(callbackOnlyIfOddAlt,).toArray(),) .toStrictEqual(B,),)
            },)

        },)},)
        describe("N fields", () => {
        describe.each(everyNInstances,)("%s", ({value: {instance, isAdaptor, isLazy, isViewer,},},) => {

            // The adaptor instances are ignored since they do not rely on get() directly
            // The lazy instances are ignored since they are only an encapsulator class
            // The viewer instances are ignored since they do rely on inner instances
            if (!isAdaptor && !isLazy && !isViewer)
                describe("get() being called", () => {
                    describe("map", () => {
                        test("(T, number) → U", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.map(callbackAsString0,),).amountOfCall,).toBe(0,),)
                        test("(T) → U",         () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.map(callbackAsString1,),).amountOfCall,).toBe(4,),)
                        test("() → U",          () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.map(callbackAsString2,),).amountOfCall,).toBe(4,),)
                    },)
                    describe("mapIndexed", () => {
                        test("(number, T) → U", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                        test("(number) → U",    () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                        test("() → U",          () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString2,),).amountOfCall,).toBe(4,),)
                    },)

                    describe("mapNotNull", () => {
                        test("(T, number) → U?", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString0,),).amountOfCall,).toBe(0,),)
                        test("(T) → U?",         () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString1,),).amountOfCall,).toBe(4,),)
                        test("() → U?",          () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString2,),).amountOfCall,).toBe(4,),)
                    },)
                    describe("mapNotNullIndexed", () => {
                        test("(number, T) → U?", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                        test("(number) → U?",    () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                        test("() → U?",          () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString2,),).amountOfCall,).toBe(4,),)
                    },)
                },)

            describe("map", () => {
                test("value",     () => expect(new instance(ABCD,).map(callbackToString0,).toArray(),)   .toStrictEqual(UPPER_EEEE,),)
                test("null",      () => expect(new instance(ABCD,).map(callbackAsNull0,).toArray(),)     .toStrictEqual(NULL_x4,),)
                test("undefined", () => expect(new instance(ABCD,).map(callbackAsUndefined0,).toArray(),).toStrictEqual(UNDEFINED_x4,),)
                test("even",      () => expect(new instance(ABCD,).map(callbackOnlyIfEven,).toArray(),)  .toStrictEqual(A_NULL_C_NULL,),)
                test("odd",       () => expect(new instance(ABCD,).map(callbackOnlyIfOdd,).toArray(),)   .toStrictEqual(NULL_B_NULL_D,),)
            },)
            describe("mapIndexed", () => {
                test("value",     () => expect(new instance(ABCD,).mapIndexed(callbackToString0,).toArray(),)    .toStrictEqual(UPPER_EEEE,),)
                test("null",      () => expect(new instance(ABCD,).mapIndexed(callbackAsNull0,).toArray(),)      .toStrictEqual(NULL_x4,),)
                test("undefined", () => expect(new instance(ABCD,).mapIndexed(callbackAsUndefined0,).toArray(),) .toStrictEqual(UNDEFINED_x4,),)
                test("even",      () => expect(new instance(ABCD,).mapIndexed(callbackOnlyIfEvenAlt,).toArray(),).toStrictEqual(A_NULL_C_NULL,),)
                test("odd",       () => expect(new instance(ABCD,).mapIndexed(callbackOnlyIfOddAlt,).toArray(),) .toStrictEqual(NULL_B_NULL_D,),)
            },)

            describe("mapNotNull", () => {
                test("value",     () => expect(new instance(ABCD,).mapNotNull(callbackToString0,).toArray(),) .toStrictEqual(UPPER_EEEE,),)
                test("null",      () => expect(new instance(ABCD,).mapNotNull(callbackAsNull0,),)             .toBeEmpty(),)
                test("undefined", () => expect(new instance(ABCD,).mapNotNull(callbackAsUndefined0,),)        .toBeEmpty(),)
                test("even",      () => expect(new instance(ABCD,).mapNotNull(callbackOnlyIfEven,).toArray(),).toStrictEqual(AC,),)
                test("odd",       () => expect(new instance(ABCD,).mapNotNull(callbackOnlyIfOdd,).toArray(),) .toStrictEqual(BD,),)
            },)
            describe("mapNotNullIndexed", () => {
                test("value",     () => expect(new instance(ABCD,).mapNotNullIndexed(callbackToString0,).toArray(),)    .toStrictEqual(UPPER_EEEE,),)
                test("null",      () => expect(new instance(ABCD,).mapNotNullIndexed(callbackAsNull0,),)                .toBeEmpty(),)
                test("undefined", () => expect(new instance(ABCD,).mapNotNullIndexed(callbackAsUndefined0,),)           .toBeEmpty(),)
                test("even",      () => expect(new instance(ABCD,).mapNotNullIndexed(callbackOnlyIfEvenAlt,).toArray(),).toStrictEqual(AC,),)
                test("odd",       () => expect(new instance(ABCD,).mapNotNullIndexed(callbackOnlyIfOddAlt,).toArray(),) .toStrictEqual(BD,),)
            },)

        },)},)
    },)

},)
