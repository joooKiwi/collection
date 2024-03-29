/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {A, A_NULL_B_UNDEFINED, AB, AB12, ABCD_NULL, ABCD_UNDEFINED, NULL_ABCD, UNDEFINED_ABCD} from "./constantCollections"
import {everyInstance, nonPresentItem, TEMPLATE_ITEMS}                                         from "./constantValues"
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

    describe.each(everyInstance,)("%s", ({value: {newInstance,},},) => {
        describe("one", () => {
            describe("singular item", () => {
                test('a',   () => expect(newInstance(A,).hasOne('a',),).toBeTrue(),)
                test('b',   () => expect(newInstance(A,).hasOne('b',),).toBeFalse(),)
                test("a,b", () => expect(newInstance(A,).hasOne('a', 'b',),).toBeTrue(),)
                test("b,a", () => expect(newInstance(A,).hasOne('b', 'a',),).toBeTrue(),)
            },)
            describe.each(TEMPLATE_ITEMS,)("%s", it => {
                test("[template items]",       () => expect(newInstance(TEMPLATE_ITEMS,).hasOne(it,),).toBeTrue(),)
                test("value + nonPresentItem", () => expect(newInstance(TEMPLATE_ITEMS,).hasOne(it, nonPresentItem,),).toBeTrue(),)
                test("Object(value)",          () => expect(newInstance(TEMPLATE_ITEMS,).hasOne(Object(it,),),).toBeFalse(),)
                test("[value]",                () => expect(newInstance(TEMPLATE_ITEMS,).hasOne([it,],),).toBeFalse(),)
                test("{value}",                () => expect(newInstance(TEMPLATE_ITEMS,).hasOne({it,},),).toBeFalse(),)
            },)
        },)
        describe("all", () => {
            describe("singular item", () => {
                test('a',   () => expect(newInstance(A,).hasAll('a',),).toBeTrue(),)
                test('b',   () => expect(newInstance(A,).hasAll('b',),).toBeFalse(),)
                test("a,b", () => expect(newInstance(A,).hasAll('a', 'b',),).toBeFalse(),)
                test("b,a", () => expect(newInstance(A,).hasAll('b', 'a',),).toBeFalse(),)
            },)
            describe.each(TEMPLATE_ITEMS,)("%s", it => {
                test("[template items]",       () => expect(newInstance(TEMPLATE_ITEMS,).hasAll(it,),).toBeTrue(),)
                test("value + nonPresentItem", () => expect(newInstance(TEMPLATE_ITEMS,).hasAll(it, nonPresentItem,),).toBeFalse(),)
                test("Object(value)",          () => expect(newInstance(TEMPLATE_ITEMS,).hasAll(Object(it,),),).toBeFalse(),)
                test("[value]",                () => expect(newInstance(TEMPLATE_ITEMS,).hasAll([it,],),).toBeFalse(),)
                test("{value}",                () => expect(newInstance(TEMPLATE_ITEMS,).hasAll({it,},),).toBeFalse(),)
            },)
        },)

        describe("null", () => {
            test("[a,b] == false",                   () => expect(newInstance(AB,).hasNull,).toBeFalse(),)
            test("[a,b,null,c,d,undefined] == true", () => expect(newInstance(A_NULL_B_UNDEFINED,).hasNull,).toBeTrue(),)
            test("[a,b,1,2] == false",               () => expect(newInstance(AB12,).hasNull,).toBeFalse(),)
            test("[null,a,b,c,d] == true",           () => expect(newInstance(NULL_ABCD,).hasNull,).toBeTrue(),)
            test("[a,b,c,d,null] == true",           () => expect(newInstance(ABCD_NULL,).hasNull,).toBeTrue(),)
            test("[undefined,a,b,c,d] == true",      () => expect(newInstance(UNDEFINED_ABCD,).hasNull,).toBeTrue(),)
            test("[a,b,c,d,undefined] == true",      () => expect(newInstance(ABCD_UNDEFINED,).hasNull,).toBeTrue(),)
        },)
    },)

},)
