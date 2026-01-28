//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import {AB, EMPTY}      from "./value/arrays"
import {everyInstances} from "./value/instances"

import {CollectionConstants}       from "../src/CollectionConstants"
import {EmptyCollectionHolder}     from "../src/EmptyCollectionHolder"
import {GenericCollectionIterator} from "../src/iterator/GenericCollectionIterator"

describe("CollectionHolderTest (javascript exclusive)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("Symbol.toStringTag", () => expect(instance[Symbol.toStringTag],).toEqual(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
        test("Symbol.iterator",    () => expect(instance[Symbol.iterator](),).toEqual(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
    },)

    describe("instances", () => {
    describe.each(everyInstances,)("%s", ({value: {instance,},},) => {
        describe("Symbol.toStringTag", () => expect(new instance(EMPTY,)[Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
        describe("Symbol.iterator", () => {
            test("empty",     () => expect(new instance(EMPTY,)[Symbol.iterator](),).toBe(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
            test("non-empty", () => expect(new instance(AB,)[Symbol.iterator](),).toBeInstanceOf(GenericCollectionIterator,),)
        },)
    },)},)

},)
