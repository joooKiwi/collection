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

import type {CollectionHandler} from "../src/handler/CollectionHandler"

import {expectIndexesInCollectionOf1ToBePresent}          from "./expect/expectIndexesInCollectionOf1ToBePresent"
import {expectIndexesInCollectionOf1ToBeNotPresent}       from "./expect/expectIndexesInCollectionOf1ToBeNotPresent"
import {expectIndexesInCollectionOf2ToBePresent}          from "./expect/expectIndexesInCollectionOf2ToBePresent"
import {expectIndexesInCollectionOf2ToBeNotPresent}       from "./expect/expectIndexesInCollectionOf2ToBeNotPresent"
import {expectIndexesInCollectionOf2ToOnlyHave1stPresent} from "./expect/expectIndexesInCollectionOf2ToOnlyHave1stPresent"
import {expectIndexesInCollectionOf4ToBePresent}          from "./expect/expectIndexesInCollectionOf4ToBePresent"
import {expectIndexesInCollectionOf4ToBeNotPresent}       from "./expect/expectIndexesInCollectionOf4ToBeNotPresent"
import {expectIndexesInCollectionOf4ToOnlyHave1stPresent} from "./expect/expectIndexesInCollectionOf4ToOnlyHave1stPresent"
import {newArrayHandler}                                  from "./helper/newArrayHandler"
import {newArrayOf1Handler}                               from "./helper/newArrayOf1Handler"
import {newArrayOf2Handler}                               from "./helper/newArrayOf2Handler"
import {newCollectionHandler}                             from "./helper/newCollectionHandler"
import {newCollectionIteratorHandler}                     from "./helper/newCollectionIteratorHandler"
import {newCollectionIteratorOf1Handler}                  from "./helper/newCollectionIteratorOf1Handler"
import {newCollectionIteratorOf2Handler}                  from "./helper/newCollectionIteratorOf2Handler"
import {newCollectionOf1Handler}                          from "./helper/newCollectionOf1Handler"
import {newCollectionOf2Handler}                          from "./helper/newCollectionOf2Handler"
import {newEmptyHandler}                                  from "./helper/newEmptyHandler"
import {newIterableHandler}                               from "./helper/newIterableHandler"
import {newIterableWithSizeHandler}                       from "./helper/newIterableWithSizeHandler"
import {newIterableWithSizeOf1Handler}                    from "./helper/newIterableWithSizeOf1Handler"
import {newIterableWithSizeOf2Handler}                    from "./helper/newIterableWithSizeOf2Handler"
import {newIteratorHandler}                               from "./helper/newIteratorHandler"
import {newMinimalistCollectionHandler}                   from "./helper/newMinimalistCollectionHandler"
import {newMinimalistCollectionOf1Handler}                from "./helper/newMinimalistCollectionOf1Handler"
import {newMinimalistCollectionOf2Handler}                from "./helper/newMinimalistCollectionOf2Handler"
import {newSetHandler}                                    from "./helper/newSetHandler"
import {newSetOf1Handler}                                 from "./helper/newSetOf1Handler"
import {newSetOf2Handler}                                 from "./helper/newSetOf2Handler"
import {sizeValues}                                       from "./value/sizes"
import {CollectionHolderHoldingNothing}                   from "./instance/CollectionHolderHoldingNothing"
import {A, AB, ABCD, NULL_UNDEFINED}                      from "./value/arrays"

import {isEmpty, isEmptyByArray, isEmptyByCollectionHolder, isEmptyByMinimalistCollectionHolder}             from "../src/method/isEmpty"
import {isNotEmpty, isNotEmptyByArray, isNotEmptyByCollectionHolder, isNotEmptyByMinimalistCollectionHolder} from "../src/method/isNotEmpty"

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

            test("iterator: 1 field",  () => expectIndexesInCollectionOf1ToBePresent(execute(it => newIteratorHandler(A, it,), it => it.size,),),)
            test("iterator: 2 fields", () => expectIndexesInCollectionOf2ToBePresent(execute(it => newIteratorHandler(AB, it,), it => it.size,),),)
            test("iterator: 4 fields", () => expectIndexesInCollectionOf4ToBePresent(execute(it => newIteratorHandler(ABCD, it,), it => it.size,),),)

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

            test("iterator: 1 field",  () => expectIndexesInCollectionOf1ToBePresent(execute(it => newIteratorHandler(A, it,), it => it.isEmpty,),),)
            test("iterator: 2 fields", () => expectIndexesInCollectionOf2ToOnlyHave1stPresent(execute(it => newIteratorHandler(AB, it,), it => it.isEmpty,),),)
            test("iterator: 4 fields", () => expectIndexesInCollectionOf4ToOnlyHave1stPresent(execute(it => newIteratorHandler(ABCD, it,), it => it.isEmpty,),),)

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

    describe.each(NULL_UNDEFINED,)("%s", it => {
        describe("isEmpty", () => {
            test("all",                          () => expect(isEmpty(it,),).toBeTrue(),)
            test("minimalist collection holder", () => expect(isEmptyByMinimalistCollectionHolder(it,),).toBeTrue(),)
            test("collection holder",            () => expect(isEmptyByCollectionHolder(it,),).toBeTrue(),)
            test("array",                        () => expect(isEmptyByArray(it,),).toBeTrue(),)
        },)
        describe("isNotEmpty", () => {
            test("all",                          () => expect(isNotEmpty(it,),).toBeFalse(),)
            test("minimalist collection holder", () => expect(isNotEmptyByMinimalistCollectionHolder(it,),).toBeFalse(),)
            test("collection holder",            () => expect(isNotEmptyByCollectionHolder(it,),).toBeFalse(),)
            test("array",                        () => expect(isNotEmptyByArray(it,),).toBeFalse(),)
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
        describe("iterator", () => {
            test("size",    () => expect(newIteratorHandler(array,).size,).toBe(size,),)
            test("isEmpty", () => expect(newIteratorHandler(array,).isEmpty,)[size == 0 ? "toBeTrue" : "toBeFalse"](),)
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
