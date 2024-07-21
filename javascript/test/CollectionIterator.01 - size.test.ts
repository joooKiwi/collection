/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {GenericCollectionIterator} from "../src/iterator/GenericCollectionIterator"

import {everyCollectionInstanceByIterable, iterableCreation, sizeValues} from "./constantValues"
import {newEmptyIterator}                                                from "./newEmptyIterator"

describe("CollectionIteratorTest (size)", () => {

    describe("EmptyCollectionIterator", () => {
        test("size",   () => expect(newEmptyIterator().size,).toBe(0,),)
        test("length", () => expect(newEmptyIterator().length,).toBe(0,),)
        test("count",  () => expect(newEmptyIterator().length,).toBe(0,),)
    },)
    describe("GenericCollectionIterator", () => {
        describe.each(everyCollectionInstanceByIterable,)("%s", ({value: {newInstance: newCollectionInstance, },},) => {
        describe.each(iterableCreation,)("%s", ({value: iterableCreation,},) => {
        describe.each(sizeValues(),)("%s", ({value: {array, size,},},) => {
            const newInstance = () => new GenericCollectionIterator(newCollectionInstance(iterableCreation, array,),)

            describe("size", () => {
                test("size",   () => expect(newInstance().size,).toBe(size,),)
                test("length", () => expect(newInstance().length,).toBe(size,),)
                test("count",  () => expect(newInstance().count,).toBe(size,),)
            },)
        },)},)},)
    },)

},)
