/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {CollectionHolderFromArray}                     from "./instance/CollectionHolderFromArray"
import {EmptyCollectionIterator_ForEachWatcher}        from "./instance/EmptyCollectionIterator_ForEachWatcher"
import {EmptyCollectionIterator_ForEachIndexedWatcher} from "./instance/EmptyCollectionIterator_ForEachIndexedWatcher"
import {A, AB, EMPTY}                                  from "./value/arrays"

import {GenericCollectionIterator} from "../src/iterator/GenericCollectionIterator"

describe("CollectionIteratorTest (forEach)", () => {

    describe("EmptyCollectionIterator", () => {
        test("forEach",        () => expect(new EmptyCollectionIterator_ForEachWatcher().execute(it => it.forEach(),).amountOfCall,).toBe(1,),)
        test("forEachIndexed", () => expect(new EmptyCollectionIterator_ForEachIndexedWatcher().execute(it => it.forEachIndexed(),).amountOfCall,).toBe(1,),)
    },)

    describe("GenericCollectionIterator", () => {
        const EMPTY_CALLBACK = () => {}
        const newInstanceOf0 = () => new GenericCollectionIterator(new CollectionHolderFromArray(EMPTY,),)
        const newInstanceOf1 = () => new GenericCollectionIterator(new CollectionHolderFromArray(A,),)
        const newInstanceOf2 = () => new GenericCollectionIterator(new CollectionHolderFromArray(AB,),)

        describe("forEach", () => {
            describe("empty", () => {
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
            describe("1 field", () => {
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
            describe("2 fields", () => {
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
            describe("empty", () => {
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
            describe("1 field", () => {
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
            describe("2 fields", () => {
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
    },)

},)
