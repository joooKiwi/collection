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

import {GenericCollectionHolder_ConstructorTest}           from "./instance/GenericCollectionHolder_ConstructorTest"
import {GenericMinimalistCollectionHolder_ConstructorTest} from "./instance/GenericMinimalistCollectionHolder_ConstructorTest"
import {LazyCollectionHolder_ConstructorTest}              from "./instance/LazyCollectionHolder_ConstructorTest"
import {A, AB, ABC, ABCD, EMPTY}                           from "./value/arrays"
import {everyIterableInstances}                            from "./value/instances"

describe("CollectionHolderTest (constructor)", () => {

    describe("GenericMinimalistCollectionHolder", () => {
    describe.each(everyIterableInstances,)("%s", ({value: iterable,},) => {
        const newCollection = <const T, >(values: readonly T[],) => new GenericMinimalistCollectionHolder_ConstructorTest<T>(new iterable(values,),).array

        test("empty",    () => expect(newCollection(EMPTY,),).toBeEmpty(),)
        test("1 field",  () => expect(newCollection(A,),).toEqual(A,),)
        test("2 fields", () => expect(newCollection(AB,),).toEqual(AB,),)
        test("3 fields", () => expect(newCollection(ABC,),).toEqual(ABC,),)
        test("4 fields", () => expect(newCollection(ABCD,),).toEqual(ABCD,),)

    },)},)
    describe("GenericCollectionHolder", () => {
    describe.each(everyIterableInstances,)("%s", ({value: iterable,},) => {
        const newCollection = <const T, >(values: readonly T[],) => new GenericCollectionHolder_ConstructorTest<T>(new iterable(values,),)

        test("empty",    () => expect(newCollection(EMPTY,),).toBeEmpty(),)
        test("1 field",  () => expect(newCollection(A,),).toContainAllValues(A,),)
        test("2 fields", () => expect(newCollection(AB,),).toContainAllValues(AB,),)
        test("3 fields", () => expect(newCollection(ABC,),).toContainAllValues(ABC,),)
        test("4 fields", () => expect(newCollection(ABCD,),).toContainAllValues(ABCD,),)

    },)},)
    describe("LazyCollectionHolder", () => {
    describe.each(everyIterableInstances,)("%s", ({value: iterable,},) => {
        const newCollection = <const T, >(values: readonly T[],) => new LazyCollectionHolder_ConstructorTest(new iterable(values,),)

        test("empty",    () => expect(newCollection(EMPTY,),).toBeEmpty(),)
        test("1 field",  () => expect(newCollection(A,),).toContainAllValues(A,),)
        test("2 fields", () => expect(newCollection(AB,),).toContainAllValues(AB,),)
        test("3 fields", () => expect(newCollection(ABC,),).toContainAllValues(ABC,),)
        test("4 fields", () => expect(newCollection(ABCD,),).toContainAllValues(ABCD,),)

    },)},)

},)
