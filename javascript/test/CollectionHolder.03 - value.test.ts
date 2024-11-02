/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {EmptyCollectionHolderForTest}                                   from "./instance/EmptyCollectionHolderForTest"
import {GenericCollectionHolder_GetAlias}                               from "./instance/GenericCollectionHolder_GetAlias"
import {GenericCollectionHolder_GetFirstAlias}                          from "./instance/GenericCollectionHolder_GetFirstAlias"
import {GenericCollectionHolder_GetFirstOrNullAlias}                    from "./instance/GenericCollectionHolder_GetFirstOrNullAlias"
import {GenericCollectionHolder_GetLastAlias}                           from "./instance/GenericCollectionHolder_GetLastAlias"
import {GenericCollectionHolder_GetLastOrNullAlias}                     from "./instance/GenericCollectionHolder_GetLastOrNullAlias"
import {GenericCollectionHolder_GetOrElseAlias}                         from "./instance/GenericCollectionHolder_GetOrElseAlias"
import {GenericCollectionHolder_GetOrNullAlias}                         from "./instance/GenericCollectionHolder_GetOrNullAlias"
import {LazyGenericCollectionHolder_GetAlias}                           from "./instance/LazyGenericCollectionHolder_GetAlias"
import {LazyGenericCollectionHolder_GetFirstAlias}                      from "./instance/LazyGenericCollectionHolder_GetFirstAlias"
import {LazyGenericCollectionHolder_GetFirstOrNullAlias}                from "./instance/LazyGenericCollectionHolder_GetFirstOrNullAlias"
import {LazyGenericCollectionHolder_GetLastAlias}                       from "./instance/LazyGenericCollectionHolder_GetLastAlias"
import {LazyGenericCollectionHolder_GetLastOrNullAlias}                 from "./instance/LazyGenericCollectionHolder_GetLastOrNullAlias"
import {LazyGenericCollectionHolder_GetOrElseAlias}                     from "./instance/LazyGenericCollectionHolder_GetOrElseAlias"
import {LazyGenericCollectionHolder_GetOrNullAlias}                     from "./instance/LazyGenericCollectionHolder_GetOrNullAlias"
import {A, AB, ABCD, EMPTY}                                             from "./value/arrays"
import {callbackAsFail0}                                                from "./value/callbacks (fail)"
import {callbackAsNull0}                                                from "./value/callbacks (null)"
import {everyCollectionInstancesAndExtensionFunctionAsCollectionHolder} from "./value/instances"

import {EmptyCollectionException}  from "../src/exception/EmptyCollectionException"
import {ForbiddenIndexException}   from "../src/exception/ForbiddenIndexException"
import {IndexOutOfBoundsException} from "../src/exception/IndexOutOfBoundsException"

