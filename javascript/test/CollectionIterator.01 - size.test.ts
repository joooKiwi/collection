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

import {A, AB, ABCD, EMPTY} from "./value/arrays"

import {EmptyCollectionIterator}                      from "../src/iterator/EmptyCollectionIterator"
import {CollectionIterator_1}                         from "./instance/CollectionIterator_1"
import {CollectionIterator_1Follower}                 from "./instance/CollectionIterator_1.follower"
import {CollectionIterator_2}                         from "./instance/CollectionIterator_2"
import {CollectionIterator_2Follower}                 from "./instance/CollectionIterator_2.follower"
import {CollectionIterator_ByGenericIterator}         from "./instance/CollectionIterator_ByGenericIterator"
import {CollectionIterator_ByGenericIteratorFollower} from "./instance/CollectionIterator_ByGenericIterator.follower"

describe("CollectionIteratorTest (size)", () => {

    describe("EmptyCollectionIterator", () => {
        const instance = EmptyCollectionIterator.get

        test("size",                      () => expect(instance.size,).toBe(0,),)
        test("length",                    () => expect(instance.length,).toBe(0,),)
        test("count",                     () => expect(instance.count,).toBe(0,),)
        test("isEmpty",                   () => expect(instance.isEmpty,).toBeTrue(),)
        test("isNotEmpty",                () => expect(instance.isNotEmpty,).toBeFalse(),)
        test("hasAtLeast1Element",        () => expect(instance.hasAtLeast1Element,).toBeFalse(),)
        test("containsAtLeast1Element",   () => expect(instance.containsAtLeast1Element,).toBeFalse(),)
        test("includesAtLeast1Element",   () => expect(instance.includesAtLeast1Element,).toBeFalse(),)
        test("hasExactly1Element",        () => expect(instance.hasExactly1Element,).toBeFalse(),)
        test("containsExactly1Element",   () => expect(instance.containsExactly1Element,).toBeFalse(),)
        test("includesExactly1Element",   () => expect(instance.includesExactly1Element,).toBeFalse(),)
        test("hasAtMost1Element",         () => expect(instance.hasAtMost1Element,).toBeTrue(),)
        test("containsAtMost1Element",    () => expect(instance.containsAtMost1Element,).toBeTrue(),)
        test("includesAtMost1Element",    () => expect(instance.includesAtMost1Element,).toBeTrue(),)
        test("hasAtLeast2Elements",       () => expect(instance.hasAtLeast2Elements,).toBeFalse(),)
        test("containsAtLeast2Elements",  () => expect(instance.containsAtLeast2Elements,).toBeFalse(),)
        test("includesAtLeast2Elements",  () => expect(instance.includesAtLeast2Elements,).toBeFalse(),)
        test("hasExactly2Elements",       () => expect(instance.hasExactly2Elements,).toBeFalse(),)
        test("containsExactly2Elements",  () => expect(instance.containsExactly2Elements,).toBeFalse(),)
        test("includesExactly2Elements",  () => expect(instance.includesExactly2Elements,).toBeFalse(),)
        test("hasAtMost2Elements",        () => expect(instance.hasAtMost2Elements,).toBeTrue(),)
        test("containsAtMost2Elements",   () => expect(instance.containsAtMost2Elements,).toBeTrue(),)
        test("includesAtMost2Elements",   () => expect(instance.includesAtMost2Elements,).toBeTrue(),)
    },)

    describe("aliases", () => {
        describe("GenericCollectionIterator", () => {
            test("length",                   () => expect(new CollectionIterator_ByGenericIteratorFollower().execute(it => it.length,).size_amountOfCall,).toBe(1,),)
            test("count",                    () => expect(new CollectionIterator_ByGenericIteratorFollower().execute(it => it.count,).size_amountOfCall,).toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionIterator_ByGenericIteratorFollower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionIterator_ByGenericIteratorFollower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionIterator_ByGenericIteratorFollower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionIterator_ByGenericIteratorFollower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionIterator_ByGenericIteratorFollower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionIterator_ByGenericIteratorFollower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionIterator_ByGenericIteratorFollower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionIterator_ByGenericIteratorFollower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionIterator_ByGenericIteratorFollower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionIterator_ByGenericIteratorFollower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionIterator_ByGenericIteratorFollower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionIterator_ByGenericIteratorFollower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionIterator_ByGenericIteratorFollower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("CollectionIteratorOf1", () => {
            test("length",                   () => expect(new CollectionIterator_1Follower().execute(it => it.length,).size_amountOfCall,).toBe(1,),)
            test("count",                    () => expect(new CollectionIterator_1Follower().execute(it => it.count,).size_amountOfCall,).toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionIterator_1Follower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionIterator_1Follower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionIterator_1Follower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionIterator_1Follower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionIterator_1Follower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionIterator_1Follower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionIterator_1Follower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionIterator_1Follower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionIterator_1Follower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionIterator_1Follower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionIterator_1Follower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionIterator_1Follower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionIterator_1Follower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("CollectionIteratorOf2", () => {
            test("length",                   () => expect(new CollectionIterator_2Follower().execute(it => it.length,).size_amountOfCall,).toBe(1,),)
            test("count",                    () => expect(new CollectionIterator_2Follower().execute(it => it.count,).size_amountOfCall,).toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionIterator_2Follower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionIterator_2Follower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionIterator_2Follower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionIterator_2Follower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionIterator_2Follower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionIterator_2Follower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionIterator_2Follower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionIterator_2Follower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionIterator_2Follower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionIterator_2Follower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionIterator_2Follower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionIterator_2Follower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionIterator_2Follower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
    },)


    describe("empty", () => {
    describe("GenericCollectionIterator", () => {
        test("size",                () => expect(new CollectionIterator_ByGenericIterator(EMPTY,).size,)               .toBe(0,),)
        test("isEmpty",             () => expect(new CollectionIterator_ByGenericIterator(EMPTY,).isEmpty,)            .toBeTrue(),)
        test("isNotEmpty",          () => expect(new CollectionIterator_ByGenericIterator(EMPTY,).isNotEmpty,)         .toBeFalse(),)
        test("hasExactly1Element",  () => expect(new CollectionIterator_ByGenericIterator(EMPTY,).hasExactly1Element,) .toBeFalse(),)
        test("hasAtMost1Element",   () => expect(new CollectionIterator_ByGenericIterator(EMPTY,).hasAtMost1Element,)  .toBeTrue(),)
        test("hasAtLeast2Elements", () => expect(new CollectionIterator_ByGenericIterator(EMPTY,).hasAtLeast2Elements,).toBeFalse(),)
        test("hasExactly2Elements", () => expect(new CollectionIterator_ByGenericIterator(EMPTY,).hasExactly2Elements,).toBeFalse(),)
        test("hasAtMost2Elements",  () => expect(new CollectionIterator_ByGenericIterator(EMPTY,).hasAtMost2Elements,) .toBeTrue(),)
    },)},)

    describe("1 field", () => {
        describe("GenericCollectionIterator", () => {
            test("size",                () => expect(new CollectionIterator_ByGenericIterator(A,).size,)               .toBe(1,),)
            test("isEmpty",             () => expect(new CollectionIterator_ByGenericIterator(A,).isEmpty,)            .toBeFalse(),)
            test("isNotEmpty",          () => expect(new CollectionIterator_ByGenericIterator(A,).isNotEmpty,)         .toBeTrue(),)
            test("hasExactly1Element",  () => expect(new CollectionIterator_ByGenericIterator(A,).hasExactly1Element,) .toBeTrue(),)
            test("hasAtMost1Element",   () => expect(new CollectionIterator_ByGenericIterator(A,).hasAtMost1Element,)  .toBeTrue(),)
            test("hasAtLeast2Elements", () => expect(new CollectionIterator_ByGenericIterator(A,).hasAtLeast2Elements,).toBeFalse(),)
            test("hasExactly2Elements", () => expect(new CollectionIterator_ByGenericIterator(A,).hasExactly2Elements,).toBeFalse(),)
            test("hasAtMost2Elements",  () => expect(new CollectionIterator_ByGenericIterator(A,).hasAtMost2Elements,) .toBeTrue(),)
        },)
        describe("CollectionIteratorOf1", () => {
            test("size",                () => expect(new CollectionIterator_1('a',).size,)               .toBe(1,),)
            test("isEmpty",             () => expect(new CollectionIterator_1('a',).isEmpty,)            .toBeFalse(),)
            test("isNotEmpty",          () => expect(new CollectionIterator_1('a',).isNotEmpty,)         .toBeTrue(),)
            test("hasExactly1Element",  () => expect(new CollectionIterator_1('a',).hasExactly1Element,) .toBeTrue(),)
            test("hasAtMost1Element",   () => expect(new CollectionIterator_1('a',).hasAtMost1Element,)  .toBeTrue(),)
            test("hasAtLeast2Elements", () => expect(new CollectionIterator_1('a',).hasAtLeast2Elements,).toBeFalse(),)
            test("hasExactly2Elements", () => expect(new CollectionIterator_1('a',).hasExactly2Elements,).toBeFalse(),)
            test("hasAtMost2Elements",  () => expect(new CollectionIterator_1('a',).hasAtMost2Elements,) .toBeTrue(),)
        },)
    },)

    describe("2 fields", () => {
        describe("GenericCollectionIterator", () => {
            test("size",                () => expect(new CollectionIterator_ByGenericIterator(AB,).size,)               .toBe(2,),)
            test("isEmpty",             () => expect(new CollectionIterator_ByGenericIterator(AB,).isEmpty,)            .toBeFalse(),)
            test("isNotEmpty",          () => expect(new CollectionIterator_ByGenericIterator(AB,).isNotEmpty,)         .toBeTrue(),)
            test("hasExactly1Element",  () => expect(new CollectionIterator_ByGenericIterator(AB,).hasExactly1Element,) .toBeFalse(),)
            test("hasAtMost1Element",   () => expect(new CollectionIterator_ByGenericIterator(AB,).hasAtMost1Element,)  .toBeFalse(),)
            test("hasAtLeast2Elements", () => expect(new CollectionIterator_ByGenericIterator(AB,).hasAtLeast2Elements,).toBeTrue(),)
            test("hasExactly2Elements", () => expect(new CollectionIterator_ByGenericIterator(AB,).hasExactly2Elements,).toBeTrue(),)
            test("hasAtMost2Elements",  () => expect(new CollectionIterator_ByGenericIterator(AB,).hasAtMost2Elements,) .toBeTrue(),)
        },)
        describe("CollectionIteratorOf2", () => {
            test("size",                () => expect(new CollectionIterator_2('a', 'b',).size,)               .toBe(2,),)
            test("isEmpty",             () => expect(new CollectionIterator_2('a', 'b',).isEmpty,)            .toBeFalse(),)
            test("isNotEmpty",          () => expect(new CollectionIterator_2('a', 'b',).isNotEmpty,)         .toBeTrue(),)
            test("hasExactly1Element",  () => expect(new CollectionIterator_2('a', 'b',).hasExactly1Element,) .toBeFalse(),)
            test("hasAtMost1Element",   () => expect(new CollectionIterator_2('a', 'b',).hasAtMost1Element,)  .toBeFalse(),)
            test("hasAtLeast2Elements", () => expect(new CollectionIterator_2('a', 'b',).hasAtLeast2Elements,).toBeTrue(),)
            test("hasExactly2Elements", () => expect(new CollectionIterator_2('a', 'b',).hasExactly2Elements,).toBeTrue(),)
            test("hasAtMost2Elements",  () => expect(new CollectionIterator_2('a', 'b',).hasAtMost2Elements,) .toBeTrue(),)
        },)
    },)

    describe("4 fields", () => {
    describe("GenericCollectionIterator", () => {
        test("size",                () => expect(new CollectionIterator_ByGenericIterator(ABCD,).size,)               .toBe(4,),)
        test("isEmpty",             () => expect(new CollectionIterator_ByGenericIterator(ABCD,).isEmpty,)            .toBeFalse(),)
        test("isNotEmpty",          () => expect(new CollectionIterator_ByGenericIterator(ABCD,).isNotEmpty,)         .toBeTrue(),)
        test("hasExactly1Element",  () => expect(new CollectionIterator_ByGenericIterator(ABCD,).hasExactly1Element,) .toBeFalse(),)
        test("hasAtMost1Element",   () => expect(new CollectionIterator_ByGenericIterator(ABCD,).hasAtMost1Element,)  .toBeFalse(),)
        test("hasAtLeast2Elements", () => expect(new CollectionIterator_ByGenericIterator(ABCD,).hasAtLeast2Elements,).toBeTrue(),)
        test("hasExactly2Elements", () => expect(new CollectionIterator_ByGenericIterator(ABCD,).hasExactly2Elements,).toBeFalse(),)
        test("hasAtMost2Elements",  () => expect(new CollectionIterator_ByGenericIterator(ABCD,).hasAtMost2Elements,) .toBeFalse(),)
    },)},)

},)
