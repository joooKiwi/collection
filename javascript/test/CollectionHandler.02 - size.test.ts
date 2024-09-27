/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHandler} from "../src/handler/CollectionHandler"

import {expectIndexesInCollectionOf1ToBePresent}                                                              from "./expect/expectIndexesInCollectionOf1ToBePresent"
import {expectIndexesInCollectionOf1ToBeNotPresent}                                                           from "./expect/expectIndexesInCollectionOf1ToBeNotPresent"
import {expectIndexesInCollectionOf2ToBePresent}                                                              from "./expect/expectIndexesInCollectionOf2ToBePresent"
import {expectIndexesInCollectionOf2ToBeNotPresent}                                                           from "./expect/expectIndexesInCollectionOf2ToBeNotPresent"
import {expectIndexesInCollectionOf2ToOnlyHave1stPresent}                                                     from "./expect/expectIndexesInCollectionOf2ToOnlyHave1stPresent"
import {expectIndexesInCollectionOf4ToBePresent}                                                              from "./expect/expectIndexesInCollectionOf4ToBePresent"
import {expectIndexesInCollectionOf4ToBeNotPresent}                                                           from "./expect/expectIndexesInCollectionOf4ToBeNotPresent"
import {expectIndexesInCollectionOf4ToOnlyHave1stPresent}                                                     from "./expect/expectIndexesInCollectionOf4ToOnlyHave1stPresent"
import {newArrayHandler, newArrayOf1Handler, newArrayOf2Handler}                                              from "./helper/newArrayHanders"
import {newCollectionHandler, newCollectionOf1Handler, newCollectionOf2Handler}                               from "./helper/newCollectionHandlers"
import {newCollectionIteratorHandler, newCollectionIteratorOf1Handler, newCollectionIteratorOf2Handler}       from "./helper/newCollectionIteratorHandlers"
import {newEmptyHandler}                                                                                      from "./helper/newEmptyHandler"
import {newIterableHandler}                                                                                   from "./helper/newIterableHandler"
import {newIterableWithSizeHandler, newIterableWithSizeOf1Handler, newIterableWithSizeOf2Handler}             from "./helper/newIterableWithSizeHandlers"
import {newMinimalistCollectionHandler, newMinimalistCollectionOf1Handler, newMinimalistCollectionOf2Handler} from "./helper/newMinimalistCollectionHandlers"
import {newSetHandler, newSetOf1Handler, newSetOf2Handler}                                                    from "./helper/newSetHandlers"
import {sizeValues}                                                                                           from "./value/sizes"
import {CollectionHolderHoldingNothing}                                                                       from "./instance/CollectionHolderHoldingNothing"
import {A, AB, ABCD}                                                                                          from "./value/arrays"