describe("CollectionHolderTest (value)", () => {
    //#region -------------------- Callbacks --------------------

    const value = Symbol()
    const callback = () => value

    //#endregion -------------------- Callbacks --------------------

    describe("EmptyCollectionHolder", () => {
        test("get",                 () => expect(() => new EmptyCollectionHolderForTest().get(),).toThrow(EmptyCollectionException,),)
        test("getFirst",            () => expect(() => new EmptyCollectionHolderForTest().getFirst(),).toThrow(EmptyCollectionException,),)
        test("first",               () => expect(() => new EmptyCollectionHolderForTest().first(),).toThrow(EmptyCollectionException,),)
        test("firstIndexed",        () => expect(() => new EmptyCollectionHolderForTest().firstIndexed(),).toThrow(EmptyCollectionException,),)
        test("getLast",             () => expect(() => new EmptyCollectionHolderForTest().getLast(),).toThrow(EmptyCollectionException,),)
        test("last",                () => expect(() => new EmptyCollectionHolderForTest().last(),).toThrow(EmptyCollectionException,),)
        test("lastIndexed",         () => expect(() => new EmptyCollectionHolderForTest().lastIndexed(),).toThrow(EmptyCollectionException,),)
        test("at",                  () => expect(() => new EmptyCollectionHolderForTest().at(),).toThrow(EmptyCollectionException,),)
        test("elementAt",           () => expect(() => new EmptyCollectionHolderForTest().elementAt(),).toThrow(EmptyCollectionException,),)
        test("getOrElse",           () => expect(new EmptyCollectionHolderForTest().getOrElse(NaN, it => it,),).toBeNaN(),)
        test("atOrElse",            () => expect(new EmptyCollectionHolderForTest().atOrElse(NaN, it => it,),).toBeNaN(),)
        test("elementAtOrElse",     () => expect(new EmptyCollectionHolderForTest().elementAtOrElse(NaN, it => it,),).toBeNaN(),)
        test("getOrNull",           () => expect(new EmptyCollectionHolderForTest().getOrNull(),).toBeNull(),)
        test("getFirstOrNull",      () => expect(new EmptyCollectionHolderForTest().getFirstOrNull(),).toBeNull(),)
        test("firstOrNull",         () => expect(new EmptyCollectionHolderForTest().firstOrNull(),).toBeNull(),)
        test("firstIndexedOrNull",  () => expect(new EmptyCollectionHolderForTest().firstIndexedOrNull(),).toBeNull(),)
        test("getLastOrNull",       () => expect(new EmptyCollectionHolderForTest().getLastOrNull(),).toBeNull(),)
        test("lastOrNull",          () => expect(new EmptyCollectionHolderForTest().lastOrNull(),).toBeNull(),)
        test("lastIndexedOrNull",   () => expect(new EmptyCollectionHolderForTest().lastIndexedOrNull(),).toBeNull(),)
        test("atOrNull",            () => expect(new EmptyCollectionHolderForTest().atOrNull(),).toBeNull(),)
        test("elementAtOrNull",     () => expect(new EmptyCollectionHolderForTest().elementAtOrNull(),).toBeNull(),)
    },)

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("first",              () => expect(new GenericCollectionHolder_GetFirstAlias().execute(it => it.first(),).amountOfCall,).toBe(1,),)
            test("firstOrNull",        () => expect(new GenericCollectionHolder_GetFirstOrNullAlias().execute(it => it.firstOrNull(),).amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new GenericCollectionHolder_GetFirstAlias().execute(it => it.firstIndexed(),).amountOfCall,).toBe(1,),)
            test("firstIndexedOrNull", () => expect(new GenericCollectionHolder_GetFirstOrNullAlias().execute(it => it.firstIndexedOrNull(),).amountOfCall,).toBe(1,),)
            test("last",               () => expect(new GenericCollectionHolder_GetLastAlias().execute(it => it.last(),).amountOfCall,).toBe(1,),)
            test("lastOrNull",         () => expect(new GenericCollectionHolder_GetLastOrNullAlias().execute(it => it.lastOrNull(),).amountOfCall,).toBe(1,),)
            test("lastIndexed",        () => expect(new GenericCollectionHolder_GetLastAlias().execute(it => it.lastIndexed(),).amountOfCall,).toBe(1,),)
            test("lastOrNull",         () => expect(new GenericCollectionHolder_GetLastOrNullAlias().execute(it => it.lastIndexedOrNull(),).amountOfCall,).toBe(1,),)
            test("at",                 () => expect(new GenericCollectionHolder_GetAlias().execute(it => it.at(2,),).amountOfCall,).toBe(1,),)
            test("atOrElse",           () => expect(new GenericCollectionHolder_GetOrElseAlias().execute(it => it.atOrElse(NaN, callbackAsNull0,),).amountOfCall,).toBe(1,),)
            test("atOrNull",           () => expect(new GenericCollectionHolder_GetOrNullAlias().execute(it => it.atOrNull(NaN,),).amountOfCall,).toBe(1,),)
            test("elementAt",          () => expect(new GenericCollectionHolder_GetAlias().execute(it => it.elementAt(2,),).amountOfCall,).toBe(1,),)
            test("elementAtOrElse",    () => expect(new GenericCollectionHolder_GetOrElseAlias().execute(it => it.elementAtOrElse(NaN, callbackAsNull0,),).amountOfCall,).toBe(1,),)
            test("elementAtOrNull",    () => expect(new GenericCollectionHolder_GetOrNullAlias().execute(it => it.elementAtOrNull(NaN,),).amountOfCall,).toBe(1,),)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("first",              () => expect(new LazyGenericCollectionHolder_GetFirstAlias().execute(it => it.first(),).amountOfCall,).toBe(1,),)
            test("firstOrNull",        () => expect(new LazyGenericCollectionHolder_GetFirstOrNullAlias().execute(it => it.firstOrNull(),).amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new LazyGenericCollectionHolder_GetFirstAlias().execute(it => it.firstIndexed(),).amountOfCall,).toBe(1,),)
            test("firstIndexedOrNull", () => expect(new LazyGenericCollectionHolder_GetFirstOrNullAlias().execute(it => it.firstIndexedOrNull(),).amountOfCall,).toBe(1,),)
            test("last",               () => expect(new LazyGenericCollectionHolder_GetLastAlias().execute(it => it.last(),).amountOfCall,).toBe(1,),)
            test("lastOrNull",         () => expect(new LazyGenericCollectionHolder_GetLastOrNullAlias().execute(it => it.lastOrNull(),).amountOfCall,).toBe(1,),)
            test("lastIndexed",        () => expect(new LazyGenericCollectionHolder_GetLastAlias().execute(it => it.lastIndexed(),).amountOfCall,).toBe(1,),)
            test("lastOrNull",         () => expect(new LazyGenericCollectionHolder_GetLastOrNullAlias().execute(it => it.lastIndexedOrNull(),).amountOfCall,).toBe(1,),)
            test("at",                 () => expect(new LazyGenericCollectionHolder_GetAlias().execute(it => it.at(2,),).amountOfCall,).toBe(1,),)
            test("atOrElse",           () => expect(new LazyGenericCollectionHolder_GetOrElseAlias().execute(it => it.atOrElse(NaN, callbackAsNull0,),).amountOfCall,).toBe(1,),)
            test("atOrNull",           () => expect(new LazyGenericCollectionHolder_GetOrNullAlias().execute(it => it.atOrNull(NaN,),).amountOfCall,).toBe(1,),)
            test("elementAt",          () => expect(new LazyGenericCollectionHolder_GetAlias().execute(it => it.elementAt(2,),).amountOfCall,).toBe(1,),)
            test("elementAtOrElse",    () => expect(new LazyGenericCollectionHolder_GetOrElseAlias().execute(it => it.elementAtOrElse(NaN, callbackAsNull0,),).amountOfCall,).toBe(1,),)
            test("elementAtOrNull",    () => expect(new LazyGenericCollectionHolder_GetOrNullAlias().execute(it => it.elementAtOrNull(NaN,),).amountOfCall,).toBe(1,),)
        },)
    },)

    describe.each(everyCollectionInstancesAndExtensionFunctionAsCollectionHolder,)("%s", ({value: {instance, isMinimalist, isExtension, type,},},) => {
        /** The instance is a {@link GenericCollectionHolder} */
        const isNormal = type === "normal"
        if (!isExtension)
            describe("get() being called", () => {
                describe("get", () => {
                    test("empty",    () => expect(new instance(EMPTY,).executeWhileExpectingEmptyException(it => it.get(0,),).amountOfCall,).toBe(isNormal ? 0 : 1,),)
                    test("1 field",  () => expect(new instance(A,).execute(it => it.get(0,),).amountOfCall,).toBe(1,),)
                    test("2 fields", () => expect(new instance(AB,).execute(it => it.get(0,),).amountOfCall,).toBe(1,),)
                    test("4 fields", () => expect(new instance(ABCD,).execute(it => it.get(0,),).amountOfCall,).toBe(1,),)
                },)
                describe("getFirst", () => {
                    test("empty",    () => expect(() => new instance(EMPTY,).getFirst(),).toThrow(EmptyCollectionException,),)
                    test("1 field",  () => expect(new instance(A,).getFirst(),).toBe('a',),)
                    test("2 fields", () => expect(new instance(AB,).getFirst(),).toBe('a',),)
                    test("4 fields", () => expect(new instance(ABCD,).getFirst(),).toBe('a',),)
                },)
                describe("getLast", () => {
                    test("empty",    () => expect(() => new instance(EMPTY,).getLast(),).toThrow(EmptyCollectionException,),)
                    test("1 field",  () => expect(new instance(A,).getLast(),).toBe('a',),)
                    test("2 fields", () => expect(new instance(AB,).getLast(),).toBe('b',),)
                    test("4 fields", () => expect(new instance(ABCD,).getLast(),).toBe('d',),)
                },)

                describe("getOrElse", () => {
                    test("empty",    () => expect(new instance(EMPTY,).execute(it => it.getOrElse(0, callback,),).amountOfCall,).toBe(0,),)
                    test("1 field",  () => expect(new instance(A,).execute(it => it.getOrElse(0, callbackAsFail0,),).amountOfCall,).toBe(isMinimalist || isNormal ? 1 : 0,),)
                    test("2 fields", () => expect(new instance(AB,).execute(it => it.getOrElse(0, callbackAsFail0,),).amountOfCall,).toBe(isMinimalist || isNormal ? 1 : 0,),)
                    test("4 fields", () => expect(new instance(ABCD,).execute(it => it.getOrElse(0, callbackAsFail0,),).amountOfCall,).toBe(isMinimalist || isNormal ? 1 : 0,),)
                },)

                describe("getOrNull", () => {
                    test("empty",    () => expect(new instance(EMPTY,).execute(it => it.getOrNull(0,),).amountOfCall,).toBe(0,),)
                    test("1 field",  () => expect(new instance(A,).execute(it => it.getOrNull(0,),).amountOfCall,).toBe(isMinimalist || isNormal ? 1 : 0,),)
                    test("2 fields", () => expect(new instance(AB,).execute(it => it.getOrNull(0,),).amountOfCall,).toBe(isMinimalist || isNormal ? 1 : 0,),)
                    test("4 fields", () => expect(new instance(ABCD,).execute(it => it.getOrNull(0,),).amountOfCall,).toBe(isMinimalist || isNormal ? 1 : 0,),)
                },)
                describe("getFirstOrNull", () => {
                    test("empty",    () => expect(new instance(EMPTY,).getFirstOrNull(),).toBeNull(),)
                    test("1 field",  () => expect(new instance(A,).getFirstOrNull(),).toBe('a',),)
                    test("2 fields", () => expect(new instance(AB,).getFirstOrNull(),).toBe('a',),)
                    test("4 fields", () => expect(new instance(ABCD,).getFirstOrNull(),).toBe('a',),)
                },)
                describe("getLastOrNull", () => {
                    test("empty",    () => expect(new instance(EMPTY,).getLastOrNull(),).toBeNull(),)
                    test("1 field",  () => expect(new instance(A,).getLastOrNull(),).toBe('a',),)
                    test("2 fields", () => expect(new instance(AB,).getLastOrNull(),).toBe('b',),)
                    test("4 fields", () => expect(new instance(ABCD,).getLastOrNull(),).toBe('d',),)
                },)
            },)

        if (!isExtension)
            describe("get", () => {
                describe("empty", () => {
                    test("NaN", () => expect(() => new instance(EMPTY,).get(NaN,),).toThrow(EmptyCollectionException,),)
                    test("-∞",  () => expect(() => new instance(EMPTY,).get(-Infinity,),).toThrow(EmptyCollectionException,),)
                    test("-2",  () => expect(() => new instance(EMPTY,).get(-2,),).toThrow(EmptyCollectionException,),)
                    test("-1",  () => expect(() => new instance(EMPTY,).get(-1,),).toThrow(EmptyCollectionException,),)
                    test('0',   () => expect(() => new instance(EMPTY,).get(0,),).toThrow(EmptyCollectionException,),)
                    test('1',   () => expect(() => new instance(EMPTY,).get(1,),).toThrow(EmptyCollectionException,),)
                    test('2',   () => expect(() => new instance(EMPTY,).get(2,),).toThrow(EmptyCollectionException,),)
                    test("+∞",  () => expect(() => new instance(EMPTY,).get(Infinity,),).toThrow(EmptyCollectionException,),)
                },)
                describe("1 field", () => {
                    test("NaN", () => expect(() => new instance(A,).get(NaN,),).toThrow(ForbiddenIndexException,),)
                    test("-∞",  () => expect(() => new instance(A,).get(-Infinity,),).toThrow(ForbiddenIndexException,),)
                    test("-3",  () => expect(() => new instance(A,).get(-3,),).toThrow(IndexOutOfBoundsException,),)
                    test("-2",  () => expect(() => new instance(A,).get(-2,),).toThrow(IndexOutOfBoundsException,),)
                    test("-1",  () => expect(new instance(A,).get(-1,),).toBe('a',),)
                    test('0',   () => expect(new instance(A,).get(0,),).toBe('a',),)
                    test('1',   () => expect(() => new instance(A,).get(1,),).toThrow(IndexOutOfBoundsException,),)
                    test('2',   () => expect(() => new instance(A,).get(2,),).toThrow(IndexOutOfBoundsException,),)
                    test("+∞",  () => expect(() => new instance(A,).get(Infinity,),).toThrow(ForbiddenIndexException,),)
                },)
                describe("2 fields", () => {
                    test("NaN", () => expect(() => new instance(AB,).get(NaN,),).toThrow(ForbiddenIndexException,),)
                    test("-∞",  () => expect(() => new instance(AB,).get(-Infinity,),).toThrow(ForbiddenIndexException,),)
                    test("-4",  () => expect(() => new instance(AB,).get(-4,),).toThrow(IndexOutOfBoundsException,),)
                    test("-3",  () => expect(() => new instance(AB,).get(-3,),).toThrow(IndexOutOfBoundsException,),)
                    test("-2",  () => expect(new instance(AB,).get(-2,),).toBe('a',),)
                    test("-1",  () => expect(new instance(AB,).get(-1,),).toBe('b',),)
                    test('0',   () => expect(new instance(AB,).get(0,),).toBe('a',),)
                    test('1',   () => expect(new instance(AB,).get(1,),).toBe('b',),)
                    test('2',   () => expect(() => new instance(AB,).get(2,),).toThrow(IndexOutOfBoundsException,),)
                    test('3',   () => expect(() => new instance(AB,).get(3,),).toThrow(IndexOutOfBoundsException,),)
                    test("+∞",  () => expect(() => new instance(AB,).get(Infinity,),).toThrow(ForbiddenIndexException,),)
                },)
                describe("4 fields", () => {
                    test("NaN", () => expect(() => new instance(ABCD,).get(NaN,),).toThrow(ForbiddenIndexException,),)
                    test("-∞",  () => expect(() => new instance(ABCD,).get(-Infinity,),).toThrow(ForbiddenIndexException,),)
                    test("-6",  () => expect(() => new instance(ABCD,).get(-6,),).toThrow(IndexOutOfBoundsException,),)
                    test("-5",  () => expect(() => new instance(ABCD,).get(-5,),).toThrow(IndexOutOfBoundsException,),)
                    test("-4",  () => expect(new instance(ABCD,).get(-4,),).toBe('a',),)
                    test("-3",  () => expect(new instance(ABCD,).get(-3,),).toBe('b',),)
                    test("-2",  () => expect(new instance(ABCD,).get(-2,),).toBe('c',),)
                    test("-1",  () => expect(new instance(ABCD,).get(-1,),).toBe('d',),)
                    test('0',   () => expect(new instance(ABCD,).get(0,),).toBe('a',),)
                    test('1',   () => expect(new instance(ABCD,).get(1,),).toBe('b',),)
                    test('2',   () => expect(new instance(ABCD,).get(2,),).toBe('c',),)
                    test('3',   () => expect(new instance(ABCD,).get(3,),).toBe('d',),)
                    test('4',   () => expect(() => new instance(ABCD,).get(4,),).toThrow(IndexOutOfBoundsException,),)
                    test('5',   () => expect(() => new instance(ABCD,).get(5,),).toThrow(IndexOutOfBoundsException,),)
                    test("+∞",  () => expect(() => new instance(ABCD,).get(Infinity,),).toThrow(ForbiddenIndexException,),)
                },)
            },)
        describe("getOrElse", () => {
            describe("empty", () => {
                test("NaN", () => expect(new instance(EMPTY,).getOrElse(NaN, callback,),).toBe(value,),)
                test("-∞",  () => expect(new instance(EMPTY,).getOrElse(-Infinity, callback,),).toBe(value,),)
                test("-2",  () => expect(new instance(EMPTY,).getOrElse(-2, callback,),).toBe(value,),)
                test("-1",  () => expect(new instance(EMPTY,).getOrElse(-1, callback,),).toBe(value,),)
                test('0',   () => expect(new instance(EMPTY,).getOrElse(0, callback,),).toBe(value,),)
                test('1',   () => expect(new instance(EMPTY,).getOrElse(1, callback,),).toBe(value,),)
                test('2',   () => expect(new instance(EMPTY,).getOrElse(2, callback,),).toBe(value,),)
                test("+∞",  () => expect(new instance(EMPTY,).getOrElse(Infinity, callback,),).toBe(value,),)
            },)
            describe("1 field", () => {
                test("NaN", () => expect(new instance(A,).getOrElse(NaN, callback,),).toBe(value,),)
                test("-∞",  () => expect(new instance(A,).getOrElse(-Infinity, callback,),).toBe(value,),)
                test("-3",  () => expect(new instance(A,).getOrElse(-3, callback,),).toBe(value,),)
                test("-2",  () => expect(new instance(A,).getOrElse(-2, callback,),).toBe(value,),)
                test("-1",  () => expect(new instance(A,).getOrElse(-1, callbackAsFail0,),).toBe('a',),)
                test('0',   () => expect(new instance(A,).getOrElse(0, callbackAsFail0,),).toBe('a',),)
                test('1',   () => expect(new instance(A,).getOrElse(1, callback,),).toBe(value,),)
                test('2',   () => expect(new instance(A,).getOrElse(2, callback,),).toBe(value,),)
                test("+∞",  () => expect(new instance(A,).getOrElse(Infinity, callback,),).toBe(value,),)
            },)
            describe("2 fields", () => {
                test("NaN", () => expect(new instance(AB,).getOrElse(NaN, callback,),).toBe(value,),)
                test("-∞",  () => expect(new instance(AB,).getOrElse(-Infinity, callback,),).toBe(value,),)
                test("-4",  () => expect(new instance(AB,).getOrElse(-4, callback,),).toBe(value,),)
                test("-3",  () => expect(new instance(AB,).getOrElse(-3, callback,),).toBe(value,),)
                test("-2",  () => expect(new instance(AB,).getOrElse(-2, callbackAsFail0,),).toBe('a',),)
                test("-1",  () => expect(new instance(AB,).getOrElse(-1, callbackAsFail0,),).toBe('b',),)
                test('0',   () => expect(new instance(AB,).getOrElse(0, callbackAsFail0,),).toBe('a',),)
                test('1',   () => expect(new instance(AB,).getOrElse(1, callbackAsFail0,),).toBe('b',),)
                test('2',   () => expect(new instance(AB,).getOrElse(2, callback,),).toBe(value,),)
                test('3',   () => expect(new instance(AB,).getOrElse(3, callback,),).toBe(value,),)
                test("+∞",  () => expect(new instance(AB,).getOrElse(Infinity, callback,),).toBe(value,),)
            },)
            describe("4 fields", () => {
                test("NaN", () => expect(new instance(ABCD,).getOrElse(NaN, callback,),).toBe(value,),)
                test("-∞",  () => expect(new instance(ABCD,).getOrElse(-Infinity, callback,),).toBe(value,),)
                test("-6",  () => expect(new instance(ABCD,).getOrElse(-6, callback,),).toBe(value,),)
                test("-5",  () => expect(new instance(ABCD,).getOrElse(-5, callback,),).toBe(value,),)
                test("-4",  () => expect(new instance(ABCD,).getOrElse(-4, callbackAsFail0,),).toBe('a',),)
                test("-3",  () => expect(new instance(ABCD,).getOrElse(-3, callbackAsFail0,),).toBe('b',),)
                test("-2",  () => expect(new instance(ABCD,).getOrElse(-2, callbackAsFail0,),).toBe('c',),)
                test("-1",  () => expect(new instance(ABCD,).getOrElse(-1, callbackAsFail0,),).toBe('d',),)
                test('0',   () => expect(new instance(ABCD,).getOrElse(0, callbackAsFail0,),).toBe('a',),)
                test('1',   () => expect(new instance(ABCD,).getOrElse(1, callbackAsFail0,),).toBe('b',),)
                test('2',   () => expect(new instance(ABCD,).getOrElse(2, callbackAsFail0,),).toBe('c',),)
                test('3',   () => expect(new instance(ABCD,).getOrElse(3, callbackAsFail0,),).toBe('d',),)
                test('4',   () => expect(new instance(ABCD,).getOrElse(4, callback,),).toBe(value,),)
                test('5',   () => expect(new instance(ABCD,).getOrElse(5, callback,),).toBe(value,),)
                test("+∞",  () => expect(new instance(ABCD,).getOrElse(Infinity, callback,),).toBe(value,),)
            },)
        },)
        describe("getOrNull", () => {
            describe("empty", () => {
                test("NaN", () => expect(new instance(EMPTY,).getOrNull(NaN,),).toBeNull(),)
                test("-∞",  () => expect(new instance(EMPTY,).getOrNull(-Infinity,),).toBeNull(),)
                test("-2",  () => expect(new instance(EMPTY,).getOrNull(-2,),).toBeNull(),)
                test("-1",  () => expect(new instance(EMPTY,).getOrNull(-1,),).toBeNull(),)
                test('0',   () => expect(new instance(EMPTY,).getOrNull(0,),).toBeNull(),)
                test('1',   () => expect(new instance(EMPTY,).getOrNull(1,),).toBeNull(),)
                test('2',   () => expect(new instance(EMPTY,).getOrNull(2,),).toBeNull(),)
                test("+∞",  () => expect(new instance(EMPTY,).getOrNull(Infinity,),).toBeNull(),)
            },)
            describe("1 field", () => {
                test("NaN", () => expect(new instance(A,).getOrNull(NaN,),).toBeNull(),)
                test("-∞",  () => expect(new instance(A,).getOrNull(-Infinity,),).toBeNull(),)
                test("-3",  () => expect(new instance(A,).getOrNull(-3,),).toBeNull(),)
                test("-2",  () => expect(new instance(A,).getOrNull(-2,),).toBeNull(),)
                test("-1",  () => expect(new instance(A,).getOrNull(-1,),).toBe('a',),)
                test('0',   () => expect(new instance(A,).getOrNull(0,),).toBe('a',),)
                test('1',   () => expect(new instance(A,).getOrNull(1,),).toBeNull(),)
                test('2',   () => expect(new instance(A,).getOrNull(2,),).toBeNull(),)
                test("+∞",  () => expect(new instance(A,).getOrNull(Infinity,),).toBeNull(),)
            },)
            describe("2 fields", () => {
                test("NaN", () => expect(new instance(AB,).getOrNull(NaN,),).toBeNull(),)
                test("-∞",  () => expect(new instance(AB,).getOrNull(-Infinity,),).toBeNull(),)
                test("-4",  () => expect(new instance(AB,).getOrNull(-4,),).toBeNull(),)
                test("-3",  () => expect(new instance(AB,).getOrNull(-3,),).toBeNull(),)
                test("-2",  () => expect(new instance(AB,).getOrNull(-2,),).toBe('a',),)
                test("-1",  () => expect(new instance(AB,).getOrNull(-1,),).toBe('b',),)
                test('0',   () => expect(new instance(AB,).getOrNull(0,),).toBe('a',),)
                test('1',   () => expect(new instance(AB,).getOrNull(1,),).toBe('b',),)
                test('2',   () => expect(new instance(AB,).getOrNull(2,),).toBeNull(),)
                test('3',   () => expect(new instance(AB,).getOrNull(3,),).toBeNull(),)
                test("+∞",  () => expect(new instance(AB,).getOrNull(Infinity,),).toBeNull(),)
            },)
            describe("4 fields", () => {
                test("NaN", () => expect(new instance(ABCD,).getOrNull(NaN,),).toBeNull(),)
                test("-∞",  () => expect(new instance(ABCD,).getOrNull(-Infinity,),).toBeNull(),)
                test("-6",  () => expect(new instance(ABCD,).getOrNull(-6,),).toBeNull(),)
                test("-5",  () => expect(new instance(ABCD,).getOrNull(-5,),).toBeNull(),)
                test("-4",  () => expect(new instance(ABCD,).getOrNull(-4,),).toBe('a',),)
                test("-3",  () => expect(new instance(ABCD,).getOrNull(-3,),).toBe('b',),)
                test("-2",  () => expect(new instance(ABCD,).getOrNull(-2,),).toBe('c',),)
                test("-1",  () => expect(new instance(ABCD,).getOrNull(-1,),).toBe('d',),)
                test('0',   () => expect(new instance(ABCD,).getOrNull(0,),).toBe('a',),)
                test('1',   () => expect(new instance(ABCD,).getOrNull(1,),).toBe('b',),)
                test('2',   () => expect(new instance(ABCD,).getOrNull(2,),).toBe('c',),)
                test('3',   () => expect(new instance(ABCD,).getOrNull(3,),).toBe('d',),)
                test('4',   () => expect(new instance(ABCD,).getOrNull(4,),).toBeNull(),)
                test('5',   () => expect(new instance(ABCD,).getOrNull(5,),).toBeNull(),)
                test("+∞",  () => expect(new instance(ABCD,).getOrNull(Infinity,),).toBeNull(),)
            },)
        },)
    },)

},)

// describe.skip("index", () => {
//     test("empty", () => expect(newInstance(EMPTY,)[0],).toBeUndefined(),)
//     test("0", () => expect(newInstance(AB,)[0],).toEqual("a",),)
//     test("3", () => expect(newInstance(AB,)[3],).toBeUndefined(),)
//     test("1", () => expect(newInstance(ABCD,)[1],).toEqual("b",),)
//     test("-1", () => expect(newInstance(ABCD,)[-1],).toBeUndefined(),)
//     test("-4", () => expect(newInstance(ABCD,)[-4],).toBeUndefined(),)
//     test("-5", () => expect(newInstance(ABCD,)[-5],).toBeUndefined(),)
//     test("NaN", () => expect(newInstance(AB,)[NaN],).toBeUndefined(),)
//     test("+∞", () => expect(newInstance(AB,)[Infinity],).toBeUndefined(),)
//     test("-∞", () => expect(newInstance(AB,)[-Infinity],).toBeUndefined(),)
// },)
