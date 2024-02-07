/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {everySimplisticInstances, sizeValues} from "./constantValues"
import {newCollectionInstance}                from "./newCollectionInstance"
import {GenericMinimalistCollectionHolder}    from "../src/GenericMinimalistCollectionHolder"
import {LazyGenericCollectionHolder}          from "../src/LazyGenericCollectionHolder"
import {GenericCollectionHolder}              from "../src/GenericCollectionHolder"

describe("CollectionHolderTest (size)", () => {

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("length", () => {
                const instance = new class GenericCollectionHolder_LengthTest
                    extends GenericCollectionHolder {

                    public amountOfCall = 0

                    public override get length(): this["size"] {
                        this.amountOfCall++
                        return super.length
                    }

                }([],)
                instance.length
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("count", () => {
                const instance = new class GenericCollectionHolder_CountTest
                    extends GenericCollectionHolder {

                    public amountOfCall = 0

                    public override get count(): this["size"] {
                        this.amountOfCall++
                        return super.count
                    }

                }([],)
                instance.count
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("length", () => {
                const instance = new class LazyGenericCollectionHolder_LengthTest
                    extends LazyGenericCollectionHolder {

                    public amountOfCall = 0

                    public override get length(): this["size"] {
                        this.amountOfCall++
                        return super.length
                    }

                }([],)
                instance.length
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("count", () => {
                const instance = new class LazyGenericCollectionHolder_CountTest
                    extends LazyGenericCollectionHolder {

                    public amountOfCall = 0

                    public override get count(): this["size"] {
                        this.amountOfCall++
                        return super.count
                    }

                }([],)
                instance.count
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
    },)

    describe.each(everySimplisticInstances,)("%s", ({value: instance,},) =>
        describe.each(sizeValues(),)("%s", ({value: {array, size,},},) => {
            test("size", () => expect(newCollectionInstance(instance, array,).size,).toEqual(size,),)
            test("isEmpty", () => expect(newCollectionInstance(instance, array,).isEmpty,).toBe(size == 0,),)
            if (instance !== GenericMinimalistCollectionHolder)
                test("isNotEmpty", () => expect(newCollectionInstance(instance, array,).isNotEmpty,).toBe(size != 0,),)
        },),)

},)
