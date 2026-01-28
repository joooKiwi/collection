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

import {CollectionHolderFromArray}                                                                                                                                                                                                                                                                                                                                                                  from "./instance/CollectionHolderFromArray"
import {GenericCollectionHolder_TakeAlias}                                                                                                                                                                                                                                                                                                                                                          from "./instance/GenericCollectionHolder_TakeAlias"
import {GenericCollectionHolder_TakeLastAlias}                                                                                                                                                                                                                                                                                                                                                      from "./instance/GenericCollectionHolder_TakeLastAlias"
import {GenericCollectionHolder_TakeLastWhileAlias}                                                                                                                                                                                                                                                                                                                                                 from "./instance/GenericCollectionHolder_TakeLastWhileAlias"
import {GenericCollectionHolder_TakeLastWhileIndexedAlias}                                                                                                                                                                                                                                                                                                                                          from "./instance/GenericCollectionHolder_TakeLastWhileIndexedAlias"
import {GenericCollectionHolder_TakeWhileAlias}                                                                                                                                                                                                                                                                                                                                                     from "./instance/GenericCollectionHolder_TakeWhileAlias"
import {GenericCollectionHolder_TakeWhileIndexedAlias}                                                                                                                                                                                                                                                                                                                                              from "./instance/GenericCollectionHolder_TakeWhileIndexedAlias"
import {LazyGenericCollectionHolder_TakeAlias}                                                                                                                                                                                                                                                                                                                                                      from "./instance/LazyGenericCollectionHolder_TakeAlias"
import {LazyGenericCollectionHolder_TakeLastAlias}                                                                                                                                                                                                                                                                                                                                                  from "./instance/LazyGenericCollectionHolder_TakeLastAlias"
import {LazyGenericCollectionHolder_TakeLastWhileAlias}                                                                                                                                                                                                                                                                                                                                             from "./instance/LazyGenericCollectionHolder_TakeLastWhileAlias"
import {LazyGenericCollectionHolder_TakeLastWhileIndexedAlias}                                                                                                                                                                                                                                                                                                                                      from "./instance/LazyGenericCollectionHolder_TakeLastWhileIndexedAlias"
import {LazyGenericCollectionHolder_TakeWhileAlias}                                                                                                                                                                                                                                                                                                                                                 from "./instance/LazyGenericCollectionHolder_TakeWhileAlias"
import {LazyGenericCollectionHolder_TakeWhileIndexedAlias}                                                                                                                                                                                                                                                                                                                                          from "./instance/LazyGenericCollectionHolder_TakeWhileIndexedAlias"
import {expectToBeInstance}                                                                                                                                                                                                                                                                                                                                                                         from "./expect/expectToBeInstance"
import {A, AB, ABC, ABCD, B, BCD, CD, D, EMPTY}                                                                                                                                                                                                                                                                                                                                                     from "./value/arrays"
import {callbackAsFalse0, callbackAsFalse1, callbackAsFalse2, callbackAsTrue0, callbackAsTrue1, callbackAsTrue2, falseCallbacks, trueCallbacks}                                                                                                                                                                                                                                                     from "./value/callbacks (boolean)"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                                                                                                                                                                                                                                                                                          from "./value/callbacks (fail)"
import {callbackIsOver0, callbackIsOver0Alt, callbackIsOver1, callbackIsOver1Alt, callbackIsOver2, callbackIsOver2Alt, callbackIsOver3, callbackIsOver3Alt, callbackIsOver4, callbackIsOver4Alt, callbackIsUnder0, callbackIsUnder0Alt, callbackIsUnder1, callbackIsUnder1Alt, callbackIsUnder2, callbackIsUnder2Alt, callbackIsUnder3, callbackIsUnder3Alt, callbackIsUnder4, callbackIsUnder4Alt} from "./value/callbacks (number)"
import {callbackIsOverA, callbackIsOverAAlt, callbackIsOverB, callbackIsOverBAlt, callbackIsOverC, callbackIsOverCAlt, callbackIsOverD, callbackIsOverDAlt, callbackIsOverE, callbackIsOverEAlt, callbackIsUnderA, callbackIsUnderAAlt, callbackIsUnderB, callbackIsUnderBAlt, callbackIsUnderC, callbackIsUnderCAlt, callbackIsUnderD, callbackIsUnderDAlt, callbackIsUnderE, callbackIsUnderEAlt} from "./value/callbacks (string)"
import {everyExtensionMethodInstances, everyInstances}                                                                                                                                                                                                                                                                                                                                              from "./value/instances"

