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

import {GenericCollectionHolder_HasAlias}                                                                                                                                                                                                                                            from "./instance/GenericCollectionHolder_HasAlias"
import {GenericCollectionHolder_HasAllAlias}                                                                                                                                                                                                                                         from "./instance/GenericCollectionHolder_HasAllAlias"
import {GenericCollectionHolder_HasDuplicateAlias}                                                                                                                                                                                                                                   from "./instance/GenericCollectionHolder_HasDuplicateAlias"
import {GenericCollectionHolder_HasNullAlias}                                                                                                                                                                                                                                        from "./instance/GenericCollectionHolder_HasNullAlias"
import {GenericCollectionHolder_HasOneAlias}                                                                                                                                                                                                                                         from "./instance/GenericCollectionHolder_HasOneAlias"
import {LazyGenericCollectionHolder_HasAlias}                                                                                                                                                                                                                                        from "./instance/LazyGenericCollectionHolder_HasAlias"
import {LazyGenericCollectionHolder_HasAllAlias}                                                                                                                                                                                                                                     from "./instance/LazyGenericCollectionHolder_HasAllAlias"
import {LazyGenericCollectionHolder_HasDuplicateAlias}                                                                                                                                                                                                                               from "./instance/LazyGenericCollectionHolder_HasDuplicateAlias"
import {LazyGenericCollectionHolder_HasNullAlias}                                                                                                                                                                                                                                    from "./instance/LazyGenericCollectionHolder_HasNullAlias"
import {LazyGenericCollectionHolder_HasOneAlias}                                                                                                                                                                                                                                     from "./instance/LazyGenericCollectionHolder_HasOneAlias"
import {EmptyCollectionHolderForTest}                                                                                                                                                                                                                                                from "./instance/EmptyCollectionHolderForTest"
import {A, A_NULL, A_NULL_B, A_NULL_NULL_UNDEFINED_B, A_NULL_UNDEFINED_B, A_NULL_UNDEFINED_UNDEFINED_B, A_UNDEFINED, A_UNDEFINED_B, AA, AABC, AB, AB_NULL, AB_UNDEFINED, ABAB, ABBC, ABCD, B, C, D, E, EF, EFGH, EMPTY, NULL, NULL_A, NULL_AB, UNDEFINED, UNDEFINED_A, UNDEFINED_AB} from "./value/arrays"
import {everyCollectionInstancesAndExtensionFunctionAsCollectionHolder, everyIterableInstances}                                                                                                                                                                                      from "./value/instances"

