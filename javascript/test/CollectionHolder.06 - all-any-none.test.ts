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

import {CollectionHolderFromArray}                                                                                                              from "./instance/CollectionHolderFromArray"
import {GenericCollectionHolder_AllAlias}                                                                                                       from "./instance/GenericCollectionHolder_AllAlias"
import {GenericCollectionHolder_AnyAlias}                                                                                                       from "./instance/GenericCollectionHolder_AnyAlias"
import {LazyGenericCollectionHolder_AnyAlias}                                                                                                   from "./instance/LazyGenericCollectionHolder_AnyAlias"
import {LazyGenericCollectionHolder_AllAlias}                                                                                                   from "./instance/LazyGenericCollectionHolder_AllAlias"
import {A, AB, ABCD, EMPTY, NULL_UNDEFINED}                                                                                                     from "./value/arrays"
import {callbackAsFalse0, callbackAsFalse1, callbackAsFalse2, callbackAsTrue0, callbackAsTrue1, callbackAsTrue2, falseCallbacks, trueCallbacks} from "./value/callbacks (boolean)"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                                      from "./value/callbacks (fail)"
import {callbackIs0Alt, callbackIs1Alt, callbackIs2Alt, callbackIs3Alt, callbackIs4Alt, callbackIsEvenAlt, callbackIsOddAlt}                    from "./value/callbacks (number)"
import {callbackIsA, callbackIsB, callbackIsC, callbackIsD, callbackIsE}                                                                        from "./value/callbacks (string)"
import {everyExtensionMethodInstances, everyInstances}                                                                                          from "./value/instances"

import {EmptyCollectionHolder}                                                           from "../src/EmptyCollectionHolder"
import * as allModule                                                                    from "../src/method/all"
import * as anyModule                                                                    from "../src/method/any"
import {every, everyByArray, everyByCollectionHolder, everyByMinimalistCollectionHolder} from "../src/method/every"
import {some, someByArray, someByCollectionHolder, someByMinimalistCollectionHolder}     from "../src/method/some"

