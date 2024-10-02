/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {expectToBeInstance}                                                                        from "./expect/expectToBeInstance"
import {EmptyCollectionHolderForTest}                                                              from "./instance/EmptyCollectionHolderForTest"
import {_0, _01, _0123, _1, _2, _3, _4, _45, _4567, A, AB, ABC, ABCD, B, BC, BCD, C, CD, D, EMPTY} from "./value/arrays"
import {everyCollectionInstancesAndExtensionFunctionAsCollectionHolder, everyIterableInstances}    from "./value/instances"

import {CollectionConstants}                       from "../src/CollectionConstants"
import {CollectionHolderIndexOutOfBoundsException} from "../src/exception/CollectionHolderIndexOutOfBoundsException"
import {ForbiddenIndexException}                   from "../src/exception/ForbiddenIndexException"
import {InvalidIndexRangeException}                from "../src/exception/InvalidIndexRangeException"

describe("CollectionHolderTest (slice)", () => {

    test("EmptyCollectionHolder", () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.slice(),),)

    describe.each(everyCollectionInstancesAndExtensionFunctionAsCollectionHolder,)("%s", ({value: {instance, isExtension,},},) => {
        if (!isExtension)
            describe("get() being called", () => {
                describe.each(everyIterableInstances,)("by indices: %s", ({value: newIterable,},) => {
                    describe("empty", () => {
                        test("empty",     () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_01,),),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("empty",     () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.executeWhileIgnoringIndexOutOfBound(it => it.slice(newIterable(_01,),),),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("empty",     () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_01,),),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("empty",     () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_01,),),).amountOfCall,).toBe(2,),)
                    },)
                },)
                describe("by range", () => {
                    test("empty",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.slice(),).amountOfCall,).toBe(0,),)
                    test("1 field",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.slice(),).amountOfCall,).toBe(1,),)
                    test("2 fields", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.slice(),).amountOfCall,).toBe(2,),)
                    test("4 fields", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(),).amountOfCall,).toBe(4,),)
                },)
            },)

        if (!isExtension)
            describe.each(everyIterableInstances,)("by indices: %s", ({value: newIterable,},) => {
                describe("empty", () => {
                    test("none", () => expect(new instance(EMPTY,).slice(newIterable(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                    test('0',    () => expect(new instance(EMPTY,).slice(newIterable(_0,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                    test("01",   () => expect(new instance(EMPTY,).slice(newIterable(_01,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                    test("0123", () => expect(new instance(EMPTY,).slice(newIterable(_0123,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                },)
                describe("1 field", () => {
                    test("none", () => expect(new instance(A,).slice(newIterable(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                    test('0',    () => expect(new instance(A,).slice(newIterable(_0,),).toArray(),).toEqual(A,),)
                    test('4',    () => expect(() => new instance(A,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_4,),),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("01",   () => expect(() => new instance(A,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_01,),),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("45",   () => expect(() => new instance(A,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_45,),),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("0123", () => expect(() => new instance(A,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_0123,),),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("4567", () => expect(() => new instance(A,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_4567,),),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("2 fields", () => {
                    test("none", () => expect(new instance(AB,).slice(newIterable(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                    test('0',    () => expect(new instance(AB,).slice(newIterable(_0,),).toArray(),).toEqual(A,),)
                    test('1',    () => expect(new instance(AB,).slice(newIterable(_1,),).toArray(),).toEqual(B,),)
                    test('4',    () => expect(() => new instance(AB,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_4,),),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("01",   () => expect(new instance(AB,).slice(newIterable(_01,),).toArray(),).toEqual(AB,),)
                    test("45",   () => expect(() => new instance(AB,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_45,),),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("0123", () => expect(() => new instance(AB,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_0123,),),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("4567", () => expect(() => new instance(AB,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_4567,),),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("4 fields", () => {
                    test("none", () => expect(new instance(ABCD,).slice(newIterable(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                    test('0',    () => expect(new instance(ABCD,).slice(newIterable(_0,),).toArray(),).toEqual(A,),)
                    test('1',    () => expect(new instance(ABCD,).slice(newIterable(_1,),).toArray(),).toEqual(B,),)
                    test('2',    () => expect(new instance(ABCD,).slice(newIterable(_2,),).toArray(),).toEqual(C,),)
                    test('3',    () => expect(new instance(ABCD,).slice(newIterable(_3,),).toArray(),).toEqual(D,),)
                    test('4',    () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_4,),),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("01",   () => expect(new instance(ABCD,).slice(newIterable(_01,),).toArray(),).toEqual(AB,),)
                    test("45",   () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_45,),),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("0123", () => expect(new instance(ABCD,).slice(newIterable(_0123,),).toArray(),).toEqual(ABCD,),)
                    test("4567", () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_4567,),),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
            },)
        describe("by range", () => {
            describe("empty", () => {
                test("direct",     () => expect(new instance(EMPTY,).slice(),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("from (NaN)", () => expect(new instance(EMPTY,).slice(NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("from (-∞)",  () => expect(new instance(EMPTY,).slice(-Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("from (-1)",  () => expect(new instance(EMPTY,).slice(-1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("from (0)",   () => expect(new instance(EMPTY,).slice(0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("from (1)",   () => expect(new instance(EMPTY,).slice(1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("from (+∞)",  () => expect(new instance(EMPTY,).slice(Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("to (NaN)",   () => expect(new instance(EMPTY,).slice(null, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("to (-∞)",    () => expect(new instance(EMPTY,).slice(null, -Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("to (-1)",    () => expect(new instance(EMPTY,).slice(null, -1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("to (0)",     () => expect(new instance(EMPTY,).slice(null, 0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("to (1)",     () => expect(new instance(EMPTY,).slice(null, 1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("to (+∞)",    () => expect(new instance(EMPTY,).slice(null, Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("1 field", () => {
                test('0', () => expect(new instance(A,).slice(0,).toArray(),).toEqual(A,),)
                test('4', () => expect(() => new instance(A,).executeWhileHavingIndexesOnField(it => it.slice(4,),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            },)
            describe("2 fields", () => {
                test('0', () => expect(new instance(AB,).slice(0,).toArray(),).toEqual(AB,),)
                test('1', () => expect(new instance(AB,).slice(1,).toArray(),).toEqual(B,),)
                test('4', () => expect(() => new instance(AB,).executeWhileHavingIndexesOnField(it => it.slice(4,),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            },)
            describe("4 fields", () => {
                test('0', () => expect(new instance(ABCD,).slice(0,).toArray(),).toEqual(ABCD,),)
                test('1', () => expect(new instance(ABCD,).slice(1,).toArray(),).toEqual(BCD,),)
                test('2', () => expect(new instance(ABCD,).slice(2,).toArray(),).toEqual(CD,),)
                test('3', () => expect(new instance(ABCD,).slice(3,).toArray(),).toEqual(D,),)
                test('4', () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(4,),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            },)

            describe("from", () => {
                test("NaN",  () => expect(() => new instance(ABCD,).slice(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => new instance(ABCD,).slice(-Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-500", () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(-500,),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-6",   () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(-6,),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-5",   () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(-5,),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(new instance(ABCD,).slice(-4,).toArray(),).toEqual(ABCD,),)
                test("-3",   () => expect(new instance(ABCD,).slice(-3,).toArray(),).toEqual(BCD,),)
                test("-2",   () => expect(new instance(ABCD,).slice(-2,).toArray(),).toEqual(CD,),)
                test("-1",   () => expect(new instance(ABCD,).slice(-1,).toArray(),).toEqual(D,),)
                test("0",    () => expect(new instance(ABCD,).slice(0,).toArray(),).toEqual(ABCD,),)
                test("1",    () => expect(new instance(ABCD,).slice(1,).toArray(),).toEqual(BCD,),)
                test("2",    () => expect(new instance(ABCD,).slice(2,).toArray(),).toEqual(CD,),)
                test("3",    () => expect(new instance(ABCD,).slice(3,).toArray(),).toEqual(D,),)
                test("4",    () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(4,),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("5",    () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(5,),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("500",  () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(500,),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("+∞",   () => expect(() => new instance(ABCD,).slice(Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("to", () => {
                test("NaN",  () => expect(() => new instance(ABCD,).slice(null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => new instance(ABCD,).slice(null, -Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-500", () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(null, -500,),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-6",   () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(null, -6,),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-5",   () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(null, -5,),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-4",   () => expect(new instance(ABCD,).slice(null, -4,).toArray(),).toEqual(A,),)
                test("-3",   () => expect(new instance(ABCD,).slice(null, -3,).toArray(),).toEqual(AB,),)
                test("-2",   () => expect(new instance(ABCD,).slice(null, -2,).toArray(),).toEqual(ABC,),)
                test("-1",   () => expect(new instance(ABCD,).slice(null, -1,).toArray(),).toEqual(ABCD,),)
                test("0",    () => expect(new instance(ABCD,).slice(null, 0,).toArray(),).toEqual(A,),)
                test("1",    () => expect(new instance(ABCD,).slice(null, 1,).toArray(),).toEqual(AB,),)
                test("2",    () => expect(new instance(ABCD,).slice(null, 2,).toArray(),).toEqual(ABC,),)
                test("3",    () => expect(new instance(ABCD,).slice(null, 3,).toArray(),).toEqual(ABCD,),)
                test("4",    () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(null, 4,),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("5",    () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(null, 5,),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("500",  () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(null, 500,),),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("+∞",   () => expect(() => new instance(ABCD,).slice(null, Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("from + to", () => {
                test("0, 0", () => expect(new instance(ABCD,).slice(0, 0,).toArray(),).toEqual(A,),)
                test("0, 1", () => expect(new instance(ABCD,).slice(0, 1,).toArray(),).toEqual(AB,),)
                test("0, 2", () => expect(new instance(ABCD,).slice(0, 2,).toArray(),).toEqual(ABC,),)
                test("0, 3", () => expect(new instance(ABCD,).slice(0, 3,).toArray(),).toEqual(ABCD,),)
                test("1, 0", () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(1, 0,),),).toThrow(InvalidIndexRangeException,),)
                test("1, 1", () => expect(new instance(ABCD,).slice(1, 1,).toArray(),).toEqual(B,),)
                test("1, 2", () => expect(new instance(ABCD,).slice(1, 2,).toArray(),).toEqual(BC,),)
                test("1, 3", () => expect(new instance(ABCD,).slice(1, 3,).toArray(),).toEqual(BCD,),)
                test("2, 0", () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(2, 0,),),).toThrow(InvalidIndexRangeException,),)
                test("2, 1", () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(2, 1,),),).toThrow(InvalidIndexRangeException,),)
                test("2, 2", () => expect(new instance(ABCD,).slice(2, 2,).toArray(),).toEqual(C,),)
                test("2, 3", () => expect(new instance(ABCD,).slice(2, 3,).toArray(),).toEqual(CD,),)
                test("2, 0", () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(3, 0,),),).toThrow(InvalidIndexRangeException,),)
                test("2, 1", () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(3, 1,),),).toThrow(InvalidIndexRangeException,),)
                test("2, 2", () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(3, 2,),),).toThrow(InvalidIndexRangeException,),)
                test("2, 3", () => expect(new instance(ABCD,).slice(3, 3,).toArray(),).toEqual(D,),)
            },)
        },)
    },)

},)
