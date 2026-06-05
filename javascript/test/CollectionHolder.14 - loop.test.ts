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

import {expectToBeInstance}                                                                                from "./expect/expectToBeInstance"
import {ABCD}                                                                                              from "./value/arrays"
import {callback0, callback1, callback2}                                                                   from "./value/callbacks"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                 from "./value/callbacks (fail)"
import {every0Instances, every1Instances, every2Instances, everyExtensionMethodInstances, everyNInstances} from "./value/instances"

import {EmptyCollectionHolder} from "../src/EmptyCollectionHolder"

describe("CollectionHolderTest (forEach / onEach)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("forEach",        () => expect(() => instance.forEach(callbackAsFail0,),).not.toThrow(),)
        test("forEachIndexed", () => expect(() => instance.forEachIndexed(callbackAsFail0,),).not.toThrow(),)
        test("onEach",         () => expect(instance.onEach(),).toBe(instance,),)
        test("onEachIndexed",  () => expect(instance.onEachIndexed(),).toBe(instance,),)
    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance,},},) => {
        describe("forEach",         () => expect(() => instance.forEach(callbackAsFail0,),).not.toThrow(),)
        describe("forEachIndexed",  () => expect(() => instance.forEachIndexed(callbackAsFail0,),).not.toThrow(),)
        describe("onEach",          () => expect(instance.onEach(callbackAsFail0,),).toBe(instance,),)
        describe("onEachIndexed",   () => expect(instance.onEachIndexed(callbackAsFail0,),).toBe(instance,),)
    },)},)

    describe("instances", () => {
        describe("empty", () => {
        describe.each(every0Instances,)("%s", ({value: {newInstance, isLazy, isViewer, isAdaptor,},},) => {

            // The adaptor instances are ignored since they do not rely on get() directly
            // The lazy instances are ignored since they are only an encapsulator class
            // The viewer instances are ignored since they do rely on inner instances
            if (!isAdaptor && !isLazy && !isViewer)
                describe("get() being called", () => {
                    describe("forEach", () => {
                        test("empty: (T, number) → void", () => expect(newInstance().execute(it => it.forEach(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                        test("empty: (T) → void",         () => expect(newInstance().execute(it => it.forEach(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("empty: () → void",          () => expect(newInstance().execute(it => it.forEach(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("forEachIndexed", () => {
                        test("empty: (number, T) → void", () => expect(newInstance().execute(it => it.forEachIndexed(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                        test("empty: (number) → void",    () => expect(newInstance().execute(it => it.forEachIndexed(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("empty: () → void",          () => expect(newInstance().execute(it => it.forEachIndexed(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                    },)

                    describe("onEach", () => {
                        test("empty: (T, number) → void", () => expect(newInstance().execute(it => it.onEach(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                        test("empty: (T) → void",         () => expect(newInstance().execute(it => it.onEach(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("empty: () → void",          () => expect(newInstance().execute(it => it.onEach(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("onEachIndexed", () => {
                        test("empty: (number, T) → void", () => expect(newInstance().execute(it => it.onEachIndexed(callbackAsFail2,),).amountOfCall,).toBe(0,),)
                        test("empty: (number) → void",    () => expect(newInstance().execute(it => it.onEachIndexed(callbackAsFail1,),).amountOfCall,).toBe(0,),)
                        test("empty: () → void",          () => expect(newInstance().execute(it => it.onEachIndexed(callbackAsFail0,),).amountOfCall,).toBe(0,),)
                    },)
                },)

            describe("onEach", () => {
                test("empty: (T, number) → void", () => expectToBeInstance(newInstance(), it => it.onEach(callbackAsFail2,),),)
                test("empty: (T) → void",         () => expectToBeInstance(newInstance(), it => it.onEach(callbackAsFail1,),),)
                test("empty: () → void",          () => expectToBeInstance(newInstance(), it => it.onEach(callbackAsFail0,),),)
            },)
            describe("onEachIndexed", () => {
                test("empty: (number, T) → void", () => expectToBeInstance(newInstance(), it => it.onEachIndexed(callbackAsFail2,),),)
                test("empty: (number) → void",    () => expectToBeInstance(newInstance(), it => it.onEachIndexed(callbackAsFail1,),),)
                test("empty: () → void",          () => expectToBeInstance(newInstance(), it => it.onEachIndexed(callbackAsFail0,),),)
            },)

        },)},)
        describe("1 field", () => {
        describe.each(every1Instances,)("%s", ({value: {newInstance, isAdaptor, isLazy, isOf1, isViewer,},},) => {

            // The adaptor instances are ignored since they do not rely on get() directly
            // The lazy instances are ignored since they are only an encapsulator class
            // The instances of 1 are ignored since the get() is never called, it is "get value1" being called
            // The viewer instances are ignored since they do rely on inner instances
            if (!isAdaptor && !isLazy && !isOf1 && !isViewer)
                describe("get() being called", () => {
                    describe("forEach", () => {
                        test("1 field: (T, number) → void", () => expect(newInstance('a',).execute(it => it.forEach(callback2,),).amountOfCall,).toBe(1,),)
                        test("1 field: (T) → void",         () => expect(newInstance('a',).execute(it => it.forEach(callback1,),).amountOfCall,).toBe(1,),)
                        test("1 field: () → void",          () => expect(newInstance('a',).execute(it => it.forEach(callback0,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("forEachIndexed", () => {
                        test("1 field: (number, T) → void", () => expect(newInstance('a',).execute(it => it.forEachIndexed(callback2,),).amountOfCall,).toBe(1,),)
                        test("1 field: (number) → void",    () => expect(newInstance('a',).execute(it => it.forEachIndexed(callback1,),).amountOfCall,).toBe(0,),)
                        test("1 field: () → void",          () => expect(newInstance('a',).execute(it => it.forEachIndexed(callback0,),).amountOfCall,).toBe(0,),)
                    },)

                    describe("onEach", () => {
                        test("1 field: (T, number) → void", () => expect(newInstance('a',).execute(it => it.onEach(callback2,),).amountOfCall,).toBe(1,),)
                        test("1 field: (T) → void",         () => expect(newInstance('a',).execute(it => it.onEach(callback1,),).amountOfCall,).toBe(1,),)
                        test("1 field: () → void",          () => expect(newInstance('a',).execute(it => it.onEach(callback0,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("onEachIndexed", () => {
                        test("1 field: (number, T) → void", () => expect(newInstance('a',).execute(it => it.onEachIndexed(callback2,),).amountOfCall,).toBe(1,),)
                        test("1 field: (number) → void",    () => expect(newInstance('a',).execute(it => it.onEachIndexed(callback1,),).amountOfCall,).toBe(0,),)
                        test("1 field: () → void",          () => expect(newInstance('a',).execute(it => it.onEachIndexed(callback0,),).amountOfCall,).toBe(0,),)
                    },)
                },)

            describe("onEach", () => {
                test("1 field: (T, number) → void", () => expectToBeInstance(newInstance('a',), it => it.onEach(callback2,),),)
                test("1 field: (T) → void",         () => expectToBeInstance(newInstance('a',), it => it.onEach(callback1,),),)
                test("1 field: () → void",          () => expectToBeInstance(newInstance('a',), it => it.onEach(callback0,),),)
            },)
            describe("onEachIndexed", () => {
                test("1 field: (number, T) → void", () => expectToBeInstance(newInstance('a',), it => it.onEachIndexed(callback2,),),)
                test("1 field: (number) → void",    () => expectToBeInstance(newInstance('a',), it => it.onEachIndexed(callback1,),),)
                test("1 field: () → void",          () => expectToBeInstance(newInstance('a',), it => it.onEachIndexed(callback0,),),)
            },)

        },)},)
        describe("2 fields", () => {
        describe.each(every2Instances,)("%s", ({value: {newInstance, isAdaptor, isLazy, isOf2, isViewer,},},) => {

            // The adaptor instances are ignored since they do not rely on get() directly
            // The lazy instances are ignored since they are only an encapsulator class
            // The instances of 2 are ignored since the get() is never called, it is "get value1|2" being called
            // The viewer instances are ignored since they do rely on inner instances
            if (!isAdaptor && !isLazy && !isOf2 && !isViewer)
                describe("get() being called", () => {
                    describe("forEach", () => {
                        test("(T, number) → void", () => expect(newInstance('a', 'b',).execute(it => it.forEach(callback2,),).amountOfCall,).toBe(2,),)
                        test("(T) → void",         () => expect(newInstance('a', 'b',).execute(it => it.forEach(callback1,),).amountOfCall,).toBe(2,),)
                        test("() → void",          () => expect(newInstance('a', 'b',).execute(it => it.forEach(callback0,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("forEachIndexed", () => {
                        test("(number, T) → void", () => expect(newInstance('a', 'b',).execute(it => it.forEachIndexed(callback2,),).amountOfCall,).toBe(2,),)
                        test("(number) → void",    () => expect(newInstance('a', 'b',).execute(it => it.forEachIndexed(callback1,),).amountOfCall,).toBe(0,),)
                        test("() → void",          () => expect(newInstance('a', 'b',).execute(it => it.forEachIndexed(callback0,),).amountOfCall,).toBe(0,),)
                    },)

                    describe("onEach", () => {
                        test("(T, number) → void", () => expect(newInstance('a', 'b',).execute(it => it.onEach(callback2,),).amountOfCall,).toBe(2,),)
                        test("(T) → void",         () => expect(newInstance('a', 'b',).execute(it => it.onEach(callback1,),).amountOfCall,).toBe(2,),)
                        test("() → void",          () => expect(newInstance('a', 'b',).execute(it => it.onEach(callback0,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("onEachIndexed", () => {
                        test("(number, T) → void", () => expect(newInstance('a', 'b',).execute(it => it.onEachIndexed(callback2,),).amountOfCall,).toBe(2,),)
                        test("(number) → void",    () => expect(newInstance('a', 'b',).execute(it => it.onEachIndexed(callback1,),).amountOfCall,).toBe(0,),)
                        test("() → void",          () => expect(newInstance('a', 'b',).execute(it => it.onEachIndexed(callback0,),).amountOfCall,).toBe(0,),)
                    },)
                },)

            describe("onEach", () => {
                test("(T, number) → void", () => expectToBeInstance(newInstance('a', 'b',), it => it.onEach(callback2,),),)
                test("(T) → void",         () => expectToBeInstance(newInstance('a', 'b',), it => it.onEach(callback2,),),)
                test("() → void",          () => expectToBeInstance(newInstance('a', 'b',), it => it.onEach(callback0,),),)
            },)
            describe("onEachIndexed", () => {
                test("(number, T) → void", () => expectToBeInstance(newInstance('a', 'b',), it => it.onEachIndexed(callback2,),),)
                test("(number) → void",    () => expectToBeInstance(newInstance('a', 'b',), it => it.onEachIndexed(callback2,),),)
                test("() → void",          () => expectToBeInstance(newInstance('a', 'b',), it => it.onEachIndexed(callback0,),),)
            },)

        },)},)
        describe("N fields", () => {
        describe.each(everyNInstances,)("%s", ({value: {instance, isAdaptor, isLazy, isViewer,},},) => {

            // The adaptor instances are ignored since they do not rely on get() directly
            // The lazy instances are ignored since they are only an encapsulator class
            // The viewer instances are ignored since they do rely on inner instances
            if (!isAdaptor && !isLazy && !isViewer)
                describe("get() being called", () => {
                    describe("forEach", () => {
                        test("(T, number) → void", () => expect(new instance(ABCD,).execute(it => it.forEach(callback2,),).amountOfCall,).toBe(4,),)
                        test("(T) → void",         () => expect(new instance(ABCD,).execute(it => it.forEach(callback1,),).amountOfCall,).toBe(4,),)
                        test("() → void",          () => expect(new instance(ABCD,).execute(it => it.forEach(callback0,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("forEachIndexed", () => {
                        test("(number, T) → void", () => expect(new instance(ABCD,).execute(it => it.forEachIndexed(callback2,),).amountOfCall,).toBe(4,),)
                        test("(number) → void",    () => expect(new instance(ABCD,).execute(it => it.forEachIndexed(callback1,),).amountOfCall,).toBe(0,),)
                        test("() → void",          () => expect(new instance(ABCD,).execute(it => it.forEachIndexed(callback0,),).amountOfCall,).toBe(0,),)
                    },)

                    describe("onEach", () => {
                        test("(T, number) → void", () => expect(new instance(ABCD,).execute(it => it.onEach(callback2,),).amountOfCall,).toBe(4,),)
                        test("(T) → void",         () => expect(new instance(ABCD,).execute(it => it.onEach(callback1,),).amountOfCall,).toBe(4,),)
                        test("() → void",          () => expect(new instance(ABCD,).execute(it => it.onEach(callback0,),).amountOfCall,).toBe(0,),)
                    },)
                    describe("onEachIndexed", () => {
                        test("(number, T) → void", () => expect(new instance(ABCD,).execute(it => it.onEachIndexed(callback2,),).amountOfCall,).toBe(4,),)
                        test("(number) → void",    () => expect(new instance(ABCD,).execute(it => it.onEachIndexed(callback1,),).amountOfCall,).toBe(0,),)
                        test("() → void",          () => expect(new instance(ABCD,).execute(it => it.onEachIndexed(callback0,),).amountOfCall,).toBe(0,),)
                    },)
                },)

            describe("onEach", () => {
                test("(T, number) → void", () => expectToBeInstance(new instance(ABCD,), it =>  it.onEach(callback2,),),)
                test("(T) → void",         () => expectToBeInstance(new instance(ABCD,), it =>  it.onEach(callback2,),),)
                test("() → void",          () => expectToBeInstance(new instance(ABCD,), it =>  it.onEach(callback0,),),)
            },)
            describe("onEachIndexed", () => {
                test("(number, T) → void", () => expectToBeInstance(new instance(ABCD,), it =>  it.onEachIndexed(callback2,),),)
                test("(number) → void",    () => expectToBeInstance(new instance(ABCD,), it =>  it.onEachIndexed(callback2,),),)
                test("() → void",          () => expectToBeInstance(new instance(ABCD,), it =>  it.onEachIndexed(callback0,),),)
            },)

        },)},)
    },)

},)
