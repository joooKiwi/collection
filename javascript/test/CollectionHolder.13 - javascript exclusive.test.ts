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
    describe("Symbol.toStringTag", () => expect(newInstance(EMPTY,)[Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
    describe("Symbol.iterator", () => {
        test("empty",     () => expect(newInstance(EMPTY,)[Symbol.iterator](),).toBe(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)

        const newIterator = () => newInstance(AB,)[Symbol.iterator]()
        test("1st", () => {
            const value = newIterator().next()
            expect(value.value,).toBe("a",)
            expect(value.done,).toBeFalse()
        },)
        test("2nd", () => {
            const iterator = newIterator()
            iterator.next()
            const value = iterator.next()
            expect(value.value,).toBe("b",)
            expect(value.done,).toBeFalse()
        },)
        test("3rd", () => {
            const iterator = newIterator()
            iterator.next()
            iterator.next()
            const value = iterator.next()
            expect(value.value,).toBe(CollectionConstants.AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL,)
            expect(value.done,).toBeTrue()
        },)
        test("4th", () => {
            const iterator = newIterator()
            iterator.next()
            iterator.next()
            iterator.next()
            const value = iterator.next()
            expect(value.value,).toBe(CollectionConstants.AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL,)
            expect(value.done,).toBeTrue()
        },)
    },)
},)},)
