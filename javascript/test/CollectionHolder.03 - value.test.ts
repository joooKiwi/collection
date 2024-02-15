/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, ABCD, ABCD_NULL, ABCD_UNDEFINED, EMPTY, NULL_ABCD, UNDEFINED_ABCD} from "./constantCollections"
import {everyCollectionInstance}                                               from "./constantValues"
import {GenericCollectionHolder_GetAlias}                                      from "./instance/GenericCollectionHolder_GetAlias"
import {GenericCollectionHolder_GetOrElseAlias}                                from "./instance/GenericCollectionHolder_GetOrElseAlias"
import {GenericCollectionHolder_GetOrNullAlias}                                from "./instance/GenericCollectionHolder_GetOrNullAlias"
import {LazyGenericCollectionHolder_GetAlias}                                  from "./instance/LazyGenericCollectionHolder_GetAlias"
import {LazyGenericCollectionHolder_GetOrElseAlias}                            from "./instance/LazyGenericCollectionHolder_GetOrElseAlias"
import {LazyGenericCollectionHolder_GetOrNullAlias}                            from "./instance/LazyGenericCollectionHolder_GetOrNullAlias"

import {CollectionHolderIndexOutOfBoundsException} from "../src/exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "../src/exception/EmptyCollectionHolderException"

