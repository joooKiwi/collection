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

import {expectToBeInstance}                                      from "./expect/expectToBeInstance"
import {CollectionHolderFromArray}                               from "./instance/CollectionHolderFromArray"
import {GenericCollectionHolder_ToReverseAlias}                  from "./instance/GenericCollectionHolder_ToReverseAlias"
import {LazyGenericCollectionHolder_ToReverseAlias}              from "./instance/LazyGenericCollectionHolder_ToReverseAlias"
import {A, AB, ABCD, B, BA, C, CB, CBA, D, DC, DCB, DCBA, EMPTY} from "./value/arrays"
import {everyExtensionMethodInstances, everyInstances}           from "./value/instances"

import {CollectionConstants}                                                                                 from "../src/CollectionConstants"
import {EmptyCollectionHolder}                                                                               from "../src/EmptyCollectionHolder"
import {ForbiddenIndexException}                                                                             from "../src/exception/ForbiddenIndexException"
import {IndexOutOfBoundsException}                                                                           from "../src/exception/IndexOutOfBoundsException"
import {InvalidIndexRangeException}                                                                          from "../src/exception/InvalidIndexRangeException"
import {reversed, reversedByArray, reversedByCollectionHolder, reversedByMinimalistCollectionHolder}         from "../src/method/reversed"
import * as toReverseModule                                                                                  from "../src/method/toReverse"
import {toReversed, toReversedByArray, toReversedByCollectionHolder, toReversedByMinimalistCollectionHolder} from "../src/method/toReversed"

