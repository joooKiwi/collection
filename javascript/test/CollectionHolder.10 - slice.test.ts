/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, ABCD, EMPTY}       from "./constantCollections"
import {everyInstances}        from "./constantValues"
import {newCollectionInstance} from "./newCollectionInstance"

import {CollectionConstants}                       from "../src/CollectionConstants"
import {CollectionHolderIndexOutOfBoundsException} from "../src/exception/CollectionHolderIndexOutOfBoundsException"
import {GenericCollectionIterator}                 from "../src/iterator/GenericCollectionIterator"

describe("CollectionHolderTest (slice)", () =>
describe.each(everyInstances,)("%s", ({value: instance,},) => {
    //#region -------------------- Instances --------------------

    const EMPTY_INSTANCE = () => newCollectionInstance(instance, EMPTY,)
    const AB_INSTANCE = () => newCollectionInstance(instance, AB,)
    const ABCD_INSTANCE = () => newCollectionInstance(instance, ABCD,)

    //#endregion -------------------- Instances --------------------


    describe("by array", () => {
        test("empty", () => expect(AB_INSTANCE().slice([],),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        test('0',     () => expect(ABCD_INSTANCE().slice([0,],).toArray(),).toEqual(['a',],),)
        test('1',     () => expect(ABCD_INSTANCE().slice([1,],).toArray(),).toEqual(['b',],),)
        test("-1",    () => expect(ABCD_INSTANCE().slice([-1,],).toArray(),).toEqual(['d',],),)
        test("-2",    () => expect(ABCD_INSTANCE().slice([-2,],).toArray(),).toEqual(['c',],),)
        test("10",    () => expect(() => ABCD_INSTANCE().slice([10,],).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("-10",   () => expect(() => ABCD_INSTANCE().slice([-10,],).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
    },)
    describe("by set", () => {
        test("empty", () => expect(AB_INSTANCE().slice(new Set<never>(),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        test('0',     () => expect(ABCD_INSTANCE().slice(new Set([0,],),).toArray(),).toEqual(['a',],),)
        test('1',     () => expect(ABCD_INSTANCE().slice(new Set([1,],),).toArray(),).toEqual(['b',],),)
        test("-1",    () => expect(ABCD_INSTANCE().slice(new Set([-1,],),).toArray(),).toEqual(['d',],),)
        test("-2",    () => expect(ABCD_INSTANCE().slice(new Set([-2,],),).toArray(),).toEqual(['c',],),)
        test("10",    () => expect(() => ABCD_INSTANCE().slice(new Set([10,],),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("-10",   () => expect(() => ABCD_INSTANCE().slice(new Set([-10,],),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
    },)
    describe("by collection", () => {
        test("empty", () => expect(AB_INSTANCE().slice(newCollectionInstance(instance, [],),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        test('0',     () => expect(ABCD_INSTANCE().slice(newCollectionInstance(instance, [0,],),).toArray(),).toEqual(['a',],),)
        test('1',     () => expect(ABCD_INSTANCE().slice(newCollectionInstance(instance, [1,],),).toArray(),).toEqual(['b',],),)
        test("-1",    () => expect(ABCD_INSTANCE().slice(newCollectionInstance(instance, [-1,],),).toArray(),).toEqual(['d',],),)
        test("-2",    () => expect(ABCD_INSTANCE().slice(newCollectionInstance(instance, [-2,],),).toArray(),).toEqual(['c',],),)
        test("10",    () => expect(() => ABCD_INSTANCE().slice(newCollectionInstance(instance, [10,],),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("-10",   () => expect(() => ABCD_INSTANCE().slice(newCollectionInstance(instance, [-10,],),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
    },)
    describe("by collection iterator", () => {
        test("empty", () => expect(AB_INSTANCE().slice(new GenericCollectionIterator<never>(newCollectionInstance(instance, [],),),),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        test('0',     () => expect(ABCD_INSTANCE().slice(new GenericCollectionIterator<0>(newCollectionInstance(instance, [0,],),),).toArray(),).toEqual(['a',],),)
        test('1',     () => expect(ABCD_INSTANCE().slice(new GenericCollectionIterator<1>(newCollectionInstance(instance, [1,],),),).toArray(),).toEqual(['b',],),)
        test("-1",    () => expect(ABCD_INSTANCE().slice(new GenericCollectionIterator<-1>(newCollectionInstance(instance, [-1,],),),).toArray(),).toEqual(['d',],),)
        test("-2",    () => expect(ABCD_INSTANCE().slice(new GenericCollectionIterator<-2>(newCollectionInstance(instance, [-2,],),),).toArray(),).toEqual(['c',],),)
        test("10",    () => expect(() => ABCD_INSTANCE().slice(new GenericCollectionIterator<10>(newCollectionInstance(instance, [10,],),),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("-10",   () => expect(() => ABCD_INSTANCE().slice(new GenericCollectionIterator<-10>(newCollectionInstance(instance, [-10,],),),).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
    },)
    describe("by iterable", () => {
        test("empty", () => expect(AB_INSTANCE().slice({ [Symbol.iterator]() { return [][Symbol.iterator]() }, },),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        test('0',     () => expect(ABCD_INSTANCE().slice({ [Symbol.iterator]() { return [0,][Symbol.iterator]() }, },).toArray(),).toEqual(['a',],),)
        test('1',     () => expect(ABCD_INSTANCE().slice({ [Symbol.iterator]() { return [1,][Symbol.iterator]() }, },).toArray(),).toEqual(['b',],),)
        test("-1",    () => expect(ABCD_INSTANCE().slice({ [Symbol.iterator]() { return [-1,][Symbol.iterator]() }, },).toArray(),).toEqual(['d',],),)
        test("-2",    () => expect(ABCD_INSTANCE().slice({ [Symbol.iterator]() { return [-2,][Symbol.iterator]() }, },).toArray(),).toEqual(['c',],),)
        test("10",    () => expect(() => ABCD_INSTANCE().slice({ [Symbol.iterator]() { return [10,][Symbol.iterator]() }, },).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("-10",   () => expect(() => ABCD_INSTANCE().slice({ [Symbol.iterator]() { return [-10,][Symbol.iterator]() }, },).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
    },)

    describe("by range", () => {
        test("empty",             () => expect(EMPTY_INSTANCE().slice(),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)

        test("(1)",               () => expect(ABCD_INSTANCE().slice(1,).toArray(),).toEqual(['b', 'c', 'd',],),)
        test("(null, 1)",         () => expect(ABCD_INSTANCE().slice(null, 1,).toArray(),).toEqual(['a', 'b',],),)
        test("(1, 1)",            () => expect(ABCD_INSTANCE().slice(1, 1,).toArray(),).toEqual(['b',],),)
        test("(1, 2)",            () => expect(ABCD_INSTANCE().slice(1, 2,).toArray(),).toEqual(['b', 'c',],),)
        test("(-2)",              () => expect(ABCD_INSTANCE().slice(-2,).toArray(),).toEqual(['c', 'd',],),)
        test("(null, -2)",        () => expect(ABCD_INSTANCE().slice(null, -2,).toArray(),).toEqual(['a', 'b', 'c',],),)
        test("(-2, -2)",          () => expect(ABCD_INSTANCE().slice(-2, -2,).toArray(),).toEqual(['c',],),)
        test("(-3, -2)",          () => expect(ABCD_INSTANCE().slice(-3, -2,).toArray(),).toEqual(['b', 'c',],),)

        test("(1, null, 1)",      () => expect(ABCD_INSTANCE().slice(1, null, 1,).toArray(),).toEqual(['b',],),)
        test("(1, null, -3)",     () => expect(ABCD_INSTANCE().slice(1, null, -3,).toArray(),).toEqual(['b',],),)
        test("(1, null, 2)",      () => expect(ABCD_INSTANCE().slice(1, null, 2,).toArray(),).toEqual(['b', 'c',],),)
        test("(-2, null, 1)",     () => expect(ABCD_INSTANCE().slice(-2, null, 1,).toArray(),).toEqual(['c',],),)
        test("(-2, null, -3)",    () => expect(ABCD_INSTANCE().slice(-2, null, -3,).toArray(),).toEqual(['c',],),)
        test("(-2, null, 2)",     () => expect(ABCD_INSTANCE().slice(-2, null, 2,).toArray(),).toEqual(['c', 'd',],),)
        test("(null, 1, 1)",      () => expect(ABCD_INSTANCE().slice(null, 1, 1,).toArray(),).toEqual(['a',],),)
        test("(null, 1, -3)",     () => expect(ABCD_INSTANCE().slice(null, 1, -3,).toArray(),).toEqual(['a',],),)
        test("(null, 1, 2)",      () => expect(ABCD_INSTANCE().slice(null, 1, 2,).toArray(),).toEqual(['a', 'b',],),)
        test("(null, -2, 1)",     () => expect(ABCD_INSTANCE().slice(null, -2, 1,).toArray(),).toEqual(['a',],),)
        test("(null, -2, -3)",    () => expect(ABCD_INSTANCE().slice(null, -2, -3,).toArray(),).toEqual(['a',],),)
        test("(null, -2, 2)",     () => expect(ABCD_INSTANCE().slice(null, -2, 2,).toArray(),).toEqual(['a', 'b',],),)
        test("(null, null, 1)",   () => expect(ABCD_INSTANCE().slice(null, null, 1,).toArray(),).toEqual(['a',],),)
        test("(null, null, -3)",  () => expect(ABCD_INSTANCE().slice(null, null, -3,).toArray(),).toEqual(['a',],),)
        test("(null, null, 2)",   () => expect(ABCD_INSTANCE().slice(null, null, 2,).toArray(),).toEqual(['a', 'b',],),)

        test("(2, 1)",            () => expect(() => ABCD_INSTANCE().slice(2, 1,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("(1, null, 4)",      () => expect(() => ABCD_INSTANCE().slice(1, null, 4,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("(null, 1, 4)",      () => expect(() => ABCD_INSTANCE().slice(null, 1, 4,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("(10)",              () => expect(() => ABCD_INSTANCE().slice(10, null,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("(null, 10)",        () => expect(() => ABCD_INSTANCE().slice(null, 10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("(null, null, 10)",  () => expect(() => ABCD_INSTANCE().slice(null, null, 10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("(-10)",             () => expect(() => ABCD_INSTANCE().slice(-10, null,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("(null, -10)",       () => expect(() => ABCD_INSTANCE().slice(null, -10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("(null, null, -10)", () => expect(() => ABCD_INSTANCE().slice(null, null, -10,).toString(),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
    },)
},),)
