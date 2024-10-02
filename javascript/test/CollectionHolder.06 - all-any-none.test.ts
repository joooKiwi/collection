/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {EmptyCollectionHolderForTest}                                                                                                           from "./instance/EmptyCollectionHolderForTest"
import {GenericCollectionHolder_AllAlias}                                                                                                       from "./instance/GenericCollectionHolder_AllAlias"
import {GenericCollectionHolder_AnyAlias}                                                                                                       from "./instance/GenericCollectionHolder_AnyAlias"
import {LazyGenericCollectionHolder_AnyAlias}                                                                                                   from "./instance/LazyGenericCollectionHolder_AnyAlias"
import {LazyGenericCollectionHolder_AllAlias}                                                                                                   from "./instance/LazyGenericCollectionHolder_AllAlias"
import {A, AB, ABCD, EMPTY}                                                                                                                     from "./value/arrays"
import {callbackAsFalse0, callbackAsFalse1, callbackAsFalse2, callbackAsTrue0, callbackAsTrue1, callbackAsTrue2, falseCallbacks, trueCallbacks} from "./value/callbacks (boolean)"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                                      from "./value/callbacks (fail)"
import {callbackIs0Alt, callbackIs1Alt, callbackIs2Alt, callbackIs3Alt, callbackIs4Alt, callbackIsEvenAlt, callbackIsOddAlt}                    from "./value/callbacks (number)"
import {callbackIsA, callbackIsB, callbackIsC, callbackIsD, callbackIsE}                                                                        from "./value/callbacks (string)"
import {everyCollectionInstancesAndExtensionFunctionAsCollectionHolder}                                                                         from "./value/instances"

