/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {ABCDEFGHIJ}            from "./constantCollections"
import {everyInstances}        from "./constantValues"
import {newCollectionInstance} from "./newCollectionInstance"

import {CollectionHolderIndexOutOfBoundsException} from "../src/exception/CollectionHolderIndexOutOfBoundsException"

describe("CollectionHolderTest (reverse)", () =>
describe.each(everyInstances,)("%s", ({value: instance,},) => {
    const INSTANCE = () => newCollectionInstance(instance, ABCDEFGHIJ,)


    test("no arguments", () => expect(INSTANCE().toReversed().toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
    describe("from index", () => {
        test("-10", () => expect(INSTANCE().toReversed(-10,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
        test("-9",  () => expect(INSTANCE().toReversed(-9,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b',],),)
        test("-8",  () => expect(INSTANCE().toReversed(-8,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
        test("-7",  () => expect(INSTANCE().toReversed(-7,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd',],),)
        test("-6",  () => expect(INSTANCE().toReversed(-6,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e',],),)
        test("-5",  () => expect(INSTANCE().toReversed(-5,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f',],),)
        test("-4",  () => expect(INSTANCE().toReversed(-4,).toArray(),).toEqual(['j', 'i', 'h', 'g',],),)
        test("-3",  () => expect(INSTANCE().toReversed(-3,).toArray(),).toEqual(['j', 'i', 'h',],),)
        test("-2",  () => expect(INSTANCE().toReversed(-2,).toArray(),).toEqual(['j', 'i',],),)
        test("-1",  () => expect(INSTANCE().toReversed(-1,).toArray(),).toEqual(['j',],),)

        test('0',   () => expect(INSTANCE().toReversed(0,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
        test('1',   () => expect(INSTANCE().toReversed(1,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b',],),)
        test('2',   () => expect(INSTANCE().toReversed(2,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
        test('3',   () => expect(INSTANCE().toReversed(3,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd',],),)
        test('4',   () => expect(INSTANCE().toReversed(4,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e',],),)
        test('5',   () => expect(INSTANCE().toReversed(5,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f',],),)
        test('6',   () => expect(INSTANCE().toReversed(6,).toArray(),).toEqual(['j', 'i', 'h', 'g',],),)
        test('7',   () => expect(INSTANCE().toReversed(7,).toArray(),).toEqual(['j', 'i', 'h',],),)
        test('8',   () => expect(INSTANCE().toReversed(8,).toArray(),).toEqual(['j', 'i',],),)
        test('9',   () => expect(INSTANCE().toReversed(9,).toArray(),).toEqual(['j',],),)
    },)
    describe("to index", () => {
        test("-10", () => expect(INSTANCE().toReversed(null, -10,).toArray(),).toEqual(['a',],),)
        test("-9",  () => expect(INSTANCE().toReversed(null, -9,).toArray(),).toEqual(['b', 'a',],),)
        test("-8",  () => expect(INSTANCE().toReversed(null, -8,).toArray(),).toEqual(['c', 'b', 'a',],),)
        test("-7",  () => expect(INSTANCE().toReversed(null, -7,).toArray(),).toEqual(['d', 'c', 'b', 'a',],),)
        test("-6",  () => expect(INSTANCE().toReversed(null, -6,).toArray(),).toEqual(['e', 'd', 'c', 'b', 'a',],),)
        test("-5",  () => expect(INSTANCE().toReversed(null, -5,).toArray(),).toEqual(['f', 'e', 'd', 'c', 'b', 'a',],),)
        test("-4",  () => expect(INSTANCE().toReversed(null, -4,).toArray(),).toEqual(['g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
        test("-3",  () => expect(INSTANCE().toReversed(null, -3,).toArray(),).toEqual(['h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
        test("-2",  () => expect(INSTANCE().toReversed(null, -2,).toArray(),).toEqual(['i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
        test("-1",  () => expect(INSTANCE().toReversed(null, -1,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)

        test('0',   () => expect(INSTANCE().toReversed(null, 0,).toArray(),).toEqual(['a',],),)
        test('1',   () => expect(INSTANCE().toReversed(null, 1,).toArray(),).toEqual(['b', 'a',],),)
        test('2',   () => expect(INSTANCE().toReversed(null, 2,).toArray(),).toEqual(['c', 'b', 'a',],),)
        test('3',   () => expect(INSTANCE().toReversed(null, 3,).toArray(),).toEqual(['d', 'c', 'b', 'a',],),)
        test('4',   () => expect(INSTANCE().toReversed(null, 4,).toArray(),).toEqual(['e', 'd', 'c', 'b', 'a',],),)
        test('5',   () => expect(INSTANCE().toReversed(null, 5,).toArray(),).toEqual(['f', 'e', 'd', 'c', 'b', 'a',],),)
        test('6',   () => expect(INSTANCE().toReversed(null, 6,).toArray(),).toEqual(['g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
        test('7',   () => expect(INSTANCE().toReversed(null, 7,).toArray(),).toEqual(['h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
        test('8',   () => expect(INSTANCE().toReversed(null, 8,).toArray(),).toEqual(['i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
        test('9',   () => expect(INSTANCE().toReversed(null, 9,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
    },)


    describe("mixed from/to index", () => {
        test("(2, 2)",   () => expect(INSTANCE().toReversed(2, 2,).toArray(),).toEqual(['c',],),)
        test("(2, 3)",   () => expect(INSTANCE().toReversed(2, 3,).toArray(),).toEqual(['d', 'c',],),)
        test("(2, 4)",   () => expect(INSTANCE().toReversed(2, 4,).toArray(),).toEqual(['e', 'd', 'c',],),)
        test("(2, 5)",   () => expect(INSTANCE().toReversed(2, 5,).toArray(),).toEqual(['f', 'e', 'd', 'c',],),)
        test("(2, 6)",   () => expect(INSTANCE().toReversed(2, 6,).toArray(),).toEqual(['g', 'f', 'e', 'd', 'c',],),)
        test("(2, 7)",   () => expect(INSTANCE().toReversed(2, 7,).toArray(),).toEqual(['h', 'g', 'f', 'e', 'd', 'c',],),)
        test("(2, 8)",   () => expect(INSTANCE().toReversed(2, 8,).toArray(),).toEqual(['i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
        test("(2, 9)",   () => expect(INSTANCE().toReversed(2, 9,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)

        test("(-8, -1)", () => expect(INSTANCE().toReversed(-8, -1,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
        test("(-8, -2)", () => expect(INSTANCE().toReversed(-8, -2,).toArray(),).toEqual(['i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
        test("(-8, -3)", () => expect(INSTANCE().toReversed(-8, -3,).toArray(),).toEqual(['h', 'g', 'f', 'e', 'd', 'c',],),)
        test("(-8, -4)", () => expect(INSTANCE().toReversed(-8, -4,).toArray(),).toEqual(['g', 'f', 'e', 'd', 'c',],),)
        test("(-8, -5)", () => expect(INSTANCE().toReversed(-8, -5,).toArray(),).toEqual(['f', 'e', 'd', 'c',],),)
        test("(-8, -6)", () => expect(INSTANCE().toReversed(-8, -6,).toArray(),).toEqual(['e', 'd', 'c',],),)
        test("(-8, -7)", () => expect(INSTANCE().toReversed(-8, -7,).toArray(),).toEqual(['d', 'c',],),)
        test("(-8, -8)", () => expect(INSTANCE().toReversed(-8, -8,).toArray(),).toEqual(['c',],),)
    },)

    describe("error", () => {
        describe("from > to", () => {
            test("(0, 1)", () => expect(() => INSTANCE().toReversed(0, 1,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(1, 1)", () => expect(() => INSTANCE().toReversed(1, 1,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(2, 1)", () => expect(() => INSTANCE().toReversed(2, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(3, 1)", () => expect(() => INSTANCE().toReversed(3, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(4, 1)", () => expect(() => INSTANCE().toReversed(4, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(5, 1)", () => expect(() => INSTANCE().toReversed(5, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(6, 1)", () => expect(() => INSTANCE().toReversed(6, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(7, 1)", () => expect(() => INSTANCE().toReversed(7, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(8, 1)", () => expect(() => INSTANCE().toReversed(8, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(9, 1)", () => expect(() => INSTANCE().toReversed(9, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        },)
        describe("from index", () => {
            test('9',    () => expect(() => INSTANCE().toReversed(9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("10",   () => expect(() => INSTANCE().toReversed(10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("11",   () => expect(() => INSTANCE().toReversed(11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

            test("-9",   () => expect(() => INSTANCE().toReversed(-9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-10",  () => expect(() => INSTANCE().toReversed(-10,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-11",  () => expect(() => INSTANCE().toReversed(-11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

            test("400",  () => expect(() => INSTANCE().toReversed(400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-400", () => expect(() => INSTANCE().toReversed(-400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        },)
        describe("to index", () => {
            test('9',    () => expect(() => INSTANCE().toReversed(null, 9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("10",   () => expect(() => INSTANCE().toReversed(null, 10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("11",   () => expect(() => INSTANCE().toReversed(null, 11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

            test("-9",   () => expect(() => INSTANCE().toReversed(null, -9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-10",  () => expect(() => INSTANCE().toReversed(null, -10,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-11",  () => expect(() => INSTANCE().toReversed(null, -11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

            test("400",  () => expect(() => INSTANCE().toReversed(null, 400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-400", () => expect(() => INSTANCE().toReversed(null, -400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        },)
        describe("limit", () => {
            test('9',    () => expect(() => INSTANCE().toReversed(null, null, 9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("10",   () => expect(() => INSTANCE().toReversed(null, null, 10,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("11",   () => expect(() => INSTANCE().toReversed(null, null, 11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

            test("-9",   () => expect(() => INSTANCE().toReversed(null, null, -9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-10",  () => expect(() => INSTANCE().toReversed(null, null, -10,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-11",  () => expect(() => INSTANCE().toReversed(null, null, -11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

            test("400",  () => expect(() => INSTANCE().toReversed(null, null, 400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-400", () => expect(() => INSTANCE().toReversed(null, null, -400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        },)
    },)
},),)
