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

import {Empty}           from "../src/tuple/Empty"
import {Tuple_1Follower} from "./instance/Tuple_1.follower"
import {Tuple_2Follower} from "./instance/Tuple_2.follower"
import {Tuple_1}         from "./instance/Tuple_1"
import {Tuple_2}         from "./instance/Tuple_2"

describe("TupleTest (has)", () => {

    describe("Empty", () => {
        const instance = Empty.get

        test("hasNull",              () => expect(instance.hasNull,).toBeFalse(),)
        test("includesNull",         () => expect(instance.includesNull,).toBeFalse(),)
        test("containsNull",         () => expect(instance.containsNull,).toBeFalse(),)

        test("hasNoNulls",           () => expect(instance.hasNoNulls,).toBeTrue(),)
        test("includesNoNulls",      () => expect(instance.includesNoNulls,).toBeTrue(),)
        test("containsNoNulls",      () => expect(instance.containsNoNulls,).toBeTrue(),)

        test("hasDuplicate",         () => expect(instance.hasDuplicate,).toBeFalse(),)
        test("includesDuplicate",    () => expect(instance.includesDuplicate,).toBeFalse(),)
        test("containsDuplicate",    () => expect(instance.containsDuplicate,).toBeFalse(),)

        test("hasNoDuplicates",      () => expect(instance.hasNoDuplicates,).toBeTrue(),)
        test("includesNoDuplicates", () => expect(instance.includesNoDuplicates,).toBeTrue(),)
        test("containsNoDuplicates", () => expect(instance.containsNoDuplicates,).toBeTrue(),)
    },)

    describe("aliases", () => {
        describe("Monuple", () => {
            test("includesNull",         () => expect(new Tuple_1Follower().execute(it => it.includesNull,)         .hasNull_amountOfCall,)        .toBe(1,),)
            test("includesNoNulls",      () => expect(new Tuple_1Follower().execute(it => it.includesNoNulls,)      .hasNoNulls_amountOfCall,)     .toBe(1,),)
            test("includesDuplicate",    () => expect(new Tuple_1Follower().execute(it => it.includesDuplicate,)    .hasDuplicate_amountOfCall,)   .toBe(1,),)
            test("includesNoDuplicates", () => expect(new Tuple_1Follower().execute(it => it.includesNoDuplicates,) .hasNoDuplicates_amountOfCall,).toBe(1,),)
            test("containsNull",         () => expect(new Tuple_1Follower().execute(it => it.containsNull,)         .hasNull_amountOfCall,)        .toBe(1,),)
            test("containsNoNulls",      () => expect(new Tuple_1Follower().execute(it => it.containsNoNulls,)      .hasNoNulls_amountOfCall,)     .toBe(1,),)
            test("containsDuplicate",    () => expect(new Tuple_1Follower().execute(it => it.containsDuplicate,)    .hasDuplicate_amountOfCall,)   .toBe(1,),)
            test("containsNoDuplicates", () => expect(new Tuple_1Follower().execute(it => it.containsNoDuplicates,) .hasNoDuplicates_amountOfCall,).toBe(1,),)
        },)
        describe("Couple", () => {
            test("includesNull",         () => expect(new Tuple_2Follower().execute(it => it.includesNull,)         .hasNull_amountOfCall,)        .toBe(1,),)
            test("includesNoNulls",      () => expect(new Tuple_2Follower().execute(it => it.includesNoNulls,)      .hasNoNulls_amountOfCall,)     .toBe(1,),)
            test("includesDuplicate",    () => expect(new Tuple_2Follower().execute(it => it.includesDuplicate,)    .hasDuplicate_amountOfCall,)   .toBe(1,),)
            test("includesNoDuplicates", () => expect(new Tuple_2Follower().execute(it => it.includesNoDuplicates,) .hasNoDuplicates_amountOfCall,).toBe(1,),)
            test("containsNull",         () => expect(new Tuple_2Follower().execute(it => it.containsNull,)         .hasNull_amountOfCall,)        .toBe(1,),)
            test("containsNoNulls",      () => expect(new Tuple_2Follower().execute(it => it.containsNoNulls,)      .hasNoNulls_amountOfCall,)     .toBe(1,),)
            test("containsDuplicate",    () => expect(new Tuple_2Follower().execute(it => it.containsDuplicate,)    .hasDuplicate_amountOfCall,)   .toBe(1,),)
            test("containsNoDuplicates", () => expect(new Tuple_2Follower().execute(it => it.containsNoDuplicates,) .hasNoDuplicates_amountOfCall,).toBe(1,),)
        },)
    },)

    describe("Monuple", () => {
        describe("hasNull", () => {
            test("null",      () => expect(new Tuple_1(null,)     .hasNull,).toBeTrue(),)
            test("undefined", () => expect(new Tuple_1(undefined,).hasNull,).toBeTrue(),)
            test('a',         () => expect(new Tuple_1('a',)      .hasNull,).toBeFalse(),)
            test('e',         () => expect(new Tuple_1('e',)      .hasNull,).toBeFalse(),)
        },)
        describe("hasNoNulls", () => {
            test("null",      () => expect(new Tuple_1(null,)     .hasNoNulls,).toBeFalse(),)
            test("undefined", () => expect(new Tuple_1(undefined,).hasNoNulls,).toBeFalse(),)
            test('a',         () => expect(new Tuple_1('a',)      .hasNoNulls,).toBeTrue(),)
            test('e',         () => expect(new Tuple_1('e',)      .hasNoNulls,).toBeTrue(),)
        },)

        test("hasDuplicate",    () => expect(new Tuple_1(null,).hasDuplicate,)   .toBeFalse(),)
        test("hasNoDuplicates", () => expect(new Tuple_1(null,).hasNoDuplicates,).toBeTrue(),)
    },)

    describe("Couple", () => {
        describe("hasNull", () => {
            test("null, null",           () => expect(new Tuple_2(null, null,)          .hasNull,).toBeTrue(),)
            test("null, undefined",      () => expect(new Tuple_2(null, undefined,)     .hasNull,).toBeTrue(),)
            test("null at start",        () => expect(new Tuple_2(null, 'a',)           .hasNull,).toBeTrue(),)
            test("null at end",          () => expect(new Tuple_2('a', null,)           .hasNull,).toBeTrue(),)
            test("undefined, null",      () => expect(new Tuple_2(undefined, null,)     .hasNull,).toBeTrue(),);
            test("undefined, undefined", () => expect(new Tuple_2(undefined, undefined,).hasNull,).toBeTrue(),)
            test("undefined at start",   () => expect(new Tuple_2(undefined, 'a',)      .hasNull,).toBeTrue(),)
            test("undefined at end",     () => expect(new Tuple_2('a', undefined,)      .hasNull,).toBeTrue(),);
            test("aa",                   () => expect(new Tuple_2('a', 'a',)            .hasNull,).toBeFalse(),)
            test("ab",                   () => expect(new Tuple_2('a', 'b',)            .hasNull,).toBeFalse(),)
            test("ef",                   () => expect(new Tuple_2('e', 'f',)            .hasNull,).toBeFalse(),)
        },)
        describe("hasNoNulls", () => {
            test("null, null",           () => expect(new Tuple_2(null, null,)          .hasNoNulls,).toBeFalse(),)
            test("null, undefined",      () => expect(new Tuple_2(null, undefined,)     .hasNoNulls,).toBeFalse(),)
            test("null at start",        () => expect(new Tuple_2(null, 'a',)           .hasNoNulls,).toBeFalse(),)
            test("null at end",          () => expect(new Tuple_2('a', null,)           .hasNoNulls,).toBeFalse(),)
            test("undefined, null",      () => expect(new Tuple_2(undefined, null,)     .hasNoNulls,).toBeFalse(),);
            test("undefined, undefined", () => expect(new Tuple_2(undefined, undefined,).hasNoNulls,).toBeFalse(),)
            test("undefined at start",   () => expect(new Tuple_2(undefined, 'a',)      .hasNoNulls,).toBeFalse(),)
            test("undefined at end",     () => expect(new Tuple_2('a', undefined,)      .hasNoNulls,).toBeFalse(),);
            test("aa",                   () => expect(new Tuple_2('a', 'a',)            .hasNoNulls,).toBeTrue(),)
            test("ab",                   () => expect(new Tuple_2('a', 'b',)            .hasNoNulls,).toBeTrue(),)
            test("ef",                   () => expect(new Tuple_2('e', 'f',)            .hasNoNulls,).toBeTrue(),)
        },);

        describe("hasDuplicate", () => {
            test("null, null",           () => expect(new Tuple_2(null, null,)          .hasDuplicate,).toBeTrue(),)
            test("null at start",        () => expect(new Tuple_2(null, 'a',)           .hasDuplicate,).toBeFalse(),)
            test("null at end",          () => expect(new Tuple_2('a', null,)           .hasDuplicate,).toBeFalse(),)
            test("null, undefined",      () => expect(new Tuple_2(null, undefined,)     .hasDuplicate,).toBeFalse(),)
            test("undefined, null",      () => expect(new Tuple_2(undefined, null,)     .hasDuplicate,).toBeFalse(),)
            test("undefined, undefined", () => expect(new Tuple_2(undefined, undefined,).hasDuplicate,).toBeTrue(),)
            test("undefined at start",   () => expect(new Tuple_2(undefined, 'a',)      .hasDuplicate,).toBeFalse(),)
            test("undefined at end",     () => expect(new Tuple_2('a', undefined,)      .hasDuplicate,).toBeFalse(),)
            test("aa",                   () => expect(new Tuple_2('a', 'a',)            .hasDuplicate,).toBeTrue(),)
            test("ab",                   () => expect(new Tuple_2('a', 'b',)            .hasDuplicate,).toBeFalse(),)
            test("ef",                   () => expect(new Tuple_2('e', 'f',)            .hasDuplicate,).toBeFalse(),)
        },);
        describe("hasNoDuplicates", () => {
            test("null, null",           () => expect(new Tuple_2(null, null,)          .hasNoDuplicates,).toBeFalse(),)
            test("null at start",        () => expect(new Tuple_2(null, 'a',)           .hasNoDuplicates,).toBeTrue(),)
            test("null at end",          () => expect(new Tuple_2('a', null,)           .hasNoDuplicates,).toBeTrue(),)
            test("null, undefined",      () => expect(new Tuple_2(null, undefined,)     .hasNoDuplicates,).toBeTrue(),)
            test("undefined, null",      () => expect(new Tuple_2(undefined, null,)     .hasNoDuplicates,).toBeTrue(),)
            test("undefined, undefined", () => expect(new Tuple_2(undefined, undefined,).hasNoDuplicates,).toBeFalse(),)
            test("undefined at start",   () => expect(new Tuple_2(undefined, 'a',)      .hasNoDuplicates,).toBeTrue(),)
            test("undefined at end",     () => expect(new Tuple_2('a', undefined,)      .hasNoDuplicates,).toBeTrue(),)
            test("aa",                   () => expect(new Tuple_2('a', 'a',)            .hasNoDuplicates,).toBeFalse(),)
            test("ab",                   () => expect(new Tuple_2('a', 'b',)            .hasNoDuplicates,).toBeTrue(),)
            test("ef",                   () => expect(new Tuple_2('e', 'f',)            .hasNoDuplicates,).toBeTrue(),)
        },)
    },)

},)
