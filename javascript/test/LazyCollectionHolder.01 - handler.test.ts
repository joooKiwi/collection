/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {A, AB, ABC, EMPTY}                          from "./constantCollections"
import {iterableCreation}                           from "./constantValues"
import {LazyCollectionHolderThatCanRetrieveHandler} from "./instance/LazyCollectionHolderThatCanRetrieveHandler"

describe("LazyCollectionHolderTest (handler)", () => {
    describe.each(iterableCreation,)("%s", ({value: iterableCreation, toString: message,},) => {
        /** Tell that the {@link iterableCreation} {@link Holder.value value} does fail when attempting to retrieve all of its value */
        const isFailableIterator = message() == "iterable with non-null size and fail length" || message() == "iterable with null size, not-null length and fail count"

        describe("before handler being retrieved", () => {
            const newCollection = (array: readonly unknown[],) => new LazyCollectionHolderThatCanRetrieveHandler(iterableCreation(array,),)

            if (!isFailableIterator)
                describe('0', () => {
                    test("size",          () => expect(() => newCollection(EMPTY,).size,).not.toThrow(),)
                    test("is empty",      () => expect(() => newCollection(EMPTY,).isEmpty,).not.toThrow(),)
                    test("has null",      () => expect(() => newCollection(EMPTY,).hasNull,).not.toThrow(),)
                    test("has duplicate", () => expect(() => newCollection(EMPTY,).hasDuplicate,).not.toThrow(),)
                },)
            describe('1', () => {
                test("size",          () => expect(() => newCollection(A,).size,).not.toThrow(),)
                test("is empty",      () => expect(() => newCollection(A,).isEmpty,).not.toThrow(),)
                test("has null",      () => expect(() => newCollection(A,).hasNull,).not.toThrow(),)
                test("has duplicate", () => expect(() => newCollection(A,).hasDuplicate,).not.toThrow(),)
            },)
            describe('2', () => {
                test("size",          () => expect(() => newCollection(AB,).size,).not.toThrow(),)
                test("is empty",      () => expect(() => newCollection(AB,).isEmpty,).not.toThrow(),)
                test("has null",      () => expect(() => newCollection(AB,).hasNull,).not.toThrow(),)
                test("has duplicate", () => expect(() => newCollection(AB,).hasDuplicate,).not.toThrow(),)
            },)
            describe('3', () => {
                test("size",          () => expect(() => newCollection(ABC,).size,).not.toThrow(),)
                test("is empty",      () => expect(() => newCollection(ABC,).isEmpty,).not.toThrow(),)
                test("has null",      () => expect(() => newCollection(ABC,).hasNull,).not.toThrow(),)
                test("has duplicate", () => expect(() => newCollection(ABC,).hasDuplicate,).not.toThrow(),)
            },)
        },)
        describe("after handler being retrieved", () => {
            const newCollection = (array: readonly unknown[],) => new LazyCollectionHolderThatCanRetrieveHandler(iterableCreation(array,),).retrieveHandler()

            if (!isFailableIterator)
                describe('0', () => {
                    test("size",          () => expect(() => newCollection(EMPTY,).size,).not.toThrow(),)
                    test("is empty",      () => expect(() => newCollection(EMPTY,).isEmpty,).not.toThrow(),)
                    test("has null",      () => expect(() => newCollection(EMPTY,).hasNull,).not.toThrow(),)
                    test("has duplicate", () => expect(() => newCollection(EMPTY,).hasDuplicate,).not.toThrow(),)
                },)
            describe('1', () => {
                test("size",          () => expect(() => newCollection(A,).size,).not.toThrow(),)
                test("is empty",      () => expect(() => newCollection(A,).isEmpty,).not.toThrow(),)
                test("has null",      () => expect(() => newCollection(A,).hasNull,).not.toThrow(),)
                test("has duplicate", () => expect(() => newCollection(A,).hasDuplicate,).not.toThrow(),)
            },)
            describe('2', () => {
                test("size",          () => expect(() => newCollection(AB,).size,).not.toThrow(),)
                test("is empty",      () => expect(() => newCollection(AB,).isEmpty,).not.toThrow(),)
                test("has null",      () => expect(() => newCollection(AB,).hasNull,).not.toThrow(),)
                test("has duplicate", () => expect(() => newCollection(AB,).hasDuplicate,).not.toThrow(),)
            },)
            describe('3', () => {
                test("size",          () => expect(() => newCollection(ABC,).size,).not.toThrow(),)
                test("is empty",      () => expect(() => newCollection(ABC,).isEmpty,).not.toThrow(),)
                test("has null",      () => expect(() => newCollection(ABC,).hasNull,).not.toThrow(),)
                test("has duplicate", () => expect(() => newCollection(ABC,).hasDuplicate,).not.toThrow(),)
            },)
        },)

    },)
},)
