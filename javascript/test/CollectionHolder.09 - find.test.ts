/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, ABCD_ABCD}                           from "./constantCollections"
import {everyInstance}                           from "./constantValues"
import {CollectionHolderThatCountGetBeingCalled} from "./instance/CollectionHolderThatCountGetBeingCalled"

describe("CollectionHolderTest (find)", () => {
describe.each(everyInstance,)("%s", ({value: {newInstance,},},) => {
    describe("get() being called", () => {
        describe("find", () => {
            test("() => {}",    () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.find(() => false,),).amountOfCall,).toBe(0,),)
            test("(1) => {}",   () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.find(_ => false,),).amountOfCall,).toBe(2,),)
            test("(1,2) => {}", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.find((_1,_2,) => false,),).amountOfCall,).toBe(2,),)
        },)
        describe("findIndexed", () => {
            test("() => {}",    () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.findIndexed(() => false,),).amountOfCall,).toBe(0,),)
            test("(1) => {}",   () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.findIndexed(_ => false,),).amountOfCall,).toBe(0,),)
            test("(1,2) => {}", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.findIndexed((_1,_2,) => false,),).amountOfCall,).toBe(2,),)
        },)
        describe("findLast", () => {
            test("() => {}",    () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.findLast(() => false,),).amountOfCall,).toBe(0,),)
            test("(1) => {}",   () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.findLast(_ => false,),).amountOfCall,).toBe(2,),)
            test("(1,2) => {}", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.findLast((_1,_2,) => false,),).amountOfCall,).toBe(2,),)
        },)
        describe("findLastIndexed", () => {
            test("() => {}",    () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.findLastIndexed(() => false,),).amountOfCall,).toBe(0,),)
            test("(1) => {}",   () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.findLastIndexed(_ => false,),).amountOfCall,).toBe(0,),)
            test("(1,2) => {}", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.findLastIndexed((_1,_2,) => false,),).amountOfCall,).toBe(2,),)
        },)
    },)


    test("[a,b,c,d,A,B,C,D].find(anyCase b) == b",    () => expect(newInstance(ABCD_ABCD,).find(it => it.toLowerCase() === 'b',),).toBe('b',),)
    test("[a,b,c,d,A,B,C,D].find(a) == a",            () => expect(newInstance(ABCD_ABCD,).find(it => it === 'a',),).toBe('a',),)
    test("[a,b,c,d,A,B,C,D].find(D) == D",            () => expect(newInstance(ABCD_ABCD,).find(it => it === 'D',),).toBe('D',),)
    test("[a,b,c,d,A,B,C,D].find(anyCase e) == null", () => expect(newInstance(ABCD_ABCD,).find(it => it.toLowerCase() === 'e',),).toBeNull(),)

    test("[a,b,c,d,A,B,C,D].findIndexed(odd) == b",   () => expect(newInstance(ABCD_ABCD,).findIndexed(it => it % 2 === 1,),).toBe('b',),)
    test("[a,b,c,d,A,B,C,D].findIndexed(0) == a",     () => expect(newInstance(ABCD_ABCD,).findIndexed(it => it === 0,),).toBe('a',),)
    test("[a,b,c,d,A,B,C,D].findIndexed(7) == D",     () => expect(newInstance(ABCD_ABCD,).findIndexed(it => it === 7,),).toBe('D',),)
    test("[a,b,c,d,A,B,C,D].findIndexed(26) == null", () => expect(newInstance(ABCD_ABCD,).findIndexed(it => it === 26,),).toBeNull(),)


    test("[a,b,c,d,A,B,C,D].findLast(anyCase B) == B",    () => expect(newInstance(ABCD_ABCD,).findLast(it => it.toUpperCase() === 'B',),).toBe('B',),)
    test("[a,b,c,d,A,B,C,D].findLast(a) == a",            () => expect(newInstance(ABCD_ABCD,).findLast(it => it === 'a',),).toBe('a',),)
    test("[a,b,c,d,A,B,C,D].findLast(D) == D",            () => expect(newInstance(ABCD_ABCD,).findLast(it => it === 'D',),).toBe('D',),)
    test("[a,b,c,d,A,B,C,D].findLast(anyCase E) == null", () => expect(newInstance(ABCD_ABCD,).findLast(it => it.toUpperCase() === 'E',),).toBeNull(),)

    test("[a,b,c,d,A,B,C,D].findLastIndexed(odd) == D",   () => expect(newInstance(ABCD_ABCD,).findLastIndexed(it => it % 2 === 1,),).toBe('D',),)
    test("[a,b,c,d,A,B,C,D].findLastIndexed(0) == a",     () => expect(newInstance(ABCD_ABCD,).findLastIndexed(it => it === 0,),).toBe('a',),)
    test("[a,b,c,d,A,B,C,D].findLastIndexed(7) == D",     () => expect(newInstance(ABCD_ABCD,).findLastIndexed(it => it === 7,),).toBe('D',),)
    test("[a,b,c,d,A,B,C,D].findLastIndexed(26) == null", () => expect(newInstance(ABCD_ABCD,).findLastIndexed(it => it === 26,),).toBeNull(),)
},)},)