import {CollectionConstants}                                                                                                                             from "../src/CollectionConstants"
import {EmptyCollectionHolder}                                                                                                                           from "../src/EmptyCollectionHolder"
import {ForbiddenIndexException}                                                                                                                         from "../src/exception/ForbiddenIndexException"
import {limit, limitByArray, limitByCollectionHolder, limitByMinimalistCollectionHolder}                                                                 from "../src/method/limit"
import {limitLast, limitLastByArray, limitLastByCollectionHolder, limitLastByMinimalistCollectionHolder}                                                 from "../src/method/limitLast"
import {limitLastWhile, limitLastWhileByArray, limitLastWhileByCollectionHolder, limitLastWhileByMinimalistCollectionHolder}                             from "../src/method/limitLastWhile"
import {limitLastWhileIndexed, limitLastWhileIndexedByArray, limitLastWhileIndexedByCollectionHolder, limitLastWhileIndexedByMinimalistCollectionHolder} from "../src/method/limitLastWhileIndexed"
import {limitWhile, limitWhileByArray, limitWhileByCollectionHolder, limitWhileByMinimalistCollectionHolder}                                             from "../src/method/limitWhile"
import {limitWhileIndexed, limitWhileIndexedByArray, limitWhileIndexedByCollectionHolder, limitWhileIndexedByMinimalistCollectionHolder}                 from "../src/method/limitWhileIndexed"
import * as takeModule                                                                                                                                   from "../src/method/take"
import * as takeLastModule                                                                                                                               from "../src/method/takeLast"
import * as takeLastWhileModule                                                                                                                          from "../src/method/takeLastWhile"
import * as takeLastWhileIndexedModule                                                                                                                   from "../src/method/takeLastWhileIndexed"
import * as takeWhileModule                                                                                                                              from "../src/method/takeWhile"
import * as takeWhileIndexedModule                                                                                                                       from "../src/method/takeWhileIndexed"

