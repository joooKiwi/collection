/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {EmptyCollectionHolderForTest}                                                                                                                                                                                        from "./instance/EmptyCollectionHolderForTest"
import {GenericCollectionHolder_FindFirstAlias}                                                                                                                                                                              from "./instance/GenericCollectionHolder_FindFirstAlias"
import {GenericCollectionHolder_FindFirstIndexedAlias}                                                                                                                                                                       from "./instance/GenericCollectionHolder_FindFirstIndexedAlias"
import {GenericCollectionHolder_FindFirstIndexedOrNullAlias}                                                                                                                                                                 from "./instance/GenericCollectionHolder_FindFirstIndexedOrNullAlias"
import {GenericCollectionHolder_FindFirstOrNullAlias}                                                                                                                                                                        from "./instance/GenericCollectionHolder_FindFirstOrNullAlias"
import {GenericCollectionHolder_FindLastAlias}                                                                                                                                                                               from "./instance/GenericCollectionHolder_FindLastAlias"
import {GenericCollectionHolder_FindLastIndexedAlias}                                                                                                                                                                        from "./instance/GenericCollectionHolder_FindLastIndexedAlias"
import {GenericCollectionHolder_FindLastIndexedOrNullAlias}                                                                                                                                                                  from "./instance/GenericCollectionHolder_FindLastIndexedOrNullAlias"
import {GenericCollectionHolder_FindLastOrNullAlias}                                                                                                                                                                         from "./instance/GenericCollectionHolder_FindLastOrNullAlias"
import {LazyGenericCollectionHolder_FindFirstAlias}                                                                                                                                                                          from "./instance/LazyGenericCollectionHolder_FindFirstAlias"
import {LazyGenericCollectionHolder_FindFirstIndexedAlias}                                                                                                                                                                   from "./instance/LazyGenericCollectionHolder_FindFirstIndexedAlias"
import {LazyGenericCollectionHolder_FindFirstIndexedOrNullAlias}                                                                                                                                                             from "./instance/LazyGenericCollectionHolder_FindFirstIndexedOrNullAlias"
import {LazyGenericCollectionHolder_FindFirstOrNullAlias}                                                                                                                                                                    from "./instance/LazyGenericCollectionHolder_FindFirstOrNullAlias"
import {LazyGenericCollectionHolder_FindLastAlias}                                                                                                                                                                           from "./instance/LazyGenericCollectionHolder_FindLastAlias"
import {LazyGenericCollectionHolder_FindLastIndexedAlias}                                                                                                                                                                    from "./instance/LazyGenericCollectionHolder_FindLastIndexedAlias"
import {LazyGenericCollectionHolder_FindLastIndexedOrNullAlias}                                                                                                                                                              from "./instance/LazyGenericCollectionHolder_FindLastIndexedOrNullAlias"
import {LazyGenericCollectionHolder_FindLastOrNullAlias}                                                                                                                                                                     from "./instance/LazyGenericCollectionHolder_FindLastOrNullAlias"
import {A, AB, ABCD, EMPTY}                                                                                                                                                                                                  from "./value/arrays"
import {callbackAsFalse0, callbackAsFalse1, callbackAsFalse2, callbackAsTrue0, callbackAsTrue1, callbackAsTrue2, falseCallbacks, trueCallbacks}                                                                              from "./value/callbacks (boolean)"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                                                                                                                   from "./value/callbacks (fail)"
import {callbackIsA, callbackIsAAlt, callbackIsB, callbackIsBAlt, callbackIsC, callbackIsCAlt, callbackIsD, callbackIsDAlt, callbackIsE, callbackIsEAlt}                                                                     from "./value/callbacks (string)"
import {callbackIs0, callbackIs0Alt, callbackIs1, callbackIs1Alt, callbackIs2, callbackIs2Alt, callbackIs3, callbackIs3Alt, callbackIs4, callbackIs4Alt, callbackIsEven, callbackIsEvenAlt, callbackIsOdd, callbackIsOddAlt} from "./value/callbacks (number)"
import {everyCollectionInstancesAndExtensionFunctionAsCollectionHolder}                                                                                                                                                      from "./value/instances"

import {EmptyCollectionException}  from "../src/exception/EmptyCollectionException"
import {IndexOutOfBoundsException} from "../src/exception/IndexOutOfBoundsException"

