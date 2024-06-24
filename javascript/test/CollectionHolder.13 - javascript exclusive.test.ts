/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, EMPTY}     from "./constantCollections"
import {everyInstance} from "./constantValues"

import {CollectionConstants}       from "../src/CollectionConstants"
import {GenericCollectionIterator} from "../src/iterator/GenericCollectionIterator"

describe("CollectionHolderTest (javascript exclusive)", () => {
describe.each(everyInstance,)("%s", ({value: {newInstance,},},) => {
    describe("Symbol.toStringTag", () => expect(newInstance(EMPTY,)[Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
    describe("Symbol.iterator", () => {
        test("empty",     () => expect(newInstance(EMPTY,)[Symbol.iterator](),).toBe(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
        test("non-empty", () => expect(newInstance(AB,).toIterator(),).toBeInstanceOf(GenericCollectionIterator,),)
    },)
},)},)
