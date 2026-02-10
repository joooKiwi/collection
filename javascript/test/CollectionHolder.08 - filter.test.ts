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

import {expectToBeInstance}                                                                                                                                                                                                            from "./expect/expectToBeInstance"
import {A, A_NULL, A_NULL_B, A_NULL_UNDEFINED_B, A_UNDEFINED, A_UNDEFINED_B, AB, AB_NULL, AB_UNDEFINED, ABC, ABCD, ABD, AC, ACD, B, BCD, BD, C, D, EMPTY, NULL, NULL_A, NULL_AB, NULL_UNDEFINED, UNDEFINED, UNDEFINED_A, UNDEFINED_AB} from "./value/arrays"
import {callbackAsFalse0, callbackAsFalse1, callbackAsFalse2, callbackAsTrue0, callbackAsTrue1, callbackAsTrue2, falseCallbacks, trueCallbacks}                                                                                        from "./value/callbacks (boolean)"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                                                                                                                             from "./value/callbacks (fail)"
import {callbackIs0, callbackIs0Alt, callbackIs1, callbackIs1Alt, callbackIs2, callbackIs2Alt, callbackIs3, callbackIs3Alt, callbackIs4, callbackIs4Alt, callbackIsEven, callbackIsEvenAlt, callbackIsOdd, callbackIsOddAlt}           from "./value/callbacks (number)"
import {callbackIsA, callbackIsAAlt, callbackIsB, callbackIsBAlt, callbackIsC, callbackIsCAlt, callbackIsD, callbackIsDAlt, callbackIsE, callbackIsEAlt}                                                                               from "./value/callbacks (string)"
import {everyExtensionMethodInstances, everyInstances}                                                                                                                                                                                 from "./value/instances"

