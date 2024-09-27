/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {EmptyCollectionHolderForTest}               from "./instance/EmptyCollectionHolderForTest"
import {AB, EMPTY}                                  from "./value/arrays"
import {everyCollectionInstancesAsCollectionHolder} from "./value/instances"

import {CollectionConstants}       from "../src/CollectionConstants"
import {GenericCollectionIterator} from "../src/iterator/GenericCollectionIterator"

describe("CollectionHolderTest (javascript exclusive)", () => {

    describe("EmptyCollectionHolder", () => {
        test("Symbol.toStringTag", () => expect(new EmptyCollectionHolderForTest()[Symbol.toStringTag],).toEqual(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
        test("Symbol.iterator",    () => expect(new EmptyCollectionHolderForTest()[Symbol.iterator](),).toEqual(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
    },)

    describe.each(everyCollectionInstancesAsCollectionHolder,)("%s", ({value: {instance,},},) => {
        describe("Symbol.toStringTag", () => expect(new instance(EMPTY,)[Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
        describe("Symbol.iterator", () => {
            test("empty",     () => expect(new instance(EMPTY,)[Symbol.iterator](),).toBe(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
            test("non-empty", () => expect(new instance(AB,)[Symbol.iterator](),).toBeInstanceOf(GenericCollectionIterator,),)
        },)
    },)

},)
