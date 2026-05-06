//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import {ArrayAsCollectionHolder_SizeAlias}                                                                 from "./instance/ArrayAsCollectionHolder_SizeAlias"
import {ArrayOf1AsCollectionHolder_SizeAlias}                                                              from "./instance/ArrayOf1AsCollectionHolder_SizeAlias"
import {ArrayOf2AsCollectionHolder_SizeAlias}                                                              from "./instance/ArrayOf2AsCollectionHolder_SizeAlias"
import {CollectionHolderOf1_SizeAlias}                                                                     from "./instance/CollectionHolderOf1_SizeAlias"
import {CollectionHolderOf2_SizeAlias}                                                                     from "./instance/CollectionHolderOf2_SizeAlias"
import {CollectionViewer_SizeAlias}                                                                        from "./instance/CollectionViewer_SizeAlias"
import {GenericCollectionHolder_SizeAlias}                                                                 from "./instance/GenericCollectionHolder_SizeAlias"
import {IteratorAsCollectionHolder_SizeAlias}                                                              from "./instance/IteratorAsCollectionHolder_SizeAlias"
import {JsIteratorAsCollectionHolder_SizeAlias}                                                            from "./instance/JsIteratorAsCollectionHolder_SizeAlias"
import {JsIterableAsCollectionHolder_SizeAlias}                                                            from "./instance/JsIterableAsCollectionHolder_SizeAlias"
import {LazyCollectionHolder_SizeAlias}                                                                    from "./instance/LazyCollectionHolder_SizeAlias"
import {LazyCollectionHolderOf0Or1_SizeAlias}                                                              from "./instance/LazyCollectionHolderOf0Or1_SizeAlias"
import {LazyCollectionHolderOf0Or1Or2_SizeAlias}                                                           from "./instance/LazyCollectionHolderOf0Or1Or2_SizeAlias"
import {LazyCollectionHolderOf1_SizeAlias}                                                                 from "./instance/LazyCollectionHolderOf1_SizeAlias"
import {LazyCollectionHolderOf1Or2_SizeAlias}                                                              from "./instance/LazyCollectionHolderOf1Or2_SizeAlias"
import {LazyCollectionHolderOf2_SizeAlias}                                                                 from "./instance/LazyCollectionHolderOf2_SizeAlias"
import {MinimalistAsCollectionHolder_SizeAlias}                                                            from "./instance/MinimalistAsCollectionHolder_SizeAlias"
import {SetAsCollectionHolder_SizeAlias}                                                                   from "./instance/SetAsCollectionHolder_SizeAlias"
import {SetOf1AsCollectionHolder_SizeAlias}                                                                from "./instance/SetOf1AsCollectionHolder_SizeAlias"
import {SetOf2AsCollectionHolder_SizeAlias}                                                                from "./instance/SetOf2AsCollectionHolder_SizeAlias"
import {every0Instances, every1Instances, every2Instances, everyExtensionMethodInstances, everyNInstances} from "./value/instances"

import {EmptyCollectionHolder} from "../src/EmptyCollectionHolder"

