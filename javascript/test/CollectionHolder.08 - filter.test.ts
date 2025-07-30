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

import {expectToBeInstance}                                                                                                                                                                                                            from "./expect/expectToBeInstance"
import {EmptyCollectionHolderForTest}                                                                                                                                                                                                  from "./instance/EmptyCollectionHolderForTest"
import {A, A_NULL, A_NULL_B, A_NULL_UNDEFINED_B, A_UNDEFINED, A_UNDEFINED_B, AB, AB_NULL, AB_UNDEFINED, ABC, ABCD, ABD, AC, ACD, B, BCD, BD, C, D, EMPTY, NULL, NULL_A, NULL_AB, NULL_UNDEFINED, UNDEFINED, UNDEFINED_A, UNDEFINED_AB} from "./value/arrays"
import {callbackAsFalse0, callbackAsFalse1, callbackAsFalse2, callbackAsTrue0, callbackAsTrue1, callbackAsTrue2, falseCallbacks, trueCallbacks}                                                                                        from "./value/callbacks (boolean)"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                                                                                                                             from "./value/callbacks (fail)"
import {callbackIs0, callbackIs0Alt, callbackIs1, callbackIs1Alt, callbackIs2, callbackIs2Alt, callbackIs3, callbackIs3Alt, callbackIs4, callbackIs4Alt, callbackIsEven, callbackIsEvenAlt, callbackIsOdd, callbackIsOddAlt}           from "./value/callbacks (number)"
import {callbackIsA, callbackIsAAlt, callbackIsB, callbackIsBAlt, callbackIsC, callbackIsCAlt, callbackIsD, callbackIsDAlt, callbackIsE, callbackIsEAlt}                                                                               from "./value/callbacks (string)"
import {everyCollectionInstancesAndExtensionFunctionAsCollectionHolder}                                                                                                                                                                from "./value/instances"

import {CollectionConstants}                                                                                                         from "../src/CollectionConstants"
import {filter, filterByArray, filterByCollectionHolder, filterByMinimalistCollectionHolder}                                         from "../src/method/filter"
import {filterIndexed, filterIndexedByArray, filterIndexedByCollectionHolder, filterIndexedByMinimalistCollectionHolder}             from "../src/method/filterIndexed"
import {filterNot, filterNotByArray, filterNotByCollectionHolder, filterNotByMinimalistCollectionHolder}                             from "../src/method/filterNot"
import {filterNotIndexed, filterNotIndexedByArray, filterNotIndexedByCollectionHolder, filterNotIndexedByMinimalistCollectionHolder} from "../src/method/filterNotIndexed"
import {filterNotNull, filterNotNullByArray, filterNotNullByCollectionHolder, filterNotNullByMinimalistCollectionHolder}             from "../src/method/filterNotNull"

