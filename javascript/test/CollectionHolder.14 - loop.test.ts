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

import {expectToBeInstance}                                from "./expect/expectToBeInstance"
import {A, AB, ABCD, EMPTY}                                from "./value/arrays"
import {callback0, callback1, callback2}                   from "./value/callbacks"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2} from "./value/callbacks (fail)"
import {everyExtensionMethodInstances, everyInstances}     from "./value/instances"

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
    describe.each(everyInstances,)("%s", ({value: {instance,},},) => {
        describe("get() being called", () => {
            describe("forEach", () => {
                test("empty: (T, number) → void",    () => expect(new instance(EMPTY,).execute(it => it.forEach(callbackAsFail2,),)  .amountOfCall,).toBe(0,),)
                test("empty: (T) → void",            () => expect(new instance(EMPTY,).execute(it => it.forEach(callbackAsFail1,),)  .amountOfCall,).toBe(0,),)
                test("empty: () → void",             () => expect(new instance(EMPTY,).execute(it => it.forEach(callbackAsFail0,),)  .amountOfCall,).toBe(0,),)
                test("1 field: (T, number) → void",  () => expect(new instance(A,)    .execute(it => it.forEach(callback2,),).amountOfCall,).toBe(1,),)
                test("1 field: (T) → void",          () => expect(new instance(A,)    .execute(it => it.forEach(callback1,),).amountOfCall,).toBe(1,),)
                test("1 field: () → void",           () => expect(new instance(A,)    .execute(it => it.forEach(callback0,),).amountOfCall,).toBe(0,),)
                test("2 fields: (T, number) → void", () => expect(new instance(AB,)   .execute(it => it.forEach(callback2,),).amountOfCall,).toBe(2,),)
                test("2 fields: (T) → void",         () => expect(new instance(AB,)   .execute(it => it.forEach(callback1,),).amountOfCall,).toBe(2,),)
                test("2 fields: () → void",          () => expect(new instance(AB,)   .execute(it => it.forEach(callback0,),).amountOfCall,).toBe(0,),)
                test("4 fields: (T, number) → void", () => expect(new instance(ABCD,) .execute(it => it.forEach(callback2,),).amountOfCall,).toBe(4,),)
                test("4 fields: (T) → void",         () => expect(new instance(ABCD,) .execute(it => it.forEach(callback1,),).amountOfCall,).toBe(4,),)
                test("4 fields: () → void",          () => expect(new instance(ABCD,) .execute(it => it.forEach(callback0,),).amountOfCall,).toBe(0,),)
            },)
            describe("forEachIndexed", () => {
                test("empty: (number, T) → void",    () => expect(new instance(EMPTY,).execute(it => it.forEachIndexed(callbackAsFail2,),)  .amountOfCall,).toBe(0,),)
                test("empty: (number) → void",       () => expect(new instance(EMPTY,).execute(it => it.forEachIndexed(callbackAsFail1,),)  .amountOfCall,).toBe(0,),)
                test("empty: () → void",             () => expect(new instance(EMPTY,).execute(it => it.forEachIndexed(callbackAsFail0,),)  .amountOfCall,).toBe(0,),)
                test("1 field: (number, T) → void",  () => expect(new instance(A,)    .execute(it => it.forEachIndexed(callback2,),).amountOfCall,).toBe(1,),)
                test("1 field: (number) → void",     () => expect(new instance(A,)    .execute(it => it.forEachIndexed(callback1,),).amountOfCall,).toBe(0,),)
                test("1 field: () → void",           () => expect(new instance(A,)    .execute(it => it.forEachIndexed(callback0,),).amountOfCall,).toBe(0,),)
                test("2 fields: (number, T) → void", () => expect(new instance(AB,)   .execute(it => it.forEachIndexed(callback2,),).amountOfCall,).toBe(2,),)
                test("2 fields: (number) → void",    () => expect(new instance(AB,)   .execute(it => it.forEachIndexed(callback1,),).amountOfCall,).toBe(0,),)
                test("2 fields: () → void",          () => expect(new instance(AB,)   .execute(it => it.forEachIndexed(callback0,),).amountOfCall,).toBe(0,),)
                test("4 fields: (number, T) → void", () => expect(new instance(ABCD,) .execute(it => it.forEachIndexed(callback2,),).amountOfCall,).toBe(4,),)
                test("4 fields: (number) → void",    () => expect(new instance(ABCD,) .execute(it => it.forEachIndexed(callback1,),).amountOfCall,).toBe(0,),)
                test("4 fields: () → void",          () => expect(new instance(ABCD,) .execute(it => it.forEachIndexed(callback0,),).amountOfCall,).toBe(0,),)
            },)
            describe("onEach", () => {
                test("empty: (T, number) → void",    () => expect(new instance(EMPTY,).execute(it => it.onEach(callbackAsFail2,),)  .amountOfCall,).toBe(0,),)
                test("empty: (T) → void",            () => expect(new instance(EMPTY,).execute(it => it.onEach(callbackAsFail1,),)  .amountOfCall,).toBe(0,),)
                test("empty: () → void",             () => expect(new instance(EMPTY,).execute(it => it.onEach(callbackAsFail0,),)  .amountOfCall,).toBe(0,),)
                test("1 field: (T, number) → void",  () => expect(new instance(A,)    .execute(it => it.onEach(callback2,),).amountOfCall,).toBe(1,),)
                test("1 field: (T) → void",          () => expect(new instance(A,)    .execute(it => it.onEach(callback1,),).amountOfCall,).toBe(1,),)
                test("1 field: () → void",           () => expect(new instance(A,)    .execute(it => it.onEach(callback0,),).amountOfCall,).toBe(0,),)
                test("2 fields: (T, number) → void", () => expect(new instance(AB,)   .execute(it => it.onEach(callback2,),).amountOfCall,).toBe(2,),)
                test("2 fields: (T) → void",         () => expect(new instance(AB,)   .execute(it => it.onEach(callback1,),).amountOfCall,).toBe(2,),)
                test("2 fields: () → void",          () => expect(new instance(AB,)   .execute(it => it.onEach(callback0,),).amountOfCall,).toBe(0,),)
                test("4 fields: (T, number) → void", () => expect(new instance(ABCD,) .execute(it => it.onEach(callback2,),).amountOfCall,).toBe(4,),)
                test("4 fields: (T) → void",         () => expect(new instance(ABCD,) .execute(it => it.onEach(callback1,),).amountOfCall,).toBe(4,),)
                test("4 fields: () → void",          () => expect(new instance(ABCD,) .execute(it => it.onEach(callback0,),).amountOfCall,).toBe(0,),)
            },)
            describe("onEachIndexed", () => {
                test("empty: (number, T) → void",    () => expect(new instance(EMPTY,).execute(it => it.onEachIndexed(callbackAsFail2,),)  .amountOfCall,).toBe(0,),)
                test("empty: (number) → void",       () => expect(new instance(EMPTY,).execute(it => it.onEachIndexed(callbackAsFail1,),)  .amountOfCall,).toBe(0,),)
                test("empty: () → void",             () => expect(new instance(EMPTY,).execute(it => it.onEachIndexed(callbackAsFail0,),)  .amountOfCall,).toBe(0,),)
                test("1 field: (number, T) → void",  () => expect(new instance(A,)    .execute(it => it.onEachIndexed(callback2,),).amountOfCall,).toBe(1,),)
                test("1 field: (number) → void",     () => expect(new instance(A,)    .execute(it => it.onEachIndexed(callback1,),).amountOfCall,).toBe(0,),)
                test("1 field: () → void",           () => expect(new instance(A,)    .execute(it => it.onEachIndexed(callback0,),).amountOfCall,).toBe(0,),)
                test("2 fields: (number, T) → void", () => expect(new instance(AB,)   .execute(it => it.onEachIndexed(callback2,),).amountOfCall,).toBe(2,),)
                test("2 fields: (number) → void",    () => expect(new instance(AB,)   .execute(it => it.onEachIndexed(callback1,),).amountOfCall,).toBe(0,),)
                test("2 fields: () → void",          () => expect(new instance(AB,)   .execute(it => it.onEachIndexed(callback0,),).amountOfCall,).toBe(0,),)
                test("4 fields: (number, T) → void", () => expect(new instance(ABCD,) .execute(it => it.onEachIndexed(callback2,),).amountOfCall,).toBe(4,),)
                test("4 fields: (number) → void",    () => expect(new instance(ABCD,) .execute(it => it.onEachIndexed(callback1,),).amountOfCall,).toBe(0,),)
                test("4 fields: () → void",          () => expect(new instance(ABCD,) .execute(it => it.onEachIndexed(callback0,),).amountOfCall,).toBe(0,),)
            },)
        },)

        describe("onEach", () => {
            test("empty: (T, number) → void",    () => expectToBeInstance(new instance(EMPTY,), it => it.onEach(callbackAsFail2,),),)
            test("empty: (T) → void",            () => expectToBeInstance(new instance(EMPTY,), it => it.onEach(callbackAsFail1,),),)
            test("empty: () → void",             () => expectToBeInstance(new instance(EMPTY,), it => it.onEach(callbackAsFail0,),),)
            test("1 field: (T, number) → void",  () => expectToBeInstance(new instance(A,), it =>     it.onEach(callback2,),),)
            test("1 field: (T) → void",          () => expectToBeInstance(new instance(A,), it =>     it.onEach(callback1,),),)
            test("1 field: () → void",           () => expectToBeInstance(new instance(A,), it =>     it.onEach(callback0,),),)
            test("2 fields: (T, number) → void", () => expectToBeInstance(new instance(AB,), it =>    it.onEach(callback2,),),)
            test("2 fields: (T) → void",         () => expectToBeInstance(new instance(AB,), it =>    it.onEach(callback2,),),)
            test("2 fields: () → void",          () => expectToBeInstance(new instance(AB,), it =>    it.onEach(callback0,),),)
            test("4 fields: (T, number) → void", () => expectToBeInstance(new instance(ABCD,), it =>  it.onEach(callback2,),),)
            test("4 fields: (T) → void",         () => expectToBeInstance(new instance(ABCD,), it =>  it.onEach(callback2,),),)
            test("4 fields: () → void",          () => expectToBeInstance(new instance(ABCD,), it =>  it.onEach(callback0,),),)
        },)
        describe("onEachIndexed", () => {
            test("empty: (number, T) → void",    () => expectToBeInstance(new instance(EMPTY,), it => it.onEachIndexed(callbackAsFail2,),),)
            test("empty: (number) → void",       () => expectToBeInstance(new instance(EMPTY,), it => it.onEachIndexed(callbackAsFail1,),),)
            test("empty: () → void",             () => expectToBeInstance(new instance(EMPTY,), it => it.onEachIndexed(callbackAsFail0,),),)
            test("1 field: (number, T) → void",  () => expectToBeInstance(new instance(A,), it =>     it.onEachIndexed(callback2,),),)
            test("1 field: (number) → void",     () => expectToBeInstance(new instance(A,), it =>     it.onEachIndexed(callback1,),),)
            test("1 field: () → void",           () => expectToBeInstance(new instance(A,), it =>     it.onEachIndexed(callback0,),),)
            test("2 fields: (number, T) → void", () => expectToBeInstance(new instance(AB,), it =>    it.onEachIndexed(callback2,),),)
            test("2 fields: (number) → void",    () => expectToBeInstance(new instance(AB,), it =>    it.onEachIndexed(callback2,),),)
            test("2 fields: () → void",          () => expectToBeInstance(new instance(AB,), it =>    it.onEachIndexed(callback0,),),)
            test("4 fields: (number, T) → void", () => expectToBeInstance(new instance(ABCD,), it =>  it.onEachIndexed(callback2,),),)
            test("4 fields: (number) → void",    () => expectToBeInstance(new instance(ABCD,), it =>  it.onEachIndexed(callback2,),),)
            test("4 fields: () → void",          () => expectToBeInstance(new instance(ABCD,), it =>  it.onEachIndexed(callback0,),),)
        },)
    },)},)

},)
