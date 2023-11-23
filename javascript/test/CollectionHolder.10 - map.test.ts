/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {ABCD}                  from "./constantCollections"
import {everyInstances}        from "./constantValues"
import {newCollectionInstance} from "./newCollectionInstance"

describe("CollectionHolderTest (map)", () =>
describe.each(everyInstances,)("%s", ({value: instance,},) => {
    const INSTANCE = () => newCollectionInstance(instance, ABCD,)


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
