/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, ABCD, EMPTY}                         from "./constantCollections"
import {everyInstance}                           from "./constantValues"
import {CollectionHolderThatCountGetBeingCalled} from "./instance/CollectionHolderThatCountGetBeingCalled"
import {GenericCollectionHolder_AllAlias}        from "./instance/GenericCollectionHolder_AllAlias"
import {GenericCollectionHolder_AnyAlias}        from "./instance/GenericCollectionHolder_AnyAlias"
import {LazyGenericCollectionHolder_AnyAlias}    from "./instance/LazyGenericCollectionHolder_AnyAlias"
import {LazyGenericCollectionHolder_AllAlias}    from "./instance/LazyGenericCollectionHolder_AllAlias"

describe("CollectionHolderTest (all / any / none)", () => {

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("every", () => {
                const instance = new GenericCollectionHolder_AllAlias()
                instance.every(() => false,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("some", () => {
                const instance = new GenericCollectionHolder_AnyAlias()
                instance.some(() => false,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("every", () => {
                const instance = new LazyGenericCollectionHolder_AllAlias()
                instance.every(() => false,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("some", () => {
                const instance = new LazyGenericCollectionHolder_AnyAlias()
                instance.some(() => false,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
    },)

    describe.each(everyInstance,)("%s", ({value: {newInstance, isMinimalist, isExtensionOnly,},},) => {
        describe("get() being called", () => {
            describe("all", () => {
                test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.all(() => true,),).amountOfCall,).toBe(0,),)
                test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.all(_ => true,),).amountOfCall,).toBe(2,),)
                test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.all((_1, _2,) => true,),).amountOfCall,).toBe(2,),)
            },)
            describe("any", () => {
                test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.any(() => false,),).amountOfCall,).toBe(0,),)
                test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.any(_ => false,),).amountOfCall,).toBe(2,),)
                test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.any((_1, _2,) => false,),).amountOfCall,).toBe(2,),)
            },)
            describe("none", () => {
                test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.none(() => false,),).amountOfCall,).toBe(0,),)
                test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.none(_ => false,),).amountOfCall,).toBe(2,),)
                test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.none((_1, _2,) => false,),).amountOfCall,).toBe(2,),)
            },)
        },)

        describe("all", () => {
            test("a|b on [a,b]",     () => expect(newInstance(AB,).all(it => it === 'a' || it === 'b'),).toBeTrue(),)
            test("c|d on [a,b]",     () => expect(newInstance<string>(AB,).all(it => it === 'c' || it === 'd'),).toBeFalse(),)
            test("a|b on [a,b,c,d]", () => expect(newInstance(ABCD,).all(it => it === 'a' || it === 'b'),).toBeFalse(),)
        },)

        describe("any", () => {
            if (!isExtensionOnly || isMinimalist) // The method "isNotEmpty" should not be tested for the "CollectionHolder_FromExtensionFunction".
                describe("no parameter", () => {
                    test("[]",    () => expect(newInstance(EMPTY,).any(),).toBeFalse(),)
                    test("[a,b]", () => expect(newInstance(AB,).any(),).toBeTrue(),)
                },)
            describe("predicate", () => {
                test("a|b on [a,b]",     () => expect(newInstance(AB,).any(it => it === "a" || it === "b"),).toBeTrue(),)
                test("c|d on [a,b]",     () => expect(newInstance<string>(AB,).any(it => it === 'c' || it === 'd'),).toBeFalse(),)
                test("a|b on [a,b,c,d]", () => expect(newInstance(ABCD,).any(it => it === 'a' || it === 'b'),).toBeTrue(),)
            },)
        },)

        describe("none", () => {
            describe("no parameter", () => {
                test("[]",    () => expect(newInstance(EMPTY,).none(),).toBeTrue(),)
                test("[a,b]", () => expect(newInstance(AB,).none(),).toBeFalse(),)
            },)
            describe("predicate", () => {
                test("a|b on [a,b]",     () => expect(newInstance(AB,).none(it => it === 'a' || it === 'b'),).toBeFalse(),)
                test("c|d on [a,b]",     () => expect(newInstance<string>(AB,).none(it => it === 'c' || it === 'd'),).toBeTrue(),)
                test("a|b on [a,b,c,d]", () => expect(newInstance(ABCD,).none(it => it === 'a' || it === 'b'),).toBeFalse(),)
            },)
        },)
    },)

},)