describe("CollectionHolderTest (has)", () => {

    describe("EmptyCollectionHolder", () => {
        test("has",         () => expect(new EmptyCollectionHolderForTest().has(),).toBeFalse(),)
        test("includes",    () => expect(new EmptyCollectionHolderForTest().includes(),).toBeFalse(),)
        test("contains",    () => expect(new EmptyCollectionHolderForTest().contains(),).toBeFalse(),)
        test("hasOne",      () => expect(new EmptyCollectionHolderForTest().hasOne(),).toBeFalse(),)
        test("includesOne", () => expect(new EmptyCollectionHolderForTest().includesOne(),).toBeFalse(),)
        test("containsOne", () => expect(new EmptyCollectionHolderForTest().containsOne(),).toBeFalse(),)

        describe.each(everyIterableInstances,)("hasAll: %s", ({value: it,},) => {
            test("empty",    () => expect(new EmptyCollectionHolderForTest().hasAll(it(EMPTY,),),).toBeTrue(),)
            test("1 field",  () => expect(new EmptyCollectionHolderForTest().hasAll(it(A,),),).toBeFalse(),)
            test("2 fields", () => expect(new EmptyCollectionHolderForTest().hasAll(it(AB,),),).toBeFalse(),)
            test("4 fields", () => expect(new EmptyCollectionHolderForTest().hasAll(it(ABCD,),),).toBeFalse(),)
        },)

        test("hasNull",           () => expect(new EmptyCollectionHolderForTest().hasNull,).toBeFalse(),)
        test("includesNull",      () => expect(new EmptyCollectionHolderForTest().includesNull,).toBeFalse(),)
        test("containsNull",      () => expect(new EmptyCollectionHolderForTest().containsNull,).toBeFalse(),)
        test("hasDuplicate",      () => expect(new EmptyCollectionHolderForTest().hasDuplicate,).toBeFalse(),)
        test("includesDuplicate", () => expect(new EmptyCollectionHolderForTest().includesDuplicate,).toBeFalse(),)
        test("containsDuplicate", () => expect(new EmptyCollectionHolderForTest().containsDuplicate,).toBeFalse(),)
    },)

    describe("aliases", () => {
        const singleValue = 'a'
        const singleValueInArray = ['a',] as const
        describe("GenericCollectionHolder", () => {
            test("includes",          () => expect(new GenericCollectionHolder_HasAlias().execute(it => it.includes(singleValue,),).amountOfCall,).toBe(1,),)
            test("includesOne",       () => expect(new GenericCollectionHolder_HasOneAlias().execute(it => it.includesOne(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("includesAll",       () => expect(new GenericCollectionHolder_HasAllAlias().execute(it => it.includesAll(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("includesNull",      () => expect(new GenericCollectionHolder_HasNullAlias().execute(it => it.includesNull,).amountOfCall,).toBe(1,),)
            test("includesDuplicate", () => expect(new GenericCollectionHolder_HasDuplicateAlias().execute(it => it.includesDuplicate,).amountOfCall,).toBe(1,),)
            test("contains",          () => expect(new GenericCollectionHolder_HasAlias().execute(it => it.contains(singleValue,),).amountOfCall,).toBe(1,),)
            test("containsOne",       () => expect(new GenericCollectionHolder_HasOneAlias().execute(it => it.containsOne(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("containsAll",       () => expect(new GenericCollectionHolder_HasAllAlias().execute(it => it.containsAll(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("containsNull",      () => expect(new GenericCollectionHolder_HasNullAlias().execute(it => it.containsNull,).amountOfCall,).toBe(1,),)
            test("containsDuplicate", () => expect(new GenericCollectionHolder_HasDuplicateAlias().execute(it => it.containsDuplicate,).amountOfCall,).toBe(1,),)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("includes",          () => expect(new LazyGenericCollectionHolder_HasAlias().execute(it => it.includes(singleValue,),).amountOfCall,).toBe(1,),)
            test("includesOne",       () => expect(new LazyGenericCollectionHolder_HasOneAlias().execute(it => it.includesOne(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("includesAll",       () => expect(new LazyGenericCollectionHolder_HasAllAlias().execute(it => it.includesAll(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("includesNull",      () => expect(new LazyGenericCollectionHolder_HasNullAlias().execute(it => it.includesNull,).amountOfCall,).toBe(1,),)
            test("includesDuplicate", () => expect(new LazyGenericCollectionHolder_HasDuplicateAlias().execute(it => it.includesDuplicate,).amountOfCall,).toBe(1,),)
            test("contains",          () => expect(new LazyGenericCollectionHolder_HasAlias().execute(it => it.contains(singleValue,),).amountOfCall,).toBe(1,),)
            test("containsOne",       () => expect(new LazyGenericCollectionHolder_HasOneAlias().execute(it => it.containsOne(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("containsAll",       () => expect(new LazyGenericCollectionHolder_HasAllAlias().execute(it => it.containsAll(singleValueInArray,),).amountOfCall,).toBe(1,),)
            test("containsNull",      () => expect(new LazyGenericCollectionHolder_HasNullAlias().execute(it => it.containsNull,).amountOfCall,).toBe(1,),)
            test("containsDuplicate", () => expect(new LazyGenericCollectionHolder_HasDuplicateAlias().execute(it => it.containsDuplicate,).amountOfCall,).toBe(1,),)
        },)
    },)

    describe.each(everyCollectionInstancesAndExtensionFunctionAsCollectionHolder,)("%s", ({value: {instance, isExtension,},},) => {
        if (!isExtension)
            describe("get() being called", () => {
                describe("has", () => {
                    test("empty",        () => expect(new instance<string>(EMPTY,).execute(it => it.has('a',),).amountOfCall,).toBe(0,),)
                    test("1 field (a)",  () => expect(new instance(A,).execute(it => it.has('a',),).amountOfCall,).toBe(1,),)
                    test("1 field (e)",  () => expect(new instance<string>(A,).execute(it => it.has('e',),).amountOfCall,).toBe(1,),)
                    test("2 fields (a)", () => expect(new instance(AB,).execute(it => it.has('a',),).amountOfCall,).toBe(1,),)
                    test("2 fields (e)", () => expect(new instance<string>(AB,).execute(it => it.has('e',),).amountOfCall,).toBe(2,),)
                    test("4 fields (a)", () => expect(new instance(ABCD,).execute(it => it.has('a',),).amountOfCall,).toBe(1,),)
                    test("4 fields (e)", () => expect(new instance<string>(ABCD,).execute(it => it.has('e',),).amountOfCall,).toBe(4,),)
                },)
                describe.each(everyIterableInstances,)("hasOne: “%s”", ({value: newIterable,},) => {
                    describe("empty", () => {
                        test("empty",     () => expect(new instance(EMPTY,).execute(it => it.hasOne(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance<string>(EMPTY,).execute(it => it.hasOne(newIterable(AB,),),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("empty",     () => expect(new instance(A,).execute(it => it.hasOne(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance<string>(A,).execute(it => it.hasOne(newIterable(AB,),),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("empty",     () => expect(new instance(AB,).execute(it => it.hasOne(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance(AB,).execute(it => it.hasOne(newIterable(AB,),),).amountOfCall,).toBe(1,),)
                    },)
                    describe("4 fields", () => {
                        test("empty",     () => expect(new instance(ABCD,).execute(it => it.hasOne(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance(ABCD,).execute(it => it.hasOne(newIterable(AB,),),).amountOfCall,).toBe(1,),)
                    },)
                },)
                describe.each(everyIterableInstances,)("hasAll: “%s”", ({value: newIterable,},) => {
                    describe("empty", () => {
                        test("empty",     () => expect(new instance(EMPTY,).execute(it => it.hasAll(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance<string>(EMPTY,).execute(it => it.hasAll(newIterable(AB,),),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("empty",     () => expect(new instance(A,).execute(it => it.hasAll(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance<string>(A,).execute(it => it.hasAll(newIterable(AB,),),).amountOfCall,).toBe(2,),)
                    },)
                    describe("2 fields", () => {
                        test("empty",     () => expect(new instance(AB,).execute(it => it.hasAll(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance(AB,).execute(it => it.hasAll(newIterable(AB,),),).amountOfCall,).toBe(3,),)
                    },)
                    describe("4 fields", () => {
                        test("empty",     () => expect(new instance(ABCD,).execute(it => it.hasAll(newIterable(EMPTY,),),).amountOfCall,).toBe(0,),)
                        test("non-empty", () => expect(new instance(ABCD,).execute(it => it.hasAll(newIterable(AB,),),).amountOfCall,).toBe(3,),)
                    },)
                },)
            },)

        describe("has", () => {
            test("empty", () => expect(new instance<string>(EMPTY,).has('a',),).toBeFalse(),)
            describe("1 field", () => {
                test('a', () => expect(new instance(A,).has('a',),).toBeTrue(),)
                test('e', () => expect(new instance<string>(A,).has('e',),).toBeFalse(),)
            },)
            describe("2 fields", () => {
                test('a', () => expect(new instance(AB,).has('a',),).toBeTrue(),)
                test('b', () => expect(new instance(AB,).has('b',),).toBeTrue(),)
                test('e', () => expect(new instance<string>(AB,).has('e',),).toBeFalse(),)
            },)
            describe("4 fields", () => {
                test('a', () => expect(new instance(ABCD,).has('a',),).toBeTrue(),)
                test('b', () => expect(new instance(ABCD,).has('b',),).toBeTrue(),)
                test('c', () => expect(new instance(ABCD,).has('c',),).toBeTrue(),)
                test('d', () => expect(new instance(ABCD,).has('d',),).toBeTrue(),)
                test('e', () => expect(new instance<string>(ABCD,).has('e',),).toBeFalse(),)
            },)
        },)
        describe.each(everyIterableInstances,)("hasOne: “%s”", ({value: it,},) => {
            describe("empty", () => {
                test("none", () => expect(new instance(EMPTY,).hasOne(it(EMPTY,),),).toBeFalse(),)
                test('a',    () => expect(new instance<string>(EMPTY,).hasOne(it(A,),),).toBeFalse(),)
                test("ab",   () => expect(new instance<string>(EMPTY,).hasOne(it(AB,),),).toBeFalse(),)
                test("abcd", () => expect(new instance<string>(EMPTY,).hasOne(it(ABCD,),),).toBeFalse(),)
            },)
            describe("1 field", () => {
                test("none", () => expect(new instance(A,).hasOne(it(EMPTY,),),).toBeTrue(),)
                test('a',    () => expect(new instance(A,).hasOne(it(A,),),).toBeTrue(),)
                test('e',    () => expect(new instance<string>(A,).hasOne(it(E,),),).toBeFalse(),)
                test("ab",   () => expect(new instance<string>(A,).hasOne(it(AB,),),).toBeTrue(),)
                test("ef",   () => expect(new instance<string>(A,).hasOne(it(EF,),),).toBeFalse(),)
                test("abcd", () => expect(new instance<string>(A,).hasOne(it(ABCD,),),).toBeTrue(),)
                test("efgh", () => expect(new instance<string>(A,).hasOne(it(EFGH,),),).toBeFalse(),)
            },)
            describe("2 fields", () => {
                test("none", () => expect(new instance(AB,).hasOne(it(EMPTY,),),).toBeTrue(),)
                test('a',    () => expect(new instance(AB,).hasOne(it(A,),),).toBeTrue(),)
                test('b',    () => expect(new instance(AB,).hasOne(it(B,),),).toBeTrue(),)
                test('e',    () => expect(new instance<string>(AB,).hasOne(it(E,),),).toBeFalse(),)
                test("ab",   () => expect(new instance(AB,).hasOne(it(AB,),),).toBeTrue(),)
                test("ef",   () => expect(new instance<string>(AB,).hasOne(it(EF,),),).toBeFalse(),)
                test("abcd", () => expect(new instance<string>(AB,).hasOne(it(ABCD,),),).toBeTrue(),)
                test("efgh", () => expect(new instance<string>(AB,).hasOne(it(EFGH,),),).toBeFalse(),)
            },)
            describe("4 fields", () => {
                test("none", () => expect(new instance(ABCD,).hasOne(it(EMPTY,),),).toBeTrue(),)
                test('a',    () => expect(new instance(ABCD,).hasOne(it(A,),),).toBeTrue(),)
                test('b',    () => expect(new instance(ABCD,).hasOne(it(B,),),).toBeTrue(),)
                test('c',    () => expect(new instance(ABCD,).hasOne(it(C,),),).toBeTrue(),)
                test('d',    () => expect(new instance(ABCD,).hasOne(it(D,),),).toBeTrue(),)
                test('e',    () => expect(new instance<string>(ABCD,).hasOne(it(E,),),).toBeFalse(),)
                test("ab",   () => expect(new instance(ABCD,).hasOne(it(AB,),),).toBeTrue(),)
                test("ef",   () => expect(new instance<string>(ABCD,).hasOne(it(EF,),),).toBeFalse(),)
                test("abcd", () => expect(new instance(ABCD,).hasOne(it(ABCD,),),).toBeTrue(),)
                test("efgh", () => expect(new instance<string>(ABCD,).hasOne(it(EFGH,),),).toBeFalse(),)
            },)
        },)
        describe.each(everyIterableInstances,)("hasAll: “%s”", ({value: it,},) => {
            describe("empty", () => {
                test("none", () => expect(new instance(EMPTY,).hasAll(it(EMPTY,),),).toBeTrue(),)
                test('a',    () => expect(new instance<string>(EMPTY,).hasAll(it(A,),),).toBeFalse(),)
                test("ab",   () => expect(new instance<string>(EMPTY,).hasAll(it(AB,),),).toBeFalse(),)
                test("abcd", () => expect(new instance<string>(EMPTY,).hasAll(it(ABCD,),),).toBeFalse(),)
            },)
            describe("1 field", () => {
                test("none", () => expect(new instance(A,).hasAll(it(EMPTY,),),).toBeTrue(),)
                test('a',    () => expect(new instance(A,).hasAll(it(A,),),).toBeTrue(),)
                test('e',    () => expect(new instance<string>(A,).hasAll(it(E,),),).toBeFalse(),)
                test("ab",   () => expect(new instance<string>(A,).hasAll(it(AB,),),).toBeFalse(),)
                test("ef",  () => expect(new instance<string>(A,).hasAll(it(EF,),),).toBeFalse(),)
                test("abcd", () => expect(new instance<string>(A,).hasAll(it(ABCD,),),).toBeFalse(),)
                test("efgh", () => expect(new instance<string>(A,).hasAll(it(EFGH,),),).toBeFalse(),)
            },)
            describe("2 fields", () => {
                test("none", () => expect(new instance(AB,).hasAll(it(EMPTY,),),).toBeTrue(),)
                test('a',    () => expect(new instance(AB,).hasAll(it(A,),),).toBeTrue(),)
                test('b',    () => expect(new instance(AB,).hasAll(it(B,),),).toBeTrue(),)
                test('e',    () => expect(new instance<string>(AB,).hasAll(it(E,),),).toBeFalse(),)
                test("ab",   () => expect(new instance(AB,).hasAll(it(AB,),),).toBeTrue(),)
                test("ef",  () => expect(new instance<string>(AB,).hasAll(it(EF,),),).toBeFalse(),)
                test("abcd", () => expect(new instance<string>(AB,).hasAll(it(ABCD,),),).toBeFalse(),)
                test("efgh", () => expect(new instance<string>(AB,).hasAll(it(EFGH,),),).toBeFalse(),)
            },)
            describe("4 fields", () => {
                test("none", () => expect(new instance(ABCD,).hasAll(it(EMPTY,),),).toBeTrue(),)
                test('a',    () => expect(new instance(ABCD,).hasAll(it(A,),),).toBeTrue(),)
                test('b',    () => expect(new instance(ABCD,).hasAll(it(B,),),).toBeTrue(),)
                test('c',    () => expect(new instance(ABCD,).hasAll(it(C,),),).toBeTrue(),)
                test('d',    () => expect(new instance(ABCD,).hasAll(it(D,),),).toBeTrue(),)
                test('e',    () => expect(new instance<string>(ABCD,).hasAll(it(E,),),).toBeFalse(),)
                test("ab",   () => expect(new instance(ABCD,).hasAll(it(AB,),),).toBeTrue(),)
                test("ef",  () => expect(new instance<string>(ABCD,).hasAll(it(EF,),),).toBeFalse(),)
                test("abcd", () => expect(new instance(ABCD,).hasAll(it(ABCD,),),).toBeTrue(),)
                test("efgh", () => expect(new instance<string>(ABCD,).hasAll(it(EFGH,),),).toBeFalse(),)
            },)
        },)
        describe("hasNull", () => {
            test("empty", () => expect(new instance(EMPTY,).hasNull,).toBeFalse(),)
            describe("1 field", () => {
                test("non-null",  () => expect(new instance(A,).hasNull,).toBeFalse(),)
                test("null",      () => expect(new instance(NULL,).hasNull,).toBeTrue(),)
                test("undefined", () => expect(new instance(UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("2 fields", () => {
                test("non-null",           () => expect(new instance(AB,).hasNull,).toBeFalse(),)
                test("null at start",      () => expect(new instance(NULL_A,).hasNull,).toBeTrue(),)
                test("null at end",        () => expect(new instance(A_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start", () => expect(new instance(UNDEFINED_A,).hasNull,).toBeTrue(),)
                test("undefined at end",   () => expect(new instance(A_UNDEFINED,).hasNull,).toBeTrue(),)
            },)
            describe("4 fields", () => {
                test("non-null",            () => expect(new instance(ABCD,).hasNull,).toBeFalse(),)
                test("null at start",       () => expect(new instance(NULL_AB,).hasNull,).toBeTrue(),)
                test("null at center",      () => expect(new instance(A_NULL_B,).hasNull,).toBeTrue(),)
                test("null at end",         () => expect(new instance(AB_NULL,).hasNull,).toBeTrue(),)
                test("undefined at start",  () => expect(new instance(UNDEFINED_AB,).hasNull,).toBeTrue(),)
                test("undefined at center", () => expect(new instance(A_UNDEFINED_B,).hasNull,).toBeTrue(),)
                test("undefined at end",    () => expect(new instance(AB_UNDEFINED,).hasNull,).toBeTrue(),)
                test("null + undefined",    () => expect(new instance(A_NULL_UNDEFINED_B,).hasNull,).toBeTrue(),)
            },)
        },)
        describe("hasDuplicate", () => {
            test("empty", () => expect(new instance(EMPTY,).hasDuplicate,).toBeFalse(),)
            test("1 field", () => expect(new instance(A,).hasDuplicate,).toBeFalse(),)
            describe("2 fields", () => {
                test("unique",     () => expect(new instance(AB,).hasDuplicate,).toBeFalse(),)
                test("duplicated", () => expect(new instance(AA,).hasDuplicate,).toBeTrue(),)
            },)
            describe("4|5 fields", () => {
                test("unique",               () => expect(new instance(ABCD,).hasDuplicate,).toBeFalse(),)
                test("duplicative",          () => expect(new instance(ABAB,).hasDuplicate,).toBeTrue(),)
                test("1 null + 1 undefined", () => expect(new instance(A_NULL_UNDEFINED_B,).hasDuplicate,).toBeFalse(),)
                test("2 null + 1 undefined", () => expect(new instance(A_NULL_NULL_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("1 null + 2 undefined", () => expect(new instance(A_NULL_UNDEFINED_UNDEFINED_B,).hasDuplicate,).toBeTrue(),)
                test("2 a + 1 b",            () => expect(new instance(AABC,).hasDuplicate,).toBeTrue(),)
                test("1 a + 2 b",            () => expect(new instance(ABBC,).hasDuplicate,).toBeTrue(),)
            },)
        },)
    },)

},)
