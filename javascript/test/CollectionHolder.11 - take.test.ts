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
import {A, AB, ABC, ABCD, B, BCD, CD, D, EMPTY}                                                                                                                                                                                                                                                                                                                                                     from "./value/arrays"
import {callbackAsFalse0, callbackAsFalse1, callbackAsFalse2, callbackAsTrue0, callbackAsTrue1, callbackAsTrue2}                                                                                                                                                                                                                                                                                    from "./value/callbacks (boolean)"
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

        test("take",                  () => expect(instance.take(),)                 .toBe(instance,),)
        test("limit",                 () => expect(instance.limit(),)                .toBe(instance,),)
        test("takeWhile",             () => expect(instance.takeWhile(),)            .toBe(instance,),)
        test("limitWhile",            () => expect(instance.limitWhile(),)           .toBe(instance,),)
        test("takeWhileIndexed",      () => expect(instance.takeWhileIndexed(),)     .toBe(instance,),)
        test("limitWhileIndexed",     () => expect(instance.limitWhileIndexed(),)    .toBe(instance,),)
        test("takeLast",              () => expect(instance.takeLast(),)             .toBe(instance,),)
        test("limitLast",             () => expect(instance.limitLast(),)            .toBe(instance,),)
        test("takeLastWhile",         () => expect(instance.takeLastWhile(),)        .toBe(instance,),)
        test("limitLastWhile",        () => expect(instance.limitLastWhile(),)       .toBe(instance,),)
        test("takeLastWhileIndexed",  () => expect(instance.takeLastWhileIndexed(),) .toBe(instance,),)
        test("limitLastWhileIndexed", () => expect(instance.limitLastWhileIndexed(),).toBe(instance,),)
    },)

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("limit",                 () => expect(new GenericCollectionHolder_TakeAlias()                .execute(it => it.limit(0,),)                               .amountOfCall,).toBe(1,),)
            test("limitWhile",            () => expect(new GenericCollectionHolder_TakeWhileAlias()           .execute(it => it.limitWhile(callbackAsFalse0,),)          .amountOfCall,).toBe(1,),)
            test("limitWhileIndexed",     () => expect(new GenericCollectionHolder_TakeWhileIndexedAlias()    .execute(it => it.limitWhileIndexed(callbackAsFalse0,),)   .amountOfCall,).toBe(1,),)
            test("limitLast",             () => expect(new GenericCollectionHolder_TakeLastAlias()            .execute(it => it.limitLast(0,),)                           .amountOfCall,).toBe(1,),)
            test("limitLastWhile",        () => expect(new GenericCollectionHolder_TakeLastWhileAlias()       .execute(it => it.limitLastWhile(callbackAsFalse0,),)       .amountOfCall,).toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new GenericCollectionHolder_TakeLastWhileIndexedAlias().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("limit",                 () => expect(new LazyGenericCollectionHolder_TakeAlias()                .execute(it => it.limit(0,),)                               .amountOfCall,).toBe(1,),)
            test("limitWhile",            () => expect(new LazyGenericCollectionHolder_TakeWhileAlias()           .execute(it => it.limitWhile(callbackAsFalse0,),)           .amountOfCall,).toBe(1,),)
            test("limitWhileIndexed",     () => expect(new LazyGenericCollectionHolder_TakeWhileIndexedAlias()    .execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .amountOfCall,).toBe(1,),)
            test("limitLast",             () => expect(new LazyGenericCollectionHolder_TakeLastAlias()            .execute(it => it.limitLast(0,),)                           .amountOfCall,).toBe(1,),)
            test("limitLastWhile",        () => expect(new LazyGenericCollectionHolder_TakeLastWhileAlias()       .execute(it => it.limitLastWhile(callbackAsFalse0,),)       .amountOfCall,).toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new LazyGenericCollectionHolder_TakeLastWhileIndexedAlias().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
        },)

        describe("limit", () => {
            test("all", () => {
                const method = jest.spyOn(takeModule, "take",)
                limit(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeModule, "takeByMinimalistCollectionHolder",)
                limitByMinimalistCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeModule, "takeByCollectionHolder",)
                limitByCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeModule, "takeByArray",)
                limitByArray(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitWhile", () => {
            test("all", () => {
                const method = jest.spyOn(takeWhileModule, "takeWhile",)
                limitWhile(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeWhileModule, "takeWhileByMinimalistCollectionHolder",)
                limitWhileByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeWhileModule, "takeWhileByCollectionHolder",)
                limitWhileByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeWhileModule, "takeWhileByArray",)
                limitWhileByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitWhileIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(takeWhileIndexedModule, "takeWhileIndexed",)
                limitWhileIndexed(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeWhileIndexedModule, "takeWhileIndexedByMinimalistCollectionHolder",)
                limitWhileIndexedByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeWhileIndexedModule, "takeWhileIndexedByCollectionHolder",)
                limitWhileIndexedByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeWhileIndexedModule, "takeWhileIndexedByArray",)
                limitWhileIndexedByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("limitLast", () => {
            test("all", () => {
                const method = jest.spyOn(takeLastModule, "takeLast",)
                limitLast(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeLastModule, "takeLastByMinimalistCollectionHolder",)
                limitLastByMinimalistCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeLastModule, "takeLastByCollectionHolder",)
                limitLastByCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeLastModule, "takeLastByArray",)
                limitLastByArray(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitLastWhile", () => {
            test("all", () => {
                const method = jest.spyOn(takeLastWhileModule, "takeLastWhile",)
                limitLastWhile(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeLastWhileModule, "takeLastWhileByMinimalistCollectionHolder",)
                limitLastWhileByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeLastWhileModule, "takeLastWhileByCollectionHolder",)
                limitLastWhileByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeLastWhileModule, "takeLastWhileByArray",)
                limitLastWhileByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitLastWhileIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(takeLastWhileIndexedModule, "takeLastWhileIndexed",)
                limitLastWhileIndexed(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeLastWhileIndexedModule, "takeLastWhileIndexedByMinimalistCollectionHolder",)
                limitLastWhileIndexedByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeLastWhileIndexedModule, "takeLastWhileIndexedByCollectionHolder",)
                limitLastWhileIndexedByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeLastWhileIndexedModule, "takeLastWhileIndexedByArray",)
                limitLastWhileIndexedByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance,},},) => {
        describe("take",                 () => expect(instance.take(NaN,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        describe("takeWhile",            () => expect(instance.takeWhile(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        describe("takeWhileIndexed",     () => expect(instance.takeWhileIndexed(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)

        describe("takeLast",             () => expect(instance.takeLast(NaN,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        describe("takeLastWhile",        () => expect(instance.takeLastWhile(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        describe("takeLastWhileIndexed", () => expect(instance.takeLastWhileIndexed(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
    },)},)

    describe("instances", () => {
    describe.each(everyInstances,)("%s", ({value: {instance,},},) => {
        describe("get() being called", () => {
            describe("take", () => {
                describe("empty", () => {
                    test("NaN", () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.take(NaN,),)      .amountOfCall,).toBe(0,),)
                    test("-∞",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.take(-Infinity,),).amountOfCall,).toBe(0,),)
                    test("-1",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.take(-1,),)       .amountOfCall,).toBe(0,),)
                    test('0',   () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.take(0,),)        .amountOfCall,).toBe(0,),)
                    test('1',   () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.take(1,),)        .amountOfCall,).toBe(0,),)
                    test("+∞",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.take(Infinity,),) .amountOfCall,).toBe(0,),)
                },)
                describe("1 field", () => {
                    test("NaN", () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.take(NaN,),),)    .amountOfCall,).toBe(1,),)
                    test("-∞",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it =>                                                  it.take(-Infinity,),).amountOfCall,).toBe(0,),)
                    test("-2",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it =>                                                  it.take(-2,),)       .amountOfCall,).toBe(0,),)
                    test("-1",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it =>                                                  it.take(-1,),)       .amountOfCall,).toBe(0,),)
                    test('0',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it =>                                                  it.take(0,),)        .amountOfCall,).toBe(0,),)
                    test('1',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it =>                                                  it.take(1,),)        .amountOfCall,).toBe(1,),)
                    test('2',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it =>                                                  it.take(2,),)        .amountOfCall,).toBe(1,),)
                    test("+∞",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it =>                                                  it.take(Infinity,),) .amountOfCall,).toBe(1,),)
                },)
                describe("2 fields", () => {
                    test("NaN", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.take(NaN,),),)    .amountOfCall,).toBe(2,),)
                    test("-∞",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.take(-Infinity,),).amountOfCall,).toBe(0,),)
                    test("-3",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.take(-3,),)       .amountOfCall,).toBe(0,),)
                    test("-2",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.take(-2,),)       .amountOfCall,).toBe(0,),)
                    test("-1",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.take(-1,),)       .amountOfCall,).toBe(1,),)
                    test('0',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.take(0,),)        .amountOfCall,).toBe(0,),)
                    test('1',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.take(1,),)        .amountOfCall,).toBe(1,),)
                    test('2',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.take(2,),)        .amountOfCall,).toBe(2,),)
                    test('3',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.take(3,),)        .amountOfCall,).toBe(2,),)
                    test("+∞",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.take(Infinity,),) .amountOfCall,).toBe(2,),)
                },)
                describe("4 fields", () => {
                    test("NaN", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.take(NaN,),),)    .amountOfCall,).toBe(4,),)
                    test("-∞",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.take(-Infinity,),).amountOfCall,).toBe(0,),)
                    test("-5",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.take(-5,),)       .amountOfCall,).toBe(0,),)
                    test("-4",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.take(-4,),)       .amountOfCall,).toBe(0,),)
                    test("-3",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.take(-3,),)       .amountOfCall,).toBe(1,),)
                    test("-2",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.take(-2,),)       .amountOfCall,).toBe(2,),)
                    test("-1",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.take(-1,),)       .amountOfCall,).toBe(3,),)
                    test('0',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.take(0,),)        .amountOfCall,).toBe(0,),)
                    test('1',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.take(1,),)        .amountOfCall,).toBe(1,),)
                    test('2',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.take(2,),)        .amountOfCall,).toBe(2,),)
                    test('3',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.take(3,),)        .amountOfCall,).toBe(3,),)
                    test('4',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.take(4,),)        .amountOfCall,).toBe(4,),)
                    test('5',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.take(5,),)        .amountOfCall,).toBe(4,),)
                    test("+∞",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.take(Infinity,),) .amountOfCall,).toBe(4,),)
                },)
            },)
            describe("takeWhile", () => {
                test("(T, number) → true",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(T) → true",          () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("(T, number) → false", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(number) → true",     () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("(number, T) → false", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)

            describe("takeLast", () => {
                describe("empty", () => {
                    test("NaN", () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLast(NaN,),)      .amountOfCall,).toBe(0,),)
                    test("-∞",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLast(-Infinity,),).amountOfCall,).toBe(0,),)
                    test("-1",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLast(-1,),)       .amountOfCall,).toBe(0,),)
                    test('0',   () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLast(0,),)        .amountOfCall,).toBe(0,),)
                    test('1',   () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLast(1,),)        .amountOfCall,).toBe(0,),)
                    test("+∞",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLast(Infinity,),) .amountOfCall,).toBe(0,),)
                },)
                describe("1 field", () => {
                    test("NaN", () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.takeLast(NaN,),),)    .amountOfCall,).toBe(1,),)
                    test("-∞",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(-Infinity,),).amountOfCall,).toBe(0,),)
                    test("-2",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(-2,),)       .amountOfCall,).toBe(0,),)
                    test("-1",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(-1,),)       .amountOfCall,).toBe(0,),)
                    test('0',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(0,),)        .amountOfCall,).toBe(0,),)
                    test('1',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(1,),)        .amountOfCall,).toBe(1,),)
                    test('2',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(2,),)        .amountOfCall,).toBe(1,),)
                    test("+∞",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(Infinity,),) .amountOfCall,).toBe(1,),)
                },)
                describe("2 fields", () => {
                    test("NaN", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.takeLast(NaN,),),)    .amountOfCall,).toBe(2,),)
                    test("-∞",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(-Infinity,),).amountOfCall,).toBe(0,),)
                    test("-3",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(-3,),)       .amountOfCall,).toBe(0,),)
                    test("-2",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(-2,),)       .amountOfCall,).toBe(0,),)
                    test("-1",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(-1,),)       .amountOfCall,).toBe(1,),)
                    test('0',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(0,),)        .amountOfCall,).toBe(0,),)
                    test('1',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(1,),)        .amountOfCall,).toBe(1,),)
                    test('2',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(2,),)        .amountOfCall,).toBe(2,),)
                    test('3',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(3,),)        .amountOfCall,).toBe(2,),)
                    test("+∞",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(Infinity,),) .amountOfCall,).toBe(2,),)
                },)
                describe("4 fields", () => {
                    test("NaN", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.takeLast(NaN,),),)    .amountOfCall,).toBe(4,),)
                    test("-∞",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(-Infinity,),).amountOfCall,).toBe(0,),)
                    test("-5",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(-5,),)       .amountOfCall,).toBe(0,),)
                    test("-4",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(-4,),)       .amountOfCall,).toBe(0,),)
                    test("-3",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(-3,),)       .amountOfCall,).toBe(1,),)
                    test("-2",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(-2,),)       .amountOfCall,).toBe(2,),)
                    test("-1",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(-1,),)       .amountOfCall,).toBe(3,),)
                    test('0',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(0,),)        .amountOfCall,).toBe(0,),)
                    test('1',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(1,),)        .amountOfCall,).toBe(1,),)
                    test('2',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(2,),)        .amountOfCall,).toBe(2,),)
                    test('3',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(3,),)        .amountOfCall,).toBe(3,),)
                    test('4',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(4,),)        .amountOfCall,).toBe(4,),)
                    test('5',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(5,),)        .amountOfCall,).toBe(4,),)
                    test("+∞",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it =>                                                  it.takeLast(Infinity,),) .amountOfCall,).toBe(4,),)
                },)
            },)
            describe("takeLastWhile", () => {
                test("(T, number) → true",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(T) → true",          () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("(T, number) → false", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(number) → true",     () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("(number, T) → false", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
        },)

        describe("take", () => {
            describe("empty", () => {
                test("NaN", () => expect(new instance(EMPTY,).take(NaN,),)      .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-∞",  () => expect(new instance(EMPTY,).take(-Infinity,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-1",  () => expect(new instance(EMPTY,).take(-1,),)       .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('0',   () => expect(new instance(EMPTY,).take(0,),)        .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(EMPTY,).take(1,),)        .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(new instance(EMPTY,).take(Infinity,),) .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("1 field", () => {
                test("NaN", () => expect(() => new instance(A,).take(NaN,),)         .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(A,).take(-Infinity,),)         .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-2",  () => expect(new instance(A,).take(-2,),)                .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-1",  () => expect(new instance(A,).take(-1,),)                .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('0',   () => expect(new instance(A,).take(0,),)                 .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(A,).take(1,).toArray(),)       .toStrictEqual(A,),)
                test('2',   () => expect(new instance(A,).take(2,).toArray(),)       .toStrictEqual(A,),)
                test("+∞",  () => expect(new instance(A,).take(Infinity,).toArray(),).toStrictEqual(A,),)
            },)
            describe("2 fields", () => {
                test("NaN", () => expect(() => new instance(AB,).take(NaN,),)               .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(      new instance(AB,).take(-Infinity,),)         .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-3",  () => expect(      new instance(AB,).take(-3,),)                .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-2",  () => expect(      new instance(AB,).take(-2,),)                .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-1",  () => expect(      new instance(AB,).take(-1,).toArray(),)      .toStrictEqual(A,),)
                test('0',   () => expect(      new instance(AB,).take(0,),)                 .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(      new instance(AB,).take(1,).toArray(),)       .toStrictEqual(A,),)
                test('2',   () => expect(      new instance(AB,).take(2,).toArray(),)       .toStrictEqual(AB,),)
                test('3',   () => expect(      new instance(AB,).take(3,).toArray(),)       .toStrictEqual(AB,),)
                test("+∞",  () => expect(      new instance(AB,).take(Infinity,).toArray(),).toStrictEqual(AB,),)
            },)
            describe("4 fields", () => {
                test("NaN", () => expect(() => new instance(ABCD,).take(NaN,),)               .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(      new instance(ABCD,).take(-Infinity,),)         .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-5",  () => expect(      new instance(ABCD,).take(-5,),)                .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-4",  () => expect(      new instance(ABCD,).take(-4,),)                .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-3",  () => expect(      new instance(ABCD,).take(-3,).toArray(),)      .toStrictEqual(A,),)
                test("-2",  () => expect(      new instance(ABCD,).take(-2,).toArray(),)      .toStrictEqual(AB,),)
                test("-1",  () => expect(      new instance(ABCD,).take(-1,).toArray(),)      .toStrictEqual(ABC,),)
                test('0',   () => expect(      new instance(ABCD,).take(0,),)                 .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(      new instance(ABCD,).take(1,).toArray(),)       .toStrictEqual(A,),)
                test('2',   () => expect(      new instance(ABCD,).take(2,).toArray(),)       .toStrictEqual(AB,),)
                test('3',   () => expect(      new instance(ABCD,).take(3,).toArray(),)       .toStrictEqual(ABC,),)
                test('4',   () => expect(      new instance(ABCD,).take(4,).toArray(),)       .toStrictEqual(ABCD,),)
                test('5',   () => expect(      new instance(ABCD,).take(5,).toArray(),)       .toStrictEqual(ABCD,),)
                test("+∞",  () => expect(      new instance(ABCD,).take(Infinity,).toArray(),).toStrictEqual(ABCD,),)
            },)
        },)
        describe("takeWhile", () => {
            describe("empty", () => {
                test("(T, number) → boolean", () => expect(new instance(EMPTY,).takeWhile(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("(T) → boolean",         () => expect(new instance(EMPTY,).takeWhile(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("() → boolean",          () => expect(new instance(EMPTY,).takeWhile(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                test("1 field: (T, number) → true",   () => expect(new instance(A,)   .takeWhile(callbackAsTrue2,).toArray(),).toStrictEqual(A,),)
                test("1 field: (T) → true",           () => expect(new instance(A,)   .takeWhile(callbackAsTrue1,).toArray(),).toStrictEqual(A,),)
                test("1 field: () → true",            () => expect(new instance(A,)   .takeWhile(callbackAsTrue0,).toArray(),).toStrictEqual(A,),)
                test("1 field: (T, number) → false",  () => expect(new instance(A,)   .takeWhile(callbackAsFalse2,),)         .toBeEmpty(),)
                test("1 field: (T) → false",          () => expect(new instance(A,)   .takeWhile(callbackAsFalse1,),)         .toBeEmpty(),)
                test("1 field: () → false",           () => expect(new instance(A,)   .takeWhile(callbackAsFalse0,),)         .toBeEmpty(),)
                test("2 fields: (T, number) → true",  () => expect(new instance(AB,)  .takeWhile(callbackAsTrue2,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: (T) → true",          () => expect(new instance(AB,)  .takeWhile(callbackAsTrue1,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: () → true",           () => expect(new instance(AB,)  .takeWhile(callbackAsTrue0,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: (T, number) → false", () => expect(new instance(AB,)  .takeWhile(callbackAsFalse2,),)         .toBeEmpty(),)
                test("2 fields: (T) → false",         () => expect(new instance(AB,)  .takeWhile(callbackAsFalse1,),)         .toBeEmpty(),)
                test("2 fields: () → false",          () => expect(new instance(AB,)  .takeWhile(callbackAsFalse0,),)         .toBeEmpty(),)
                test("4 fields: (T, number) → true",  () => expect(new instance(ABCD,).takeWhile(callbackAsTrue2,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: (T) → true",          () => expect(new instance(ABCD,).takeWhile(callbackAsTrue1,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: () → true",           () => expect(new instance(ABCD,).takeWhile(callbackAsTrue0,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: (T, number) → false", () => expect(new instance(ABCD,).takeWhile(callbackAsFalse2,),)         .toBeEmpty(),)
                test("4 fields: (T) → false",         () => expect(new instance(ABCD,).takeWhile(callbackAsFalse1,),)         .toBeEmpty(),)
                test("4 fields: () → false",          () => expect(new instance(ABCD,).takeWhile(callbackAsFalse0,),)         .toBeEmpty(),)
            },)
            describe("1 field", () => {
                test('a', () => expect(new instance(A,).takeWhile(callbackIsUnderA,),)             .toBeEmpty(),)
                test('e', () => expect(new instance(A,).takeWhile(callbackIsUnderE,).toArray(),)   .toStrictEqual(A,),)
                test('0', () => expect(new instance(A,).takeWhile(callbackIsUnder0Alt,),)          .toBeEmpty(),)
                test('4', () => expect(new instance(A,).takeWhile(callbackIsUnder4Alt,).toArray(),).toStrictEqual(A,),)
            },)
            describe("2 fields", () => {
                test('a', () => expect(new instance(AB,).takeWhile(callbackIsUnderA,),)             .toBeEmpty(),)
                test('b', () => expect(new instance(AB,).takeWhile(callbackIsUnderB,).toArray(),)   .toStrictEqual(A,),)
                test('e', () => expect(new instance(AB,).takeWhile(callbackIsUnderE,).toArray(),)   .toStrictEqual(AB,),)
                test('0', () => expect(new instance(AB,).takeWhile(callbackIsUnder0Alt,),)          .toBeEmpty(),)
                test('1', () => expect(new instance(AB,).takeWhile(callbackIsUnder1Alt,).toArray(),).toStrictEqual(A,),)
                test('4', () => expect(new instance(AB,).takeWhile(callbackIsUnder4Alt,).toArray(),).toStrictEqual(AB,),)
            },)
            describe("4 fields", () => {
                test('a', () => expect(new instance(ABCD,).takeWhile(callbackIsUnderA,),)             .toBeEmpty(),)
                test('b', () => expect(new instance(ABCD,).takeWhile(callbackIsUnderB,).toArray(),)   .toStrictEqual(A,),)
                test('c', () => expect(new instance(ABCD,).takeWhile(callbackIsUnderC,).toArray(),)   .toStrictEqual(AB,),)
                test('d', () => expect(new instance(ABCD,).takeWhile(callbackIsUnderD,).toArray(),)   .toStrictEqual(ABC,),)
                test('e', () => expect(new instance(ABCD,).takeWhile(callbackIsUnderE,).toArray(),)   .toStrictEqual(ABCD,),)
                test('0', () => expect(new instance(ABCD,).takeWhile(callbackIsUnder0Alt,),)          .toBeEmpty(),)
                test('1', () => expect(new instance(ABCD,).takeWhile(callbackIsUnder1Alt,).toArray(),).toStrictEqual(A,),)
                test('2', () => expect(new instance(ABCD,).takeWhile(callbackIsUnder2Alt,).toArray(),).toStrictEqual(AB,),)
                test('3', () => expect(new instance(ABCD,).takeWhile(callbackIsUnder3Alt,).toArray(),).toStrictEqual(ABC,),)
                test('4', () => expect(new instance(ABCD,).takeWhile(callbackIsUnder4Alt,).toArray(),).toStrictEqual(ABCD,),)
            },)
        },)
        describe("takeWhileIndexed", () => {
            describe("empty", () => {
                test("(number, T) → boolean", () => expect(new instance(EMPTY,).takeWhileIndexed(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("(number) → boolean",    () => expect(new instance(EMPTY,).takeWhileIndexed(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("() → boolean",          () => expect(new instance(EMPTY,).takeWhileIndexed(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                test("1 field: (number, T) → true",   () => expect(new instance(A,)   .takeWhileIndexed(callbackAsTrue2,).toArray(),).toStrictEqual(A,),)
                test("1 field: (number) → true",      () => expect(new instance(A,)   .takeWhileIndexed(callbackAsTrue1,).toArray(),).toStrictEqual(A,),)
                test("1 field: () → true",            () => expect(new instance(A,)   .takeWhileIndexed(callbackAsTrue0,).toArray(),).toStrictEqual(A,),)
                test("1 field: (number, T) → false",  () => expect(new instance(A,)   .takeWhileIndexed(callbackAsFalse2,),)          .toBeEmpty(),)
                test("1 field: (number) → false",     () => expect(new instance(A,)   .takeWhileIndexed(callbackAsFalse1,),)          .toBeEmpty(),)
                test("1 field: () → false",           () => expect(new instance(A,)   .takeWhileIndexed(callbackAsFalse0,),)          .toBeEmpty(),)
                test("2 fields: (number, T) → true",  () => expect(new instance(AB,)  .takeWhileIndexed(callbackAsTrue2,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: (number) → true",     () => expect(new instance(AB,)  .takeWhileIndexed(callbackAsTrue1,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: () → true",           () => expect(new instance(AB,)  .takeWhileIndexed(callbackAsTrue0,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: (number, T) → false", () => expect(new instance(AB,)  .takeWhileIndexed(callbackAsFalse2,),)          .toBeEmpty(),)
                test("2 fields: (number) → false",    () => expect(new instance(AB,)  .takeWhileIndexed(callbackAsFalse1,),)          .toBeEmpty(),)
                test("2 fields: () → false",          () => expect(new instance(AB,)  .takeWhileIndexed(callbackAsFalse0,),)          .toBeEmpty(),)
                test("4 fields: (number, T) → true",  () => expect(new instance(ABCD,).takeWhileIndexed(callbackAsTrue2,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: (number) → true",     () => expect(new instance(ABCD,).takeWhileIndexed(callbackAsTrue1,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: () → true",           () => expect(new instance(ABCD,).takeWhileIndexed(callbackAsTrue0,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: (number, T) → false", () => expect(new instance(ABCD,).takeWhileIndexed(callbackAsFalse2,),)          .toBeEmpty(),)
                test("4 fields: (number) → false",    () => expect(new instance(ABCD,).takeWhileIndexed(callbackAsFalse1,),)          .toBeEmpty(),)
                test("4 fields: () → false",          () => expect(new instance(ABCD,).takeWhileIndexed(callbackAsFalse0,),)          .toBeEmpty(),)
            },)
            describe("1 field", () => {
                test('a', () => expect(new instance(A,).takeWhileIndexed(callbackIsUnderAAlt,),)          .toBeEmpty(),)
                test('e', () => expect(new instance(A,).takeWhileIndexed(callbackIsUnderEAlt,).toArray(),).toStrictEqual(A,),)
                test('0', () => expect(new instance(A,).takeWhileIndexed(callbackIsUnder0,),)             .toBeEmpty(),)
                test('4', () => expect(new instance(A,).takeWhileIndexed(callbackIsUnder4,).toArray(),)   .toStrictEqual(A,),)
            },)
            describe("2 fields", () => {
                test('a', () => expect(new instance(AB,).takeWhileIndexed(callbackIsUnderAAlt,),)          .toBeEmpty(),)
                test('b', () => expect(new instance(AB,).takeWhileIndexed(callbackIsUnderBAlt,).toArray(),).toStrictEqual(A,),)
                test('e', () => expect(new instance(AB,).takeWhileIndexed(callbackIsUnderEAlt,).toArray(),).toStrictEqual(AB,),)
                test('0', () => expect(new instance(AB,).takeWhileIndexed(callbackIsUnder0,),)             .toBeEmpty(),)
                test('1', () => expect(new instance(AB,).takeWhileIndexed(callbackIsUnder1,).toArray(),)   .toStrictEqual(A,),)
                test('4', () => expect(new instance(AB,).takeWhileIndexed(callbackIsUnder4,).toArray(),)   .toStrictEqual(AB,),)
            },)
            describe("4 fields", () => {
                test('a', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnderAAlt,),)          .toBeEmpty(),)
                test('b', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnderBAlt,).toArray(),).toStrictEqual(A,),)
                test('c', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnderCAlt,).toArray(),).toStrictEqual(AB,),)
                test('d', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnderDAlt,).toArray(),).toStrictEqual(ABC,),)
                test('e', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnderEAlt,).toArray(),).toStrictEqual(ABCD,),)
                test('0', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnder0,),)             .toBeEmpty(),)
                test('1', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnder1,).toArray(),)   .toStrictEqual(A,),)
                test('2', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnder2,).toArray(),)   .toStrictEqual(AB,),)
                test('3', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnder3,).toArray(),)   .toStrictEqual(ABC,),)
                test('4', () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnder4,).toArray(),)   .toStrictEqual(ABCD,),)
            },)
        },)

        describe("takeLast", () => {
            describe("empty", () => {
                test("NaN", () => expect(new instance(EMPTY,).takeLast(NaN,),)      .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-∞",  () => expect(new instance(EMPTY,).takeLast(-Infinity,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-1",  () => expect(new instance(EMPTY,).takeLast(-1,),)       .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('0',   () => expect(new instance(EMPTY,).takeLast(0,),)        .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(EMPTY,).takeLast(1,),)        .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(new instance(EMPTY,).takeLast(Infinity,),) .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("1 field", () => {
                test("NaN", () => expect(() => new instance(A,).takeLast(NaN,),)         .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(A,).takeLast(-Infinity,),)         .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-2",  () => expect(new instance(A,).takeLast(-2,),)                .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-1",  () => expect(new instance(A,).takeLast(-1,),)                .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('0',   () => expect(new instance(A,).takeLast(0,),)                 .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(A,).takeLast(1,).toArray(),)       .toStrictEqual(A,),)
                test('2',   () => expect(new instance(A,).takeLast(2,).toArray(),)       .toStrictEqual(A,),)
                test("+∞",  () => expect(new instance(A,).takeLast(Infinity,).toArray(),).toStrictEqual(A,),)
            },)
            describe("2 fields", () => {
                test("NaN", () => expect(() => new instance(AB,).takeLast(NaN,),)         .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(AB,).takeLast(-Infinity,),)         .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-3",  () => expect(new instance(AB,).takeLast(-3,),)                .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-2",  () => expect(new instance(AB,).takeLast(-2,),)                .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-1",  () => expect(new instance(AB,).takeLast(-1,).toArray(),)      .toStrictEqual(B,),)
                test('0',   () => expect(new instance(AB,).takeLast(0,),)                 .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(AB,).takeLast(1,).toArray(),)       .toStrictEqual(B,),)
                test('2',   () => expect(new instance(AB,).takeLast(2,).toArray(),)       .toStrictEqual(AB,),)
                test('3',   () => expect(new instance(AB,).takeLast(3,).toArray(),)       .toStrictEqual(AB,),)
                test("+∞",  () => expect(new instance(AB,).takeLast(Infinity,).toArray(),).toStrictEqual(AB,),)
            },)
            describe("4 fields", () => {
                test("NaN", () => expect(() => new instance(ABCD,).takeLast(NaN,),)         .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(ABCD,).takeLast(-Infinity,),)         .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-5",  () => expect(new instance(ABCD,).takeLast(-5,),)                .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-4",  () => expect(new instance(ABCD,).takeLast(-4,),)                .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-3",  () => expect(new instance(ABCD,).takeLast(-3,).toArray(),)      .toStrictEqual(D,),)
                test("-2",  () => expect(new instance(ABCD,).takeLast(-2,).toArray(),)      .toStrictEqual(CD,),)
                test("-1",  () => expect(new instance(ABCD,).takeLast(-1,).toArray(),)      .toStrictEqual(BCD,),)
                test('0',   () => expect(new instance(ABCD,).takeLast(0,),)                 .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(ABCD,).takeLast(1,).toArray(),)       .toStrictEqual(D,),)
                test('2',   () => expect(new instance(ABCD,).takeLast(2,).toArray(),)       .toStrictEqual(CD,),)
                test('3',   () => expect(new instance(ABCD,).takeLast(3,).toArray(),)       .toStrictEqual(BCD,),)
                test('4',   () => expect(new instance(ABCD,).takeLast(4,).toArray(),)       .toStrictEqual(ABCD,),)
                test('5',   () => expect(new instance(ABCD,).takeLast(5,).toArray(),)       .toStrictEqual(ABCD,),)
                test("+∞",  () => expect(new instance(ABCD,).takeLast(Infinity,).toArray(),).toStrictEqual(ABCD,),)
            },)
        },)
        describe("takeLastWhile", () => {
            describe("empty", () => {
                test("(T, number) → boolean", () => expect(new instance(EMPTY,).takeLastWhile(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("(T) → boolean",         () => expect(new instance(EMPTY,).takeLastWhile(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("() → boolean",          () => expect(new instance(EMPTY,).takeLastWhile(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                test("1 field: (T, number) → true",   () => expect(new instance(A,)   .takeLastWhile(callbackAsTrue2,).toArray(),).toStrictEqual(A,),)
                test("1 field: (T) → true",           () => expect(new instance(A,)   .takeLastWhile(callbackAsTrue1,).toArray(),).toStrictEqual(A,),)
                test("1 field: () → true",            () => expect(new instance(A,)   .takeLastWhile(callbackAsTrue0,).toArray(),).toStrictEqual(A,),)
                test("1 field: (T, number) → false",  () => expect(new instance(A,)   .takeLastWhile(callbackAsFalse2,),)         .toBeEmpty(),)
                test("1 field: (T) → false",          () => expect(new instance(A,)   .takeLastWhile(callbackAsFalse1,),)         .toBeEmpty(),)
                test("1 field: () → false",           () => expect(new instance(A,)   .takeLastWhile(callbackAsFalse0,),)         .toBeEmpty(),)
                test("2 fields: (T, number) → true",  () => expect(new instance(AB,)  .takeLastWhile(callbackAsTrue2,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: (T) → true",          () => expect(new instance(AB,)  .takeLastWhile(callbackAsTrue1,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: () → true",           () => expect(new instance(AB,)  .takeLastWhile(callbackAsTrue0,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: (T, number) → false", () => expect(new instance(AB,)  .takeLastWhile(callbackAsFalse2,),)         .toBeEmpty(),)
                test("2 fields: (T) → false",         () => expect(new instance(AB,)  .takeLastWhile(callbackAsFalse1,),)         .toBeEmpty(),)
                test("2 fields: () → false",          () => expect(new instance(AB,)  .takeLastWhile(callbackAsFalse0,),)         .toBeEmpty(),)
                test("4 fields: (T, number) → true",  () => expect(new instance(ABCD,).takeLastWhile(callbackAsTrue2,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: (T) → true",          () => expect(new instance(ABCD,).takeLastWhile(callbackAsTrue1,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: () → true",           () => expect(new instance(ABCD,).takeLastWhile(callbackAsTrue0,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: (T, number) → false", () => expect(new instance(ABCD,).takeLastWhile(callbackAsFalse2,),)         .toBeEmpty(),)
                test("4 fields: (T) → false",         () => expect(new instance(ABCD,).takeLastWhile(callbackAsFalse1,),)         .toBeEmpty(),)
                test("4 fields: () → false",          () => expect(new instance(ABCD,).takeLastWhile(callbackAsFalse0,),)         .toBeEmpty(),)
            },)
            describe("1 field", () => {
                test('a', () => expect(new instance(A,).takeLastWhile(callbackIsOverA,),)   .toBeEmpty(),)
                test('e', () => expect(new instance(A,).takeLastWhile(callbackIsOverE,),)   .toBeEmpty(),)
                test('0', () => expect(new instance(A,).takeLastWhile(callbackIsOver0Alt,),).toBeEmpty(),)
                test('4', () => expect(new instance(A,).takeLastWhile(callbackIsOver4Alt,),).toBeEmpty(),)
            },)
            describe("2 fields", () => {
                test('a', () => expect(new instance(AB,).takeLastWhile(callbackIsOverA,).toArray(),)   .toStrictEqual(B,),)
                test('b', () => expect(new instance(AB,).takeLastWhile(callbackIsOverB,),)             .toBeEmpty(),)
                test('e', () => expect(new instance(AB,).takeLastWhile(callbackIsOverE,),)             .toBeEmpty(),)
                test('0', () => expect(new instance(AB,).takeLastWhile(callbackIsOver0Alt,).toArray(),).toStrictEqual(B,),)
                test('1', () => expect(new instance(AB,).takeLastWhile(callbackIsOver1Alt,),)          .toBeEmpty(),)
                test('4', () => expect(new instance(AB,).takeLastWhile(callbackIsOver4Alt,),)          .toBeEmpty(),)
            },)
            describe("4 fields", () => {
                test('a', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOverA,).toArray(),)   .toStrictEqual(BCD),)
                test('b', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOverB,).toArray(),)   .toStrictEqual(CD,),)
                test('c', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOverC,).toArray(),)   .toStrictEqual(D,),)
                test('d', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOverD,),)             .toBeEmpty(),)
                test('e', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOverE,),)             .toBeEmpty(),)
                test('0', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOver0Alt,).toArray(),).toStrictEqual(BCD),)
                test('1', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOver1Alt,).toArray(),).toStrictEqual(CD,),)
                test('2', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOver2Alt,).toArray(),).toStrictEqual(D,),)
                test('3', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOver3Alt,),)          .toBeEmpty(),)
                test('4', () => expect(new instance(ABCD,).takeLastWhile(callbackIsOver4Alt,),)          .toBeEmpty(),)
            },)
        },)
        describe("takeLastWhileIndexed", () => {
            describe("empty", () => {
                test("(number, T) → boolean", () => expect(new instance(EMPTY,).takeLastWhileIndexed(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("(number) → boolean",    () => expect(new instance(EMPTY,).takeLastWhileIndexed(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("() → boolean",          () => expect(new instance(EMPTY,).takeLastWhileIndexed(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                test("1 field: (number, T) → true",   () => expect(new instance(A,)   .takeLastWhileIndexed(callbackAsTrue2,).toArray(),).toStrictEqual(A,),)
                test("1 field: (number) → true",      () => expect(new instance(A,)   .takeLastWhileIndexed(callbackAsTrue1,).toArray(),).toStrictEqual(A,),)
                test("1 field: () → true",            () => expect(new instance(A,)   .takeLastWhileIndexed(callbackAsTrue0,).toArray(),).toStrictEqual(A,),)
                test("1 field: (number, T) → false",  () => expect(new instance(A,)   .takeLastWhileIndexed(callbackAsFalse2,),)         .toBeEmpty(),)
                test("1 field: (number) → false",     () => expect(new instance(A,)   .takeLastWhileIndexed(callbackAsFalse1,),)         .toBeEmpty(),)
                test("1 field: () → false",           () => expect(new instance(A,)   .takeLastWhileIndexed(callbackAsFalse0,),)         .toBeEmpty(),)
                test("2 fields: (number, T) → true",  () => expect(new instance(AB,)  .takeLastWhileIndexed(callbackAsTrue2,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: (number) → true",     () => expect(new instance(AB,)  .takeLastWhileIndexed(callbackAsTrue1,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: () → true",           () => expect(new instance(AB,)  .takeLastWhileIndexed(callbackAsTrue0,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: (number, T) → false", () => expect(new instance(AB,)  .takeLastWhileIndexed(callbackAsFalse2,),)         .toBeEmpty(),)
                test("2 fields: (number) → false",    () => expect(new instance(AB,)  .takeLastWhileIndexed(callbackAsFalse1,),)         .toBeEmpty(),)
                test("2 fields: () → false",          () => expect(new instance(AB,)  .takeLastWhileIndexed(callbackAsFalse0,),)         .toBeEmpty(),)
                test("4 fields: (number, T) → true",  () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackAsTrue2,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: (number) → true",     () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackAsTrue1,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: () → true",           () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackAsTrue0,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: (number, T) → false", () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackAsFalse2,),)         .toBeEmpty(),)
                test("4 fields: (number) → false",    () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackAsFalse1,),)         .toBeEmpty(),)
                test("4 fields: () → false",          () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackAsFalse0,),)         .toBeEmpty(),)
            },)
            describe("1 field", () => {
                test('a', () => expect(new instance(A,).takeLastWhileIndexed(callbackIsOverAAlt,),).toBeEmpty(),)
                test('e', () => expect(new instance(A,).takeLastWhileIndexed(callbackIsOverEAlt,),).toBeEmpty(),)
                test('0', () => expect(new instance(A,).takeLastWhileIndexed(callbackIsOver0,),)   .toBeEmpty(),)
                test('4', () => expect(new instance(A,).takeLastWhileIndexed(callbackIsOver4,),)   .toBeEmpty(),)
            },)
            describe("2 fields", () => {
                test('a', () => expect(new instance(AB,).takeLastWhileIndexed(callbackIsOverAAlt,).toArray(),).toStrictEqual(B,),)
                test('b', () => expect(new instance(AB,).takeLastWhileIndexed(callbackIsOverBAlt,),)          .toBeEmpty(),)
                test('e', () => expect(new instance(AB,).takeLastWhileIndexed(callbackIsOverEAlt,),)          .toBeEmpty(),)
                test('0', () => expect(new instance(AB,).takeLastWhileIndexed(callbackIsOver0,).toArray(),)   .toStrictEqual(B,),)
                test('1', () => expect(new instance(AB,).takeLastWhileIndexed(callbackIsOver1,),)             .toBeEmpty(),)
                test('4', () => expect(new instance(AB,).takeLastWhileIndexed(callbackIsOver4,),)             .toBeEmpty(),)
            },)
            describe("4 fields", () => {
                test('a', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOverAAlt,).toArray(),).toStrictEqual(BCD,),)
                test('b', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOverBAlt,).toArray(),).toStrictEqual(CD,),)
                test('c', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOverCAlt,).toArray(),).toStrictEqual(D,),)
                test('d', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOverDAlt,),)          .toBeEmpty(),)
                test('e', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOverEAlt,),)          .toBeEmpty(),)
                test('0', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOver0,).toArray(),)   .toStrictEqual(BCD,),)
                test('1', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOver1,).toArray(),)   .toStrictEqual(CD,),)
                test('2', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOver2,).toArray(),)   .toStrictEqual(D,),)
                test('3', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOver3,),)             .toBeEmpty(),)
                test('4', () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOver4,),)             .toBeEmpty(),)
            },)
        },)
    },)},)

},)
