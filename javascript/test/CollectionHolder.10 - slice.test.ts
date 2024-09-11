/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, ABCD, ABCDEFGHIJ}                   from "./constantCollections"
import {everyCollectionInstance, everyInstance} from "./constantValues"

import {CollectionConstants}                       from "../src/CollectionConstants"
import {GenericCollectionIterator}                 from "../src/iterator/GenericCollectionIterator"
import {CollectionHolderIndexOutOfBoundsException} from "../src/exception/CollectionHolderIndexOutOfBoundsException"
import {ForbiddenIndexException}                   from "../src/exception/ForbiddenIndexException"
import {InvalidIndexRangeException}                from "../src/exception/InvalidIndexRangeException"

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
        test("no arguments", () => expect(newInstance(ABCDEFGHIJ,).slice().toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',],),)
        describe("from index", () => {
            test("-10", () => expect(newInstance(ABCDEFGHIJ,).slice(-10,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',],),)
            test("-9",  () => expect(newInstance(ABCDEFGHIJ,).slice(-9,).toArray(),).toEqual(['b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',],),)
            test("-8",  () => expect(newInstance(ABCDEFGHIJ,).slice(-8,).toArray(),).toEqual(['c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',],),)
            test("-7",  () => expect(newInstance(ABCDEFGHIJ,).slice(-7,).toArray(),).toEqual(['d', 'e', 'f', 'g', 'h', 'i', 'j',],),)
            test("-6",  () => expect(newInstance(ABCDEFGHIJ,).slice(-6,).toArray(),).toEqual(['e', 'f', 'g', 'h', 'i', 'j',],),)
            test("-5",  () => expect(newInstance(ABCDEFGHIJ,).slice(-5,).toArray(),).toEqual(['f', 'g', 'h', 'i', 'j',],),)
            test("-4",  () => expect(newInstance(ABCDEFGHIJ,).slice(-4,).toArray(),).toEqual(['g', 'h', 'i', 'j',],),)
            test("-3",  () => expect(newInstance(ABCDEFGHIJ,).slice(-3,).toArray(),).toEqual(['h', 'i', 'j',],),)
            test("-2",  () => expect(newInstance(ABCDEFGHIJ,).slice(-2,).toArray(),).toEqual(['i', 'j',],),)
            test("-1",  () => expect(newInstance(ABCDEFGHIJ,).slice(-1,).toArray(),).toEqual(['j',],),)

            test('0',   () => expect(newInstance(ABCDEFGHIJ,).slice(0,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',],),)
            test('1',   () => expect(newInstance(ABCDEFGHIJ,).slice(1,).toArray(),).toEqual(['b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',],),)
            test('2',   () => expect(newInstance(ABCDEFGHIJ,).slice(2,).toArray(),).toEqual(['c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',],),)
            test('3',   () => expect(newInstance(ABCDEFGHIJ,).slice(3,).toArray(),).toEqual(['d', 'e', 'f', 'g', 'h', 'i', 'j',],),)
            test('4',   () => expect(newInstance(ABCDEFGHIJ,).slice(4,).toArray(),).toEqual(['e', 'f', 'g', 'h', 'i', 'j',],),)
            test('5',   () => expect(newInstance(ABCDEFGHIJ,).slice(5,).toArray(),).toEqual(['f', 'g', 'h', 'i', 'j',],),)
            test('6',   () => expect(newInstance(ABCDEFGHIJ,).slice(6,).toArray(),).toEqual(['g', 'h', 'i', 'j',],),)
            test('7',   () => expect(newInstance(ABCDEFGHIJ,).slice(7,).toArray(),).toEqual(['h', 'i', 'j',],),)
            test('8',   () => expect(newInstance(ABCDEFGHIJ,).slice(8,).toArray(),).toEqual(['i', 'j',],),)
            test('9',   () => expect(newInstance(ABCDEFGHIJ,).slice(9,).toArray(),).toEqual(['j',],),)
        },)
        describe("to index", () => {
            test("-10", () => expect(newInstance(ABCDEFGHIJ,).slice(null, -10,).toArray(),).toEqual(['a',],),)
            test("-9",  () => expect(newInstance(ABCDEFGHIJ,).slice(null, -9,).toArray(),).toEqual(['a', 'b',],),)
            test("-8",  () => expect(newInstance(ABCDEFGHIJ,).slice(null, -8,).toArray(),).toEqual(['a', 'b', 'c',],),)
            test("-7",  () => expect(newInstance(ABCDEFGHIJ,).slice(null, -7,).toArray(),).toEqual(['a', 'b', 'c', 'd',],),)
            test("-6",  () => expect(newInstance(ABCDEFGHIJ,).slice(null, -6,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e',],),)
            test("-5",  () => expect(newInstance(ABCDEFGHIJ,).slice(null, -5,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f',],),)
            test("-4",  () => expect(newInstance(ABCDEFGHIJ,).slice(null, -4,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g',],),)
            test("-3",  () => expect(newInstance(ABCDEFGHIJ,).slice(null, -3,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',],),)
            test("-2",  () => expect(newInstance(ABCDEFGHIJ,).slice(null, -2,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',],),)
            test("-1",  () => expect(newInstance(ABCDEFGHIJ,).slice(null, -1,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',],),)

            test('0',   () => expect(newInstance(ABCDEFGHIJ,).slice(null, 0,).toArray(),).toEqual(['a',],),)
            test('1',   () => expect(newInstance(ABCDEFGHIJ,).slice(null, 1,).toArray(),).toEqual(['a', 'b',],),)
            test('2',   () => expect(newInstance(ABCDEFGHIJ,).slice(null, 2,).toArray(),).toEqual(['a', 'b', 'c',],),)
            test('3',   () => expect(newInstance(ABCDEFGHIJ,).slice(null, 3,).toArray(),).toEqual(['a', 'b', 'c', 'd',],),)
            test('4',   () => expect(newInstance(ABCDEFGHIJ,).slice(null, 4,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e',],),)
            test('5',   () => expect(newInstance(ABCDEFGHIJ,).slice(null, 5,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f',],),)
            test('6',   () => expect(newInstance(ABCDEFGHIJ,).slice(null, 6,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g',],),)
            test('7',   () => expect(newInstance(ABCDEFGHIJ,).slice(null, 7,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',],),)
            test('8',   () => expect(newInstance(ABCDEFGHIJ,).slice(null, 8,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',],),)
            test('9',   () => expect(newInstance(ABCDEFGHIJ,).slice(null, 9,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',],),)
        },)
        describe("limit", () => {
            test("-10" , () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, -10,).toArray(),).toEqual([],),)
            test("-9",   () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, -9,).toArray(),).toEqual(['a',],),)
            test("-8",   () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, -8,).toArray(),).toEqual(['a', 'b',],),)
            test("-7",   () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, -7,).toArray(),).toEqual(['a', 'b', 'c',],),)
            test("-6",   () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, -6,).toArray(),).toEqual(['a', 'b', 'c', 'd',],),)
            test("-5",   () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, -5,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e',],),)
            test("-4",   () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, -4,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f',],),)
            test("-3",   () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, -3,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g',],),)
            test("-2",   () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, -2,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',],),)
            test("-1",   () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, -1,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',],),)

            test('0',    () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, 0,).toArray(),).toEqual([],),)
            test('1',    () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, 1,).toArray(),).toEqual(['a',],),)
            test('2',    () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, 2,).toArray(),).toEqual(['a', 'b',],),)
            test('3',    () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, 3,).toArray(),).toEqual(['a', 'b', 'c',],),)
            test('4',    () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, 4,).toArray(),).toEqual(['a', 'b', 'c', 'd',],),)
            test('5',    () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, 5,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e',],),)
            test('6',    () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, 6,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f',],),)
            test('7',    () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, 7,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g',],),)
            test('8',    () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, 8,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',],),)
            test('9',    () => expect(newInstance(ABCDEFGHIJ,).slice(null, null, 9,).toArray(),).toEqual(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',],),)
        },)

        describe("mixed from/to index", () => {
            test("(2, 2)",   () => expect(newInstance(ABCDEFGHIJ,).slice(2, 2,).toArray(),).toEqual(['c',],),)
            test("(2, 3)",   () => expect(newInstance(ABCDEFGHIJ,).slice(2, 3,).toArray(),).toEqual(['c', 'd',],),)
            test("(2, 4)",   () => expect(newInstance(ABCDEFGHIJ,).slice(2, 4,).toArray(),).toEqual(['c', 'd', 'e',],),)
            test("(2, 5)",   () => expect(newInstance(ABCDEFGHIJ,).slice(2, 5,).toArray(),).toEqual(['c', 'd', 'e', 'f',],),)
            test("(2, 6)",   () => expect(newInstance(ABCDEFGHIJ,).slice(2, 6,).toArray(),).toEqual(['c', 'd', 'e', 'f', 'g',],),)
            test("(2, 7)",   () => expect(newInstance(ABCDEFGHIJ,).slice(2, 7,).toArray(),).toEqual(['c', 'd', 'e', 'f', 'g', 'h',],),)
            test("(2, 8)",   () => expect(newInstance(ABCDEFGHIJ,).slice(2, 8,).toArray(),).toEqual(['c', 'd', 'e', 'f', 'g', 'h', 'i',],),)
            test("(2, 9)",   () => expect(newInstance(ABCDEFGHIJ,).slice(2, 9,).toArray(),).toEqual(['c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',],),)

            test("(-8, -1)", () => expect(newInstance(ABCDEFGHIJ,).slice(-8, -1,).toArray(),).toEqual(['c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',],),)
            test("(-8, -2)", () => expect(newInstance(ABCDEFGHIJ,).slice(-8, -2,).toArray(),).toEqual(['c', 'd', 'e', 'f', 'g', 'h', 'i',],),)
            test("(-8, -3)", () => expect(newInstance(ABCDEFGHIJ,).slice(-8, -3,).toArray(),).toEqual(['c', 'd', 'e', 'f', 'g', 'h',],),)
            test("(-8, -4)", () => expect(newInstance(ABCDEFGHIJ,).slice(-8, -4,).toArray(),).toEqual(['c', 'd', 'e', 'f', 'g',],),)
            test("(-8, -5)", () => expect(newInstance(ABCDEFGHIJ,).slice(-8, -5,).toArray(),).toEqual(['c', 'd', 'e', 'f',],),)
            test("(-8, -6)", () => expect(newInstance(ABCDEFGHIJ,).slice(-8, -6,).toArray(),).toEqual(['c', 'd', 'e',],),)
            test("(-8, -7)", () => expect(newInstance(ABCDEFGHIJ,).slice(-8, -7,).toArray(),).toEqual(['c', 'd',],),)
            test("(-8, -8)", () => expect(newInstance(ABCDEFGHIJ,).slice(-8, -8,).toArray(),).toEqual(['c',],),)
        },)

        describe("error", () => {
            describe("from > to", () => {
                test("(0, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).slice(0, 1,).toString(),).not.toThrow(),)
                test("(1, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).slice(1, 1,).toString(),).not.toThrow(),)
                test("(2, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).slice(2, 1,),).toThrow(InvalidIndexRangeException,),)
                test("(3, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).slice(3, 1,),).toThrow(InvalidIndexRangeException,),)
                test("(4, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).slice(4, 1,),).toThrow(InvalidIndexRangeException,),)
                test("(5, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).slice(5, 1,),).toThrow(InvalidIndexRangeException,),)
                test("(6, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).slice(6, 1,),).toThrow(InvalidIndexRangeException,),)
                test("(7, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).slice(7, 1,),).toThrow(InvalidIndexRangeException,),)
                test("(8, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).slice(8, 1,),).toThrow(InvalidIndexRangeException,),)
                test("(9, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).slice(9, 1,),).toThrow(InvalidIndexRangeException,),)
            },)
            describe("from index", () => {
                test('9',   () => expect(() => newInstance(ABCDEFGHIJ,).slice(9,).toString(),).not.toThrow(),)
                test("10",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(10,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("11",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(11,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-9",   () => expect(() => newInstance(ABCDEFGHIJ,).slice(-9,).toString(),).not.toThrow(),)
                test("-10",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(-10,).toString(),).not.toThrow(),)
                test("-11",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(-11,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("400",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(400,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-400", () => expect(() => newInstance(ABCDEFGHIJ,).slice(-400,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(ABCDEFGHIJ,).slice(Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(ABCDEFGHIJ,).slice(-Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("to index", () => {
                test('9',   () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, 9,).toString(),).not.toThrow(),)
                test("10",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, 10,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("11",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, 11,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-9",   () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, -9,).toString(),).not.toThrow(),)
                test("-10",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, -10,).toString(),).not.toThrow(),)
                test("-11",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, -11,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("400",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, 400,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-400", () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, -400,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("limit", () => {
                test('9',   () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, null, 9,).toString(),).not.toThrow(),)
                test("10",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, null, 10,).toString(),).not.toThrow(),)
                test("11",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, null, 11,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-9",   () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, null, -9,).toString(),).not.toThrow(),)
                test("-10",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, null, -10,).toString(),).not.toThrow(),)
                test("-11",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, null, -11,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("400",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, null, 400,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-400", () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, null, -400,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, null, Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(ABCDEFGHIJ,).slice(null, null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
        },)

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
    },)

    if (isExtensionOnly)
        return
    describe("invalid numbers", () => {
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
    },)
},)},)