describe("CollectionHandlerTest (size)", () => {

    describe("EmptyCollectionHandler", () => {
        test("size",    () => expect(newEmptyHandler().size,).toBe(0,),)
        test("isEmpty", () => expect(newEmptyHandler().isEmpty,).toBeTrue(),)
    },)

    describe("indexes being present", () => {
        describe("size", () => {
            test("array: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newArrayHandler(A, it,), it => it.size,),),)
            test("array: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newArrayHandler(AB, it,), it => it.size,),),)
            test("array: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newArrayHandler(ABCD, it,), it => it.size,),),)
            test("array of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newArrayOf1Handler(A, it,), it => it.size,),),)
            test("array of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newArrayOf2Handler(AB, it,), it => it.size,),),)

            test("set: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newSetHandler(A, it,), it => it.size,),),)
            test("set: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newSetHandler(AB, it,), it => it.size,),),)
            test("set: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newSetHandler(ABCD, it,), it => it.size,),),)
            test("set of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newSetOf1Handler(A, it,), it => it.size,),),)
            test("set of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newSetOf2Handler(AB, it,), it => it.size,),),)

            test("minimalist collection holder: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newMinimalistCollectionHandler(A, it,), it => it.size,),),)
            test("minimalist collection holder: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newMinimalistCollectionHandler(AB, it,), it => it.size,),),)
            test("minimalist collection holder: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newMinimalistCollectionHandler(ABCD, it,), it => it.size,),),)
            test("minimalist collection holder of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newMinimalistCollectionOf1Handler(A, it,), it => it.size,),),)
            test("minimalist collection holder of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newMinimalistCollectionOf2Handler(AB, it,), it => it.size,),),)

            test("collection holder: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionHandler(A, it,), it => it.size,),),)
            test("collection holder: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newCollectionHandler(AB, it,), it => it.size,),),)
            test("collection holder: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newCollectionHandler(ABCD, it,), it => it.size,),),)
            test("collection holder of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionOf1Handler(A, it,), it => it.size,),),)
            test("collection holder of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newCollectionOf2Handler(AB, it,), it => it.size,),),)

            test("collection iterator: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionIteratorHandler(A, it,), it => it.size,),),)
            test("collection iterator: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newCollectionIteratorHandler(AB, it,), it => it.size,),),)
            test("collection iterator: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newCollectionIteratorHandler(ABCD, it,), it => it.size,),),)
            test("collection iterator of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionIteratorOf1Handler(A, it,), it => it.size,),),)
            test("collection iterator of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newCollectionIteratorOf2Handler(AB, it,), it => it.size,),),)

            test("iterable: 1 field",  () => expectIndexesInCollectionOf1ToBePresent(execute(it => newIterableHandler(A, it,), it => it.size,),),)
            test("iterable: 2 fields", () => expectIndexesInCollectionOf2ToBePresent(execute(it => newIterableHandler(AB, it,), it => it.size,),),)
            test("iterable: 4 fields", () => expectIndexesInCollectionOf4ToBePresent(execute(it => newIterableHandler(ABCD, it,), it => it.size,),),)

            test("iterable with size: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newIterableWithSizeHandler(A, it,), it => it.size,),),)
            test("iterable with size: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newIterableWithSizeHandler(AB, it,), it => it.size,),),)
            test("iterable with size: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newIterableWithSizeHandler(ABCD, it,), it => it.size,),),)
            test("iterable with size of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newIterableWithSizeOf1Handler(A, it,), it => it.size,),),)
            test("iterable with size of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newIterableWithSizeOf2Handler(AB, it,), it => it.size,),),)
        },)
        describe("isEmpty", () => {
            test("array: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newArrayHandler(A, it,), it => it.isEmpty,),),)
            test("array: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newArrayHandler(AB, it,), it => it.isEmpty,),),)
            test("array: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newArrayHandler(ABCD, it,), it => it.isEmpty,),),)
            test("array of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newArrayOf1Handler(A, it,), it => it.isEmpty,),),)
            test("array of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newArrayOf2Handler(AB, it,), it => it.isEmpty,),),)

            test("set: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newSetHandler(A, it,), it => it.isEmpty,),),)
            test("set: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newSetHandler(AB, it,), it => it.isEmpty,),),)
            test("set: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newSetHandler(ABCD, it,), it => it.isEmpty,),),)
            test("set of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newSetOf1Handler(A, it,), it => it.isEmpty,),),)
            test("set of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newSetOf2Handler(AB, it,), it => it.isEmpty,),),)

            test("minimalist collection holder: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newMinimalistCollectionHandler(A, it,), it => it.isEmpty,),),)
            test("minimalist collection holder: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newMinimalistCollectionHandler(AB, it,), it => it.isEmpty,),),)
            test("minimalist collection holder: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newMinimalistCollectionHandler(ABCD, it,), it => it.isEmpty,),),)
            test("minimalist collection holder of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newMinimalistCollectionOf1Handler(A, it,), it => it.isEmpty,),),)
            test("minimalist collection holder of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newMinimalistCollectionOf2Handler(AB, it,), it => it.isEmpty,),),)

            test("collection holder: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionHandler(A, it,), it => it.isEmpty,),),)
            test("collection holder: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newCollectionHandler(AB, it,), it => it.isEmpty,),),)
            test("collection holder: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newCollectionHandler(ABCD, it,), it => it.isEmpty,),),)
            test("collection holder of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionOf1Handler(A, it,), it => it.isEmpty,),),)
            test("collection holder of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newCollectionOf2Handler(AB, it,), it => it.isEmpty,),),)

            test("collection iterator: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionIteratorHandler(A, it,), it => it.isEmpty,),),)
            test("collection iterator: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newCollectionIteratorHandler(AB, it,), it => it.isEmpty,),),)
            test("collection iterator: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newCollectionIteratorHandler(ABCD, it,), it => it.isEmpty,),),)
            test("collection iterator of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newCollectionIteratorOf1Handler(A, it,), it => it.isEmpty,),),)
            test("collection iterator of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newCollectionIteratorOf2Handler(AB, it,), it => it.isEmpty,),),)

            test("iterable: 1 field",  () => expectIndexesInCollectionOf1ToBePresent(execute(it => newIterableHandler(A, it,), it => it.isEmpty,),),)
            test("iterable: 2 fields", () => expectIndexesInCollectionOf2ToOnlyHave1stPresent(execute(it => newIterableHandler(AB, it,), it => it.isEmpty,),),)
            test("iterable: 4 fields", () => expectIndexesInCollectionOf4ToOnlyHave1stPresent(execute(it => newIterableHandler(ABCD, it,), it => it.isEmpty,),),)

            test("iterable with size: 1 field",  () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newIterableWithSizeHandler(A, it,), it => it.isEmpty,),),)
            test("iterable with size: 2 fields", () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newIterableWithSizeHandler(AB, it,), it => it.isEmpty,),),)
            test("iterable with size: 4 fields", () => expectIndexesInCollectionOf4ToBeNotPresent(execute(it => newIterableWithSizeHandler(ABCD, it,), it => it.isEmpty,),),)
            test("iterable with size of 1",      () => expectIndexesInCollectionOf1ToBeNotPresent(execute(it => newIterableWithSizeOf1Handler(A, it,), it => it.isEmpty,),),)
            test("iterable with size of 2",      () => expectIndexesInCollectionOf2ToBeNotPresent(execute(it => newIterableWithSizeOf2Handler(AB, it,), it => it.isEmpty,),),)
        },)
    },)

    describe.each(sizeValues(),)("%s", ({value: {array, size,},},) => {
        describe("array", () => {
            test("size",    () => expect(newArrayHandler(array,).size,).toBe(size,),)
            test("isEmpty", () => expect(newArrayHandler(array,).isEmpty,)[size == 0 ? "toBeTrue" : "toBeFalse"](),)
        },)
        describe("set", () => {
            test("size",    () => expect(newSetHandler(array,).size,).toBe(size,),)
            test("isEmpty", () => expect(newSetHandler(array,).isEmpty,)[size == 0 ? "toBeTrue" : "toBeFalse"](),)
        },)
        describe("minimalist collection holder", () => {
            test("size",    () => expect(newMinimalistCollectionHandler(array,).size,).toBe(size,),)
            test("isEmpty", () => expect(newMinimalistCollectionHandler(array,).isEmpty,)[size == 0 ? "toBeTrue" : "toBeFalse"](),)
        },)
        describe("collection holder", () => {
            test("size",    () => expect(newCollectionHandler(array,).size,).toBe(size,),)
            test("isEmpty", () => expect(newCollectionHandler(array,).isEmpty,)[size == 0 ? "toBeTrue" : "toBeFalse"](),)
        },)
        describe("collection iterator", () => {
            test("size",    () => expect(newCollectionIteratorHandler(array,).size,).toBe(size,),)
            test("isEmpty", () => expect(newCollectionIteratorHandler(array,).isEmpty,)[size == 0 ? "toBeTrue" : "toBeFalse"](),)
        },)
        describe("iterable", () => {
            test("size",    () => expect(newIterableHandler(array,).size,).toBe(size,),)
            test("isEmpty", () => expect(newIterableHandler(array,).isEmpty,)[size == 0 ? "toBeTrue" : "toBeFalse"](),)
        },)
        describe("iterable with size", () => {
            test("size",    () => expect(newIterableWithSizeHandler(array,).size,).toBe(size,),)
            test("isEmpty", () => expect(newIterableWithSizeHandler(array,).isEmpty,)[size == 0 ? "toBeTrue" : "toBeFalse"](),)
        },)
    },)
    describe("array of 1", () => {
        test("size",    () => expect(newArrayOf1Handler().size,).toBe(1,),)
        test("isEmpty", () => expect(newArrayOf1Handler().isEmpty,).toBeFalse(),)
    },)
    describe("array of 2", () => {
        test("size",    () => expect(newArrayOf2Handler().size,).toBe(2,),)
        test("isEmpty", () => expect(newArrayOf2Handler().isEmpty,).toBeFalse(),)
    },)
    describe("set of 1", () => {
        test("size",    () => expect(newSetOf1Handler().size,).toBe(1,),)
        test("isEmpty", () => expect(newSetOf1Handler().isEmpty,).toBeFalse(),)
    },)
    describe("set of 2", () => {
        test("size",    () => expect(newSetOf2Handler().size,).toBe(2,),)
        test("isEmpty", () => expect(newSetOf2Handler().isEmpty,).toBeFalse(),)
    },)
    describe("minimalist collection holder of 1", () => {
        test("size",    () => expect(newMinimalistCollectionOf1Handler().size,).toBe(1,),)
        test("isEmpty", () => expect(newMinimalistCollectionOf1Handler().isEmpty,).toBeFalse(),)
    },)
    describe("minimalist collection holder of 2", () => {
        test("size",    () => expect(newMinimalistCollectionOf2Handler().size,).toBe(2,),)
        test("isEmpty", () => expect(newMinimalistCollectionOf2Handler().isEmpty,).toBeFalse(),)
    },)
    describe("collection holder of 1", () => {
        test("size",    () => expect(newCollectionOf1Handler().size,).toBe(1,),)
        test("isEmpty", () => expect(newCollectionOf1Handler().isEmpty,).toBeFalse(),)
    },)
    describe("collection holder of 2", () => {
        test("size",    () => expect(newCollectionOf2Handler().size,).toBe(2,),)
        test("isEmpty", () => expect(newCollectionOf2Handler().isEmpty,).toBeFalse(),)
    },)
    describe("collection iterator of 1", () => {
        test("size",    () => expect(newCollectionIteratorOf1Handler().size,).toBe(1,),)
        test("isEmpty", () => expect(newCollectionIteratorOf1Handler().isEmpty,).toBeFalse(),)
    },)
    describe("collection iterator of 2", () => {
        test("size",    () => expect(newCollectionIteratorOf2Handler().size,).toBe(2,),)
        test("isEmpty", () => expect(newCollectionIteratorOf2Handler().isEmpty,).toBeFalse(),)
    },)
    describe("iterable with size of 1", () => {
        test("size",    () => expect(newIterableWithSizeOf1Handler().size,).toBe(1,),)
        test("isEmpty", () => expect(newIterableWithSizeOf1Handler().isEmpty,).toBeFalse(),)
    },)
    describe("iterable with size of 2", () => {
        test("size",    () => expect(newIterableWithSizeOf2Handler().size,).toBe(2,),)
        test("isEmpty", () => expect(newIterableWithSizeOf2Handler().isEmpty,).toBeFalse(),)
    },)

},)

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
