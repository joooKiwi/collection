/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, ABCD}                                from "./constantCollections"
import {everyInstance}                           from "./constantValues"
import {CollectionHolderThatCountGetBeingCalled} from "./instance/CollectionHolderThatCountGetBeingCalled"

describe("CollectionHolderTest (map / forEach)", () => {
describe.each(everyInstance,)("%s", ({value: {newInstance,},},) => {
    describe("get() being called", () => {
        describe("map", () => {
            test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.map(() => {},).toArray(),).amountOfCall,).toBe(0,),)
            test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.map(_ => {},).toArray(),).amountOfCall,).toBe(2,),)
            test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.map((_1,_2,) => {},).toArray(),).amountOfCall,).toBe(2,),)
        },)
        describe("mapIndexed", () => {
            test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.mapIndexed(() => {},).toArray(),).amountOfCall,).toBe(0,),)
            test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.mapIndexed(_ => {},).toArray(),).amountOfCall,).toBe(0,),)
            test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.mapIndexed((_1,_2,) => {},).toArray(),).amountOfCall,).toBe(2,),)
        },)
        describe("mapNotNull", () => {
            test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.mapNotNull(() => '',).toArray(),).amountOfCall,).toBe(0,),)
            test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.mapNotNull(_ => '',).toArray(),).amountOfCall,).toBe(2,),)
            test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.mapNotNull((_1,_2,) => '',).toArray(),).amountOfCall,).toBe(2,),)
        },)
        describe("mapNotNullIndexed", () => {
            test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.mapNotNullIndexed(() => '',).toArray(),).amountOfCall,).toBe(0,),)
            test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.mapNotNullIndexed(_ => '',).toArray(),).amountOfCall,).toBe(0,),)
            test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.mapNotNullIndexed((_1,_2,) => '',).toArray(),).amountOfCall,).toBe(2,),)
        },)
        describe("forEach", () => {
            test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.forEach(() => {},),).amountOfCall,).toBe(0,),)
            test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.forEach(_ => {},),).amountOfCall,).toBe(2,),)
            test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.forEach((_1,_2,) => {},),).amountOfCall,).toBe(2,),)
        },)
        describe("forEachIndexed", () => {
            test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.forEachIndexed(() => {},),).amountOfCall,).toBe(0,),)
            test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.forEachIndexed(_ => {},),).amountOfCall,).toBe(0,),)
            test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.forEachIndexed((_1,_2,) => {},),).amountOfCall,).toBe(2,),)
        },)
        describe("onEach", () => {
            test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.onEach(() => {},),).amountOfCall,).toBe(0,),)
            test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.onEach(_ => {},),).amountOfCall,).toBe(2,),)
            test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.onEach((_1,_2,) => {},),).amountOfCall,).toBe(2,),)
        },)
        describe("onEachIndexed", () => {
            test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.onEachIndexed(() => {},),).amountOfCall,).toBe(0,),)
            test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.onEachIndexed(_ => {},),).amountOfCall,).toBe(0,),)
            test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.onEachIndexed((_1,_2,) => {},),).amountOfCall,).toBe(2,),)
        },)
    },)


    describe("map", () => {
        test("() => {}",       () => expect(newInstance(ABCD,).map(() => {},).toArray(),).toEqual([undefined, undefined, undefined, undefined,],),)
        test("undefined",      () => expect(newInstance(ABCD,).map(() => undefined,).toArray(),).toEqual([undefined, undefined, undefined, undefined,],),)
        test("null",           () => expect(newInstance(ABCD,).map(() => null,).toArray(),).toEqual([null, null, null, null,],),)

        test("value 'a' only", () => expect(newInstance(ABCD,).map(it => it === 'a' ? it : null,).toArray(),).toEqual(['a', null, null, null,],),)
        test("value 'b' only", () => expect(newInstance(ABCD,).map(it => it === 'b' ? it : null,).toArray(),).toEqual([null, 'b', null, null,],),)
        test("value 'c' only", () => expect(newInstance(ABCD,).map(it => it === 'c' ? it : null,).toArray(),).toEqual([null, null, 'c', null,],),)
        test("value 'd' only", () => expect(newInstance(ABCD,).map(it => it === 'd' ? it : null,).toArray(),).toEqual([null, null, null, 'd',],),)
        test("index 0 only",   () => expect(newInstance(ABCD,).map((value, index,) => index === 0 ? value : null,).toArray(),).toEqual(['a', null, null, null,],),)
        test("index 1 only",   () => expect(newInstance(ABCD,).map((value, index,) => index === 1 ? value : null,).toArray(),).toEqual([null, 'b', null, null,],),)
        test("index 2 only",   () => expect(newInstance(ABCD,).map((value, index,) => index === 2 ? value : null,).toArray(),).toEqual([null, null, 'c', null,],),)
        test("index 3 only",   () => expect(newInstance(ABCD,).map((value, index,) => index === 3 ? value : null,).toArray(),).toEqual([null, null, null, 'd',],),)

        test("NaN",            () => expect(newInstance(ABCD,).map(() => NaN,).toArray(),).toEqual([NaN, NaN, NaN, NaN,],),)
        test("value",          () => expect(newInstance(ABCD,).map(it => it,).toArray(),).toEqual(['a', 'b', 'c', 'd',],),)
        test("index",          () => expect(newInstance(ABCD,).map((_, it,) => it,).toArray(),).toEqual([0, 1, 2, 3,],),)
    },)
    describe("mapIndexed", () => {
        test("() => {}",       () => expect(newInstance(ABCD,).mapIndexed(() => {},).toArray(),).toEqual([undefined, undefined, undefined, undefined,],),)
        test("undefined",      () => expect(newInstance(ABCD,).mapIndexed(() => undefined,).toArray(),).toEqual([undefined, undefined, undefined, undefined,],),)
        test("null",           () => expect(newInstance(ABCD,).mapIndexed(() => null,).toArray(),).toEqual([null, null, null, null,],),)

        test("value 'a' only", () => expect(newInstance(ABCD,).mapIndexed((_, it) => it === 'a' ? it : null,).toArray(),).toEqual(['a', null, null, null,],),)
        test("value 'b' only", () => expect(newInstance(ABCD,).mapIndexed((_, it) => it === 'b' ? it : null,).toArray(),).toEqual([null, 'b', null, null,],),)
        test("value 'c' only", () => expect(newInstance(ABCD,).mapIndexed((_, it) => it === 'c' ? it : null,).toArray(),).toEqual([null, null, 'c', null,],),)
        test("value 'd' only", () => expect(newInstance(ABCD,).mapIndexed((_, it) => it === 'd' ? it : null,).toArray(),).toEqual([null, null, null, 'd',],),)
        test("index 0 only",   () => expect(newInstance(ABCD,).mapIndexed((index, value,) => index === 0 ? value : null,).toArray(),).toEqual(['a', null, null, null,],),)
        test("index 1 only",   () => expect(newInstance(ABCD,).mapIndexed((index, value,) => index === 1 ? value : null,).toArray(),).toEqual([null, 'b', null, null,],),)
        test("index 2 only",   () => expect(newInstance(ABCD,).mapIndexed((index, value,) => index === 2 ? value : null,).toArray(),).toEqual([null, null, 'c', null,],),)
        test("index 3 only",   () => expect(newInstance(ABCD,).mapIndexed((index, value,) => index === 3 ? value : null,).toArray(),).toEqual([null, null, null, 'd',],),)

        test("NaN",            () => expect(newInstance(ABCD,).mapIndexed(() => NaN,).toArray(),).toEqual([NaN, NaN, NaN, NaN,],),)
        test("value",          () => expect(newInstance(ABCD,).mapIndexed((_, it,) => it,).toArray(),).toEqual(['a', 'b', 'c', 'd',],),)
        test("index",          () => expect(newInstance(ABCD,).mapIndexed(it => it,).toArray(),).toEqual([0, 1, 2, 3,],),)
    },)


    describe("mapNotNull", () => {
        test("() => {}",       () => expect(newInstance(ABCD,).mapNotNull(() => {},).toArray(),).toEqual([],),)
        test("undefined",      () => expect(newInstance(ABCD,).mapNotNull(() => undefined,).toArray(),).toEqual([],),)
        test("null",           () => expect(newInstance(ABCD,).mapNotNull(() => null,).toArray(),).toEqual([],),)

        test("value 'a' only", () => expect(newInstance(ABCD,).mapNotNull(it => it === 'a' ? it : null,).toArray(),).toEqual(['a',],),)
        test("value 'b' only", () => expect(newInstance(ABCD,).mapNotNull(it => it === 'b' ? it : null,).toArray(),).toEqual(['b',],),)
        test("value 'c' only", () => expect(newInstance(ABCD,).mapNotNull(it => it === 'c' ? it : null,).toArray(),).toEqual(['c',],),)
        test("value 'd' only", () => expect(newInstance(ABCD,).mapNotNull(it => it === 'd' ? it : null,).toArray(),).toEqual(['d',],),)
        test("index 0 only",   () => expect(newInstance(ABCD,).mapNotNull((value, index,) => index === 0 ? value : null,).toArray(),).toEqual(['a',],),)
        test("index 1 only",   () => expect(newInstance(ABCD,).mapNotNull((value, index,) => index === 1 ? value : null,).toArray(),).toEqual(['b',],),)
        test("index 2 only",   () => expect(newInstance(ABCD,).mapNotNull((value, index,) => index === 2 ? value : null,).toArray(),).toEqual(['c',],),)
        test("index 3 only",   () => expect(newInstance(ABCD,).mapNotNull((value, index,) => index === 3 ? value : null,).toArray(),).toEqual(['d',],),)

        test("NaN",            () => expect(newInstance(ABCD,).mapNotNull(() => NaN,).toArray(),).toEqual([NaN, NaN, NaN, NaN,],),)
        test("value",          () => expect(newInstance(ABCD,).mapNotNull(it => it,).toArray(),).toEqual(['a', 'b', 'c', 'd',],),)
        test("index",          () => expect(newInstance(ABCD,).mapNotNull((_, it,) => it,).toArray(),).toEqual([0, 1, 2, 3,],),)
    },)
    describe("mapNotNullIndexed", () => {
        test("() => {}",       () => expect(newInstance(ABCD,).mapNotNullIndexed(() => {},).toArray(),).toEqual([],),)
        test("undefined",      () => expect(newInstance(ABCD,).mapNotNullIndexed(() => undefined,).toArray(),).toEqual([],),)
        test("null",           () => expect(newInstance(ABCD,).mapNotNullIndexed(() => null,).toArray(),).toEqual([],),)

        test("value 'a' only", () => expect(newInstance(ABCD,).mapNotNullIndexed((_, it,) => it === 'a' ? it : null,).toArray(),).toEqual(['a',],),)
        test("value 'b' only", () => expect(newInstance(ABCD,).mapNotNullIndexed((_, it,) => it === 'b' ? it : null,).toArray(),).toEqual(['b',],),)
        test("value 'c' only", () => expect(newInstance(ABCD,).mapNotNullIndexed((_, it,) => it === 'c' ? it : null,).toArray(),).toEqual(['c',],),)
        test("value 'd' only", () => expect(newInstance(ABCD,).mapNotNullIndexed((_, it,) => it === 'd' ? it : null,).toArray(),).toEqual(['d',],),)
        test("index 0 only",   () => expect(newInstance(ABCD,).mapNotNullIndexed((index, value,) => index === 0 ? value : null,).toArray(),).toEqual(['a',],),)
        test("index 1 only",   () => expect(newInstance(ABCD,).mapNotNullIndexed((index, value,) => index === 1 ? value : null,).toArray(),).toEqual(['b',],),)
        test("index 2 only",   () => expect(newInstance(ABCD,).mapNotNullIndexed((index, value,) => index === 2 ? value : null,).toArray(),).toEqual(['c',],),)
        test("index 3 only",   () => expect(newInstance(ABCD,).mapNotNullIndexed((index, value,) => index === 3 ? value : null,).toArray(),).toEqual(['d',],),)

        test("NaN",            () => expect(newInstance(ABCD,).mapNotNullIndexed(() => NaN,).toArray(),).toEqual([NaN, NaN, NaN, NaN,],),)
        test("value",          () => expect(newInstance(ABCD,).mapNotNullIndexed((_, it,) => it,).toArray(),).toEqual(['a', 'b', 'c', 'd',],),)
        test("index",          () => expect(newInstance(ABCD,).mapNotNullIndexed(it => it,).toArray(),).toEqual([0, 1, 2, 3,],),)
    },)
},)},)
