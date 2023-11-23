/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {A, A_NULL_B_UNDEFINED, AB, AB12, ABCD_NULL, ABCD_UNDEFINED, NULL_ABCD, UNDEFINED_ABCD} from "./constantCollections"
import {everyInstances, nonPresentItem, TEMPLATE_ITEMS}                                        from "./constantValues"
import {newCollectionInstance}                                                                 from "./newCollectionInstance"

describe("CollectionHolderTest (has)", () =>
describe.each(everyInstances,)("%s", ({value: instance,},) => {
    //#region -------------------- Instances --------------------

    const A_INSTANCE = () => newCollectionInstance(instance, A,)
    const AB_INSTANCE = () => newCollectionInstance(instance, AB,)
    const A_NULL_B_UNDEFINED_INSTANCE = () => newCollectionInstance(instance, A_NULL_B_UNDEFINED,)
    const AB12_INSTANCE = () => newCollectionInstance(instance, AB12,)
    const NULL_ABCD_INSTANCE = () => newCollectionInstance(instance, NULL_ABCD,)
    const ABCD_NULL_INSTANCE = () => newCollectionInstance(instance, ABCD_NULL,)
    const UNDEFINED_ABCD_INSTANCE = () => newCollectionInstance(instance, UNDEFINED_ABCD,)
    const ABCD_UNDEFINED_INSTANCE = () => newCollectionInstance(instance, ABCD_UNDEFINED,)
    const TEMPLATE_ITEMS_INSTANCE = () => newCollectionInstance(instance, TEMPLATE_ITEMS,)

    //#endregion -------------------- Instances --------------------


    describe("one", () => {
        describe("singular item", () => {
            describe('a', () => {
                test("has",      () => expect(A_INSTANCE().hasOne('a',),).toBeTrue(),)
                test("includes", () => expect(A_INSTANCE().includesOne('a',),).toBeTrue(),)
                test("contains", () => expect(A_INSTANCE().containsOne('a',),).toBeTrue(),)
            },)
            describe('b', () => {
                test("has",      () => expect(A_INSTANCE().hasOne('b',),).toBeFalse(),)
                test("includes", () => expect(A_INSTANCE().includesOne('b',),).toBeFalse(),)
                test("contains", () => expect(A_INSTANCE().containsOne('b',),).toBeFalse(),)
            },)
            describe("a,b", () => {
                test("has",      () => expect(A_INSTANCE().hasOne('a', 'b',),).toBeTrue(),)
                test("includes", () => expect(A_INSTANCE().includesOne('a', 'b',),).toBeTrue(),)
                test("contains", () => expect(A_INSTANCE().containsOne('a', 'b',),).toBeTrue(),)
            },)
            describe("b,a", () => {
                test("has",      () => expect(A_INSTANCE().hasOne('b', 'a',),).toBeTrue(),)
                test("includes", () => expect(A_INSTANCE().includesOne('b', 'a',),).toBeTrue(),)
                test("contains", () => expect(A_INSTANCE().containsOne('b', 'a',),).toBeTrue(),)
            },)
        },)
        describe.each(TEMPLATE_ITEMS,)("%s", it => {
            test("has",      () => expect(TEMPLATE_ITEMS_INSTANCE().hasOne(it,),).toBeTrue(),)
            test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesOne(it,),).toBeTrue(),)
            test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsOne(it,),).toBeTrue(),)

            describe("value + nonPresentItem", () => {
                test("has",      () => expect(TEMPLATE_ITEMS_INSTANCE().hasOne(it, nonPresentItem,),).toBeTrue(),)
                test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesOne(it, nonPresentItem,),).toBeTrue(),)
                test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsOne(it, nonPresentItem,),).toBeTrue(),)
            },)
            describe("Object(value)", () => {
                test("has",      () => expect(TEMPLATE_ITEMS_INSTANCE().hasOne(Object(it,),),).toBeFalse(),)
                test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesOne(Object(it,),),).toBeFalse(),)
                test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsOne(Object(it,),),).toBeFalse(),)
            },)
            describe("[value]", () => {
                test("has",      () => expect(TEMPLATE_ITEMS_INSTANCE().hasOne([it,],),).toBeFalse(),)
                test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesOne([it,],),).toBeFalse(),)
                test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsOne([it,],),).toBeFalse(),)
            },)
            describe("{value}", () => {
                test("has",      () => expect(TEMPLATE_ITEMS_INSTANCE().hasOne({it,},),).toBeFalse(),)
                test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesOne({it,},),).toBeFalse(),)
                test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsOne({it,},),).toBeFalse(),)
            },)
        },)
    },)
    describe("all", () => {
        describe("singular item", () => {
            describe("singular item", () => {
                describe('a', () => {
                    test("has",      () => expect(A_INSTANCE().hasAll('a',),).toBeTrue(),)
                    test("includes", () => expect(A_INSTANCE().includesAll('a',),).toBeTrue(),)
                    test("contains", () => expect(A_INSTANCE().containsAll('a',),).toBeTrue(),)
                },)
                describe('b', () => {
                    test("has",      () => expect(A_INSTANCE().hasAll('b',),).toBeFalse(),)
                    test("includes", () => expect(A_INSTANCE().includesAll('b',),).toBeFalse(),)
                    test("contains", () => expect(A_INSTANCE().containsAll('b',),).toBeFalse(),)
                },)
                describe("a,b", () => {
                    test("has",      () => expect(A_INSTANCE().hasAll('a', 'b',),).toBeFalse(),)
                    test("includes", () => expect(A_INSTANCE().includesAll('a', 'b',),).toBeFalse(),)
                    test("contains", () => expect(A_INSTANCE().containsAll('a', 'b',),).toBeFalse(),)
                },)
                describe("b,a", () => {
                    test("has",      () => expect(A_INSTANCE().hasAll('b', 'a',),).toBeFalse(),)
                    test("includes", () => expect(A_INSTANCE().includesAll('b', 'a',),).toBeFalse(),)
                    test("contains", () => expect(A_INSTANCE().containsAll('b', 'a',),).toBeFalse(),)
                },)
            },)
        },)
        describe.each(TEMPLATE_ITEMS,)("%s", it => {
            test("has",      () => expect(TEMPLATE_ITEMS_INSTANCE().hasAll(it,),).toBeTrue(),)
            test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesAll(it,),).toBeTrue(),)
            test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsAll(it,),).toBeTrue(),)

            describe("value + nonPresentItem", () => {
                test("has",      () => expect(TEMPLATE_ITEMS_INSTANCE().hasAll(it, nonPresentItem,),).toBeFalse(),)
                test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesAll(it, nonPresentItem,),).toBeFalse(),)
                test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsAll(it, nonPresentItem,),).toBeFalse(),)
            },)
            describe("Object(value)", () => {
                test("has",      () => expect(TEMPLATE_ITEMS_INSTANCE().hasAll(Object(it,),),).toBeFalse(),)
                test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesAll(Object(it,),),).toBeFalse(),)
                test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsAll(Object(it,),),).toBeFalse(),)
            },)
            describe("[value]", () => {
                test("has",      () => expect(TEMPLATE_ITEMS_INSTANCE().hasAll([it,],),).toBeFalse(),)
                test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesAll([it,],),).toBeFalse(),)
                test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsAll([it,],),).toBeFalse(),)
            },)
            describe("{value}", () => {
                test("has",      () => expect(TEMPLATE_ITEMS_INSTANCE().hasAll({it,},),).toBeFalse(),)
                test("includes", () => expect(TEMPLATE_ITEMS_INSTANCE().includesAll({it,},),).toBeFalse(),)
                test("contains", () => expect(TEMPLATE_ITEMS_INSTANCE().containsAll({it,},),).toBeFalse(),)
            },)
        },)
    },)


    describe("null", () => {
        describe("has", () => {
            test("[a,b] == false",                   () => expect(AB_INSTANCE().hasNull,).toBeFalse(),)
            test("[a,b,null,c,d,undefined] == true", () => expect(A_NULL_B_UNDEFINED_INSTANCE().hasNull,).toBeTrue(),)
            test("[a,b,1,2] == false",               () => expect(AB12_INSTANCE().hasNull,).toBeFalse(),)
            test("[null,a,b,c,d] == true",           () => expect(NULL_ABCD_INSTANCE().hasNull,).toBeTrue(),)
            test("[a,b,c,d,null] == true",           () => expect(ABCD_NULL_INSTANCE().hasNull,).toBeTrue(),)
            test("[undefined,a,b,c,d] == true",      () => expect(UNDEFINED_ABCD_INSTANCE().hasNull,).toBeTrue(),)
            test("[a,b,c,d,undefined] == true",      () => expect(ABCD_UNDEFINED_INSTANCE().hasNull,).toBeTrue(),)
        },)
        describe("includes", () => {
            test("[a,b] == false",                   () => expect(AB_INSTANCE().includesNull,).toBeFalse(),)
            test("[a,b,null,c,d,undefined] == true", () => expect(A_NULL_B_UNDEFINED_INSTANCE().includesNull,).toBeTrue(),)
            test("[a,b,1,2] == false",               () => expect(AB12_INSTANCE().includesNull,).toBeFalse(),)
            test("[null,a,b,c,d] == true",           () => expect(NULL_ABCD_INSTANCE().includesNull,).toBeTrue(),)
            test("[a,b,c,d,null] == true",           () => expect(ABCD_NULL_INSTANCE().includesNull,).toBeTrue(),)
            test("[undefined,a,b,c,d] == true",      () => expect(UNDEFINED_ABCD_INSTANCE().includesNull,).toBeTrue(),)
            test("[a,b,c,d,undefined] == true",      () => expect(ABCD_UNDEFINED_INSTANCE().includesNull,).toBeTrue(),)
        },)
        describe("contains", () => {
            test("[a,b] == false",                   () => expect(AB_INSTANCE().containsNull,).toBeFalse(),)
            test("[a,b,null,c,d,undefined] == true", () => expect(A_NULL_B_UNDEFINED_INSTANCE().containsNull,).toBeTrue(),)
            test("[a,b,1,2] == false",               () => expect(AB12_INSTANCE().containsNull,).toBeFalse(),)
            test("[null,a,b,c,d] == true",           () => expect(NULL_ABCD_INSTANCE().containsNull,).toBeTrue(),)
            test("[a,b,c,d,null] == true",           () => expect(ABCD_NULL_INSTANCE().containsNull,).toBeTrue(),)
            test("[undefined,a,b,c,d] == true",      () => expect(UNDEFINED_ABCD_INSTANCE().containsNull,).toBeTrue(),)
            test("[a,b,c,d,undefined] == true",      () => expect(ABCD_UNDEFINED_INSTANCE().containsNull,).toBeTrue(),)
        },)
    },)
},),)
