//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import {CollectionHolderFromArray} from "./instance/CollectionHolderFromArray"
import {A, AB, ABCD, EMPTY}        from "./value/arrays"

import {CollectionIteratorOf1}               from "../src/iterator/CollectionIteratorOf1"
import {CollectionIteratorOf2}               from "../src/iterator/CollectionIteratorOf2"
import {EmptyCollectionIterator}             from "../src/iterator/EmptyCollectionIterator"
import {GenericCollectionIterator}           from "../src/iterator/GenericCollectionIterator"
import {CollectionIteratorOf1_SizeAlias}     from "./instance/CollectionIteratorOf1_SizeAlias"
import {CollectionIteratorOf2_SizeAlias}     from "./instance/CollectionIteratorOf2_SizeAlias"
import {GenericCollectionIterator_SizeAlias} from "./instance/GenericCollectionIterator_SizeAlias"

describe("CollectionIteratorTest (size)", () => {

    describe("EmptyCollectionIterator", () => {
        const instance = EmptyCollectionIterator.get

        test("size",       () => expect(instance.size,).toBe(0,),)
        test("length",     () => expect(instance.length,).toBe(0,),)
        test("count",      () => expect(instance.count,).toBe(0,),)
        test("isEmpty",    () => expect(instance.isEmpty,).toBeTrue(),)
        test("isNotEmpty", () => expect(instance.isNotEmpty,).toBeFalse(),)
    },)

    describe("aliases", () => {
        describe("GenericCollectionIterator", () => {
            describe("length", () => expect(new GenericCollectionIterator_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            describe("count",  () => expect(new GenericCollectionIterator_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("CollectionIteratorOf1", () => {
            describe("length", () => expect(new CollectionIteratorOf1_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            describe("count",  () => expect(new CollectionIteratorOf1_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
        describe("CollectionIteratorOf2", () => {
            describe("length", () => expect(new CollectionIteratorOf2_SizeAlias().execute(it => it.length,).amountOfCall,).toBe(1,),)
            describe("count",  () => expect(new CollectionIteratorOf2_SizeAlias().execute(it => it.count,).amountOfCall,).toBe(1,),)
        },)
    },)


    describe('0', () => {
    describe("GenericCollectionIterator", () => {
        test("size",       () => expect(new GenericCollectionIterator(new CollectionHolderFromArray(EMPTY,),).size,)      .toBe(0,),)
        test("isEmpty",    () => expect(new GenericCollectionIterator(new CollectionHolderFromArray(EMPTY,),).isEmpty,)   .toBeTrue(),)
        test("isNotEmpty", () => expect(new GenericCollectionIterator(new CollectionHolderFromArray(EMPTY,),).isNotEmpty,).toBeFalse(),)
    },)},)

    describe('1', () => {
        describe("GenericCollectionIterator", () => {
            test("size",       () => expect(new GenericCollectionIterator(new CollectionHolderFromArray(A,),).size,)      .toBe(1,),)
            test("isEmpty",    () => expect(new GenericCollectionIterator(new CollectionHolderFromArray(A,),).isEmpty,)   .toBeFalse(),)
            test("isNotEmpty", () => expect(new GenericCollectionIterator(new CollectionHolderFromArray(A,),).isNotEmpty,).toBeTrue(),)
        },)
        describe("CollectionIteratorOf1", () => {
            test("size",       () => expect(new CollectionIteratorOf1('a',).size,)      .toBe(1,),)
            test("isEmpty",    () => expect(new CollectionIteratorOf1('a',).isEmpty,)   .toBeFalse(),)
            test("isNotEmpty", () => expect(new CollectionIteratorOf1('a',).isNotEmpty,).toBeTrue(),)
        },)
    },)

    describe('2', () => {
        describe("GenericCollectionIterator", () => {
            test("size",       () => expect(new GenericCollectionIterator(new CollectionHolderFromArray(AB,),).size,)      .toBe(2,),)
            test("isEmpty",    () => expect(new GenericCollectionIterator(new CollectionHolderFromArray(AB,),).isEmpty,)   .toBeFalse(),)
            test("isNotEmpty", () => expect(new GenericCollectionIterator(new CollectionHolderFromArray(AB,),).isNotEmpty,).toBeTrue(),)
        },)
        describe("CollectionIteratorOf1", () => {
            test("size",       () => expect(new CollectionIteratorOf2('a', 'b',).size,)      .toBe(2,),)
            test("isEmpty",    () => expect(new CollectionIteratorOf2('a', 'b',).isEmpty,)   .toBeFalse(),)
            test("isNotEmpty", () => expect(new CollectionIteratorOf2('a', 'b',).isNotEmpty,).toBeTrue(),)
        },)
    },)

    describe('4', () => {
    describe("GenericCollectionIterator", () => {
        test("size",       () => expect(new GenericCollectionIterator(new CollectionHolderFromArray(ABCD,),).size,)      .toBe(4,),)
        test("isEmpty",    () => expect(new GenericCollectionIterator(new CollectionHolderFromArray(ABCD,),).isEmpty,)   .toBeFalse(),)
        test("isNotEmpty", () => expect(new GenericCollectionIterator(new CollectionHolderFromArray(ABCD,),).isNotEmpty,).toBeTrue(),)
    },)},)

},)