describe("CollectionHolderTest (all / any / none)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("all",   () => expect(instance.all(),).toBeTrue(),)
        test("every", () => expect(instance.every(),).toBeTrue(),)
        test("any",   () => expect(instance.any(),).toBeFalse(),)
        test("some",  () => expect(instance.some(),).toBeFalse(),)
        test("every", () => expect(instance.none(),).toBeTrue(),)
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

        describe("every", () => {
            test("all", () => {
                const method = jest.spyOn(allModule, "all",)
                every(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(allModule, "allByMinimalistCollectionHolder",)
                everyByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(allModule, "allByCollectionHolder",)
                everyByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(allModule, "allByArray",)
                everyByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("some", () => {
            test("all", () => {
                const method = jest.spyOn(anyModule, "any",)
                some(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(anyModule, "anyByMinimalistCollectionHolder",)
                someByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(anyModule, "anyByCollectionHolder",)
                someByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(anyModule, "anyByArray",)
                someByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance,},},) => {
        test("all", () => expect(instance.all(callbackAsFail0,),).toBeTrue(),)
        test("any", () => expect(instance.any(),).toBeFalse(),)
        test("none", () => expect(instance.none(),).toBeTrue(),)
    },)},)

    describe("instances", () => {
    describe.each(everyInstances,)("%s", ({value: {instance,},},) => {
        describe("get() being called", () => {
            describe("all", () => {
                test("(T, number) → true",  () => expect(new instance(AB,).execute(it => it.all(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(T) → true",          () => expect(new instance(AB,).execute(it => it.all(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new instance(AB,).execute(it => it.all(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new instance(AB,).execute(it => it.all(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new instance(AB,).execute(it => it.all(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new instance(AB,).execute(it => it.all(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("any", () => {
                test('∅',                   () => expect(new instance(AB,).execute(it => it.any(),)                 .amountOfCall,).toBe(0,),)
                test("(T, number) → true",  () => expect(new instance(AB,).execute(it => it.any(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(T) → true",          () => expect(new instance(AB,).execute(it => it.any(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new instance(AB,).execute(it => it.any(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new instance(AB,).execute(it => it.any(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(T) → false",         () => expect(new instance(AB,).execute(it => it.any(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("() → false",          () => expect(new instance(AB,).execute(it => it.any(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("none", () => {
                test('∅',                   () => expect(new instance(AB,).execute(it => it.none(),)                 .amountOfCall,).toBe(0,),)
                test("(T, number) → true",  () => expect(new instance(AB,).execute(it => it.none(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(T) → true",          () => expect(new instance(AB,).execute(it => it.none(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new instance(AB,).execute(it => it.none(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new instance(AB,).execute(it => it.none(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(T) → false",         () => expect(new instance(AB,).execute(it => it.none(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("() → false",          () => expect(new instance(AB,).execute(it => it.none(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
        },)

        describe("all", () => {
            describe("empty", () => {
                test("(T, number) → boolean", () => expect(new instance(EMPTY,).all(callbackAsFail2,),).toBeTrue(),)
                test("(T) → boolean",         () => expect(new instance(EMPTY,).all(callbackAsFail1,),).toBeTrue(),)
                test("() → boolean",          () => expect(new instance(EMPTY,).all(callbackAsFail0,),).toBeTrue(),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).all(it,),).toBeTrue(),)
                    test("2 fields", () => expect(new instance(AB,).all(it,),).toBeTrue(),)
                    test("4 fields", () => expect(new instance(ABCD,).all(it,),).toBeTrue(),)
                },)
                describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).all(it,),).toBeFalse(),)
                    test("2 fields", () => expect(new instance(AB,).all(it,),).toBeFalse(),)
                    test("4 fields", () => expect(new instance(ABCD,).all(it,),).toBeFalse(),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).all(callbackIsA,),)      .toBeTrue(),)
                test('e',    () => expect(new instance(A,).all(callbackIsE,),)      .toBeFalse(),)
                test("even", () => expect(new instance(A,).all(callbackIsEvenAlt,),).toBeTrue(),)
                test("odd",  () => expect(new instance(A,).all(callbackIsOddAlt,),) .toBeFalse(),)
                test('0',    () => expect(new instance(A,).all(callbackIs0Alt,),)   .toBeTrue(),)
                test('4',    () => expect(new instance(A,).all(callbackIs4Alt,),)   .toBeFalse(),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).all(callbackIsA,),)      .toBeFalse(),)
                test('b',    () => expect(new instance(AB,).all(callbackIsB,),)      .toBeFalse(),)
                test('e',    () => expect(new instance(AB,).all(callbackIsE,),)      .toBeFalse(),)
                test("even", () => expect(new instance(AB,).all(callbackIsEvenAlt,),).toBeFalse(),)
                test("odd",  () => expect(new instance(AB,).all(callbackIsOddAlt,),) .toBeFalse(),)
                test('0',    () => expect(new instance(AB,).all(callbackIs0Alt,),)   .toBeFalse(),)
                test('1',    () => expect(new instance(AB,).all(callbackIs1Alt,),)   .toBeFalse(),)
                test('4',    () => expect(new instance(AB,).all(callbackIs4Alt,),)   .toBeFalse(),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).all(callbackIsA,),)      .toBeFalse(),)
                test('b',    () => expect(new instance(ABCD,).all(callbackIsB,),)      .toBeFalse(),)
                test('c',    () => expect(new instance(ABCD,).all(callbackIsC,),)      .toBeFalse(),)
                test('d',    () => expect(new instance(ABCD,).all(callbackIsD,),)      .toBeFalse(),)
                test('e',    () => expect(new instance(ABCD,).all(callbackIsE,),)      .toBeFalse(),)
                test("even", () => expect(new instance(ABCD,).all(callbackIsEvenAlt,),).toBeFalse(),)
                test("odd",  () => expect(new instance(ABCD,).all(callbackIsOddAlt,),) .toBeFalse(),)
                test('0',    () => expect(new instance(ABCD,).all(callbackIs0Alt,),)   .toBeFalse(),)
                test('1',    () => expect(new instance(ABCD,).all(callbackIs1Alt,),)   .toBeFalse(),)
                test('2',    () => expect(new instance(ABCD,).all(callbackIs2Alt,),)   .toBeFalse(),)
                test('3',    () => expect(new instance(ABCD,).all(callbackIs3Alt,),)   .toBeFalse(),)
                test('4',    () => expect(new instance(ABCD,).all(callbackIs4Alt,),)   .toBeFalse(),)
            },)
        },)
        describe("any", () => {
            describe("no predicate", () => {
                test("empty",    () => expect(new instance(EMPTY,).any(),).toBeFalse(),)
                test("1 field",  () => expect(new instance(A,)    .any(),).toBeTrue(),)
                test("2 fields", () => expect(new instance(AB,)   .any(),).toBeTrue(),)
                test("4 fields", () => expect(new instance(ABCD,) .any(),).toBeTrue(),)
            },)
            describe.each(NULL_UNDEFINED,)("null predicate: %s", it => {
                test("empty",    () => expect(new instance(EMPTY,).any(it,),).toBeFalse(),)
                test("1 field",  () => expect(new instance(A,)    .any(it,),).toBeTrue(),)
                test("2 fields", () => expect(new instance(AB,)   .any(it,),).toBeTrue(),)
                test("4 fields", () => expect(new instance(ABCD,) .any(it,),).toBeTrue(),)
            },)
            describe("with predicate", () => {
                describe("empty", () => {
                    test("(T, number) → boolean", () => expect(new instance(EMPTY,).any(callbackAsFail2,),).toBeFalse(),)
                    test("(T) → boolean",         () => expect(new instance(EMPTY,).any(callbackAsFail1,),).toBeFalse(),)
                    test("() → boolean",          () => expect(new instance(EMPTY,).any(callbackAsFail0,),).toBeFalse(),)
                },)
                describe("boolean callbacks", () => {
                    describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                        test("1 field",  () => expect(new instance(A,).any(it,),).toBeTrue(),)
                        test("2 fields", () => expect(new instance(AB,).any(it,),).toBeTrue(),)
                        test("4 fields", () => expect(new instance(ABCD,).any(it,),).toBeTrue(),)
                    },)
                    describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                        test("1 field",  () => expect(new instance(A,).any(it,),).toBeFalse(),)
                        test("2 fields", () => expect(new instance(AB,).any(it,),).toBeFalse(),)
                        test("4 fields", () => expect(new instance(ABCD,).any(it,),).toBeFalse(),)
                    },)
                },)
                describe("1 field", () => {
                    test('a',    () => expect(new instance(A,).any(callbackIsA,),)      .toBeTrue(),)
                    test('e',    () => expect(new instance(A,).any(callbackIsE,),)      .toBeFalse(),)
                    test("even", () => expect(new instance(A,).any(callbackIsEvenAlt,),).toBeTrue(),)
                    test("odd",  () => expect(new instance(A,).any(callbackIsOddAlt,),) .toBeFalse(),)
                    test('0',    () => expect(new instance(A,).any(callbackIs0Alt,),)   .toBeTrue(),)
                    test('4',    () => expect(new instance(A,).any(callbackIs4Alt,),)   .toBeFalse(),)
                },)
                describe("2 fields", () => {
                    test('a',    () => expect(new instance(AB,).any(callbackIsA,),)      .toBeTrue(),)
                    test('b',    () => expect(new instance(AB,).any(callbackIsB,),)      .toBeTrue(),)
                    test('e',    () => expect(new instance(AB,).any(callbackIsE,),)      .toBeFalse(),)
                    test("even", () => expect(new instance(AB,).any(callbackIsEvenAlt,),).toBeTrue(),)
                    test("odd",  () => expect(new instance(AB,).any(callbackIsOddAlt,),) .toBeTrue(),)
                    test('0',    () => expect(new instance(AB,).any(callbackIs0Alt,),)   .toBeTrue(),)
                    test('1',    () => expect(new instance(AB,).any(callbackIs1Alt,),)   .toBeTrue(),)
                    test('4',    () => expect(new instance(AB,).any(callbackIs4Alt,),)   .toBeFalse(),)
                },)
                describe("4 fields", () => {
                    test('a',    () => expect(new instance(ABCD,).any(callbackIsA,),)      .toBeTrue(),)
                    test('b',    () => expect(new instance(ABCD,).any(callbackIsB,),)      .toBeTrue(),)
                    test('c',    () => expect(new instance(ABCD,).any(callbackIsC,),)      .toBeTrue(),)
                    test('d',    () => expect(new instance(ABCD,).any(callbackIsD,),)      .toBeTrue(),)
                    test('e',    () => expect(new instance(ABCD,).any(callbackIsE,),)      .toBeFalse(),)
                    test("even", () => expect(new instance(ABCD,).any(callbackIsEvenAlt,),).toBeTrue(),)
                    test("odd",  () => expect(new instance(ABCD,).any(callbackIsOddAlt,),) .toBeTrue(),)
                    test('0',    () => expect(new instance(ABCD,).any(callbackIs0Alt,),)   .toBeTrue(),)
                    test('1',    () => expect(new instance(ABCD,).any(callbackIs1Alt,),)   .toBeTrue(),)
                    test('2',    () => expect(new instance(ABCD,).any(callbackIs2Alt,),)   .toBeTrue(),)
                    test('3',    () => expect(new instance(ABCD,).any(callbackIs3Alt,),)   .toBeTrue(),)
                    test('4',    () => expect(new instance(ABCD,).any(callbackIs4Alt,),)   .toBeFalse(),)
                },)
            },)
        },)
        describe("none", () => {
            describe("no predicate", () => {
                test("empty",    () => expect(new instance(EMPTY,).none(),).toBeTrue(),)
                test("1 field",  () => expect(new instance(A,)    .none(),).toBeFalse(),)
                test("2 fields", () => expect(new instance(AB,)   .none(),).toBeFalse(),)
                test("4 fields", () => expect(new instance(ABCD,) .none(),).toBeFalse(),)
            },)
            describe.each(NULL_UNDEFINED,)("null predicate: %s", it => {
                test("empty",    () => expect(new instance(EMPTY,).none(it,),).toBeTrue(),)
                test("1 field",  () => expect(new instance(A,)    .none(it,),).toBeFalse(),)
                test("2 fields", () => expect(new instance(AB,)   .none(it,),).toBeFalse(),)
                test("4 fields", () => expect(new instance(ABCD,) .none(it,),).toBeFalse(),)
            },)
            describe("with predicate", () => {
                describe("empty", () => {
                    test("(T, number) → boolean", () => expect(new instance(EMPTY,).none(callbackAsFail2,),).toBeTrue(),)
                    test("(T) → boolean",         () => expect(new instance(EMPTY,).none(callbackAsFail1,),).toBeTrue(),)
                    test("() → boolean",          () => expect(new instance(EMPTY,).none(callbackAsFail0,),).toBeTrue(),)
                },)
                describe("boolean callbacks", () => {
                    describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                        test("1 field",  () => expect(new instance(A,).none(it,),).toBeFalse(),)
                        test("2 fields", () => expect(new instance(AB,).none(it,),).toBeFalse(),)
                        test("4 fields", () => expect(new instance(ABCD,).none(it,),).toBeFalse(),)
                    },)
                    describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                        test("1 field",  () => expect(new instance(A,).none(it,),).toBeTrue(),)
                        test("2 fields", () => expect(new instance(AB,).none(it,),).toBeTrue(),)
                        test("4 fields", () => expect(new instance(ABCD,).none(it,),).toBeTrue(),)
                    },)
                },)
                describe("1 field", () => {
                    test('a',    () => expect(new instance(A,).none(callbackIsA,),)      .toBeFalse(),)
                    test('e',    () => expect(new instance(A,).none(callbackIsE,),)      .toBeTrue(),)
                    test("even", () => expect(new instance(A,).none(callbackIsEvenAlt,),).toBeFalse(),)
                    test("odd",  () => expect(new instance(A,).none(callbackIsOddAlt,),) .toBeTrue(),)
                    test('0',    () => expect(new instance(A,).none(callbackIs0Alt,),)   .toBeFalse(),)
                    test('4',    () => expect(new instance(A,).none(callbackIs4Alt,),)   .toBeTrue(),)
                },)
                describe("2 fields", () => {
                    test('a',    () => expect(new instance(AB,).none(callbackIsA,),)      .toBeFalse(),)
                    test('b',    () => expect(new instance(AB,).none(callbackIsB,),)      .toBeFalse(),)
                    test('e',    () => expect(new instance(AB,).none(callbackIsE,),)      .toBeTrue(),)
                    test("even", () => expect(new instance(AB,).none(callbackIsEvenAlt,),).toBeFalse(),)
                    test("odd",  () => expect(new instance(AB,).none(callbackIsOddAlt,),) .toBeFalse(),)
                    test('0',    () => expect(new instance(AB,).none(callbackIs0Alt,),)   .toBeFalse(),)
                    test('1',    () => expect(new instance(AB,).none(callbackIs1Alt,),)   .toBeFalse(),)
                    test('4',    () => expect(new instance(AB,).none(callbackIs4Alt,),)   .toBeTrue(),)
                },)
                describe("4 fields", () => {
                    test('a',    () => expect(new instance(ABCD,).none(callbackIsA,),)      .toBeFalse(),)
                    test('b',    () => expect(new instance(ABCD,).none(callbackIsB,),)      .toBeFalse(),)
                    test('c',    () => expect(new instance(ABCD,).none(callbackIsC,),)      .toBeFalse(),)
                    test('d',    () => expect(new instance(ABCD,).none(callbackIsD,),)      .toBeFalse(),)
                    test('e',    () => expect(new instance(ABCD,).none(callbackIsE,),)      .toBeTrue(),)
                    test("even", () => expect(new instance(ABCD,).none(callbackIsEvenAlt,),).toBeFalse(),)
                    test("odd",  () => expect(new instance(ABCD,).none(callbackIsOddAlt,),) .toBeFalse(),)
                    test('0',    () => expect(new instance(ABCD,).none(callbackIs0Alt,),)   .toBeFalse(),)
                    test('1',    () => expect(new instance(ABCD,).none(callbackIs1Alt,),)   .toBeFalse(),)
                    test('2',    () => expect(new instance(ABCD,).none(callbackIs2Alt,),)   .toBeFalse(),)
                    test('3',    () => expect(new instance(ABCD,).none(callbackIs3Alt,),)   .toBeFalse(),)
                    test('4',    () => expect(new instance(ABCD,).none(callbackIs4Alt,),)   .toBeTrue(),)
                },)
            },)
        },)
    },)},)

},)
