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

import {expectToBeInstance}                                             from "./expect/expectToBeInstance"
import {EmptyCollectionHolderForTest}                                   from "./instance/EmptyCollectionHolderForTest"
import {GenericCollectionHolder_ToReverseAlias}                         from "./instance/GenericCollectionHolder_ToReverseAlias"
import {LazyGenericCollectionHolder_ToReverseAlias}                     from "./instance/LazyGenericCollectionHolder_ToReverseAlias"
import {A, AB, ABCD, B, BA, C, CB, CBA, D, DC, DCB, DCBA, EMPTY}        from "./value/arrays"
import {everyCollectionInstancesAndExtensionFunctionAsCollectionHolder} from "./value/instances"

import {CollectionConstants}        from "../src/CollectionConstants"
import {ForbiddenIndexException}    from "../src/exception/ForbiddenIndexException"
import {IndexOutOfBoundsException}  from "../src/exception/IndexOutOfBoundsException"
import {InvalidIndexRangeException} from "../src/exception/InvalidIndexRangeException"

describe("CollectionHolderTest (reverse)", () => {

    describe("EmptyCollectionHolder", () => {
        test("toReverse",  () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.toReverse(),),)
        test("toReversed", () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.toReversed(),),)
        test("reversed",   () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.reversed(),),)
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
    },)

    describe.each(everyCollectionInstancesAndExtensionFunctionAsCollectionHolder,)("%s", ({value: {instance, isExtension,},},) => {
        if (!isExtension)
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
            test("0, 0", () => expect(new instance(ABCD,).toReverse(0, 0,).toArray(),).toEqual(A,),)
            test("0, 1", () => expect(new instance(ABCD,).toReverse(0, 1,).toArray(),).toEqual(BA,),)
            test("0, 2", () => expect(new instance(ABCD,).toReverse(0, 2,).toArray(),).toEqual(CBA,),)
            test("0, 3", () => expect(new instance(ABCD,).toReverse(0, 3,).toArray(),).toEqual(DCBA,),)
            test("1, 0", () => expect(() => new instance(ABCD,).toReverse(1, 0,),).toThrow(InvalidIndexRangeException,),)
            test("1, 1", () => expect(new instance(ABCD,).toReverse(1, 1,).toArray(),).toEqual(B,),)
            test("1, 2", () => expect(new instance(ABCD,).toReverse(1, 2,).toArray(),).toEqual(CB,),)
            test("1, 3", () => expect(new instance(ABCD,).toReverse(1, 3,).toArray(),).toEqual(DCB,),)
            test("2, 0", () => expect(() => new instance(ABCD,).toReverse(2, 0,),).toThrow(InvalidIndexRangeException,),)
            test("2, 1", () => expect(() => new instance(ABCD,).toReverse(2, 1,),).toThrow(InvalidIndexRangeException,),)
            test("2, 2", () => expect(new instance(ABCD,).toReverse(2, 2,).toArray(),).toEqual(C,),)
            test("2, 3", () => expect(new instance(ABCD,).toReverse(2, 3,).toArray(),).toEqual(DC,),)
            test("3, 0", () => expect(() => new instance(ABCD,).toReverse(3, 0,),).toThrow(InvalidIndexRangeException,),)
            test("3, 1", () => expect(() => new instance(ABCD,).toReverse(3, 1,),).toThrow(InvalidIndexRangeException,),)
            test("3, 1", () => expect(() => new instance(ABCD,).toReverse(3, 2,),).toThrow(InvalidIndexRangeException,),)
            test("3, 3", () => expect(new instance(ABCD,).toReverse(3, 3,).toArray(),).toEqual(D,),)
        },)
    },)

},)
