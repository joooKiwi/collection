/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {A, A_NULL_B_UNDEFINED, AB, AB12, AB_AB, AB_OBJECT, ABCD, ABCD_ABCD, ABCD_NULL, ABCD_UNDEFINED, ABCDEFGHIJ, EMPTY, NULL_ABCD, UNDEFINED_ABCD} from "./constantCollections"
import {everyInstances, iterableCreation, TEMPLATE_ITEMS}                                                                                            from "./constantValues"
import {newCollectionInstanceFromCallback}                                                                                                           from "./newCollectionInstance"

describe("CollectionHolderTest (constructor)", () =>
describe.each(everyInstances,)("%s", ({value: instance,},) =>
describe.each(iterableCreation,)("%s", ({value: arrayOrSetCreation,},) => {
    const newCollection = (array: readonly unknown[],) => newCollectionInstanceFromCallback(instance, arrayOrSetCreation, array,).forEach(_ => {},)

    test("empty",                        () => expect(newCollection(EMPTY,),).toBeEmpty(),)
    test("a",                            () => expect(newCollection(A,),).toContainAllValues(A,),)
    test("a, b",                         () => expect(newCollection(AB,),).toContainAllValues(AB,),)
    test("a, b (as object)",             () => expect(newCollection(AB_OBJECT,),).toContainAllValues(AB_OBJECT,),)
    test("a, null, b, undefined",        () => expect(newCollection(A_NULL_B_UNDEFINED,),).toContainAllValues(A_NULL_B_UNDEFINED,),)
    test("a, b, 1, 2",                   () => expect(newCollection(AB12,),).toContainAllValues(AB12,),)
    test("a, b, c, d",                   () => expect(newCollection(ABCD,),).toContainAllValues(ABCD,),)
    test("a, b, A, B",                   () => expect(newCollection(AB_AB,),).toContainAllValues(AB_AB,),)
    test("a, b, c, d, e, f, g, h, i, j", () => expect(newCollection(ABCDEFGHIJ,),).toContainAllValues(ABCDEFGHIJ,),)
    test("a, b, c, d, A, B, C, D",       () => expect(newCollection(ABCD_ABCD,),).toContainAllValues(ABCD_ABCD,),)
    test("null, a, b, c, d",             () => expect(newCollection(NULL_ABCD,),).toContainAllValues(NULL_ABCD,),)
    test("a, b, c, d, null",             () => expect(newCollection(ABCD_NULL,),).toContainAllValues(ABCD_NULL,),)
    test("undefined, a, b, c, d",        () => expect(newCollection(UNDEFINED_ABCD,),).toContainAllValues(UNDEFINED_ABCD,),)
    test("a, b, c, d, undefined",        () => expect(newCollection(ABCD_UNDEFINED,),).toContainAllValues(ABCD_UNDEFINED,),)
    test("[template items]",             () => expect(newCollection(TEMPLATE_ITEMS,),).toContainAllValues(TEMPLATE_ITEMS,),)
},),),)