describe("CollectionHolderTest (take)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("take",                  () => expectToBeInstance(instance, it => it.take(),),)
        test("limit",                 () => expectToBeInstance(instance, it => it.limit(),),)
        test("takeWhile",             () => expectToBeInstance(instance, it => it.takeWhile(),),)
        test("limitWhile",            () => expectToBeInstance(instance, it => it.limitWhile(),),)
        test("takeWhileIndexed",      () => expectToBeInstance(instance, it => it.takeWhileIndexed(),),)
        test("limitWhileIndexed",     () => expectToBeInstance(instance, it => it.limitWhileIndexed(),),)
        test("takeLast",              () => expectToBeInstance(instance, it => it.takeLast(),),)
        test("limitLast",             () => expectToBeInstance(instance, it => it.limitLast(),),)
        test("takeLastWhile",         () => expectToBeInstance(instance, it => it.takeLastWhile(),),)
        test("limitLastWhile",        () => expectToBeInstance(instance, it => it.limitLastWhile(),),)
        test("takeLastWhileIndexed",  () => expectToBeInstance(instance, it => it.takeLastWhileIndexed(),),)
        test("limitLastWhileIndexed", () => expectToBeInstance(instance, it => it.limitLastWhileIndexed(),),)
    },)

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("limit",                 () => expect(new GenericCollectionHolder_TakeAlias().execute(it => it.limit(0,),).amountOfCall,).toBe(1,),)
            test("limitWhile",            () => expect(new GenericCollectionHolder_TakeWhileAlias().execute(it => it.limitWhile(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            test("limitWhileIndexed",     () => expect(new GenericCollectionHolder_TakeWhileIndexedAlias().execute(it => it.limitWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            test("limitLast",             () => expect(new GenericCollectionHolder_TakeLastAlias().execute(it => it.limitLast(0,),).amountOfCall,).toBe(1,),)
            test("limitLastWhile",        () => expect(new GenericCollectionHolder_TakeLastWhileAlias().execute(it => it.limitLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new GenericCollectionHolder_TakeLastWhileIndexedAlias().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("limit",                 () => expect(new LazyGenericCollectionHolder_TakeAlias().execute(it => it.limit(0,),).amountOfCall,).toBe(1,),)
            test("limitWhile",            () => expect(new LazyGenericCollectionHolder_TakeWhileAlias().execute(it => it.limitWhile(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            test("limitWhileIndexed",     () => expect(new LazyGenericCollectionHolder_TakeWhileIndexedAlias().execute(it => it.limitWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            test("limitLast",             () => expect(new LazyGenericCollectionHolder_TakeLastAlias().execute(it => it.limitLast(0,),).amountOfCall,).toBe(1,),)
            test("limitLastWhile",        () => expect(new LazyGenericCollectionHolder_TakeLastWhileAlias().execute(it => it.limitLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new LazyGenericCollectionHolder_TakeLastWhileIndexedAlias().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
        },)

        describe("limit", () => {
            test("all", () => {
                const method = jest.spyOn(takeModule, "take",)
                limit(A, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeModule, "takeByMinimalistCollectionHolder",)
                limitByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeModule, "takeByCollectionHolder",)
                limitByCollectionHolder(new CollectionHolderFromArray(A,), 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeModule, "takeByArray",)
                limitByArray(A, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitWhile", () => {
            test("all", () => {
                const method = jest.spyOn(takeWhileModule, "takeWhile",)
                limitWhile(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeWhileModule, "takeWhileByMinimalistCollectionHolder",)
                limitWhileByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeWhileModule, "takeWhileByCollectionHolder",)
                limitWhileByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeWhileModule, "takeWhileByArray",)
                limitWhileByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitWhileIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(takeWhileIndexedModule, "takeWhileIndexed",)
                limitWhileIndexed(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeWhileIndexedModule, "takeWhileIndexedByMinimalistCollectionHolder",)
                limitWhileIndexedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeWhileIndexedModule, "takeWhileIndexedByCollectionHolder",)
                limitWhileIndexedByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeWhileIndexedModule, "takeWhileIndexedByArray",)
                limitWhileIndexedByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("limitLast", () => {
            test("all", () => {
                const method = jest.spyOn(takeLastModule, "takeLast",)
                limitLast(A, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeLastModule, "takeLastByMinimalistCollectionHolder",)
                limitLastByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeLastModule, "takeLastByCollectionHolder",)
                limitLastByCollectionHolder(new CollectionHolderFromArray(A,), 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeLastModule, "takeLastByArray",)
                limitLastByArray(A, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitLastWhile", () => {
            test("all", () => {
                const method = jest.spyOn(takeLastWhileModule, "takeLastWhile",)
                limitLastWhile(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeLastWhileModule, "takeLastWhileByMinimalistCollectionHolder",)
                limitLastWhileByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeLastWhileModule, "takeLastWhileByCollectionHolder",)
                limitLastWhileByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeLastWhileModule, "takeLastWhileByArray",)
                limitLastWhileByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitLastWhileIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(takeLastWhileIndexedModule, "takeLastWhileIndexed",)
                limitLastWhileIndexed(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeLastWhileIndexedModule, "takeLastWhileIndexedByMinimalistCollectionHolder",)
                limitLastWhileIndexedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeLastWhileIndexedModule, "takeLastWhileIndexedByCollectionHolder",)
                limitLastWhileIndexedByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeLastWhileIndexedModule, "takeLastWhileIndexedByArray",)
                limitLastWhileIndexedByArray(A, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance,},},) => {
        describe("take",                 () => expect(instance.take(NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        describe("takeWhile",            () => expect(instance.takeWhile(callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        describe("takeWhileIndexed",     () => expect(instance.takeWhileIndexed(callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)

        describe("takeLast",             () => expect(instance.takeLast(NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        describe("takeLastWhile",        () => expect(instance.takeLastWhile(callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        describe("takeLastWhileIndexed", () => expect(instance.takeLastWhileIndexed(callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
    },)},)

    describe("instances", () => {
    describe.each(everyInstances,)("%s", ({value: {instance,},},) => {
        describe("get() being called", () => {
            describe("take", () => {
                describe("empty", () => {
                    test("NaN", () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.take(NaN,),).amountOfCall,).toBe(0,),)
                    test("-∞",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.take(-Infinity,),).amountOfCall,).toBe(0,),)
                    test("-1",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.take(-1,),).amountOfCall,).toBe(0,),)
                    test('0',   () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.take(0,),).amountOfCall,).toBe(0,),)
                    test('1',   () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.take(1,),).amountOfCall,).toBe(0,),)
                    test("+∞",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.take(Infinity,),).amountOfCall,).toBe(0,),)
                },)
                describe("1 field", () => {
                    test("NaN", () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.take(NaN,),),).amountOfCall,).toBe(1,),)
                    test("-∞",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.take(-Infinity,),).amountOfCall,).toBe(0,),)
                    test("-2",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.take(-2,),).amountOfCall,).toBe(0,),)
                    test("-1",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.take(-1,),).amountOfCall,).toBe(0,),)
                    test('0',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.take(0,),).amountOfCall,).toBe(0,),)
                    test('1',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.take(1,),).amountOfCall,).toBe(1,),)
                    test('2',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.take(2,),).amountOfCall,).toBe(1,),)
                    test("+∞",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.take(Infinity,),).amountOfCall,).toBe(1,),)
                },)
                describe("2 fields", () => {
                    test("NaN", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.take(NaN,),),).amountOfCall,).toBe(2,),)
                    test("-∞",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.take(-Infinity,),).amountOfCall,).toBe(0,),)
                    test("-3",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.take(-3,),).amountOfCall,).toBe(0,),)
                    test("-2",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.take(-2,),).amountOfCall,).toBe(0,),)
                    test("-1",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.take(-1,),).amountOfCall,).toBe(1,),)
                    test('0',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.take(0,),).amountOfCall,).toBe(0,),)
                    test('1',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.take(1,),).amountOfCall,).toBe(1,),)
                    test('2',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.take(2,),).amountOfCall,).toBe(2,),)
                    test('3',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.take(3,),).amountOfCall,).toBe(2,),)
                    test("+∞",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.take(Infinity,),).amountOfCall,).toBe(2,),)
                },)
                describe("4 fields", () => {
                    test("NaN", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.take(NaN,),),).amountOfCall,).toBe(4,),)
                    test("-∞",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.take(-Infinity,),).amountOfCall,).toBe(0,),)
                    test("-5",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.take(-5,),).amountOfCall,).toBe(0,),)
                    test("-4",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.take(-4,),).amountOfCall,).toBe(0,),)
                    test("-3",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.take(-3,),).amountOfCall,).toBe(1,),)
                    test("-2",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.take(-2,),).amountOfCall,).toBe(2,),)
                    test("-1",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.take(-1,),).amountOfCall,).toBe(3,),)
                    test('0',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.take(0,),).amountOfCall,).toBe(0,),)
                    test('1',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.take(1,),).amountOfCall,).toBe(1,),)
                    test('2',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.take(2,),).amountOfCall,).toBe(2,),)
                    test('3',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.take(3,),).amountOfCall,).toBe(3,),)
                    test('4',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.take(4,),).amountOfCall,).toBe(4,),)
                    test('5',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.take(5,),).amountOfCall,).toBe(4,),)
                    test("+∞",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.take(Infinity,),).amountOfCall,).toBe(4,),)
                },)
            },)
            describe("takeWhile", () => {
                test("true: 0 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue0,),).amountOfCall,).toBe(2,),)
                test("true: 1 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue1,),).amountOfCall,).toBe(2,),)
                test("true: 2 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue2,),).amountOfCall,).toBe(2,),)
                test("false: 0 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                test("false: 1 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("false: 2 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
            },)
            describe("takeWhileIndexed", () => {
                test("true: 0 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue0,),).amountOfCall,).toBe(2,),)
                test("true: 1 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue1,),).amountOfCall,).toBe(2,),)
                test("true: 2 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue2,),).amountOfCall,).toBe(2,),)
                test("false: 0 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                test("false: 1 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("false: 2 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
            },)

            describe("takeLast", () => {
                describe("empty", () => {
                    test("NaN", () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLast(NaN,),).amountOfCall,).toBe(0,),)
                    test("-∞",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLast(-Infinity,),).amountOfCall,).toBe(0,),)
                    test("-1",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLast(-1,),).amountOfCall,).toBe(0,),)
                    test('0',   () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLast(0,),).amountOfCall,).toBe(0,),)
                    test('1',   () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLast(1,),).amountOfCall,).toBe(0,),)
                    test("+∞",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLast(Infinity,),).amountOfCall,).toBe(0,),)
                },)
                describe("1 field", () => {
                    test("NaN", () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.takeLast(NaN,),),).amountOfCall,).toBe(1,),)
                    test("-∞",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.takeLast(-Infinity,),).amountOfCall,).toBe(0,),)
                    test("-2",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.takeLast(-2,),).amountOfCall,).toBe(0,),)
                    test("-1",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.takeLast(-1,),).amountOfCall,).toBe(0,),)
                    test('0',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.takeLast(0,),).amountOfCall,).toBe(0,),)
                    test('1',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.takeLast(1,),).amountOfCall,).toBe(1,),)
                    test('2',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.takeLast(2,),).amountOfCall,).toBe(1,),)
                    test("+∞",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.takeLast(Infinity,),).amountOfCall,).toBe(1,),)
                },)
                describe("2 fields", () => {
                    test("NaN", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.takeLast(NaN,),),).amountOfCall,).toBe(2,),)
                    test("-∞",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(-Infinity,),).amountOfCall,).toBe(0,),)
                    test("-3",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(-3,),).amountOfCall,).toBe(0,),)
                    test("-2",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(-2,),).amountOfCall,).toBe(0,),)
                    test("-1",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(-1,),).amountOfCall,).toBe(1,),)
                    test('0',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(0,),).amountOfCall,).toBe(0,),)
                    test('1',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(1,),).amountOfCall,).toBe(1,),)
                    test('2',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(2,),).amountOfCall,).toBe(2,),)
                    test('3',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(3,),).amountOfCall,).toBe(2,),)
                    test("+∞",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(Infinity,),).amountOfCall,).toBe(2,),)
                },)
                describe("4 fields", () => {
                    test("NaN", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.takeLast(NaN,),),).amountOfCall,).toBe(4,),)
                    test("-∞",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(-Infinity,),).amountOfCall,).toBe(0,),)
                    test("-5",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(-5,),).amountOfCall,).toBe(0,),)
                    test("-4",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(-4,),).amountOfCall,).toBe(0,),)
                    test("-3",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(-3,),).amountOfCall,).toBe(1,),)
                    test("-2",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(-2,),).amountOfCall,).toBe(2,),)
                    test("-1",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(-1,),).amountOfCall,).toBe(3,),)
                    test('0',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(0,),).amountOfCall,).toBe(0,),)
                    test('1',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(1,),).amountOfCall,).toBe(1,),)
                    test('2',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(2,),).amountOfCall,).toBe(2,),)
                    test('3',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(3,),).amountOfCall,).toBe(3,),)
                    test('4',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(4,),).amountOfCall,).toBe(4,),)
                    test('5',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(5,),).amountOfCall,).toBe(4,),)
                    test("+∞",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(Infinity,),).amountOfCall,).toBe(4,),)
                },)
            },)
            describe("takeLastWhile", () => {
                test("true: 0 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue0,),).amountOfCall,).toBe(2,),)
                test("true: 1 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue1,),).amountOfCall,).toBe(2,),)
                test("true: 2 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue2,),).amountOfCall,).toBe(2,),)
                test("false: 0 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                test("false: 1 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("false: 2 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
            },)
            describe("takeLastWhileIndexed", () => {
                test("true: 0 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue0,),).amountOfCall,).toBe(2,),)
                test("true: 1 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue1,),).amountOfCall,).toBe(2,),)
                test("true: 2 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue2,),).amountOfCall,).toBe(2,),)
                test("false: 0 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                test("false: 1 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("false: 2 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
            },)
        },)

        describe("take", () => {
            describe("empty", () => {
                test("NaN", () => expect(new instance(EMPTY,).take(NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-∞",  () => expect(new instance(EMPTY,).take(-Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-1",  () => expect(new instance(EMPTY,).take(-1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('0',   () => expect(new instance(EMPTY,).take(0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(EMPTY,).take(1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(new instance(EMPTY,).take(Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("1 field", () => {
                test("NaN", () => expect(() => new instance(A,).take(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(A,).take(-Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-2",  () => expect(new instance(A,).take(-2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-1",  () => expect(new instance(A,).take(-1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('0',   () => expect(new instance(A,).take(0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(A,).take(1,).toArray(),).toEqual(A,),)
                test('2',   () => expect(new instance(A,).take(2,).toArray(),).toEqual(A,),)
                test("+∞",  () => expect(new instance(A,).take(Infinity,).toArray(),).toEqual(A,),)
            },)
            describe("2 fields", () => {
                test("NaN", () => expect(() => new instance(AB,).take(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(AB,).take(-Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-3",  () => expect(new instance(AB,).take(-3,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-2",  () => expect(new instance(AB,).take(-2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-1",  () => expect(new instance(AB,).take(-1,).toArray(),).toEqual(A,),)
                test('0',   () => expect(new instance(AB,).take(0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(AB,).take(1,).toArray(),).toEqual(A,),)
                test('2',   () => expect(new instance(AB,).take(2,).toArray(),).toEqual(AB,),)
                test('3',   () => expect(new instance(AB,).take(3,).toArray(),).toEqual(AB,),)
                test("+∞",  () => expect(new instance(AB,).take(Infinity,).toArray(),).toEqual(AB,),)
            },)
            describe("4 fields", () => {
                test("NaN", () => expect(() => new instance(ABCD,).take(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(ABCD,).take(-Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-5",  () => expect(new instance(ABCD,).take(-5,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-4",  () => expect(new instance(ABCD,).take(-4,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-3",  () => expect(new instance(ABCD,).take(-3,).toArray(),).toEqual(A,),)
                test("-2",  () => expect(new instance(ABCD,).take(-2,).toArray(),).toEqual(AB,),)
                test("-1",  () => expect(new instance(ABCD,).take(-1,).toArray(),).toEqual(ABC,),)
                test('0',   () => expect(new instance(ABCD,).take(0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(ABCD,).take(1,).toArray(),).toEqual(A,),)
                test('2',   () => expect(new instance(ABCD,).take(2,).toArray(),).toEqual(AB,),)
                test('3',   () => expect(new instance(ABCD,).take(3,).toArray(),).toEqual(ABC,),)
                test('4',   () => expect(new instance(ABCD,).take(4,).toArray(),).toEqual(ABCD,),)
                test('5',   () => expect(new instance(ABCD,).take(5,).toArray(),).toEqual(ABCD,),)
                test("+∞",  () => expect(new instance(ABCD,).take(Infinity,).toArray(),).toEqual(ABCD,),)
            },)
        },)
        describe("takeWhile", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).takeWhile(callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("1 argument",  () => expect(new instance(EMPTY,).takeWhile(callbackAsFail1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("2 arguments", () => expect(new instance(EMPTY,).takeWhile(callbackAsFail2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).takeWhile(it,).toArray(),).toEqual(A,),)
                    test("2 fields", () => expect(new instance(AB,).takeWhile(it,).toArray(),).toEqual(AB,),)
                    test("4 fields", () => expect(new instance(ABCD,).takeWhile(it,).toArray(),).toEqual(ABCD,),)
                },)
                describe.each(falseCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).takeWhile(it,),).toBeEmpty(),)
                    test("2 fields", () => expect(new instance(AB,).takeWhile(it,),).toBeEmpty(),)
                    test("4 fields", () => expect(new instance(ABCD,).takeWhile(it,),).toBeEmpty(),)
                },)
            },)
            describe("1 field", () => {
                test('a', () => expect(new instance(A,).takeWhile(callbackIsUnderA,),).toBeEmpty(),)
                test('e', () => expect(new instance(A,).takeWhile(callbackIsUnderE,).toArray(),).toEqual(A,),)
                test('0', () => expect(new instance(A,).takeWhile(callbackIsUnder0Alt,),).toBeEmpty(),)
                test('4', () => expect(new instance(A,).takeWhile(callbackIsUnder4Alt,).toArray(),).toEqual(A,),)
            },)
            describe("2 fields", () => {
                test('a', () => expect(new instance(AB,).takeWhile(callbackIsUnderA,),).toBeEmpty(),)
                test('b', () => expect(new instance(AB,).takeWhile(callbackIsUnderB,).toArray(),).toEqual(A,),)
                test('e', () => expect(new instance(AB,).takeWhile(callbackIsUnderE,).toArray(),).toEqual(AB,),)
                test('0', () => expect(new instance(AB,).takeWhile(callbackIsUnder0Alt,),).toBeEmpty(),)
                test('1', () => expect(new instance(AB,).takeWhile(callbackIsUnder1Alt,).toArray(),).toEqual(A,),)
                test('4', () => expect(new instance(AB,).takeWhile(callbackIsUnder4Alt,).toArray(),).toEqual(AB,),)
            },)
            describe("4 fields", () => {
                test('a', () => expect(new instance(ABCD,).takeWhile(callbackIsUnderA,),).toBeEmpty(),)
                test('b', () => expect(new instance(ABCD,).takeWhile(callbackIsUnderB,).toArray(),).toEqual(A,),)
                test('c', () => expect(new instance(ABCD,).takeWhile(callbackIsUnderC,).toArray(),).toEqual(AB,),)
                test('d', () => expect(new instance(ABCD,).takeWhile(callbackIsUnderD,).toArray(),).toEqual(ABC,),)
                test('e', () => expect(new instance(ABCD,).takeWhile(callbackIsUnderE,).toArray(),).toEqual(ABCD,),)
                test('0', () => expect(new instance(ABCD,).takeWhile(callbackIsUnder0Alt,),).toBeEmpty(),)
                test('1', () => expect(new instance(ABCD,).takeWhile(callbackIsUnder1Alt,).toArray(),).toEqual(A,),)
                test('2', () => expect(new instance(ABCD,).takeWhile(callbackIsUnder2Alt,).toArray(),).toEqual(AB,),)
                test('3', () => expect(new instance(ABCD,).takeWhile(callbackIsUnder3Alt,).toArray(),).toEqual(ABC,),)
                test('4', () => expect(new instance(ABCD,).takeWhile(callbackIsUnder4Alt,).toArray(),).toEqual(ABCD,),)
            },)
        },)
        describe("takeWhileIndexed", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).takeWhileIndexed(callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("1 argument",  () => expect(new instance(EMPTY,).takeWhileIndexed(callbackAsFail1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("2 arguments", () => expect(new instance(EMPTY,).takeWhileIndexed(callbackAsFail2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).takeWhileIndexed(it,).toArray(),).toEqual(A,),)
                    test("2 fields", () => expect(new instance(AB,).takeWhileIndexed(it,).toArray(),).toEqual(AB,),)
                    test("4 fields", () => expect(new instance(ABCD,).takeWhileIndexed(it,).toArray(),).toEqual(ABCD,),)
                },)
                describe.each(falseCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).takeWhileIndexed(it,).toArray(),).toEqual(EMPTY,),)
                    test("2 fields", () => expect(new instance(AB,).takeWhileIndexed(it,).toArray(),).toEqual(EMPTY,),)
                    test("4 fields", () => expect(new instance(ABCD,).takeWhileIndexed(it,).toArray(),).toEqual(EMPTY,),)
                },)
            },)
            describe("1 field", () => {
                test('a', () => expect(new instance(A,).takeWhileIndexed(callbackIsUnderAAlt,),).toBeEmpty(),)
                test('e', () => expect(new instance(A,).takeWhileIndexed(callbackIsUnderEAlt,).toArray(),).toEqual(A,),)
                test('0', () => expect(new instance(A,).takeWhileIndexed(callbackIsUnder0,),).toBeEmpty(),)
                test('4', () => expect(new instance(A,).takeWhileIndexed(callbackIsUnder4,).toArray(),).toEqual(A,),)
            },)
            describe("2 fields", () => {
                test('a', () => expect(new instance(AB,).takeWhileIndexed(callbackIsUnderAAlt,),).toBeEmpty(),)
                test('b', () => expect(new instance(AB,).takeWhileIndexed(callbackIsUnderBAlt,).toArray(),).toEqual(A,),)
                test('e', () => expect(new instance(AB,).takeWhileIndexed(callbackIsUnderEAlt,).toArray(),).toEqual(AB,),)
                test('0', () => expect(new instance(AB,).takeWhileIndexed(callbackIsUnder0,),).toBeEmpty(),)
                test('1', () => expect(new instance(AB,).takeWhileIndexed(callbackIsUnder1,).toArray(),).toEqual(A,),)
                test('4', () => expect(new instance(AB,).takeWhileIndexed(callbackIsUnder4,).toArray(),).toEqual(AB,),)
            },)
            describe("4 fields", () => {
                test('a', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnderAAlt,),).toBeEmpty(),)
                test('b', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnderBAlt,).toArray(),).toEqual(A,),)
                test('c', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnderCAlt,).toArray(),).toEqual(AB,),)
                test('d', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnderDAlt,).toArray(),).toEqual(ABC,),)
                test('e', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnderEAlt,).toArray(),).toEqual(ABCD,),)
                test('0', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnder0,),).toBeEmpty(),)
                test('1', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnder1,).toArray(),).toEqual(A,),)
                test('2', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnder2,).toArray(),).toEqual(AB,),)
                test('3', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnder3,).toArray(),).toEqual(ABC,),)
                test('4', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnder4,).toArray(),).toEqual(ABCD,),)
            },)
        },)

        describe("takeLast", () => {
            describe("empty", () => {
                test("NaN", () => expect(new instance(EMPTY,).takeLast(NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-∞",  () => expect(new instance(EMPTY,).takeLast(-Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-1",  () => expect(new instance(EMPTY,).takeLast(-1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('0',   () => expect(new instance(EMPTY,).takeLast(0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(EMPTY,).takeLast(1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(new instance(EMPTY,).takeLast(Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("1 field", () => {
                test("NaN", () => expect(() => new instance(A,).takeLast(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(A,).takeLast(-Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-2",  () => expect(new instance(A,).takeLast(-2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-1",  () => expect(new instance(A,).takeLast(-1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('0',   () => expect(new instance(A,).takeLast(0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(A,).takeLast(1,).toArray(),).toEqual(A,),)
                test('2',   () => expect(new instance(A,).takeLast(2,).toArray(),).toEqual(A,),)
                test("+∞",  () => expect(new instance(A,).takeLast(Infinity,).toArray(),).toEqual(A,),)
            },)
            describe("2 fields", () => {
                test("NaN", () => expect(() => new instance(AB,).takeLast(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(AB,).takeLast(-Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-3",  () => expect(new instance(AB,).takeLast(-3,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-2",  () => expect(new instance(AB,).takeLast(-2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-1",  () => expect(new instance(AB,).takeLast(-1,).toArray(),).toEqual(B,),)
                test('0',   () => expect(new instance(AB,).takeLast(0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(AB,).takeLast(1,).toArray(),).toEqual(B,),)
                test('2',   () => expect(new instance(AB,).takeLast(2,).toArray(),).toEqual(AB,),)
                test('3',   () => expect(new instance(AB,).takeLast(3,).toArray(),).toEqual(AB,),)
                test("+∞",  () => expect(new instance(AB,).takeLast(Infinity,).toArray(),).toEqual(AB,),)
            },)
            describe("4 fields", () => {
                test("NaN", () => expect(() => new instance(ABCD,).takeLast(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(ABCD,).takeLast(-Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-5",  () => expect(new instance(ABCD,).takeLast(-5,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-4",  () => expect(new instance(ABCD,).takeLast(-4,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-3",  () => expect(new instance(ABCD,).takeLast(-3,).toArray(),).toEqual(D,),)
                test("-2",  () => expect(new instance(ABCD,).takeLast(-2,).toArray(),).toEqual(CD,),)
                test("-1",  () => expect(new instance(ABCD,).takeLast(-1,).toArray(),).toEqual(BCD,),)
                test('0',   () => expect(new instance(ABCD,).takeLast(0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(ABCD,).takeLast(1,).toArray(),).toEqual(D,),)
                test('2',   () => expect(new instance(ABCD,).takeLast(2,).toArray(),).toEqual(CD,),)
                test('3',   () => expect(new instance(ABCD,).takeLast(3,).toArray(),).toEqual(BCD,),)
                test('4',   () => expect(new instance(ABCD,).takeLast(4,).toArray(),).toEqual(ABCD,),)
                test('5',   () => expect(new instance(ABCD,).takeLast(5,).toArray(),).toEqual(ABCD,),)
                test("+∞",  () => expect(new instance(ABCD,).takeLast(Infinity,).toArray(),).toEqual(ABCD,),)
            },)
        },)
        describe("takeLastWhile", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).takeLastWhile(callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("1 argument",  () => expect(new instance(EMPTY,).takeLastWhile(callbackAsFail1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("2 arguments", () => expect(new instance(EMPTY,).takeLastWhile(callbackAsFail2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).takeLastWhile(it,).toArray(),).toEqual(A,),)
                    test("2 fields", () => expect(new instance(AB,).takeLastWhile(it,).toArray(),).toEqual(AB,),)
                    test("4 fields", () => expect(new instance(ABCD,).takeLastWhile(it,).toArray(),).toEqual(ABCD,),)
                },)
                describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).takeLastWhile(it,),).toBeEmpty(),)
                    test("2 fields", () => expect(new instance(AB,).takeLastWhile(it,),).toBeEmpty(),)
                    test("4 fields", () => expect(new instance(ABCD,).takeLastWhile(it,),).toBeEmpty(),)
                },)
            },)
            describe("1 field", () => {
                test('a', () => expect(new instance(A,).takeLastWhile(callbackIsOverA,),).toBeEmpty(),)
                test('e', () => expect(new instance(A,).takeLastWhile(callbackIsOverE,),).toBeEmpty(),)
                test('0', () => expect(new instance(A,).takeLastWhile(callbackIsOver0Alt,),).toBeEmpty(),)
                test('4', () => expect(new instance(A,).takeLastWhile(callbackIsOver4Alt,),).toBeEmpty(),)
            },)
            describe("2 fields", () => {
                test('a', () => expect(new instance(AB,).takeLastWhile(callbackIsOverA,).toArray(),).toEqual(B,),)
                test('b', () => expect(new instance(AB,).takeLastWhile(callbackIsOverB,),).toBeEmpty(),)
                test('e', () => expect(new instance(AB,).takeLastWhile(callbackIsOverE,),).toBeEmpty(),)
                test('0', () => expect(new instance(AB,).takeLastWhile(callbackIsOver0Alt,).toArray(),).toEqual(B,),)
                test('1', () => expect(new instance(AB,).takeLastWhile(callbackIsOver1Alt,),).toBeEmpty(),)
                test('4', () => expect(new instance(AB,).takeLastWhile(callbackIsOver4Alt,),).toBeEmpty(),)
            },)
            describe("4 fields", () => {
                test('a', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOverA,).toArray(),).toEqual(BCD),)
                test('b', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOverB,).toArray(),).toEqual(CD,),)
                test('c', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOverC,).toArray(),).toEqual(D,),)
                test('d', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOverD,),).toBeEmpty(),)
                test('e', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOverE,),).toBeEmpty(),)
                test('0', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOver0Alt,).toArray(),).toEqual(BCD),)
                test('1', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOver1Alt,).toArray(),).toEqual(CD,),)
                test('2', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOver2Alt,).toArray(),).toEqual(D,),)
                test('3', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOver3Alt,),).toBeEmpty(),)
                test('4', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOver4Alt,),).toBeEmpty(),)
            },)
        },)
        describe("takeLastWhileIndexed", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).takeLastWhileIndexed(callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("1 argument",  () => expect(new instance(EMPTY,).takeLastWhileIndexed(callbackAsFail1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("2 arguments", () => expect(new instance(EMPTY,).takeLastWhileIndexed(callbackAsFail2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).takeLastWhileIndexed(it,).toArray(),).toEqual(A,),)
                    test("2 fields", () => expect(new instance(AB,).takeLastWhileIndexed(it,).toArray(),).toEqual(AB,),)
                    test("4 fields", () => expect(new instance(ABCD,).takeLastWhileIndexed(it,).toArray(),).toEqual(ABCD,),)
                },)
                describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).takeLastWhileIndexed(it,).toArray(),).toEqual(EMPTY,),)
                    test("2 fields", () => expect(new instance(AB,).takeLastWhileIndexed(it,).toArray(),).toEqual(EMPTY,),)
                    test("4 fields", () => expect(new instance(ABCD,).takeLastWhileIndexed(it,).toArray(),).toEqual(EMPTY,),)
                },)
            },)
            describe("1 field", () => {
                test('a', () => expect(new instance(A,).takeLastWhileIndexed(callbackIsOverAAlt,),).toBeEmpty(),)
                test('e', () => expect(new instance(A,).takeLastWhileIndexed(callbackIsOverEAlt,),).toBeEmpty(),)
                test('0', () => expect(new instance(A,).takeLastWhileIndexed(callbackIsOver0,),).toBeEmpty(),)
                test('4', () => expect(new instance(A,).takeLastWhileIndexed(callbackIsOver4,),).toBeEmpty(),)
            },)
            describe("2 fields", () => {
                test('a', () => expect(new instance(AB,).takeLastWhileIndexed(callbackIsOverAAlt,).toArray(),).toEqual(B,),)
                test('b', () => expect(new instance(AB,).takeLastWhileIndexed(callbackIsOverBAlt,),).toBeEmpty(),)
                test('e', () => expect(new instance(AB,).takeLastWhileIndexed(callbackIsOverEAlt,),).toBeEmpty(),)
                test('0', () => expect(new instance(AB,).takeLastWhileIndexed(callbackIsOver0,).toArray(),).toEqual(B,),)
                test('1', () => expect(new instance(AB,).takeLastWhileIndexed(callbackIsOver1,),).toBeEmpty(),)
                test('4', () => expect(new instance(AB,).takeLastWhileIndexed(callbackIsOver4,),).toBeEmpty(),)
            },)
            describe("4 fields", () => {
                test('a', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOverAAlt,).toArray(),).toEqual(BCD,),)
                test('b', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOverBAlt,).toArray(),).toEqual(CD,),)
                test('c', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOverCAlt,).toArray(),).toEqual(D,),)
                test('d', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOverDAlt,),).toBeEmpty(),)
                test('e', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOverEAlt,),).toBeEmpty(),)
                test('0', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOver0,).toArray(),).toEqual(BCD,),)
                test('1', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOver1,).toArray(),).toEqual(CD,),)
                test('2', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOver2,).toArray(),).toEqual(D,),)
                test('3', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOver3,),).toBeEmpty(),)
                test('4', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOver4,),).toBeEmpty(),)
            },)
        },)
    },)},)

},)
