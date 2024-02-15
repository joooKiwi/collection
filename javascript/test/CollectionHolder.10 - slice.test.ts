/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, ABCD, EMPTY}                        from "./constantCollections"
import {everyCollectionInstance, everyInstance} from "./constantValues"

import {CollectionConstants}                       from "../src/CollectionConstants"
import {GenericCollectionIterator}                 from "../src/iterator/GenericCollectionIterator"
import {CollectionHolderIndexOutOfBoundsException} from "../src/exception/CollectionHolderIndexOutOfBoundsException"
import {ForbiddenIndexException}                   from "../src/exception/ForbiddenIndexException"

describe("CollectionHolderTest (slice)", () => {
describe.each(everyInstance,)("%s", ({value: {newInstance, isExtensionOnly,},},) => {
    //README: The "extension only methods" instances only handle the values from a ReadonlyArray
    describe("by array", () => {
        test("empty",   () => expect(newInstance(AB,).slice([],),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        test('0',       () => expect(newInstance(ABCD,).slice([0,],).toArray(),).toEqual(['a',],),)
        test('1',       () => expect(newInstance(ABCD,).slice([1,],).toArray(),).toEqual(['b',],),)
        if (!isExtensionOnly) {
            test("-1",  () => expect(newInstance(ABCD,).slice([-1,],).toArray(),).toEqual(['d',],),)
            test("-2",  () => expect(newInstance(ABCD,).slice([-2,],).toArray(),).toEqual(['c',],),)
            test("10",  () => expect(() => newInstance(ABCD,).slice([10,],).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-10", () => expect(() => newInstance(ABCD,).slice([-10,],).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        }
    },)
    describe("by set", () => {
        test("empty",   () => expect(newInstance(AB,).slice(new Set<never>(),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        test('0',       () => expect(newInstance(ABCD,).slice(new Set([0,],),).toArray(),).toEqual(['a',],),)
        test('1',       () => expect(newInstance(ABCD,).slice(new Set([1,],),).toArray(),).toEqual(['b',],),)
        if (!isExtensionOnly) {
            test("-1",  () => expect(newInstance(ABCD,).slice(new Set([-1,],),).toArray(),).toEqual(['d',],),)
            test("-2",  () => expect(newInstance(ABCD,).slice(new Set([-2,],),).toArray(),).toEqual(['c',],),)
            test("10",  () => expect(() => newInstance(ABCD,).slice(new Set([10,],),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-10", () => expect(() => newInstance(ABCD,).slice(new Set([-10,],),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        }
    },)
    describe("by collection", () => {
    describe.each(everyCollectionInstance,)("%s", ({value: {newInstance: newCollectionInstance,}}) => {
        test("empty", () => expect(newInstance(AB,).slice(newCollectionInstance([],),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        test('0', () => expect(newInstance(ABCD,).slice(newCollectionInstance([0,],),).toArray(),).toEqual(['a',],),)
        test('1', () => expect(newInstance(ABCD,).slice(newCollectionInstance([1,],),).toArray(),).toEqual(['b',],),)
        if (!isExtensionOnly) {
            test("-1", () => expect(newInstance(ABCD,).slice(newCollectionInstance([-1,],),).toArray(),).toEqual(['d',],),)
            test("-2", () => expect(newInstance(ABCD,).slice(newCollectionInstance([-2,],),).toArray(),).toEqual(['c',],),)
            test("10", () => expect(() => newInstance(ABCD,).slice(newCollectionInstance([10,],),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-10", () => expect(() => newInstance(ABCD,).slice(newCollectionInstance([-10,],),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        }
    },)},)
    describe("by collection iterator", () => {
    describe.each(everyCollectionInstance,)("%s", ({value: {newInstance: newCollectionInstance,}}) => {
        test("empty",   () => expect(newInstance(AB,).slice(new GenericCollectionIterator<never>(newCollectionInstance([],),),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        test('0',       () => expect(newInstance(ABCD,).slice(new GenericCollectionIterator<0>(newCollectionInstance([0,],),),).toArray(),).toEqual(['a',],),)
        test('1',       () => expect(newInstance(ABCD,).slice(new GenericCollectionIterator<1>(newCollectionInstance([1,],),),).toArray(),).toEqual(['b',],),)
        if (!isExtensionOnly) {
            test("-1",  () => expect(newInstance(ABCD,).slice(new GenericCollectionIterator<-1>(newCollectionInstance([-1,],),),).toArray(),).toEqual(['d',],),)
            test("-2",  () => expect(newInstance(ABCD,).slice(new GenericCollectionIterator<-2>(newCollectionInstance([-2,],),),).toArray(),).toEqual(['c',],),)
            test("10",  () => expect(() => newInstance(ABCD,).slice(new GenericCollectionIterator<10>(newCollectionInstance([10,],),),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-10", () => expect(() => newInstance(ABCD,).slice(new GenericCollectionIterator<-10>(newCollectionInstance([-10,],),),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        }
    },)},)
    describe("by iterable", () => {
        test("empty",   () => expect(newInstance(AB,).slice({ [Symbol.iterator]() { return [][Symbol.iterator]() }, },),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        test('0',       () => expect(newInstance(ABCD,).slice({ [Symbol.iterator]() { return [0,][Symbol.iterator]() }, },).toArray(),).toEqual(['a',],),)
        test('1',       () => expect(newInstance(ABCD,).slice({ [Symbol.iterator]() { return [1,][Symbol.iterator]() }, },).toArray(),).toEqual(['b',],),)
        if (!isExtensionOnly) {
            test("-1",  () => expect(newInstance(ABCD,).slice({ [Symbol.iterator]() { return [-1,][Symbol.iterator]() }, },).toArray(),).toEqual(['d',],),)
            test("-2",  () => expect(newInstance(ABCD,).slice({ [Symbol.iterator]() { return [-2,][Symbol.iterator]() }, },).toArray(),).toEqual(['c',],),)
            test("10",  () => expect(() => newInstance(ABCD,).slice({ [Symbol.iterator]() { return [10,][Symbol.iterator]() }, },).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-10", () => expect(() => newInstance(ABCD,).slice({ [Symbol.iterator]() { return [-10,][Symbol.iterator]() }, },).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        }
    },)

    describe("by range", () => {
        test("empty",             () => expect(newInstance(EMPTY,).slice(),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)

        test("(1)",               () => expect(newInstance(ABCD,).slice(1,).toArray(),).toEqual(['b', 'c', 'd',],),)
        test("(null, 1)",         () => expect(newInstance(ABCD,).slice(null, 1,).toArray(),).toEqual(['a', 'b',],),)
        test("(1, 1)",            () => expect(newInstance(ABCD,).slice(1, 1,).toArray(),).toEqual(['b',],),)
        test("(1, 2)",            () => expect(newInstance(ABCD,).slice(1, 2,).toArray(),).toEqual(['b', 'c',],),)
        test("(-2)",              () => expect(newInstance(ABCD,).slice(-2,).toArray(),).toEqual(['c', 'd',],),)
        test("(null, -2)",        () => expect(newInstance(ABCD,).slice(null, -2,).toArray(),).toEqual(['a', 'b', 'c',],),)
        test("(-2, -2)",          () => expect(newInstance(ABCD,).slice(-2, -2,).toArray(),).toEqual(['c',],),)
        test("(-3, -2)",          () => expect(newInstance(ABCD,).slice(-3, -2,).toArray(),).toEqual(['b', 'c',],),)

        test("(1, null, 1)",      () => expect(newInstance(ABCD,).slice(1, null, 1,).toArray(),).toEqual(['b',],),)
        test("(1, null, -3)",     () => expect(newInstance(ABCD,).slice(1, null, -3,).toArray(),).toEqual(['b',],),)
        test("(1, null, 2)",      () => expect(newInstance(ABCD,).slice(1, null, 2,).toArray(),).toEqual(['b', 'c',],),)
        test("(-2, null, 1)",     () => expect(newInstance(ABCD,).slice(-2, null, 1,).toArray(),).toEqual(['c',],),)
        test("(-2, null, -3)",    () => expect(newInstance(ABCD,).slice(-2, null, -3,).toArray(),).toEqual(['c',],),)
        test("(-2, null, 2)",     () => expect(newInstance(ABCD,).slice(-2, null, 2,).toArray(),).toEqual(['c', 'd',],),)
        test("(null, 1, 1)",      () => expect(newInstance(ABCD,).slice(null, 1, 1,).toArray(),).toEqual(['a',],),)
        test("(null, 1, -3)",     () => expect(newInstance(ABCD,).slice(null, 1, -3,).toArray(),).toEqual(['a',],),)
        test("(null, 1, 2)",      () => expect(newInstance(ABCD,).slice(null, 1, 2,).toArray(),).toEqual(['a', 'b',],),)
        test("(null, -2, 1)",     () => expect(newInstance(ABCD,).slice(null, -2, 1,).toArray(),).toEqual(['a',],),)
        test("(null, -2, -3)",    () => expect(newInstance(ABCD,).slice(null, -2, -3,).toArray(),).toEqual(['a',],),)
        test("(null, -2, 2)",     () => expect(newInstance(ABCD,).slice(null, -2, 2,).toArray(),).toEqual(['a', 'b',],),)
        test("(null, null, 1)",   () => expect(newInstance(ABCD,).slice(null, null, 1,).toArray(),).toEqual(['a',],),)
        test("(null, null, -3)",  () => expect(newInstance(ABCD,).slice(null, null, -3,).toArray(),).toEqual(['a',],),)
        test("(null, null, 2)",   () => expect(newInstance(ABCD,).slice(null, null, 2,).toArray(),).toEqual(['a', 'b',],),)

        test("(2, 1)",            () => expect(() => newInstance(ABCD,).slice(2, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("(1, null, 4)",      () => expect(() => newInstance(ABCD,).slice(1, null, 4,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("(null, 1, 4)",      () => expect(() => newInstance(ABCD,).slice(null, 1, 4,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("(10)",              () => expect(() => newInstance(ABCD,).slice(10, null,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("(null, 10)",        () => expect(() => newInstance(ABCD,).slice(null, 10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("(null, null, 10)",  () => expect(() => newInstance(ABCD,).slice(null, null, 10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("(-10)",             () => expect(() => newInstance(ABCD,).slice(-10, null,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("(null, -10)",       () => expect(() => newInstance(ABCD,).slice(null, -10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("(null, null, -10)", () => expect(() => newInstance(ABCD,).slice(null, null, -10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
    },)

    describe("invalid numbers", () => {
        if (!isExtensionOnly) {
            describe("by array", () => {
                test("NaN",           () => expect(() => newInstance(ABCD,).slice([NaN,],).toString(),).toThrow(ForbiddenIndexException,),)
                test("+∞",            () => expect(() => newInstance(ABCD,).slice([Infinity,],).toString(),).toThrow(ForbiddenIndexException,),)
                test("-∞",            () => expect(() => newInstance(ABCD,).slice([-Infinity,],).toString(),).toThrow(ForbiddenIndexException,),)
            },)
            describe("by set", () => {
                test("NaN",           () => expect(() => newInstance(ABCD,).slice(new Set([NaN,],),).toString(),).toThrow(ForbiddenIndexException,),)
                test("+∞",            () => expect(() => newInstance(ABCD,).slice(new Set([Infinity,],),).toString(),).toThrow(ForbiddenIndexException,),)
                test("-∞",            () => expect(() => newInstance(ABCD,).slice(new Set([-Infinity,],),).toString(),).toThrow(ForbiddenIndexException,),)
            },)
            describe("by collection", () => {
            describe.each(everyCollectionInstance,)("%s", ({value: {newInstance: newCollectionInstance,}}) => {
                test("NaN",           () => expect(() => newInstance(ABCD,).slice(newCollectionInstance([NaN,],),).toString(),).toThrow(ForbiddenIndexException,),)
                test("+∞",            () => expect(() => newInstance(ABCD,).slice(newCollectionInstance([Infinity,],),).toString(),).toThrow(ForbiddenIndexException,),)
                test("-∞",            () => expect(() => newInstance(ABCD,).slice(newCollectionInstance([-Infinity,],),).toString(),).toThrow(ForbiddenIndexException,),)
            },)},)
            describe("by collection holder", () => {
            describe.each(everyCollectionInstance,)("%s", ({value: {newInstance: newCollectionInstance,}}) => {
                test("NaN",           () => expect(() => newInstance(ABCD,).slice(new GenericCollectionIterator<typeof Number.NaN>(newCollectionInstance([NaN,],),),).toString(),).toThrow(ForbiddenIndexException,),)
                test("+∞",            () => expect(() => newInstance(ABCD,).slice(new GenericCollectionIterator<typeof Number.POSITIVE_INFINITY>(newCollectionInstance([Infinity,],),),).toString(),).toThrow(ForbiddenIndexException,),)
                test("-∞",            () => expect(() => newInstance(ABCD,).slice(new GenericCollectionIterator<typeof Number.NEGATIVE_INFINITY>(newCollectionInstance([-Infinity,],),),).toString(),).toThrow(ForbiddenIndexException,),)
            },)},)
            describe("by iterable", () => {
                test("NaN",           () => expect(() => newInstance(ABCD,).slice({ [Symbol.iterator]() { return [NaN,][Symbol.iterator]() }, },).toString(),).toThrow(ForbiddenIndexException,),)
                test("+∞",            () => expect(() => newInstance(ABCD,).slice({ [Symbol.iterator]() { return [Infinity,][Symbol.iterator]() }, },).toString(),).toThrow(ForbiddenIndexException,),)
                test("-∞",            () => expect(() => newInstance(ABCD,).slice({ [Symbol.iterator]() { return [-Infinity,][Symbol.iterator]() }, },).toString(),).toThrow(ForbiddenIndexException,),)
            },)
        }

        describe("by range", () => {
            test("(NaN)",             () => expect(() => newInstance(ABCD,).slice(NaN,),).toThrow(ForbiddenIndexException,),)
            test("(+∞)",              () => expect(() => newInstance(ABCD,).slice(Infinity,),).toThrow(ForbiddenIndexException,),)
            test("(-∞)",              () => expect(() => newInstance(ABCD,).slice(-Infinity,),).toThrow(ForbiddenIndexException,),)

            test("(null, NaN)",       () => expect(() => newInstance(ABCD,).slice(null, NaN,),).toThrow(ForbiddenIndexException,),)
            test("(null, +∞)",        () => expect(() => newInstance(ABCD,).slice(null, Infinity,),).toThrow(ForbiddenIndexException,),)
            test("(null, -∞)",        () => expect(() => newInstance(ABCD,).slice(null, -Infinity,),).toThrow(ForbiddenIndexException,),)

            test("(null, null, NaN)", () => expect(() => newInstance(ABCD,).slice(null, null, NaN,),).toThrow(ForbiddenIndexException,),)
            test("(null, null, +∞)",  () => expect(() => newInstance(ABCD,).slice(null, null, Infinity,),).toThrow(ForbiddenIndexException,),)
            test("(null, null, -∞)",  () => expect(() => newInstance(ABCD,).slice(null, null, -Infinity,),).toThrow(ForbiddenIndexException,),)
        },)
    },)
},)},)
