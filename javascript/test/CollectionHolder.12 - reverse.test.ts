/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {ABCDEFGHIJ}                                 from "./constantCollections"
import {everyInstance}                              from "./constantValues"
import {GenericCollectionHolder_ToReverseAlias}     from "./instance/GenericCollectionHolder_ToReverseAlias"
import {LazyGenericCollectionHolder_ToReverseAlias} from "./instance/LazyGenericCollectionHolder_ToReverseAlias"

import {CollectionHolderIndexOutOfBoundsException} from "../src/exception/CollectionHolderIndexOutOfBoundsException"
import {ForbiddenIndexException}                   from "../src/exception/ForbiddenIndexException"

describe("CollectionHolderTest (reverse)", () => {

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("toReversed", () => {
                const instance = new GenericCollectionHolder_ToReverseAlias()
                instance.toReversed()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("reversed", () => {
                const instance = new GenericCollectionHolder_ToReverseAlias()
                instance.reversed()
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("toReversed", () => {
                const instance = new LazyGenericCollectionHolder_ToReverseAlias()
                instance.toReversed()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("reversed", () => {
                const instance = new LazyGenericCollectionHolder_ToReverseAlias()
                instance.reversed()
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
    },)

    describe.each(everyInstance,)("%s", ({value: {newInstance,},},) => {
        test("no arguments", () => expect(newInstance(ABCDEFGHIJ,).toReverse().toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
        describe("from index", () => {
            test("-10", () => expect(newInstance(ABCDEFGHIJ,).toReverse(-10,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test("-9",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(-9,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b',],),)
            test("-8",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(-8,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
            test("-7",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(-7,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd',],),)
            test("-6",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(-6,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e',],),)
            test("-5",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(-5,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f',],),)
            test("-4",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(-4,).toArray(),).toEqual(['j', 'i', 'h', 'g',],),)
            test("-3",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(-3,).toArray(),).toEqual(['j', 'i', 'h',],),)
            test("-2",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(-2,).toArray(),).toEqual(['j', 'i',],),)
            test("-1",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(-1,).toArray(),).toEqual(['j',],),)

            test('0',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(0,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test('1',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(1,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b',],),)
            test('2',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(2,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
            test('3',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(3,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd',],),)
            test('4',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(4,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e',],),)
            test('5',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(5,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f',],),)
            test('6',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(6,).toArray(),).toEqual(['j', 'i', 'h', 'g',],),)
            test('7',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(7,).toArray(),).toEqual(['j', 'i', 'h',],),)
            test('8',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(8,).toArray(),).toEqual(['j', 'i',],),)
            test('9',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(9,).toArray(),).toEqual(['j',],),)
        },)
        describe("to index", () => {
            test("-10", () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, -10,).toArray(),).toEqual(['a',],),)
            test("-9",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, -9,).toArray(),).toEqual(['b', 'a',],),)
            test("-8",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, -8,).toArray(),).toEqual(['c', 'b', 'a',],),)
            test("-7",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, -7,).toArray(),).toEqual(['d', 'c', 'b', 'a',],),)
            test("-6",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, -6,).toArray(),).toEqual(['e', 'd', 'c', 'b', 'a',],),)
            test("-5",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, -5,).toArray(),).toEqual(['f', 'e', 'd', 'c', 'b', 'a',],),)
            test("-4",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, -4,).toArray(),).toEqual(['g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test("-3",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, -3,).toArray(),).toEqual(['h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test("-2",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, -2,).toArray(),).toEqual(['i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test("-1",  () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, -1,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)

            test('0',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, 0,).toArray(),).toEqual(['a',],),)
            test('1',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, 1,).toArray(),).toEqual(['b', 'a',],),)
            test('2',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, 2,).toArray(),).toEqual(['c', 'b', 'a',],),)
            test('3',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, 3,).toArray(),).toEqual(['d', 'c', 'b', 'a',],),)
            test('4',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, 4,).toArray(),).toEqual(['e', 'd', 'c', 'b', 'a',],),)
            test('5',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, 5,).toArray(),).toEqual(['f', 'e', 'd', 'c', 'b', 'a',],),)
            test('6',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, 6,).toArray(),).toEqual(['g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test('7',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, 7,).toArray(),).toEqual(['h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test('8',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, 8,).toArray(),).toEqual(['i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test('9',   () => expect(newInstance(ABCDEFGHIJ,).toReverse(null, 9,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
        },)


        describe("mixed from/to index", () => {
            test("(2, 2)",   () => expect(newInstance(ABCDEFGHIJ,).toReverse(2, 2,).toArray(),).toEqual(['c',],),)
            test("(2, 3)",   () => expect(newInstance(ABCDEFGHIJ,).toReverse(2, 3,).toArray(),).toEqual(['d', 'c',],),)
            test("(2, 4)",   () => expect(newInstance(ABCDEFGHIJ,).toReverse(2, 4,).toArray(),).toEqual(['e', 'd', 'c',],),)
            test("(2, 5)",   () => expect(newInstance(ABCDEFGHIJ,).toReverse(2, 5,).toArray(),).toEqual(['f', 'e', 'd', 'c',],),)
            test("(2, 6)",   () => expect(newInstance(ABCDEFGHIJ,).toReverse(2, 6,).toArray(),).toEqual(['g', 'f', 'e', 'd', 'c',],),)
            test("(2, 7)",   () => expect(newInstance(ABCDEFGHIJ,).toReverse(2, 7,).toArray(),).toEqual(['h', 'g', 'f', 'e', 'd', 'c',],),)
            test("(2, 8)",   () => expect(newInstance(ABCDEFGHIJ,).toReverse(2, 8,).toArray(),).toEqual(['i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
            test("(2, 9)",   () => expect(newInstance(ABCDEFGHIJ,).toReverse(2, 9,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)

            test("(-8, -1)", () => expect(newInstance(ABCDEFGHIJ,).toReverse(-8, -1,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
            test("(-8, -2)", () => expect(newInstance(ABCDEFGHIJ,).toReverse(-8, -2,).toArray(),).toEqual(['i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
            test("(-8, -3)", () => expect(newInstance(ABCDEFGHIJ,).toReverse(-8, -3,).toArray(),).toEqual(['h', 'g', 'f', 'e', 'd', 'c',],),)
            test("(-8, -4)", () => expect(newInstance(ABCDEFGHIJ,).toReverse(-8, -4,).toArray(),).toEqual(['g', 'f', 'e', 'd', 'c',],),)
            test("(-8, -5)", () => expect(newInstance(ABCDEFGHIJ,).toReverse(-8, -5,).toArray(),).toEqual(['f', 'e', 'd', 'c',],),)
            test("(-8, -6)", () => expect(newInstance(ABCDEFGHIJ,).toReverse(-8, -6,).toArray(),).toEqual(['e', 'd', 'c',],),)
            test("(-8, -7)", () => expect(newInstance(ABCDEFGHIJ,).toReverse(-8, -7,).toArray(),).toEqual(['d', 'c',],),)
            test("(-8, -8)", () => expect(newInstance(ABCDEFGHIJ,).toReverse(-8, -8,).toArray(),).toEqual(['c',],),)
        },)

        describe("error", () => {
            describe("from > to", () => {
                test("(0, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(0, 1,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(1, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(1, 1,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(2, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(2, 1,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(3, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(3, 1,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(4, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(4, 1,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(5, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(5, 1,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(6, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(6, 1,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(7, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(7, 1,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(8, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(8, 1,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(9, 1)", () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(9, 1,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            },)
            describe("from index", () => {
                test('9',    () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(9,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("10",   () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(10,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("11",   () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(11,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-9",   () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(-9,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-10",  () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(-10,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-11",  () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(-11,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("400",  () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(400,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-400", () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(-400,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN", () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",  () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(-Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("to index", () => {
                test('9',    () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, 9,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("10",   () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, 10,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("11",   () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, 11,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-9",   () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, -9,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-10",  () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, -10,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-11",  () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, -11,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("400",  () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, 400,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-400", () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, -400,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("limit", () => {
                test('9',    () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, null, 9,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("10",   () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, null, 10,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("11",   () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, null, 11,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-9",   () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, null, -9,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-10",  () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, null, -10,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-11",  () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, null, -11,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("400",  () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, null, 400,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-400", () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, null, -400,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("NaN",  () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, null, NaN,),).toThrow(ForbiddenIndexException,),)
                test("+∞",   () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, null, Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-∞",   () => expect(() => newInstance(ABCDEFGHIJ,).toReverse(null, null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
        },)
    },)

},)
