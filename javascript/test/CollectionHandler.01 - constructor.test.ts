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

import {newArrayHandler, newArrayOf1Handler, newArrayOf2Handler}                                              from "./helper/newArrayHanders"
import {newCollectionHandler, newCollectionOf1Handler, newCollectionOf2Handler}                               from "./helper/newCollectionHandlers"
import {newCollectionIteratorHandler, newCollectionIteratorOf1Handler, newCollectionIteratorOf2Handler}       from "./helper/newCollectionIteratorHandlers"
import {newEmptyHandler}                                                                                      from "./helper/newEmptyHandler"
import {newIterableHandler}                                                                                   from "./helper/newIterableHandler"
import {newIterableWithSizeHandler, newIterableWithSizeOf1Handler, newIterableWithSizeOf2Handler}             from "./helper/newIterableWithSizeHandlers"
import {newMinimalistCollectionHandler, newMinimalistCollectionOf1Handler, newMinimalistCollectionOf2Handler} from "./helper/newMinimalistCollectionHandlers"
import {newSetHandler, newSetOf1Handler, newSetOf2Handler}                                                    from "./helper/newSetHandlers"
import {A, AB, ABC, ABCD, EMPTY}                                                                              from "./value/arrays"

describe("CollectionHandlerTest (constructor)", () => {

    test("empty", () => expect(() => newEmptyHandler(),).not.toThrow(),)
    describe("array", () => {
        test("empty",    () => expect(() => newArrayHandler(EMPTY,),).not.toThrow(),)
        test("1 field",  () => expect(() => newArrayHandler(A,),).not.toThrow(),)
        test("2 fields", () => expect(() => newArrayHandler(AB,),).not.toThrow(),)
        test("3 fields", () => expect(() => newArrayHandler(ABC,),).not.toThrow(),)
        test("4 fields", () => expect(() => newArrayHandler(ABCD,),).not.toThrow(),)
    },)
    describe("array of 1", () => {
        test("empty",    () => expect(() => newArrayOf1Handler(EMPTY,),).toThrow(),)
        test("1 field",  () => expect(() => newArrayOf1Handler(A,),).not.toThrow(),)
        test("2 fields", () => expect(() => newArrayOf1Handler(AB,),).toThrow(),)
        test("3 fields", () => expect(() => newArrayOf1Handler(ABC,),).toThrow(),)
        test("4 fields", () => expect(() => newArrayOf1Handler(ABCD,),).toThrow(),)
    },)
    describe("array of 2", () => {
        test("empty",    () => expect(() => newArrayOf2Handler(EMPTY,),).toThrow(),)
        test("1 field",  () => expect(() => newArrayOf2Handler(A,),).toThrow(),)
        test("2 fields", () => expect(() => newArrayOf2Handler(AB,),).not.toThrow(),)
        test("3 fields", () => expect(() => newArrayOf2Handler(ABC,),).toThrow(),)
        test("4 fields", () => expect(() => newArrayOf2Handler(ABCD,),).toThrow(),)
    },)
    describe("set", () => {
        test("empty",    () => expect(() => newSetHandler(EMPTY,),).not.toThrow(),)
        test("1 field",  () => expect(() => newSetHandler(A,),).not.toThrow(),)
        test("2 fields", () => expect(() => newSetHandler(AB,),).not.toThrow(),)
        test("3 fields", () => expect(() => newSetHandler(ABC,),).not.toThrow(),)
        test("4 fields", () => expect(() => newSetHandler(ABCD,),).not.toThrow(),)
    },)
    describe("set of 1", () => {
        test("empty",    () => expect(() => newSetOf1Handler(EMPTY,),).toThrow(),)
        test("1 field",  () => expect(() => newSetOf1Handler(A,),).not.toThrow(),)
        test("2 fields", () => expect(() => newSetOf1Handler(AB,),).toThrow(),)
        test("3 fields", () => expect(() => newSetOf1Handler(ABC,),).toThrow(),)
        test("4 fields", () => expect(() => newSetOf1Handler(ABCD,),).toThrow(),)
    },)
    describe("set of 2", () => {
        test("empty",    () => expect(() => newSetOf2Handler(EMPTY,),).toThrow(),)
        test("1 field",  () => expect(() => newSetOf2Handler(A,),).toThrow(),)
        test("2 fields", () => expect(() => newSetOf2Handler(AB,),).not.toThrow(),)
        test("3 fields", () => expect(() => newSetOf2Handler(ABC,),).toThrow(),)
        test("4 fields", () => expect(() => newSetOf2Handler(ABCD,),).toThrow(),)
    },)
    describe("minimalist collection holder", () => {
        test("empty",    () => expect(() => newMinimalistCollectionHandler(EMPTY,),).not.toThrow(),)
        test("1 field",  () => expect(() => newMinimalistCollectionHandler(A,),).not.toThrow(),)
        test("2 fields", () => expect(() => newMinimalistCollectionHandler(AB,),).not.toThrow(),)
        test("3 fields", () => expect(() => newMinimalistCollectionHandler(ABC,),).not.toThrow(),)
        test("4 fields", () => expect(() => newMinimalistCollectionHandler(ABCD,),).not.toThrow(),)
    },)
    describe("minimalist collection holder of 1", () => {
        test("empty",    () => expect(() => newMinimalistCollectionOf1Handler(EMPTY,),).toThrow(),)
        test("1 field",  () => expect(() => newMinimalistCollectionOf1Handler(A,),).not.toThrow(),)
        test("2 fields", () => expect(() => newMinimalistCollectionOf1Handler(AB,),).toThrow(),)
        test("3 fields", () => expect(() => newMinimalistCollectionOf1Handler(ABC,),).toThrow(),)
        test("4 fields", () => expect(() => newMinimalistCollectionOf1Handler(ABCD,),).toThrow(),)
    },)
    describe("minimalist collection holder of 2", () => {
        test("empty",    () => expect(() => newMinimalistCollectionOf2Handler(EMPTY,),).toThrow(),)
        test("1 field",  () => expect(() => newMinimalistCollectionOf2Handler(A,),).toThrow(),)
        test("2 fields", () => expect(() => newMinimalistCollectionOf2Handler(AB,),).not.toThrow(),)
        test("3 fields", () => expect(() => newMinimalistCollectionOf2Handler(ABC,),).toThrow(),)
        test("4 fields", () => expect(() => newMinimalistCollectionOf2Handler(ABCD,),).toThrow(),)
    },)
    describe("collection holder", () => {
        test("empty",    () => expect(() => newCollectionHandler(EMPTY,),).not.toThrow(),)
        test("1 field",  () => expect(() => newCollectionHandler(A,),).not.toThrow(),)
        test("2 fields", () => expect(() => newCollectionHandler(AB,),).not.toThrow(),)
        test("3 fields", () => expect(() => newCollectionHandler(ABC,),).not.toThrow(),)
        test("4 fields", () => expect(() => newCollectionHandler(ABCD,),).not.toThrow(),)
    },)
    describe("collection holder of 1", () => {
        test("empty",    () => expect(() => newCollectionOf1Handler(EMPTY,),).toThrow(),)
        test("1 field",  () => expect(() => newCollectionOf1Handler(A,),).not.toThrow(),)
        test("2 fields", () => expect(() => newCollectionOf1Handler(AB,),).toThrow(),)
        test("3 fields", () => expect(() => newCollectionOf1Handler(ABC,),).toThrow(),)
        test("4 fields", () => expect(() => newCollectionOf1Handler(ABCD,),).toThrow(),)
    },)
    describe("collection holder of 2", () => {
        test("empty",    () => expect(() => newCollectionOf2Handler(EMPTY,),).toThrow(),)
        test("1 field",  () => expect(() => newCollectionOf2Handler(A,),).toThrow(),)
        test("2 fields", () => expect(() => newCollectionOf2Handler(AB,),).not.toThrow(),)
        test("3 fields", () => expect(() => newCollectionOf2Handler(ABC,),).toThrow(),)
        test("4 fields", () => expect(() => newCollectionOf2Handler(ABCD,),).toThrow(),)
    },)
    describe("collection iterator", () => {
        test("empty",    () => expect(() => newCollectionIteratorHandler(EMPTY,),).not.toThrow(),)
        test("1 field",  () => expect(() => newCollectionIteratorHandler(A,),).not.toThrow(),)
        test("2 fields", () => expect(() => newCollectionIteratorHandler(AB,),).not.toThrow(),)
        test("3 fields", () => expect(() => newCollectionIteratorHandler(ABC,),).not.toThrow(),)
        test("4 fields", () => expect(() => newCollectionIteratorHandler(ABCD,),).not.toThrow(),)
    },)
    describe("collection iterator of 1", () => {
        test("empty",    () => expect(() => newCollectionIteratorOf1Handler(EMPTY,),).toThrow(),)
        test("1 field",  () => expect(() => newCollectionIteratorOf1Handler(A,),).not.toThrow(),)
        test("2 fields", () => expect(() => newCollectionIteratorOf1Handler(AB,),).toThrow(),)
        test("3 fields", () => expect(() => newCollectionIteratorOf1Handler(ABC,),).toThrow(),)
        test("4 fields", () => expect(() => newCollectionIteratorOf1Handler(ABCD,),).toThrow(),)
    },)
    describe("collection iterator of 2", () => {
        test("empty",    () => expect(() => newCollectionIteratorOf2Handler(EMPTY,),).toThrow(),)
        test("1 field",  () => expect(() => newCollectionIteratorOf2Handler(A,),).toThrow(),)
        test("2 fields", () => expect(() => newCollectionIteratorOf2Handler(AB,),).not.toThrow(),)
        test("3 fields", () => expect(() => newCollectionIteratorOf2Handler(ABC,),).toThrow(),)
        test("4 fields", () => expect(() => newCollectionIteratorOf2Handler(ABCD,),).toThrow(),)
    },)
    describe("iterable", () => {
        test("empty",    () => expect(() => newIterableHandler(EMPTY,),).not.toThrow(),)
        test("1 field",  () => expect(() => newIterableHandler(A,),).not.toThrow(),)
        test("2 fields", () => expect(() => newIterableHandler(AB,),).not.toThrow(),)
        test("3 fields", () => expect(() => newIterableHandler(ABC,),).not.toThrow(),)
        test("4 fields", () => expect(() => newIterableHandler(ABCD,),).not.toThrow(),)
    },)
    describe("iterable with size", () => {
        test("empty",    () => expect(() => newIterableWithSizeHandler(EMPTY,),).not.toThrow(),)
        test("1 field",  () => expect(() => newIterableWithSizeHandler(A,),).not.toThrow(),)
        test("2 fields", () => expect(() => newIterableWithSizeHandler(AB,),).not.toThrow(),)
        test("3 fields", () => expect(() => newIterableWithSizeHandler(ABC,),).not.toThrow(),)
        test("4 fields", () => expect(() => newIterableWithSizeHandler(ABCD,),).not.toThrow(),)
    },)
    describe("iterable with size of 1", () => {
        test("empty",    () => expect(() => newIterableWithSizeOf1Handler(EMPTY,),).toThrow(),)
        test("1 field",  () => expect(() => newIterableWithSizeOf1Handler(A,),).not.toThrow(),)
        test("2 fields", () => expect(() => newIterableWithSizeOf1Handler(AB,),).toThrow(),)
        test("3 fields", () => expect(() => newIterableWithSizeOf1Handler(ABC,),).toThrow(),)
        test("4 fields", () => expect(() => newIterableWithSizeOf1Handler(ABCD,),).toThrow(),)
    },)
    describe("iterable with size of 2", () => {
        test("empty",    () => expect(() => newIterableWithSizeOf2Handler(EMPTY,),).toThrow(),)
        test("1 field",  () => expect(() => newIterableWithSizeOf2Handler(A,),).toThrow(),)
        test("2 fields", () => expect(() => newIterableWithSizeOf2Handler(AB,),).not.toThrow(),)
        test("3 fields", () => expect(() => newIterableWithSizeOf2Handler(ABC,),).toThrow(),)
        test("4 fields", () => expect(() => newIterableWithSizeOf2Handler(ABCD,),).toThrow(),)
    },)

},)
