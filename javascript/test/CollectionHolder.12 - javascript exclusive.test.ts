/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB}                    from "./constantCollections"
import {everyInstances}        from "./constantValues"
import {newCollectionInstance} from "./newCollectionInstance"

describe("CollectionHolderTest (javascript exclusive)", () =>
describe.each(everyInstances,)("%s", ({value: instance,},) => {
    describe("Symbol.iterator", () => {
        const iterator = newCollectionInstance(instance, AB,)[Symbol.iterator]()
        test("1st: a",    () => expect(iterator.next().value,).toBe('a',),)
        test("2nd: b",    () => expect(iterator.next().value,).toBe('b',),)
        test("3rd: done", () => expect(iterator.next().done,).toBe(true,),)
    },)
},),)
