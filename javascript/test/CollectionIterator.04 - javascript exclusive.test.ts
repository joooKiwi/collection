/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {newEmptyIterator}          from "./helper/newEmptyIterator"
import {CollectionHolderFromArray} from "./instance/CollectionHolderFromArray"
import {ABCD}                      from "./value/arrays"

import {CollectionConstants}       from "../src/CollectionConstants"
import {GenericCollectionIterator} from "../src/iterator/GenericCollectionIterator"

describe("CollectionIteratorTest (javascript exclusive)", () => {

    describe("EmptyCollectionIterator", () => {
        test("Symbol.toStringTag", () => expect(newEmptyIterator()[Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_ITERATOR_TO_STRING_TAG,),)
        test("Symbol.iterator", () => {
            const instance = newEmptyIterator()
            expect(instance[Symbol.iterator](),).toBe(instance,)
        },)
    },)
    describe("GenericCollectionIterator", () => {
        const newInstance = () => new GenericCollectionIterator(new CollectionHolderFromArray(ABCD,),)

        test("Symbol.toStringTag", () => expect(newInstance()[Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_ITERATOR_TO_STRING_TAG,),)
        test("Symbol.iterator", () => {
            const instance = newInstance()
            expect(instance[Symbol.iterator](),).not.toBe(instance,)
        },)
    },)

},)