import {CollectionConstants}   from "../src/CollectionConstants"
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
        describe("filter",           () => expect(instance.filter(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        describe("filterIndexed",    () => expect(instance.filterIndexed(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        describe("filterNot",        () => expect(instance.filterNot(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        describe("filterNotIndexed", () => expect(instance.filterNotIndexed(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        describe("filterNotNull",    () => expect(instance.filterNotNull(),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
    },)},)

    describe("instances", () => {
    describe.each(everyInstances,)("%s", ({value: {instance, isMinimalist, type,},},) => {
        /** The instance is a {@link GenericCollectionHolder} */
        const isNormal = type === "normal"

        describe("get() being called", () => {
            describe("filter", () => {
                test("empty, (T, number) → boolean",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("empty, (T) → boolean",          () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("empty, () → boolean",           () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
                test("1 field, (T, number) → true",   () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("1 field, (T) → true",           () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("1 field, () → true",            () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue0,),) .amountOfCall,).toBe(1,),)
                test("1 field, (T, number) → false",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("1 field, (T) → false",          () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("1 field, () → false",           () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                test("2 fields, (T, number) → true",  () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("2 fields, (T) → true",          () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("2 fields, () → true",           () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("2 fields, (T, number) → false", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("2 fields, (T) → false",         () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("2 fields, () → false",          () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                test("4 fields, (T, number) → true",  () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("4 fields, (T) → true",          () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("4 fields, () → true",           () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue0,),) .amountOfCall,).toBe(4,),)
                test("4 fields, (T, number) → false", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("4 fields, (T) → false",         () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("4 fields, () → false",          () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("filterIndexed", () => {
                test("empty, (number, T) → boolean",       () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("empty, (number) → boolean",          () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("empty, () → boolean",                () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
                test("1 field, (number, T) → true",        () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("1 field, (number) → true",           () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("1 field, () → true",                 () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(1,),)
                test("1 field, (number, T) → false",       () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("1 field, (number) → false",          () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("1 field, () → false",                () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                test("2 fields, (number, T) → true",       () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("2 fields, (number) → true",          () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("2 fields, () → true",                () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("2 fields, (number, T) → false",      () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("2 fields, (number) → false",         () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("2 fields, () → false",               () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                test("4 fields, (number, T) → true",       () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("4 fields, (number) → true",          () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("4 fields, () → true",                () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(4,),)
                test("4 fields, (number, T) → false",      () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("4 fields, (number) → false",         () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("4 fields, () → false",               () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)

            describe("filterNot", () => {
                test("empty, (T, number) → boolean",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("empty, (T) → boolean",          () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("empty, () → boolean",           () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
                test("1 field, (T, number) → true",   () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("1 field, (T) → true",           () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("1 field, () → true",            () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("1 field, (T, number) → false",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("1 field, (T) → false",          () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("1 field, () → false",           () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
                test("2 fields, (T, number) → true",  () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("2 fields, (T) → true",          () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("2 fields, () → true",           () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("2 fields, (T, number) → false", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("2 fields, (T) → false",         () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("2 fields, () → false",          () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
                test("4 fields, (T, number) → true",  () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("4 fields, (T) → true",          () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("4 fields, () → true",           () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("4 fields, (T, number) → false", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("4 fields, (T) → false",         () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("4 fields, () → false",          () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)
            describe("filterNotIndexed", () => {
                test("empty, (number, T) → boolean",       () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("empty, (number) → boolean",          () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("empty, () → boolean",                () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
                test("1 field, (number, T) → true",        () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("1 field, (number) → true",           () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("1 field, () → true",                 () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("1 field, (number, T) → false",       () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("1 field, (number) → false",          () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("1 field, () → false",                () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
                test("2 fields, (number, T) → true",       () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("2 fields, (number) → true",          () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("2 fields, () → true",                () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("2 fields, (number, T) → false",      () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("2 fields, (number) → false",         () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("2 fields, () → false",               () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
                test("4 fields, (number, T) → true",       () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("4 fields, (number) → true",          () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("4 fields, () → true",                () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("4 fields, (number, T) → false",      () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("4 fields, (number) → false",         () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("4 fields, () → false",               () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)

            describe("filterNotNull", () => {
                test("empty",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNotNull(),).amountOfCall,).toBe(0,),)
                test("1 field",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.filterNotNull(),).amountOfCall,).toBe(isMinimalist ? 2 : 1,),)
                test("2 fields", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.filterNotNull(),).amountOfCall,).toBe(isMinimalist ? 4 : 2,),)
                test("4 fields", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.filterNotNull(),).amountOfCall,).toBe(isMinimalist || isNormal ? 8 : 4,),)//TODO remove the type == normal validation
            },)
        },)

        describe("filter", () => {
            describe("empty", () => {
                test("(T, number) → boolean", () => expect(new instance(EMPTY,).filter(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("(T) → boolean",         () => expect(new instance(EMPTY,).filter(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("() → boolean",          () => expect(new instance(EMPTY,).filter(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).filter(it,).toArray(),).toEqual(A,),)
                    test("2 fields", () => expect(new instance(AB,).filter(it,).toArray(),).toEqual(AB,),)
                    test("4 fields", () => expect(new instance(ABCD,).filter(it,).toArray(),).toEqual(ABCD,),)
                },)
                describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).filter(it,).toArray(),).toBeEmpty(),)
                    test("2 fields", () => expect(new instance(AB,).filter(it,).toArray(),).toBeEmpty(),)
                    test("4 fields", () => expect(new instance(ABCD,).filter(it,).toArray(),).toBeEmpty(),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).filter(callbackIsA,).toArray(),)      .toStrictEqual(A,),)
                test('e',    () => expect(new instance(A,).filter(callbackIsE,),)                .toBeEmpty(),)
                test("even", () => expect(new instance(A,).filter(callbackIsEvenAlt,).toArray(),).toStrictEqual(A,),)
                test("odd",  () => expect(new instance(A,).filter(callbackIsOddAlt,),)           .toBeEmpty(),)
                test('0',    () => expect(new instance(A,).filter(callbackIs0Alt,).toArray(),)   .toStrictEqual(A,),)
                test('4',    () => expect(new instance(A,).filter(callbackIs4Alt,),)             .toBeEmpty(),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).filter(callbackIsA,).toArray(),)      .toStrictEqual(A,),)
                test('b',    () => expect(new instance(AB,).filter(callbackIsB,).toArray(),)      .toStrictEqual(B,),)
                test('e',    () => expect(new instance(AB,).filter(callbackIsE,),)                .toBeEmpty(),)
                test("even", () => expect(new instance(AB,).filter(callbackIsEvenAlt,).toArray(),).toStrictEqual(A,),)
                test("odd",  () => expect(new instance(AB,).filter(callbackIsOddAlt,).toArray(),) .toStrictEqual(B,),)
                test('0',    () => expect(new instance(AB,).filter(callbackIs0Alt,).toArray(),)   .toStrictEqual(A,),)
                test('1',    () => expect(new instance(AB,).filter(callbackIs1Alt,).toArray(),)   .toStrictEqual(B,),)
                test('4',    () => expect(new instance(AB,).filter(callbackIs4Alt,),)             .toBeEmpty(),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).filter(callbackIsA,).toArray(),)      .toStrictEqual(A,),)
                test('b',    () => expect(new instance(ABCD,).filter(callbackIsB,).toArray(),)      .toStrictEqual(B,),)
                test('c',    () => expect(new instance(ABCD,).filter(callbackIsC,).toArray(),)      .toStrictEqual(C,),)
                test('d',    () => expect(new instance(ABCD,).filter(callbackIsD,).toArray(),)      .toStrictEqual(D,),)
                test('e',    () => expect(new instance(ABCD,).filter(callbackIsE,),)                .toBeEmpty(),)
                test("even", () => expect(new instance(ABCD,).filter(callbackIsEvenAlt,).toArray(),).toStrictEqual(AC,),)
                test("odd",  () => expect(new instance(ABCD,).filter(callbackIsOddAlt,).toArray(),) .toStrictEqual(BD,),)
                test('0',    () => expect(new instance(ABCD,).filter(callbackIs0Alt,).toArray(),)   .toStrictEqual(A,),)
                test('1',    () => expect(new instance(ABCD,).filter(callbackIs1Alt,).toArray(),)   .toStrictEqual(B,),)
                test('2',    () => expect(new instance(ABCD,).filter(callbackIs2Alt,).toArray(),)   .toStrictEqual(C,),)
                test('3',    () => expect(new instance(ABCD,).filter(callbackIs3Alt,).toArray(),)   .toStrictEqual(D,),)
                test('4',    () => expect(new instance(ABCD,).filter(callbackIs4Alt,),)             .toBeEmpty(),)
            },)
        },)
        describe("filterIndexed", () => {
            describe("empty", () => {
                test("(number, T) → boolean", () => expect(new instance(EMPTY,).filterIndexed(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("(number) → boolean",    () => expect(new instance(EMPTY,).filterIndexed(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("() → boolean",          () => expect(new instance(EMPTY,).filterIndexed(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).filterIndexed(it,).toArray(),).toEqual(A,),)
                    test("2 fields", () => expect(new instance(AB,).filterIndexed(it,).toArray(),).toEqual(AB,),)
                    test("4 fields", () => expect(new instance(ABCD,).filterIndexed(it,).toArray(),).toEqual(ABCD,),)
                },)
                describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).filterIndexed(it,).toArray(),).toBeEmpty(),)
                    test("2 fields", () => expect(new instance(AB,).filterIndexed(it,).toArray(),).toBeEmpty(),)
                    test("4 fields", () => expect(new instance(ABCD,).filterIndexed(it,).toArray(),).toBeEmpty(),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).filterIndexed(callbackIsAAlt,).toArray(),).toStrictEqual(A,),)
                test('e',    () => expect(new instance(A,).filterIndexed(callbackIsEAlt,),)          .toBeEmpty(),)
                test("even", () => expect(new instance(A,).filterIndexed(callbackIsEven,).toArray(),).toStrictEqual(A,),)
                test("odd",  () => expect(new instance(A,).filterIndexed(callbackIsOdd,),)           .toBeEmpty(),)
                test('0',    () => expect(new instance(A,).filterIndexed(callbackIs0,).toArray(),)   .toStrictEqual(A,),)
                test('4',    () => expect(new instance(A,).filterIndexed(callbackIs4,),)             .toBeEmpty(),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).filterIndexed(callbackIsAAlt,).toArray(),).toStrictEqual(A,),)
                test('b',    () => expect(new instance(AB,).filterIndexed(callbackIsBAlt,).toArray(),).toStrictEqual(B,),)
                test('e',    () => expect(new instance(AB,).filterIndexed(callbackIsEAlt,),)          .toBeEmpty(),)
                test("even", () => expect(new instance(AB,).filterIndexed(callbackIsEven,).toArray(),).toStrictEqual(A,),)
                test("odd",  () => expect(new instance(AB,).filterIndexed(callbackIsOdd,).toArray(),) .toStrictEqual(B,),)
                test('0',    () => expect(new instance(AB,).filterIndexed(callbackIs0,).toArray(),)   .toStrictEqual(A,),)
                test('1',    () => expect(new instance(AB,).filterIndexed(callbackIs1,).toArray(),)   .toStrictEqual(B,),)
                test('4',    () => expect(new instance(AB,).filterIndexed(callbackIs4,),)             .toBeEmpty(),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).filterIndexed(callbackIsAAlt,).toArray(),).toStrictEqual(A,),)
                test('b',    () => expect(new instance(ABCD,).filterIndexed(callbackIsBAlt,).toArray(),).toStrictEqual(B,),)
                test('c',    () => expect(new instance(ABCD,).filterIndexed(callbackIsCAlt,).toArray(),).toStrictEqual(C,),)
                test('d',    () => expect(new instance(ABCD,).filterIndexed(callbackIsDAlt,).toArray(),).toStrictEqual(D,),)
                test('e',    () => expect(new instance(ABCD,).filterIndexed(callbackIsEAlt,),)          .toBeEmpty(),)
                test("even", () => expect(new instance(ABCD,).filterIndexed(callbackIsEven,).toArray(),).toStrictEqual(AC,),)
                test("odd",  () => expect(new instance(ABCD,).filterIndexed(callbackIsOdd,).toArray(),) .toStrictEqual(BD,),)
                test('0',    () => expect(new instance(ABCD,).filterIndexed(callbackIs0,).toArray(),)   .toStrictEqual(A,),)
                test('1',    () => expect(new instance(ABCD,).filterIndexed(callbackIs1,).toArray(),)   .toStrictEqual(B,),)
                test('2',    () => expect(new instance(ABCD,).filterIndexed(callbackIs2,).toArray(),)   .toStrictEqual(C,),)
                test('3',    () => expect(new instance(ABCD,).filterIndexed(callbackIs3,).toArray(),)   .toStrictEqual(D,),)
                test('4',    () => expect(new instance(ABCD,).filterIndexed(callbackIs4,),)             .toBeEmpty(),)
            },)
        },)

        describe("filterNot", () => {
            describe("empty", () => {
                test("(T, number) → boolean", () => expect(new instance(EMPTY,).filterNot(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("(T) → boolean",         () => expect(new instance(EMPTY,).filterNot(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("() → boolean",          () => expect(new instance(EMPTY,).filterNot(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).filterNot(it,).toArray(),).toBeEmpty(),)
                    test("2 fields", () => expect(new instance(AB,).filterNot(it,).toArray(),).toBeEmpty(),)
                    test("4 fields", () => expect(new instance(ABCD,).filterNot(it,).toArray(),).toBeEmpty(),)
                },)
                describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).filterNot(it,).toArray(),).toEqual(A,),)
                    test("2 fields", () => expect(new instance(AB,).filterNot(it,).toArray(),).toEqual(AB,),)
                    test("4 fields", () => expect(new instance(ABCD,).filterNot(it,).toArray(),).toEqual(ABCD,),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).filterNot(callbackIsA,),)               .toBeEmpty(),)
                test('e',    () => expect(new instance(A,).filterNot(callbackIsE,).toArray(),)     .toStrictEqual(A,),)
                test("even", () => expect(new instance(A,).filterNot(callbackIsEvenAlt,),)         .toBeEmpty(),)
                test("odd",  () => expect(new instance(A,).filterNot(callbackIsOddAlt,).toArray(),).toStrictEqual(A,),)
                test('0',    () => expect(new instance(A,).filterNot(callbackIs0Alt,),)            .toBeEmpty(),)
                test('4',    () => expect(new instance(A,).filterNot(callbackIs4Alt,).toArray(),)  .toStrictEqual(A,),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).filterNot(callbackIsA,).toArray(),)      .toStrictEqual(B,),)
                test('b',    () => expect(new instance(AB,).filterNot(callbackIsB,).toArray(),)      .toStrictEqual(A,),)
                test('e',    () => expect(new instance(AB,).filterNot(callbackIsE,).toArray(),)      .toStrictEqual(AB,),)
                test("even", () => expect(new instance(AB,).filterNot(callbackIsEvenAlt,).toArray(),).toStrictEqual(B,),)
                test("odd",  () => expect(new instance(AB,).filterNot(callbackIsOddAlt,).toArray(),) .toStrictEqual(A,),)
                test('0',    () => expect(new instance(AB,).filterNot(callbackIs0Alt,).toArray(),)   .toStrictEqual(B,),)
                test('1',    () => expect(new instance(AB,).filterNot(callbackIs1Alt,).toArray(),)   .toStrictEqual(A,),)
                test('4',    () => expect(new instance(AB,).filterNot(callbackIs4Alt,).toArray(),)   .toStrictEqual(AB,),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).filterNot(callbackIsA,).toArray(),)      .toStrictEqual(BCD,),)
                test('b',    () => expect(new instance(ABCD,).filterNot(callbackIsB,).toArray(),)      .toStrictEqual(ACD,),)
                test('c',    () => expect(new instance(ABCD,).filterNot(callbackIsC,).toArray(),)      .toStrictEqual(ABD,),)
                test('d',    () => expect(new instance(ABCD,).filterNot(callbackIsD,).toArray(),)      .toStrictEqual(ABC,),)
                test('e',    () => expect(new instance(ABCD,).filterNot(callbackIsE,).toArray(),)      .toStrictEqual(ABCD),)
                test("even", () => expect(new instance(ABCD,).filterNot(callbackIsEvenAlt,).toArray(),).toStrictEqual(BD,),)
                test("odd",  () => expect(new instance(ABCD,).filterNot(callbackIsOddAlt,).toArray(),) .toStrictEqual(AC,),)
                test('0',    () => expect(new instance(ABCD,).filterNot(callbackIs0Alt,).toArray(),)   .toStrictEqual(BCD,),)
                test('1',    () => expect(new instance(ABCD,).filterNot(callbackIs1Alt,).toArray(),)   .toStrictEqual(ACD,),)
                test('2',    () => expect(new instance(ABCD,).filterNot(callbackIs2Alt,).toArray(),)   .toStrictEqual(ABD,),)
                test('3',    () => expect(new instance(ABCD,).filterNot(callbackIs3Alt,).toArray(),)   .toStrictEqual(ABC,),)
                test('4',    () => expect(new instance(ABCD,).filterNot(callbackIs4Alt,).toArray(),)   .toStrictEqual(ABCD,),)
            },)
        },)
        describe("filterNotIndexed", () => {
            describe("empty", () => {
                test("(number, T) → boolean", () => expect(new instance(EMPTY,).filterNotIndexed(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("(number) → boolean",    () => expect(new instance(EMPTY,).filterNotIndexed(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("() → boolean",          () => expect(new instance(EMPTY,).filterNotIndexed(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).filterNotIndexed(it,).toArray(),).toBeEmpty(),)
                    test("2 fields", () => expect(new instance(AB,).filterNotIndexed(it,).toArray(),).toBeEmpty(),)
                    test("4 fields", () => expect(new instance(ABCD,).filterNotIndexed(it,).toArray(),).toBeEmpty(),)
                },)
                describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).filterNotIndexed(it,).toArray(),).toEqual(A,),)
                    test("2 fields", () => expect(new instance(AB,).filterNotIndexed(it,).toArray(),).toEqual(AB,),)
                    test("4 fields", () => expect(new instance(ABCD,).filterNotIndexed(it,).toArray(),).toEqual(ABCD,),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).filterNotIndexed(callbackIsAAlt,),)          .toBeEmpty(),)
                test('e',    () => expect(new instance(A,).filterNotIndexed(callbackIsEAlt,).toArray(),).toStrictEqual(A,),)
                test("even", () => expect(new instance(A,).filterNotIndexed(callbackIsEven,),)          .toBeEmpty(),)
                test("odd",  () => expect(new instance(A,).filterNotIndexed(callbackIsOdd,).toArray(),) .toStrictEqual(A,),)
                test('0',    () => expect(new instance(A,).filterNotIndexed(callbackIs0,),)             .toBeEmpty(),)
                test('4',    () => expect(new instance(A,).filterNotIndexed(callbackIs4,).toArray(),)   .toStrictEqual(A,),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).filterNotIndexed(callbackIsAAlt,).toArray(),).toStrictEqual(B,),)
                test('b',    () => expect(new instance(AB,).filterNotIndexed(callbackIsBAlt,).toArray(),).toStrictEqual(A,),)
                test('e',    () => expect(new instance(AB,).filterNotIndexed(callbackIsEAlt,).toArray(),).toStrictEqual(AB,),)
                test("even", () => expect(new instance(AB,).filterNotIndexed(callbackIsEven,).toArray(),).toStrictEqual(B,),)
                test("odd",  () => expect(new instance(AB,).filterNotIndexed(callbackIsOdd,).toArray(),) .toStrictEqual(A,),)
                test('0',    () => expect(new instance(AB,).filterNotIndexed(callbackIs0,).toArray(),)   .toStrictEqual(B,),)
                test('1',    () => expect(new instance(AB,).filterNotIndexed(callbackIs1,).toArray(),)   .toStrictEqual(A,),)
                test('4',    () => expect(new instance(AB,).filterNotIndexed(callbackIs4,).toArray(),)   .toStrictEqual(AB,),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIsAAlt,).toArray(),).toStrictEqual(BCD,),)
                test('b',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIsBAlt,).toArray(),).toStrictEqual(ACD,),)
                test('c',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIsCAlt,).toArray(),).toStrictEqual(ABD,),)
                test('d',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIsDAlt,).toArray(),).toStrictEqual(ABC,),)
                test('e',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIsEAlt,).toArray(),).toStrictEqual(ABCD),)
                test("even", () => expect(new instance(ABCD,).filterNotIndexed(callbackIsEven,).toArray(),).toStrictEqual(BD,),)
                test("odd",  () => expect(new instance(ABCD,).filterNotIndexed(callbackIsOdd,).toArray(),) .toStrictEqual(AC,),)
                test('0',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIs0,).toArray(),)   .toStrictEqual(BCD,),)
                test('1',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIs1,).toArray(),)   .toStrictEqual(ACD,),)
                test('2',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIs2,).toArray(),)   .toStrictEqual(ABD,),)
                test('3',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIs3,).toArray(),)   .toStrictEqual(ABC,),)
                test('4',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIs4,).toArray(),)   .toStrictEqual(ABCD,),)
            },)
        },)

        describe("filterNotNull", () => {
            test("empty", () => expect(new instance(EMPTY,).filterNotNull(),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            describe("1 field", () => {
                test("non-null",  () => expect(new instance(A,).filterNotNull().toArray(),).toEqual(A,),)
                test("null",      () => expect(new instance(NULL,).filterNotNull().toArray(),).toBeEmpty(),)
                test("undefined", () => expect(new instance(UNDEFINED,).filterNotNull().toArray(),).toBeEmpty(),)
            },)
            describe("2 fields", () => {
                test("non-null",           () => expect(new instance(AB,).filterNotNull().toArray(),).toEqual(AB,),)
                test("null at start",      () => expect(new instance(NULL_A,).filterNotNull().toArray(),).toEqual(A,),)
                test("null at end",        () => expect(new instance(A_NULL,).filterNotNull().toArray(),).toEqual(A,),)
                test("undefined at start", () => expect(new instance(UNDEFINED_A,).filterNotNull().toArray(),).toEqual(A,),)
                test("undefined at end",   () => expect(new instance(A_UNDEFINED,).filterNotNull().toArray(),).toEqual(A,),)
                test("null + undefined",   () => expect(new instance(NULL_UNDEFINED,).filterNotNull().toArray(),).toBeEmpty(),)
            },)
            describe("4 fields", () => {
                test("non-null",            () => expect(new instance(ABCD,).filterNotNull().toArray(),).toEqual(ABCD,),)
                test("null at start",       () => expect(new instance(NULL_AB,).filterNotNull().toArray(),).toEqual(AB,),)
                test("null at center",      () => expect(new instance(A_NULL_B,).filterNotNull().toArray(),).toEqual(AB,),)
                test("null at end",         () => expect(new instance(AB_NULL,).filterNotNull().toArray(),).toEqual(AB,),)
                test("undefined at start",  () => expect(new instance(UNDEFINED_AB,).filterNotNull().toArray(),).toEqual(AB,),)
                test("undefined at center", () => expect(new instance(A_UNDEFINED_B,).filterNotNull().toArray(),).toEqual(AB,),)
                test("undefined at end",    () => expect(new instance(AB_UNDEFINED,).filterNotNull().toArray(),).toEqual(AB,),)
                test("null + undefined",    () => expect(new instance(A_NULL_UNDEFINED_B,).filterNotNull().toArray(),).toEqual(AB,),)
            },)

            if (isMinimalist)
                return // We only do some test that require the CollectionHolder.hasNull method
            describe("Same instance", () => {
                test("1 field",  () => expectToBeInstance(new instance(A,), it =>    it.filterNotNull(),),)
                test("2 fields", () => expectToBeInstance(new instance(AB,), it =>   it.filterNotNull(),),)
                test("4 fields", () => expectToBeInstance(new instance(ABCD,), it => it.filterNotNull(),),)
            },)
        },)
    },)},)

},)
