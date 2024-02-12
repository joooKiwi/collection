/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {A, A_NULL_B_UNDEFINED, AB, AB12, ABCD_NULL, ABCD_UNDEFINED, NULL_ABCD, UNDEFINED_ABCD} from "./constantCollections"
import {everyInstances, nonPresentItem, TEMPLATE_ITEMS}                                        from "./constantValues"
import {newCollectionInstance}                                                                 from "./newCollectionInstance"
import {GenericCollectionHolder_HasAllAlias}                                                   from "./instance/GenericCollectionHolder_HasAllAlias"
import {GenericCollectionHolder_HasNullAlias}                                                  from "./instance/GenericCollectionHolder_HasNullAlias"
import {GenericCollectionHolder_HasOneAlias}                                                   from "./instance/GenericCollectionHolder_HasOneAlias"
import {LazyGenericCollectionHolder_HasAllAlias}                                               from "./instance/LazyGenericCollectionHolder_HasAllAlias"
import {LazyGenericCollectionHolder_HasNullAlias}                                              from "./instance/LazyGenericCollectionHolder_HasNullAlias"
import {LazyGenericCollectionHolder_HasOneAlias}                                               from "./instance/LazyGenericCollectionHolder_HasOneAlias"

describe("CollectionHolderTest (has)", () => {

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("has", () => {
                const instance = new GenericCollectionHolder_HasOneAlias()
                instance.has()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includes", () => {
                const instance = new GenericCollectionHolder_HasOneAlias()
                instance.includes()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesOne", () => {
                const instance = new GenericCollectionHolder_HasOneAlias()
                instance.includesOne()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesAll", () => {
                const instance = new GenericCollectionHolder_HasAllAlias()
                instance.includesAll()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesNull", () => {
                const instance = new GenericCollectionHolder_HasNullAlias()
                instance.includesNull
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("contains", () => {
                const instance = new GenericCollectionHolder_HasOneAlias()
                instance.contains()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsOne", () => {
                const instance = new GenericCollectionHolder_HasOneAlias()
                instance.containsOne()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsAll", () => {
                const instance = new GenericCollectionHolder_HasAllAlias()
                instance.containsAll()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsNull", () => {
                const instance = new GenericCollectionHolder_HasNullAlias()
                instance.containsNull
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("has", () => {
                const instance = new LazyGenericCollectionHolder_HasOneAlias()
                instance.has()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includes", () => {
                const instance = new LazyGenericCollectionHolder_HasOneAlias()
                instance.includes()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesOne", () => {
                const instance = new LazyGenericCollectionHolder_HasOneAlias()
                instance.includesOne()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesAll", () => {
                const instance = new LazyGenericCollectionHolder_HasAllAlias()
                instance.includesAll()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesNull", () => {
                const instance = new LazyGenericCollectionHolder_HasNullAlias()
                instance.includesNull
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("contains", () => {
                const instance = new LazyGenericCollectionHolder_HasOneAlias()
                instance.contains()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsOne", () => {
                const instance = new LazyGenericCollectionHolder_HasOneAlias()
                instance.containsOne()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsAll", () => {
                const instance = new LazyGenericCollectionHolder_HasAllAlias()
                instance.containsAll()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsNull", () => {
                const instance = new LazyGenericCollectionHolder_HasNullAlias()
                instance.containsNull
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
    },)

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
                test('a',   () => expect(A_INSTANCE().hasOne('a',),).toBeTrue(),)
                test('b',   () => expect(A_INSTANCE().hasOne('b',),).toBeFalse(),)
                test("a,b", () => expect(A_INSTANCE().hasOne('a', 'b',),).toBeTrue(),)
                test("b,a", () => expect(A_INSTANCE().hasOne('b', 'a',),).toBeTrue(),)
            },)
            describe.each(TEMPLATE_ITEMS,)("%s", it => {
                test("[template items]",       () => expect(TEMPLATE_ITEMS_INSTANCE().hasOne(it,),).toBeTrue(),)
                test("value + nonPresentItem", () => expect(TEMPLATE_ITEMS_INSTANCE().hasOne(it, nonPresentItem,),).toBeTrue(),)
                test("Object(value)",          () => expect(TEMPLATE_ITEMS_INSTANCE().hasOne(Object(it,),),).toBeFalse(),)
                test("[value]",                () => expect(TEMPLATE_ITEMS_INSTANCE().hasOne([it,],),).toBeFalse(),)
                test("{value}",                () => expect(TEMPLATE_ITEMS_INSTANCE().hasOne({it,},),).toBeFalse(),)
            },)
        },)
        describe("all", () => {
            describe("singular item", () => {
                describe("singular item", () => {
                    test('a',   () => expect(A_INSTANCE().hasAll('a',),).toBeTrue(),)
                    test('b',   () => expect(A_INSTANCE().hasAll('b',),).toBeFalse(),)
                    test("a,b", () => expect(A_INSTANCE().hasAll('a', 'b',),).toBeFalse(),)
                    test("b,a", () => expect(A_INSTANCE().hasAll('b', 'a',),).toBeFalse(),)
                },)
            },)
            describe.each(TEMPLATE_ITEMS,)("%s", it => {
                test("[template items]",       () => expect(TEMPLATE_ITEMS_INSTANCE().hasAll(it,),).toBeTrue(),)
                test("value + nonPresentItem", () => expect(TEMPLATE_ITEMS_INSTANCE().hasAll(it, nonPresentItem,),).toBeFalse(),)
                test("Object(value)",          () => expect(TEMPLATE_ITEMS_INSTANCE().hasAll(Object(it,),),).toBeFalse(),)
                test("[value]",                () => expect(TEMPLATE_ITEMS_INSTANCE().hasAll([it,],),).toBeFalse(),)
                test("{value}",                () => expect(TEMPLATE_ITEMS_INSTANCE().hasAll({it,},),).toBeFalse(),)
            },)
        },)


        describe("null", () => {
            test("[a,b] == false",                   () => expect(AB_INSTANCE().hasNull,).toBeFalse(),)
            test("[a,b,null,c,d,undefined] == true", () => expect(A_NULL_B_UNDEFINED_INSTANCE().hasNull,).toBeTrue(),)
            test("[a,b,1,2] == false",               () => expect(AB12_INSTANCE().hasNull,).toBeFalse(),)
            test("[null,a,b,c,d] == true",           () => expect(NULL_ABCD_INSTANCE().hasNull,).toBeTrue(),)
            test("[a,b,c,d,null] == true",           () => expect(ABCD_NULL_INSTANCE().hasNull,).toBeTrue(),)
            test("[undefined,a,b,c,d] == true",      () => expect(UNDEFINED_ABCD_INSTANCE().hasNull,).toBeTrue(),)
            test("[a,b,c,d,undefined] == true",      () => expect(ABCD_UNDEFINED_INSTANCE().hasNull,).toBeTrue(),)
        },)
    },)

},)
