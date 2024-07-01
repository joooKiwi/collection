/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {GenericCollectionIterator} from "../src/iterator/GenericCollectionIterator"

import {A, AB, EMPTY}                                        from "./constantCollections"
import {everyCollectionInstanceByIterable, iterableCreation} from "./constantValues"
import {newEmptyIterator}                                    from "./newEmptyIterator"

describe("CollectionIteratorTest (forEach)", () => {

    describe("EmptyCollectionIterator", () => {
        test("forEach", () => {
            const callback = jest.fn()

            newEmptyIterator().forEach(callback,)
            expect(callback,).not.toHaveBeenCalled()
        },)
        test("forEachIndexed", () => {
            const callback = jest.fn()

            newEmptyIterator().forEachIndexed(callback,)
            expect(callback,).not.toHaveBeenCalled()
        },)
    },)
    describe("GenericCollectionIterator", () => {
        const EMPTY_CALLBACK = () => {}

        describe.each(everyCollectionInstanceByIterable,)("%s", ({value: {newInstance: newCollectionInstance, },},) => {
        describe.each(iterableCreation,)("%s", ({value: iterableCreation,},) => {
            const newInstanceOf0 = () => new GenericCollectionIterator(newCollectionInstance(iterableCreation, EMPTY,),)
            const newInstanceOf1 = () => new GenericCollectionIterator(newCollectionInstance(iterableCreation, A,),)
            const newInstanceOf2 = () => new GenericCollectionIterator(newCollectionInstance(iterableCreation, AB,),)

            describe("forEach", () => {
                describe("with size of 0", () => {
                    let instance: GenericCollectionIterator
                    const size = 0

                    beforeEach(() => instance = newInstanceOf0(),)
                    test("amount of time", () => {
                        const callback = jest.fn()

                        instance.forEach(callback,)
                        expect(callback,).toHaveBeenCalledTimes(size,)
                    },)
                    test("previousIndex", () => expect(instance.forEach(EMPTY_CALLBACK,).previousIndex,).toBeNull(),)
                    test("currentIndex",  () => expect(instance.forEach(EMPTY_CALLBACK,).currentIndex,).toBeNull(),)
                    test("nextIndex",     () => expect(instance.forEach(EMPTY_CALLBACK,).nextIndex,).toBeNull(),)
                },)
                describe("with size of 1", () => {
                    let instance: GenericCollectionIterator
                    const lastIndex = 0
                    const size = 1

                    beforeEach(() => instance = newInstanceOf1(),)
                    test("amount of time", () => {
                        const callback = jest.fn()

                        instance.forEach(callback,)
                        expect(callback,).toHaveBeenCalledTimes(size,)
                    },)
                    test("previousIndex", () => expect(instance.forEach(EMPTY_CALLBACK,).previousIndex,).toBeNull(),)
                    test("currentIndex",  () => expect(instance.forEach(EMPTY_CALLBACK,).currentIndex,).toBe(lastIndex,),)
                    test("nextIndex",     () => expect(instance.forEach(EMPTY_CALLBACK,).nextIndex,).toBeNull(),)
                },)
                describe("with size of 2", () => {
                    let instance: GenericCollectionIterator
                    const secondLastIndex = 0
                    const lastIndex = 1
                    const size = 2

                    beforeEach(() => instance = newInstanceOf2(),)
                    test("amount of time", () => {
                        const callback = jest.fn()

                        instance.forEach(callback,)
                        expect(callback,).toHaveBeenCalledTimes(size,)
                    },)
                    test("previousIndex", () => expect(instance.forEach(EMPTY_CALLBACK,).previousIndex,).toBe(secondLastIndex,),)
                    test("currentIndex",  () => expect(instance.forEach(EMPTY_CALLBACK,).currentIndex,).toBe(lastIndex,),)
                    test("nextIndex",     () => expect(instance.forEach(EMPTY_CALLBACK,).nextIndex,).toBeNull(),)
                },)
            },)
            describe("forEachIndexed", () => {
                describe("with size of 0", () => {
                    let instance: GenericCollectionIterator
                    const size = 0

                    beforeEach(() => instance = newInstanceOf0(),)
                    test("amount of time", () => {
                        const callback = jest.fn()

                        instance.forEachIndexed(callback,)
                        expect(callback,).toHaveBeenCalledTimes(size,)
                    },)
                    test("previousIndex", () => expect(instance.forEachIndexed(EMPTY_CALLBACK,).previousIndex,).toBeNull(),)
                    test("currentIndex",  () => expect(instance.forEachIndexed(EMPTY_CALLBACK,).currentIndex,).toBeNull(),)
                    test("nextIndex",     () => expect(instance.forEachIndexed(EMPTY_CALLBACK,).nextIndex,).toBeNull(),)
                },)
                describe("with size of 1", () => {
                    let instance: GenericCollectionIterator
                    const lastIndex = 0
                    const size = 1

                    beforeEach(() => instance = newInstanceOf1(),)
                    test("amount of time", () => {
                        const callback = jest.fn()

                        instance.forEachIndexed(callback,)
                        expect(callback,).toHaveBeenCalledTimes(size,)
                    },)
                    test("previousIndex", () => expect(instance.forEachIndexed(EMPTY_CALLBACK,).previousIndex,).toBeNull(),)
                    test("currentIndex",  () => expect(instance.forEachIndexed(EMPTY_CALLBACK,).currentIndex,).toBe(lastIndex,),)
                    test("nextIndex",     () => expect(instance.forEachIndexed(EMPTY_CALLBACK,).nextIndex,).toBeNull(),)
                },)
                describe("with size of 2", () => {
                    let instance: GenericCollectionIterator
                    const secondLastIndex = 0
                    const lastIndex = 1
                    const size = 2

                    beforeEach(() => instance = newInstanceOf2(),)
                    test("amount of time", () => {
                        const callback = jest.fn()

                        instance.forEachIndexed(callback,)
                        expect(callback,).toHaveBeenCalledTimes(size,)
                    },)
                    test("previousIndex", () => expect(instance.forEachIndexed(EMPTY_CALLBACK,).previousIndex,).toBe(secondLastIndex,),)
                    test("currentIndex",  () => expect(instance.forEachIndexed(EMPTY_CALLBACK,).currentIndex,).toBe(lastIndex,),)
                    test("nextIndex",     () => expect(instance.forEachIndexed(EMPTY_CALLBACK,).nextIndex,).toBeNull(),)
                },)
            },)
        },)},)
    },)

},)
