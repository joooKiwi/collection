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

import {InfiniteCollectionHolder} from "./instance/InfiniteCollectionHolder"
import {callbackAsFail0}          from "./value/callbacks (fail)"
import {callbackToString0}        from "./value/callbacks (string)"

import {ForbiddenIndexException} from "../src/exception/ForbiddenIndexException"

describe("CollectionHolderTest (∞ iterator)", () => {

    // A stack overflow exception is expected to be done (and it may take a while → ≈9-10 seconds)
    test.concurrent("size",         async () => expect(() => new InfiniteCollectionHolder().size,)               .toThrow(RangeError,),)
    test(           "is empty",                 () => expect(new InfiniteCollectionHolder().isEmpty,)            .toBeFalse(),)
    test(           "is not empty",             () => expect(new InfiniteCollectionHolder().isEmpty,)            .toBeTrue(),)
    test(           "has exactly 1 element",    () => expect(new InfiniteCollectionHolder().hasExactly1Element,) .toBeFalse(),)
    test(           "has at most 1 element",    () => expect(new InfiniteCollectionHolder().hasAtMost1Element,)  .toBeFalse(),)
    test(           "has at least 2 elements",  () => expect(new InfiniteCollectionHolder().hasAtLeast2Elements,).toBeTrue(),)
    test(           "has exactly 2 elements",   () => expect(new InfiniteCollectionHolder().hasExactly2Elements,).toBeFalse(),)
    test(           "has at most 2 elements",   () => expect(new InfiniteCollectionHolder().hasAtMost2Elements,) .toBeFalse(),)
    test.concurrent("has null",     async () => expect(() => new InfiniteCollectionHolder().hasNull,)            .toThrow(RangeError,),)
    test.concurrent("has no nulls", async () => expect(() => new InfiniteCollectionHolder().hasNoNulls,)         .toThrow(RangeError,),)
    test           ("has duplicate",            () => expect(new InfiniteCollectionHolder().hasDuplicate,)       .toBeTrue(),)
    test           ("has no duplicates",        () => expect(new InfiniteCollectionHolder().hasDuplicate,)       .toBeFalse(),)

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
