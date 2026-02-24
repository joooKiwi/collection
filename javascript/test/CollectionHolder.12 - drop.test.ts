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

import {GenericCollectionHolder_DropAlias}                                                                                                                                                                                                                                                                                                                                                          from "./instance/GenericCollectionHolder_DropAlias"
import {GenericCollectionHolder_DropLastAlias}                                                                                                                                                                                                                                                                                                                                                      from "./instance/GenericCollectionHolder_DropLastAlias"
import {GenericCollectionHolder_DropLastWhileAlias}                                                                                                                                                                                                                                                                                                                                                 from "./instance/GenericCollectionHolder_DropLastWhileAlias"
import {GenericCollectionHolder_DropLastWhileIndexedAlias}                                                                                                                                                                                                                                                                                                                                          from "./instance/GenericCollectionHolder_DropLastWhileIndexedAlias"
import {GenericCollectionHolder_DropWhileAlias}                                                                                                                                                                                                                                                                                                                                                     from "./instance/GenericCollectionHolder_DropWhileAlias"
import {GenericCollectionHolder_DropWhileIndexedAlias}                                                                                                                                                                                                                                                                                                                                              from "./instance/GenericCollectionHolder_DropWhileIndexedAlias"
import {LazyGenericCollectionHolder_DropAlias}                                                                                                                                                                                                                                                                                                                                                      from "./instance/LazyGenericCollectionHolder_DropAlias"
import {LazyGenericCollectionHolder_DropLastAlias}                                                                                                                                                                                                                                                                                                                                                  from "./instance/LazyGenericCollectionHolder_DropLastAlias"
import {LazyGenericCollectionHolder_DropLastWhileAlias}                                                                                                                                                                                                                                                                                                                                             from "./instance/LazyGenericCollectionHolder_DropLastWhileAlias"
import {LazyGenericCollectionHolder_DropLastWhileIndexedAlias}                                                                                                                                                                                                                                                                                                                                      from "./instance/LazyGenericCollectionHolder_DropLastWhileIndexedAlias"
import {LazyGenericCollectionHolder_DropWhileAlias}                                                                                                                                                                                                                                                                                                                                                 from "./instance/LazyGenericCollectionHolder_DropWhileAlias"
import {LazyGenericCollectionHolder_DropWhileIndexedAlias}                                                                                                                                                                                                                                                                                                                                          from "./instance/LazyGenericCollectionHolder_DropWhileIndexedAlias"
import {A, AB, ABC, ABCD, B, BCD, CD, D, EMPTY}                                                                                                                                                                                                                                                                                                                                                     from "./value/arrays"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                                                                                                                                                                                                                                                                                          from "./value/callbacks (fail)"
import {callbackAsFalse0, callbackAsFalse1, callbackAsFalse2, callbackAsTrue0, callbackAsTrue1, callbackAsTrue2}                                                                                                                                                                                                                                                                                    from "./value/callbacks (boolean)"
import {callbackIsOver0, callbackIsOver0Alt, callbackIsOver1, callbackIsOver1Alt, callbackIsOver2, callbackIsOver2Alt, callbackIsOver3, callbackIsOver3Alt, callbackIsOver4, callbackIsOver4Alt, callbackIsUnder0, callbackIsUnder0Alt, callbackIsUnder1, callbackIsUnder1Alt, callbackIsUnder2, callbackIsUnder2Alt, callbackIsUnder3, callbackIsUnder3Alt, callbackIsUnder4, callbackIsUnder4Alt} from "./value/callbacks (number)"
import {callbackIsOverA, callbackIsOverAAlt, callbackIsOverB, callbackIsOverBAlt, callbackIsOverC, callbackIsOverCAlt, callbackIsOverD, callbackIsOverDAlt, callbackIsOverE, callbackIsOverEAlt, callbackIsUnderA, callbackIsUnderAAlt, callbackIsUnderB, callbackIsUnderBAlt, callbackIsUnderC, callbackIsUnderCAlt, callbackIsUnderD, callbackIsUnderDAlt, callbackIsUnderE, callbackIsUnderEAlt} from "./value/callbacks (string)"
import {everyExtensionMethodInstances, everyInstances}                                                                                                                                                                                                                                                                                                                                              from "./value/instances"

import {CollectionConstants}                                                                                                                         from "../src/CollectionConstants"
import {EmptyCollectionHolder}                                                                                                                       from "../src/EmptyCollectionHolder"
import {ForbiddenIndexException}                                                                                                                     from "../src/exception/ForbiddenIndexException"
import * as dropModule                                                                                                                               from "../src/method/drop"
import * as dropLastModule                                                                                                                           from "../src/method/dropLast"
import * as dropLastWhileModule                                                                                                                      from "../src/method/dropLastWhile"
import * as dropLastWhileIndexedModule                                                                                                               from "../src/method/dropLastWhileIndexed"
import * as dropWhileModule                                                                                                                          from "../src/method/dropWhile"
import * as dropWhileIndexedModule                                                                                                                   from "../src/method/dropWhileIndexed"
import {skip, skipByArray, skipByCollectionHolder, skipByMinimalistCollectionHolder}                                                                 from "../src/method/skip"
import {skipLast, skipLastByArray, skipLastByCollectionHolder, skipLastByMinimalistCollectionHolder}                                                 from "../src/method/skipLast"
import {skipLastWhile, skipLastWhileByArray, skipLastWhileByCollectionHolder, skipLastWhileByMinimalistCollectionHolder}                             from "../src/method/skipLastWhile"
import {skipLastWhileIndexed, skipLastWhileIndexedByArray, skipLastWhileIndexedByCollectionHolder, skipLastWhileIndexedByMinimalistCollectionHolder} from "../src/method/skipLastWhileIndexed"
import {skipWhile, skipWhileByArray, skipWhileByCollectionHolder, skipWhileByMinimalistCollectionHolder}                                             from "../src/method/skipWhile"
import {skipWhileIndexed, skipWhileIndexedByArray, skipWhileIndexedByCollectionHolder, skipWhileIndexedByMinimalistCollectionHolder}                 from "../src/method/skipWhileIndexed"

