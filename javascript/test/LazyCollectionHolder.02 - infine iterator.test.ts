/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {LazyCollectionHolderThatCanRetrieveHandler} from "./instance/LazyCollectionHolderThatCanRetrieveHandler"

import {ForbiddenIndexException} from "../src/exception/ForbiddenIndexException"

describe("LazyCollectionHolderTest (∞ iterator)", () => {
    const newCollection = () => new LazyCollectionHolderThatCanRetrieveHandler<0>({ *[Symbol.iterator]() { while (true) yield 0 },},)
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
    test.concurrent("size",          async () => expect(() => newCollection().size,).toThrow(RangeError,),)
    test(           "is empty",      () => expect(newCollection().isEmpty,).toBeFalse(),)
    test.concurrent("has null",      async () => expect(() => newCollection().hasNull,).toThrow(RangeError,),)
    test.skip/*.concurrent*/("has duplicate", async () => expect(() => newCollection().hasDuplicate,).toThrow(RangeError,),)

    describe("index = NaN", () => {
        const index = Number.NaN

        test("get",       () => expect(() => newCollection().get(index,),).toThrow(ForbiddenIndexException,),)
        test("getOrElse", () => expect(newCollection().getOrElse(index, () => 'a',),).toBe('a',),)
        test("getOrNull", () => expect(newCollection().getOrNull(index,),).toBeNull(),)
    },)
    describe("index = -∞", () => {
        const index = Number.NEGATIVE_INFINITY

        test("get",       () => expect(() => newCollection().get(index,),).toThrow(ForbiddenIndexException,),)
        test("getOrElse", () => expect(newCollection().getOrElse(index, () => 'a',),).toBe('a',),)
        test("getOrNull", () => expect(newCollection().getOrNull(index,),).toBeNull(),)
    },)
    describe("index = +∞", () => {
        const index = Number.POSITIVE_INFINITY

        test("get",       () => expect(() => newCollection().get(index,),).toThrow(ForbiddenIndexException,),)
        test("getOrElse", () => expect(newCollection().getOrElse(index, () => 'a',),).toBe('a',),)
        test("getOrNull", () => expect(newCollection().getOrNull(index,),).toBeNull(),)
    },)
},)
