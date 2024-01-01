/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {everySimplisticInstances, sizeValues}                   from "./constantValues"
import {newCollectionInstance, newSimplisticCollectionInstance} from "./newCollectionInstance"
import {GenericMinimalistCollectionHolder}                      from "../src/GenericMinimalistCollectionHolder"

describe("CollectionHolderTest (size)", () =>
describe.each(everySimplisticInstances,)("%s", ({value: instance,},) =>
describe.each(sizeValues(),)("%s", ({value: {array, size,},},) => {
    if (instance === GenericMinimalistCollectionHolder) {
        test("size",       () => expect(newSimplisticCollectionInstance(instance, array,).size,).toEqual(size,),)
        test("isEmpty",    () => expect(newSimplisticCollectionInstance(instance, array,).isEmpty,).toBe(size == 0,),)
        return
    }
    test("size",       () => expect(newCollectionInstance(instance, array,).size,).toEqual(size,),)
    test("length",     () => expect(newCollectionInstance(instance, array,).length,).toEqual(size,),)
    test("count",      () => expect(newCollectionInstance(instance, array,).count,).toEqual(size,),)
    test("isEmpty",    () => expect(newCollectionInstance(instance, array,).isEmpty,).toBe(size == 0,),)
    test("isNotEmpty", () => expect(newCollectionInstance(instance, array,).isNotEmpty,).toBe(size != 0,),)
},),),)
