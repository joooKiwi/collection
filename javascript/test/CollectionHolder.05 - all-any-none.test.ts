/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, ABCD, EMPTY}       from "./constantCollections"
import {everyInstances}        from "./constantValues"
import {newCollectionInstance} from "./newCollectionInstance"

describe("CollectionHolderTest (all / any / none)", () =>
describe.each(everyInstances,)("%s", ({value: instance,},) => {
    //#region -------------------- Instances --------------------

    const EMPTY_INSTANCE = () => newCollectionInstance(instance, EMPTY,)
    const AB_INSTANCE = () => newCollectionInstance(instance, AB,)
    const ABCD_INSTANCE = () => newCollectionInstance(instance, ABCD,)

    //#endregion -------------------- Instances --------------------

    describe("all", () => {
        test("[a,b].all(a|b) == true",      () => expect(AB_INSTANCE().all(it => it === 'a' || it === 'b'),).toBeTrue(),)
        test("[a,b].all(c|d) == false",     () => expect(AB_INSTANCE().all((it: string) => it === 'c' || it === 'd'),).toBeFalse(),)
        test("[a,b,c,d].all(a|b) == false", () => expect(ABCD_INSTANCE().all(it => it === 'a' || it === 'b'),).toBeFalse(),)
    },)
    describe("any", () => {
        test("[].any() == false",          () => expect(EMPTY_INSTANCE().any(),).toBeFalse(),)
        test("[a,b].any() == true",        () => expect(AB_INSTANCE().any(),).toBeTrue(),)

        test("[a,b].any(a|b) == true",     () => expect(AB_INSTANCE().any(it => it === 'a' || it === 'b'),).toBeTrue(),)
        test("[a,b].any(c|d) == false",    () => expect(AB_INSTANCE().any((it: string) => it === 'c' || it === 'd'),).toBeFalse(),)
        test("[a,b,c,d].any(a|b) == true", () => expect(ABCD_INSTANCE().any(it => it === 'a' || it === 'b'),).toBeTrue(),)
    },)
    describe("none", () => {
        test("[].none() == true",            () => expect(EMPTY_INSTANCE().none(),).toBeTrue(),)
        test("[a,b].none() == false",        () => expect(AB_INSTANCE().none(),).toBeFalse(),)

        test("[a,b].none(a|b) == false",     () => expect(AB_INSTANCE().none(it => it === 'a' || it === 'b'),).toBeFalse(),)
        test("[a,b].none(c|d) == true",      () => expect(AB_INSTANCE().none((it: string) => it === 'c' || it === 'd'),).toBeTrue(),)
        test("[a,b,c,d].none(a|b) == false", () => expect(ABCD_INSTANCE().none(it => it === 'a' || it === 'b'),).toBeFalse(),)
    },)
},),)
