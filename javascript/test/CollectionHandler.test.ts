/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {EmptyCollectionValueHolder}                from "../src/handler/value/EmptyCollectionValueHolder"
import {NaNIndexValueHolder}                       from "../src/handler/value/NaNIndexValueHolder"
import {NegativeInfinityIndexValueHolder}          from "../src/handler/value/NegativeInfinityIndexValueHolder"
import {Not0IndexAfterCalculationValueHolder}      from "../src/handler/value/Not0IndexAfterCalculationValueHolder"
import {Not0IndexValueHolder}                      from "../src/handler/value/Not0IndexValueHolder"
import {Not0Or1IndexAfterCalculationValueHolder}   from "../src/handler/value/Not0Or1IndexAfterCalculationValueHolder"
import {Not0Or1IndexValueHolder}                   from "../src/handler/value/Not0Or1IndexValueHolder"
import {OverSizeIndexValueHolder}                  from "../src/handler/value/OverSizeIndexValueHolder"
import {PositiveInfinityIndexValueHolder}          from "../src/handler/value/PositiveInfinityIndexValueHolder"
import {SizeIndexValueHolder}                      from "../src/handler/value/SizeIndexValueHolder"
import {UnderZeroIndexAfterCalculationValueHolder} from "../src/handler/value/UnderZeroIndexAfterCalculationValueHolder"
import {ValidValueHolder}                          from "../src/handler/value/ValidValueHolder"

import type {CollectionHandler}                                from "../src/handler/CollectionHandler"
import type {CollectionHandlerByArray}                         from "../src/handler/CollectionHandlerByArray"
import type {CollectionHandlerByArrayOf1}                      from "../src/handler/CollectionHandlerByArrayOf1"
import type {CollectionHandlerByArrayOf2}                      from "../src/handler/CollectionHandlerByArrayOf2"
import type {CollectionHandlerByCollectionHolder}              from "../src/handler/CollectionHandlerByCollectionHolder"
import type {CollectionHandlerByCollectionHolderOf1}           from "../src/handler/CollectionHandlerByCollectionHolderOf1"
import type {CollectionHandlerByCollectionHolderOf2}           from "../src/handler/CollectionHandlerByCollectionHolderOf2"
import type {CollectionHandlerByCollectionIterator}            from "../src/handler/CollectionHandlerByCollectionIterator"
import type {CollectionHandlerByCollectionIteratorOf1}         from "../src/handler/CollectionHandlerByCollectionIteratorOf1"
import type {CollectionHandlerByCollectionIteratorOf2}         from "../src/handler/CollectionHandlerByCollectionIteratorOf2"
import type {CollectionHandlerByIterable}                      from "../src/handler/CollectionHandlerByIterable"
import type {CollectionHandlerByIterableWithSize}              from "../src/handler/CollectionHandlerByIterableWithSize"
import type {CollectionHandlerByIterableWithSizeOf1}           from "../src/handler/CollectionHandlerByIterableWithSizeOf1"
import type {CollectionHandlerByIterableWithSizeOf2}           from "../src/handler/CollectionHandlerByIterableWithSizeOf2"
import type {CollectionHandlerByMinimalistCollectionHolder}    from "../src/handler/CollectionHandlerByMinimalistCollectionHolder"
import type {CollectionHandlerByMinimalistCollectionHolderOf1} from "../src/handler/CollectionHandlerByMinimalistCollectionHolderOf1"
import type {CollectionHandlerByMinimalistCollectionHolderOf2} from "../src/handler/CollectionHandlerByMinimalistCollectionHolderOf2"
import type {CollectionHandlerBySet}                           from "../src/handler/CollectionHandlerBySet"
import type {CollectionHandlerBySetOf1}                        from "../src/handler/CollectionHandlerBySetOf1"
import type {CollectionHandlerBySetOf2}                        from "../src/handler/CollectionHandlerBySetOf2"

import {A, A_NULL, A_NULL_B, A_UNDEFINED, A_UNDEFINED_B, AA, AAB, AB, AB_NULL, AB_UNDEFINED, ABB, ABC, EMPTY, NULL, NULL_A, NULL_AB, UNDEFINED, UNDEFINED_A, UNDEFINED_AB} from "./constantCollections"
import {Holder}                                                                                                                                                            from "./Holder"
import {expectIndexesInCollectionOf1ToBePresent}                                                                                                                           from "./expect/expectIndexesInCollectionOf1ToBePresent"
import {expectIndexesInCollectionOf1ToBeNotPresent}                                                                                                                        from "./expect/expectIndexesInCollectionOf1ToBeNotPresent"
import {expectIndexesInCollectionOf2ToBePresent}                                                                                                                           from "./expect/expectIndexesInCollectionOf2ToBePresent"
import {expectIndexesInCollectionOf2ToBeNotPresent}                                                                                                                        from "./expect/expectIndexesInCollectionOf2ToBeNotPresent"
import {expectIndexesInCollectionOf2ToOnlyHave1stPresent}                                                                                                                  from "./expect/expectIndexesInCollectionOf2ToOnlyHave1stPresent"
import {expectIndexesInCollectionOf2ToOnlyHave2ndPresent}                                                                                                                  from "./expect/expectIndexesInCollectionOf2ToOnlyHave2ndPresent"
import {expectIndexesInCollectionOf3ToBeNotPresent}                                                                                                                        from "./expect/expectIndexesInCollectionOf3ToBeNotPresent"
import {expectIndexesInCollectionOf3ToBePresent}                                                                                                                           from "./expect/expectIndexesInCollectionOf3ToBePresent"
import {expectIndexesInCollectionOf3ToNotHave1stPresent}                                                                                                                   from "./expect/expectIndexesInCollectionOf3ToNotHave1stPresent"
import {expectIndexesInCollectionOf3ToNotHave2ndPresent}                                                                                                                   from "./expect/expectIndexesInCollectionOf3ToNotHave2ndPresent"
import {expectIndexesInCollectionOf3ToNotHave3rdPresent}                                                                                                                   from "./expect/expectIndexesInCollectionOf3ToNotHave3rdPresent"
import {expectIndexesInCollectionOf3ToOnlyHave1stPresent}                                                                                                                  from "./expect/expectIndexesInCollectionOf3ToOnlyHave1stPresent"
import {expectIndexesInCollectionOf3ToOnlyHave2ndPresent}                                                                                                                  from "./expect/expectIndexesInCollectionOf3ToOnlyHave2ndPresent"
import {expectIndexesInCollectionOf3ToOnlyHave3rdPresent}                                                                                                                  from "./expect/expectIndexesInCollectionOf3ToOnlyHave3rdPresent"
import {newArrayHandler, newArrayOf1Handler, newArrayOf2Handler}                                                                                                           from "./helper/newArrayHanders"
import {newCollectionHandler, newCollectionOf1Handler, newCollectionOf2Handler}                                                                                            from "./helper/newCollectionHandlers"
import {newCollectionIteratorHandler, newCollectionIteratorOf1Handler, newCollectionIteratorOf2Handler}                                                                    from "./helper/newCollectionIteratorHandlers"
import {newEmptyHandler}                                                                                                                                                   from "./helper/newEmptyHandler"
import {newIterableHandler}                                                                                                                                                from "./helper/newIterableHandler"
import {newIterableWithSizeHandler, newIterableWithSizeOf1Handler, newIterableWithSizeOf2Handler}                                                                          from "./helper/newIterableWithSizeHandlers"
import {newMinimalistCollectionHandler, newMinimalistCollectionOf1Handler, newMinimalistCollectionOf2Handler}                                                              from "./helper/newMinimalistCollectionHandlers"
import {newSetHandler, newSetOf1Handler, newSetOf2Handler}                                                                                                                 from "./helper/newSetHandlers"
import {CollectionHolderHoldingNothing}                                                                                                                                    from "./instance/CollectionHolderHoldingNothing"
import {CollectionHolderFromArray}                                                                                                                                         from "./instance/CollectionHolderFromArray"

//#region -------------------- Instances provided for tests --------------------

const arrayOf0 = EMPTY
const arrayOf1 = A
const arrayOf1_nulls = [
    new Holder(NULL,      "[null]",),
    new Holder(UNDEFINED, "[undefined]",),
] as const
const arrayOf2 = AB
const arrayOf2_duplicate = AA
const arrayOf2_nulls = [
    new Holder(A_NULL,      "[a,null]",),
    new Holder(NULL_A,      "[null,a]",),
    new Holder(A_UNDEFINED, "[a,undefined]",),
    new Holder(UNDEFINED_A, "[undefined,a]",),
] as const
const arrayOf3 = ABC
const arrayOf3_duplicates = [
    new Holder(AAB, "[a,a,b]",),
    new Holder(ABB, "[a,b,b]",),
] as const
const arrayOf3_nulls = [
    new Holder(AB_NULL, "[a,b,null]",),
    new Holder(A_NULL_B, "[a,null,b]",),
    new Holder(NULL_AB, "[null,a,b]",),
    new Holder(AB_UNDEFINED, "[a,b,undefined]",),
    new Holder(A_UNDEFINED_B, "[a,undefined,b]",),
    new Holder(UNDEFINED_AB, "[undefined,a,b]",),
] as const

const valuesFor0 = [
    new Holder(-1, "-1",),
    new Holder(0, '0',),
    new Holder(1, '1',),
    new Holder(Number.NaN, "NaN",),
    new Holder(Number.NEGATIVE_INFINITY, "-∞",),
    new Holder(Number.POSITIVE_INFINITY, "+∞",),
] as const
const validValuesFor1 = [-1, 0,] as const
const validValuesFor2 = [-2, -1, 0, 1,] as const
const validValuesFor3 = [-3, -2, -1, 0, 1, 2,] as const

//#endregion -------------------- Instances provided for tests --------------------