describe("CollectionHolderTest (drop)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("drop",                 () => expect(instance.drop(),)                .toBe(instance,),)
        test("skip",                 () => expect(instance.skip(),)                .toBe(instance,),)
        test("dropWhile",            () => expect(instance.dropWhile(),)           .toBe(instance,),)
        test("skipWhile",            () => expect(instance.skipWhile(),)           .toBe(instance,),)
        test("dropWhileIndexed",     () => expect(instance.dropWhileIndexed(),)    .toBe(instance,),)
        test("skipWhileIndexed",     () => expect(instance.skipWhileIndexed(),)    .toBe(instance,),)
        test("dropLast",             () => expect(instance.dropLast(),)            .toBe(instance,),)
        test("skipLast",             () => expect(instance.skipLast(),)            .toBe(instance,),)
        test("dropLastWhile",        () => expect(instance.dropLastWhile(),)       .toBe(instance,),)
        test("skipLastWhile",        () => expect(instance.skipLastWhile(),)       .toBe(instance,),)
        test("dropLastWhileIndexed", () => expect(instance.dropLastWhileIndexed(),).toBe(instance,),)
        test("skipLastWhileIndexed", () => expect(instance.skipLastWhileIndexed(),).toBe(instance,),)
    },)

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("skip",                 () => expect(new GenericCollectionHolder_DropAlias()                .execute(it => it.skip(0,),)                              .amountOfCall,).toBe(1,),)
            test("skipWhile",            () => expect(new GenericCollectionHolder_DropWhileAlias()           .execute(it => it.skipWhile(callbackAsTrue0,),)           .amountOfCall,).toBe(1,),)
            test("skipWhileIndexed",     () => expect(new GenericCollectionHolder_DropWhileIndexedAlias()    .execute(it => it.skipWhileIndexed(callbackAsTrue0,),)    .amountOfCall,).toBe(1,),)
            test("skipLast",             () => expect(new GenericCollectionHolder_DropLastAlias()            .execute(it => it.skipLast(0,),)                          .amountOfCall,).toBe(1,),)
            test("skipLastWhile",        () => expect(new GenericCollectionHolder_DropLastWhileAlias()       .execute(it => it.skipLastWhile(callbackAsTrue0,),)       .amountOfCall,).toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new GenericCollectionHolder_DropLastWhileIndexedAlias().execute(it => it.skipLastWhileIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("skip",                 () => expect(new LazyGenericCollectionHolder_DropAlias()                .execute(it => it.skip(0,),)                              .amountOfCall,).toBe(1,),)
            test("skipWhile",            () => expect(new LazyGenericCollectionHolder_DropWhileAlias()           .execute(it => it.skipWhile(callbackAsTrue0,),)           .amountOfCall,).toBe(1,),)
            test("skipWhileIndexed",     () => expect(new LazyGenericCollectionHolder_DropWhileIndexedAlias()    .execute(it => it.skipWhileIndexed(callbackAsTrue0,),)    .amountOfCall,).toBe(1,),)
            test("skipLast",             () => expect(new LazyGenericCollectionHolder_DropLastAlias()            .execute(it => it.skipLast(0,),)                          .amountOfCall,).toBe(1,),)
            test("skipLastWhile",        () => expect(new LazyGenericCollectionHolder_DropLastWhileAlias()       .execute(it => it.skipLastWhile(callbackAsTrue0,),)       .amountOfCall,).toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new LazyGenericCollectionHolder_DropLastWhileIndexedAlias().execute(it => it.skipLastWhileIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
        },)

        describe("skip", () => {
            test("all", () => {
                const method = jest.spyOn(dropModule, "drop",)
                skip(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropModule, "dropByMinimalistCollectionHolder",)
                skipByMinimalistCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropModule, "dropByCollectionHolder",)
                skipByCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropModule, "dropByArray",)
                skipByArray(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("skipWhile", () => {
            test("all", () => {
                const method = jest.spyOn(dropWhileModule, "dropWhile",)
                skipWhile(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropWhileModule, "dropWhileByMinimalistCollectionHolder",)
                skipWhileByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropWhileModule, "dropWhileByCollectionHolder",)
                skipWhileByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropWhileModule, "dropWhileByArray",)
                skipWhileByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("skipWhileIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(dropWhileIndexedModule, "dropWhileIndexed",)
                skipWhileIndexed(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropWhileIndexedModule, "dropWhileIndexedByMinimalistCollectionHolder",)
                skipWhileIndexedByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropWhileIndexedModule, "dropWhileIndexedByCollectionHolder",)
                skipWhileIndexedByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropWhileIndexedModule, "dropWhileIndexedByArray",)
                skipWhileIndexedByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("skipLast", () => {
            test("all", () => {
                const method = jest.spyOn(dropLastModule, "dropLast",)
                skipLast(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropLastModule, "dropLastByMinimalistCollectionHolder",)
                skipLastByMinimalistCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropLastModule, "dropLastByCollectionHolder",)
                skipLastByCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropLastModule, "dropLastByArray",)
                skipLastByArray(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("skipLastWhile", () => {
            test("all", () => {
                const method = jest.spyOn(dropLastWhileModule, "dropLastWhile",)
                skipLastWhile(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropLastWhileModule, "dropLastWhileByMinimalistCollectionHolder",)
                skipLastWhileByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropLastWhileModule, "dropLastWhileByCollectionHolder",)
                skipLastWhileByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropLastWhileModule, "dropLastWhileByArray",)
                skipLastWhileByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("skipLastWhileIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(dropLastWhileIndexedModule, "dropLastWhileIndexed",)
                skipLastWhileIndexed(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropLastWhileIndexedModule, "dropLastWhileIndexedByMinimalistCollectionHolder",)
                skipLastWhileIndexedByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropLastWhileIndexedModule, "dropLastWhileIndexedByCollectionHolder",)
                skipLastWhileIndexedByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropLastWhileIndexedModule, "dropLastWhileIndexedByArray",)
                skipLastWhileIndexedByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance,},},) => {
        describe("drop", () => {
            test("NaN", () => expect(instance.drop(NaN,),)      .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("-∞",  () => expect(instance.drop(-Infinity,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("-1",  () => expect(instance.drop(-1,),)       .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test('0',   () => expect(instance.drop(0,),)        .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test('1',   () => expect(instance.drop(1,),)        .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("+∞",  () => expect(instance.drop(Infinity,),) .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("dropWhile", () => {
            test("(T, number) → boolean", () => expect(instance.dropWhile(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("(T) → boolean",         () => expect(instance.dropWhile(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("() → boolean",          () => expect(instance.dropWhile(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("dropWhileIndexed", () => {
            test("(T, number) → boolean", () => expect(instance.dropWhileIndexed(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("(T) → boolean",         () => expect(instance.dropWhileIndexed(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("() → boolean",          () => expect(instance.dropWhileIndexed(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)

        describe("dropLast", () => {
            test("NaN", () => expect(instance.dropLast(NaN,),)      .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("-∞",  () => expect(instance.dropLast(-Infinity,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("-1",  () => expect(instance.dropLast(-1,),)       .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test('0',   () => expect(instance.dropLast(0,),)        .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test('1',   () => expect(instance.dropLast(1,),)        .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("+∞",  () => expect(instance.dropLast(Infinity,),) .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("dropLastWhile", () => {
            test("(T, number) → boolean", () => expect(instance.dropLastWhile(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("(T) → boolean",         () => expect(instance.dropLastWhile(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("() → boolean",          () => expect(instance.dropLastWhile(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("dropLastWhileIndexed", () => {
            test("(T, number) → boolean", () => expect(instance.dropLastWhileIndexed(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("(T) → boolean",         () => expect(instance.dropLastWhileIndexed(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("() → boolean",          () => expect(instance.dropLastWhileIndexed(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
    },)},)

    describe("instances", () => {
    describe.each(everyInstances,)("%s", ({value: {instance,},},) => {
        describe("get() being called", () => {
            describe("drop", () => {
                test("empty (0)",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.drop(0,),).amountOfCall,).toBe(0,),)
                test("empty (1)",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.drop(1,),).amountOfCall,).toBe(0,),)
                test("1 field (0)",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.drop(0,),).amountOfCall,).toBe(1,),)
                test("1 field (1)",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.drop(1,),).amountOfCall,).toBe(0,),)
                test("1 field (2)",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.drop(2,),).amountOfCall,).toBe(0,),)
                test("2 fields (0)", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.drop(0,),).amountOfCall,).toBe(2,),)
                test("2 fields (1)", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.drop(1,),).amountOfCall,).toBe(1,),)
                test("2 fields (2)", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.drop(2,),).amountOfCall,).toBe(0,),)
                test("2 fields (3)", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.drop(3,),).amountOfCall,).toBe(0,),)
                test("4 fields (0)", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.drop(0,),).amountOfCall,).toBe(4,),)
                test("4 fields (1)", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.drop(1,),).amountOfCall,).toBe(3,),)
                test("4 fields (2)", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.drop(2,),).amountOfCall,).toBe(2,),)
                test("4 fields (3)", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.drop(3,),).amountOfCall,).toBe(1,),)
                test("4 fields (4)", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.drop(4,),).amountOfCall,).toBe(0,),)
                test("4 fields (5)", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.drop(5,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropWhile", () => {
                test("empty: (T, number) → boolean",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("empty: (T) → boolean",          () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("empty: () → boolean",           () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
                test("1 field: (T, number) → true",   () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("1 field: (T) → true",           () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("1 field: () → true",            () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("1 field: (T, number) → false",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("1 field: (T) → false",          () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("1 field: () → false",           () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
                test("2 fields: (T, number) → true",  () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("2 fields: (T) → true",          () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("2 fields: () → true",           () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("2 fields: (T, number) → false", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("2 fields: (T) → false",         () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("2 fields: () → false",          () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
                test("4 fields: (T, number) → true",  () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("4 fields: (T) → true",          () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("4 fields: () → true",           () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("4 fields: (T, number) → false", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("4 fields: (T) → false",         () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("4 fields: () → false",          () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)
            describe("dropWhileIndexed", () => {
                test("empty: (number, T) → boolean",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("empty: (number) → boolean",     () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("empty: () → boolean",           () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
                test("1 field: (number, T) → true",   () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("1 field: (number) → true",      () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("1 field: () → true",            () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("1 field: (number, T) → false",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("1 field: (number) → false",     () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("1 field: () → false",           () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
                test("2 fields: (number, T) → true",  () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("2 fields: (number) → true",     () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("2 fields: () → true",           () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("2 fields: (number, T) → false", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("2 fields: (number) → false",    () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("2 fields: () → false",          () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
                test("4 fields: (number, T) → true",  () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("4 fields: (number) → true",     () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("4 fields: () → true",           () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("4 fields: (number, T) → false", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("4 fields: (number) → false",    () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("4 fields: () → false",          () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)

            describe("dropLast", () => {
                test("empty (0)",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLast(0,),).amountOfCall,).toBe(0,),)
                test("empty (1)",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLast(1,),).amountOfCall,).toBe(0,),)
                test("1 field (0)",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropLast(0,),).amountOfCall,).toBe(1,),)
                test("1 field (1)",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropLast(1,),).amountOfCall,).toBe(0,),)
                test("1 field (2)",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropLast(2,),).amountOfCall,).toBe(0,),)
                test("2 fields (0)", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropLast(0,),).amountOfCall,).toBe(2,),)
                test("2 fields (1)", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropLast(1,),).amountOfCall,).toBe(1,),)
                test("2 fields (2)", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropLast(2,),).amountOfCall,).toBe(0,),)
                test("2 fields (3)", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropLast(3,),).amountOfCall,).toBe(0,),)
                test("4 fields (0)", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLast(0,),).amountOfCall,).toBe(4,),)
                test("4 fields (1)", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLast(1,),).amountOfCall,).toBe(3,),)
                test("4 fields (2)", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLast(2,),).amountOfCall,).toBe(2,),)
                test("4 fields (3)", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLast(3,),).amountOfCall,).toBe(1,),)
                test("4 fields (4)", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLast(4,),).amountOfCall,).toBe(0,),)
                test("4 fields (5)", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLast(5,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropLastWhile", () => {
                test("empty: (T, number) → boolean",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("empty: (T) → boolean",          () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("empty: () → boolean",           () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
                test("1 field: (T, number) → true",   () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("1 field: (T) → true",           () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("1 field: () → true",            () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("1 field: (T, number) → false",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("1 field: (T) → false",          () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("1 field: () → false",           () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
                test("2 fields: (T, number) → true",  () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("2 fields: (T) → true",          () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("2 fields: () → true",           () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("2 fields: (T, number) → false", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("2 fields: (T) → false",         () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("2 fields: () → false",          () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
                test("4 fields: (T, number) → true",  () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("4 fields: (T) → true",          () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("4 fields: () → true",           () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("4 fields: (T, number) → false", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("4 fields: (T) → false",         () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("4 fields: () → false",          () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)
            describe("dropLastWhileIndexed", () => {
                test("empty: (number, T) → boolean",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("empty: (number) → boolean",     () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("empty: () → boolean",           () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
                test("1 field: (number, T) → true",   () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("1 field: (number) → true",      () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("1 field: () → true",            () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("1 field: (number, T) → false",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("1 field: (number) → false",     () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("1 field: () → false",           () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
                test("2 fields: (number, T) → true",  () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("2 fields: (number) → true",     () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("2 fields: () → true",           () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("2 fields: (number, T) → false", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("2 fields: (number) → false",    () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("2 fields: () → false",          () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
                test("4 fields: (number, T) → true",  () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("4 fields: (number) → true",     () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("4 fields: () → true",           () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("4 fields: (number, T) → false", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("4 fields: (number) → false",    () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("4 fields: () → false",          () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)
        },)

        describe("drop", () => {
            describe("empty", () => {
                test("NaN", () => expect(new instance(EMPTY,).drop(NaN,),)      .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-∞",  () => expect(new instance(EMPTY,).drop(-Infinity,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-2",  () => expect(new instance(EMPTY,).drop(-2,),)       .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-1",  () => expect(new instance(EMPTY,).drop(-1,),)       .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('0',   () => expect(new instance(EMPTY,).drop(0,),)        .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(EMPTY,).drop(1,),)        .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(new instance(EMPTY,).drop(Infinity,),) .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("1 field", () => {
                test("NaN", () => expect(() => new instance(A,).drop(NaN,),)                .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(      new instance(A,).drop(-Infinity,).toArray(),).toStrictEqual(A,),)
                test("-3",  () => expect(      new instance(A,).drop(-3,).toArray(),)       .toStrictEqual(A,),)
                test("-2",  () => expect(      new instance(A,).drop(-2,).toArray(),)       .toStrictEqual(A,),)
                test("-1",  () => expect(      new instance(A,).drop(-1,).toArray(),)       .toStrictEqual(A,),)
                test('0',   () => expect(      new instance(A,).drop(0,).toArray(),)        .toStrictEqual(A,),)
                test('1',   () => expect(      new instance(A,).drop(1,),)                  .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('2',   () => expect(      new instance(A,).drop(2,),)                  .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(      new instance(A,).drop(Infinity,),)           .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("2 fields", () => {
                test("NaN", () => expect(() => new instance(AB,).drop(NaN,),)                .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(      new instance(AB,).drop(-Infinity,).toArray(),).toStrictEqual(AB,),)
                test("-4",  () => expect(      new instance(AB,).drop(-4,).toArray(),)       .toStrictEqual(AB,),)
                test("-3",  () => expect(      new instance(AB,).drop(-3,).toArray(),)       .toStrictEqual(AB,),)
                test("-2",  () => expect(      new instance(AB,).drop(-2,).toArray(),)       .toStrictEqual(AB,),)
                test("-1",  () => expect(      new instance(AB,).drop(-1,).toArray(),)       .toStrictEqual(B,),)
                test('0',   () => expect(      new instance(AB,).drop(0,).toArray(),)        .toStrictEqual(AB,),)
                test('1',   () => expect(      new instance(AB,).drop(1,).toArray(),)        .toStrictEqual(B,),)
                test('2',   () => expect(      new instance(AB,).drop(2,),)                  .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('3',   () => expect(      new instance(AB,).drop(3,),)                  .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(      new instance(AB,).drop(Infinity,),)           .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("4 fields", () => {
                test("NaN", () => expect(() => new instance(ABCD,).drop(NaN,),)                .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(      new instance(ABCD,).drop(-Infinity,).toArray(),).toStrictEqual(ABCD,),)
                test("-6",  () => expect(      new instance(ABCD,).drop(-6,).toArray(),)       .toStrictEqual(ABCD,),)
                test("-5",  () => expect(      new instance(ABCD,).drop(-5,).toArray(),)       .toStrictEqual(ABCD,),)
                test("-4",  () => expect(      new instance(ABCD,).drop(-4,).toArray(),)       .toStrictEqual(ABCD,),)
                test("-3",  () => expect(      new instance(ABCD,).drop(-3,).toArray(),)       .toStrictEqual(BCD,),)
                test("-2",  () => expect(      new instance(ABCD,).drop(-2,).toArray(),)       .toStrictEqual(CD,),)
                test("-1",  () => expect(      new instance(ABCD,).drop(-1,).toArray(),)       .toStrictEqual(D,),)
                test('0',   () => expect(      new instance(ABCD,).drop(0,).toArray(),)        .toStrictEqual(ABCD,),)
                test('1',   () => expect(      new instance(ABCD,).drop(1,).toArray(),)        .toStrictEqual(BCD,),)
                test('2',   () => expect(      new instance(ABCD,).drop(2,).toArray(),)        .toStrictEqual(CD,),)
                test('3',   () => expect(      new instance(ABCD,).drop(3,).toArray(),)        .toStrictEqual(D,),)
                test('4',   () => expect(      new instance(ABCD,).drop(4,),)                  .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('5',   () => expect(      new instance(ABCD,).drop(5,),)                  .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(      new instance(ABCD,).drop(Infinity,),)           .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
        },)
        describe("dropWhile", () => {
            describe("empty", () => {
                test("(T, number) → boolean", () => expect(new instance(EMPTY,).dropWhile(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("(T) → boolean",         () => expect(new instance(EMPTY,).dropWhile(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("() → boolean",          () => expect(new instance(EMPTY,).dropWhile(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                test("1 field: (T, number) → true",   () => expect(new instance(A,)   .dropWhile(callbackAsTrue2,),)           .toBeEmpty(),)
                test("1 field: (T) → true",           () => expect(new instance(A,)   .dropWhile(callbackAsTrue1,),)           .toBeEmpty(),)
                test("1 field: () → true",            () => expect(new instance(A,)   .dropWhile(callbackAsTrue0,),)           .toBeEmpty(),)
                test("1 field: (T, number) → false",  () => expect(new instance(A,)   .dropWhile(callbackAsFalse2,).toArray(),).toStrictEqual(A,),)
                test("1 field: (T) → false",          () => expect(new instance(A,)   .dropWhile(callbackAsFalse1,).toArray(),).toStrictEqual(A,),)
                test("1 field: () → false",           () => expect(new instance(A,)   .dropWhile(callbackAsFalse0,).toArray(),).toStrictEqual(A,),)
                test("2 fields: (T, number) → true",  () => expect(new instance(AB,)  .dropWhile(callbackAsTrue2,),)           .toBeEmpty(),)
                test("2 fields: (T) → true",          () => expect(new instance(AB,)  .dropWhile(callbackAsTrue1,),)           .toBeEmpty(),)
                test("2 fields: () → true",           () => expect(new instance(AB,)  .dropWhile(callbackAsTrue0,),)           .toBeEmpty(),)
                test("2 fields: (T, number) → false", () => expect(new instance(AB,)  .dropWhile(callbackAsFalse2,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: (T) → false",         () => expect(new instance(AB,)  .dropWhile(callbackAsFalse1,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: () → false",          () => expect(new instance(AB,)  .dropWhile(callbackAsFalse0,).toArray(),).toStrictEqual(AB,),)
                test("4 fields: (T, number) → true",  () => expect(new instance(ABCD,).dropWhile(callbackAsTrue2,),)           .toBeEmpty(),)
                test("4 fields: (T) → true",          () => expect(new instance(ABCD,).dropWhile(callbackAsTrue1,),)           .toBeEmpty(),)
                test("4 fields: () → true",           () => expect(new instance(ABCD,).dropWhile(callbackAsTrue0,),)           .toBeEmpty(),)
                test("4 fields: (T, number) → false", () => expect(new instance(ABCD,).dropWhile(callbackAsFalse2,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: (T) → false",         () => expect(new instance(ABCD,).dropWhile(callbackAsFalse1,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: () → false",          () => expect(new instance(ABCD,).dropWhile(callbackAsFalse0,).toArray(),).toStrictEqual(ABCD,),)
            },)
            describe("1 field", () => {
                test("under a", () => expect(new instance(A,).dropWhile(callbackIsUnderA,).toArray(),)   .toStrictEqual(A,),)
                test("under e", () => expect(new instance(A,).dropWhile(callbackIsUnderE,),)             .toBeEmpty(),)
                test("under 0", () => expect(new instance(A,).dropWhile(callbackIsUnder0Alt,).toArray(),).toStrictEqual(A,),)
                test("under 4", () => expect(new instance(A,).dropWhile(callbackIsUnder4Alt,),)          .toBeEmpty(),)
            },)
            describe("2 fields", () => {
                test("under a", () => expect(new instance(AB,).dropWhile(callbackIsUnderA,).toArray(),)   .toStrictEqual(AB,),)
                test("under b", () => expect(new instance(AB,).dropWhile(callbackIsUnderB,).toArray(),)   .toStrictEqual(B,),)
                test("under e", () => expect(new instance(AB,).dropWhile(callbackIsUnderE,),)             .toBeEmpty(),)
                test("under 0", () => expect(new instance(AB,).dropWhile(callbackIsUnder0Alt,).toArray(),).toStrictEqual(AB,),)
                test("under 1", () => expect(new instance(AB,).dropWhile(callbackIsUnder1Alt,).toArray(),).toStrictEqual(B,),)
                test("under 4", () => expect(new instance(AB,).dropWhile(callbackIsUnder4Alt,),)          .toBeEmpty(),)
            },)
            describe("4 fields", () => {
                test("under a", () => expect(new instance(ABCD,).dropWhile(callbackIsUnderA,).toArray(),)   .toStrictEqual(ABCD,),)
                test("under b", () => expect(new instance(ABCD,).dropWhile(callbackIsUnderB,).toArray(),)   .toStrictEqual(BCD,),)
                test("under c", () => expect(new instance(ABCD,).dropWhile(callbackIsUnderC,).toArray(),)   .toStrictEqual(CD,),)
                test("under d", () => expect(new instance(ABCD,).dropWhile(callbackIsUnderD,).toArray(),)   .toStrictEqual(D,),)
                test("under e", () => expect(new instance(ABCD,).dropWhile(callbackIsUnderE,),)             .toBeEmpty(),)
                test("under 0", () => expect(new instance(ABCD,).dropWhile(callbackIsUnder0Alt,).toArray(),).toStrictEqual(ABCD,),)
                test("under 1", () => expect(new instance(ABCD,).dropWhile(callbackIsUnder1Alt,).toArray(),).toStrictEqual(BCD,),)
                test("under 2", () => expect(new instance(ABCD,).dropWhile(callbackIsUnder2Alt,).toArray(),).toStrictEqual(CD,),)
                test("under 3", () => expect(new instance(ABCD,).dropWhile(callbackIsUnder3Alt,).toArray(),).toStrictEqual(D,),)
                test("under 4", () => expect(new instance(ABCD,).dropWhile(callbackIsUnder4Alt,),)          .toBeEmpty(),)
            },)
        },)
        describe("dropWhileIndexed", () => {
            describe("empty", () => {
                test("(number, T) → boolean", () => expect(new instance(EMPTY,).dropWhileIndexed(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("(number) → boolean",    () => expect(new instance(EMPTY,).dropWhileIndexed(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("() → boolean",          () => expect(new instance(EMPTY,).dropWhileIndexed(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                test("1 field: (number, T) → true",   () => expect(new instance(A,)   .dropWhileIndexed(callbackAsTrue2,),)           .toBeEmpty(),)
                test("1 field: (number) → true",      () => expect(new instance(A,)   .dropWhileIndexed(callbackAsTrue1,),)           .toBeEmpty(),)
                test("1 field: () → true",            () => expect(new instance(A,)   .dropWhileIndexed(callbackAsTrue0,),)           .toBeEmpty(),)
                test("1 field: (number, T) → false",  () => expect(new instance(A,)   .dropWhileIndexed(callbackAsFalse2,).toArray(),).toStrictEqual(A,),)
                test("1 field: (number) → false",     () => expect(new instance(A,)   .dropWhileIndexed(callbackAsFalse1,).toArray(),).toStrictEqual(A,),)
                test("1 field: () → false",           () => expect(new instance(A,)   .dropWhileIndexed(callbackAsFalse0,).toArray(),).toStrictEqual(A,),)
                test("2 fields: (number, T) → true",  () => expect(new instance(AB,)  .dropWhileIndexed(callbackAsTrue2,),)           .toBeEmpty(),)
                test("2 fields: (number) → true",     () => expect(new instance(AB,)  .dropWhileIndexed(callbackAsTrue1,),)           .toBeEmpty(),)
                test("2 fields: () → true",           () => expect(new instance(AB,)  .dropWhileIndexed(callbackAsTrue0,),)           .toBeEmpty(),)
                test("2 fields: (number, T) → false", () => expect(new instance(AB,)  .dropWhileIndexed(callbackAsFalse2,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: (number) → false",    () => expect(new instance(AB,)  .dropWhileIndexed(callbackAsFalse1,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: () → false",          () => expect(new instance(AB,)  .dropWhileIndexed(callbackAsFalse0,).toArray(),).toStrictEqual(AB,),)
                test("4 fields: (number, T) → true",  () => expect(new instance(ABCD,).dropWhileIndexed(callbackAsTrue2,),)           .toBeEmpty(),)
                test("4 fields: (number) → true",     () => expect(new instance(ABCD,).dropWhileIndexed(callbackAsTrue1,),)           .toBeEmpty(),)
                test("4 fields: () → true",           () => expect(new instance(ABCD,).dropWhileIndexed(callbackAsTrue0,),)           .toBeEmpty(),)
                test("4 fields: (number, T) → false", () => expect(new instance(ABCD,).dropWhileIndexed(callbackAsFalse2,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: (number) → false",    () => expect(new instance(ABCD,).dropWhileIndexed(callbackAsFalse1,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: () → false",          () => expect(new instance(ABCD,).dropWhileIndexed(callbackAsFalse0,).toArray(),).toStrictEqual(ABCD,),)
            },)
            describe("1 field", () => {
                test("under a", () => expect(new instance(A,).dropWhileIndexed(callbackIsUnderAAlt,).toArray(),).toStrictEqual(A,),)
                test("under e", () => expect(new instance(A,).dropWhileIndexed(callbackIsUnderEAlt,),)          .toBeEmpty(),)
                test("under 0", () => expect(new instance(A,).dropWhileIndexed(callbackIsUnder0,).toArray(),)   .toStrictEqual(A,),)
                test("under 4", () => expect(new instance(A,).dropWhileIndexed(callbackIsUnder4,),)             .toBeEmpty(),)
            },)
            describe("2 fields", () => {
                test("under a", () => expect(new instance(AB,).dropWhileIndexed(callbackIsUnderAAlt,).toArray(),).toStrictEqual(AB,),)
                test("under b", () => expect(new instance(AB,).dropWhileIndexed(callbackIsUnderBAlt,).toArray(),).toStrictEqual(B,),)
                test("under e", () => expect(new instance(AB,).dropWhileIndexed(callbackIsUnderEAlt,),)          .toBeEmpty(),)
                test("under 0", () => expect(new instance(AB,).dropWhileIndexed(callbackIsUnder0,).toArray(),)   .toStrictEqual(AB,),)
                test("under 1", () => expect(new instance(AB,).dropWhileIndexed(callbackIsUnder1,).toArray(),)   .toStrictEqual(B,),)
                test("under 4", () => expect(new instance(AB,).dropWhileIndexed(callbackIsUnder4,),)             .toBeEmpty(),)
            },)
            describe("4 fields", () => {
                test("under a", () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnderAAlt,).toArray(),).toStrictEqual(ABCD,),)
                test("under b", () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnderBAlt,).toArray(),).toStrictEqual(BCD,),)
                test("under c", () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnderCAlt,).toArray(),).toStrictEqual(CD,),)
                test("under d", () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnderDAlt,).toArray(),).toStrictEqual(D,),)
                test("under e", () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnderEAlt,),)          .toBeEmpty(),)
                test("under 0", () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnder0,).toArray(),)   .toStrictEqual(ABCD,),)
                test("under 1", () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnder1,).toArray(),)   .toStrictEqual(BCD,),)
                test("under 2", () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnder2,).toArray(),)   .toStrictEqual(CD,),)
                test("under 3", () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnder3,).toArray(),)   .toStrictEqual(D,),)
                test("under 4", () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnder4,),)             .toBeEmpty(),)
            },)
        },)

        describe("dropLast", () => {
            describe("empty", () => {
                test("NaN", () => expect(new instance(EMPTY,).dropLast(NaN,),)      .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-∞",  () => expect(new instance(EMPTY,).dropLast(-Infinity,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-2",  () => expect(new instance(EMPTY,).dropLast(-2,),)       .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-1",  () => expect(new instance(EMPTY,).dropLast(-1,),)       .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('0',   () => expect(new instance(EMPTY,).dropLast(0,),)        .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(EMPTY,).dropLast(1,),)        .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(new instance(EMPTY,).dropLast(Infinity,),) .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("1 field", () => {
                test("NaN", () => expect(() => new instance(A,).dropLast(NaN,),)                .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(      new instance(A,).dropLast(-Infinity,).toArray(),).toStrictEqual(A,),)
                test("-3",  () => expect(      new instance(A,).dropLast(-3,).toArray(),)       .toStrictEqual(A,),)
                test("-2",  () => expect(      new instance(A,).dropLast(-2,).toArray(),)       .toStrictEqual(A,),)
                test("-1",  () => expect(      new instance(A,).dropLast(-1,).toArray(),)       .toStrictEqual(A,),)
                test('0',   () => expect(      new instance(A,).dropLast(0,).toArray(),)        .toStrictEqual(A,),)
                test('1',   () => expect(      new instance(A,).dropLast(1,),)                  .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('2',   () => expect(      new instance(A,).dropLast(2,),)                  .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(      new instance(A,).dropLast(Infinity,),)           .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("2 fields", () => {
                test("NaN", () => expect(() => new instance(AB,).dropLast(NaN,),)                .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(      new instance(AB,).dropLast(-Infinity,).toArray(),).toStrictEqual(AB,),)
                test("-4",  () => expect(      new instance(AB,).dropLast(-4,).toArray(),)       .toStrictEqual(AB,),)
                test("-3",  () => expect(      new instance(AB,).dropLast(-3,).toArray(),)       .toStrictEqual(AB,),)
                test("-2",  () => expect(      new instance(AB,).dropLast(-2,).toArray(),)       .toStrictEqual(AB,),)
                test("-1",  () => expect(      new instance(AB,).dropLast(-1,).toArray(),)       .toStrictEqual(A,),)
                test('0',   () => expect(      new instance(AB,).dropLast(0,).toArray(),)        .toStrictEqual(AB,),)
                test('1',   () => expect(      new instance(AB,).dropLast(1,).toArray(),)        .toStrictEqual(A,),)
                test('2',   () => expect(      new instance(AB,).dropLast(2,),)                  .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('3',   () => expect(      new instance(AB,).dropLast(3,),)                  .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(      new instance(AB,).dropLast(Infinity,),)           .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("4 fields", () => {
                test("NaN", () => expect(() => new instance(ABCD,).dropLast(NaN,),)                .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(      new instance(ABCD,).dropLast(-Infinity,).toArray(),).toStrictEqual(ABCD,),)
                test("-6",  () => expect(      new instance(ABCD,).dropLast(-6,).toArray(),)       .toStrictEqual(ABCD,),)
                test("-5",  () => expect(      new instance(ABCD,).dropLast(-5,).toArray(),)       .toStrictEqual(ABCD,),)
                test("-4",  () => expect(      new instance(ABCD,).dropLast(-4,).toArray(),)       .toStrictEqual(ABCD,),)
                test("-3",  () => expect(      new instance(ABCD,).dropLast(-3,).toArray(),)       .toStrictEqual(ABC,),)
                test("-2",  () => expect(      new instance(ABCD,).dropLast(-2,).toArray(),)       .toStrictEqual(AB,),)
                test("-1",  () => expect(      new instance(ABCD,).dropLast(-1,).toArray(),)       .toStrictEqual(A,),)
                test('0',   () => expect(      new instance(ABCD,).dropLast(0,).toArray(),)        .toStrictEqual(ABCD,),)
                test('1',   () => expect(      new instance(ABCD,).dropLast(1,).toArray(),)        .toStrictEqual(ABC,),)
                test('2',   () => expect(      new instance(ABCD,).dropLast(2,).toArray(),)        .toStrictEqual(AB,),)
                test('3',   () => expect(      new instance(ABCD,).dropLast(3,).toArray(),)        .toStrictEqual(A,),)
                test('4',   () => expect(      new instance(ABCD,).dropLast(4,),)                  .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('5',   () => expect(      new instance(ABCD,).dropLast(5,),)                  .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(      new instance(ABCD,).dropLast(Infinity,),)           .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
        },)
        describe("dropLastWhile", () => {
            describe("empty", () => {
                test("(T, number) → boolean", () => expect(new instance(EMPTY,).dropLastWhile(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("(T) → boolean",         () => expect(new instance(EMPTY,).dropLastWhile(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("() → boolean",          () => expect(new instance(EMPTY,).dropLastWhile(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                test("1 field: (T, number) → true",   () => expect(new instance(A,)   .dropLastWhile(callbackAsTrue2,),)           .toBeEmpty(),)
                test("1 field: (T) → true",           () => expect(new instance(A,)   .dropLastWhile(callbackAsTrue1,),)           .toBeEmpty(),)
                test("1 field: () → true",            () => expect(new instance(A,)   .dropLastWhile(callbackAsTrue0,),)           .toBeEmpty(),)
                test("1 field: (T, number) → false",  () => expect(new instance(A,)   .dropLastWhile(callbackAsFalse2,).toArray(),).toStrictEqual(A,),)
                test("1 field: (T) → false",          () => expect(new instance(A,)   .dropLastWhile(callbackAsFalse1,).toArray(),).toStrictEqual(A,),)
                test("1 field: () → false",           () => expect(new instance(A,)   .dropLastWhile(callbackAsFalse0,).toArray(),).toStrictEqual(A,),)
                test("2 fields: (T, number) → true",  () => expect(new instance(AB,)  .dropLastWhile(callbackAsTrue2,),)           .toBeEmpty(),)
                test("2 fields: (T) → true",          () => expect(new instance(AB,)  .dropLastWhile(callbackAsTrue1,),)           .toBeEmpty(),)
                test("2 fields: () → true",           () => expect(new instance(AB,)  .dropLastWhile(callbackAsTrue0,),)           .toBeEmpty(),)
                test("2 fields: (T, number) → false", () => expect(new instance(AB,)  .dropLastWhile(callbackAsFalse2,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: (T) → false",         () => expect(new instance(AB,)  .dropLastWhile(callbackAsFalse1,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: () → false",          () => expect(new instance(AB,)  .dropLastWhile(callbackAsFalse0,).toArray(),).toStrictEqual(AB,),)
                test("4 fields: (T, number) → true",  () => expect(new instance(ABCD,).dropLastWhile(callbackAsTrue2,),)           .toBeEmpty(),)
                test("4 fields: (T) → true",          () => expect(new instance(ABCD,).dropLastWhile(callbackAsTrue1,),)           .toBeEmpty(),)
                test("4 fields: () → true",           () => expect(new instance(ABCD,).dropLastWhile(callbackAsTrue0,),)           .toBeEmpty(),)
                test("4 fields: (T, number) → false", () => expect(new instance(ABCD,).dropLastWhile(callbackAsFalse2,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: (T) → false",         () => expect(new instance(ABCD,).dropLastWhile(callbackAsFalse1,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: () → false",          () => expect(new instance(ABCD,).dropLastWhile(callbackAsFalse0,).toArray(),).toStrictEqual(ABCD,),)
            },)
            describe("1 field", () => {
                test("over a", () => expect(new instance(A,).dropLastWhile(callbackIsOverA,).toArray(),)   .toStrictEqual(A,),)
                test("over e", () => expect(new instance(A,).dropLastWhile(callbackIsOverE,).toArray(),)   .toStrictEqual(A,),)
                test("over 0", () => expect(new instance(A,).dropLastWhile(callbackIsOver0Alt,).toArray(),).toStrictEqual(A,),)
                test("over 4", () => expect(new instance(A,).dropLastWhile(callbackIsOver4Alt,).toArray(),).toStrictEqual(A,),)
            },)
            describe("2 fields", () => {
                test("over a", () => expect(new instance(AB,).dropLastWhile(callbackIsOverA,).toArray(),)   .toStrictEqual(A,),)
                test("over b", () => expect(new instance(AB,).dropLastWhile(callbackIsOverB,).toArray(),)   .toStrictEqual(AB,),)
                test("over e", () => expect(new instance(AB,).dropLastWhile(callbackIsOverE,).toArray(),)   .toStrictEqual(AB,),)
                test("over 0", () => expect(new instance(AB,).dropLastWhile(callbackIsOver0Alt,).toArray(),).toStrictEqual(A,),)
                test("over 1", () => expect(new instance(AB,).dropLastWhile(callbackIsOver1Alt,).toArray(),).toStrictEqual(AB,),)
                test("over 4", () => expect(new instance(AB,).dropLastWhile(callbackIsOver4Alt,).toArray(),).toStrictEqual(AB,),)
            },)
            describe("4 fields", () => {
                test("over a", () => expect(new instance(ABCD,).dropLastWhile(callbackIsOverA,).toArray(),)   .toStrictEqual(A,),)
                test("over b", () => expect(new instance(ABCD,).dropLastWhile(callbackIsOverB,).toArray(),)   .toStrictEqual(AB,),)
                test("over c", () => expect(new instance(ABCD,).dropLastWhile(callbackIsOverC,).toArray(),)   .toStrictEqual(ABC,),)
                test("over d", () => expect(new instance(ABCD,).dropLastWhile(callbackIsOverD,).toArray(),)   .toStrictEqual(ABCD,),)
                test("over e", () => expect(new instance(ABCD,).dropLastWhile(callbackIsOverE,).toArray(),)   .toStrictEqual(ABCD,),)
                test("over 0", () => expect(new instance(ABCD,).dropLastWhile(callbackIsOver0Alt,).toArray(),).toStrictEqual(A,),)
                test("over 1", () => expect(new instance(ABCD,).dropLastWhile(callbackIsOver1Alt,).toArray(),).toStrictEqual(AB,),)
                test("over 2", () => expect(new instance(ABCD,).dropLastWhile(callbackIsOver2Alt,).toArray(),).toStrictEqual(ABC,),)
                test("over 3", () => expect(new instance(ABCD,).dropLastWhile(callbackIsOver3Alt,).toArray(),).toStrictEqual(ABCD,),)
                test("over 4", () => expect(new instance(ABCD,).dropLastWhile(callbackIsOver4Alt,).toArray(),).toStrictEqual(ABCD,),)
            },)
        },)
        describe("dropLastWhileIndexed", () => {
            describe("empty", () => {
                test("(number, T) → boolean", () => expect(new instance(EMPTY,).dropLastWhileIndexed(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("(number) → boolean",    () => expect(new instance(EMPTY,).dropLastWhileIndexed(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("() → boolean",          () => expect(new instance(EMPTY,).dropLastWhileIndexed(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                test("1 field: (number, T) → true",   () => expect(new instance(A,)   .dropLastWhileIndexed(callbackAsTrue2,),)           .toBeEmpty(),)
                test("1 field: (number) → true",      () => expect(new instance(A,)   .dropLastWhileIndexed(callbackAsTrue1,),)           .toBeEmpty(),)
                test("1 field: () → true",            () => expect(new instance(A,)   .dropLastWhileIndexed(callbackAsTrue0,),)           .toBeEmpty(),)
                test("1 field: (number, T) → false",  () => expect(new instance(A,)   .dropLastWhileIndexed(callbackAsFalse2,).toArray(),).toStrictEqual(A,),)
                test("1 field: (number) → false",     () => expect(new instance(A,)   .dropLastWhileIndexed(callbackAsFalse1,).toArray(),).toStrictEqual(A,),)
                test("1 field: () → false",           () => expect(new instance(A,)   .dropLastWhileIndexed(callbackAsFalse0,).toArray(),).toStrictEqual(A,),)
                test("2 fields: (number, T) → true",  () => expect(new instance(AB,)  .dropLastWhileIndexed(callbackAsTrue2,),)           .toBeEmpty(),)
                test("2 fields: (number) → true",     () => expect(new instance(AB,)  .dropLastWhileIndexed(callbackAsTrue1,),)           .toBeEmpty(),)
                test("2 fields: () → true",           () => expect(new instance(AB,)  .dropLastWhileIndexed(callbackAsTrue0,),)           .toBeEmpty(),)
                test("2 fields: (number, T) → false", () => expect(new instance(AB,)  .dropLastWhileIndexed(callbackAsFalse2,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: (number) → false",    () => expect(new instance(AB,)  .dropLastWhileIndexed(callbackAsFalse1,).toArray(),).toStrictEqual(AB,),)
                test("2 fields: () → false",          () => expect(new instance(AB,)  .dropLastWhileIndexed(callbackAsFalse0,).toArray(),).toStrictEqual(AB,),)
                test("4 fields: (number, T) → true",  () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackAsTrue2,),)           .toBeEmpty(),)
                test("4 fields: (number) → true",     () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackAsTrue1,),)           .toBeEmpty(),)
                test("4 fields: () → true",           () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackAsTrue0,),)           .toBeEmpty(),)
                test("4 fields: (number, T) → false", () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackAsFalse2,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: (number) → false",    () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackAsFalse1,).toArray(),).toStrictEqual(ABCD,),)
                test("4 fields: () → false",          () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackAsFalse0,).toArray(),).toStrictEqual(ABCD,),)
            },)
            describe("1 field", () => {
                test("over a", () => expect(new instance(A,).dropLastWhileIndexed(callbackIsOverAAlt,).toArray(),).toStrictEqual(A,),)
                test("over e", () => expect(new instance(A,).dropLastWhileIndexed(callbackIsOverEAlt,).toArray(),).toStrictEqual(A,),)
                test("over 0", () => expect(new instance(A,).dropLastWhileIndexed(callbackIsOver0,).toArray(),)   .toStrictEqual(A,),)
                test("over 4", () => expect(new instance(A,).dropLastWhileIndexed(callbackIsOver4,).toArray(),)   .toStrictEqual(A,),)
            },)
            describe("2 fields", () => {
                test("over a", () => expect(new instance(AB,).dropLastWhileIndexed(callbackIsOverAAlt,).toArray(),).toStrictEqual(A,),)
                test("over b", () => expect(new instance(AB,).dropLastWhileIndexed(callbackIsOverBAlt,).toArray(),).toStrictEqual(AB,),)
                test("over e", () => expect(new instance(AB,).dropLastWhileIndexed(callbackIsOverEAlt,).toArray(),).toStrictEqual(AB,),)
                test("over 0", () => expect(new instance(AB,).dropLastWhileIndexed(callbackIsOver0,).toArray(),)   .toStrictEqual(A,),)
                test("over 1", () => expect(new instance(AB,).dropLastWhileIndexed(callbackIsOver1,).toArray(),)   .toStrictEqual(AB,),)
                test("over 4", () => expect(new instance(AB,).dropLastWhileIndexed(callbackIsOver4,).toArray(),)   .toStrictEqual(AB,),)
            },)
            describe("4 fields", () => {
                test("over a", () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOverAAlt,).toArray(),).toStrictEqual(A,),)
                test("over b", () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOverBAlt,).toArray(),).toStrictEqual(AB,),)
                test("over c", () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOverCAlt,).toArray(),).toStrictEqual(ABC,),)
                test("over d", () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOverDAlt,).toArray(),).toStrictEqual(ABCD,),)
                test("over e", () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOverEAlt,).toArray(),).toStrictEqual(ABCD,),)
                test("over 0", () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOver0,).toArray(),)   .toStrictEqual(A,),)
                test("over 1", () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOver1,).toArray(),)   .toStrictEqual(AB,),)
                test("over 2", () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOver2,).toArray(),)   .toStrictEqual(ABC,),)
                test("over 3", () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOver3,).toArray(),)   .toStrictEqual(ABCD,),)
                test("over 4", () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOver4,).toArray(),)   .toStrictEqual(ABCD,),)
            },)
        },)
    },)},)

},)
