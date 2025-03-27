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

import {Holder}                                 from "./Holder"
import {CollectionHolderFromArray}              from "./instance/CollectionHolderFromArray"
import {CollectionIteratorFromArray}            from "./instance/CollectionIteratorFromArray"
import {IterableForTest}                        from "./instance/IterableForTest"
import {IteratorForTest}                        from "./instance/IteratorForTest"
import {MinimalistCollectionHolderFromArray}    from "./instance/MinimalistCollectionHolderFromArray"
import {A, B, EMPTY, NULL_UNDEFINED}            from "./value/arrays"

import type {PossibleIterableIteratorArraySetOrCollectionHolder} from "../src/type/possibleInstance"

import {contains, containsByArray, containsByCollectionHolder, containsByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/contains"
import {containsAll, containsAllByArray, containsAllByCollectionHolder, containsAllByMinimalistCollectionHolder}                                                                                                                         from "../src/method/containsAll"
import {containsAllWithArray, containsAllWithArrayByArray, containsAllWithArrayByCollectionHolder, containsAllWithArrayByMinimalistCollectionHolder}                                                                                     from "../src/method/containsAll.withArray"
import {containsAllWithCollectionHolder, containsAllWithCollectionHolderByArray, containsAllWithCollectionHolderByCollectionHolder, containsAllWithCollectionHolderByMinimalistCollectionHolder}                                         from "../src/method/containsAll.withCollectionHolder"
import {containsAllWithCollectionIterator, containsAllWithCollectionIteratorByArray, containsAllWithCollectionIteratorByCollectionHolder, containsAllWithCollectionIteratorByMinimalistCollectionHolder}                                 from "../src/method/containsAll.withCollectionIterator"
import {containsAllWithIterable, containsAllWithIterableByArray, containsAllWithIterableByCollectionHolder, containsAllWithIterableByMinimalistCollectionHolder}                                                                         from "../src/method/containsAll.withIterable"
import {containsAllWithIterator, containsAllWithIteratorByArray, containsAllWithIteratorByCollectionHolder, containsAllWithIteratorByMinimalistCollectionHolder}                                                                         from "../src/method/containsAll.withIterator"
import {containsAllWithMinimalistCollectionHolder, containsAllWithMinimalistCollectionHolderByArray, containsAllWithMinimalistCollectionHolderByCollectionHolder, containsAllWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../src/method/containsAll.withMinimalistCollectionHolder"
import {containsAllWithSet, containsAllWithSetByArray, containsAllWithSetByCollectionHolder, containsAllWithSetByMinimalistCollectionHolder}                                                                                             from "../src/method/containsAll.withSet"
import {containsDuplicate, containsDuplicateByArray, containsDuplicateByCollectionHolder, containsDuplicateByMinimalistCollectionHolder}                                                                                                 from "../src/method/containsDuplicate"
import {containsNot, containsNotByArray, containsNotByCollectionHolder, containsNotByMinimalistCollectionHolder}                                                                                                                         from "../src/method/containsNot"
import {containsNoDuplicates, containsNoDuplicatesByArray, containsNoDuplicatesByCollectionHolder, containsNoDuplicatesByMinimalistCollectionHolder}                                                                                     from "../src/method/containsNoDuplicates"
import {containsNoNulls, containsNoNullsByArray, containsNoNullsByCollectionHolder, containsNoNullsByMinimalistCollectionHolder}                                                                                                         from "../src/method/containsNoNulls"
import {containsNull, containsNullByArray, containsNullByCollectionHolder, containsNullByMinimalistCollectionHolder}                                                                                                                     from "../src/method/containsNull"
import {containsOne, containsOneByArray, containsOneByCollectionHolder, containsOneByMinimalistCollectionHolder}                                                                                                                         from "../src/method/containsOne"
import {containsOneWithArray, containsOneWithArrayByArray, containsOneWithArrayByCollectionHolder, containsOneWithArrayByMinimalistCollectionHolder}                                                                                     from "../src/method/containsOne.withArray"
import {containsOneWithCollectionHolder, containsOneWithCollectionHolderByArray, containsOneWithCollectionHolderByCollectionHolder, containsOneWithCollectionHolderByMinimalistCollectionHolder}                                         from "../src/method/containsOne.withCollectionHolder"
import {containsOneWithCollectionIterator, containsOneWithCollectionIteratorByArray, containsOneWithCollectionIteratorByCollectionHolder, containsOneWithCollectionIteratorByMinimalistCollectionHolder}                                 from "../src/method/containsOne.withCollectionIterator"
import {containsOneWithIterable, containsOneWithIterableByArray, containsOneWithIterableByCollectionHolder, containsOneWithIterableByMinimalistCollectionHolder}                                                                         from "../src/method/containsOne.withIterable"
import {containsOneWithIterator, containsOneWithIteratorByArray, containsOneWithIteratorByCollectionHolder, containsOneWithIteratorByMinimalistCollectionHolder}                                                                         from "../src/method/containsOne.withIterator"
import {containsOneWithMinimalistCollectionHolder, containsOneWithMinimalistCollectionHolderByArray, containsOneWithMinimalistCollectionHolderByCollectionHolder, containsOneWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../src/method/containsOne.withMinimalistCollectionHolder"
import {containsOneWithSet, containsOneWithSetByArray, containsOneWithSetByCollectionHolder, containsOneWithSetByMinimalistCollectionHolder}                                                                                             from "../src/method/containsOne.withSet"
import * as hasModule                                                                                                                                                                                                                    from "../src/method/has"
import {has, hasByArray, hasByCollectionHolder, hasByMinimalistCollectionHolder}                                                                                                                                                         from "../src/method/has"
import * as hasAllModule                                                                                                                                                                                                                 from "../src/method/hasAll"
import {hasAll, hasAllByArray, hasAllByCollectionHolder, hasAllByMinimalistCollectionHolder}                                                                                                                                             from "../src/method/hasAll"
import * as hasAllWithArrayModule                                                                                                                                                                                                        from "../src/method/hasAll.withArray"
import {hasAllWithArray, hasAllWithArrayByArray, hasAllWithArrayByCollectionHolder, hasAllWithArrayByMinimalistCollectionHolder}                                                                                                         from "../src/method/hasAll.withArray"
import * as hasAllWithCollectionHolderModule                                                                                                                                                                                             from "../src/method/hasAll.withCollectionHolder"
import {hasAllWithCollectionHolder, hasAllWithCollectionHolderByArray, hasAllWithCollectionHolderByCollectionHolder, hasAllWithCollectionHolderByMinimalistCollectionHolder}                                                             from "../src/method/hasAll.withCollectionHolder"
import * as hasAllWithCollectionIteratorModule                                                                                                                                                                                           from "../src/method/hasAll.withCollectionIterator"
import {hasAllWithCollectionIterator, hasAllWithCollectionIteratorByArray, hasAllWithCollectionIteratorByCollectionHolder, hasAllWithCollectionIteratorByMinimalistCollectionHolder}                                                     from "../src/method/hasAll.withCollectionIterator"
import * as hasAllWithIterableModule                                                                                                                                                                                                     from "../src/method/hasAll.withIterable"
import {hasAllWithIterable, hasAllWithIterableByArray, hasAllWithIterableByCollectionHolder, hasAllWithIterableByMinimalistCollectionHolder}                                                                                             from "../src/method/hasAll.withIterable"
import * as hasAllWithIteratorModule                                                                                                                                                                                                     from "../src/method/hasAll.withIterator"
import {hasAllWithIterator, hasAllWithIteratorByArray, hasAllWithIteratorByCollectionHolder, hasAllWithIteratorByMinimalistCollectionHolder}                                                                                             from "../src/method/hasAll.withIterator"
import * as hasAllWithMinimalistCollectionHolderModule                                                                                                                                                                                   from "../src/method/hasAll.withMinimalistCollectionHolder"
import {hasAllWithMinimalistCollectionHolder, hasAllWithMinimalistCollectionHolderByArray, hasAllWithMinimalistCollectionHolderByCollectionHolder, hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder}                     from "../src/method/hasAll.withMinimalistCollectionHolder"
import * as hasAllWithSetModule                                                                                                                                                                                                          from "../src/method/hasAll.withSet"
import {hasAllWithSet, hasAllWithSetByArray, hasAllWithSetByCollectionHolder, hasAllWithSetByMinimalistCollectionHolder}                                                                                                                 from "../src/method/hasAll.withSet"
import * as hasDuplicateModule                                                                                                                                                                                                           from "../src/method/hasDuplicate"
import {hasDuplicate, hasDuplicateByArray, hasDuplicateByCollectionHolder, hasDuplicateByMinimalistCollectionHolder}                                                                                                                     from "../src/method/hasDuplicate"
import * as hasNullModule                                                                                                                                                                                                                from "../src/method/hasNull"
import {hasNull, hasNullByArray, hasNullByCollectionHolder, hasNullByMinimalistCollectionHolder}                                                                                                                                         from "../src/method/hasNull"
import * as hasOneModule                                                                                                                                                                                                                 from "../src/method/hasOne"
import {hasOne, hasOneByArray, hasOneByCollectionHolder, hasOneByMinimalistCollectionHolder}                                                                                                                                             from "../src/method/hasOne"
import * as hasOneWithArrayModule                                                                                                                                                                                                        from "../src/method/hasOne.withArray"
import {hasOneWithArray, hasOneWithArrayByArray, hasOneWithArrayByCollectionHolder, hasOneWithArrayByMinimalistCollectionHolder}                                                                                                         from "../src/method/hasOne.withArray"
import * as hasOneWithCollectionHolderModule                                                                                                                                                                                             from "../src/method/hasOne.withCollectionHolder"
import {hasOneWithCollectionHolder, hasOneWithCollectionHolderByArray, hasOneWithCollectionHolderByCollectionHolder, hasOneWithCollectionHolderByMinimalistCollectionHolder}                                                             from "../src/method/hasOne.withCollectionHolder"
import * as hasOneWithCollectionIteratorModule                                                                                                                                                                                           from "../src/method/hasOne.withCollectionIterator"
import {hasOneWithCollectionIterator, hasOneWithCollectionIteratorByArray, hasOneWithCollectionIteratorByCollectionHolder, hasOneWithCollectionIteratorByMinimalistCollectionHolder}                                                     from "../src/method/hasOne.withCollectionIterator"
import * as hasOneWithIterableModule                                                                                                                                                                                                     from "../src/method/hasOne.withIterable"
import {hasOneWithIterable, hasOneWithIterableByArray, hasOneWithIterableByCollectionHolder, hasOneWithIterableByMinimalistCollectionHolder}                                                                                             from "../src/method/hasOne.withIterable"
import * as hasOneWithIteratorModule                                                                                                                                                                                                     from "../src/method/hasOne.withIterator"
import {hasOneWithIterator, hasOneWithIteratorByArray, hasOneWithIteratorByCollectionHolder, hasOneWithIteratorByMinimalistCollectionHolder}                                                                                             from "../src/method/hasOne.withIterator"
import * as hasOneWithMinimalistCollectionHolderModule                                                                                                                                                                                   from "../src/method/hasOne.withMinimalistCollectionHolder"
import {hasOneWithMinimalistCollectionHolder, hasOneWithMinimalistCollectionHolderByArray, hasOneWithMinimalistCollectionHolderByCollectionHolder, hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder}                     from "../src/method/hasOne.withMinimalistCollectionHolder"
import * as hasOneWithSetModule                                                                                                                                                                                                          from "../src/method/hasOne.withSet"
import {hasOneWithSet, hasOneWithSetByArray, hasOneWithSetByCollectionHolder, hasOneWithSetByMinimalistCollectionHolder}                                                                                                                 from "../src/method/hasOne.withSet"
import {includes, includesByArray, includesByCollectionHolder, includesByMinimalistCollectionHolder}                                                                                                                                     from "../src/method/includes"
import {includesAll, includesAllByArray, includesAllByCollectionHolder, includesAllByMinimalistCollectionHolder}                                                                                                                         from "../src/method/includesAll"
import {includesAllWithArray, includesAllWithArrayByArray, includesAllWithArrayByCollectionHolder, includesAllWithArrayByMinimalistCollectionHolder}                                                                                     from "../src/method/includesAll.withArray"
import {includesAllWithCollectionHolder, includesAllWithCollectionHolderByArray, includesAllWithCollectionHolderByCollectionHolder, includesAllWithCollectionHolderByMinimalistCollectionHolder}                                         from "../src/method/includesAll.withCollectionHolder"
import {includesAllWithCollectionIterator, includesAllWithCollectionIteratorByArray, includesAllWithCollectionIteratorByCollectionHolder, includesAllWithCollectionIteratorByMinimalistCollectionHolder}                                 from "../src/method/includesAll.withCollectionIterator"
import {includesAllWithIterable, includesAllWithIterableByArray, includesAllWithIterableByCollectionHolder, includesAllWithIterableByMinimalistCollectionHolder}                                                                         from "../src/method/includesAll.withIterable"
import {includesAllWithIterator, includesAllWithIteratorByArray, includesAllWithIteratorByCollectionHolder, includesAllWithIteratorByMinimalistCollectionHolder}                                                                         from "../src/method/includesAll.withIterator"
import {includesAllWithMinimalistCollectionHolder, includesAllWithMinimalistCollectionHolderByArray, includesAllWithMinimalistCollectionHolderByCollectionHolder, includesAllWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../src/method/includesAll.withMinimalistCollectionHolder"
import {includesAllWithSet, includesAllWithSetByArray, includesAllWithSetByCollectionHolder, includesAllWithSetByMinimalistCollectionHolder}                                                                                             from "../src/method/includesAll.withSet"
import {includesDuplicate, includesDuplicateByArray, includesDuplicateByCollectionHolder, includesDuplicateByMinimalistCollectionHolder}                                                                                                 from "../src/method/includesDuplicate"
import {includesNull, includesNullByArray, includesNullByCollectionHolder, includesNullByMinimalistCollectionHolder}                                                                                                                     from "../src/method/includesNull"
import {includesOne, includesOneByArray, includesOneByCollectionHolder, includesOneByMinimalistCollectionHolder}                                                                                                                         from "../src/method/includesOne"
import {includesOneWithArray, includesOneWithArrayByArray, includesOneWithArrayByCollectionHolder, includesOneWithArrayByMinimalistCollectionHolder}                                                                                     from "../src/method/includesOne.withArray"
import {includesOneWithCollectionHolder, includesOneWithCollectionHolderByArray, includesOneWithCollectionHolderByCollectionHolder, includesOneWithCollectionHolderByMinimalistCollectionHolder}                                         from "../src/method/includesOne.withCollectionHolder"
import {includesOneWithCollectionIterator, includesOneWithCollectionIteratorByArray, includesOneWithCollectionIteratorByCollectionHolder, includesOneWithCollectionIteratorByMinimalistCollectionHolder}                                 from "../src/method/includesOne.withCollectionIterator"
import {includesOneWithIterable, includesOneWithIterableByArray, includesOneWithIterableByCollectionHolder, includesOneWithIterableByMinimalistCollectionHolder}                                                                         from "../src/method/includesOne.withIterable"
import {includesOneWithIterator, includesOneWithIteratorByArray, includesOneWithIteratorByCollectionHolder, includesOneWithIteratorByMinimalistCollectionHolder}                                                                         from "../src/method/includesOne.withIterator"
import {includesOneWithMinimalistCollectionHolder, includesOneWithMinimalistCollectionHolderByArray, includesOneWithMinimalistCollectionHolderByCollectionHolder, includesOneWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../src/method/includesOne.withMinimalistCollectionHolder"
import {includesOneWithSet, includesOneWithSetByArray, includesOneWithSetByCollectionHolder, includesOneWithSetByMinimalistCollectionHolder}                                                                                             from "../src/method/includesOne.withSet"

describe("CollectionHolderTest (functions)", () => {
    const everyEmptyInstances = [
        new Holder(() => EMPTY,                                           "array",),
        new Holder(() => new Set(EMPTY,),                                 "set",),
        new Holder(() => new CollectionHolderFromArray(EMPTY,),           "collection holder",),
        new Holder(() => new MinimalistCollectionHolderFromArray(EMPTY,), "minimalist collection holder",),
        new Holder(() => new MinimalistCollectionHolderFromArray(EMPTY,), "minimalist collection holder",),
        new Holder(() => new CollectionIteratorFromArray(EMPTY,),         "collection iterator",),
        new Holder(() => new IteratorForTest(EMPTY,),                     "iterator",),
        new Holder(() => new IterableForTest(EMPTY,),                     "iterable",),
    ] as const satisfies readonly Holder<() => PossibleIterableIteratorArraySetOrCollectionHolder<"">, string>[]
    const everyNonEmptyInstances = [
        new Holder(() => A,                                           "array",),
        new Holder(() => new Set(A,),                                 "set",),
        new Holder(() => new CollectionHolderFromArray(A,),           "collection holder",),
        new Holder(() => new MinimalistCollectionHolderFromArray(A,), "minimalist collection holder",),
        new Holder(() => new MinimalistCollectionHolderFromArray(A,), "minimalist collection holder",),
        new Holder(() => new CollectionIteratorFromArray(A,),         "collection iterator",),
        new Holder(() => new IteratorForTest(A,),                     "iterator",),
        new Holder(() => new IterableForTest(A,),                     "iterable",),
    ] as const satisfies readonly Holder<() => PossibleIterableIteratorArraySetOrCollectionHolder<'a'>, string>[]

    describe.each(NULL_UNDEFINED,)("%s", it => {
        describe("hasNull", () => {
            test("all",                          () => expect(hasNull(it,),).toBeFalse(),)
            test("minimalist collection holder", () => expect(hasNullByMinimalistCollectionHolder(it,),).toBeFalse(),)
            test("collection holder",            () => expect(hasNullByCollectionHolder(it,),).toBeFalse(),)
            test("array",                        () => expect(hasNullByArray(it,),).toBeFalse(),)
        },)
        describe("hasDuplicate", () => {
            test("all",                          () => expect(hasDuplicate(it,),).toBeFalse(),)
            test("minimalist collection holder", () => expect(hasDuplicateByMinimalistCollectionHolder(it,),).toBeFalse(),)
            test("collection holder",            () => expect(hasDuplicateByCollectionHolder(it,),).toBeFalse(),)
            test("array",                        () => expect(hasDuplicateByArray(it,),).toBeFalse(),)
        },)
        describe("has", () => {
            test("all",                          () => expect(has(it, '',),).toBeFalse(),)
            test("minimalist collection holder", () => expect(hasByMinimalistCollectionHolder(it, '',),).toBeFalse(),)
            test("collection holder",            () => expect(hasByCollectionHolder(it, '',),).toBeFalse(),)
            test("array",                        () => expect(hasByArray(it, '',),).toBeFalse(),)
        },)
        describe("hasOne", () => {
            describe.each(everyEmptyInstances,)("%s (empty)", ({value,},) => {
                test("all",                          () => expect(hasOne(it, value(),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneByMinimalistCollectionHolder(it, value(),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneByCollectionHolder(it, value(),),).toBeFalse(),)
                test("array",                        () => expect(hasOneByArray(it, value(),),).toBeFalse(),)
            },)
            describe.each(everyNonEmptyInstances,)("%s (non-empty)", ({value,},) => {
                test("all",                          () => expect(hasOne(it, value(),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneByMinimalistCollectionHolder(it, value(),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneByCollectionHolder(it, value(),),).toBeFalse(),)
                test("array",                        () => expect(hasOneByArray(it, value(),),).toBeFalse(),)
            },)
        },)
        describe("hasOne (array)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasOneWithArray(it, EMPTY,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithArrayByMinimalistCollectionHolder(it, EMPTY,),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithArrayByCollectionHolder(it, EMPTY,),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithArrayByArray(it, EMPTY,),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasOneWithArray(it, A,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithArrayByMinimalistCollectionHolder(it, A,),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithArrayByCollectionHolder(it, A,),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithArrayByArray(it, A,),).toBeFalse(),)
            },)
        },)
        describe("hasOne (set)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasOneWithSet(it, new Set(),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithSetByMinimalistCollectionHolder(it, new Set(),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithSetByCollectionHolder(it, new Set(),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithSetByArray(it, new Set(),),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasOneWithSet(it, new Set(A,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithSetByMinimalistCollectionHolder(it, new Set(A,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithSetByCollectionHolder(it, new Set(A,),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithSetByArray(it, new Set(A,),),).toBeFalse(),)
            },)
        },)
        describe("hasOne (collection holder)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasOneWithCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithCollectionHolderByArray(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasOneWithCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithCollectionHolderByArray(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
            },)
        },)
        describe("hasOne (minimalist collection holder)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasOneWithMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithMinimalistCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithMinimalistCollectionHolderByArray(it, new CollectionHolderFromArray(EMPTY,),),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasOneWithMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithMinimalistCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithMinimalistCollectionHolderByArray(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
            },)
        },)
        describe("hasOne (collection iterator)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasOneWithCollectionIterator(it, new CollectionIteratorFromArray(EMPTY,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithCollectionIteratorByMinimalistCollectionHolder(it, new CollectionIteratorFromArray(EMPTY,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithCollectionIteratorByCollectionHolder(it, new CollectionIteratorFromArray(EMPTY,),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithCollectionIteratorByArray(it, new CollectionIteratorFromArray(EMPTY,),),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasOneWithCollectionIterator(it, new CollectionIteratorFromArray(A,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithCollectionIteratorByMinimalistCollectionHolder(it, new CollectionIteratorFromArray(A,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithCollectionIteratorByCollectionHolder(it, new CollectionIteratorFromArray(A,),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithCollectionIteratorByArray(it, new CollectionIteratorFromArray(A,),),).toBeFalse(),)
            },)
        },)
        describe("hasOne (iterator)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasOneWithIterator(it, EMPTY[Symbol.iterator](),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithIteratorByMinimalistCollectionHolder(it, EMPTY[Symbol.iterator](),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithIteratorByCollectionHolder(it, EMPTY[Symbol.iterator](),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithIteratorByArray(it, EMPTY[Symbol.iterator](),),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasOneWithIterator(it, A[Symbol.iterator](),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithIteratorByMinimalistCollectionHolder(it, A[Symbol.iterator](),),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithIteratorByCollectionHolder(it, A[Symbol.iterator](),),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithIteratorByArray(it, A[Symbol.iterator](),),).toBeFalse(),)
            },)
        },)
        describe("hasOne (iterable)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasOneWithIterable(it, EMPTY,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithIterableByMinimalistCollectionHolder(it, EMPTY,),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithIterableByCollectionHolder(it, EMPTY,),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithIterableByArray(it, EMPTY,),).toBeFalse(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasOneWithIterable(it, A,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasOneWithIterableByMinimalistCollectionHolder(it, A,),).toBeFalse(),)
                test("collection holder",            () => expect(hasOneWithIterableByCollectionHolder(it, A,),).toBeFalse(),)
                test("array",                        () => expect(hasOneWithIterableByArray(it, A,),).toBeFalse(),)
            },)
        },)
        describe("hasAll", () => {
            describe.each(everyEmptyInstances,)("%s (empty)", ({value,},) => {
                test("all",                          () => expect(hasAll(it, value(),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllByMinimalistCollectionHolder(it, value(),),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllByCollectionHolder(it, value(),),).toBeTrue(),)
                test("array",                        () => expect(hasAllByArray(it, value(),),).toBeTrue(),)
            },)
            describe.each(everyNonEmptyInstances,)("%s (non-empty)", ({value,},) => {
                test("all",                          () => expect(hasAll(it, value(),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllByMinimalistCollectionHolder(it, value(),),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllByCollectionHolder(it, value(),),).toBeFalse(),)
                test("array",                        () => expect(hasAllByArray(it, value(),),).toBeFalse(),)
            },)
        },)
        describe("hasAll (array)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasAllWithArray(it, EMPTY,),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllWithArrayByMinimalistCollectionHolder(it, EMPTY,),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllWithArrayByCollectionHolder(it, EMPTY,),).toBeTrue(),)
                test("array",                        () => expect(hasAllWithArrayByArray(it, EMPTY,),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasAllWithArray(it, A,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllWithArrayByMinimalistCollectionHolder(it, A,),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllWithArrayByCollectionHolder(it, A,),).toBeFalse(),)
                test("array",                        () => expect(hasAllWithArrayByArray(it, A,),).toBeFalse(),)
            },)
        },)
        describe("hasAll (set)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasAllWithSet(it, new Set(),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllWithSetByMinimalistCollectionHolder(it, new Set(),),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllWithSetByCollectionHolder(it, new Set(),),).toBeTrue(),)
                test("array",                        () => expect(hasAllWithSetByArray(it, new Set(),),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasAllWithSet(it, new Set(A,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllWithSetByMinimalistCollectionHolder(it, new Set(A,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllWithSetByCollectionHolder(it, new Set(A,),),).toBeFalse(),)
                test("array",                        () => expect(hasAllWithSetByArray(it, new Set(A,),),).toBeFalse(),)
            },)
        },)
        describe("hasAll (collection holder)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasAllWithCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllWithCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllWithCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("array",                        () => expect(hasAllWithCollectionHolderByArray(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasAllWithCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllWithCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllWithCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("array",                        () => expect(hasAllWithCollectionHolderByArray(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
            },)
        },)
        describe("hasAll (minimalist collection holder)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasAllWithMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllWithMinimalistCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
                test("array",                        () => expect(hasAllWithMinimalistCollectionHolderByArray(it, new CollectionHolderFromArray(EMPTY,),),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasAllWithMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllWithMinimalistCollectionHolderByCollectionHolder(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
                test("array",                        () => expect(hasAllWithMinimalistCollectionHolderByArray(it, new CollectionHolderFromArray(A,),),).toBeFalse(),)
            },)
        },)
        describe("hasAll (collection iterator)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasAllWithCollectionIterator(it, new CollectionIteratorFromArray(EMPTY,),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllWithCollectionIteratorByMinimalistCollectionHolder(it, new CollectionIteratorFromArray(EMPTY,),),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllWithCollectionIteratorByCollectionHolder(it, new CollectionIteratorFromArray(EMPTY,),),).toBeTrue(),)
                test("array",                        () => expect(hasAllWithCollectionIteratorByArray(it, new CollectionIteratorFromArray(EMPTY,),),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasAllWithCollectionIterator(it, new CollectionIteratorFromArray(A,),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllWithCollectionIteratorByMinimalistCollectionHolder(it, new CollectionIteratorFromArray(A,),),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllWithCollectionIteratorByCollectionHolder(it, new CollectionIteratorFromArray(A,),),).toBeFalse(),)
                test("array",                        () => expect(hasAllWithCollectionIteratorByArray(it, new CollectionIteratorFromArray(A,),),).toBeFalse(),)
            },)
        },)
        describe("hasAll (iterator)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasAllWithIterator(it, EMPTY[Symbol.iterator](),),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllWithIteratorByMinimalistCollectionHolder(it, EMPTY[Symbol.iterator](),),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllWithIteratorByCollectionHolder(it, EMPTY[Symbol.iterator](),),).toBeTrue(),)
                test("array",                        () => expect(hasAllWithIteratorByArray(it, EMPTY[Symbol.iterator](),),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasAllWithIterator(it, A[Symbol.iterator](),),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllWithIteratorByMinimalistCollectionHolder(it, A[Symbol.iterator](),),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllWithIteratorByCollectionHolder(it, A[Symbol.iterator](),),).toBeFalse(),)
                test("array",                        () => expect(hasAllWithIteratorByArray(it, A[Symbol.iterator](),),).toBeFalse(),)
            },)
        },)
        describe("hasAll (iterable)", () => {
            describe("empty", () => {
                test("all",                          () => expect(hasAllWithIterable(it, EMPTY,),).toBeTrue(),)
                test("minimalist collection holder", () => expect(hasAllWithIterableByMinimalistCollectionHolder(it, EMPTY,),).toBeTrue(),)
                test("collection holder",            () => expect(hasAllWithIterableByCollectionHolder(it, EMPTY,),).toBeTrue(),)
                test("array",                        () => expect(hasAllWithIterableByArray(it, EMPTY,),).toBeTrue(),)
            },)
            describe("non-empty", () => {
                test("all",                          () => expect(hasAllWithIterable(it, A,),).toBeFalse(),)
                test("minimalist collection holder", () => expect(hasAllWithIterableByMinimalistCollectionHolder(it, A,),).toBeFalse(),)
                test("collection holder",            () => expect(hasAllWithIterableByCollectionHolder(it, A,),).toBeFalse(),)
                test("array",                        () => expect(hasAllWithIterableByArray(it, A,),).toBeFalse(),)
            },)
        },)
    },)

    describe("alias", () => {
        describe("containsNull", () => {
            test("all", () => {
                const method = jest.spyOn(hasNullModule, "hasNull",)
                containsNull(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByMinimalistCollectionHolder",)
                containsNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByCollectionHolder",)
                containsNullByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByArray",)
                containsNullByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesNull", () => {
            test("all", () => {
                const method = jest.spyOn(hasNullModule, "hasNull",)
                includesNull(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByMinimalistCollectionHolder",)
                includesNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByCollectionHolder",)
                includesNullByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasNullModule, "hasNullByArray",)
                includesNullByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsDuplicate", () => {
            test("all", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicate",)
                containsDuplicate(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByMinimalistCollectionHolder",)
                containsDuplicateByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByCollectionHolder",)
                containsDuplicateByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByArray",)
                containsDuplicateByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesDuplicate", () => {
            test("all", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicate",)
                includesDuplicate(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByMinimalistCollectionHolder",)
                includesDuplicateByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByCollectionHolder",)
                includesDuplicateByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasDuplicateModule, "hasDuplicateByArray",)
                includesDuplicateByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("contains", () => {
            test("all", () => {
                const method = jest.spyOn(hasModule, "has",)
                contains(A, "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasModule, "hasByMinimalistCollectionHolder",)
                containsByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasModule, "hasByCollectionHolder",)
                containsByCollectionHolder(new CollectionHolderFromArray(A,), "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasModule, "hasByArray",)
                containsByArray(A, "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includes", () => {
            test("all", () => {
                const method = jest.spyOn(hasModule, "has",)
                includes(A, "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasModule, "hasByMinimalistCollectionHolder",)
                includesByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasModule, "hasByCollectionHolder",)
                includesByCollectionHolder(new CollectionHolderFromArray(A,), "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasModule, "hasByArray",)
                includesByArray(A, "b",)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneModule, "hasOne",)
                containsOne(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByMinimalistCollectionHolder",)
                containsOneByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByCollectionHolder",)
                containsOneByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByArray",)
                containsOneByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArray",)
                containsOneWithArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByMinimalistCollectionHolder",)
                containsOneWithArrayByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByCollectionHolder",)
                containsOneWithArrayByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByArray",)
                containsOneWithArrayByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSet",)
                containsOneWithSet(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByMinimalistCollectionHolder",)
                containsOneWithSetByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByCollectionHolder",)
                containsOneWithSetByCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByArray",)
                containsOneWithSetByArray(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolder",)
                containsOneWithCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByMinimalistCollectionHolder",)
                containsOneWithCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByCollectionHolder",)
                containsOneWithCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByArray",)
                containsOneWithCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolder",)
                containsOneWithMinimalistCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                containsOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByCollectionHolder",)
                containsOneWithMinimalistCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByArray",)
                containsOneWithMinimalistCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIterator",)
                containsOneWithCollectionIterator(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByMinimalistCollectionHolder",)
                containsOneWithCollectionIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByCollectionHolder",)
                containsOneWithCollectionIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByArray",)
                containsOneWithCollectionIteratorByArray(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIterator",)
                containsOneWithIterator(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByMinimalistCollectionHolder",)
                containsOneWithIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByCollectionHolder",)
                containsOneWithIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByArray",)
                containsOneWithIteratorByArray(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsOne (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterable",)
                containsOneWithIterable(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByMinimalistCollectionHolder",)
                containsOneWithIterableByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByCollectionHolder",)
                containsOneWithIterableByCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByArray",)
                containsOneWithIterableByArray(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneModule, "hasOne",)
                includesOne(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByMinimalistCollectionHolder",)
                includesOneByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByCollectionHolder",)
                includesOneByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneModule, "hasOneByArray",)
                includesOneByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArray",)
                includesOneWithArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByMinimalistCollectionHolder",)
                includesOneWithArrayByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByCollectionHolder",)
                includesOneWithArrayByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithArrayModule, "hasOneWithArrayByArray",)
                includesOneWithArrayByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSet",)
                includesOneWithSet(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByMinimalistCollectionHolder",)
                includesOneWithSetByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByCollectionHolder",)
                includesOneWithSetByCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithSetModule, "hasOneWithSetByArray",)
                includesOneWithSetByArray(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolder",)
                includesOneWithCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByMinimalistCollectionHolder",)
                includesOneWithCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByCollectionHolder",)
                includesOneWithCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithCollectionHolderModule, "hasOneWithCollectionHolderByArray",)
                includesOneWithCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolder",)
                includesOneWithMinimalistCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                includesOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByCollectionHolder",)
                includesOneWithMinimalistCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithMinimalistCollectionHolderModule, "hasOneWithMinimalistCollectionHolderByArray",)
                includesOneWithMinimalistCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIterator",)
                includesOneWithCollectionIterator(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByMinimalistCollectionHolder",)
                includesOneWithCollectionIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByCollectionHolder",)
                includesOneWithCollectionIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithCollectionIteratorModule, "hasOneWithCollectionIteratorByArray",)
                includesOneWithCollectionIteratorByArray(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIterator",)
                includesOneWithIterator(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByMinimalistCollectionHolder",)
                includesOneWithIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByCollectionHolder",)
                includesOneWithIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithIteratorModule, "hasOneWithIteratorByArray",)
                includesOneWithIteratorByArray(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesOne (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterable",)
                includesOneWithIterable(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByMinimalistCollectionHolder",)
                includesOneWithIterableByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByCollectionHolder",)
                includesOneWithIterableByCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasOneWithIterableModule, "hasOneWithIterableByArray",)
                includesOneWithIterableByArray(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllModule, "hasAll",)
                containsAll(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByMinimalistCollectionHolder",)
                containsAllByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByCollectionHolder",)
                containsAllByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByArray",)
                containsAllByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArray",)
                containsAllWithArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByMinimalistCollectionHolder",)
                containsAllWithArrayByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByCollectionHolder",)
                containsAllWithArrayByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByArray",)
                containsAllWithArrayByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSet",)
                containsAllWithSet(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByMinimalistCollectionHolder",)
                containsAllWithSetByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByCollectionHolder",)
                containsAllWithSetByCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByArray",)
                containsAllWithSetByArray(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolder",)
                containsAllWithCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByMinimalistCollectionHolder",)
                containsAllWithCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByCollectionHolder",)
                containsAllWithCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByArray",)
                containsAllWithCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolder",)
                containsAllWithMinimalistCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                containsAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByCollectionHolder",)
                containsAllWithMinimalistCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByArray",)
                containsAllWithMinimalistCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIterator",)
                containsAllWithCollectionIterator(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByMinimalistCollectionHolder",)
                containsAllWithCollectionIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByCollectionHolder",)
                containsAllWithCollectionIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByArray",)
                containsAllWithCollectionIteratorByArray(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIterator",)
                containsAllWithIterator(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByMinimalistCollectionHolder",)
                containsAllWithIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByCollectionHolder",)
                containsAllWithIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByArray",)
                containsAllWithIteratorByArray(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAll (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterable",)
                containsAllWithIterable(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByMinimalistCollectionHolder",)
                containsAllWithIterableByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByCollectionHolder",)
                containsAllWithIterableByCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByArray",)
                containsAllWithIterableByArray(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllModule, "hasAll",)
                includesAll(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByMinimalistCollectionHolder",)
                includesAllByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByCollectionHolder",)
                includesAllByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllModule, "hasAllByArray",)
                includesAllByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (array)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArray",)
                includesAllWithArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByMinimalistCollectionHolder",)
                includesAllWithArrayByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByCollectionHolder",)
                includesAllWithArrayByCollectionHolder(new CollectionHolderFromArray(A,), B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithArrayModule, "hasAllWithArrayByArray",)
                includesAllWithArrayByArray(A, B,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (set)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSet",)
                includesAllWithSet(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByMinimalistCollectionHolder",)
                includesAllWithSetByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByCollectionHolder",)
                includesAllWithSetByCollectionHolder(new CollectionHolderFromArray(A,), new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithSetModule, "hasAllWithSetByArray",)
                includesAllWithSetByArray(A, new Set(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolder",)
                includesAllWithCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByMinimalistCollectionHolder",)
                includesAllWithCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByCollectionHolder",)
                includesAllWithCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithCollectionHolderModule, "hasAllWithCollectionHolderByArray",)
                includesAllWithCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (minimalist collection holder)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolder",)
                includesAllWithMinimalistCollectionHolder(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder",)
                includesAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByCollectionHolder",)
                includesAllWithMinimalistCollectionHolderByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithMinimalistCollectionHolderModule, "hasAllWithMinimalistCollectionHolderByArray",)
                includesAllWithMinimalistCollectionHolderByArray(A, new CollectionHolderFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (collection iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIterator",)
                includesAllWithCollectionIterator(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByMinimalistCollectionHolder",)
                includesAllWithCollectionIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByCollectionHolder",)
                includesAllWithCollectionIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithCollectionIteratorModule, "hasAllWithCollectionIteratorByArray",)
                includesAllWithCollectionIteratorByArray(A, new CollectionIteratorFromArray(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (iterator)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIterator",)
                includesAllWithIterator(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByMinimalistCollectionHolder",)
                includesAllWithIteratorByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByCollectionHolder",)
                includesAllWithIteratorByCollectionHolder(new CollectionHolderFromArray(A,), new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithIteratorModule, "hasAllWithIteratorByArray",)
                includesAllWithIteratorByArray(A, new IteratorForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAll (iterable)", () => {
            test("all", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterable",)
                includesAllWithIterable(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByMinimalistCollectionHolder",)
                includesAllWithIterableByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByCollectionHolder",)
                includesAllWithIterableByCollectionHolder(new CollectionHolderFromArray(A,), new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAllWithIterableModule, "hasAllWithIterableByArray",)
                includesAllWithIterableByArray(A, new IterableForTest(B,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
    },)

},)
