/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, AB_OBJECT, SINGULAR_A_OBJECT, SINGULAR_B_OBJECT} from "./constantCollections"
import {everyInstances}                                      from "./constantValues"
import {newCollectionInstance}                               from "./newCollectionInstance"

describe("CollectionHolderTest (conversion)", () =>
describe.each(everyInstances,)("%s", ({value: instance,},) => {
    const INSTANCE = () => newCollectionInstance(instance, AB,)
    const OBJECT_INSTANCE = () => newCollectionInstance(instance, AB_OBJECT,)


    describe("to iterator", () => {
        const iterator = INSTANCE()[Symbol.iterator]()
        test("1st: a",    () => expect(iterator.next().value,).toBe('a',),)
        test("2nd: b",    () => expect(iterator.next().value,).toBe('b',),)
        test("3rd: done", () => expect(iterator.next().done,).toBe(true,),)
    })

    describe("to array", () => {
        test("basic",  () => expect(INSTANCE().toArray(),).toEqual(['a', 'b',],),)
        test("frozen", () => expect(INSTANCE().toArray(),).toBeFrozen(),)
        test("size",   () => expect(INSTANCE().toArray(),).toHaveLength(2,),)
    })
    describe("to mutable array", () => {
        test("basic",  () => expect(INSTANCE().toMutableArray(),).toEqual(['a', 'b',],),)
        test("frozen", () => expect(INSTANCE().toMutableArray(),).not.toBeFrozen(),)
        test("size",   () => expect(INSTANCE().toMutableArray(),).toHaveLength(2,),)
    })


    describe("to set", () => {
        test("basic",  () => expect(INSTANCE().toSet(),).toEqual(new Set(['a', 'b',],),),)
        test("frozen", () => expect(INSTANCE().toSet(),).toBeFrozen(),)
        test("size",   () => expect(INSTANCE().toSet().size,).toBe(2,),)
    })
    describe("to mutable set", () => {
        test("basic",  () => expect(INSTANCE().toMutableSet(),).toEqual(new Set(['a', 'b',],),),)
        test("frozen", () => expect(INSTANCE().toMutableSet(),).not.toBeFrozen(),)
        test("size",   () => expect(INSTANCE().toMutableSet().size,).toBe(2,),)
    })
    describe("to weak set", () => {
        test("basic",  () => expect(OBJECT_INSTANCE().toWeakSet(),).toEqual(new WeakSet([SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,],),),)
        test("frozen", () => expect(INSTANCE().toWeakSet(),).toBeFrozen(),)
    })
    describe("to mutable weak set", () => {
        test("basic",  () => expect(OBJECT_INSTANCE().toMutableWeakSet(),).toEqual(new WeakSet([SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,],),),)
        test("frozen", () => expect(INSTANCE().toMutableWeakSet(),).not.toBeFrozen(),)
    })


    describe("to map", () => {
        test("basic",  () => expect(INSTANCE().toMap(),).toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
        test("frozen", () => expect(INSTANCE().toMap(),).toBeFrozen(),)
        test("size",   () => expect(INSTANCE().toMap().size,).toBe(2,),)
    })
    describe("to mutable map", () => {
        test("basic",  () => expect(INSTANCE().toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
        test("frozen", () => expect(INSTANCE().toMutableMap(),).not.toBeFrozen(),)
        test("size",   () => expect(INSTANCE().toMutableMap().size,).toBe(2,),)
    })
},),)
