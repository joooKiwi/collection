/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {A, A_NULL_B_UNDEFINED, A_NULL_B_UNDEFINED_UNDEFINED, A_NULL_NULL_B_UNDEFINED, AAB, AB, AB12, ABB, ABCD_NULL, ABCD_UNDEFINED, EMPTY, NULL_ABCD, NULL_NULL_B_UNDEFINED, UNDEFINED_ABCD} from "./constantCollections"
import {everyInstance, nonPresentItem, TEMPLATE_ITEMS}                                                                                                                                        from "./constantValues"
import {GenericCollectionHolder_HasAlias}                                                                                                                                                     from "./instance/GenericCollectionHolder_HasAlias"
import {GenericCollectionHolder_HasAllAlias}                                                                                                                                                  from "./instance/GenericCollectionHolder_HasAllAlias"
import {GenericCollectionHolder_HasDuplicateAlias}                                                                                                                                            from "./instance/GenericCollectionHolder_HasDuplicateAlias"
import {GenericCollectionHolder_HasNullAlias}                                                                                                                                                 from "./instance/GenericCollectionHolder_HasNullAlias"
import {GenericCollectionHolder_HasOneAlias}                                                                                                                                                  from "./instance/GenericCollectionHolder_HasOneAlias"
import {LazyGenericCollectionHolder_HasAlias}                                                                                                                                                 from "./instance/LazyGenericCollectionHolder_HasAlias"
import {LazyGenericCollectionHolder_HasAllAlias}                                                                                                                                              from "./instance/LazyGenericCollectionHolder_HasAllAlias"
import {LazyGenericCollectionHolder_HasDuplicateAlias}                                                                                                                                        from "./instance/LazyGenericCollectionHolder_HasDuplicateAlias"
import {LazyGenericCollectionHolder_HasNullAlias}                                                                                                                                             from "./instance/LazyGenericCollectionHolder_HasNullAlias"
import {LazyGenericCollectionHolder_HasOneAlias}                                                                                                                                              from "./instance/LazyGenericCollectionHolder_HasOneAlias"

