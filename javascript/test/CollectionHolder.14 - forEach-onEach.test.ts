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

import {expectToBeInstance}                                                         from "./expect/expectToBeInstance"
import {EmptyCollectionHolderForTest}                                               from "./instance/EmptyCollectionHolderForTest"
import {A, AB, ABCD, EMPTY}                                                         from "./value/arrays"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                          from "./value/callbacks (fail)"
import {callbackAsString0, callbackAsString1, callbackAsString2, callbackToString0} from "./value/callbacks (string)"
import {everyCollectionInstancesAndExtensionFunctionAsCollectionHolder}             from "./value/instances"

describe("CollectionHolderTest (forEach / onEach)", () => {

    describe("EmptyCollectionHolder", () => {
        test.skip("forEach",        () => {},)
        test.skip("forEachIndexed", () => {},)
        test("onEach",              () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.onEach(),),)
        test("onEachIndexed",       () => expectToBeInstance(new EmptyCollectionHolderForTest(), it => it.onEachIndexed(),),)
    },)

    describe.each(everyCollectionInstancesAndExtensionFunctionAsCollectionHolder,)("%s", ({value: {instance, isExtension,},},) => {
        if (!isExtension)
            describe("get() being called", () => {
                describe("forEach", () => {
                    test("empty: 0 arguments",    () => expect(new instance(EMPTY,).execute(it => it.forEach(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                    test("empty: 1 argument",     () => expect(new instance(EMPTY,).execute(it => it.forEach(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                    test("empty: 2 arguments",    () => expect(new instance(EMPTY,).execute(it => it.forEach(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    test("1 field: 0 arguments",  () => expect(new instance(A,).execute(it => it.forEach(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("1 field: 1 argument",   () => expect(new instance(A,).execute(it => it.forEach(callbackAsString1,),).amountOfCall,).toBe(1,),)
                    test("1 field: 2 arguments",  () => expect(new instance(A,).execute(it => it.forEach(callbackAsString2,),).amountOfCall,).toBe(1,),)
                    test("2 fields: 0 arguments", () => expect(new instance(AB,).execute(it => it.forEach(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("2 fields: 1 argument",  () => expect(new instance(AB,).execute(it => it.forEach(callbackAsString1,),).amountOfCall,).toBe(2,),)
                    test("2 fields: 2 arguments", () => expect(new instance(AB,).execute(it => it.forEach(callbackAsString2,),).amountOfCall,).toBe(2,),)
                    test("4 fields: 0 arguments", () => expect(new instance(ABCD,).execute(it => it.forEach(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("4 fields: 1 argument",  () => expect(new instance(ABCD,).execute(it => it.forEach(callbackAsString1,),).amountOfCall,).toBe(4,),)
                    test("4 fields: 2 arguments", () => expect(new instance(ABCD,).execute(it => it.forEach(callbackAsString2,),).amountOfCall,).toBe(4,),)
                },)
                describe("forEachIndexed", () => {
                    test("empty: 0 arguments",    () => expect(new instance(EMPTY,).execute(it => it.forEachIndexed(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                    test("empty: 1 argument",     () => expect(new instance(EMPTY,).execute(it => it.forEachIndexed(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                    test("empty: 2 arguments",    () => expect(new instance(EMPTY,).execute(it => it.forEachIndexed(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    test("1 field: 0 arguments",  () => expect(new instance(A,).execute(it => it.forEachIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("1 field: 1 argument",   () => expect(new instance(A,).execute(it => it.forEachIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                    test("1 field: 2 arguments",  () => expect(new instance(A,).execute(it => it.forEachIndexed(callbackAsString2,),).amountOfCall,).toBe(1,),)
                    test("2 fields: 0 arguments", () => expect(new instance(AB,).execute(it => it.forEachIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("2 fields: 1 argument",  () => expect(new instance(AB,).execute(it => it.forEachIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                    test("2 fields: 2 arguments", () => expect(new instance(AB,).execute(it => it.forEachIndexed(callbackAsString2,),).amountOfCall,).toBe(2,),)
                    test("4 fields: 0 arguments", () => expect(new instance(ABCD,).execute(it => it.forEachIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("4 fields: 1 argument",  () => expect(new instance(ABCD,).execute(it => it.forEachIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                    test("4 fields: 2 arguments", () => expect(new instance(ABCD,).execute(it => it.forEachIndexed(callbackAsString2,),).amountOfCall,).toBe(4,),)
                },)
                describe("onEach", () => {
                    test("empty: 0 arguments",    () => expect(new instance(EMPTY,).execute(it => it.onEach(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                    test("empty: 1 argument",     () => expect(new instance(EMPTY,).execute(it => it.onEach(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                    test("empty: 2 arguments",    () => expect(new instance(EMPTY,).execute(it => it.onEach(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    test("1 field: 0 arguments",  () => expect(new instance(A,).execute(it => it.onEach(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("1 field: 1 argument",   () => expect(new instance(A,).execute(it => it.onEach(callbackAsString1,),).amountOfCall,).toBe(1,),)
                    test("1 field: 2 arguments",  () => expect(new instance(A,).execute(it => it.onEach(callbackAsString2,),).amountOfCall,).toBe(1,),)
                    test("2 fields: 0 arguments", () => expect(new instance(AB,).execute(it => it.onEach(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("2 fields: 1 argument",  () => expect(new instance(AB,).execute(it => it.onEach(callbackAsString1,),).amountOfCall,).toBe(2,),)
                    test("2 fields: 2 arguments", () => expect(new instance(AB,).execute(it => it.onEach(callbackAsString2,),).amountOfCall,).toBe(2,),)
                    test("4 fields: 0 arguments", () => expect(new instance(ABCD,).execute(it => it.onEach(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("4 fields: 1 argument",  () => expect(new instance(ABCD,).execute(it => it.onEach(callbackAsString1,),).amountOfCall,).toBe(4,),)
                    test("4 fields: 2 arguments", () => expect(new instance(ABCD,).execute(it => it.onEach(callbackAsString2,),).amountOfCall,).toBe(4,),)
                },)
                describe("onEachIndexed", () => {
                    test("empty: 0 arguments",    () => expect(new instance(EMPTY,).execute(it => it.onEachIndexed(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                    test("empty: 1 argument",     () => expect(new instance(EMPTY,).execute(it => it.onEachIndexed(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                    test("empty: 2 arguments",    () => expect(new instance(EMPTY,).execute(it => it.onEachIndexed(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                    test("1 field: 0 arguments",  () => expect(new instance(A,).execute(it => it.onEachIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("1 field: 1 argument",   () => expect(new instance(A,).execute(it => it.onEachIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                    test("1 field: 2 arguments",  () => expect(new instance(A,).execute(it => it.onEachIndexed(callbackAsString2,),).amountOfCall,).toBe(1,),)
                    test("2 fields: 0 arguments", () => expect(new instance(AB,).execute(it => it.onEachIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("2 fields: 1 argument",  () => expect(new instance(AB,).execute(it => it.onEachIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                    test("2 fields: 2 arguments", () => expect(new instance(AB,).execute(it => it.onEachIndexed(callbackAsString2,),).amountOfCall,).toBe(2,),)
                    test("4 fields: 0 arguments", () => expect(new instance(ABCD,).execute(it => it.onEachIndexed(callbackAsString0,),).amountOfCall,).toBe(0,),)
                    test("4 fields: 1 argument",  () => expect(new instance(ABCD,).execute(it => it.onEachIndexed(callbackAsString1,),).amountOfCall,).toBe(0,),)
                    test("4 fields: 2 arguments", () => expect(new instance(ABCD,).execute(it => it.onEachIndexed(callbackAsString2,),).amountOfCall,).toBe(4,),)
                },)
            },)

        describe("onEach", () => {
            test("empty: 0 arguments",    () => expectToBeInstance(new instance(EMPTY,), it => it.onEach(callbackAsFail0,),),)
            test("empty: 1 argument",     () => expectToBeInstance(new instance(EMPTY,), it => it.onEach(callbackAsFail1,),),)
            test("empty: 2 arguments",    () => expectToBeInstance(new instance(EMPTY,), it => it.onEach(callbackAsFail2,),),)
            test("1 field: 0 arguments",  () => expectToBeInstance(new instance(A,), it => it.onEach(callbackAsString0,),),)
            test("1 field: 1 argument",   () => expectToBeInstance(new instance(A,), it => it.onEach(callbackAsString1,),),)
            test("1 field: 2 arguments",  () => expectToBeInstance(new instance(A,), it => it.onEach(callbackAsString2,),),)
            test("2 fields: 0 arguments", () => expectToBeInstance(new instance(AB,), it => it.onEach(callbackToString0,),),)
            test("2 fields: 1 argument",  () => expectToBeInstance(new instance(AB,), it => it.onEach(callbackAsString2,),),)
            test("2 fields: 2 arguments", () => expectToBeInstance(new instance(AB,), it => it.onEach(callbackAsString2,),),)
            test("4 fields: 0 arguments", () => expectToBeInstance(new instance(ABCD,), it => it.onEach(callbackToString0,),),)
            test("4 fields: 1 argument",  () => expectToBeInstance(new instance(ABCD,), it => it.onEach(callbackAsString2,),),)
            test("4 fields: 2 arguments", () => expectToBeInstance(new instance(ABCD,), it => it.onEach(callbackAsString2,),),)
        },)
        describe("onEachIndexed", () => {
            test("empty: 0 arguments",    () => expectToBeInstance(new instance(EMPTY,), it => it.onEachIndexed(callbackAsFail0,),),)
            test("empty: 1 argument",     () => expectToBeInstance(new instance(EMPTY,), it => it.onEachIndexed(callbackAsFail1,),),)
            test("empty: 2 arguments",    () => expectToBeInstance(new instance(EMPTY,), it => it.onEachIndexed(callbackAsFail2,),),)
            test("1 field: 0 arguments",  () => expectToBeInstance(new instance(A,), it => it.onEachIndexed(callbackAsString0,),),)
            test("1 field: 1 argument",   () => expectToBeInstance(new instance(A,), it => it.onEachIndexed(callbackAsString1,),),)
            test("1 field: 2 arguments",  () => expectToBeInstance(new instance(A,), it => it.onEachIndexed(callbackAsString2,),),)
            test("2 fields: 0 arguments", () => expectToBeInstance(new instance(AB,), it => it.onEachIndexed(callbackToString0,),),)
            test("2 fields: 1 argument",  () => expectToBeInstance(new instance(AB,), it => it.onEachIndexed(callbackAsString2,),),)
            test("2 fields: 2 arguments", () => expectToBeInstance(new instance(AB,), it => it.onEachIndexed(callbackAsString2,),),)
            test("4 fields: 0 arguments", () => expectToBeInstance(new instance(ABCD,), it => it.onEachIndexed(callbackToString0,),),)
            test("4 fields: 1 argument",  () => expectToBeInstance(new instance(ABCD,), it => it.onEachIndexed(callbackAsString2,),),)
            test("4 fields: 2 arguments", () => expectToBeInstance(new instance(ABCD,), it => it.onEachIndexed(callbackAsString2,),),)
        },)
    },)

},)
