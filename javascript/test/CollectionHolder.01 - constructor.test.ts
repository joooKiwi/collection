/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {A, A_NULL_B_UNDEFINED, AB, AB12, AB_AB, AB_OBJECT, ABCD, ABCD_ABCD, ABCD_NULL, ABCD_UNDEFINED, ABCDEFGHIJ, EMPTY, NULL_ABCD, UNDEFINED_ABCD} from "./constantCollections"
import {everyInstances, iterableCreation, TEMPLATE_ITEMS}                                                                                            from "./constantValues"
import {newCollectionInstanceFromCallback}                                                                                                           from "./newCollectionInstance"

describe("CollectionHolderTest (constructor)", () =>
describe.each(everyInstances,)("%s", ({value: instance,},) =>
describe.each(iterableCreation,)("%s", ({value: arrayOrSetCreation,},) => {
    test("empty",                        () => expect(newCollectionInstanceFromCallback(instance, arrayOrSetCreation, EMPTY,).toArray(),).toEqual(EMPTY,),)
    test("a",                            () => expect(newCollectionInstanceFromCallback(instance, arrayOrSetCreation, A,).toArray(),).toEqual(A,),)
    test("a, b",                         () => expect(newCollectionInstanceFromCallback(instance, arrayOrSetCreation, AB,).toArray(),).toEqual(AB,),)
    test("a, b (as object)",             () => expect(newCollectionInstanceFromCallback(instance, arrayOrSetCreation, AB_OBJECT,).toArray(),).toEqual(AB_OBJECT,),)
    test("a, null, b, undefined",        () => expect(newCollectionInstanceFromCallback(instance, arrayOrSetCreation, A_NULL_B_UNDEFINED,).toArray(),).toEqual(A_NULL_B_UNDEFINED,),)
    test("a, b, 1, 2",                   () => expect(newCollectionInstanceFromCallback(instance, arrayOrSetCreation, AB12,).toArray(),).toEqual(AB12,),)
    test("a, b, c, d",                   () => expect(newCollectionInstanceFromCallback(instance, arrayOrSetCreation, ABCD,).toArray(),).toEqual(ABCD,),)
    test("a, b, A, B",                   () => expect(newCollectionInstanceFromCallback(instance, arrayOrSetCreation, AB_AB,).toArray(),).toEqual(AB_AB,),)
    test("a, b, c, d, e, f, g, h, i, j", () => expect(newCollectionInstanceFromCallback(instance, arrayOrSetCreation, ABCDEFGHIJ,).toArray(),).toEqual(ABCDEFGHIJ,),)
    test("a, b, c, d, A, B, C, D",       () => expect(newCollectionInstanceFromCallback(instance, arrayOrSetCreation, ABCD_ABCD,).toArray(),).toEqual(ABCD_ABCD,),)
    test("null, a, b, c, d",             () => expect(newCollectionInstanceFromCallback(instance, arrayOrSetCreation, NULL_ABCD,).toArray(),).toEqual(NULL_ABCD,),)
    test("a, b, c, d, null",             () => expect(newCollectionInstanceFromCallback(instance, arrayOrSetCreation, ABCD_NULL,).toArray(),).toEqual(ABCD_NULL,),)
    test("undefined, a, b, c, d",        () => expect(newCollectionInstanceFromCallback(instance, arrayOrSetCreation, UNDEFINED_ABCD,).toArray(),).toEqual(UNDEFINED_ABCD,),)
    test("a, b, c, d, undefined",        () => expect(newCollectionInstanceFromCallback(instance, arrayOrSetCreation, ABCD_UNDEFINED,).toArray(),).toEqual(ABCD_UNDEFINED,),)
    test("[template items]",             () => expect(newCollectionInstanceFromCallback(instance, arrayOrSetCreation, TEMPLATE_ITEMS,).toArray(),).toEqual(TEMPLATE_ITEMS,),)
},),),)
