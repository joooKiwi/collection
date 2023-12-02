/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {CollectionHolderThatCannotRetrieveByGet} from "./CollectionHolderThatCannotRetrieveByGet"
import {AB, ABCD, EMPTY}                         from "./constantCollections"
import {everyInstances}                          from "./constantValues"
import {newCollectionInstance}                   from "./newCollectionInstance"

describe("CollectionHolderTest (all / any / none)", () =>
describe.each(everyInstances,)("%s", ({value: instance,},) => {
    //#region -------------------- Instances --------------------

    const EMPTY_INSTANCE = () => newCollectionInstance(instance, EMPTY,)
    const AB_INSTANCE = () => newCollectionInstance(instance, AB,)
    const ABCD_INSTANCE = () => newCollectionInstance(instance, ABCD,)

    //#endregion -------------------- Instances --------------------

    describe("all", () => {
        describe("get() being called", () => {
            test("() => {}",    () => expect(() => new CollectionHolderThatCannotRetrieveByGet(AB_INSTANCE(),).all(() => false,),).not.toThrow(),)
            test("(1) => {}",   () => expect(() => new CollectionHolderThatCannotRetrieveByGet(AB_INSTANCE(),).all(_ => false,),).toThrow(),)
            test("(1,2) => {}", () => expect(() => new CollectionHolderThatCannotRetrieveByGet(AB_INSTANCE(),).all((_1, _2,) => false,),).toThrow(),)
        },)

        test("a|b on [a,b]",     () => expect(AB_INSTANCE().all(it => it === 'a' || it === 'b'),).toBeTrue(),)
        test("c|d on [a,b]",     () => expect(AB_INSTANCE().all((it: string) => it === 'c' || it === 'd'),).toBeFalse(),)
        test("a|b on [a,b,c,d]", () => expect(ABCD_INSTANCE().all(it => it === 'a' || it === 'b'),).toBeFalse(),)
    },)


    describe("any", () => {
        describe("no parameter", () => {
            test("[]",    () => expect(EMPTY_INSTANCE().any(),).toBeFalse(),)
            test("[a,b]", () => expect(AB_INSTANCE().any(),).toBeTrue(),)
        },)
        describe("predicate", () => {
            describe("get() being called", () => {
                test("() => {}",    () => expect(() => new CollectionHolderThatCannotRetrieveByGet(AB_INSTANCE(),).any(() => false,),).not.toThrow(),)
                test("(1) => {}",   () => expect(() => new CollectionHolderThatCannotRetrieveByGet(AB_INSTANCE(),).any(_ => false,),).toThrow(),)
                test("(1,2) => {}", () => expect(() => new CollectionHolderThatCannotRetrieveByGet(AB_INSTANCE(),).any((_1, _2,) => false,),).toThrow(),)
            },)

            test("a|b on [a,b]",     () => expect(AB_INSTANCE().any(it => it === "a" || it === "b"),).toBeTrue(),)
            test("c|d on [a,b]",     () => expect(AB_INSTANCE().any((it: string) => it === 'c' || it === 'd'),).toBeFalse(),)
            test("a|b on [a,b,c,d]", () => expect(ABCD_INSTANCE().any(it => it === 'a' || it === 'b'),).toBeTrue(),)
        },)
    },)


    describe("none", () => {
        describe("no parameter", () => {
            test("[]",    () => expect(EMPTY_INSTANCE().none(),).toBeTrue(),)
            test("[a,b]", () => expect(AB_INSTANCE().none(),).toBeFalse(),)
        },)
        describe("predicate", () => {
            describe("get() being called", () => {
                test("() => {}",    () => expect(() => new CollectionHolderThatCannotRetrieveByGet(AB_INSTANCE(),).none(() => false,),).not.toThrow(),)
                test("(1) => {}",   () => expect(() => new CollectionHolderThatCannotRetrieveByGet(AB_INSTANCE(),).none(_ => false,),).toThrow(),)
                test("(1,2) => {}", () => expect(() => new CollectionHolderThatCannotRetrieveByGet(AB_INSTANCE(),).none((_1, _2,) => false,),).toThrow(),)
            },)

            test("a|b on [a,b]",     () => expect(AB_INSTANCE().none(it => it === 'a' || it === 'b'),).toBeFalse(),)
            test("c|d on [a,b]",     () => expect(AB_INSTANCE().none((it: string) => it === 'c' || it === 'd'),).toBeTrue(),)
            test("a|b on [a,b,c,d]", () => expect(ABCD_INSTANCE().none(it => it === 'a' || it === 'b'),).toBeFalse(),)
        },)
    },)
},),)
