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
import {ABCD}                                                                                                                from "./value/arrays"
import {callbackAsFalse0, callbackAsFalse1, callbackAsFalse2, callbackAsTrue0, callbackAsTrue1, callbackAsTrue2}             from "./value/callbacks (boolean)"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                   from "./value/callbacks (fail)"
import {callbackIs0Alt, callbackIs1Alt, callbackIs2Alt, callbackIs3Alt, callbackIs4Alt, callbackIsEvenAlt, callbackIsOddAlt} from "./value/callbacks (number)"
import {callbackIsA, callbackIsB, callbackIsC, callbackIsD, callbackIsE}                                                     from "./value/callbacks (string)"
import {every0Instances, every1Instances, every2Instances, everyExtensionMethodInstances, everyNInstances}                   from "./value/instances"

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
        describe("empty", () => {
        describe.each(every0Instances,)("%s", ({value: {newInstance, isLazy, isViewer, isAdaptor,},},) => {

            // The adaptor instances are ignored since they do not rely on get() directly
            // The lazy instances are ignored since they are only an encapsulator class
            // The viewer instances are ignored since they do rely on inner instances
            if (!isAdaptor && !isLazy && !isViewer)
                describe("get() being called", () => {
                    describe("all", () => {
                        test("(T, number) → true",  () => expect(newInstance().execute(it => it.all(callbackAsTrue2,),) .amountOfCall,).toBe(0,),)
                        test("(T) → true",          () => expect(newInstance().execute(it => it.all(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                        test("() → true",           () => expect(newInstance().execute(it => it.all(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                        test("(T, number) → false", () => expect(newInstance().execute(it => it.all(callbackAsFalse2,),).amountOfCall,).toBe(0,),)
                        test("(T) → false",         () => expect(newInstance().execute(it => it.all(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("() → false",          () => expect(newInstance().execute(it => it.all(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("any", () => {
                        test('∅',                   () => expect(newInstance().execute(it => it.any(),)                 .amountOfCall,).toBe(0,),)
                        test("(T, number) → true",  () => expect(newInstance().execute(it => it.any(callbackAsTrue2,),) .amountOfCall,).toBe(0,),)
                        test("(T) → true",          () => expect(newInstance().execute(it => it.any(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                        test("() → true",           () => expect(newInstance().execute(it => it.any(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                        test("(T, number) → false", () => expect(newInstance().execute(it => it.any(callbackAsFalse2,),).amountOfCall,).toBe(0,),)
                        test("(T) → false",         () => expect(newInstance().execute(it => it.any(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("() → false",          () => expect(newInstance().execute(it => it.any(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("none", () => {
                        test('∅',                   () => expect(newInstance().execute(it => it.none(),)                 .amountOfCall,).toBe(0,),)
                        test("(T, number) → true",  () => expect(newInstance().execute(it => it.none(callbackAsTrue2,),) .amountOfCall,).toBe(0,),)
                        test("(T) → true",          () => expect(newInstance().execute(it => it.none(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                        test("() → true",           () => expect(newInstance().execute(it => it.none(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                        test("(T, number) → false", () => expect(newInstance().execute(it => it.none(callbackAsFalse2,),).amountOfCall,).toBe(0,),)
                        test("(T) → false",         () => expect(newInstance().execute(it => it.none(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("() → false",          () => expect(newInstance().execute(it => it.none(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                    },)
                },)

            describe("all", () => {
                test("(T, number) → boolean", () => expect(newInstance().all(callbackAsFail2,),).toBeTrue(),)
                test("(T) → boolean",         () => expect(newInstance().all(callbackAsFail1,),).toBeTrue(),)
                test("() → boolean",          () => expect(newInstance().all(callbackAsFail0,),).toBeTrue(),)
            },)
            describe("any", () => {
                test('∅',                     () => expect(newInstance().any(),)                .toBeFalse(),)
                test("null",                  () => expect(newInstance().any(null,),)           .toBeFalse(),)
                test("undefined",             () => expect(newInstance().any(undefined,),)      .toBeFalse(),)
                test("(T, number) → boolean", () => expect(newInstance().any(callbackAsFail2,),).toBeFalse(),)
                test("(T) → boolean",         () => expect(newInstance().any(callbackAsFail1,),).toBeFalse(),)
                test("() → boolean",          () => expect(newInstance().any(callbackAsFail0,),).toBeFalse(),)
            },)
            describe("none", () => {
                test('∅',                     () => expect(newInstance().none(),)                .toBeTrue(),)
                test("null",                  () => expect(newInstance().none(null,),)           .toBeTrue(),)
                test("undefined",             () => expect(newInstance().none(undefined,),)      .toBeTrue(),)
                test("(T, number) → boolean", () => expect(newInstance().none(callbackAsFail2,),).toBeTrue(),)
                test("(T) → boolean",         () => expect(newInstance().none(callbackAsFail1,),).toBeTrue(),)
                test("() → boolean",          () => expect(newInstance().none(callbackAsFail0,),).toBeTrue(),)
            },)

        },)},)
        describe("1 field", () => {
        describe.each(every1Instances,)("%s", ({value: {newInstance, isAdaptor, isLazy, isOf1, isViewer,},},) => {

            // The adaptor instances are ignored since they do not rely on get() directly
            // The lazy instances are ignored since they are only an encapsulator class
            // The instances of 1 are ignored since the get() is never called, it is "get value1" being called
            // The viewer instances are ignored since they do rely on inner instances
            if (!isAdaptor && !isLazy && !isOf1 && !isViewer)
                describe("get() being called", () => {
                    describe("all", () => {
                        test("(T, number) → true",  () => expect(newInstance('a',).execute(it => it.all(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                        test("(T) → true",          () => expect(newInstance('a',).execute(it => it.all(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                        test("() → true",           () => expect(newInstance('a',).execute(it => it.all(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                        test("(T, number) → false", () => expect(newInstance('a',).execute(it => it.all(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                        test("(T) → false",         () => expect(newInstance('a',).execute(it => it.all(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                        test("() → false",          () => expect(newInstance('a',).execute(it => it.all(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("any", () => {
                        test('∅',                   () => expect(newInstance('a',).execute(it => it.any(),)                 .amountOfCall,).toBe(0,),)
                        test("(T, number) → true",  () => expect(newInstance('a',).execute(it => it.any(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                        test("(T) → true",          () => expect(newInstance('a',).execute(it => it.any(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                        test("() → true",           () => expect(newInstance('a',).execute(it => it.any(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                        test("(T, number) → false", () => expect(newInstance('a',).execute(it => it.any(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                        test("(T) → false",         () => expect(newInstance('a',).execute(it => it.any(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                        test("() → false",          () => expect(newInstance('a',).execute(it => it.any(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("none", () => {
                        test('∅',                   () => expect(newInstance('a',).execute(it => it.none(),)                 .amountOfCall,).toBe(0,),)
                        test("(T, number) → true",  () => expect(newInstance('a',).execute(it => it.none(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                        test("(T) → true",          () => expect(newInstance('a',).execute(it => it.none(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                        test("() → true",           () => expect(newInstance('a',).execute(it => it.none(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                        test("(T, number) → false", () => expect(newInstance('a',).execute(it => it.none(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                        test("(T) → false",         () => expect(newInstance('a',).execute(it => it.none(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                        test("() → false",          () => expect(newInstance('a',).execute(it => it.none(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                    },)
                },)

            describe("all", () => {
                test("(T, number) → true",   () => expect(newInstance('a',).all(callbackAsTrue2,),)  .toBeTrue(),)
                test("(T) → true",           () => expect(newInstance('a',).all(callbackAsTrue1,),)  .toBeTrue(),)
                test("() → true",            () => expect(newInstance('a',).all(callbackAsTrue0,),)  .toBeTrue(),)
                test("(T, number) → false",  () => expect(newInstance('a',).all(callbackAsFalse2,),) .toBeFalse(),)
                test("(T) → false",          () => expect(newInstance('a',).all(callbackAsFalse1,),) .toBeFalse(),)
                test("() → false",           () => expect(newInstance('a',).all(callbackAsFalse0,),) .toBeFalse(),)
                test('a',                    () => expect(newInstance('a',).all(callbackIsA,),)      .toBeTrue(),)
                test('e',                    () => expect(newInstance('a',).all(callbackIsE,),)      .toBeFalse(),)
                test("even",                 () => expect(newInstance('a',).all(callbackIsEvenAlt,),).toBeTrue(),)
                test("odd",                  () => expect(newInstance('a',).all(callbackIsOddAlt,),) .toBeFalse(),)
                test('0',                    () => expect(newInstance('a',).all(callbackIs0Alt,),)   .toBeTrue(),)
                test('4',                    () => expect(newInstance('a',).all(callbackIs4Alt,),)   .toBeFalse(),)
            },)
            describe("any", () => {
                test('∅',                    () => expect(newInstance('a',).any(),)                  .toBeTrue(),)
                test("null",                 () => expect(newInstance('a',).any(null,),)             .toBeTrue(),)
                test("undefined",            () => expect(newInstance('a',).any(undefined,),)        .toBeTrue(),)
                test("(T, number) → true",   () => expect(newInstance('a',).any(callbackAsTrue2,),)  .toBeTrue(),)
                test("(T) → true",           () => expect(newInstance('a',).any(callbackAsTrue1,),)  .toBeTrue(),)
                test("() → true",            () => expect(newInstance('a',).any(callbackAsTrue0,),)  .toBeTrue(),)
                test("(T, number) → false",  () => expect(newInstance('a',).any(callbackAsFalse2,),) .toBeFalse(),)
                test("(T) → false",          () => expect(newInstance('a',).any(callbackAsFalse1,),) .toBeFalse(),)
                test("() → false",           () => expect(newInstance('a',).any(callbackAsFalse0,),) .toBeFalse(),)
                test('a',                    () => expect(newInstance('a',).any(callbackIsA,),)      .toBeTrue(),)
                test('e',                    () => expect(newInstance('a',).any(callbackIsE,),)      .toBeFalse(),)
                test("even",                 () => expect(newInstance('a',).any(callbackIsEvenAlt,),).toBeTrue(),)
                test("odd",                  () => expect(newInstance('a',).any(callbackIsOddAlt,),) .toBeFalse(),)
                test('0',                    () => expect(newInstance('a',).any(callbackIs0Alt,),)   .toBeTrue(),)
                test('4',                    () => expect(newInstance('a',).any(callbackIs4Alt,),)   .toBeFalse(),)
            },)
            describe("none", () => {
                test('∅',                    () => expect(newInstance('a',).none(),)                  .toBeFalse(),)
                test("null",                 () => expect(newInstance('a',).none(null,),)             .toBeFalse(),)
                test("undefined",            () => expect(newInstance('a',).none(undefined,),)        .toBeFalse(),)
                test("(T, number) → true",   () => expect(newInstance('a',).none(callbackAsTrue2,),)  .toBeFalse(),)
                test("(T) → true",           () => expect(newInstance('a',).none(callbackAsTrue1,),)  .toBeFalse(),)
                test("() → true",            () => expect(newInstance('a',).none(callbackAsTrue0,),)  .toBeFalse(),)
                test("(T, number) → false",  () => expect(newInstance('a',).none(callbackAsFalse2,),) .toBeTrue(),)
                test("(T) → false",          () => expect(newInstance('a',).none(callbackAsFalse1,),) .toBeTrue(),)
                test("() → false",           () => expect(newInstance('a',).none(callbackAsFalse0,),) .toBeTrue(),)
                test('a',                    () => expect(newInstance('a',).none(callbackIsA,),)      .toBeFalse(),)
                test('e',                    () => expect(newInstance('a',).none(callbackIsE,),)      .toBeTrue(),)
                test("even",                 () => expect(newInstance('a',).none(callbackIsEvenAlt,),).toBeFalse(),)
                test("odd",                  () => expect(newInstance('a',).none(callbackIsOddAlt,),) .toBeTrue(),)
                test('0',                    () => expect(newInstance('a',).none(callbackIs0Alt,),)   .toBeFalse(),)
                test('4',                    () => expect(newInstance('a',).none(callbackIs4Alt,),)   .toBeTrue(),)
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
                    describe("all", () => {
                        test("(T, number) → true",  () => expect(newInstance('a', 'b',).execute(it => it.all(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                        test("(T) → true",          () => expect(newInstance('a', 'b',).execute(it => it.all(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                        test("() → true",           () => expect(newInstance('a', 'b',).execute(it => it.all(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                        test("(T, number) → false", () => expect(newInstance('a', 'b',).execute(it => it.all(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                        test("(T) → false",         () => expect(newInstance('a', 'b',).execute(it => it.all(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                        test("() → false",          () => expect(newInstance('a', 'b',).execute(it => it.all(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("any", () => {
                        test('∅',                   () => expect(newInstance('a', 'b',).execute(it => it.any(),)                 .amountOfCall,).toBe(0,),)
                        test("(T, number) → true",  () => expect(newInstance('a', 'b',).execute(it => it.any(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                        test("(T) → true",          () => expect(newInstance('a', 'b',).execute(it => it.any(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                        test("() → true",           () => expect(newInstance('a', 'b',).execute(it => it.any(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                        test("(T, number) → false", () => expect(newInstance('a', 'b',).execute(it => it.any(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                        test("(T) → false",         () => expect(newInstance('a', 'b',).execute(it => it.any(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                        test("() → false",          () => expect(newInstance('a', 'b',).execute(it => it.any(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("none", () => {
                        test('∅',                   () => expect(newInstance('a', 'b',).execute(it => it.none(),)                 .amountOfCall,).toBe(0,),)
                        test("(T, number) → true",  () => expect(newInstance('a', 'b',).execute(it => it.none(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                        test("(T) → true",          () => expect(newInstance('a', 'b',).execute(it => it.none(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                        test("() → true",           () => expect(newInstance('a', 'b',).execute(it => it.none(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                        test("(T, number) → false", () => expect(newInstance('a', 'b',).execute(it => it.none(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                        test("(T) → false",         () => expect(newInstance('a', 'b',).execute(it => it.none(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                        test("() → false",          () => expect(newInstance('a', 'b',).execute(it => it.none(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                    },)
                },)

            describe("all", () => {
                test("(T, number) → true",  () => expect(newInstance('a', 'b',).all(callbackAsTrue2,),)  .toBeTrue(),)
                test("(T) → true",          () => expect(newInstance('a', 'b',).all(callbackAsTrue1,),)  .toBeTrue(),)
                test("() → true",           () => expect(newInstance('a', 'b',).all(callbackAsTrue0,),)  .toBeTrue(),)
                test("(T, number) → false", () => expect(newInstance('a', 'b',).all(callbackAsFalse2,),) .toBeFalse(),)
                test("(T) → false",         () => expect(newInstance('a', 'b',).all(callbackAsFalse1,),) .toBeFalse(),)
                test("() → false",          () => expect(newInstance('a', 'b',).all(callbackAsFalse0,),) .toBeFalse(),)
                test("(T, number) → true",  () => expect(newInstance('a', 'b',).all(callbackAsTrue2,),)  .toBeTrue(),)
                test("(T) → true",          () => expect(newInstance('a', 'b',).all(callbackAsTrue1,),)  .toBeTrue(),)
                test("() → true",           () => expect(newInstance('a', 'b',).all(callbackAsTrue0,),)  .toBeTrue(),)
                test("(T, number) → false", () => expect(newInstance('a', 'b',).all(callbackAsFalse2,),) .toBeFalse(),)
                test("(T) → false",         () => expect(newInstance('a', 'b',).all(callbackAsFalse1,),) .toBeFalse(),)
                test("() → false",          () => expect(newInstance('a', 'b',).all(callbackAsFalse0,),) .toBeFalse(),)
                test('a',                   () => expect(newInstance('a', 'b',).all(callbackIsA,),)      .toBeFalse(),)
                test('b',                   () => expect(newInstance('a', 'b',).all(callbackIsB,),)      .toBeFalse(),)
                test('e',                   () => expect(newInstance('a', 'b',).all(callbackIsE,),)      .toBeFalse(),)
                test("even",                () => expect(newInstance('a', 'b',).all(callbackIsEvenAlt,),).toBeFalse(),)
                test("odd",                 () => expect(newInstance('a', 'b',).all(callbackIsOddAlt,),) .toBeFalse(),)
                test('0',                   () => expect(newInstance('a', 'b',).all(callbackIs0Alt,),)   .toBeFalse(),)
                test('1',                   () => expect(newInstance('a', 'b',).all(callbackIs1Alt,),)   .toBeFalse(),)
                test('4',                   () => expect(newInstance('a', 'b',).all(callbackIs4Alt,),)   .toBeFalse(),)
            },)
            describe("any", () => {
                test('∅',                   () => expect(newInstance('a', 'b',).any(),)                  .toBeTrue(),)
                test("null",                () => expect(newInstance('a', 'b',).any(null,),)             .toBeTrue(),)
                test("undefined",           () => expect(newInstance('a', 'b',).any(undefined,),)        .toBeTrue(),)
                test("(T, number) → true",  () => expect(newInstance('a', 'b',).any(callbackAsTrue2,),)  .toBeTrue(),)
                test("(T) → true",          () => expect(newInstance('a', 'b',).any(callbackAsTrue1,),)  .toBeTrue(),)
                test("() → true",           () => expect(newInstance('a', 'b',).any(callbackAsTrue0,),)  .toBeTrue(),)
                test("(T, number) → false", () => expect(newInstance('a', 'b',).any(callbackAsFalse2,),) .toBeFalse(),)
                test("(T) → false",         () => expect(newInstance('a', 'b',).any(callbackAsFalse1,),) .toBeFalse(),)
                test("() → false",          () => expect(newInstance('a', 'b',).any(callbackAsFalse0,),) .toBeFalse(),)
                test('a',                   () => expect(newInstance('a', 'b',).any(callbackIsA,),)      .toBeTrue(),)
                test('b',                   () => expect(newInstance('a', 'b',).any(callbackIsB,),)      .toBeTrue(),)
                test('e',                   () => expect(newInstance('a', 'b',).any(callbackIsE,),)      .toBeFalse(),)
                test("even",                () => expect(newInstance('a', 'b',).any(callbackIsEvenAlt,),).toBeTrue(),)
                test("odd",                 () => expect(newInstance('a', 'b',).any(callbackIsOddAlt,),) .toBeTrue(),)
                test('0',                   () => expect(newInstance('a', 'b',).any(callbackIs0Alt,),)   .toBeTrue(),)
                test('1',                   () => expect(newInstance('a', 'b',).any(callbackIs1Alt,),)   .toBeTrue(),)
                test('4',                   () => expect(newInstance('a', 'b',).any(callbackIs4Alt,),)   .toBeFalse(),)
            },)
            describe("none", () => {
                test('∅',                   () => expect(newInstance('a', 'b',).none(),)                  .toBeFalse(),)
                test("null",                () => expect(newInstance('a', 'b',).none(null,),)             .toBeFalse(),)
                test("undefined",           () => expect(newInstance('a', 'b',).none(undefined,),)        .toBeFalse(),)
                test("(T) → true",          () => expect(newInstance('a', 'b',).none(callbackAsTrue1,),)  .toBeFalse(),)
                test("() → true",           () => expect(newInstance('a', 'b',).none(callbackAsTrue0,),)  .toBeFalse(),)
                test("(T, number) → false", () => expect(newInstance('a', 'b',).none(callbackAsFalse2,),) .toBeTrue(),)
                test("(T) → false",         () => expect(newInstance('a', 'b',).none(callbackAsFalse1,),) .toBeTrue(),)
                test("() → false",          () => expect(newInstance('a', 'b',).none(callbackAsFalse0,),) .toBeTrue(),)
                test('a',                   () => expect(newInstance('a', 'b',).none(callbackIsA,),)      .toBeFalse(),)
                test('b',                   () => expect(newInstance('a', 'b',).none(callbackIsB,),)      .toBeFalse(),)
                test('e',                   () => expect(newInstance('a', 'b',).none(callbackIsE,),)      .toBeTrue(),)
                test("even",                () => expect(newInstance('a', 'b',).none(callbackIsEvenAlt,),).toBeFalse(),)
                test("odd",                 () => expect(newInstance('a', 'b',).none(callbackIsOddAlt,),) .toBeFalse(),)
                test('0',                   () => expect(newInstance('a', 'b',).none(callbackIs0Alt,),)   .toBeFalse(),)
                test('1',                   () => expect(newInstance('a', 'b',).none(callbackIs1Alt,),)   .toBeFalse(),)
                test('4',                   () => expect(newInstance('a', 'b',).none(callbackIs4Alt,),)   .toBeTrue(),)
                },)

        },)},)
        describe("N fields", () => {
        describe.each(everyNInstances,)("%s", ({value: {instance, isAdaptor, isLazy, isViewer,},},) => {

            // The adaptor instances are ignored since they do not rely on get() directly
            // The lazy instances are ignored since they are only an encapsulator class
            // The viewer instances are ignored since they do rely on inner instances
            if (!isAdaptor && !isLazy && !isViewer)
                describe("get() being called", () => {
                    describe("all", () => {
                        test("(T, number) → true",  () => expect(new instance(ABCD,).execute(it => it.all(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                        test("(T) → true",          () => expect(new instance(ABCD,).execute(it => it.all(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                        test("() → true",           () => expect(new instance(ABCD,).execute(it => it.all(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                        test("(T, number) → false", () => expect(new instance(ABCD,).execute(it => it.all(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                        test("(T) → false",         () => expect(new instance(ABCD,).execute(it => it.all(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                        test("() → false",          () => expect(new instance(ABCD,).execute(it => it.all(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("any", () => {
                        test('∅',                   () => expect(new instance(ABCD,).execute(it => it.any(),)                 .amountOfCall,).toBe(0,),)
                        test("(T, number) → true",  () => expect(new instance(ABCD,).execute(it => it.any(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                        test("(T) → true",          () => expect(new instance(ABCD,).execute(it => it.any(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                        test("() → true",           () => expect(new instance(ABCD,).execute(it => it.any(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                        test("(T, number) → false", () => expect(new instance(ABCD,).execute(it => it.any(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                        test("(T) → false",         () => expect(new instance(ABCD,).execute(it => it.any(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                        test("() → false",          () => expect(new instance(ABCD,).execute(it => it.any(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("none", () => {
                        test('∅',                   () => expect(new instance(ABCD,).execute(it => it.none(),)                 .amountOfCall,).toBe(0,),)
                        test("(T, number) → true",  () => expect(new instance(ABCD,).execute(it => it.none(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                        test("(T) → true",          () => expect(new instance(ABCD,).execute(it => it.none(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                        test("() → true",           () => expect(new instance(ABCD,).execute(it => it.none(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                        test("(T, number) → false", () => expect(new instance(ABCD,).execute(it => it.none(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                        test("(T) → false",         () => expect(new instance(ABCD,).execute(it => it.none(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                        test("() → false",          () => expect(new instance(ABCD,).execute(it => it.none(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                    },)
                },)

            describe("all", () => {
                test("(T, number) → true",  () => expect(new instance(ABCD,).all(callbackAsTrue2,),)  .toBeTrue(),)
                test("(T) → true",          () => expect(new instance(ABCD,).all(callbackAsTrue1,),)  .toBeTrue(),)
                test("() → true",           () => expect(new instance(ABCD,).all(callbackAsTrue0,),)  .toBeTrue(),)
                test("(T, number) → false", () => expect(new instance(ABCD,).all(callbackAsFalse2,),) .toBeFalse(),)
                test("(T) → false",         () => expect(new instance(ABCD,).all(callbackAsFalse1,),) .toBeFalse(),)
                test("() → false",          () => expect(new instance(ABCD,).all(callbackAsFalse0,),) .toBeFalse(),)
                test('a',                   () => expect(new instance(ABCD,).all(callbackIsA,),)      .toBeFalse(),)
                test('b',                   () => expect(new instance(ABCD,).all(callbackIsB,),)      .toBeFalse(),)
                test('c',                   () => expect(new instance(ABCD,).all(callbackIsC,),)      .toBeFalse(),)
                test('d',                   () => expect(new instance(ABCD,).all(callbackIsD,),)      .toBeFalse(),)
                test('e',                   () => expect(new instance(ABCD,).all(callbackIsE,),)      .toBeFalse(),)
                test("even",                () => expect(new instance(ABCD,).all(callbackIsEvenAlt,),).toBeFalse(),)
                test("odd",                 () => expect(new instance(ABCD,).all(callbackIsOddAlt,),) .toBeFalse(),)
                test('0',                   () => expect(new instance(ABCD,).all(callbackIs0Alt,),)   .toBeFalse(),)
                test('1',                   () => expect(new instance(ABCD,).all(callbackIs1Alt,),)   .toBeFalse(),)
                test('2',                   () => expect(new instance(ABCD,).all(callbackIs2Alt,),)   .toBeFalse(),)
                test('3',                   () => expect(new instance(ABCD,).all(callbackIs3Alt,),)   .toBeFalse(),)
                test('4',                   () => expect(new instance(ABCD,).all(callbackIs4Alt,),)   .toBeFalse(),)
            },)
            describe("any", () => {
                test('∅',                   () => expect(new instance(ABCD,).any(),)                  .toBeTrue(),)
                test("null",                () => expect(new instance(ABCD,).any(null,),)             .toBeTrue(),)
                test("undefined",           () => expect(new instance(ABCD,).any(null,),)             .toBeTrue(),)
                test("(T, number) → true",  () => expect(new instance(ABCD,).any(callbackAsTrue2,),)  .toBeTrue(),)
                test("(T) → true",          () => expect(new instance(ABCD,).any(callbackAsTrue1,),)  .toBeTrue(),)
                test("() → true",           () => expect(new instance(ABCD,).any(callbackAsTrue0,),)  .toBeTrue(),)
                test("(T, number) → false", () => expect(new instance(ABCD,).any(callbackAsFalse2,),) .toBeFalse(),)
                test("(T) → false",         () => expect(new instance(ABCD,).any(callbackAsFalse1,),) .toBeFalse(),)
                test("() → false",          () => expect(new instance(ABCD,).any(callbackAsFalse0,),) .toBeFalse(),)
                test('a',                   () => expect(new instance(ABCD,).any(callbackIsA,),)      .toBeTrue(),)
                test('b',                   () => expect(new instance(ABCD,).any(callbackIsB,),)      .toBeTrue(),)
                test('c',                   () => expect(new instance(ABCD,).any(callbackIsC,),)      .toBeTrue(),)
                test('d',                   () => expect(new instance(ABCD,).any(callbackIsD,),)      .toBeTrue(),)
                test('e',                   () => expect(new instance(ABCD,).any(callbackIsE,),)      .toBeFalse(),)
                test("even",                () => expect(new instance(ABCD,).any(callbackIsEvenAlt,),).toBeTrue(),)
                test("odd",                 () => expect(new instance(ABCD,).any(callbackIsOddAlt,),) .toBeTrue(),)
                test('0',                   () => expect(new instance(ABCD,).any(callbackIs0Alt,),)   .toBeTrue(),)
                test('1',                   () => expect(new instance(ABCD,).any(callbackIs1Alt,),)   .toBeTrue(),)
                test('2',                   () => expect(new instance(ABCD,).any(callbackIs2Alt,),)   .toBeTrue(),)
                test('3',                   () => expect(new instance(ABCD,).any(callbackIs3Alt,),)   .toBeTrue(),)
                test('4',                   () => expect(new instance(ABCD,).any(callbackIs4Alt,),)   .toBeFalse(),)
            },)
            describe("none", () => {
                test('∅',                   () => expect(new instance(ABCD,).none(),)                  .toBeFalse(),)
                test("null",                () => expect(new instance(ABCD,).none(null,),)             .toBeFalse(),)
                test("undefined",           () => expect(new instance(ABCD,).none(undefined,),)        .toBeFalse(),)
                test("(T, number) → true",  () => expect(new instance(ABCD,).none(callbackAsTrue2,),)  .toBeFalse(),)
                test("(T) → true",          () => expect(new instance(ABCD,).none(callbackAsTrue1,),)  .toBeFalse(),)
                test("() → true",           () => expect(new instance(ABCD,).none(callbackAsTrue0,),)  .toBeFalse(),)
                test("(T, number) → false", () => expect(new instance(ABCD,).none(callbackAsFalse2,),) .toBeTrue(),)
                test("(T) → false",         () => expect(new instance(ABCD,).none(callbackAsFalse1,),) .toBeTrue(),)
                test("() → false",          () => expect(new instance(ABCD,).none(callbackAsFalse0,),) .toBeTrue(),)
                test('a',                   () => expect(new instance(ABCD,).none(callbackIsA,),)      .toBeFalse(),)
                test('b',                   () => expect(new instance(ABCD,).none(callbackIsB,),)      .toBeFalse(),)
                test('c',                   () => expect(new instance(ABCD,).none(callbackIsC,),)      .toBeFalse(),)
                test('d',                   () => expect(new instance(ABCD,).none(callbackIsD,),)      .toBeFalse(),)
                test('e',                   () => expect(new instance(ABCD,).none(callbackIsE,),)      .toBeTrue(),)
                test("even",                () => expect(new instance(ABCD,).none(callbackIsEvenAlt,),).toBeFalse(),)
                test("odd",                 () => expect(new instance(ABCD,).none(callbackIsOddAlt,),) .toBeFalse(),)
                test('0',                   () => expect(new instance(ABCD,).none(callbackIs0Alt,),)   .toBeFalse(),)
                test('1',                   () => expect(new instance(ABCD,).none(callbackIs1Alt,),)   .toBeFalse(),)
                test('2',                   () => expect(new instance(ABCD,).none(callbackIs2Alt,),)   .toBeFalse(),)
                test('3',                   () => expect(new instance(ABCD,).none(callbackIs3Alt,),)   .toBeFalse(),)
                test('4',                   () => expect(new instance(ABCD,).none(callbackIs4Alt,),)   .toBeTrue(),)
            },)

        },)},)
    },)

},)