describe("CollectionHolderTest (has)", () => {

    describe("aliases", () => {
        const singleValue = 'a'
        const singleValueInArray = ['a',] as const
        describe("GenericCollectionHolder", () => {
            test("includes", () => {
                const instance = new GenericCollectionHolder_HasAlias()
                instance.includes(singleValue,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesOne", () => {
                const instance = new GenericCollectionHolder_HasOneAlias()
                instance.includesOne(singleValueInArray,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesAll", () => {
                const instance = new GenericCollectionHolder_HasAllAlias()
                instance.includesAll(singleValueInArray,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesNull", () => {
                const instance = new GenericCollectionHolder_HasNullAlias()
                instance.includesNull
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesDuplicate", () => {
                const instance = new GenericCollectionHolder_HasDuplicateAlias()
                instance.includesDuplicate
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("contains", () => {
                const instance = new GenericCollectionHolder_HasAlias()
                instance.contains(singleValue,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsOne", () => {
                const instance = new GenericCollectionHolder_HasOneAlias()
                instance.containsOne(singleValueInArray,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsAll", () => {
                const instance = new GenericCollectionHolder_HasAllAlias()
                instance.containsAll(singleValueInArray,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsNull", () => {
                const instance = new GenericCollectionHolder_HasNullAlias()
                instance.containsNull
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsDuplicate", () => {
                const instance = new GenericCollectionHolder_HasDuplicateAlias()
                instance.containsDuplicate
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("includes", () => {
                const instance = new LazyGenericCollectionHolder_HasAlias()
                instance.includes(singleValue,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesOne", () => {
                const instance = new LazyGenericCollectionHolder_HasOneAlias()
                instance.includesOne(singleValueInArray,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesAll", () => {
                const instance = new LazyGenericCollectionHolder_HasAllAlias()
                instance.includesAll(singleValueInArray,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesNull", () => {
                const instance = new LazyGenericCollectionHolder_HasNullAlias()
                instance.includesNull
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesDuplicate", () => {
                const instance = new LazyGenericCollectionHolder_HasDuplicateAlias()
                instance.includesDuplicate
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("contains", () => {
                const instance = new LazyGenericCollectionHolder_HasAlias()
                instance.contains(singleValue,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsOne", () => {
                const instance = new LazyGenericCollectionHolder_HasOneAlias()
                instance.containsOne(singleValueInArray,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsAll", () => {
                const instance = new LazyGenericCollectionHolder_HasAllAlias()
                instance.containsAll(singleValueInArray,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsNull", () => {
                const instance = new LazyGenericCollectionHolder_HasNullAlias()
                instance.containsNull
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsDuplicate", () => {
                const instance = new LazyGenericCollectionHolder_HasDuplicateAlias()
                instance.containsDuplicate
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
    },)

    describe.each(everyInstance,)("%s", ({value: {newInstance,},},) => {
        describe("one", () => {
            describe("singular item", () => {
                test('a',   () => expect(newInstance(A,).hasOne(['a',],),).toBeTrue(),)
                test('b',   () => expect(newInstance(A,).hasOne(['b',],),).toBeFalse(),)
                test("a,b", () => expect(newInstance(A,).hasOne(['a', 'b',],),).toBeTrue(),)
                test("b,a", () => expect(newInstance(A,).hasOne(['b', 'a',],),).toBeTrue(),)
            },)
            describe.each(TEMPLATE_ITEMS,)("%s", it => {
                test("[template items]",       () => expect(newInstance(TEMPLATE_ITEMS,).hasOne([it,],),).toBeTrue(),)
                test("value + nonPresentItem", () => expect(newInstance(TEMPLATE_ITEMS,).hasOne([it, nonPresentItem,],),).toBeTrue(),)
                test("Object(value)",          () => expect(newInstance(TEMPLATE_ITEMS,).hasOne([Object(it,),],),).toBeFalse(),)
                test("[value]",                () => expect(newInstance(TEMPLATE_ITEMS,).hasOne([[it,],],),).toBeFalse(),)
                test("{value}",                () => expect(newInstance(TEMPLATE_ITEMS,).hasOne([{it,},],),).toBeFalse(),)
            },)
        },)
        describe("all", () => {
            describe("singular item", () => {
                test('a',   () => expect(newInstance(A,).hasAll(['a',],),).toBeTrue(),)
                test('b',   () => expect(newInstance(A,).hasAll(['b',],),).toBeFalse(),)
                test("a,b", () => expect(newInstance(A,).hasAll(['a', 'b',],),).toBeFalse(),)
                test("b,a", () => expect(newInstance(A,).hasAll(['b', 'a',],),).toBeFalse(),)
            },)
            describe.each(TEMPLATE_ITEMS,)("%s", it => {
                test("[template items]",       () => expect(newInstance(TEMPLATE_ITEMS,).hasAll([it,],),).toBeTrue(),)
                test("value + nonPresentItem", () => expect(newInstance(TEMPLATE_ITEMS,).hasAll([it, nonPresentItem,],),).toBeFalse(),)
                test("Object(value)",          () => expect(newInstance(TEMPLATE_ITEMS,).hasAll([Object(it,),],),).toBeFalse(),)
                test("[value]",                () => expect(newInstance(TEMPLATE_ITEMS,).hasAll([[it,],],),).toBeFalse(),)
                test("{value}",                () => expect(newInstance(TEMPLATE_ITEMS,).hasAll([{it,},],),).toBeFalse(),)
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
        describe("duplicate", () => {
            test("[] == false",                            () => expect(newInstance(EMPTY,).hasDuplicate,).toBeFalse(),)
            test("[a,b] == false",                         () => expect(newInstance(AB,).hasDuplicate,).toBeFalse(),)
            test("[a,null,b,undefined] == false",          () => expect(newInstance(A_NULL_B_UNDEFINED,).hasDuplicate,).toBeFalse(),)
            test("[a,null,null,b,undefined] == true",      () => expect(newInstance(A_NULL_NULL_B_UNDEFINED,).hasDuplicate,).toBeTrue(),)
            test("[null,null,b,undefined] == true",        () => expect(newInstance(NULL_NULL_B_UNDEFINED,).hasDuplicate,).toBeTrue(),)
            test("[a,null,b,undefined,undefined] == true", () => expect(newInstance(A_NULL_B_UNDEFINED_UNDEFINED,).hasDuplicate,).toBeTrue(),)
            test("[a,a,b] == true",                        () => expect(newInstance(AAB,).hasDuplicate,).toBeTrue(),)
            test("[a,b,b] == true",                        () => expect(newInstance(ABB,).hasDuplicate,).toBeTrue(),)
        },)
    },)

},)
