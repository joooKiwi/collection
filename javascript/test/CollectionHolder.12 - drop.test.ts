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

import {everyCollectionInstancesAndExtensionFunctionAsCollectionHolder}                                                                                                                                                                                                                                                                                                                             from "./value/instances"
import {expectToBeInstance}                                                                                                                                                                                                                                                                                                                                                                         from "./expect/expectToBeInstance"
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
import {EmptyCollectionHolderForTest}                                                                                                                                                                                                                                                                                                                                                               from "./instance/EmptyCollectionHolderForTest"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                                                                                                                                                                                                                                                                                          from "./value/callbacks (fail)"
import {callbackAsFalse0, callbackAsFalse1, callbackAsFalse2, callbackAsTrue0, callbackAsTrue1, callbackAsTrue2, falseCallbacks, trueCallbacks}                                                                                                                                                                                                                                                     from "./value/callbacks (boolean)"
import {callbackIsOver0, callbackIsOver0Alt, callbackIsOver1, callbackIsOver1Alt, callbackIsOver2, callbackIsOver2Alt, callbackIsOver3, callbackIsOver3Alt, callbackIsOver4, callbackIsOver4Alt, callbackIsUnder0, callbackIsUnder0Alt, callbackIsUnder1, callbackIsUnder1Alt, callbackIsUnder2, callbackIsUnder2Alt, callbackIsUnder3, callbackIsUnder3Alt, callbackIsUnder4, callbackIsUnder4Alt} from "./value/callbacks (number)"
import {callbackIsOverA, callbackIsOverAAlt, callbackIsOverB, callbackIsOverBAlt, callbackIsOverC, callbackIsOverCAlt, callbackIsOverD, callbackIsOverDAlt, callbackIsOverE, callbackIsOverEAlt, callbackIsUnderA, callbackIsUnderAAlt, callbackIsUnderB, callbackIsUnderBAlt, callbackIsUnderC, callbackIsUnderCAlt, callbackIsUnderD, callbackIsUnderDAlt, callbackIsUnderE, callbackIsUnderEAlt} from "./value/callbacks (string)"
import {A, AB, ABC, ABCD, B, BCD, CD, D, EMPTY}                                                                                                                                                                                                                                                                                                                                                     from "./value/arrays"

import {CollectionConstants}     from "../src/CollectionConstants"
import {ForbiddenIndexException} from "../src/exception/ForbiddenIndexException"

