/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {CollectionConstants}                       from "../src/CollectionConstants"
import {EmptyCollectionIterator}                   from "../src/iterator/EmptyCollectionIterator"
import {GenericCollectionIterator}                 from "../src/iterator/GenericCollectionIterator"

import {ABCDEFGHIJ}                                          from "./constantCollections"
import {everyCollectionInstanceByIterable, iterableCreation} from "./constantValues"
import {newEmptyIterator}                                    from "./newEmptyIterator"

describe("CollectionIteratorTest (javascript exclusive)", () => {

    describe("EmptyCollectionIterator", () => {
        let instance: EmptyCollectionIterator

        beforeEach(() => instance = newEmptyIterator(),)
        test("Symbol.toStringTag", () => expect(instance[Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_ITERATOR_TO_STRING_TAG,),)
        test("Symbol.iterator", () => expect(instance[Symbol.iterator](),).toBe(instance,),)
    },)
    describe("GenericCollectionIterator", () => {
        describe.each(everyCollectionInstanceByIterable,)("%s", ({value: {newInstance: newCollectionInstance, },},) => {
        describe.each(iterableCreation,)("%s", ({value: iterableCreation,},) => {
            const newInstance = () => new GenericCollectionIterator(newCollectionInstance(iterableCreation, ABCDEFGHIJ,),)

            test("Symbol.toStringTag", () => expect(newInstance()[Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_ITERATOR_TO_STRING_TAG,),)
            test("Symbol.iterator", () => {
                const instance = newInstance()
                expect(instance[Symbol.iterator](),).not.toBe(instance,)
            },)
        },)},)
    },)

},)