describe("CollectionHolderTest (value)", () => {

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("at", () => {
                const instance = new GenericCollectionHolder_GetAlias()
                instance.at(5,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("atOrElse", () => {
                const instance = new GenericCollectionHolder_GetOrElseAlias()
                instance.atOrElse(NaN, () => null,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("atOrNull", () => {
                const instance = new GenericCollectionHolder_GetOrNullAlias()
                instance.atOrNull(NaN,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("elementAt", () => {
                const instance = new GenericCollectionHolder_GetAlias()
                instance.elementAt(5,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("elementAtOrElse", () => {
                const instance = new GenericCollectionHolder_GetOrElseAlias()
                instance.elementAtOrElse(NaN, () => null,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("elementAtOrNull", () => {
                const instance = new GenericCollectionHolder_GetOrNullAlias()
                instance.elementAtOrNull(NaN,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("at", () => {
                const instance = new LazyGenericCollectionHolder_GetAlias()
                instance.at(5,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("atOrElse", () => {
                const instance = new LazyGenericCollectionHolder_GetOrElseAlias()
                instance.atOrElse(NaN, () => null,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("atOrNull", () => {
                const instance = new LazyGenericCollectionHolder_GetOrNullAlias()
                instance.atOrNull(5,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("elementAt", () => {
                const instance = new LazyGenericCollectionHolder_GetAlias()
                instance.elementAt(5,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("elementAtOrElse", () => {
                const instance = new LazyGenericCollectionHolder_GetOrElseAlias()
                instance.elementAtOrElse(NaN, () => null,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("elementAtOrNull", () => {
                const instance = new LazyGenericCollectionHolder_GetOrNullAlias()
                instance.elementAtOrNull(NaN,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
    },)

    describe.each(everyCollectionInstance,)("%s", ({value: {isMinimalist, newInstance,},},) => {
        if (isMinimalist) {
            //README: Those tests are based on lower tests
            describe("get",           () => {
                test("[](0)",         () => expect(() => newInstance(EMPTY,).get(0,),).toThrow(EmptyCollectionHolderException,),)
                test("[a,b](0)",      () => expect(newInstance(AB,).get(0,),).toEqual('a',),)
                test("[a,b](3)",      () => expect(() => newInstance(AB,).get(3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("[a,b,c,d](1)",  () => expect(newInstance(ABCD,).get(1,),).toEqual('b',),)
                test("[a,b,c,d](-1)", () => expect(newInstance(ABCD,).get(-1,),).toEqual('d',),)
                test("[a,b,c,d](-4)", () => expect(newInstance(ABCD,).get(-4,),).toEqual('a',),)
                test("[a,b,c,d](-5)", () => expect(() => newInstance(ABCD,).get(-5,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            },)
            return
        }

        describe("get", () => {
            describe("simple", () => {
                describe("[](0)", () => {
                    test.skip("index", () => expect(newInstance(EMPTY,)[0],).toBeUndefined(),)
                    test("get",        () => expect(() => newInstance(EMPTY,).get(0,),).toThrow(EmptyCollectionHolderException,),)
                },)
                describe("[a,b](0)", () => {
                    test.skip("index", () => expect(newInstance(AB,)[0],).toEqual('a',),)
                    test("get",        () => expect(newInstance(AB,).get(0,),).toEqual('a',),)
                },)
                describe("[a,b](3)", () => {
                    test.skip("index", () => expect(newInstance(AB,)[3],).toBeUndefined(),)
                    test("get",        () => expect(() => newInstance(AB,).get(3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("[a,b,c,d](1)", () => {
                    test.skip("index", () => expect(newInstance(ABCD,)[1],).toEqual('b',),)
                    test("get",        () => expect(newInstance(ABCD,).get(1,),).toEqual('b',),)
                },)
                describe("[a,b,c,d](-1)", () => {
                    test.skip("index", () => expect(newInstance(ABCD,)[-1],).toBeUndefined(),)
                    test("get",        () => expect(newInstance(ABCD,).get(-1,),).toEqual('d',),)
                },)
                describe("[a,b,c,d](-4)", () => {
                    test.skip("index", () => expect(newInstance(ABCD,)[-4],).toBeUndefined(),)
                    test("get",        () => expect(newInstance(ABCD,).get(-4,),).toEqual('a',),)
                },)
                describe("[a,b,c,d](-5)", () => {
                    test.skip("index", () => expect(newInstance(ABCD,)[-5],).toBeUndefined(),)
                    test("get",        () => expect(() => newInstance(ABCD,).get(-5,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
            },)
            describe("or else", () => {
                const value = Infinity
                const callback = () => Infinity

                test("[].orElse(0, () => ∞)",         () => expect(newInstance(EMPTY,).getOrElse(0, callback,),).toEqual(value,),)
                test("[a,b].orElse(0, () => ∞)",      () => expect(newInstance(AB,).getOrElse(0, callback,),).toEqual('a',),)
                test("[a,b].orElse(3, () => ∞)",      () => expect(newInstance(AB,).getOrElse(3, callback,),).toEqual(value,),)
                test("[a,b,c,d].orElse(1, () => ∞)",  () => expect(newInstance(ABCD,).getOrElse(1, callback,),).toEqual('b',),)
                test("[a,b,c,d].orElse(-1, () => ∞)", () => expect(newInstance(ABCD,).getOrElse(-1, callback,),).toEqual('d',),)
                test("[a,b,c,d].orElse(-5, () => ∞)", () => expect(newInstance(ABCD,).getOrElse(-5, callback,),).toEqual(value,),)
            },)
            describe("or null", () => {
                test("[].orNull(0)",         () =>  expect(newInstance(EMPTY,).getOrNull(0,),).toBeNull(),)
                test("[a,b].orNull(0)",      () => expect(newInstance(AB,).getOrNull(0,),).toEqual('a',),)
                test("[a,b].orNull(3)",      () => expect(newInstance(AB,).getOrNull(3,),).toBeNull(),)
                test("[a,b,c,d].orNull(1)",  () => expect(newInstance(ABCD,).getOrNull(1,),).toEqual('b',),)
                test("[a,b,c,d].orNull(-1)", () => expect(newInstance(ABCD,).getOrNull(-1,),).toEqual('d',),)
                test("[a,b,c,d].orNull(-5)", () => expect(newInstance(ABCD,).getOrNull(-5,),).toBeNull(),)
            },)
        },)

        describe("first", () => {
            describe("[]", () => {
                test("direct",  () => expect(() => newInstance(EMPTY,).first(),).toThrow(EmptyCollectionHolderException,),)
                test("or null", () => expect(newInstance(EMPTY,).firstOrNull(),).toBeNull(),)
            },)

            test("[a,b,c,d].first()", () => expect(newInstance(ABCD,).first(),).toBe('a',),)
            describe("[null,a,b,c,d].first()", () => {
                test("direct",  () => expect(newInstance(NULL_ABCD,).first(),).toBeNull(),)
                test("or null", () => expect(newInstance(NULL_ABCD,).firstOrNull(),).toBeNull(),)
            },)
            test("[a,b,c,d,null].first()", () => expect(newInstance(ABCD_NULL,).first(),).toBe('a',),)
            describe("[undefined,a,b,c,d].first()", () => {
                test("direct",  () => expect(newInstance(UNDEFINED_ABCD,).first(),).toBeUndefined(),)
                test("or null", () => expect(newInstance(UNDEFINED_ABCD,).firstOrNull(),).toBeUndefined(),)
            },)
            test("[a,b,c,d,undefined].first()", () => expect(newInstance(ABCD_UNDEFINED,).first(),).toBe('a',),)

            test("[a,b,c,d].first(!a)", () => expect(newInstance(ABCD,).first(it => it !== 'a',),).toBe('b',),)
            describe("[null,a,b,c,d].first(!a) ", () => {
                test("direct",  () => expect(newInstance(NULL_ABCD,).first(it => it !== 'a',),).toBeNull(),)
                test("or null", () => expect(newInstance(NULL_ABCD,).firstOrNull(it => it !== 'a',),).toBeNull(),)
            },)
            test("[a,b,c,d,null].first(!a)", () => expect(newInstance(ABCD_NULL,).first(it => it !== 'a',),).toBe('b',),)
            describe("[undefined,a,b,c,d].first(!a)", () => {
                test("direct",  () => expect(newInstance(UNDEFINED_ABCD,).first(it => it !== 'a',),).toBeUndefined(),)
                test("or null", () => expect(newInstance(UNDEFINED_ABCD,).firstOrNull(it => it !== 'a',),).toBeUndefined(),)
            },)
            test("[a,b,c,d,undefined].first(!a)", () => expect(newInstance(ABCD_UNDEFINED,).first(it => it !== 'a',),).toBe('b',),)
        },)
        describe("last", () => {
            describe("[]", () => {
                test("direct",  () => expect(() => newInstance(EMPTY,).last(),).toThrow(EmptyCollectionHolderException,),)
                test("or null", () => expect(newInstance(EMPTY,).lastOrNull(),).toBeNull(),)
            },)

            test("[a,b,c,d].last()",      () => expect(newInstance(ABCD,).last(),).toBe('d',),)
            test("[null,a,b,c,d].last()", () => expect(newInstance(NULL_ABCD,).last(),).toBe('d',),)
            describe("[a,b,c,d,null].last()", () => {
                test("direct",  () => expect(newInstance(ABCD_NULL,).last(),).toBeNull(),)
                test("or null", () => expect(newInstance(ABCD_NULL,).lastOrNull(),).toBeNull(),)
            },)
            test("[undefined,a,b,c,d].last()", () => expect(newInstance(UNDEFINED_ABCD,).last(),).toBe('d',),)
            describe("[a,b,c,d,undefined].last()", () => {
                test("direct",  () => expect(newInstance(ABCD_UNDEFINED,).last(),).toBeUndefined(),)
                test("or null", () => expect(newInstance(ABCD_UNDEFINED,).lastOrNull(),).toBeUndefined(),)
            },)

            test("[a,b,c,d].last(!d)",      () => expect(newInstance(ABCD,).last(it => it !== 'd',),).toBe('c',),)
            test("[null,a,b,c,d].last(!d)", () => expect(newInstance(NULL_ABCD,).last(it => it !== 'd',),).toBe('c',),)
            describe("[a,b,c,d,null].last(!d)", () => {
                test("direct",  () => expect(newInstance(ABCD_NULL,).last(it => it !== 'd',),).toBeNull(),)
                test("or null", () => expect(newInstance(ABCD_NULL,).lastOrNull(it => it !== 'd',),).toBeNull(),)
            },)
            test("[undefined,a,b,c,d].last(!d)", () => expect(newInstance(UNDEFINED_ABCD,).last(it => it !== 'd',),).toBe('c',),)
            describe("[a,b,c,d,undefined].last(!d)", () => {
                test("direct",  () => expect(newInstance(ABCD_UNDEFINED,).last(it => it !== 'd',),).toBeUndefined(),)
                test("or null", () => expect(newInstance(ABCD_UNDEFINED,).lastOrNull(it => it !== 'd',),).toBeUndefined(),)
            },)
        },)
    },)

},)
