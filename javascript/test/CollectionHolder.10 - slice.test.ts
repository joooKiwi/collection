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

import {expectToBeInstance}                                                                                        from "./expect/expectToBeInstance"
import {CollectionHolderFromArray}                                                                                 from "./instance/CollectionHolderFromArray"
import {CollectionIteratorFromArray}                                                                               from "./instance/CollectionIteratorFromArray"
import {EmptyCollectionHolderForTest}                                                                              from "./instance/EmptyCollectionHolderForTest"
import {_0, _01, _0123, _1, _2, _3, _4, _45, _4567, A, AB, ABC, ABCD, B, BC, BCD, C, CD, D, EMPTY, NULL_UNDEFINED} from "./value/arrays"
import {everyCollectionInstances, everyIterableInstances}                                                          from "./value/instances"

import {CollectionConstants}                                                                                                                                                                                     from "../src/CollectionConstants"
import {ForbiddenIndexException}                                                                                                                                                                                 from "../src/exception/ForbiddenIndexException"
import {IndexOutOfBoundsException}                                                                                                                                                                               from "../src/exception/IndexOutOfBoundsException"
import {InvalidIndexRangeException}                                                                                                                                                                              from "../src/exception/InvalidIndexRangeException"
import {slice, sliceByArray, sliceByCollectionHolder, sliceByMinimalistCollectionHolder}                                                                                                                         from "../src/method/slice"
import {sliceWithARange, sliceWithARangeByArray, sliceWithARangeByCollectionHolder, sliceWithARangeByMinimalistCollectionHolder}                                                                                 from "../src/method/slice.withARange"
import {sliceWithArray, sliceWithArrayByArray, sliceWithArrayByCollectionHolder, sliceWithArrayByMinimalistCollectionHolder}                                                                                     from "../src/method/slice.withArray"
import {sliceWithCollectionHolder, sliceWithCollectionHolderByArray, sliceWithCollectionHolderByCollectionHolder, sliceWithCollectionHolderByMinimalistCollectionHolder}                                         from "../src/method/slice.withCollectionHolder"
import {sliceWithCollectionIterator, sliceWithCollectionIteratorByArray, sliceWithCollectionIteratorByCollectionHolder, sliceWithCollectionIteratorByMinimalistCollectionHolder}                                 from "../src/method/slice.withCollectionIterator"
import {sliceWithIterable, sliceWithIterableByArray, sliceWithIterableByCollectionHolder, sliceWithIterableByMinimalistCollectionHolder}                                                                         from "../src/method/slice.withIterable"
import {sliceWithIterator, sliceWithIteratorByArray, sliceWithIteratorByCollectionHolder, sliceWithIteratorByMinimalistCollectionHolder}                                                                         from "../src/method/slice.withIterator"
import {sliceWithMinimalistCollectionHolder, sliceWithMinimalistCollectionHolderByArray, sliceWithMinimalistCollectionHolderByCollectionHolder, sliceWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../src/method/slice.withMinimalistCollectionHolder"
import {sliceWithSet, sliceWithSetByArray, sliceWithSetByCollectionHolder, sliceWithSetByMinimalistCollectionHolder}                                                                                             from "../src/method/slice.withSet"

describe("CollectionHolderTest (slice)", () => {

    test("EmptyCollectionHolder", () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.slice(),),)

    describe.each(NULL_UNDEFINED,)("%s", it => {
        describe("slice", () => {
            test("all",                          () => expect(slice(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceByArray(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("slice (range)", () => {
            test("all",                          () => expect(sliceWithARange(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceWithARangeByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceWithARangeByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceWithARangeByArray(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("slice (array)", () => {
            test("all",                          () => expect(sliceWithArray(it, EMPTY,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceWithArrayByMinimalistCollectionHolder(it, EMPTY,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceWithArrayByCollectionHolder(it, EMPTY,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceWithArrayByArray(it, EMPTY,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("slice (set)", () => {
            test("all",                          () => expect(sliceWithSet(it, new Set(),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceWithSetByMinimalistCollectionHolder(it, new Set(),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceWithSetByCollectionHolder(it, new Set(),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceWithSetByArray(it, new Set(),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("slice (collection holder)", () => {
            test("all",                          () => expect(sliceWithCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceWithCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceWithCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceWithCollectionHolderByArray(it, new CollectionHolderFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("slice (minimalist collection holder)", () => {
            test("all",                          () => expect(sliceWithMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceWithMinimalistCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceWithMinimalistCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceWithMinimalistCollectionHolderByArray(it, new CollectionHolderFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("slice (collection iterator)", () => {
            test("all",                          () => expect(sliceWithCollectionIterator(it, new CollectionIteratorFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceWithCollectionIteratorByMinimalistCollectionHolder(it, new CollectionIteratorFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceWithCollectionIteratorByCollectionHolder(it, new CollectionIteratorFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceWithCollectionIteratorByArray(it, new CollectionIteratorFromArray(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("slice (iterator)", () => {
            test("all",                          () => expect(sliceWithIterator(it, EMPTY[Symbol.iterator](),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceWithIteratorByMinimalistCollectionHolder(it, EMPTY[Symbol.iterator](),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceWithIteratorByCollectionHolder(it, EMPTY[Symbol.iterator](),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceWithIteratorByArray(it, EMPTY[Symbol.iterator](),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("slice (iterable)", () => {
            test("all",                          () => expect(sliceWithIterable(it, EMPTY,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(sliceWithIterableByMinimalistCollectionHolder(it, EMPTY,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(sliceWithIterableByCollectionHolder(it, EMPTY,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(sliceWithIterableByArray(it, EMPTY,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
    },)

    describe.each(everyCollectionInstances,)("%s", ({value: {instance, isExtension, type,},},) => {
        /** The instance is a {@link GenericCollectionHolder} */
        const isNormal = type === "normal"
        if (!isExtension)
            describe("get() being called", () => {
                describe.each(everyIterableInstances,)("by indices: %s", ({value: newIterable, message,},) => {
                    /** The iterable instance is either an {@link Iterable}, an {@link Iterator} or a {@link ReadonlySet} */
                    const isInNormalOrder = message.startsWith("iterable",) || message == "iterator" || message == "set"

                    describe("empty", () => {
                        test("empty", () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test('0',     () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_0,),),).amountOfCall,).toBe(0,),)
                        test("01",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_01,),),).amountOfCall,).toBe(0,),)
                        test("0123",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_0123,),),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("empty", () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test('0',     () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_0,),),).amountOfCall,).toBe(1,),)
                        test("01",    () => expect(new instance(A,).executeWhileExpectingIndexOutOfBound(it => it.executeWhileHavingIndexesOnField(it => it.slice(newIterable(_01,),),),).amountOfCall,).toBe(isNormal ? (isInNormalOrder ? 1 : 0) : (isInNormalOrder ? 2 : 1),),)
                        test("0123",  () => expect(new instance(A,).executeWhileExpectingIndexOutOfBound(it => it.executeWhileHavingIndexesOnField(it => it.slice(newIterable(_0123,),),),).amountOfCall,).toBe(isNormal ? (isInNormalOrder ? 1 : 0) : (isInNormalOrder ? 2 : 1),),)
                    },)
                    describe("2 fields", () => {
                        test("empty", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test('0',     () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_0,),),).amountOfCall,).toBe(1,),)
                        test("01",    () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_01,),),).amountOfCall,).toBe(2,),)
                        test("0123",  () => expect(new instance(AB,).executeWhileExpectingIndexOutOfBound(it => it.executeWhileHavingIndexesOnField(it => it.slice(newIterable(_0123,),),),).amountOfCall,).toBe(isNormal ? (isInNormalOrder ? 2 : 0) : (isInNormalOrder ? 3 : 1),),)
                    },)
                    describe("4 fields", () => {
                        test("empty", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test('0',     () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_0,),),).amountOfCall,).toBe(1,),)
                        test("01",    () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_01,),),).amountOfCall,).toBe(2,),)
                        test("0123",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_0123,),),).amountOfCall,).toBe(4,),)
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
                    test('4',    () => expect(() => new instance(A,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_4,),),),).toThrow(IndexOutOfBoundsException,),)
                    test("01",   () => expect(() => new instance(A,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_01,),),),).toThrow(IndexOutOfBoundsException,),)
                    test("45",   () => expect(() => new instance(A,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_45,),),),).toThrow(IndexOutOfBoundsException,),)
                    test("0123", () => expect(() => new instance(A,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_0123,),),),).toThrow(IndexOutOfBoundsException,),)
                    test("4567", () => expect(() => new instance(A,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_4567,),),),).toThrow(IndexOutOfBoundsException,),)
                },)
                describe("2 fields", () => {
                    test("none", () => expect(new instance(AB,).slice(newIterable(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                    test('0',    () => expect(new instance(AB,).slice(newIterable(_0,),).toArray(),).toEqual(A,),)
                    test('1',    () => expect(new instance(AB,).slice(newIterable(_1,),).toArray(),).toEqual(B,),)
                    test('4',    () => expect(() => new instance(AB,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_4,),),),).toThrow(IndexOutOfBoundsException,),)
                    test("01",   () => expect(new instance(AB,).slice(newIterable(_01,),).toArray(),).toEqual(AB,),)
                    test("45",   () => expect(() => new instance(AB,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_45,),),),).toThrow(IndexOutOfBoundsException,),)
                    test("0123", () => expect(() => new instance(AB,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_0123,),),),).toThrow(IndexOutOfBoundsException,),)
                    test("4567", () => expect(() => new instance(AB,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_4567,),),),).toThrow(IndexOutOfBoundsException,),)
                },)
                describe("4 fields", () => {
                    test("none", () => expect(new instance(ABCD,).slice(newIterable(EMPTY,),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                    test('0',    () => expect(new instance(ABCD,).slice(newIterable(_0,),).toArray(),).toEqual(A,),)
                    test('1',    () => expect(new instance(ABCD,).slice(newIterable(_1,),).toArray(),).toEqual(B,),)
                    test('2',    () => expect(new instance(ABCD,).slice(newIterable(_2,),).toArray(),).toEqual(C,),)
                    test('3',    () => expect(new instance(ABCD,).slice(newIterable(_3,),).toArray(),).toEqual(D,),)
                    test('4',    () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_4,),),),).toThrow(IndexOutOfBoundsException,),)
                    test("01",   () => expect(new instance(ABCD,).slice(newIterable(_01,),).toArray(),).toEqual(AB,),)
                    test("45",   () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_45,),),),).toThrow(IndexOutOfBoundsException,),)
                    test("0123", () => expect(new instance(ABCD,).slice(newIterable(_0123,),).toArray(),).toEqual(ABCD,),)
                    test("4567", () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.slice(newIterable(_4567,),),),).toThrow(IndexOutOfBoundsException,),)
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
                test('4', () => expect(() => new instance(A,).slice(4,),).toThrow(IndexOutOfBoundsException,),)
            },)
            describe("2 fields", () => {
                test('0', () => expect(new instance(AB,).slice(0,).toArray(),).toEqual(AB,),)
                test('1', () => expect(new instance(AB,).slice(1,).toArray(),).toEqual(B,),)
                test('4', () => expect(() => new instance(AB,).slice(4,),).toThrow(IndexOutOfBoundsException,),)
            },)
            describe("4 fields", () => {
                test('0', () => expect(new instance(ABCD,).slice(0,).toArray(),).toEqual(ABCD,),)
                test('1', () => expect(new instance(ABCD,).slice(1,).toArray(),).toEqual(BCD,),)
                test('2', () => expect(new instance(ABCD,).slice(2,).toArray(),).toEqual(CD,),)
                test('3', () => expect(new instance(ABCD,).slice(3,).toArray(),).toEqual(D,),)
                test('4', () => expect(() => new instance(ABCD,).slice(4,),).toThrow(IndexOutOfBoundsException,),)
            },)

            describe("from", () => {
                test("NaN",  () => expect(() => new instance(ABCD,).slice(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => new instance(ABCD,).slice(-Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-500", () => expect(() => new instance(ABCD,).slice(-500,),).toThrow(IndexOutOfBoundsException,),)
                test("-6",   () => expect(() => new instance(ABCD,).slice(-6,),).toThrow(IndexOutOfBoundsException,),)
                test("-5",   () => expect(() => new instance(ABCD,).slice(-5,),).toThrow(IndexOutOfBoundsException,),)
                test("-4",   () => expect(new instance(ABCD,).slice(-4,).toArray(),).toEqual(ABCD,),)
                test("-3",   () => expect(new instance(ABCD,).slice(-3,).toArray(),).toEqual(BCD,),)
                test("-2",   () => expect(new instance(ABCD,).slice(-2,).toArray(),).toEqual(CD,),)
                test("-1",   () => expect(new instance(ABCD,).slice(-1,).toArray(),).toEqual(D,),)
                test("0",    () => expect(new instance(ABCD,).slice(0,).toArray(),).toEqual(ABCD,),)
                test("1",    () => expect(new instance(ABCD,).slice(1,).toArray(),).toEqual(BCD,),)
                test("2",    () => expect(new instance(ABCD,).slice(2,).toArray(),).toEqual(CD,),)
                test("3",    () => expect(new instance(ABCD,).slice(3,).toArray(),).toEqual(D,),)
                test("4",    () => expect(() => new instance(ABCD,).slice(4,),).toThrow(IndexOutOfBoundsException,),)
                test("5",    () => expect(() => new instance(ABCD,).slice(5,),).toThrow(IndexOutOfBoundsException,),)
                test("500",  () => expect(() => new instance(ABCD,).slice(500,),).toThrow(IndexOutOfBoundsException,),)
                test("+∞",   () => expect(() => new instance(ABCD,).slice(Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("to", () => {
                test("NaN",  () => expect(() => new instance(ABCD,).slice(null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => new instance(ABCD,).slice(null, -Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-500", () => expect(() => new instance(ABCD,).slice(null, -500,),).toThrow(IndexOutOfBoundsException,),)
                test("-6",   () => expect(() => new instance(ABCD,).slice(null, -6,),).toThrow(IndexOutOfBoundsException,),)
                test("-5",   () => expect(() => new instance(ABCD,).slice(null, -5,),).toThrow(IndexOutOfBoundsException,),)
                test("-4",   () => expect(new instance(ABCD,).slice(null, -4,).toArray(),).toEqual(A,),)
                test("-3",   () => expect(new instance(ABCD,).slice(null, -3,).toArray(),).toEqual(AB,),)
                test("-2",   () => expect(new instance(ABCD,).slice(null, -2,).toArray(),).toEqual(ABC,),)
                test("-1",   () => expect(new instance(ABCD,).slice(null, -1,).toArray(),).toEqual(ABCD,),)
                test("0",    () => expect(new instance(ABCD,).slice(null, 0,).toArray(),).toEqual(A,),)
                test("1",    () => expect(new instance(ABCD,).slice(null, 1,).toArray(),).toEqual(AB,),)
                test("2",    () => expect(new instance(ABCD,).slice(null, 2,).toArray(),).toEqual(ABC,),)
                test("3",    () => expect(new instance(ABCD,).slice(null, 3,).toArray(),).toEqual(ABCD,),)
                test("4",    () => expect(() => new instance(ABCD,).slice(null, 4,),).toThrow(IndexOutOfBoundsException,),)
                test("5",    () => expect(() => new instance(ABCD,).slice(null, 5,),).toThrow(IndexOutOfBoundsException,),)
                test("500",  () => expect(() => new instance(ABCD,).slice(null, 500,),).toThrow(IndexOutOfBoundsException,),)
                test("+∞",   () => expect(() => new instance(ABCD,).slice(null, Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("from + to", () => {
                test("NaN, NaN",   () => expect(() => new instance(ABCD,).slice(NaN, NaN,),).toThrow(ForbiddenIndexException,),)
                test("NaN, -∞",    () => expect(() => new instance(ABCD,).slice(NaN, -Infinity,),).toThrow(ForbiddenIndexException,),)
                test("NaN, -500",  () => expect(() => new instance(ABCD,).slice(NaN, -500,),).toThrow(ForbiddenIndexException,),)
                test("NaN, 0",     () => expect(() => new instance(ABCD,).slice(NaN, 0,),).toThrow(ForbiddenIndexException,),)
                test("NaN, 1",     () => expect(() => new instance(ABCD,).slice(NaN, 1,),).toThrow(ForbiddenIndexException,),)
                test("NaN, 2",     () => expect(() => new instance(ABCD,).slice(NaN, 2,),).toThrow(ForbiddenIndexException,),)
                test("NaN, 3",     () => expect(() => new instance(ABCD,).slice(NaN, 3,),).toThrow(ForbiddenIndexException,),)
                test("NaN, 500",   () => expect(() => new instance(ABCD,).slice(NaN, 500,),).toThrow(ForbiddenIndexException,),)
                test("NaN, +∞",    () => expect(() => new instance(ABCD,).slice(NaN, Infinity,),).toThrow(ForbiddenIndexException,),)

                test("-∞, NaN",    () => expect(() => new instance(ABCD,).slice(-Infinity, NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞, -∞",     () => expect(() => new instance(ABCD,).slice(-Infinity, -Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞, -500",   () => expect(() => new instance(ABCD,).slice(-Infinity, -500,),).toThrow(ForbiddenIndexException,),)
                test("-∞, 0",      () => expect(() => new instance(ABCD,).slice(-Infinity, 0,),).toThrow(ForbiddenIndexException,),)
                test("-∞, 1",      () => expect(() => new instance(ABCD,).slice(-Infinity, 1,),).toThrow(ForbiddenIndexException,),)
                test("-∞, 2",      () => expect(() => new instance(ABCD,).slice(-Infinity, 2,),).toThrow(ForbiddenIndexException,),)
                test("-∞, 3",      () => expect(() => new instance(ABCD,).slice(-Infinity, 3,),).toThrow(ForbiddenIndexException,),)
                test("-∞, 500",    () => expect(() => new instance(ABCD,).slice(-Infinity, 500,),).toThrow(ForbiddenIndexException,),)
                test("-∞, +∞",     () => expect(() => new instance(ABCD,).slice(-Infinity, Infinity,),).toThrow(ForbiddenIndexException,),)

                test("-500, NaN",  () => expect(() => new instance(ABCD,).slice(-500, NaN,),).toThrow(IndexOutOfBoundsException,),)
                test("-500, -∞",   () => expect(() => new instance(ABCD,).slice(-500, -Infinity,),).toThrow(IndexOutOfBoundsException,),)
                test("-500, -500", () => expect(() => new instance(ABCD,).slice(-500, -500,),).toThrow(IndexOutOfBoundsException,),)
                test("-500, 0",    () => expect(() => new instance(ABCD,).slice(-500, 0,),).toThrow(IndexOutOfBoundsException,),)
                test("-500, 1",    () => expect(() => new instance(ABCD,).slice(-500, 1,),).toThrow(IndexOutOfBoundsException,),)
                test("-500, 2",    () => expect(() => new instance(ABCD,).slice(-500, 2,),).toThrow(IndexOutOfBoundsException,),)
                test("-500, 3",    () => expect(() => new instance(ABCD,).slice(-500, 3,),).toThrow(IndexOutOfBoundsException,),)
                test("-500, 500",  () => expect(() => new instance(ABCD,).slice(-500, 500,),).toThrow(IndexOutOfBoundsException,),)
                test("-500, +∞",   () => expect(() => new instance(ABCD,).slice(-500, Infinity,),).toThrow(IndexOutOfBoundsException,),)

                test("0, NaN",     () => expect(() => new instance(ABCD,).slice(0, NaN,),).toThrow(ForbiddenIndexException,),)
                test("0, -∞",      () => expect(() => new instance(ABCD,).slice(0, -Infinity,),).toThrow(ForbiddenIndexException,),)
                test("0, -500",    () => expect(() => new instance(ABCD,).slice(0, -500,),).toThrow(IndexOutOfBoundsException,),)
                test("0, 0",       () => expect(new instance(ABCD,).slice(0, 0,).toArray(),).toEqual(A,),)
                test("0, 1",       () => expect(new instance(ABCD,).slice(0, 1,).toArray(),).toEqual(AB,),)
                test("0, 2",       () => expect(new instance(ABCD,).slice(0, 2,).toArray(),).toEqual(ABC,),)
                test("0, 3",       () => expect(new instance(ABCD,).slice(0, 3,).toArray(),).toEqual(ABCD,),)
                test("0, 500",     () => expect(() => new instance(ABCD,).slice(0, 500,),).toThrow(IndexOutOfBoundsException,),)
                test("0, +∞",      () => expect(() => new instance(ABCD,).slice(0, Infinity,),).toThrow(ForbiddenIndexException,),)

                test("1, NaN",     () => expect(() => new instance(ABCD,).slice(1, NaN,),).toThrow(ForbiddenIndexException,),)
                test("1, -∞",      () => expect(() => new instance(ABCD,).slice(1, -Infinity,),).toThrow(ForbiddenIndexException,),)
                test("1, -500",    () => expect(() => new instance(ABCD,).slice(1, -500,),).toThrow(IndexOutOfBoundsException,),)
                test("1, 0",       () => expect(() => new instance(ABCD,).slice(1, 0,),).toThrow(InvalidIndexRangeException,),)
                test("1, 1",       () => expect(new instance(ABCD,).slice(1, 1,).toArray(),).toEqual(B,),)
                test("1, 2",       () => expect(new instance(ABCD,).slice(1, 2,).toArray(),).toEqual(BC,),)
                test("1, 3",       () => expect(new instance(ABCD,).slice(1, 3,).toArray(),).toEqual(BCD,),)
                test("1, 500",     () => expect(() => new instance(ABCD,).slice(1, 500,),).toThrow(IndexOutOfBoundsException,),)
                test("1, +∞",      () => expect(() => new instance(ABCD,).slice(1, Infinity,),).toThrow(ForbiddenIndexException,),)

                test("2, NaN",     () => expect(() => new instance(ABCD,).slice(2, NaN,),).toThrow(ForbiddenIndexException,),)
                test("2, -∞",      () => expect(() => new instance(ABCD,).slice(2, -Infinity,),).toThrow(ForbiddenIndexException,),)
                test("2, -500",    () => expect(() => new instance(ABCD,).slice(2, -500,),).toThrow(IndexOutOfBoundsException,),)
                test("2, 0",       () => expect(() => new instance(ABCD,).slice(2, 0,),).toThrow(InvalidIndexRangeException,),)
                test("2, 1",       () => expect(() => new instance(ABCD,).slice(2, 1,),).toThrow(InvalidIndexRangeException,),)
                test("2, 2",       () => expect(new instance(ABCD,).slice(2, 2,).toArray(),).toEqual(C,),)
                test("2, 3",       () => expect(new instance(ABCD,).slice(2, 3,).toArray(),).toEqual(CD,),)
                test("2, 500",     () => expect(() => new instance(ABCD,).slice(2, 500,),).toThrow(IndexOutOfBoundsException,),)
                test("2, +∞",      () => expect(() => new instance(ABCD,).slice(2, Infinity,),).toThrow(ForbiddenIndexException,),)

                test("3, NaN",     () => expect(() => new instance(ABCD,).slice(3, NaN,),).toThrow(ForbiddenIndexException,),)
                test("3, -∞",      () => expect(() => new instance(ABCD,).slice(3, -Infinity,),).toThrow(ForbiddenIndexException,),)
                test("3, -500",    () => expect(() => new instance(ABCD,).slice(3, -500,),).toThrow(IndexOutOfBoundsException,),)
                test("3, 0",       () => expect(() => new instance(ABCD,).slice(3, 0,),).toThrow(InvalidIndexRangeException,),)
                test("3, 1",       () => expect(() => new instance(ABCD,).slice(3, 1,),).toThrow(InvalidIndexRangeException,),)
                test("3, 2",       () => expect(() => new instance(ABCD,).slice(3, 2,),).toThrow(InvalidIndexRangeException,),)
                test("3, 3",       () => expect(new instance(ABCD,).slice(3, 3,).toArray(),).toEqual(D,),)
                test("3, 500",     () => expect(() => new instance(ABCD,).slice(3, 500,),).toThrow(IndexOutOfBoundsException,),)
                test("3, +∞",      () => expect(() => new instance(ABCD,).slice(3, Infinity,),).toThrow(ForbiddenIndexException,),)

                test("500, NaN",   () => expect(() => new instance(ABCD,).slice(500, NaN,),).toThrow(IndexOutOfBoundsException,),)
                test("500, -∞",    () => expect(() => new instance(ABCD,).slice(500, -Infinity,),).toThrow(IndexOutOfBoundsException,),)
                test("500, -500",  () => expect(() => new instance(ABCD,).slice(500, -500,),).toThrow(IndexOutOfBoundsException,),)
                test("500, 0",     () => expect(() => new instance(ABCD,).slice(500, 0,),).toThrow(IndexOutOfBoundsException,),)
                test("500, 1",     () => expect(() => new instance(ABCD,).slice(500, 1,),).toThrow(IndexOutOfBoundsException,),)
                test("500, 2",     () => expect(() => new instance(ABCD,).slice(500, 2,),).toThrow(IndexOutOfBoundsException,),)
                test("500, 3",     () => expect(() => new instance(ABCD,).slice(500, 3,),).toThrow(IndexOutOfBoundsException,),)
                test("500, 500",   () => expect(() => new instance(ABCD,).slice(500, 500,),).toThrow(IndexOutOfBoundsException,),)
                test("500, +∞",    () => expect(() => new instance(ABCD,).slice(500, Infinity,),).toThrow(IndexOutOfBoundsException,),)

                test("+∞, NaN",    () => expect(() => new instance(ABCD,).slice(Infinity, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞, -∞",     () => expect(() => new instance(ABCD,).slice(Infinity, -Infinity,),).toThrow(ForbiddenIndexException,),)
                test("+∞, -500",   () => expect(() => new instance(ABCD,).slice(Infinity, -500,),).toThrow(ForbiddenIndexException,),)
                test("+∞, 0",      () => expect(() => new instance(ABCD,).slice(Infinity, 0,),).toThrow(ForbiddenIndexException,),)
                test("+∞, 1",      () => expect(() => new instance(ABCD,).slice(Infinity, 1,),).toThrow(ForbiddenIndexException,),)
                test("+∞, 2",      () => expect(() => new instance(ABCD,).slice(Infinity, 2,),).toThrow(ForbiddenIndexException,),)
                test("+∞, 3",      () => expect(() => new instance(ABCD,).slice(Infinity, 3,),).toThrow(ForbiddenIndexException,),)
                test("+∞, 500",    () => expect(() => new instance(ABCD,).slice(Infinity, 500,),).toThrow(ForbiddenIndexException,),)
                test("+∞, +∞",     () => expect(() => new instance(ABCD,).slice(Infinity, Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
        },)
    },)

},)