describe("CollectionHolderTest (all / any / none)", () => {

    describe("EmptyCollectionHolder", () => {
        test("all",   () => expect(new EmptyCollectionHolderForTest().all(),).toBeTrue(),)
        test("every", () => expect(new EmptyCollectionHolderForTest().every(),).toBeTrue(),)
        test("any",   () => expect(new EmptyCollectionHolderForTest().any(),).toBeFalse(),)
        test("some",  () => expect(new EmptyCollectionHolderForTest().some(),).toBeFalse(),)
        test("every", () => expect(new EmptyCollectionHolderForTest().none(),).toBeTrue(),)
    },)

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("every", () => expect(new GenericCollectionHolder_AllAlias().execute(it => it.every(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            test("some",  () => expect(new GenericCollectionHolder_AnyAlias().execute(it => it.some(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("every", () => expect(new LazyGenericCollectionHolder_AllAlias().execute(it => it.every(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            test("some",  () => expect(new LazyGenericCollectionHolder_AnyAlias().execute(it => it.some(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
        },)
    },)

    describe.each(everyCollectionInstancesAndExtensionFunctionAsCollectionHolder,)("%s", ({value: {instance, isExtension,},},) => {
        if (!isExtension)
            describe("get() being called", () => {
                describe("all", () => {
                    test("true: 0 arguments",  () => expect(new instance(AB,).execute(it => it.all(callbackAsTrue0,),).amountOfCall,).toBe(0,),)
                    test("true: 1 argument",   () => expect(new instance(AB,).execute(it => it.all(callbackAsTrue1,),).amountOfCall,).toBe(2,),)
                    test("true: 2 arguments",  () => expect(new instance(AB,).execute(it => it.all(callbackAsTrue2,),).amountOfCall,).toBe(2,),)
                    test("false: 0 arguments", () => expect(new instance(AB,).execute(it => it.all(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                    test("false: 1 argument",  () => expect(new instance(AB,).execute(it => it.all(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                    test("false: 2 arguments", () => expect(new instance(AB,).execute(it => it.all(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                },)
                describe("any", () => {
                    test("no predicate",       () => expect(new instance(AB,).execute(it => it.any(),).amountOfCall,).toBe(0,),)
                    test("true: 0 arguments",  () => expect(new instance(AB,).execute(it => it.any(callbackAsTrue0,),).amountOfCall,).toBe(0,),)
                    test("true: 1 arguments",  () => expect(new instance(AB,).execute(it => it.any(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                    test("true: 2 arguments",  () => expect(new instance(AB,).execute(it => it.any(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                    test("false: 0 arguments", () => expect(new instance(AB,).execute(it => it.any(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                    test("false: 1 arguments", () => expect(new instance(AB,).execute(it => it.any(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                    test("false: 2 arguments", () => expect(new instance(AB,).execute(it => it.any(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                },)
                describe("none", () => {
                    test("no predicate",       () => expect(new instance(AB,).execute(it => it.none(),).amountOfCall,).toBe(0,),)
                    test("true: 0 arguments",  () => expect(new instance(AB,).execute(it => it.none(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                    test("true: 1 arguments",  () => expect(new instance(AB,).execute(it => it.none(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                    test("true: 2 arguments",  () => expect(new instance(AB,).execute(it => it.none(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                    test("false: 0 arguments", () => expect(new instance(AB,).execute(it => it.none(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                    test("false: 1 arguments", () => expect(new instance(AB,).execute(it => it.none(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                    test("false: 2 arguments", () => expect(new instance(AB,).execute(it => it.none(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                },)
            },)

        describe("all", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).all(callbackAsFail0,),).toBeTrue(),)
                test("1 argument",  () => expect(new instance(EMPTY,).all(callbackAsFail1,),).toBeTrue(),)
                test("2 arguments", () => expect(new instance(EMPTY,).all(callbackAsFail2,),).toBeTrue(),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s",    ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).all(it,),).toBeTrue(),)
                    test("2 fields", () => expect(new instance(AB,).all(it,),).toBeTrue(),)
                    test("4 fields", () => expect(new instance(ABCD,).all(it,),).toBeTrue(),)
                },)
                describe.each(falseCallbacks,)("false: %s",    ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).all(it,),).toBeFalse(),)
                    test("2 fields", () => expect(new instance(AB,).all(it,),).toBeFalse(),)
                    test("4 fields", () => expect(new instance(ABCD,).all(it,),).toBeFalse(),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).all(callbackIsA,),).toBeTrue(),)
                test('e',    () => expect(new instance(A,).all(callbackIsE,),).toBeFalse(),)
                test("even", () => expect(new instance(A,).all(callbackIsEvenAlt,),).toBeTrue(),)
                test("odd",  () => expect(new instance(A,).all(callbackIsOddAlt,),).toBeFalse(),)
                test('0',    () => expect(new instance(A,).all(callbackIs0Alt,),).toBeTrue(),)
                test('4',    () => expect(new instance(A,).all(callbackIs4Alt,),).toBeFalse(),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).all(callbackIsA,),).toBeFalse(),)
                test('b',    () => expect(new instance(AB,).all(callbackIsB,),).toBeFalse(),)
                test('e',    () => expect(new instance(AB,).all(callbackIsE,),).toBeFalse(),)
                test("even", () => expect(new instance(AB,).all(callbackIsEvenAlt,),).toBeFalse(),)
                test("odd",  () => expect(new instance(AB,).all(callbackIsOddAlt,),).toBeFalse(),)
                test('0',    () => expect(new instance(AB,).all(callbackIs0Alt,),).toBeFalse(),)
                test('1',    () => expect(new instance(AB,).all(callbackIs1Alt,),).toBeFalse(),)
                test('4',    () => expect(new instance(AB,).all(callbackIs4Alt,),).toBeFalse(),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).all(callbackIsA,),).toBeFalse(),)
                test('b',    () => expect(new instance(ABCD,).all(callbackIsB,),).toBeFalse(),)
                test('c',    () => expect(new instance(ABCD,).all(callbackIsC,),).toBeFalse(),)
                test('d',    () => expect(new instance(ABCD,).all(callbackIsD,),).toBeFalse(),)
                test('e',    () => expect(new instance(ABCD,).all(callbackIsE,),).toBeFalse(),)
                test("even", () => expect(new instance(ABCD,).all(callbackIsEvenAlt,),).toBeFalse(),)
                test("odd",  () => expect(new instance(ABCD,).all(callbackIsOddAlt,),).toBeFalse(),)
                test('0',    () => expect(new instance(ABCD,).all(callbackIs0Alt,),).toBeFalse(),)
                test('1',    () => expect(new instance(ABCD,).all(callbackIs1Alt,),).toBeFalse(),)
                test('2',    () => expect(new instance(ABCD,).all(callbackIs2Alt,),).toBeFalse(),)
                test('3',    () => expect(new instance(ABCD,).all(callbackIs3Alt,),).toBeFalse(),)
                test('4',    () => expect(new instance(ABCD,).all(callbackIs4Alt,),).toBeFalse(),)
            },)
        },)
        describe("any", () => {
            describe("no predicate", () => {
                test("empty",    () => expect(new instance(EMPTY,).any(),).toBeFalse(),)
                test("1 field",  () => expect(new instance(A,).any(),).toBeTrue(),)
                test("2 fields", () => expect(new instance(AB,).any(),).toBeTrue(),)
                test("4 fields", () => expect(new instance(ABCD,).any(),).toBeTrue(),)
            },)
            describe.each([null, undefined,],)("null parameter: %s", it => {
                test("empty",    () => expect(new instance(EMPTY,).any(it,),).toBeFalse(),)
                test("1 field",  () => expect(new instance(A,).any(it,),).toBeTrue(),)
                test("2 fields", () => expect(new instance(AB,).any(it,),).toBeTrue(),)
                test("4 fields", () => expect(new instance(ABCD,).any(it,),).toBeTrue(),)
            },)
            describe("with predicate", () => {
                describe("empty", () => {
                    test("0 arguments", () => expect(new instance(EMPTY,).any(callbackAsFail0,),).toBeFalse(),)
                    test("1 argument",  () => expect(new instance(EMPTY,).any(callbackAsFail1,),).toBeFalse(),)
                    test("2 arguments", () => expect(new instance(EMPTY,).any(callbackAsFail2,),).toBeFalse(),)
                },)
                describe("boolean callbacks", () => {
                    describe.each(trueCallbacks,)("true: %s",    ({value: it,},) => {
                        test("1 field",  () => expect(new instance(A,).any(it,),).toBeTrue(),)
                        test("2 fields", () => expect(new instance(AB,).any(it,),).toBeTrue(),)
                        test("4 fields", () => expect(new instance(ABCD,).any(it,),).toBeTrue(),)
                    },)
                    describe.each(falseCallbacks,)("false: %s",    ({value: it,},) => {
                        test("1 field",  () => expect(new instance(A,).any(it,),).toBeFalse(),)
                        test("2 fields", () => expect(new instance(AB,).any(it,),).toBeFalse(),)
                        test("4 fields", () => expect(new instance(ABCD,).any(it,),).toBeFalse(),)
                    },)
                },)
                describe("1 field", () => {
                    test('a',    () => expect(new instance(A,).any(callbackIsA,),).toBeTrue(),)
                    test('e',    () => expect(new instance(A,).any(callbackIsE,),).toBeFalse(),)
                    test("even", () => expect(new instance(A,).any(callbackIsEvenAlt,),).toBeTrue(),)
                    test("odd",  () => expect(new instance(A,).any(callbackIsOddAlt,),).toBeFalse(),)
                    test('0',    () => expect(new instance(A,).any(callbackIs0Alt,),).toBeTrue(),)
                    test('4',    () => expect(new instance(A,).any(callbackIs4Alt,),).toBeFalse(),)
                },)
                describe("2 fields", () => {
                    test('a',    () => expect(new instance(AB,).any(callbackIsA,),).toBeTrue(),)
                    test('b',    () => expect(new instance(AB,).any(callbackIsB,),).toBeTrue(),)
                    test('e',    () => expect(new instance(AB,).any(callbackIsE,),).toBeFalse(),)
                    test("even", () => expect(new instance(AB,).any(callbackIsEvenAlt,),).toBeTrue(),)
                    test("odd",  () => expect(new instance(AB,).any(callbackIsOddAlt,),).toBeTrue(),)
                    test('0',    () => expect(new instance(AB,).any(callbackIs0Alt,),).toBeTrue(),)
                    test('1',    () => expect(new instance(AB,).any(callbackIs1Alt,),).toBeTrue(),)
                    test('4',    () => expect(new instance(AB,).any(callbackIs4Alt,),).toBeFalse(),)
                },)
                describe("4 fields", () => {
                    test('a',    () => expect(new instance(ABCD,).any(callbackIsA,),).toBeTrue(),)
                    test('b',    () => expect(new instance(ABCD,).any(callbackIsB,),).toBeTrue(),)
                    test('c',    () => expect(new instance(ABCD,).any(callbackIsC,),).toBeTrue(),)
                    test('d',    () => expect(new instance(ABCD,).any(callbackIsD,),).toBeTrue(),)
                    test('e',    () => expect(new instance(ABCD,).any(callbackIsE,),).toBeFalse(),)
                    test("even", () => expect(new instance(ABCD,).any(callbackIsEvenAlt,),).toBeTrue(),)
                    test("odd",  () => expect(new instance(ABCD,).any(callbackIsOddAlt,),).toBeTrue(),)
                    test('0',    () => expect(new instance(ABCD,).any(callbackIs0Alt,),).toBeTrue(),)
                    test('1',    () => expect(new instance(ABCD,).any(callbackIs1Alt,),).toBeTrue(),)
                    test('2',    () => expect(new instance(ABCD,).any(callbackIs2Alt,),).toBeTrue(),)
                    test('3',    () => expect(new instance(ABCD,).any(callbackIs3Alt,),).toBeTrue(),)
                    test('4',    () => expect(new instance(ABCD,).any(callbackIs4Alt,),).toBeFalse(),)
                },)
            },)
        },)
        describe("none", () => {
            describe("no predicate", () => {
                test("empty",    () => expect(new instance(EMPTY,).none(),).toBeTrue(),)
                test("1 field",  () => expect(new instance(A,).none(),).toBeFalse(),)
                test("2 fields", () => expect(new instance(AB,).none(),).toBeFalse(),)
                test("4 fields", () => expect(new instance(ABCD,).none(),).toBeFalse(),)
            },)
            describe.each([null, undefined,],)("null parameter: %s", it => {
                test("empty",    () => expect(new instance(EMPTY,).none(it,),).toBeTrue(),)
                test("1 field",  () => expect(new instance(A,).none(it,),).toBeFalse(),)
                test("2 fields", () => expect(new instance(AB,).none(it,),).toBeFalse(),)
                test("4 fields", () => expect(new instance(ABCD,).none(it,),).toBeFalse(),)
            },)
            describe("with predicate", () => {
                describe("empty", () => {
                    test("0 arguments", () => expect(new instance(EMPTY,).none(callbackAsFail0,),).toBeTrue(),)
                    test("1 argument",  () => expect(new instance(EMPTY,).none(callbackAsFail1,),).toBeTrue(),)
                    test("2 arguments", () => expect(new instance(EMPTY,).none(callbackAsFail2,),).toBeTrue(),)
                },)
                describe("boolean callbacks", () => {
                    describe.each(trueCallbacks,)("true: %s",    ({value: it,},) => {
                        test("1 field",  () => expect(new instance(A,).none(it,),).toBeFalse(),)
                        test("2 fields", () => expect(new instance(AB,).none(it,),).toBeFalse(),)
                        test("4 fields", () => expect(new instance(ABCD,).none(it,),).toBeFalse(),)
                    },)
                    describe.each(falseCallbacks,)("false: %s",    ({value: it,},) => {
                        test("1 field",  () => expect(new instance(A,).none(it,),).toBeTrue(),)
                        test("2 fields", () => expect(new instance(AB,).none(it,),).toBeTrue(),)
                        test("4 fields", () => expect(new instance(ABCD,).none(it,),).toBeTrue(),)
                    },)
                },)
                describe("1 field", () => {
                    test('a',    () => expect(new instance(A,).none(callbackIsA,),).toBeFalse(),)
                    test('e',    () => expect(new instance(A,).none(callbackIsE,),).toBeTrue(),)
                    test("even", () => expect(new instance(A,).none(callbackIsEvenAlt,),).toBeFalse(),)
                    test("odd",  () => expect(new instance(A,).none(callbackIsOddAlt,),).toBeTrue(),)
                    test('0',    () => expect(new instance(A,).none(callbackIs0Alt,),).toBeFalse(),)
                    test('4',    () => expect(new instance(A,).none(callbackIs4Alt,),).toBeTrue(),)
                },)
                describe("2 fields", () => {
                    test('a',    () => expect(new instance(AB,).none(callbackIsA,),).toBeFalse(),)
                    test('b',    () => expect(new instance(AB,).none(callbackIsB,),).toBeFalse(),)
                    test('e',    () => expect(new instance(AB,).none(callbackIsE,),).toBeTrue(),)
                    test("even", () => expect(new instance(AB,).none(callbackIsEvenAlt,),).toBeFalse(),)
                    test("odd",  () => expect(new instance(AB,).none(callbackIsOddAlt,),).toBeFalse(),)
                    test('0',    () => expect(new instance(AB,).none(callbackIs0Alt,),).toBeFalse(),)
                    test('1',    () => expect(new instance(AB,).none(callbackIs1Alt,),).toBeFalse(),)
                    test('4',    () => expect(new instance(AB,).none(callbackIs4Alt,),).toBeTrue(),)
                },)
                describe("4 fields", () => {
                    test('a',    () => expect(new instance(ABCD,).none(callbackIsA,),).toBeFalse(),)
                    test('b',    () => expect(new instance(ABCD,).none(callbackIsB,),).toBeFalse(),)
                    test('c',    () => expect(new instance(ABCD,).none(callbackIsC,),).toBeFalse(),)
                    test('d',    () => expect(new instance(ABCD,).none(callbackIsD,),).toBeFalse(),)
                    test('e',    () => expect(new instance(ABCD,).none(callbackIsE,),).toBeTrue(),)
                    test("even", () => expect(new instance(ABCD,).none(callbackIsEvenAlt,),).toBeFalse(),)
                    test("odd",  () => expect(new instance(ABCD,).none(callbackIsOddAlt,),).toBeFalse(),)
                    test('0',    () => expect(new instance(ABCD,).none(callbackIs0Alt,),).toBeFalse(),)
                    test('1',    () => expect(new instance(ABCD,).none(callbackIs1Alt,),).toBeFalse(),)
                    test('2',    () => expect(new instance(ABCD,).none(callbackIs2Alt,),).toBeFalse(),)
                    test('3',    () => expect(new instance(ABCD,).none(callbackIs3Alt,),).toBeFalse(),)
                    test('4',    () => expect(new instance(ABCD,).none(callbackIs4Alt,),).toBeTrue(),)
                },)
            },)
        },)
    },)

},)
