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

import type {CollectionHandler} from "../src/handler/CollectionHandler"

import {newArrayHandler, newArrayOf1Handler, newArrayOf2Handler}                                                                                                                                                                                               from "./helper/newArrayHanders"
import {newCollectionHandler, newCollectionOf1Handler, newCollectionOf2Handler}                                                                                                                                                                                from "./helper/newCollectionHandlers"
import {newCollectionIteratorHandler, newCollectionIteratorOf1Handler, newCollectionIteratorOf2Handler}                                                                                                                                                        from "./helper/newCollectionIteratorHandlers"
import {newEmptyHandler}                                                                                                                                                                                                                                       from "./helper/newEmptyHandler"
import {newIterableHandler}                                                                                                                                                                                                                                    from "./helper/newIterableHandler"
import {newIterableWithSizeHandler, newIterableWithSizeOf1Handler, newIterableWithSizeOf2Handler}                                                                                                                                                              from "./helper/newIterableWithSizeHandlers"
import {newMinimalistCollectionHandler, newMinimalistCollectionOf1Handler, newMinimalistCollectionOf2Handler}                                                                                                                                                  from "./helper/newMinimalistCollectionHandlers"
import {newSetHandler, newSetOf1Handler, newSetOf2Handler}                                                                                                                                                                                                     from "./helper/newSetHandlers"
import {CollectionHolderHoldingNothing}                                                                                                                                                                                                                        from "./instance/CollectionHolderHoldingNothing"
import {A, A_NULL, A_NULL_B, A_NULL_NULL_UNDEFINED_B, A_NULL_UNDEFINED_B, A_NULL_UNDEFINED_UNDEFINED_B, A_UNDEFINED, A_UNDEFINED_B, AA, AABC, AB, AB_NULL, AB_UNDEFINED, ABAB, ABBC, ABCD, EMPTY, NULL, NULL_A, NULL_AB, UNDEFINED, UNDEFINED_A, UNDEFINED_AB} from "./value/arrays"
import {expectIndexesInCollectionOf1ToBeNotPresent}                                                                                                                                                                                                            from "./expect/expectIndexesInCollectionOf1ToBeNotPresent"
import {expectIndexesInCollectionOf2ToBeNotPresent}                                                                                                                                                                                                            from "./expect/expectIndexesInCollectionOf2ToBeNotPresent"
import {expectIndexesInCollectionOf4ToBeNotPresent}                                                                                                                                                                                                            from "./expect/expectIndexesInCollectionOf4ToBeNotPresent"
import {expectIndexesInCollectionOf1ToBePresent}                                                                                                                                                                                                               from "./expect/expectIndexesInCollectionOf1ToBePresent"
import {expectIndexesInCollectionOf2ToBePresent}                                                                                                                                                                                                               from "./expect/expectIndexesInCollectionOf2ToBePresent"
import {expectIndexesInCollectionOf4ToBePresent}                                                                                                                                                                                                               from "./expect/expectIndexesInCollectionOf4ToBePresent"
import {expectIndexesInCollectionOf2ToOnlyHave1stPresent}                                                                                                                                                                                                      from "./expect/expectIndexesInCollectionOf2ToOnlyHave1stPresent"
import {expectIndexesInCollectionOf4ToOnlyHave1stPresent}                                                                                                                                                                                                      from "./expect/expectIndexesInCollectionOf4ToOnlyHave1stPresent"
import {newIteratorHandler}                                                                                                                                                                                                                                    from "./helper/newIteratorHandlers"

