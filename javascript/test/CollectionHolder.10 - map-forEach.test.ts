/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../src/CollectionHolder"

import {AB, ABCD}                                from "./constantCollections"
import {everyInstances}                          from "./constantValues"
import {newCollectionInstance}                   from "./newCollectionInstance"
import {CollectionHolderThatCannotRetrieveByGet} from "./instance/CollectionHolderThatCannotRetrieveByGet"

describe("CollectionHolderTest (map / forEach)", () =>
describe.each(everyInstances,)("%s", ({value: instance,},) => {
    //#region -------------------- Instances --------------------

    const INSTANCE = () => newCollectionInstance(instance, ABCD,)

    const  newFailInstanceThatExpectToThrow = (action: (collection: CollectionHolder,) => CollectionHolder,) => action(new CollectionHolderThatCannotRetrieveByGet(newCollectionInstance(instance, AB,),),).get(0,)
    const newFailInstanceThatExpectToNotThrow = (action: (collection: CollectionHolder,) => CollectionHolder,) => action(newCollectionInstance(instance, AB,),).get(0,)

    //#endregion -------------------- Instances --------------------

    describe("get() being called", () => {
        describe("map", () => {
            test("0 arguments", () => expect(() => newFailInstanceThatExpectToNotThrow(it => it.map(() => {},),),).not.toThrow(),)
            test("1 arguments", () => expect(() => newFailInstanceThatExpectToThrow(it => it.map(_ => {},),),).toThrow(),)
            test("2 arguments", () => expect(() => newFailInstanceThatExpectToThrow(it => it.map((_1,_2,) => {},),),).toThrow(),)
        },)
        describe("mapIndexed", () => {
            test("() => {}",    () => expect(() => newFailInstanceThatExpectToNotThrow(it => it.mapIndexed(() => {},),),).not.toThrow(),)
            test("(1) => {}",   () => expect(() => newFailInstanceThatExpectToNotThrow(it => it.mapIndexed(_ => {},),),).not.toThrow(),)
            test("(1,2) => {}", () => expect(() => newFailInstanceThatExpectToThrow(it => it.mapIndexed((_1,_2,) => {},),),).toThrow(),)
        },)
        describe("mapNotNull", () => {
            test("() => {}",    () => expect(() => newFailInstanceThatExpectToNotThrow(it => it.mapNotNull(() => '',),),).not.toThrow(),)
            test("(1) => {}",   () => expect(() => newFailInstanceThatExpectToThrow(it => it.mapNotNull(_ => '',),),).toThrow(),)
            test("(1,2) => {}", () => expect(() => newFailInstanceThatExpectToThrow(it => it.mapNotNull((_1,_2,) => '',),),).toThrow(),)
        },)
        describe("mapNotNullIndexed", () => {
            test("() => {}",    () => expect(() => newFailInstanceThatExpectToNotThrow(it => it.mapNotNullIndexed(() => '',),),).not.toThrow(),)
            test("(1) => {}",   () => expect(() => newFailInstanceThatExpectToNotThrow(it => it.mapNotNullIndexed(_ => '',),),).not.toThrow(),)
            test("(1,2) => {}", () => expect(() => newFailInstanceThatExpectToThrow(it => it.mapNotNullIndexed((_1,_2,) => '',),),).toThrow(),)
        },)
        describe("forEach", () => {
            test("() => {}",    () => expect(() => newFailInstanceThatExpectToNotThrow(it => it.forEach(() => {},),),).not.toThrow(),)
            test("(1) => {}",   () => expect(() => newFailInstanceThatExpectToThrow(it => it.forEach(_ => {},),),).toThrow(),)
            test("(1,2) => {}", () => expect(() => newFailInstanceThatExpectToThrow(it => it.forEach((_1,_2,) => {},),),).toThrow(),)
        },)
        describe("forEachIndexed", () => {
            test("() => {}",    () => expect(() => newFailInstanceThatExpectToNotThrow(it => it.forEachIndexed(() => {},),),).not.toThrow(),)
            test("(1) => {}",   () => expect(() => newFailInstanceThatExpectToNotThrow(it => it.forEachIndexed(_ => {},),),).not.toThrow(),)
            test("(1,2) => {}", () => expect(() => newFailInstanceThatExpectToThrow(it => it.forEachIndexed((_1,_2,) => {},),),).toThrow(),)
        },)
    },)


    describe("map", () => {
        test("() => {}",       () => expect(INSTANCE().map(() => {},).toArray(),).toEqual([undefined, undefined, undefined, undefined,],),)
        test("undefined",      () => expect(INSTANCE().map(() => undefined,).toArray(),).toEqual([undefined, undefined, undefined, undefined,],),)
        test("null",           () => expect(INSTANCE().map(() => null,).toArray(),).toEqual([null, null, null, null,],),)

        test("value 'a' only", () => expect(INSTANCE().map(it => it === 'a' ? it : null,).toArray(),).toEqual(['a', null, null, null,],),)
        test("value 'b' only", () => expect(INSTANCE().map(it => it === 'b' ? it : null,).toArray(),).toEqual([null, 'b', null, null,],),)
        test("value 'c' only", () => expect(INSTANCE().map(it => it === 'c' ? it : null,).toArray(),).toEqual([null, null, 'c', null,],),)
        test("value 'd' only", () => expect(INSTANCE().map(it => it === 'd' ? it : null,).toArray(),).toEqual([null, null, null, 'd',],),)
        test("index 0 only",   () => expect(INSTANCE().map((value, index,) => index === 0 ? value : null,).toArray(),).toEqual(['a', null, null, null,],),)
        test("index 1 only",   () => expect(INSTANCE().map((value, index,) => index === 1 ? value : null,).toArray(),).toEqual([null, 'b', null, null,],),)
        test("index 2 only",   () => expect(INSTANCE().map((value, index,) => index === 2 ? value : null,).toArray(),).toEqual([null, null, 'c', null,],),)
        test("index 3 only",   () => expect(INSTANCE().map((value, index,) => index === 3 ? value : null,).toArray(),).toEqual([null, null, null, 'd',],),)

        test("NaN",            () => expect(INSTANCE().map(() => NaN,).toArray(),).toEqual([NaN, NaN, NaN, NaN,],),)
        test("value",          () => expect(INSTANCE().map(it => it,).toArray(),).toEqual(['a', 'b', 'c', 'd',],),)
        test("index",          () => expect(INSTANCE().map((_, it,) => it,).toArray(),).toEqual([0, 1, 2, 3,],),)
    },)
    describe("mapIndexed", () => {
        test("() => {}",       () => expect(INSTANCE().mapIndexed(() => {},).toArray(),).toEqual([undefined, undefined, undefined, undefined,],),)
        test("undefined",      () => expect(INSTANCE().mapIndexed(() => undefined,).toArray(),).toEqual([undefined, undefined, undefined, undefined,],),)
        test("null",           () => expect(INSTANCE().mapIndexed(() => null,).toArray(),).toEqual([null, null, null, null,],),)

        test("value 'a' only", () => expect(INSTANCE().mapIndexed((_, it) => it === 'a' ? it : null,).toArray(),).toEqual(['a', null, null, null,],),)
        test("value 'b' only", () => expect(INSTANCE().mapIndexed((_, it) => it === 'b' ? it : null,).toArray(),).toEqual([null, 'b', null, null,],),)
        test("value 'c' only", () => expect(INSTANCE().mapIndexed((_, it) => it === 'c' ? it : null,).toArray(),).toEqual([null, null, 'c', null,],),)
        test("value 'd' only", () => expect(INSTANCE().mapIndexed((_, it) => it === 'd' ? it : null,).toArray(),).toEqual([null, null, null, 'd',],),)
        test("index 0 only",   () => expect(INSTANCE().mapIndexed((index, value,) => index === 0 ? value : null,).toArray(),).toEqual(['a', null, null, null,],),)
        test("index 1 only",   () => expect(INSTANCE().mapIndexed((index, value,) => index === 1 ? value : null,).toArray(),).toEqual([null, 'b', null, null,],),)
        test("index 2 only",   () => expect(INSTANCE().mapIndexed((index, value,) => index === 2 ? value : null,).toArray(),).toEqual([null, null, 'c', null,],),)
        test("index 3 only",   () => expect(INSTANCE().mapIndexed((index, value,) => index === 3 ? value : null,).toArray(),).toEqual([null, null, null, 'd',],),)

        test("NaN",            () => expect(INSTANCE().mapIndexed(() => NaN,).toArray(),).toEqual([NaN, NaN, NaN, NaN,],),)
        test("value",          () => expect(INSTANCE().mapIndexed((_, it,) => it,).toArray(),).toEqual(['a', 'b', 'c', 'd',],),)
        test("index",          () => expect(INSTANCE().mapIndexed(it => it,).toArray(),).toEqual([0, 1, 2, 3,],),)
    },)


    describe("mapNotNull", () => {
        test("() => {}",       () => expect(INSTANCE().mapNotNull(() => {},).toArray(),).toEqual([],),)
        test("undefined",      () => expect(INSTANCE().mapNotNull(() => undefined,).toArray(),).toEqual([],),)
        test("null",           () => expect(INSTANCE().mapNotNull(() => null,).toArray(),).toEqual([],),)

        test("value 'a' only", () => expect(INSTANCE().mapNotNull(it => it === 'a' ? it : null,).toArray(),).toEqual(['a',],),)
        test("value 'b' only", () => expect(INSTANCE().mapNotNull(it => it === 'b' ? it : null,).toArray(),).toEqual(['b',],),)
        test("value 'c' only", () => expect(INSTANCE().mapNotNull(it => it === 'c' ? it : null,).toArray(),).toEqual(['c',],),)
        test("value 'd' only", () => expect(INSTANCE().mapNotNull(it => it === 'd' ? it : null,).toArray(),).toEqual(['d',],),)
        test("index 0 only",   () => expect(INSTANCE().mapNotNull((value, index,) => index === 0 ? value : null,).toArray(),).toEqual(['a',],),)
        test("index 1 only",   () => expect(INSTANCE().mapNotNull((value, index,) => index === 1 ? value : null,).toArray(),).toEqual(['b',],),)
        test("index 2 only",   () => expect(INSTANCE().mapNotNull((value, index,) => index === 2 ? value : null,).toArray(),).toEqual(['c',],),)
        test("index 3 only",   () => expect(INSTANCE().mapNotNull((value, index,) => index === 3 ? value : null,).toArray(),).toEqual(['d',],),)

        test("NaN",            () => expect(INSTANCE().mapNotNull(() => NaN,).toArray(),).toEqual([NaN, NaN, NaN, NaN,],),)
        test("value",          () => expect(INSTANCE().mapNotNull(it => it,).toArray(),).toEqual(['a', 'b', 'c', 'd',],),)
        test("index",          () => expect(INSTANCE().mapNotNull((_, it,) => it,).toArray(),).toEqual([0, 1, 2, 3,],),)
    },)
    describe("mapNotNullIndexed", () => {
        test("() => {}",       () => expect(INSTANCE().mapNotNullIndexed(() => {},).toArray(),).toEqual([],),)
        test("undefined",      () => expect(INSTANCE().mapNotNullIndexed(() => undefined,).toArray(),).toEqual([],),)
        test("null",           () => expect(INSTANCE().mapNotNullIndexed(() => null,).toArray(),).toEqual([],),)

        test("value 'a' only", () => expect(INSTANCE().mapNotNullIndexed((_, it,) => it === 'a' ? it : null,).toArray(),).toEqual(['a',],),)
        test("value 'b' only", () => expect(INSTANCE().mapNotNullIndexed((_, it,) => it === 'b' ? it : null,).toArray(),).toEqual(['b',],),)
        test("value 'c' only", () => expect(INSTANCE().mapNotNullIndexed((_, it,) => it === 'c' ? it : null,).toArray(),).toEqual(['c',],),)
        test("value 'd' only", () => expect(INSTANCE().mapNotNullIndexed((_, it,) => it === 'd' ? it : null,).toArray(),).toEqual(['d',],),)
        test("index 0 only",   () => expect(INSTANCE().mapNotNullIndexed((index, value,) => index === 0 ? value : null,).toArray(),).toEqual(['a',],),)
        test("index 1 only",   () => expect(INSTANCE().mapNotNullIndexed((index, value,) => index === 1 ? value : null,).toArray(),).toEqual(['b',],),)
        test("index 2 only",   () => expect(INSTANCE().mapNotNullIndexed((index, value,) => index === 2 ? value : null,).toArray(),).toEqual(['c',],),)
        test("index 3 only",   () => expect(INSTANCE().mapNotNullIndexed((index, value,) => index === 3 ? value : null,).toArray(),).toEqual(['d',],),)

        test("NaN",            () => expect(INSTANCE().mapNotNullIndexed(() => NaN,).toArray(),).toEqual([NaN, NaN, NaN, NaN,],),)
        test("value",          () => expect(INSTANCE().mapNotNullIndexed((_, it,) => it,).toArray(),).toEqual(['a', 'b', 'c', 'd',],),)
        test("index",          () => expect(INSTANCE().mapNotNullIndexed(it => it,).toArray(),).toEqual([0, 1, 2, 3,],),)
    },)
},),)
