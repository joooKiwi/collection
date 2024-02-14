/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, ABCD, ABCD_NULL, ABCD_UNDEFINED, EMPTY, NULL_ABCD, UNDEFINED_ABCD} from "./constantCollections"
import {everyMinimalistInstances}                                              from "./constantValues"
import {newCollectionInstance, newMinimalistCollectionInstance}                from "./newCollectionInstance"
import {GenericCollectionHolder_GetAlias}                                      from "./instance/GenericCollectionHolder_GetAlias"
import {GenericCollectionHolder_GetOrElseAlias}                                from "./instance/GenericCollectionHolder_GetOrElseAlias"
import {GenericCollectionHolder_GetOrNullAlias}                                from "./instance/GenericCollectionHolder_GetOrNullAlias"
import {LazyGenericCollectionHolder_GetAlias}                                  from "./instance/LazyGenericCollectionHolder_GetAlias"
import {LazyGenericCollectionHolder_GetOrElseAlias}                            from "./instance/LazyGenericCollectionHolder_GetOrElseAlias"
import {LazyGenericCollectionHolder_GetOrNullAlias}                            from "./instance/LazyGenericCollectionHolder_GetOrNullAlias"

import {GenericMinimalistCollectionHolder}         from "../src/GenericMinimalistCollectionHolder"
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

    describe.each(everyMinimalistInstances,)("%s", ({value: instance,},) => {
        const isSimplistic = instance === GenericMinimalistCollectionHolder

        //#region -------------------- Instances --------------------

        const EMPTY_INSTANCE = () => newCollectionInstance(instance, EMPTY,)
        const EMPTY_SIMPLISTIC_INSTANCE = () => newMinimalistCollectionInstance(instance, EMPTY,)
        const AB_INSTANCE = () => newCollectionInstance(instance, AB,)
        const AB_SIMPLISTIC_INSTANCE = () => newMinimalistCollectionInstance(instance, AB,)
        const ABCD_INSTANCE = () => newCollectionInstance(instance, ABCD,)
        const ABCD_SIMPLISTIC_INSTANCE = () => newMinimalistCollectionInstance(instance, ABCD,)
        const NULL_ABCD_INSTANCE = () => newCollectionInstance(instance, NULL_ABCD,)
        const ABCD_NULL_INSTANCE = () => newCollectionInstance(instance, ABCD_NULL,)
        const UNDEFINED_ABCD_INSTANCE = () => newCollectionInstance(instance, UNDEFINED_ABCD,)
        const ABCD_UNDEFINED_INSTANCE = () => newCollectionInstance(instance, ABCD_UNDEFINED,)

        //#endregion -------------------- Instances --------------------

        if (isSimplistic) {
            //README: Those tests are based on lower tests
            describe("get",           () => {
                test("[](0)",         () => expect(() => EMPTY_SIMPLISTIC_INSTANCE().get(0,),).toThrow(EmptyCollectionHolderException,),)
                test("[a,b](0)",      () => expect(AB_SIMPLISTIC_INSTANCE().get(0,),).toEqual('a',),)
                test("[a,b](3)",      () => expect(() => AB_SIMPLISTIC_INSTANCE().get(3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                test("[a,b,c,d](1)",  () => expect(ABCD_SIMPLISTIC_INSTANCE().get(1,),).toEqual('b',),)
                test("[a,b,c,d](-1)", () => expect(ABCD_SIMPLISTIC_INSTANCE().get(-1,),).toEqual('d',),)
                test("[a,b,c,d](-4)", () => expect(ABCD_SIMPLISTIC_INSTANCE().get(-4,),).toEqual('a',),)
                test("[a,b,c,d](-5)", () => expect(() => ABCD_SIMPLISTIC_INSTANCE().get(-5,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
            },)
            return
        }
        describe("get", () => {
            describe("simple", () => {
                describe("[](0)", () => {
                    test.skip("index", () => expect(EMPTY_INSTANCE()[0],).toBeUndefined(),)
                    test("get",        () => expect(() => EMPTY_INSTANCE().get(0,),).toThrow(EmptyCollectionHolderException,),)
                },)
                describe("[a,b](0)", () => {
                    test.skip("index", () => expect(AB_INSTANCE()[0],).toEqual('a',),)
                    test("get",        () => expect(AB_INSTANCE().get(0,),).toEqual('a',),)
                },)
                describe("[a,b](3)", () => {
                    test.skip("index", () => expect(AB_INSTANCE()[3],).toBeUndefined(),)
                    test("get",        () => expect(() => AB_INSTANCE().get(3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
                describe("[a,b,c,d](1)", () => {
                    test.skip("index", () => expect(ABCD_INSTANCE()[1],).toEqual('b',),)
                    test("get",        () => expect(ABCD_INSTANCE().get(1,),).toEqual('b',),)
                },)
                describe("[a,b,c,d](-1)", () => {
                    test.skip("index", () => expect(ABCD_INSTANCE()[-1],).toBeUndefined(),)
                    test("get",        () => expect(ABCD_INSTANCE().get(-1,),).toEqual('d',),)
                },)
                describe("[a,b,c,d](-4)", () => {
                    test.skip("index", () => expect(ABCD_INSTANCE()[-4],).toBeUndefined(),)
                    test("get",        () => expect(ABCD_INSTANCE().get(-4,),).toEqual('a',),)
                },)
                describe("[a,b,c,d](-5)", () => {
                    test.skip("index", () => expect(ABCD_INSTANCE()[-5],).toBeUndefined(),)
                    test("get",        () => expect(() => ABCD_INSTANCE().get(-5,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                },)
            },)
            describe("or else", () => {
                const value = Infinity
                const callback = () => Infinity

                test("[].orElse(0, () => ∞)",         () => expect(EMPTY_INSTANCE().getOrElse(0, callback,),).toEqual(value,),)
                test("[a,b].orElse(0, () => ∞)",      () => expect(AB_INSTANCE().getOrElse(0, callback,),).toEqual('a',),)
                test("[a,b].orElse(3, () => ∞)",      () => expect(AB_INSTANCE().getOrElse(3, callback,),).toEqual(value,),)
                test("[a,b,c,d].orElse(1, () => ∞)",  () => expect(ABCD_INSTANCE().getOrElse(1, callback,),).toEqual('b',),)
                test("[a,b,c,d].orElse(-1, () => ∞)", () => expect(ABCD_INSTANCE().getOrElse(-1, callback,),).toEqual('d',),)
                test("[a,b,c,d].orElse(-5, () => ∞)", () => expect(ABCD_INSTANCE().getOrElse(-5, callback,),).toEqual(value,),)
            },)
            describe("or null", () => {
                test("[].orNull(0)",         () =>  expect(EMPTY_INSTANCE().getOrNull(0,),).toBeNull(),)
                test("[a,b].orNull(0)",      () => expect(AB_INSTANCE().getOrNull(0,),).toEqual('a',),)
                test("[a,b].orNull(3)",      () => expect(AB_INSTANCE().getOrNull(3,),).toBeNull(),)
                test("[a,b,c,d].orNull(1)",  () => expect(ABCD_INSTANCE().getOrNull(1,),).toEqual('b',),)
                test("[a,b,c,d].orNull(-1)", () => expect(ABCD_INSTANCE().getOrNull(-1,),).toEqual('d',),)
                test("[a,b,c,d].orNull(-5)", () => expect(ABCD_INSTANCE().getOrNull(-5,),).toBeNull(),)
            },)
        },)

        describe("first", () => {
            describe("[]", () => {
                test("direct",  () => expect(() => EMPTY_INSTANCE().first(),).toThrow(EmptyCollectionHolderException,),)
                test("or null", () => expect(EMPTY_INSTANCE().firstOrNull(),).toBeNull(),)
            },)

            test("[a,b,c,d].first()", () => expect(ABCD_INSTANCE().first(),).toBe('a',),)
            describe("[null,a,b,c,d].first()", () => {
                test("direct",  () => expect(NULL_ABCD_INSTANCE().first(),).toBeNull(),)
                test("or null", () => expect(NULL_ABCD_INSTANCE().firstOrNull(),).toBeNull(),)
            },)
            test("[a,b,c,d,null].first()", () => expect(ABCD_NULL_INSTANCE().first(),).toBe('a',),)
            describe("[undefined,a,b,c,d].first()", () => {
                test("direct",  () => expect(UNDEFINED_ABCD_INSTANCE().first(),).toBeUndefined(),)
                test("or null", () => expect(UNDEFINED_ABCD_INSTANCE().firstOrNull(),).toBeUndefined(),)
            },)
            test("[a,b,c,d,undefined].first()", () => expect(ABCD_UNDEFINED_INSTANCE().first(),).toBe('a',),)

            test("[a,b,c,d].first(!a)", () => expect(ABCD_INSTANCE().first(it => it !== 'a',),).toBe('b',),)
            describe("[null,a,b,c,d].first(!a) ", () => {
                test("direct",  () => expect(NULL_ABCD_INSTANCE().first(it => it !== 'a',),).toBeNull(),)
                test("or null", () => expect(NULL_ABCD_INSTANCE().firstOrNull(it => it !== 'a',),).toBeNull(),)
            },)
            test("[a,b,c,d,null].first(!a)", () => expect(ABCD_NULL_INSTANCE().first(it => it !== 'a',),).toBe('b',),)
            describe("[undefined,a,b,c,d].first(!a)", () => {
                test("direct",  () => expect(UNDEFINED_ABCD_INSTANCE().first(it => it !== 'a',),).toBeUndefined(),)
                test("or null", () => expect(UNDEFINED_ABCD_INSTANCE().firstOrNull(it => it !== 'a',),).toBeUndefined(),)
            },)
            test("[a,b,c,d,undefined].first(!a)", () => expect(ABCD_UNDEFINED_INSTANCE().first(it => it !== 'a',),).toBe('b',),)
        },)
        describe("last", () => {
            describe("[]", () => {
                test("direct",  () => expect(() => EMPTY_INSTANCE().last(),).toThrow(EmptyCollectionHolderException,),)
                test("or null", () => expect(EMPTY_INSTANCE().lastOrNull(),).toBeNull(),)
            },)

            test("[a,b,c,d].last()",      () => expect(ABCD_INSTANCE().last(),).toBe('d',),)
            test("[null,a,b,c,d].last()", () => expect(NULL_ABCD_INSTANCE().last(),).toBe('d',),)
            describe("[a,b,c,d,null].last()", () => {
                test("direct",  () => expect(ABCD_NULL_INSTANCE().last(),).toBeNull(),)
                test("or null", () => expect(ABCD_NULL_INSTANCE().lastOrNull(),).toBeNull(),)
            },)
            test("[undefined,a,b,c,d].last()", () => expect(UNDEFINED_ABCD_INSTANCE().last(),).toBe('d',),)
            describe("[a,b,c,d,undefined].last()", () => {
                test("direct",  () => expect(ABCD_UNDEFINED_INSTANCE().last(),).toBeUndefined(),)
                test("or null", () => expect(ABCD_UNDEFINED_INSTANCE().lastOrNull(),).toBeUndefined(),)
            },)

            test("[a,b,c,d].last(!d)",      () => expect(ABCD_INSTANCE().last(it => it !== 'd',),).toBe('c',),)
            test("[null,a,b,c,d].last(!d)", () => expect(NULL_ABCD_INSTANCE().last(it => it !== 'd',),).toBe('c',),)
            describe("[a,b,c,d,null].last(!d)", () => {
                test("direct",  () => expect(ABCD_NULL_INSTANCE().last(it => it !== 'd',),).toBeNull(),)
                test("or null", () => expect(ABCD_NULL_INSTANCE().lastOrNull(it => it !== 'd',),).toBeNull(),)
            },)
            test("[undefined,a,b,c,d].last(!d)", () => expect(UNDEFINED_ABCD_INSTANCE().last(it => it !== 'd',),).toBe('c',),)
            describe("[a,b,c,d,undefined].last(!d)", () => {
                test("direct",  () => expect(ABCD_UNDEFINED_INSTANCE().last(it => it !== 'd',),).toBeUndefined(),)
                test("or null", () => expect(ABCD_UNDEFINED_INSTANCE().lastOrNull(it => it !== 'd',),).toBeUndefined(),)
            },)
        },)
    },)

},)
