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

import {A, A_NULL, A_NULL_C_NULL, AB, ABCD, AC, B, BD, EMPTY, NULL, NULL_B, NULL_B_NULL_D, NULL_x2, NULL_x4, UNDEFINED, UNDEFINED_x2, UNDEFINED_x4, UPPER_E, UPPER_EE, UPPER_EEEE} from "./value/arrays"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                                                                         from "./value/callbacks (fail)"
import {callbackAsNull0, callbackAsUndefined0, callbackOnlyIfEven, callbackOnlyIfEvenAlt, callbackOnlyIfOdd, callbackOnlyIfOddAlt}                                                 from "./value/callbacks (null)"
import {callbackAsString0, callbackAsString1, callbackAsString2, callbackToString0}                                                                                                from "./value/callbacks (string)"
import {everyExtensionMethodInstances, everyInstances}                                                                                                                             from "./value/instances"

import {CollectionConstants}   from "../src/CollectionConstants"
import {EmptyCollectionHolder} from "../src/EmptyCollectionHolder"

describe("CollectionHolderTest (map)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("map",                 () => expect(instance.map(),)              .toBe(instance,),)
        test("mapIndexed",          () => expect(instance.mapIndexed(),)       .toBe(instance,),)
        test("mapNotNull",          () => expect(instance.mapNotNull(),)       .toBe(instance,),)
        test("mapNotNullIndexed",   () => expect(instance.mapNotNullIndexed(),).toBe(instance,),)
    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance,},},) => {
        describe("map",               () => expect(instance.map(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        describe("mapIndexed",        () => expect(instance.mapIndexed(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)

        describe("mapNotNull",        () => expect(instance.mapNotNull(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        describe("mapNotNullIndexed", () => expect(instance.mapNotNullIndexed(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
    },)},)

    describe("instances", () => {
    describe.each(everyInstances,)("%s", ({value: {instance,},},) => {
        describe("get() being called", () => {
            describe("map", () => {
                test("empty: (T, number) → U",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.map(callbackAsFail0,),)  .amountOfCall,).toBe(0,),)
                test("empty: (T) → U",            () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.map(callbackAsFail1,),)  .amountOfCall,).toBe(0,),)
                test("empty: () → U",             () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.map(callbackAsFail2,),)  .amountOfCall,).toBe(0,),)
                test("1 field: (T, number) → U",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.map(callbackAsString0,),).amountOfCall,).toBe(0,),)
                test("1 field: (T) → U",          () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.map(callbackAsString1,),).amountOfCall,).toBe(1,),)
                test("1 field: () → U",           () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.map(callbackAsString2,),).amountOfCall,).toBe(1,),)
                test("2 fields: (T, number) → U", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.map(callbackAsString0,),).amountOfCall,).toBe(0,),)
                test("2 fields: (T) → U",         () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.map(callbackAsString1,),).amountOfCall,).toBe(2,),)
                test("2 fields: () → U",          () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.map(callbackAsString2,),).amountOfCall,).toBe(2,),)
                test("4 fields: (T, number) → U", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.map(callbackAsString0,),).amountOfCall,).toBe(0,),)
                test("4 fields: (T) → U",         () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.map(callbackAsString1,),).amountOfCall,).toBe(4,),)
                test("4 fields: () → U",          () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.map(callbackAsString2,),).amountOfCall,).toBe(4,),)
            },)
            describe("mapIndexed", () => {
                test("empty: (number, T) → U",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsFail0,),)  .amountOfCall,).toBe(0,),)
                test("empty: (number) → U",       () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsFail1,),)  .amountOfCall,).toBe(0,),)
                test("empty: () → U",             () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsFail2,),)  .amountOfCall,).toBe(0,),)
                test("1 field: (number, T) → U",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                test("1 field: (number) → U",     () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                test("1 field: () → U",           () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString2,),).amountOfCall,).toBe(1,),)
                test("2 fields: (number, T) → U", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                test("2 fields: (number) → U",    () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                test("2 fields: () → U",          () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString2,),).amountOfCall,).toBe(2,),)
                test("4 fields: (number, T) → U", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                test("4 fields: (number) → U",    () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                test("4 fields: () → U",          () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.mapIndexed(callbackAsString2,),).amountOfCall,).toBe(4,),)
            },)

            describe("mapNotNull", () => {
                 test("empty: (T, number) → U?",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsFail0,),)  .amountOfCall,).toBe(0,),)
                test("empty: (T) → U?",            () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsFail1,),)  .amountOfCall,).toBe(0,),)
                test("empty: () → U?",             () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsFail2,),)  .amountOfCall,).toBe(0,),)
                test("1 field: (T, number) → U?",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString0,),).amountOfCall,).toBe(0,),)
                test("1 field: (T) → U?",          () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString1,),).amountOfCall,).toBe(1,),)
                test("1 field: () → U?",           () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString2,),).amountOfCall,).toBe(1,),)
                test("2 fields: (T, number) → U?", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString0,),).amountOfCall,).toBe(0,),)
                test("2 fields: (T) → U?",         () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString1,),).amountOfCall,).toBe(2,),)
                test("2 fields: () → U?",          () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString2,),).amountOfCall,).toBe(2,),)
                test("4 fields: (T, number) → U?", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString0,),).amountOfCall,).toBe(0,),)
                test("4 fields: (T) → U?",         () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString1,),).amountOfCall,).toBe(4,),)
                test("4 fields: () → U?",          () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.mapNotNull(callbackAsString2,),).amountOfCall,).toBe(4,),)
            },)
            describe("mapNotNullIndexed", () => {
                test("empty: (number, T) → U?",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsFail0,),)  .amountOfCall,).toBe(0,),)
                test("empty: (number) → U?",       () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsFail1,),)  .amountOfCall,).toBe(0,),)
                test("empty: () → U?",             () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsFail2,),)  .amountOfCall,).toBe(0,),)
                test("1 field: (number, T) → U?",  () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                test("1 field: (number) → U?",     () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                test("1 field: () → U?",           () => expect(new instance(A,)    .executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString2,),).amountOfCall,).toBe(1,),)
                test("2 fields: (number, T) → U?", () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                test("2 fields: (number) → U?",    () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                test("2 fields: () → U?",          () => expect(new instance(AB,)   .executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString2,),).amountOfCall,).toBe(2,),)
                test("4 fields: (number, T) → U?", () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                test("4 fields: (number) → U?",    () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                test("4 fields: () → U?",          () => expect(new instance(ABCD,) .executeWhileHavingIndexesOnField(it => it.mapNotNullIndexed(callbackAsString2,),).amountOfCall,).toBe(4,),)
            },)
        },)

        describe("map", () => {
            test("empty",               () => expect(new instance(EMPTY,).map(callbackAsFail0,),)               .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("1 field: value",      () => expect(new instance(A,)    .map(callbackToString0,).toArray(),)   .toStrictEqual(UPPER_E,),)
            test("1 field: null",       () => expect(new instance(A,)    .map(callbackAsNull0,).toArray(),)     .toStrictEqual(NULL,),)
            test("1 field: undefined",  () => expect(new instance(A,)    .map(callbackAsUndefined0,).toArray(),).toStrictEqual(UNDEFINED,),)
            test("1 field: even",       () => expect(new instance(A,)    .map(callbackOnlyIfEven,).toArray(),)  .toStrictEqual(A,),)
            test("1 field: odd",        () => expect(new instance(A,)    .map(callbackOnlyIfOdd,).toArray(),)   .toStrictEqual(NULL,),)
            test("2 fields: value",     () => expect(new instance(AB,)   .map(callbackToString0,).toArray(),)   .toStrictEqual(UPPER_EE,),)
            test("2 fields: null",      () => expect(new instance(AB,)   .map(callbackAsNull0,).toArray(),)     .toStrictEqual(NULL_x2,),)
            test("2 fields: undefined", () => expect(new instance(AB,)   .map(callbackAsUndefined0,).toArray(),).toStrictEqual(UNDEFINED_x2,),)
            test("2 fields: even",      () => expect(new instance(AB,)   .map(callbackOnlyIfEven,).toArray(),)  .toStrictEqual(A_NULL,),)
            test("2 fields: odd",       () => expect(new instance(AB,)   .map(callbackOnlyIfOdd,).toArray(),)   .toStrictEqual(NULL_B,),)
            test("4 fields: value",     () => expect(new instance(ABCD,) .map(callbackToString0,).toArray(),)   .toStrictEqual(UPPER_EEEE,),)
            test("4 fields: null",      () => expect(new instance(ABCD,) .map(callbackAsNull0,).toArray(),)     .toStrictEqual(NULL_x4,),)
            test("4 fields: undefined", () => expect(new instance(ABCD,) .map(callbackAsUndefined0,).toArray(),).toStrictEqual(UNDEFINED_x4,),)
            test("4 fields: even",      () => expect(new instance(ABCD,) .map(callbackOnlyIfEven,).toArray(),)  .toStrictEqual(A_NULL_C_NULL,),)
            test("4 fields: odd",       () => expect(new instance(ABCD,) .map(callbackOnlyIfOdd,).toArray(),)   .toStrictEqual(NULL_B_NULL_D,),)
        },)
        describe("mapIndexed", () => {
            test("empty",               () => expect(new instance(EMPTY,).mapIndexed(callbackAsFail0,),)                .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("1 field: value",      () => expect(new instance(A,)    .mapIndexed(callbackToString0,).toArray(),)    .toStrictEqual(UPPER_E,),)
            test("1 field: null",       () => expect(new instance(A,)    .mapIndexed(callbackAsNull0,).toArray(),)      .toStrictEqual(NULL,),)
            test("1 field: undefined",  () => expect(new instance(A,)    .mapIndexed(callbackAsUndefined0,).toArray(),) .toStrictEqual(UNDEFINED,),)
            test("1 field: even",       () => expect(new instance(A,)    .mapIndexed(callbackOnlyIfEvenAlt,).toArray(),).toStrictEqual(A,),)
            test("1 field: odd",        () => expect(new instance(A,)    .mapIndexed(callbackOnlyIfOddAlt,).toArray(),) .toStrictEqual(NULL,),)
            test("2 fields: value",     () => expect(new instance(AB,)   .mapIndexed(callbackToString0,).toArray(),)    .toStrictEqual(UPPER_EE,),)
            test("2 fields: null",      () => expect(new instance(AB,)   .mapIndexed(callbackAsNull0,).toArray(),)      .toStrictEqual(NULL_x2,),)
            test("2 fields: undefined", () => expect(new instance(AB,)   .mapIndexed(callbackAsUndefined0,).toArray(),) .toStrictEqual(UNDEFINED_x2,),)
            test("2 fields: even",      () => expect(new instance(AB,)   .mapIndexed(callbackOnlyIfEvenAlt,).toArray(),).toStrictEqual(A_NULL,),)
            test("2 fields: odd",       () => expect(new instance(AB,)   .mapIndexed(callbackOnlyIfOddAlt,).toArray(),) .toStrictEqual(NULL_B,),)
            test("4 fields: value",     () => expect(new instance(ABCD,) .mapIndexed(callbackToString0,).toArray(),)    .toStrictEqual(UPPER_EEEE,),)
            test("4 fields: null",      () => expect(new instance(ABCD,) .mapIndexed(callbackAsNull0,).toArray(),)      .toStrictEqual(NULL_x4,),)
            test("4 fields: undefined", () => expect(new instance(ABCD,) .mapIndexed(callbackAsUndefined0,).toArray(),) .toStrictEqual(UNDEFINED_x4,),)
            test("4 fields: even",      () => expect(new instance(ABCD,) .mapIndexed(callbackOnlyIfEvenAlt,).toArray(),).toStrictEqual(A_NULL_C_NULL,),)
            test("4 fields: odd",       () => expect(new instance(ABCD,) .mapIndexed(callbackOnlyIfOddAlt,).toArray(),) .toStrictEqual(NULL_B_NULL_D,),)
        },)

        describe("mapNotNull", () => {
            test("empty",               () => expect(new instance(EMPTY,).mapNotNull(callbackAsFail0,),)             .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("1 field: value",      () => expect(new instance(A,)    .mapNotNull(callbackToString0,).toArray(),) .toStrictEqual(UPPER_E,),)
            test("1 field: null",       () => expect(new instance(A,)    .mapNotNull(callbackAsNull0,),)             .toBeEmpty(),)
            test("1 field: undefined",  () => expect(new instance(A,)    .mapNotNull(callbackAsUndefined0,),)        .toBeEmpty(),)
            test("1 field: even",       () => expect(new instance(A,)    .mapNotNull(callbackOnlyIfEven,).toArray(),).toStrictEqual(A,),)
            test("1 field: odd",        () => expect(new instance(A,)    .mapNotNull(callbackOnlyIfOdd,),)           .toBeEmpty(),)
            test("2 fields: value",     () => expect(new instance(AB,)   .mapNotNull(callbackToString0,).toArray(),) .toStrictEqual(UPPER_EE,),)
            test("2 fields: null",      () => expect(new instance(AB,)   .mapNotNull(callbackAsNull0,),)             .toBeEmpty(),)
            test("2 fields: undefined", () => expect(new instance(AB,)   .mapNotNull(callbackAsUndefined0,),)        .toBeEmpty(),)
            test("2 fields: even",      () => expect(new instance(AB,)   .mapNotNull(callbackOnlyIfEven,).toArray(),).toStrictEqual(A,),)
            test("2 fields: odd",       () => expect(new instance(AB,)   .mapNotNull(callbackOnlyIfOdd,).toArray(),) .toStrictEqual(B,),)
            test("4 fields: value",     () => expect(new instance(ABCD,) .mapNotNull(callbackToString0,).toArray(),) .toStrictEqual(UPPER_EEEE,),)
            test("4 fields: null",      () => expect(new instance(ABCD,) .mapNotNull(callbackAsNull0,),)             .toBeEmpty(),)
            test("4 fields: undefined", () => expect(new instance(ABCD,) .mapNotNull(callbackAsUndefined0,),)        .toBeEmpty(),)
            test("4 fields: even",      () => expect(new instance(ABCD,) .mapNotNull(callbackOnlyIfEven,).toArray(),).toStrictEqual(AC,),)
            test("4 fields: odd",       () => expect(new instance(ABCD,) .mapNotNull(callbackOnlyIfOdd,).toArray(),) .toStrictEqual(BD,),)
        },)
        describe("mapNotNullIndexed", () => {
            test("empty",               () => expect(new instance(EMPTY,).mapNotNullIndexed(callbackAsFail0,),)                .toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("1 field: value",      () => expect(new instance(A,)    .mapNotNullIndexed(callbackToString0,).toArray(),)    .toStrictEqual(UPPER_E,),)
            test("1 field: null",       () => expect(new instance(A,)    .mapNotNullIndexed(callbackAsNull0,),)                .toBeEmpty(),)
            test("1 field: undefined",  () => expect(new instance(A,)    .mapNotNullIndexed(callbackAsUndefined0,),)           .toBeEmpty(),)
            test("1 field: even",       () => expect(new instance(A,)    .mapNotNullIndexed(callbackOnlyIfEvenAlt,).toArray(),).toStrictEqual(A,),)
            test("1 field: odd",        () => expect(new instance(A,)    .mapNotNullIndexed(callbackOnlyIfOddAlt,),)           .toBeEmpty(),)
            test("2 fields: value",     () => expect(new instance(AB,)   .mapNotNullIndexed(callbackToString0,).toArray(),)    .toStrictEqual(UPPER_EE,),)
            test("2 fields: null",      () => expect(new instance(AB,)   .mapNotNullIndexed(callbackAsNull0,),)                .toBeEmpty(),)
            test("2 fields: undefined", () => expect(new instance(AB,)   .mapNotNullIndexed(callbackAsUndefined0,),)           .toBeEmpty(),)
            test("2 fields: even",      () => expect(new instance(AB,)   .mapNotNullIndexed(callbackOnlyIfEvenAlt,).toArray(),).toStrictEqual(A,),)
            test("2 fields: odd",       () => expect(new instance(AB,)   .mapNotNullIndexed(callbackOnlyIfOddAlt,).toArray(),) .toStrictEqual(B,),)
            test("4 fields: value",     () => expect(new instance(ABCD,) .mapNotNullIndexed(callbackToString0,).toArray(),)    .toStrictEqual(UPPER_EEEE,),)
            test("4 fields: null",      () => expect(new instance(ABCD,) .mapNotNullIndexed(callbackAsNull0,),)                .toBeEmpty(),)
            test("4 fields: undefined", () => expect(new instance(ABCD,) .mapNotNullIndexed(callbackAsUndefined0,),)           .toBeEmpty(),)
            test("4 fields: even",      () => expect(new instance(ABCD,) .mapNotNullIndexed(callbackOnlyIfEvenAlt,).toArray(),).toStrictEqual(AC,),)
            test("4 fields: odd",       () => expect(new instance(ABCD,) .mapNotNullIndexed(callbackOnlyIfOddAlt,).toArray(),) .toStrictEqual(BD,),)
        },)
    },)},)

},)
