/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {everySimplisticInstances, sizeValues}  from "./constantValues"
import {newCollectionInstance}                 from "./newCollectionInstance"
import {GenericCollectionHolder_SizeAlias}     from "./instance/GenericCollectionHolder_SizeAlias"
import {LazyGenericCollectionHolder_SizeAlias} from "./instance/LazyGenericCollectionHolder_SizeAlias"

import {GenericMinimalistCollectionHolder} from "../src/GenericMinimalistCollectionHolder"

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

    describe.each(everySimplisticInstances,)("%s", ({value: instance,},) =>
        describe.each(sizeValues(),)("%s", ({value: {array, size,},},) => {
            test("size", () => expect(newCollectionInstance(instance, array,).size,).toEqual(size,),)
            if (instance !== GenericMinimalistCollectionHolder) {
                test("isEmpty", () => expect(newCollectionInstance(instance, array,).isEmpty,).toBe(size == 0,),)
                test("isNotEmpty", () => expect(newCollectionInstance(instance, array,).isNotEmpty,).toBe(size != 0,),)
            }
        },),)

},)
