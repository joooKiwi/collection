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

import {EmptyCollectionHolderForTest}                             from "./instance/EmptyCollectionHolderForTest"
import {A, A_A, AA, AB, AB_AB, ABAB, ABCD, EMPTY, NULL_UNDEFINED} from "./value/arrays"

import {toArray, toArrayByArray, toArrayByCollectionHolder, toArrayByMinimalistCollectionHolder}                                                                 from "../src/method/toArray"
import {toIterator, toIteratorByArray, toIteratorByCollectionHolder, toIteratorByMinimalistCollectionHolder}                                                     from "../src/method/toIterator"
import {toLocaleLowerCaseString, toLocaleLowerCaseStringByArray, toLocaleLowerCaseStringByCollectionHolder, toLocaleLowerCaseStringByMinimalistCollectionHolder} from "../src/method/toLocaleLowerCaseString"
import {toLocaleString, toLocaleStringByArray, toLocaleStringByCollectionHolder, toLocaleStringByMinimalistCollectionHolder}                                     from "../src/method/toLocaleString"
import {toLocaleUpperCaseString, toLocaleUpperCaseStringByArray, toLocaleUpperCaseStringByCollectionHolder, toLocaleUpperCaseStringByMinimalistCollectionHolder} from "../src/method/toLocaleUpperCaseString"
import {toLowerCaseString, toLowerCaseStringByArray, toLowerCaseStringByCollectionHolder, toLowerCaseStringByMinimalistCollectionHolder}                         from "../src/method/toLowerCaseString"
import {toMap, toMapByArray, toMapByCollectionHolder, toMapByMinimalistCollectionHolder}                                                                         from "../src/method/toMap"
import {toMutableArray, toMutableArrayByArray, toMutableArrayByCollectionHolder, toMutableArrayByMinimalistCollectionHolder}                                     from "../src/method/toMutableArray"
import {toMutableMap, toMutableMapByArray, toMutableMapByCollectionHolder, toMutableMapByMinimalistCollectionHolder}                                             from "../src/method/toMutableMap"
import {toMutableSet, toMutableSetByArray, toMutableSetByCollectionHolder, toMutableSetByMinimalistCollectionHolder}                                             from "../src/method/toMutableSet"
import {toMutableWeakSet, toMutableWeakSetByArray, toMutableWeakSetByCollectionHolder, toMutableWeakSetByMinimalistCollectionHolder}                             from "../src/method/toMutableWeakSet"
import {toSet, toSetByArray, toSetByCollectionHolder, toSetByMinimalistCollectionHolder}                                                                         from "../src/method/toSet"
import {toString, toStringByArray, toStringByCollectionHolder, toStringByMinimalistCollectionHolder}                                                             from "../src/method/toString"
import {toUpperCaseString, toUpperCaseStringByArray, toUpperCaseStringByCollectionHolder, toUpperCaseStringByMinimalistCollectionHolder}                         from "../src/method/toUpperCaseString"
import {toWeakSet, toWeakSetByArray, toWeakSetByCollectionHolder, toWeakSetByMinimalistCollectionHolder}                                                         from "../src/method/toWeakSet"
import {CollectionConstants}       from "../src/CollectionConstants"
import {EmptyCollectionHolder}     from "../src/EmptyCollectionHolder"
import {GenericCollectionIterator} from "../src/iterator/GenericCollectionIterator"

