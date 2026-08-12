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

import {A, AA, AB, AB_AB, ABAB, ABCD}                                                                                               from "./value/arrays"
import {emptyCollectionIterator, every0Instances, every1Instances, every2Instances, everyExtensionMethodInstances, everyNInstances} from "./value/instances"

import {CollectionConstants}       from "../src/CollectionConstants"
import {EmptyCollectionHolder}     from "../src/EmptyCollectionHolder"
import {CollectionIteratorOf1}     from "../src/iterator/CollectionIteratorOf1"
import {CollectionIteratorOf2}     from "../src/iterator/CollectionIteratorOf2"
import {GenericCollectionIterator} from "../src/iterator/GenericCollectionIterator"

describe("CollectionHolderTest (conversion)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("toIterator",               () => expect(instance.toIterator(),).toBe(emptyCollectionIterator,),)
        test("toArray",                  () => expect(instance.toArray(),).toBe(CollectionConstants.EMPTY_ARRAY,),)
        test("toArray: frozen",          () => expect(instance.toArray(),).toBeFrozen(),)
        test("toMutableArray",           () => expect(instance.toMutableArray(),).toEqual([],),)
        test("toMutableArray: frozen",   () => expect(instance.toMutableArray(),).not.toBeFrozen(),)
        test("toSet",                    () => expect(instance.toSet(),).toBe(CollectionConstants.EMPTY_SET,),)
        test("toSet: frozen",            () => expect(instance.toSet(),).toBeFrozen(),)
        test("toMutableSet",             () => expect(instance.toMutableSet(),).toEqual(new Set(),),)
        test("toMutableSet: frozen",     () => expect(instance.toMutableSet(),).not.toBeFrozen(),)
        test("toWeakSet",                () => expect(instance.toWeakSet(),).toBe(CollectionConstants.EMPTY_WEAK_SET,),)
        test("toWeakSet: frozen",        () => expect(instance.toWeakSet(),).toBeFrozen(),)
        test("toMutableWeakWet",         () => expect(instance.toMutableWeakSet(),).toEqual(new WeakSet(),),)
        test("toMutableWeakWet: frozen", () => expect(instance.toMutableWeakSet(),).not.toBeFrozen(),)
        test("toMap",                    () => expect(instance.toMap(),).toBe(CollectionConstants.EMPTY_MAP,),)
        test("toMap: frozen",            () => expect(instance.toMap(),).toBeFrozen(),)
        test("toMutableMap",             () => expect(instance.toMutableMap(),).toEqual(new Map(),),)
        test("toMutableMap: frozen",     () => expect(instance.toMutableMap(),).not.toBeFrozen(),)
        test("toWeakMap",                () => expect(instance.toWeakMap(),).toBe(CollectionConstants.EMPTY_WEAK_MAP,),)
        test("toWeakMap: frozen",        () => expect(instance.toWeakMap(),).toBeFrozen(),)
        test("toMutableWeakMap",         () => expect(instance.toMutableWeakMap(),).toEqual(new WeakMap(),),)
        test("toMutableWeakMap: frozen", () => expect(instance.toMutableWeakMap(),).not.toBeFrozen(),)
        test("toString",                 () => expect(instance.toString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleString",           () => expect(instance.toLocaleString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLowerCaseString",        () => expect(instance.toLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleLowerCaseString",  () => expect(instance.toLocaleLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toUpperCaseString",        () => expect(instance.toUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleUpperCaseString",  () => expect(instance.toLocaleUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance: instance,},},) => {
        describe("toIterator",              () => expect(instance.toIterator(),).toBe(emptyCollectionIterator,),)
        describe("toArray",                 () => expect(instance.toArray(),).toBe(CollectionConstants.EMPTY_ARRAY,),)
        describe("toMutableArray",          () => expect(instance.toMutableArray(),).toEqual(CollectionConstants.EMPTY_ARRAY,),)
        describe("toSet",                   () => expect(instance.toSet(),).toBe(CollectionConstants.EMPTY_SET,),)
        describe("toMutableSet",            () => expect(instance.toMutableSet(),).toEqual(CollectionConstants.EMPTY_SET,),)
        // describe("toWeakSet",               () => expect(instance.toWeakSet(),).toBe(CollectionConstants.EMPTY_WEAK_SET,),)
        // describe("toMutableWeakSet",        () => expect(instance.toMutableWeakSet(),).toEqual(CollectionConstants.EMPTY_WEAK_SET,),)
        describe("toMap",                   () => expect(instance.toMap(),).toBe(CollectionConstants.EMPTY_MAP,),)
        describe("toMutableMap",            () => expect(instance.toMutableMap(),).toEqual(CollectionConstants.EMPTY_MAP,),)

        describe("toString",                () => expect(instance.toString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        describe("toLocaleString",          () => expect(instance.toLocaleString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        describe("toLowerCaseString",       () => expect(instance.toLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        describe("toLocaleLowerCaseString", () => expect(instance.toLocaleLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        describe("toUpperCaseString",       () => expect(instance.toUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        describe("toLocaleUpperCaseString", () => expect(instance.toLocaleUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
    },)},)

    describe("instances", () => {
        describe("empty", () => {
        describe.each(every0Instances,)("%s", ({value: {newInstance,},},) => {
            test("toIterator",              () => expect(newInstance().toIterator(),)             .toBe(emptyCollectionIterator,),)
            test("toArray",                 () => expect(newInstance().toArray(),)                .toBe(CollectionConstants.EMPTY_ARRAY,),)
            test("toMutableArray",          () => expect(newInstance().toMutableArray(),)         .toStrictEqual(CollectionConstants.EMPTY_ARRAY,),)
            test("toMutableArray: frozen",  () => expect(newInstance().toMutableArray(),)         .not.toBeFrozen(),)
            test("toSet",                   () => expect(newInstance().toSet(),)                  .toBe(CollectionConstants.EMPTY_SET,),)
            test("toMutableSet",            () => expect(newInstance().toMutableSet(),)           .toEqual(new Set(),),)
            test("toMutableSet: frozen",    () => expect(newInstance().toMutableSet(),)           .not.toBeFrozen(),)
            test("toMap",                   () => expect(newInstance().toMap(),)                  .toBe(CollectionConstants.EMPTY_MAP,),)
            test("toMutableMap",            () => expect(newInstance().toMutableMap(),)           .toEqual(new Map(),),)
            test("toMutableMap: frozen",    () => expect(newInstance().toMutableMap(),)           .not.toBeFrozen(),)
            test("toString",                () => expect(newInstance().toString(),)               .toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("toLocaleString",          () => expect(newInstance().toLocaleString(),)         .toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("toLowerCaseString",       () => expect(newInstance().toLowerCaseString(),)      .toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("toLocaleLowerCaseString", () => expect(newInstance().toLocaleLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("toUpperCaseString",       () => expect(newInstance().toUpperCaseString(),)      .toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("toLocaleUpperCaseString", () => expect(newInstance().toLocaleUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        },)},)
        describe("1 field", () => {
        describe.each(every1Instances,)("%s", ({value: {newInstance, isLazy, isOf1,},},) => {
            test("toIterator",              () => expect(newInstance('a',).toIterator(),)             .toBeInstanceOf(isLazy || isOf1 ? CollectionIteratorOf1 : GenericCollectionIterator,),)
            test("toArray",                 () => expect(newInstance('a',).toArray(),)                .toStrictEqual(A,),)
            test("toArray: frozen",         () => expect(newInstance('a',).toArray(),)                .toBeFrozen(),)
            test("toMutableArray",          () => expect(newInstance('a',).toMutableArray(),)         .toStrictEqual(A,),)
            test("toMutableArray: frozen",  () => expect(newInstance('a',).toMutableArray(),)         .not.toBeFrozen(),)
            test("toSet",                   () => expect(newInstance('a',).toSet(),)                  .toEqual(new Set(A,),),)
            test("toSet: frozen",           () => expect(newInstance('a',).toSet(),)                  .toBeFrozen(),)
            test("toMutableSet",            () => expect(newInstance('a',).toMutableSet(),)           .toEqual(new Set(A,),),)
            test("toMutableSet: frozen",    () => expect(newInstance('a',).toMutableSet(),)           .not.toBeFrozen(),)
            test("toMap",                   () => expect(newInstance('a',).toMap(),)                  .toEqual(new Map([[0, 'a',],],),),)
            test("toMap: frozen",           () => expect(newInstance('a',).toMap(),)                  .toBeFrozen(),)
            test("toMutableMap",            () => expect(newInstance('a',).toMutableMap(),)           .toEqual(new Map([[0, 'a',],],),),)
            test("toMutableMap: frozen",    () => expect(newInstance('a',).toMutableMap(),)           .not.toBeFrozen(),)
            test("toString",                () => expect(newInstance('a',).toString(),)               .toBe("[a]",),)
            test("toLocaleString",          () => expect(newInstance('a',).toLocaleString(),)         .toBe("[a]",),)
            test("toLowerCaseString",       () => expect(newInstance('a',).toLowerCaseString(),)      .toBe("[a]",),)
            test("toLocaleLowerCaseString", () => expect(newInstance('a',).toLocaleLowerCaseString(),).toBe("[a]",),)
            test("toUpperCaseString",       () => expect(newInstance('a',).toUpperCaseString(),)      .toBe("[A]",),)
            test("toLocaleUpperCaseString", () => expect(newInstance('a',).toLocaleUpperCaseString(),).toBe("[A]",),)
        },)},)
        describe("2 fields", () => {
        describe.each(every2Instances,)("%s", ({value: {newInstance, isLazy, isOf2, type,},},) => {
            /** The instance is a {@link SetAsCollectionHolder} of a {@link SetOf2AsCollectionHolder} */
            const isSet = type === "set adaptor" || type === "set of 2"
            const testIfNotSet = isSet ? test.skip : test

            test("toIterator",                          () => expect(newInstance('a', 'b',).toIterator(),)             .toBeInstanceOf(isLazy || isOf2 ? CollectionIteratorOf2 : GenericCollectionIterator,),)
            test("toArray ~ unique",                    () => expect(newInstance('a', 'b',).toArray(),)                .toStrictEqual(AB,),)
            testIfNotSet("toArray ~ duplicated",        () => expect(newInstance('a', 'a',).toArray(),)                .toStrictEqual(AA,),)
            test("toArray: frozen",                     () => expect(newInstance('a', 'b',).toArray(),)                .toBeFrozen(),)
            test("toMutableArray ~ unique",             () => expect(newInstance('a', 'b',).toMutableArray(),)         .toStrictEqual(AB,),)
            testIfNotSet("toMutableArray ~ duplicated", () => expect(newInstance('a', 'a',).toMutableArray(),)         .toStrictEqual(AA,),)
            test("toMutableArray: frozen",              () => expect(newInstance('a', 'b',).toMutableArray(),)         .not.toBeFrozen(),)
            test("toSet ~ unique",                      () => expect(newInstance('a', 'b',).toSet(),)                  .toEqual(new Set(AB,),),)
            testIfNotSet("toSet ~ duplicated",          () => expect(newInstance('a', 'a',).toSet(),)                  .toEqual(new Set(A,),),)
            test("toSet: frozen",                       () => expect(newInstance('a', 'b',).toSet(),)                  .toBeFrozen(),)
            test("toMutableSet ~ unique",               () => expect(newInstance('a', 'b',).toMutableSet(),)           .toEqual(new Set(AB,),),)
            testIfNotSet("toMutableSet ~ duplicated",   () => expect(newInstance('a', 'a',).toMutableSet(),)           .toEqual(new Set(A,),),)
            test("toMutableSet: frozen",                () => expect(newInstance('a', 'b',).toMutableSet(),)           .not.toBeFrozen(),)
            test("toMap ~ unique",                      () => expect(newInstance('a', 'b',).toMap(),)                  .toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
            testIfNotSet("toMap ~ duplicated",          () => expect(newInstance('a', 'a',).toMap(),)                  .toEqual(new Map([[0, 'a',], [1, 'a',],],),),)
            test("toMap: frozen",                       () => expect(newInstance('a', 'b',).toMap(),)                  .toBeFrozen(),)
            test("toMutableMap ~ unique",               () => expect(newInstance('a', 'b',).toMutableMap(),)           .toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
            testIfNotSet("toMutableMap ~ duplicated",   () => expect(newInstance('a', 'a',).toMutableMap(),)           .toEqual(new Map([[0, 'a',], [1, 'a',],],),),)
            test("toMutableMap: frozen",                () => expect(newInstance('a', 'b',).toMutableMap(),)           .not.toBeFrozen(),)
            test("toString",                            () => expect(newInstance('a', 'A',).toString(),)               .toBe("[a, A]",),)
            test("toLocaleString",                      () => expect(newInstance('a', 'A',).toLocaleString(),)         .toBe("[a, A]",),)
            test("toLowerCaseString",                   () => expect(newInstance('a', 'A',).toLowerCaseString(),)      .toBe("[a, a]",),)
            test("toLocaleLowerCaseString",             () => expect(newInstance('a', 'A',).toLocaleLowerCaseString(),).toBe("[a, a]",),)
            test("toUpperCaseString",                   () => expect(newInstance('a', 'A',).toUpperCaseString(),)      .toBe("[A, A]",),)
            test("toLocaleUpperCaseString",             () => expect(newInstance('a', 'A',).toLocaleUpperCaseString(),).toBe("[A, A]",),)
        },)},)
        describe("N fields", () => {
        describe.each(everyNInstances,)("%s", ({value: {instance, type,},},) => {
            /** The instance is a {@link SetAsCollectionHolder} */
            const isSet = type === "set adaptor"
            const testIfNotSet = isSet ? test.skip : test

            test("toIterator",                           () => expect(new instance(ABCD,) .toIterator(),)             .toBeInstanceOf(GenericCollectionIterator,),)
            test("toArray ~ unique",                     () => expect(new instance(ABCD,) .toArray(),)                .toStrictEqual(ABCD,),)
            testIfNotSet("toArray ~ duplicating",        () => expect(new instance(ABAB,) .toArray(),)                .toStrictEqual(ABAB,),)
            test("toArray: frozen",                      () => expect(new instance(ABCD,) .toArray(),)                .toBeFrozen(),)
            test("toMutableArray ~ unique",              () => expect(new instance(ABCD,) .toMutableArray(),)         .toStrictEqual(ABCD,),)
            testIfNotSet("toMutableArray ~ duplicating", () => expect(new instance(ABAB,) .toMutableArray(),)         .toStrictEqual(ABAB,),)
            test("toMutableArray: frozen",               () => expect(new instance(ABCD,) .toMutableArray(),)         .not.toBeFrozen(),)
            test("toSet ~ unique",                       () => expect(new instance(ABCD,) .toSet(),)                  .toEqual(new Set(ABCD,),),)
            testIfNotSet("toSet ~ duplicating",          () => expect(new instance(ABAB,) .toSet(),)                  .toEqual(new Set(AB,),),)
            test("toSet: frozen",                        () => expect(new instance(ABCD,) .toSet(),)                  .toBeFrozen(),)
            test("toMutableSet ~ unique",                () => expect(new instance(ABCD,) .toMutableSet(),)           .toEqual(new Set(ABCD,),),)
            testIfNotSet("toMutableSet ~ duplicating",   () => expect(new instance(ABAB,) .toMutableSet(),)           .toEqual(new Set(AB,),),)
            test("toMutableSet: frozen",                 () => expect(new instance(ABCD,) .toMutableSet(),)           .not.toBeFrozen(),)
            test("toMap ~ unique",                       () => expect(new instance(ABCD,) .toMap(),)                  .toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'c',], [3, 'd',],],),),)
            testIfNotSet("toMap ~ duplicating",          () => expect(new instance(ABAB,) .toMap(),)                  .toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'a',], [3, 'b',],],),),)
            test("toMap: frozen",                        () => expect(new instance(ABCD,) .toMap(),)                  .toBeFrozen(),)
            test("toMutableMap ~ unique",                () => expect(new instance(ABCD,) .toMutableMap(),)           .toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'c',], [3, 'd',],],),),)
            testIfNotSet("toMutableMap ~ duplicating",   () => expect(new instance(ABAB,) .toMutableMap(),)           .toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'a',], [3, 'b',],],),),)
            test("toMutableMap: frozen",                 () => expect(new instance(ABCD,) .toMutableMap(),)           .not.toBeFrozen(),)
            test("toString",                             () => expect(new instance(AB_AB,).toString(),)               .toBe("[a, b, A, B]",),)
            test("toLocaleString",                       () => expect(new instance(AB_AB,).toLocaleString(),)         .toBe("[a, b, A, B]",),)
            test("toLowerCaseString",                    () => expect(new instance(AB_AB,).toLowerCaseString(),)      .toBe("[a, b, a, b]",),)
            test("toLocaleLowerCaseString",              () => expect(new instance(AB_AB,).toLocaleLowerCaseString(),).toBe("[a, b, a, b]",),)
            test("toUpperCaseString",                    () => expect(new instance(AB_AB,).toUpperCaseString(),)      .toBe("[A, B, A, B]",),)
            test("toLocaleUpperCaseString",              () => expect(new instance(AB_AB,).toLocaleUpperCaseString(),).toBe("[A, B, A, B]",),)
        },)},)
    },)

},)
