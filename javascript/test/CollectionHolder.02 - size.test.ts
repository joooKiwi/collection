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

import {GenericCollectionHolder_SizeAlias}             from "./instance/GenericCollectionHolder_SizeAlias"
import {LazyGenericCollectionHolder_SizeAlias}         from "./instance/LazyGenericCollectionHolder_SizeAlias"
import {everyExtensionMethodInstances, everyInstances} from "./value/instances"
import {sizeValues}                                    from "./value/sizes"

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
        describe("GenericCollectionHolder", () => {
            test("length", () => expect(new GenericCollectionHolder_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new GenericCollectionHolder_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("length", () => expect(new LazyGenericCollectionHolder_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            test("count",  () => expect(new LazyGenericCollectionHolder_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance,},},) => {
        test("isEmpty", () => expect(instance.isEmpty,).toBeTrue(),)
        test("isNotEmpty", () => expect(instance.isNotEmpty,).toBeFalse(),)
    },)},)

    describe("instances", () => {
    describe.each(everyInstances,)("%s", ({value: {instance,},},) => {
    describe.each(sizeValues(),)("%s", ({value: {array, size,},},) => {
        test("size", () => expect(new instance(array,).size,).toBe(size,),)
        test("isEmpty",    () => expect(new instance(array,).isEmpty,)[size == 0 ? "toBeTrue" : "toBeFalse"](),)
        test("isNotEmpty", () => expect(new instance(array,).isNotEmpty,)[size == 0 ? "toBeFalse" : "toBeTrue"](),)
    },)},)},)

},)