describe("CollectionHolderTest (conversion)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

    describe.each(NULL_UNDEFINED,)("%s", it => {
        describe("toIterator", () => {
            test("all",                          () => expect(toIterator(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
            test("minimalist collection holder", () => expect(toIteratorByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
            test("collection holder",            () => expect(toIteratorByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
            test("array",                        () => expect(toIteratorByArray(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
        },)
        describe("toArray", () => {
            test("all",                          () => expect(toArray(it,) === CollectionConstants.EMPTY_ARRAY,).toBeTrue(),)
            test("minimalist collection holder", () => expect(toArrayByMinimalistCollectionHolder(it,) === CollectionConstants.EMPTY_ARRAY,).toBeTrue(),)
            test("collection holder",            () => expect(toArrayByCollectionHolder(it,) === CollectionConstants.EMPTY_ARRAY,).toBeTrue(),)
            test("array",                        () => expect(toArrayByArray(it,) === CollectionConstants.EMPTY_ARRAY,).toBeTrue(),)
        },)
        describe("toMutableArray", () => {
            test("all",                          () => expect(toMutableArray(it,),).toEqual(CollectionConstants.EMPTY_ARRAY,),)
            test("minimalist collection holder", () => expect(toMutableArrayByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_ARRAY,),)
            test("collection holder",            () => expect(toMutableArrayByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_ARRAY,),)
            test("array",                        () => expect(toMutableArrayByArray(it,),).toEqual(CollectionConstants.EMPTY_ARRAY,),)
        },)
        describe("toSet", () => {
            test("all",                          () => expect(toSet(it,) === CollectionConstants.EMPTY_SET,).toBeTrue(),)
            test("minimalist collection holder", () => expect(toSetByMinimalistCollectionHolder(it,) === CollectionConstants.EMPTY_SET,).toBeTrue(),)
            test("collection holder",            () => expect(toSetByCollectionHolder(it,) === CollectionConstants.EMPTY_SET,).toBeTrue(),)
            test("array",                        () => expect(toSetByArray(it,) === CollectionConstants.EMPTY_SET,).toBeTrue(),)
        },)
        describe("toMutableSet", () => {
            test("all",                          () => expect(toMutableSet(it,),).toEqual(CollectionConstants.EMPTY_SET,),)
            test("minimalist collection holder", () => expect(toMutableSetByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_SET,),)
            test("collection holder",            () => expect(toMutableSetByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_SET,),)
            test("array",                        () => expect(toMutableSetByArray(it,),).toEqual(CollectionConstants.EMPTY_SET,),)
        },)
        describe("toWeakSet", () => {
            test("all",                          () => expect(toWeakSet(it,) === CollectionConstants.EMPTY_WEAK_SET,).toBeTrue(),)
            test("minimalist collection holder", () => expect(toWeakSetByMinimalistCollectionHolder(it,) === CollectionConstants.EMPTY_WEAK_SET,).toBeTrue(),)
            test("collection holder",            () => expect(toWeakSetByCollectionHolder(it,) === CollectionConstants.EMPTY_WEAK_SET,).toBeTrue(),)
            test("array",                        () => expect(toWeakSetByArray(it,) === CollectionConstants.EMPTY_WEAK_SET,).toBeTrue(),)
        },)
        describe("toMutableWeakSet", () => {
            test("all",                          () => expect(toMutableWeakSet(it,),).toEqual(CollectionConstants.EMPTY_WEAK_SET,),)
            test("minimalist collection holder", () => expect(toMutableWeakSetByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_WEAK_SET,),)
            test("collection holder",            () => expect(toMutableWeakSetByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_WEAK_SET,),)
            test("array",                        () => expect(toMutableWeakSetByArray(it,),).toEqual(CollectionConstants.EMPTY_WEAK_SET,),)
        },)
        describe("toMap", () => {
            test("all",                          () => expect(toMap(it,) === CollectionConstants.EMPTY_MAP,).toBeTrue(),)
            test("minimalist collection holder", () => expect(toMapByMinimalistCollectionHolder(it,) === CollectionConstants.EMPTY_MAP,).toBeTrue(),)
            test("collection holder",            () => expect(toMapByCollectionHolder(it,) === CollectionConstants.EMPTY_MAP,).toBeTrue(),)
            test("array",                        () => expect(toMapByArray(it,) === CollectionConstants.EMPTY_MAP,).toBeTrue(),)
        },)
        describe("toMutableMap", () => {
            test("all",                          () => expect(toMutableMap(it,),).toEqual(CollectionConstants.EMPTY_MAP,),)
            test("minimalist collection holder", () => expect(toMutableMapByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_MAP,),)
            test("collection holder",            () => expect(toMutableMapByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_MAP,),)
            test("array",                        () => expect(toMutableMapByArray(it,),).toEqual(CollectionConstants.EMPTY_MAP,),)
        },)
        describe("toString", () => {
            test("all",                          () => expect(toString(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("minimalist collection holder", () => expect(toStringByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("collection holder",            () => expect(toStringByCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("array",                        () => expect(toStringByArray(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        },)
        describe("toLocaleString", () => {
            test("all",                          () => expect(toLocaleString(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("minimalist collection holder", () => expect(toLocaleStringByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("collection holder",            () => expect(toLocaleStringByCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("array",                        () => expect(toLocaleStringByArray(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        },)
        describe("toLowerCaseString", () => {
            test("all",                          () => expect(toLowerCaseString(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("minimalist collection holder", () => expect(toLowerCaseStringByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("collection holder",            () => expect(toLowerCaseStringByCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("array",                        () => expect(toLowerCaseStringByArray(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        },)
        describe("toLocaleLowerCaseString", () => {
            test("all",                          () => expect(toLocaleLowerCaseString(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("minimalist collection holder", () => expect(toLocaleLowerCaseStringByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("collection holder",            () => expect(toLocaleLowerCaseStringByCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("array",                        () => expect(toLocaleLowerCaseStringByArray(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        },)
        describe("toUpperCaseString", () => {
            test("all",                          () => expect(toUpperCaseString(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("minimalist collection holder", () => expect(toUpperCaseStringByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("collection holder",            () => expect(toUpperCaseStringByCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("array",                        () => expect(toUpperCaseStringByArray(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        },)
        describe("toLocaleUpperCaseString", () => {
            test("all",                          () => expect(toLocaleUpperCaseString(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("minimalist collection holder", () => expect(toLocaleUpperCaseStringByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("collection holder",            () => expect(toLocaleUpperCaseStringByCollectionHolder(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
            test("array",                        () => expect(toLocaleUpperCaseStringByArray(it,),).toEqual(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        },)
    },)
        test("toIterator",               () => expect(instance.toIterator(),).toEqual(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
        test("toArray",                  () => expect(instance.toArray(),).toEqual(CollectionConstants.EMPTY_ARRAY,),)
        test("toArray: frozen",          () => expect(instance.toArray(),).toBeFrozen(),)
        test("toMutableArray",           () => expect(instance.toMutableArray(),).toEqual([],),)
        test("toMutableArray: frozen",   () => expect(instance.toMutableArray(),).not.toBeFrozen(),)
        test("toSet",                    () => expect(instance.toSet(),).toEqual(CollectionConstants.EMPTY_SET,),)
        test("toSet: frozen",            () => expect(instance.toSet(),).toBeFrozen(),)
        test("toMutableSet",             () => expect(instance.toMutableSet(),).toEqual(new Set(),),)
        test("toMutableSet: frozen",     () => expect(instance.toMutableSet(),).not.toBeFrozen(),)
        test("toWeakSet",                () => expect(instance.toWeakSet(),).toEqual(CollectionConstants.EMPTY_WEAK_SET,),)
        test("toWeakSet: frozen",        () => expect(instance.toWeakSet(),).toBeFrozen(),)
        test("toMutableWeakWet",         () => expect(instance.toMutableWeakSet(),).toEqual(new WeakSet(),),)
        test("toMutableWeakWet: frozen", () => expect(instance.toMutableWeakSet(),).not.toBeFrozen(),)
        test("toMap",                    () => expect(instance.toMap(),).toEqual(CollectionConstants.EMPTY_MAP,),)
        test("toMap: frozen",            () => expect(instance.toMap(),).toBeFrozen(),)
        test("toMutableMap",             () => expect(instance.toMutableMap(),).toEqual(new Map(),),)
        test("toMutableMap: frozen",     () => expect(instance.toMutableMap(),).not.toBeFrozen(),)
        test("toWeakMap",                () => expect(instance.toWeakMap(),).toEqual(CollectionConstants.EMPTY_WEAK_MAP,),)
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

    describe.each(everyCollectionInstances,)("%s", ({value: {instance,},},) => {
        test("toIterator: empty",                    () => expect(new instance(EMPTY,).toIterator(),).toEqual(CollectionConstants.EMPTY_COLLECTION_ITERATOR,),)
        test("toIterator: 1 field",                  () => expect(new instance(A,).toIterator(),).toBeInstanceOf(GenericCollectionIterator,),)
        test("toIterator: 2 fields",                 () => expect(new instance(AB,).toIterator(),).toBeInstanceOf(GenericCollectionIterator,),)
        test("toIterator: 4 fields",                 () => expect(new instance(ABCD,).toIterator(),).toBeInstanceOf(GenericCollectionIterator,),)

        test("toArray: empty",                       () => expect(new instance(EMPTY,).toArray(),).toEqual(CollectionConstants.EMPTY_ARRAY,),)
        test("toArray: 1 field",                     () => expect(new instance(A,).toArray(),).toEqual(A,),)
        test("toArray: 2 unique fields",             () => expect(new instance(AB,).toArray(),).toEqual(AB,),)
        test("toArray: 2 duplicated fields",         () => expect(new instance(AA,).toArray(),).toEqual(AA,),)
        test("toArray: 4 unique fields",             () => expect(new instance(ABCD,).toArray(),).toEqual(ABCD,),)
        test("toArray: 4 duplicating fields",        () => expect(new instance(ABAB,).toArray(),).toEqual(ABAB,),)
        test("toArray: frozen",                      () => expect(new instance(ABAB,).toArray(),).toBeFrozen(),)
        test("toMutableArray: empty",                () => expect(new instance(EMPTY,).toMutableArray(),).toEqual([],),)
        test("toMutableArray: 1 field",              () => expect(new instance(A,).toMutableArray(),).toEqual(A,),)
        test("toMutableArray: 2 unique fields",      () => expect(new instance(AB,).toMutableArray(),).toEqual(AB,),)
        test("toMutableArray: 2 duplicated fields",  () => expect(new instance(AA,).toMutableArray(),).toEqual(AA,),)
        test("toMutableArray: 4 unique fields",      () => expect(new instance(ABCD,).toMutableArray(),).toEqual(ABCD,),)
        test("toMutableArray: 4 duplicating fields", () => expect(new instance(ABAB,).toMutableArray(),).toEqual(ABAB,),)
        test("toMutableArray: frozen",               () => expect(new instance(ABAB,).toMutableArray(),).not.toBeFrozen(),)

        test("toSet: empty",                         () => expect(new instance(EMPTY,).toSet(),).toEqual(CollectionConstants.EMPTY_SET,),)
        test("toSet: 1 field",                       () => expect(new instance(A,).toSet(),).toEqual(new Set(A,),),)
        test("toSet: 2 unique fields",               () => expect(new instance(AB,).toSet(),).toEqual(new Set(AB,),),)
        test("toSet: 2 duplicated fields",           () => expect(new instance(AA,).toSet(),).toEqual(new Set(A,),),)
        test("toSet: 4 unique fields",               () => expect(new instance(ABCD,).toSet(),).toEqual(new Set(ABCD,),),)
        test("toSet: 4 duplicating fields",          () => expect(new instance(ABAB,).toSet(),).toEqual(new Set(AB,),),)
        test("toSet: frozen",                        () => expect(new instance(ABAB,).toSet(),).toBeFrozen(),)
        test("toMutableSet: empty",                  () => expect(new instance(EMPTY,).toMutableSet(),).toEqual(new Set(),),)
        test("toMutableSet: 1 field",                () => expect(new instance(A,).toMutableSet(),).toEqual(new Set(A,),),)
        test("toMutableSet: 2 unique fields",        () => expect(new instance(AB,).toMutableSet(),).toEqual(new Set(AB,),),)
        test("toMutableSet: 2 duplicated fields",    () => expect(new instance(AA,).toMutableSet(),).toEqual(new Set(A,),),)
        test("toMutableSet: 4 unique fields",        () => expect(new instance(ABCD,).toMutableSet(),).toEqual(new Set(ABCD,),),)
        test("toMutableSet: 4 duplicating fields",   () => expect(new instance(ABAB,).toMutableSet(),).toEqual(new Set(AB,),),)
        test("toMutableSet: frozen",                 () => expect(new instance(ABAB,).toMutableSet(),).not.toBeFrozen(),)

        test("toMap: empty",                         () => expect(new instance(EMPTY,).toMap(),).toEqual(CollectionConstants.EMPTY_MAP,),)
        test("toMap: 1 field",                       () => expect(new instance(A,).toMap(),).toEqual(new Map([[0, 'a',],],),),)
        test("toMap: 2 unique fields",               () => expect(new instance(AB,).toMap(),).toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
        test("toMap: 2 duplicated fields",           () => expect(new instance(AA,).toMap(),).toEqual(new Map([[0, 'a',], [1, 'a',],],),),)
        test("toMap: 4 unique fields",               () => expect(new instance(ABCD,).toMap(),).toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'c',], [3, 'd',],],),),)
        test("toMap: 4 duplicating fields",          () => expect(new instance(ABAB,).toMap(),).toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'a',], [3, 'b',],],),),)
        test("toMap: frozen",                        () => expect(new instance(ABAB,).toMap(),).toBeFrozen(),)
        test("toMutableMap: empty",                  () => expect(new instance(EMPTY,).toMutableMap(),).toEqual(new Map(),),)
        test("toMutableMap: 1 field",                () => expect(new instance(A,).toMutableMap(),).toEqual(new Map([[0, 'a',],],),),)
        test("toMutableMap: 2 unique fields",        () => expect(new instance(AB,).toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'b',],],),),)
        test("toMutableMap: 2 duplicated fields",    () => expect(new instance(AA,).toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'a',],],),),)
        test("toMutableMap: 4 unique fields",        () => expect(new instance(ABCD,).toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'c',], [3, 'd',],],),),)
        test("toMutableMap: 4 duplicating fields",   () => expect(new instance(ABAB,).toMutableMap(),).toEqual(new Map([[0, 'a',], [1, 'b',], [2, 'a',], [3, 'b',],],),),)
        test("toMutableMap: frozen",                 () => expect(new instance(ABAB,).toMutableMap(),).not.toBeFrozen(),)

        test("toString: empty",                      () => expect(new instance(EMPTY,).toString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toString: 1 field",                    () => expect(new instance(A,).toString(),).toBe("[a]",),)
        test("toString: 2 fields",                   () => expect(new instance(A_A,).toString(),).toBe("[a, A]",),)
        test("toString: 4 fields",                   () => expect(new instance(AB_AB,).toString(),).toBe("[a, b, A, B]",),)
        test("toLocaleString: empty",                () => expect(new instance(EMPTY,).toLocaleString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleString: 1 field",              () => expect(new instance(A,).toLocaleString(),).toBe("[a]",),)
        test("toLocaleString: 2 fields",             () => expect(new instance(A_A,).toLocaleString(),).toBe("[a, A]",),)
        test("toLocaleString: 4 fields",             () => expect(new instance(AB_AB,).toLocaleString(),).toBe("[a, b, A, B]",),)
        test("toLowerCaseString: empty",             () => expect(new instance(EMPTY,).toLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLowerCaseString: 1 field",           () => expect(new instance(A,).toLowerCaseString(),).toBe("[a]",),)
        test("toLowerCaseString: 2 fields",          () => expect(new instance(A_A,).toLowerCaseString(),).toBe("[a, a]",),)
        test("toLowerCaseString: 4 fields",          () => expect(new instance(AB_AB,).toLowerCaseString(),).toBe("[a, b, a, b]",),)
        test("toLocaleLowerCaseString: empty",       () => expect(new instance(EMPTY,).toLocaleLowerCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleLowerCaseString: 1 field",     () => expect(new instance(A,).toLocaleLowerCaseString(),).toBe("[a]",),)
        test("toLocaleLowerCaseString: 2 fields",    () => expect(new instance(A_A,).toLocaleLowerCaseString(),).toBe("[a, a]",),)
        test("toLocaleLowerCaseString: 4 fields",    () => expect(new instance(AB_AB,).toLocaleLowerCaseString(),).toBe("[a, b, a, b]",),)
        test("toUpperCaseString: empty",             () => expect(new instance(EMPTY,).toUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toUpperCaseString: 1 field",           () => expect(new instance(A,).toUpperCaseString(),).toBe("[A]",),)
        test("toUpperCaseString: 2 fields",          () => expect(new instance(A_A,).toUpperCaseString(),).toBe("[A, A]",),)
        test("toUpperCaseString: 4 fields",          () => expect(new instance(AB_AB,).toUpperCaseString(),).toBe("[A, B, A, B]",),)
        test("toLocaleUpperCaseString: empty",       () => expect(new instance(EMPTY,).toLocaleUpperCaseString(),).toBe(CollectionConstants.DEFAULT_EMPTY_COLLECTION,),)
        test("toLocaleUpperCaseString: 1 field",     () => expect(new instance(A,).toLocaleUpperCaseString(),).toBe("[A]",),)
        test("toLocaleUpperCaseString: 2 fields",    () => expect(new instance(A_A,).toLocaleUpperCaseString(),).toBe("[A, A]",),)
        test("toLocaleUpperCaseString: 4 fields",    () => expect(new instance(AB_AB,).toLocaleUpperCaseString(),).toBe("[A, B, A, B]",),)
    },)

},)
