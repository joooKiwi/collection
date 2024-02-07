/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {ABCDEFGHIJ}            from "./constantCollections"
import {everyInstances}        from "./constantValues"
import {newCollectionInstance} from "./newCollectionInstance"

import type {Nullable}         from "../src/general type"
import type {CollectionHolder} from "../src/CollectionHolder"

import {CollectionHolderIndexOutOfBoundsException} from "../src/exception/CollectionHolderIndexOutOfBoundsException"
import {LazyGenericCollectionHolder}               from "../src/LazyGenericCollectionHolder"
import {GenericCollectionHolder}                   from "../src/GenericCollectionHolder"

describe("CollectionHolderTest (reverse)", () => {

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("toReversed", () => {
                const instance = new class GenericCollectionHolder_ToReversedTest extends GenericCollectionHolder {

                    public amountOfCall = 0
                    public override toReversed(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<unknown> {
                        this.amountOfCall++
                        return super.toReversed(fromIndex, toIndex, limit,)
                    }

                }(ABCDEFGHIJ,)
                instance.toReversed()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("reversed", () => {
                const instance = new class GenericCollectionHolder_ReversedTest extends GenericCollectionHolder {

                    public amountOfCall = 0
                    public override reversed(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<unknown> {
                        this.amountOfCall++
                        return super.reversed(fromIndex, toIndex, limit,)
                    }

                }(ABCDEFGHIJ,)
                instance.reversed()
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("toReversed", () => {
                const instance = new class LazyGenericCollectionHolder_ToReversedTest extends LazyGenericCollectionHolder {

                    public amountOfCall = 0
                    public override toReversed(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<unknown> {
                        this.amountOfCall++
                        return super.toReversed(fromIndex, toIndex, limit,)
                    }

                }(ABCDEFGHIJ,)
                instance.toReversed()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("reversed", () => {
                const instance = new class LazyGenericCollectionHolder_ReversedTest extends LazyGenericCollectionHolder {

                    public amountOfCall = 0
                    public override reversed(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<unknown> {
                        this.amountOfCall++
                        return super.reversed(fromIndex, toIndex, limit,)
                    }

                }(ABCDEFGHIJ,)
                instance.reversed()
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
    },)

    describe.each(everyInstances,)("%s", ({value: instance,},) => {
        const INSTANCE = () => newCollectionInstance(instance, ABCDEFGHIJ,)

        test("no arguments", () => expect(INSTANCE().toReverse().toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
        describe("from index", () => {
            test("-10", () => expect(INSTANCE().toReverse(-10,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test("-9",  () => expect(INSTANCE().toReverse(-9,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b',],),)
            test("-8",  () => expect(INSTANCE().toReverse(-8,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
            test("-7",  () => expect(INSTANCE().toReverse(-7,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd',],),)
            test("-6",  () => expect(INSTANCE().toReverse(-6,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e',],),)
            test("-5",  () => expect(INSTANCE().toReverse(-5,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f',],),)
            test("-4",  () => expect(INSTANCE().toReverse(-4,).toArray(),).toEqual(['j', 'i', 'h', 'g',],),)
            test("-3",  () => expect(INSTANCE().toReverse(-3,).toArray(),).toEqual(['j', 'i', 'h',],),)
            test("-2",  () => expect(INSTANCE().toReverse(-2,).toArray(),).toEqual(['j', 'i',],),)
            test("-1",  () => expect(INSTANCE().toReverse(-1,).toArray(),).toEqual(['j',],),)

            test('0',   () => expect(INSTANCE().toReverse(0,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test('1',   () => expect(INSTANCE().toReverse(1,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b',],),)
            test('2',   () => expect(INSTANCE().toReverse(2,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
            test('3',   () => expect(INSTANCE().toReverse(3,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd',],),)
            test('4',   () => expect(INSTANCE().toReverse(4,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e',],),)
            test('5',   () => expect(INSTANCE().toReverse(5,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f',],),)
            test('6',   () => expect(INSTANCE().toReverse(6,).toArray(),).toEqual(['j', 'i', 'h', 'g',],),)
            test('7',   () => expect(INSTANCE().toReverse(7,).toArray(),).toEqual(['j', 'i', 'h',],),)
            test('8',   () => expect(INSTANCE().toReverse(8,).toArray(),).toEqual(['j', 'i',],),)
            test('9',   () => expect(INSTANCE().toReverse(9,).toArray(),).toEqual(['j',],),)
        },)
        describe("to index", () => {
            test("-10", () => expect(INSTANCE().toReverse(null, -10,).toArray(),).toEqual(['a',],),)
            test("-9",  () => expect(INSTANCE().toReverse(null, -9,).toArray(),).toEqual(['b', 'a',],),)
            test("-8",  () => expect(INSTANCE().toReverse(null, -8,).toArray(),).toEqual(['c', 'b', 'a',],),)
            test("-7",  () => expect(INSTANCE().toReverse(null, -7,).toArray(),).toEqual(['d', 'c', 'b', 'a',],),)
            test("-6",  () => expect(INSTANCE().toReverse(null, -6,).toArray(),).toEqual(['e', 'd', 'c', 'b', 'a',],),)
            test("-5",  () => expect(INSTANCE().toReverse(null, -5,).toArray(),).toEqual(['f', 'e', 'd', 'c', 'b', 'a',],),)
            test("-4",  () => expect(INSTANCE().toReverse(null, -4,).toArray(),).toEqual(['g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test("-3",  () => expect(INSTANCE().toReverse(null, -3,).toArray(),).toEqual(['h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test("-2",  () => expect(INSTANCE().toReverse(null, -2,).toArray(),).toEqual(['i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test("-1",  () => expect(INSTANCE().toReverse(null, -1,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)

            test('0',   () => expect(INSTANCE().toReverse(null, 0,).toArray(),).toEqual(['a',],),)
            test('1',   () => expect(INSTANCE().toReverse(null, 1,).toArray(),).toEqual(['b', 'a',],),)
            test('2',   () => expect(INSTANCE().toReverse(null, 2,).toArray(),).toEqual(['c', 'b', 'a',],),)
            test('3',   () => expect(INSTANCE().toReverse(null, 3,).toArray(),).toEqual(['d', 'c', 'b', 'a',],),)
            test('4',   () => expect(INSTANCE().toReverse(null, 4,).toArray(),).toEqual(['e', 'd', 'c', 'b', 'a',],),)
            test('5',   () => expect(INSTANCE().toReverse(null, 5,).toArray(),).toEqual(['f', 'e', 'd', 'c', 'b', 'a',],),)
            test('6',   () => expect(INSTANCE().toReverse(null, 6,).toArray(),).toEqual(['g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test('7',   () => expect(INSTANCE().toReverse(null, 7,).toArray(),).toEqual(['h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test('8',   () => expect(INSTANCE().toReverse(null, 8,).toArray(),).toEqual(['i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test('9',   () => expect(INSTANCE().toReverse(null, 9,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
        },)


        describe("mixed from/to index", () => {
            test("(2, 2)",   () => expect(INSTANCE().toReverse(2, 2,).toArray(),).toEqual(['c',],),)
            test("(2, 3)",   () => expect(INSTANCE().toReverse(2, 3,).toArray(),).toEqual(['d', 'c',],),)
            test("(2, 4)",   () => expect(INSTANCE().toReverse(2, 4,).toArray(),).toEqual(['e', 'd', 'c',],),)
            test("(2, 5)",   () => expect(INSTANCE().toReverse(2, 5,).toArray(),).toEqual(['f', 'e', 'd', 'c',],),)
            test("(2, 6)",   () => expect(INSTANCE().toReverse(2, 6,).toArray(),).toEqual(['g', 'f', 'e', 'd', 'c',],),)
            test("(2, 7)",   () => expect(INSTANCE().toReverse(2, 7,).toArray(),).toEqual(['h', 'g', 'f', 'e', 'd', 'c',],),)
            test("(2, 8)",   () => expect(INSTANCE().toReverse(2, 8,).toArray(),).toEqual(['i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
            test("(2, 9)",   () => expect(INSTANCE().toReverse(2, 9,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)

            test("(-8, -1)", () => expect(INSTANCE().toReverse(-8, -1,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
            test("(-8, -2)", () => expect(INSTANCE().toReverse(-8, -2,).toArray(),).toEqual(['i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
            test("(-8, -3)", () => expect(INSTANCE().toReverse(-8, -3,).toArray(),).toEqual(['h', 'g', 'f', 'e', 'd', 'c',],),)
            test("(-8, -4)", () => expect(INSTANCE().toReverse(-8, -4,).toArray(),).toEqual(['g', 'f', 'e', 'd', 'c',],),)
            test("(-8, -5)", () => expect(INSTANCE().toReverse(-8, -5,).toArray(),).toEqual(['f', 'e', 'd', 'c',],),)
            test("(-8, -6)", () => expect(INSTANCE().toReverse(-8, -6,).toArray(),).toEqual(['e', 'd', 'c',],),)
            test("(-8, -7)", () => expect(INSTANCE().toReverse(-8, -7,).toArray(),).toEqual(['d', 'c',],),)
            test("(-8, -8)", () => expect(INSTANCE().toReverse(-8, -8,).toArray(),).toEqual(['c',],),)
        },)

        describe("error", () => {
            describe("from > to", () => {
                test("(0, 1)", () => expect(() => INSTANCE().toReverse(0, 1,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(1, 1)", () => expect(() => INSTANCE().toReverse(1, 1,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(2, 1)", () => expect(() => INSTANCE().toReverse(2, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(3, 1)", () => expect(() => INSTANCE().toReverse(3, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(4, 1)", () => expect(() => INSTANCE().toReverse(4, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(5, 1)", () => expect(() => INSTANCE().toReverse(5, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(6, 1)", () => expect(() => INSTANCE().toReverse(6, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(7, 1)", () => expect(() => INSTANCE().toReverse(7, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(8, 1)", () => expect(() => INSTANCE().toReverse(8, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(9, 1)", () => expect(() => INSTANCE().toReverse(9, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            },)
            describe("from index", () => {
                test('9',    () => expect(() => INSTANCE().toReverse(9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("10",   () => expect(() => INSTANCE().toReverse(10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("11",   () => expect(() => INSTANCE().toReverse(11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-9",   () => expect(() => INSTANCE().toReverse(-9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-10",  () => expect(() => INSTANCE().toReverse(-10,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-11",  () => expect(() => INSTANCE().toReverse(-11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("400",  () => expect(() => INSTANCE().toReverse(400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-400", () => expect(() => INSTANCE().toReverse(-400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            },)
            describe("to index", () => {
                test('9',    () => expect(() => INSTANCE().toReverse(null, 9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("10",   () => expect(() => INSTANCE().toReverse(null, 10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("11",   () => expect(() => INSTANCE().toReverse(null, 11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-9",   () => expect(() => INSTANCE().toReverse(null, -9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-10",  () => expect(() => INSTANCE().toReverse(null, -10,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-11",  () => expect(() => INSTANCE().toReverse(null, -11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("400",  () => expect(() => INSTANCE().toReverse(null, 400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-400", () => expect(() => INSTANCE().toReverse(null, -400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            },)
            describe("limit", () => {
                test('9',    () => expect(() => INSTANCE().toReverse(null, null, 9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("10",   () => expect(() => INSTANCE().toReverse(null, null, 10,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("11",   () => expect(() => INSTANCE().toReverse(null, null, 11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-9",   () => expect(() => INSTANCE().toReverse(null, null, -9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-10",  () => expect(() => INSTANCE().toReverse(null, null, -10,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-11",  () => expect(() => INSTANCE().toReverse(null, null, -11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("400",  () => expect(() => INSTANCE().toReverse(null, null, 400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-400", () => expect(() => INSTANCE().toReverse(null, null, -400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            },)
        },)
    },)

},)