describe("CollectionHolderTest (filter)", () => {

    describe("EmptyCollectionHolder", () => {
        test("filter",           () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.filter(),),)
        test("filterIndexed",    () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.filterIndexed(),),)
        test("filterNot",        () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.filterNot(),),)
        test("filterNotIndexed", () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.filterNotIndexed(),),)
        test("filterNotNull",    () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.filterNotNull(),),)
    },)

    describe.each(NULL_UNDEFINED,)("%s", it => {
        describe("filter", () => {
            test("all",                          () => expect(filter(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(filterByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(filterByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(filterByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("filterIndexed", () => {
            test("all",                          () => expect(filterIndexed(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(filterIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(filterIndexedByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(filterIndexedByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("filterNot", () => {
            test("all",                          () => expect(filterNot(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(filterNotByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(filterNotByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(filterNotByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("filterNotIndexed", () => {
            test("all",                          () => expect(filterNotIndexed(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(filterNotIndexedByMinimalistCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(filterNotIndexedByCollectionHolder(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(filterNotIndexedByArray(it, callbackAsFail0,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
        describe("filterNotNull", () => {
            test("all",                          () => expect(filterNotNull(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("minimalist collection holder", () => expect(filterNotNullByMinimalistCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("collection holder",            () => expect(filterNotNullByCollectionHolder(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            test("array",                        () => expect(filterNotNullByArray(it,),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
        },)
    },)

    describe.each(everyCollectionInstancesAndExtensionFunctionAsCollectionHolder,)("%s", ({value: {instance, isMinimalist, isExtension, type,},},) => {
        /** The instance is a {@link GenericCollectionHolder} */
        const isNormal = type === "normal"
        /** The instance is a {@link CollectionHolder} for the {@link ReadonlyArray} extension methods */
        const isArrayExtension = type === "array extension"

        if (!isExtension)
            describe("get() being called", () => {
                describe("filter", () => {
                    describe("empty", () => {
                        test("0 arguments", () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                        test("1 argument",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments", () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("0 arguments: true",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: false", () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue0,),).amountOfCall,).toBe(2,),)
                        test("1 argument: true",   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue1,),).amountOfCall,).toBe(2,),)
                        test("2 arguments: true",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue2,),).amountOfCall,).toBe(2,),)
                        test("0 arguments: false", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                        test("2 arguments: false", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue0,),).amountOfCall,).toBe(4,),)
                        test("1 argument: true",   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue1,),).amountOfCall,).toBe(4,),)
                        test("2 arguments: true",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsTrue2,),).amountOfCall,).toBe(4,),)
                        test("0 arguments: false", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                        test("2 arguments: false", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filter(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                    },)
                },)
                describe("filterIndexed", () => {
                    describe("empty", () => {
                        test("0 arguments", () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                        test("1 argument",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments", () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("0 arguments: true",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue0,),).amountOfCall,).toBe(2,),)
                        test("1 argument: true",   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue1,),).amountOfCall,).toBe(2,),)
                        test("2 arguments: true",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue2,),).amountOfCall,).toBe(2,),)
                        test("0 arguments: false", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue0,),).amountOfCall,).toBe(4,),)
                        test("1 argument: true",   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue1,),).amountOfCall,).toBe(4,),)
                        test("2 arguments: true",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsTrue2,),).amountOfCall,).toBe(4,),)
                        test("0 arguments: false", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                    },)
                },)
                describe("filterNot", () => {
                    describe("empty", () => {
                        test("0 arguments", () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                        test("1 argument",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments", () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("0 arguments: true",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: true",   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: false",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: false", () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: true",   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue1,),).amountOfCall,).toBe(2,),)
                        test("2 arguments: true",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue2,),).amountOfCall,).toBe(2,),)
                        test("0 arguments: false", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
                        test("1 argument: false",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                        test("2 arguments: false", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: true",   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue1,),).amountOfCall,).toBe(4,),)
                        test("2 arguments: true",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsTrue2,),).amountOfCall,).toBe(4,),)
                        test("0 arguments: false", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
                        test("1 argument: false",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                        test("2 arguments: false", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNot(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                    },)
                },)
                describe("filterNotIndexed", () => {
                    describe("empty", () => {
                        test("0 arguments", () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                        test("1 argument",  () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments", () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("0 arguments: true",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: true",   () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: true",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: false",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: false", () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: true",   () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: true",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue2,),).amountOfCall,).toBe(2,),)
                        test("0 arguments: false", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
                        test("1 argument: false",  () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                        test("2 arguments: false", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: true",   () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: true",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsTrue2,),).amountOfCall,).toBe(4,),)
                        test("0 arguments: false", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
                        test("1 argument: false",  () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                        test("2 arguments: false", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                    },)
                },)
                describe("filterNotNull", () => {
                    test("empty",    () => expect(new instance(EMPTY,).executeWhileHavingIndexesOnField(it => it.filterNotNull(),).amountOfCall,).toBe(0,),)
                    test("1 field",  () => expect(new instance(A,).executeWhileHavingIndexesOnField(it => it.filterNotNull(),).amountOfCall,).toBe(isMinimalist ? 2 : 1,),)
                    test("2 fields", () => expect(new instance(AB,).executeWhileHavingIndexesOnField(it => it.filterNotNull(),).amountOfCall,).toBe(isMinimalist ? 4 : 2,),)
                    test("4 fields", () => expect(new instance(ABCD,).executeWhileHavingIndexesOnField(it => it.filterNotNull(),).amountOfCall,).toBe(isMinimalist || isNormal ? 8 : 4,),)//TODO remove the type == normal validation
                },)
            },)

        describe("filter", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).filter(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("1 argument",  () => expect(new instance(EMPTY,).filter(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("2 arguments", () => expect(new instance(EMPTY,).filter(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).filter(it,).toArray(),).toEqual(A,),)
                    test("2 fields", () => expect(new instance(AB,).filter(it,).toArray(),).toEqual(AB,),)
                    test("4 fields", () => expect(new instance(ABCD,).filter(it,).toArray(),).toEqual(ABCD,),)
                },)
                describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).filter(it,).toArray(),).toBeEmpty(),)
                    test("2 fields", () => expect(new instance(AB,).filter(it,).toArray(),).toBeEmpty(),)
                    test("4 fields", () => expect(new instance(ABCD,).filter(it,).toArray(),).toBeEmpty(),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).filter(callbackIsA,).toArray(),).toEqual(A,),)
                test('e',    () => expect(new instance(A,).filter(callbackIsE,).toArray(),).toBeEmpty(),)
                test("even", () => expect(new instance(A,).filter(callbackIsEvenAlt,).toArray(),).toEqual(A,),)
                test("odd",  () => expect(new instance(A,).filter(callbackIsOddAlt,).toArray(),).toBeEmpty(),)
                test('0',    () => expect(new instance(A,).filter(callbackIs0Alt,).toArray(),).toEqual(A,),)
                test('4',    () => expect(new instance(A,).filter(callbackIs4Alt,).toArray(),).toBeEmpty(),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).filter(callbackIsA,).toArray(),).toEqual(A,),)
                test('b',    () => expect(new instance(AB,).filter(callbackIsB,).toArray(),).toEqual(B,),)
                test('e',    () => expect(new instance(AB,).filter(callbackIsE,).toArray(),).toBeEmpty(),)
                test("even", () => expect(new instance(AB,).filter(callbackIsEvenAlt,).toArray(),).toEqual(A,),)
                test("odd",  () => expect(new instance(AB,).filter(callbackIsOddAlt,).toArray(),).toEqual(B,),)
                test('0',    () => expect(new instance(AB,).filter(callbackIs0Alt,).toArray(),).toEqual(A,),)
                test('1',    () => expect(new instance(AB,).filter(callbackIs1Alt,).toArray(),).toEqual(B,),)
                test('4',    () => expect(new instance(AB,).filter(callbackIs4Alt,).toArray(),).toBeEmpty(),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).filter(callbackIsA,).toArray(),).toEqual(A,),)
                test('b',    () => expect(new instance(ABCD,).filter(callbackIsB,).toArray(),).toEqual(B,),)
                test('c',    () => expect(new instance(ABCD,).filter(callbackIsC,).toArray(),).toEqual(C,),)
                test('d',    () => expect(new instance(ABCD,).filter(callbackIsD,).toArray(),).toEqual(D,),)
                test('e',    () => expect(new instance(ABCD,).filter(callbackIsE,).toArray(),).toBeEmpty(),)
                test("even", () => expect(new instance(ABCD,).filter(callbackIsEvenAlt,).toArray(),).toEqual(AC,),)
                test("odd",  () => expect(new instance(ABCD,).filter(callbackIsOddAlt,).toArray(),).toEqual(BD,),)
                test('0',    () => expect(new instance(ABCD,).filter(callbackIs0Alt,).toArray(),).toEqual(A,),)
                test('1',    () => expect(new instance(ABCD,).filter(callbackIs1Alt,).toArray(),).toEqual(B,),)
                test('2',    () => expect(new instance(ABCD,).filter(callbackIs2Alt,).toArray(),).toEqual(C,),)
                test('3',    () => expect(new instance(ABCD,).filter(callbackIs3Alt,).toArray(),).toEqual(D,),)
                test('4',    () => expect(new instance(ABCD,).filter(callbackIs4Alt,).toArray(),).toBeEmpty(),)
            },)
        },)
        describe("filterIndexed", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).filterIndexed(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("1 argument",  () => expect(new instance(EMPTY,).filterIndexed(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("2 arguments", () => expect(new instance(EMPTY,).filterIndexed(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).filterIndexed(it,).toArray(),).toEqual(A,),)
                    test("2 fields", () => expect(new instance(AB,).filterIndexed(it,).toArray(),).toEqual(AB,),)
                    test("4 fields", () => expect(new instance(ABCD,).filterIndexed(it,).toArray(),).toEqual(ABCD,),)
                },)
                describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).filterIndexed(it,).toArray(),).toBeEmpty(),)
                    test("2 fields", () => expect(new instance(AB,).filterIndexed(it,).toArray(),).toBeEmpty(),)
                    test("4 fields", () => expect(new instance(ABCD,).filterIndexed(it,).toArray(),).toBeEmpty(),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).filterIndexed(callbackIsAAlt,).toArray(),).toEqual(A,),)
                test('e',    () => expect(new instance(A,).filterIndexed(callbackIsEAlt,).toArray(),).toBeEmpty(),)
                test("even", () => expect(new instance(A,).filterIndexed(callbackIsEven,).toArray(),).toEqual(A,),)
                test("odd",  () => expect(new instance(A,).filterIndexed(callbackIsOdd,).toArray(),).toBeEmpty(),)
                test('0',    () => expect(new instance(A,).filterIndexed(callbackIs0,).toArray(),).toEqual(A,),)
                test('4',    () => expect(new instance(A,).filterIndexed(callbackIs4,).toArray(),).toBeEmpty(),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).filterIndexed(callbackIsAAlt,).toArray(),).toEqual(A,),)
                test('b',    () => expect(new instance(AB,).filterIndexed(callbackIsBAlt,).toArray(),).toEqual(B,),)
                test('e',    () => expect(new instance(AB,).filterIndexed(callbackIsEAlt,).toArray(),).toBeEmpty(),)
                test("even", () => expect(new instance(AB,).filterIndexed(callbackIsEven,).toArray(),).toEqual(A,),)
                test("odd",  () => expect(new instance(AB,).filterIndexed(callbackIsOdd,).toArray(),).toEqual(B,),)
                test('0',    () => expect(new instance(AB,).filterIndexed(callbackIs0,).toArray(),).toEqual(A,),)
                test('1',    () => expect(new instance(AB,).filterIndexed(callbackIs1,).toArray(),).toEqual(B,),)
                test('4',    () => expect(new instance(AB,).filterIndexed(callbackIs4,).toArray(),).toBeEmpty(),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).filterIndexed(callbackIsAAlt,).toArray(),).toEqual(A,),)
                test('b',    () => expect(new instance(ABCD,).filterIndexed(callbackIsBAlt,).toArray(),).toEqual(B,),)
                test('c',    () => expect(new instance(ABCD,).filterIndexed(callbackIsCAlt,).toArray(),).toEqual(C,),)
                test('d',    () => expect(new instance(ABCD,).filterIndexed(callbackIsDAlt,).toArray(),).toEqual(D,),)
                test('e',    () => expect(new instance(ABCD,).filterIndexed(callbackIsEAlt,).toArray(),).toBeEmpty(),)
                test("even", () => expect(new instance(ABCD,).filterIndexed(callbackIsEven,).toArray(),).toEqual(AC,),)
                test("odd",  () => expect(new instance(ABCD,).filterIndexed(callbackIsOdd,).toArray(),).toEqual(BD,),)
                test('0',    () => expect(new instance(ABCD,).filterIndexed(callbackIs0,).toArray(),).toEqual(A,),)
                test('1',    () => expect(new instance(ABCD,).filterIndexed(callbackIs1,).toArray(),).toEqual(B,),)
                test('2',    () => expect(new instance(ABCD,).filterIndexed(callbackIs2,).toArray(),).toEqual(C,),)
                test('3',    () => expect(new instance(ABCD,).filterIndexed(callbackIs3,).toArray(),).toEqual(D,),)
                test('4',    () => expect(new instance(ABCD,).filterIndexed(callbackIs4,).toArray(),).toBeEmpty(),)
            },)
        },)
        describe("filterNot", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).filterNot(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("1 argument",  () => expect(new instance(EMPTY,).filterNot(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("2 arguments", () => expect(new instance(EMPTY,).filterNot(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).filterNot(it,).toArray(),).toBeEmpty(),)
                    test("2 fields", () => expect(new instance(AB,).filterNot(it,).toArray(),).toBeEmpty(),)
                    test("4 fields", () => expect(new instance(ABCD,).filterNot(it,).toArray(),).toBeEmpty(),)
                },)
                describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).filterNot(it,).toArray(),).toEqual(A,),)
                    test("2 fields", () => expect(new instance(AB,).filterNot(it,).toArray(),).toEqual(AB,),)
                    test("4 fields", () => expect(new instance(ABCD,).filterNot(it,).toArray(),).toEqual(ABCD,),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).filterNot(callbackIsA,).toArray(),).toBeEmpty(),)
                test('e',    () => expect(new instance(A,).filterNot(callbackIsE,).toArray(),).toEqual(A,),)
                test("even", () => expect(new instance(A,).filterNot(callbackIsEvenAlt,).toArray(),).toBeEmpty(),)
                test("odd",  () => expect(new instance(A,).filterNot(callbackIsOddAlt,).toArray(),).toEqual(A,),)
                test('0',    () => expect(new instance(A,).filterNot(callbackIs0Alt,).toArray(),).toBeEmpty(),)
                test('4',    () => expect(new instance(A,).filterNot(callbackIs4Alt,).toArray(),).toEqual(A,),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).filterNot(callbackIsA,).toArray(),).toEqual(B,),)
                test('b',    () => expect(new instance(AB,).filterNot(callbackIsB,).toArray(),).toEqual(A,),)
                test('e',    () => expect(new instance(AB,).filterNot(callbackIsE,).toArray(),).toEqual(AB,),)
                test("even", () => expect(new instance(AB,).filterNot(callbackIsEvenAlt,).toArray(),).toEqual(B,),)
                test("odd",  () => expect(new instance(AB,).filterNot(callbackIsOddAlt,).toArray(),).toEqual(A,),)
                test('0',    () => expect(new instance(AB,).filterNot(callbackIs0Alt,).toArray(),).toEqual(B,),)
                test('1',    () => expect(new instance(AB,).filterNot(callbackIs1Alt,).toArray(),).toEqual(A,),)
                test('4',    () => expect(new instance(AB,).filterNot(callbackIs4Alt,).toArray(),).toEqual(AB,),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).filterNot(callbackIsA,).toArray(),).toEqual(BCD,),)
                test('b',    () => expect(new instance(ABCD,).filterNot(callbackIsB,).toArray(),).toEqual(ACD,),)
                test('c',    () => expect(new instance(ABCD,).filterNot(callbackIsC,).toArray(),).toEqual(ABD,),)
                test('d',    () => expect(new instance(ABCD,).filterNot(callbackIsD,).toArray(),).toEqual(ABC,),)
                test('e',    () => expect(new instance(ABCD,).filterNot(callbackIsE,).toArray(),).toEqual(ABCD),)
                test("even", () => expect(new instance(ABCD,).filterNot(callbackIsEvenAlt,).toArray(),).toEqual(BD,),)
                test("odd",  () => expect(new instance(ABCD,).filterNot(callbackIsOddAlt,).toArray(),).toEqual(AC,),)
                test('0',    () => expect(new instance(ABCD,).filterNot(callbackIs0Alt,).toArray(),).toEqual(BCD,),)
                test('1',    () => expect(new instance(ABCD,).filterNot(callbackIs1Alt,).toArray(),).toEqual(ACD,),)
                test('2',    () => expect(new instance(ABCD,).filterNot(callbackIs2Alt,).toArray(),).toEqual(ABD,),)
                test('3',    () => expect(new instance(ABCD,).filterNot(callbackIs3Alt,).toArray(),).toEqual(ABC,),)
                test('4',    () => expect(new instance(ABCD,).filterNot(callbackIs4Alt,).toArray(),).toEqual(ABCD,),)
            },)
        },)
        describe("filterNotIndexed", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).filterNotIndexed(callbackAsFail0,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("1 argument",  () => expect(new instance(EMPTY,).filterNotIndexed(callbackAsFail1,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
                test("2 arguments", () => expect(new instance(EMPTY,).filterNotIndexed(callbackAsFail2,),).toBe(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).filterNotIndexed(it,).toArray(),).toBeEmpty(),)
                    test("2 fields", () => expect(new instance(AB,).filterNotIndexed(it,).toArray(),).toBeEmpty(),)
                    test("4 fields", () => expect(new instance(ABCD,).filterNotIndexed(it,).toArray(),).toBeEmpty(),)
                },)
                describe.each(falseCallbacks,)("false: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).filterNotIndexed(it,).toArray(),).toEqual(A,),)
                    test("2 fields", () => expect(new instance(AB,).filterNotIndexed(it,).toArray(),).toEqual(AB,),)
                    test("4 fields", () => expect(new instance(ABCD,).filterNotIndexed(it,).toArray(),).toEqual(ABCD,),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).filterNotIndexed(callbackIsAAlt,).toArray(),).toBeEmpty(),)
                test('e',    () => expect(new instance(A,).filterNotIndexed(callbackIsEAlt,).toArray(),).toEqual(A,),)
                test("even", () => expect(new instance(A,).filterNotIndexed(callbackIsEven,).toArray(),).toBeEmpty(),)
                test("odd",  () => expect(new instance(A,).filterNotIndexed(callbackIsOdd,).toArray(),).toEqual(A,),)
                test('0',    () => expect(new instance(A,).filterNotIndexed(callbackIs0,).toArray(),).toBeEmpty(),)
                test('4',    () => expect(new instance(A,).filterNotIndexed(callbackIs4,).toArray(),).toEqual(A,),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).filterNotIndexed(callbackIsAAlt,).toArray(),).toEqual(B,),)
                test('b',    () => expect(new instance(AB,).filterNotIndexed(callbackIsBAlt,).toArray(),).toEqual(A,),)
                test('e',    () => expect(new instance(AB,).filterNotIndexed(callbackIsEAlt,).toArray(),).toEqual(AB,),)
                test("even", () => expect(new instance(AB,).filterNotIndexed(callbackIsEven,).toArray(),).toEqual(B,),)
                test("odd",  () => expect(new instance(AB,).filterNotIndexed(callbackIsOdd,).toArray(),).toEqual(A,),)
                test('0',    () => expect(new instance(AB,).filterNotIndexed(callbackIs0,).toArray(),).toEqual(B,),)
                test('1',    () => expect(new instance(AB,).filterNotIndexed(callbackIs1,).toArray(),).toEqual(A,),)
                test('4',    () => expect(new instance(AB,).filterNotIndexed(callbackIs4,).toArray(),).toEqual(AB,),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIsAAlt,).toArray(),).toEqual(BCD,),)
                test('b',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIsBAlt,).toArray(),).toEqual(ACD,),)
                test('c',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIsCAlt,).toArray(),).toEqual(ABD,),)
                test('d',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIsDAlt,).toArray(),).toEqual(ABC,),)
                test('e',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIsEAlt,).toArray(),).toEqual(ABCD),)
                test("even", () => expect(new instance(ABCD,).filterNotIndexed(callbackIsEven,).toArray(),).toEqual(BD,),)
                test("odd",  () => expect(new instance(ABCD,).filterNotIndexed(callbackIsOdd,).toArray(),).toEqual(AC,),)
                test('0',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIs0,).toArray(),).toEqual(BCD,),)
                test('1',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIs1,).toArray(),).toEqual(ACD,),)
                test('2',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIs2,).toArray(),).toEqual(ABD,),)
                test('3',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIs3,).toArray(),).toEqual(ABC,),)
                test('4',    () => expect(new instance(ABCD,).filterNotIndexed(callbackIs4,).toArray(),).toEqual(ABCD,),)
            },)
        },)
        describe("filterNotNull", () => {
            test("empty", () => expect(new instance(EMPTY,).filterNotNull(),).toEqual(CollectionConstants.EMPTY_COLLECTION_HOLDER,),)
            describe("1 field", () => {
                test("non-null",  () => expect(new instance(A,).filterNotNull().toArray(),).toEqual(A,),)
                test("null",      () => expect(new instance(NULL,).filterNotNull().toArray(),).toBeEmpty(),)
                test("undefined", () => expect(new instance(UNDEFINED,).filterNotNull().toArray(),).toBeEmpty(),)
            },)
            describe("2 fields", () => {
                test("non-null",           () => expect(new instance(AB,).filterNotNull().toArray(),).toEqual(AB,),)
                test("null at start",      () => expect(new instance(NULL_A,).filterNotNull().toArray(),).toEqual(A,),)
                test("null at end",        () => expect(new instance(A_NULL,).filterNotNull().toArray(),).toEqual(A,),)
                test("undefined at start", () => expect(new instance(UNDEFINED_A,).filterNotNull().toArray(),).toEqual(A,),)
                test("undefined at end",   () => expect(new instance(A_UNDEFINED,).filterNotNull().toArray(),).toEqual(A,),)
                test("null + undefined",   () => expect(new instance(NULL_UNDEFINED,).filterNotNull().toArray(),).toBeEmpty(),)
            },)
            describe("4 fields", () => {
                test("non-null",            () => expect(new instance(ABCD,).filterNotNull().toArray(),).toEqual(ABCD,),)
                test("null at start",       () => expect(new instance(NULL_AB,).filterNotNull().toArray(),).toEqual(AB,),)
                test("null at center",      () => expect(new instance(A_NULL_B,).filterNotNull().toArray(),).toEqual(AB,),)
                test("null at end",         () => expect(new instance(AB_NULL,).filterNotNull().toArray(),).toEqual(AB,),)
                test("undefined at start",  () => expect(new instance(UNDEFINED_AB,).filterNotNull().toArray(),).toEqual(AB,),)
                test("undefined at center", () => expect(new instance(A_UNDEFINED_B,).filterNotNull().toArray(),).toEqual(AB,),)
                test("undefined at end",    () => expect(new instance(AB_UNDEFINED,).filterNotNull().toArray(),).toEqual(AB,),)
                test("null + undefined",    () => expect(new instance(A_NULL_UNDEFINED_B,).filterNotNull().toArray(),).toEqual(AB,),)
            },)

            if (isMinimalist || isExtension)
                return // We only do some test that require the CollectionHolder.hasNull method and is not an extension method instance
            describe("non-minimalist collection", () => {
                test("1 field",  () => expectToBeInstance(new instance(A,), it => it.filterNotNull(),),)
                test("2 fields", () => expectToBeInstance(new instance(AB,), it => it.filterNotNull(),),)
                test("4 fields", () => expectToBeInstance(new instance(ABCD,), it => it.filterNotNull(),),)
            },)
        },)
    },)

},)