describe("CollectionHolderTest (drop)", () => {

    describe("EmptyCollectionHolder", () => {
        test("drop",                 () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.drop(),),)
        test("skip",                 () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.skip(),),)
        test("dropWhile",            () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.dropWhile(),),)
        test("skipWhile",            () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.skipWhile(),),)
        test("dropWhileIndexed",     () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.dropWhileIndexed(),),)
        test("skipWhileIndexed",     () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.skipWhileIndexed(),),)
        test("dropLast",             () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.dropLast(),),)
        test("skipLast",             () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.skipLast(),),)
        test("dropLastWhile",        () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.dropLastWhile(),),)
        test("skipLastWhile",        () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.skipLastWhile(),),)
        test("dropLastWhileIndexed", () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.dropLastWhileIndexed(),),)
        test("skipLastWhileIndexed", () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.skipLastWhileIndexed(),),)
    },)

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("skip",                 () => expect(new GenericCollectionHolder_DropAlias().execute(it => it.skip(0,),).amountOfCall,).toBe(1,),)
            test("skipWhile",            () => expect(new GenericCollectionHolder_DropWhileAlias().execute(it => it.skipWhile(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("skipWhileIndexed",     () => expect(new GenericCollectionHolder_DropWhileIndexedAlias().execute(it => it.skipWhileIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("skipLast",             () => expect(new GenericCollectionHolder_DropLastAlias().execute(it => it.skipLast(0,),).amountOfCall,).toBe(1,),)
            test("skipLastWhile",        () => expect(new GenericCollectionHolder_DropLastWhileAlias().execute(it => it.skipLastWhile(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new GenericCollectionHolder_DropLastWhileIndexedAlias().execute(it => it.skipLastWhileIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("skip",                 () => expect(new LazyGenericCollectionHolder_DropAlias().execute(it => it.skip(0,),).amountOfCall,).toBe(1,),)
            test("skipWhile",            () => expect(new LazyGenericCollectionHolder_DropWhileAlias().execute(it => it.skipWhile(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("skipWhileIndexed",     () => expect(new LazyGenericCollectionHolder_DropWhileIndexedAlias().execute(it => it.skipWhileIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("skipLast",             () => expect(new LazyGenericCollectionHolder_DropLastAlias().execute(it => it.skipLast(0,),).amountOfCall,).toBe(1,),)
            test("skipLastWhile",        () => expect(new LazyGenericCollectionHolder_DropLastWhileAlias().execute(it => it.skipLastWhile(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new LazyGenericCollectionHolder_DropLastWhileIndexedAlias().execute(it => it.skipLastWhileIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
        },)
    },)

    describe.each(everyCollectionInstancesAndExtensionFunctionAsCollectionHolder,)("%s", ({value: {instance, isExtension,},},) => {
        if (!isExtension)
            describe("get() being called", () => {
                describe("drop", () => {
                    describe("empty", () => {
                        test("NaN", () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.drop(NaN,),).amountOfCall,).toBe(0,),)
                        test("-∞",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.drop(-Infinity,),).amountOfCall,).toBe(0,),)
                        test("-1",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.drop(-1,),).amountOfCall,).toBe(0,),)
                        test('0',   () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.drop(0,),).amountOfCall,).toBe(0,),)
                        test('1',   () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.drop(1,),).amountOfCall,).toBe(0,),)
                        test("+∞",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.drop(Infinity,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("NaN", () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.drop(NaN,),),).amountOfCall,).toBe(1,),)
                        test("-∞",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.drop(-Infinity,),).amountOfCall,).toBe(1,),)
                        test("-2",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.drop(-1,),).amountOfCall,).toBe(1,),)
                        test("-1",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.drop(-1,),).amountOfCall,).toBe(1,),)
                        test('0',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.drop(0,),).amountOfCall,).toBe(1,),)
                        test('1',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.drop(1,),).amountOfCall,).toBe(0,),)
                        test('2',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.drop(2,),).amountOfCall,).toBe(0,),)
                        test("+∞",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.drop(Infinity,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("2 fields", () => {
                        test("NaN", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.drop(NaN,),),).amountOfCall,).toBe(2,),)
                        test("-∞",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.drop(-Infinity,),).amountOfCall,).toBe(2,),)
                        test("-3",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.drop(-3,),).amountOfCall,).toBe(2,),)
                        test("-2",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.drop(-2,),).amountOfCall,).toBe(2,),)
                        test("-1",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.drop(-1,),).amountOfCall,).toBe(1,),)
                        test('0',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.drop(0,),).amountOfCall,).toBe(2,),)
                        test('1',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.drop(1,),).amountOfCall,).toBe(1,),)
                        test('2',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.drop(2,),).amountOfCall,).toBe(0,),)
                        test('3',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.drop(3,),).amountOfCall,).toBe(0,),)
                        test("+∞",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.drop(Infinity,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("4 fields", () => {
                        test("NaN", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.drop(NaN,),),).amountOfCall,).toBe(4,),)
                        test("-∞",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(-Infinity,),).amountOfCall,).toBe(4,),)
                        test("-5",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(-5,),).amountOfCall,).toBe(4,),)
                        test("-4",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(-4,),).amountOfCall,).toBe(4,),)
                        test("-3",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(-3,),).amountOfCall,).toBe(3,),)
                        test("-2",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(-2,),).amountOfCall,).toBe(2,),)
                        test("-1",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(-1,),).amountOfCall,).toBe(1,),)
                        test('0',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(0,),).amountOfCall,).toBe(4,),)
                        test('1',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(1,),).amountOfCall,).toBe(3,),)
                        test('2',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(2,),).amountOfCall,).toBe(2,),)
                        test('3',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(3,),).amountOfCall,).toBe(1,),)
                        test('4',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(4,),).amountOfCall,).toBe(0,),)
                        test('5',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(5,),).amountOfCall,).toBe(0,),)
                        test("+∞",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(Infinity,),).amountOfCall,).toBe(0,),)
                    },)
                },)
                describe("dropWhile", () => {
                    test("true: 0 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue0,),).amountOfCall,).toBe(0,),)
                    test("true: 1 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue1,),).amountOfCall,).toBe(2,),)
                    test("true: 2 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue2,),).amountOfCall,).toBe(2,),)
                    test("false: 0 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
                    test("false: 1 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                    test("false: 2 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                },)
                describe("dropWhileIndexed", () => {
                    test("true: 0 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue0,),).amountOfCall,).toBe(0,),)
                    test("true: 1 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue1,),).amountOfCall,).toBe(0,),)
                    test("true: 2 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue2,),).amountOfCall,).toBe(2,),)
                    test("false: 0 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
                    test("false: 1 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                    test("false: 2 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                },)

                describe("dropLast", () => {
                    describe("empty", () => {
                        test("NaN", () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLast(NaN,),).amountOfCall,).toBe(0,),)
                        test("-∞",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLast(-Infinity,),).amountOfCall,).toBe(0,),)
                        test("-1",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLast(-1,),).amountOfCall,).toBe(0,),)
                        test('0',   () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLast(0,),).amountOfCall,).toBe(0,),)
                        test('1',   () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLast(1,),).amountOfCall,).toBe(0,),)
                        test("+∞",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLast(Infinity,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("NaN", () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.dropLast(NaN,),),).amountOfCall,).toBe(1,),)
                        test("-∞",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.dropLast(-Infinity,),).amountOfCall,).toBe(1,),)
                        test("-2",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.dropLast(-2,),).amountOfCall,).toBe(1,),)
                        test("-1",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.dropLast(-1,),).amountOfCall,).toBe(1,),)
                        test('0',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.dropLast(0,),).amountOfCall,).toBe(1,),)
                        test('1',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.dropLast(1,),).amountOfCall,).toBe(0,),)
                        test('2',   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.dropLast(2,),).amountOfCall,).toBe(0,),)
                        test("+∞",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.dropLast(Infinity,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("2 fields", () => {
                        test("NaN", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.dropLast(NaN,),),).amountOfCall,).toBe(2,),)
                        test("-∞",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(-Infinity,),).amountOfCall,).toBe(2,),)
                        test("-3",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(-3,),).amountOfCall,).toBe(2,),)
                        test("-2",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(-2,),).amountOfCall,).toBe(2,),)
                        test("-1",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(-1,),).amountOfCall,).toBe(1,),)
                        test('0',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(0,),).amountOfCall,).toBe(2,),)
                        test('1',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(1,),).amountOfCall,).toBe(1,),)
                        test('2',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(2,),).amountOfCall,).toBe(0,),)
                        test('3',   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(3,),).amountOfCall,).toBe(0,),)
                        test("+∞",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(Infinity,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("4 fields", () => {
                        test("NaN", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.executeWhileExpectingForbiddenException(it => it.dropLast(NaN,),),).amountOfCall,).toBe(4,),)
                        test("-∞",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(-Infinity,),).amountOfCall,).toBe(4,),)
                        test("-5",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(-5,),).amountOfCall,).toBe(4,),)
                        test("-4",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(-4,),).amountOfCall,).toBe(4,),)
                        test("-3",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(-3,),).amountOfCall,).toBe(3,),)
                        test("-2",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(-2,),).amountOfCall,).toBe(2,),)
                        test("-1",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(-1,),).amountOfCall,).toBe(1,),)
                        test('0',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(0,),).amountOfCall,).toBe(4,),)
                        test('1',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(1,),).amountOfCall,).toBe(3,),)
                        test('2',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(2,),).amountOfCall,).toBe(2,),)
                        test('3',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(3,),).amountOfCall,).toBe(1,),)
                        test('4',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(4,),).amountOfCall,).toBe(0,),)
                        test('5',   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(5,),).amountOfCall,).toBe(0,),)
                        test("+∞",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(Infinity,),).amountOfCall,).toBe(0,),)
                    },)
                },)
                describe("dropLastWhile", () => {
                    test("true: 0 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue0,),).amountOfCall,).toBe(0,),)
                    test("true: 1 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue1,),).amountOfCall,).toBe(2,),)
                    test("true: 2 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue2,),).amountOfCall,).toBe(2,),)
                    test("false: 0 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
                    test("false: 1 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                    test("false: 2 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                },)
                describe("dropLastWhileIndexed", () => {
                    test("true: 0 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue0,),).amountOfCall,).toBe(0,),)
                    test("true: 1 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue1,),).amountOfCall,).toBe(0,),)
                    test("true: 2 arguments",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue2,),).amountOfCall,).toBe(2,),)
                    test("false: 0 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
                    test("false: 1 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                    test("false: 2 arguments", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                },)
            },)

        describe("drop", () => {
            describe("empty", () => {
                test("NaN", () => expect(new instance(EMPTY,).drop(NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-∞",  () => expect(new instance(EMPTY,).drop(-Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-2",  () => expect(new instance(EMPTY,).drop(-2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-1",  () => expect(new instance(EMPTY,).drop(-1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('0',   () => expect(new instance(EMPTY,).drop(0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(EMPTY,).drop(1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('2',   () => expect(new instance(EMPTY,).drop(2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(new instance(EMPTY,).drop(Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("1 field", () => {
                test("NaN", () => expect(() => new instance(A,).drop(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(A,).drop(-Infinity,).toArray(),).toEqual(A,),)
                test("-2",  () => expect(new instance(A,).drop(-2,).toArray(),).toEqual(A,),)
                test("-1",  () => expect(new instance(A,).drop(-1,).toArray(),).toEqual(A,),)
                test('0',   () => expect(new instance(A,).drop(0,).toArray(),).toEqual(A,),)
                test('1',   () => expect(new instance(A,).drop(1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('2',   () => expect(new instance(A,).drop(2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(new instance(A,).drop(Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("2 fields", () => {
                test("NaN", () => expect(() => new instance(AB,).drop(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(AB,).drop(-Infinity,).toArray(),).toEqual(AB,),)
                test("-3",  () => expect(new instance(AB,).drop(-3,).toArray(),).toEqual(AB,),)
                test("-2",  () => expect(new instance(AB,).drop(-2,).toArray(),).toEqual(AB,),)
                test("-1",  () => expect(new instance(AB,).drop(-1,).toArray(),).toEqual(B,),)
                test('0',   () => expect(new instance(AB,).drop(0,).toArray(),).toEqual(AB,),)
                test('1',   () => expect(new instance(AB,).drop(1,).toArray(),).toEqual(B,),)
                test('2',   () => expect(new instance(AB,).drop(2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('3',   () => expect(new instance(AB,).drop(3,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(new instance(AB,).drop(Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("4 fields", () => {
                test("NaN", () => expect(() => new instance(ABCD,).drop(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(ABCD,).drop(-Infinity,).toArray(),).toEqual(ABCD,),)
                test("-5",  () => expect(new instance(ABCD,).drop(-5,).toArray(),).toEqual(ABCD,),)
                test("-4",  () => expect(new instance(ABCD,).drop(-4,).toArray(),).toEqual(ABCD,),)
                test("-3",  () => expect(new instance(ABCD,).drop(-3,).toArray(),).toEqual(BCD,),)
                test("-2",  () => expect(new instance(ABCD,).drop(-2,).toArray(),).toEqual(CD,),)
                test("-1",  () => expect(new instance(ABCD,).drop(-1,).toArray(),).toEqual(D,),)
                test('0',   () => expect(new instance(ABCD,).drop(0,).toArray(),).toEqual(ABCD,),)
                test('1',   () => expect(new instance(ABCD,).drop(1,).toArray(),).toEqual(BCD,),)
                test('2',   () => expect(new instance(ABCD,).drop(2,).toArray(),).toEqual(CD,),)
                test('3',   () => expect(new instance(ABCD,).drop(3,).toArray(),).toEqual(D,),)
                test('4',   () => expect(new instance(ABCD,).drop(4,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('5',   () => expect(new instance(ABCD,).drop(5,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(new instance(ABCD,).drop(Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
        },)
        describe("dropWhile", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).dropWhile(callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("1 argument",  () => expect(new instance(EMPTY,).dropWhile(callbackAsFail1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("2 arguments", () => expect(new instance(EMPTY,).dropWhile(callbackAsFail2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).dropWhile(it,),).toBeEmpty(),)
                    test("2 fields", () => expect(new instance(AB,).dropWhile(it,),).toBeEmpty(),)
                    test("4 fields", () => expect(new instance(ABCD,).dropWhile(it,),).toBeEmpty(),)
                },)
                describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).dropWhile(it,).toArray(),).toEqual(A,),)
                    test("2 fields", () => expect(new instance(AB,).dropWhile(it,).toArray(),).toEqual(AB,),)
                    test("4 fields", () => expect(new instance(ABCD,).dropWhile(it,).toArray(),).toEqual(ABCD,),)
                },)
            },)
            describe("1 field", () => {
                test('a', () => expect(new instance(A,).dropWhile(callbackIsUnderA,).toArray(),).toEqual(A,),)
                test('e', () => expect(new instance(A,).dropWhile(callbackIsUnderE,),).toBeEmpty(),)
                test('0', () => expect(new instance(A,).dropWhile(callbackIsUnder0Alt,).toArray(),).toEqual(A,),)
                test('4', () => expect(new instance(A,).dropWhile(callbackIsUnder4Alt,),).toBeEmpty(),)
            },)
            describe("2 fields", () => {
                test('a', () => expect(new instance(AB,).dropWhile(callbackIsUnderA,).toArray(),).toEqual(AB,),)
                test('b', () => expect(new instance(AB,).dropWhile(callbackIsUnderB,).toArray(),).toEqual(B,),)
                test('e', () => expect(new instance(AB,).dropWhile(callbackIsUnderE,),).toBeEmpty(),)
                test('0', () => expect(new instance(AB,).dropWhile(callbackIsUnder0Alt,).toArray(),).toEqual(AB,),)
                test('1', () => expect(new instance(AB,).dropWhile(callbackIsUnder1Alt,).toArray(),).toEqual(B,),)
                test('4', () => expect(new instance(AB,).dropWhile(callbackIsUnder4Alt,),).toBeEmpty(),)
            },)
            describe("4 fields", () => {
                test('a', () => expect(new instance(ABCD,).dropWhile(callbackIsUnderA,).toArray(),).toEqual(ABCD,),)
                test('b', () => expect(new instance(ABCD,).dropWhile(callbackIsUnderB,).toArray(),).toEqual(BCD,),)
                test('c', () => expect(new instance(ABCD,).dropWhile(callbackIsUnderC,).toArray(),).toEqual(CD,),)
                test('d', () => expect(new instance(ABCD,).dropWhile(callbackIsUnderD,).toArray(),).toEqual(D,),)
                test('e', () => expect(new instance(ABCD,).dropWhile(callbackIsUnderE,),).toBeEmpty(),)
                test('0', () => expect(new instance(ABCD,).dropWhile(callbackIsUnder0Alt,).toArray(),).toEqual(ABCD,),)
                test('1', () => expect(new instance(ABCD,).dropWhile(callbackIsUnder1Alt,).toArray(),).toEqual(BCD,),)
                test('2', () => expect(new instance(ABCD,).dropWhile(callbackIsUnder2Alt,).toArray(),).toEqual(CD,),)
                test('3', () => expect(new instance(ABCD,).dropWhile(callbackIsUnder3Alt,).toArray(),).toEqual(D,),)
                test('4', () => expect(new instance(ABCD,).dropWhile(callbackIsUnder4Alt,),).toBeEmpty(),)
            },)
        },)
        describe("dropWhileIndexed", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).dropWhileIndexed(callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("1 argument",  () => expect(new instance(EMPTY,).dropWhileIndexed(callbackAsFail1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("2 arguments", () => expect(new instance(EMPTY,).dropWhileIndexed(callbackAsFail2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).dropWhileIndexed(it,),).toBeEmpty(),)
                    test("2 fields", () => expect(new instance(AB,).dropWhileIndexed(it,),).toBeEmpty(),)
                    test("4 fields", () => expect(new instance(ABCD,).dropWhileIndexed(it,),).toBeEmpty(),)
                },)
                describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).dropWhileIndexed(it,).toArray(),).toEqual(A,),)
                    test("2 fields", () => expect(new instance(AB,).dropWhileIndexed(it,).toArray(),).toEqual(AB,),)
                    test("4 fields", () => expect(new instance(ABCD,).dropWhileIndexed(it,).toArray(),).toEqual(ABCD,),)
                },)
            },)
            describe("1 field", () => {
                test('a', () => expect(new instance(A,).dropWhileIndexed(callbackIsUnderAAlt,).toArray(),).toEqual(A,),)
                test('e', () => expect(new instance(A,).dropWhileIndexed(callbackIsUnderEAlt,),).toBeEmpty(),)
                test('0', () => expect(new instance(A,).dropWhileIndexed(callbackIsUnder0,).toArray(),).toEqual(A,),)
                test('4', () => expect(new instance(A,).dropWhileIndexed(callbackIsUnder4,),).toBeEmpty(),)
            },)
            describe("2 fields", () => {
                test('a', () => expect(new instance(AB,).dropWhileIndexed(callbackIsUnderAAlt,).toArray(),).toEqual(AB,),)
                test('b', () => expect(new instance(AB,).dropWhileIndexed(callbackIsUnderBAlt,).toArray(),).toEqual(B,),)
                test('e', () => expect(new instance(AB,).dropWhileIndexed(callbackIsUnderEAlt,),).toBeEmpty(),)
                test('0', () => expect(new instance(AB,).dropWhileIndexed(callbackIsUnder0,).toArray(),).toEqual(AB,),)
                test('1', () => expect(new instance(AB,).dropWhileIndexed(callbackIsUnder1,).toArray(),).toEqual(B,),)
                test('4', () => expect(new instance(AB,).dropWhileIndexed(callbackIsUnder4,),).toBeEmpty(),)
            },)
            describe("4 fields", () => {
                test('a', () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnderAAlt,).toArray(),).toEqual(ABCD,),)
                test('b', () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnderBAlt,).toArray(),).toEqual(BCD,),)
                test('c', () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnderCAlt,).toArray(),).toEqual(CD,),)
                test('d', () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnderDAlt,).toArray(),).toEqual(D,),)
                test('e', () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnderEAlt,),).toBeEmpty(),)
                test('0', () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnder0,).toArray(),).toEqual(ABCD,),)
                test('1', () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnder1,).toArray(),).toEqual(BCD,),)
                test('2', () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnder2,).toArray(),).toEqual(CD,),)
                test('3', () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnder3,).toArray(),).toEqual(D,),)
                test('4', () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnder4,),).toBeEmpty(),)
            },)
        },)

        describe("dropLast", () => {
            describe("empty", () => {
                test("NaN", () => expect(new instance(EMPTY,).dropLast(NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-∞",  () => expect(new instance(EMPTY,).dropLast(-Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-2",  () => expect(new instance(EMPTY,).dropLast(-2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("-1",  () => expect(new instance(EMPTY,).dropLast(-1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('0',   () => expect(new instance(EMPTY,).dropLast(0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('1',   () => expect(new instance(EMPTY,).dropLast(1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('2',   () => expect(new instance(EMPTY,).dropLast(2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(new instance(EMPTY,).dropLast(Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("1 field", () => {
                test("NaN", () => expect(() => new instance(A,).dropLast(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(A,).dropLast(-Infinity,).toArray(),).toEqual(A,),)
                test("-3",  () => expect(new instance(A,).dropLast(-3,).toArray(),).toEqual(A,),)
                test("-2",  () => expect(new instance(A,).dropLast(-2,).toArray(),).toEqual(A,),)
                test("-1",  () => expect(new instance(A,).dropLast(-1,).toArray(),).toEqual(A,),)
                test('0',   () => expect(new instance(A,).dropLast(0,).toArray(),).toEqual(A,),)
                test('1',   () => expect(new instance(A,).dropLast(1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('2',   () => expect(new instance(A,).dropLast(2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('3',   () => expect(new instance(A,).dropLast(3,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(new instance(A,).dropLast(Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("2 fields", () => {
                test("NaN", () => expect(() => new instance(AB,).dropLast(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(AB,).dropLast(-Infinity,).toArray(),).toEqual(AB,),)
                test("-4",  () => expect(new instance(AB,).dropLast(-4,).toArray(),).toEqual(AB,),)
                test("-3",  () => expect(new instance(AB,).dropLast(-3,).toArray(),).toEqual(AB,),)
                test("-2",  () => expect(new instance(AB,).dropLast(-2,).toArray(),).toEqual(AB,),)
                test("-1",  () => expect(new instance(AB,).dropLast(-1,).toArray(),).toEqual(A,),)
                test('0',   () => expect(new instance(AB,).dropLast(0,).toArray(),).toEqual(AB,),)
                test('1',   () => expect(new instance(AB,).dropLast(1,).toArray(),).toEqual(A,),)
                test('2',   () => expect(new instance(AB,).dropLast(2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('3',   () => expect(new instance(AB,).dropLast(3,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('4',   () => expect(new instance(AB,).dropLast(4,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(new instance(AB,).dropLast(Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("4 fields", () => {
                test("NaN", () => expect(() => new instance(ABCD,).dropLast(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(ABCD,).dropLast(-Infinity,).toArray(),).toEqual(ABCD,),)
                test("-6",  () => expect(new instance(ABCD,).dropLast(-6,).toArray(),).toEqual(ABCD,),)
                test("-5",  () => expect(new instance(ABCD,).dropLast(-5,).toArray(),).toEqual(ABCD,),)
                test("-4",  () => expect(new instance(ABCD,).dropLast(-4,).toArray(),).toEqual(ABCD,),)
                test("-3",  () => expect(new instance(ABCD,).dropLast(-3,).toArray(),).toEqual(ABC,),)
                test("-2",  () => expect(new instance(ABCD,).dropLast(-2,).toArray(),).toEqual(AB,),)
                test("-1",  () => expect(new instance(ABCD,).dropLast(-1,).toArray(),).toEqual(A,),)
                test('0',   () => expect(new instance(ABCD,).dropLast(0,).toArray(),).toEqual(ABCD,),)
                test('1',   () => expect(new instance(ABCD,).dropLast(1,).toArray(),).toEqual(ABC,),)
                test('2',   () => expect(new instance(ABCD,).dropLast(2,).toArray(),).toEqual(AB,),)
                test('3',   () => expect(new instance(ABCD,).dropLast(3,).toArray(),).toEqual(A,),)
                test('4',   () => expect(new instance(ABCD,).dropLast(4,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('5',   () => expect(new instance(ABCD,).dropLast(5,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test('6',   () => expect(new instance(ABCD,).dropLast(6,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("+∞",  () => expect(new instance(ABCD,).dropLast(Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
        },)
        describe("dropLastWhile", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).dropLastWhile(callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("1 argument",  () => expect(new instance(EMPTY,).dropLastWhile(callbackAsFail1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("2 arguments", () => expect(new instance(EMPTY,).dropLastWhile(callbackAsFail2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).dropLastWhile(it,),).toBeEmpty(),)
                    test("2 fields", () => expect(new instance(AB,).dropLastWhile(it,),).toBeEmpty(),)
                    test("4 fields", () => expect(new instance(ABCD,).dropLastWhile(it,),).toBeEmpty(),)
                },)
                describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).dropLastWhile(it,).toArray(),).toEqual(A,),)
                    test("2 fields", () => expect(new instance(AB,).dropLastWhile(it,).toArray(),).toEqual(AB,),)
                    test("4 fields", () => expect(new instance(ABCD,).dropLastWhile(it,).toArray(),).toEqual(ABCD,),)
                },)
            },)
            describe("1 field", () => {
                test('a', () => expect(new instance(A,).dropLastWhile(callbackIsOverA,).toArray(),).toEqual(A,),)
                test('e', () => expect(new instance(A,).dropLastWhile(callbackIsOverE,).toArray(),).toEqual(A,),)
                test('0', () => expect(new instance(A,).dropLastWhile(callbackIsOver0Alt,).toArray(),).toEqual(A,),)
                test('4', () => expect(new instance(A,).dropLastWhile(callbackIsOver4Alt,).toArray(),).toEqual(A,),)
            },)
            describe("2 fields", () => {
                test('a', () => expect(new instance(AB,).dropLastWhile(callbackIsOverA,).toArray(),).toEqual(A,),)
                test('b', () => expect(new instance(AB,).dropLastWhile(callbackIsOverB,).toArray(),).toEqual(AB,),)
                test('e', () => expect(new instance(AB,).dropLastWhile(callbackIsOverE,).toArray(),).toEqual(AB,),)
                test('0', () => expect(new instance(AB,).dropLastWhile(callbackIsOver0Alt,).toArray(),).toEqual(A,),)
                test('1', () => expect(new instance(AB,).dropLastWhile(callbackIsOver1Alt,).toArray(),).toEqual(AB,),)
                test('4', () => expect(new instance(AB,).dropLastWhile(callbackIsOver4Alt,).toArray(),).toEqual(AB,),)
            },)
            describe("4 fields", () => {
                test('a', () => expect(new instance(ABCD,).dropLastWhile(callbackIsOverA,).toArray(),).toEqual(A,),)
                test('b', () => expect(new instance(ABCD,).dropLastWhile(callbackIsOverB,).toArray(),).toEqual(AB,),)
                test('c', () => expect(new instance(ABCD,).dropLastWhile(callbackIsOverC,).toArray(),).toEqual(ABC,),)
                test('d', () => expect(new instance(ABCD,).dropLastWhile(callbackIsOverD,).toArray(),).toEqual(ABCD,),)
                test('e', () => expect(new instance(ABCD,).dropLastWhile(callbackIsOverE,).toArray(),).toEqual(ABCD,),)
                test('0', () => expect(new instance(ABCD,).dropLastWhile(callbackIsOver0Alt,).toArray(),).toEqual(A,),)
                test('1', () => expect(new instance(ABCD,).dropLastWhile(callbackIsOver1Alt,).toArray(),).toEqual(AB,),)
                test('2', () => expect(new instance(ABCD,).dropLastWhile(callbackIsOver2Alt,).toArray(),).toEqual(ABC,),)
                test('3', () => expect(new instance(ABCD,).dropLastWhile(callbackIsOver3Alt,).toArray(),).toEqual(ABCD,),)
                test('4', () => expect(new instance(ABCD,).dropLastWhile(callbackIsOver4Alt,).toArray(),).toEqual(ABCD,),)
            },)
        },)
        describe("dropLastWhileIndexed", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).dropLastWhileIndexed(callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("1 argument",  () => expect(new instance(EMPTY,).dropLastWhileIndexed(callbackAsFail1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("2 arguments", () => expect(new instance(EMPTY,).dropLastWhileIndexed(callbackAsFail2,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).dropLastWhileIndexed(it,),).toBeEmpty(),)
                    test("2 fields", () => expect(new instance(AB,).dropLastWhileIndexed(it,),).toBeEmpty(),)
                    test("4 fields", () => expect(new instance(ABCD,).dropLastWhileIndexed(it,),).toBeEmpty(),)
                },)
                describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).dropLastWhileIndexed(it,).toArray(),).toEqual(A,),)
                    test("2 fields", () => expect(new instance(AB,).dropLastWhileIndexed(it,).toArray(),).toEqual(AB,),)
                    test("4 fields", () => expect(new instance(ABCD,).dropLastWhileIndexed(it,).toArray(),).toEqual(ABCD,),)
                },)
            },)
            describe("1 field", () => {
                test('a', () => expect(new instance(A,).dropLastWhileIndexed(callbackIsOverAAlt,).toArray(),).toEqual(A,),)
                test('e', () => expect(new instance(A,).dropLastWhileIndexed(callbackIsOverEAlt,).toArray(),).toEqual(A,),)
                test('0', () => expect(new instance(A,).dropLastWhileIndexed(callbackIsOver0,).toArray(),).toEqual(A,),)
                test('4', () => expect(new instance(A,).dropLastWhileIndexed(callbackIsOver4,).toArray(),).toEqual(A,),)
            },)
            describe("2 fields", () => {
                test('a', () => expect(new instance(AB,).dropLastWhileIndexed(callbackIsOverAAlt,).toArray(),).toEqual(A,),)
                test('b', () => expect(new instance(AB,).dropLastWhileIndexed(callbackIsOverBAlt,).toArray(),).toEqual(AB,),)
                test('e', () => expect(new instance(AB,).dropLastWhileIndexed(callbackIsOverEAlt,).toArray(),).toEqual(AB,),)
                test('0', () => expect(new instance(AB,).dropLastWhileIndexed(callbackIsOver0,).toArray(),).toEqual(A,),)
                test('1', () => expect(new instance(AB,).dropLastWhileIndexed(callbackIsOver1,).toArray(),).toEqual(AB,),)
                test('4', () => expect(new instance(AB,).dropLastWhileIndexed(callbackIsOver4,).toArray(),).toEqual(AB,),)
            },)
            describe("4 fields", () => {
                test('a', () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOverAAlt,).toArray(),).toEqual(A,),)
                test('b', () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOverBAlt,).toArray(),).toEqual(AB,),)
                test('c', () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOverCAlt,).toArray(),).toEqual(ABC,),)
                test('d', () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOverDAlt,).toArray(),).toEqual(ABCD,),)
                test('e', () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOverEAlt,).toArray(),).toEqual(ABCD,),)
                test('0', () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOver0,).toArray(),).toEqual(A,),)
                test('1', () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOver1,).toArray(),).toEqual(AB,),)
                test('2', () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOver2,).toArray(),).toEqual(ABC,),)
                test('3', () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOver3,).toArray(),).toEqual(ABCD,),)
                test('4', () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOver4,).toArray(),).toEqual(ABCD,),)
            },)
        },)
    },)

},)
