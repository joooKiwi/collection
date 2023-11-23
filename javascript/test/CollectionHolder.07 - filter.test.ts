/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {A_NULL_B_UNDEFINED, AB, AB12, ABCD} from "./constantCollections"
import {everyInstances}                     from "./constantValues"
import {newCollectionInstance}              from "./newCollectionInstance"

describe("CollectionHolderTest (filter)", () =>
describe.each(everyInstances,)("%s", ({value: instance,},) => {
    //#region -------------------- Instances --------------------

    const AB_INSTANCE = () => newCollectionInstance(instance, AB,)
    const A_NULL_B_UNDEFINED_INSTANCE = () => newCollectionInstance(instance, A_NULL_B_UNDEFINED,)
    const AB12_INSTANCE = () => newCollectionInstance(instance, AB12,)
    const ABCD_INSTANCE = () => newCollectionInstance(instance, ABCD,)

    //#endregion -------------------- Instances --------------------

    describe("filter", () => {
        test("[a,b,c,d].filter(d) == [d]",               () => expect(ABCD_INSTANCE().filter(it => it === 'd',).toArray(),).toEqual(['d',],),)
        test("[a,b,c,d].filterIndexed(3) == [d]",        () => expect(ABCD_INSTANCE().filterIndexed(it => it === 3,).toArray(),).toEqual(['d',],),)
        test("[a,b,c,d].filterNot(d) == [a,b,c]",        () => expect(ABCD_INSTANCE().filterNot(it => it === 'd',).toArray(),).toEqual(['a', 'b', 'c',],),)
        test("[a,b,c,d].filterIndexedNot(3) == [a,b,c]", () => expect(ABCD_INSTANCE().filterIndexedNot(it => it === 3,).toArray(),).toEqual(['a', 'b', 'c',],),)
        test("[a,b,1,2].filter(number) == [1,2]",        () => expect(AB12_INSTANCE().filter(it => typeof it == "number",).toArray(),).toEqual([1, 2,],),)
        test("[a,b,1,2].filterNot(number) == [a,b]",     () => expect(AB12_INSTANCE().filterNot(it => typeof it == "number",).toArray(),).toEqual(['a', 'b',],),)
    },)

    describe("filterNotNull", () => {
        test("[a,null,b,undefined].filterNotNull() == [a,b]",                     () => expect(A_NULL_B_UNDEFINED_INSTANCE().filterNotNull().toArray(),).toEqual(['a', 'b',],),)
        test("[a,null,b,undefined].filterNotNull() != this",                      () => expect(A_NULL_B_UNDEFINED_INSTANCE().filterNotNull(),).not.toEqual(A_NULL_B_UNDEFINED_INSTANCE(),),)
        test("[a,null,b,undefined].filterNot(null).filterNotNull() != this",      () => expect(A_NULL_B_UNDEFINED_INSTANCE().filterNot(it => it === null).filterNotNull().toArray(),).not.toEqual(['a', null, 'b', undefined,],),)
        test("[a,null,b,undefined].filterNot(undefined).filterNotNull() != this", () => expect(A_NULL_B_UNDEFINED_INSTANCE().filterNot(it => it === undefined).filterNotNull().toArray(),).not.toEqual(['a', null, 'b', undefined,],),)
        test("[a,b].filterNotNull() == this",                                     () => expect(AB_INSTANCE().filterNotNull().toArray(),).toEqual(['a', 'b',],),)
    },)
    describe("requireNoNulls", () => {
        test("[a,null,b,undefined].requireNotNull() → throw",                      () => expect(() => A_NULL_B_UNDEFINED_INSTANCE().requireNoNulls(),).toThrow(TypeError,),)
        test("[a,null,b,undefined].filterNot(null).requireNotNull() → throw",      () => expect(() => A_NULL_B_UNDEFINED_INSTANCE().filterNot(it => it === null).requireNoNulls(),).toThrow(TypeError,),)
        test("[a,null,b,undefined].filterNot(undefined).requireNotNull() → throw", () => expect(() => A_NULL_B_UNDEFINED_INSTANCE().filterNot(it => it === undefined).requireNoNulls(),).toThrow(TypeError),)
        test("[a,null,b,undefined].filterNonNull().requireNotNull() → no throw",   () => expect(() => A_NULL_B_UNDEFINED_INSTANCE().filterNotNull().requireNoNulls().toArray(),).not.toThrow(),)
        test("[a,b].requireNotNull() -> no throw",                                 () => expect(() => AB_INSTANCE().requireNoNulls(),).not.toThrow(),)
    },)
},),)
