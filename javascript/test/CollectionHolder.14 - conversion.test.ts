/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, AB_OBJECT, SINGULAR_A_OBJECT, SINGULAR_B_OBJECT} from "./constantCollections"
import {everyInstance}                                       from "./constantValues"

describe("CollectionHolderTest (conversion)", () => {
describe.each(everyInstance,)("%s", ({value: {newInstance, isMinimalist,},},) => {
    describe("to iterator", () => {
        const iterator = newInstance(AB,).toIterator()
        test("1st: a",    () => expect(iterator.next().value,).toBe('a',),)
        test("2nd: b",    () => expect(iterator.next().value,).toBe('b',),)
        test("3rd: done", () => expect(iterator.next().done,).toBe(true,),)
    })

    describe("to array", () => {
        test("basic",  () => expect(newInstance(AB,).toArray(),).toEqual(['a', 'b',],),)
        test("frozen", () => expect(newInstance(AB,).toArray(),).toBeFrozen(),)
        test("size",   () => expect(newInstance(AB,).toArray(),).toHaveLength(2,),)
    },)
    describe("to mutable array", () => {
        test("basic",  () => expect(newInstance(AB,).toMutableArray(),).toEqual(['a', 'b',],),)
        test("frozen", () => expect(newInstance(AB,).toMutableArray(),).not.toBeFrozen(),)
        test("size",   () => expect(newInstance(AB,).toMutableArray(),).toHaveLength(2,),)
    },)

    describe("to set", () => {
        test("basic",  () => expect(newInstance(AB,).toSet(),).toEqual(new Set(['a', 'b',],),),)
        test("frozen", () => expect(newInstance(AB,).toSet(),).toBeFrozen(),)
        test("size",   () => expect(newInstance(AB,).toSet().size,).toBe(2,),)
    },)
    describe("to mutable set", () => {
        test("basic",  () => expect(newInstance(AB,).toMutableSet(),).toEqual(new Set(['a', 'b',],),),)
        test("frozen", () => expect(newInstance(AB,).toMutableSet(),).not.toBeFrozen(),)
        test("size",   () => expect(newInstance(AB,).toMutableSet().size,).toBe(2,),)
    },)

    if (!isMinimalist) {
        describe("to weak set", () => {
            test("basic", () => expect(newInstance(AB_OBJECT,).toWeakSet(),).toEqual(new WeakSet([SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,],),),)
            test("frozen", () => expect(newInstance(AB,).toWeakSet(),).toBeFrozen(),)
        },)
        describe("to mutable weak set", () => {
            test("basic", () => expect(newInstance(AB_OBJECT,).toMutableWeakSet(),).toEqual(new WeakSet([SINGULAR_A_OBJECT, SINGULAR_B_OBJECT,],),),)
            test("frozen", () => expect(newInstance(AB,).toMutableWeakSet(),).not.toBeFrozen(),)
        },)
    }

    describe("to map", () => {
        test("basic",  () => expect(newInstance(AB,).toMap(),).toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
        test("frozen", () => expect(newInstance(AB,).toMap(),).toBeFrozen(),)
        test("size",   () => expect(newInstance(AB,).toMap().size,).toBe(2,),)
    },)
    describe("to mutable map", () => {
        test("basic",  () => expect(newInstance(AB,).toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
        test("frozen", () => expect(newInstance(AB,).toMutableMap(),).not.toBeFrozen(),)
        test("size",   () => expect(newInstance(AB,).toMutableMap().size,).toBe(2,),)
    },)
},)},)
