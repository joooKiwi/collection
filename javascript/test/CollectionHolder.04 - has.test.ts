/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {A, A_NULL_B_UNDEFINED, AB, AB12, ABCD_NULL, ABCD_UNDEFINED, NULL_ABCD, UNDEFINED_ABCD} from "./constantCollections"
import {everyInstances, nonPresentItem, TEMPLATE_ITEMS}                                        from "./constantValues"
import {newCollectionInstance}                                                                 from "./newCollectionInstance"
import {LazyGenericCollectionHolder}          from "../src/LazyGenericCollectionHolder"
import {GenericCollectionHolder}              from "../src/GenericCollectionHolder"

describe("CollectionHolderTest (has)", () => {

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("includesOne", () => {
                const instance = new class GenericCollectionHolder_IncludesOneTest
                    extends GenericCollectionHolder {

                    public amountOfCall = 0

                    public override includesOne(...values: readonly unknown[]): boolean {
                        this.amountOfCall++
                        return super.includesOne(...values,)
                    }

                }([],)
                instance.includesOne()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesAll", () => {
                const instance = new class GenericCollectionHolder_IncludesAllTest
                    extends GenericCollectionHolder {

                    public amountOfCall = 0

                    public override includesAll(...values: readonly unknown[]): boolean {
                        this.amountOfCall++
                        return super.includesAll(...values,)
                    }

                }([],)
                instance.includesAll()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesNull", () => {
                const instance = new class GenericCollectionHolder_IncludesNullTest
                    extends GenericCollectionHolder {

                    public amountOfCall = 0

                    public override get includesNull(): this["hasNull"] {
                        this.amountOfCall++
                        return super.includesNull
                    }

                }([],)
                instance.includesNull
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsOne", () => {
                const instance = new class GenericCollectionHolder_ContainsOneTest
                    extends GenericCollectionHolder {

                    public amountOfCall = 0

                    public override containsOne(...values: unknown[]): boolean {
                        this.amountOfCall++
                        return super.containsOne(...values,)
                    }

                }([],)
                instance.containsOne()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsAll", () => {
                const instance = new class GenericCollectionHolder_ContainsAllTest
                    extends GenericCollectionHolder {

                    public amountOfCall = 0

                    public override containsAll(...values: unknown[]): boolean {
                        this.amountOfCall++
                        return super.containsAll(...values,)
                    }

                }([],)
                instance.containsAll()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsNull", () => {
                const instance = new class GenericCollectionHolder_ContainsNullTest
                    extends GenericCollectionHolder {

                    public amountOfCall = 0

                    public override get containsNull(): this["hasNull"] {
                        this.amountOfCall++
                        return super.containsNull
                    }

                }([],)
                instance.containsNull
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("includesOne", () => {
                const instance = new class LazyGenericCollectionHolder_IncludesOneTest
                    extends LazyGenericCollectionHolder {

                    public amountOfCall = 0

                    public override includesOne(...values: readonly unknown[]): boolean {
                        this.amountOfCall++
                        return super.includesOne(...values,)
                    }

                }([],)
                instance.includesOne()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesAll", () => {
                const instance = new class LazyGenericCollectionHolder_IncludesAllTest
                    extends LazyGenericCollectionHolder {

                    public amountOfCall = 0

                    public override includesAll(...values: readonly unknown[]): boolean {
                        this.amountOfCall++
                        return super.includesAll(...values,)
                    }

                }([],)
                instance.includesAll()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("includesNull", () => {
                const instance = new class LazyGenericCollectionHolder_IncludesNullTest
                    extends LazyGenericCollectionHolder {

                    public amountOfCall = 0

                    public override get includesNull(): this["hasNull"] {
                        this.amountOfCall++
                        return super.includesNull
                    }

                }([],)
                instance.includesNull
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsOne", () => {
                const instance = new class LazyGenericCollectionHolder_ContainsOneTest
                    extends LazyGenericCollectionHolder {

                    public amountOfCall = 0

                    public override containsOne(...values: unknown[]): boolean {
                        this.amountOfCall++
                        return super.containsOne(...values,)
                    }

                }([],)
                instance.containsOne()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsAll", () => {
                const instance = new class LazyGenericCollectionHolder_ContainsAllTest
                    extends LazyGenericCollectionHolder {

                    public amountOfCall = 0

                    public override containsAll(...values: unknown[]): boolean {
                        this.amountOfCall++
                        return super.containsAll(...values,)
                    }

                }([],)
                instance.containsAll()
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("containsNull", () => {
                const instance = new class LazyGenericCollectionHolder_ContainsNullTest
                    extends LazyGenericCollectionHolder {

                    public amountOfCall = 0

                    public override get containsNull(): this["hasNull"] {
                        this.amountOfCall++
                        return super.containsNull
                    }

                }([],)
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