describe("CollectionHandlerTest (has)", () => {

    describe("EmptyCollectionHandler", () => {
        test("hasNull",      () => expect(newEmptyHandler().hasNull,).toBeFalse(),)
        test("hasDuplicate", () => expect(newEmptyHandler().hasDuplicate,).toBeFalse(),)
        test("hasFinished",  () => expect(newEmptyHandler().hasFinished,).toBeTrue(),)
    },)

    describe("indexes being present", () => {
        describe("hasNull", () => {
            test("array: 1 field",  () => expectIndexesInCollectionOf1ToBePresent(execute(it => newArrayHandler(A, it,), it => it.hasNull,),),)
            test("array: 2 fields", () => expectIndexesInCollectionOf2ToBePresent(execute(it => newArrayHandler(AB, it,), it => it.hasNull,),),)
            test("array: 4 fields", () => expectIndexesInCollectionOf4ToBePresent(execute(it => newArrayHandler(ABCD, it,), it => it.hasNull,),),)
            test("array of 1",      () => expectIndexesInCollectionOf1ToBePresent(execute(it => newArrayOf1Handler(A, it,), it => it.hasNull,),),)
            test("array of 2",      () => expectIndexesInCollectionOf2ToBePresent(execute(it => newArrayOf2Handler(AB, it,), it => it.hasNull,),),)

            test("set: 1 field",  () => expectIndexesInCollectionOf1ToBePresent(execute(it => newSetHandler(A, it,), it => it.hasNull,),),)
            test("set: 2 fields", () => expectIndexesInCollectionOf2ToBePresent(execute(it => newSetHandler(AB, it,), it => it.hasNull,),),)
            test("set: 4 fields", () => expectIndexesInCollectionOf4ToBePresent(execute(it => newSetHandler(ABCD, it,), it => it.hasNull,),),)
            test("set of 1",      () => expectIndexesInCollectionOf1ToBePresent(execute(it => newSetOf1Handler(A, it,), it => it.hasNull,),),)
            test("set of 2",      () => expectIndexesInCollectionOf2ToBePresent(execute(it => newSetOf2Handler(AB, it,), it => it.hasNull,),),)

            test("minimalist collection holder: 1 field",  () => expectIndexesInCollectionOf1ToBePresent(execute(it => newMinimalistCollectionHandler(A, it,), it => it.hasNull,),),)
            test("minimalist collection holder: 2 fields", () => expectIndexesInCollectionOf2ToBePresent(execute(it => newMinimalistCollectionHandler(AB, it,), it => it.hasNull,),),)
            test("minimalist collection holder: 4 fields", () => expectIndexesInCollectionOf4ToBePresent(execute(it => newMinimalistCollectionHandler(ABCD, it,), it => it.hasNull,),),)
            test("minimalist collection holder of 1",      () => expectIndexesInCollectionOf1ToBePresent(execute(it => newMinimalistCollectionOf1Handler(A, it,), it => it.hasNull,),),)
            test("minimalist collection holder of 2",      () => expectIndexesInCollectionOf2ToBePresent(execute(it => newMinimalistCollectionOf2Handler(AB, it,), it => it.hasNull,),),)

            test("collection holder: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionHandler(A, it,), it => it.hasNull,),),)
            test("collection holder: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newCollectionHandler(AB, it,), it => it.hasNull,),),)
            test("collection holder: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newCollectionHandler(ABCD, it,), it => it.hasNull,),),)
            test("collection holder of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionOf1Handler(A, it,), it => it.hasNull,),),)
            test("collection holder of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newCollectionOf2Handler(AB, it,), it => it.hasNull,),),)

            test("iterator: 1 field",  () => expectIndexesInCollectionOf1ToBePresent(execute(it => newIteratorHandler(A, it,), it => it.hasNull,),),)
            test("iterator: 2 fields", () => expectIndexesInCollectionOf2ToBePresent(execute(it => newIteratorHandler(AB, it,), it => it.hasNull,),),)
            test("iterator: 4 fields", () => expectIndexesInCollectionOf4ToBePresent(execute(it => newIteratorHandler(ABCD, it,), it => it.hasNull,),),)

            test("collection iterator: 1 field",  () => expectIndexesInCollectionOf1ToBePresent(execute(it => newCollectionIteratorHandler(A, it,), it => it.hasNull,),),)
            test("collection iterator: 2 fields", () => expectIndexesInCollectionOf2ToBePresent(execute(it => newCollectionIteratorHandler(AB, it,), it => it.hasNull,),),)
            test("collection iterator: 4 fields", () => expectIndexesInCollectionOf4ToBePresent(execute(it => newCollectionIteratorHandler(ABCD, it,), it => it.hasNull,),),)
            test("collection iterator of 1",      () => expectIndexesInCollectionOf1ToBePresent(execute(it => newCollectionIteratorOf1Handler(A, it,), it => it.hasNull,),),)
            test("collection iterator of 2",      () => expectIndexesInCollectionOf2ToBePresent(execute(it => newCollectionIteratorOf2Handler(AB, it,), it => it.hasNull,),),)

            test("iterable: 1 field",  () => expectIndexesInCollectionOf1ToBePresent(execute(it => newIterableHandler(A, it,), it => it.hasNull,),),)
            test("iterable: 2 fields", () => expectIndexesInCollectionOf2ToBePresent(execute(it => newIterableHandler(AB, it,), it => it.hasNull,),),)
            test("iterable: 4 fields", () => expectIndexesInCollectionOf4ToBePresent(execute(it => newIterableHandler(ABCD, it,), it => it.hasNull,),),)

            test("iterable with size: 1 field",  () => expectIndexesInCollectionOf1ToBePresent(execute(it => newIterableWithSizeHandler(A, it,), it => it.hasNull,),),)
            test("iterable with size: 2 fields", () => expectIndexesInCollectionOf2ToBePresent(execute(it => newIterableWithSizeHandler(AB, it,), it => it.hasNull,),),)
            test("iterable with size: 4 fields", () => expectIndexesInCollectionOf4ToBePresent(execute(it => newIterableWithSizeHandler(ABCD, it,), it => it.hasNull,),),)
            test("iterable with size of 1",      () => expectIndexesInCollectionOf1ToBePresent(execute(it => newIterableWithSizeOf1Handler(A, it,), it => it.hasNull,),),)
            test("iterable with size of 2",      () => expectIndexesInCollectionOf2ToBePresent(execute(it => newIterableWithSizeOf2Handler(AB, it,), it => it.hasNull,),),)
        },)
        describe("hasDuplicate", () => {
            test("array: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newArrayHandler(A, it,), it => it.hasDuplicate,),),)
            test("array: 2 fields", () => expectIndexesInCollectionOf2ToBePresent(execute(it => newArrayHandler(AB, it,), it => it.hasDuplicate,),),)
            test("array: 4 fields", () => expectIndexesInCollectionOf4ToBePresent(execute(it => newArrayHandler(ABCD, it,), it => it.hasDuplicate,),),)
            test("array of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newArrayOf1Handler(A, it,), it => it.hasDuplicate,),),)
            test("array of 2",      () => expectIndexesInCollectionOf2ToBePresent(execute(it => newArrayOf2Handler(AB, it,), it => it.hasDuplicate,),),)

            test("set: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newSetHandler(A, it,), it => it.hasDuplicate,),),)
            test("set: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newSetHandler(AB, it,), it => it.hasDuplicate,),),)
            test("set: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newSetHandler(ABCD, it,), it => it.hasDuplicate,),),)
            test("set of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newSetOf1Handler(A, it,), it => it.hasDuplicate,),),)
            test("set of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newSetOf2Handler(AB, it,), it => it.hasDuplicate,),),)

            test("minimalist collection holder: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newMinimalistCollectionHandler(A, it,), it => it.hasDuplicate,),),)
            test("minimalist collection holder: 2 fields", () => expectIndexesInCollectionOf2ToBePresent(execute(it => newMinimalistCollectionHandler(AB, it,), it => it.hasDuplicate,),),)
            test("minimalist collection holder: 4 fields", () => expectIndexesInCollectionOf4ToBePresent(execute(it => newMinimalistCollectionHandler(ABCD, it,), it => it.hasDuplicate,),),)
            test("minimalist collection holder of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newMinimalistCollectionOf1Handler(A, it,), it => it.hasDuplicate,),),)
            test("minimalist collection holder of 2",      () => expectIndexesInCollectionOf2ToBePresent(execute(it => newMinimalistCollectionOf2Handler(AB, it,), it => it.hasDuplicate,),),)

            test("collection holder: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionHandler(A, it,), it => it.hasDuplicate,),),)
            test("collection holder: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newCollectionHandler(AB, it,), it => it.hasDuplicate,),),)
            test("collection holder: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newCollectionHandler(ABCD, it,), it => it.hasDuplicate,),),)
            test("collection holder of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionOf1Handler(A, it,), it => it.hasDuplicate,),),)
            test("collection holder of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newCollectionOf2Handler(AB, it,), it => it.hasDuplicate,),),)

            test("iterator: 1 field",  () => expectIndexesInCollectionOf1ToBePresent(execute(it => newIteratorHandler(A, it,), it => it.hasDuplicate,),),)
            test("iterator: 2 fields", () => expectIndexesInCollectionOf2ToBePresent(execute(it => newIteratorHandler(AB, it,), it => it.hasDuplicate,),),)
            test("iterator: 4 fields", () => expectIndexesInCollectionOf4ToBePresent(execute(it => newIteratorHandler(ABCD, it,), it => it.hasDuplicate,),),)

            test("collection iterator: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionIteratorHandler(A, it,), it => it.hasDuplicate,),),)
            test("collection iterator: 2 fields", () => expectIndexesInCollectionOf2ToBePresent(execute(it => newCollectionIteratorHandler(AB, it,), it => it.hasDuplicate,),),)
            test("collection iterator: 4 fields", () => expectIndexesInCollectionOf4ToBePresent(execute(it => newCollectionIteratorHandler(ABCD, it,), it => it.hasDuplicate,),),)
            test("collection iterator of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionIteratorOf1Handler(A, it,), it => it.hasDuplicate,),),)
            test("collection iterator of 2",      () => expectIndexesInCollectionOf2ToBePresent(execute(it => newCollectionIteratorOf2Handler(AB, it,), it => it.hasDuplicate,),),)

            test("iterable: 1 field",  () => expectIndexesInCollectionOf1ToBePresent(execute(it => newIterableHandler(A, it,), it => it.hasDuplicate,),),)
            test("iterable: 2 fields", () => expectIndexesInCollectionOf2ToBePresent(execute(it => newIterableHandler(AB, it,), it => it.hasDuplicate,),),)
            test("iterable: 4 fields", () => expectIndexesInCollectionOf4ToBePresent(execute(it => newIterableHandler(ABCD, it,), it => it.hasDuplicate,),),)

            test("iterable with size: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newIterableWithSizeHandler(A, it,), it => it.hasDuplicate,),),)
            test("iterable with size: 2 fields", () => expectIndexesInCollectionOf2ToBePresent(execute(it => newIterableWithSizeHandler(AB, it,), it => it.hasDuplicate,),),)
            test("iterable with size: 4 fields", () => expectIndexesInCollectionOf4ToBePresent(execute(it => newIterableWithSizeHandler(ABCD, it,), it => it.hasDuplicate,),),)
            test("iterable with size of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newIterableWithSizeOf1Handler(A, it,), it => it.hasDuplicate,),),)
            test("iterable with size of 2",      () => expectIndexesInCollectionOf2ToBePresent(execute(it => newIterableWithSizeOf2Handler(AB, it,), it => it.hasDuplicate,),),)
        },)
        describe("hasFinished", () => {
            test("array: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newArrayHandler(A, it,), it => it.hasFinished,),),)
            test("array: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newArrayHandler(AB, it,), it => it.hasFinished,),),)
            test("array: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newArrayHandler(ABCD, it,), it => it.hasFinished,),),)
            test("array of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newArrayOf1Handler(A, it,), it => it.hasFinished,),),)
            test("array of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newArrayOf2Handler(AB, it,), it => it.hasFinished,),),)

            test("set: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newSetHandler(A, it,), it => it.hasFinished,),),)
            test("set: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newSetHandler(AB, it,), it => it.hasFinished,),),)
            test("set: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newSetHandler(ABCD, it,), it => it.hasFinished,),),)
            test("set of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newSetOf1Handler(A, it,), it => it.hasFinished,),),)
            test("set of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newSetOf2Handler(AB, it,), it => it.hasFinished,),),)

            test("minimalist collection holder: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newMinimalistCollectionHandler(A, it,), it => it.hasFinished,),),)
            test("minimalist collection holder: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newMinimalistCollectionHandler(AB, it,), it => it.hasFinished,),),)
            test("minimalist collection holder: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newMinimalistCollectionHandler(ABCD, it,), it => it.hasFinished,),),)
            test("minimalist collection holder of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newMinimalistCollectionOf1Handler(A, it,), it => it.hasFinished,),),)
            test("minimalist collection holder of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newMinimalistCollectionOf2Handler(AB, it,), it => it.hasFinished,),),)

            test("collection holder: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionHandler(A, it,), it => it.hasFinished,),),)
            test("collection holder: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newCollectionHandler(AB, it,), it => it.hasFinished,),),)
            test("collection holder: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newCollectionHandler(ABCD, it,), it => it.hasFinished,),),)
            test("collection holder of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionOf1Handler(A, it,), it => it.hasFinished,),),)
            test("collection holder of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newCollectionOf2Handler(AB, it,), it => it.hasFinished,),),)

            test("iterator: 1 field",  () => expectIndexesInCollectionOf1ToBePresent(execute(it => newIteratorHandler(A, it,), it => it.hasFinished,),),)
            test("iterator: 2 fields", () => expectIndexesInCollectionOf2ToOnlyHave1stPresent(execute(it => newIteratorHandler(AB, it,), it => it.hasFinished,),),)
            test("iterator: 4 fields", () => expectIndexesInCollectionOf4ToOnlyHave1stPresent(execute(it => newIteratorHandler(ABCD, it,), it => it.hasFinished,),),)

            test("collection iterator: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionIteratorHandler(A, it,), it => it.hasFinished,),),)
            test("collection iterator: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newCollectionIteratorHandler(AB, it,), it => it.hasFinished,),),)
            test("collection iterator: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newCollectionIteratorHandler(ABCD, it,), it => it.hasFinished,),),)
            test("collection iterator of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionIteratorOf1Handler(A, it,), it => it.hasFinished,),),)
            test("collection iterator of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newCollectionIteratorOf2Handler(AB, it,), it => it.hasFinished,),),)

            test("iterable: 1 field",  () => expectIndexesInCollectionOf1ToBePresent(execute(it => newIterableHandler(A, it,), it => it.hasFinished,),),)
            test("iterable: 2 fields", () => expectIndexesInCollectionOf2ToOnlyHave1stPresent(execute(it => newIterableHandler(AB, it,), it => it.hasFinished,),),)
            test("iterable: 4 fields", () => expectIndexesInCollectionOf4ToOnlyHave1stPresent(execute(it => newIterableHandler(ABCD, it,), it => it.hasFinished,),),)

            test("iterable with size: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newIterableWithSizeHandler(A, it,), it => it.hasFinished,),),)
            test("iterable with size: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newIterableWithSizeHandler(AB, it,), it => it.hasFinished,),),)
            test("iterable with size: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newIterableWithSizeHandler(ABCD, it,), it => it.hasFinished,),),)
            test("iterable with size of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newIterableWithSizeOf1Handler(A, it,), it => it.hasFinished,),),)
            test("iterable with size of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newIterableWithSizeOf2Handler(AB, it,), it => it.hasFinished,),),)
        },)
    },)

    describe("hasNull", () => {
        describe("array", () => {
            test("empty", () => expect(newArrayHandler(EMPTY,).hasNull,).toBeFalse(),)
            describe("1 field", () => {
                test("non-null",  () => expect(newArrayHandler(A,).hasNull,).toBeFalse(),)
                test("null",      () => expect(newArrayHandler(NULL,).hasNull,).toBeTrue(),)
                test("undefined", () => expect(newArrayHandler(UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("2 fields", () => {
                test("non-null",           () => expect(newArrayHandler(AB,).hasNull,).toBeFalse(),)
                test("null at start",      () => expect(newArrayHandler(NULL_A,).hasNull,).toBeTrue(),)
                test("null at end",        () => expect(newArrayHandler(A_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start", () => expect(newArrayHandler(UNDEFINED_A,).hasNull,).toBeTrue(),)
                test("undefined at end",   () => expect(newArrayHandler(A_UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("4 fields", () => {
                test("non-null",            () => expect(newArrayHandler(ABCD,).hasNull,).toBeFalse(),)
                test("null at start",       () => expect(newArrayHandler(NULL_AB,).hasNull,).toBeTrue(),)
                test("null at center",      () => expect(newArrayHandler(A_NULL_B,).hasNull,).toBeTrue(),)
                test("null at end",         () => expect(newArrayHandler(AB_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start",  () => expect(newArrayHandler(UNDEFINED_AB,).hasNull,).toBeTrue(),)
                test("undefined at center", () => expect(newArrayHandler(A_UNDEFINED_B,).hasNull,).toBeTrue(),)
                test("undefined at end",    () => expect(newArrayHandler(AB_UNDEFINED,).hasNull,).toBeTrue(),)
                test("null + undefined",    () => expect(newArrayHandler(A_NULL_UNDEFINED_B,).hasNull,).toBeTrue(),)
            },)
        },)
        describe("array of 1", () => {
            test("non-null",  () => expect(newArrayOf1Handler(A,).hasNull,).toBeFalse(),)
            test("null",      () => expect(newArrayOf1Handler(NULL,).hasNull,).toBeTrue(),)
            test("undefined", () => expect(newArrayOf1Handler(UNDEFINED,).hasNull,).toBeTrue(),)
        },)
        describe("array of 2", () => {
            test("non-null",           () => expect(newArrayOf2Handler(AB,).hasNull,).toBeFalse(),)
            test("null at start",      () => expect(newArrayOf2Handler(NULL_A,).hasNull,).toBeTrue(),)
            test("null at end",        () => expect(newArrayOf2Handler(A_NULL,).hasNull,).toBeTrue(),)
            test("undefined at start", () => expect(newArrayOf2Handler(UNDEFINED_A,).hasNull,).toBeTrue(),)
            test("undefined at end",   () => expect(newArrayOf2Handler(A_UNDEFINED,).hasNull,).toBeTrue(),)
        },)
        describe("set", () => {
            test("empty", () => expect(newSetHandler(EMPTY,).hasNull,).toBeFalse(),)
            describe("1 field", () => {
                test("non-null",  () => expect(newSetHandler(A,).hasNull,).toBeFalse(),)
                test("null",      () => expect(newSetHandler(NULL,).hasNull,).toBeTrue(),)
                test("undefined", () => expect(newSetHandler(UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("2 fields", () => {
                test("non-null",           () => expect(newSetHandler(AB,).hasNull,).toBeFalse(),)
                test("null at start",      () => expect(newSetHandler(NULL_A,).hasNull,).toBeTrue(),)
                test("null at end",        () => expect(newSetHandler(A_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start", () => expect(newSetHandler(UNDEFINED_A,).hasNull,).toBeTrue(),)
                test("undefined at end",   () => expect(newSetHandler(A_UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("4 fields", () => {
                test("non-null",            () => expect(newSetHandler(ABCD,).hasNull,).toBeFalse(),)
                test("null at start",       () => expect(newSetHandler(NULL_AB,).hasNull,).toBeTrue(),)
                test("null at center",      () => expect(newSetHandler(A_NULL_B,).hasNull,).toBeTrue(),)
                test("null at end",         () => expect(newSetHandler(AB_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start",  () => expect(newSetHandler(UNDEFINED_AB,).hasNull,).toBeTrue(),)
                test("undefined at center", () => expect(newSetHandler(A_UNDEFINED_B,).hasNull,).toBeTrue(),)
                test("undefined at end",    () => expect(newSetHandler(AB_UNDEFINED,).hasNull,).toBeTrue(),)
                test("null + undefined",    () => expect(newSetHandler(A_NULL_UNDEFINED_B,).hasNull,).toBeTrue(),)
            },)
        },)
        describe("set of 1", () => {
            test("non-null",  () => expect(newSetOf1Handler(A,).hasNull,).toBeFalse(),)
            test("null",      () => expect(newSetOf1Handler(NULL,).hasNull,).toBeTrue(),)
            test("undefined", () => expect(newSetOf1Handler(UNDEFINED,).hasNull,).toBeTrue(),)
        },)
        describe("set of 2", () => {
            test("non-null",           () => expect(newSetOf2Handler(AB,).hasNull,).toBeFalse(),)
            test("null at start",      () => expect(newSetOf2Handler(NULL_A,).hasNull,).toBeTrue(),)
            test("null at end",        () => expect(newSetOf2Handler(A_NULL,).hasNull,).toBeTrue(),)
            test("undefined at start", () => expect(newSetOf2Handler(UNDEFINED_A,).hasNull,).toBeTrue(),)
            test("undefined at end",   () => expect(newSetOf2Handler(A_UNDEFINED,).hasNull,).toBeTrue(),)
        },)
        describe("minimalist collection holder", () => {
            test("empty", () => expect(newMinimalistCollectionHandler(EMPTY,).hasNull,).toBeFalse(),)
            describe("1 field", () => {
                test("non-null",  () => expect(newMinimalistCollectionHandler(A,).hasNull,).toBeFalse(),)
                test("null",      () => expect(newMinimalistCollectionHandler(NULL,).hasNull,).toBeTrue(),)
                test("undefined", () => expect(newMinimalistCollectionHandler(UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("2 fields", () => {
                test("non-null",           () => expect(newMinimalistCollectionHandler(AB,).hasNull,).toBeFalse(),)
                test("null at start",      () => expect(newMinimalistCollectionHandler(NULL_A,).hasNull,).toBeTrue(),)
                test("null at end",        () => expect(newMinimalistCollectionHandler(A_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start", () => expect(newMinimalistCollectionHandler(UNDEFINED_A,).hasNull,).toBeTrue(),)
                test("undefined at end",   () => expect(newMinimalistCollectionHandler(A_UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("4 fields", () => {
                test("non-null",            () => expect(newMinimalistCollectionHandler(ABCD,).hasNull,).toBeFalse(),)
                test("null at start",       () => expect(newMinimalistCollectionHandler(NULL_AB,).hasNull,).toBeTrue(),)
                test("null at center",      () => expect(newMinimalistCollectionHandler(A_NULL_B,).hasNull,).toBeTrue(),)
                test("null at end",         () => expect(newMinimalistCollectionHandler(AB_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start",  () => expect(newMinimalistCollectionHandler(UNDEFINED_AB,).hasNull,).toBeTrue(),)
                test("undefined at center", () => expect(newMinimalistCollectionHandler(A_UNDEFINED_B,).hasNull,).toBeTrue(),)
                test("undefined at end",    () => expect(newMinimalistCollectionHandler(AB_UNDEFINED,).hasNull,).toBeTrue(),)
                test("null + undefined",    () => expect(newMinimalistCollectionHandler(A_NULL_UNDEFINED_B,).hasNull,).toBeTrue(),)
            },)
        },)
        describe("minimalist collection holder of 1", () => {
            test("non-null",  () => expect(newMinimalistCollectionOf1Handler(A,).hasNull,).toBeFalse(),)
            test("null",      () => expect(newMinimalistCollectionOf1Handler(NULL,).hasNull,).toBeTrue(),)
            test("undefined", () => expect(newMinimalistCollectionOf1Handler(UNDEFINED,).hasNull,).toBeTrue(),)
        },)
        describe("minimalist collection holder of 2", () => {
            test("non-null",           () => expect(newMinimalistCollectionOf2Handler(AB,).hasNull,).toBeFalse(),)
            test("null at start",      () => expect(newMinimalistCollectionOf2Handler(NULL_A,).hasNull,).toBeTrue(),)
            test("null at end",        () => expect(newMinimalistCollectionOf2Handler(A_NULL,).hasNull,).toBeTrue(),)
            test("undefined at start", () => expect(newMinimalistCollectionOf2Handler(UNDEFINED_A,).hasNull,).toBeTrue(),)
            test("undefined at end",   () => expect(newMinimalistCollectionOf2Handler(A_UNDEFINED,).hasNull,).toBeTrue(),)
        },)
        describe("collection holder", () => {
            test("empty", () => expect(newCollectionHandler(EMPTY,).hasNull,).toBeFalse(),)
            describe("1 field", () => {
                test("non-null",  () => expect(newCollectionHandler(A,).hasNull,).toBeFalse(),)
                test("null",      () => expect(newCollectionHandler(NULL,).hasNull,).toBeTrue(),)
                test("undefined", () => expect(newCollectionHandler(UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("2 fields", () => {
                test("non-null",           () => expect(newCollectionHandler(AB,).hasNull,).toBeFalse(),)
                test("null at start",      () => expect(newCollectionHandler(NULL_A,).hasNull,).toBeTrue(),)
                test("null at end",        () => expect(newCollectionHandler(A_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start", () => expect(newCollectionHandler(UNDEFINED_A,).hasNull,).toBeTrue(),)
                test("undefined at end",   () => expect(newCollectionHandler(A_UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("4 fields", () => {
                test("non-null",            () => expect(newCollectionHandler(ABCD,).hasNull,).toBeFalse(),)
                test("null at start",       () => expect(newCollectionHandler(NULL_AB,).hasNull,).toBeTrue(),)
                test("null at center",      () => expect(newCollectionHandler(A_NULL_B,).hasNull,).toBeTrue(),)
                test("null at end",         () => expect(newCollectionHandler(AB_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start",  () => expect(newCollectionHandler(UNDEFINED_AB,).hasNull,).toBeTrue(),)
                test("undefined at center", () => expect(newCollectionHandler(A_UNDEFINED_B,).hasNull,).toBeTrue(),)
                test("undefined at end",    () => expect(newCollectionHandler(AB_UNDEFINED,).hasNull,).toBeTrue(),)
                test("null + undefined",    () => expect(newCollectionHandler(A_NULL_UNDEFINED_B,).hasNull,).toBeTrue(),)
            },)
        },)
        describe("collection holder of 1", () => {
            test("non-null",  () => expect(newCollectionOf1Handler(A,).hasNull,).toBeFalse(),)
            test("null",      () => expect(newCollectionOf1Handler(NULL,).hasNull,).toBeTrue(),)
            test("undefined", () => expect(newCollectionOf1Handler(UNDEFINED,).hasNull,).toBeTrue(),)
        },)
        describe("collection holder of 2", () => {
            test("non-null",           () => expect(newCollectionOf2Handler(AB,).hasNull,).toBeFalse(),)
            test("null at start",      () => expect(newCollectionOf2Handler(NULL_A,).hasNull,).toBeTrue(),)
            test("null at end",        () => expect(newCollectionOf2Handler(A_NULL,).hasNull,).toBeTrue(),)
            test("undefined at start", () => expect(newCollectionOf2Handler(UNDEFINED_A,).hasNull,).toBeTrue(),)
            test("undefined at end",   () => expect(newCollectionOf2Handler(A_UNDEFINED,).hasNull,).toBeTrue(),)
        },)
        describe("iterator", () => {
            test("empty", () => expect(newIteratorHandler(EMPTY,).hasNull,).toBeFalse(),)
            describe("1 field", () => {
                test("non-null",  () => expect(newIteratorHandler(A,).hasNull,).toBeFalse(),)
                test("null",      () => expect(newIteratorHandler(NULL,).hasNull,).toBeTrue(),)
                test("undefined", () => expect(newIteratorHandler(UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("2 fields", () => {
                test("non-null",           () => expect(newIteratorHandler(AB,).hasNull,).toBeFalse(),)
                test("null at start",      () => expect(newIteratorHandler(NULL_A,).hasNull,).toBeTrue(),)
                test("null at end",        () => expect(newIteratorHandler(A_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start", () => expect(newIteratorHandler(UNDEFINED_A,).hasNull,).toBeTrue(),)
                test("undefined at end",   () => expect(newIteratorHandler(A_UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("4 fields", () => {
                test("non-null",            () => expect(newIteratorHandler(ABCD,).hasNull,).toBeFalse(),)
                test("null at start",       () => expect(newIteratorHandler(NULL_AB,).hasNull,).toBeTrue(),)
                test("null at center",      () => expect(newIteratorHandler(A_NULL_B,).hasNull,).toBeTrue(),)
                test("null at end",         () => expect(newIteratorHandler(AB_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start",  () => expect(newIteratorHandler(UNDEFINED_AB,).hasNull,).toBeTrue(),)
                test("undefined at center", () => expect(newIteratorHandler(A_UNDEFINED_B,).hasNull,).toBeTrue(),)
                test("undefined at end",    () => expect(newIteratorHandler(AB_UNDEFINED,).hasNull,).toBeTrue(),)
                test("null + undefined",    () => expect(newIteratorHandler(A_NULL_UNDEFINED_B,).hasNull,).toBeTrue(),)
            },)
        },)
        describe("collection iterator", () => {
            test("empty", () => expect(newCollectionIteratorHandler(EMPTY,).hasNull,).toBeFalse(),)
            describe("1 field", () => {
                test("non-null",  () => expect(newCollectionIteratorHandler(A,).hasNull,).toBeFalse(),)
                test("null",      () => expect(newCollectionIteratorHandler(NULL,).hasNull,).toBeTrue(),)
                test("undefined", () => expect(newCollectionIteratorHandler(UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("2 fields", () => {
                test("non-null",           () => expect(newCollectionIteratorHandler(AB,).hasNull,).toBeFalse(),)
                test("null at start",      () => expect(newCollectionIteratorHandler(NULL_A,).hasNull,).toBeTrue(),)
                test("null at end",        () => expect(newCollectionIteratorHandler(A_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start", () => expect(newCollectionIteratorHandler(UNDEFINED_A,).hasNull,).toBeTrue(),)
                test("undefined at end",   () => expect(newCollectionIteratorHandler(A_UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("4 fields", () => {
                test("non-null",            () => expect(newCollectionIteratorHandler(ABCD,).hasNull,).toBeFalse(),)
                test("null at start",       () => expect(newCollectionIteratorHandler(NULL_AB,).hasNull,).toBeTrue(),)
                test("null at center",      () => expect(newCollectionIteratorHandler(A_NULL_B,).hasNull,).toBeTrue(),)
                test("null at end",         () => expect(newCollectionIteratorHandler(AB_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start",  () => expect(newCollectionIteratorHandler(UNDEFINED_AB,).hasNull,).toBeTrue(),)
                test("undefined at center", () => expect(newCollectionIteratorHandler(A_UNDEFINED_B,).hasNull,).toBeTrue(),)
                test("undefined at end",    () => expect(newCollectionIteratorHandler(AB_UNDEFINED,).hasNull,).toBeTrue(),)
                test("null + undefined",    () => expect(newCollectionIteratorHandler(A_NULL_UNDEFINED_B,).hasNull,).toBeTrue(),)
            },)
        },)
        describe("collection iterator of 1", () => {
            test("non-null",  () => expect(newCollectionIteratorOf1Handler(A,).hasNull,).toBeFalse(),)
            test("null",      () => expect(newCollectionIteratorOf1Handler(NULL,).hasNull,).toBeTrue(),)
            test("undefined", () => expect(newCollectionIteratorOf1Handler(UNDEFINED,).hasNull,).toBeTrue(),)
        },)
        describe("collection iterator of 2", () => {
            test("non-null",           () => expect(newCollectionIteratorOf2Handler(AB,).hasNull,).toBeFalse(),)
            test("null at start",      () => expect(newCollectionIteratorOf2Handler(NULL_A,).hasNull,).toBeTrue(),)
            test("null at end",        () => expect(newCollectionIteratorOf2Handler(A_NULL,).hasNull,).toBeTrue(),)
            test("undefined at start", () => expect(newCollectionIteratorOf2Handler(UNDEFINED_A,).hasNull,).toBeTrue(),)
            test("undefined at end",   () => expect(newCollectionIteratorOf2Handler(A_UNDEFINED,).hasNull,).toBeTrue(),)
        },)
        describe("iterable", () => {
            test("empty", () => expect(newIterableHandler(EMPTY,).hasNull,).toBeFalse(),)
            describe("1 field", () => {
                test("non-null",  () => expect(newIterableHandler(A,).hasNull,).toBeFalse(),)
                test("null",      () => expect(newIterableHandler(NULL,).hasNull,).toBeTrue(),)
                test("undefined", () => expect(newIterableHandler(UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("2 fields", () => {
                test("non-null",           () => expect(newIterableHandler(AB,).hasNull,).toBeFalse(),)
                test("null at start",      () => expect(newIterableHandler(NULL_A,).hasNull,).toBeTrue(),)
                test("null at end",        () => expect(newIterableHandler(A_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start", () => expect(newIterableHandler(UNDEFINED_A,).hasNull,).toBeTrue(),)
                test("undefined at end",   () => expect(newIterableHandler(A_UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("4 fields", () => {
                test("non-null",            () => expect(newIterableHandler(ABCD,).hasNull,).toBeFalse(),)
                test("null at start",       () => expect(newIterableHandler(NULL_AB,).hasNull,).toBeTrue(),)
                test("null at center",      () => expect(newIterableHandler(A_NULL_B,).hasNull,).toBeTrue(),)
                test("null at end",         () => expect(newIterableHandler(AB_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start",  () => expect(newIterableHandler(UNDEFINED_AB,).hasNull,).toBeTrue(),)
                test("undefined at center", () => expect(newIterableHandler(A_UNDEFINED_B,).hasNull,).toBeTrue(),)
                test("undefined at end",    () => expect(newIterableHandler(AB_UNDEFINED,).hasNull,).toBeTrue(),)
                test("null + undefined",    () => expect(newIterableHandler(A_NULL_UNDEFINED_B,).hasNull,).toBeTrue(),)
            },)
        },)
        describe("iterable with size", () => {
            test("empty", () => expect(newIterableWithSizeHandler(EMPTY,).hasNull,).toBeFalse(),)
            describe("1 field", () => {
                test("non-null",  () => expect(newIterableWithSizeHandler(A,).hasNull,).toBeFalse(),)
                test("null",      () => expect(newIterableWithSizeHandler(NULL,).hasNull,).toBeTrue(),)
                test("undefined", () => expect(newIterableWithSizeHandler(UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("2 fields", () => {
                test("non-null",           () => expect(newIterableWithSizeHandler(AB,).hasNull,).toBeFalse(),)
                test("null at start",      () => expect(newIterableWithSizeHandler(NULL_A,).hasNull,).toBeTrue(),)
                test("null at end",        () => expect(newIterableWithSizeHandler(A_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start", () => expect(newIterableWithSizeHandler(UNDEFINED_A,).hasNull,).toBeTrue(),)
                test("undefined at end",   () => expect(newIterableWithSizeHandler(A_UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("4 fields", () => {
                test("non-null",            () => expect(newIterableWithSizeHandler(ABCD,).hasNull,).toBeFalse(),)
                test("null at start",       () => expect(newIterableWithSizeHandler(NULL_AB,).hasNull,).toBeTrue(),)
                test("null at center",      () => expect(newIterableWithSizeHandler(A_NULL_B,).hasNull,).toBeTrue(),)
                test("null at end",         () => expect(newIterableWithSizeHandler(AB_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start",  () => expect(newIterableWithSizeHandler(UNDEFINED_AB,).hasNull,).toBeTrue(),)
                test("undefined at center", () => expect(newIterableWithSizeHandler(A_UNDEFINED_B,).hasNull,).toBeTrue(),)
                test("undefined at end",    () => expect(newIterableWithSizeHandler(AB_UNDEFINED,).hasNull,).toBeTrue(),)
                test("null + undefined",    () => expect(newIterableWithSizeHandler(A_NULL_UNDEFINED_B,).hasNull,).toBeTrue(),)
            },)
        },)
        describe("iterable with size of 1", () => {
            test("non-null",  () => expect(newIterableWithSizeOf1Handler(A,).hasNull,).toBeFalse(),)
            test("null",      () => expect(newIterableWithSizeOf1Handler(NULL,).hasNull,).toBeTrue(),)
            test("undefined", () => expect(newIterableWithSizeOf1Handler(UNDEFINED,).hasNull,).toBeTrue(),)
        },)
        describe("iterable with size of 2", () => {
            test("non-null",           () => expect(newIterableWithSizeOf2Handler(AB,).hasNull,).toBeFalse(),)
            test("null at start",      () => expect(newIterableWithSizeOf2Handler(NULL_A,).hasNull,).toBeTrue(),)
            test("null at end",        () => expect(newIterableWithSizeOf2Handler(A_NULL,).hasNull,).toBeTrue(),)
            test("undefined at start", () => expect(newIterableWithSizeOf2Handler(UNDEFINED_A,).hasNull,).toBeTrue(),)
            test("undefined at end",   () => expect(newIterableWithSizeOf2Handler(A_UNDEFINED,).hasNull,).toBeTrue(),)
        },)
    },)
    describe("hasDuplicate", () => {
        describe("array", () => {
            test("empty", () => expect(newArrayHandler(EMPTY,).hasDuplicate,).toBeFalse(),)
            test("1 field", () => expect(newArrayHandler(A,).hasDuplicate,).toBeFalse(),)
            describe("2 fields", () => {
                test("unique",     () => expect(newArrayHandler(AB,).hasDuplicate,).toBeFalse(),)
                test("duplicated", () => expect(newArrayHandler(AA,).hasDuplicate,).toBeTrue(),)
            },)
            describe("4|5 fields", () => {
                test("unique",               () => expect(newArrayHandler(ABCD,).hasDuplicate,).toBeFalse(),)
                test("duplicative",          () => expect(newArrayHandler(ABAB,).hasDuplicate,).toBeTrue(),)
                test("1 null + 1 undefined", () => expect(newArrayHandler(A_NULL_UNDEFINED_B,).hasDuplicate,).toBeFalse(),)
                test("2 null + 1 undefined", () => expect(newArrayHandler(A_NULL_NULL_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("1 null + 2 undefined", () => expect(newArrayHandler(A_NULL_UNDEFINED_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("2 a + 1 b",            () => expect(newArrayHandler(AABC,).hasDuplicate,).toBeTrue(),)
                test("1 a + 2 b",            () => expect(newArrayHandler(ABBC,).hasDuplicate,).toBeTrue(),)
            },)
        },)
        test("array of 1", () => expect(newArrayOf1Handler(A,).hasDuplicate,).toBeFalse(),)
        describe("array of 2", () => {
            test("unique",     () => expect(newArrayOf2Handler(AB,).hasDuplicate,).toBeFalse(),)
            test("duplicated", () => expect(newArrayOf2Handler(AA,).hasDuplicate,).toBeTrue(),)
        },)
        describe("set", () => {
            test("empty",    () => expect(newSetHandler(EMPTY,).hasDuplicate,).toBeFalse(),)
            test("1 field",  () => expect(newSetHandler(A,).hasDuplicate,).toBeFalse(),)
            test("2 fields", () => expect(newSetHandler(AB,).hasDuplicate,).toBeFalse(),)
            test("4 fields", () => expect(newSetHandler(ABCD,).hasDuplicate,).toBeFalse(),)
        },)
        test("set of 1", () => expect(newSetOf1Handler(A,).hasDuplicate,).toBeFalse(),)
        test("set of 2", () => expect(newSetOf2Handler(AB,).hasDuplicate,).toBeFalse(),)
        describe("minimalist collection holder", () => {
            test("empty", () => expect(newMinimalistCollectionHandler(EMPTY,).hasDuplicate,).toBeFalse(),)
            test("1 field", () => expect(newMinimalistCollectionHandler(A,).hasDuplicate,).toBeFalse(),)
            describe("2 fields", () => {
                test("unique",     () => expect(newMinimalistCollectionHandler(AB,).hasDuplicate,).toBeFalse(),)
                test("duplicated", () => expect(newMinimalistCollectionHandler(AA,).hasDuplicate,).toBeTrue(),)
            },)
            describe("4|5 fields", () => {
                test("unique",               () => expect(newMinimalistCollectionHandler(ABCD,).hasDuplicate,).toBeFalse(),)
                test("duplicative",          () => expect(newMinimalistCollectionHandler(ABAB,).hasDuplicate,).toBeTrue(),)
                test("1 null + 1 undefined", () => expect(newMinimalistCollectionHandler(A_NULL_UNDEFINED_B,).hasDuplicate,).toBeFalse(),)
                test("2 null + 1 undefined", () => expect(newMinimalistCollectionHandler(A_NULL_NULL_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("1 null + 2 undefined", () => expect(newMinimalistCollectionHandler(A_NULL_UNDEFINED_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("2 a + 1 b",            () => expect(newMinimalistCollectionHandler(AABC,).hasDuplicate,).toBeTrue(),)
                test("1 a + 2 b",            () => expect(newMinimalistCollectionHandler(ABBC,).hasDuplicate,).toBeTrue(),)
            },)
        },)
        test("minimalist collection holder of 1", () => expect(newMinimalistCollectionOf1Handler(A,).hasDuplicate,).toBeFalse(),)
        describe("minimalist collection holder of 2", () => {
            test("unique",     () => expect(newMinimalistCollectionOf2Handler(AB,).hasDuplicate,).toBeFalse(),)
            test("duplicated", () => expect(newMinimalistCollectionOf2Handler(AA,).hasDuplicate,).toBeTrue(),)
        },)
        describe("collection holder", () => {
            test("empty", () => expect(newCollectionHandler(EMPTY,).hasDuplicate,).toBeFalse(),)
            test("1 field", () => expect(newCollectionHandler(A,).hasDuplicate,).toBeFalse(),)
            describe("2 fields", () => {
                test("unique",     () => expect(newCollectionHandler(AB,).hasDuplicate,).toBeFalse(),)
                test("duplicated", () => expect(newCollectionHandler(AA,).hasDuplicate,).toBeTrue(),)
            },)
            describe("4|5 fields", () => {
                test("unique",               () => expect(newCollectionHandler(ABCD,).hasDuplicate,).toBeFalse(),)
                test("duplicative",          () => expect(newCollectionHandler(ABAB,).hasDuplicate,).toBeTrue(),)
                test("1 null + 1 undefined", () => expect(newCollectionHandler(A_NULL_UNDEFINED_B,).hasDuplicate,).toBeFalse(),)
                test("2 null + 1 undefined", () => expect(newCollectionHandler(A_NULL_NULL_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("1 null + 2 undefined", () => expect(newCollectionHandler(A_NULL_UNDEFINED_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("2 a + 1 b",            () => expect(newCollectionHandler(AABC,).hasDuplicate,).toBeTrue(),)
                test("1 a + 2 b",            () => expect(newCollectionHandler(ABBC,).hasDuplicate,).toBeTrue(),)
            },)
        },)
        test("collection holder of 1", () => expect(newArrayOf1Handler(A,).hasDuplicate,).toBeFalse(),)
        describe("collection holder of 2", () => {
            test("unique",     () => expect(newCollectionOf2Handler(AB,).hasDuplicate,).toBeFalse(),)
            test("duplicated", () => expect(newCollectionOf2Handler(AA,).hasDuplicate,).toBeTrue(),)
        },)
        describe("iterator", () => {
            test("empty", () => expect(newIteratorHandler(EMPTY,).hasDuplicate,).toBeFalse(),)
            test("1 field", () => expect(newIteratorHandler(A,).hasDuplicate,).toBeFalse(),)
            describe("2 fields", () => {
                test("unique",     () => expect(newIteratorHandler(AB,).hasDuplicate,).toBeFalse(),)
                test("duplicated", () => expect(newIteratorHandler(AA,).hasDuplicate,).toBeTrue(),)
            },)
            describe("4|5 fields", () => {
                test("unique",               () => expect(newIteratorHandler(ABCD,).hasDuplicate,).toBeFalse(),)
                test("duplicative",          () => expect(newIteratorHandler(ABAB,).hasDuplicate,).toBeTrue(),)
                test("1 null + 1 undefined", () => expect(newIteratorHandler(A_NULL_UNDEFINED_B,).hasDuplicate,).toBeFalse(),)
                test("2 null + 1 undefined", () => expect(newIteratorHandler(A_NULL_NULL_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("1 null + 2 undefined", () => expect(newIteratorHandler(A_NULL_UNDEFINED_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("2 a + 1 b",            () => expect(newIteratorHandler(AABC,).hasDuplicate,).toBeTrue(),)
                test("1 a + 2 b",            () => expect(newIteratorHandler(ABBC,).hasDuplicate,).toBeTrue(),)
            },)
        },)
        describe("collection iterator", () => {
            test("empty", () => expect(newCollectionIteratorHandler(EMPTY,).hasDuplicate,).toBeFalse(),)
            test("1 field", () => expect(newCollectionIteratorHandler(A,).hasDuplicate,).toBeFalse(),)
            describe("2 fields", () => {
                test("unique",     () => expect(newCollectionIteratorHandler(AB,).hasDuplicate,).toBeFalse(),)
                test("duplicated", () => expect(newCollectionIteratorHandler(AA,).hasDuplicate,).toBeTrue(),)
            },)
            describe("4|5 fields", () => {
                test("unique",               () => expect(newCollectionIteratorHandler(ABCD,).hasDuplicate,).toBeFalse(),)
                test("duplicative",          () => expect(newCollectionIteratorHandler(ABAB,).hasDuplicate,).toBeTrue(),)
                test("1 null + 1 undefined", () => expect(newCollectionIteratorHandler(A_NULL_UNDEFINED_B,).hasDuplicate,).toBeFalse(),)
                test("2 null + 1 undefined", () => expect(newCollectionIteratorHandler(A_NULL_NULL_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("1 null + 2 undefined", () => expect(newCollectionIteratorHandler(A_NULL_UNDEFINED_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("2 a + 1 b",            () => expect(newCollectionIteratorHandler(AABC,).hasDuplicate,).toBeTrue(),)
                test("1 a + 2 b",            () => expect(newCollectionIteratorHandler(ABBC,).hasDuplicate,).toBeTrue(),)
            },)
        },)
        test("collection iterator of 1", () => expect(newCollectionIteratorOf1Handler(A,).hasDuplicate,).toBeFalse(),)
        describe("collection iterator of 2", () => {
            test("unique",     () => expect(newCollectionIteratorOf2Handler(AB,).hasDuplicate,).toBeFalse(),)
            test("duplicated", () => expect(newCollectionIteratorOf2Handler(AA,).hasDuplicate,).toBeTrue(),)
        },)
        describe("iterable", () => {
            test("empty", () => expect(newIterableHandler(EMPTY,).hasDuplicate,).toBeFalse(),)
            test("1 field", () => expect(newIterableHandler(A,).hasDuplicate,).toBeFalse(),)
            describe("2 fields", () => {
                test("unique",     () => expect(newIterableHandler(AB,).hasDuplicate,).toBeFalse(),)
                test("duplicated", () => expect(newIterableHandler(AA,).hasDuplicate,).toBeTrue(),)
            },)
            describe("4|5 fields", () => {
                test("unique",               () => expect(newIterableHandler(ABCD,).hasDuplicate,).toBeFalse(),)
                test("duplicative",          () => expect(newIterableHandler(ABAB,).hasDuplicate,).toBeTrue(),)
                test("1 null + 1 undefined", () => expect(newIterableHandler(A_NULL_UNDEFINED_B,).hasDuplicate,).toBeFalse(),)
                test("2 null + 1 undefined", () => expect(newIterableHandler(A_NULL_NULL_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("1 null + 2 undefined", () => expect(newIterableHandler(A_NULL_UNDEFINED_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("2 a + 1 b",            () => expect(newIterableHandler(AABC,).hasDuplicate,).toBeTrue(),)
                test("1 a + 2 b",            () => expect(newIterableHandler(ABBC,).hasDuplicate,).toBeTrue(),)
            },)
        },)
        describe("iterable with size", () => {
            test("empty", () => expect(newIterableWithSizeHandler(EMPTY,).hasDuplicate,).toBeFalse(),)
            test("1 field", () => expect(newIterableWithSizeHandler(A,).hasDuplicate,).toBeFalse(),)
            describe("2 fields", () => {
                test("unique",     () => expect(newIterableWithSizeHandler(AB,).hasDuplicate,).toBeFalse(),)
                test("duplicated", () => expect(newIterableWithSizeHandler(AA,).hasDuplicate,).toBeTrue(),)
            },)
            describe("4|5 fields", () => {
                test("unique",               () => expect(newIterableWithSizeHandler(ABCD,).hasDuplicate,).toBeFalse(),)
                test("duplicative",          () => expect(newIterableWithSizeHandler(ABAB,).hasDuplicate,).toBeTrue(),)
                test("1 null + 1 undefined", () => expect(newIterableWithSizeHandler(A_NULL_UNDEFINED_B,).hasDuplicate,).toBeFalse(),)
                test("2 null + 1 undefined", () => expect(newIterableWithSizeHandler(A_NULL_NULL_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("1 null + 2 undefined", () => expect(newIterableWithSizeHandler(A_NULL_UNDEFINED_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("2 a + 1 b",            () => expect(newIterableWithSizeHandler(AABC,).hasDuplicate,).toBeTrue(),)
                test("1 a + 2 b",            () => expect(newIterableWithSizeHandler(ABBC,).hasDuplicate,).toBeTrue(),)
            },)
        },)
        test("iterable with size of 1", () => expect(newIterableWithSizeOf1Handler(A,).hasDuplicate,).toBeFalse(),)
        describe("iterable with size of 2", () => {
            test("unique",     () => expect(newIterableWithSizeOf2Handler(AB,).hasDuplicate,).toBeFalse(),)
            test("duplicated", () => expect(newIterableWithSizeOf2Handler(AA,).hasDuplicate,).toBeTrue(),)
        },)
    },)
    describe("hasFinished", () => {
        //TODO add tests "after the get" for Set, MinimalistCollectionHolder, CollectionHolder, Iterator, CollectionIterator, Iterable & IterableWithSize
        describe("array", () => {
            test("empty", () => expect(newArrayHandler(EMPTY,).hasFinished,).toBeTrue(),)
            describe("1 field", () => {
                test("direct",    () => expect(newArrayHandler(A,).hasFinished,).toBeFalse(),)
                test("after get", () => expect(retrieve1st(newArrayHandler(A, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
            },)
            describe("2 fields", () => {
                test("direct",        () => expect(newArrayHandler(AB,).hasFinished,).toBeFalse(),)
                test("after 1st get", () => expect(retrieve1st(newArrayHandler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeFalse(),)
                test("after 2nd get", () => expect(retrieve2nd(newArrayHandler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeFalse(),)
                test("after all get", () => expect(retrieve1stTo2nd(newArrayHandler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
            },)
            describe("4 fields", () => {
                test("direct",        () => expect(newArrayHandler(ABCD,).hasFinished,).toBeFalse(),)
                test("after 1st get", () => expect(retrieve1st(newArrayHandler(ABCD, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeFalse(),)
                test("after 2nd get", () => expect(retrieve2nd(newArrayHandler(ABCD, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeFalse(),)
                test("after 3rd get", () => expect(retrieve3rd(newArrayHandler(ABCD, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeFalse(),)
                test("after 4th get", () => expect(retrieve4th(newArrayHandler(ABCD, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeFalse(),)
                test("after all get", () => expect(retrieve1stTo4th(newArrayHandler(ABCD, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
            },)
        },)
        describe("array of 1", () => {
            test("direct",    () => expect(newArrayOf1Handler(A,).hasFinished,).toBeFalse(),)
            test("after get", () => expect(retrieve1st(newArrayOf1Handler(A, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
        },)
        describe("array of 2", () => {
            test("direct",        () => expect(newArrayOf2Handler(AB,).hasFinished,).toBeFalse(),)
            test("after 1st get", () => expect(retrieve1st(newArrayOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeFalse(),)
            test("after 2nd get", () => expect(retrieve2nd(newArrayOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeFalse(),)
            test("after all get", () => expect(retrieve1stTo2nd(newArrayOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
        },)

        test("set: empty",    () => expect(newSetHandler(EMPTY,).hasFinished,).toBeTrue(),)
        test("set: 1 field",  () => expect(newSetHandler(A,).hasFinished,).toBeFalse(),)
        test("set: 2 fields", () => expect(newSetHandler(AB,).hasFinished,).toBeFalse(),)
        test("set: 4 fields", () => expect(newSetHandler(ABCD,).hasFinished,).toBeFalse(),)
        describe("set of 1", () => {
            test("direct",    () => expect(newSetOf1Handler(A,).hasFinished,).toBeFalse(),)
            test("after get", () => expect(retrieve1st(newSetOf1Handler(A, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
        },)
        describe("set of 2", () => {
            test("direct",        () => expect(newSetOf2Handler(AB,).hasFinished,).toBeFalse(),)
            test("after 1st get", () => expect(retrieve1st(newSetOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeFalse(),)
            test("after 2nd get", () => expect(retrieve2nd(newSetOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
            test("after all get", () => expect(retrieve1stTo2nd(newSetOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
        },)

        test("minimalist collection holder: empty",    () => expect(newMinimalistCollectionHandler(EMPTY,).hasFinished,).toBeTrue(),)
        test("minimalist collection holder: 1 field",  () => expect(newMinimalistCollectionHandler(A,).hasFinished,).toBeFalse(),)
        test("minimalist collection holder: 2 fields", () => expect(newMinimalistCollectionHandler(AB,).hasFinished,).toBeFalse(),)
        test("minimalist collection holder: 4 fields", () => expect(newMinimalistCollectionHandler(ABCD,).hasFinished,).toBeFalse(),)
        describe("minimalist collection holder of 1", () => {
            test("direct",    () => expect(newMinimalistCollectionOf1Handler(A,).hasFinished,).toBeFalse(),)
            test("after get", () => expect(retrieve1st(newMinimalistCollectionOf1Handler(A, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
        },)
        describe("minimalist collection holder of 2", () => {
            test("direct",        () => expect(newMinimalistCollectionOf2Handler(AB,).hasFinished,).toBeFalse(),)
            test("after 1st get", () => expect(retrieve1st(newMinimalistCollectionOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeFalse(),)
            test("after 2nd get", () => expect(retrieve2nd(newMinimalistCollectionOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeFalse(),)
            test("after all get", () => expect(retrieve1stTo2nd(newMinimalistCollectionOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
        },)

        test("collection holder: empty",    () => expect(newCollectionHandler(EMPTY,).hasFinished,).toBeTrue(),)
        test("collection holder: 1 field",  () => expect(newCollectionHandler(A,).hasFinished,).toBeFalse(),)
        test("collection holder: 2 fields", () => expect(newCollectionHandler(AB,).hasFinished,).toBeFalse(),)
        test("collection holder: 4 fields", () => expect(newCollectionHandler(ABCD,).hasFinished,).toBeFalse(),)
        describe("collection holder of 1", () => {
            test("direct",    () => expect(newCollectionOf1Handler(A,).hasFinished,).toBeFalse(),)
            test("after get", () => expect(retrieve1st(newCollectionOf1Handler(A, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
        },)
        describe("collection holder of 2", () => {
            test("direct",        () => expect(newCollectionOf2Handler(AB,).hasFinished,).toBeFalse(),)
            test("after 1st get", () => expect(retrieve1st(newCollectionOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeFalse(),)
            test("after 2nd get", () => expect(retrieve2nd(newCollectionOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeFalse(),)
            test("after all get", () => expect(retrieve1stTo2nd(newCollectionOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
        },)

        test("iterator: empty",    () => expect(newIteratorHandler(EMPTY,).hasFinished,).toBeTrue(),)
        test("iterator: 1 field",  () => expect(newIteratorHandler(A,).hasFinished,).toBeFalse(),)
        test("iterator: 2 fields", () => expect(newIteratorHandler(AB,).hasFinished,).toBeFalse(),)
        test("iterator: 4 fields", () => expect(newIteratorHandler(ABCD,).hasFinished,).toBeFalse(),)

        test("collection iterator: empty",    () => expect(newCollectionIteratorHandler(EMPTY,).hasFinished,).toBeTrue(),)
        test("collection iterator: 1 field",  () => expect(newCollectionIteratorHandler(A,).hasFinished,).toBeFalse(),)
        test("collection iterator: 2 fields", () => expect(newCollectionIteratorHandler(AB,).hasFinished,).toBeFalse(),)
        test("collection iterator: 4 fields", () => expect(newCollectionIteratorHandler(ABCD,).hasFinished,).toBeFalse(),)
        describe("collection iterator of 1", () => {
            test("direct",    () => expect(newCollectionIteratorOf1Handler(A,).hasFinished,).toBeFalse(),)
            test("after get", () => expect(retrieve1st(newCollectionIteratorOf1Handler(A, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
        },)
        describe("collection iterator of 2", () => {
            test("direct",        () => expect(newCollectionIteratorOf2Handler(AB,).hasFinished,).toBeFalse(),)
            test("after 1st get", () => expect(retrieve1st(newCollectionIteratorOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeFalse(),)
            test("after 2nd get", () => expect(retrieve2nd(newCollectionIteratorOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
            test("after all get", () => expect(retrieve1stTo2nd(newCollectionIteratorOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
        },)

        test("iterable: empty",    () => expect(newIterableHandler(EMPTY,).hasFinished,).toBeTrue(),)
        test("iterable: 1 field",  () => expect(newIterableHandler(A,).hasFinished,).toBeFalse(),)
        test("iterable: 2 fields", () => expect(newIterableHandler(AB,).hasFinished,).toBeFalse(),)
        test("iterable: 4 fields", () => expect(newIterableHandler(ABCD,).hasFinished,).toBeFalse(),)

        test("iterable with size: empty",    () => expect(newIterableWithSizeHandler(EMPTY,).hasFinished,).toBeTrue(),)
        test("iterable with size: 1 field",  () => expect(newIterableWithSizeHandler(A,).hasFinished,).toBeFalse(),)
        test("iterable with size: 2 fields", () => expect(newIterableWithSizeHandler(AB,).hasFinished,).toBeFalse(),)
        test("iterable with size: 4 fields", () => expect(newIterableWithSizeHandler(ABCD,).hasFinished,).toBeFalse(),)
        describe("iterable with size of 1", () => {
            test("direct",    () => expect(newIterableWithSizeOf1Handler(A,).hasFinished,).toBeFalse(),)
            test("after get", () => expect(retrieve1st(newIterableWithSizeOf1Handler(A, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
        },)
        describe("iterable with size of 2", () => {
            test("direct",        () => expect(newIterableWithSizeOf2Handler(AB,).hasFinished,).toBeFalse(),)
            test("after 1st get", () => expect(retrieve1st(newIterableWithSizeOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeFalse(),)
            test("after 2nd get", () => expect(retrieve2nd(newIterableWithSizeOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
            test("after all get", () => expect(retrieve1stTo2nd(newIterableWithSizeOf2Handler(AB, new CollectionHolderHoldingNothing(),),).hasFinished,).toBeTrue(),)
        },)
    },)

},)

//#region -------------------- Retrieval methods --------------------

function retrieve1st<const HANDLER extends CollectionHandler, >(handler: HANDLER,): HANDLER {
    handler.get(0,)
    return handler
}

function retrieve1stTo2nd<const HANDLER extends CollectionHandler, >(handler: HANDLER,): HANDLER {
    handler.get(0,)
    handler.get(1,)
    return handler
}

function retrieve1stTo4th<const HANDLER extends CollectionHandler, >(handler: HANDLER,): HANDLER {
    handler.get(0,)
    handler.get(1,)
    handler.get(2,)
    handler.get(3,)
    return handler
}

function retrieve2nd<const HANDLER extends CollectionHandler, >(handler: HANDLER,): HANDLER {
    handler.get(1,)
    return handler
}

function retrieve3rd<const HANDLER extends CollectionHandler, >(handler: HANDLER,): HANDLER {
    handler.get(2,)
    return handler
}

function retrieve4th<const HANDLER extends CollectionHandler, >(handler: HANDLER,): HANDLER {
    handler.get(3,)
    return handler
}

//#endregion -------------------- Retrieval methods --------------------

/**
 * Do an action on the {@link CollectionHandler} created,
 * but keep the {@link CollectionHolder} reference to be returned
 *
 * @param handlerCreation The callback to create the {@link CollectionHandler}
 * @param action The action to do
 */
function execute<const T, const HANDLER extends CollectionHandler, >(handlerCreation: (collection: CollectionHolderHoldingNothing<T>,) => HANDLER, action: (it: HANDLER,) => unknown,): CollectionHolderHoldingNothing<T> {
    const collection = new CollectionHolderHoldingNothing<T>()
    action(handlerCreation(collection,),)
    return collection
}
