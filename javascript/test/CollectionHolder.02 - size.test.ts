/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {everyCollectionInstance, sizeValues}   from "./constantValues"
import {GenericCollectionHolder_SizeAlias}     from "./instance/GenericCollectionHolder_SizeAlias"
import {LazyGenericCollectionHolder_SizeAlias} from "./instance/LazyGenericCollectionHolder_SizeAlias"

describe("CollectionHolderTest (size)", () => {

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("length", () => {
                const instance = new GenericCollectionHolder_SizeAlias()
                instance.length
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("count", () => {
                const instance = new GenericCollectionHolder_SizeAlias()
                instance.count
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("length", () => {
                const instance = new LazyGenericCollectionHolder_SizeAlias()
                instance.length
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("count", () => {
                const instance = new LazyGenericCollectionHolder_SizeAlias()
                instance.count
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
    },)

    describe.each(everyCollectionInstance,)("%s", ({value: {isMinimalist, newInstance,},},) => {
    describe.each(sizeValues(),)("%s", ({value: {array, size,},},) => {
        test("size", () => expect(newInstance(array,).size,).toEqual(size,),)
        if (!isMinimalist) {
            test("isEmpty", () => expect(newInstance(array,).isEmpty,).toBe(size == 0,),)
            test("isNotEmpty", () => expect(newInstance(array,).isNotEmpty,).toBe(size != 0,),)
        }
    },)},)

},)
