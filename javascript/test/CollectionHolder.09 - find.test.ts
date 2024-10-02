/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {EmptyCollectionHolderForTest}                                                                                                                                                                                        from "./instance/EmptyCollectionHolderForTest"
import {A, AB, ABCD, EMPTY}                                                                                                                                                                                                  from "./value/arrays"
import {callbackAsFalse0, callbackAsFalse1, callbackAsFalse2, callbackAsTrue0, callbackAsTrue1, callbackAsTrue2, falseCallbacks, trueCallbacks}                                                                              from "./value/callbacks (boolean)"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                                                                                                                   from "./value/callbacks (fail)"
import {callbackIsA, callbackIsAAlt, callbackIsB, callbackIsBAlt, callbackIsC, callbackIsCAlt, callbackIsD, callbackIsDAlt, callbackIsE, callbackIsEAlt}                                                                     from "./value/callbacks (string)"
import {callbackIs0, callbackIs0Alt, callbackIs1, callbackIs1Alt, callbackIs2, callbackIs2Alt, callbackIs3, callbackIs3Alt, callbackIs4, callbackIs4Alt, callbackIsEven, callbackIsEvenAlt, callbackIsOdd, callbackIsOddAlt} from "./value/callbacks (number)"
import {everyCollectionInstancesAndExtensionFunctionAsCollectionHolder}                                                                                                                                                      from "./value/instances"

