/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {CollectionConstants}       from "../src/CollectionConstants"
import {EmptyCollectionHolder}     from "../src/EmptyCollectionHolder"
import {GenericCollectionIterator} from "../src/iterator/GenericCollectionIterator"

import {ABCDEFGHIJ}                       from "./constantCollections"
import {everyInstances, iterableCreation} from "./constantValues"
import {newCollectionInstance}            from "./newCollectionInstance"
import {newEmptyIterator}                 from "./newEmptyIterator"

describe("CollectionIteratorTest", () => {

    describe("EmptyCollectionIterator", () => {
        const instance = newEmptyIterator(),
            collectionInstance = EmptyCollectionHolder.get

        test("collection", () => expect(instance.collection,).toStrictEqual(collectionInstance,),)

        describe("size", () => {
            test("size", () => expect(instance.size,).toBe(0,),)
            test("length", () => expect(instance.length,).toBe(0,),)
            test("count", () => expect(instance.length,).toBe(0,),)
        },)
        describe("index", () => {
            test("index", () => expect(instance.index,).toBe(0,),)
            test("next", () => expect(instance.nextIndex,).toBe(0,),)
            test("previous", () => expect(instance.previousIndex,).toBe(0,),)
        },)
        describe("has", () => {
            test("next", () => expect(instance.hasNext,).toBeFalse(),)
            test("previous", () => expect(instance.hasPrevious,).toBeFalse(),)
        },)
        describe("iteration", () => {
            describe("next", () => {
                const it = instance.next()

                test("done", () => expect(it.done,).toBeTrue(),)
                test("value", () => expect(it.value,).toBe(CollectionConstants.AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL,),)
            },)
            test("nextValue", () => expect(() => instance.nextValue,).toThrow(ReferenceError,),)

            describe("previous", () => {
                const it = instance.previous()

                test("done", () => expect(it.done,).toBeTrue(),)
                test("value", () => expect(it.value,).toBe(CollectionConstants.BEFORE_FIRST_VALUE_IN_ITERATOR_SYMBOL,),)
            },)
        },)
        describe("forEach", () => {
            test("regular", () => {
                const callback = jest.fn()

                instance.forEach(callback,)
                expect(callback,).not.toHaveBeenCalled()
            },)
            test("indexed", () => {
                const callback = jest.fn()

                instance.forEachIndexed(callback,)
                expect(callback,).not.toHaveBeenCalled()
            },)
        },)
        test("iterator", () => expect(instance[Symbol.iterator](),).toBe(instance,),)
        test("for‥of", () => expect(() => { for (const _ of instance); },).not.toThrow(),)
    },)
    describe("GenericCollectionIterator", () => {
        const EMPTY_CALLBACK = () => {}

        describe.each(everyInstances,)("%s", ({value: collectionInstance,},) => {describe.each(iterableCreation,)("%s", ({value: iterableCreation,},) => {
            const maxSize = ABCDEFGHIJ.length,
                newInstance = () => new GenericCollectionIterator<typeof ABCDEFGHIJ[number]>(newCollectionInstance(collectionInstance, iterableCreation, ABCDEFGHIJ,))

            describe("size", () => {
                test("size", () => expect(newInstance().size,).toBe(maxSize,),)
                test("length", () => expect(newInstance().length,).toBe(maxSize,),)
                test("count", () => expect(newInstance().count,).toBe(maxSize,),)
            },)
            describe("index", () => {
                describe("index", () => {
                    let instance: GenericCollectionIterator<typeof ABCDEFGHIJ[number]>
                    beforeEach(() => instance = newInstance(),)

                    test("initial", () => expect(instance.index,).toBe(0,),)

                    test("after 1 next", () => {
                        instance.next()
                        expect(instance.index,).toBe(1,)
                    },)
                    test("after 2 next", () => {
                        instance.next()
                        instance.next()
                        expect(instance.index,).toBe(2,)
                    },)

                    test("after 1 previous", () => {
                        instance.previous()
                        expect(instance.index,).toBe(0,)
                    },)
                    test("after 2 previous", () => {
                        instance.previous()
                        instance.previous()
                        expect(instance.index,).toBe(0,)
                    },)

                    test("after 1 next and 1 previous", () => {
                        instance.next()
                        instance.previous()
                        expect(instance.index,).toBe(0,)
                    },)
                    test("after 2 next and 1 previous", () => {
                        instance.next()
                        instance.next()
                        instance.previous()
                        expect(instance.index,).toBe(1,)
                    },)
                    test("after 1 next and 2 previous", () => {
                        instance.next()
                        instance.previous()
                        instance.previous()
                        expect(instance.index,).toBe(0,)
                    },)
                    test("after 2 next and 2 previous", () => {
                        instance.next()
                        instance.next()
                        instance.previous()
                        instance.previous()
                        expect(instance.index,).toBe(0,)
                    },)

                    test("at the end", () => {
                        instance.forEach(EMPTY_CALLBACK,)
                        expect(instance.index,).toBe(maxSize,)
                    },)
                    test("at the end + next", () => {
                        instance.forEach(EMPTY_CALLBACK,)
                        instance.next()
                        expect(instance.index,).toBe(maxSize,)
                    },)
                    test("at the end + previous", () => {
                        instance.forEach(EMPTY_CALLBACK,)
                        instance.previous()
                        expect(instance.index,).toBe(maxSize - 1,)
                    },)
                },)
                describe("next", () => {
                    let instance: GenericCollectionIterator<typeof ABCDEFGHIJ[number]>
                    beforeEach(() => instance = newInstance(),)

                    test("initial", () => expect(instance.nextIndex,).toBe(1,),)

                    test("after 1 next", () => {
                        instance.next()
                        expect(instance.nextIndex,).toBe(2,)
                    },)
                    test("after 2 next", () => {
                        instance.next()
                        instance.next()
                        expect(instance.nextIndex,).toBe(3,)
                    },)

                    test("after 1 previous", () => {
                        instance.previous()
                        expect(instance.nextIndex,).toBe(1,)
                    },)
                    test("after 2 previous", () => {
                        instance.previous()
                        instance.previous()
                        expect(instance.nextIndex,).toBe(1,)
                    },)

                    test("after 1 next and 1 previous", () => {
                        instance.next()
                        instance.previous()
                        expect(instance.nextIndex,).toBe(1,)
                    },)
                    test("after 2 next and 1 previous", () => {
                        instance.next()
                        instance.next()
                        instance.previous()
                        expect(instance.nextIndex,).toBe(2,)
                    },)
                    test("after 1 next and 2 previous", () => {
                        instance.next()
                        instance.previous()
                        instance.previous()
                        expect(instance.nextIndex,).toBe(1,)
                    },)
                    test("after 2 next and 2 previous", () => {
                        instance.next()
                        instance.next()
                        instance.previous()
                        instance.previous()
                        expect(instance.nextIndex,).toBe(1,)
                    },)

                    test("at the end", () => {
                        instance.forEach(EMPTY_CALLBACK,)
                        expect(instance.nextIndex,).toBe(maxSize + 1,)
                    },)
                    test("at the end + next", () => {
                        instance.forEach(EMPTY_CALLBACK,)
                        instance.next()
                        expect(instance.nextIndex,).toBe(maxSize + 1,)
                    },)
                    test("at the end + previous", () => {
                        instance.forEach(EMPTY_CALLBACK,)
                        instance.previous()
                        expect(instance.nextIndex,).toBe(maxSize,)
                    },)
                },)
                describe("previous", () => {
                    let instance: GenericCollectionIterator<typeof ABCDEFGHIJ[number]>
                    beforeEach(() => instance = newInstance(),)

                    test("initial", () => expect(instance.previousIndex,).toBe(-1,),)

                    test("after 1 next", () => {
                        instance.next()
                        expect(instance.previousIndex,).toBe(0,)
                    },)
                    test("after 2 next", () => {
                        instance.next()
                        instance.next()
                        expect(instance.previousIndex,).toBe(1,)
                    },)

                    test("after 1 previous", () => {
                        instance.previous()
                        expect(instance.previousIndex,).toBe(-1,)
                    },)
                    test("after 2 previous", () => {
                        instance.previous()
                        instance.previous()
                        expect(instance.previousIndex,).toBe(-1,)
                    },)

                    test("after 1 next and 1 previous", () => {
                        instance.next()
                        instance.previous()
                        expect(instance.previousIndex,).toBe(-1,)
                    },)
                    test("after 2 next and 1 previous", () => {
                        instance.next()
                        instance.next()
                        instance.previous()
                        expect(instance.previousIndex,).toBe(0,)
                    },)
                    test("after 1 next and 2 previous", () => {
                        instance.next()
                        instance.previous()
                        instance.previous()
                        expect(instance.previousIndex,).toBe(-1,)
                    },)
                    test("after 2 next and 2 previous", () => {
                        instance.next()
                        instance.next()
                        instance.previous()
                        instance.previous()
                        expect(instance.previousIndex,).toBe(-1,)
                    },)

                    test("at the end", () => {
                        instance.forEach(EMPTY_CALLBACK,)
                        expect(instance.previousIndex,).toBe(maxSize - 1,)
                    },)
                    test("at the end + next", () => {
                        instance.forEach(EMPTY_CALLBACK,)
                        instance.next()
                        expect(instance.previousIndex,).toBe(maxSize - 1,)
                    },)
                    test("at the end + previous", () => {
                        instance.forEach(EMPTY_CALLBACK,)
                        instance.previous()
                        expect(instance.previousIndex,).toBe(maxSize - 2,)
                    },)
                },)
            },)
            describe("has", () => {
                describe("next", () => {
                    let instance: GenericCollectionIterator<typeof ABCDEFGHIJ[number]>
                    beforeEach(() => instance = newInstance(),)

                    test("initial", () => expect(instance.hasNext,).toBeTrue(),)

                    test("after 1 next", () => {
                        instance.next()
                        expect(instance.hasNext,).toBeTrue()
                    },)
                    test("after 2 next", () => {
                        instance.next()
                        instance.next()
                        expect(instance.hasNext,).toBeTrue()
                    },)

                    test("after 1 previous", () => {
                        instance.previous()
                        expect(instance.hasNext,).toBeTrue()
                    },)
                    test("after 2 previous", () => {
                        instance.previous()
                        instance.previous()
                        expect(instance.hasNext,).toBeTrue()
                    },)

                    test("after 1 next and 1 previous", () => {
                        instance.next()
                        instance.previous()
                        expect(instance.hasNext,).toBeTrue()
                    },)
                    test("after 2 next and 1 previous", () => {
                        instance.next()
                        instance.next()
                        instance.previous()
                        expect(instance.hasNext,).toBeTrue()
                    },)
                    test("after 1 next and 2 previous", () => {
                        instance.next()
                        instance.previous()
                        instance.previous()
                        expect(instance.hasNext,).toBeTrue()
                    },)
                    test("after 2 next and 2 previous", () => {
                        instance.next()
                        instance.next()
                        instance.previous()
                        instance.previous()
                        expect(instance.hasNext,).toBeTrue()
                    },)

                    test("at the end", () => {
                        instance.forEach(EMPTY_CALLBACK,)
                        expect(instance.hasNext,).toBeFalse()
                    },)
                    test("at the end + next", () => {
                        instance.forEach(EMPTY_CALLBACK,)
                        instance.next()
                        expect(instance.hasNext,).toBeFalse()
                    },)
                    test("at the end + previous", () => {
                        instance.forEach(EMPTY_CALLBACK,)
                        instance.previous()
                        expect(instance.hasNext,).toBeTrue()
                    },)
                },)
                describe("previous", () => {
                    let instance: GenericCollectionIterator<typeof ABCDEFGHIJ[number]>
                    beforeEach(() => instance = newInstance(),)

                    test("initial", () => expect(instance.hasPrevious,).toBeFalse(),)

                    test("after 1 next", () => {
                        instance.next()
                        expect(instance.hasPrevious,).toBeTrue()
                    },)
                    test("after 2 next", () => {
                        instance.next()
                        instance.next()
                        expect(instance.hasPrevious,).toBeTrue()
                    },)

                    test("after 1 previous", () => {
                        instance.previous()
                        expect(instance.hasPrevious,).toBeFalse()
                    },)
                    test("after 2 previous", () => {
                        instance.previous()
                        instance.previous()
                        expect(instance.hasPrevious,).toBeFalse()
                    },)

                    test("after 1 next and 1 previous", () => {
                        instance.next()
                        instance.previous()
                        expect(instance.hasPrevious,).toBeFalse()
                    },)
                    test("after 2 next and 1 previous", () => {
                        instance.next()
                        instance.next()
                        instance.previous()
                        expect(instance.hasPrevious,).toBeTrue()
                    },)
                    test("after 1 next and 2 previous", () => {
                        instance.next()
                        instance.previous()
                        instance.previous()
                        expect(instance.hasPrevious,).toBeFalse()
                    },)
                    test("after 2 next and 2 previous", () => {
                        instance.next()
                        instance.next()
                        instance.previous()
                        instance.previous()
                        expect(instance.hasPrevious,).toBeFalse()
                    },)

                    test("at the end", () => {
                        instance.forEach(EMPTY_CALLBACK,)
                        expect(instance.hasPrevious,).toBeTrue()
                    },)
                    test("at the end + next", () => {
                        instance.forEach(EMPTY_CALLBACK,)
                        instance.next()
                        expect(instance.hasPrevious,).toBeTrue()
                    },)
                    test("at the end + previous", () => {
                        instance.forEach(EMPTY_CALLBACK,)
                        instance.previous()
                        expect(instance.hasPrevious,).toBeTrue()
                    },)
                },)
            },)
            describe("iteration", () => {
                describe("next", () => {
                    describe("at the start", () => {
                        const it = newInstance().next()
                        test("value", () => expect(it.value,).toBe('a',),)
                        test("done", () => expect(it.done,).toBeFalse(),)
                    },)
                    describe("at the end", () => {
                        const it = newInstance().forEach(EMPTY_CALLBACK,).next()
                        test("value", () => expect(it.value,).toBe(CollectionConstants.AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL,),)
                        test("done", () => expect(it.done,).toBeTrue(),)
                    },)
                },)
                describe("next x2", () => {
                    describe("at the start", () => {
                        const instance = newInstance()
                        instance.next()
                        const it = instance.next()
                        test("value", () => expect(it.value,).toBe('b',),)
                        test("done", () => expect(it.done,).toBeFalse(),)
                    },)
                    describe("at the end", () => {
                        const instance = newInstance().forEach(EMPTY_CALLBACK,)
                        instance.next()
                        const it = instance.next()
                        test("value", () => expect(it.value,).toBe(CollectionConstants.AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL,),)
                        test("done", () => expect(it.done,).toBeTrue(),)
                    },)
                },)
                describe("nextValue", () => {
                    test("at the start", () => expect(newInstance().nextValue,).toBe('a',),)
                    test("at the end", () => expect(() => newInstance().forEach(EMPTY_CALLBACK,).nextValue,).toThrow(ReferenceError,),)
                },)
                test("nextValue x2", () => {
                    const instance = newInstance()
                    instance.nextValue
                    expect(instance.nextValue,).toBe('b',)
                },)

                describe("previous", () => {
                    describe("at the start", () => {
                        const it = newInstance().previous()
                        test("value", () => expect(it.value,).toBe(CollectionConstants.BEFORE_FIRST_VALUE_IN_ITERATOR_SYMBOL,),)
                        test("done", () => expect(it.done,).toBeTrue(),)
                    },)
                    describe("at the end", () => {
                        const it = newInstance().forEach(EMPTY_CALLBACK,).previous()
                        test("value", () => expect(it.value,).toBe('j',),)
                        test("done", () => expect(it.done,).toBeFalse(),)
                    },)
                },)
                describe("previous x2", () => {
                    describe("at the start", () => {
                        const instance = newInstance()
                        instance.previous()
                        const it = instance.previous()
                        test("value", () => expect(it.value,).toBe(CollectionConstants.BEFORE_FIRST_VALUE_IN_ITERATOR_SYMBOL,),)
                        test("done", () => expect(it.done,).toBeTrue(),)
                    },)
                    describe("at the end", () => {
                        const instance = newInstance().forEach(EMPTY_CALLBACK,)
                        instance.previous()
                        const it = instance.previous()
                        test("value", () => expect(it.value,).toBe('i',),)
                        test("done", () => expect(it.done,).toBeFalse(),)
                    },)
                },)
                describe("previousValue", () => {
                    test("at the start", () => expect(() => newInstance().previousValue,).toThrow(ReferenceError,),)
                    test("at the end", () => expect(newInstance().forEach(EMPTY_CALLBACK,).previousValue,).toBe('j',),)
                },)
                test("previousValue x2", () => {
                    const instance = newInstance().forEach(EMPTY_CALLBACK,)
                    instance.previousValue
                    expect(instance.previousValue,).toBe('i',)
                },)
            },)
            describe("forEach", () => {
                let instance: GenericCollectionIterator<typeof ABCDEFGHIJ[number]>
                beforeEach(() => instance = newInstance(),)

                test("regular", () => {
                    const callback = jest.fn()

                    instance.forEach(callback,)
                    expect(callback,).toHaveBeenCalledTimes(maxSize,)
                },)
                test("indexed", () => {
                    const callback = jest.fn()

                    instance.forEachIndexed(callback,)
                    expect(callback,).toHaveBeenCalledTimes(maxSize,)
                },)
            },)
            test("iterator", () => {
                const instance = newInstance()
                expect(instance[Symbol.iterator](),).not.toBe(instance,)
            },)
            test("for‥of", () => expect(() => {
                const instance = newInstance()
                for (const _ of instance);
            },).not.toThrow(),)
        },) },)
    },)

},)
