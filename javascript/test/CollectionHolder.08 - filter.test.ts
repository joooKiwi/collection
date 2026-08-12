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

import {expectToBeInstance}                                                                                                                                                                                                  from "./expect/expectToBeInstance"
import {CollectionHolder_ByGenericCollection}                                                                                                                                                                                from "./instance/CollectionHolder_ByGenericCollection"
import {CollectionHolder_ByMinimalistCollection}                                                                                                                                                                             from "./instance/CollectionHolder_ByMinimalistCollection"
import {A, A_NULL_B, A_NULL_UNDEFINED_B, A_UNDEFINED_B, AB, AB_NULL, AB_UNDEFINED, ABC, ABCD, ABD, AC, ACD, B, BCD, BD, C, D, EMPTY, NULL_AB, UNDEFINED_AB}                                                                  from "./value/arrays"
import {callbackAsFalse0, callbackAsFalse1, callbackAsFalse2, callbackAsTrue0, callbackAsTrue1, callbackAsTrue2}                                                                                                             from "./value/callbacks (boolean)"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                                                                                                                   from "./value/callbacks (fail)"
import {callbackIs0, callbackIs0Alt, callbackIs1, callbackIs1Alt, callbackIs2, callbackIs2Alt, callbackIs3, callbackIs3Alt, callbackIs4, callbackIs4Alt, callbackIsEven, callbackIsEvenAlt, callbackIsOdd, callbackIsOddAlt} from "./value/callbacks (number)"
import {callbackIsA, callbackIsAAlt, callbackIsB, callbackIsBAlt, callbackIsC, callbackIsCAlt, callbackIsD, callbackIsDAlt, callbackIsE, callbackIsEAlt}                                                                     from "./value/callbacks (string)"
import {emptyCollectionHolder, every0Instances, every1Instances, every2Instances, everyExtensionMethodInstances, everyNInstances}                                                                                            from "./value/instances"

import {EmptyCollectionHolder} from "../src/EmptyCollectionHolder"