describe("CollectionHandlerTest", () => {

    describe("empty", () => {
        test("constructor", () => expect(() => newEmptyHandler(),).not.toThrow(),)

        describe("get", () => test.each(valuesFor0,)("%s", ({value: it,},) => expect(newEmptyHandler().get(it,),).toBeInstanceOf(EmptyCollectionValueHolder,),),)

        test("size",          () => expect(newEmptyHandler().size,).toBe(0,),)
        test("is empty",      () => expect(newEmptyHandler().isEmpty,).toBeTrue(),)
        test("has null",      () => expect(newEmptyHandler().hasNull,).toBeFalse(),)
        test("has duplicate", () => expect(newEmptyHandler().hasDuplicate,).toBeFalse(),)
        test("has finished",  () => expect(newEmptyHandler().hasFinished,).toBeTrue(),)
    },)

    describe("array", () => {
        const newInstance = newArrayHandler

        describe("size of 0", () => {
            test("constructor", () => expect(() => newInstance(arrayOf0,),).not.toThrow(),)

            describe("get", () => test.each(valuesFor0,)("%s", ({value: it,},) => expect(newInstance(arrayOf0,).get(it,),).toBeInstanceOf(EmptyCollectionValueHolder,),),)

            test("size",          () => expect(newInstance(arrayOf0,).size,).toBe(0,),)
            test("is empty",      () => expect(newInstance(arrayOf0,).isEmpty,).toBeTrue(),)
            test("has null",      () => expect(newInstance(arrayOf0,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf0,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf0,).hasFinished,).toBeTrue(),)
        },)
        describe("size of 1", () => {
            const newInstance2 = () => newInstance(arrayOf1,)

            test("constructor", () => expect(() => newInstance2(),).not.toThrow(),)

            describe("get", () => {
                test("-2",  () => expect(newInstance2().get(-2,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor1,)("%d", it => expect(newInstance2().get(it,),).toBeInstanceOf(ValidValueHolder,),)
                test('1',   () => expect(newInstance2().get(1,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test('2',   () => expect(newInstance2().get(2,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance2().get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance2().get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance2().get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance2().size,).toBe(1,),)
            test("is empty",      () => expect(newInstance2().isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance2().hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance2().hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance2().hasFinished,).toBeFalse(),)

            describe("with nulls", () => test.each(arrayOf1_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
        },)
        describe("size of 2", () => {
            const newInstance2 = () => newInstance(arrayOf2,)

            test("constructor", () => expect(() => newInstance2(),).not.toThrow(),)

            describe("get", () => {
                test("-3",  () => expect(newInstance2().get(-3,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor2,)("%d", value => expect(newInstance2().get(value,),).toBeInstanceOf(ValidValueHolder,),)
                test("2",   () => expect(newInstance2().get(2,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test("3",   () => expect(newInstance2().get(3,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance2().get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance2().get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance2().get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance2().size,).toBe(2,),)
            test("is empty",      () => expect(newInstance2().isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance2().hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance2().hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance2().hasFinished,).toBeFalse(),)

            describe("with nulls",  () => test.each(arrayOf2_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
            test("with duplicates", () => expect(newInstance(arrayOf2_duplicate,).hasDuplicate,).toBeTrue(),)
        },)
        describe("size of 3", () => {
            const newInstance2 = () => newInstance(arrayOf3,)

            test("constructor", () => expect(() => newInstance2(),).not.toThrow(),)

            describe("get", () => {
                test("-4",  () => expect(newInstance2().get(-4,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor3,)("%d", value => expect(newInstance2().get(value,),).toBeInstanceOf(ValidValueHolder,),)
                test("3",   () => expect(newInstance2().get(3,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test("4",   () => expect(newInstance2().get(4,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance2().get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance2().get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance2().get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance2().size,).toBe(3,),)
            test("is empty",      () => expect(newInstance2().isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance2().hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance2().hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance2().hasFinished,).toBeFalse(),)

            describe("with nulls",      () => test.each(arrayOf3_nulls,)("%s",      ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
            describe("with duplicates", () => test.each(arrayOf3_duplicates,)("%s", ({value: it,},) => expect(newInstance(it,).hasDuplicate,).toBeTrue(),),)
        },)
    },)
    describe("array of 1", () => {
        const newInstance = newArrayOf1Handler

        describe("constructor", () => {
            test('0', () => expect(() => newInstance(arrayOf0,),).toThrow(),)
            test('1', () => expect(() => newInstance(arrayOf1,),).not.toThrow(),)
            test('2', () => expect(() => newInstance(arrayOf2,),).toThrow(),)
            test('3', () => expect(() => newInstance(arrayOf3,),).toThrow(),)
        },)

        describe("get", () => {
            test("-2",  () => expect(newInstance(arrayOf1,).get(-2,),).toBeInstanceOf(Not0IndexAfterCalculationValueHolder,),)
            test.each(validValuesFor1,)("%d", it => expect(newInstance().get(it,),).toBeInstanceOf(ValidValueHolder,),)
            test('1',   () => expect(newInstance(arrayOf1,).get(1,),).toBeInstanceOf(Not0IndexValueHolder,),)
            test('2',   () => expect(newInstance(arrayOf1,).get(2,),).toBeInstanceOf(Not0IndexValueHolder,),)
            test("NaN", () => expect(newInstance(arrayOf1,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
            test("-∞",  () => expect(newInstance(arrayOf1,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
            test("+∞",  () => expect(newInstance(arrayOf1,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
        },)

        test("size",          () => expect(newInstance().size,).toBe(1,),)
        test("is empty",      () => expect(newInstance().isEmpty,).toBeFalse(),)
        test("has null",      () => expect(newInstance().hasNull,).toBeFalse(),)
        test("has duplicate", () => expect(newInstance().hasDuplicate,).toBeFalse(),)
        test("has finished",  () => expect(newInstance().hasFinished,).toBeFalse(),)

        describe("with nulls", () => test.each(arrayOf1_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
    },)
    describe("array of 2", () => {
        const newInstance = newArrayOf2Handler

        describe("constructor", () => {
            test('0', () => expect(() => newInstance(arrayOf0,),).toThrow(),)
            test('1', () => expect(() => newInstance(arrayOf1,),).toThrow(),)
            test('2', () => expect(() => newInstance(arrayOf2,),).not.toThrow(),)
            test('3', () => expect(() => newInstance(arrayOf3,),).toThrow(),)
        },)

        describe("get", () => {
            test("-3",  () => expect(newInstance(arrayOf2,).get(-3,),).toBeInstanceOf(Not0Or1IndexAfterCalculationValueHolder,),)
            test.each(validValuesFor2,)("%d", value => expect(newInstance(arrayOf2,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
            test("2",   () => expect(newInstance(arrayOf2,).get(2,),).toBeInstanceOf(Not0Or1IndexValueHolder,),)
            test("3",   () => expect(newInstance(arrayOf2,).get(3,),).toBeInstanceOf(Not0Or1IndexValueHolder,),)
            test("NaN", () => expect(newInstance(arrayOf2,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
            test("-∞",  () => expect(newInstance(arrayOf2,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
            test("+∞",  () => expect(newInstance(arrayOf2,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
        },)

        test("size",          () => expect(newInstance().size,).toBe(2,),)
        test("is empty",      () => expect(newInstance().isEmpty,).toBeFalse(),)
        test("has null",      () => expect(newInstance().hasNull,).toBeFalse(),)
        test("has duplicate", () => expect(newInstance().hasDuplicate,).toBeFalse(),)
        test("has finished",  () => expect(newInstance().hasFinished,).toBeFalse(),)

        describe("with nulls",  () => test.each(arrayOf2_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
        test("with duplicates", () => expect(newInstance(arrayOf2_duplicate,).hasDuplicate,).toBeTrue(),)
    },)
    describe("set", () => {
        const newInstance = newSetHandler

        describe("size of 0", () => {
            test("constructor", () => expect(() => newInstance(arrayOf0,),).not.toThrow(),)

            describe("get", () => test.each(valuesFor0,)("%s", ({value: it,},) => expect(newInstance(arrayOf0,).get(it,),).toBeInstanceOf(EmptyCollectionValueHolder,),),)

            test("size",          () => expect(newInstance(arrayOf0,).size,).toBe(0,),)
            test("is empty",      () => expect(newInstance(arrayOf0,).isEmpty,).toBeTrue(),)
            test("has null",      () => expect(newInstance(arrayOf0,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf0,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf0,).hasFinished,).toBeTrue(),)
        },)
        describe("size of 1", () => {
            test("constructor", () => expect(() => newInstance(arrayOf1,),).not.toThrow(),)

            describe("get", () => {
                test("-2",  () => expect(newInstance(arrayOf1,).get(-2,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor1,)("%d", it => expect(newInstance(arrayOf1,).get(it,),).toBeInstanceOf(ValidValueHolder,),)
                test('1',   () => expect(newInstance(arrayOf1,).get(1,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test('2',   () => expect(newInstance(arrayOf1,).get(2,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf1,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf1,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf1,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf1,).size,).toBe(1,),)
            test("is empty",      () => expect(newInstance(arrayOf1,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf1,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf1,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf1,).hasFinished,).toBeFalse(),)

            describe("with nulls", () => test.each(arrayOf1_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
        },)
        describe("size of 2", () => {
            test("constructor", () => expect(() => newInstance(arrayOf2,),).not.toThrow(),)

            describe("get", () => {
                test("-3",  () => expect(newInstance(arrayOf2,).get(-3,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor2,)("%d", value => expect(newInstance(arrayOf2,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
                test("2",   () => expect(newInstance(arrayOf2,).get(2,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test("3",   () => expect(newInstance(arrayOf2,).get(3,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf2,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf2,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf2,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf2,).size,).toBe(2,),)
            test("is empty",      () => expect(newInstance(arrayOf2,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf2,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf2,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf2,).hasFinished,).toBeFalse(),)

            describe("with nulls", () => test.each(arrayOf2_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
            test("with duplicates", () => expect(newInstance(arrayOf2_duplicate,).hasDuplicate,).toBeFalse(),)
        },)
        describe("size of 3", () => {
            test("constructor", () => expect(() => newInstance(arrayOf3,),).not.toThrow(),)

            describe("get", () => {
                test("-4",  () => expect(newInstance(arrayOf3,).get(-4,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor3,)("%d", value => expect(newInstance(arrayOf3,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
                test("3",   () => expect(newInstance(arrayOf3,).get(3,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test("4",   () => expect(newInstance(arrayOf3,).get(4,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf3,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf3,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf3,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf3,).size,).toBe(3,),)
            test("is empty",      () => expect(newInstance(arrayOf3,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf3,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf3,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf3,).hasFinished,).toBeFalse(),)

            describe("with nulls",      () => test.each(arrayOf3_nulls,)("%s",      ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
            describe("with duplicates", () => test.each(arrayOf3_duplicates,)("%s", ({value: it,},) => expect(newInstance(it,).hasDuplicate,).toBeFalse(),),)
        },)
    },)
    describe("set of 1", () => {
        const newInstance = newSetOf1Handler

        describe("constructor", () => {
            test('0', () => expect(() => newInstance(arrayOf0,),).toThrow(),)
            test('1', () => expect(() => newInstance(arrayOf1,),).not.toThrow(),)
            test('2', () => expect(() => newInstance(arrayOf2,),).toThrow(),)
            test('3', () => expect(() => newInstance(arrayOf3,),).toThrow(),)
        },)

        describe("get", () => {
            test("-2",  () => expect(newInstance(arrayOf1,).get(-2,),).toBeInstanceOf(Not0IndexAfterCalculationValueHolder,),)
            test.each(validValuesFor1,)("%d", it => expect(newInstance().get(it,),).toBeInstanceOf(ValidValueHolder,),)
            test('1',   () => expect(newInstance(arrayOf1,).get(1,),).toBeInstanceOf(Not0IndexValueHolder,),)
            test('2',   () => expect(newInstance(arrayOf1,).get(2,),).toBeInstanceOf(Not0IndexValueHolder,),)
            test("NaN", () => expect(newInstance(arrayOf1,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
            test("-∞",  () => expect(newInstance(arrayOf1,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
            test("+∞",  () => expect(newInstance(arrayOf1,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
        },)

        test("size",          () => expect(newInstance().size,).toBe(1,),)
        test("is empty",      () => expect(newInstance().isEmpty,).toBeFalse(),)
        test("has null",      () => expect(newInstance().hasNull,).toBeFalse(),)
        test("has duplicate", () => expect(newInstance().hasDuplicate,).toBeFalse(),)
        test("has finished",  () => expect(newInstance().hasFinished,).toBeFalse(),)

        describe("with nulls", () => test.each(arrayOf1_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
    },)
    describe("set of 2", () => {
        const newInstance = newSetOf2Handler

        describe("constructor", () => {
            test('0', () => expect(() => newInstance(arrayOf0,),).toThrow(),)
            test('1', () => expect(() => newInstance(arrayOf1,),).toThrow(),)
            test('2', () => expect(() => newInstance(arrayOf2,),).not.toThrow(),)
            test('3', () => expect(() => newInstance(arrayOf3,),).toThrow(),)
        },)

        describe("get", () => {
            test("-3",  () => expect(newInstance(arrayOf2,).get(-3,),).toBeInstanceOf(Not0Or1IndexAfterCalculationValueHolder,),)
            test.each(validValuesFor2,)("%d", value => expect(newInstance(arrayOf2,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
            test("2",   () => expect(newInstance(arrayOf2,).get(2,),).toBeInstanceOf(Not0Or1IndexValueHolder,),)
            test("3",   () => expect(newInstance(arrayOf2,).get(3,),).toBeInstanceOf(Not0Or1IndexValueHolder,),)
            test("NaN", () => expect(newInstance(arrayOf2,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
            test("-∞",  () => expect(newInstance(arrayOf2,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
            test("+∞",  () => expect(newInstance(arrayOf2,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
        },)

        test("size",          () => expect(newInstance().size,).toBe(2,),)
        test("is empty",      () => expect(newInstance().isEmpty,).toBeFalse(),)
        test("has null",      () => expect(newInstance().hasNull,).toBeFalse(),)
        test("has duplicate", () => expect(newInstance().hasDuplicate,).toBeFalse(),)
        test("has finished",  () => expect(newInstance().hasFinished,).toBeFalse(),)

        describe("with nulls",  () => test.each(arrayOf2_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
        test("with duplicates", () => expect(() => newInstance(arrayOf2_duplicate,).hasDuplicate,).toThrow(),)
    },)
    describe("minimalist collection holder", () => {
        const newInstance = newMinimalistCollectionHandler

        describe("size of 0", () => {
            test("constructor", () => expect(() => newInstance(arrayOf0,),).not.toThrow(),)

            describe("get", () => test.each(valuesFor0,)("%s", ({value: it,},) => expect(newInstance(arrayOf0,).get(it,),).toBeInstanceOf(EmptyCollectionValueHolder,),),)

            test("size",          () => expect(newInstance(arrayOf0,).size,).toBe(0,),)
            test("is empty",      () => expect(newInstance(arrayOf0,).isEmpty,).toBeTrue(),)
            test("has null",      () => expect(newInstance(arrayOf0,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf0,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf0,).hasFinished,).toBeTrue(),)
        },)
        describe("size of 1", () => {
            test("constructor", () => expect(() => newInstance(arrayOf1,),).not.toThrow(),)

            describe("get", () => {
                test("-2",  () => expect(newInstance(arrayOf1,).get(-2,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor1,)("%d", it => expect(newInstance(arrayOf1,).get(it,),).toBeInstanceOf(ValidValueHolder,),)
                test('1',   () => expect(newInstance(arrayOf1,).get(1,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test('2',   () => expect(newInstance(arrayOf1,).get(2,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf1,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf1,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf1,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf1,).size,).toBe(1,),)
            test("is empty",      () => expect(newInstance(arrayOf1,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf1,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf1,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf1,).hasFinished,).toBeFalse(),)

            describe("with nulls", () => test.each(arrayOf1_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
        },)
        describe("size of 2", () => {
            test("constructor", () => expect(() => newInstance(arrayOf2,),).not.toThrow(),)

            describe("get", () => {
                test("-3",  () => expect(newInstance(arrayOf2,).get(-3,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor2,)("%d", value => expect(newInstance(arrayOf2,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
                test("2",   () => expect(newInstance(arrayOf2,).get(2,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test("3",   () => expect(newInstance(arrayOf2,).get(3,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf2,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf2,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf2,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf2,).size,).toBe(2,),)
            test("is empty",      () => expect(newInstance(arrayOf2,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf2,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf2,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf2,).hasFinished,).toBeFalse(),)

            describe("with nulls",  () => test.each(arrayOf2_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
            test("with duplicates", () => expect(newInstance(arrayOf2_duplicate,).hasDuplicate,).toBeTrue(),)
        },)
        describe("size of 3", () => {
            test("constructor", () => expect(() => newInstance(arrayOf3,),).not.toThrow(),)

            describe("get", () => {
                test("-4",  () => expect(newInstance(arrayOf3,).get(-4,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor3,)("%d", value => expect(newInstance(arrayOf3,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
                test("3",   () => expect(newInstance(arrayOf3,).get(3,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test("4",   () => expect(newInstance(arrayOf3,).get(4,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf3,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf3,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf3,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf3,).size,).toBe(3,),)
            test("is empty",      () => expect(newInstance(arrayOf3,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf3,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf3,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf3,).hasFinished,).toBeFalse(),)

            describe("with nulls",      () => test.each(arrayOf3_nulls,)("%s",      ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
            describe("with duplicates", () => test.each(arrayOf3_duplicates,)("%s", ({value: it,},) => expect(newInstance(it,).hasDuplicate,).toBeTrue(),),)
        },)
    },)
    describe("minimalist collection holder of 1", () => {
        const newInstance = newMinimalistCollectionOf1Handler

        describe("constructor", () => {
            test('0', () => expect(() => newInstance(arrayOf0,),).toThrow(),)
            test('1', () => expect(() => newInstance(arrayOf1,),).not.toThrow(),)
            test('2', () => expect(() => newInstance(arrayOf2,),).toThrow(),)
            test('3', () => expect(() => newInstance(arrayOf3,),).toThrow(),)
        },)

        describe("get", () => {
            test("-2",  () => expect(newInstance(arrayOf1,).get(-2,),).toBeInstanceOf(Not0IndexAfterCalculationValueHolder,),)
            test.each(validValuesFor1,)("%d", it => expect(newInstance().get(it,),).toBeInstanceOf(ValidValueHolder,),)
            test('1',   () => expect(newInstance(arrayOf1,).get(1,),).toBeInstanceOf(Not0IndexValueHolder,),)
            test('2',   () => expect(newInstance(arrayOf1,).get(2,),).toBeInstanceOf(Not0IndexValueHolder,),)
            test("NaN", () => expect(newInstance(arrayOf1,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
            test("-∞",  () => expect(newInstance(arrayOf1,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
            test("+∞",  () => expect(newInstance(arrayOf1,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
        },)

        test("size",          () => expect(newInstance().size,).toBe(1,),)
        test("is empty",      () => expect(newInstance().isEmpty,).toBeFalse(),)
        test("has null",      () => expect(newInstance().hasNull,).toBeFalse(),)
        test("has duplicate", () => expect(newInstance().hasDuplicate,).toBeFalse(),)
        test("has finished",  () => expect(newInstance().hasFinished,).toBeFalse(),)

        describe("with nulls", () => test.each(arrayOf1_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
    },)
    describe("minimalist collection holder of 2", () => {
        const newInstance = newMinimalistCollectionOf2Handler

        describe("constructor", () => {
            test('0', () => expect(() => newInstance(arrayOf0,),).toThrow(),)
            test('1', () => expect(() => newInstance(arrayOf1,),).toThrow(),)
            test('2', () => expect(() => newInstance(arrayOf2,),).not.toThrow(),)
            test('3', () => expect(() => newInstance(arrayOf3,),).toThrow(),)
        },)

        describe("get", () => {
            test("-3",  () => expect(newInstance(arrayOf2,).get(-3,),).toBeInstanceOf(Not0Or1IndexAfterCalculationValueHolder,),)
            test.each(validValuesFor2,)("%d", value => expect(newInstance(arrayOf2,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
            test("2",   () => expect(newInstance(arrayOf2,).get(2,),).toBeInstanceOf(Not0Or1IndexValueHolder,),)
            test("3",   () => expect(newInstance(arrayOf2,).get(3,),).toBeInstanceOf(Not0Or1IndexValueHolder,),)
            test("NaN", () => expect(newInstance(arrayOf2,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
            test("-∞",  () => expect(newInstance(arrayOf2,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
            test("+∞",  () => expect(newInstance(arrayOf2,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
        },)

        test("size",          () => expect(newInstance().size,).toBe(2,),)
        test("is empty",      () => expect(newInstance().isEmpty,).toBeFalse(),)
        test("has null",      () => expect(newInstance().hasNull,).toBeFalse(),)
        test("has duplicate", () => expect(newInstance().hasDuplicate,).toBeFalse(),)
        test("has finished",  () => expect(newInstance().hasFinished,).toBeFalse(),)

        describe("with nulls",  () => test.each(arrayOf2_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
        test("with duplicates", () => expect(newInstance(arrayOf2_duplicate,).hasDuplicate,).toBeTrue(),)
    },)
    describe("collection holder", () => {
        const newInstance = newCollectionHandler

        describe("size of 0", () => {
            test("constructor", () => expect(() => newInstance(arrayOf0,),).not.toThrow(),)

            describe("get", () => test.each(valuesFor0,)("%s", ({value: it,},) => expect(newInstance(arrayOf0,).get(it,),).toBeInstanceOf(EmptyCollectionValueHolder,),),)

            test("size",          () => expect(newInstance(arrayOf0,).size,).toBe(0,),)
            test("is empty",      () => expect(newInstance(arrayOf0,).isEmpty,).toBeTrue(),)
            test("has null",      () => expect(newInstance(arrayOf0,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf0,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf0,).hasFinished,).toBeTrue(),)
        },)
        describe("size of 1", () => {
            test("constructor", () => expect(() => newInstance(arrayOf1,),).not.toThrow(),)

            describe("get", () => {
                test("-2",  () => expect(newInstance(arrayOf1,).get(-2,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor1,)("%d", it => expect(newInstance(arrayOf1,).get(it,),).toBeInstanceOf(ValidValueHolder,),)
                test('1',   () => expect(newInstance(arrayOf1,).get(1,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test('2',   () => expect(newInstance(arrayOf1,).get(2,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf1,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf1,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf1,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf1,).size,).toBe(1,),)
            test("is empty",      () => expect(newInstance(arrayOf1,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf1,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf1,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf1,).hasFinished,).toBeFalse(),)

            describe("with nulls", () => test.each(arrayOf1_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
        },)
        describe("size of 2", () => {
            test("constructor", () => expect(() => newInstance(arrayOf2,),).not.toThrow(),)

            describe("get", () => {
                test("-3",  () => expect(newInstance(arrayOf2,).get(-3,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor2,)("%d", value => expect(newInstance(arrayOf2,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
                test("2",   () => expect(newInstance(arrayOf2,).get(2,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test("3",   () => expect(newInstance(arrayOf2,).get(3,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf2,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf2,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf2,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf2,).size,).toBe(2,),)
            test("is empty",      () => expect(newInstance(arrayOf2,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf2,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf2,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf2,).hasFinished,).toBeFalse(),)

            describe("with nulls",  () => test.each(arrayOf2_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
            test("with duplicates", () => expect(newInstance(arrayOf2_duplicate,).hasDuplicate,).toBeTrue(),)
        },)
        describe("size of 3", () => {
            test("constructor", () => expect(() => newInstance(arrayOf3,),).not.toThrow(),)

            describe("get", () => {
                test("-4",  () => expect(newInstance(arrayOf3,).get(-4,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor3,)("%d", value => expect(newInstance(arrayOf3,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
                test("3",   () => expect(newInstance(arrayOf3,).get(3,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test("4",   () => expect(newInstance(arrayOf3,).get(4,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf3,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf3,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf3,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf3,).size,).toBe(3,),)
            test("is empty",      () => expect(newInstance(arrayOf3,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf3,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf3,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf3,).hasFinished,).toBeFalse(),)

            describe("with nulls",      () => test.each(arrayOf3_nulls,)("%s",      ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
            describe("with duplicates", () => test.each(arrayOf3_duplicates,)("%s", ({value: it,},) => expect(newInstance(it,).hasDuplicate,).toBeTrue(),),)
        },)
    },)
    describe("collection holder of 1", () => {
        const newInstance = newCollectionOf1Handler

        describe("constructor", () => {
            test('0', () => expect(() => newInstance(arrayOf0,),).toThrow(),)
            test('1', () => expect(() => newInstance(arrayOf1,),).not.toThrow(),)
            test('2', () => expect(() => newInstance(arrayOf2,),).toThrow(),)
            test('3', () => expect(() => newInstance(arrayOf3,),).toThrow(),)
        },)

        describe("get", () => {
            test("-2",  () => expect(newInstance(arrayOf1,).get(-2,),).toBeInstanceOf(Not0IndexAfterCalculationValueHolder,),)
            test.each(validValuesFor1,)("%d", it => expect(newInstance().get(it,),).toBeInstanceOf(ValidValueHolder,),)
            test('1',   () => expect(newInstance(arrayOf1,).get(1,),).toBeInstanceOf(Not0IndexValueHolder,),)
            test('2',   () => expect(newInstance(arrayOf1,).get(2,),).toBeInstanceOf(Not0IndexValueHolder,),)
            test("NaN", () => expect(newInstance(arrayOf1,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
            test("-∞",  () => expect(newInstance(arrayOf1,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
            test("+∞",  () => expect(newInstance(arrayOf1,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
        },)

        test("size",          () => expect(newInstance().size,).toBe(1,),)
        test("is empty",      () => expect(newInstance().isEmpty,).toBeFalse(),)
        test("has null",      () => expect(newInstance().hasNull,).toBeFalse(),)
        test("has duplicate", () => expect(newInstance().hasDuplicate,).toBeFalse(),)
        test("has finished",  () => expect(newInstance().hasFinished,).toBeFalse(),)

        describe("with nulls", () => test.each(arrayOf1_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
    },)
    describe("collection holder of 2", () => {
        const newInstance = newCollectionOf2Handler

        describe("constructor", () => {
            test('0', () => expect(() => newInstance(arrayOf0,),).toThrow(),)
            test('1', () => expect(() => newInstance(arrayOf1,),).toThrow(),)
            test('2', () => expect(() => newInstance(arrayOf2,),).not.toThrow(),)
            test('3', () => expect(() => newInstance(arrayOf3,),).toThrow(),)
        },)

        describe("get", () => {
            test("-3",  () => expect(newInstance(arrayOf2,).get(-3,),).toBeInstanceOf(Not0Or1IndexAfterCalculationValueHolder,),)
            test.each(validValuesFor2,)("%d", value => expect(newInstance(arrayOf2,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
            test("2",   () => expect(newInstance(arrayOf2,).get(2,),).toBeInstanceOf(Not0Or1IndexValueHolder,),)
            test("3",   () => expect(newInstance(arrayOf2,).get(3,),).toBeInstanceOf(Not0Or1IndexValueHolder,),)
            test("NaN", () => expect(newInstance(arrayOf2,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
            test("-∞",  () => expect(newInstance(arrayOf2,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
            test("+∞",  () => expect(newInstance(arrayOf2,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
        },)

        test("size",          () => expect(newInstance().size,).toBe(2,),)
        test("is empty",      () => expect(newInstance().isEmpty,).toBeFalse(),)
        test("has null",      () => expect(newInstance().hasNull,).toBeFalse(),)
        test("has duplicate", () => expect(newInstance().hasDuplicate,).toBeFalse(),)
        test("has finished",  () => expect(newInstance().hasFinished,).toBeFalse(),)

        describe("with nulls",  () => test.each(arrayOf2_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
        test("with duplicates", () => expect(newInstance(arrayOf2_duplicate,).hasDuplicate,).toBeTrue(),)
    },)
    describe("collection iterator", () => {
        const newInstance = newCollectionIteratorHandler

        describe("size of 0", () => {
            test("constructor", () => expect(() => newInstance(arrayOf0,),).not.toThrow(),)

            describe("get", () => test.each(valuesFor0,)("%s", ({value: it,},) => expect(newInstance(arrayOf0,).get(it,),).toBeInstanceOf(EmptyCollectionValueHolder,),),)

            test("size",          () => expect(newInstance(arrayOf0,).size,).toBe(0,),)
            test("is empty",      () => expect(newInstance(arrayOf0,).isEmpty,).toBeTrue(),)
            test("has null",      () => expect(newInstance(arrayOf0,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf0,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf0,).hasFinished,).toBeTrue(),)
        },)
        describe("size of 1", () => {
            test("constructor", () => expect(() => newInstance(arrayOf1,),).not.toThrow(),)

            describe("get", () => {
                test("-2",  () => expect(newInstance(arrayOf1,).get(-2,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor1,)("%d", it => expect(newInstance(arrayOf1,).get(it,),).toBeInstanceOf(ValidValueHolder,),)
                test('1',   () => expect(newInstance(arrayOf1,).get(1,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test('2',   () => expect(newInstance(arrayOf1,).get(2,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf1,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf1,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf1,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf1,).size,).toBe(1,),)
            test("is empty",      () => expect(newInstance(arrayOf1,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf1,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf1,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf1,).hasFinished,).toBeFalse(),)

            describe("with nulls", () => test.each(arrayOf1_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
        },)
        describe("size of 2", () => {
            test("constructor", () => expect(() => newInstance(arrayOf2,),).not.toThrow(),)

            describe("get", () => {
                test("-3",  () => expect(newInstance(arrayOf2,).get(-3,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor2,)("%d", value => expect(newInstance(arrayOf2,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
                test("2",   () => expect(newInstance(arrayOf2,).get(2,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test("3",   () => expect(newInstance(arrayOf2,).get(3,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf2,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf2,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf2,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf2,).size,).toBe(2,),)
            test("is empty",      () => expect(newInstance(arrayOf2,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf2,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf2,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf2,).hasFinished,).toBeFalse(),)

            describe("with nulls",  () => test.each(arrayOf2_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
            test("with duplicates", () => expect(newInstance(arrayOf2_duplicate,).hasDuplicate,).toBeTrue(),)
        },)
        describe("size of 3", () => {
            test("constructor", () => expect(() => newInstance(arrayOf3,),).not.toThrow(),)

            describe("get", () => {
                test("-4",  () => expect(newInstance(arrayOf3,).get(-4,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor3,)("%d", value => expect(newInstance(arrayOf3,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
                test("3",   () => expect(newInstance(arrayOf3,).get(3,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test("4",   () => expect(newInstance(arrayOf3,).get(4,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf3,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf3,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf3,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf3,).size,).toBe(3,),)
            test("is empty",      () => expect(newInstance(arrayOf3,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf3,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf3,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf3,).hasFinished,).toBeFalse(),)

            describe("with nulls",      () => test.each(arrayOf3_nulls,)("%s",      ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
            describe("with duplicates", () => test.each(arrayOf3_duplicates,)("%s", ({value: it,},) => expect(newInstance(it,).hasDuplicate,).toBeTrue(),),)
        },)
    },)
    describe("collection iterator of 1", () => {
        const newInstance = newCollectionIteratorOf1Handler

        describe("constructor", () => {
            test('0', () => expect(() => newInstance(arrayOf0,),).toThrow(),)
            test('1', () => expect(() => newInstance(arrayOf1,),).not.toThrow(),)
            test('2', () => expect(() => newInstance(arrayOf2,),).toThrow(),)
            test('3', () => expect(() => newInstance(arrayOf3,),).toThrow(),)
        },)

        describe("get", () => {
            test("-2",  () => expect(newInstance(arrayOf1,).get(-2,),).toBeInstanceOf(Not0IndexAfterCalculationValueHolder,),)
            test.each(validValuesFor1,)("%d", it => expect(newInstance().get(it,),).toBeInstanceOf(ValidValueHolder,),)
            test('1',   () => expect(newInstance(arrayOf1,).get(1,),).toBeInstanceOf(Not0IndexValueHolder,),)
            test('2',   () => expect(newInstance(arrayOf1,).get(2,),).toBeInstanceOf(Not0IndexValueHolder,),)
            test("NaN", () => expect(newInstance(arrayOf1,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
            test("-∞",  () => expect(newInstance(arrayOf1,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
            test("+∞",  () => expect(newInstance(arrayOf1,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
        },)

        test("size",          () => expect(newInstance().size,).toBe(1,),)
        test("is empty",      () => expect(newInstance().isEmpty,).toBeFalse(),)
        test("has null",      () => expect(newInstance().hasNull,).toBeFalse(),)
        test("has duplicate", () => expect(newInstance().hasDuplicate,).toBeFalse(),)
        test("has finished",  () => expect(newInstance().hasFinished,).toBeFalse(),)

        describe("with nulls", () => test.each(arrayOf1_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
    },)
    describe("collection iterator of 2", () => {
        const newInstance = newCollectionIteratorOf2Handler

        describe("constructor", () => {
            test('0', () => expect(() => newInstance(arrayOf0,),).toThrow(),)
            test('1', () => expect(() => newInstance(arrayOf1,),).toThrow(),)
            test('2', () => expect(() => newInstance(arrayOf2,),).not.toThrow(),)
            test('3', () => expect(() => newInstance(arrayOf3,),).toThrow(),)
        },)

        describe("get", () => {
            test("-3",  () => expect(newInstance(arrayOf2,).get(-3,),).toBeInstanceOf(Not0Or1IndexAfterCalculationValueHolder,),)
            test.each(validValuesFor2,)("%d", value => expect(newInstance(arrayOf2,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
            test("2",   () => expect(newInstance(arrayOf2,).get(2,),).toBeInstanceOf(Not0Or1IndexValueHolder,),)
            test("3",   () => expect(newInstance(arrayOf2,).get(3,),).toBeInstanceOf(Not0Or1IndexValueHolder,),)
            test("NaN", () => expect(newInstance(arrayOf2,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
            test("-∞",  () => expect(newInstance(arrayOf2,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
            test("+∞",  () => expect(newInstance(arrayOf2,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
        },)

        test("size",          () => expect(newInstance().size,).toBe(2,),)
        test("is empty",      () => expect(newInstance().isEmpty,).toBeFalse(),)
        test("has null",      () => expect(newInstance().hasNull,).toBeFalse(),)
        test("has duplicate", () => expect(newInstance().hasDuplicate,).toBeFalse(),)
        test("has finished",  () => expect(newInstance().hasFinished,).toBeFalse(),)

        describe("with nulls",  () => test.each(arrayOf2_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
        test("with duplicates", () => expect(newInstance(arrayOf2_duplicate,).hasDuplicate,).toBeTrue(),)
    },)
    describe("iterable", () => {
        const newInstance = newIterableHandler

        describe("size of 0", () => {
            test("constructor", () => expect(() => newInstance(arrayOf0,),).not.toThrow(),)

            describe("get", () => test.each(valuesFor0,)("%s", ({value: it,},) => expect(newInstance(arrayOf0,).get(it,),).toBeInstanceOf(EmptyCollectionValueHolder,),),)

            test("size",          () => expect(newInstance(arrayOf0,).size,).toBe(0,),)
            test("is empty",      () => expect(newInstance(arrayOf0,).isEmpty,).toBeTrue(),)
            test("has null",      () => expect(newInstance(arrayOf0,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf0,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf0,).hasFinished,).toBeTrue(),)
        },)
        describe("size of 1", () => {
            test("constructor", () => expect(() => newInstance(arrayOf1,),).not.toThrow(),)

            describe("get", () => {
                test("-2",  () => expect(newInstance(arrayOf1,).get(-2,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor1,)("%d", it => expect(newInstance(arrayOf1,).get(it,),).toBeInstanceOf(ValidValueHolder,),)
                test('1',   () => expect(newInstance(arrayOf1,).get(1,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test('2',   () => expect(newInstance(arrayOf1,).get(2,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf1,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf1,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf1,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf1,).size,).toBe(1,),)
            test("is empty",      () => expect(newInstance(arrayOf1,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf1,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf1,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf1,).hasFinished,).toBeFalse(),)

            describe("with nulls", () => test.each(arrayOf1_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
        },)
        describe("size of 2", () => {
            test("constructor", () => expect(() => newInstance(arrayOf2,),).not.toThrow(),)

            describe("get", () => {
                test("-3",  () => expect(newInstance(arrayOf2,).get(-3,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor2,)("%d", value => expect(newInstance(arrayOf2,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
                test("2",   () => expect(newInstance(arrayOf2,).get(2,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test("3",   () => expect(newInstance(arrayOf2,).get(3,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf2,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf2,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf2,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf2,).size,).toBe(2,),)
            test("is empty",      () => expect(newInstance(arrayOf2,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf2,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf2,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf2,).hasFinished,).toBeFalse(),)

            describe("with nulls",  () => test.each(arrayOf2_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
            test("with duplicates", () => expect(newInstance(arrayOf2_duplicate,).hasDuplicate,).toBeTrue(),)
        },)
        describe("size of 3", () => {
            test("constructor", () => expect(() => newInstance(arrayOf3,),).not.toThrow(),)

            describe("get", () => {
                test("-4",  () => expect(newInstance(arrayOf3,).get(-4,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor3,)("%d", value => expect(newInstance(arrayOf3,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
                test("3",   () => expect(newInstance(arrayOf3,).get(3,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test("4",   () => expect(newInstance(arrayOf3,).get(4,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf3,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf3,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf3,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf3,).size,).toBe(3,),)
            test("is empty",      () => expect(newInstance(arrayOf3,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf3,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf3,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf3,).hasFinished,).toBeFalse(),)

            describe("with nulls",      () => test.each(arrayOf3_nulls,)("%s",      ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
            describe("with duplicates", () => test.each(arrayOf3_duplicates,)("%s", ({value: it,},) => expect(newInstance(it,).hasDuplicate,).toBeTrue(),),)
        },)
    },)
    describe("iterable with size", () => {
        const newInstance = newIterableWithSizeHandler

        describe("size of 0", () => {
            test("constructor", () => expect(() => newInstance(arrayOf0,),).not.toThrow(),)

            describe("get", () => test.each(valuesFor0,)("%s", ({value: it,},) => expect(newInstance(arrayOf0,).get(it,),).toBeInstanceOf(EmptyCollectionValueHolder,),),)

            test("size",          () => expect(newInstance(arrayOf0,).size,).toBe(0,),)
            test("is empty",      () => expect(newInstance(arrayOf0,).isEmpty,).toBeTrue(),)
            test("has null",      () => expect(newInstance(arrayOf0,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf0,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf0,).hasFinished,).toBeTrue(),)
        },)
        describe("size of 1", () => {
            test("constructor", () => expect(() => newInstance(arrayOf1,),).not.toThrow(),)

            describe("get", () => {
                test("-2",  () => expect(newInstance(arrayOf1,).get(-2,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor1,)("%d", it => expect(newInstance(arrayOf1,).get(it,),).toBeInstanceOf(ValidValueHolder,),)
                test('1',   () => expect(newInstance(arrayOf1,).get(1,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test('2',   () => expect(newInstance(arrayOf1,).get(2,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf1,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf1,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf1,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf1,).size,).toBe(1,),)
            test("is empty",      () => expect(newInstance(arrayOf1,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf1,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf1,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf1,).hasFinished,).toBeFalse(),)

            describe("with nulls", () => test.each(arrayOf1_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
        },)
        describe("size of 2", () => {
            test("constructor", () => expect(() => newInstance(arrayOf2,),).not.toThrow(),)

            describe("get", () => {
                test("-3",  () => expect(newInstance(arrayOf2,).get(-3,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor2,)("%d", value => expect(newInstance(arrayOf2,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
                test("2",   () => expect(newInstance(arrayOf2,).get(2,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test("3",   () => expect(newInstance(arrayOf2,).get(3,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf2,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf2,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf2,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf2,).size,).toBe(2,),)
            test("is empty",      () => expect(newInstance(arrayOf2,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf2,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf2,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf2,).hasFinished,).toBeFalse(),)

            describe("with nulls",  () => test.each(arrayOf2_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
            test("with duplicates", () => expect(newInstance(arrayOf2_duplicate,).hasDuplicate,).toBeTrue(),)
        },)
        describe("size of 3", () => {
            test("constructor", () => expect(() => newInstance(arrayOf3,),).not.toThrow(),)

            describe("get", () => {
                test("-4",  () => expect(newInstance(arrayOf3,).get(-4,),).toBeInstanceOf(UnderZeroIndexAfterCalculationValueHolder,),)
                test.each(validValuesFor3,)("%d", value => expect(newInstance(arrayOf3,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
                test("3",   () => expect(newInstance(arrayOf3,).get(3,),).toBeInstanceOf(SizeIndexValueHolder,),)
                test("4",   () => expect(newInstance(arrayOf3,).get(4,),).toBeInstanceOf(OverSizeIndexValueHolder,),)
                test("NaN", () => expect(newInstance(arrayOf3,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
                test("-∞",  () => expect(newInstance(arrayOf3,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
                test("+∞",  () => expect(newInstance(arrayOf3,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
            },)

            test("size",          () => expect(newInstance(arrayOf3,).size,).toBe(3,),)
            test("is empty",      () => expect(newInstance(arrayOf3,).isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance(arrayOf3,).hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance(arrayOf3,).hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance(arrayOf3,).hasFinished,).toBeFalse(),)

            describe("with nulls",      () => test.each(arrayOf3_nulls,)("%s",      ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
            describe("with duplicates", () => test.each(arrayOf3_duplicates,)("%s", ({value: it,},) => expect(newInstance(it,).hasDuplicate,).toBeTrue(),),)
        },)
    },)
    describe("iterable with size of 1", () => {
        const newInstance = newIterableWithSizeOf1Handler

        describe("constructor", () => {
            test('0', () => expect(() => newInstance(arrayOf0,),).toThrow(),)
            test('1', () => expect(() => newInstance(arrayOf1,),).not.toThrow(),)
            test('2', () => expect(() => newInstance(arrayOf2,),).toThrow(),)
            test('3', () => expect(() => newInstance(arrayOf3,),).toThrow(),)
        },)

        describe("get", () => {
            test("-2",  () => expect(newInstance(arrayOf1,).get(-2,),).toBeInstanceOf(Not0IndexAfterCalculationValueHolder,),)
            test.each(validValuesFor1,)("%d", it => expect(newInstance().get(it,),).toBeInstanceOf(ValidValueHolder,),)
            test('1',   () => expect(newInstance(arrayOf1,).get(1,),).toBeInstanceOf(Not0IndexValueHolder,),)
            test('2',   () => expect(newInstance(arrayOf1,).get(2,),).toBeInstanceOf(Not0IndexValueHolder,),)
            test("NaN", () => expect(newInstance(arrayOf1,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
            test("-∞",  () => expect(newInstance(arrayOf1,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
            test("+∞",  () => expect(newInstance(arrayOf1,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
        },)

        test("size",          () => expect(newInstance().size,).toBe(1,),)
        test("is empty",      () => expect(newInstance().isEmpty,).toBeFalse(),)
        test("has null",      () => expect(newInstance().hasNull,).toBeFalse(),)
        test("has duplicate", () => expect(newInstance().hasDuplicate,).toBeFalse(),)
        test("has finished",  () => expect(newInstance().hasFinished,).toBeFalse(),)

        describe("with nulls", () => test.each(arrayOf1_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
    },)
    describe("iterable with size of 2", () => {
        const newInstance = newIterableWithSizeOf2Handler

        describe("constructor", () => {
            test('0', () => expect(() => newInstance(arrayOf0,),).toThrow(),)
            test('1', () => expect(() => newInstance(arrayOf1,),).toThrow(),)
            test('2', () => expect(() => newInstance(arrayOf2,),).not.toThrow(),)
            test('3', () => expect(() => newInstance(arrayOf3,),).toThrow(),)
        },)

        describe("get", () => {
            test("-3",  () => expect(newInstance(arrayOf2,).get(-3,),).toBeInstanceOf(Not0Or1IndexAfterCalculationValueHolder,),)
            test.each(validValuesFor2,)("%d", value => expect(newInstance(arrayOf2,).get(value,),).toBeInstanceOf(ValidValueHolder,),)
            test("2",   () => expect(newInstance(arrayOf2,).get(2,),).toBeInstanceOf(Not0Or1IndexValueHolder,),)
            test("3",   () => expect(newInstance(arrayOf2,).get(3,),).toBeInstanceOf(Not0Or1IndexValueHolder,),)
            test("NaN", () => expect(newInstance(arrayOf2,).get(Number.NaN,),).toBeInstanceOf(NaNIndexValueHolder,),)
            test("-∞",  () => expect(newInstance(arrayOf2,).get(Number.NEGATIVE_INFINITY,),).toBeInstanceOf(NegativeInfinityIndexValueHolder,),)
            test("+∞",  () => expect(newInstance(arrayOf2,).get(Number.POSITIVE_INFINITY,),).toBeInstanceOf(PositiveInfinityIndexValueHolder,),)
        },)

        test("size",          () => expect(newInstance().size,).toBe(2,),)
        test("is empty",      () => expect(newInstance().isEmpty,).toBeFalse(),)
        test("has null",      () => expect(newInstance().hasNull,).toBeFalse(),)
        test("has duplicate", () => expect(newInstance().hasDuplicate,).toBeFalse(),)
        test("has finished",  () => expect(newInstance().hasFinished,).toBeFalse(),)

        describe("with nulls",  () => test.each(arrayOf2_nulls,)("%s", ({value: it,},) => expect(newInstance(it,).hasNull,).toBeTrue(),),)
        test("with duplicates", () => expect(newInstance(arrayOf2_duplicate,).hasDuplicate,).toBeTrue(),)
    },)

    describe("after call of get", () => {
        describe("array", () => {
            const newInstance = <const T, >(array: readonly T[],) => newArrayHandler(array, new CollectionHolderHoldingNothing(),)
            const newInstanceAlt = <const T, >(array: readonly T[],) => newArrayHandler(array, new CollectionHolderFromArray(array,),)

            describe("size of 1", () => {
                const newInstance2 = () => retrieve1st(newInstance(arrayOf1,),)
                const newInstance2Alt = () => retrieve1st(newInstanceAlt(arrayOf1,),)

                test("size",          () => expect(newInstance2().size,).toBe(1,),)
                test("is empty",      () => expect(newInstance2().isEmpty,).toBeFalse(),)
                test("has null",      () => expect(newInstance2Alt().hasNull,).toBeFalse(),)
                test("has duplicate", () => expect(newInstance2().hasDuplicate,).toBeFalse(),)
                test("has finished",  () => expect(newInstance2().hasFinished,).toBeTrue(),)
            },)
            describe("size of 2", () => {
                const newInstance2 = () => newInstance(arrayOf2,)
                const newInstance2Alt = () => newInstanceAlt(arrayOf2,)

                describe("after 1st get", () => {
                    const newInstance3 = () => retrieve1st(newInstance2(),)
                    const newInstance3Alt = () => retrieve1st(newInstance2Alt(),)

                    test("size",          () => expect(newInstance3().size,).toBe(2,),)
                    test("is empty",      () => expect(newInstance3().isEmpty,).toBeFalse(),)
                    test("has null",      () => expect(newInstance3Alt().hasNull,).toBeFalse(),)
                    test("has duplicate", () => expect(newInstance3Alt().hasDuplicate,).toBeFalse(),)
                    test("has finished",  () => expect(newInstance3().hasFinished,).toBeFalse(),)
                },)
                describe("after 2nd get", () => {
                    const newInstance3 = () => retrieve2nd(newInstance2(),)
                    const newInstance3Alt = () => retrieve2nd(newInstance2Alt(),)

                    test("size",          () => expect(newInstance3().size,).toBe(2,),)
                    test("is empty",      () => expect(newInstance3().isEmpty,).toBeFalse(),)
                    test("has null",      () => expect(newInstance3Alt().hasNull,).toBeFalse(),)
                    test("has duplicate", () => expect(newInstance3Alt().hasDuplicate,).toBeFalse(),)
                    test("has finished",  () => expect(newInstance3().hasFinished,).toBeFalse(),)
                },)
                describe("after 1st & 2nd get", () => {
                    const newInstance3 = () => retrieve1stAnd2nd(newInstance2(),)
                    const newInstance3Alt = () => retrieve1stAnd2nd(newInstance2Alt(),)

                    test("size",          () => expect(newInstance3().size,).toBe(2,),)
                    test("is empty",      () => expect(newInstance3().isEmpty,).toBeFalse(),)
                    test("has null",      () => expect(newInstance3Alt().hasNull,).toBeFalse(),)
                    test("has duplicate", () => expect(newInstance3Alt().hasDuplicate,).toBeFalse(),)
                    test("has finished",  () => expect(newInstance3().hasFinished,).toBeTrue(),)
                },)
            },)
            describe("size of 3", () => {
                const newInstance2 = () => newInstance(arrayOf3,)
                const newInstance2Alt = () => newInstanceAlt(arrayOf3,)

                describe("after 1st get", () => {
                    const newInstance3 = () => retrieve1st(newInstance2(),)
                    const newInstance3Alt = () => retrieve1st(newInstance2Alt(),)

                    test("size",          () => expect(newInstance3().size,).toBe(3,),)
                    test("is empty",      () => expect(newInstance3().isEmpty,).toBeFalse(),)
                    test("has null",      () => expect(newInstance3Alt().hasNull,).toBeFalse(),)
                    test("has duplicate", () => expect(newInstance3Alt().hasDuplicate,).toBeFalse(),)
                    test("has finished",  () => expect(newInstance3().hasFinished,).toBeFalse(),)
                },)
                describe("after 2nd get", () => {
                    const newInstance3 = () => retrieve2nd(newInstance2(),)
                    const newInstance3Alt = () => retrieve2nd(newInstance2Alt(),)

                    test("size",          () => expect(newInstance3().size,).toBe(3,),)
                    test("is empty",      () => expect(newInstance3().isEmpty,).toBeFalse(),)
                    test("has null",      () => expect(newInstance3Alt().hasNull,).toBeFalse(),)
                    test("has duplicate", () => expect(newInstance3Alt().hasDuplicate,).toBeFalse(),)
                    test("has finished",  () => expect(newInstance3().hasFinished,).toBeFalse(),)
                },)
                describe("after 3rd get", () => {
                    const newInstance3 = () => retrieve3rd(newInstance2(),)
                    const newInstance3Alt = () => retrieve3rd(newInstance2Alt(),)

                    test("size",          () => expect(newInstance3().size,).toBe(3,),)
                    test("is empty",      () => expect(newInstance3().isEmpty,).toBeFalse(),)
                    test("has null",      () => expect(newInstance3Alt().hasNull,).toBeFalse(),)
                    test("has duplicate", () => expect(newInstance3Alt().hasDuplicate,).toBeFalse(),)
                    test("has finished",  () => expect(newInstance3().hasFinished,).toBeFalse(),)
                },)
                describe("after 1st & 2nd get", () => {
                    const newInstance3 = () => retrieve1stAnd2nd(newInstance2(),)
                    const newInstance3Alt = () => retrieve1stAnd2nd(newInstance2Alt(),)

                    test("size",          () => expect(newInstance3().size,).toBe(3,),)
                    test("is empty",      () => expect(newInstance3().isEmpty,).toBeFalse(),)
                    test("has null",      () => expect(newInstance3Alt().hasNull,).toBeFalse(),)
                    test("has duplicate", () => expect(newInstance3Alt().hasDuplicate,).toBeFalse(),)
                    test("has finished",  () => expect(newInstance3().hasFinished,).toBeFalse(),)
                },)
                describe("after 1st & 3rd get", () => {
                    const newInstance3 = () => retrieve1stAnd3rd(newInstance2(),)
                    const newInstance3Alt = () => retrieve1stAnd3rd(newInstance2Alt(),)

                    test("size",          () => expect(newInstance3().size,).toBe(3,),)
                    test("is empty",      () => expect(newInstance3().isEmpty,).toBeFalse(),)
                    test("has null",      () => expect(newInstance3Alt().hasNull,).toBeFalse(),)
                    test("has duplicate", () => expect(newInstance3Alt().hasDuplicate,).toBeFalse(),)
                    test("has finished",  () => expect(newInstance3().hasFinished,).toBeFalse(),)
                },)
                describe("after 2nd & 3rd get", () => {
                    const newInstance3 = () => retrieve2ndAnd3rd(newInstance2(),)
                    const newInstance3Alt = () => retrieve2ndAnd3rd(newInstance2Alt(),)

                    test("size",          () => expect(newInstance3().size,).toBe(3,),)
                    test("is empty",      () => expect(newInstance3().isEmpty,).toBeFalse(),)
                    test("has null",      () => expect(newInstance3Alt().hasNull,).toBeFalse(),)
                    test("has duplicate", () => expect(newInstance3Alt().hasDuplicate,).toBeFalse(),)
                    test("has finished",  () => expect(newInstance3().hasFinished,).toBeFalse(),)
                },)
                describe("after 1st, 2nd & 3rd get", () => {
                    const newInstance3 = () => retrieve1stAnd2ndAnd3rd(newInstance2(),)
                    const newInstance3Alt = () => retrieve1stAnd2ndAnd3rd(newInstance2Alt(),)

                    test("size",          () => expect(newInstance3().size,).toBe(3,),)
                    test("is empty",      () => expect(newInstance3().isEmpty,).toBeFalse(),)
                    test("has null",      () => expect(newInstance3Alt().hasNull,).toBeFalse(),)
                    test("has duplicate", () => expect(newInstance3Alt().hasDuplicate,).toBeFalse(),)
                    test("has finished",  () => expect(newInstance3().hasFinished,).toBeTrue(),)
                },)
            },)
        },)
        describe("array of 1", () => {
            const newInstance = () => retrieve1st(newArrayOf1Handler(arrayOf1, new CollectionHolderHoldingNothing(),),)

            test("size",          () => expect(newInstance().size,).toBe(1,),)
            test("is empty",      () => expect(newInstance().isEmpty,).toBeFalse(),)
            test("has null",      () => expect(newInstance().hasNull,).toBeFalse(),)
            test("has duplicate", () => expect(newInstance().hasDuplicate,).toBeFalse(),)
            test("has finished",  () => expect(newInstance().hasFinished,).toBeTrue(),)
        },)
        describe("array of 2", () => {
            const newInstance = () => newArrayOf2Handler(arrayOf2, new CollectionHolderHoldingNothing(),)

            describe("after 1st get", () => {
                const newInstance2 = () => retrieve1st(newInstance(),)

                test("size",          () => expect(newInstance2().size,).toBe(2,),)
                test("is empty",      () => expect(newInstance2().isEmpty,).toBeFalse(),)
                test("has null",      () => expect(newInstance2().hasNull,).toBeFalse(),)
                test("has duplicate", () => expect(newInstance2().hasDuplicate,).toBeFalse(),)
                test("has finished",  () => expect(newInstance2().hasFinished,).toBeFalse(),)
            },)
            describe("after 2nd get", () => {
                const newInstance2 = () => retrieve2nd(newInstance(),)

                test("size",          () => expect(newInstance2().size,).toBe(2,),)
                test("is empty",      () => expect(newInstance2().isEmpty,).toBeFalse(),)
                test("has null",      () => expect(newInstance2().hasNull,).toBeFalse(),)
                test("has duplicate", () => expect(newInstance2().hasDuplicate,).toBeFalse(),)
                test("has finished",  () => expect(newInstance2().hasFinished,).toBeFalse(),)
            },)
            describe("after 1st & 2nd get", () => {
                const newInstance2 = () => retrieve1stAnd2nd(newInstance(),)

                test("size",          () => expect(newInstance2().size,).toBe(2,),)
                test("is empty",      () => expect(newInstance2().isEmpty,).toBeFalse(),)
                test("has null",      () => expect(newInstance2().hasNull,).toBeFalse(),)
                test("has duplicate", () => expect(newInstance2().hasDuplicate,).toBeFalse(),)
                test("has finished",  () => expect(newInstance2().hasFinished,).toBeTrue(),)
            },)
        },)
        describe.skip("set", () => {
            describe("size of 1", () => {},)
            describe("size of 2", () => {},)
            describe("size of 3", () => {},)
        },)
        describe.skip("set of 1", () => {},)
        describe.skip("set of 2", () => {},)
        describe.skip("minimalist collection holder", () => {
            describe("size of 1", () => {},)
            describe("size of 2", () => {},)
            describe("size of 3", () => {},)
        },)
        describe.skip("minimalist collection holder of 1", () => {},)
        describe.skip("minimalist collection holder of 2", () => {},)
        describe.skip("collection holder", () => {
            describe("size of 1", () => {},)
            describe("size of 2", () => {},)
            describe("size of 3", () => {},)
        },)
        describe.skip("collection holder of 1", () => {},)
        describe.skip("collection holder of 2", () => {},)
        describe.skip("collection iterator", () => {
            describe("size of 1", () => {},)
            describe("size of 2", () => {},)
            describe("size of 3", () => {},)
        },)
        describe.skip("collection iterator of 1", () => {},)
        describe.skip("collection iterator of 2", () => {},)
        describe.skip("iterable", () => {
            describe("size of 1", () => {},)
            describe("size of 2", () => {},)
            describe("size of 3", () => {},)
        },)
        describe.skip("iterable with size", () => {
            describe("size of 1", () => {},)
            describe("size of 2", () => {},)
            describe("size of 3", () => {},)
        },)
        describe.skip("iterable with size of 1", () => {},)
        describe.skip("iterable with size of 2", () => {},)
    },)

    describe("indexes being present", () => {
        describe("array", () => {
            const newInstance = <const T, >(array: readonly T[], action: ActionOnHandler<CollectionHandlerByArray<T>>,) => retrieveCollection<T>(it => action(newArrayHandler<T>(array, it,),),)

            describe("size of 1", () => {
                const newInstance2 = (action: ActionOnHandler<CollectionHandlerByArray>,) => newInstance(arrayOf1, action,)

                test("size",          () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance2(it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance2(it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf1ToBePresent(newInstance2(it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance2(it => it.hasDuplicate,),),)
                test("has finished",  () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance2(it => it.hasFinished,),),)
            },)
            describe("size of 2", () => {
                const newInstance2 = (action: ActionOnHandler<CollectionHandlerByArray>,) => newInstance(arrayOf2, action,)

                test("size",          () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance2(it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance2(it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf2ToBePresent(newInstance2(it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf2ToBePresent(newInstance2(it => it.hasDuplicate,),),)
                test("has finished",  () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance2(it => it.hasFinished,),),)
            },)
            describe("size of 3", () => {
                const newInstance2 = (action: ActionOnHandler<CollectionHandlerByArray>,) => newInstance(arrayOf3, action,)

                test("size",          () => expectIndexesInCollectionOf3ToBeNotPresent(newInstance2(it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf3ToBeNotPresent(newInstance2(it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf3ToBePresent(newInstance2(it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf3ToBePresent(newInstance2(it => it.hasDuplicate,),),)
                test("has finished",  () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance2(it => it.hasFinished,),),)
            },)
        },)
        describe("array of 1", () => {
            const newInstance = (action: ActionOnHandler<CollectionHandlerByArrayOf1>,) => retrieveCollection(it => action(newArrayOf1Handler(arrayOf1, it,),),)

            test("size",          () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.size,),),)
            test("is empty",      () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.isEmpty,),),)
            test("has null",      () => expectIndexesInCollectionOf1ToBePresent(newInstance(it => it.hasNull,),),)
            test("has duplicate", () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.hasDuplicate,),),)
            test("has duplicate", () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.hasFinished,),),)
        },)
        describe("array of 2", () => {
            const newInstance = (action: ActionOnHandler<CollectionHandlerByArrayOf2>,) => retrieveCollection(it => action(newArrayOf2Handler(arrayOf2, it,),),)

            test("size",          () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.size,),),)
            test("is empty",      () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.isEmpty,),),)
            test("has null",      () => expectIndexesInCollectionOf2ToBePresent(newInstance(it => it.hasNull,),),)
            test("has duplicate", () => expectIndexesInCollectionOf2ToBePresent(newInstance(it => it.hasDuplicate,),),)
            test("has duplicate", () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.hasFinished,),),)
        },)
        describe("set", () => {
            const newInstance = <const T, >(array: readonly T[], action: ActionOnHandler<CollectionHandlerBySet<T>>,) => retrieveCollection<T>(it => action(newSetHandler<T>(array, it,),),)

            describe("size of 1", () => {
                test("size",          () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(arrayOf1, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(arrayOf1, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf1ToBePresent(newInstance(arrayOf1, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(arrayOf1, it => it.hasDuplicate,),),)
                test.skip("has finished",  () => {
                    //TODO add tests
                },)
            },)
            describe("size of 2", () => {
                test("size",          () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(arrayOf2, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(arrayOf2, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf2ToBePresent(newInstance(arrayOf2, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(arrayOf2, it => it.hasDuplicate,),),)
                test.skip("has finished",  () => {
                    //TODO add tests
                },)
            },)
            describe("size of 3", () => {
                test("size",          () => expectIndexesInCollectionOf3ToBeNotPresent(newInstance(arrayOf3, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf3ToBeNotPresent(newInstance(arrayOf3, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf3ToBePresent(newInstance(arrayOf3, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf3ToBeNotPresent(newInstance(arrayOf3, it => it.hasDuplicate,),),)
                test.skip("has finished",  () => {
                    //TODO add tests
                },)
            },)
        },)
        describe("set of 1", () => {
            const newInstance = (action: ActionOnHandler<CollectionHandlerBySetOf1>,) => retrieveCollection(it => action(newSetOf1Handler(arrayOf1, it,),),)

            test("size",          () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.size,),),)
            test("is empty",      () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.isEmpty,),),)
            test("has null",      () => expectIndexesInCollectionOf1ToBePresent(newInstance(it => it.hasNull,),),)
            test("has duplicate", () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.hasDuplicate,),),)
            test.skip("has finished",  () => {
                //TODO add tests
            },)
        },)
        describe("set of 2", () => {
            const newInstance = (action: ActionOnHandler<CollectionHandlerBySetOf2>,) => retrieveCollection(it => action(newSetOf2Handler(arrayOf2, it,),),)

            test("size",          () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.size,),),)
            test("is empty",      () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.isEmpty,),),)
            test("has null",      () => expectIndexesInCollectionOf2ToBePresent(newInstance(it => it.hasNull,),),)
            test("has duplicate", () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.hasDuplicate,),),)
            test.skip("has finished",  () => {
                //TODO add tests
            },)
        },)
        describe("minimalist collection holder", () => {
            const newInstance = <const T, >(array: readonly T[], action: ActionOnHandler<CollectionHandlerByMinimalistCollectionHolder<T>>,) => retrieveCollection<T>(it => action(newMinimalistCollectionHandler<T>(array, it,),),)

            describe("size of 1", () => {
                test("size",          () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(arrayOf1, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(arrayOf1, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf1ToBePresent(newInstance(arrayOf1, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf1ToBePresent(newInstance(arrayOf1, it => it.hasDuplicate,),),)
                test.skip("has finished",  () => {
                    //TODO add tests
                },)
            },)
            describe("size of 2", () => {
                test("size",          () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(arrayOf2, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(arrayOf2, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf2ToBePresent(newInstance(arrayOf2, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf2ToBePresent(newInstance(arrayOf2, it => it.hasDuplicate,),),)
                test.skip("has finished",  () => {
                    //TODO add tests
                },)
            },)
            describe("size of 3", () => {
                test("size",          () => expectIndexesInCollectionOf3ToBeNotPresent(newInstance(arrayOf3, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf3ToBeNotPresent(newInstance(arrayOf3, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf3ToBePresent(newInstance(arrayOf3, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf3ToBePresent(newInstance(arrayOf3, it => it.hasDuplicate,),),)
                test.skip("has finished",  () => {
                    //TODO add tests
                },)
            },)
        },)
        describe("minimalist collection holder of 1", () => {
            const newInstance = (action: ActionOnHandler<CollectionHandlerByMinimalistCollectionHolderOf1>,) => retrieveCollection(it => action(newMinimalistCollectionOf1Handler(arrayOf1, it,),),)

            test("size",          () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.size,),),)
            test("is empty",      () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.isEmpty,),),)
            test("has null",      () => expectIndexesInCollectionOf1ToBePresent(newInstance(it => it.hasNull,),),)
            test("has duplicate", () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.hasDuplicate,),),)
            test.skip("has finished",  () => {
                //TODO add tests
            },)
        },)
        describe("minimalist collection holder of 2", () => {
            const newInstance = (action: ActionOnHandler<CollectionHandlerByMinimalistCollectionHolderOf2>,) => retrieveCollection(it => action(newMinimalistCollectionOf2Handler(arrayOf2, it,),),)

            test("size",          () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.size,),),)
            test("is empty",      () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.isEmpty,),),)
            test("has null",      () => expectIndexesInCollectionOf2ToBePresent(newInstance(it => it.hasNull,),),)
            test("has duplicate", () => expectIndexesInCollectionOf2ToBePresent(newInstance(it => it.hasDuplicate,),),)
            test.skip("has finished",  () => {
                //TODO add tests
            },)
        },)
        describe("collection holder", () => {
            const newInstance = <const T, >(array: readonly T[], action: ActionOnHandler<CollectionHandlerByCollectionHolder<T>>,) => retrieveCollection<T>(it => action(newCollectionHandler<T>(array, it,),),)

            describe("size of 1", () => {
                test("size",          () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(arrayOf1, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(arrayOf1, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(arrayOf1, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(arrayOf1, it => it.hasDuplicate,),),)
                test.skip("has finished",  () => {
                    //TODO add tests
                },)
            },)
            describe("size of 2", () => {
                test("size",          () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(arrayOf2, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(arrayOf2, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(arrayOf2, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(arrayOf2, it => it.hasDuplicate,),),)
                test.skip("has finished",  () => {
                    //TODO add tests
                },)
            },)
            describe("size of 3", () => {
                test("size",          () => expectIndexesInCollectionOf3ToBeNotPresent(newInstance(arrayOf3, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf3ToBeNotPresent(newInstance(arrayOf3, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf3ToBeNotPresent(newInstance(arrayOf3, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf3ToBeNotPresent(newInstance(arrayOf3, it => it.hasDuplicate,),),)
                test.skip("has finished",  () => {
                    //TODO add tests
                },)
            },)
        },)
        describe("collection holder of 1", () => {
            const newInstance = (action: ActionOnHandler<CollectionHandlerByCollectionHolderOf1>,) => retrieveCollection(it => action(newCollectionOf1Handler(arrayOf1, it,),),)

            test("size",          () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.size,),),)
            test("is empty",      () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.isEmpty,),),)
            test("has null",      () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.hasNull,),),)
            test("has duplicate", () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.hasDuplicate,),),)
            test.skip("has finished",  () => {
                //TODO add tests
            },)
        },)
        describe("collection holder of 2", () => {
            const newInstance = (action: ActionOnHandler<CollectionHandlerByCollectionHolderOf2>,) => retrieveCollection(it => action(newCollectionOf2Handler(arrayOf2, it,),),)

            test("size",          () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.size,),),)
            test("is empty",      () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.isEmpty,),),)
            test("has null",      () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.hasNull,),),)
            test("has duplicate", () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.hasDuplicate,),),)
            test.skip("has finished",  () => {
                //TODO add tests
            },)
        },)
        describe("collection iterator", () => {
            const newInstance = <const T, >(array: readonly T[], action: ActionOnHandler<CollectionHandlerByCollectionIterator<T>>,) => retrieveCollection<T>(it => action(newCollectionIteratorHandler<T>(array, it,),),)

            describe("size of 1", () => {
                test("size",          () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(arrayOf1, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(arrayOf1, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf1ToBePresent(newInstance(arrayOf1, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf1ToBePresent(newInstance(arrayOf1, it => it.hasDuplicate,),),)
                test.skip("has finished",  () => {
                    //TODO add tests
                },)
            },)
            describe("size of 2", () => {
                test("size",          () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(arrayOf2, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(arrayOf2, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf2ToBePresent(newInstance(arrayOf2, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf2ToBePresent(newInstance(arrayOf2, it => it.hasDuplicate,),),)
                test.skip("has finished",  () => {
                    //TODO add tests
                },)
            },)
            describe("size of 3", () => {
                test("size",          () => expectIndexesInCollectionOf3ToBeNotPresent(newInstance(arrayOf3, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf3ToBeNotPresent(newInstance(arrayOf3, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf3ToBePresent(newInstance(arrayOf3, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf3ToBePresent(newInstance(arrayOf3, it => it.hasDuplicate,),),)
                test.skip("has finished",  () => {
                    //TODO add tests
                },)
            },)
        },)
        describe("collection iterator of 1", () => {
            const newInstance = (action: ActionOnHandler<CollectionHandlerByCollectionIteratorOf1>,) => retrieveCollection(it => action(newCollectionIteratorOf1Handler(arrayOf1, it,),),)

            test("size",          () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.size,),),)
            test("is empty",      () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.isEmpty,),),)
            test("has null",      () => expectIndexesInCollectionOf1ToBePresent(newInstance(it => it.hasNull,),),)
            test("has duplicate", () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.hasDuplicate,),),)
            test.skip("has finished",  () => {
                //TODO add tests
            },)
        },)
        describe("collection iterator of 2", () => {
            const newInstance = (action: ActionOnHandler<CollectionHandlerByCollectionIteratorOf2>,) => retrieveCollection(it => action(newCollectionIteratorOf2Handler(arrayOf2, it,),),)

            test("size",          () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.size,),),)
            test("is empty",      () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.isEmpty,),),)
            test("has null",      () => expectIndexesInCollectionOf2ToBePresent(newInstance(it => it.hasNull,),),)
            test("has duplicate", () => expectIndexesInCollectionOf2ToBePresent(newInstance(it => it.hasDuplicate,),),)
            test.skip("has finished",  () => {
                //TODO add tests
            },)
        },)
        describe("iterable", () => {
            const newInstance = <const T, >(array: readonly T[], action: ActionOnHandler<CollectionHandlerByIterable<T>>,) => retrieveCollection<T>(it => action(newIterableHandler<T>(array, it,),),)

            describe("size of 1", () => {
                test("size",          () => expectIndexesInCollectionOf1ToBePresent(newInstance(arrayOf1, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf1ToBePresent(newInstance(arrayOf1, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf1ToBePresent(newInstance(arrayOf1, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf1ToBePresent(newInstance(arrayOf1, it => it.hasDuplicate,),),)
                test("has finished",  () => expectIndexesInCollectionOf1ToBePresent(newInstance(arrayOf1, it => it.hasFinished,),),)
            },)
            describe("size of 2", () => {
                test("size",          () => expectIndexesInCollectionOf2ToBePresent(newInstance(arrayOf2, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf2ToOnlyHave1stPresent(newInstance(arrayOf2, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf2ToBePresent(newInstance(arrayOf2, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf2ToBePresent(newInstance(arrayOf2, it => it.hasDuplicate,),),)
                test("has finished",  () => expectIndexesInCollectionOf2ToOnlyHave1stPresent(newInstance(arrayOf2, it => it.hasFinished,),),)
            },)
            describe("size of 3", () => {
                test("size",          () => expectIndexesInCollectionOf3ToBePresent(newInstance(arrayOf3, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf3ToOnlyHave1stPresent(newInstance(arrayOf3, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf3ToBePresent(newInstance(arrayOf3, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf3ToBePresent(newInstance(arrayOf3, it => it.hasDuplicate,),),)
                test("has finished",  () => expectIndexesInCollectionOf3ToOnlyHave1stPresent(newInstance(arrayOf3, it => it.hasFinished,),),)
            },)
        },)
        describe("iterable with size", () => {
            const newInstance = <const T, >(array: readonly T[], action: ActionOnHandler<CollectionHandlerByIterableWithSize<T>>,) => retrieveCollection<T>(it => action(newIterableWithSizeHandler<T>(array, it,),),)

            describe("size of 1", () => {
                test("size",          () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(arrayOf1, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(arrayOf1, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf1ToBePresent(newInstance(arrayOf1, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(arrayOf1, it => it.hasDuplicate,),),)
                test("has finished",  () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(arrayOf1, it => it.hasFinished,),),)
            },)
            describe("size of 2", () => {
                test("size",          () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(arrayOf2, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(arrayOf2, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf2ToBePresent(newInstance(arrayOf2, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf2ToBePresent(newInstance(arrayOf2, it => it.hasDuplicate,),),)
                test("has finished",  () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(arrayOf2, it => it.hasFinished,),),)
            },)
            describe("size of 3", () => {
                test("size",          () => expectIndexesInCollectionOf3ToBeNotPresent(newInstance(arrayOf3, it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf3ToBeNotPresent(newInstance(arrayOf3, it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf3ToBePresent(newInstance(arrayOf3, it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf3ToBePresent(newInstance(arrayOf3, it => it.hasDuplicate,),),)
                test("has finished",  () => expectIndexesInCollectionOf3ToBeNotPresent(newInstance(arrayOf3, it => it.hasFinished,),),)
            },)
        },)
        describe("iterable with size of 1", () => {
            const newInstance = (action: ActionOnHandler<CollectionHandlerByIterableWithSizeOf1>,) => retrieveCollection(it => action(newIterableWithSizeOf1Handler(arrayOf1, it,),),)

            test("size",          () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.size,),),)
            test("is empty",      () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.isEmpty,),),)
            test("has null",      () => expectIndexesInCollectionOf1ToBePresent(newInstance(it => it.hasNull,),),)
            test("has duplicate", () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.hasDuplicate,),),)
            test("has finished",  () => expectIndexesInCollectionOf1ToBeNotPresent(newInstance(it => it.hasFinished,),),)
        },)
        describe("iterable with size of 2", () => {
            const newInstance = (action: ActionOnHandler<CollectionHandlerByIterableWithSizeOf2>,) => retrieveCollection(it => action(newIterableWithSizeOf2Handler(arrayOf2, it,),),)

            test("size",          () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.size,),),)
            test("is empty",      () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.isEmpty,),),)
            test("has null",      () => expectIndexesInCollectionOf2ToBePresent(newInstance(it => it.hasNull,),),)
            test("has duplicate", () => expectIndexesInCollectionOf2ToBePresent(newInstance(it => it.hasDuplicate,),),)
            test("has finished",  () => expectIndexesInCollectionOf2ToBeNotPresent(newInstance(it => it.hasFinished,),),)
        },)
    },)

    describe("indexes being present after call of get", () => {
        describe("array", () => {
            const newInstance = <const T, >(array: readonly T[], action: ActionOnHandler<CollectionHandlerByArray<T>>,) => retrieveCollection<T>(it => action(newArrayHandler<T>(array, it,),),)
            const newInstanceAlt = <const T, >(array: readonly T[], action: ActionOnHandler<CollectionHandlerByArray<T>>,) => retrieveCollectionAlt<T>(array, it => action(newArrayHandler<T>(array, it,),),)

            describe("size of 1", () => {
                const expectInstance = (action: ActionOnHandler<CollectionHandlerByArray>,) => expectIndexesInCollectionOf1ToBePresent(newInstance(arrayOf1, it => action(retrieve1st(it,),),),)
                const expectInstanceAlt = (action: ActionOnHandler<CollectionHandlerByArray>,) => expectIndexesInCollectionOf1ToBePresent(newInstanceAlt(arrayOf1, it => action(retrieve1st(it,),),),)

                test("size",          () => expectInstance(it => it.size,),)
                test("is empty",      () => expectInstance(it => it.isEmpty,),)
                test("has null",      () => expectInstanceAlt(it => it.hasNull,),)
                test("has duplicate", () => expectInstance(it => it.hasDuplicate,),)
                test("has finished",  () => expectInstance(it => it.hasFinished,),)
            },)
            describe("size of 2", () => {
                const newInstance2 = (action: ActionOnHandler<CollectionHandlerByArray>,) => newInstance(arrayOf2, action,)
                const newInstance2Alt = (action: ActionOnHandler<CollectionHandlerByArray>,) => newInstanceAlt(arrayOf2, action,)

                describe("after 1st get", () => {
                    const newInstance3 = (action: ActionOnHandler<CollectionHandlerByArray>,) => newInstance2(it => action(retrieve1st(it,),),)

                    test("size",          () => expectIndexesInCollectionOf2ToOnlyHave1stPresent(newInstance3(it => it.size,),),)
                    test("is empty",      () => expectIndexesInCollectionOf2ToOnlyHave1stPresent(newInstance3(it => it.isEmpty,),),)
                    test("has null",      () => expectIndexesInCollectionOf2ToBePresent(newInstance3(it => it.hasNull,),),)
                    test("has duplicate", () => expectIndexesInCollectionOf2ToBePresent(newInstance3(it => it.hasDuplicate,),),)
                    test("has finished",  () => expectIndexesInCollectionOf2ToOnlyHave1stPresent(newInstance3(it => it.hasFinished,),),)
                },)
                describe("after 2nd get", () => {
                    const newInstance3 = (action: ActionOnHandler<CollectionHandlerByArray>,) => newInstance2(it => action(retrieve2nd(it,),),)

                    test("size",          () => expectIndexesInCollectionOf2ToOnlyHave2ndPresent(newInstance3(it => it.size,),),)
                    test("is empty",      () => expectIndexesInCollectionOf2ToOnlyHave2ndPresent(newInstance3(it => it.isEmpty,),),)
                    test("has null",      () => expectIndexesInCollectionOf2ToBePresent(newInstance3(it => it.hasNull,),),)
                    test("has duplicate", () => expectIndexesInCollectionOf2ToBePresent(newInstance3(it => it.hasDuplicate,),),)
                    test("has finished",  () => expectIndexesInCollectionOf2ToOnlyHave2ndPresent(newInstance3(it => it.hasFinished,),),)
                },)
                describe("after 1st & 2nd get", () => {
                    const expectInstance = (action: ActionOnHandler<CollectionHandlerByArray>,) => expectIndexesInCollectionOf2ToBePresent(newInstance2(it => action(retrieve1stAnd2nd(it,),),),)
                    const expectInstanceAlt = (action: ActionOnHandler<CollectionHandlerByArray>,) => expectIndexesInCollectionOf2ToBePresent(newInstance2Alt(it => action(retrieve1stAnd2nd(it,),),),)

                    test("size",          () => expectInstance(it => it.size,),)
                    test("is empty",      () => expectInstance(it => it.isEmpty,),)
                    test("has null",      () => expectInstanceAlt(it => it.hasNull,),)
                    test("has duplicate", () => expectInstanceAlt(it => it.hasDuplicate,),)
                    test("has finished",  () => expectInstance(it => it.hasFinished,),)
                },)
            },)
            describe("size of 3", () => {
                const newInstance2 = (action: ActionOnHandler<CollectionHandlerByArray>,) => newInstance(arrayOf3, action,)
                const newInstance2Alt = (action: ActionOnHandler<CollectionHandlerByArray>,) => newInstanceAlt(arrayOf3, action,)

                describe("after 1st get", () => {
                    const newInstance3 = (action: ActionOnHandler<CollectionHandlerByArray>,) => newInstance2(it => action(retrieve1st(it,),),)

                    test("size",          () => expectIndexesInCollectionOf3ToOnlyHave1stPresent(newInstance3(it => it.size,),),)
                    test("is empty",      () => expectIndexesInCollectionOf3ToOnlyHave1stPresent(newInstance3(it => it.isEmpty,),),)
                    test("has null",      () => expectIndexesInCollectionOf3ToBePresent(newInstance3(it => it.hasNull,),),)
                    test("has duplicate", () => expectIndexesInCollectionOf3ToBePresent(newInstance3(it => it.hasDuplicate,),),)
                    test("has finished",  () => expectIndexesInCollectionOf3ToOnlyHave1stPresent(newInstance3(it => it.hasFinished,),),)
                },)
                describe("after 2nd get", () => {
                    const newInstance3 = (action: ActionOnHandler<CollectionHandlerByArray>,) => newInstance2(it => action(retrieve2nd(it,),),)

                    test("size",          () => expectIndexesInCollectionOf3ToOnlyHave2ndPresent(newInstance3(it => it.size,),),)
                    test("is empty",      () => expectIndexesInCollectionOf3ToOnlyHave2ndPresent(newInstance3(it => it.isEmpty,),),)
                    test("has null",      () => expectIndexesInCollectionOf3ToBePresent(newInstance3(it => it.hasNull,),),)
                    test("has duplicate", () => expectIndexesInCollectionOf3ToBePresent(newInstance3(it => it.hasDuplicate,),),)
                    test("has finished",  () => expectIndexesInCollectionOf3ToOnlyHave2ndPresent(newInstance3(it => it.hasFinished,),),)
                },)
                describe("after 3rd get", () => {
                    const newInstance3 = (action: ActionOnHandler<CollectionHandlerByArray>,) => newInstance2(it => action(retrieve3rd(it,),),)

                    test("size",          () => expectIndexesInCollectionOf3ToOnlyHave3rdPresent(newInstance3(it => it.size,),),)
                    test("is empty",      () => expectIndexesInCollectionOf3ToOnlyHave3rdPresent(newInstance3(it => it.isEmpty,),),)
                    test("has null",      () => expectIndexesInCollectionOf3ToBePresent(newInstance3(it => it.hasNull,),),)
                    test("has duplicate", () => expectIndexesInCollectionOf3ToBePresent(newInstance3(it => it.hasDuplicate,),),)
                    test("has finished",  () => expectIndexesInCollectionOf3ToOnlyHave3rdPresent(newInstance3(it => it.hasFinished,),),)
                },)
                describe("after 1st & 2nd get", () => {
                    const newInstance3 = (action: ActionOnHandler<CollectionHandlerByArray>,) => newInstance2(it => action(retrieve1stAnd2nd(it,),),)

                    test("size",          () => expectIndexesInCollectionOf3ToNotHave3rdPresent(newInstance3(it => it.size,),),)
                    test("is empty",      () => expectIndexesInCollectionOf3ToNotHave3rdPresent(newInstance3(it => it.isEmpty,),),)
                    test("has null",      () => expectIndexesInCollectionOf3ToBePresent(newInstance3(it => it.hasNull,),),)
                    test("has duplicate", () => expectIndexesInCollectionOf3ToBePresent(newInstance3(it => it.hasDuplicate,),),)
                    test("has finished",  () => expectIndexesInCollectionOf3ToNotHave3rdPresent(newInstance3(it => it.hasFinished,),),)
                },)
                describe("after 1st & 3rd get", () => {
                    const newInstance3 = (action: ActionOnHandler<CollectionHandlerByArray>,) => newInstance2(it => action(retrieve1stAnd3rd(it,),),)

                    test("size",          () => expectIndexesInCollectionOf3ToNotHave2ndPresent(newInstance3(it => it.size,),),)
                    test("is empty",      () => expectIndexesInCollectionOf3ToNotHave2ndPresent(newInstance3(it => it.isEmpty,),),)
                    test("has null",      () => expectIndexesInCollectionOf3ToBePresent(newInstance3(it => it.hasNull,),),)
                    test("has duplicate", () => expectIndexesInCollectionOf3ToBePresent(newInstance3(it => it.hasDuplicate,),),)
                    test("has finished",  () => expectIndexesInCollectionOf3ToNotHave2ndPresent(newInstance3(it => it.hasFinished,),),)
                },)
                describe("after 1st & 2nd & 3rd get", () => {
                    const expectInstance = (action: ActionOnHandler<CollectionHandlerByArray>,) => expectIndexesInCollectionOf3ToBePresent(newInstance2(it => action(retrieve1stAnd2ndAnd3rd(it,),),),)
                    const expectInstanceAlt = (action: ActionOnHandler<CollectionHandlerByArray>,) => expectIndexesInCollectionOf3ToBePresent(newInstance2Alt(it => action(retrieve1stAnd2ndAnd3rd(it,),),),)

                    test("size",          () => expectInstance(it => it.size,),)
                    test("is empty",      () => expectInstance(it => it.isEmpty,),)
                    test("has null",      () => expectInstanceAlt(it => it.hasNull,),)
                    test("has duplicate", () => expectInstanceAlt(it => it.hasDuplicate,),)
                    test("has finished",  () => expectInstance(it => it.hasFinished,),)
                },)
                describe("after 2nd & 3rd get", () => {
                    const newInstance3 = (action: ActionOnHandler<CollectionHandlerByArray>,) => newInstance2(it => action(retrieve2ndAnd3rd(it,),),)

                    test("size",          () => expectIndexesInCollectionOf3ToNotHave1stPresent(newInstance3(it => it.size,),),)
                    test("is empty",      () => expectIndexesInCollectionOf3ToNotHave1stPresent(newInstance3(it => it.isEmpty,),),)
                    test("has null",      () => expectIndexesInCollectionOf3ToBePresent(newInstance3(it => it.hasNull,),),)
                    test("has duplicate", () => expectIndexesInCollectionOf3ToBePresent(newInstance3(it => it.hasDuplicate,),),)
                    test("has finished",  () => expectIndexesInCollectionOf3ToNotHave1stPresent(newInstance3(it => it.hasFinished,),),)
                },)
            },)
        },)
        describe("array of 1", () => {
            const expectInstance = (action: ActionOnHandler<CollectionHandlerByArrayOf1>,) => expectIndexesInCollectionOf1ToBePresent(retrieveCollection(it => action(retrieve1st(newArrayOf1Handler(arrayOf1, it,),),),),)

            test("size",          () => expectInstance(it => it.size,),)
            test("is empty",      () => expectInstance(it => it.isEmpty,),)
            test("has null",      () => expectInstance(it => it.hasNull,),)
            test("has duplicate", () => expectInstance(it => it.hasDuplicate,),)
            test("has finished",  () => expectInstance(it => it.hasFinished,),)
        },)
        describe("array of 2", () => {
            const newInstance = (action: ActionOnHandler<CollectionHandlerByArrayOf2>,) => retrieveCollection(it => action(newArrayOf2Handler(arrayOf2, it,),),)

            describe("after 1st get", () => {
                const newInstance2 = (action: ActionOnHandler<CollectionHandlerByArrayOf2>,) => newInstance(it => action(retrieve1st(it,),),)

                test("size",          () => expectIndexesInCollectionOf2ToOnlyHave1stPresent(newInstance2(it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf2ToOnlyHave1stPresent(newInstance2(it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf2ToBePresent(newInstance2(it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf2ToBePresent(newInstance2(it => it.hasDuplicate,),),)
                test("has finished",  () => expectIndexesInCollectionOf2ToOnlyHave1stPresent(newInstance2(it => it.hasFinished,),),)
            },)
            describe("after 2nd get", () => {
                const newInstance2 = (action: ActionOnHandler<CollectionHandlerByArrayOf2>,) => newInstance(it => action(retrieve2nd(it,),),)

                test("size",          () => expectIndexesInCollectionOf2ToOnlyHave2ndPresent(newInstance2(it => it.size,),),)
                test("is empty",      () => expectIndexesInCollectionOf2ToOnlyHave2ndPresent(newInstance2(it => it.isEmpty,),),)
                test("has null",      () => expectIndexesInCollectionOf2ToBePresent(newInstance2(it => it.hasNull,),),)
                test("has duplicate", () => expectIndexesInCollectionOf2ToBePresent(newInstance2(it => it.hasDuplicate,),),)
                test("has finished",  () => expectIndexesInCollectionOf2ToOnlyHave2ndPresent(newInstance2(it => it.hasFinished,),),)
            },)
            describe("after 1st & 2nd get", () => {
                const expectInstance = (action: ActionOnHandler<CollectionHandlerByArrayOf2>,) => expectIndexesInCollectionOf2ToBePresent(newInstance(it => action(retrieve1stAnd2nd(it,),),),)

                test("size",          () => expectInstance(it => it.size,),)
                test("is empty",      () => expectInstance(it => it.isEmpty,),)
                test("has null",      () => expectInstance(it => it.hasNull,),)
                test("has duplicate", () => expectInstance(it => it.hasDuplicate,),)
                test("has finished",  () => expectInstance(it => it.hasFinished,),)
            },)
        },)
        describe.skip("set", () => {
            describe("size of 1", () => {},)
            describe("size of 2", () => {},)
            describe("size of 3", () => {},)
        },)
        describe.skip("set of 1", () => {},)
        describe.skip("set of 2", () => {},)
        describe.skip("minimalist collection holder", () => {
            describe("size of 1", () => {},)
            describe("size of 2", () => {},)
            describe("size of 3", () => {},)
        },)
        describe.skip("minimalist collection holder of 1", () => {},)
        describe.skip("minimalist collection holder of 2", () => {},)
        describe.skip("collection holder", () => {
            describe("size of 1", () => {},)
            describe("size of 2", () => {},)
            describe("size of 3", () => {},)
        },)
        describe.skip("collection holder of 1", () => {},)
        describe.skip("collection holder of 2", () => {},)
        describe.skip("collection iterator", () => {
            describe("size of 1", () => {},)
            describe("size of 2", () => {},)
            describe("size of 3", () => {},)
        },)
        describe.skip("collection iterator of 1", () => {},)
        describe.skip("collection iterator of 2", () => {},)
        describe.skip("iterable", () => {
            describe("size of 1", () => {},)
            describe("size of 2", () => {},)
            describe("size of 3", () => {},)
        },)
        describe.skip("iterable with size", () => {
            describe("size of 1", () => {},)
            describe("size of 2", () => {},)
            describe("size of 3", () => {},)
        },)
        describe.skip("iterable with size of 1", () => {},)
        describe.skip("iterable with size of 2", () => {},)
    },)

},)

//#region -------------------- Retrieval methods --------------------

function retrieveCollection<const T, >(action: (collection: CollectionHolderHoldingNothing<T>,) => unknown,): CollectionHolderHoldingNothing<T> {
    const collection = new CollectionHolderHoldingNothing<T>()
    action(collection,)
    return collection
}

function retrieveCollectionAlt<const T, >(array: readonly T[], action: (collection: CollectionHolderFromArray<T>,) => unknown,): CollectionHolderFromArray<T> {
    const collection = new CollectionHolderFromArray<T>(array,)
    action(collection,)
    return collection
}

function retrieve1st<const HANDLER extends CollectionHandler, >(handler: HANDLER,): HANDLER {
    handler.get(0,)
    return handler
}

function retrieve1stAnd2nd<const HANDLER extends CollectionHandler, >(handler: HANDLER,): HANDLER {
    handler.get(0,)
    handler.get(1,)
    return handler
}

function retrieve1stAnd3rd<const HANDLER extends CollectionHandler, >(handler: HANDLER,): HANDLER {
    handler.get(0,)
    handler.get(2,)
    return handler
}

function retrieve1stAnd2ndAnd3rd<const HANDLER extends CollectionHandler, >(handler: HANDLER,): HANDLER {
    handler.get(0,)
    handler.get(1,)
    handler.get(2,)
    return handler
}

function retrieve2nd<const HANDLER extends CollectionHandler, >(handler: HANDLER,): HANDLER {
    handler.get(1,)
    return handler
}

function retrieve2ndAnd3rd<const HANDLER extends CollectionHandler, >(handler: HANDLER,): HANDLER {
    handler.get(1,)
    handler.get(2,)
    return handler
}

function retrieve3rd<const HANDLER extends CollectionHandler, >(handler: HANDLER,): HANDLER {
    handler.get(2,)
    return handler
}

// function retrieveAmountOfCall<const T, >(array: readonly T[], action: ActionOnHolder<T>,): number {
//     const collection = new CollectionHolderThatCountGetBeingCalled<T>(new GenericCollectionHolder(array,),)
//     action(collection,)
//     return collection.amountOfCall
// }

type ActionOnHandler<in HANDLER extends CollectionHandler, > = (handler: HANDLER,) => unknown
// type ActionOnHolder<in T, > = (collection: CollectionHolderThatCountGetBeingCalled<T>,) => unknown

//#endregion -------------------- Retrieval methods --------------------
