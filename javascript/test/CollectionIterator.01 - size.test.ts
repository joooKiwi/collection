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

import {newEmptyIterator}          from "./helper/newEmptyIterator"
import {CollectionHolderFromArray} from "./instance/CollectionHolderFromArray"
import {sizeValues}                from "./value/sizes"

import {GenericCollectionIterator} from "../src/iterator/GenericCollectionIterator"
import {GenericCollectionIterator_SizeAlias} from "./instance/GenericCollectionIterator_SizeAlias"

describe("CollectionIteratorTest (size)", () => {

    describe("EmptyCollectionIterator", () => {
        test("size",       () => expect(newEmptyIterator().size,).toBe(0,),)
        test("length",     () => expect(newEmptyIterator().length,).toBe(0,),)
        test("count",      () => expect(newEmptyIterator().count,).toBe(0,),)
        test("isEmpty",    () => expect(newEmptyIterator().isEmpty,).toBeTrue(),)
        test("isNotEmpty", () => expect(newEmptyIterator().isNotEmpty,).toBeFalse(),)
    },)

    describe("aliases", () => {
    describe("GenericCollectionIterator", () => {
        describe("length", () => expect(new GenericCollectionIterator_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
        describe("count",  () => expect(new GenericCollectionIterator_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
    },)},)

    describe("GenericCollectionIterator", () => {
    describe.each(sizeValues(),)("%s", ({value: {array, size,},},) => {
        const newInstance = () => new GenericCollectionIterator(new CollectionHolderFromArray(array,),)

        test("size",       () => expect(newInstance().size,).toBe(size,),)
        test("isEmpty",    () => expect(newInstance().isEmpty,)[size == 0 ? 'toBeTrue' : 'toBeFalse'](),)
        test("isNotEmpty", () => expect(newInstance().isNotEmpty,)[size == 0 ? 'toBeFalse' : 'toBeTrue'](),)
    },)},)

},)
