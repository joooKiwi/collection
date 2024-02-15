/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, EMPTY}     from "./constantCollections"
import {everyInstance} from "./constantValues"

import {CollectionConstants} from "../src/CollectionConstants"

describe("CollectionHolderTest (javascript exclusive)", () => {
describe.each(everyInstance,)("%s", ({value: {newInstance,},},) => {
    describe("Symbol.iterator", () => {
        test("empty",     () => expect(newInstance(EMPTY,)[Symbol.iterator](),).toBe(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)

        const iterator = newInstance(AB,)[Symbol.iterator]()
        test("1st: a",    () => expect(iterator.next().value,).toBe('a',),)
        test("2nd: b",    () => expect(iterator.next().value,).toBe('b',),)
        test("3rd: done", () => expect(iterator.next().done,).toBe(true,),)
    },)
},)},)
