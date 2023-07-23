/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import {A, A_NULL_B_UNDEFINED, AB, AB12, AB_OBJECT, AB_AB, ABCD, ABCD_ABCD, ABCD_NULL, ABCD_UNDEFINED, ABCDEFGHIJ, EMPTY, NULL_ABCD, SINGULAR_A_OBJECT, SINGULAR_B_OBJECT, UNDEFINED_ABCD} from "./constantCollections"
import {iterableCreation, everyInstances, nonPresentItem, sizeValues, TEMPLATE_ITEMS}                                                                                                      from "./constantValues"
import {newCollectionInstance}                                                                                                                                                             from "./newCollectionInstance"

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

    describe("size", () => { describe.each(sizeValues(),)("%s", ({value: {array, size,},},) => {
        const newInstance = () => newCollectionInstance(instance, arrayOrSetCreation, array,)
        test("size", () => expect(newInstance().size,).toStrictEqual(size,),)
        test("length", () => expect(newInstance().length,).toStrictEqual(size,),)
        test("count", () => expect(newInstance().count,).toStrictEqual(size,),)
        test("isEmpty", () => expect(newInstance().isEmpty,).toBe(size == 0,),)
        test("isNotEmpty", () => expect(newInstance().isNotEmpty,).toBe(size != 0,),)
    },) },)
    describe("value", () => {
        describe("get / at", () => {
            describe("simple", () => {
                describe("[](0)", () => {
                    test("index", () => expect(EMPTY_INSTANCE()[0],).toBeUndefined(),)
                    test("get", () => expect(() => EMPTY_INSTANCE().get(0,),).toThrow(ReferenceError,),)
                    test("at", () => expect(() => EMPTY_INSTANCE().at(0,),).toThrow(ReferenceError,),)
                },)
                describe("[a,b](0)", () => {
                    test.skip("index", () => expect(AB_INSTANCE()[0],).toEqual('a',),)
                    test("get", () => expect(AB_INSTANCE().get(0,),).toEqual('a',),)
                    test("at", () => expect(AB_INSTANCE().at(0,),).toEqual('a',),)
                },)
                describe("[a,b](3)", () => {
                    test.skip("index", () => expect(AB_INSTANCE()[3],).toBeUndefined(),)
                    test("get", () => expect(() => AB_INSTANCE().get(3,),).toThrow(ReferenceError,),)
                    test("at", () => expect(() => AB_INSTANCE().at(3,),).toThrow(ReferenceError,),)
                },)
                describe("[a,b,c,d](1)", () => {
                    test.skip("index", () => expect(ABCD_INSTANCE()[1],).toEqual('b',),)
                    test("get", () => expect(ABCD_INSTANCE().get(1,),).toEqual('b',),)
                    test("at", () => expect(ABCD_INSTANCE().at(1,),).toEqual('b',),)
                },)
                describe("[a,b,c,d](-1)", () => {
                    test("index", () => expect(ABCD_INSTANCE()[-1],).toBeUndefined(),)
                    test("get", () => expect(ABCD_INSTANCE().get(-1,),).toEqual('d',),)
                    test("at", () => expect(ABCD_INSTANCE().at(-1,),).toEqual('d',),)
                },)
                describe("[a,b,c,d](-4)", () => {
                    test("index", () => expect(ABCD_INSTANCE()[-4],).toBeUndefined(),)
                    test("get", () => expect(ABCD_INSTANCE().get(-4,),).toEqual('a',),)
                    test("at", () => expect(ABCD_INSTANCE().at(-4,),).toEqual('a',),)
                },)
                describe("[a,b,c,d](-5)", () => {
                    test("index", () => expect(ABCD_INSTANCE()[-5],).toBeUndefined(),)
                    test("get", () => expect(() => ABCD_INSTANCE().get(-5,),).toThrow(ReferenceError,),)
                    test("at", () => expect(() => ABCD_INSTANCE().at(-5,),).toThrow(ReferenceError,),)
                },)
            },)
            describe("or else", () => {
                const value = Infinity,
                    callback = () => Infinity

                describe("[].orElse(0, () => ∞)", () => {
                    test("get", () => expect(EMPTY_INSTANCE().getOrElse(0, callback,),).toEqual(value,),)
                    test("at", () => expect(EMPTY_INSTANCE().atOrElse(0, callback,),).toEqual(value,),)
                },)
                describe("[a,b].orElse(0, () => ∞)", () => {
                    test("get", () => expect(AB_INSTANCE().getOrElse(0, callback,),).toEqual('a',),)
                    test("at", () => expect(AB_INSTANCE().atOrElse(0, callback,),).toEqual('a',),)
                },)
                describe("[a,b].orElse(3, () => ∞)", () => {
                    test("get", () => expect(AB_INSTANCE().getOrElse(3, callback,),).toEqual(value,),)
                    test("at", () => expect(AB_INSTANCE().atOrElse(3, callback,),).toEqual(value,),)
                },)
                describe("[a,b,c,d].orElse(1, () => ∞)", () => {
                    test("get", () => expect(ABCD_INSTANCE().getOrElse(1, callback,),).toEqual('b',),)
                    test("at", () => expect(ABCD_INSTANCE().atOrElse(1, callback,),).toEqual('b',),)
                },)
                describe("[a,b,c,d].orElse(-1, () => ∞)", () => {
                    test("get", () => expect(ABCD_INSTANCE().getOrElse(-1, callback,),).toEqual('d',),)
                    test("at", () => expect(ABCD_INSTANCE().atOrElse(-1, callback,),).toEqual('d',),)
                },)
                describe("[a,b,c,d].orElse(-5, () => ∞)", () => {
                    test("get", () => expect(ABCD_INSTANCE().getOrElse(-5, callback,),).toEqual(value,),)
                    test("at", () => expect(ABCD_INSTANCE().atOrElse(-5, callback,),).toEqual(value,),)
                },)
            },)
            describe("or null", () => {
                describe("[].orNull(0)", () => {
                    test("get", () => expect(EMPTY_INSTANCE().getOrNull(0,),).toBeNull(),)
                    test("at", () => expect(EMPTY_INSTANCE().atOrNull(0,),).toBeNull(),)
                },)
                describe("[a,b].orNull(0)", () => {
                    test("get", () => expect(AB_INSTANCE().getOrNull(0,),).toEqual('a',),)
                    test("at", () => expect(AB_INSTANCE().atOrNull(0,),).toEqual('a',),)
                },)
                describe("[a,b].orNull(3)", () => {
                    test("get", () => expect(AB_INSTANCE().getOrNull(3,),).toBeNull(),)
                    test("at", () => expect(AB_INSTANCE().atOrNull(3,),).toBeNull(),)
                },)
                describe("[a,b,c,d].orNull(1)", () => {
                    test("get", () => expect(ABCD_INSTANCE().getOrNull(1,),).toEqual('b',),)
                    test("at", () => expect(ABCD_INSTANCE().atOrNull(1,),).toEqual('b',),)
                },)
                describe("[a,b,c,d].orNull(-1)", () => {
                    test("get", () => expect(ABCD_INSTANCE().getOrNull(-1,),).toEqual('d',),)
                    test("at", () => expect(ABCD_INSTANCE().atOrNull(-1,),).toEqual('d',),)
                },)
                describe("[a,b,c,d].orNull(-5)", () => {
                    test("get", () => expect(ABCD_INSTANCE().getOrNull(-5,),).toBeNull(),)
                    test("at", () => expect(ABCD_INSTANCE().atOrNull(-5,),).toBeNull(),)
                },)
            },)
        },)
        describe("index of", () => {
            describe("index of", () => {
                test("[].(a) == null", () => expect(EMPTY_INSTANCE().indexOf('a',),).toBeNull(),)

                test("[a,b].(a) == 0", () => expect(AB_INSTANCE().indexOf('a',),).toBe(0,),)
                test("[a,b].(b) == 1", () => expect(AB_INSTANCE().indexOf('b',),).toBe(1,),)
                test("[a,b].(c) == null", () => expect(AB_INSTANCE().indexOf('c',),).toBeNull(),)

                test("[a,b,c,d].(a,2) == null", () => expect(ABCD_INSTANCE().indexOf('a', 2,),).toBeNull(),)
                test("[a,b,c,d].(b,2) == null", () => expect(ABCD_INSTANCE().indexOf('b', 2,),).toBeNull(),)
                test("[a,b,c,d].(c,2) == 2", () => expect(ABCD_INSTANCE().indexOf('c', 2,),).toBe(2,),)
                test("[a,b,c,d].(d,2) == 3", () => expect(ABCD_INSTANCE().indexOf('d', 2,),).toBe(3,),)

                test("[a,b,c,d].(a,null,2) == 0", () => expect(ABCD_INSTANCE().indexOf('a', null, 2,),).toBe(0,),)
                test("[a,b,c,d].(b,null,2) == 1", () => expect(ABCD_INSTANCE().indexOf('b', null, 2,),).toBe(1,),)
                test("[a,b,c,d].(c,null,2) == null", () => expect(ABCD_INSTANCE().indexOf('c', null, 2,),).toBeNull(),)
                test("[a,b,c,d].(d,null,2) == null", () => expect(ABCD_INSTANCE().indexOf('d', null, 2,),).toBeNull(),)


                test("[a,b,A,B].(a) == 0", () => expect(AB_AB_INSTANCE().indexOf('a',),).toBe(0,),)
                test("[a,b,A,B].(b) == 1", () => expect(AB_AB_INSTANCE().indexOf('b',),).toBe(1,),)
                test("[a,b,A,B].(A) == 2", () => expect(AB_AB_INSTANCE().indexOf('A',),).toBe(2,),)
                test("[a,b,A,B].(B) == 3", () => expect(AB_AB_INSTANCE().indexOf('B',),).toBe(3,),)

                test("[a,b,A,B].(a,2) == null", () => expect(AB_AB_INSTANCE().indexOf('a', 2,),).toBeNull(),)
                test("[a,b,A,B].(b,2) == null", () => expect(AB_AB_INSTANCE().indexOf('b', 2,),).toBeNull(),)
                test("[a,b,A,B].(A,2) == 3", () => expect(AB_AB_INSTANCE().indexOf('A', 2,),).toBe(2,),)
                test("[a,b,A,B].(B,2) == 3", () => expect(AB_AB_INSTANCE().indexOf('B', 2,),).toBe(3,),)

                test("[a,b,A,B].(a,null,2) == 0", () => expect(ABCD_INSTANCE().indexOf('a', null, 2,),).toBe(0,),)
                test("[a,b,A,B].(b,null,2) == 1", () => expect(ABCD_INSTANCE().indexOf('b', null, 2,),).toBe(1,),)
                test("[a,b,A,B].(A,null,2) == null", () => expect(ABCD_INSTANCE().indexOf('A', null, 2,),).toBeNull(),)
                test("[a,b,A,B].(B,null,2) == null", () => expect(ABCD_INSTANCE().indexOf('B', null, 2,),).toBeNull(),)


                test("[a,b].(a,500) → Error", () => expect(() => AB_INSTANCE().indexOf('a', 500,),).toThrow(RangeError,),)
                test("[a,b].(a,-500) → Error", () => expect(() => AB_INSTANCE().indexOf('a', -500,),).toThrow(RangeError,),)
                test("[a,b].(a,null,500) → Error", () => expect(() => AB_INSTANCE().indexOf('a', null, 500,),).toThrow(RangeError,),)
                test("[a,b].(a,null,-500) → Error", () => expect(() => AB_INSTANCE().indexOf('a', null, -500,),).toThrow(RangeError,),)
                test("[a,b,c,d].(a,-2) == null", () => expect(ABCD_INSTANCE().indexOf('a', -2,),).toBeNull(),)
                test("[a,b,c,d].(a,null,-2) == 0", () => expect(ABCD_INSTANCE().indexOf('a', null, -2,),).toBe(0,),)
            },)
            describe("last index of", () => {
                test("[].(a) == null", () => expect(EMPTY_INSTANCE().lastIndexOf('a',),).toBeNull(),)

                test("[a,b].(a) == 0", () => expect(AB_INSTANCE().lastIndexOf('a',),).toBe(0,),)
                test("[a,b].(b) == 1", () => expect(AB_INSTANCE().lastIndexOf('b',),).toBe(1,),)
                test("[a,b].(c) == null", () => expect(AB_INSTANCE().lastIndexOf('c',),).toBeNull(),)

                test("[a,b,c,d].(a,2) == null", () => expect(ABCD_INSTANCE().lastIndexOf('a', 2,),).toBeNull(),)
                test("[a,b,c,d].(b,2) == null", () => expect(ABCD_INSTANCE().lastIndexOf('b', 2,),).toBeNull(),)
                test("[a,b,c,d].(c,2) == 2", () => expect(ABCD_INSTANCE().lastIndexOf('c', 2,),).toBe(2,),)
                test("[a,b,c,d].(d,2) == 3", () => expect(ABCD_INSTANCE().lastIndexOf('d', 2,),).toBe(3,),)

                test("[a,b,c,d].(a,null,2) == 0", () => expect(ABCD_INSTANCE().lastIndexOf('a', null, 2,),).toBe(0,),)
                test("[a,b,c,d].(b,null,2) == 1", () => expect(ABCD_INSTANCE().lastIndexOf('b', null, 2,),).toBe(1,),)
                test("[a,b,c,d].(c,null,2) == null", () => expect(ABCD_INSTANCE().lastIndexOf('c', null, 2,),).toBeNull(),)
                test("[a,b,c,d].(d,null,2) == null", () => expect(ABCD_INSTANCE().lastIndexOf('d', null, 2,),).toBeNull(),)


                test("[a,b,A,B].(a) == 0", () => expect(AB_AB_INSTANCE().lastIndexOf('a',),).toBe(0,),)
                test("[a,b,A,B].(b) == 1", () => expect(AB_AB_INSTANCE().lastIndexOf('b',),).toBe(1,),)
                test("[a,b,A,B].(A) == 2", () => expect(AB_AB_INSTANCE().lastIndexOf('A',),).toBe(2,),)
                test("[a,b,A,B].(B) == 3", () => expect(AB_AB_INSTANCE().lastIndexOf('B',),).toBe(3,),)

                test("[a,b,A,B].(a,2) == null", () => expect(AB_AB_INSTANCE().lastIndexOf('a', 2,),).toBeNull(),)
                test("[a,b,A,B].(b,2) == null", () => expect(AB_AB_INSTANCE().lastIndexOf('b', 2,),).toBeNull(),)
                test("[a,b,A,B].(A,2) == 2", () => expect(AB_AB_INSTANCE().lastIndexOf('A', 2,),).toBe(2,),)
                test("[a,b,A,B].(B,2) == 3", () => expect(AB_AB_INSTANCE().lastIndexOf('B', 2,),).toBe(3,),)

                test("[a,b,a,b].(a,null,2) == 0", () => expect(AB_AB_INSTANCE().lastIndexOf('a', null, 2,),).toBe(0,),)
                test("[a,b,a,b].(b,null,2) == 1", () => expect(AB_AB_INSTANCE().lastIndexOf('b', null, 2,),).toBe(1,),)
                test("[a,b,a,b].(A,null,2) == null", () => expect(AB_AB_INSTANCE().lastIndexOf('A', null, 2,),).toBeNull(),)
                test("[a,b,a,b].(B,null,2) == null", () => expect(AB_AB_INSTANCE().lastIndexOf('B', null, 2,),).toBeNull(),)


                test("[a,b].(a,500) → Error", () => expect(() => AB_INSTANCE().lastIndexOf('a', 500,),).toThrow(RangeError,),)
                test("[a,b].(a,-500) → Error", () => expect(() => AB_INSTANCE().lastIndexOf('a', -500,),).toThrow(RangeError,),)
                test("[a,b].(a,null,500) → Error", () => expect(() => AB_INSTANCE().lastIndexOf('a', null, 500,),).toThrow(RangeError,),)
                test("[a,b].(a,null,-500) → Error", () => expect(() => AB_INSTANCE().lastIndexOf('a', null, -500,),).toThrow(RangeError,),)
                test("[a,b,c,d].(a,-2) == null", () => expect(ABCD_INSTANCE().lastIndexOf('a', -2,),).toBeNull(),)
                test("[a,b,c,d].(a,null,-2) == 0", () => expect(ABCD_INSTANCE().lastIndexOf('a', null, -2,),).toBe(0,),)
            },)
        },)
        describe("first", () => {
            describe("[].first() == throw|null", () => {
                test("throw", () => expect(() => EMPTY_INSTANCE().first(),).toThrow(ReferenceError,),)
                test("or null", () => expect(EMPTY_INSTANCE().firstOrNull(),).toBeNull(),)
            },)

            test("[a,b,c,d].first() == a", () => expect(ABCD_INSTANCE().first(),).toBe('a',),)
            describe("[null,a,b,c,d].first() == throw|null", () => {
                test("throw", () => expect(() => NULL_ABCD_INSTANCE().first(),).toThrow(ReferenceError,),)
                test("or null", () => expect(NULL_ABCD_INSTANCE().firstOrNull(),).toBeNull(),)
            },)
            test("[a,b,c,d,null].first() == a", () => expect(ABCD_NULL_INSTANCE().first(),).toBe('a',),)
            describe("[undefined,a,b,c,d].first() == throw|null", () => {
                test("throw", () => expect(() => UNDEFINED_ABCD_INSTANCE().first(),).toThrow(ReferenceError,),)
                test("or null", () => expect(UNDEFINED_ABCD_INSTANCE().firstOrNull(),).toBeUndefined(),)
            },)
            test("[a,b,c,d,undefined].first() == a", () => expect(ABCD_UNDEFINED_INSTANCE().first(),).toBe('a',),)

            test("[a,b,c,d].first(!a) == b", () => expect(ABCD_INSTANCE().first(it => it !== 'a',),).toBe('b',),)
            describe("[null,a,b,c,d].first(!a) == throw|null", () => {
                test("throw", () => expect(() => NULL_ABCD_INSTANCE().first(it => it !== 'a',),).toThrow(ReferenceError,),)
                test("or null", () => expect(NULL_ABCD_INSTANCE().firstOrNull(it => it !== 'a',),).toBeNull(),)
            },)
            test("[a,b,c,d,null].first(!a) == b", () => expect(ABCD_NULL_INSTANCE().first(it => it !== 'a',),).toBe('b',),)
            describe("[undefined,a,b,c,d].first(!a) == throw|null", () => {
                test("throw", () => expect(() => UNDEFINED_ABCD_INSTANCE().first(it => it !== 'a',),).toThrow(ReferenceError,),)
                test("or null", () => expect(UNDEFINED_ABCD_INSTANCE().firstOrNull(it => it !== 'a',),).toBeUndefined(),)
            },)
            test("[a,b,c,d,undefined].first(!a) == b", () => expect(ABCD_UNDEFINED_INSTANCE().first(it => it !== 'a',),).toBe('b',),)
        },)
        describe("last", () => {
            describe("[]", () => {
                test("throw", () => expect(() => EMPTY_INSTANCE().last(),).toThrow(ReferenceError,),)
                test("or null", () => expect(EMPTY_INSTANCE().lastOrNull(),).toBeNull(),)
            },)

            test("[a,b,c,d].last() == d", () => expect(ABCD_INSTANCE().last(),).toBe('d',),)
            test("[null,a,b,c,d].last() == d", () => expect(NULL_ABCD_INSTANCE().last(),).toBe('d',),)
            describe("[a,b,c,d,null].last() == throw|null", () => {
                test("throw", () => expect(() => ABCD_NULL_INSTANCE().last(),).toThrow(ReferenceError,),)
                test("or null", () => expect(ABCD_NULL_INSTANCE().lastOrNull(),).toBeNull(),)
            },)
            test("[undefined,a,b,c,d].last() == d", () => expect(UNDEFINED_ABCD_INSTANCE().last(),).toBe('d',),)
            describe("[a,b,c,d,undefined].last() == throw|null", () => {
                test("throw", () => expect(() => ABCD_UNDEFINED_INSTANCE().last(),).toThrow(ReferenceError,),)
                test("or null", () => expect(ABCD_UNDEFINED_INSTANCE().lastOrNull(),).toBeUndefined(),)
            },)

            test("[a,b,c,d].last(!d) == c", () => expect(ABCD_INSTANCE().last(it => it !== 'd',),).toBe('c',),)
            test("[null,a,b,c,d].last(!d) == c", () => expect(NULL_ABCD_INSTANCE().last(it => it !== 'd',),).toBe('c',),)
            describe("[a,b,c,d,null].last(!d) == throw|null", () => {
                test("throw", () => expect(() => ABCD_NULL_INSTANCE().last(it => it !== 'd',),).toThrow(ReferenceError,),)
                test("or null", () => expect(ABCD_NULL_INSTANCE().lastOrNull(it => it !== 'd',),).toBeNull(),)
            },)
            test("[undefined,a,b,c,d].last(!d) == c", () => expect(UNDEFINED_ABCD_INSTANCE().last(it => it !== 'd',),).toBe('c',),)
            describe("[a,b,c,d,undefined].last(!d) == throw|null", () => {
                test("throw", () => expect(() => ABCD_UNDEFINED_INSTANCE().last(it => it !== 'd',),).toThrow(ReferenceError,),)
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
        test("[a,b].join(null, <)", () => expect(AB_INSTANCE().join(null, "<", null,),).toBe("<a, b]",),)
        test("[a,b].join(null, null, >)", () => expect(AB_INSTANCE().join(null, null, ">",),).toBe("[a, b>",),)
        test("[a,b].join(null, null, null, 1)", () => expect(AB_INSTANCE().join(null, null, null, 1,),).toBe("[a, …]",),)
        test("[a,b].join(null, null, null, null, \"...\")", () => expect(AB_INSTANCE().join(null, null, null, null, "...",),).toBe("[a, b]",),)
        test("[a,b].join(null, null, null, 1, \"...\")", () => expect(AB_INSTANCE().join(null, null, null, 1, "...",),).toBe("[a, ...]",),)
        test("[a,b].join(null, null, null, null, () => toUpperCase)", () => expect(AB_INSTANCE().join(null, null, null, null, null, it => it.toUpperCase(),),).toBe("[A, B]",),)
    },)
    describe("filter", () => {
        test("[a,b,c,d].filter(d) == [d]", () => expect(ABCD_INSTANCE().filter(it => it === 'd',).toArray(),).toStrictEqual(['d',],),)
        test("[a,b,c,d].filterIndexed(3) == [d]", () => expect(ABCD_INSTANCE().filterIndexed(it => it === 3,).toArray(),).toStrictEqual(['d',],),)
        test("[a,b,c,d].filterNot(d) == [a,b,c]", () => expect(ABCD_INSTANCE().filterNot(it => it === 'd',).toArray(),).toStrictEqual(['a', 'b', 'c',],),)
        test("[a,b,c,d].filterIndexedNot(3) == [a,b,c]", () => expect(ABCD_INSTANCE().filterIndexedNot(it => it === 3,).toArray(),).toStrictEqual(['a', 'b', 'c',],),)
        test("[a,b,1,2].filter(number) == [1,2]", () => expect(AB12_INSTANCE().filter(it => typeof it == "number",).toArray(),).toStrictEqual([1, 2,],),)
        test("[a,b,1,2].filterNot(number) == [a,b]", () => expect(AB12_INSTANCE().filterNot(it => typeof it == "number",).toArray(),).toStrictEqual(['a', 'b',],),)
    },)
    describe("filterNotNull", () => {
        test("[a,null,b,undefined].filterNotNull() == [a,b]", () => expect(A_NULL_B_UNDEFINED_INSTANCE().filterNotNull().toArray(),).toStrictEqual(['a', 'b',],),)
        test("[a,null,b,undefined].filterNotNull() != this", () => expect(A_NULL_B_UNDEFINED_INSTANCE().filterNotNull(),).not.toStrictEqual(A_NULL_B_UNDEFINED_INSTANCE(),),)
        test("[a,null,b,undefined].filterNot(null).filterNotNull() != this", () => expect(A_NULL_B_UNDEFINED_INSTANCE().filterNot(it => it === null).filterNotNull().toArray(),).not.toStrictEqual(['a', null, 'b', undefined,],),)
        test("[a,null,b,undefined].filterNot(undefined).filterNotNull() != this", () => expect(A_NULL_B_UNDEFINED_INSTANCE().filterNot(it => it === undefined).filterNotNull().toArray(),).not.toStrictEqual(['a', null, 'b', undefined,],),)
        test("[a,b].filterNotNull() == this", () => expect(AB_INSTANCE().filterNotNull().toArray(),).toStrictEqual(['a', 'b',],),)
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

        test("[a,b,c,d,A,B,C,D].findIndex(anyCase b) == 1", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'b',),).toBe(1,),)
        test("[a,b,c,d,A,B,C,D].findIndex(a) == 0", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'a',),).toBe(0,),)
        test("[a,b,c,d,A,B,C,D].findIndex(D) == 7", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it === 'D',),).toBe(7,),)
        test("[a,b,c,d,A,B,C,D].findIndex(anyCase e) == null", () => expect(ABCD_ABCD_INSTANCE().indexOfFirst(it => it.toLowerCase() === 'e',),).toBeNull(),)

        test("[a,b,c,d,A,B,C,D].findIndexIndexed(odd) == 1", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it % 2 === 1,),).toBe(1,),)
        test("[a,b,c,d,A,B,C,D].findIndexIndexed(0) == 0", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 0,),).toBe(0,),)
        test("[a,b,c,d,A,B,C,D].findIndexIndexed(7) == 7", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 7,),).toBe(7,),)
        test("[a,b,c,d,A,B,C,D].findIndexIndexed(26) == null", () => expect(ABCD_ABCD_INSTANCE().indexOfFirstIndexed(it => it === 26,),).toBeNull(),)

        test("[a,b,c,d,A,B,C,D].findLast(anyCase B) == B", () => expect(ABCD_ABCD_INSTANCE().findLast(it => it.toUpperCase() === 'B',),).toBe('B',),)
        test("[a,b,c,d,A,B,C,D].findLast(a) == a", () => expect(ABCD_ABCD_INSTANCE().findLast(it => it === 'a',),).toBe('a',),)
        test("[a,b,c,d,A,B,C,D].findLast(D) == D", () => expect(ABCD_ABCD_INSTANCE().findLast(it => it === 'D',),).toBe('D',),)
        test("[a,b,c,d,A,B,C,D].findLast(anyCase E) == null", () => expect(ABCD_ABCD_INSTANCE().findLast(it => it.toUpperCase() === 'E',),).toBeNull(),)

        test("[a,b,c,d,A,B,C,D].findLastIndexed(odd) == D", () => expect(ABCD_ABCD_INSTANCE().findLastIndexed(it => it % 2 === 1,),).toBe('D',),)
        test("[a,b,c,d,A,B,C,D].findLastIndexed(0) == a", () => expect(ABCD_ABCD_INSTANCE().findLastIndexed(it => it === 0,),).toBe('a',),)
        test("[a,b,c,d,A,B,C,D].findLastIndexed(7) == D", () => expect(ABCD_ABCD_INSTANCE().findLastIndexed(it => it === 7,),).toBe('D',),)
        test("[a,b,c,d,A,B,C,D].findLastIndexed(26) == null", () => expect(ABCD_ABCD_INSTANCE().findLastIndexed(it => it === 26,),).toBeNull(),)

        test("[a,b,c,d,A,B,C,D].findLastIndex(anyCase B) == 5", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'B',),).toBe(5,),)
        test("[a,b,c,d,A,B,C,D].findLastIndex(a) == 0", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'a',),).toBe(0,),)
        test("[a,b,c,d,A,B,C,D].findLastIndex(D) == 7", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it === 'D',),).toBe(7,),)
        test("[a,b,c,d,A,B,C,D].findLastIndex(anyCase E) == null", () => expect(ABCD_ABCD_INSTANCE().indexOfLast(it => it.toUpperCase() === 'E',),).toBeNull(),)

        test("[a,b,c,d,A,B,C,D].findLastIndexIndexed(odd) == 7", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it % 2 === 1,),).toBe(7,),)
        test("[a,b,c,d,A,B,C,D].findLastIndexIndexed(0) == 0", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 0,),).toBe(0,),)
        test("[a,b,c,d,A,B,C,D].findLastIndexIndexed(7) == 7", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 7,),).toBe(7,),)
        test("[a,b,c,d,A,B,C,D].findLastIndexIndexed(26) == null", () => expect(ABCD_ABCD_INSTANCE().indexOfLastIndexed(it => it === 26,),).toBeNull(),)
    },)
    describe("toReverse", () => {
        test("[a,b,c,d,e,f,g,h,i,j].() == [j,i,h,g,f,e,d,c,b,a]", () => expect(ABCDEFGHIJ_INSTANCE().toReversed().toArray(),).toStrictEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)

        test("[a,b,c,d,e,f,g,h,i,j].(2) == [j,i,h,g,f,e,d,c]", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(2,).toArray(),).toStrictEqual(['j', 'i', 'h', 'g', 'f', 'e', 'd', 'c',],),)
        test("[a,b,c,d,e,f,g,h,i,j].(null, 2) == [j,i]", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, 2,).toArray(),).toStrictEqual(['b', 'a',],),)
        test("[a,b,c,d,e,f,g,h,i,j].(2, 5) == [e,d,c]", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(2, 5,).toArray(),).toStrictEqual(['e', 'd', 'c',],),)

        test("[a,b,c,d,e,f,g,h,i,j].(-2) == [j,i]", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-2,).toArray(),).toStrictEqual(['j', 'i',],),)
        test("[a,b,c,d,e,f,g,h,i,j].(null, -2) == [h,g,f,e,d,c,b,a]", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(null, -2,).toArray(),).toStrictEqual(['h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',],),)
        test("[a,b,c,d,e,f,g,h,i,j].(-5, -2) == [g,f,e,d,c]", () => expect(ABCDEFGHIJ_INSTANCE().toReversed(-5, -2,).toArray(),).toStrictEqual(['h', 'g', 'f',],),)

        test("[a,b,c,d,e,f,g,h,i,j].(2, 1) => error", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(2, 1,).isEmpty,).toThrow(RangeError,),)

        test("[a,b,c,d,e,f,g,h,i,j].(400) => error", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(400,).isEmpty,).toThrow(RangeError,),)
        test("[a,b,c,d,e,f,g,h,i,j].(-400) => error", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(-400,).isEmpty,).toThrow(RangeError,),)
        test("[a,b,c,d,e,f,g,h,i,j].(null, 400) => error", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, 400,).isEmpty,).toThrow(RangeError,),)
        test("[a,b,c,d,e,f,g,h,i,j].(null, -400) => error", () => expect(() => ABCDEFGHIJ_INSTANCE().toReversed(null, -400,).isEmpty,).toThrow(RangeError,),)
    },)
    describe("iterator", () => {
        const iterator = AB_INSTANCE()[Symbol.iterator]()
        test("1st: a", () => expect(iterator.next().value,).toBe('a',),)
        test("2nd: b", () => expect(iterator.next().value,).toBe('b',),)
        test("3rd: done", () => expect(iterator.next().done,).toBe(true,),)
    },)
    describe("conversion", () => {
        describe("to array", () => {
            test("basic", () => expect(AB_INSTANCE().toArray(),).toStrictEqual(['a', 'b',],),)
            test("frozen", () => expect(AB_INSTANCE().toArray(),).toBeFrozen(),)
            test("size", () => expect(AB_INSTANCE().toArray(),).toHaveLength(2,),)
        })
        describe("to mutable array", () => {
            test("basic", () => expect(AB_INSTANCE().toMutableArray(),).toStrictEqual(['a', 'b',],),)
            test("frozen", () => expect(AB_INSTANCE().toMutableArray(),).not.toBeFrozen(),)
            test("size", () => expect(AB_INSTANCE().toMutableArray(),).toHaveLength(2,),)
        })
        describe("to set", () => {
            test("basic", () => expect(AB_INSTANCE().toSet(),).toStrictEqual(new Set(['a', 'b',],),),)
            test("frozen", () => expect(AB_INSTANCE().toSet(),).toBeFrozen(),)
            test("size", () => expect(AB_INSTANCE().toSet().size,).toBe(2,),)
        })
        describe("to mutable set", () => {
            test("basic", () => expect(AB_INSTANCE().toMutableSet(),).toStrictEqual(new Set(['a', 'b',],),),)
            test("frozen", () => expect(AB_INSTANCE().toMutableSet(),).not.toBeFrozen(),)
            test("size", () => expect(AB_INSTANCE().toMutableSet().size,).toBe(2,),)
        })
        describe("to weak set", () => {
            test("basic", () => expect(AB_OBJECT_INSTANCE().toWeakSet(),).toStrictEqual(new WeakSet([SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,],),),)
            test("frozen", () => expect(AB_INSTANCE().toWeakSet(),).toBeFrozen(),)
        })
        describe("to mutable weak set", () => {
            test("basic", () => expect(AB_OBJECT_INSTANCE().toMutableWeakSet(),).toStrictEqual(new WeakSet([SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,],),),)
            test("frozen", () => expect(AB_INSTANCE().toMutableWeakSet(),).not.toBeFrozen(),)
        })
        describe("to map", () => {
            test("basic", () => expect(AB_INSTANCE().toMap(),).toStrictEqual(new Map([[0, 'a',], [1, 'b',],],),),)
            test("frozen", () => expect(AB_INSTANCE().toMap(),).toBeFrozen(),)
            test("size", () => expect(AB_INSTANCE().toMap().size,).toBe(2,),)
        })
        describe("to mutable map", () => {
            test("basic", () => expect(AB_INSTANCE().toMutableMap(),).toStrictEqual(new Map([[0, 'a',], [1, 'b',],],),),)
            test("frozen", () => expect(AB_INSTANCE().toMutableMap(),).not.toBeFrozen(),)
            test("size", () => expect(AB_INSTANCE().toMutableMap().size,).toBe(2,),)
        })
    },)
},) },) },)
