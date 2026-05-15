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

import {CollectionHolder_AdaptorOfArrayFollower}                                                                             from "./instance/CollectionHolder_AdaptorOfArray.follower"
import {CollectionHolder_ArrayOf1Follower}                                                                                   from "./instance/CollectionHolder_ArrayOf1.follower"
import {CollectionHolder_ArrayOf2Follower}                                                                                   from "./instance/CollectionHolder_ArrayOf2.follower"
import {CollectionHolder_1Follower}                                                                                          from "./instance/CollectionHolder_1.follower"
import {CollectionHolder_2Follower}                                                                                          from "./instance/CollectionHolder_2.follower"
import {CollectionHolder_ByViewerFollower}                                                                                   from "./instance/CollectionHolder_ByViewer.follower"
import {CollectionHolder_ByGenericCollectionFollower}                                                                        from "./instance/CollectionHolder_ByGenericCollection.follower"
import {CollectionHolder_AdaptorOfIteratorFollower}                                                                          from "./instance/CollectionHolder_AdaptorOfIterator.follower"
import {CollectionHolder_AdaptorOfJsIteratorFollower}                                                                        from "./instance/CollectionHolder_AdaptorOfJsIterator.follower"
import {CollectionHolder_AdaptorOfJsIterableFollower}                                                                        from "./instance/CollectionHolder_AdaptorOfJsIterable.follower"
import {CollectionHolder_LazyFollower}                                                                                       from "./instance/CollectionHolder_Lazy.follower"
import {CollectionHolder_LazyOf0Or1Follower}                                                                                 from "./instance/CollectionHolder_LazyOf0Or1.follower"
import {CollectionHolder_LazyOf0Or1Or2Follower}                                                                              from "./instance/CollectionHolder_LazyOf0Or1Or2.follower"
import {CollectionHolder_LazyOf1Follower}                                                                                    from "./instance/CollectionHolder_LazyOf1.follower"
import {CollectionHolder_LazyOf1Or2Follower}                                                                                 from "./instance/CollectionHolder_LazyOf1Or2.follower"
import {CollectionHolder_LazyOf2Follower}                                                                                    from "./instance/CollectionHolder_LazyOf2.follower"
import {CollectionHolder_AdaptorOfMinimalistFollower}                                                                        from "./instance/CollectionHolder_AdaptorOfMinimalist.follower"
import {CollectionHolder_AdaptorOfSetFollower}                                                                               from "./instance/CollectionHolder_AdaptorOfSet.follower"
import {CollectionHolder_SetOf1Follower}                                                                                     from "./instance/CollectionHolder_SetOf1.follower"
import {CollectionHolder_SetOf2Follower}                                                                                     from "./instance/CollectionHolder_SetOf2.follower"
import {A, AB, ABCD, EMPTY, NULL_UNDEFINED}                                                                                  from "./value/arrays"
import {callbackAsFalse0, callbackAsFalse1, callbackAsFalse2, callbackAsTrue0, callbackAsTrue1, callbackAsTrue2}             from "./value/callbacks (boolean)"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                   from "./value/callbacks (fail)"
import {callbackIs0Alt, callbackIs1Alt, callbackIs2Alt, callbackIs3Alt, callbackIs4Alt, callbackIsEvenAlt, callbackIsOddAlt} from "./value/callbacks (number)"
import {callbackIsA, callbackIsB, callbackIsC, callbackIsD, callbackIsE}                                                     from "./value/callbacks (string)"
import {everyExtensionMethodInstances, everyInstances}                                                                       from "./value/instances"

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
        describe("ArrayAsCollectionHolder", () => {
            test("every", () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("ArrayOf1AsCollectionHolder", () => {
            test("every", () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("ArrayOf2AsCollectionHolder", () => {
            test("every", () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("CollectionHolderOf1", () => {
            test("every", () => expect(new CollectionHolder_1Follower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_1Follower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("CollectionHolderOf2", () => {
            test("every", () => expect(new CollectionHolder_2Follower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_2Follower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("CollectionViewer", () => {
            test("every", () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("GenericCollectionHolder", () => {
            test("every", () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("IteratorAsCollectionHolder", () => {
            test("every", () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("JsIterableAsCollectionHolder", () => {
            test("every", () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("JsIteratorAsCollectionHolder", () => {
            test("every", () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolder", () => {
            test("every", () => expect(new CollectionHolder_LazyFollower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_LazyFollower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf0Or1", () => {
            test("every", () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf0Or1Or2", () => {
            test("every", () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf1", () => {
            test("every", () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf1Or2", () => {
            test("every", () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf2", () => {
            test("every", () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("MinimalistAsCollectionHolder", () => {
            test("every", () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("SetAsCollectionHolder", () => {
            test("every", () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("SetOf1AsCollectionHolder", () => {
            test("every", () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)
        describe("SetOf2AsCollectionHolder", () => {
            test("every", () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.every(callbackAsFalse0,),).all_amountOfCall,).toBe(1,),)
            test("some",  () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.some(callbackAsFalse0,),).any_amountOfCall,).toBe(1,),)
        },)

        describe("every", () => {
            test("all", () => {
                const method = jest.spyOn(allModule, "all",)
                every(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(allModule, "allByMinimalistCollectionHolder",)
                everyByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(allModule, "allByCollectionHolder",)
                everyByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(allModule, "allByArray",)
                everyByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("some", () => {
            test("all", () => {
                const method = jest.spyOn(anyModule, "any",)
                some(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(anyModule, "anyByMinimalistCollectionHolder",)
                someByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(anyModule, "anyByCollectionHolder",)
                someByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(anyModule, "anyByArray",)
                someByArray(null, callbackAsTrue0,)
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
                test("1 field: (T, number) → true",   () => expect(new instance(A,)   .all(callbackAsTrue2,),) .toBeTrue(),)
                test("1 field: (T) → true",           () => expect(new instance(A,)   .all(callbackAsTrue1,),) .toBeTrue(),)
                test("1 field: () → true",            () => expect(new instance(A,)   .all(callbackAsTrue0,),) .toBeTrue(),)
                test("1 field: (T, number) → false",  () => expect(new instance(A,)   .all(callbackAsFalse2,),).toBeFalse(),)
                test("1 field: (T) → false",          () => expect(new instance(A,)   .all(callbackAsFalse1,),).toBeFalse(),)
                test("1 field: () → false",           () => expect(new instance(A,)   .all(callbackAsFalse0,),).toBeFalse(),)
                test("2 fields: (T, number) → true",  () => expect(new instance(AB,)  .all(callbackAsTrue2,),) .toBeTrue(),)
                test("2 fields: (T) → true",          () => expect(new instance(AB,)  .all(callbackAsTrue1,),) .toBeTrue(),)
                test("2 fields: () → true",           () => expect(new instance(AB,)  .all(callbackAsTrue0,),) .toBeTrue(),)
                test("2 fields: (T, number) → false", () => expect(new instance(AB,)  .all(callbackAsFalse2,),).toBeFalse(),)
                test("2 fields: (T) → false",         () => expect(new instance(AB,)  .all(callbackAsFalse1,),).toBeFalse(),)
                test("2 fields: () → false",          () => expect(new instance(AB,)  .all(callbackAsFalse0,),).toBeFalse(),)
                test("4 fields: (T, number) → true",  () => expect(new instance(ABCD,).all(callbackAsTrue2,),) .toBeTrue(),)
                test("4 fields: (T) → true",          () => expect(new instance(ABCD,).all(callbackAsTrue1,),) .toBeTrue(),)
                test("4 fields: () → true",           () => expect(new instance(ABCD,).all(callbackAsTrue0,),) .toBeTrue(),)
                test("4 fields: (T, number) → false", () => expect(new instance(ABCD,).all(callbackAsFalse2,),).toBeFalse(),)
                test("4 fields: (T) → false",         () => expect(new instance(ABCD,).all(callbackAsFalse1,),).toBeFalse(),)
                test("4 fields: () → false",          () => expect(new instance(ABCD,).all(callbackAsFalse0,),).toBeFalse(),)
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
                    test("1 field: (T, number) → true",   () => expect(new instance(A,)   .any(callbackAsTrue2,),) .toBeTrue(),)
                    test("1 field: (T) → true",           () => expect(new instance(A,)   .any(callbackAsTrue1,),) .toBeTrue(),)
                    test("1 field: () → true",            () => expect(new instance(A,)   .any(callbackAsTrue0,),) .toBeTrue(),)
                    test("1 field: (T, number) → false",  () => expect(new instance(A,)   .any(callbackAsFalse2,),).toBeFalse(),)
                    test("1 field: (T) → false",          () => expect(new instance(A,)   .any(callbackAsFalse1,),).toBeFalse(),)
                    test("1 field: () → false",           () => expect(new instance(A,)   .any(callbackAsFalse0,),).toBeFalse(),)
                    test("2 fields: (T, number) → true",  () => expect(new instance(AB,)  .any(callbackAsTrue2,),) .toBeTrue(),)
                    test("2 fields: (T) → true",          () => expect(new instance(AB,)  .any(callbackAsTrue1,),) .toBeTrue(),)
                    test("2 fields: () → true",           () => expect(new instance(AB,)  .any(callbackAsTrue0,),) .toBeTrue(),)
                    test("2 fields: (T, number) → false", () => expect(new instance(AB,)  .any(callbackAsFalse2,),).toBeFalse(),)
                    test("2 fields: (T) → false",         () => expect(new instance(AB,)  .any(callbackAsFalse1,),).toBeFalse(),)
                    test("2 fields: () → false",          () => expect(new instance(AB,)  .any(callbackAsFalse0,),).toBeFalse(),)
                    test("4 fields: (T, number) → true",  () => expect(new instance(ABCD,).any(callbackAsTrue2,),) .toBeTrue(),)
                    test("4 fields: (T) → true",          () => expect(new instance(ABCD,).any(callbackAsTrue1,),) .toBeTrue(),)
                    test("4 fields: () → true",           () => expect(new instance(ABCD,).any(callbackAsTrue0,),) .toBeTrue(),)
                    test("4 fields: (T, number) → false", () => expect(new instance(ABCD,).any(callbackAsFalse2,),).toBeFalse(),)
                    test("4 fields: (T) → false",         () => expect(new instance(ABCD,).any(callbackAsFalse1,),).toBeFalse(),)
                    test("4 fields: () → false",          () => expect(new instance(ABCD,).any(callbackAsFalse0,),).toBeFalse(),)
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
                    test("1 field: (T, number) → true",   () => expect(new instance(A,)   .none(callbackAsTrue2,),) .toBeFalse(),)
                    test("1 field: (T) → true",           () => expect(new instance(A,)   .none(callbackAsTrue1,),) .toBeFalse(),)
                    test("1 field: () → true",            () => expect(new instance(A,)   .none(callbackAsTrue0,),) .toBeFalse(),)
                    test("1 field: (T, number) → false",  () => expect(new instance(A,)   .none(callbackAsFalse2,),).toBeTrue(),)
                    test("1 field: (T) → false",          () => expect(new instance(A,)   .none(callbackAsFalse1,),).toBeTrue(),)
                    test("1 field: () → false",           () => expect(new instance(A,)   .none(callbackAsFalse0,),).toBeTrue(),)
                    test("2 fields: (T, number) → true",  () => expect(new instance(AB,)  .none(callbackAsTrue2,),) .toBeFalse(),)
                    test("2 fields: (T) → true",          () => expect(new instance(AB,)  .none(callbackAsTrue1,),) .toBeFalse(),)
                    test("2 fields: () → true",           () => expect(new instance(AB,)  .none(callbackAsTrue0,),) .toBeFalse(),)
                    test("2 fields: (T, number) → false", () => expect(new instance(AB,)  .none(callbackAsFalse2,),).toBeTrue(),)
                    test("2 fields: (T) → false",         () => expect(new instance(AB,)  .none(callbackAsFalse1,),).toBeTrue(),)
                    test("2 fields: () → false",          () => expect(new instance(AB,)  .none(callbackAsFalse0,),).toBeTrue(),)
                    test("4 fields: (T, number) → true",  () => expect(new instance(ABCD,).none(callbackAsTrue2,),) .toBeFalse(),)
                    test("4 fields: (T) → true",          () => expect(new instance(ABCD,).none(callbackAsTrue1,),) .toBeFalse(),)
                    test("4 fields: () → true",           () => expect(new instance(ABCD,).none(callbackAsTrue0,),) .toBeFalse(),)
                    test("4 fields: (T, number) → false", () => expect(new instance(ABCD,).none(callbackAsFalse2,),).toBeTrue(),)
                    test("4 fields: (T) → false",         () => expect(new instance(ABCD,).none(callbackAsFalse1,),).toBeTrue(),)
                    test("4 fields: () → false",          () => expect(new instance(ABCD,).none(callbackAsFalse0,),).toBeTrue(),)
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
