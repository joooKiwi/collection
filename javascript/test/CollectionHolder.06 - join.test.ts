/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB}                    from "./constantCollections"
import {everyInstances,}       from "./constantValues"
import {newCollectionInstance} from "./newCollectionInstance"

describe("CollectionHolderTest (join)", () =>
describe.each(everyInstances,)("%s", ({value: instance,},) => {
    const INSTANCE = () => newCollectionInstance(instance, AB,)


    test("nothing",                        () => expect(INSTANCE().join(),).toBe("[a, b]",),)
    test("separator = ;",                  () => expect(INSTANCE().join(";",),).toBe("[a;b]",),)
    test("prefix =  <",                    () => expect(INSTANCE().join(null, "<",),).toBe("<a, b]",),)
    test("postfix =  >",                   () => expect(INSTANCE().join(null, null, ">",),).toBe("[a, b>",),)
    test("limit =  1",                     () => expect(INSTANCE().join(null, null, null, 1,),).toBe("[a, …]",),)
    test("truncated = \"...\"",            () => expect(INSTANCE().join(null, null, null, null, "...",),).toBe("[a, b]",),)
    test("limit = 1, truncated = \"...\"", () => expect(INSTANCE().join(null, null, null, 1, "...",),).toBe("[a, ...]",),)
    test("transform = it => toUpperCase",  () => expect(INSTANCE().join(null, null, null, null, null, it => it.toUpperCase(),),).toBe("[A, B]",),)
},),)
