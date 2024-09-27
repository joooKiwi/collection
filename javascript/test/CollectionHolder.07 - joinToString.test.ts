/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {EmptyCollectionHolderForTest}                                                                                               from "./instance/EmptyCollectionHolderForTest"
import {GenericCollectionHolder_JoinToStringAlias}                                                                                  from "./instance/GenericCollectionHolder_JoinToStringAlias"
import {LazyGenericCollectionHolder_JoinToStringAlias}                                                                              from "./instance/LazyGenericCollectionHolder_JoinToStringAlias"
import {A, AB, ABCD, EMPTY}                                                                                                         from "./value/arrays"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                          from "./value/callbacks (fail)"
import {callbackAsString0, callbackAsString1, callbackAsString2, callbackToString0, callbackToUpperString1, callbackToUpperString2} from "./value/callbacks (string)"
import {everyCollectionInstancesAsCollectionHolder}                                                                                 from "./value/instances"

import {CollectionConstants}     from "../src/CollectionConstants"
import {ForbiddenIndexException} from "../src/exception/ForbiddenIndexException"

describe("CollectionHolderTest (joinToString)", () => {

    describe("EmptyCollectionHolder", () => {
        test("joinToString", () => expect(new EmptyCollectionHolderForTest().joinToString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("joinToString: prefix", () => expect(new EmptyCollectionHolderForTest().joinToString(null, '<',),).toBe("<]",),)
        test("joinToString: postfix", () => expect(new EmptyCollectionHolderForTest().joinToString(null, null, '>',),).toBe("[>",),)
        test("join", () => expect(new EmptyCollectionHolderForTest().join(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("join: prefix", () => expect(new EmptyCollectionHolderForTest().join(null, '<',),).toBe("<]",),)
        test("join: postfix", () => expect(new EmptyCollectionHolderForTest().join(null, null, '>',),).toBe("[>",),)
    },)

    describe("alias", () => {
        describe("GenericCollectionHolder",     () => test("join", () => expect(new GenericCollectionHolder_JoinToStringAlias().execute(it => it.join(),).amountOfCall,).toBe(1,),),)
        describe("LazyGenericCollectionHolder", () => test("join", () => expect(new LazyGenericCollectionHolder_JoinToStringAlias().execute(it => it.join(),).amountOfCall,).toBe(1,),),)
    },)

    describe.each(everyCollectionInstancesAsCollectionHolder,)("%s", ({value: {instance,},},) => {
        describe("get() being called", () => {
            describe("empty", () => {
                test("nothing",                 () => expect(new instance(EMPTY,).execute(it => it.joinToString(),).amountOfCall,).toBe(0,),)
                test("separator",               () => expect(new instance(EMPTY,).execute(it => it.joinToString('',),).amountOfCall,).toBe(0,),)
                test("prefix",                  () => expect(new instance(EMPTY,).execute(it => it.joinToString(null, '',),).amountOfCall,).toBe(0,),)
                test("postfix",                 () => expect(new instance(EMPTY,).execute(it => it.joinToString(null, null, '',),).amountOfCall,).toBe(0,),)
                test("limit + truncate",        () => expect(new instance(EMPTY,).execute(it => it.joinToString(null, null, null, NaN, '',),).amountOfCall,).toBe(0,),)
                test("transform = 0 arguments", () => expect(new instance(EMPTY,).execute(it => it.joinToString(null, null, null, null, null, callbackAsFail0,),).amountOfCall,).toBe(0,),)
                test("transform = 1 argument",  () => expect(new instance(EMPTY,).execute(it => it.joinToString(null, null, null, null, null, callbackAsFail1,),).amountOfCall,).toBe(0,),)
                test("transform = 2 arguments", () => expect(new instance(EMPTY,).execute(it => it.joinToString(null, null, null, null, null, callbackAsFail2,),).amountOfCall,).toBe(0,),)
            },)
            describe("1 field", () => {
                test("nothing",                 () => expect(new instance(A,).execute(it => it.joinToString(),).amountOfCall,).toBe(1,),)
                test("separator",               () => expect(new instance(A,).execute(it => it.joinToString(';',),).amountOfCall,).toBe(1,),)
                test("prefix",                  () => expect(new instance(A,).execute(it => it.joinToString(null, '<',),).amountOfCall,).toBe(1,),)
                test("postfix",                 () => expect(new instance(A,).execute(it => it.joinToString(null, null, '<',),).amountOfCall,).toBe(1,),)
                test("limit + truncate",        () => expect(new instance(A,).execute(it => it.joinToString(null, null, null, 0, '‥',),).amountOfCall,).toBe(0,),)
                test("transform = 0 arguments", () => expect(new instance(A,).execute(it => it.joinToString(null, null, null, null, null, callbackAsString0,),).amountOfCall,).toBe(0,),)
                test("transform = 1 argument",  () => expect(new instance(A,).execute(it => it.joinToString(null, null, null, null, null, callbackAsString1,),).amountOfCall,).toBe(1,),)
                test("transform = 2 arguments", () => expect(new instance(A,).execute(it => it.joinToString(null, null, null, null, null, callbackAsString2,),).amountOfCall,).toBe(1,),)
            },)
            describe("2 fields", () => {
                test("nothing",                 () => expect(new instance(AB,).execute(it => it.joinToString(),).amountOfCall,).toBe(2,),)
                test("separator",               () => expect(new instance(AB,).execute(it => it.joinToString(';',),).amountOfCall,).toBe(2,),)
                test("prefix",                  () => expect(new instance(AB,).execute(it => it.joinToString(null, '<',),).amountOfCall,).toBe(2,),)
                test("postfix",                 () => expect(new instance(AB,).execute(it => it.joinToString(null, null, '<',),).amountOfCall,).toBe(2,),)
                test("limit + truncate",        () => expect(new instance(AB,).execute(it => it.joinToString(null, null, null, 1, '‥',),).amountOfCall,).toBe(1,),)
                test("transform = 0 arguments", () => expect(new instance(AB,).execute(it => it.joinToString(null, null, null, null, null, callbackAsString0,),).amountOfCall,).toBe(0,),)
                test("transform = 1 argument",  () => expect(new instance(AB,).execute(it => it.joinToString(null, null, null, null, null, callbackAsString1,),).amountOfCall,).toBe(2,),)
                test("transform = 2 arguments", () => expect(new instance(AB,).execute(it => it.joinToString(null, null, null, null, null, callbackAsString2,),).amountOfCall,).toBe(2,),)
            },)
            describe("4 fields", () => {
                test("nothing",                 () => expect(new instance(ABCD,).execute(it => it.joinToString(),).amountOfCall,).toBe(4,),)
                test("separator",               () => expect(new instance(ABCD,).execute(it => it.joinToString(';',),).amountOfCall,).toBe(4,),)
                test("prefix",                  () => expect(new instance(ABCD,).execute(it => it.joinToString(null, '<',),).amountOfCall,).toBe(4,),)
                test("postfix",                 () => expect(new instance(ABCD,).execute(it => it.joinToString(null, null, '<',),).amountOfCall,).toBe(4,),)
                test("limit + truncate",        () => expect(new instance(ABCD,).execute(it => it.joinToString(null, null, null, 3, '‥',),).amountOfCall,).toBe(3,),)
                test("transform = 0 arguments", () => expect(new instance(ABCD,).execute(it => it.joinToString(null, null, null, null, null, callbackAsString0,),).amountOfCall,).toBe(0,),)
                test("transform = 1 argument",  () => expect(new instance(ABCD,).execute(it => it.joinToString(null, null, null, null, null, callbackAsString1,),).amountOfCall,).toBe(4,),)
                test("transform = 2 arguments", () => expect(new instance(ABCD,).execute(it => it.joinToString(null, null, null, null, null, callbackAsString2,),).amountOfCall,).toBe(4,),)
            },)
        },)

        describe("nothing", () => {
            test("empty",    () => expect(new instance(EMPTY,).joinToString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("1 field",  () => expect(new instance(A,).joinToString(),).toBe("[a]",),)
            test("2 fields", () => expect(new instance(AB,).joinToString(),).toBe("[a, b]",),)
            test("4 fields", () => expect(new instance(ABCD,).joinToString(),).toBe("[a, b, c, d]",),)
        },)
        describe("separator", () => {
            describe("empty", () => {
                test("something", () => expect(new instance(EMPTY,).joinToString(';',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("null",      () => expect(new instance(EMPTY,).joinToString(null,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("undefined", () => expect(new instance(EMPTY,).joinToString(undefined,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            },)
            describe("1 field", () => {
                test("something",  () => expect(new instance(A,).joinToString(';',),).toBe("[a]",),)
                test("null",       () => expect(new instance(A,).joinToString(null,),).toBe("[a]",),)
                test("undefined",  () => expect(new instance(A,).joinToString(undefined,),).toBe("[a]",),)
            },)
            describe("2 fields", () => {
                test("something", () => expect(new instance(AB,).joinToString(';',),).toBe("[a;b]",),)
                test("null",      () => expect(new instance(AB,).joinToString(null,),).toBe("[a, b]",),)
                test("undefined", () => expect(new instance(AB,).joinToString(undefined,),).toBe("[a, b]",),)
            },)
            describe("4 fields", () => {
                test("something", () => expect(new instance(ABCD,).joinToString(';',),).toBe("[a;b;c;d]",),)
                test("null",      () => expect(new instance(ABCD,).joinToString(null,),).toBe("[a, b, c, d]",),)
                test("undefined", () => expect(new instance(ABCD,).joinToString(undefined,),).toBe("[a, b, c, d]",),)
            },)
        },)
        describe("prefix", () => {
            describe("empty", () => {
                test("something", () => expect(new instance(EMPTY,).joinToString(null, '<',),).toBe('<]',),)
                test("null",      () => expect(new instance(EMPTY,).joinToString(null, null,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("undefined", () => expect(new instance(EMPTY,).joinToString(null, undefined,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            },)
            describe("1 field", () => {
                test("something", () => expect(new instance(A,).joinToString(null, '<',),).toBe("<a]",),)
                test("null",      () => expect(new instance(A,).joinToString(null, null,),).toBe("[a]",),)
                test("undefined", () => expect(new instance(A,).joinToString(null, undefined,),).toBe("[a]",),)
            },)
            describe("2 fields", () => {
                test("something", () => expect(new instance(AB,).joinToString(null, '<',),).toBe("<a, b]",),)
                test("null",      () => expect(new instance(AB,).joinToString(null, null,),).toBe("[a, b]",),)
                test("undefined", () => expect(new instance(AB,).joinToString(null, undefined,),).toBe("[a, b]",),)
            },)
            describe("4 fields", () => {
                test("something", () => expect(new instance(ABCD,).joinToString(null, '<',),).toBe("<a, b, c, d]",),)
                test("null",      () => expect(new instance(ABCD,).joinToString(null, null,),).toBe("[a, b, c, d]",),)
                test("undefined", () => expect(new instance(ABCD,).joinToString(null, undefined,),).toBe("[a, b, c, d]",),)
            },)
        },)
        describe("postfix", () => {
            describe("empty", () => {
                test("something", () => expect(new instance(EMPTY,).joinToString(null, null, '>',),).toBe('[>',),)
                test("null",      () => expect(new instance(EMPTY,).joinToString(null, null, null,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("undefined", () => expect(new instance(EMPTY,).joinToString(null, null, undefined,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            },)
            describe("1 field", () => {
                test("something", () => expect(new instance(A,).joinToString(null, null, '>',),).toBe("[a>",),)
                test("null",      () => expect(new instance(A,).joinToString(null, null, null,),).toBe("[a]",),)
                test("undefined", () => expect(new instance(A,).joinToString(null, null, undefined,),).toBe("[a]",),)
            },)
            describe("2 fields", () => {
                test("something", () => expect(new instance(AB,).joinToString(null, null, '>',),).toBe("[a, b>",),)
                test("null",      () => expect(new instance(AB,).joinToString(null, null, null,),).toBe("[a, b]",),)
                test("undefined", () => expect(new instance(AB,).joinToString(null, null, undefined,),).toBe("[a, b]",),)
            },)
            describe("4 fields", () => {
                test("something", () => expect(new instance(ABCD,).joinToString(null, null, '>',),).toBe("[a, b, c, d>",),)
                test("null",      () => expect(new instance(ABCD,).joinToString(null, null, null,),).toBe("[a, b, c, d]",),)
                test("undefined", () => expect(new instance(ABCD,).joinToString(null, null, undefined,),).toBe("[a, b, c, d]",),)
            },)
        },)
        describe("limit", () => {
            describe("empty", () => {
                test("null",      () => expect(new instance(EMPTY,).joinToString(null, null, null, null,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("undefined", () => expect(new instance(EMPTY,).joinToString(null, null, null, undefined,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("NaN",       () => expect(new instance(EMPTY,).joinToString(null, null, null, NaN,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-∞",        () => expect(new instance(EMPTY,).joinToString(null, null, null, -Infinity,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("+∞",        () => expect(new instance(EMPTY,).joinToString(null, null, null, Infinity,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            },)
            describe("1 field", () => {
                test("null",      () => expect(new instance(A,).joinToString(null, null, null, null,),).toBe("[a]",),)
                test("undefined", () => expect(new instance(A,).joinToString(null, null, null, undefined,),).toBe("[a]",),)
                test("NaN",       () => expect(() => new instance(A,).joinToString(null, null, null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",        () => expect(new instance(A,).joinToString(null, null, null, -Infinity,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-500",      () => expect(new instance(A,).joinToString(null, null, null, -500,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-3",        () => expect(new instance(A,).joinToString(null, null, null, -3,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-2",        () => expect(new instance(A,).joinToString(null, null, null, -2,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-1",        () => expect(new instance(A,).joinToString(null, null, null, -1,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test('0',         () => expect(new instance(A,).joinToString(null, null, null, 0,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test('1',         () => expect(new instance(A,).joinToString(null, null, null, 1,),).toBe('[a]',),)
                test('2',         () => expect(new instance(A,).joinToString(null, null, null, 2,),).toBe('[a]',),)
                test("500",       () => expect(new instance(A,).joinToString(null, null, null, 500,),).toBe('[a]',),)
                test("+∞",        () => expect(new instance(A,).joinToString(null, null, null, Infinity,),).toBe('[a]',),)
            },)
            describe("2 fields", () => {
                test("null",      () => expect(new instance(AB,).joinToString(null, null, null, null,),).toBe("[a, b]",),)
                test("undefined", () => expect(new instance(AB,).joinToString(null, null, null, undefined,),).toBe("[a, b]",),)
                test("NaN",       () => expect(() => new instance(AB,).joinToString(null, null, null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",        () => expect(new instance(AB,).joinToString(null, null, null, -Infinity,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-500",      () => expect(new instance(AB,).joinToString(null, null, null, -500,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-4",        () => expect(new instance(AB,).joinToString(null, null, null, -4,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-3",        () => expect(new instance(AB,).joinToString(null, null, null, -3,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-2",        () => expect(new instance(AB,).joinToString(null, null, null, -2,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-1",        () => expect(new instance(AB,).joinToString(null, null, null, -1,),).toBe('[a, …]',),)
                test('0',         () => expect(new instance(AB,).joinToString(null, null, null, 0,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test('1',         () => expect(new instance(AB,).joinToString(null, null, null, 1,),).toBe('[a, …]',),)
                test('2',         () => expect(new instance(AB,).joinToString(null, null, null, 2,),).toBe('[a, b]',),)
                test('3',         () => expect(new instance(AB,).joinToString(null, null, null, 3,),).toBe("[a, b]",),)
                test("500",       () => expect(new instance(AB,).joinToString(null, null, null, 500,),).toBe("[a, b]",),)
                test("+∞",        () => expect(new instance(AB,).joinToString(null, null, null, Infinity,),).toBe("[a, b]",),)
            },)
            describe("4 fields", () => {
                test("null",      () => expect(new instance(ABCD,).joinToString(null, null, null, null,),).toBe("[a, b, c, d]",),)
                test("undefined", () => expect(new instance(ABCD,).joinToString(null, null, null, undefined,),).toBe("[a, b, c, d]",),)
                test("NaN",       () => expect(() => new instance(ABCD,).joinToString(null, null, null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",        () => expect(new instance(ABCD,).joinToString(null, null, null, -Infinity,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-6",        () => expect(new instance(ABCD,).joinToString(null, null, null, -6,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-500",      () => expect(new instance(ABCD,).joinToString(null, null, null, -500,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-5",        () => expect(new instance(ABCD,).joinToString(null, null, null, -5,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-4",        () => expect(new instance(ABCD,).joinToString(null, null, null, -4,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-3",        () => expect(new instance(ABCD,).joinToString(null, null, null, -3,),).toBe('[a, …]',),)
                test("-2",        () => expect(new instance(ABCD,).joinToString(null, null, null, -2,),).toBe('[a, b, …]',),)
                test("-1",        () => expect(new instance(ABCD,).joinToString(null, null, null, -1,),).toBe('[a, b, c, …]',),)
                test('0',         () => expect(new instance(ABCD,).joinToString(null, null, null, 0,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test('1',         () => expect(new instance(ABCD,).joinToString(null, null, null, 1,),).toBe('[a, …]',),)
                test('2',         () => expect(new instance(ABCD,).joinToString(null, null, null, 2,),).toBe('[a, b, …]',),)
                test('3',         () => expect(new instance(ABCD,).joinToString(null, null, null, 3,),).toBe('[a, b, c, …]',),)
                test('4',         () => expect(new instance(ABCD,).joinToString(null, null, null, 4,),).toBe('[a, b, c, d]',),)
                test('5',         () => expect(new instance(ABCD,).joinToString(null, null, null, 5,),).toBe("[a, b, c, d]",),)
                test("500",       () => expect(new instance(ABCD,).joinToString(null, null, null, 500,),).toBe("[a, b, c, d]",),)
                test("+∞",        () => expect(new instance(ABCD,).joinToString(null, null, null, Infinity,),).toBe("[a, b, c, d]",),)
            },)
        },)
        describe("truncated", () => {
            describe("empty", () => {
                test("something", () => expect(new instance(EMPTY,).joinToString(null, null, null, null, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("null",      () => expect(new instance(EMPTY,).joinToString(null, null, null, null, null,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("undefined", () => expect(new instance(EMPTY,).joinToString(null, null, null, null, undefined,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            },)
            describe("1 field", () => {
                test("something", () => expect(new instance(A,).joinToString(null, null, null, null, '‥',),).toBe("[a]",),)
                test("null",      () => expect(new instance(A,).joinToString(null, null, null, null, null,),).toBe("[a]",),)
                test("undefined", () => expect(new instance(A,).joinToString(null, null, null, null, undefined,),).toBe("[a]",),)
            },)
            describe("2 fields", () => {
                test("something", () => expect(new instance(AB,).joinToString(null, null, null, null, '‥',),).toBe("[a, b]",),)
                test("null",      () => expect(new instance(AB,).joinToString(null, null, null, null, null,),).toBe("[a, b]",),)
                test("undefined", () => expect(new instance(AB,).joinToString(null, null, null, null, undefined,),).toBe("[a, b]",),)
            },)
            describe("4 fields", () => {
                test("something", () => expect(new instance(ABCD,).joinToString(null, null, null, null, '‥',),).toBe("[a, b, c, d]",),)
                test("null",      () => expect(new instance(ABCD,).joinToString(null, null, null, null, null,),).toBe("[a, b, c, d]",),)
                test("undefined", () => expect(new instance(ABCD,).joinToString(null, null, null, null, undefined,),).toBe("[a, b, c, d]",),)
            },)
        },)
        describe("limit + truncated", () => {
            describe("empty", () => {
                test("null",      () => expect(new instance(EMPTY,).joinToString(null, null, null, NaN, null),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("undefined", () => expect(new instance(EMPTY,).joinToString(null, null, null, NaN, undefined,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("something", () => expect(new instance(EMPTY,).joinToString(null, null, null, NaN, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            },)
            describe("1 field", () => {
                test("null",      () => expect(new instance(A,).joinToString(null, null, null, null, '‥',),).toBe("[a]",),)
                test("undefined", () => expect(new instance(A,).joinToString(null, null, null, undefined, '‥',),).toBe("[a]",),)
                test("NaN",       () => expect(() => new instance(A,).joinToString(null, null, null, NaN, '‥',),).toThrow(ForbiddenIndexException,),)
                test("-∞",        () => expect(new instance(A,).joinToString(null, null, null, -Infinity, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-500",      () => expect(new instance(A,).joinToString(null, null, null, -500, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-3",        () => expect(new instance(A,).joinToString(null, null, null, -3, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-2",        () => expect(new instance(A,).joinToString(null, null, null, -2, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-1",        () => expect(new instance(A,).joinToString(null, null, null, -1, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test('0',         () => expect(new instance(A,).joinToString(null, null, null, 0, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test('1',         () => expect(new instance(A,).joinToString(null, null, null, 1, '‥',),).toBe('[a]',),)
                test('2',         () => expect(new instance(A,).joinToString(null, null, null, 2, '‥',),).toBe('[a]',),)
                test("500",       () => expect(new instance(A,).joinToString(null, null, null, 500, '‥',),).toBe('[a]',),)
                test("+∞",        () => expect(new instance(A,).joinToString(null, null, null, Infinity, '‥',),).toBe('[a]',),)
            },)
            describe("2 fields", () => {
                test("null",      () => expect(new instance(AB,).joinToString(null, null, null, null, '‥',),).toBe("[a, b]",),)
                test("undefined", () => expect(new instance(AB,).joinToString(null, null, null, undefined, '‥',),).toBe("[a, b]",),)
                test("NaN",       () => expect(() => new instance(AB,).joinToString(null, null, null, NaN, '‥',),).toThrow(ForbiddenIndexException,),)
                test("-∞",        () => expect(new instance(AB,).joinToString(null, null, null, -Infinity, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-500",      () => expect(new instance(AB,).joinToString(null, null, null, -500, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-4",        () => expect(new instance(AB,).joinToString(null, null, null, -4, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-3",        () => expect(new instance(AB,).joinToString(null, null, null, -3, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-2",        () => expect(new instance(AB,).joinToString(null, null, null, -2, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-1",        () => expect(new instance(AB,).joinToString(null, null, null, -1, '‥',),).toBe('[a, ‥]',),)
                test('0',         () => expect(new instance(AB,).joinToString(null, null, null, 0, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test('1',         () => expect(new instance(AB,).joinToString(null, null, null, 1, '‥',),).toBe('[a, ‥]',),)
                test('2',         () => expect(new instance(AB,).joinToString(null, null, null, 2, '‥',),).toBe('[a, b]',),)
                test('3',         () => expect(new instance(AB,).joinToString(null, null, null, 3, '‥',),).toBe('[a, b]',),)
                test("500",       () => expect(new instance(AB,).joinToString(null, null, null, 500, '‥',),).toBe('[a, b]',),)
                test("+∞",        () => expect(new instance(AB,).joinToString(null, null, null, Infinity, '‥',),).toBe('[a, b]',),)
            },)
            describe("4 fields", () => {
                test("null",      () => expect(new instance(ABCD,).joinToString(null, null, null, null, '‥',),).toBe("[a, b, c, d]",),)
                test("undefined", () => expect(new instance(ABCD,).joinToString(null, null, null, undefined, '‥',),).toBe("[a, b, c, d]",),)
                test("NaN",       () => expect(() => new instance(ABCD,).joinToString(null, null, null, NaN, '‥',),).toThrow(ForbiddenIndexException,),)
                test("-∞",        () => expect(new instance(ABCD,).joinToString(null, null, null, -Infinity, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-500",      () => expect(new instance(ABCD,).joinToString(null, null, null, -500, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-6",        () => expect(new instance(ABCD,).joinToString(null, null, null, -6, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-5",        () => expect(new instance(ABCD,).joinToString(null, null, null, -5, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-4",        () => expect(new instance(ABCD,).joinToString(null, null, null, -4, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("-3",        () => expect(new instance(ABCD,).joinToString(null, null, null, -3, '‥',),).toBe('[a, ‥]',),)
                test("-2",        () => expect(new instance(ABCD,).joinToString(null, null, null, -2, '‥',),).toBe('[a, b, ‥]',),)
                test("-1",        () => expect(new instance(ABCD,).joinToString(null, null, null, -1, '‥',),).toBe('[a, b, c, ‥]',),)
                test('0',         () => expect(new instance(ABCD,).joinToString(null, null, null, 0, '‥',),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test('1',         () => expect(new instance(ABCD,).joinToString(null, null, null, 1, '‥',),).toBe('[a, ‥]',),)
                test('2',         () => expect(new instance(ABCD,).joinToString(null, null, null, 2, '‥',),).toBe('[a, b, ‥]',),)
                test('3',         () => expect(new instance(ABCD,).joinToString(null, null, null, 3, '‥',),).toBe('[a, b, c, ‥]',),)
                test('4',         () => expect(new instance(ABCD,).joinToString(null, null, null, 4, '‥',),).toBe('[a, b, c, d]',),)
                test('5',         () => expect(new instance(ABCD,).joinToString(null, null, null, 5, '‥',),).toBe('[a, b, c, d]',),)
                test("500",       () => expect(new instance(ABCD,).joinToString(null, null, null, 500, '‥',),).toBe('[a, b, c, d]',),)
                test("+∞",        () => expect(new instance(ABCD,).joinToString(null, null, null, Infinity, '‥',),).toBe('[a, b, c, d]',),)
            },)
        },)
        describe("transform", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).joinToString(null, null, null, null, null, callbackToString0,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("1 argument",  () => expect(new instance(EMPTY,).joinToString(null, null, null, null, null, callbackToUpperString1,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("2 arguments", () => expect(new instance(EMPTY,).joinToString(null, null, null, null, null, callbackToUpperString2,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("null",        () => expect(new instance(EMPTY,).joinToString(null, null, null, null, null, null,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
                test("undefined",   () => expect(new instance(EMPTY,).joinToString(null, null, null, null, null, undefined,),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            },)
            describe("1 field", () => {
                test("0 arguments", () => expect(new instance(A,).joinToString(null, null, null, null, null, callbackToString0,),).toBe("[E]",),)
                test("1 argument",  () => expect(new instance(A,).joinToString(null, null, null, null, null, callbackToUpperString1,),).toBe("[A]",),)
                test("2 arguments", () => expect(new instance(A,).joinToString(null, null, null, null, null, callbackToUpperString2,),).toBe("[0:A]",),)
                test("null",        () => expect(new instance(A,).joinToString(null, null, null, null, null, null,),).toBe("[a]",),)
                test("undefined",   () => expect(new instance(A,).joinToString(null, null, null, null, null, undefined,),).toBe("[a]",),)
            },)
            describe("2 fields", () => {
                test("0 arguments", () => expect(new instance(AB,).joinToString(null, null, null, null, null, callbackToString0,),).toBe("[E, E]",),)
                test("1 argument",  () => expect(new instance(AB,).joinToString(null, null, null, null, null, callbackToUpperString1,),).toBe("[A, B]",),)
                test("2 arguments", () => expect(new instance(AB,).joinToString(null, null, null, null, null, callbackToUpperString2,),).toBe("[0:A, 1:B]",),)
                test("null",        () => expect(new instance(AB,).joinToString(null, null, null, null, null, null,),).toBe("[a, b]",),)
                test("undefined",   () => expect(new instance(AB,).joinToString(null, null, null, null, null, undefined,),).toBe("[a, b]",),)
            },)
            describe("4 fields", () => {
                test("0 arguments", () => expect(new instance(ABCD,).joinToString(null, null, null, null, null, callbackToString0,),).toBe("[E, E, E, E]",),)
                test("1 argument",  () => expect(new instance(ABCD,).joinToString(null, null, null, null, null, callbackToUpperString1,),).toBe("[A, B, C, D]",),)
                test("2 arguments", () => expect(new instance(ABCD,).joinToString(null, null, null, null, null, callbackToUpperString2,),).toBe("[0:A, 1:B, 2:C, 3:D]",),)
                test("null",        () => expect(new instance(ABCD,).joinToString(null, null, null, null, null, null,),).toBe("[a, b, c, d]",),)
                test("undefined",   () => expect(new instance(ABCD,).joinToString(null, null, null, null, null, undefined,),).toBe("[a, b, c, d]",),)
            },)
        },)
    },)

},)