describe("CollectionHolderTest (find)", () => {

    describe("EmptyCollectionHolder", () => {
        test("find",                   () => expect(() => new EmptyCollectionHolderForTest().find(),).toThrow(EmptyCollectionException,),)
        test("findOrNull",             () => expect(new EmptyCollectionHolderForTest().findOrNull(),).toBeNull(),)
        test("findIndexed",            () => expect(() => new EmptyCollectionHolderForTest().findIndexed(),).toThrow(EmptyCollectionException,),)
        test("findIndexedOrNull",      () => expect(new EmptyCollectionHolderForTest().findIndexedOrNull(),).toBeNull(),)
        test("findFirst",              () => expect(() => new EmptyCollectionHolderForTest().findFirst(),).toThrow(EmptyCollectionException,),)
        test("findFirstOrNull",        () => expect(new EmptyCollectionHolderForTest().findFirstOrNull(),).toBeNull(),)
        test("findFirstIndexed",       () => expect(() => new EmptyCollectionHolderForTest().findFirstIndexed(),).toThrow(EmptyCollectionException,),)
        test("findFirstIndexedOrNull", () => expect(new EmptyCollectionHolderForTest().findFirstIndexedOrNull(),).toBeNull(),)
        test("findLast",               () => expect(() => new EmptyCollectionHolderForTest().findLast(),).toThrow(EmptyCollectionException,),)
        test("findLastOrNull",         () => expect(new EmptyCollectionHolderForTest().findLastOrNull(),).toBeNull(),)
        test("findLastIndexed",        () => expect(() => new EmptyCollectionHolderForTest().findLastIndexed(),).toThrow(EmptyCollectionException,),)
        test("findLastIndexedOrNull",  () => expect(new EmptyCollectionHolderForTest().findLastIndexedOrNull(),).toBeNull(),)
    },)

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("first",              () => expect(new GenericCollectionHolder_FindFirstAlias().execute(it => it.first(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("firstOrNull",        () => expect(new GenericCollectionHolder_FindFirstOrNullAlias().execute(it => it.firstOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new GenericCollectionHolder_FindFirstIndexedAlias().execute(it => it.firstIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("firstIndexedOrNull", () => expect(new GenericCollectionHolder_FindFirstIndexedOrNullAlias().execute(it => it.firstIndexedOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("last",               () => expect(new GenericCollectionHolder_FindLastAlias().execute(it => it.last(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("lastOrNull ",        () => expect(new GenericCollectionHolder_FindLastOrNullAlias().execute(it => it.lastOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("lastIndexed",        () => expect(new GenericCollectionHolder_FindLastIndexedAlias().execute(it => it.lastIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("lastOrNull",         () => expect(new GenericCollectionHolder_FindLastIndexedOrNullAlias().execute(it => it.lastIndexedOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("find",               () => expect(new GenericCollectionHolder_FindFirstAlias().execute(it => it.find(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("findOrNull",         () => expect(new GenericCollectionHolder_FindFirstOrNullAlias().execute(it => it.findOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("findIndexed",        () => expect(new GenericCollectionHolder_FindFirstIndexedAlias().execute(it => it.findIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("findIndexedOrNull",  () => expect(new GenericCollectionHolder_FindFirstIndexedOrNullAlias().execute(it => it.findIndexedOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("first",              () => expect(new LazyGenericCollectionHolder_FindFirstAlias().execute(it => it.first(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("firstOrNull",        () => expect(new LazyGenericCollectionHolder_FindFirstOrNullAlias().execute(it => it.firstOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new LazyGenericCollectionHolder_FindFirstIndexedAlias().execute(it => it.firstIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("firstIndexedOrNull", () => expect(new LazyGenericCollectionHolder_FindFirstIndexedOrNullAlias().execute(it => it.firstIndexedOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("last",               () => expect(new LazyGenericCollectionHolder_FindLastAlias().execute(it => it.last(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("lastOrNull",         () => expect(new LazyGenericCollectionHolder_FindLastOrNullAlias().execute(it => it.lastOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("lastIndexed",        () => expect(new LazyGenericCollectionHolder_FindLastIndexedAlias().execute(it => it.lastIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("lastOrNull",         () => expect(new LazyGenericCollectionHolder_FindLastIndexedOrNullAlias().execute(it => it.lastIndexedOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("find",               () => expect(new LazyGenericCollectionHolder_FindFirstAlias().execute(it => it.find(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("findOrNull",         () => expect(new LazyGenericCollectionHolder_FindFirstOrNullAlias().execute(it => it.findOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("findIndexed",        () => expect(new LazyGenericCollectionHolder_FindFirstIndexedAlias().execute(it => it.findIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
            test("findIndexedOrNull",  () => expect(new LazyGenericCollectionHolder_FindFirstIndexedOrNullAlias().execute(it => it.findIndexedOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
        },)
    },)

    describe.each(everyCollectionInstancesAndExtensionFunctionAsCollectionHolder,)("%s", ({value: {instance, isExtension,},},) => {
        if (!isExtension)
            describe("get() being called", () => {
                describe("findFirst", () => {
                    describe("empty", () => {
                        test("0 arguments", () => expect(new instance(EMPTY,).executeWhileExpectingEmptyException(it => it.findFirst(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                        test("1 argument",  () => expect(new instance(EMPTY,).executeWhileExpectingEmptyException(it => it.findFirst(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments", () => expect(new instance(EMPTY,).executeWhileExpectingEmptyException(it => it.findFirst(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("0 arguments: true",  () => expect(new instance(A,).execute(it => it.findFirst(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(A,).execute(it => it.findFirst(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(A,).execute(it => it.findFirst(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(A,).executeWhileExpectingIndexOutOfBound(it => it.findFirst(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(A,).executeWhileExpectingIndexOutOfBound(it => it.findFirst(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: false", () => expect(new instance(A,).executeWhileExpectingIndexOutOfBound(it => it.findFirst(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(AB,).execute(it => it.findFirst(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(AB,).execute(it => it.findFirst(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(AB,).execute(it => it.findFirst(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(AB,).executeWhileExpectingIndexOutOfBound(it => it.findFirst(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(AB,).executeWhileExpectingIndexOutOfBound(it => it.findFirst(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                        test("2 arguments: false", () => expect(new instance(AB,).executeWhileExpectingIndexOutOfBound(it => it.findFirst(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findFirst(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(ABCD,).execute(it => it.findFirst(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findFirst(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(ABCD,).executeWhileExpectingIndexOutOfBound(it => it.findFirst(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(ABCD,).executeWhileExpectingIndexOutOfBound(it => it.findFirst(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                        test("2 arguments: false", () => expect(new instance(ABCD,).executeWhileExpectingIndexOutOfBound(it => it.findFirst(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                    },)
                },)
                describe("findFirstOrNull", () => {
                    describe("empty", () => {
                        test("0 arguments", () => expect(new instance(EMPTY,).execute(it => it.findFirstOrNull(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                        test("1 argument",  () => expect(new instance(EMPTY,).execute(it => it.findFirstOrNull(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments", () => expect(new instance(EMPTY,).execute(it => it.findFirstOrNull(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("0 arguments: true",  () => expect(new instance(A,).execute(it => it.findFirstOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(A,).execute(it => it.findFirstOrNull(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(A,).execute(it => it.findFirstOrNull(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(A,).execute(it => it.findFirstOrNull(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(A,).execute(it => it.findFirstOrNull(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: false", () => expect(new instance(A,).execute(it => it.findFirstOrNull(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(AB,).execute(it => it.findFirstOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(AB,).execute(it => it.findFirstOrNull(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(AB,).execute(it => it.findFirstOrNull(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(AB,).execute(it => it.findFirstOrNull(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(AB,).execute(it => it.findFirstOrNull(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                        test("2 arguments: false", () => expect(new instance(AB,).execute(it => it.findFirstOrNull(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findFirstOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(ABCD,).execute(it => it.findFirstOrNull(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findFirstOrNull(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(ABCD,).execute(it => it.findFirstOrNull(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(ABCD,).execute(it => it.findFirstOrNull(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                        test("2 arguments: false", () => expect(new instance(ABCD,).execute(it => it.findFirstOrNull(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                    },)
                },)
                describe("findFirstIndexed", () => {
                    describe("empty", () => {
                        test("0 arguments", () => expect(new instance(EMPTY,).executeWhileExpectingEmptyException(it => it.findFirstIndexed(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                        test("1 argument",  () => expect(new instance(EMPTY,).executeWhileExpectingEmptyException(it => it.findFirstIndexed(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments", () => expect(new instance(EMPTY,).executeWhileExpectingEmptyException(it => it.findFirstIndexed(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("0 arguments: true",  () => expect(new instance(A,).execute(it => it.findFirstIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(A,).execute(it => it.findFirstIndexed(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(A,).execute(it => it.findFirstIndexed(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(A,).executeWhileExpectingIndexOutOfBound(it => it.findFirstIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(A,).executeWhileExpectingIndexOutOfBound(it => it.findFirstIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(A,).executeWhileExpectingIndexOutOfBound(it => it.findFirstIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(AB,).execute(it => it.findFirstIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(AB,).execute(it => it.findFirstIndexed(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(AB,).execute(it => it.findFirstIndexed(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(AB,).executeWhileExpectingIndexOutOfBound(it => it.findFirstIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(AB,).executeWhileExpectingIndexOutOfBound(it => it.findFirstIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(AB,).executeWhileExpectingIndexOutOfBound(it => it.findFirstIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findFirstIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(ABCD,).execute(it => it.findFirstIndexed(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findFirstIndexed(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(ABCD,).executeWhileExpectingIndexOutOfBound(it => it.findFirstIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(ABCD,).executeWhileExpectingIndexOutOfBound(it => it.findFirstIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(ABCD,).executeWhileExpectingIndexOutOfBound(it => it.findFirstIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                    },)
                },)
                describe("findFirstIndexedOrNull", () => {
                    describe("empty", () => {
                        test("0 arguments", () => expect(new instance(EMPTY,).execute(it => it.findFirstIndexedOrNull(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                        test("1 argument",  () => expect(new instance(EMPTY,).execute(it => it.findFirstIndexedOrNull(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments", () => expect(new instance(EMPTY,).execute(it => it.findFirstIndexedOrNull(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("0 arguments: true",  () => expect(new instance(A,).execute(it => it.findFirstIndexedOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(A,).execute(it => it.findFirstIndexedOrNull(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(A,).execute(it => it.findFirstIndexedOrNull(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(A,).execute(it => it.findFirstIndexedOrNull(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(A,).execute(it => it.findFirstIndexedOrNull(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(A,).execute(it => it.findFirstIndexedOrNull(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(AB,).execute(it => it.findFirstIndexedOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(AB,).execute(it => it.findFirstIndexedOrNull(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(AB,).execute(it => it.findFirstIndexedOrNull(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(AB,).execute(it => it.findFirstIndexedOrNull(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(AB,).execute(it => it.findFirstIndexedOrNull(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(AB,).execute(it => it.findFirstIndexedOrNull(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findFirstIndexedOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(ABCD,).execute(it => it.findFirstIndexedOrNull(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findFirstIndexedOrNull(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(ABCD,).execute(it => it.findFirstIndexedOrNull(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(ABCD,).execute(it => it.findFirstIndexedOrNull(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(ABCD,).execute(it => it.findFirstIndexedOrNull(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                    },)
                },)
                describe("findLast", () => {
                    describe("empty", () => {
                        test("0 arguments", () => expect(new instance(EMPTY,).executeWhileExpectingEmptyException(it => it.findLast(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                        test("1 argument",  () => expect(new instance(EMPTY,).executeWhileExpectingEmptyException(it => it.findLast(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments", () => expect(new instance(EMPTY,).executeWhileExpectingEmptyException(it => it.findLast(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("0 arguments: true",  () => expect(new instance(A,).execute(it => it.findLast(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(A,).execute(it => it.findLast(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(A,).execute(it => it.findLast(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(A,).executeWhileExpectingIndexOutOfBound(it => it.findLast(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(A,).executeWhileExpectingIndexOutOfBound(it => it.findLast(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: false", () => expect(new instance(A,).executeWhileExpectingIndexOutOfBound(it => it.findLast(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(AB,).execute(it => it.findLast(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(AB,).execute(it => it.findLast(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(AB,).execute(it => it.findLast(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(AB,).executeWhileExpectingIndexOutOfBound(it => it.findLast(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(AB,).executeWhileExpectingIndexOutOfBound(it => it.findLast(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                        test("2 arguments: false", () => expect(new instance(AB,).executeWhileExpectingIndexOutOfBound(it => it.findLast(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findLast(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(ABCD,).execute(it => it.findLast(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findLast(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(ABCD,).executeWhileExpectingIndexOutOfBound(it => it.findLast(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(ABCD,).executeWhileExpectingIndexOutOfBound(it => it.findLast(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                        test("2 arguments: false", () => expect(new instance(ABCD,).executeWhileExpectingIndexOutOfBound(it => it.findLast(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                    },)
                },)
                describe("findLastOrNull", () => {
                    describe("empty", () => {
                        test("0 arguments", () => expect(new instance(EMPTY,).execute(it => it.findLastOrNull(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                        test("1 argument",  () => expect(new instance(EMPTY,).execute(it => it.findLastOrNull(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments", () => expect(new instance(EMPTY,).execute(it => it.findLastOrNull(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("0 arguments: true",  () => expect(new instance(A,).execute(it => it.findLastOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(A,).execute(it => it.findLastOrNull(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(A,).execute(it => it.findLastOrNull(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(A,).execute(it => it.findLastOrNull(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(A,).execute(it => it.findLastOrNull(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: false", () => expect(new instance(A,).execute(it => it.findLastOrNull(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(AB,).execute(it => it.findLastOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(AB,).execute(it => it.findLastOrNull(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(AB,).execute(it => it.findLastOrNull(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(AB,).execute(it => it.findLastOrNull(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(AB,).execute(it => it.findLastOrNull(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                        test("2 arguments: false", () => expect(new instance(AB,).execute(it => it.findLastOrNull(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findLastOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(ABCD,).execute(it => it.findLastOrNull(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findLastOrNull(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(ABCD,).execute(it => it.findLastOrNull(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(ABCD,).execute(it => it.findLastOrNull(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                        test("2 arguments: false", () => expect(new instance(ABCD,).execute(it => it.findLastOrNull(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                    },)
                },)
                describe("findLastIndexed", () => {
                    describe("empty", () => {
                        test("0 arguments", () => expect(new instance(EMPTY,).executeWhileExpectingEmptyException(it => it.findLastIndexed(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                        test("1 argument",  () => expect(new instance(EMPTY,).executeWhileExpectingEmptyException(it => it.findLastIndexed(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments", () => expect(new instance(EMPTY,).executeWhileExpectingEmptyException(it => it.findLastIndexed(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("0 arguments: true",  () => expect(new instance(A,).execute(it => it.findLastIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(A,).execute(it => it.findLastIndexed(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(A,).execute(it => it.findLastIndexed(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(A,).executeWhileExpectingIndexOutOfBound(it => it.findLastIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(A,).executeWhileExpectingIndexOutOfBound(it => it.findLastIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(A,).executeWhileExpectingIndexOutOfBound(it => it.findLastIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(AB,).execute(it => it.findLastIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(AB,).execute(it => it.findLastIndexed(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(AB,).execute(it => it.findLastIndexed(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(AB,).executeWhileExpectingIndexOutOfBound(it => it.findLastIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(AB,).executeWhileExpectingIndexOutOfBound(it => it.findLastIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(AB,).executeWhileExpectingIndexOutOfBound(it => it.findLastIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findLastIndexed(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(ABCD,).execute(it => it.findLastIndexed(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findLastIndexed(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(ABCD,).executeWhileExpectingIndexOutOfBound(it => it.findLastIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(ABCD,).executeWhileExpectingIndexOutOfBound(it => it.findLastIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(ABCD,).executeWhileExpectingIndexOutOfBound(it => it.findLastIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                    },)
                },)
                describe("findLastIndexedOrNull", () => {
                    describe("empty", () => {
                        test("0 arguments", () => expect(new instance(EMPTY,).execute(it => it.findLastIndexedOrNull(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                        test("1 argument",  () => expect(new instance(EMPTY,).execute(it => it.findLastIndexedOrNull(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments", () => expect(new instance(EMPTY,).execute(it => it.findLastIndexedOrNull(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("1 field", () => {
                        test("0 arguments: true",  () => expect(new instance(A,).execute(it => it.findLastIndexedOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(A,).execute(it => it.findLastIndexedOrNull(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(A,).execute(it => it.findLastIndexedOrNull(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(A,).execute(it => it.findLastIndexedOrNull(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(A,).execute(it => it.findLastIndexedOrNull(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(A,).execute(it => it.findLastIndexedOrNull(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                    },)
                    describe("2 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(AB,).execute(it => it.findLastIndexedOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(AB,).execute(it => it.findLastIndexedOrNull(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(AB,).execute(it => it.findLastIndexedOrNull(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(AB,).execute(it => it.findLastIndexedOrNull(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(AB,).execute(it => it.findLastIndexedOrNull(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(AB,).execute(it => it.findLastIndexedOrNull(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                    },)
                    describe("4 fields", () => {
                        test("0 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findLastIndexedOrNull(callbackAsTrue0,),).amountOfCall,).toBe(1,),)
                        test("1 argument: true",   () => expect(new instance(ABCD,).execute(it => it.findLastIndexedOrNull(callbackAsTrue1,),).amountOfCall,).toBe(1,),)
                        test("2 arguments: true",  () => expect(new instance(ABCD,).execute(it => it.findLastIndexedOrNull(callbackAsTrue2,),).amountOfCall,).toBe(1,),)
                        test("0 arguments: false", () => expect(new instance(ABCD,).execute(it => it.findLastIndexedOrNull(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
                        test("1 argument: false",  () => expect(new instance(ABCD,).execute(it => it.findLastIndexedOrNull(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                        test("2 arguments: false", () => expect(new instance(ABCD,).execute(it => it.findLastIndexedOrNull(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                    },)
                },)
            },)

        describe("findFirst", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(() => new instance(EMPTY,).findFirst(callbackAsFail0,),).toThrow(EmptyCollectionException,),)
                test("1 argument",  () => expect(() => new instance(EMPTY,).findFirst(callbackAsFail1,),).toThrow(EmptyCollectionException,),)
                test("2 arguments", () => expect(() => new instance(EMPTY,).findFirst(callbackAsFail2,),).toThrow(EmptyCollectionException,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findFirst(it,),).toBe('a',),)
                    test("2 fields", () => expect(new instance(AB,).findFirst(it,),).toBe('a',),)
                    test("4 fields", () => expect(new instance(ABCD,).findFirst(it,),).toBe('a',),)
                },)
                describe.each(falseCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(() => new instance(A,).findFirst(it,),).toThrow(IndexOutOfBoundsException,),)
                    test("2 fields", () => expect(() => new instance(AB,).findFirst(it,),).toThrow(IndexOutOfBoundsException,),)
                    test("4 fields", () => expect(() => new instance(ABCD,).findFirst(it,),).toThrow(IndexOutOfBoundsException,),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).findFirst(callbackIsA,),).toBe('a',),)
                test('e',    () => expect(() => new instance(A,).findFirst(callbackIsE,),).toThrow(IndexOutOfBoundsException,),)
                test("even", () => expect(new instance(A,).findFirst(callbackIsEvenAlt,),).toBe('a',),)
                test("odd",  () => expect(() => new instance(A,).findFirst(callbackIsOddAlt,),).toThrow(IndexOutOfBoundsException,),)
                test('0',    () => expect(new instance(A,).findFirst(callbackIs0Alt,),).toBe('a',),)
                test('4',    () => expect(() => new instance(A,).findFirst(callbackIs4Alt,),).toThrow(IndexOutOfBoundsException,),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).findFirst(callbackIsA,),).toBe('a',),)
                test('b',    () => expect(new instance(AB,).findFirst(callbackIsB,),).toBe('b',),)
                test('e',    () => expect(() => new instance(AB,).findFirst(callbackIsE,),).toThrow(IndexOutOfBoundsException,),)
                test("even", () => expect(new instance(AB,).findFirst(callbackIsEvenAlt,),).toBe('a',),)
                test("odd",  () => expect(new instance(AB,).findFirst(callbackIsOddAlt,),).toBe('b',),)
                test('0',    () => expect(new instance(AB,).findFirst(callbackIs0Alt,),).toBe('a',),)
                test('1',    () => expect(new instance(AB,).findFirst(callbackIs1Alt,),).toBe('b',),)
                test('2',    () => expect(() => new instance(AB,).findFirst(callbackIs4Alt,),).toThrow(IndexOutOfBoundsException,),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).findFirst(callbackIsA,),).toBe('a',),)
                test('b',    () => expect(new instance(ABCD,).findFirst(callbackIsB,),).toBe('b',),)
                test('c',    () => expect(new instance(ABCD,).findFirst(callbackIsC,),).toBe('c',),)
                test('d',    () => expect(new instance(ABCD,).findFirst(callbackIsD,),).toBe('d',),)
                test('e',    () => expect(() => new instance(ABCD,).findFirst(callbackIsE,),).toThrow(IndexOutOfBoundsException,),)
                test("even", () => expect(new instance(ABCD,).findFirst(callbackIsEvenAlt,),).toBe('a',),)
                test("odd",  () => expect(new instance(ABCD,).findFirst(callbackIsOddAlt,),).toBe('b',),)
                test('0',    () => expect(new instance(ABCD,).findFirst(callbackIs0Alt,),).toBe('a',),)
                test('1',    () => expect(new instance(ABCD,).findFirst(callbackIs1Alt,),).toBe('b',),)
                test('2',    () => expect(new instance(ABCD,).findFirst(callbackIs2Alt,),).toBe('c',),)
                test('3',    () => expect(new instance(ABCD,).findFirst(callbackIs3Alt,),).toBe('d',),)
                test('4',    () => expect(() => new instance(ABCD,).findFirst(callbackIs4Alt,),).toThrow(IndexOutOfBoundsException,),)
            },)
        },)
        describe("findFirstOrNull", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).findFirstOrNull(callbackAsFail0,),).toBeNull(),)
                test("1 argument",  () => expect(new instance(EMPTY,).findFirstOrNull(callbackAsFail1,),).toBeNull(),)
                test("2 arguments", () => expect(new instance(EMPTY,).findFirstOrNull(callbackAsFail2,),).toBeNull(),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findFirstOrNull(it,),).toBe('a',),)
                    test("2 fields", () => expect(new instance(AB,).findFirstOrNull(it,),).toBe('a',),)
                    test("4 fields", () => expect(new instance(ABCD,).findFirstOrNull(it,),).toBe('a',),)
                },)
                describe.each(falseCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findFirstOrNull(it,),).toBeNull(),)
                    test("2 fields", () => expect(new instance(AB,).findFirstOrNull(it,),).toBeNull(),)
                    test("4 fields", () => expect(new instance(ABCD,).findFirstOrNull(it,),).toBeNull(),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).findFirstOrNull(callbackIsA,),).toBe('a',),)
                test('e',    () => expect(new instance(A,).findFirstOrNull(callbackIsE,),).toBeNull(),)
                test("even", () => expect(new instance(A,).findFirstOrNull(callbackIsEvenAlt,),).toBe('a',),)
                test("odd",  () => expect(new instance(A,).findFirstOrNull(callbackIsOddAlt,),).toBeNull(),)
                test('0',    () => expect(new instance(A,).findFirstOrNull(callbackIs0Alt,),).toBe('a',),)
                test('4',    () => expect(new instance(A,).findFirstOrNull(callbackIs4Alt,),).toBeNull(),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).findFirstOrNull(callbackIsA,),).toBe('a',),)
                test('b',    () => expect(new instance(AB,).findFirstOrNull(callbackIsB,),).toBe('b',),)
                test('e',    () => expect(new instance(AB,).findFirstOrNull(callbackIsE,),).toBeNull(),)
                test("even", () => expect(new instance(AB,).findFirstOrNull(callbackIsEvenAlt,),).toBe('a',),)
                test("odd",  () => expect(new instance(AB,).findFirstOrNull(callbackIsOddAlt,),).toBe('b',),)
                test('0',    () => expect(new instance(AB,).findFirstOrNull(callbackIs0Alt,),).toBe('a',),)
                test('1',    () => expect(new instance(AB,).findFirstOrNull(callbackIs1Alt,),).toBe('b',),)
                test('2',    () => expect(new instance(AB,).findFirstOrNull(callbackIs4Alt,),).toBeNull(),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).findFirstOrNull(callbackIsA,),).toBe('a',),)
                test('b',    () => expect(new instance(ABCD,).findFirstOrNull(callbackIsB,),).toBe('b',),)
                test('c',    () => expect(new instance(ABCD,).findFirstOrNull(callbackIsC,),).toBe('c',),)
                test('d',    () => expect(new instance(ABCD,).findFirstOrNull(callbackIsD,),).toBe('d',),)
                test('e',    () => expect(new instance(ABCD,).findFirstOrNull(callbackIsE,),).toBeNull(),)
                test("even", () => expect(new instance(ABCD,).findFirstOrNull(callbackIsEvenAlt,),).toBe('a',),)
                test("odd",  () => expect(new instance(ABCD,).findFirstOrNull(callbackIsOddAlt,),).toBe('b',),)
                test('0',    () => expect(new instance(ABCD,).findFirstOrNull(callbackIs0Alt,),).toBe('a',),)
                test('1',    () => expect(new instance(ABCD,).findFirstOrNull(callbackIs1Alt,),).toBe('b',),)
                test('2',    () => expect(new instance(ABCD,).findFirstOrNull(callbackIs2Alt,),).toBe('c',),)
                test('3',    () => expect(new instance(ABCD,).findFirstOrNull(callbackIs3Alt,),).toBe('d',),)
                test('4',    () => expect(new instance(ABCD,).findFirstOrNull(callbackIs4Alt,),).toBeNull(),)
            },)
        },)
        describe("findFirstIndexed", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(() => new instance(EMPTY,).findFirstIndexed(callbackAsFail0,),).toThrow(EmptyCollectionException,),)
                test("1 argument",  () => expect(() => new instance(EMPTY,).findFirstIndexed(callbackAsFail1,),).toThrow(EmptyCollectionException,),)
                test("2 arguments", () => expect(() => new instance(EMPTY,).findFirstIndexed(callbackAsFail2,),).toThrow(EmptyCollectionException,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findFirstIndexed(it,),).toBe('a',),)
                    test("2 fields", () => expect(new instance(AB,).findFirstIndexed(it,),).toBe('a',),)
                    test("4 fields", () => expect(new instance(ABCD,).findFirstIndexed(it,),).toBe('a',),)
                },)
                describe.each(falseCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(() => new instance(A,).findFirstIndexed(it,),).toThrow(IndexOutOfBoundsException,),)
                    test("2 fields", () => expect(() => new instance(AB,).findFirstIndexed(it,),).toThrow(IndexOutOfBoundsException,),)
                    test("4 fields", () => expect(() => new instance(ABCD,).findFirstIndexed(it,),).toThrow(IndexOutOfBoundsException,),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).findFirstIndexed(callbackIsAAlt,),).toBe('a',),)
                test('e',    () => expect(() => new instance(A,).findFirstIndexed(callbackIsEAlt,),).toThrow(IndexOutOfBoundsException,),)
                test("even", () => expect(new instance(A,).findFirstIndexed(callbackIsEven,),).toBe('a',),)
                test("odd",  () => expect(() => new instance(A,).findFirstIndexed(callbackIsOdd,),).toThrow(IndexOutOfBoundsException,),)
                test('0',    () => expect(new instance(A,).findFirstIndexed(callbackIs0,),).toBe('a',),)
                test('4',    () => expect(() => new instance(A,).findFirstIndexed(callbackIs4,),).toThrow(IndexOutOfBoundsException,),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).findFirstIndexed(callbackIsAAlt,),).toBe('a',),)
                test('b',    () => expect(new instance(AB,).findFirstIndexed(callbackIsBAlt,),).toBe('b',),)
                test('e',    () => expect(() => new instance(AB,).findFirstIndexed(callbackIsEAlt,),).toThrow(IndexOutOfBoundsException,),)
                test("even", () => expect(new instance(AB,).findFirstIndexed(callbackIsEven,),).toBe('a',),)
                test("odd",  () => expect(new instance(AB,).findFirstIndexed(callbackIsOdd,),).toBe('b',),)
                test('0',    () => expect(new instance(AB,).findFirstIndexed(callbackIs0,),).toBe('a',),)
                test('1',    () => expect(new instance(AB,).findFirstIndexed(callbackIs1,),).toBe('b',),)
                test('4',    () => expect(() => new instance(AB,).findFirstIndexed(callbackIs4,),).toThrow(IndexOutOfBoundsException,),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).findFirstIndexed(callbackIsAAlt,),).toBe('a',),)
                test('b',    () => expect(new instance(ABCD,).findFirstIndexed(callbackIsBAlt,),).toBe('b',),)
                test('c',    () => expect(new instance(ABCD,).findFirstIndexed(callbackIsCAlt,),).toBe('c',),)
                test('d',    () => expect(new instance(ABCD,).findFirstIndexed(callbackIsDAlt,),).toBe('d',),)
                test('e',    () => expect(() => new instance(ABCD,).findFirstIndexed(callbackIsEAlt,),).toThrow(IndexOutOfBoundsException,),)
                test("even", () => expect(new instance(ABCD,).findFirstIndexed(callbackIsEven,),).toBe('a',),)
                test("odd",  () => expect(new instance(ABCD,).findFirstIndexed(callbackIsOdd,),).toBe('b',),)
                test('0',    () => expect(new instance(ABCD,).findFirstIndexed(callbackIs0,),).toBe('a',),)
                test('1',    () => expect(new instance(ABCD,).findFirstIndexed(callbackIs1,),).toBe('b',),)
                test('2',    () => expect(new instance(ABCD,).findFirstIndexed(callbackIs2,),).toBe('c',),)
                test('3',    () => expect(new instance(ABCD,).findFirstIndexed(callbackIs3,),).toBe('d',),)
                test('4',    () => expect(() => new instance(ABCD,).findFirstIndexed(callbackIs4,),).toThrow(IndexOutOfBoundsException,),)
            },)
        },)
        describe("findFirstIndexedOrNull", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).findFirstIndexedOrNull(callbackAsFail0,),).toBeNull(),)
                test("1 argument",  () => expect(new instance(EMPTY,).findFirstIndexedOrNull(callbackAsFail1,),).toBeNull(),)
                test("2 arguments", () => expect(new instance(EMPTY,).findFirstIndexedOrNull(callbackAsFail2,),).toBeNull(),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findFirstIndexedOrNull(it,),).toBe('a',),)
                    test("2 fields", () => expect(new instance(AB,).findFirstIndexedOrNull(it,),).toBe('a',),)
                    test("4 fields", () => expect(new instance(ABCD,).findFirstIndexedOrNull(it,),).toBe('a',),)
                },)
                describe.each(falseCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findFirstIndexedOrNull(it,),).toBeNull(),)
                    test("2 fields", () => expect(new instance(AB,).findFirstIndexedOrNull(it,),).toBeNull(),)
                    test("4 fields", () => expect(new instance(ABCD,).findFirstIndexedOrNull(it,),).toBeNull(),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).findFirstIndexedOrNull(callbackIsAAlt,),).toBe('a',),)
                test('e',    () => expect(new instance(A,).findFirstIndexedOrNull(callbackIsEAlt,),).toBeNull(),)
                test("even", () => expect(new instance(A,).findFirstIndexedOrNull(callbackIsEven,),).toBe('a',),)
                test("odd",  () => expect(new instance(A,).findFirstIndexedOrNull(callbackIsOdd,),).toBeNull(),)
                test('0',    () => expect(new instance(A,).findFirstIndexedOrNull(callbackIs0,),).toBe('a',),)
                test('4',    () => expect(new instance(A,).findFirstIndexedOrNull(callbackIs4,),).toBeNull(),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).findFirstIndexedOrNull(callbackIsAAlt,),).toBe('a',),)
                test('b',    () => expect(new instance(AB,).findFirstIndexedOrNull(callbackIsBAlt,),).toBe('b',),)
                test('e',    () => expect(new instance(AB,).findFirstIndexedOrNull(callbackIsEAlt,),).toBeNull(),)
                test("even", () => expect(new instance(AB,).findFirstIndexedOrNull(callbackIsEven,),).toBe('a',),)
                test("odd",  () => expect(new instance(AB,).findFirstIndexedOrNull(callbackIsOdd,),).toBe('b',),)
                test('0',    () => expect(new instance(AB,).findFirstIndexedOrNull(callbackIs0,),).toBe('a',),)
                test('1',    () => expect(new instance(AB,).findFirstIndexedOrNull(callbackIs1,),).toBe('b',),)
                test('4',    () => expect(new instance(AB,).findFirstIndexedOrNull(callbackIs4,),).toBeNull(),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).findFirstIndexedOrNull(callbackIsAAlt,),).toBe('a',),)
                test('b',    () => expect(new instance(ABCD,).findFirstIndexedOrNull(callbackIsBAlt,),).toBe('b',),)
                test('c',    () => expect(new instance(ABCD,).findFirstIndexedOrNull(callbackIsCAlt,),).toBe('c',),)
                test('d',    () => expect(new instance(ABCD,).findFirstIndexedOrNull(callbackIsDAlt,),).toBe('d',),)
                test('e',    () => expect(new instance(ABCD,).findFirstIndexedOrNull(callbackIsEAlt,),).toBeNull(),)
                test("even", () => expect(new instance(ABCD,).findFirstIndexedOrNull(callbackIsEven,),).toBe('a',),)
                test("odd",  () => expect(new instance(ABCD,).findFirstIndexedOrNull(callbackIsOdd,),).toBe('b',),)
                test('0',    () => expect(new instance(ABCD,).findFirstIndexedOrNull(callbackIs0,),).toBe('a',),)
                test('1',    () => expect(new instance(ABCD,).findFirstIndexedOrNull(callbackIs1,),).toBe('b',),)
                test('2',    () => expect(new instance(ABCD,).findFirstIndexedOrNull(callbackIs2,),).toBe('c',),)
                test('3',    () => expect(new instance(ABCD,).findFirstIndexedOrNull(callbackIs3,),).toBe('d',),)
                test('4',    () => expect(new instance(ABCD,).findFirstIndexedOrNull(callbackIs4,),).toBeNull(),)
            },)
        },)
        describe("findLast", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(() => new instance(EMPTY,).findLast(callbackAsFail0,),).toThrow(EmptyCollectionException,),)
                test("1 argument",  () => expect(() => new instance(EMPTY,).findLast(callbackAsFail1,),).toThrow(EmptyCollectionException,),)
                test("2 arguments", () => expect(() => new instance(EMPTY,).findLast(callbackAsFail2,),).toThrow(EmptyCollectionException,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findLast(it,),).toBe('a',),)
                    test("2 fields", () => expect(new instance(AB,).findLast(it,),).toBe('b',),)
                    test("4 fields", () => expect(new instance(ABCD,).findLast(it,),).toBe('d',),)
                },)
                describe.each(falseCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(() => new instance(A,).findLast(it,),).toThrow(IndexOutOfBoundsException,),)
                    test("2 fields", () => expect(() => new instance(AB,).findLast(it,),).toThrow(IndexOutOfBoundsException,),)
                    test("4 fields", () => expect(() => new instance(ABCD,).findLast(it,),).toThrow(IndexOutOfBoundsException,),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).findLast(callbackIsA,),).toBe('a',),)
                test('e',    () => expect(() => new instance(A,).findLast(callbackIsE,),).toThrow(IndexOutOfBoundsException,),)
                test("even", () => expect(new instance(A,).findLast(callbackIsEvenAlt,),).toBe('a',),)
                test("odd",  () => expect(() => new instance(A,).findLast(callbackIsOddAlt,),).toThrow(IndexOutOfBoundsException,),)
                test('0',    () => expect(new instance(A,).findLast(callbackIs0Alt,),).toBe('a',),)
                test('4',    () => expect(() => new instance(A,).findLast(callbackIs4Alt,),).toThrow(IndexOutOfBoundsException,),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).findLast(callbackIsA,),).toBe('a',),)
                test('b',    () => expect(new instance(AB,).findLast(callbackIsB,),).toBe('b',),)
                test('e',    () => expect(() => new instance(AB,).findLast(callbackIsE,),).toThrow(IndexOutOfBoundsException,),)
                test("even", () => expect(new instance(AB,).findLast(callbackIsEvenAlt,),).toBe('a',),)
                test("odd",  () => expect(new instance(AB,).findLast(callbackIsOddAlt,),).toBe('b',),)
                test('0',    () => expect(new instance(AB,).findLast(callbackIs0Alt,),).toBe('a',),)
                test('1',    () => expect(new instance(AB,).findLast(callbackIs1Alt,),).toBe('b',),)
                test('2',    () => expect(() => new instance(AB,).findLast(callbackIs4Alt,),).toThrow(IndexOutOfBoundsException,),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).findLast(callbackIsA,),).toBe('a',),)
                test('b',    () => expect(new instance(ABCD,).findLast(callbackIsB,),).toBe('b',),)
                test('c',    () => expect(new instance(ABCD,).findLast(callbackIsC,),).toBe('c',),)
                test('d',    () => expect(new instance(ABCD,).findLast(callbackIsD,),).toBe('d',),)
                test('e',    () => expect(() => new instance(ABCD,).findLast(callbackIsE,),).toThrow(IndexOutOfBoundsException,),)
                test("even", () => expect(new instance(ABCD,).findLast(callbackIsEvenAlt,),).toBe('c',),)
                test("odd",  () => expect(new instance(ABCD,).findLast(callbackIsOddAlt,),).toBe('d',),)
                test('0',    () => expect(new instance(ABCD,).findLast(callbackIs0Alt,),).toBe('a',),)
                test('1',    () => expect(new instance(ABCD,).findLast(callbackIs1Alt,),).toBe('b',),)
                test('2',    () => expect(new instance(ABCD,).findLast(callbackIs2Alt,),).toBe('c',),)
                test('3',    () => expect(new instance(ABCD,).findLast(callbackIs3Alt,),).toBe('d',),)
                test('4',    () => expect(() => new instance(ABCD,).findLast(callbackIs4Alt,),).toThrow(IndexOutOfBoundsException,),)
            },)
        },)
        describe("findLastOrNull", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).findLastOrNull(callbackAsFail0,),).toBeNull(),)
                test("1 argument",  () => expect(new instance(EMPTY,).findLastOrNull(callbackAsFail1,),).toBeNull(),)
                test("2 arguments", () => expect(new instance(EMPTY,).findLastOrNull(callbackAsFail2,),).toBeNull(),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findLastOrNull(it,),).toBe('a',),)
                    test("2 fields", () => expect(new instance(AB,).findLastOrNull(it,),).toBe('b',),)
                    test("4 fields", () => expect(new instance(ABCD,).findLastOrNull(it,),).toBe('d',),)
                },)
                describe.each(falseCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findLastOrNull(it,),).toBeNull(),)
                    test("2 fields", () => expect(new instance(AB,).findLastOrNull(it,),).toBeNull(),)
                    test("4 fields", () => expect(new instance(ABCD,).findLastOrNull(it,),).toBeNull(),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).findLastOrNull(callbackIsA,),).toBe('a',),)
                test('e',    () => expect(new instance(A,).findLastOrNull(callbackIsE,),).toBeNull(),)
                test("even", () => expect(new instance(A,).findLastOrNull(callbackIsEvenAlt,),).toBe('a',),)
                test("odd",  () => expect(new instance(A,).findLastOrNull(callbackIsOddAlt,),).toBeNull(),)
                test('0',    () => expect(new instance(A,).findLastOrNull(callbackIs0Alt,),).toBe('a',),)
                test('4',    () => expect(new instance(A,).findLastOrNull(callbackIs4Alt,),).toBeNull(),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).findLastOrNull(callbackIsA,),).toBe('a',),)
                test('b',    () => expect(new instance(AB,).findLastOrNull(callbackIsB,),).toBe('b',),)
                test('e',    () => expect(new instance(AB,).findLastOrNull(callbackIsE,),).toBeNull(),)
                test("even", () => expect(new instance(AB,).findLastOrNull(callbackIsEvenAlt,),).toBe('a',),)
                test("odd",  () => expect(new instance(AB,).findLastOrNull(callbackIsOddAlt,),).toBe('b',),)
                test('0',    () => expect(new instance(AB,).findLastOrNull(callbackIs0Alt,),).toBe('a',),)
                test('1',    () => expect(new instance(AB,).findLastOrNull(callbackIs1Alt,),).toBe('b',),)
                test('2',    () => expect(new instance(AB,).findLastOrNull(callbackIs4Alt,),).toBeNull(),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).findLastOrNull(callbackIsA,),).toBe('a',),)
                test('b',    () => expect(new instance(ABCD,).findLastOrNull(callbackIsB,),).toBe('b',),)
                test('c',    () => expect(new instance(ABCD,).findLastOrNull(callbackIsC,),).toBe('c',),)
                test('d',    () => expect(new instance(ABCD,).findLastOrNull(callbackIsD,),).toBe('d',),)
                test('e',    () => expect(new instance(ABCD,).findLastOrNull(callbackIsE,),).toBeNull(),)
                test("even", () => expect(new instance(ABCD,).findLastOrNull(callbackIsEvenAlt,),).toBe('c',),)
                test("odd",  () => expect(new instance(ABCD,).findLastOrNull(callbackIsOddAlt,),).toBe('d',),)
                test('0',    () => expect(new instance(ABCD,).findLastOrNull(callbackIs0Alt,),).toBe('a',),)
                test('1',    () => expect(new instance(ABCD,).findLastOrNull(callbackIs1Alt,),).toBe('b',),)
                test('2',    () => expect(new instance(ABCD,).findLastOrNull(callbackIs2Alt,),).toBe('c',),)
                test('3',    () => expect(new instance(ABCD,).findLastOrNull(callbackIs3Alt,),).toBe('d',),)
                test('4',    () => expect(new instance(ABCD,).findLastOrNull(callbackIs4Alt,),).toBeNull(),)
            },)
        },)
        describe("findLastIndexed", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(() => new instance(EMPTY,).findLastIndexed(callbackAsFail0,),).toThrow(EmptyCollectionException,),)
                test("1 argument",  () => expect(() => new instance(EMPTY,).findLastIndexed(callbackAsFail1,),).toThrow(EmptyCollectionException,),)
                test("2 arguments", () => expect(() => new instance(EMPTY,).findLastIndexed(callbackAsFail2,),).toThrow(EmptyCollectionException,),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findLastIndexed(it,),).toBe('a',),)
                    test("2 fields", () => expect(new instance(AB,).findLastIndexed(it,),).toBe('b',),)
                    test("4 fields", () => expect(new instance(ABCD,).findLastIndexed(it,),).toBe('d',),)
                },)
                describe.each(falseCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(() => new instance(A,).findLastIndexed(it,),).toThrow(IndexOutOfBoundsException,),)
                    test("2 fields", () => expect(() => new instance(AB,).findLastIndexed(it,),).toThrow(IndexOutOfBoundsException,),)
                    test("4 fields", () => expect(() => new instance(ABCD,).findLastIndexed(it,),).toThrow(IndexOutOfBoundsException,),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).findLastIndexed(callbackIsAAlt,),).toBe('a',),)
                test('e',    () => expect(() => new instance(A,).findLastIndexed(callbackIsEAlt,),).toThrow(IndexOutOfBoundsException,),)
                test("even", () => expect(new instance(A,).findLastIndexed(callbackIsEven,),).toBe('a',),)
                test("odd",  () => expect(() => new instance(A,).findLastIndexed(callbackIsOdd,),).toThrow(IndexOutOfBoundsException,),)
                test('0',    () => expect(new instance(A,).findLastIndexed(callbackIs0,),).toBe('a',),)
                test('4',    () => expect(() => new instance(A,).findLastIndexed(callbackIs4,),).toThrow(IndexOutOfBoundsException,),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).findLastIndexed(callbackIsAAlt,),).toBe('a',),)
                test('b',    () => expect(new instance(AB,).findLastIndexed(callbackIsBAlt,),).toBe('b',),)
                test('e',    () => expect(() => new instance(AB,).findLastIndexed(callbackIsEAlt,),).toThrow(IndexOutOfBoundsException,),)
                test("even", () => expect(new instance(AB,).findLastIndexed(callbackIsEven,),).toBe('a',),)
                test("odd",  () => expect(new instance(AB,).findLastIndexed(callbackIsOdd,),).toBe('b',),)
                test('0',    () => expect(new instance(AB,).findLastIndexed(callbackIs0,),).toBe('a',),)
                test('1',    () => expect(new instance(AB,).findLastIndexed(callbackIs1,),).toBe('b',),)
                test('4',    () => expect(() => new instance(AB,).findLastIndexed(callbackIs4,),).toThrow(IndexOutOfBoundsException,),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).findLastIndexed(callbackIsAAlt,),).toBe('a',),)
                test('b',    () => expect(new instance(ABCD,).findLastIndexed(callbackIsBAlt,),).toBe('b',),)
                test('c',    () => expect(new instance(ABCD,).findLastIndexed(callbackIsCAlt,),).toBe('c',),)
                test('d',    () => expect(new instance(ABCD,).findLastIndexed(callbackIsDAlt,),).toBe('d',),)
                test('e',    () => expect(() => new instance(ABCD,).findLastIndexed(callbackIsEAlt,),).toThrow(IndexOutOfBoundsException,),)
                test("even", () => expect(new instance(ABCD,).findLastIndexed(callbackIsEven,),).toBe('c',),)
                test("odd",  () => expect(new instance(ABCD,).findLastIndexed(callbackIsOdd,),).toBe('d',),)
                test('0',    () => expect(new instance(ABCD,).findLastIndexed(callbackIs0,),).toBe('a',),)
                test('1',    () => expect(new instance(ABCD,).findLastIndexed(callbackIs1,),).toBe('b',),)
                test('2',    () => expect(new instance(ABCD,).findLastIndexed(callbackIs2,),).toBe('c',),)
                test('3',    () => expect(new instance(ABCD,).findLastIndexed(callbackIs3,),).toBe('d',),)
                test('4',    () => expect(() => new instance(ABCD,).findLastIndexed(callbackIs4,),).toThrow(IndexOutOfBoundsException,),)
            },)
        },)
        describe("findLastIndexedOrNull", () => {
            describe("empty", () => {
                test("0 arguments", () => expect(new instance(EMPTY,).findLastIndexedOrNull(callbackAsFail0,),).toBeNull(),)
                test("1 argument",  () => expect(new instance(EMPTY,).findLastIndexedOrNull(callbackAsFail1,),).toBeNull(),)
                test("2 arguments", () => expect(new instance(EMPTY,).findLastIndexedOrNull(callbackAsFail2,),).toBeNull(),)
            },)
            describe("boolean callbacks", () => {
                describe.each(trueCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findLastIndexedOrNull(it,),).toBe('a',),)
                    test("2 fields", () => expect(new instance(AB,).findLastIndexedOrNull(it,),).toBe('b',),)
                    test("4 fields", () => expect(new instance(ABCD,).findLastIndexedOrNull(it,),).toBe('d',),)
                },)
                describe.each(falseCallbacks,)("true: %s", ({value: it,},) => {
                    test("1 field",  () => expect(new instance(A,).findLastIndexedOrNull(it,),).toBeNull(),)
                    test("2 fields", () => expect(new instance(AB,).findLastIndexedOrNull(it,),).toBeNull(),)
                    test("4 fields", () => expect(new instance(ABCD,).findLastIndexedOrNull(it,),).toBeNull(),)
                },)
            },)
            describe("1 field", () => {
                test('a',    () => expect(new instance(A,).findLastIndexedOrNull(callbackIsAAlt,),).toBe('a',),)
                test('e',    () => expect(new instance(A,).findLastIndexedOrNull(callbackIsEAlt,),).toBeNull(),)
                test("even", () => expect(new instance(A,).findLastIndexedOrNull(callbackIsEven,),).toBe('a',),)
                test("odd",  () => expect(new instance(A,).findLastIndexedOrNull(callbackIsOdd,),).toBeNull(),)
                test('0',    () => expect(new instance(A,).findLastIndexedOrNull(callbackIs0,),).toBe('a',),)
                test('4',    () => expect(new instance(A,).findLastIndexedOrNull(callbackIs4,),).toBeNull(),)
            },)
            describe("2 fields", () => {
                test('a',    () => expect(new instance(AB,).findLastIndexedOrNull(callbackIsAAlt,),).toBe('a',),)
                test('b',    () => expect(new instance(AB,).findLastIndexedOrNull(callbackIsBAlt,),).toBe('b',),)
                test('e',    () => expect(new instance(AB,).findLastIndexedOrNull(callbackIsEAlt,),).toBeNull(),)
                test("even", () => expect(new instance(AB,).findLastIndexedOrNull(callbackIsEven,),).toBe('a',),)
                test("odd",  () => expect(new instance(AB,).findLastIndexedOrNull(callbackIsOdd,),).toBe('b',),)
                test('0',    () => expect(new instance(AB,).findLastIndexedOrNull(callbackIs0,),).toBe('a',),)
                test('1',    () => expect(new instance(AB,).findLastIndexedOrNull(callbackIs1,),).toBe('b',),)
                test('4',    () => expect(new instance(AB,).findLastIndexedOrNull(callbackIs4,),).toBeNull(),)
            },)
            describe("4 fields", () => {
                test('a',    () => expect(new instance(ABCD,).findLastIndexedOrNull(callbackIsAAlt,),).toBe('a',),)
                test('b',    () => expect(new instance(ABCD,).findLastIndexedOrNull(callbackIsBAlt,),).toBe('b',),)
                test('c',    () => expect(new instance(ABCD,).findLastIndexedOrNull(callbackIsCAlt,),).toBe('c',),)
                test('d',    () => expect(new instance(ABCD,).findLastIndexedOrNull(callbackIsDAlt,),).toBe('d',),)
                test('e',    () => expect(new instance(ABCD,).findLastIndexedOrNull(callbackIsEAlt,),).toBeNull(),)
                test("even", () => expect(new instance(ABCD,).findLastIndexedOrNull(callbackIsEven,),).toBe('c',),)
                test("odd",  () => expect(new instance(ABCD,).findLastIndexedOrNull(callbackIsOdd,),).toBe('d',),)
                test('0',    () => expect(new instance(ABCD,).findLastIndexedOrNull(callbackIs0,),).toBe('a',),)
                test('1',    () => expect(new instance(ABCD,).findLastIndexedOrNull(callbackIs1,),).toBe('b',),)
                test('2',    () => expect(new instance(ABCD,).findLastIndexedOrNull(callbackIs2,),).toBe('c',),)
                test('3',    () => expect(new instance(ABCD,).findLastIndexedOrNull(callbackIs3,),).toBe('d',),)
                test('4',    () => expect(new instance(ABCD,).findLastIndexedOrNull(callbackIs4,),).toBeNull(),)
            },)
        },)
    },)

},)
