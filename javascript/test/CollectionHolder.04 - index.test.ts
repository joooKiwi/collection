/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, AB_AB, ABCD, ABCD_ABCD, EMPTY} from "./constantCollections"
import {everyInstances}                    from "./constantValues"
import {newCollectionInstance}             from "./newCollectionInstance"

import {CollectionHolderIndexOutOfBoundsException} from "../src/exception/CollectionHolderIndexOutOfBoundsException"

describe("CollectionHolderTest (value)", () => {

    describe.each(everyInstances,)("%s", ({value: instance,},) => {
        //#region -------------------- Instances --------------------

        const EMPTY_INSTANCE = () => newCollectionInstance(instance, EMPTY,)
        const AB_INSTANCE = () => newCollectionInstance(instance, AB,)
        const ABCD_INSTANCE = () => newCollectionInstance(instance, ABCD,)
        const AB_AB_INSTANCE = () => newCollectionInstance(instance, AB_AB,)
        const ABCD_ABCD_INSTANCE = () => newCollectionInstance(instance, ABCD_ABCD,)

        //#endregion -------------------- Instances --------------------

        describe("index of", () => {
            describe("known null return", () => {
                test("empty",                 () => expect(EMPTY_INSTANCE().indexOf('a',),).toBeNull(),)
                test("from and to index = 0", () => expect(AB_INSTANCE().indexOf('a', 0, 0,),).toBeNull(),)
                test("limit = 0",             () => expect(AB_INSTANCE().indexOf('a', null, null, 0,),).toBeNull(),)
            },)
            describe("[a,b]", () => {
                describe("direct", () => {
                    test('a', () => expect(AB_INSTANCE().indexOf('a',),).toBe(0,),)
                    test('b', () => expect(AB_INSTANCE().indexOf('b',),).toBe(1,),)
                    test('c', () => expect(AB_INSTANCE().indexOf('c',),).toBeNull(),)
                },)
                describe("from index", () => {
                    test('a', () => expect(AB_INSTANCE().indexOf('a', 1,),).toBeNull(),)
                    test('b', () => expect(AB_INSTANCE().indexOf('b', 1,),).toBe(1,),)
                    test('c', () => expect(AB_INSTANCE().indexOf('c', 1,),).toBeNull(),)
                },)
                describe("to index", () => {
                    test('a', () => expect(AB_INSTANCE().indexOf('a', null, 1,),).toBe(0,),)
                    test('b', () => expect(AB_INSTANCE().indexOf('b', null, 1,),).toBe(1,),)
                    test('c', () => expect(AB_INSTANCE().indexOf('c', null, 1,),).toBeNull(),)
                },)
                describe("limit", () => {
                    test('a', () => expect(AB_INSTANCE().indexOf('a', null, null, 1,),).toBe(0,),)
                    test('b', () => expect(AB_INSTANCE().indexOf('b', null, null, 1,),).toBeNull(),)
                    test('c', () => expect(AB_INSTANCE().indexOf('c', null, null, 1,),).toBeNull(),)
                },)
            },)
            describe("[a,b,c,d]", () => {
                describe("direct", () => {
                    test('a', () => expect(ABCD_INSTANCE().indexOf('a',),).toBe(0,),)
                    test('b', () => expect(ABCD_INSTANCE().indexOf('b',),).toBe(1,),)
                    test('c', () => expect(ABCD_INSTANCE().indexOf('c',),).toBe(2,),)
                    test('d', () => expect(ABCD_INSTANCE().indexOf('d',),).toBe(3,),)
                },)
                describe("from index", () => {
                    test('a', () => expect(ABCD_INSTANCE().indexOf('a', 2,),).toBeNull(),)
                    test('b', () => expect(ABCD_INSTANCE().indexOf('b', 2,),).toBeNull(),)
                    test('c', () => expect(ABCD_INSTANCE().indexOf('c', 2,),).toBe(2,),)
                    test('d', () => expect(ABCD_INSTANCE().indexOf('d', 2,),).toBe(3,),)
                },)
                describe("to index", () => {
                    test('a', () => expect(ABCD_INSTANCE().indexOf('a', null, 2,),).toBe(0,),)
                    test('b', () => expect(ABCD_INSTANCE().indexOf('b', null, 2,),).toBe(1,),)
                    test('c', () => expect(ABCD_INSTANCE().indexOf('c', null, 2,),).toBe(2,),)
                    test('d', () => expect(ABCD_INSTANCE().indexOf('d', null, 2,),).toBeNull(),)
                },)
                describe("limit", () => {
                    test('a', () => expect(ABCD_INSTANCE().indexOf('a', null, null, 2,),).toBe(0,),)
                    test('b', () => expect(ABCD_INSTANCE().indexOf('b', null, null, 2,),).toBe(1,),)
                    test('c', () => expect(ABCD_INSTANCE().indexOf('c', null, null, 2,),).toBeNull(),)
                    test('d', () => expect(ABCD_INSTANCE().indexOf('d', null, null, 2,),).toBeNull(),)
                },)
            },)
            describe("[a,b,A,B]", () => {
                describe("direct", () => {
                    test('a', () => expect(AB_AB_INSTANCE().indexOf('a',),).toBe(0,),)
                    test('b', () => expect(AB_AB_INSTANCE().indexOf('b',),).toBe(1,),)
                    test('A', () => expect(AB_AB_INSTANCE().indexOf('A',),).toBe(2,),)
                    test('B', () => expect(AB_AB_INSTANCE().indexOf('B',),).toBe(3,),)
                },)
                describe("from index", () => {
                    test('a', () => expect(AB_AB_INSTANCE().indexOf('a', 2,),).toBeNull(),)
                    test('b', () => expect(AB_AB_INSTANCE().indexOf('b', 2,),).toBeNull(),)
                    test('A', () => expect(AB_AB_INSTANCE().indexOf('A', 2,),).toBe(2,),)
                    test('B', () => expect(AB_AB_INSTANCE().indexOf('B', 2,),).toBe(3,),)
                },)
                describe("to index", () => {
                    test('a', () => expect(AB_AB_INSTANCE().indexOf('a', null, 2,),).toBe(0,),)
                    test('b', () => expect(AB_AB_INSTANCE().indexOf('b', null, 2,),).toBe(1,),)
                    test('A', () => expect(AB_AB_INSTANCE().indexOf('A', null, 2,),).toBe(2,),)
                    test('B', () => expect(AB_AB_INSTANCE().indexOf('B', null, 2,),).toBeNull(),)
                },)
                describe("limit", () => {
                    test('a', () => expect(AB_AB_INSTANCE().indexOf('a', null, null, 2,),).toBe(0,),)
                    test('b', () => expect(AB_AB_INSTANCE().indexOf('b', null, null, 2,),).toBe(1,),)
                    test('A', () => expect(AB_AB_INSTANCE().indexOf('A', null, null, 2,),).toBeNull(),)
                    test('B', () => expect(AB_AB_INSTANCE().indexOf('B', null, null, 2,),).toBeNull(),)
                },)
            },)
            describe("error", () => {
                describe("from index", () => {
                    test('2',    () => expect(() => AB_INSTANCE().indexOf('a', 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().indexOf('a', 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().indexOf('a', 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().indexOf('a', -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().indexOf('a', -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().indexOf('a', -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().indexOf('a', 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().indexOf('a', -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("to index", () => {
                    test('2',    () => expect(() => AB_INSTANCE().indexOf('a', null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().indexOf('a', null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().indexOf('a', null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().indexOf('a', null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().indexOf('a', null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().indexOf('a', null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().indexOf('a', null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().indexOf('a', null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("limit", () => {
                    test('2',    () => expect(() => AB_INSTANCE().indexOf('a', null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().indexOf('a', null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().indexOf('a', null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().indexOf('a', null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().indexOf('a', null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().indexOf('a', null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().indexOf('a', null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().indexOf('a', null, null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
            },)
            describe("negative values", () => {
                describe("from index", () => {
                    test('a', () => expect(ABCD_INSTANCE().indexOf('a', -2,),).toBeNull(),)
                    test('b', () => expect(ABCD_INSTANCE().indexOf('b', -2,),).toBeNull(),)
                    test('c', () => expect(ABCD_INSTANCE().indexOf('c', -2,),).toBe(2,),)
                    test('d', () => expect(ABCD_INSTANCE().indexOf('d', -2,),).toBe(3,),)
                },)
                describe("to index", () => {
                    test('a', () => expect(ABCD_INSTANCE().indexOf('a', null, -2,),).toBe(0,),)
                    test('b', () => expect(ABCD_INSTANCE().indexOf('b', null, -2,),).toBe(1,),)
                    test('c', () => expect(ABCD_INSTANCE().indexOf('c', null, -2,),).toBe(2,),)
                    test('d', () => expect(ABCD_INSTANCE().indexOf('d', null, -2,),).toBeNull(),)
                },)
                describe("limit", () => {
                    test('a', () => expect(ABCD_INSTANCE().indexOf('a', null, null, -2,),).toBe(0,),)
                    test('b', () => expect(ABCD_INSTANCE().indexOf('b', null, null, -2,),).toBe(1,),)
                    test('c', () => expect(ABCD_INSTANCE().indexOf('c', null, null, -2,),).toBeNull(),)
                    test('d', () => expect(ABCD_INSTANCE().indexOf('d', null, null, -2,),).toBeNull(),)
                },)
            },)
        },)
        describe("last index of", () => {
            describe("known null return", () => {
                test("empty",                 () => expect(EMPTY_INSTANCE().lastIndexOf('a',),).toBeNull(),)
                test("from and to index = 0", () => expect(AB_INSTANCE().lastIndexOf('a', 0, 0,),).toBeNull(),)
                test("limit = 0",             () => expect(AB_INSTANCE().lastIndexOf('a', null, null, 0,),).toBeNull(),)
            },)
            describe("[a,b]", () => {
                describe("direct", () => {
                    test('a', () => expect(AB_INSTANCE().lastIndexOf('a',),).toBe(0,),)
                    test('b', () => expect(AB_INSTANCE().lastIndexOf('b',),).toBe(1,),)
                    test('c', () => expect(AB_INSTANCE().lastIndexOf('c',),).toBeNull(),)
                },)
                describe("from index", () => {
                    test('a', () => expect(AB_INSTANCE().lastIndexOf('a', 1,),).toBeNull(),)
                    test('b', () => expect(AB_INSTANCE().lastIndexOf('b', 1,),).toBe(1,),)
                    test('c', () => expect(AB_INSTANCE().lastIndexOf('c', 1,),).toBeNull(),)
                },)
                describe("to index", () => {
                    test('a', () => expect(AB_INSTANCE().lastIndexOf('a', null, 1,),).toBe(0,),)
                    test('b', () => expect(AB_INSTANCE().lastIndexOf('b', null, 1,),).toBe(1,),)
                    test('c', () => expect(AB_INSTANCE().lastIndexOf('c', null, 1,),).toBeNull(),)
                },)
                describe("limit", () => {
                    test('a', () => expect(AB_INSTANCE().lastIndexOf('a', null, null, 1,),).toBe(0,),)
                    test('b', () => expect(AB_INSTANCE().lastIndexOf('b', null, null, 1,),).toBeNull(),)
                    test('c', () => expect(AB_INSTANCE().lastIndexOf('c', null, null, 1,),).toBeNull(),)
                },)
            },)
            describe("[a,b,c,d]", () => {
                describe("direct", () => {
                    test('a', () => expect(ABCD_INSTANCE().lastIndexOf('a',),).toBe(0,),)
                    test('b', () => expect(ABCD_INSTANCE().lastIndexOf('b',),).toBe(1,),)
                    test('c', () => expect(ABCD_INSTANCE().lastIndexOf('c',),).toBe(2,),)
                    test('d', () => expect(ABCD_INSTANCE().lastIndexOf('d',),).toBe(3,),)
                },)
                describe("from index", () => {
                    test('a', () => expect(ABCD_INSTANCE().lastIndexOf('a', 2,),).toBeNull(),)
                    test('b', () => expect(ABCD_INSTANCE().lastIndexOf('b', 2,),).toBeNull(),)
                    test('c', () => expect(ABCD_INSTANCE().lastIndexOf('c', 2,),).toBe(2,),)
                    test('d', () => expect(ABCD_INSTANCE().lastIndexOf('d', 2,),).toBe(3,),)
                },)
                describe("to index", () => {
                    test('a', () => expect(ABCD_INSTANCE().lastIndexOf('a', null, 2,),).toBe(0,),)
                    test('b', () => expect(ABCD_INSTANCE().lastIndexOf('b', null, 2,),).toBe(1,),)
                    test('c', () => expect(ABCD_INSTANCE().lastIndexOf('c', null, 2,),).toBe(2,),)
                    test('d', () => expect(ABCD_INSTANCE().lastIndexOf('d', null, 2,),).toBeNull(),)
                },)
                describe("limit", () => {
                    test('a', () => expect(ABCD_INSTANCE().lastIndexOf('a', null, null, 2,),).toBe(0,),)
                    test('b', () => expect(ABCD_INSTANCE().lastIndexOf('b', null, null, 2,),).toBe(1,),)
                    test('c', () => expect(ABCD_INSTANCE().lastIndexOf('c', null, null, 2,),).toBeNull(),)
                    test('d', () => expect(ABCD_INSTANCE().lastIndexOf('d', null, null, 2,),).toBeNull(),)
                },)
            },)
            describe("[a,b,A,B]", () => {
                describe("direct", () => {
                    test('a', () => expect(AB_AB_INSTANCE().lastIndexOf('a',),).toBe(0,),)
                    test('b', () => expect(AB_AB_INSTANCE().lastIndexOf('b',),).toBe(1,),)
                    test('A', () => expect(AB_AB_INSTANCE().lastIndexOf('A',),).toBe(2,),)
                    test('B', () => expect(AB_AB_INSTANCE().lastIndexOf('B',),).toBe(3,),)
                },)
                describe("from index", () => {
                    test('a', () => expect(AB_AB_INSTANCE().lastIndexOf('a', 2,),).toBeNull(),)
                    test('b', () => expect(AB_AB_INSTANCE().lastIndexOf('b', 2,),).toBeNull(),)
                    test('A', () => expect(AB_AB_INSTANCE().lastIndexOf('A', 2,),).toBe(2,),)
                    test('B', () => expect(AB_AB_INSTANCE().lastIndexOf('B', 2,),).toBe(3,),)
                },)
                describe("to index", () => {
                    test('a', () => expect(AB_AB_INSTANCE().lastIndexOf('a', null, 2,),).toBe(0,),)
                    test('b', () => expect(AB_AB_INSTANCE().lastIndexOf('b', null, 2,),).toBe(1,),)
                    test('A', () => expect(AB_AB_INSTANCE().lastIndexOf('A', null, 2,),).toBe(2,),)
                    test('B', () => expect(AB_AB_INSTANCE().lastIndexOf('B', null, 2,),).toBeNull(),)
                },)
                describe("limit", () => {
                    test('a', () => expect(AB_AB_INSTANCE().lastIndexOf('a', null, null, 2,),).toBe(0,),)
                    test('b', () => expect(AB_AB_INSTANCE().lastIndexOf('b', null, null, 2,),).toBe(1,),)
                    test('A', () => expect(AB_AB_INSTANCE().lastIndexOf('A', null, null, 2,),).toBeNull(),)
                    test('B', () => expect(AB_AB_INSTANCE().lastIndexOf('B', null, null, 2,),).toBeNull(),)
                },)
            },)
            describe("error", () => {
                describe("from index", () => {
                    test('2',    () => expect(() => AB_INSTANCE().lastIndexOf('a', 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().lastIndexOf('a', 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().lastIndexOf('a', 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().lastIndexOf('a', -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().lastIndexOf('a', -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().lastIndexOf('a', -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().lastIndexOf('a', 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().lastIndexOf('a', -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("to index", () => {
                    test('2',    () => expect(() => AB_INSTANCE().lastIndexOf('a', null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().lastIndexOf('a', null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().lastIndexOf('a', null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().lastIndexOf('a', null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().lastIndexOf('a', null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().lastIndexOf('a', null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().lastIndexOf('a', null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().lastIndexOf('a', null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("limit", () => {
                    test('2',    () => expect(() => AB_INSTANCE().lastIndexOf('a', null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().lastIndexOf('a', null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().lastIndexOf('a', null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().lastIndexOf('a', null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().lastIndexOf('a', null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().lastIndexOf('a', null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().lastIndexOf('a', null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().lastIndexOf('a', null, null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
            },)
            describe("negative values", () => {
                describe("from index", () => {
                    test('a', () => expect(ABCD_INSTANCE().lastIndexOf('a', -2,),).toBeNull(),)
                    test('b', () => expect(ABCD_INSTANCE().lastIndexOf('b', -2,),).toBeNull(),)
                    test('c', () => expect(ABCD_INSTANCE().lastIndexOf('c', -2,),).toBe(2,),)
                    test('d', () => expect(ABCD_INSTANCE().lastIndexOf('d', -2,),).toBe(3,),)
                },)
                describe("to index", () => {
                    test('a', () => expect(ABCD_INSTANCE().lastIndexOf('a', null, -2,),).toBe(0,),)
                    test('b', () => expect(ABCD_INSTANCE().lastIndexOf('b', null, -2,),).toBe(1,),)
                    test('c', () => expect(ABCD_INSTANCE().lastIndexOf('c', null, -2,),).toBe(2,),)
                    test('d', () => expect(ABCD_INSTANCE().lastIndexOf('d', null, -2,),).toBeNull(),)
                },)
                describe("limit", () => {
                    test('a', () => expect(ABCD_INSTANCE().lastIndexOf('a', null, null, -2,),).toBe(0,),)
                    test('b', () => expect(ABCD_INSTANCE().lastIndexOf('b', null, null, -2,),).toBe(1,),)
                    test('c', () => expect(ABCD_INSTANCE().lastIndexOf('c', null, null, -2,),).toBeNull(),)
                    test('d', () => expect(ABCD_INSTANCE().lastIndexOf('d', null, null, -2,),).toBeNull(),)
                },)
            },)
        },)

        describe("index of first", () => {
            describe("known null return", () => {
                test("empty",                 () => expect(EMPTY_INSTANCE().indexOfFirst(() => fail(),),).toBeNull(),)
                test("from and to index = 0", () => expect(AB_INSTANCE().indexOfFirst(() => fail(), 0, 0,),).toBeNull(),)
                test("limit = 0",             () => expect(AB_INSTANCE().indexOfFirst(() => fail(), null, null, 0,),).toBeNull(),)
            },)
            describe("direct", () => {
                test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'a',),).toBe(0,),)
                test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'b',),).toBe(1,),)
                test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'c',),).toBe(2,),)
                test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'd',),).toBe(3,),)
                test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'e',),).toBeNull(),)

                test('a',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a',),).toBe(0,),)
                test('b',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'b',),).toBe(1,),)
                test('c',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'c',),).toBe(2,),)
                test('d',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'd',),).toBe(3,),)
                test('e',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'e',),).toBeNull(),)
                test('A',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'A',),).toBe(4,),)
                test('B',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'B',),).toBe(5,),)
                test('C',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'C',),).toBe(6,),)
                test('D',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D',),).toBe(7,),)
                test('E',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'E',),).toBeNull(),)
            },)
            describe("from index", () => {
                test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'a', 3,),).toBe(4,),)
                test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'b', 3,),).toBe(5,),)
                test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'c', 3,),).toBe(6,),)
                test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'd', 3,),).toBe(3,),)
                test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'e', 3,),).toBeNull(),)

                test('a',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a', 3,),).toBeNull(),)
                test('b',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'b', 3,),).toBeNull(),)
                test('c',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'c', 3,),).toBeNull(),)
                test('d',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'd', 3,),).toBe(3,),)
                test('e',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'e', 3,),).toBeNull(),)
                test('A',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'A', 3,),).toBe(4,),)
                test('B',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'B', 3,),).toBe(5,),)
                test('C',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'C', 3,),).toBe(6,),)
                test('D',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D', 3,),).toBe(7,),)
                test('E',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'E', 3,),).toBeNull(),)
            },)
            describe("to index", () => {
                test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'a', null, 3,),).toBe(0,),)
                test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'b', null, 3,),).toBe(1,),)
                test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'c', null, 3,),).toBe(2,),)
                test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'd', null, 3,),).toBe(3,),)
                test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'e', null, 3,),).toBeNull(),)

                test('a',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a', null, 3,),).toBe(0,),)
                test('b',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'b', null, 3,),).toBe(1,),)
                test('c',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'c', null, 3,),).toBe(2,),)
                test('d',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'd', null, 3,),).toBe(3,),)
                test('e',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'e', null, 3,),).toBeNull(),)
                test('A',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'A', null, 3,),).toBeNull(),)
                test('B',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'B', null, 3,),).toBeNull(),)
                test('C',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'C', null, 3,),).toBeNull(),)
                test('D',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D', null, 3,),).toBeNull(),)
                test('E',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'E', null, 3,),).toBeNull(),)
            },)
            describe("limit", () => {
                test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'a', null, null, 3,),).toBe(0,),)
                test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'b', null, null, 3,),).toBe(1,),)
                test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'c', null, null, 3,),).toBe(2,),)
                test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'd', null, null, 3,),).toBeNull(),)
                test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'e', null, null, 3,),).toBeNull(),)

                test('a',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a', null, null, 3,),).toBe(0,),)
                test('b',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'b', null, null, 3,),).toBe(1,),)
                test('c',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'c', null, null, 3,),).toBe(2,),)
                test('d',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'd', null, null, 3,),).toBeNull(),)
                test('e',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'e', null, null, 3,),).toBeNull(),)
                test('A',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'A', null, null, 3,),).toBeNull(),)
                test('B',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'B', null, null, 3,),).toBeNull(),)
                test('C',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'C', null, null, 3,),).toBeNull(),)
                test('D',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D', null, null, 3,),).toBeNull(),)
                test('E',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'E', null, null, 3,),).toBeNull(),)
            },)
            describe("error", () => {
                describe("from index", () => {
                    test('2',    () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("to index", () => {
                    test('2',    () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-3",   () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("limit", () => {
                    test('2',    () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
            },)
            describe("negative values", () => {
                describe("from index", () => {
                    test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'a', -3,),).toBeNull(),)
                    test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'b', -3,),).toBe(5,),)
                    test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'c', -3,),).toBe(6,),)
                    test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'd', -3,),).toBe(7,),)
                    test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'e', -3,),).toBeNull(),)

                    test('a',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a', -3,),).toBeNull(),)
                    test('b',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'b', -3,),).toBeNull(),)
                    test('c',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'c', -3,),).toBeNull(),)
                    test('d',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'd', -3,),).toBeNull(),)
                    test('e',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'e', -3,),).toBeNull(),)
                    test('A',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'A', -3,),).toBeNull(),)
                    test('B',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'B', -3,),).toBe(5,),)
                    test('C',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'C', -3,),).toBe(6,),)
                    test('D',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D', -3,),).toBe(7,),)
                    test('E',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'E', -3,),).toBeNull(),)
                },)
                describe("to index", () => {
                    test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'a', null, -3,),).toBe(0,),)
                    test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'b', null, -3,),).toBe(1,),)
                    test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'c', null, -3,),).toBe(2,),)
                    test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'd', null, -3,),).toBe(3,),)
                    test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'e', null, -3,),).toBeNull(),)

                    test('a',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a', null, -3,),).toBe(0,),)
                    test('b',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'b', null, -3,),).toBe(1,),)
                    test('c',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'c', null, -3,),).toBe(2,),)
                    test('d',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'd', null, -3,),).toBe(3,),)
                    test('e',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'e', null, -3,),).toBeNull(),)
                    test('A',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'A', null, -3,),).toBe(4,),)
                    test('B',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'B', null, -3,),).toBe(5,),)
                    test('C',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'C', null, -3,),).toBeNull(),)
                    test('D',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D', null, -3,),).toBeNull(),)
                    test('E',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'E', null, -3,),).toBeNull(),)
                },)
                describe("limit", () => {
                    test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'a', null, null, -3,),).toBe(0,),)
                    test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'b', null, null, -3,),).toBe(1,),)
                    test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'c', null, null, -3,),).toBe(2,),)
                    test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'd', null, null, -3,),).toBe(3,),)
                    test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'e', null, null, -3,),).toBeNull(),)

                    test('a',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a', null, null, -3,),).toBe(0,),)
                    test('b',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'b', null, null, -3,),).toBe(1,),)
                    test('c',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'c', null, null, -3,),).toBe(2,),)
                    test('d',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'd', null, null, -3,),).toBe(3,),)
                    test('e',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'e', null, null, -3,),).toBeNull(),)
                    test('A',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'A', null, null, -3,),).toBe(4,),)
                    test('B',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'B', null, null, -3,),).toBeNull(),)
                    test('C',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'C', null, null, -3,),).toBeNull(),)
                    test('D',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D', null, null, -3,),).toBeNull(),)
                    test('E',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'E', null, null, -3,),).toBeNull(),)
                },)
            },)
        },)
        describe("index of first indexed", () => {
            describe("known null return", () => {
                test("empty",                 () => expect(EMPTY_INSTANCE().indexOfFirstIndexed(() => fail(),),).toBeNull(),)
                test("from and to index = 0", () => expect(AB_INSTANCE().indexOfFirstIndexed(() => fail(), 0, 0,),).toBeNull(),)
                test("limit = 0",             () => expect(AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, 0,),).toBeNull(),)
            },)
            describe("direct", () => {
                test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 0,),).toBe(0,),)
                test("odd",  () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 1,),).toBe(1,),)

                test('0',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 0,),).toBe(0,),)
                test('1',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 1,),).toBe(1,),)
                test('2',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 2,),).toBe(2,),)
                test('3',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 3,),).toBe(3,),)
                test('4',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 4,),).toBe(4,),)
                test('5',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 5,),).toBe(5,),)
                test('6',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 6,),).toBe(6,),)
                test('7',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 7,),).toBe(7,),)
                test('8',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 8,),).toBeNull(),)
                test("26",   () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 26,),).toBeNull(),)
            },)
            describe("from index", () => {
                test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 0, 3,),).toBe(4,),)
                test("odd",  () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 1, 3,),).toBe(3,),)

                test('0',     () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 0, 3,),).toBeNull(),)
                test('1',     () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 1, 3,),).toBeNull(),)
                test('2',     () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 2, 3,),).toBeNull(),)
                test('3',     () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 3, 3,),).toBe(3,),)
                test('4',     () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 4, 3,),).toBe(4,),)
                test('5',     () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 5, 3,),).toBe(5,),)
                test('6',     () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 6, 3,),).toBe(6,),)
                test('7',     () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 7, 3,),).toBe(7,),)
                test('8',     () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 8, 3,),).toBeNull(),)
                test("26",    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 26, 3,),).toBeNull(),)
            },)
            describe("to index", () => {
                test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 0, null, 3,),).toBe(0,),)
                test("odd",  () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 1, null, 3,),).toBe(1,),)

                test('0',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 0, null, 3,),).toBe(0,),)
                test('1',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 1, null, 3,),).toBe(1,),)
                test('2',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 2, null, 3,),).toBe(2,),)
                test('3',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 3, null, 3,),).toBe(3,),)
                test('4',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 4, null, 3,),).toBeNull(),)
                test('5',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 5, null, 3,),).toBeNull(),)
                test('6',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 6, null, 3,),).toBeNull(),)
                test('7',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 7, null, 3,),).toBeNull(),)
                test('8',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 8, null, 3,),).toBeNull(),)
                test("26",   () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 26, null, 3,),).toBeNull(),)
            },)
            describe("limit", () => {
                test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 0, null, null, 3,),).toBe(0,),)
                test("odd",  () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 1, null, null, 3,),).toBe(1,),)

                test('0',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 0, null, null, 3,),).toBe(0,),)
                test('1',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 1, null, null, 3,),).toBe(1,),)
                test('2',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 2, null, null, 3,),).toBe(2,),)
                test('3',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 3, null, null, 3,),).toBeNull(),)
                test('4',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 4, null, null, 3,),).toBeNull(),)
                test('5',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 5, null, null, 3,),).toBeNull(),)
                test('6',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 6, null, null, 3,),).toBeNull(),)
                test('7',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 7, null, null, 3,),).toBeNull(),)
                test('8',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 8, null, null, 3,),).toBeNull(),)
                test("26",   () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 26, null, null, 3,),).toBeNull(),)
            },)
            describe("error", () => {
                describe("from index", () => {
                    test('2',    () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("to index", () => {
                    test('2',    () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("limit", () => {
                    test('2',    () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
            },)
            describe("negative values", () => {
                describe("from index", () => {
                    test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 0, -3,),).toBe(6,),)
                    test("odd",  () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 1, -3,),).toBe(5,),)

                    test('0',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 0, -3,),).toBeNull(),)
                    test('1',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 1, -3,),).toBeNull(),)
                    test('2',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 2, -3,),).toBeNull(),)
                    test('3',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 3, -3,),).toBeNull(),)
                    test('4',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 4, -3,),).toBeNull(),)
                    test('5',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 5, -3,),).toBe(5,),)
                    test('6',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 6, -3,),).toBe(6,),)
                    test('7',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 7, -3,),).toBe(7,),)
                    test('8',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 8, -3,),).toBeNull(),)
                    test("26",   () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 26, -3,),).toBeNull(),)
                },)
                describe("to index", () => {
                    test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 0, null, -3,),).toBe(0,),)
                    test("odd",  () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 1, null, -3,),).toBe(1,),)

                    test('0',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 0, null, -3,),).toBe(0,),)
                    test('1',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 1, null, -3,),).toBe(1,),)
                    test('2',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 2, null, -3,),).toBe(2,),)
                    test('3',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 3, null, -3,),).toBe(3,),)
                    test('4',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 4, null, -3,),).toBe(4,),)
                    test('5',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 5, null, -3,),).toBe(5,),)
                    test('6',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 6, null, -3,),).toBeNull(),)
                    test('7',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 7, null, -3,),).toBeNull(),)
                    test('8',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 8, null, -3,),).toBeNull(),)
                    test("26",   () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 26, null, -3,),).toBeNull(),)
                },)
                describe("limit", () => {
                    test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 0, null, null, -3,),).toBe(0,),)
                    test("odd",  () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 1, null, null, -3,),).toBe(1,),)

                    test('0',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 0, null, null, -3,),).toBe(0,),)
                    test('1',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 1, null, null, -3,),).toBe(1,),)
                    test('2',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 2, null, null, -3,),).toBe(2,),)
                    test('3',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 3, null, null, -3,),).toBe(3,),)
                    test('4',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 4, null, null, -3,),).toBe(4,),)
                    test('5',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 5, null, null, -3,),).toBeNull(),)
                    test('6',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 6, null, null, -3,),).toBeNull(),)
                    test('7',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 7, null, null, -3,),).toBeNull(),)
                    test('8',    () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 8, null, null, -3,),).toBeNull(),)
                    test("26",   () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 26, null, null, -3,),).toBeNull(),)
                },)
            },)
        },)
        describe("index of last", () => {
            describe("known null return", () => {
                test("empty",                 () => expect(EMPTY_INSTANCE().indexOfLast(() => fail(),),).toBeNull(),)
                test("from and to index = 0", () => expect(AB_INSTANCE().indexOfLast(() => fail(), 0, 0,),).toBeNull(),)
                test("limit = 0",             () => expect(AB_INSTANCE().indexOfLast(() => fail(), null, null, 0,),).toBeNull(),)
            },)
            describe("direct", () => {
                test("anyCase A", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'A',),).toBe(4,),)
                test("anyCase B", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'B',),).toBe(5,),)
                test("anyCase C", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'C',),).toBe(6,),)
                test("anyCase D", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'D',),).toBe(7,),)
                test("anyCase E", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'E',),).toBeNull(),)

                test('a',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'a',),).toBe(0,),)
                test('b',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'b',),).toBe(1,),)
                test('c',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'c',),).toBe(2,),)
                test('d',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'd',),).toBe(3,),)
                test('e',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'e',),).toBeNull(),)
                test('A',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'A',),).toBe(4,),)
                test('B',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'B',),).toBe(5,),)
                test('C',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'C',),).toBe(6,),)
                test('D',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'D',),).toBe(7,),)
                test('E',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'E',),).toBeNull(),)
            },)
            describe("from index", () => {
                test("anyCase A", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'A', 3,),).toBe(4,),)
                test("anyCase B", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'B', 3,),).toBe(5,),)
                test("anyCase C", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'C', 3,),).toBe(6,),)
                test("anyCase D", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'D', 3,),).toBe(7,),)
                test("anyCase E", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'E', 3,),).toBeNull(),)

                test('a',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'a', 3,),).toBeNull(),)
                test('b',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'b', 3,),).toBeNull(),)
                test('c',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'c', 3,),).toBeNull(),)
                test('d',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'd', 3,),).toBe(3,),)
                test('e',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'e', 3,),).toBeNull(),)
                test('A',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'A', 3,),).toBe(4,),)
                test('B',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'B', 3,),).toBe(5,),)
                test('C',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'C', 3,),).toBe(6,),)
                test('D',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'D', 3,),).toBe(7,),)
                test('E',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'E', 3,),).toBeNull(),)
            },)
            describe("to index", () => {
                test("anyCase A", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'A', null, 3,),).toBe(0,),)
                test("anyCase B", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'B', null, 3,),).toBe(1,),)
                test("anyCase C", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'C', null, 3,),).toBe(2,),)
                test("anyCase D", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'D', null, 3,),).toBe(3,),)
                test("anyCase E", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'E', null, 3,),).toBeNull(),)

                test('a',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'a', null, 3,),).toBe(0,),)
                test('b',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'b', null, 3,),).toBe(1,),)
                test('c',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'c', null, 3,),).toBe(2,),)
                test('d',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'd', null, 3,),).toBe(3,),)
                test('e',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'e', null, 3,),).toBeNull(),)
                test('A',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'A', null, 3,),).toBeNull(),)
                test('B',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'B', null, 3,),).toBeNull(),)
                test('C',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'C', null, 3,),).toBeNull(),)
                test('D',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'D', null, 3,),).toBeNull(),)
                test('E',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'E', null, 3,),).toBeNull(),)
            },)
            describe("limit", () => {
                test("anyCase A", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'A', null, null, 3,),).toBe(0,),)
                test("anyCase B", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'B', null, null, 3,),).toBe(1,),)
                test("anyCase C", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'C', null, null, 3,),).toBe(2,),)
                test("anyCase D", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'D', null, null, 3,),).toBeNull(),)
                test("anyCase E", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'E', null, null, 3,),).toBeNull(),)

                test('a',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'a', null, null, 3,),).toBe(0,),)
                test('b',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'b', null, null, 3,),).toBe(1,),)
                test('c',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'c', null, null, 3,),).toBe(2,),)
                test('d',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'd', null, null, 3,),).toBeNull(),)
                test('e',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'e', null, null, 3,),).toBeNull(),)
                test('A',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'A', null, null, 3,),).toBeNull(),)
                test('B',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'B', null, null, 3,),).toBeNull(),)
                test('C',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'C', null, null, 3,),).toBeNull(),)
                test('D',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'D', null, null, 3,),).toBeNull(),)
                test('E',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'E', null, null, 3,),).toBeNull(),)
            },)
            describe("error", () => {
                describe("from index", () => {
                    test('2',    () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("to index", () => {
                    test('2',    () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("limit", () => {
                    test('2',    () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
            },)
            describe("negative values", () => {
                describe("from index", () => {
                    test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toLowerCase() === 'a', -3,),).toBeNull(),)
                    test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toLowerCase() === 'b', -3,),).toBe(5,),)
                    test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toLowerCase() === 'c', -3,),).toBe(6,),)
                    test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toLowerCase() === 'd', -3,),).toBe(7,),)
                    test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toLowerCase() === 'e', -3,),).toBeNull(),)

                    test('a',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'a', -3,),).toBeNull(),)
                    test('b',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'b', -3,),).toBeNull(),)
                    test('c',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'c', -3,),).toBeNull(),)
                    test('d',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'd', -3,),).toBeNull(),)
                    test('e',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'e', -3,),).toBeNull(),)
                    test('A',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'A', -3,),).toBeNull(),)
                    test('B',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'B', -3,),).toBe(5,),)
                    test('C',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'C', -3,),).toBe(6,),)
                    test('D',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'D', -3,),).toBe(7,),)
                    test('E',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'E', -3,),).toBeNull(),)
                },)
                describe("to index", () => {
                    test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toLowerCase() === 'a', null, -3,),).toBe(4,),)
                    test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toLowerCase() === 'b', null, -3,),).toBe(5,),)
                    test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toLowerCase() === 'c', null, -3,),).toBe(2,),)
                    test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toLowerCase() === 'd', null, -3,),).toBe(3,),)
                    test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toLowerCase() === 'e', null, -3,),).toBeNull(),)

                    test('a',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'a', null, -3,),).toBe(0,),)
                    test('b',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'b', null, -3,),).toBe(1,),)
                    test('c',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'c', null, -3,),).toBe(2,),)
                    test('d',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'd', null, -3,),).toBe(3,),)
                    test('e',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'e', null, -3,),).toBeNull(),)
                    test('A',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'A', null, -3,),).toBe(4,),)
                    test('B',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'B', null, -3,),).toBe(5,),)
                    test('C',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'C', null, -3,),).toBeNull(),)
                    test('D',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'D', null, -3,),).toBeNull(),)
                    test('E',         () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'E', null, -3,),).toBeNull(),)
                },)
                describe("limit", () => {
                    test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'a', null, null, -3,),).toBe(0,),)
                    test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'b', null, null, -3,),).toBe(1,),)
                    test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'c', null, null, -3,),).toBe(2,),)
                    test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'd', null, null, -3,),).toBe(3,),)
                    test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'e', null, null, -3,),).toBeNull(),)

                    test('a',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a', null, null, -3,),).toBe(0,),)
                    test('b',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'b', null, null, -3,),).toBe(1,),)
                    test('c',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'c', null, null, -3,),).toBe(2,),)
                    test('d',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'd', null, null, -3,),).toBe(3,),)
                    test('e',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'e', null, null, -3,),).toBeNull(),)
                    test('A',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'A', null, null, -3,),).toBe(4,),)
                    test('B',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'B', null, null, -3,),).toBeNull(),)
                    test('C',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'C', null, null, -3,),).toBeNull(),)
                    test('D',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D', null, null, -3,),).toBeNull(),)
                    test('E',         () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'E', null, null, -3,),).toBeNull(),)
                },)
            },)
        },)
        describe("index of last indexed", () => {
            describe("known null return", () => {
                test("empty",                 () => expect(EMPTY_INSTANCE().indexOfLastIndexed(() => fail(),),).toBeNull(),)
                test("from and to index = 0", () => expect(AB_INSTANCE().indexOfLastIndexed(() => fail(), 0, 0,),).toBeNull(),)
                test("limit = 0",             () => expect(AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, 0,),).toBeNull(),)
            },)
            describe("direct", () => {
                test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 0,),).toBe(6,),)
                test("odd",  () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 1,),).toBe(7,),)

                test('0',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 0,),).toBe(0,),)
                test('1',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 1,),).toBe(1,),)
                test('2',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 2,),).toBe(2,),)
                test('3',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 3,),).toBe(3,),)
                test('4',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 4,),).toBe(4,),)
                test('5',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 5,),).toBe(5,),)
                test('6',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 6,),).toBe(6,),)
                test('7',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 7,),).toBe(7,),)
                test('8',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 8,),).toBeNull(),)
                test("26",   () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 26,),).toBeNull(),)
            },)
            describe("from index", () => {
                test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 0, 3,),).toBe(6,),)
                test("odd",  () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 1, 3,),).toBe(7,),)

                test('0',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 0, 3,),).toBeNull(),)
                test('1',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 1, 3,),).toBeNull(),)
                test('2',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 2, 3,),).toBeNull(),)
                test('3',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 3, 3,),).toBe(3,),)
                test('4',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 4, 3,),).toBe(4,),)
                test('5',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 5, 3,),).toBe(5,),)
                test('6',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 6, 3,),).toBe(6,),)
                test('7',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 7, 3,),).toBe(7,),)
                test('8',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 8, 3,),).toBeNull(),)
                test("26",   () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 26, 3,),).toBeNull(),)
            },)
            describe("to index", () => {
                test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 0, null, 3,),).toBe(2,),)
                test("odd",  () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 1, null, 3,),).toBe(3,),)

                test('0',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 0, null, 3,),).toBe(0,),)
                test('1',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 1, null, 3,),).toBe(1,),)
                test('2',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 2, null, 3,),).toBe(2,),)
                test('3',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 3, null, 3,),).toBe(3,),)
                test('4',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 4, null, 3,),).toBeNull(),)
                test('5',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 5, null, 3,),).toBeNull(),)
                test('6',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 6, null, 3,),).toBeNull(),)
                test('7',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 7, null, 3,),).toBeNull(),)
                test('8',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 8, null, 3,),).toBeNull(),)
                test("26",   () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 26, null, 3,),).toBeNull(),)
            },)
            describe("limit", () => {
                test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 0, null, null, 3,),).toBe(2,),)
                test("odd",  () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 1, null, null, 3,),).toBe(1,),)

                test('0',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 0, null, null, 3,),).toBe(0,),)
                test('1',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 1, null, null, 3,),).toBe(1,),)
                test('2',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 2, null, null, 3,),).toBe(2,),)
                test('3',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 3, null, null, 3,),).toBeNull(),)
                test('4',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 4, null, null, 3,),).toBeNull(),)
                test('5',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 5, null, null, 3,),).toBeNull(),)
                test('6',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 6, null, null, 3,),).toBeNull(),)
                test('7',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 7, null, null, 3,),).toBeNull(),)
                test('8',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 8, null, null, 3,),).toBeNull(),)
                test("26",   () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 26, null, null, 3,),).toBeNull(),)
            },)
            describe("error", () => {
                describe("from index", () => {
                    test('2',    () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("to index", () => {
                    test('2',    () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("limit", () => {
                    test('2',    () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('3',    () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test('4',    () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("-2",   () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-3",   () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-4",   () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                    test("500",  () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("-500", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
            },)
            describe("negative values", () => {
                describe("from index", () => {
                    test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 0, -3,),).toBe(6,),)
                    test("odd",  () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 1, -3,),).toBe(7,),)

                    test('0',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 0, -3,),).toBeNull(),)
                    test('1',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 1, -3,),).toBeNull(),)
                    test('2',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 2, -3,),).toBeNull(),)
                    test('3',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 3, -3,),).toBeNull(),)
                    test('4',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 4, -3,),).toBeNull(),)
                    test('5',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 5, -3,),).toBe(5,),)
                    test('6',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 6, -3,),).toBe(6,),)
                    test('7',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 7, -3,),).toBe(7,),)
                    test('8',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 8, -3,),).toBeNull(),)
                    test("26",   () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 26, -3,),).toBeNull(),)
                },)
                describe("to index", () => {
                    test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 0, null, -3,),).toBe(4,),)
                    test("odd",  () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 1, null, -3,),).toBe(5,),)

                    test('0',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 0, null, -3,),).toBe(0,),)
                    test('1',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 1, null, -3,),).toBe(1,),)
                    test('2',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 2, null, -3,),).toBe(2,),)
                    test('3',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 3, null, -3,),).toBe(3,),)
                    test('4',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 4, null, -3,),).toBe(4,),)
                    test('5',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 5, null, -3,),).toBe(5,),)
                    test('6',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 6, null, -3,),).toBeNull(),)
                    test('7',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 7, null, -3,),).toBeNull(),)
                    test('8',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 8, null, -3,),).toBeNull(),)
                    test("26",   () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 26, null, -3,),).toBeNull(),)
                },)
                describe("limit", () => {
                    test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 0, null, null, -3,),).toBe(4,),)
                    test("odd",  () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 1, null, null, -3,),).toBe(3,),)

                    test('0',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 0, null, null, -3,),).toBe(0,),)
                    test('1',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 1, null, null, -3,),).toBe(1,),)
                    test('2',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 2, null, null, -3,),).toBe(2,),)
                    test('3',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 3, null, null, -3,),).toBe(3,),)
                    test('4',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 4, null, null, -3,),).toBe(4,),)
                    test('5',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 5, null, null, -3,),).toBeNull(),)
                    test('6',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 6, null, null, -3,),).toBeNull(),)
                    test('7',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 7, null, null, -3,),).toBeNull(),)
                    test('8',    () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 8, null, null, -3,),).toBeNull(),)
                    test("26",   () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 26, null, null, -3,),).toBeNull(),)
                },)
            },)
        },)
    },)

},)
