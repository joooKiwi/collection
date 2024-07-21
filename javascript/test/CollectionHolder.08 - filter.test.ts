/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {A_NULL_B_UNDEFINED, AB, AB12, ABCD}      from "./constantCollections"
import {everyInstance}                           from "./constantValues"
import {CollectionHolderThatCountGetBeingCalled} from "./instance/CollectionHolderThatCountGetBeingCalled"

describe("CollectionHolderTest (filter)", () => {
describe.each(everyInstance,)("%s", ({value: {newInstance, isMinimalist,},},) => {
    describe("get() being called", () => {
        describe("filter", () => {
            test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.filter(() => false,).toArray(),).amountOfCall,).toBe(0,),)
            test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.filter(_ => false,).toArray(),).amountOfCall,).toBe(2,),)
            test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.filter((_1, _2,) => false,).toArray(),).amountOfCall,).toBe(2,),)
        },)
        describe("filterIndexed", () => {
            test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.filterIndexed(() => false,).toArray(),).amountOfCall,).toBe(0,),)
            test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.filterIndexed(_ => false,).toArray(),).amountOfCall,).toBe(0,),)
            test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.filterIndexed((_1, _2,) => false,).toArray(),).amountOfCall,).toBe(2,),)
        },)
        describe("filterNot", () => {
            test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.filterNot(() => true,).toArray(),).amountOfCall,).toBe(0,),)
            test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.filterNot(_ => true,).toArray(),).amountOfCall,).toBe(2,),)
            test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.filterNot((_1, _2,) => true,).toArray(),).amountOfCall,).toBe(2,),)
        },)
        describe("filterNotIndexed", () => {
            test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.filterNotIndexed(() => true,).toArray(),).amountOfCall,).toBe(0,),)
            test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.filterNotIndexed(_ => true,).toArray(),).amountOfCall,).toBe(0,),)
            test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.filterNotIndexed((_1, _2,) => true,).toArray(),).amountOfCall,).toBe(2,),)
        },)
    },)

    test("[a,b,c,d].filter(d) == [d]",               () => expect(newInstance(ABCD,).filter(it => it === 'd',).toArray(),).toEqual(['d',],),)
    test("[a,b,c,d].filterIndexed(3) == [d]",        () => expect(newInstance(ABCD,).filterIndexed(it => it === 3,).toArray(),).toEqual(['d',],),)
    test("[a,b,c,d].filterNot(d) == [a,b,c]",        () => expect(newInstance(ABCD,).filterNot(it => it === 'd',).toArray(),).toEqual(['a', 'b', 'c',],),)
    test("[a,b,c,d].filterNotIndexed(3) == [a,b,c]", () => expect(newInstance(ABCD,).filterNotIndexed(it => it === 3,).toArray(),).toEqual(['a', 'b', 'c',],),)
    test("[a,b,1,2].filter(number) == [1,2]",        () => expect(newInstance(AB12,).filter(it => typeof it == "number",).toArray(),).toEqual([1, 2,],),)
    test("[a,b,1,2].filterNot(number) == [a,b]",     () => expect(newInstance(AB12,).filterNot(it => typeof it == "number",).toArray(),).toEqual(['a', 'b',],),)

    test("[a,null,b,undefined].filterNotNull() == [a,b]",                         () => expect(newInstance(A_NULL_B_UNDEFINED,).filterNotNull().toArray(),).toEqual(['a', 'b',],),)
    if (!isMinimalist) {
        test("[a,null,b,undefined].filterNotNull() != this",                      () => {
            const instance = newInstance(A_NULL_B_UNDEFINED,)
            expect(instance.filterNotNull(),).not.toEqual(instance,)
        },)
        test("[a,null,b,undefined].filterNot(null).filterNotNull() != this",      () => {
            const instance = newInstance(A_NULL_B_UNDEFINED,).filterNot(it => it === null,)
            expect(instance.filterNotNull(),).not.toEqual(instance,)
        },)
        test("[a,null,b,undefined].filterNot(undefined).filterNotNull() != this", () => {
            const instance = newInstance(A_NULL_B_UNDEFINED,).filterNot(it => it === undefined,)
            expect(instance.filterNotNull(),).not.toEqual(instance,)
        },)
        test("[a,b].filterNotNull() == this",                                     () => {
            const instance = newInstance(AB,)
            expect(instance === instance.filterNotNull(),).toBeTrue()
        },)
    }

    test("[a,null,b,undefined].requireNotNull() → throw",                          () => expect(() => newInstance(A_NULL_B_UNDEFINED,).requireNoNulls(),).toThrow(TypeError,),)
    test("[a,null,b,undefined].filterNot(null).requireNotNull() → throw",          () => expect(() => newInstance(A_NULL_B_UNDEFINED,).filterNot(it => it === null).requireNoNulls(),).toThrow(TypeError,),)
    test("[a,null,b,undefined].filterNot(undefined).requireNotNull() → throw",     () => expect(() => newInstance(A_NULL_B_UNDEFINED,).filterNot(it => it === undefined).requireNoNulls(),).toThrow(TypeError),)
    test("[a,null,b,undefined].filterNonNull().requireNotNull() → no throw",       () => expect(() => newInstance(A_NULL_B_UNDEFINED,).filterNotNull().requireNoNulls().toArray(),).not.toThrow(),)
    test("[a,b].requireNotNull() -> no throw",                                     () => expect(() => newInstance(AB,).requireNoNulls(),).not.toThrow(),)
},)},)