describe("CollectionHolderTest (find)", () => {

    describe("EmptyCollectionHolder", () => {
        test("find",            () => expect(new EmptyCollectionHolderForTest().find(),).toBeNull(),)
        test("findIndexed",     () => expect(new EmptyCollectionHolderForTest().findIndexed(),).toBeNull(),)
        test("findLast",        () => expect(new EmptyCollectionHolderForTest().findLast(),).toBeNull(),)
        test("findLastIndexed", () => expect(new EmptyCollectionHolderForTest().findLastIndexed(),).toBeNull(),)
    },)

    describe.each(everyCollectionInstancesAndExtensionFunctionAsCollectionHolder,)("%s", ({value: {instance, isExtension,},},) => {
        if (!isExtension)
            describe("get() being called", () => {
                describe("find", () => {
                    describe("empty", () => {
                        test("0 arguments", () => expect(new instance(EMPTY,).execute(it => it.find(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                        test("1 argument",  () => expect(new instance(EMPTY,).execute(it => it.find(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments", () => expect(new instance(EMPTY,).execute(it => it.find(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("0 arguments: true",  () => expect(new instance(A,).execute(it => it.find(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(A,).execute(it => it.find(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(A,).execute(it => it.find(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(A,).execute(it => it.find(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(A,).execute(it => it.find(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: false", () => expect(new instance(A,).execute(it => it.find(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(AB,).execute(it => it.find(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(AB,).execute(it => it.find(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(AB,).execute(it => it.find(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(AB,).execute(it => it.find(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(AB,).execute(it => it.find(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                        test("2 arguments: false", () => expect(new instance(AB,).execute(it => it.find(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.find(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(ABCD,).execute(it => it.find(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.find(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(ABCD,).execute(it => it.find(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(ABCD,).execute(it => it.find(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                        test("2 arguments: false", () => expect(new instance(ABCD,).execute(it => it.find(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                    },)
                },)
                describe("findIndexed", () => {
                    describe("empty", () => {
                        test("0 arguments", () => expect(new instance(EMPTY,).execute(it => it.findIndexed(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                        test("1 argument",  () => expect(new instance(EMPTY,).execute(it => it.findIndexed(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments", () => expect(new instance(EMPTY,).execute(it => it.findIndexed(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("0 arguments: true",  () => expect(new instance(A,).execute(it => it.findIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(A,).execute(it => it.findIndexed(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(A,).execute(it => it.findIndexed(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(A,).execute(it => it.findIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(A,).execute(it => it.findIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(A,).execute(it => it.findIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(AB,).execute(it => it.findIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(AB,).execute(it => it.findIndexed(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(AB,).execute(it => it.findIndexed(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(AB,).execute(it => it.findIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(AB,).execute(it => it.findIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(AB,).execute(it => it.findIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(ABCD,).execute(it => it.findIndexed(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findIndexed(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(ABCD,).execute(it => it.findIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(ABCD,).execute(it => it.findIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(ABCD,).execute(it => it.findIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                    },)
                },)
                describe("findLast", () => {
                    describe("empty", () => {
                        test("0 arguments", () => expect(new instance(EMPTY,).execute(it => it.findLast(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                        test("1 argument",  () => expect(new instance(EMPTY,).execute(it => it.findLast(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments", () => expect(new instance(EMPTY,).execute(it => it.findLast(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("0 arguments: true",  () => expect(new instance(A,).execute(it => it.findLast(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(A,).execute(it => it.findLast(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(A,).execute(it => it.findLast(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(A,).execute(it => it.findLast(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(A,).execute(it => it.findLast(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: false", () => expect(new instance(A,).execute(it => it.findLast(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(AB,).execute(it => it.findLast(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(AB,).execute(it => it.findLast(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(AB,).execute(it => it.findLast(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(AB,).execute(it => it.findLast(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(AB,).execute(it => it.findLast(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                        test("2 arguments: false", () => expect(new instance(AB,).execute(it => it.findLast(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findLast(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(ABCD,).execute(it => it.findLast(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findLast(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(ABCD,).execute(it => it.findLast(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(ABCD,).execute(it => it.findLast(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                        test("2 arguments: false", () => expect(new instance(ABCD,).execute(it => it.findLast(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                    },)
                },)
                describe("findLastIndexed", () => {
                    describe("empty", () => {
                        test("0 arguments", () => expect(new instance(EMPTY,).execute(it => it.findLastIndexed(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                        test("1 argument",  () => expect(new instance(EMPTY,).execute(it => it.findLastIndexed(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments", () => expect(new instance(EMPTY,).execute(it => it.findLastIndexed(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("0 arguments: true",  () => expect(new instance(A,).execute(it => it.findLastIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(A,).execute(it => it.findLastIndexed(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(A,).execute(it => it.findLastIndexed(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(A,).execute(it => it.findLastIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(A,).execute(it => it.findLastIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(A,).execute(it => it.findLastIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(AB,).execute(it => it.findLastIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(AB,).execute(it => it.findLastIndexed(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(AB,).execute(it => it.findLastIndexed(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(AB,).execute(it => it.findLastIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(AB,).execute(it => it.findLastIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(AB,).execute(it => it.findLastIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findLastIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(ABCD,).execute(it => it.findLastIndexed(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findLastIndexed(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(ABCD,).execute(it => it.findLastIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(ABCD,).execute(it => it.findLastIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(ABCD,).execute(it => it.findLastIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                    },)
                },)
            },)

        describe("find", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).find(callbackAsFail0,),).toBeNull(),)
                test("1 argument",  () => expect(new instance(EMPTY,).find(callbackAsFail1,),).toBeNull(),)
                test("2 arguments", () => expect(new instance(EMPTY,).find(callbackAsFail2,),).toBeNull(),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).find(it,),).toBe('a',),)
                    test("2 fields", () => expect(new instance(AB,).find(it,),).toBe('a',),)
                    test("4 fields", () => expect(new instance(ABCD,).find(it,),).toBe('a',),)
                },)
                describe.each(falseCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).find(it,),).toBeNull(),)
                    test("2 fields", () => expect(new instance(AB,).find(it,),).toBeNull(),)
                    test("4 fields", () => expect(new instance(ABCD,).find(it,),).toBeNull(),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).find(callbackIsA,),).toBe('a',),)
                test('e',    () => expect(new instance(A,).find(callbackIsE,),).toBeNull(),)
                test("even", () => expect(new instance(A,).find(callbackIsEvenAlt,),).toBe('a',),)
                test("odd",  () => expect(new instance(A,).find(callbackIsOddAlt,),).toBeNull(),)
                test('0',    () => expect(new instance(A,).find(callbackIs0Alt,),).toBe('a',),)
                test('4',    () => expect(new instance(A,).find(callbackIs4Alt,),).toBeNull(),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).find(callbackIsA,),).toBe('a',),)
                test('b',    () => expect(new instance(AB,).find(callbackIsB,),).toBe('b',),)
                test('e',    () => expect(new instance(AB,).find(callbackIsE,),).toBeNull(),)
                test("even", () => expect(new instance(AB,).find(callbackIsEvenAlt,),).toBe('a',),)
                test("odd",  () => expect(new instance(AB,).find(callbackIsOddAlt,),).toBe('b',),)
                test('0',    () => expect(new instance(AB,).find(callbackIs0Alt,),).toBe('a',),)
                test('1',    () => expect(new instance(AB,).find(callbackIs1Alt,),).toBe('b',),)
                test('2',    () => expect(new instance(AB,).find(callbackIs4Alt,),).toBeNull(),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).find(callbackIsA,),).toBe('a',),)
                test('b',    () => expect(new instance(ABCD,).find(callbackIsB,),).toBe('b',),)
                test('c',    () => expect(new instance(ABCD,).find(callbackIsC,),).toBe('c',),)
                test('d',    () => expect(new instance(ABCD,).find(callbackIsD,),).toBe('d',),)
                test('e',    () => expect(new instance(ABCD,).find(callbackIsE,),).toBeNull(),)
                test("even", () => expect(new instance(ABCD,).find(callbackIsEvenAlt,),).toBe('a',),)
                test("odd",  () => expect(new instance(ABCD,).find(callbackIsOddAlt,),).toBe('b',),)
                test('0',    () => expect(new instance(ABCD,).find(callbackIs0Alt,),).toBe('a',),)
                test('1',    () => expect(new instance(ABCD,).find(callbackIs1Alt,),).toBe('b',),)
                test('2',    () => expect(new instance(ABCD,).find(callbackIs2Alt,),).toBe('c',),)
                test('3',    () => expect(new instance(ABCD,).find(callbackIs3Alt,),).toBe('d',),)
                test('4',    () => expect(new instance(ABCD,).find(callbackIs4Alt,),).toBeNull(),)
            },)
        },)
        describe("findIndexed", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).findIndexed(callbackAsFail0,),).toBeNull(),)
                test("1 argument",  () => expect(new instance(EMPTY,).findIndexed(callbackAsFail1,),).toBeNull(),)
                test("2 arguments", () => expect(new instance(EMPTY,).findIndexed(callbackAsFail2,),).toBeNull(),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findIndexed(it,),).toBe('a',),)
                    test("2 fields", () => expect(new instance(AB,).findIndexed(it,),).toBe('a',),)
                    test("4 fields", () => expect(new instance(ABCD,).findIndexed(it,),).toBe('a',),)
                },)
                describe.each(falseCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findIndexed(it,),).toBeNull(),)
                    test("2 fields", () => expect(new instance(AB,).findIndexed(it,),).toBeNull(),)
                    test("4 fields", () => expect(new instance(ABCD,).findIndexed(it,),).toBeNull(),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).findIndexed(callbackIsAAlt,),).toBe('a',),)
                test('e',    () => expect(new instance(A,).findIndexed(callbackIsEAlt,),).toBeNull(),)
                test("even", () => expect(new instance(A,).findIndexed(callbackIsEven,),).toBe('a',),)
                test("odd",  () => expect(new instance(A,).findIndexed(callbackIsOdd,),).toBeNull(),)
                test('0',    () => expect(new instance(A,).findIndexed(callbackIs0,),).toBe('a',),)
                test('4',    () => expect(new instance(A,).findIndexed(callbackIs4,),).toBeNull(),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).findIndexed(callbackIsAAlt,),).toBe('a',),)
                test('b',    () => expect(new instance(AB,).findIndexed(callbackIsBAlt,),).toBe('b',),)
                test('e',    () => expect(new instance(AB,).findIndexed(callbackIsEAlt,),).toBeNull(),)
                test("even", () => expect(new instance(AB,).findIndexed(callbackIsEven,),).toBe('a',),)
                test("odd",  () => expect(new instance(AB,).findIndexed(callbackIsOdd,),).toBe('b',),)
                test('0',    () => expect(new instance(AB,).findIndexed(callbackIs0,),).toBe('a',),)
                test('1',    () => expect(new instance(AB,).findIndexed(callbackIs1,),).toBe('b',),)
                test('4',    () => expect(new instance(AB,).findIndexed(callbackIs4,),).toBeNull(),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).findIndexed(callbackIsAAlt,),).toBe('a',),)
                test('b',    () => expect(new instance(ABCD,).findIndexed(callbackIsBAlt,),).toBe('b',),)
                test('c',    () => expect(new instance(ABCD,).findIndexed(callbackIsCAlt,),).toBe('c',),)
                test('d',    () => expect(new instance(ABCD,).findIndexed(callbackIsDAlt,),).toBe('d',),)
                test('e',    () => expect(new instance(ABCD,).findIndexed(callbackIsEAlt,),).toBeNull(),)
                test("even", () => expect(new instance(ABCD,).findIndexed(callbackIsEven,),).toBe('a',),)
                test("odd",  () => expect(new instance(ABCD,).findIndexed(callbackIsOdd,),).toBe('b',),)
                test('0',    () => expect(new instance(ABCD,).findIndexed(callbackIs0,),).toBe('a',),)
                test('1',    () => expect(new instance(ABCD,).findIndexed(callbackIs1,),).toBe('b',),)
                test('2',    () => expect(new instance(ABCD,).findIndexed(callbackIs2,),).toBe('c',),)
                test('3',    () => expect(new instance(ABCD,).findIndexed(callbackIs3,),).toBe('d',),)
                test('4',    () => expect(new instance(ABCD,).findIndexed(callbackIs4,),).toBeNull(),)
            },)
        },)
        describe("findLast", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).findLast(callbackAsFail0,),).toBeNull(),)
                test("1 argument",  () => expect(new instance(EMPTY,).findLast(callbackAsFail1,),).toBeNull(),)
                test("2 arguments", () => expect(new instance(EMPTY,).findLast(callbackAsFail2,),).toBeNull(),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findLast(it,),).toBe('a',),)
                    test("2 fields", () => expect(new instance(AB,).findLast(it,),).toBe('b',),)
                    test("4 fields", () => expect(new instance(ABCD,).findLast(it,),).toBe('d',),)
                },)
                describe.each(falseCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findLast(it,),).toBeNull(),)
                    test("2 fields", () => expect(new instance(AB,).findLast(it,),).toBeNull(),)
                    test("4 fields", () => expect(new instance(ABCD,).findLast(it,),).toBeNull(),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).findLast(callbackIsA,),).toBe('a',),)
                test('e',    () => expect(new instance(A,).findLast(callbackIsE,),).toBeNull(),)
                test("even", () => expect(new instance(A,).findLast(callbackIsEvenAlt,),).toBe('a',),)
                test("odd",  () => expect(new instance(A,).findLast(callbackIsOddAlt,),).toBeNull(),)
                test('0',    () => expect(new instance(A,).findLast(callbackIs0Alt,),).toBe('a',),)
                test('4',    () => expect(new instance(A,).findLast(callbackIs4Alt,),).toBeNull(),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).findLast(callbackIsA,),).toBe('a',),)
                test('b',    () => expect(new instance(AB,).findLast(callbackIsB,),).toBe('b',),)
                test('e',    () => expect(new instance(AB,).findLast(callbackIsE,),).toBeNull(),)
                test("even", () => expect(new instance(AB,).findLast(callbackIsEvenAlt,),).toBe('a',),)
                test("odd",  () => expect(new instance(AB,).findLast(callbackIsOddAlt,),).toBe('b',),)
                test('0',    () => expect(new instance(AB,).findLast(callbackIs0Alt,),).toBe('a',),)
                test('1',    () => expect(new instance(AB,).findLast(callbackIs1Alt,),).toBe('b',),)
                test('2',    () => expect(new instance(AB,).findLast(callbackIs4Alt,),).toBeNull(),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).findLast(callbackIsA,),).toBe('a',),)
                test('b',    () => expect(new instance(ABCD,).findLast(callbackIsB,),).toBe('b',),)
                test('c',    () => expect(new instance(ABCD,).findLast(callbackIsC,),).toBe('c',),)
                test('d',    () => expect(new instance(ABCD,).findLast(callbackIsD,),).toBe('d',),)
                test('e',    () => expect(new instance(ABCD,).findLast(callbackIsE,),).toBeNull(),)
                test("even", () => expect(new instance(ABCD,).findLast(callbackIsEvenAlt,),).toBe('c',),)
                test("odd",  () => expect(new instance(ABCD,).findLast(callbackIsOddAlt,),).toBe('d',),)
                test('0',    () => expect(new instance(ABCD,).findLast(callbackIs0Alt,),).toBe('a',),)
                test('1',    () => expect(new instance(ABCD,).findLast(callbackIs1Alt,),).toBe('b',),)
                test('2',    () => expect(new instance(ABCD,).findLast(callbackIs2Alt,),).toBe('c',),)
                test('3',    () => expect(new instance(ABCD,).findLast(callbackIs3Alt,),).toBe('d',),)
                test('4',    () => expect(new instance(ABCD,).findLast(callbackIs4Alt,),).toBeNull(),)
            },)
        },)
        describe("findLastIndexed", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).findLastIndexed(callbackAsFail0,),).toBeNull(),)
                test("1 argument",  () => expect(new instance(EMPTY,).findLastIndexed(callbackAsFail1,),).toBeNull(),)
                test("2 arguments", () => expect(new instance(EMPTY,).findLastIndexed(callbackAsFail2,),).toBeNull(),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findLastIndexed(it,),).toBe('a',),)
                    test("2 fields", () => expect(new instance(AB,).findLastIndexed(it,),).toBe('b',),)
                    test("4 fields", () => expect(new instance(ABCD,).findLastIndexed(it,),).toBe('d',),)
                },)
                describe.each(falseCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findLastIndexed(it,),).toBeNull(),)
                    test("2 fields", () => expect(new instance(AB,).findLastIndexed(it,),).toBeNull(),)
                    test("4 fields", () => expect(new instance(ABCD,).findLastIndexed(it,),).toBeNull(),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).findLastIndexed(callbackIsAAlt,),).toBe('a',),)
                test('e',    () => expect(new instance(A,).findLastIndexed(callbackIsEAlt,),).toBeNull(),)
                test("even", () => expect(new instance(A,).findLastIndexed(callbackIsEven,),).toBe('a',),)
                test("odd",  () => expect(new instance(A,).findLastIndexed(callbackIsOdd,),).toBeNull(),)
                test('0',    () => expect(new instance(A,).findLastIndexed(callbackIs0,),).toBe('a',),)
                test('4',    () => expect(new instance(A,).findLastIndexed(callbackIs4,),).toBeNull(),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).findLastIndexed(callbackIsAAlt,),).toBe('a',),)
                test('b',    () => expect(new instance(AB,).findLastIndexed(callbackIsBAlt,),).toBe('b',),)
                test('e',    () => expect(new instance(AB,).findLastIndexed(callbackIsEAlt,),).toBeNull(),)
                test("even", () => expect(new instance(AB,).findLastIndexed(callbackIsEven,),).toBe('a',),)
                test("odd",  () => expect(new instance(AB,).findLastIndexed(callbackIsOdd,),).toBe('b',),)
                test('0',    () => expect(new instance(AB,).findLastIndexed(callbackIs0,),).toBe('a',),)
                test('1',    () => expect(new instance(AB,).findLastIndexed(callbackIs1,),).toBe('b',),)
                test('4',    () => expect(new instance(AB,).findLastIndexed(callbackIs4,),).toBeNull(),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).findLastIndexed(callbackIsAAlt,),).toBe('a',),)
                test('b',    () => expect(new instance(ABCD,).findLastIndexed(callbackIsBAlt,),).toBe('b',),)
                test('c',    () => expect(new instance(ABCD,).findLastIndexed(callbackIsCAlt,),).toBe('c',),)
                test('d',    () => expect(new instance(ABCD,).findLastIndexed(callbackIsDAlt,),).toBe('d',),)
                test('e',    () => expect(new instance(ABCD,).findLastIndexed(callbackIsEAlt,),).toBeNull(),)
                test("even", () => expect(new instance(ABCD,).findLastIndexed(callbackIsEven,),).toBe('c',),)
                test("odd",  () => expect(new instance(ABCD,).findLastIndexed(callbackIsOdd,),).toBe('d',),)
                test('0',    () => expect(new instance(ABCD,).findLastIndexed(callbackIs0,),).toBe('a',),)
                test('1',    () => expect(new instance(ABCD,).findLastIndexed(callbackIs1,),).toBe('b',),)
                test('2',    () => expect(new instance(ABCD,).findLastIndexed(callbackIs2,),).toBe('c',),)
                test('3',    () => expect(new instance(ABCD,).findLastIndexed(callbackIs3,),).toBe('d',),)
                test('4',    () => expect(new instance(ABCD,).findLastIndexed(callbackIs4,),).toBeNull(),)
            },)
        },)
    },)

},)