describe("CollectionHolderTest (reverse)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("toReverse",  () => expectToBeInstance(instance, it => it.toReverse(),),)
        test("toReversed", () => expectToBeInstance(instance, it => it.toReversed(),),)
        test("reversed",   () => expectToBeInstance(instance, it => it.reversed(),),)
    },)

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("toReversed", () => expect(new GenericCollectionHolder_ToReverseAlias().execute(it => it.toReverse(),).amountOfCall,).toBe(1,),)
            test("reversed",   () => expect(new GenericCollectionHolder_ToReverseAlias().execute(it => it.reversed(),).amountOfCall,).toBe(1,),)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("toReversed", () => expect(new LazyGenericCollectionHolder_ToReverseAlias().execute(it => it.toReversed(),).amountOfCall,).toBe(1,),)
            test("reversed",   () => expect(new LazyGenericCollectionHolder_ToReverseAlias().execute(it => it.reversed(),).amountOfCall,).toBe(1,),)
        },)

        describe("toReversed", () => {
            test("all", () => {
                const method = jest.spyOn(toReverseModule, "toReverse",)
                toReversed(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(toReverseModule, "toReverseByMinimalistCollectionHolder",)
                toReversedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(toReverseModule, "toReverseByCollectionHolder",)
                toReversedByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(toReverseModule, "toReverseByArray",)
                toReversedByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("reversed", () => {
            test("all", () => {
                const method = jest.spyOn(toReverseModule, "toReverse",)
                reversed(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(toReverseModule, "toReverseByMinimalistCollectionHolder",)
                reversedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(toReverseModule, "toReverseByCollectionHolder",)
                reversedByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(toReverseModule, "toReverseByArray",)
                reversedByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
    },)

    describe("methods", () => {
        test.each(everyExtensionMethodInstances,)("%s", ({value: {instance,},},) => expect(instance.toReverse(),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
    },)

    describe("instances", () => {
    describe.each(everyInstances,)("%s", ({value: {instance,},},) => {
        describe("get() being called", () => {
            test("empty",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.toReverse(),).amountOfCall,).toBe(0,),)
            test("1 field",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.toReverse(),).amountOfCall,).toBe(1,),)
            test("2 fields", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.toReverse(),).amountOfCall,).toBe(2,),)
            test("4 fields", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.toReverse(),).amountOfCall,).toBe(4,),)
        },)

        describe("empty", () => {
            test("direct", () => expect(new instance(EMPTY,).toReverse(),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("from (NaN)", () => expect(new instance(EMPTY,).toReverse(NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("from (-∞)",  () => expect(new instance(EMPTY,).toReverse(-Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("from (-1)",  () => expect(new instance(EMPTY,).toReverse(-1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("from (0)",   () => expect(new instance(EMPTY,).toReverse(0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("from (1)",   () => expect(new instance(EMPTY,).toReverse(1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("from (+∞)",  () => expect(new instance(EMPTY,).toReverse(Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("to (NaN)",   () => expect(new instance(EMPTY,).toReverse(null, NaN,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("to (-∞)",    () => expect(new instance(EMPTY,).toReverse(null, -Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("to (-1)",    () => expect(new instance(EMPTY,).toReverse(null, -1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("to (0)",     () => expect(new instance(EMPTY,).toReverse(null, 0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("to (1)",     () => expect(new instance(EMPTY,).toReverse(null, 1,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("to (+∞)",    () => expect(new instance(EMPTY,).toReverse(null, Infinity,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("1 field", () => {
            test('0', () => expect(new instance(A,).toReverse(0,).toArray(),).toEqual(A,),)
            test('4', () => expect(() => new instance(A,).executeWhileHavingIndexesOnField(it => it.toReverse(4,),),).toThrow(IndexOutOfBoundsException,),)
        },)
        describe("2 fields", () => {
            test('0', () => expect(new instance(AB,).toReverse(0,).toArray(),).toEqual(BA,),)
            test('1', () => expect(new instance(AB,).toReverse(1,).toArray(),).toEqual(B,),)
            test('4', () => expect(() => new instance(AB,).toReverse(4,),).toThrow(IndexOutOfBoundsException,),)
        },)
        describe("4 fields", () => {
            test('0', () => expect(new instance(ABCD,).toReverse(0,).toArray(),).toEqual(DCBA,),)
            test('1', () => expect(new instance(ABCD,).toReverse(1,).toArray(),).toEqual(DCB,),)
            test('2', () => expect(new instance(ABCD,).toReverse(2,).toArray(),).toEqual(DC,),)
            test('3', () => expect(new instance(ABCD,).toReverse(3,).toArray(),).toEqual(D,),)
            test('4', () => expect(() => new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.toReverse(4,),),).toThrow(IndexOutOfBoundsException,),)
        },)

        describe("from", () => {
            test("NaN",  () => expect(() => new instance(ABCD,).toReverse(NaN,),).toThrow(ForbiddenIndexException,),)
            test("-∞",   () => expect(() => new instance(ABCD,).toReverse(-Infinity,),).toThrow(ForbiddenIndexException,),)
            test("-500", () => expect(() => new instance(ABCD,).toReverse(-500,),).toThrow(IndexOutOfBoundsException,),)
            test("-6",   () => expect(() => new instance(ABCD,).toReverse(-6,),).toThrow(IndexOutOfBoundsException,),)
            test("-5",   () => expect(() => new instance(ABCD,).toReverse(-5,),).toThrow(IndexOutOfBoundsException,),)
            test("-4",   () => expect(new instance(ABCD,).toReverse(-4,).toArray(),).toEqual(DCBA,),)
            test("-3",   () => expect(new instance(ABCD,).toReverse(-3,).toArray(),).toEqual(DCB,),)
            test("-2",   () => expect(new instance(ABCD,).toReverse(-2,).toArray(),).toEqual(DC,),)
            test("-1",   () => expect(new instance(ABCD,).toReverse(-1,).toArray(),).toEqual(D,),)
            test("0",    () => expect(new instance(ABCD,).toReverse(0,).toArray(),).toEqual(DCBA,),)
            test("1",    () => expect(new instance(ABCD,).toReverse(1,).toArray(),).toEqual(DCB,),)
            test("2",    () => expect(new instance(ABCD,).toReverse(2,).toArray(),).toEqual(DC,),)
            test("3",    () => expect(new instance(ABCD,).toReverse(3,).toArray(),).toEqual(D,),)
            test("4",    () => expect(() => new instance(ABCD,).toReverse(4,),).toThrow(IndexOutOfBoundsException,),)
            test("5",    () => expect(() => new instance(ABCD,).toReverse(5,),).toThrow(IndexOutOfBoundsException,),)
            test("500",  () => expect(() => new instance(ABCD,).toReverse(500,),).toThrow(IndexOutOfBoundsException,),)
            test("+∞",   () => expect(() => new instance(ABCD,).toReverse(Infinity,),).toThrow(ForbiddenIndexException,),)
        },)
        describe("to", () => {
            test("NaN",  () => expect(() => new instance(ABCD,).toReverse(null, NaN,),).toThrow(ForbiddenIndexException,),)
            test("-∞",   () => expect(() => new instance(ABCD,).toReverse(null, -Infinity,),).toThrow(ForbiddenIndexException,),)
            test("-500", () => expect(() => new instance(ABCD,).toReverse(null, -500,),).toThrow(IndexOutOfBoundsException,),)
            test("-6",   () => expect(() => new instance(ABCD,).toReverse(null, -6,),).toThrow(IndexOutOfBoundsException,),)
            test("-5",   () => expect(() => new instance(ABCD,).toReverse(null, -5,),).toThrow(IndexOutOfBoundsException,),)
            test("-4",   () => expect(new instance(ABCD,).toReverse(null, -4,).toArray(),).toEqual(A,),)
            test("-3",   () => expect(new instance(ABCD,).toReverse(null, -3,).toArray(),).toEqual(BA,),)
            test("-2",   () => expect(new instance(ABCD,).toReverse(null, -2,).toArray(),).toEqual(CBA,),)
            test("-1",   () => expect(new instance(ABCD,).toReverse(null, -1,).toArray(),).toEqual(DCBA,),)
            test("0",    () => expect(new instance(ABCD,).toReverse(null, 0,).toArray(),).toEqual(A,),)
            test("1",    () => expect(new instance(ABCD,).toReverse(null, 1,).toArray(),).toEqual(BA,),)
            test("2",    () => expect(new instance(ABCD,).toReverse(null, 2,).toArray(),).toEqual(CBA,),)
            test("3",    () => expect(new instance(ABCD,).toReverse(null, 3,).toArray(),).toEqual(DCBA,),)
            test("4",    () => expect(() => new instance(ABCD,).toReverse(null, 4,),).toThrow(IndexOutOfBoundsException,),)
            test("5",    () => expect(() => new instance(ABCD,).toReverse(null, 5,),).toThrow(IndexOutOfBoundsException,),)
            test("500",  () => expect(() => new instance(ABCD,).toReverse(null, 500,),).toThrow(IndexOutOfBoundsException,),)
            test("+∞",   () => expect(() => new instance(ABCD,).toReverse(null, Infinity,),).toThrow(ForbiddenIndexException,),)
        },)
        describe("from + to", () => {
            test("NaN, NaN",   () => expect(() => new instance(ABCD,).toReverse(NaN, NaN,),).toThrow(ForbiddenIndexException,),)
            test("NaN, -∞",    () => expect(() => new instance(ABCD,).toReverse(NaN, -Infinity,),).toThrow(ForbiddenIndexException,),)
            test("NaN, -500",  () => expect(() => new instance(ABCD,).toReverse(NaN, -500,),).toThrow(ForbiddenIndexException,),)
            test("NaN, 0",     () => expect(() => new instance(ABCD,).toReverse(NaN, 0,),).toThrow(ForbiddenIndexException,),)
            test("NaN, 1",     () => expect(() => new instance(ABCD,).toReverse(NaN, 1,),).toThrow(ForbiddenIndexException,),)
            test("NaN, 2",     () => expect(() => new instance(ABCD,).toReverse(NaN, 2,),).toThrow(ForbiddenIndexException,),)
            test("NaN, 3",     () => expect(() => new instance(ABCD,).toReverse(NaN, 3,),).toThrow(ForbiddenIndexException,),)
            test("NaN, 500",   () => expect(() => new instance(ABCD,).toReverse(NaN, 500,),).toThrow(ForbiddenIndexException,),)
            test("NaN, +∞",    () => expect(() => new instance(ABCD,).toReverse(NaN, Infinity,),).toThrow(ForbiddenIndexException,),)

            test("-∞, NaN",    () => expect(() => new instance(ABCD,).toReverse(-Infinity, NaN,),).toThrow(ForbiddenIndexException,),)
            test("-∞, -∞",     () => expect(() => new instance(ABCD,).toReverse(-Infinity, -Infinity,),).toThrow(ForbiddenIndexException,),)
            test("-∞, -500",   () => expect(() => new instance(ABCD,).toReverse(-Infinity, -500,),).toThrow(ForbiddenIndexException,),)
            test("-∞, 0",      () => expect(() => new instance(ABCD,).toReverse(-Infinity, 0,),).toThrow(ForbiddenIndexException,),)
            test("-∞, 1",      () => expect(() => new instance(ABCD,).toReverse(-Infinity, 1,),).toThrow(ForbiddenIndexException,),)
            test("-∞, 2",      () => expect(() => new instance(ABCD,).toReverse(-Infinity, 2,),).toThrow(ForbiddenIndexException,),)
            test("-∞, 3",      () => expect(() => new instance(ABCD,).toReverse(-Infinity, 3,),).toThrow(ForbiddenIndexException,),)
            test("-∞, 500",    () => expect(() => new instance(ABCD,).toReverse(-Infinity, 500,),).toThrow(ForbiddenIndexException,),)
            test("-∞, +∞",     () => expect(() => new instance(ABCD,).toReverse(-Infinity, Infinity,),).toThrow(ForbiddenIndexException,),)

            test("-500, NaN",  () => expect(() => new instance(ABCD,).toReverse(-500, NaN,),).toThrow(IndexOutOfBoundsException,),)
            test("-500, -∞",   () => expect(() => new instance(ABCD,).toReverse(-500, -Infinity,),).toThrow(IndexOutOfBoundsException,),)
            test("-500, -500", () => expect(() => new instance(ABCD,).toReverse(-500, -500,),).toThrow(IndexOutOfBoundsException,),)
            test("-500, 0",    () => expect(() => new instance(ABCD,).toReverse(-500, 0,),).toThrow(IndexOutOfBoundsException,),)
            test("-500, 1",    () => expect(() => new instance(ABCD,).toReverse(-500, 1,),).toThrow(IndexOutOfBoundsException,),)
            test("-500, 2",    () => expect(() => new instance(ABCD,).toReverse(-500, 2,),).toThrow(IndexOutOfBoundsException,),)
            test("-500, 3",    () => expect(() => new instance(ABCD,).toReverse(-500, 3,),).toThrow(IndexOutOfBoundsException,),)
            test("-500, 500",  () => expect(() => new instance(ABCD,).toReverse(-500, 500,),).toThrow(IndexOutOfBoundsException,),)
            test("-500, +∞",   () => expect(() => new instance(ABCD,).toReverse(-500, Infinity,),).toThrow(IndexOutOfBoundsException,),)

            test("0, NaN",     () => expect(() => new instance(ABCD,).toReverse(0, NaN,),).toThrow(ForbiddenIndexException,),)
            test("0, -∞",      () => expect(() => new instance(ABCD,).toReverse(0, -Infinity,),).toThrow(ForbiddenIndexException,),)
            test("0, -500",    () => expect(() => new instance(ABCD,).toReverse(0, -500,),).toThrow(IndexOutOfBoundsException,),)
            test("0, 0",       () => expect(new instance(ABCD,).toReverse(0, 0,).toArray(),).toEqual(A,),)
            test("0, 1",       () => expect(new instance(ABCD,).toReverse(0, 1,).toArray(),).toEqual(BA,),)
            test("0, 2",       () => expect(new instance(ABCD,).toReverse(0, 2,).toArray(),).toEqual(CBA,),)
            test("0, 3",       () => expect(new instance(ABCD,).toReverse(0, 3,).toArray(),).toEqual(DCBA,),)
            test("0, 500",     () => expect(() => new instance(ABCD,).toReverse(0, 500,),).toThrow(IndexOutOfBoundsException,),)
            test("0, +∞",      () => expect(() => new instance(ABCD,).toReverse(0, Infinity,),).toThrow(ForbiddenIndexException,),)

            test("1, NaN",     () => expect(() => new instance(ABCD,).toReverse(1, NaN,),).toThrow(ForbiddenIndexException,),)
            test("1, -∞",      () => expect(() => new instance(ABCD,).toReverse(1, -Infinity,),).toThrow(ForbiddenIndexException,),)
            test("1, -500",    () => expect(() => new instance(ABCD,).toReverse(1, -500,),).toThrow(IndexOutOfBoundsException,),)
            test("1, 0",       () => expect(() => new instance(ABCD,).toReverse(1, 0,),).toThrow(InvalidIndexRangeException,),)
            test("1, 1",       () => expect(new instance(ABCD,).toReverse(1, 1,).toArray(),).toEqual(B,),)
            test("1, 2",       () => expect(new instance(ABCD,).toReverse(1, 2,).toArray(),).toEqual(CB,),)
            test("1, 3",       () => expect(new instance(ABCD,).toReverse(1, 3,).toArray(),).toEqual(DCB,),)
            test("1, 500",     () => expect(() => new instance(ABCD,).toReverse(1, 500,),).toThrow(IndexOutOfBoundsException,),)
            test("1, +∞",      () => expect(() => new instance(ABCD,).toReverse(1, Infinity,),).toThrow(ForbiddenIndexException,),)

            test("2, NaN",     () => expect(() => new instance(ABCD,).toReverse(2, NaN,),).toThrow(ForbiddenIndexException,),)
            test("2, -∞",      () => expect(() => new instance(ABCD,).toReverse(2, -Infinity,),).toThrow(ForbiddenIndexException,),)
            test("2, -500",    () => expect(() => new instance(ABCD,).toReverse(2, -500,),).toThrow(IndexOutOfBoundsException,),)
            test("2, 0",       () => expect(() => new instance(ABCD,).toReverse(2, 0,),).toThrow(InvalidIndexRangeException,),)
            test("2, 1",       () => expect(() => new instance(ABCD,).toReverse(2, 1,),).toThrow(InvalidIndexRangeException,),)
            test("2, 2",       () => expect(new instance(ABCD,).toReverse(2, 2,).toArray(),).toEqual(C,),)
            test("2, 3",       () => expect(new instance(ABCD,).toReverse(2, 3,).toArray(),).toEqual(DC,),)
            test("2, 500",     () => expect(() => new instance(ABCD,).toReverse(2, 500,),).toThrow(IndexOutOfBoundsException,),)
            test("2, +∞",      () => expect(() => new instance(ABCD,).toReverse(2, Infinity,),).toThrow(ForbiddenIndexException,),)

            test("3, NaN",     () => expect(() => new instance(ABCD,).toReverse(3, NaN,),).toThrow(ForbiddenIndexException,),)
            test("3, -∞",      () => expect(() => new instance(ABCD,).toReverse(3, -Infinity,),).toThrow(ForbiddenIndexException,),)
            test("3, -500",    () => expect(() => new instance(ABCD,).toReverse(3, -500,),).toThrow(IndexOutOfBoundsException,),)
            test("3, 0",       () => expect(() => new instance(ABCD,).toReverse(3, 0,),).toThrow(InvalidIndexRangeException,),)
            test("3, 1",       () => expect(() => new instance(ABCD,).toReverse(3, 1,),).toThrow(InvalidIndexRangeException,),)
            test("3, 1",       () => expect(() => new instance(ABCD,).toReverse(3, 2,),).toThrow(InvalidIndexRangeException,),)
            test("3, 3",       () => expect(new instance(ABCD,).toReverse(3, 3,).toArray(),).toEqual(D,),)
            test("0, 500",     () => expect(() => new instance(ABCD,).toReverse(3, 500,),).toThrow(IndexOutOfBoundsException,),)
            test("0, +∞",      () => expect(() => new instance(ABCD,).toReverse(3, Infinity,),).toThrow(ForbiddenIndexException,),)

            test("500, NaN",   () => expect(() => new instance(ABCD,).toReverse(500, NaN,),).toThrow(IndexOutOfBoundsException,),)
            test("500, -∞",    () => expect(() => new instance(ABCD,).toReverse(500, -Infinity,),).toThrow(IndexOutOfBoundsException,),)
            test("500, -500",  () => expect(() => new instance(ABCD,).toReverse(500, -500,),).toThrow(IndexOutOfBoundsException,),)
            test("500, 0",     () => expect(() => new instance(ABCD,).toReverse(500, 0,),).toThrow(IndexOutOfBoundsException,),)
            test("500, 1",     () => expect(() => new instance(ABCD,).toReverse(500, 1,),).toThrow(IndexOutOfBoundsException,),)
            test("500, 2",     () => expect(() => new instance(ABCD,).toReverse(500, 2,),).toThrow(IndexOutOfBoundsException,),)
            test("500, 3",     () => expect(() => new instance(ABCD,).toReverse(500, 3,),).toThrow(IndexOutOfBoundsException,),)
            test("500, 500",   () => expect(() => new instance(ABCD,).toReverse(500, 500,),).toThrow(IndexOutOfBoundsException,),)
            test("500, +∞",    () => expect(() => new instance(ABCD,).toReverse(500, Infinity,),).toThrow(IndexOutOfBoundsException,),)

            test("+∞, NaN",    () => expect(() => new instance(ABCD,).toReverse(Infinity, NaN,),).toThrow(ForbiddenIndexException,),)
            test("+∞, -∞",     () => expect(() => new instance(ABCD,).toReverse(Infinity, -Infinity,),).toThrow(ForbiddenIndexException,),)
            test("+∞, -500",   () => expect(() => new instance(ABCD,).toReverse(Infinity, -500,),).toThrow(ForbiddenIndexException,),)
            test("+∞, 0",      () => expect(() => new instance(ABCD,).toReverse(Infinity, 0,),).toThrow(ForbiddenIndexException,),)
            test("+∞, 1",      () => expect(() => new instance(ABCD,).toReverse(Infinity, 1,),).toThrow(ForbiddenIndexException,),)
            test("+∞, 2",      () => expect(() => new instance(ABCD,).toReverse(Infinity, 2,),).toThrow(ForbiddenIndexException,),)
            test("+∞, 3",      () => expect(() => new instance(ABCD,).toReverse(Infinity, 3,),).toThrow(ForbiddenIndexException,),)
            test("+∞, 500",    () => expect(() => new instance(ABCD,).toReverse(Infinity, 500,),).toThrow(ForbiddenIndexException,),)
            test("+∞, +∞",     () => expect(() => new instance(ABCD,).toReverse(Infinity, Infinity,),).toThrow(ForbiddenIndexException,),)
        },)
    },)},)

},)
