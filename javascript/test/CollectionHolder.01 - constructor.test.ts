/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {GenericCollectionHolder_ConstructorTest}           from "./instance/GenericCollectionHolder_ConstructorTest"
import {GenericMinimalistCollectionHolder_ConstructorTest} from "./instance/GenericMinimalistCollectionHolder_ConstructorTest"
import {LazyGenericCollectionHolder_ConstructorTest}       from "./instance/LazyGenericCollectionHolder_ConstructorTest"
import {A, AB, ABC, ABCD, EMPTY}                           from "./value/arrays"
import {everyIterableInstances}                            from "./value/instances"

describe("CollectionHolderTest (constructor)", () => {

    describe("GenericMinimalistCollectionHolder", () => {
    describe.each(everyIterableInstances,)("%s", ({value,},) => {
        const newCollection = <const T, >(values: readonly T[],) => new GenericMinimalistCollectionHolder_ConstructorTest<T>(value(values,),)._array

        test("empty",    () => expect(newCollection(EMPTY,),).toBeEmpty(),)
        test("1 field",  () => expect(newCollection(A,),).toContainAllValues(A,),)
        test("2 fields", () => expect(newCollection(AB,),).toContainAllValues(AB,),)
        test("3 fields", () => expect(newCollection(ABC,),).toContainAllValues(ABC,),)
        test("4 fields", () => expect(newCollection(ABCD,),).toContainAllValues(ABCD,),)

    },)},)
    describe("GenericCollectionHolder", () => {
    describe.each(everyIterableInstances,)("%s", ({value,},) => {
        const newCollection = <const T, >(values: readonly T[],) => new GenericCollectionHolder_ConstructorTest<T>(value(values,),)._array

        test("empty",    () => expect(newCollection(EMPTY,),).toBeEmpty(),)
        test("1 field",  () => expect(newCollection(A,),).toContainAllValues(A,),)
        test("2 fields", () => expect(newCollection(AB,),).toContainAllValues(AB,),)
        test("3 fields", () => expect(newCollection(ABC,),).toContainAllValues(ABC,),)
        test("4 fields", () => expect(newCollection(ABCD,),).toContainAllValues(ABCD,),)

    },)},)
    describe("LazyGenericCollectionHolder", () => {
    describe.each(everyIterableInstances,)("%s", ({value,},) => {
        const newCollection = <const T, >(values: readonly T[],) => new LazyGenericCollectionHolder_ConstructorTest(value(values,),)

        test("empty",    () => expect(newCollection(EMPTY,),).toBeEmpty(),)
        test("1 field",  () => expect(newCollection(A,),).toContainAllValues(A,),)
        test("2 fields", () => expect(newCollection(AB,),).toContainAllValues(AB,),)
        test("3 fields", () => expect(newCollection(ABC,),).toContainAllValues(ABC,),)
        test("4 fields", () => expect(newCollection(ABCD,),).toContainAllValues(ABCD,),)

    },)},)

},)