describe("CollectionHolderTest (filter)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("filter",           () => expect(instance.filter(),)          .toBe(instance,),)
        test("filterIndexed",    () => expect(instance.filterIndexed(),)   .toBe(instance,),)
        test("filterNot",        () => expect(instance.filterNot(),)       .toBe(instance,),)
        test("filterNotIndexed", () => expect(instance.filterNotIndexed(),).toBe(instance,),)
        test("filterNotNull",    () => expect(instance.filterNotNull(),)   .toBe(instance,),)
    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance,},},) => {
        describe("filter",           () => expect(instance.filter(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
        describe("filterIndexed",    () => expect(instance.filterIndexed(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
        describe("filterNot",        () => expect(instance.filterNot(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
        describe("filterNotIndexed", () => expect(instance.filterNotIndexed(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
        describe("filterNotNull",    () => expect(instance.filterNotNull(),).toBe(emptyCollectionHolder,),)
    },)},)

    describe("get() being called", () => {
        //README: The adaptor classes are ignored since they rely on the apdated class instead.
        //        The lazy classes are ignored since they use inner class(es) instead.
        //        The viewer instances are ignored since they rely on the viewed class instead.
        //        The instances of 1 or 2 are ignored since they use "get value1|2" instead of get()

        describe("empty ~ collection (by minimalist)", () => {
            describe("filter", () => {
                test("(T, number) → boolean", () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(T) → boolean",         () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)
            describe("filterIndexed", () => {
                test("(number, T) → boolean", () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(number) → boolean",    () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)

            describe("filterNot", () => {
                test("(T, number) → boolean", () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(T) → boolean",         () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)
            describe("filterNotIndexed", () => {
                test("(number, T) → boolean", () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(number) → boolean",    () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)

            test("filterNotNull", () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNotNull(),).amountOfCall,).toBe(0,),)
        },)
        describe("empty ~ collection (by normal)", () => {
            describe("filter", () => {
                test("(T, number) → boolean", () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(T) → boolean",         () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)
            describe("filterIndexed", () => {
                test("(number, T) → boolean", () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(number) → boolean",    () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)

            describe("filterNot", () => {
                test("(T, number) → boolean", () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(T) → boolean",         () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)
            describe("filterNotIndexed", () => {
                test("(number, T) → boolean", () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(number) → boolean",    () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)

            test("filterNotNull", () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNotNull(),).amountOfCall,).toBe(0,),)
        },)

        describe("1 field ~ collection (by minimalist)", () => {
            describe("filter", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue0,),) .amountOfCall,).toBe(1,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("filterIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(1,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)

            describe("filterNot", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            },)
            describe("filterNotIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            },)

            test("filterNotNull", () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNotNull(),).amountOfCall,).toBe(2,),)
        },)
        describe("1 field ~ collection (by normal)", () => {
            describe("filter", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue0,),) .amountOfCall,).toBe(1,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("filterIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(1,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)

            describe("filterNot", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            },)
            describe("filterNotIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            },)

            test("filterNotNull", () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.filterNotNull(),).amountOfCall,).toBe(1,),)
        },)

        describe("2 fields ~ collection (by minimalist)", () => {
            describe("filter", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("filterIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)

            describe("filterNot", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
            },)
            describe("filterNotIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
            },)

            test("filterNotNull", () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNotNull(),).amountOfCall,).toBe(4,),)
        },)
        describe("2 fields ~ collection (by normal)", () => {
            describe("filter", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("filterIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)

            describe("filterNot", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
            },)
            describe("filterNotIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
            },)

            test("filterNotNull", () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.filterNotNull(),).amountOfCall,).toBe(2,),)
        },)

        describe("N fields ~ collection (by minimalist)", () => {
            describe("filter", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue0,),) .amountOfCall,).toBe(4,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("filterIndexed", () => {
                test("(number, T) → true",       () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(number) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",                () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(4,),)
                test("(number, T) → false",      () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("(number) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",               () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)

            describe("filterNot", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)
            describe("filterNotIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)

            test("filterNotNull", () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotNull(),).amountOfCall,).toBe(8,),)
        },)
        describe("N fields ~ collection (by normal)", () => {
            describe("filter", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue0,),) .amountOfCall,).toBe(4,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("filterIndexed", () => {
                test("(number, T) → true",       () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(number) → true",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",                () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(4,),)
                test("(number, T) → false",      () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("(number) → false",         () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",               () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)

            describe("filterNot", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)
            describe("filterNotIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)

            test("filterNotNull", () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotNull(),).amountOfCall,).toBe(8,),)
        },)
    },)

    describe("filterNotNull ~ same instance validation", () => {
        //TODO: add Same instance validations for filterNotNull
    },)

    describe("instances", () => {
        describe("empty", () => {
        describe.each(every0Instances,)("%s", ({value: {newInstance,},},) => {

            describe("filter", () => {
                test("(T, number) → boolean", () => expect(newInstance().filter(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
                test("(T) → boolean",         () => expect(newInstance().filter(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
                test("() → boolean",          () => expect(newInstance().filter(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
            },)
            describe("filterIndexed", () => {
                test("(number, T) → boolean", () => expect(newInstance().filterIndexed(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
                test("(number) → boolean",    () => expect(newInstance().filterIndexed(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
                test("() → boolean",          () => expect(newInstance().filterIndexed(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
            },)

            describe("filterNot", () => {
                test("(T, number) → boolean", () => expect(newInstance().filterNot(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
                test("(T) → boolean",         () => expect(newInstance().filterNot(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
                test("() → boolean",          () => expect(newInstance().filterNot(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
            },)
            describe("filterNotIndexed", () => {
                test("(number, T) → boolean", () => expect(newInstance().filterNotIndexed(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
                test("(number) → boolean",    () => expect(newInstance().filterNotIndexed(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
                test("() → boolean",          () => expect(newInstance().filterNotIndexed(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
            },)

            describe("filterNotNull", () => expect(newInstance().filterNotNull(),).toBe(emptyCollectionHolder,),)

        },)},)
        describe("1 field", () => {
        describe.each(every1Instances,)("%s", ({value: {newInstance, isMinimalist,},},) => {

            describe("filter", () => {
                test("(T, number) → true",  () => expect(newInstance('a',).filter(callbackAsTrue2,).toArray(),)  .toStrictEqual(A,),)
                test("(T) → true",          () => expect(newInstance('a',).filter(callbackAsTrue1,).toArray(),)  .toStrictEqual(A,),)
                test("() → true",           () => expect(newInstance('a',).filter(callbackAsTrue0,).toArray(),)  .toStrictEqual(A,),)
                test("(T, number) → false", () => expect(newInstance('a',).filter(callbackAsFalse2,),)           .toBeEmpty(),)
                test("(T) → false",         () => expect(newInstance('a',).filter(callbackAsFalse1,),)           .toBeEmpty(),)
                test("() → false",          () => expect(newInstance('a',).filter(callbackAsFalse0,),)           .toBeEmpty(),)
                test('a',                   () => expect(newInstance('a',).filter(callbackIsA,).toArray(),)      .toStrictEqual(A,),)
                test('e',                   () => expect(newInstance('a',).filter(callbackIsE,),)                .toBeEmpty(),)
                test("even",                () => expect(newInstance('a',).filter(callbackIsEvenAlt,).toArray(),).toStrictEqual(A,),)
                test("odd",                 () => expect(newInstance('a',).filter(callbackIsOddAlt,),)           .toBeEmpty(),)
                test('0',                   () => expect(newInstance('a',).filter(callbackIs0Alt,).toArray(),)   .toStrictEqual(A,),)
                test('4',                   () => expect(newInstance('a',).filter(callbackIs4Alt,),)             .toBeEmpty(),)
            },)
            describe("filterIndexed", () => {
                test("(number, T) → true",  () => expect(newInstance('a',).filterIndexed(callbackAsTrue2,).toArray(),).toStrictEqual(A,),)
                test("(number) → true",     () => expect(newInstance('a',).filterIndexed(callbackAsTrue1,).toArray(),).toStrictEqual(A,),)
                test("() → true",           () => expect(newInstance('a',).filterIndexed(callbackAsTrue0,).toArray(),).toStrictEqual(A,),)
                test("(number, T) → false", () => expect(newInstance('a',).filterIndexed(callbackAsFalse2,),)         .toBeEmpty(),)
                test("(number) → false",    () => expect(newInstance('a',).filterIndexed(callbackAsFalse1,),)         .toBeEmpty(),)
                test("() → false",          () => expect(newInstance('a',).filterIndexed(callbackAsFalse0,),)         .toBeEmpty(),)
                test('a',                   () => expect(newInstance('a',).filterIndexed(callbackIsAAlt,).toArray(),) .toStrictEqual(A,),)
                test('e',                   () => expect(newInstance('a',).filterIndexed(callbackIsEAlt,),)           .toBeEmpty(),)
                test("even",                () => expect(newInstance('a',).filterIndexed(callbackIsEven,).toArray(),) .toStrictEqual(A,),)
                test("odd",                 () => expect(newInstance('a',).filterIndexed(callbackIsOdd,),)            .toBeEmpty(),)
                test('0',                   () => expect(newInstance('a',).filterIndexed(callbackIs0,).toArray(),)    .toStrictEqual(A,),)
                test('4',                   () => expect(newInstance('a',).filterIndexed(callbackIs4,),)              .toBeEmpty(),)
            },)

            describe("filterNot", () => {
                test("(T, number) → true",  () => expect(newInstance('a',).filterNot(callbackAsTrue2,),)           .toBeEmpty(),)
                test("(T) → true",          () => expect(newInstance('a',).filterNot(callbackAsTrue1,),)           .toBeEmpty(),)
                test("() → true",           () => expect(newInstance('a',).filterNot(callbackAsTrue0,),)           .toBeEmpty(),)
                test("(T, number) → false", () => expect(newInstance('a',).filterNot(callbackAsFalse2,).toArray(),).toStrictEqual(A,),)
                test("(T) → false",         () => expect(newInstance('a',).filterNot(callbackAsFalse1,).toArray(),).toStrictEqual(A,),)
                test("() → false",          () => expect(newInstance('a',).filterNot(callbackAsFalse0,).toArray(),).toStrictEqual(A,),)
                test('a',                   () => expect(newInstance('a',).filterNot(callbackIsA,),)               .toBeEmpty(),)
                test('e',                   () => expect(newInstance('a',).filterNot(callbackIsE,).toArray(),)     .toStrictEqual(A,),)
                test("even",                () => expect(newInstance('a',).filterNot(callbackIsEvenAlt,),)         .toBeEmpty(),)
                test("odd",                 () => expect(newInstance('a',).filterNot(callbackIsOddAlt,).toArray(),).toStrictEqual(A,),)
                test('0',                   () => expect(newInstance('a',).filterNot(callbackIs0Alt,),)            .toBeEmpty(),)
                test('4',                   () => expect(newInstance('a',).filterNot(callbackIs4Alt,).toArray(),)  .toStrictEqual(A,),)
            },)
            describe("filterNotIndexed", () => {
                test("(number, T) → true",  () => expect(newInstance('a',).filterNotIndexed(callbackAsTrue2,),)           .toBeEmpty(),)
                test("(number) → true",     () => expect(newInstance('a',).filterNotIndexed(callbackAsTrue1,),)           .toBeEmpty(),)
                test("() → true",           () => expect(newInstance('a',).filterNotIndexed(callbackAsTrue0,),)           .toBeEmpty(),)
                test("(number, T) → false", () => expect(newInstance('a',).filterNotIndexed(callbackAsFalse2,).toArray(),).toStrictEqual(A,),)
                test("(number) → false",    () => expect(newInstance('a',).filterNotIndexed(callbackAsFalse1,).toArray(),).toStrictEqual(A,),)
                test("() → false",          () => expect(newInstance('a',).filterNotIndexed(callbackAsFalse0,).toArray(),).toStrictEqual(A,),)
                test('a',                   () => expect(newInstance('a',).filterNotIndexed(callbackIsAAlt,),)            .toBeEmpty(),)
                test('e',                   () => expect(newInstance('a',).filterNotIndexed(callbackIsEAlt,).toArray(),)  .toStrictEqual(A,),)
                test("even",                () => expect(newInstance('a',).filterNotIndexed(callbackIsEven,),)            .toBeEmpty(),)
                test("odd",                 () => expect(newInstance('a',).filterNotIndexed(callbackIsOdd,).toArray(),)   .toStrictEqual(A,),)
                test('0',                   () => expect(newInstance('a',).filterNotIndexed(callbackIs0,),)               .toBeEmpty(),)
                test('4',                   () => expect(newInstance('a',).filterNotIndexed(callbackIs4,).toArray(),)     .toStrictEqual(A,),)
            },)

            describe("filterNotNull", () => {
                test("1 field (non-null)",  () => expect(newInstance('a',)      .filterNotNull().toArray(),).toStrictEqual(A,),)
                test("1 field (null)",      () => expect(newInstance(null,)     .filterNotNull(),)          .toBeEmpty(),)
                test("1 field (undefined)", () => expect(newInstance(undefined,).filterNotNull(),)          .toBeEmpty(),)

                if (isMinimalist)
                    return // We only do some test that require the CollectionHolder.hasNull method
                test.skip("Same instance", () => expectToBeInstance(newInstance('a',), it => it.filterNotNull(),),)
            },)

        },)},)
        describe("2 fields", () => {
        describe.each(every2Instances,)("%s", ({value: {newInstance, isMinimalist,},},) => {

            describe("filter", () => {
                test("(T, number) → true",  () => expect(newInstance('a', 'b',)  .filter(callbackAsTrue2,).toArray(),).toStrictEqual(AB,),)
                test("(T) → true",          () => expect(newInstance('a', 'b',)  .filter(callbackAsTrue1,).toArray(),).toStrictEqual(AB,),)
                test("() → true",           () => expect(newInstance('a', 'b',)  .filter(callbackAsTrue0,).toArray(),).toStrictEqual(AB,),)
                test("(T, number) → false", () => expect(newInstance('a', 'b',)  .filter(callbackAsFalse2,),)         .toBeEmpty(),)
                test("(T) → false",         () => expect(newInstance('a', 'b',)  .filter(callbackAsFalse1,),)         .toBeEmpty(),)
                test("() → false",          () => expect(newInstance('a', 'b',)  .filter(callbackAsFalse0,),)         .toBeEmpty(),)
                test('a',                   () => expect(newInstance('a', 'b',).filter(callbackIsA,).toArray(),)      .toStrictEqual(A,),)
                test('b',                   () => expect(newInstance('a', 'b',).filter(callbackIsB,).toArray(),)      .toStrictEqual(B,),)
                test('e',                   () => expect(newInstance('a', 'b',).filter(callbackIsE,),)                .toBeEmpty(),)
                test("even",                () => expect(newInstance('a', 'b',).filter(callbackIsEvenAlt,).toArray(),).toStrictEqual(A,),)
                test("odd",                 () => expect(newInstance('a', 'b',).filter(callbackIsOddAlt,).toArray(),) .toStrictEqual(B,),)
                test('0',                   () => expect(newInstance('a', 'b',).filter(callbackIs0Alt,).toArray(),)   .toStrictEqual(A,),)
                test('1',                   () => expect(newInstance('a', 'b',).filter(callbackIs1Alt,).toArray(),)   .toStrictEqual(B,),)
                test('4',                   () => expect(newInstance('a', 'b',).filter(callbackIs4Alt,),)             .toBeEmpty(),)
            },)
            describe("filterIndexed", () => {
                test("(number, T) → true",  () => expect(newInstance('a', 'b',).filterIndexed(callbackAsTrue2,).toArray(),).toStrictEqual(AB,),)
                test("(number) → true",     () => expect(newInstance('a', 'b',).filterIndexed(callbackAsTrue1,).toArray(),).toStrictEqual(AB,),)
                test("() → true",           () => expect(newInstance('a', 'b',).filterIndexed(callbackAsTrue0,).toArray(),).toStrictEqual(AB,),)
                test("(number, T) → false", () => expect(newInstance('a', 'b',).filterIndexed(callbackAsFalse2,),)         .toBeEmpty(),)
                test("(number) → false",    () => expect(newInstance('a', 'b',).filterIndexed(callbackAsFalse1,),)         .toBeEmpty(),)
                test("() → false",          () => expect(newInstance('a', 'b',).filterIndexed(callbackAsFalse0,),)         .toBeEmpty(),)
                test('a',                   () => expect(newInstance('a', 'b',).filterIndexed(callbackIsAAlt,).toArray(),) .toStrictEqual(A,),)
                test('b',                   () => expect(newInstance('a', 'b',).filterIndexed(callbackIsBAlt,).toArray(),) .toStrictEqual(B,),)
                test('e',                   () => expect(newInstance('a', 'b',).filterIndexed(callbackIsEAlt,),)           .toBeEmpty(),)
                test("even",                () => expect(newInstance('a', 'b',).filterIndexed(callbackIsEven,).toArray(),) .toStrictEqual(A,),)
                test("odd",                 () => expect(newInstance('a', 'b',).filterIndexed(callbackIsOdd,).toArray(),)  .toStrictEqual(B,),)
                test('0',                   () => expect(newInstance('a', 'b',).filterIndexed(callbackIs0,).toArray(),)    .toStrictEqual(A,),)
                test('1',                   () => expect(newInstance('a', 'b',).filterIndexed(callbackIs1,).toArray(),)    .toStrictEqual(B,),)
                test('4',                   () => expect(newInstance('a', 'b',).filterIndexed(callbackIs4,),)              .toBeEmpty(),)
            },)

            describe("filterNot", () => {
                test("(T, number) → true",  () => expect(newInstance('a', 'b',).filterNot(callbackAsTrue2,),)            .toBeEmpty(),)
                test("(T) → true",          () => expect(newInstance('a', 'b',).filterNot(callbackAsTrue1,),)            .toBeEmpty(),)
                test("() → true",           () => expect(newInstance('a', 'b',).filterNot(callbackAsTrue0,),)            .toBeEmpty(),)
                test("(T, number) → false", () => expect(newInstance('a', 'b',).filterNot(callbackAsFalse2,).toArray(),) .toStrictEqual(AB,),)
                test("(T) → false",         () => expect(newInstance('a', 'b',).filterNot(callbackAsFalse1,).toArray(),) .toStrictEqual(AB,),)
                test("() → false",          () => expect(newInstance('a', 'b',).filterNot(callbackAsFalse0,).toArray(),) .toStrictEqual(AB,),)
                test('a',                   () => expect(newInstance('a', 'b',).filterNot(callbackIsA,).toArray(),)      .toStrictEqual(B,),)
                test('b',                   () => expect(newInstance('a', 'b',).filterNot(callbackIsB,).toArray(),)      .toStrictEqual(A,),)
                test('e',                   () => expect(newInstance('a', 'b',).filterNot(callbackIsE,).toArray(),)      .toStrictEqual(AB,),)
                test("even",                () => expect(newInstance('a', 'b',).filterNot(callbackIsEvenAlt,).toArray(),).toStrictEqual(B,),)
                test("odd",                 () => expect(newInstance('a', 'b',).filterNot(callbackIsOddAlt,).toArray(),) .toStrictEqual(A,),)
                test('0',                   () => expect(newInstance('a', 'b',).filterNot(callbackIs0Alt,).toArray(),)   .toStrictEqual(B,),)
                test('1',                   () => expect(newInstance('a', 'b',).filterNot(callbackIs1Alt,).toArray(),)   .toStrictEqual(A,),)
                test('4',                   () => expect(newInstance('a', 'b',).filterNot(callbackIs4Alt,).toArray(),)   .toStrictEqual(AB,),)
            },)
            describe("filterNotIndexed", () => {
                test("(number, T) → true",  () => expect(newInstance('a', 'b',).filterNotIndexed(callbackAsTrue2,),)           .toBeEmpty(),)
                test("(number) → true",     () => expect(newInstance('a', 'b',).filterNotIndexed(callbackAsTrue1,),)           .toBeEmpty(),)
                test("() → true",           () => expect(newInstance('a', 'b',).filterNotIndexed(callbackAsTrue0,),)           .toBeEmpty(),)
                test("(number, T) → false", () => expect(newInstance('a', 'b',).filterNotIndexed(callbackAsFalse2,).toArray(),).toStrictEqual(AB,),)
                test("(number) → false",    () => expect(newInstance('a', 'b',).filterNotIndexed(callbackAsFalse1,).toArray(),).toStrictEqual(AB,),)
                test("() → false",          () => expect(newInstance('a', 'b',).filterNotIndexed(callbackAsFalse0,).toArray(),).toStrictEqual(AB,),)
                test('a',                   () => expect(newInstance('a', 'b',).filterNotIndexed(callbackIsAAlt,).toArray(),)  .toStrictEqual(B,),)
                test('b',                   () => expect(newInstance('a', 'b',).filterNotIndexed(callbackIsBAlt,).toArray(),)  .toStrictEqual(A,),)
                test('e',                   () => expect(newInstance('a', 'b',).filterNotIndexed(callbackIsEAlt,).toArray(),)  .toStrictEqual(AB,),)
                test("even",                () => expect(newInstance('a', 'b',).filterNotIndexed(callbackIsEven,).toArray(),)  .toStrictEqual(B,),)
                test("odd",                 () => expect(newInstance('a', 'b',).filterNotIndexed(callbackIsOdd,).toArray(),)   .toStrictEqual(A,),)
                test('0',                   () => expect(newInstance('a', 'b',).filterNotIndexed(callbackIs0,).toArray(),)     .toStrictEqual(B,),)
                test('1',                   () => expect(newInstance('a', 'b',).filterNotIndexed(callbackIs1,).toArray(),)     .toStrictEqual(A,),)
                test('4',                   () => expect(newInstance('a', 'b',).filterNotIndexed(callbackIs4,).toArray(),)     .toStrictEqual(AB,),)
            },)

            describe("filterNotNull", () => {
                test("non-null",           () => expect(newInstance('a', 'b',)       .filterNotNull().toArray(),).toStrictEqual(AB,),)
                test("null at start",      () => expect(newInstance(null, 'a',)      .filterNotNull().toArray(),).toStrictEqual(A,),)
                test("null at end",        () => expect(newInstance('a', null,)      .filterNotNull().toArray(),).toStrictEqual(A,),)
                test("undefined at start", () => expect(newInstance(undefined, 'a',) .filterNotNull().toArray(),).toStrictEqual(A,),)
                test("undefined at end",   () => expect(newInstance('a', undefined,) .filterNotNull().toArray(),).toStrictEqual(A,),)
                test("null + undefined",   () => expect(newInstance(null, undefined,).filterNotNull(),)          .toBeEmpty(),)

                if (isMinimalist)
                    return // We only do some test that require the CollectionHolder.hasNull method
                test.skip("Same instance", () => expectToBeInstance(newInstance('a', 'b',), it => it.filterNotNull(),),)
            },)

        },)},)
        describe("N fields", () => {
        describe.each(everyNInstances,)("%s", ({value: {instance, isMinimalist,},},) => {

            describe("filter", () => {
                test("(T, number) → true",  () => expect(new instance(ABCD,).filter(callbackAsTrue2,).toArray(),)  .toStrictEqual(ABCD,),)
                test("(T) → true",          () => expect(new instance(ABCD,).filter(callbackAsTrue1,).toArray(),)  .toStrictEqual(ABCD,),)
                test("() → true",           () => expect(new instance(ABCD,).filter(callbackAsTrue0,).toArray(),)  .toStrictEqual(ABCD,),)
                test("(T, number) → false", () => expect(new instance(ABCD,).filter(callbackAsFalse2,),)           .toBeEmpty(),)
                test("(T) → false",         () => expect(new instance(ABCD,).filter(callbackAsFalse1,),)           .toBeEmpty(),)
                test("() → false",          () => expect(new instance(ABCD,).filter(callbackAsFalse0,),)           .toBeEmpty(),)
                test('a',                   () => expect(new instance(ABCD,).filter(callbackIsA,).toArray(),)      .toStrictEqual(A,),)
                test('b',                   () => expect(new instance(ABCD,).filter(callbackIsB,).toArray(),)      .toStrictEqual(B,),)
                test('c',                   () => expect(new instance(ABCD,).filter(callbackIsC,).toArray(),)      .toStrictEqual(C,),)
                test('d',                   () => expect(new instance(ABCD,).filter(callbackIsD,).toArray(),)      .toStrictEqual(D,),)
                test('e',                   () => expect(new instance(ABCD,).filter(callbackIsE,),)                .toBeEmpty(),)
                test("even",                () => expect(new instance(ABCD,).filter(callbackIsEvenAlt,).toArray(),).toStrictEqual(AC,),)
                test("odd",                 () => expect(new instance(ABCD,).filter(callbackIsOddAlt,).toArray(),) .toStrictEqual(BD,),)
                test('0',                   () => expect(new instance(ABCD,).filter(callbackIs0Alt,).toArray(),)   .toStrictEqual(A,),)
                test('1',                   () => expect(new instance(ABCD,).filter(callbackIs1Alt,).toArray(),)   .toStrictEqual(B,),)
                test('2',                   () => expect(new instance(ABCD,).filter(callbackIs2Alt,).toArray(),)   .toStrictEqual(C,),)
                test('3',                   () => expect(new instance(ABCD,).filter(callbackIs3Alt,).toArray(),)   .toStrictEqual(D,),)
                test('4',                   () => expect(new instance(ABCD,).filter(callbackIs4Alt,),)             .toBeEmpty(),)
            },)
            describe("filterIndexed", () => {
                test("(number, T) → true",  () => expect(new instance(ABCD,).filterIndexed(callbackAsTrue2,).toArray(),).toStrictEqual(ABCD,),)
                test("(number) → true",     () => expect(new instance(ABCD,).filterIndexed(callbackAsTrue1,).toArray(),).toStrictEqual(ABCD,),)
                test("() → true",           () => expect(new instance(ABCD,).filterIndexed(callbackAsTrue0,).toArray(),).toStrictEqual(ABCD,),)
                test("(number, T) → false", () => expect(new instance(ABCD,).filterIndexed(callbackAsFalse2,),)         .toBeEmpty(),)
                test("(number) → false",    () => expect(new instance(ABCD,).filterIndexed(callbackAsFalse1,),)         .toBeEmpty(),)
                test("() → false",          () => expect(new instance(ABCD,).filterIndexed(callbackAsFalse0,),)         .toBeEmpty(),)
                test('a',                   () => expect(new instance(ABCD,).filterIndexed(callbackIsAAlt,).toArray(),) .toStrictEqual(A,),)
                test('b',                   () => expect(new instance(ABCD,).filterIndexed(callbackIsBAlt,).toArray(),) .toStrictEqual(B,),)
                test('c',                   () => expect(new instance(ABCD,).filterIndexed(callbackIsCAlt,).toArray(),) .toStrictEqual(C,),)
                test('d',                   () => expect(new instance(ABCD,).filterIndexed(callbackIsDAlt,).toArray(),) .toStrictEqual(D,),)
                test('e',                   () => expect(new instance(ABCD,).filterIndexed(callbackIsEAlt,),)           .toBeEmpty(),)
                test("even",                () => expect(new instance(ABCD,).filterIndexed(callbackIsEven,).toArray(),) .toStrictEqual(AC,),)
                test("odd",                 () => expect(new instance(ABCD,).filterIndexed(callbackIsOdd,).toArray(),)  .toStrictEqual(BD,),)
                test('0',                   () => expect(new instance(ABCD,).filterIndexed(callbackIs0,).toArray(),)    .toStrictEqual(A,),)
                test('1',                   () => expect(new instance(ABCD,).filterIndexed(callbackIs1,).toArray(),)    .toStrictEqual(B,),)
                test('2',                   () => expect(new instance(ABCD,).filterIndexed(callbackIs2,).toArray(),)    .toStrictEqual(C,),)
                test('3',                   () => expect(new instance(ABCD,).filterIndexed(callbackIs3,).toArray(),)    .toStrictEqual(D,),)
                test('4',                   () => expect(new instance(ABCD,).filterIndexed(callbackIs4,),)              .toBeEmpty(),)
            },)

            describe("filterNot", () => {
                test("(T, number) → true",  () => expect(new instance(ABCD,).filterNot(callbackAsTrue2,),)            .toBeEmpty(),)
                test("(T) → true",          () => expect(new instance(ABCD,).filterNot(callbackAsTrue1,),)            .toBeEmpty(),)
                test("() → true",           () => expect(new instance(ABCD,).filterNot(callbackAsTrue0,),)            .toBeEmpty(),)
                test("(T, number) → false", () => expect(new instance(ABCD,).filterNot(callbackAsFalse2,).toArray(),) .toStrictEqual(ABCD,),)
                test("(T) → false",         () => expect(new instance(ABCD,).filterNot(callbackAsFalse1,).toArray(),) .toStrictEqual(ABCD,),)
                test("() → false",          () => expect(new instance(ABCD,).filterNot(callbackAsFalse0,).toArray(),) .toStrictEqual(ABCD,),)
                test('a',                   () => expect(new instance(ABCD,).filterNot(callbackIsA,).toArray(),)      .toStrictEqual(BCD,),)
                test('b',                   () => expect(new instance(ABCD,).filterNot(callbackIsB,).toArray(),)      .toStrictEqual(ACD,),)
                test('c',                   () => expect(new instance(ABCD,).filterNot(callbackIsC,).toArray(),)      .toStrictEqual(ABD,),)
                test('d',                   () => expect(new instance(ABCD,).filterNot(callbackIsD,).toArray(),)      .toStrictEqual(ABC,),)
                test('e',                   () => expect(new instance(ABCD,).filterNot(callbackIsE,).toArray(),)      .toStrictEqual(ABCD),)
                test("even",                () => expect(new instance(ABCD,).filterNot(callbackIsEvenAlt,).toArray(),).toStrictEqual(BD,),)
                test("odd",                 () => expect(new instance(ABCD,).filterNot(callbackIsOddAlt,).toArray(),) .toStrictEqual(AC,),)
                test('0',                   () => expect(new instance(ABCD,).filterNot(callbackIs0Alt,).toArray(),)   .toStrictEqual(BCD,),)
                test('1',                   () => expect(new instance(ABCD,).filterNot(callbackIs1Alt,).toArray(),)   .toStrictEqual(ACD,),)
                test('2',                   () => expect(new instance(ABCD,).filterNot(callbackIs2Alt,).toArray(),)   .toStrictEqual(ABD,),)
                test('3',                   () => expect(new instance(ABCD,).filterNot(callbackIs3Alt,).toArray(),)   .toStrictEqual(ABC,),)
                test('4',                   () => expect(new instance(ABCD,).filterNot(callbackIs4Alt,).toArray(),)   .toStrictEqual(ABCD,),)
            },)
            describe("filterNotIndexed", () => {
                test("(number, T) → true",  () => expect(new instance(ABCD,).filterNotIndexed(callbackAsTrue2,),)           .toBeEmpty(),)
                test("(number) → true",     () => expect(new instance(ABCD,).filterNotIndexed(callbackAsTrue1,),)           .toBeEmpty(),)
                test("() → true",           () => expect(new instance(ABCD,).filterNotIndexed(callbackAsTrue0,),)           .toBeEmpty(),)
                test("(number, T) → false", () => expect(new instance(ABCD,).filterNotIndexed(callbackAsFalse2,).toArray(),).toStrictEqual(ABCD,),)
                test("(number) → false",    () => expect(new instance(ABCD,).filterNotIndexed(callbackAsFalse1,).toArray(),).toStrictEqual(ABCD,),)
                test("() → false",          () => expect(new instance(ABCD,).filterNotIndexed(callbackAsFalse0,).toArray(),).toStrictEqual(ABCD,),)
                test('a',                   () => expect(new instance(ABCD,).filterNotIndexed(callbackIsAAlt,).toArray(),)  .toStrictEqual(BCD,),)
                test('b',                   () => expect(new instance(ABCD,).filterNotIndexed(callbackIsBAlt,).toArray(),)  .toStrictEqual(ACD,),)
                test('c',                   () => expect(new instance(ABCD,).filterNotIndexed(callbackIsCAlt,).toArray(),)  .toStrictEqual(ABD,),)
                test('d',                   () => expect(new instance(ABCD,).filterNotIndexed(callbackIsDAlt,).toArray(),)  .toStrictEqual(ABC,),)
                test('e',                   () => expect(new instance(ABCD,).filterNotIndexed(callbackIsEAlt,).toArray(),)  .toStrictEqual(ABCD),)
                test("even",                () => expect(new instance(ABCD,).filterNotIndexed(callbackIsEven,).toArray(),)  .toStrictEqual(BD,),)
                test("odd",                 () => expect(new instance(ABCD,).filterNotIndexed(callbackIsOdd,).toArray(),)   .toStrictEqual(AC,),)
                test('0',                   () => expect(new instance(ABCD,).filterNotIndexed(callbackIs0,).toArray(),)     .toStrictEqual(BCD,),)
                test('1',                   () => expect(new instance(ABCD,).filterNotIndexed(callbackIs1,).toArray(),)     .toStrictEqual(ACD,),)
                test('2',                   () => expect(new instance(ABCD,).filterNotIndexed(callbackIs2,).toArray(),)     .toStrictEqual(ABD,),)
                test('3',                   () => expect(new instance(ABCD,).filterNotIndexed(callbackIs3,).toArray(),)     .toStrictEqual(ABC,),)
                test('4',                   () => expect(new instance(ABCD,).filterNotIndexed(callbackIs4,).toArray(),)     .toStrictEqual(ABCD,),)
            },)

            describe("filterNotNull", () => {
                test("non-null",            () => expect(new instance(ABCD,)              .filterNotNull().toArray(),).toStrictEqual(ABCD,),)
                test("null at start",       () => expect(new instance(NULL_AB,)           .filterNotNull().toArray(),).toStrictEqual(AB,),)
                test("null at center",      () => expect(new instance(A_NULL_B,)          .filterNotNull().toArray(),).toStrictEqual(AB,),)
                test("null at end",         () => expect(new instance(AB_NULL,)           .filterNotNull().toArray(),).toStrictEqual(AB,),)
                test("undefined at start",  () => expect(new instance(UNDEFINED_AB,)      .filterNotNull().toArray(),).toStrictEqual(AB,),)
                test("undefined at center", () => expect(new instance(A_UNDEFINED_B,)     .filterNotNull().toArray(),).toStrictEqual(AB,),)
                test("undefined at end",    () => expect(new instance(AB_UNDEFINED,)      .filterNotNull().toArray(),).toStrictEqual(AB,),)
                test("null + undefined",    () => expect(new instance(A_NULL_UNDEFINED_B,).filterNotNull().toArray(),).toStrictEqual(AB,),)

                if (isMinimalist)
                    return // We only do some test that require the CollectionHolder.hasNull method
                test.skip("Same instance", () => expectToBeInstance(new instance(ABCD,), it => it.filterNotNull(),),)
            },)

        },)},)
    },)

},)
