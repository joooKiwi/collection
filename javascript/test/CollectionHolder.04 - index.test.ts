/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, AB_AB, ABCD, ABCD_ABCD, EMPTY}       from "./constantCollections"
import {everyInstance}                           from "./constantValues"
import {CollectionHolderThatCountGetBeingCalled} from "./instance/CollectionHolderThatCountGetBeingCalled"

import {CollectionHolderIndexOutOfBoundsException} from "../src/exception/CollectionHolderIndexOutOfBoundsException"
import {ForbiddenIndexException}                   from "../src/exception/ForbiddenIndexException"

describe("CollectionHolderTest (index)", () => {
describe.each(everyInstance,)("%s", ({value: {newInstance,},},) => {
    describe("get() being called", () => {
        describe("index of first", () => {
            test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.indexOfFirst(() => false,),).amountOfCall,).toBe(0,),)
            test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.indexOfFirst(_ => false,),).amountOfCall,).toBe(2,),)
            test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.indexOfFirst((_1, _2,) => false,),).amountOfCall,).toBe(2,),)
        },)
        describe("index of first indexed", () => {
            test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.indexOfFirstIndexed(() => false,),).amountOfCall,).toBe(0,),)
            test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.indexOfFirstIndexed(_ => false,),).amountOfCall,).toBe(0,),)
            test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.indexOfFirstIndexed((_1, _2,) => false,),).amountOfCall,).toBe(2,),)
        },)
        describe("index of last", () => {
            test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.indexOfLast(() => false,),).amountOfCall,).toBe(0,),)
            test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.indexOfLast(_ => false,),).amountOfCall,).toBe(2,),)
            test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.indexOfLast((_1, _2,) => false,),).amountOfCall,).toBe(2,),)
        },)
        describe("index of last indexed", () => {
            test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.indexOfLastIndexed(() => false,),).amountOfCall,).toBe(0,),)
            test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.indexOfLastIndexed(_ => false,),).amountOfCall,).toBe(0,),)
            test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.indexOfLastIndexed((_1, _2,) => false,),).amountOfCall,).toBe(2,),)
        },)
    },)

    describe("index of", () => {
        describe("known null return", () => {
            test("empty",                 () => expect(newInstance(EMPTY,).indexOf('a',),).toBeNull(),)
            test("from and to index = 0", () => expect(newInstance(AB,).indexOf('a', 0, 0,),).toBeNull(),)
            test("limit = 0",             () => expect(newInstance(AB,).indexOf('a', null, null, 0,),).toBeNull(),)
        },)
        describe("[a,b]", () => {
            describe("direct", () => {
                test('a', () => expect(newInstance(AB,).indexOf('a',),).toBe(0,),)
                test('b', () => expect(newInstance(AB,).indexOf('b',),).toBe(1,),)
                test('c', () => expect(newInstance(AB,).indexOf('c',),).toBeNull(),)
            },)
            describe("from index", () => {
                test('a', () => expect(newInstance(AB,).indexOf('a', 1,),).toBeNull(),)
                test('b', () => expect(newInstance(AB,).indexOf('b', 1,),).toBe(1,),)
                test('c', () => expect(newInstance(AB,).indexOf('c', 1,),).toBeNull(),)
            },)
            describe("to index", () => {
                test('a', () => expect(newInstance(AB,).indexOf('a', null, 1,),).toBe(0,),)
                test('b', () => expect(newInstance(AB,).indexOf('b', null, 1,),).toBe(1,),)
                test('c', () => expect(newInstance(AB,).indexOf('c', null, 1,),).toBeNull(),)
            },)
            describe("limit", () => {
                test('a', () => expect(newInstance(AB,).indexOf('a', null, null, 1,),).toBe(0,),)
                test('b', () => expect(newInstance(AB,).indexOf('b', null, null, 1,),).toBeNull(),)
                test('c', () => expect(newInstance(AB,).indexOf('c', null, null, 1,),).toBeNull(),)
            },)
        },)
        describe("[a,b,c,d]", () => {
            describe("direct", () => {
                test('a', () => expect(newInstance(ABCD,).indexOf('a',),).toBe(0,),)
                test('b', () => expect(newInstance(ABCD,).indexOf('b',),).toBe(1,),)
                test('c', () => expect(newInstance(ABCD,).indexOf('c',),).toBe(2,),)
                test('d', () => expect(newInstance(ABCD,).indexOf('d',),).toBe(3,),)
            },)
            describe("from index", () => {
                test('a', () => expect(newInstance(ABCD,).indexOf('a', 2,),).toBeNull(),)
                test('b', () => expect(newInstance(ABCD,).indexOf('b', 2,),).toBeNull(),)
                test('c', () => expect(newInstance(ABCD,).indexOf('c', 2,),).toBe(2,),)
                test('d', () => expect(newInstance(ABCD,).indexOf('d', 2,),).toBe(3,),)
            },)
            describe("to index", () => {
                test('a', () => expect(newInstance(ABCD,).indexOf('a', null, 2,),).toBe(0,),)
                test('b', () => expect(newInstance(ABCD,).indexOf('b', null, 2,),).toBe(1,),)
                test('c', () => expect(newInstance(ABCD,).indexOf('c', null, 2,),).toBe(2,),)
                test('d', () => expect(newInstance(ABCD,).indexOf('d', null, 2,),).toBeNull(),)
            },)
            describe("limit", () => {
                test('a', () => expect(newInstance(ABCD,).indexOf('a', null, null, 2,),).toBe(0,),)
                test('b', () => expect(newInstance(ABCD,).indexOf('b', null, null, 2,),).toBe(1,),)
                test('c', () => expect(newInstance(ABCD,).indexOf('c', null, null, 2,),).toBeNull(),)
                test('d', () => expect(newInstance(ABCD,).indexOf('d', null, null, 2,),).toBeNull(),)
            },)
        },)
        describe("[a,b,A,B]", () => {
            describe("direct", () => {
                test('a', () => expect(newInstance(AB_AB,).indexOf('a',),).toBe(0,),)
                test('b', () => expect(newInstance(AB_AB,).indexOf('b',),).toBe(1,),)
                test('A', () => expect(newInstance(AB_AB,).indexOf('A',),).toBe(2,),)
                test('B', () => expect(newInstance(AB_AB,).indexOf('B',),).toBe(3,),)
            },)
            describe("from index", () => {
                test('a', () => expect(newInstance(AB_AB,).indexOf('a', 2,),).toBeNull(),)
                test('b', () => expect(newInstance(AB_AB,).indexOf('b', 2,),).toBeNull(),)
                test('A', () => expect(newInstance(AB_AB,).indexOf('A', 2,),).toBe(2,),)
                test('B', () => expect(newInstance(AB_AB,).indexOf('B', 2,),).toBe(3,),)
            },)
            describe("to index", () => {
                test('a', () => expect(newInstance(AB_AB,).indexOf('a', null, 2,),).toBe(0,),)
                test('b', () => expect(newInstance(AB_AB,).indexOf('b', null, 2,),).toBe(1,),)
                test('A', () => expect(newInstance(AB_AB,).indexOf('A', null, 2,),).toBe(2,),)
                test('B', () => expect(newInstance(AB_AB,).indexOf('B', null, 2,),).toBeNull(),)
            },)
            describe("limit", () => {
                test('a', () => expect(newInstance(AB_AB,).indexOf('a', null, null, 2,),).toBe(0,),)
                test('b', () => expect(newInstance(AB_AB,).indexOf('b', null, null, 2,),).toBe(1,),)
                test('A', () => expect(newInstance(AB_AB,).indexOf('A', null, null, 2,),).toBeNull(),)
                test('B', () => expect(newInstance(AB_AB,).indexOf('B', null, null, 2,),).toBeNull(),)
            },)
        },)
        describe("error", () => {
            describe("from index", () => {
                test('2',    () => expect(() => newInstance(AB,).indexOf('a', 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).indexOf('a', 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).indexOf('a', 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).indexOf('a', -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).indexOf('a', -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).indexOf('a', -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).indexOf('a', 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).indexOf('a', -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).indexOf('a', NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).indexOf('a', Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).indexOf('a', -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("to index", () => {
                test('2',    () => expect(() => newInstance(AB,).indexOf('a', null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).indexOf('a', null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).indexOf('a', null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).indexOf('a', null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).indexOf('a', null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).indexOf('a', null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).indexOf('a', null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).indexOf('a', null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).indexOf('a', null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).indexOf('a', null, Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).indexOf('a', null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("limit", () => {
                test('2',    () => expect(() => newInstance(AB,).indexOf('a', null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).indexOf('a', null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).indexOf('a', null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).indexOf('a', null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).indexOf('a', null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).indexOf('a', null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).indexOf('a', null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).indexOf('a', null, null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).indexOf('a', null, null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).indexOf('a', null, Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).indexOf('a', null, null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
        },)
        describe("negative values", () => {
            describe("from index", () => {
                test('a', () => expect(newInstance(ABCD,).indexOf('a', -2,),).toBeNull(),)
                test('b', () => expect(newInstance(ABCD,).indexOf('b', -2,),).toBeNull(),)
                test('c', () => expect(newInstance(ABCD,).indexOf('c', -2,),).toBe(2,),)
                test('d', () => expect(newInstance(ABCD,).indexOf('d', -2,),).toBe(3,),)
            },)
            describe("to index", () => {
                test('a', () => expect(newInstance(ABCD,).indexOf('a', null, -2,),).toBe(0,),)
                test('b', () => expect(newInstance(ABCD,).indexOf('b', null, -2,),).toBe(1,),)
                test('c', () => expect(newInstance(ABCD,).indexOf('c', null, -2,),).toBe(2,),)
                test('d', () => expect(newInstance(ABCD,).indexOf('d', null, -2,),).toBeNull(),)
            },)
            describe("limit", () => {
                test('a', () => expect(newInstance(ABCD,).indexOf('a', null, null, -2,),).toBe(0,),)
                test('b', () => expect(newInstance(ABCD,).indexOf('b', null, null, -2,),).toBe(1,),)
                test('c', () => expect(newInstance(ABCD,).indexOf('c', null, null, -2,),).toBeNull(),)
                test('d', () => expect(newInstance(ABCD,).indexOf('d', null, null, -2,),).toBeNull(),)
            },)
        },)
    },)
    describe("last index of", () => {
        describe("known null return", () => {
            test("empty",                 () => expect(newInstance(EMPTY,).lastIndexOf('a',),).toBeNull(),)
            test("from and to index = 0", () => expect(newInstance(AB,).lastIndexOf('a', 0, 0,),).toBeNull(),)
            test("limit = 0",             () => expect(newInstance(AB,).lastIndexOf('a', null, null, 0,),).toBeNull(),)
        },)
        describe("[a,b]", () => {
            describe("direct", () => {
                test('a', () => expect(newInstance(AB,).lastIndexOf('a',),).toBe(0,),)
                test('b', () => expect(newInstance(AB,).lastIndexOf('b',),).toBe(1,),)
                test('c', () => expect(newInstance(AB,).lastIndexOf('c',),).toBeNull(),)
            },)
            describe("from index", () => {
                test('a', () => expect(newInstance(AB,).lastIndexOf('a', 1,),).toBeNull(),)
                test('b', () => expect(newInstance(AB,).lastIndexOf('b', 1,),).toBe(1,),)
                test('c', () => expect(newInstance(AB,).lastIndexOf('c', 1,),).toBeNull(),)
            },)
            describe("to index", () => {
                test('a', () => expect(newInstance(AB,).lastIndexOf('a', null, 1,),).toBe(0,),)
                test('b', () => expect(newInstance(AB,).lastIndexOf('b', null, 1,),).toBe(1,),)
                test('c', () => expect(newInstance(AB,).lastIndexOf('c', null, 1,),).toBeNull(),)
            },)
            describe("limit", () => {
                test('a', () => expect(newInstance(AB,).lastIndexOf('a', null, null, 1,),).toBe(0,),)
                test('b', () => expect(newInstance(AB,).lastIndexOf('b', null, null, 1,),).toBeNull(),)
                test('c', () => expect(newInstance(AB,).lastIndexOf('c', null, null, 1,),).toBeNull(),)
            },)
        },)
        describe("[a,b,c,d]", () => {
            describe("direct", () => {
                test('a', () => expect(newInstance(ABCD,).lastIndexOf('a',),).toBe(0,),)
                test('b', () => expect(newInstance(ABCD,).lastIndexOf('b',),).toBe(1,),)
                test('c', () => expect(newInstance(ABCD,).lastIndexOf('c',),).toBe(2,),)
                test('d', () => expect(newInstance(ABCD,).lastIndexOf('d',),).toBe(3,),)
            },)
            describe("from index", () => {
                test('a', () => expect(newInstance(ABCD,).lastIndexOf('a', 2,),).toBeNull(),)
                test('b', () => expect(newInstance(ABCD,).lastIndexOf('b', 2,),).toBeNull(),)
                test('c', () => expect(newInstance(ABCD,).lastIndexOf('c', 2,),).toBe(2,),)
                test('d', () => expect(newInstance(ABCD,).lastIndexOf('d', 2,),).toBe(3,),)
            },)
            describe("to index", () => {
                test('a', () => expect(newInstance(ABCD,).lastIndexOf('a', null, 2,),).toBe(0,),)
                test('b', () => expect(newInstance(ABCD,).lastIndexOf('b', null, 2,),).toBe(1,),)
                test('c', () => expect(newInstance(ABCD,).lastIndexOf('c', null, 2,),).toBe(2,),)
                test('d', () => expect(newInstance(ABCD,).lastIndexOf('d', null, 2,),).toBeNull(),)
            },)
            describe("limit", () => {
                test('a', () => expect(newInstance(ABCD,).lastIndexOf('a', null, null, 2,),).toBe(0,),)
                test('b', () => expect(newInstance(ABCD,).lastIndexOf('b', null, null, 2,),).toBe(1,),)
                test('c', () => expect(newInstance(ABCD,).lastIndexOf('c', null, null, 2,),).toBeNull(),)
                test('d', () => expect(newInstance(ABCD,).lastIndexOf('d', null, null, 2,),).toBeNull(),)
            },)
        },)
        describe("[a,b,A,B]", () => {
            describe("direct", () => {
                test('a', () => expect(newInstance(AB_AB,).lastIndexOf('a',),).toBe(0,),)
                test('b', () => expect(newInstance(AB_AB,).lastIndexOf('b',),).toBe(1,),)
                test('A', () => expect(newInstance(AB_AB,).lastIndexOf('A',),).toBe(2,),)
                test('B', () => expect(newInstance(AB_AB,).lastIndexOf('B',),).toBe(3,),)
            },)
            describe("from index", () => {
                test('a', () => expect(newInstance(AB_AB,).lastIndexOf('a', 2,),).toBeNull(),)
                test('b', () => expect(newInstance(AB_AB,).lastIndexOf('b', 2,),).toBeNull(),)
                test('A', () => expect(newInstance(AB_AB,).lastIndexOf('A', 2,),).toBe(2,),)
                test('B', () => expect(newInstance(AB_AB,).lastIndexOf('B', 2,),).toBe(3,),)
            },)
            describe("to index", () => {
                test('a', () => expect(newInstance(AB_AB,).lastIndexOf('a', null, 2,),).toBe(0,),)
                test('b', () => expect(newInstance(AB_AB,).lastIndexOf('b', null, 2,),).toBe(1,),)
                test('A', () => expect(newInstance(AB_AB,).lastIndexOf('A', null, 2,),).toBe(2,),)
                test('B', () => expect(newInstance(AB_AB,).lastIndexOf('B', null, 2,),).toBeNull(),)
            },)
            describe("limit", () => {
                test('a', () => expect(newInstance(AB_AB,).lastIndexOf('a', null, null, 2,),).toBe(0,),)
                test('b', () => expect(newInstance(AB_AB,).lastIndexOf('b', null, null, 2,),).toBe(1,),)
                test('A', () => expect(newInstance(AB_AB,).lastIndexOf('A', null, null, 2,),).toBeNull(),)
                test('B', () => expect(newInstance(AB_AB,).lastIndexOf('B', null, null, 2,),).toBeNull(),)
            },)
        },)
        describe("error", () => {
            describe("from index", () => {
                test('2',    () => expect(() => newInstance(AB,).lastIndexOf('a', 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).lastIndexOf('a', 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).lastIndexOf('a', 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).lastIndexOf('a', -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).lastIndexOf('a', -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).lastIndexOf('a', -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).lastIndexOf('a', 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).lastIndexOf('a', -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).lastIndexOf('a', NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).lastIndexOf('a', Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).lastIndexOf('a', -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("to index", () => {
                test('2',    () => expect(() => newInstance(AB,).lastIndexOf('a', null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).lastIndexOf('a', null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).lastIndexOf('a', null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).lastIndexOf('a', null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).lastIndexOf('a', null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).lastIndexOf('a', null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).lastIndexOf('a', null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).lastIndexOf('a', null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).lastIndexOf('a', null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).lastIndexOf('a', null, Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).lastIndexOf('a', null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("limit", () => {
                test('2',    () => expect(() => newInstance(AB,).lastIndexOf('a', null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).lastIndexOf('a', null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).lastIndexOf('a', null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).lastIndexOf('a', null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).lastIndexOf('a', null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).lastIndexOf('a', null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).lastIndexOf('a', null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).lastIndexOf('a', null, null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).lastIndexOf('a', null, null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).lastIndexOf('a', null, null, Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).lastIndexOf('a', null, null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
        },)
        describe("negative values", () => {
            describe("from index", () => {
                test('a', () => expect(newInstance(ABCD,).lastIndexOf('a', -2,),).toBeNull(),)
                test('b', () => expect(newInstance(ABCD,).lastIndexOf('b', -2,),).toBeNull(),)
                test('c', () => expect(newInstance(ABCD,).lastIndexOf('c', -2,),).toBe(2,),)
                test('d', () => expect(newInstance(ABCD,).lastIndexOf('d', -2,),).toBe(3,),)
            },)
            describe("to index", () => {
                test('a', () => expect(newInstance(ABCD,).lastIndexOf('a', null, -2,),).toBe(0,),)
                test('b', () => expect(newInstance(ABCD,).lastIndexOf('b', null, -2,),).toBe(1,),)
                test('c', () => expect(newInstance(ABCD,).lastIndexOf('c', null, -2,),).toBe(2,),)
                test('d', () => expect(newInstance(ABCD,).lastIndexOf('d', null, -2,),).toBeNull(),)
            },)
            describe("limit", () => {
                test('a', () => expect(newInstance(ABCD,).lastIndexOf('a', null, null, -2,),).toBe(0,),)
                test('b', () => expect(newInstance(ABCD,).lastIndexOf('b', null, null, -2,),).toBe(1,),)
                test('c', () => expect(newInstance(ABCD,).lastIndexOf('c', null, null, -2,),).toBeNull(),)
                test('d', () => expect(newInstance(ABCD,).lastIndexOf('d', null, null, -2,),).toBeNull(),)
            },)
        },)
    },)

    describe("index of first", () => {
        describe("known null return", () => {
            test("empty",                 () => expect(newInstance(EMPTY,).indexOfFirst(() => fail(),),).toBeNull(),)
            test("from and to index = 0", () => expect(newInstance(AB,).indexOfFirst(() => fail(), 0, 0,),).toBeNull(),)
            test("limit = 0",             () => expect(newInstance(AB,).indexOfFirst(() => fail(), null, null, 0,),).toBeNull(),)
        },)
        describe("direct", () => {
            test("anyCase a", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'a',),).toBe(0,),)
            test("anyCase b", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'b',),).toBe(1,),)
            test("anyCase c", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'c',),).toBe(2,),)
            test("anyCase d", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'd',),).toBe(3,),)
            test("anyCase e", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'e',),).toBeNull(),)

            test('a',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'a',),).toBe(0,),)
            test('b',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'b',),).toBe(1,),)
            test('c',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'c',),).toBe(2,),)
            test('d',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'd',),).toBe(3,),)
            test('e',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst((it: string,) => it === 'e',),).toBeNull(),)
            test('A',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'A',),).toBe(4,),)
            test('B',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'B',),).toBe(5,),)
            test('C',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'C',),).toBe(6,),)
            test('D',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'D',),).toBe(7,),)
            test('E',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst((it: string,) => it === 'E',),).toBeNull(),)
        },)
        describe("from index", () => {
            test("anyCase a", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'a', 3,),).toBe(4,),)
            test("anyCase b", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'b', 3,),).toBe(5,),)
            test("anyCase c", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'c', 3,),).toBe(6,),)
            test("anyCase d", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'd', 3,),).toBe(3,),)
            test("anyCase e", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'e', 3,),).toBeNull(),)

            test('a',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'a', 3,),).toBeNull(),)
            test('b',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'b', 3,),).toBeNull(),)
            test('c',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'c', 3,),).toBeNull(),)
            test('d',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'd', 3,),).toBe(3,),)
            test('e',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst((it: string,) => it === 'e', 3,),).toBeNull(),)
            test('A',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'A', 3,),).toBe(4,),)
            test('B',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'B', 3,),).toBe(5,),)
            test('C',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'C', 3,),).toBe(6,),)
            test('D',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'D', 3,),).toBe(7,),)
            test('E',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst((it: string,) => it === 'E', 3,),).toBeNull(),)
        },)
        describe("to index", () => {
            test("anyCase a", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'a', null, 3,),).toBe(0,),)
            test("anyCase b", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'b', null, 3,),).toBe(1,),)
            test("anyCase c", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'c', null, 3,),).toBe(2,),)
            test("anyCase d", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'd', null, 3,),).toBe(3,),)
            test("anyCase e", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'e', null, 3,),).toBeNull(),)

            test('a',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'a', null, 3,),).toBe(0,),)
            test('b',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'b', null, 3,),).toBe(1,),)
            test('c',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'c', null, 3,),).toBe(2,),)
            test('d',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'd', null, 3,),).toBe(3,),)
            test('e',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst((it: string,) => it === 'e', null, 3,),).toBeNull(),)
            test('A',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'A', null, 3,),).toBeNull(),)
            test('B',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'B', null, 3,),).toBeNull(),)
            test('C',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'C', null, 3,),).toBeNull(),)
            test('D',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'D', null, 3,),).toBeNull(),)
            test('E',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst((it: string,) => it === 'E', null, 3,),).toBeNull(),)
        },)
        describe("limit", () => {
            test("anyCase a", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'a', null, null, 3,),).toBe(0,),)
            test("anyCase b", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'b', null, null, 3,),).toBe(1,),)
            test("anyCase c", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'c', null, null, 3,),).toBe(2,),)
            test("anyCase d", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'd', null, null, 3,),).toBeNull(),)
            test("anyCase e", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'e', null, null, 3,),).toBeNull(),)

            test('a',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'a', null, null, 3,),).toBe(0,),)
            test('b',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'b', null, null, 3,),).toBe(1,),)
            test('c',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'c', null, null, 3,),).toBe(2,),)
            test('d',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'd', null, null, 3,),).toBeNull(),)
            test('e',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst((it: string,) => it === 'e', null, null, 3,),).toBeNull(),)
            test('A',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'A', null, null, 3,),).toBeNull(),)
            test('B',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'B', null, null, 3,),).toBeNull(),)
            test('C',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'C', null, null, 3,),).toBeNull(),)
            test('D',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'D', null, null, 3,),).toBeNull(),)
            test('E',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst((it: string,) => it === 'E', null, null, 3,),).toBeNull(),)
        },)
        describe("error", () => {
            describe("from index", () => {
                test('2',    () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("to index", () => {
                test('2',    () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-3",   () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("limit", () => {
                test('2',    () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, null, Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).indexOfFirst(() => fail(), null, null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
        },)
        describe("negative values", () => {
            describe("from index", () => {
                test("anyCase a", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'a', -3,),).toBeNull(),)
                test("anyCase b", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'b', -3,),).toBe(5,),)
                test("anyCase c", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'c', -3,),).toBe(6,),)
                test("anyCase d", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'd', -3,),).toBe(7,),)
                test("anyCase e", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'e', -3,),).toBeNull(),)

                test('a',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'a', -3,),).toBeNull(),)
                test('b',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'b', -3,),).toBeNull(),)
                test('c',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'c', -3,),).toBeNull(),)
                test('d',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'd', -3,),).toBeNull(),)
                test('e',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst((it: string,) => it === 'e', -3,),).toBeNull(),)
                test('A',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'A', -3,),).toBeNull(),)
                test('B',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'B', -3,),).toBe(5,),)
                test('C',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'C', -3,),).toBe(6,),)
                test('D',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'D', -3,),).toBe(7,),)
                test('E',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst((it: string,) => it === 'E', -3,),).toBeNull(),)
            },)
            describe("to index", () => {
                test("anyCase a", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'a', null, -3,),).toBe(0,),)
                test("anyCase b", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'b', null, -3,),).toBe(1,),)
                test("anyCase c", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'c', null, -3,),).toBe(2,),)
                test("anyCase d", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'd', null, -3,),).toBe(3,),)
                test("anyCase e", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'e', null, -3,),).toBeNull(),)

                test('a',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'a', null, -3,),).toBe(0,),)
                test('b',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'b', null, -3,),).toBe(1,),)
                test('c',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'c', null, -3,),).toBe(2,),)
                test('d',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'd', null, -3,),).toBe(3,),)
                test('e',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst((it: string,) => it === 'e', null, -3,),).toBeNull(),)
                test('A',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'A', null, -3,),).toBe(4,),)
                test('B',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'B', null, -3,),).toBe(5,),)
                test('C',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'C', null, -3,),).toBeNull(),)
                test('D',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'D', null, -3,),).toBeNull(),)
                test('E',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst((it: string,) => it === 'E', null, -3,),).toBeNull(),)
            },)
            describe("limit", () => {
                test("anyCase a", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'a', null, null, -3,),).toBe(0,),)
                test("anyCase b", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'b', null, null, -3,),).toBe(1,),)
                test("anyCase c", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'c', null, null, -3,),).toBe(2,),)
                test("anyCase d", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'd', null, null, -3,),).toBe(3,),)
                test("anyCase e", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'e', null, null, -3,),).toBeNull(),)

                test('a',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'a', null, null, -3,),).toBe(0,),)
                test('b',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'b', null, null, -3,),).toBe(1,),)
                test('c',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'c', null, null, -3,),).toBe(2,),)
                test('d',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'd', null, null, -3,),).toBe(3,),)
                test('e',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst((it: string,) => it === 'e', null, null, -3,),).toBeNull(),)
                test('A',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'A', null, null, -3,),).toBe(4,),)
                test('B',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'B', null, null, -3,),).toBeNull(),)
                test('C',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'C', null, null, -3,),).toBeNull(),)
                test('D',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'D', null, null, -3,),).toBeNull(),)
                test('E',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst((it: string,) => it === 'E', null, null, -3,),).toBeNull(),)
            },)
        },)
    },)
    describe("index of first indexed", () => {
        describe("known null return", () => {
            test("empty",                 () => expect(newInstance(EMPTY,).indexOfFirstIndexed(() => fail(),),).toBeNull(),)
            test("from and to index = 0", () => expect(newInstance(AB,).indexOfFirstIndexed(() => fail(), 0, 0,),).toBeNull(),)
            test("limit = 0",             () => expect(newInstance(AB,).indexOfFirstIndexed(() => fail(), null, null, 0,),).toBeNull(),)
        },)
        describe("direct", () => {
            test("even", () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it % 2 === 0,),).toBe(0,),)
            test("odd",  () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it % 2 === 1,),).toBe(1,),)

            test('0',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 0,),).toBe(0,),)
            test('1',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 1,),).toBe(1,),)
            test('2',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 2,),).toBe(2,),)
            test('3',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 3,),).toBe(3,),)
            test('4',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 4,),).toBe(4,),)
            test('5',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 5,),).toBe(5,),)
            test('6',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 6,),).toBe(6,),)
            test('7',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 7,),).toBe(7,),)
            test('8',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 8,),).toBeNull(),)
            test("26",   () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 26,),).toBeNull(),)
        },)
        describe("from index", () => {
            test("even", () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it % 2 === 0, 3,),).toBe(4,),)
            test("odd",  () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it % 2 === 1, 3,),).toBe(3,),)

            test('0',     () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 0, 3,),).toBeNull(),)
            test('1',     () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 1, 3,),).toBeNull(),)
            test('2',     () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 2, 3,),).toBeNull(),)
            test('3',     () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 3, 3,),).toBe(3,),)
            test('4',     () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 4, 3,),).toBe(4,),)
            test('5',     () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 5, 3,),).toBe(5,),)
            test('6',     () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 6, 3,),).toBe(6,),)
            test('7',     () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 7, 3,),).toBe(7,),)
            test('8',     () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 8, 3,),).toBeNull(),)
            test("26",    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 26, 3,),).toBeNull(),)
        },)
        describe("to index", () => {
            test("even", () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it % 2 === 0, null, 3,),).toBe(0,),)
            test("odd",  () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it % 2 === 1, null, 3,),).toBe(1,),)

            test('0',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 0, null, 3,),).toBe(0,),)
            test('1',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 1, null, 3,),).toBe(1,),)
            test('2',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 2, null, 3,),).toBe(2,),)
            test('3',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 3, null, 3,),).toBe(3,),)
            test('4',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 4, null, 3,),).toBeNull(),)
            test('5',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 5, null, 3,),).toBeNull(),)
            test('6',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 6, null, 3,),).toBeNull(),)
            test('7',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 7, null, 3,),).toBeNull(),)
            test('8',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 8, null, 3,),).toBeNull(),)
            test("26",   () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 26, null, 3,),).toBeNull(),)
        },)
        describe("limit", () => {
            test("even", () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it % 2 === 0, null, null, 3,),).toBe(0,),)
            test("odd",  () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it % 2 === 1, null, null, 3,),).toBe(1,),)

            test('0',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 0, null, null, 3,),).toBe(0,),)
            test('1',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 1, null, null, 3,),).toBe(1,),)
            test('2',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 2, null, null, 3,),).toBe(2,),)
            test('3',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 3, null, null, 3,),).toBeNull(),)
            test('4',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 4, null, null, 3,),).toBeNull(),)
            test('5',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 5, null, null, 3,),).toBeNull(),)
            test('6',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 6, null, null, 3,),).toBeNull(),)
            test('7',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 7, null, null, 3,),).toBeNull(),)
            test('8',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 8, null, null, 3,),).toBeNull(),)
            test("26",   () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 26, null, null, 3,),).toBeNull(),)
        },)
        describe("error", () => {
            describe("from index", () => {
                test('2',    () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("to index", () => {
                test('2',    () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("limit", () => {
                test('2',    () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, null, Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).indexOfFirstIndexed(() => fail(), null, null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
        },)
        describe("negative values", () => {
            describe("from index", () => {
                test("even", () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it % 2 === 0, -3,),).toBe(6,),)
                test("odd",  () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it % 2 === 1, -3,),).toBe(5,),)

                test('0',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 0, -3,),).toBeNull(),)
                test('1',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 1, -3,),).toBeNull(),)
                test('2',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 2, -3,),).toBeNull(),)
                test('3',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 3, -3,),).toBeNull(),)
                test('4',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 4, -3,),).toBeNull(),)
                test('5',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 5, -3,),).toBe(5,),)
                test('6',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 6, -3,),).toBe(6,),)
                test('7',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 7, -3,),).toBe(7,),)
                test('8',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 8, -3,),).toBeNull(),)
                test("26",   () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 26, -3,),).toBeNull(),)
            },)
            describe("to index", () => {
                test("even", () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it % 2 === 0, null, -3,),).toBe(0,),)
                test("odd",  () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it % 2 === 1, null, -3,),).toBe(1,),)

                test('0',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 0, null, -3,),).toBe(0,),)
                test('1',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 1, null, -3,),).toBe(1,),)
                test('2',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 2, null, -3,),).toBe(2,),)
                test('3',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 3, null, -3,),).toBe(3,),)
                test('4',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 4, null, -3,),).toBe(4,),)
                test('5',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 5, null, -3,),).toBe(5,),)
                test('6',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 6, null, -3,),).toBeNull(),)
                test('7',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 7, null, -3,),).toBeNull(),)
                test('8',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 8, null, -3,),).toBeNull(),)
                test("26",   () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 26, null, -3,),).toBeNull(),)
            },)
            describe("limit", () => {
                test("even", () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it % 2 === 0, null, null, -3,),).toBe(0,),)
                test("odd",  () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it % 2 === 1, null, null, -3,),).toBe(1,),)

                test('0',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 0, null, null, -3,),).toBe(0,),)
                test('1',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 1, null, null, -3,),).toBe(1,),)
                test('2',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 2, null, null, -3,),).toBe(2,),)
                test('3',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 3, null, null, -3,),).toBe(3,),)
                test('4',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 4, null, null, -3,),).toBe(4,),)
                test('5',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 5, null, null, -3,),).toBeNull(),)
                test('6',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 6, null, null, -3,),).toBeNull(),)
                test('7',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 7, null, null, -3,),).toBeNull(),)
                test('8',    () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 8, null, null, -3,),).toBeNull(),)
                test("26",   () => expect(newInstance(ABCD_ABCD,).indexOfFirstIndexed(it => it === 26, null, null, -3,),).toBeNull(),)
            },)
        },)
    },)
    describe("index of last", () => {
        describe("known null return", () => {
            test("empty",                 () => expect(newInstance(EMPTY,).indexOfLast(() => fail(),),).toBeNull(),)
            test("from and to index = 0", () => expect(newInstance(AB,).indexOfLast(() => fail(), 0, 0,),).toBeNull(),)
            test("limit = 0",             () => expect(newInstance(AB,).indexOfLast(() => fail(), null, null, 0,),).toBeNull(),)
        },)
        describe("direct", () => {
            test("anyCase A", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'A',),).toBe(4,),)
            test("anyCase B", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'B',),).toBe(5,),)
            test("anyCase C", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'C',),).toBe(6,),)
            test("anyCase D", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'D',),).toBe(7,),)
            test("anyCase E", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'E',),).toBeNull(),)

            test('a',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'a',),).toBe(0,),)
            test('b',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'b',),).toBe(1,),)
            test('c',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'c',),).toBe(2,),)
            test('d',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'd',),).toBe(3,),)
            test('e',         () => expect(newInstance(ABCD_ABCD,).indexOfLast((it: string,) => it === 'e',),).toBeNull(),)
            test('A',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'A',),).toBe(4,),)
            test('B',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'B',),).toBe(5,),)
            test('C',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'C',),).toBe(6,),)
            test('D',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'D',),).toBe(7,),)
            test('E',         () => expect(newInstance(ABCD_ABCD,).indexOfLast((it: string,) => it === 'E',),).toBeNull(),)
        },)
        describe("from index", () => {
            test("anyCase A", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'A', 3,),).toBe(4,),)
            test("anyCase B", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'B', 3,),).toBe(5,),)
            test("anyCase C", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'C', 3,),).toBe(6,),)
            test("anyCase D", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'D', 3,),).toBe(7,),)
            test("anyCase E", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'E', 3,),).toBeNull(),)

            test('a',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'a', 3,),).toBeNull(),)
            test('b',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'b', 3,),).toBeNull(),)
            test('c',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'c', 3,),).toBeNull(),)
            test('d',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'd', 3,),).toBe(3,),)
            test('e',         () => expect(newInstance(ABCD_ABCD,).indexOfLast((it: string,) => it === 'e', 3,),).toBeNull(),)
            test('A',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'A', 3,),).toBe(4,),)
            test('B',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'B', 3,),).toBe(5,),)
            test('C',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'C', 3,),).toBe(6,),)
            test('D',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'D', 3,),).toBe(7,),)
            test('E',         () => expect(newInstance(ABCD_ABCD,).indexOfLast((it: string,) => it === 'E', 3,),).toBeNull(),)
        },)
        describe("to index", () => {
            test("anyCase A", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'A', null, 3,),).toBe(0,),)
            test("anyCase B", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'B', null, 3,),).toBe(1,),)
            test("anyCase C", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'C', null, 3,),).toBe(2,),)
            test("anyCase D", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'D', null, 3,),).toBe(3,),)
            test("anyCase E", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'E', null, 3,),).toBeNull(),)

            test('a',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'a', null, 3,),).toBe(0,),)
            test('b',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'b', null, 3,),).toBe(1,),)
            test('c',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'c', null, 3,),).toBe(2,),)
            test('d',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'd', null, 3,),).toBe(3,),)
            test('e',         () => expect(newInstance(ABCD_ABCD,).indexOfLast((it: string,) => it === 'e', null, 3,),).toBeNull(),)
            test('A',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'A', null, 3,),).toBeNull(),)
            test('B',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'B', null, 3,),).toBeNull(),)
            test('C',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'C', null, 3,),).toBeNull(),)
            test('D',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'D', null, 3,),).toBeNull(),)
            test('E',         () => expect(newInstance(ABCD_ABCD,).indexOfLast((it: string,) => it === 'E', null, 3,),).toBeNull(),)
        },)
        describe("limit", () => {
            test("anyCase A", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'A', null, null, 3,),).toBe(0,),)
            test("anyCase B", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'B', null, null, 3,),).toBe(1,),)
            test("anyCase C", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'C', null, null, 3,),).toBe(2,),)
            test("anyCase D", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'D', null, null, 3,),).toBeNull(),)
            test("anyCase E", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toUpperCase() === 'E', null, null, 3,),).toBeNull(),)

            test('a',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'a', null, null, 3,),).toBe(0,),)
            test('b',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'b', null, null, 3,),).toBe(1,),)
            test('c',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'c', null, null, 3,),).toBe(2,),)
            test('d',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'd', null, null, 3,),).toBeNull(),)
            test('e',         () => expect(newInstance(ABCD_ABCD,).indexOfLast((it: string,) => it === 'e', null, null, 3,),).toBeNull(),)
            test('A',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'A', null, null, 3,),).toBeNull(),)
            test('B',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'B', null, null, 3,),).toBeNull(),)
            test('C',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'C', null, null, 3,),).toBeNull(),)
            test('D',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'D', null, null, 3,),).toBeNull(),)
            test('E',         () => expect(newInstance(ABCD_ABCD,).indexOfLast((it: string,) => it === 'E', null, null, 3,),).toBeNull(),)
        },)
        describe("error", () => {
            describe("from index", () => {
                test('2',    () => expect(() => newInstance(AB,).indexOfLast(() => fail(), 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).indexOfLast(() => fail(), 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).indexOfLast(() => fail(), 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).indexOfLast(() => fail(), -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).indexOfLast(() => fail(), -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).indexOfLast(() => fail(), -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).indexOfLast(() => fail(), 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).indexOfLast(() => fail(), -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).indexOfLast(() => fail(), NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).indexOfLast(() => fail(), Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).indexOfLast(() => fail(), -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("to index", () => {
                test('2',    () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("limit", () => {
                test('2',    () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, null, Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).indexOfLast(() => fail(), null, null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
        },)
        describe("negative values", () => {
            describe("from index", () => {
                test("anyCase a", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toLowerCase() === 'a', -3,),).toBeNull(),)
                test("anyCase b", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toLowerCase() === 'b', -3,),).toBe(5,),)
                test("anyCase c", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toLowerCase() === 'c', -3,),).toBe(6,),)
                test("anyCase d", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toLowerCase() === 'd', -3,),).toBe(7,),)
                test("anyCase e", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toLowerCase() === 'e', -3,),).toBeNull(),)

                test('a',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'a', -3,),).toBeNull(),)
                test('b',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'b', -3,),).toBeNull(),)
                test('c',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'c', -3,),).toBeNull(),)
                test('d',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'd', -3,),).toBeNull(),)
                test('e',         () => expect(newInstance(ABCD_ABCD,).indexOfLast((it: string,) => it === 'e', -3,),).toBeNull(),)
                test('A',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'A', -3,),).toBeNull(),)
                test('B',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'B', -3,),).toBe(5,),)
                test('C',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'C', -3,),).toBe(6,),)
                test('D',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'D', -3,),).toBe(7,),)
                test('E',         () => expect(newInstance(ABCD_ABCD,).indexOfLast((it: string,) => it === 'E', -3,),).toBeNull(),)
            },)
            describe("to index", () => {
                test("anyCase a", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toLowerCase() === 'a', null, -3,),).toBe(4,),)
                test("anyCase b", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toLowerCase() === 'b', null, -3,),).toBe(5,),)
                test("anyCase c", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toLowerCase() === 'c', null, -3,),).toBe(2,),)
                test("anyCase d", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toLowerCase() === 'd', null, -3,),).toBe(3,),)
                test("anyCase e", () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it.toLowerCase() === 'e', null, -3,),).toBeNull(),)

                test('a',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'a', null, -3,),).toBe(0,),)
                test('b',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'b', null, -3,),).toBe(1,),)
                test('c',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'c', null, -3,),).toBe(2,),)
                test('d',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'd', null, -3,),).toBe(3,),)
                test('e',         () => expect(newInstance(ABCD_ABCD,).indexOfLast((it: string,) => it === 'e', null, -3,),).toBeNull(),)
                test('A',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'A', null, -3,),).toBe(4,),)
                test('B',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'B', null, -3,),).toBe(5,),)
                test('C',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'C', null, -3,),).toBeNull(),)
                test('D',         () => expect(newInstance(ABCD_ABCD,).indexOfLast(it => it === 'D', null, -3,),).toBeNull(),)
                test('E',         () => expect(newInstance(ABCD_ABCD,).indexOfLast((it: string,) => it === 'E', null, -3,),).toBeNull(),)
            },)
            describe("limit", () => {
                test("anyCase a", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'a', null, null, -3,),).toBe(0,),)
                test("anyCase b", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'b', null, null, -3,),).toBe(1,),)
                test("anyCase c", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'c', null, null, -3,),).toBe(2,),)
                test("anyCase d", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'd', null, null, -3,),).toBe(3,),)
                test("anyCase e", () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it.toLowerCase() === 'e', null, null, -3,),).toBeNull(),)

                test('a',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'a', null, null, -3,),).toBe(0,),)
                test('b',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'b', null, null, -3,),).toBe(1,),)
                test('c',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'c', null, null, -3,),).toBe(2,),)
                test('d',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'd', null, null, -3,),).toBe(3,),)
                test('e',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst((it: string,) => it === 'e', null, null, -3,),).toBeNull(),)
                test('A',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'A', null, null, -3,),).toBe(4,),)
                test('B',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'B', null, null, -3,),).toBeNull(),)
                test('C',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'C', null, null, -3,),).toBeNull(),)
                test('D',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst(it => it === 'D', null, null, -3,),).toBeNull(),)
                test('E',         () => expect(newInstance(ABCD_ABCD,).indexOfFirst((it: string,) => it === 'E', null, null, -3,),).toBeNull(),)
            },)
        },)
    },)
    describe("index of last indexed", () => {
        describe("known null return", () => {
            test("empty",                 () => expect(newInstance(EMPTY,).indexOfLastIndexed(() => fail(),),).toBeNull(),)
            test("from and to index = 0", () => expect(newInstance(AB,).indexOfLastIndexed(() => fail(), 0, 0,),).toBeNull(),)
            test("limit = 0",             () => expect(newInstance(AB,).indexOfLastIndexed(() => fail(), null, null, 0,),).toBeNull(),)
        },)
        describe("direct", () => {
            test("even", () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it % 2 === 0,),).toBe(6,),)
            test("odd",  () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it % 2 === 1,),).toBe(7,),)

            test('0',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 0,),).toBe(0,),)
            test('1',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 1,),).toBe(1,),)
            test('2',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 2,),).toBe(2,),)
            test('3',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 3,),).toBe(3,),)
            test('4',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 4,),).toBe(4,),)
            test('5',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 5,),).toBe(5,),)
            test('6',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 6,),).toBe(6,),)
            test('7',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 7,),).toBe(7,),)
            test('8',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 8,),).toBeNull(),)
            test("26",   () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 26,),).toBeNull(),)
        },)
        describe("from index", () => {
            test("even", () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it % 2 === 0, 3,),).toBe(6,),)
            test("odd",  () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it % 2 === 1, 3,),).toBe(7,),)

            test('0',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 0, 3,),).toBeNull(),)
            test('1',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 1, 3,),).toBeNull(),)
            test('2',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 2, 3,),).toBeNull(),)
            test('3',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 3, 3,),).toBe(3,),)
            test('4',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 4, 3,),).toBe(4,),)
            test('5',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 5, 3,),).toBe(5,),)
            test('6',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 6, 3,),).toBe(6,),)
            test('7',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 7, 3,),).toBe(7,),)
            test('8',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 8, 3,),).toBeNull(),)
            test("26",   () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 26, 3,),).toBeNull(),)
        },)
        describe("to index", () => {
            test("even", () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it % 2 === 0, null, 3,),).toBe(2,),)
            test("odd",  () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it % 2 === 1, null, 3,),).toBe(3,),)

            test('0',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 0, null, 3,),).toBe(0,),)
            test('1',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 1, null, 3,),).toBe(1,),)
            test('2',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 2, null, 3,),).toBe(2,),)
            test('3',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 3, null, 3,),).toBe(3,),)
            test('4',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 4, null, 3,),).toBeNull(),)
            test('5',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 5, null, 3,),).toBeNull(),)
            test('6',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 6, null, 3,),).toBeNull(),)
            test('7',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 7, null, 3,),).toBeNull(),)
            test('8',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 8, null, 3,),).toBeNull(),)
            test("26",   () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 26, null, 3,),).toBeNull(),)
        },)
        describe("limit", () => {
            test("even", () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it % 2 === 0, null, null, 3,),).toBe(2,),)
            test("odd",  () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it % 2 === 1, null, null, 3,),).toBe(1,),)

            test('0',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 0, null, null, 3,),).toBe(0,),)
            test('1',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 1, null, null, 3,),).toBe(1,),)
            test('2',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 2, null, null, 3,),).toBe(2,),)
            test('3',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 3, null, null, 3,),).toBeNull(),)
            test('4',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 4, null, null, 3,),).toBeNull(),)
            test('5',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 5, null, null, 3,),).toBeNull(),)
            test('6',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 6, null, null, 3,),).toBeNull(),)
            test('7',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 7, null, null, 3,),).toBeNull(),)
            test('8',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 8, null, null, 3,),).toBeNull(),)
            test("26",   () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 26, null, null, 3,),).toBeNull(),)
        },)
        describe("error", () => {
            describe("from index", () => {
                test('2',    () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("to index", () => {
                test('2',    () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("limit", () => {
                test('2',    () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('3',    () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test('4',    () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-2",   () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-3",   () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("500",  () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-500", () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, null, Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(AB,).indexOfLastIndexed(() => fail(), null, null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
        },)
        describe("negative values", () => {
            describe("from index", () => {
                test("even", () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it % 2 === 0, -3,),).toBe(6,),)
                test("odd",  () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it % 2 === 1, -3,),).toBe(7,),)

                test('0',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 0, -3,),).toBeNull(),)
                test('1',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 1, -3,),).toBeNull(),)
                test('2',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 2, -3,),).toBeNull(),)
                test('3',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 3, -3,),).toBeNull(),)
                test('4',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 4, -3,),).toBeNull(),)
                test('5',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 5, -3,),).toBe(5,),)
                test('6',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 6, -3,),).toBe(6,),)
                test('7',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 7, -3,),).toBe(7,),)
                test('8',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 8, -3,),).toBeNull(),)
                test("26",   () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 26, -3,),).toBeNull(),)
            },)
            describe("to index", () => {
                test("even", () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it % 2 === 0, null, -3,),).toBe(4,),)
                test("odd",  () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it % 2 === 1, null, -3,),).toBe(5,),)

                test('0',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 0, null, -3,),).toBe(0,),)
                test('1',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 1, null, -3,),).toBe(1,),)
                test('2',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 2, null, -3,),).toBe(2,),)
                test('3',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 3, null, -3,),).toBe(3,),)
                test('4',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 4, null, -3,),).toBe(4,),)
                test('5',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 5, null, -3,),).toBe(5,),)
                test('6',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 6, null, -3,),).toBeNull(),)
                test('7',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 7, null, -3,),).toBeNull(),)
                test('8',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 8, null, -3,),).toBeNull(),)
                test("26",   () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 26, null, -3,),).toBeNull(),)
            },)
            describe("limit", () => {
                test("even", () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it % 2 === 0, null, null, -3,),).toBe(4,),)
                test("odd",  () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it % 2 === 1, null, null, -3,),).toBe(3,),)

                test('0',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 0, null, null, -3,),).toBe(0,),)
                test('1',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 1, null, null, -3,),).toBe(1,),)
                test('2',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 2, null, null, -3,),).toBe(2,),)
                test('3',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 3, null, null, -3,),).toBe(3,),)
                test('4',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 4, null, null, -3,),).toBe(4,),)
                test('5',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 5, null, null, -3,),).toBeNull(),)
                test('6',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 6, null, null, -3,),).toBeNull(),)
                test('7',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 7, null, null, -3,),).toBeNull(),)
                test('8',    () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 8, null, null, -3,),).toBeNull(),)
                test("26",   () => expect(newInstance(ABCD_ABCD,).indexOfLastIndexed(it => it === 26, null, null, -3,),).toBeNull(),)
            },)
        },)
    },)
},)},)