describe("CollectionHolderTest (size)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("size",       () => expect(instance.size,).toBe(0,),)
        test("length",     () => expect(instance.length,).toBe(0,),)
        test("count",      () => expect(instance.count,).toBe(0,),)
        test("isEmpty",    () => expect(instance.isEmpty,).toBeTrue(),)
        test("isNotEmpty", () => expect(instance.isNotEmpty,).toBeFalse(),)
    },)

    describe("aliases", () => {
        describe("ArrayAsCollectionHolder", () => {
            test("length", () => expect(new ArrayAsCollectionHolder_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new ArrayAsCollectionHolder_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("ArrayOf1AsCollectionHolder", () => {
            test("length", () => expect(new ArrayOf1AsCollectionHolder_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new ArrayOf1AsCollectionHolder_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("ArrayOf2AsCollectionHolder", () => {
            test("length", () => expect(new ArrayOf2AsCollectionHolder_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new ArrayOf2AsCollectionHolder_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("CollectionHolderOf1", () => {
            test("length", () => expect(new CollectionHolderOf1_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new CollectionHolderOf1_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("CollectionHolderOf2", () => {
            test("length", () => expect(new CollectionHolderOf2_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new CollectionHolderOf2_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("CollectionViewer", () => {
            test("length", () => expect(new CollectionViewer_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new CollectionViewer_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("GenericCollectionHolder", () => {
            test("length", () => expect(new GenericCollectionHolder_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new GenericCollectionHolder_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("IteratorAsCollectionHolder", () => {
            test("length", () => expect(new IteratorAsCollectionHolder_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new IteratorAsCollectionHolder_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("JsIterableAsCollectionHolder", () => {
            test("length", () => expect(new JsIterableAsCollectionHolder_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new JsIterableAsCollectionHolder_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("JsIteratorAsCollectionHolder", () => {
            test("length", () => expect(new JsIteratorAsCollectionHolder_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new JsIteratorAsCollectionHolder_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolder", () => {
            test("length", () => expect(new LazyCollectionHolder_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new LazyCollectionHolder_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf0Or1", () => {
            test("length", () => expect(new LazyCollectionHolderOf0Or1_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new LazyCollectionHolderOf0Or1_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf0Or1Or2", () => {
            test("length", () => expect(new LazyCollectionHolderOf0Or1Or2_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new LazyCollectionHolderOf0Or1Or2_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf1", () => {
            test("length", () => expect(new LazyCollectionHolderOf1_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new LazyCollectionHolderOf1_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf1Or2", () => {
            test("length", () => expect(new LazyCollectionHolderOf1Or2_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new LazyCollectionHolderOf1Or2_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf2", () => {
            test("length", () => expect(new LazyCollectionHolderOf2_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new LazyCollectionHolderOf2_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("MinimalistAsCollectionHolder", () => {
            test("length", () => expect(new MinimalistAsCollectionHolder_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new MinimalistAsCollectionHolder_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("SetAsCollectionHolder", () => {
            test("length", () => expect(new SetAsCollectionHolder_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new SetAsCollectionHolder_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("SetOf1AsCollectionHolder", () => {
            test("length", () => expect(new SetOf1AsCollectionHolder_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new SetOf1AsCollectionHolder_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("SetOf2AsCollectionHolder", () => {
            test("length", () => expect(new SetOf2AsCollectionHolder_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new SetOf2AsCollectionHolder_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance,},},) => {
        test("isEmpty", () => expect(instance.isEmpty,).toBeTrue(),)
        test("isNotEmpty", () => expect(instance.isNotEmpty,).toBeFalse(),)
    },)},)

    describe("instances", () => {
        describe("empty", () => {
            describe.each(every0Instances,)("%s", ({value: {newInstance,},},) => {
                test("size", () => expect(newInstance().size,).toBe(0,),)
                test("isEmpty", () => expect(newInstance().isEmpty,).toBeTrue(),)
                test("isNotEmpty", () => expect(newInstance().isNotEmpty,).toBeFalse(),)
            },)
        },)
        describe("1 field", () => {
            const value = Symbol("1 field: value",)
            describe.each(every1Instances,)("%s", ({value: {newInstance,},},) => {
                test("size", () => expect(newInstance(value,).size,).toBe(1,),)
                test("isEmpty", () => expect(newInstance(value,).isEmpty,).toBeFalse(),)
                test("isNotEmpty", () => expect(newInstance(value,).isNotEmpty,).toBeTrue(),)
            },)
        },)
        describe("2 fields", () => {
            const value2 = Symbol("2 fields: 1st value",)
            const value1 = Symbol("2 fields: 2nd value",)
            describe.each(every2Instances,)("%s", ({value: {newInstance,},},) => {
                test("size", () => expect(newInstance(value1, value2,).size,).toBe(2,),)
                test("isEmpty", () => expect(newInstance(value1, value2,).isEmpty,).toBeFalse(),)
                test("isNotEmpty", () => expect(newInstance(value1, value2,).isNotEmpty,).toBeTrue(),)
            },)
        },)
        describe("N fields", () => {
            const values = [
                Symbol("4 fields: 1st value",),
                Symbol("4 fields: 2nd value",),
                Symbol("4 fields: 3rd value",),
                Symbol("4 fields: 4th value",),
            ]
            describe.each(everyNInstances,)("%s", ({value: {instance,},},) => {
                test("size", () => expect(new instance(values,).size,).toBe(4,),)
                test("isEmpty", () => expect(new instance(values,).isEmpty,).toBeFalse(),)
                test("isNotEmpty", () => expect(new instance(values,).isNotEmpty,).toBeTrue(),)
            },)
        },)
    },)

},)
