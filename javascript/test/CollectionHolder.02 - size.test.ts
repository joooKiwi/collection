/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {everyInstances, sizeValues} from "./constantValues"
import {newCollectionInstance}      from "./newCollectionInstance"

describe("CollectionHolderTest (size)", () =>
describe.each(everyInstances,)("%s", ({value: instance,},) =>
describe.each(sizeValues(),)("%s", ({value: {array, size,},},) => {
    const newInstance = () => newCollectionInstance(instance, array,)

    test("size",       () => expect(newInstance().size,).toEqual(size,),)
    test("length",     () => expect(newInstance().length,).toEqual(size,),)
    test("count",      () => expect(newInstance().count,).toEqual(size,),)
    test("isEmpty",    () => expect(newInstance().isEmpty,).toBe(size == 0,),)
    test("isNotEmpty", () => expect(newInstance().isNotEmpty,).toBe(size != 0,),)
},),),)
