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

import {CollectionIterator_ByGenericIterator}                                                                                                                                                                                                                                                                       from "./instance/CollectionIterator_ByGenericIterator"
import {ABCD, EMPTY}                                                                                                                                                                                                                                                                                                from "./value/arrays"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2, callbackAsFailAfter1Call0, callbackAsFailAfter1Call1, callbackAsFailAfter1Call2, callbackAsFailAfter2Calls0, callbackAsFailAfter2Calls1, callbackAsFailAfter2Calls2, callbackAsFailAfter4Calls0, callbackAsFailAfter4Calls1, callbackAsFailAfter4Calls2} from "./value/callbacks (fail)"

import {EmptyCollectionIterator}          from "../src/iterator/EmptyCollectionIterator"
import {every1Iterators, every2Iterators} from "./value/instances"

describe("CollectionIteratorTest (forEach)", () => {

    describe("EmptyCollectionIterator", () => {
        const instance = EmptyCollectionIterator.get

        test("forEach",        () => expect(() => instance.forEach(callbackAsFail0,),).not.toThrow(),)
        test("forEachIndexed", () => expect(() => instance.forEachIndexed(callbackAsFail0,),).not.toThrow(),)
    },)

    describe("for‥of", () => {
        test("EmptyCollectionIterator", () => expect(() => { for (const _ of EmptyCollectionIterator.get); },).not.toThrow(),)
        describe("empty",    () => { test("GenericCollectionIterator", () =>                          expect(() => { for (const _ of new CollectionIterator_ByGenericIterator(EMPTY,)); },).not.toThrow(),) },)
        describe("1 field",  () => { test.each(every1Iterators,)("%s", ({value: {newInstance,},},) => expect(() => { for (const _ of newInstance('a',)); },)                               .not.toThrow(),) },)
        describe("2 fields", () => { test.each(every2Iterators,)("%s", ({value: {newInstance,},},) => expect(() => { for (const _ of newInstance('a', 'b',)); },)                          .not.toThrow(),) },)
        describe("4 fields", () => { test("GenericCollectionIterator", () =>                          expect(() => { for (const _ of new CollectionIterator_ByGenericIterator(ABCD,)); },) .not.toThrow(),) },)
    },)

    describe("empty", () => {
    describe("GenericCollectionIterator", () => {

        describe("forEach", () => {
            test("(T, number) → void", () => expect(() => new CollectionIterator_ByGenericIterator(EMPTY,).forEach(callbackAsFail2,),).not.toThrow(),)
            test("(T) → void",         () => expect(() => new CollectionIterator_ByGenericIterator(EMPTY,).forEach(callbackAsFail1,),).not.toThrow(),)
            test("() → void",          () => expect(() => new CollectionIterator_ByGenericIterator(EMPTY,).forEach(callbackAsFail0,),).not.toThrow(),)
        },)
        describe("forEachIndexed", () => {
            test("(T, number) → void", () => expect(() => new CollectionIterator_ByGenericIterator(EMPTY,).forEachIndexed(callbackAsFail2,),).not.toThrow(),)
            test("(T) → void",         () => expect(() => new CollectionIterator_ByGenericIterator(EMPTY,).forEachIndexed(callbackAsFail1,),).not.toThrow(),)
            test("() → void",          () => expect(() => new CollectionIterator_ByGenericIterator(EMPTY,).forEachIndexed(callbackAsFail0,),).not.toThrow(),)
        },)

    },)},)

    describe("1 field", () => {
    describe.each(every1Iterators,)("%s", ({value: {newInstance,},},) => {

        describe("forEach", () => {
            test("(T, number) → void", () => expect(() => newInstance('a',).forEach(callbackAsFailAfter1Call2,),).not.toThrow(),)
            test("(T) → void",         () => expect(() => newInstance('a',).forEach(callbackAsFailAfter1Call1,),).not.toThrow(),)
            test("() → void",          () => expect(() => newInstance('a',).forEach(callbackAsFailAfter1Call0,),).not.toThrow(),)
        },)
        describe("forEachIndexed", () => {
            test("(T, number) → void", () => expect(() => newInstance('a',).forEachIndexed(callbackAsFailAfter1Call2,),).not.toThrow(),)
            test("(T) → void",         () => expect(() => newInstance('a',).forEachIndexed(callbackAsFailAfter1Call1,),).not.toThrow(),)
            test("() → void",          () => expect(() => newInstance('a',).forEachIndexed(callbackAsFailAfter1Call0,),).not.toThrow(),)
        },)

    },)},)

    describe("2 fields", () => {
    describe.each(every2Iterators,)("%s", ({value: {newInstance,},},) => {

        describe("forEach", () => {
            test("(T, number) → void", () => expect(() => newInstance('a', 'b',).forEach(callbackAsFailAfter2Calls2,),).not.toThrow(),)
            test("(T) → void",         () => expect(() => newInstance('a', 'b',).forEach(callbackAsFailAfter2Calls1,),).not.toThrow(),)
            test("() → void",          () => expect(() => newInstance('a', 'b',).forEach(callbackAsFailAfter2Calls0,),).not.toThrow(),)
        },)
        describe("forEachIndexed", () => {
            test("(T, number) → void", () => expect(() => newInstance('a', 'b',).forEachIndexed(callbackAsFailAfter2Calls2,),).not.toThrow(),)
            test("(T) → void",         () => expect(() => newInstance('a', 'b',).forEachIndexed(callbackAsFailAfter2Calls1,),).not.toThrow(),)
            test("() → void",          () => expect(() => newInstance('a', 'b',).forEachIndexed(callbackAsFailAfter2Calls0,),).not.toThrow(),)
        },)

    },)},)

    describe("N fields", () => {
    describe("GenericCollectionIterator", () => {

        describe("forEach", () => {
            test("(T, number) → void", () => expect(() => new CollectionIterator_ByGenericIterator(ABCD,).forEach(callbackAsFailAfter4Calls2,),).not.toThrow(),)
            test("(T) → void",         () => expect(() => new CollectionIterator_ByGenericIterator(ABCD,).forEach(callbackAsFailAfter4Calls1,),).not.toThrow(),)
            test("() → void",          () => expect(() => new CollectionIterator_ByGenericIterator(ABCD,).forEach(callbackAsFailAfter4Calls0,),).not.toThrow(),)
        },)
        describe("forEachIndexed", () => {
            test("(T, number) → void", () => expect(() => new CollectionIterator_ByGenericIterator(ABCD,).forEachIndexed(callbackAsFailAfter4Calls2,),).not.toThrow(),)
            test("(T) → void",         () => expect(() => new CollectionIterator_ByGenericIterator(ABCD,).forEachIndexed(callbackAsFailAfter4Calls1,),).not.toThrow(),)
            test("() → void",          () => expect(() => new CollectionIterator_ByGenericIterator(ABCD,).forEachIndexed(callbackAsFailAfter4Calls0,),).not.toThrow(),)
        },)

    },)},)

},)
