/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {InfiniteCollectionHolder} from "./instance/InfiniteCollectionHolder"
import {callbackAsFail0}          from "./value/callbacks (fail)"
import {callbackToString0}        from "./value/callbacks (string)"

import {ForbiddenIndexException} from "../src/exception/ForbiddenIndexException"

describe("LazyCollectionHolderTest (∞ iterator)", () => {
    // README: The duplicate cannot be tested since it gives a Jest heap exception (too much arguments),
    // And as such, it should work as intended
    // const newNonDuplicateCollection = () => new LazyCollectionHolderThatCanRetrieveHandler<number>({ *[Symbol.iterator]() {
    //     let value = 0
    //     while (true) {
    //         yield value
    //         value += 0.000_000_000_1
    //     }
    // },},)

    // A stack overflow exception is expected to be done (and it may take a while → ≈9-10 seconds)
    test.concurrent("size",          async () => expect(() => new InfiniteCollectionHolder().size,).toThrow(RangeError,),)
    test(           "is empty",      () => expect(new InfiniteCollectionHolder().isEmpty,).toBeFalse(),)
    test.concurrent("has null",      async () => expect(() => new InfiniteCollectionHolder().hasNull,).toThrow(RangeError,),)
    test           ("has duplicate", () => expect(new InfiniteCollectionHolder().hasDuplicate,).toBeTrue(),)

    test("get: NaN", () => expect(() => new InfiniteCollectionHolder().get(NaN,),).toThrow(ForbiddenIndexException,),)
    test("get: -∞",  () => expect(() => new InfiniteCollectionHolder().get(-Infinity,),).toThrow(ForbiddenIndexException,),)
    test("get: -1",  () => expect(() => new InfiniteCollectionHolder().get(-1,),).toThrow(RangeError,),)
    test("get: 0",   () => expect(new InfiniteCollectionHolder().get(0,),).toBe('a',),)
    test("get: +∞",  () => expect(() => new InfiniteCollectionHolder().get(Infinity,),).toThrow(ForbiddenIndexException,),)

    test("getOrElse: NaN", () => expect(new InfiniteCollectionHolder().getOrElse(NaN, callbackToString0,),).toBe('E',),)
    test("getOrElse: -∞",  () => expect(new InfiniteCollectionHolder().getOrElse(-Infinity, callbackToString0,),).toBe('E',),)
    test("getOrElse: -1",  () => expect(() => new InfiniteCollectionHolder().getOrElse(-1, callbackAsFail0,),).toThrow(RangeError,),)
    test("getOrElse: 0",   () => expect(new InfiniteCollectionHolder().getOrElse(0, callbackAsFail0,),).toBe('a',),)
    test("getOrElse: +∞",  () => expect(new InfiniteCollectionHolder().getOrElse(Infinity, callbackToString0,),).toBe('E',),)

    test("getOrNull: NaN", () => expect(new InfiniteCollectionHolder().getOrNull(NaN,),).toBeNull(),)
    test("getOrNull: -∞",  () => expect(new InfiniteCollectionHolder().getOrNull(-Infinity,),).toBeNull(),)
    test("getOrNull: -1",  () => expect(() => new InfiniteCollectionHolder().getOrNull(-1,),).toThrow(RangeError,),)
    test("getOrNull: 0",   () => expect(new InfiniteCollectionHolder().getOrNull(0,),).toBe('a',),)
    test("getOrNull: +∞",  () => expect(new InfiniteCollectionHolder().getOrNull(Infinity,),).toBeNull(),)
},)
