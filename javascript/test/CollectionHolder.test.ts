/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {A, A_NULL_B_UNDEFINED, AB, AB12, AB_OBJECT, AB_AB, ABCD, ABCD_ABCD, ABCD_NULL, ABCD_UNDEFINED, ABCDEFGHIJ, EMPTY, NULL_ABCD, SINGULAR_A_OBJECT, SINGULAR_B_OBJECT, UNDEFINED_ABCD} from "./constantCollections"
import {iterableCreation, everyInstances, nonPresentItem, sizeValues, TEMPLATE_ITEMS}                                                                                                      from "./constantValues"
import {newCollectionInstance}                                                                                                                                                             from "./newCollectionInstance"

import {CollectionConstants}                       from "../src/CollectionConstants"
import {CollectionHolderIndexOutOfBoundsException} from "../src/exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "../src/exception/EmptyCollectionHolderException"
import {GenericCollectionIterator}                 from "../src/iterator/GenericCollectionIterator"

describe("CollectionHolderTest", () => {
describe.each(everyInstances,)("%s", ({value: instance,},) => {
describe.each(iterableCreation,)("%s", ({value: arrayOrSetCreation,},) => {
    //#region -------------------- Instances --------------------

    const EMPTY_INSTANCE = () => newCollectionInstance(instance, arrayOrSetCreation, EMPTY,),
        A_INSTANCE = () => newCollectionInstance(instance, arrayOrSetCreation, A,),
        AB_INSTANCE = () => newCollectionInstance(instance, arrayOrSetCreation, AB,),
        AB_OBJECT_INSTANCE = () => newCollectionInstance(instance, arrayOrSetCreation, AB_OBJECT,),
        A_NULL_B_UNDEFINED_INSTANCE = () => newCollectionInstance(instance, arrayOrSetCreation, A_NULL_B_UNDEFINED,),
        AB12_INSTANCE = () => newCollectionInstance(instance, arrayOrSetCreation, AB12,),
        ABCD_INSTANCE = () => newCollectionInstance(instance, arrayOrSetCreation, ABCD,),
        AB_AB_INSTANCE = () => newCollectionInstance(instance, arrayOrSetCreation, AB_AB,),
        ABCDEFGHIJ_INSTANCE = () => newCollectionInstance(instance, arrayOrSetCreation, ABCDEFGHIJ,),
        ABCD_ABCD_INSTANCE = () => newCollectionInstance(instance, arrayOrSetCreation, ABCD_ABCD,),
        NULL_ABCD_INSTANCE = () => newCollectionInstance(instance, arrayOrSetCreation, NULL_ABCD,),
        ABCD_NULL_INSTANCE = () => newCollectionInstance(instance, arrayOrSetCreation, ABCD_NULL,),
        UNDEFINED_ABCD_INSTANCE = () => newCollectionInstance(instance, arrayOrSetCreation, UNDEFINED_ABCD,),
        ABCD_UNDEFINED_INSTANCE = () => newCollectionInstance(instance, arrayOrSetCreation, ABCD_UNDEFINED,),
        TEMPLATE_ITEMS_INSTANCE = () => newCollectionInstance(instance, arrayOrSetCreation, TEMPLATE_ITEMS,)

    //#endregion -------------------- Instances --------------------

    describe("size", () => {
    describe.each(sizeValues(),)("%s", ({value: {array, size,},},) => {
        const newInstance = () => newCollectionInstance(instance, arrayOrSetCreation, array,)
        test("size", () => expect(newInstance().size,).toEqual(size,),)
        test("length", () => expect(newInstance().length,).toEqual(size,),)
        test("count", () => expect(newInstance().count,).toEqual(size,),)
        test("isEmpty", () => expect(newInstance().isEmpty,).toBe(size == 0,),)
        test("isNotEmpty", () => expect(newInstance().isNotEmpty,).toBe(size != 0,),)
    },) },)
    describe("value", () => {
        describe("get / at / element at", () => {
            describe("simple", () => {
                describe("[](0)", () => {
                    test("index", () => expect(EMPTY_INSTANCE()[0],).toBeUndefined(),)
                    test("get", () => expect(() => EMPTY_INSTANCE().get(0,),).toThrow(EmptyCollectionHolderException,),)
                    test("at", () => expect(() => EMPTY_INSTANCE().at(0,),).toThrow(EmptyCollectionHolderException,),)
                    test("element at", () => expect(() => EMPTY_INSTANCE().elementAt(0,),).toThrow(EmptyCollectionHolderException,),)
                },)
                describe("[a,b](0)", () => {
                    test.skip("index", () => expect(AB_INSTANCE()[0],).toEqual('a',),)
                    test("get", () => expect(AB_INSTANCE().get(0,),).toEqual('a',),)
                    test("at", () => expect(AB_INSTANCE().at(0,),).toEqual('a',),)
                    test("element at", () => expect(AB_INSTANCE().elementAt(0,),).toEqual('a',),)
                },)
                describe("[a,b](3)", () => {
                    test.skip("index", () => expect(AB_INSTANCE()[3],).toBeUndefined(),)
                    test("get", () => expect(() => AB_INSTANCE().get(3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("at", () => expect(() => AB_INSTANCE().at(3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("element at", () => expect(() => AB_INSTANCE().elementAt(3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("[a,b,c,d](1)", () => {
                    test.skip("index", () => expect(ABCD_INSTANCE()[1],).toEqual('b',),)
                    test("get", () => expect(ABCD_INSTANCE().get(1,),).toEqual('b',),)
                    test("at", () => expect(ABCD_INSTANCE().at(1,),).toEqual('b',),)
                    test("element at", () => expect(ABCD_INSTANCE().elementAt(1,),).toEqual('b',),)
                },)
                describe("[a,b,c,d](-1)", () => {
                    test("index", () => expect(ABCD_INSTANCE()[-1],).toBeUndefined(),)
                    test("get", () => expect(ABCD_INSTANCE().get(-1,),).toEqual('d',),)
                    test("at", () => expect(ABCD_INSTANCE().at(-1,),).toEqual('d',),)
                    test("element at", () => expect(ABCD_INSTANCE().elementAt(-1,),).toEqual('d',),)
                },)
                describe("[a,b,c,d](-4)", () => {
                    test("index", () => expect(ABCD_INSTANCE()[-4],).toBeUndefined(),)
                    test("get", () => expect(ABCD_INSTANCE().get(-4,),).toEqual('a',),)
                    test("at", () => expect(ABCD_INSTANCE().at(-4,),).toEqual('a',),)
                    test("element at", () => expect(ABCD_INSTANCE().elementAt(-4,),).toEqual('a',),)
                },)
                describe("[a,b,c,d](-5)", () => {
                    test("index", () => expect(ABCD_INSTANCE()[-5],).toBeUndefined(),)
                    test("get", () => expect(() => ABCD_INSTANCE().get(-5,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("at", () => expect(() => ABCD_INSTANCE().at(-5,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("element at", () => expect(() => ABCD_INSTANCE().elementAt(-5,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
            },)
            describe("or else", () => {
                const value = Infinity,
                    callback = () => Infinity

                describe("[].orElse(0, () => ∞)", () => {
                    test("get", () => expect(EMPTY_INSTANCE().getOrElse(0, callback,),).toEqual(value,),)
                    test("at", () => expect(EMPTY_INSTANCE().atOrElse(0, callback,),).toEqual(value,),)
                    test("element at", () => expect(EMPTY_INSTANCE().elementAtOrElse(0, callback,),).toEqual(value,),)
                },)
                describe("[a,b].orElse(0, () => ∞)", () => {
                    test("get", () => expect(AB_INSTANCE().getOrElse(0, callback,),).toEqual('a',),)
                    test("at", () => expect(AB_INSTANCE().atOrElse(0, callback,),).toEqual('a',),)
                    test("element at", () => expect(AB_INSTANCE().elementAtOrElse(0, callback,),).toEqual('a',),)
                },)
                describe("[a,b].orElse(3, () => ∞)", () => {
                    test("get", () => expect(AB_INSTANCE().getOrElse(3, callback,),).toEqual(value,),)
                    test("at", () => expect(AB_INSTANCE().atOrElse(3, callback,),).toEqual(value,),)
                    test("element at", () => expect(AB_INSTANCE().elementAtOrElse(3, callback,),).toEqual(value,),)
                },)
                describe("[a,b,c,d].orElse(1, () => ∞)", () => {
                    test("get", () => expect(ABCD_INSTANCE().getOrElse(1, callback,),).toEqual('b',),)
                    test("at", () => expect(ABCD_INSTANCE().atOrElse(1, callback,),).toEqual('b',),)
                    test("element at", () => expect(ABCD_INSTANCE().elementAtOrElse(1, callback,),).toEqual('b',),)
                },)
                describe("[a,b,c,d].orElse(-1, () => ∞)", () => {
                    test("get", () => expect(ABCD_INSTANCE().getOrElse(-1, callback,),).toEqual('d',),)
                    test("at", () => expect(ABCD_INSTANCE().atOrElse(-1, callback,),).toEqual('d',),)
                    test("element at", () => expect(ABCD_INSTANCE().elementAtOrElse(-1, callback,),).toEqual('d',),)
                },)
                describe("[a,b,c,d].orElse(-5, () => ∞)", () => {
                    test("get", () => expect(ABCD_INSTANCE().getOrElse(-5, callback,),).toEqual(value,),)
                    test("at", () => expect(ABCD_INSTANCE().atOrElse(-5, callback,),).toEqual(value,),)
                    test("element at", () => expect(ABCD_INSTANCE().elementAtOrElse(-5, callback,),).toEqual(value,),)
                },)
            },)
            describe("or null", () => {
                describe("[].orNull(0)", () => {
                    test("get", () => expect(EMPTY_INSTANCE().getOrNull(0,),).toBeNull(),)
                    test("at", () => expect(EMPTY_INSTANCE().atOrNull(0,),).toBeNull(),)
                    test("element at", () => expect(EMPTY_INSTANCE().elementAtOrNull(0,),).toBeNull(),)
                },)
                describe("[a,b].orNull(0)", () => {
                    test("get", () => expect(AB_INSTANCE().getOrNull(0,),).toEqual('a',),)
                    test("at", () => expect(AB_INSTANCE().atOrNull(0,),).toEqual('a',),)
                    test("element at", () => expect(AB_INSTANCE().elementAtOrNull(0,),).toEqual('a',),)
                },)
                describe("[a,b].orNull(3)", () => {
                    test("get", () => expect(AB_INSTANCE().getOrNull(3,),).toBeNull(),)
                    test("at", () => expect(AB_INSTANCE().atOrNull(3,),).toBeNull(),)
                    test("element at", () => expect(AB_INSTANCE().elementAtOrNull(3,),).toBeNull(),)
                },)
                describe("[a,b,c,d].orNull(1)", () => {
                    test("get", () => expect(ABCD_INSTANCE().getOrNull(1,),).toEqual('b',),)
                    test("at", () => expect(ABCD_INSTANCE().atOrNull(1,),).toEqual('b',),)
                    test("element at", () => expect(ABCD_INSTANCE().elementAtOrNull(1,),).toEqual('b',),)
                },)
                describe("[a,b,c,d].orNull(-1)", () => {
                    test("get", () => expect(ABCD_INSTANCE().getOrNull(-1,),).toEqual('d',),)
                    test("at", () => expect(ABCD_INSTANCE().atOrNull(-1,),).toEqual('d',),)
                    test("element at", () => expect(ABCD_INSTANCE().elementAtOrNull(-1,),).toEqual('d',),)
                },)
                describe("[a,b,c,d].orNull(-5)", () => {
                    test("get", () => expect(ABCD_INSTANCE().getOrNull(-5,),).toBeNull(),)
                    test("at", () => expect(ABCD_INSTANCE().atOrNull(-5,),).toBeNull(),)
                    test("element at", () => expect(ABCD_INSTANCE().elementAtOrNull(-5,),).toBeNull(),)
                },)
            },)
        },)
        describe("index", () => {
            describe("index of", () => {
                describe("known null return", () => {
                    test("empty", () => expect(EMPTY_INSTANCE().indexOf('a',),).toBeNull(),)
                    test("from and to index = 0", () => expect(AB_INSTANCE().indexOf('a', 0, 0,),).toBeNull(),)
                    test("limit = 0", () => expect(AB_INSTANCE().indexOf('a', null, null, 0,),).toBeNull(),)
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
                        test('2', () => expect(() => AB_INSTANCE().indexOf('a', 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().indexOf('a', 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().indexOf('a', 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().indexOf('a', -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().indexOf('a', -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().indexOf('a', -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().indexOf('a', 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-500", () => expect(() => AB_INSTANCE().indexOf('a', -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    },)
                    describe("to index", () => {
                        test('2', () => expect(() => AB_INSTANCE().indexOf('a', null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().indexOf('a', null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().indexOf('a', null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().indexOf('a', null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().indexOf('a', null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().indexOf('a', null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().indexOf('a', null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-500", () => expect(() => AB_INSTANCE().indexOf('a', null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    },)
                    describe("limit", () => {
                        test('2', () => expect(() => AB_INSTANCE().indexOf('a', null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().indexOf('a', null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().indexOf('a', null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().indexOf('a', null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().indexOf('a', null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().indexOf('a', null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().indexOf('a', null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
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
                    test("empty", () => expect(EMPTY_INSTANCE().lastIndexOf('a',),).toBeNull(),)
                    test("from and to index = 0", () => expect(AB_INSTANCE().lastIndexOf('a', 0, 0,),).toBeNull(),)
                    test("limit = 0", () => expect(AB_INSTANCE().lastIndexOf('a', null, null, 0,),).toBeNull(),)
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
                        test('2', () => expect(() => AB_INSTANCE().lastIndexOf('a', 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().lastIndexOf('a', 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().lastIndexOf('a', 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().lastIndexOf('a', -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().lastIndexOf('a', -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().lastIndexOf('a', -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().lastIndexOf('a', 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-500", () => expect(() => AB_INSTANCE().lastIndexOf('a', -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    },)
                    describe("to index", () => {
                        test('2', () => expect(() => AB_INSTANCE().lastIndexOf('a', null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().lastIndexOf('a', null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().lastIndexOf('a', null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().lastIndexOf('a', null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().lastIndexOf('a', null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().lastIndexOf('a', null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().lastIndexOf('a', null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-500", () => expect(() => AB_INSTANCE().lastIndexOf('a', null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    },)
                    describe("limit", () => {
                        test('2', () => expect(() => AB_INSTANCE().lastIndexOf('a', null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().lastIndexOf('a', null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().lastIndexOf('a', null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().lastIndexOf('a', null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().lastIndexOf('a', null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().lastIndexOf('a', null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().lastIndexOf('a', null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
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
                    test("empty", () => expect(EMPTY_INSTANCE().indexOfFirst(() => fail(),),).toBeNull(),)
                    test("from and to index = 0", () => expect(AB_INSTANCE().indexOfFirst(() => fail(), 0, 0,),).toBeNull(),)
                    test("limit = 0", () => expect(AB_INSTANCE().indexOfFirst(() => fail(), null, null, 0,),).toBeNull(),)
                },)
                describe("direct", () => {
                    test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'a',),).toBe(0,),)
                    test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'b',),).toBe(1,),)
                    test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'c',),).toBe(2,),)
                    test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'd',),).toBe(3,),)
                    test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'e',),).toBeNull(),)

                    test('a', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a',),).toBe(0,),)
                    test('b', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'b',),).toBe(1,),)
                    test('c', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'c',),).toBe(2,),)
                    test('d', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'd',),).toBe(3,),)
                    test('e', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'e',),).toBeNull(),)
                    test('A', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'A',),).toBe(4,),)
                    test('B', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'B',),).toBe(5,),)
                    test('C', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'C',),).toBe(6,),)
                    test('D', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D',),).toBe(7,),)
                    test('E', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'E',),).toBeNull(),)
                },)
                describe("from index", () => {
                    test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'a', 3,),).toBe(4,),)
                    test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'b', 3,),).toBe(5,),)
                    test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'c', 3,),).toBe(6,),)
                    test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'd', 3,),).toBe(3,),)
                    test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'e', 3,),).toBeNull(),)

                    test('a', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a', 3,),).toBeNull(),)
                    test('b', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'b', 3,),).toBeNull(),)
                    test('c', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'c', 3,),).toBeNull(),)
                    test('d', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'd', 3,),).toBe(3,),)
                    test('e', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'e', 3,),).toBeNull(),)
                    test('A', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'A', 3,),).toBe(4,),)
                    test('B', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'B', 3,),).toBe(5,),)
                    test('C', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'C', 3,),).toBe(6,),)
                    test('D', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D', 3,),).toBe(7,),)
                    test('E', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'E', 3,),).toBeNull(),)
                },)
                describe("to index", () => {
                    test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'a', null, 3,),).toBe(0,),)
                    test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'b', null, 3,),).toBe(1,),)
                    test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'c', null, 3,),).toBe(2,),)
                    test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'd', null, 3,),).toBe(3,),)
                    test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'e', null, 3,),).toBeNull(),)

                    test('a', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a', null, 3,),).toBe(0,),)
                    test('b', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'b', null, 3,),).toBe(1,),)
                    test('c', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'c', null, 3,),).toBe(2,),)
                    test('d', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'd', null, 3,),).toBe(3,),)
                    test('e', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'e', null, 3,),).toBeNull(),)
                    test('A', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'A', null, 3,),).toBeNull(),)
                    test('B', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'B', null, 3,),).toBeNull(),)
                    test('C', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'C', null, 3,),).toBeNull(),)
                    test('D', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D', null, 3,),).toBeNull(),)
                    test('E', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'E', null, 3,),).toBeNull(),)
                },)
                describe("limit", () => {
                    test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'a', null, null, 3,),).toBe(0,),)
                    test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'b', null, null, 3,),).toBe(1,),)
                    test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'c', null, null, 3,),).toBe(2,),)
                    test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'd', null, null, 3,),).toBeNull(),)
                    test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'e', null, null, 3,),).toBeNull(),)

                    test('a', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a', null, null, 3,),).toBe(0,),)
                    test('b', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'b', null, null, 3,),).toBe(1,),)
                    test('c', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'c', null, null, 3,),).toBe(2,),)
                    test('d', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'd', null, null, 3,),).toBeNull(),)
                    test('e', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'e', null, null, 3,),).toBeNull(),)
                    test('A', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'A', null, null, 3,),).toBeNull(),)
                    test('B', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'B', null, null, 3,),).toBeNull(),)
                    test('C', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'C', null, null, 3,),).toBeNull(),)
                    test('D', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D', null, null, 3,),).toBeNull(),)
                    test('E', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'E', null, null, 3,),).toBeNull(),)
                },)
                describe("error", () => {
                    describe("from index", () => {
                        test('2', () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-500", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    },)
                    describe("to index", () => {
                        test('2', () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-3", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-500", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    },)
                    describe("limit", () => {
                        test('2', () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().indexOfFirst(() => fail(), null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
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

                        test('a', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a', -3,),).toBeNull(),)
                        test('b', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'b', -3,),).toBeNull(),)
                        test('c', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'c', -3,),).toBeNull(),)
                        test('d', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'd', -3,),).toBeNull(),)
                        test('e', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'e', -3,),).toBeNull(),)
                        test('A', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'A', -3,),).toBeNull(),)
                        test('B', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'B', -3,),).toBe(5,),)
                        test('C', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'C', -3,),).toBe(6,),)
                        test('D', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D', -3,),).toBe(7,),)
                        test('E', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'E', -3,),).toBeNull(),)
                    },)
                    describe("to index", () => {
                        test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'a', null, -3,),).toBe(0,),)
                        test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'b', null, -3,),).toBe(1,),)
                        test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'c', null, -3,),).toBe(2,),)
                        test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'd', null, -3,),).toBe(3,),)
                        test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'e', null, -3,),).toBeNull(),)

                        test('a', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a', null, -3,),).toBe(0,),)
                        test('b', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'b', null, -3,),).toBe(1,),)
                        test('c', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'c', null, -3,),).toBe(2,),)
                        test('d', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'd', null, -3,),).toBe(3,),)
                        test('e', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'e', null, -3,),).toBeNull(),)
                        test('A', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'A', null, -3,),).toBe(4,),)
                        test('B', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'B', null, -3,),).toBe(5,),)
                        test('C', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'C', null, -3,),).toBeNull(),)
                        test('D', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D', null, -3,),).toBeNull(),)
                        test('E', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'E', null, -3,),).toBeNull(),)
                    },)
                    describe("limit", () => {
                        test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'a', null, null, -3,),).toBe(0,),)
                        test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'b', null, null, -3,),).toBe(1,),)
                        test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'c', null, null, -3,),).toBe(2,),)
                        test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'd', null, null, -3,),).toBe(3,),)
                        test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'e', null, null, -3,),).toBeNull(),)

                        test('a', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a', null, null, -3,),).toBe(0,),)
                        test('b', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'b', null, null, -3,),).toBe(1,),)
                        test('c', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'c', null, null, -3,),).toBe(2,),)
                        test('d', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'd', null, null, -3,),).toBe(3,),)
                        test('e', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'e', null, null, -3,),).toBeNull(),)
                        test('A', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'A', null, null, -3,),).toBe(4,),)
                        test('B', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'B', null, null, -3,),).toBeNull(),)
                        test('C', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'C', null, null, -3,),).toBeNull(),)
                        test('D', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D', null, null, -3,),).toBeNull(),)
                        test('E', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'E', null, null, -3,),).toBeNull(),)
                    },)
                },)
            },)
            describe("index of first indexed", () => {
                describe("known null return", () => {
                    test("empty", () => expect(EMPTY_INSTANCE().indexOfFirstIndexed(() => fail(),),).toBeNull(),)
                    test("from and to index = 0", () => expect(AB_INSTANCE().indexOfFirstIndexed(() => fail(), 0, 0,),).toBeNull(),)
                    test("limit = 0", () => expect(AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, 0,),).toBeNull(),)
                },)
                describe("direct", () => {
                    test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 0,),).toBe(0,),)
                    test("odd", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 1,),).toBe(1,),)

                    test('0', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 0,),).toBe(0,),)
                    test('1', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 1,),).toBe(1,),)
                    test('2', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 2,),).toBe(2,),)
                    test('3', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 3,),).toBe(3,),)
                    test('4', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 4,),).toBe(4,),)
                    test('5', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 5,),).toBe(5,),)
                    test('6', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 6,),).toBe(6,),)
                    test('7', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 7,),).toBe(7,),)
                    test('8', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 8,),).toBeNull(),)
                    test("26", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 26,),).toBeNull(),)
                },)
                describe("from index", () => {
                    test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 0, 3,),).toBe(4,),)
                    test("odd", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 1, 3,),).toBe(3,),)

                    test('0', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 0, 3,),).toBeNull(),)
                    test('1', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 1, 3,),).toBeNull(),)
                    test('2', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 2, 3,),).toBeNull(),)
                    test('3', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 3, 3,),).toBe(3,),)
                    test('4', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 4, 3,),).toBe(4,),)
                    test('5', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 5, 3,),).toBe(5,),)
                    test('6', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 6, 3,),).toBe(6,),)
                    test('7', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 7, 3,),).toBe(7,),)
                    test('8', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 8, 3,),).toBeNull(),)
                    test("26", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 26, 3,),).toBeNull(),)
                },)
                describe("to index", () => {
                    test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 0, null, 3,),).toBe(0,),)
                    test("odd", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 1, null, 3,),).toBe(1,),)

                    test('0', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 0, null, 3,),).toBe(0,),)
                    test('1', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 1, null, 3,),).toBe(1,),)
                    test('2', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 2, null, 3,),).toBe(2,),)
                    test('3', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 3, null, 3,),).toBe(3,),)
                    test('4', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 4, null, 3,),).toBeNull(),)
                    test('5', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 5, null, 3,),).toBeNull(),)
                    test('6', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 6, null, 3,),).toBeNull(),)
                    test('7', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 7, null, 3,),).toBeNull(),)
                    test('8', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 8, null, 3,),).toBeNull(),)
                    test("26", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 26, null, 3,),).toBeNull(),)
                },)
                describe("limit", () => {
                    test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 0, null, null, 3,),).toBe(0,),)
                    test("odd", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 1, null, null, 3,),).toBe(1,),)

                    test('0', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 0, null, null, 3,),).toBe(0,),)
                    test('1', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 1, null, null, 3,),).toBe(1,),)
                    test('2', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 2, null, null, 3,),).toBe(2,),)
                    test('3', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 3, null, null, 3,),).toBeNull(),)
                    test('4', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 4, null, null, 3,),).toBeNull(),)
                    test('5', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 5, null, null, 3,),).toBeNull(),)
                    test('6', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 6, null, null, 3,),).toBeNull(),)
                    test('7', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 7, null, null, 3,),).toBeNull(),)
                    test('8', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 8, null, null, 3,),).toBeNull(),)
                    test("26", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 26, null, null, 3,),).toBeNull(),)
                },)
                describe("error", () => {
                    describe("from index", () => {
                        test('2', () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-500", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    },)
                    describe("to index", () => {
                        test('2', () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-500", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    },)
                    describe("limit", () => {
                        test('2', () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-500", () => expect(() => AB_INSTANCE().indexOfFirstIndexed(() => fail(), null, null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    },)
                },)
                describe("negative values", () => {
                    describe("from index", () => {
                        test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 0, -3,),).toBe(6,),)
                        test("odd", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 1, -3,),).toBe(5,),)

                        test('0', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 0, -3,),).toBeNull(),)
                        test('1', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 1, -3,),).toBeNull(),)
                        test('2', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 2, -3,),).toBeNull(),)
                        test('3', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 3, -3,),).toBeNull(),)
                        test('4', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 4, -3,),).toBeNull(),)
                        test('5', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 5, -3,),).toBe(5,),)
                        test('6', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 6, -3,),).toBe(6,),)
                        test('7', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 7, -3,),).toBe(7,),)
                        test('8', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 8, -3,),).toBeNull(),)
                        test("26", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 26, -3,),).toBeNull(),)
                    },)
                    describe("to index", () => {
                        test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 0, null, -3,),).toBe(0,),)
                        test("odd", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 1, null, -3,),).toBe(1,),)

                        test('0', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 0, null, -3,),).toBe(0,),)
                        test('1', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 1, null, -3,),).toBe(1,),)
                        test('2', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 2, null, -3,),).toBe(2,),)
                        test('3', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 3, null, -3,),).toBe(3,),)
                        test('4', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 4, null, -3,),).toBe(4,),)
                        test('5', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 5, null, -3,),).toBe(5,),)
                        test('6', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 6, null, -3,),).toBeNull(),)
                        test('7', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 7, null, -3,),).toBeNull(),)
                        test('8', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 8, null, -3,),).toBeNull(),)
                        test("26", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 26, null, -3,),).toBeNull(),)
                    },)
                    describe("limit", () => {
                        test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 0, null, null, -3,),).toBe(0,),)
                        test("odd", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 1, null, null, -3,),).toBe(1,),)

                        test('0', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 0, null, null, -3,),).toBe(0,),)
                        test('1', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 1, null, null, -3,),).toBe(1,),)
                        test('2', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 2, null, null, -3,),).toBe(2,),)
                        test('3', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 3, null, null, -3,),).toBe(3,),)
                        test('4', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 4, null, null, -3,),).toBe(4,),)
                        test('5', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 5, null, null, -3,),).toBeNull(),)
                        test('6', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 6, null, null, -3,),).toBeNull(),)
                        test('7', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 7, null, null, -3,),).toBeNull(),)
                        test('8', () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 8, null, null, -3,),).toBeNull(),)
                        test("26", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 26, null, null, -3,),).toBeNull(),)
                    },)
                },)
            },)
            describe("index of last", () => {
                describe("known null return", () => {
                    test("empty", () => expect(EMPTY_INSTANCE().indexOfLast(() => fail(),),).toBeNull(),)
                    test("from and to index = 0", () => expect(AB_INSTANCE().indexOfLast(() => fail(), 0, 0,),).toBeNull(),)
                    test("limit = 0", () => expect(AB_INSTANCE().indexOfLast(() => fail(), null, null, 0,),).toBeNull(),)
                },)
                describe("direct", () => {
                    test("anyCase A", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'A',),).toBe(4,),)
                    test("anyCase B", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'B',),).toBe(5,),)
                    test("anyCase C", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'C',),).toBe(6,),)
                    test("anyCase D", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'D',),).toBe(7,),)
                    test("anyCase E", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'E',),).toBeNull(),)

                    test('a', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'a',),).toBe(0,),)
                    test('b', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'b',),).toBe(1,),)
                    test('c', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'c',),).toBe(2,),)
                    test('d', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'd',),).toBe(3,),)
                    test('e', () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'e',),).toBeNull(),)
                    test('A', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'A',),).toBe(4,),)
                    test('B', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'B',),).toBe(5,),)
                    test('C', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'C',),).toBe(6,),)
                    test('D', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'D',),).toBe(7,),)
                    test('E', () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'E',),).toBeNull(),)
                },)
                describe("from index", () => {
                    test("anyCase A", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'A', 3,),).toBe(4,),)
                    test("anyCase B", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'B', 3,),).toBe(5,),)
                    test("anyCase C", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'C', 3,),).toBe(6,),)
                    test("anyCase D", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'D', 3,),).toBe(7,),)
                    test("anyCase E", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'E', 3,),).toBeNull(),)

                    test('a', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'a', 3,),).toBeNull(),)
                    test('b', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'b', 3,),).toBeNull(),)
                    test('c', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'c', 3,),).toBeNull(),)
                    test('d', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'd', 3,),).toBe(3,),)
                    test('e', () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'e', 3,),).toBeNull(),)
                    test('A', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'A', 3,),).toBe(4,),)
                    test('B', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'B', 3,),).toBe(5,),)
                    test('C', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'C', 3,),).toBe(6,),)
                    test('D', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'D', 3,),).toBe(7,),)
                    test('E', () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'E', 3,),).toBeNull(),)
                },)
                describe("to index", () => {
                    test("anyCase A", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'A', null, 3,),).toBe(0,),)
                    test("anyCase B", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'B', null, 3,),).toBe(1,),)
                    test("anyCase C", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'C', null, 3,),).toBe(2,),)
                    test("anyCase D", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'D', null, 3,),).toBe(3,),)
                    test("anyCase E", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'E', null, 3,),).toBeNull(),)

                    test('a', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'a', null, 3,),).toBe(0,),)
                    test('b', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'b', null, 3,),).toBe(1,),)
                    test('c', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'c', null, 3,),).toBe(2,),)
                    test('d', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'd', null, 3,),).toBe(3,),)
                    test('e', () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'e', null, 3,),).toBeNull(),)
                    test('A', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'A', null, 3,),).toBeNull(),)
                    test('B', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'B', null, 3,),).toBeNull(),)
                    test('C', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'C', null, 3,),).toBeNull(),)
                    test('D', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'D', null, 3,),).toBeNull(),)
                    test('E', () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'E', null, 3,),).toBeNull(),)
                },)
                describe("limit", () => {
                    test("anyCase A", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'A', null, null, 3,),).toBe(0,),)
                    test("anyCase B", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'B', null, null, 3,),).toBe(1,),)
                    test("anyCase C", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'C', null, null, 3,),).toBe(2,),)
                    test("anyCase D", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'D', null, null, 3,),).toBeNull(),)
                    test("anyCase E", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'E', null, null, 3,),).toBeNull(),)

                    test('a', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'a', null, null, 3,),).toBe(0,),)
                    test('b', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'b', null, null, 3,),).toBe(1,),)
                    test('c', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'c', null, null, 3,),).toBe(2,),)
                    test('d', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'd', null, null, 3,),).toBeNull(),)
                    test('e', () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'e', null, null, 3,),).toBeNull(),)
                    test('A', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'A', null, null, 3,),).toBeNull(),)
                    test('B', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'B', null, null, 3,),).toBeNull(),)
                    test('C', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'C', null, null, 3,),).toBeNull(),)
                    test('D', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'D', null, null, 3,),).toBeNull(),)
                    test('E', () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'E', null, null, 3,),).toBeNull(),)
                },)
                describe("error", () => {
                    describe("from index", () => {
                        test('2', () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-500", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    },)
                    describe("to index", () => {
                        test('2', () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-500", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    },)
                    describe("limit", () => {
                        test('2', () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().indexOfLast(() => fail(), null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
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

                        test('a', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'a', -3,),).toBeNull(),)
                        test('b', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'b', -3,),).toBeNull(),)
                        test('c', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'c', -3,),).toBeNull(),)
                        test('d', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'd', -3,),).toBeNull(),)
                        test('e', () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'e', -3,),).toBeNull(),)
                        test('A', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'A', -3,),).toBeNull(),)
                        test('B', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'B', -3,),).toBe(5,),)
                        test('C', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'C', -3,),).toBe(6,),)
                        test('D', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'D', -3,),).toBe(7,),)
                        test('E', () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'E', -3,),).toBeNull(),)
                    },)
                    describe("to index", () => {
                        test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toLowerCase() === 'a', null, -3,),).toBe(4,),)
                        test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toLowerCase() === 'b', null, -3,),).toBe(5,),)
                        test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toLowerCase() === 'c', null, -3,),).toBe(2,),)
                        test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toLowerCase() === 'd', null, -3,),).toBe(3,),)
                        test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toLowerCase() === 'e', null, -3,),).toBeNull(),)

                        test('a', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'a', null, -3,),).toBe(0,),)
                        test('b', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'b', null, -3,),).toBe(1,),)
                        test('c', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'c', null, -3,),).toBe(2,),)
                        test('d', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'd', null, -3,),).toBe(3,),)
                        test('e', () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'e', null, -3,),).toBeNull(),)
                        test('A', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'A', null, -3,),).toBe(4,),)
                        test('B', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'B', null, -3,),).toBe(5,),)
                        test('C', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'C', null, -3,),).toBeNull(),)
                        test('D', () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'D', null, -3,),).toBeNull(),)
                        test('E', () => expect(ABCD_ABCD_INSTANCE().indexOfLast((it: string,) => it === 'E', null, -3,),).toBeNull(),)
                    },)
                    describe("limit", () => {
                        test("anyCase a", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'a', null, null, -3,),).toBe(0,),)
                        test("anyCase b", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'b', null, null, -3,),).toBe(1,),)
                        test("anyCase c", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'c', null, null, -3,),).toBe(2,),)
                        test("anyCase d", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'd', null, null, -3,),).toBe(3,),)
                        test("anyCase e", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'e', null, null, -3,),).toBeNull(),)

                        test('a', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a', null, null, -3,),).toBe(0,),)
                        test('b', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'b', null, null, -3,),).toBe(1,),)
                        test('c', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'c', null, null, -3,),).toBe(2,),)
                        test('d', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'd', null, null, -3,),).toBe(3,),)
                        test('e', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'e', null, null, -3,),).toBeNull(),)
                        test('A', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'A', null, null, -3,),).toBe(4,),)
                        test('B', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'B', null, null, -3,),).toBeNull(),)
                        test('C', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'C', null, null, -3,),).toBeNull(),)
                        test('D', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D', null, null, -3,),).toBeNull(),)
                        test('E', () => expect(ABCD_ABCD_INSTANCE().indexOfFirst((it: string,) => it === 'E', null, null, -3,),).toBeNull(),)
                    },)
                },)
            },)
            describe("index of last indexed", () => {
                describe("known null return", () => {
                    test("empty", () => expect(EMPTY_INSTANCE().indexOfLastIndexed(() => fail(),),).toBeNull(),)
                    test("from and to index = 0", () => expect(AB_INSTANCE().indexOfLastIndexed(() => fail(), 0, 0,),).toBeNull(),)
                    test("limit = 0", () => expect(AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, 0,),).toBeNull(),)
                },)
                describe("direct", () => {
                    test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 0,),).toBe(6,),)
                    test("odd", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 1,),).toBe(7,),)

                    test('0', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 0,),).toBe(0,),)
                    test('1', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 1,),).toBe(1,),)
                    test('2', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 2,),).toBe(2,),)
                    test('3', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 3,),).toBe(3,),)
                    test('4', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 4,),).toBe(4,),)
                    test('5', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 5,),).toBe(5,),)
                    test('6', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 6,),).toBe(6,),)
                    test('7', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 7,),).toBe(7,),)
                    test('8', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 8,),).toBeNull(),)
                    test("26", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 26,),).toBeNull(),)
                },)
                describe("from index", () => {
                    test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 0, 3,),).toBe(6,),)
                    test("odd", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 1, 3,),).toBe(7,),)

                    test('0', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 0, 3,),).toBeNull(),)
                    test('1', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 1, 3,),).toBeNull(),)
                    test('2', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 2, 3,),).toBeNull(),)
                    test('3', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 3, 3,),).toBe(3,),)
                    test('4', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 4, 3,),).toBe(4,),)
                    test('5', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 5, 3,),).toBe(5,),)
                    test('6', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 6, 3,),).toBe(6,),)
                    test('7', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 7, 3,),).toBe(7,),)
                    test('8', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 8, 3,),).toBeNull(),)
                    test("26", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 26, 3,),).toBeNull(),)
                },)
                describe("to index", () => {
                    test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 0, null, 3,),).toBe(2,),)
                    test("odd", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 1, null, 3,),).toBe(3,),)

                    test('0', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 0, null, 3,),).toBe(0,),)
                    test('1', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 1, null, 3,),).toBe(1,),)
                    test('2', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 2, null, 3,),).toBe(2,),)
                    test('3', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 3, null, 3,),).toBe(3,),)
                    test('4', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 4, null, 3,),).toBeNull(),)
                    test('5', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 5, null, 3,),).toBeNull(),)
                    test('6', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 6, null, 3,),).toBeNull(),)
                    test('7', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 7, null, 3,),).toBeNull(),)
                    test('8', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 8, null, 3,),).toBeNull(),)
                    test("26", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 26, null, 3,),).toBeNull(),)
                },)
                describe("limit", () => {
                    test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 0, null, null, 3,),).toBe(2,),)
                    test("odd", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 1, null, null, 3,),).toBe(1,),)

                    test('0', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 0, null, null, 3,),).toBe(0,),)
                    test('1', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 1, null, null, 3,),).toBe(1,),)
                    test('2', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 2, null, null, 3,),).toBe(2,),)
                    test('3', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 3, null, null, 3,),).toBeNull(),)
                    test('4', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 4, null, null, 3,),).toBeNull(),)
                    test('5', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 5, null, null, 3,),).toBeNull(),)
                    test('6', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 6, null, null, 3,),).toBeNull(),)
                    test('7', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 7, null, null, 3,),).toBeNull(),)
                    test('8', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 8, null, null, 3,),).toBeNull(),)
                    test("26", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 26, null, null, 3,),).toBeNull(),)
                },)
                describe("error", () => {
                    describe("from index", () => {
                        test('2', () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-500", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    },)
                    describe("to index", () => {
                        test('2', () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, 2,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-500", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    },)
                    describe("limit", () => {
                        test('2', () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, 2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('3', () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test('4', () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, 4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("-2", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, -2,),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-3", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-4", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, -4,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                        test("500", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, 500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                        test("-500", () => expect(() => AB_INSTANCE().indexOfLastIndexed(() => fail(), null, null, -500,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    },)
                },)
                describe("negative values", () => {
                    describe("from index", () => {
                        test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 0, -3,),).toBe(6,),)
                        test("odd", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 1, -3,),).toBe(7,),)

                        test('0', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 0, -3,),).toBeNull(),)
                        test('1', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 1, -3,),).toBeNull(),)
                        test('2', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 2, -3,),).toBeNull(),)
                        test('3', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 3, -3,),).toBeNull(),)
                        test('4', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 4, -3,),).toBeNull(),)
                        test('5', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 5, -3,),).toBe(5,),)
                        test('6', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 6, -3,),).toBe(6,),)
                        test('7', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 7, -3,),).toBe(7,),)
                        test('8', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 8, -3,),).toBeNull(),)
                        test("26", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 26, -3,),).toBeNull(),)
                    },)
                    describe("to index", () => {
                        test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 0, null, -3,),).toBe(4,),)
                        test("odd", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 1, null, -3,),).toBe(5,),)

                        test('0', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 0, null, -3,),).toBe(0,),)
                        test('1', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 1, null, -3,),).toBe(1,),)
                        test('2', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 2, null, -3,),).toBe(2,),)
                        test('3', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 3, null, -3,),).toBe(3,),)
                        test('4', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 4, null, -3,),).toBe(4,),)
                        test('5', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 5, null, -3,),).toBe(5,),)
                        test('6', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 6, null, -3,),).toBeNull(),)
                        test('7', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 7, null, -3,),).toBeNull(),)
                        test('8', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 8, null, -3,),).toBeNull(),)
                        test("26", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 26, null, -3,),).toBeNull(),)
                    },)
                    describe("limit", () => {
                        test("even", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 0, null, null, -3,),).toBe(4,),)
                        test("odd", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 1, null, null, -3,),).toBe(3,),)

                        test('0', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 0, null, null, -3,),).toBe(0,),)
                        test('1', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 1, null, null, -3,),).toBe(1,),)
                        test('2', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 2, null, null, -3,),).toBe(2,),)
                        test('3', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 3, null, null, -3,),).toBe(3,),)
                        test('4', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 4, null, null, -3,),).toBe(4,),)
                        test('5', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 5, null, null, -3,),).toBeNull(),)
                        test('6', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 6, null, null, -3,),).toBeNull(),)
                        test('7', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 7, null, null, -3,),).toBeNull(),)
                        test('8', () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 8, null, null, -3,),).toBeNull(),)
                        test("26", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 26, null, null, -3,),).toBeNull(),)
                    },)
                },)
            },)
        },)
        describe("first", () => {
            describe("[].first() == throw|null", () => {
                test("direct", () => expect(() => EMPTY_INSTANCE().first(),).toThrow(EmptyCollectionHolderException,),)
                test("or null", () => expect(EMPTY_INSTANCE().firstOrNull(),).toBeNull(),)
            },)

            test("[a,b,c,d].first()", () => expect(ABCD_INSTANCE().first(),).toBe('a',),)
            describe("[null,a,b,c,d].first()", () => {
                test("direct", () => expect(NULL_ABCD_INSTANCE().first(),).toBeNull(),)
                test("or null", () => expect(NULL_ABCD_INSTANCE().firstOrNull(),).toBeNull(),)
            },)
            test("[a,b,c,d,null].first()", () => expect(ABCD_NULL_INSTANCE().first(),).toBe('a',),)
            describe("[undefined,a,b,c,d].first()", () => {
                test("direct", () => expect(UNDEFINED_ABCD_INSTANCE().first(),).toBeUndefined(),)
                test("or null", () => expect(UNDEFINED_ABCD_INSTANCE().firstOrNull(),).toBeUndefined(),)
            },)
            test("[a,b,c,d,undefined].first()", () => expect(ABCD_UNDEFINED_INSTANCE().first(),).toBe('a',),)

            test("[a,b,c,d].first(!a)", () => expect(ABCD_INSTANCE().first(it => it !== 'a',),).toBe('b',),)
            describe("[null,a,b,c,d].first(!a) ", () => {
                test("direct", () => expect(NULL_ABCD_INSTANCE().first(it => it !== 'a',),).toBeNull(),)
                test("or null", () => expect(NULL_ABCD_INSTANCE().firstOrNull(it => it !== 'a',),).toBeNull(),)
            },)
            test("[a,b,c,d,null].first(!a)", () => expect(ABCD_NULL_INSTANCE().first(it => it !== 'a',),).toBe('b',),)
            describe("[undefined,a,b,c,d].first(!a)", () => {
                test("direct", () => expect(UNDEFINED_ABCD_INSTANCE().first(it => it !== 'a',),).toBeUndefined(),)
                test("or null", () => expect(UNDEFINED_ABCD_INSTANCE().firstOrNull(it => it !== 'a',),).toBeUndefined(),)
            },)
            test("[a,b,c,d,undefined].first(!a)", () => expect(ABCD_UNDEFINED_INSTANCE().first(it => it !== 'a',),).toBe('b',),)
        },)
        describe("last", () => {
            describe("[]", () => {
                test("direct", () => expect(() => EMPTY_INSTANCE().last(),).toThrow(EmptyCollectionHolderException,),)
                test("or null", () => expect(EMPTY_INSTANCE().lastOrNull(),).toBeNull(),)
            },)

            test("[a,b,c,d].last()", () => expect(ABCD_INSTANCE().last(),).toBe('d',),)
            test("[null,a,b,c,d].last()", () => expect(NULL_ABCD_INSTANCE().last(),).toBe('d',),)
            describe("[a,b,c,d,null].last()", () => {
                test("direct", () => expect(ABCD_NULL_INSTANCE().last(),).toBeNull(),)
                test("or null", () => expect(ABCD_NULL_INSTANCE().lastOrNull(),).toBeNull(),)
            },)
            test("[undefined,a,b,c,d].last()", () => expect(UNDEFINED_ABCD_INSTANCE().last(),).toBe('d',),)
            describe("[a,b,c,d,undefined].last()", () => {
                test("direct", () => expect(ABCD_UNDEFINED_INSTANCE().last(),).toBeUndefined(),)
                test("or null", () => expect(ABCD_UNDEFINED_INSTANCE().lastOrNull(),).toBeUndefined(),)
            },)

            test("[a,b,c,d].last(!d)", () => expect(ABCD_INSTANCE().last(it => it !== 'd',),).toBe('c',),)
            test("[null,a,b,c,d].last(!d)", () => expect(NULL_ABCD_INSTANCE().last(it => it !== 'd',),).toBe('c',),)
            describe("[a,b,c,d,null].last(!d)", () => {
                test("direct", () => expect(ABCD_NULL_INSTANCE().last(it => it !== 'd',),).toBeNull(),)
                test("or null", () => expect(ABCD_NULL_INSTANCE().lastOrNull(it => it !== 'd',),).toBeNull(),)
            },)
            test("[undefined,a,b,c,d].last(!d)", () => expect(UNDEFINED_ABCD_INSTANCE().last(it => it !== 'd',),).toBe('c',),)
            describe("[a,b,c,d,undefined].last(!d)", () => {
                test("direct", () => expect(ABCD_UNDEFINED_INSTANCE().last(it => it !== 'd',),).toBeUndefined(),)
                test("or null", () => expect(ABCD_UNDEFINED_INSTANCE().lastOrNull(it => it !== 'd',),).toBeUndefined(),)
            },)
        },)
    },)
    describe("has / includes / contains …", () => {
        describe("null", () => {
            describe("has", () => {
                test("[a,b] == false", () => expect(AB_INSTANCE().hasNull,).toBeFalse(),)
                test("[a,b,null,c,d,undefined] == true", () => expect(A_NULL_B_UNDEFINED_INSTANCE().hasNull,).toBeTrue(),)
                test("[a,b,1,2] == false", () => expect(AB12_INSTANCE().hasNull,).toBeFalse(),)
                test("[null,a,b,c,d] == true", () => expect(NULL_ABCD_INSTANCE().hasNull,).toBeTrue(),)
                test("[a,b,c,d,null] == true", () => expect(ABCD_NULL_INSTANCE().hasNull,).toBeTrue(),)
                test("[undefined,a,b,c,d] == true", () => expect(UNDEFINED_ABCD_INSTANCE().hasNull,).toBeTrue(),)
                test("[a,b,c,d,undefined] == true", () => expect(ABCD_UNDEFINED_INSTANCE().hasNull,).toBeTrue(),)
            },)
            describe("includes", () => {
                test("[a,b] == false", () => expect(AB_INSTANCE().includesNull,).toBeFalse(),)
                test("[a,b,null,c,d,undefined] == true", () => expect(A_NULL_B_UNDEFINED_INSTANCE().includesNull,).toBeTrue(),)
                test("[a,b,1,2] == false", () => expect(AB12_INSTANCE().includesNull,).toBeFalse(),)
                test("[null,a,b,c,d] == true", () => expect(NULL_ABCD_INSTANCE().includesNull,).toBeTrue(),)
                test("[a,b,c,d,null] == true", () => expect(ABCD_NULL_INSTANCE().includesNull,).toBeTrue(),)
                test("[undefined,a,b,c,d] == true", () => expect(UNDEFINED_ABCD_INSTANCE().includesNull,).toBeTrue(),)
                test("[a,b,c,d,undefined] == true", () => expect(ABCD_UNDEFINED_INSTANCE().includesNull,).toBeTrue(),)
            },)
            describe("contains", () => {
                test("[a,b] == false", () => expect(AB_INSTANCE().containsNull,).toBeFalse(),)
                test("[a,b,null,c,d,undefined] == true", () => expect(A_NULL_B_UNDEFINED_INSTANCE().containsNull,).toBeTrue(),)
                test("[a,b,1,2] == false", () => expect(AB12_INSTANCE().containsNull,).toBeFalse(),)
                test("[null,a,b,c,d] == true", () => expect(NULL_ABCD_INSTANCE().containsNull,).toBeTrue(),)
                test("[a,b,c,d,null] == true", () => expect(ABCD_NULL_INSTANCE().containsNull,).toBeTrue(),)
                test("[undefined,a,b,c,d] == true", () => expect(UNDEFINED_ABCD_INSTANCE().containsNull,).toBeTrue(),)
                test("[a,b,c,d,undefined] == true", () => expect(ABCD_UNDEFINED_INSTANCE().containsNull,).toBeTrue(),)
            },)
        },)
    },)
    describe("all / any / none", () => {
        describe("all", () => {
            test("[a,b].all(a|b) == true", () => expect(AB_INSTANCE().all(it => it === 'a' || it === 'b'),).toBeTrue(),)
            test("[a,b].all(c|d) == false", () => expect(AB_INSTANCE().all((it: string) => it === 'c' || it === 'd'),).toBeFalse(),)
            test("[a,b,c,d].all(a|b) == false", () => expect(ABCD_INSTANCE().all(it => it === 'a' || it === 'b'),).toBeFalse(),)
        },)
        describe("any", () => {
            test("[].any() == false", () => expect(EMPTY_INSTANCE().any(),).toBeFalse(),)
            test("[a,b].any() == true", () => expect(AB_INSTANCE().any(),).toBeTrue(),)

            test("[a,b].any(a|b) == true", () => expect(AB_INSTANCE().any(it => it === 'a' || it === 'b'),).toBeTrue(),)
            test("[a,b].any(c|d) == false", () => expect(AB_INSTANCE().any((it: string) => it === 'c' || it === 'd'),).toBeFalse(),)
            test("[a,b,c,d].any(a|b) == true", () => expect(ABCD_INSTANCE().any(it => it === 'a' || it === 'b'),).toBeTrue(),)
        },)
        describe("none", () => {
            test("[].none() == true", () => expect(EMPTY_INSTANCE().none(),).toBeTrue(),)
            test("[a,b].none() == false", () => expect(AB_INSTANCE().none(),).toBeFalse(),)

            test("[a,b].none(a|b) == false", () => expect(AB_INSTANCE().none(it => it === 'a' || it === 'b'),).toBeFalse(),)
            test("[a,b].none(c|d) == true", () => expect(AB_INSTANCE().none((it: string) => it === 'c' || it === 'd'),).toBeTrue(),)
            test("[a,b,c,d].none(a|b) == false", () => expect(ABCD_INSTANCE().none(it => it === 'a' || it === 'b'),).toBeFalse(),)
        },)
    },)
    describe("has / includes / contains", () => {
        describe("one", () => {
            describe("singular item", () => {
                describe('a', () => {
                    test("has", () => expect(A_INSTANCE().hasOne('a',),).toBeTrue(),)
                    test("includes", () => expect(A_INSTANCE().includesOne('a',),).toBeTrue(),)
                    test("contains", () => expect(A_INSTANCE().containsOne('a',),).toBeTrue(),)
                },)
                describe('b', () => {
                    test("has", () => expect(A_INSTANCE().hasOne('b',),).toBeFalse(),)
                    test("includes", () => expect(A_INSTANCE().includesOne('b',),).toBeFalse(),)
                    test("contains", () => expect(A_INSTANCE().containsOne('b',),).toBeFalse(),)
                },)
                describe("a,b", () => {
                    test("has", () => expect(A_INSTANCE().hasOne('a', 'b',),).toBeTrue(),)
                    test("includes", () => expect(A_INSTANCE().includesOne('a', 'b',),).toBeTrue(),)
                    test("contains", () => expect(A_INSTANCE().containsOne('a', 'b',),).toBeTrue(),)
                },)
                describe("b,a", () => {
                    test("has", () => expect(A_INSTANCE().hasOne('b', 'a',),).toBeTrue(),)
                    test("includes", () => expect(A_INSTANCE().includesOne('b', 'a',),).toBeTrue(),)
                    test("contains", () => expect(A_INSTANCE().containsOne('b', 'a',),).toBeTrue(),)
                },)
            },)
            describe.each(TEMPLATE_ITEMS,)("%s", it => {
                test("has", () => expect(TEMPLATE_ITEMS_INSTANCE().hasOne(it,),).toBeTrue(),)
                test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesOne(it,),).toBeTrue(),)
                test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsOne(it,),).toBeTrue(),)

                describe("value + nonPresentItem", () => {
                    test("has", () => expect(TEMPLATE_ITEMS_INSTANCE().hasOne(it, nonPresentItem,),).toBeTrue(),)
                    test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesOne(it, nonPresentItem,),).toBeTrue(),)
                    test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsOne(it, nonPresentItem,),).toBeTrue(),)
                },)
                describe("Object(value)", () => {
                    test("has not", () => expect(TEMPLATE_ITEMS_INSTANCE().hasOne(Object(it,),),).toBeFalse(),)
                    test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesOne(Object(it,),),).toBeFalse(),)
                    test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsOne(Object(it,),),).toBeFalse(),)
                },)
                describe("[value]", () => {
                    test("has", () => expect(TEMPLATE_ITEMS_INSTANCE().hasOne([it,],),).toBeFalse(),)
                    test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesOne([it,],),).toBeFalse(),)
                    test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsOne([it,],),).toBeFalse(),)
                },)
                describe("{value}", () => {
                    test("has", () => expect(TEMPLATE_ITEMS_INSTANCE().hasOne({it,},),).toBeFalse(),)
                    test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesOne({it,},),).toBeFalse(),)
                    test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsOne({it,},),).toBeFalse(),)
                },)
            },)
        },)
        describe("all", () => {
            describe("singular item", () => {
                describe("singular item", () => {
                    describe('a', () => {
                        test("has", () => expect(A_INSTANCE().hasAll('a',),).toBeTrue(),)
                        test("includes", () => expect(A_INSTANCE().includesAll('a',),).toBeTrue(),)
                        test("contains", () => expect(A_INSTANCE().containsAll('a',),).toBeTrue(),)
                    },)
                    describe('b', () => {
                        test("has", () => expect(A_INSTANCE().hasAll('b',),).toBeFalse(),)
                        test("includes", () => expect(A_INSTANCE().includesAll('b',),).toBeFalse(),)
                        test("contains", () => expect(A_INSTANCE().containsAll('b',),).toBeFalse(),)
                    },)
                    describe("a,b", () => {
                        test("has", () => expect(A_INSTANCE().hasAll('a', 'b',),).toBeFalse(),)
                        test("includes", () => expect(A_INSTANCE().includesAll('a', 'b',),).toBeFalse(),)
                        test("contains", () => expect(A_INSTANCE().containsAll('a', 'b',),).toBeFalse(),)
                    },)
                    describe("b,a", () => {
                        test("has", () => expect(A_INSTANCE().hasAll('b', 'a',),).toBeFalse(),)
                        test("includes", () => expect(A_INSTANCE().includesAll('b', 'a',),).toBeFalse(),)
                        test("contains", () => expect(A_INSTANCE().containsAll('b', 'a',),).toBeFalse(),)
                    },)
                },)
            },)
            describe.each(TEMPLATE_ITEMS,)("%s", it => {
                test("has", () => expect(TEMPLATE_ITEMS_INSTANCE().hasAll(it,),).toBeTrue(),)
                test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesAll(it,),).toBeTrue(),)
                test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsAll(it,),).toBeTrue(),)

                describe("value + nonPresentItem", () => {
                    test("has", () => expect(TEMPLATE_ITEMS_INSTANCE().hasAll(it, nonPresentItem,),).toBeFalse(),)
                    test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesAll(it, nonPresentItem,),).toBeFalse(),)
                    test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsAll(it, nonPresentItem,),).toBeFalse(),)
                },)
                describe("Object(value)", () => {
                    test("has not", () => expect(TEMPLATE_ITEMS_INSTANCE().hasAll(Object(it,),),).toBeFalse(),)
                    test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesAll(Object(it,),),).toBeFalse(),)
                    test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsAll(Object(it,),),).toBeFalse(),)
                },)
                describe("[value]", () => {
                    test("has", () => expect(TEMPLATE_ITEMS_INSTANCE().hasAll([it,],),).toBeFalse(),)
                    test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesAll([it,],),).toBeFalse(),)
                    test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsAll([it,],),).toBeFalse(),)
                },)
                describe("{value}", () => {
                    test("has", () => expect(TEMPLATE_ITEMS_INSTANCE().hasAll({it,},),).toBeFalse(),)
                    test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesAll({it,},),).toBeFalse(),)
                    test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsAll({it,},),).toBeFalse(),)
                },)
            },)
        },)
    },)
    describe("join", () => {
        test("[a,b].join()", () => expect(AB_INSTANCE().join(),).toBe("[a, b]",),)
        test("[a,b].join(;)", () => expect(AB_INSTANCE().join(";",),).toBe("[a;b]",),)
        test("[a,b].join(null, <)", () => expect(AB_INSTANCE().join(null, "<",),).toBe("<a, b]",),)
        test("[a,b].join(null, null, >)", () => expect(AB_INSTANCE().join(null, null, ">",),).toBe("[a, b>",),)
        test("[a,b].join(null, null, null, 1)", () => expect(AB_INSTANCE().join(null, null, null, 1,),).toBe("[a, …]",),)
        test("[a,b].join(null, null, null, null, \"...\")", () => expect(AB_INSTANCE().join(null, null, null, null, "...",),).toBe("[a, b]",),)
        test("[a,b].join(null, null, null, 1, \"...\")", () => expect(AB_INSTANCE().join(null, null, null, 1, "...",),).toBe("[a, ...]",),)
        test("[a,b].join(null, null, null, null, () => toUpperCase)", () => expect(AB_INSTANCE().join(null, null, null, null, null, it => it.toUpperCase(),),).toBe("[A, B]",),)
    },)
    describe("filter", () => {
        test("[a,b,c,d].filter(d) == [d]", () => expect(ABCD_INSTANCE().filter(it => it === 'd',).toArray(),).toEqual(['d',],),)
        test("[a,b,c,d].filterIndexed(3) == [d]", () => expect(ABCD_INSTANCE().filterIndexed(it => it === 3,).toArray(),).toEqual(['d',],),)
        test("[a,b,c,d].filterNot(d) == [a,b,c]", () => expect(ABCD_INSTANCE().filterNot(it => it === 'd',).toArray(),).toEqual(['a', 'b', 'c',],),)
        test("[a,b,c,d].filterIndexedNot(3) == [a,b,c]", () => expect(ABCD_INSTANCE().filterIndexedNot(it => it === 3,).toArray(),).toEqual(['a', 'b', 'c',],),)
        test("[a,b,1,2].filter(number) == [1,2]", () => expect(AB12_INSTANCE().filter(it => typeof it == "number",).toArray(),).toEqual([1, 2,],),)
        test("[a,b,1,2].filterNot(number) == [a,b]", () => expect(AB12_INSTANCE().filterNot(it => typeof it == "number",).toArray(),).toEqual(['a', 'b',],),)
    },)
    describe("filterNotNull", () => {
        test("[a,null,b,undefined].filterNotNull() == [a,b]", () => expect(A_NULL_B_UNDEFINED_INSTANCE().filterNotNull().toArray(),).toEqual(['a', 'b',],),)
        test("[a,null,b,undefined].filterNotNull() != this", () => expect(A_NULL_B_UNDEFINED_INSTANCE().filterNotNull(),).not.toEqual(A_NULL_B_UNDEFINED_INSTANCE(),),)
        test("[a,null,b,undefined].filterNot(null).filterNotNull() != this", () => expect(A_NULL_B_UNDEFINED_INSTANCE().filterNot(it => it === null).filterNotNull().toArray(),).not.toEqual(['a', null, 'b', undefined,],),)
        test("[a,null,b,undefined].filterNot(undefined).filterNotNull() != this", () => expect(A_NULL_B_UNDEFINED_INSTANCE().filterNot(it => it === undefined).filterNotNull().toArray(),).not.toEqual(['a', null, 'b', undefined,],),)
        test("[a,b].filterNotNull() == this", () => expect(AB_INSTANCE().filterNotNull().toArray(),).toEqual(['a', 'b',],),)
    },)
    describe("requireNoNulls", () => {
        test("[a,null,b,undefined].requireNotNull() → throw", () => expect(() => A_NULL_B_UNDEFINED_INSTANCE().requireNoNulls(),).toThrow(TypeError,),)
        test("[a,null,b,undefined].filterNot(null).requireNotNull() → throw", () => expect(() => A_NULL_B_UNDEFINED_INSTANCE().filterNot(it => it === null).requireNoNulls(),).toThrow(TypeError,),)
        test("[a,null,b,undefined].filterNot(undefined).requireNotNull() → throw", () => expect(() => A_NULL_B_UNDEFINED_INSTANCE().filterNot(it => it === undefined).requireNoNulls(),).toThrow(TypeError),)
        test("[a,null,b,undefined].filterNonNull().requireNotNull() → no throw", () => expect(() => A_NULL_B_UNDEFINED_INSTANCE().filterNotNull().requireNoNulls().toArray(),).not.toThrow(),)
        test("[a,b].requireNotNull() -> no throw", () => expect(() => AB_INSTANCE().requireNoNulls(),).not.toThrow(),)
    },)
    describe("find", () => {
        test("[a,b,c,d,A,B,C,D].find(anyCase b) == b", () => expect(ABCD_ABCD_INSTANCE().find(it => it.toLowerCase() === 'b',),).toBe('b',),)
        test("[a,b,c,d,A,B,C,D].find(a) == a", () => expect(ABCD_ABCD_INSTANCE().find(it => it === 'a',),).toBe('a',),)
        test("[a,b,c,d,A,B,C,D].find(D) == D", () => expect(ABCD_ABCD_INSTANCE().find(it => it === 'D',),).toBe('D',),)
        test("[a,b,c,d,A,B,C,D].find(anyCase e) == null", () => expect(ABCD_ABCD_INSTANCE().find(it => it.toLowerCase() === 'e',),).toBeNull(),)

        test("[a,b,c,d,A,B,C,D].findIndexed(odd) == b", () => expect(ABCD_ABCD_INSTANCE().findIndexed(it => it % 2 === 1,),).toBe('b',),)
        test("[a,b,c,d,A,B,C,D].findIndexed(0) == a", () => expect(ABCD_ABCD_INSTANCE().findIndexed(it => it === 0,),).toBe('a',),)
        test("[a,b,c,d,A,B,C,D].findIndexed(7) == D", () => expect(ABCD_ABCD_INSTANCE().findIndexed(it => it === 7,),).toBe('D',),)
        test("[a,b,c,d,A,B,C,D].findIndexed(26) == null", () => expect(ABCD_ABCD_INSTANCE().findIndexed(it => it === 26,),).toBeNull(),)


        test("[a,b,c,d,A,B,C,D].findLast(anyCase B) == B", () => expect(ABCD_ABCD_INSTANCE().findLast(it => it.toUpperCase() === 'B',),).toBe('B',),)
        test("[a,b,c,d,A,B,C,D].findLast(a) == a", () => expect(ABCD_ABCD_INSTANCE().findLast(it => it === 'a',),).toBe('a',),)
        test("[a,b,c,d,A,B,C,D].findLast(D) == D", () => expect(ABCD_ABCD_INSTANCE().findLast(it => it === 'D',),).toBe('D',),)
        test("[a,b,c,d,A,B,C,D].findLast(anyCase E) == null", () => expect(ABCD_ABCD_INSTANCE().findLast(it => it.toUpperCase() === 'E',),).toBeNull(),)

        test("[a,b,c,d,A,B,C,D].findLastIndexed(odd) == D", () => expect(ABCD_ABCD_INSTANCE().findLastIndexed(it => it % 2 === 1,),).toBe('D',),)
        test("[a,b,c,d,A,B,C,D].findLastIndexed(0) == a", () => expect(ABCD_ABCD_INSTANCE().findLastIndexed(it => it === 0,),).toBe('a',),)
        test("[a,b,c,d,A,B,C,D].findLastIndexed(7) == D", () => expect(ABCD_ABCD_INSTANCE().findLastIndexed(it => it === 7,),).toBe('D',),)
        test("[a,b,c,d,A,B,C,D].findLastIndexed(26) == null", () => expect(ABCD_ABCD_INSTANCE().findLastIndexed(it => it === 26,),).toBeNull(),)
    },)
    describe("slice", () => {
        describe("by array", () => {
            test("empty", () => expect(AB_INSTANCE().slice([],),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test('0', () => expect(ABCD_INSTANCE().slice([0,],).toArray(),).toEqual(['a',],),)
            test('1', () => expect(ABCD_INSTANCE().slice([1,],).toArray(),).toEqual(['b',],),)
            test("-1", () => expect(ABCD_INSTANCE().slice([-1,],).toArray(),).toEqual(['d',],),)
            test("-2", () => expect(ABCD_INSTANCE().slice([-2,],).toArray(),).toEqual(['c',],),)
            test("10", () => expect(() => ABCD_INSTANCE().slice([10,],).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-10", () => expect(() => ABCD_INSTANCE().slice([-10,],).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        },)
        describe("by set", () => {
            test("empty", () => expect(AB_INSTANCE().slice(new Set<never>(),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test('0', () => expect(ABCD_INSTANCE().slice(new Set([0,],),).toArray(),).toEqual(['a',],),)
            test('1', () => expect(ABCD_INSTANCE().slice(new Set([1,],),).toArray(),).toEqual(['b',],),)
            test("-1", () => expect(ABCD_INSTANCE().slice(new Set([-1,],),).toArray(),).toEqual(['d',],),)
            test("-2", () => expect(ABCD_INSTANCE().slice(new Set([-2,],),).toArray(),).toEqual(['c',],),)
            test("10", () => expect(() => ABCD_INSTANCE().slice(new Set([10,],),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-10", () => expect(() => ABCD_INSTANCE().slice(new Set([-10,],),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        },)
        describe("by collection", () => {
            test("empty", () => expect(AB_INSTANCE().slice(newCollectionInstance(instance, arrayOrSetCreation, [],),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test('0', () => expect(ABCD_INSTANCE().slice(newCollectionInstance(instance, arrayOrSetCreation, [0,],),).toArray(),).toEqual(['a',],),)
            test('1', () => expect(ABCD_INSTANCE().slice(newCollectionInstance(instance, arrayOrSetCreation, [1,],),).toArray(),).toEqual(['b',],),)
            test("-1", () => expect(ABCD_INSTANCE().slice(newCollectionInstance(instance, arrayOrSetCreation, [-1,],),).toArray(),).toEqual(['d',],),)
            test("-2", () => expect(ABCD_INSTANCE().slice(newCollectionInstance(instance, arrayOrSetCreation, [-2,],),).toArray(),).toEqual(['c',],),)
            test("10", () => expect(() => ABCD_INSTANCE().slice(newCollectionInstance(instance, arrayOrSetCreation, [10,],),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-10", () => expect(() => ABCD_INSTANCE().slice(newCollectionInstance(instance, arrayOrSetCreation, [-10,],),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        },)
        describe("by collection iterator", () => {
            test("empty", () => expect(AB_INSTANCE().slice(new GenericCollectionIterator<never>(newCollectionInstance(instance, arrayOrSetCreation, [],),),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test('0', () => expect(ABCD_INSTANCE().slice(new GenericCollectionIterator<0>(newCollectionInstance(instance, arrayOrSetCreation, [0,],),),).toArray(),).toEqual(['a',],),)
            test('1', () => expect(ABCD_INSTANCE().slice(new GenericCollectionIterator<1>(newCollectionInstance(instance, arrayOrSetCreation, [1,],),),).toArray(),).toEqual(['b',],),)
            test("-1", () => expect(ABCD_INSTANCE().slice(new GenericCollectionIterator<-1>(newCollectionInstance(instance, arrayOrSetCreation, [-1,],),),).toArray(),).toEqual(['d',],),)
            test("-2", () => expect(ABCD_INSTANCE().slice(new GenericCollectionIterator<-2>(newCollectionInstance(instance, arrayOrSetCreation, [-2,],),),).toArray(),).toEqual(['c',],),)
            test("10", () => expect(() => ABCD_INSTANCE().slice(new GenericCollectionIterator<10>(newCollectionInstance(instance, arrayOrSetCreation, [10,],),),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-10", () => expect(() => ABCD_INSTANCE().slice(new GenericCollectionIterator<-10>(newCollectionInstance(instance, arrayOrSetCreation, [-10,],),),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        },)
        describe("by iterable", () => {
            test("empty", () => expect(AB_INSTANCE().slice({ [Symbol.iterator]() { return [][Symbol.iterator]() }, },),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test('0', () => expect(ABCD_INSTANCE().slice({ [Symbol.iterator]() { return [0,][Symbol.iterator]() }, },).toArray(),).toEqual(['a',],),)
            test('1', () => expect(ABCD_INSTANCE().slice({ [Symbol.iterator]() { return [1,][Symbol.iterator]() }, },).toArray(),).toEqual(['b',],),)
            test("-1", () => expect(ABCD_INSTANCE().slice({ [Symbol.iterator]() { return [-1,][Symbol.iterator]() }, },).toArray(),).toEqual(['d',],),)
            test("-2", () => expect(ABCD_INSTANCE().slice({ [Symbol.iterator]() { return [-2,][Symbol.iterator]() }, },).toArray(),).toEqual(['c',],),)
            test("10", () => expect(() => ABCD_INSTANCE().slice({ [Symbol.iterator]() { return [10,][Symbol.iterator]() }, },).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("-10", () => expect(() => ABCD_INSTANCE().slice({ [Symbol.iterator]() { return [-10,][Symbol.iterator]() }, },).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        },)

        describe("by range", () => {
            test("empty", () => expect(EMPTY_INSTANCE().slice(),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)

            test("(1)", () => expect(ABCD_INSTANCE().slice(1,).toArray(),).toEqual(['b', 'c', 'd',],),)
            test("(null, 1)", () => expect(ABCD_INSTANCE().slice(null, 1,).toArray(),).toEqual(['a', 'b',],),)
            test("(1, 1)", () => expect(ABCD_INSTANCE().slice(1, 1,).toArray(),).toEqual(['b',],),)
            test("(1, 2)", () => expect(ABCD_INSTANCE().slice(1, 2,).toArray(),).toEqual(['b', 'c',],),)
            test("(-2)", () => expect(ABCD_INSTANCE().slice(-2,).toArray(),).toEqual(['c', 'd',],),)
            test("(null, -2)", () => expect(ABCD_INSTANCE().slice(null, -2,).toArray(),).toEqual(['a', 'b', 'c',],),)
            test("(-2, -2)", () => expect(ABCD_INSTANCE().slice(-2, -2,).toArray(),).toEqual(['c',],),)
            test("(-3, -2)", () => expect(ABCD_INSTANCE().slice(-3, -2,).toArray(),).toEqual(['b', 'c',],),)

            test("(1, null, 1)", () => expect(ABCD_INSTANCE().slice(1, null, 1,).toArray(),).toEqual(['b',],),)
            test("(1, null, -3)", () => expect(ABCD_INSTANCE().slice(1, null, -3,).toArray(),).toEqual(['b',],),)
            test("(1, null, 2)", () => expect(ABCD_INSTANCE().slice(1, null, 2,).toArray(),).toEqual(['b', 'c',],),)
            test("(-2, null, 1)", () => expect(ABCD_INSTANCE().slice(-2, null, 1,).toArray(),).toEqual(['c',],),)
            test("(-2, null, -3)", () => expect(ABCD_INSTANCE().slice(-2, null, -3,).toArray(),).toEqual(['c',],),)
            test("(-2, null, 2)", () => expect(ABCD_INSTANCE().slice(-2, null, 2,).toArray(),).toEqual(['c', 'd',],),)
            test("(null, 1, 1)", () => expect(ABCD_INSTANCE().slice(null, 1, 1,).toArray(),).toEqual(['a',],),)
            test("(null, 1, -3)", () => expect(ABCD_INSTANCE().slice(null, 1, -3,).toArray(),).toEqual(['a',],),)
            test("(null, 1, 2)", () => expect(ABCD_INSTANCE().slice(null, 1, 2,).toArray(),).toEqual(['a', 'b',],),)
            test("(null, -2, 1)", () => expect(ABCD_INSTANCE().slice(null, -2, 1,).toArray(),).toEqual(['a',],),)
            test("(null, -2, -3)", () => expect(ABCD_INSTANCE().slice(null, -2, -3,).toArray(),).toEqual(['a',],),)
            test("(null, -2, 2)", () => expect(ABCD_INSTANCE().slice(null, -2, 2,).toArray(),).toEqual(['a', 'b',],),)
            test("(null, null, 1)", () => expect(ABCD_INSTANCE().slice(null, null, 1,).toArray(),).toEqual(['a',],),)
            test("(null, null, -3)", () => expect(ABCD_INSTANCE().slice(null, null, -3,).toArray(),).toEqual(['a',],),)
            test("(null, null, 2)", () => expect(ABCD_INSTANCE().slice(null, null, 2,).toArray(),).toEqual(['a', 'b',],),)

            test("(2, 1)", () => expect(() => ABCD_INSTANCE().slice(2, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(1, null, 4)", () => expect(() => ABCD_INSTANCE().slice(1, null, 4,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(null, 1, 4)", () => expect(() => ABCD_INSTANCE().slice(null, 1, 4,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(10)", () => expect(() => ABCD_INSTANCE().slice(10, null,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(null, 10)", () => expect(() => ABCD_INSTANCE().slice(null, 10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(null, null, 10)", () => expect(() => ABCD_INSTANCE().slice(null, null, 10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(-10)", () => expect(() => ABCD_INSTANCE().slice(-10, null,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(null, -10)", () => expect(() => ABCD_INSTANCE().slice(null, -10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            test("(null, null, -10)", () => expect(() => ABCD_INSTANCE().slice(null, null, -10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        },)
    },)
    describe("map", () => {
        describe("map", () => {
            test("() => {}", () => expect(ABCD_INSTANCE().map(() => {},).toArray(),).toEqual([undefined, undefined, undefined, undefined,],),)
            test("undefined", () => expect(ABCD_INSTANCE().map(() => undefined,).toArray(),).toEqual([undefined, undefined, undefined, undefined,],),)
            test("null", () => expect(ABCD_INSTANCE().map(() => null,).toArray(),).toEqual([null, null, null, null,],),)

            test("value 'a' only", () => expect(ABCD_INSTANCE().map(it => it === 'a' ? it : null,).toArray(),).toEqual(['a', null, null, null,],),)
            test("value 'b' only", () => expect(ABCD_INSTANCE().map(it => it === 'b' ? it : null,).toArray(),).toEqual([null, 'b', null, null,],),)
            test("value 'c' only", () => expect(ABCD_INSTANCE().map(it => it === 'c' ? it : null,).toArray(),).toEqual([null, null, 'c', null,],),)
            test("value 'd' only", () => expect(ABCD_INSTANCE().map(it => it === 'd' ? it : null,).toArray(),).toEqual([null, null, null, 'd',],),)
            test("index 0 only", () => expect(ABCD_INSTANCE().map((value, index,) => index === 0 ? value : null,).toArray(),).toEqual(['a', null, null, null,],),)
            test("index 1 only", () => expect(ABCD_INSTANCE().map((value, index,) => index === 1 ? value : null,).toArray(),).toEqual([null, 'b', null, null,],),)
            test("index 2 only", () => expect(ABCD_INSTANCE().map((value, index,) => index === 2 ? value : null,).toArray(),).toEqual([null, null, 'c', null,],),)
            test("index 3 only", () => expect(ABCD_INSTANCE().map((value, index,) => index === 3 ? value : null,).toArray(),).toEqual([null, null, null, 'd',],),)

            test("NaN", () => expect(ABCD_INSTANCE().map(() => NaN,).toArray(),).toEqual([NaN, NaN, NaN, NaN,],),)
            test("value", () => expect(ABCD_INSTANCE().map(it => it,).toArray(),).toEqual(['a', 'b', 'c', 'd',],),)
            test("index", () => expect(ABCD_INSTANCE().map((_, it,) => it,).toArray(),).toEqual([0, 1, 2, 3,],),)
        },)
        describe("mapIndexed", () => {
            test("() => {}", () => expect(ABCD_INSTANCE().mapIndexed(() => {},).toArray(),).toEqual([undefined, undefined, undefined, undefined,],),)
            test("undefined", () => expect(ABCD_INSTANCE().mapIndexed(() => undefined,).toArray(),).toEqual([undefined, undefined, undefined, undefined,],),)
            test("null", () => expect(ABCD_INSTANCE().mapIndexed(() => null,).toArray(),).toEqual([null, null, null, null,],),)

            test("value 'a' only", () => expect(ABCD_INSTANCE().mapIndexed((_, it) => it === 'a' ? it : null,).toArray(),).toEqual(['a', null, null, null,],),)
            test("value 'b' only", () => expect(ABCD_INSTANCE().mapIndexed((_, it) => it === 'b' ? it : null,).toArray(),).toEqual([null, 'b', null, null,],),)
            test("value 'c' only", () => expect(ABCD_INSTANCE().mapIndexed((_, it) => it === 'c' ? it : null,).toArray(),).toEqual([null, null, 'c', null,],),)
            test("value 'd' only", () => expect(ABCD_INSTANCE().mapIndexed((_, it) => it === 'd' ? it : null,).toArray(),).toEqual([null, null, null, 'd',],),)
            test("index 0 only", () => expect(ABCD_INSTANCE().mapIndexed((index, value,) => index === 0 ? value : null,).toArray(),).toEqual(['a', null, null, null,],),)
            test("index 1 only", () => expect(ABCD_INSTANCE().mapIndexed((index, value,) => index === 1 ? value : null,).toArray(),).toEqual([null, 'b', null, null,],),)
            test("index 2 only", () => expect(ABCD_INSTANCE().mapIndexed((index, value,) => index === 2 ? value : null,).toArray(),).toEqual([null, null, 'c', null,],),)
            test("index 3 only", () => expect(ABCD_INSTANCE().mapIndexed((index, value,) => index === 3 ? value : null,).toArray(),).toEqual([null, null, null, 'd',],),)

            test("NaN", () => expect(ABCD_INSTANCE().mapIndexed(() => NaN,).toArray(),).toEqual([NaN, NaN, NaN, NaN,],),)
            test("value", () => expect(ABCD_INSTANCE().mapIndexed((_, it,) => it,).toArray(),).toEqual(['a', 'b', 'c', 'd',],),)
            test("index", () => expect(ABCD_INSTANCE().mapIndexed(it => it,).toArray(),).toEqual([0, 1, 2, 3,],),)
        },)
        describe("mapNotNull", () => {
            test("() => {}", () => expect(ABCD_INSTANCE().mapNotNull(() => {},).toArray(),).toEqual([],),)
            test("undefined", () => expect(ABCD_INSTANCE().mapNotNull(() => undefined,).toArray(),).toEqual([],),)
            test("null", () => expect(ABCD_INSTANCE().mapNotNull(() => null,).toArray(),).toEqual([],),)

            test("value 'a' only", () => expect(ABCD_INSTANCE().mapNotNull(it => it === 'a' ? it : null,).toArray(),).toEqual(['a',],),)
            test("value 'b' only", () => expect(ABCD_INSTANCE().mapNotNull(it => it === 'b' ? it : null,).toArray(),).toEqual(['b',],),)
            test("value 'c' only", () => expect(ABCD_INSTANCE().mapNotNull(it => it === 'c' ? it : null,).toArray(),).toEqual(['c',],),)
            test("value 'd' only", () => expect(ABCD_INSTANCE().mapNotNull(it => it === 'd' ? it : null,).toArray(),).toEqual(['d',],),)
            test("index 0 only", () => expect(ABCD_INSTANCE().mapNotNull((value, index,) => index === 0 ? value : null,).toArray(),).toEqual(['a',],),)
            test("index 1 only", () => expect(ABCD_INSTANCE().mapNotNull((value, index,) => index === 1 ? value : null,).toArray(),).toEqual(['b',],),)
            test("index 2 only", () => expect(ABCD_INSTANCE().mapNotNull((value, index,) => index === 2 ? value : null,).toArray(),).toEqual(['c',],),)
            test("index 3 only", () => expect(ABCD_INSTANCE().mapNotNull((value, index,) => index === 3 ? value : null,).toArray(),).toEqual(['d',],),)

            test("NaN", () => expect(ABCD_INSTANCE().mapNotNull(() => NaN,).toArray(),).toEqual([NaN, NaN, NaN, NaN,],),)
            test("value", () => expect(ABCD_INSTANCE().mapNotNull(it => it,).toArray(),).toEqual(['a', 'b', 'c', 'd',],),)
            test("index", () => expect(ABCD_INSTANCE().mapNotNull((_, it,) => it,).toArray(),).toEqual([0, 1, 2, 3,],),)
        },)
        describe("mapNotNullIndexed", () => {
            test("() => {}", () => expect(ABCD_INSTANCE().mapNotNullIndexed(() => {},).toArray(),).toEqual([],),)
            test("undefined", () => expect(ABCD_INSTANCE().mapNotNullIndexed(() => undefined,).toArray(),).toEqual([],),)
            test("null", () => expect(ABCD_INSTANCE().mapNotNullIndexed(() => null,).toArray(),).toEqual([],),)

            test("value 'a' only", () => expect(ABCD_INSTANCE().mapNotNullIndexed((_, it,) => it === 'a' ? it : null,).toArray(),).toEqual(['a',],),)
            test("value 'b' only", () => expect(ABCD_INSTANCE().mapNotNullIndexed((_, it,) => it === 'b' ? it : null,).toArray(),).toEqual(['b',],),)
            test("value 'c' only", () => expect(ABCD_INSTANCE().mapNotNullIndexed((_, it,) => it === 'c' ? it : null,).toArray(),).toEqual(['c',],),)
            test("value 'd' only", () => expect(ABCD_INSTANCE().mapNotNullIndexed((_, it,) => it === 'd' ? it : null,).toArray(),).toEqual(['d',],),)
            test("index 0 only", () => expect(ABCD_INSTANCE().mapNotNullIndexed((index, value,) => index === 0 ? value : null,).toArray(),).toEqual(['a',],),)
            test("index 1 only", () => expect(ABCD_INSTANCE().mapNotNullIndexed((index, value,) => index === 1 ? value : null,).toArray(),).toEqual(['b',],),)
            test("index 2 only", () => expect(ABCD_INSTANCE().mapNotNullIndexed((index, value,) => index === 2 ? value : null,).toArray(),).toEqual(['c',],),)
            test("index 3 only", () => expect(ABCD_INSTANCE().mapNotNullIndexed((index, value,) => index === 3 ? value : null,).toArray(),).toEqual(['d',],),)

            test("NaN", () => expect(ABCD_INSTANCE().mapNotNullIndexed(() => NaN,).toArray(),).toEqual([NaN, NaN, NaN, NaN,],),)
            test("value", () => expect(ABCD_INSTANCE().mapNotNullIndexed((_, it,) => it,).toArray(),).toEqual(['a', 'b', 'c', 'd',],),)
            test("index", () => expect(ABCD_INSTANCE().mapNotNullIndexed(it => it,).toArray(),).toEqual([0, 1, 2, 3,],),)
        },)
    },)
    describe("toReverse", () => {
        test("no arguments", () => expect(ABCDEFGHIJ_INSTANCE().toReversed().toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
        describe("from index", () => {
            test("-10", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-10,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test("-9", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-9,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b',],),)
            test("-8", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-8,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
            test("-7", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-7,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd',],),)
            test("-6", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-6,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e',],),)
            test("-5", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-5,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f',],),)
            test("-4", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-4,).toArray(),).toEqual(['j', 'i', 'h', 'g',],),)
            test("-3", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-3,).toArray(),).toEqual(['j', 'i', 'h',],),)
            test("-2", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-2,).toArray(),).toEqual(['j', 'i',],),)
            test("-1", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-1,).toArray(),).toEqual(['j',],),)
            test('0', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(0,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test('1', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(1,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b',],),)
            test('2', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(2,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
            test('3', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(3,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd',],),)
            test('4', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(4,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e',],),)
            test('5', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(5,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f',],),)
            test('6', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(6,).toArray(),).toEqual(['j', 'i', 'h', 'g',],),)
            test('7', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(7,).toArray(),).toEqual(['j', 'i', 'h',],),)
            test('8', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(8,).toArray(),).toEqual(['j', 'i',],),)
            test('9', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(9,).toArray(),).toEqual(['j',],),)
        },)
        describe("to index", () => {
            test("-10", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, -10,).toArray(),).toEqual(['a',],),)
            test("-9", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, -9,).toArray(),).toEqual(['b', 'a',],),)
            test("-8", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, -8,).toArray(),).toEqual(['c', 'b', 'a',],),)
            test("-7", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, -7,).toArray(),).toEqual(['d', 'c', 'b', 'a',],),)
            test("-6", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, -6,).toArray(),).toEqual(['e', 'd', 'c', 'b', 'a',],),)
            test("-5", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, -5,).toArray(),).toEqual(['f', 'e', 'd', 'c', 'b', 'a',],),)
            test("-4", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, -4,).toArray(),).toEqual(['g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test("-3", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, -3,).toArray(),).toEqual(['h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test("-2", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, -2,).toArray(),).toEqual(['i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test("-1", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, -1,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test('0', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, 0,).toArray(),).toEqual(['a',],),)
            test('1', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, 1,).toArray(),).toEqual(['b', 'a',],),)
            test('2', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, 2,).toArray(),).toEqual(['c', 'b', 'a',],),)
            test('3', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, 3,).toArray(),).toEqual(['d', 'c', 'b', 'a',],),)
            test('4', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, 4,).toArray(),).toEqual(['e', 'd', 'c', 'b', 'a',],),)
            test('5', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, 5,).toArray(),).toEqual(['f', 'e', 'd', 'c', 'b', 'a',],),)
            test('6', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, 6,).toArray(),).toEqual(['g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test('7', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, 7,).toArray(),).toEqual(['h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test('8', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, 8,).toArray(),).toEqual(['i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
            test('9', () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, 9,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
        },)
        describe("mixed from/to index", () => {
            test("(2, 2)", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(2, 2,).toArray(),).toEqual(['c',],),)
            test("(2, 3)", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(2, 3,).toArray(),).toEqual(['d', 'c',],),)
            test("(2, 4)", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(2, 4,).toArray(),).toEqual(['e', 'd', 'c',],),)
            test("(2, 5)", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(2, 5,).toArray(),).toEqual(['f', 'e', 'd', 'c',],),)
            test("(2, 6)", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(2, 6,).toArray(),).toEqual(['g', 'f', 'e', 'd', 'c',],),)
            test("(2, 7)", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(2, 7,).toArray(),).toEqual(['h', 'g', 'f', 'e', 'd', 'c',],),)
            test("(2, 8)", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(2, 8,).toArray(),).toEqual(['i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
            test("(2, 9)", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(2, 9,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)

            test("(-8, -1)", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-8, -1,).toArray(),).toEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
            test("(-8, -2)", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-8, -2,).toArray(),).toEqual(['i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
            test("(-8, -3)", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-8, -3,).toArray(),).toEqual(['h', 'g', 'f', 'e', 'd', 'c',],),)
            test("(-8, -4)", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-8, -4,).toArray(),).toEqual(['g', 'f', 'e', 'd', 'c',],),)
            test("(-8, -5)", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-8, -5,).toArray(),).toEqual(['f', 'e', 'd', 'c',],),)
            test("(-8, -6)", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-8, -6,).toArray(),).toEqual(['e', 'd', 'c',],),)
            test("(-8, -7)", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-8, -7,).toArray(),).toEqual(['d', 'c',],),)
            test("(-8, -8)", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-8, -8,).toArray(),).toEqual(['c',],),)
        },)
        describe("error", () => {
            describe("from > to", () => {
                test("(0, 1)", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(0, 1,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(1, 1)", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(1, 1,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(2, 1)", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(2, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(3, 1)", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(3, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(4, 1)", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(4, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(5, 1)", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(5, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(6, 1)", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(6, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(7, 1)", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(7, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(8, 1)", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(8, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("(9, 1)", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(9, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            },)
            describe("from index", () => {
                test('9', () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("10", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("11", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-9", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(-9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-10", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(-10,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-11", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(-11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("400", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-400", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(-400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            },)
            describe("to index", () => {
                test('9', () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, 9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("10", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, 10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("11", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, 11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-9", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, -9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-10", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, -10,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-11", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, -11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("400", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, 400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-400", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, -400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            },)
            describe("limit", () => {
                test('9', () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, null, 9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("10", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, null, 10,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("11", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, null, 11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("-9", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, null, -9,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-10", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, null, -10,).toString(),).not.toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-11", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, null, -11,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

                test("400", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, null, 400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("-400", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, null, -400,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            },)
        },)
    },)
    describe("Symbol.iterator", () => {
        const iterator = AB_INSTANCE()[Symbol.iterator]()
        test("1st: a", () => expect(iterator.next().value,).toBe('a',),)
        test("2nd: b", () => expect(iterator.next().value,).toBe('b',),)
        test("3rd: done", () => expect(iterator.next().done,).toBe(true,),)
    },)
    describe("conversion", () => {
        describe("to array", () => {
            test("basic", () => expect(AB_INSTANCE().toArray(),).toEqual(['a', 'b',],),)
            test("frozen", () => expect(AB_INSTANCE().toArray(),).toBeFrozen(),)
            test("size", () => expect(AB_INSTANCE().toArray(),).toHaveLength(2,),)
        })
        describe("to mutable array", () => {
            test("basic", () => expect(AB_INSTANCE().toMutableArray(),).toEqual(['a', 'b',],),)
            test("frozen", () => expect(AB_INSTANCE().toMutableArray(),).not.toBeFrozen(),)
            test("size", () => expect(AB_INSTANCE().toMutableArray(),).toHaveLength(2,),)
        })
        describe("to set", () => {
            test("basic", () => expect(AB_INSTANCE().toSet(),).toEqual(new Set(['a', 'b',],),),)
            test("frozen", () => expect(AB_INSTANCE().toSet(),).toBeFrozen(),)
            test("size", () => expect(AB_INSTANCE().toSet().size,).toBe(2,),)
        })
        describe("to mutable set", () => {
            test("basic", () => expect(AB_INSTANCE().toMutableSet(),).toEqual(new Set(['a', 'b',],),),)
            test("frozen", () => expect(AB_INSTANCE().toMutableSet(),).not.toBeFrozen(),)
            test("size", () => expect(AB_INSTANCE().toMutableSet().size,).toBe(2,),)
        })
        describe("to weak set", () => {
            test("basic", () => expect(AB_OBJECT_INSTANCE().toWeakSet(),).toEqual(new WeakSet([SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,],),),)
            test("frozen", () => expect(AB_INSTANCE().toWeakSet(),).toBeFrozen(),)
        })
        describe("to mutable weak set", () => {
            test("basic", () => expect(AB_OBJECT_INSTANCE().toMutableWeakSet(),).toEqual(new WeakSet([SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,],),),)
            test("frozen", () => expect(AB_INSTANCE().toMutableWeakSet(),).not.toBeFrozen(),)
        })
        describe("to map", () => {
            test("basic", () => expect(AB_INSTANCE().toMap(),).toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
            test("frozen", () => expect(AB_INSTANCE().toMap(),).toBeFrozen(),)
            test("size", () => expect(AB_INSTANCE().toMap().size,).toBe(2,),)
        })
        describe("to mutable map", () => {
            test("basic", () => expect(AB_INSTANCE().toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
            test("frozen", () => expect(AB_INSTANCE().toMutableMap(),).not.toBeFrozen(),)
            test("size", () => expect(AB_INSTANCE().toMutableMap().size,).toBe(2,),)
        })
    },)
},) },) },)
