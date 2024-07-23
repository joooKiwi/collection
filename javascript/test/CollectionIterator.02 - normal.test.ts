/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionIterator} from "../src/iterator/CollectionIterator"

import {CollectionConstants}                       from "../src/CollectionConstants"
import {EmptyCollectionHolder}                     from "../src/EmptyCollectionHolder"
import {NoElementFoundInCollectionHolderException} from "../src/exception/NoElementFoundInCollectionHolderException"
import {EmptyCollectionIterator}                   from "../src/iterator/EmptyCollectionIterator"
import {GenericCollectionIterator}                 from "../src/iterator/GenericCollectionIterator"
import {GenericAfterLastIteratorValue}             from "../src/iterator/value/GenericAfterLastIteratorValue"
import {GenericBeforeFirstIteratorValue}           from "../src/iterator/value/GenericBeforeFirstIteratorValue"
import {GenericIteratorValue}                      from "../src/iterator/value/GenericIteratorValue"

import {A, AB, ABCDEFGHIJ, EMPTY}                            from "./constantCollections"
import {everyCollectionInstanceByIterable, iterableCreation} from "./constantValues"
import {newEmptyIterator}                                    from "./newEmptyIterator"

describe("CollectionIteratorTest", () => {

    describe("EmptyCollectionIterator", () => {
        let instance: EmptyCollectionIterator
        const collectionInstance = EmptyCollectionHolder.get

        beforeEach(() => instance = newEmptyIterator(),)
        test("collection", () => expect(instance.collection,).toEqual(collectionInstance,),)

        describe("index", () => {
            test("current",  () => expect(instance.currentIndex,).toBeNull(),)
            test("next",     () => expect(instance.nextIndex,).toBeNull(),)
            test("previous", () => expect(instance.previousIndex,).toBeNull(),)
        },)
        describe("has", () => {
            test("next",     () => expect(instance.hasNext,).toBeFalse(),)
            test("previous", () => expect(instance.hasPrevious,).toBeFalse(),)
        },)
        describe("value", () => {
            test("next",     () => expect(() => instance.nextValue,).toThrow(NoElementFoundInCollectionHolderException,),)
            test("previous", () => expect(() => instance.previousValue,).toThrow(NoElementFoundInCollectionHolderException,),)
        },)
        describe("iterator result", () => {
            describe("next", () => {
                test("done",  () => expect(instance.next().done,).toBeTrue(),)
                test("value", () => expect(instance.next().value,).toBe(CollectionConstants.AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL,),)
            },)
            describe("previous", () => {
                test("done",  () => expect(instance.previous().done,).toBeTrue(),)
                test("value", () => expect(instance.previous().value,).toBe(CollectionConstants.BEFORE_FIRST_VALUE_IN_ITERATOR_SYMBOL,),)
            },)
        },)
        test("for‥of", () => expect(() => { for (const _ of instance); },).not.toThrow(),)
    },)
    describe("GenericCollectionIterator", () => {
        const EMPTY_CALLBACK = () => {}

        describe.each(everyCollectionInstanceByIterable,)("%s", ({value: {newInstance: newCollectionInstance, },},) => {
        describe.each(iterableCreation,)("%s", ({value: iterableCreation,},) => {

            describe("with size = 0", () => {
                //#region -------------------- Values / type declaration --------------------

                let instance: GenericCollectionIterator<never>

                const array = EMPTY

                //#endregion -------------------- Values / type declaration --------------------
                beforeEach(() => instance = new GenericCollectionIterator(newCollectionInstance(iterableCreation, array,),) as unknown as GenericCollectionIterator<never>,)

                describe("index", () => {
                    test("current",  () => expect(instance.currentIndex,).toBeNull(),)
                    test("next",     () => expect(instance.nextIndex,).toBeNull(),)
                    test("previous", () => expect(instance.previousIndex,).toBeNull(),)
                },)
                describe("has", () => {
                    test("next",     () => expect(instance.hasNext,).toBeFalse(),)
                    test("previous", () => expect(instance.hasPrevious,).toBeFalse(),)
                },)
                describe("value", () => {
                    test("next",     () => expect(() => instance.nextValue,).toThrow(NoElementFoundInCollectionHolderException,),)
                    test("previous", () => expect(() => instance.previousValue,).toThrow(NoElementFoundInCollectionHolderException,),)
                },)
                describe("iterator result", () => {
                    describe("next", () => {
                        test("done",  () => expect(instance.next().done,).toBeTrue(),)
                        test("value", () => expect(instance.next().value,).toBe(CollectionConstants.AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL,),)
                    },)
                    describe("previous", () => {
                        test("done",  () => expect(instance.previous().done,).toBeTrue(),)
                        test("value", () => expect(instance.previous().value,).toBe(CollectionConstants.BEFORE_FIRST_VALUE_IN_ITERATOR_SYMBOL,),)
                    },)
                },)
                test("for‥of", () => expect(() => { for (const _ of instance); },).not.toThrow(),)
            },)
            describe("with size = 1", () => {
                //#region -------------------- Values / type declaration --------------------

                let instance: GenericCollectionIterator<PossibleValue>

                const array = A
                type PossibleValue = typeof array[number]
                type PossibleIndex = 0
                const index = 0 satisfies PossibleIndex

                const value = 'a' satisfies PossibleValue

                //#endregion -------------------- Values / type declaration --------------------
                beforeEach(() => instance = new GenericCollectionIterator(newCollectionInstance(iterableCreation, array,),) as unknown as GenericCollectionIterator<PossibleValue>,)

                describe("index", () => {
                    describe("current", () => {
                        test("initial", () => expect(instance.currentIndex,).toBeNull(),)

                        test("after 1 next",                () => expect(do1Next(instance,).currentIndex,).toBe(index,),)
                        test("after 1 previous",            () => expect(do1Previous(instance,).currentIndex,).toBe(index,),)
                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).currentIndex,).toBe(index,),)
                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).currentIndex,).toBe(index,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.currentIndex,).toBe(index,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).currentIndex,).toBe(index,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).currentIndex,).toBe(index,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.currentIndex,).toBe(index,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).currentIndex,).toBe(index,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).currentIndex,).toBe(index,),)
                        },)
                    },)
                    describe("next", () => {
                        test("initial", () => expect(instance.nextIndex,).toBe(index,),)

                        test("after 1 next",                () => expect(do1Next(instance,).nextIndex,).toBeNull(),)
                        test("after 1 previous",            () => expect(do1Previous(instance,).nextIndex,).toBeNull(),)
                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).nextIndex,).toBeNull(),)
                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).nextIndex,).toBeNull(),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.nextIndex,).toBeNull(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).nextIndex,).toBeNull(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).nextIndex,).toBeNull(),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.nextIndex,).toBeNull(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).nextIndex,).toBeNull(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).nextIndex,).toBeNull(),)
                        },)
                    },)
                    describe("previous", () => {
                        test("initial", () => expect(instance.previousIndex,).toBe(index,),)

                        test("after 1 next",                () => expect(do1Next(instance,).previousIndex,).toBeNull(),)
                        test("after 1 previous",            () => expect(do1Previous(instance,).previousIndex,).toBeNull(),)
                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).previousIndex,).toBeNull(),)
                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).previousIndex,).toBeNull(),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.previousIndex,).toBeNull(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).previousIndex,).toBeNull(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).previousIndex,).toBeNull(),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.previousIndex,).toBeNull(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).previousIndex,).toBeNull(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).previousIndex,).toBeNull(),)
                        },)
                    },)
                },)
                describe("has", () => {
                    describe("next", () => {
                        test("initial", () => expect(instance.hasNext,).toBeTrue(),)

                        test("after 1 next",                () => expect(do1Next(instance,).hasNext,).toBeFalse(),)
                        test("after 1 previous",            () => expect(do1Previous(instance,).hasNext,).toBeFalse(),)
                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).hasNext,).toBeFalse(),)
                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).hasNext,).toBeFalse(),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.hasNext,).toBeFalse(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).hasNext,).toBeFalse(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).hasNext,).toBeFalse(),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.hasNext,).toBeFalse(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).hasNext,).toBeFalse(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).hasNext,).toBeFalse(),)
                        },)
                    },)
                    describe("previous", () => {
                        test("initial", () => expect(instance.hasPrevious,).toBeTrue(),)

                        test("after 1 next",                () => expect(do1Next(instance,).hasPrevious,).toBeFalse(),)
                        test("after 1 previous",            () => expect(do1Previous(instance,).hasPrevious,).toBeFalse(),)
                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).hasPrevious,).toBeFalse(),)
                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).hasPrevious,).toBeFalse(),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.hasPrevious,).toBeFalse(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).hasPrevious,).toBeFalse(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).hasPrevious,).toBeFalse(),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.hasPrevious,).toBeFalse(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).hasPrevious,).toBeFalse(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).hasPrevious,).toBeFalse(),)
                        },)
                    },)
                },)
                describe("value", () => {
                    describe("next", () => {
                        test("initial", () => expect(instance.nextValue,).toBe(value,),)

                        test("after 1 next",                () => expect(asCallback(do1Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 1 previous",            () => expect(asCallback(do1Previous(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 1 previous and 1 next", () => expect(asCallback(do1PreviousAnd1Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 1 next and 1 previous", () => expect(asCallback(do1NextAnd1Previous(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(() => instance.nextValue,).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 1 next",     () => expect(asCallback(do1Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 1 previous", () => expect(asCallback(do1Previous(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(() => instance.nextValue,).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 1 next",     () => expect(asCallback(do1Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 1 previous", () => expect(asCallback(do1Previous(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        },)
                    },)
                    describe("previous", () => {
                        test("initial", () => expect(instance.previousValue,).toBe(value,),)

                        test("after 1 next",                () => expect(asCallback(do1Next(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 1 previous",            () => expect(asCallback(do1Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 1 previous and 1 next", () => expect(asCallback(do1PreviousAnd1Next(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 1 next and 1 previous", () => expect(asCallback(do1NextAnd1Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(() => instance.previousValue,).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 1 next",     () => expect(asCallback(do1Next(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 1 previous", () => expect(asCallback(do1Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(() => instance.previousValue,).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 1 next",     () => expect(asCallback(do1Next(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 1 previous", () => expect(asCallback(do1Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        },)
                    },)
                },)
                describe("iterator result", () => {
                    describe("next", () => {
                        test("initial", () => expect(instance.next(),).toBeInstanceOf(GenericIteratorValue,),)

                        test("after 1 next",                () => expect(do1Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                        test("after 1 previous",            () => expect(do1Previous(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                        },)
                    },)
                    describe("previous", () => {
                        test("initial", () => expect(instance.previous(),).toBeInstanceOf(GenericIteratorValue,),)

                        test("after 1 next", () => expect(do1Next(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                        test("after 1 previous", () => expect(do1Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                        },)
                    },)
                },)
                test("for‥of", () => expect(() => { for (const _ of instance); },).not.toThrow(),)
            },)
            describe("with size = 2", () => {
                //#region -------------------- Values / type declaration --------------------

                let instance: GenericCollectionIterator<PossibleValue>

                const array = AB
                type PossibleValue = typeof array[number]
                type PossibleIndex = | 0 | 1
                const firstIndex = 0 satisfies PossibleIndex
                const lastIndex = 1 satisfies PossibleIndex

                const firstValue = 'a' satisfies PossibleValue
                const lastValue = 'b' satisfies PossibleValue

                //#endregion -------------------- Values / type declaration --------------------
                beforeEach(() => instance = new GenericCollectionIterator(newCollectionInstance(iterableCreation, array,),) as unknown as GenericCollectionIterator<PossibleValue>,)

                describe("index", () => {
                    describe("current", () => {
                        test("initial", () => expect(instance.currentIndex,).toBeNull(),)

                        test("after 1 next", () => expect(do1Next(instance,).currentIndex,).toBe(firstIndex,),)
                        test("after 2 next", () => expect(do2Next(instance,).currentIndex,).toBe(lastIndex,),)

                        test("after 1 previous", () => expect(do1Previous(instance,).currentIndex,).toBe(lastIndex,),)
                        test("after 2 previous", () => expect(do2Previous(instance,).currentIndex,).toBe(firstIndex,),)

                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).currentIndex,).toBe(lastIndex,),)
                        test("after 2 previous and 1 next", () => expect(do2PreviousAnd1Next(instance,).currentIndex,).toBe(lastIndex,),)
                        test("after 1 previous and 2 next", () => expect(do1PreviousAnd2Next(instance,).currentIndex,).toBe(lastIndex,),)
                        test("after 2 previous and 2 next", () => expect(do2PreviousAnd2Next(instance,).currentIndex,).toBe(lastIndex,),)

                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).currentIndex,).toBe(firstIndex,),)
                        test("after 2 next and 1 previous", () => expect(do2NextAnd1Previous(instance,).currentIndex,).toBe(firstIndex,),)
                        test("after 1 next and 2 previous", () => expect(do1NextAnd2Previous(instance,).currentIndex,).toBe(firstIndex,),)
                        test("after 2 next and 2 previous", () => expect(do2NextAnd2Previous(instance,).currentIndex,).toBe(firstIndex,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.currentIndex,).toBe(lastIndex,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).currentIndex,).toBe(lastIndex,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).currentIndex,).toBe(lastIndex,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).currentIndex,).toBe(firstIndex,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).currentIndex,).toBe(firstIndex,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.currentIndex,).toBe(lastIndex,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).currentIndex,).toBe(lastIndex,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).currentIndex,).toBe(lastIndex,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).currentIndex,).toBe(firstIndex,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).currentIndex,).toBe(firstIndex,),)
                        },)
                    },)
                    describe("next", () => {
                        test("initial", () => expect(instance.nextIndex,).toBe(firstIndex,),)

                        test("after 1 next", () => expect(do1Next(instance,).nextIndex,).toBe(lastIndex,),)
                        test("after 2 next", () => expect(do2Next(instance,).nextIndex,).toBeNull(),)

                        test("after 1 previous", () => expect(do1Previous(instance,).nextIndex,).toBeNull(),)
                        test("after 2 previous", () => expect(do2Previous(instance,).nextIndex,).toBe(lastIndex,),)

                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).nextIndex,).toBeNull(),)
                        test("after 2 previous and 1 next", () => expect(do2PreviousAnd1Next(instance,).nextIndex,).toBeNull(),)
                        test("after 1 previous and 2 next", () => expect(do1PreviousAnd2Next(instance,).nextIndex,).toBeNull(),)
                        test("after 2 previous and 2 next", () => expect(do2PreviousAnd2Next(instance,).nextIndex,).toBeNull(),)

                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).nextIndex,).toBe(lastIndex,),)
                        test("after 2 next and 1 previous", () => expect(do2NextAnd1Previous(instance,).nextIndex,).toBe(lastIndex,),)
                        test("after 1 next and 2 previous", () => expect(do1NextAnd2Previous(instance,).nextIndex,).toBe(lastIndex,),)
                        test("after 2 next and 2 previous", () => expect(do2NextAnd2Previous(instance,).nextIndex,).toBe(lastIndex,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.nextIndex,).toBeNull(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).nextIndex,).toBeNull(),)
                            test("+ 2 next",     () => expect(do2Next(instance,).nextIndex,).toBeNull(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).nextIndex,).toBe(lastIndex,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).nextIndex,).toBe(lastIndex,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.nextIndex,).toBeNull(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).nextIndex,).toBeNull(),)
                            test("+ 2 next",     () => expect(do2Next(instance,).nextIndex,).toBeNull(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).nextIndex,).toBe(lastIndex,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).nextIndex,).toBe(lastIndex,),)
                        },)
                    },)
                    describe("previous", () => {
                        test("initial", () => expect(instance.previousIndex,).toBe(lastIndex,),)

                        test("after 1 next", () => expect(do1Next(instance,).previousIndex,).toBeNull(),)
                        test("after 2 next", () => expect(do2Next(instance,).previousIndex,).toBe(firstIndex,),)

                        test("after 1 previous", () => expect(do1Previous(instance,).previousIndex,).toBe(firstIndex,),)
                        test("after 2 previous", () => expect(do2Previous(instance,).previousIndex,).toBeNull(),)

                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).previousIndex,).toBe(firstIndex,),)
                        test("after 2 previous and 1 next", () => expect(do2PreviousAnd1Next(instance,).previousIndex,).toBe(firstIndex,),)
                        test("after 1 previous and 2 next", () => expect(do1PreviousAnd2Next(instance,).previousIndex,).toBe(firstIndex,),)
                        test("after 2 previous and 2 next", () => expect(do2PreviousAnd2Next(instance,).previousIndex,).toBe(firstIndex,),)

                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).previousIndex,).toBeNull(),)
                        test("after 2 next and 1 previous", () => expect(do2NextAnd1Previous(instance,).previousIndex,).toBeNull(),)
                        test("after 1 next and 2 previous", () => expect(do1NextAnd2Previous(instance,).previousIndex,).toBeNull(),)
                        test("after 2 next and 2 previous", () => expect(do2NextAnd2Previous(instance,).previousIndex,).toBeNull(),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.previousIndex,).toBe(firstIndex,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).previousIndex,).toBe(firstIndex,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).previousIndex,).toBe(firstIndex,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).previousIndex,).toBeNull(),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).previousIndex,).toBeNull(),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.previousIndex,).toBe(firstIndex,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).previousIndex,).toBe(firstIndex,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).previousIndex,).toBe(firstIndex,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).previousIndex,).toBeNull(),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).previousIndex,).toBeNull(),)
                        },)
                    },)
                },)
                describe("has", () => {
                    describe("next", () => {
                        test("initial", () => expect(instance.hasNext,).toBeTrue(),)

                        test("after 1 next", () => expect(do1Next(instance,).hasNext,).toBeTrue(),)
                        test("after 2 next", () => expect(do2Next(instance,).hasNext,).toBeFalse(),)

                        test("after 1 previous", () => expect(do1Previous(instance,).hasNext,).toBeFalse(),)
                        test("after 2 previous", () => expect(do2Previous(instance,).hasNext,).toBeTrue(),)

                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).hasNext,).toBeFalse(),)
                        test("after 2 previous and 1 next", () => expect(do2PreviousAnd1Next(instance,).hasNext,).toBeFalse(),)
                        test("after 1 previous and 2 next", () => expect(do1PreviousAnd2Next(instance,).hasNext,).toBeFalse(),)
                        test("after 2 previous and 2 next", () => expect(do2PreviousAnd2Next(instance,).hasNext,).toBeFalse(),)

                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).hasNext,).toBeTrue(),)
                        test("after 2 next and 1 previous", () => expect(do2NextAnd1Previous(instance,).hasNext,).toBeTrue(),)
                        test("after 1 next and 2 previous", () => expect(do1NextAnd2Previous(instance,).hasNext,).toBeTrue(),)
                        test("after 2 next and 2 previous", () => expect(do2NextAnd2Previous(instance,).hasNext,).toBeTrue(),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.hasNext,).toBeFalse(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).hasNext,).toBeFalse(),)
                            test("+ 2 next",     () => expect(do2Next(instance,).hasNext,).toBeFalse(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).hasNext,).toBeTrue(),)
                            test("+ 2 previous", () => expect(do1Previous(instance,).hasNext,).toBeTrue(),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.hasNext,).toBeFalse(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).hasNext,).toBeFalse(),)
                            test("+ 2 next",     () => expect(do2Next(instance,).hasNext,).toBeFalse(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).hasNext,).toBeTrue(),)
                            test("+ 2 previous", () => expect(do1Previous(instance,).hasNext,).toBeTrue(),)
                        },)
                    },)
                    describe("previous", () => {
                        test("initial", () => expect(instance.hasPrevious,).toBeTrue(),)

                        test("after 1 next", () => expect(do1Next(instance,).hasPrevious,).toBeFalse(),)
                        test("after 2 next", () => expect(do2Next(instance,).hasPrevious,).toBeTrue(),)

                        test("after 1 previous", () => expect(do1Previous(instance,).hasPrevious,).toBeTrue(),)
                        test("after 2 previous", () => expect(do2Previous(instance,).hasPrevious,).toBeFalse(),)

                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).hasPrevious,).toBeTrue(),)
                        test("after 2 previous and 1 next", () => expect(do2PreviousAnd1Next(instance,).hasPrevious,).toBeTrue(),)
                        test("after 1 previous and 2 next", () => expect(do1PreviousAnd2Next(instance,).hasPrevious,).toBeTrue(),)
                        test("after 2 previous and 2 next", () => expect(do2PreviousAnd2Next(instance,).hasPrevious,).toBeTrue(),)

                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).hasPrevious,).toBeFalse(),)
                        test("after 2 next and 1 previous", () => expect(do2NextAnd1Previous(instance,).hasPrevious,).toBeFalse(),)
                        test("after 1 next and 2 previous", () => expect(do1NextAnd2Previous(instance,).hasPrevious,).toBeFalse(),)
                        test("after 2 next and 2 previous", () => expect(do2NextAnd2Previous(instance,).hasPrevious,).toBeFalse(),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.hasPrevious,).toBeTrue(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).hasPrevious,).toBeTrue(),)
                            test("+ 2 next",     () => expect(do2Next(instance,).hasPrevious,).toBeTrue(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).hasPrevious,).toBeFalse(),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).hasPrevious,).toBeFalse(),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.hasPrevious,).toBeTrue(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).hasPrevious,).toBeTrue(),)
                            test("+ 2 next",     () => expect(do2Next(instance,).hasPrevious,).toBeTrue(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).hasPrevious,).toBeFalse(),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).hasPrevious,).toBeFalse(),)
                        },)
                    },)
                },)
                describe("value", () => {
                    describe("next", () => {
                        test("initial", () => expect(instance.nextValue,).toBe(firstValue,),)

                        test("after 1 next", () => expect(do1Next(instance,).nextValue,).toBe(lastValue,),)
                        test("after 2 next", () => expect(asCallback(do2Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)

                        test("after 1 previous", () => expect(asCallback(do1Previous(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 2 previous", () => expect(do2Previous(instance,).nextValue,).toBe(lastValue,),)

                        test("after 1 previous and 1 next", () => expect(asCallback(do1PreviousAnd1Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 2 previous and 1 next", () => expect(asCallback(do2PreviousAnd1Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 1 previous and 2 next", () => expect(asCallback(do1PreviousAnd2Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 2 previous and 2 next", () => expect(asCallback(do2PreviousAnd2Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)

                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).nextValue,).toBe(lastValue,),)
                        test("after 2 next and 1 previous", () => expect(do2NextAnd1Previous(instance,).nextValue,).toBe(lastValue,),)
                        test("after 1 next and 2 previous", () => expect(do1NextAnd2Previous(instance,).nextValue,).toBe(lastValue,),)
                        test("after 2 next and 2 previous", () => expect(do2NextAnd2Previous(instance,).nextValue,).toBe(lastValue,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(() => instance.nextValue,).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 1 next",     () => expect(asCallback(do1Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 2 next",     () => expect(asCallback(do2Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).nextValue,).toBe(lastValue,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).nextValue,).toBe(lastValue,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(() => instance.nextValue,).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 1 next",     () => expect(asCallback(do1Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 2 next",     () => expect(asCallback(do2Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).nextValue,).toBe(lastValue,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).nextValue,).toBe(lastValue,),)
                        },)
                    },)
                    describe("previous", () => {
                        test("initial", () => expect(instance.previousValue,).toBe(lastValue,),)

                        test("after 1 next", () => expect(asCallback(do1Next(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 2 next", () => expect(do2Next(instance,).previousValue,).toBe(firstValue,),)

                        test("after 1 previous", () => expect(do1Previous(instance,).previousValue,).toBe(firstValue,),)
                        test("after 2 previous", () => expect(asCallback(do2Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)

                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).previousValue,).toBe(firstValue),)
                        test("after 2 previous and 1 next", () => expect(do2PreviousAnd1Next(instance,).previousValue,).toBe(firstValue,),)
                        test("after 1 previous and 2 next", () => expect(do1PreviousAnd2Next(instance,).previousValue,).toBe(firstValue,),)
                        test("after 2 previous and 2 next", () => expect(do2PreviousAnd2Next(instance,).previousValue,).toBe(firstValue,),)

                        test("after 1 next and 1 previous", () => expect(asCallback(do1NextAnd1Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 2 next and 1 previous", () => expect(asCallback(do2NextAnd1Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 1 next and 2 previous", () => expect(asCallback(do1NextAnd2Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 2 next and 2 previous", () => expect(asCallback(do2NextAnd2Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.previousValue,).toBe(firstValue,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).previousValue,).toBe(firstValue,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).previousValue,).toBe(firstValue,),)
                            test("+ 1 previous", () => expect(asCallback(do1Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 2 previous", () => expect(asCallback(do2Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.previousValue,).toBe(firstValue,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).previousValue,).toBe(firstValue,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).previousValue,).toBe(firstValue,),)
                            test("+ 1 previous", () => expect(asCallback(do1Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 2 previous", () => expect(asCallback(do2Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        },)
                    },)
                },)
                describe("iterator result", () => {
                    describe("next", () => {
                        test("initial", () => expect(instance.next(),).toBeInstanceOf(GenericIteratorValue,),)

                        test("after 1 next", () => expect(do1Next(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)
                        test("after 2 next", () => expect(do2Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)

                        test("after 1 previous", () => expect(do1Previous(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                        test("after 2 previous", () => expect(do2Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)

                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                        test("after 2 previous and 1 next", () => expect(do2PreviousAnd1Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                        test("after 1 previous and 2 next", () => expect(do1PreviousAnd2Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                        test("after 2 previous and 2 next", () => expect(do2PreviousAnd2Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)

                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)
                        test("after 2 next and 1 previous", () => expect(do2NextAnd1Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)
                        test("after 1 next and 2 previous", () => expect(do1NextAnd2Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)
                        test("after 2 next and 2 previous", () => expect(do2NextAnd2Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)
                        },)
                    },)
                    describe("previous", () => {
                        test("initial", () => expect(instance.previous(),).toBeInstanceOf(GenericIteratorValue,),)

                        test("after 1 next", () => expect(do1Next(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                        test("after 2 next", () => expect(do2Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)

                        test("after 1 previous", () => expect(do1Previous(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                        test("after 2 previous", () => expect(do2Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)

                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                        test("after 2 previous and 1 next", () => expect(do2PreviousAnd1Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                        test("after 1 previous and 2 next", () => expect(do1PreviousAnd2Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                        test("after 2 previous and 2 next", () => expect(do2PreviousAnd2Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)

                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                        test("after 2 next and 1 previous", () => expect(do2NextAnd1Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                        test("after 1 next and 2 previous", () => expect(do1NextAnd2Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                        test("after 2 next and 2 previous", () => expect(do2NextAnd2Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.previous(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.previous(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                        },)
                    },)
                },)
                test("for‥of", () => expect(() => { for (const _ of instance); },).not.toThrow(),)
            },)
            describe("with size = 10", () => {
                //#region -------------------- Values / type declaration --------------------

                let instance: GenericCollectionIterator<PossibleValue>

                const array = ABCDEFGHIJ
                type PossibleValue = typeof array[number]
                type PossibleIndex = | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
                const firstIndex = 0 satisfies PossibleIndex
                const secondIndex = 1 satisfies PossibleIndex
                const thirdIndex = 2 satisfies PossibleIndex
                const fourthLastIndex = 6 satisfies PossibleIndex
                const thirdLastIndex = 7 satisfies PossibleIndex
                const secondLastIndex = 8 satisfies PossibleIndex
                const lastIndex = 9 satisfies PossibleIndex

                const firstValue = 'a' satisfies PossibleValue
                const secondValue = 'b' satisfies PossibleValue
                const thirdValue = 'c' satisfies PossibleValue
                const fourthLastValue = 'g' satisfies PossibleValue
                const thirdLastValue = 'h' satisfies PossibleValue
                const secondLastValue = 'i' satisfies PossibleValue
                const lastValue = 'j' satisfies PossibleValue

                //#endregion -------------------- Values / type declaration --------------------
                beforeEach(() => instance = new GenericCollectionIterator(newCollectionInstance(iterableCreation, array,),) as unknown as GenericCollectionIterator<PossibleValue>,)

                describe("index", () => {
                    describe("current", () => {
                        test("initial", () => expect(instance.currentIndex,).toBeNull(),)

                        test("after 1 next", () => expect(do1Next(instance,).currentIndex,).toBe(firstIndex,),)
                        test("after 2 next", () => expect(do2Next(instance,).currentIndex,).toBe(secondIndex,),)

                        test("after 1 previous", () => expect(do1Previous(instance,).currentIndex,).toBe(lastIndex,),)
                        test("after 2 previous", () => expect(do2Previous(instance,).currentIndex,).toBe(secondLastIndex,),)

                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).currentIndex,).toBe(lastIndex,),)
                        test("after 2 previous and 1 next", () => expect(do2PreviousAnd1Next(instance,).currentIndex,).toBe(lastIndex,),)
                        test("after 1 previous and 2 next", () => expect(do1PreviousAnd2Next(instance,).currentIndex,).toBe(lastIndex,),)
                        test("after 2 previous and 2 next", () => expect(do2PreviousAnd2Next(instance,).currentIndex,).toBe(lastIndex,),)

                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).currentIndex,).toBe(firstIndex,),)
                        test("after 2 next and 1 previous", () => expect(do2NextAnd1Previous(instance,).currentIndex,).toBe(firstIndex,),)
                        test("after 1 next and 2 previous", () => expect(do1NextAnd2Previous(instance,).currentIndex,).toBe(firstIndex,),)
                        test("after 2 next and 2 previous", () => expect(do2NextAnd2Previous(instance,).currentIndex,).toBe(firstIndex,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.currentIndex,).toBe(lastIndex,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).currentIndex,).toBe(lastIndex,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).currentIndex,).toBe(lastIndex,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).currentIndex,).toBe(secondLastIndex,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).currentIndex,).toBe(thirdLastIndex,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.currentIndex,).toBe(lastIndex,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).currentIndex,).toBe(lastIndex,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).currentIndex,).toBe(lastIndex,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).currentIndex,).toBe(secondLastIndex,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).currentIndex,).toBe(thirdLastIndex,),)
                        },)
                    },)
                    describe("next", () => {
                        test("initial", () => expect(instance.nextIndex,).toBe(firstIndex,),)

                        test("after 1 next", () => expect(do1Next(instance,).nextIndex,).toBe(secondIndex,),)
                        test("after 2 next", () => expect(do2Next(instance,).nextIndex,).toBe(thirdIndex,),)

                        test("after 1 previous", () => expect(do1Previous(instance,).nextIndex,).toBeNull(),)
                        test("after 2 previous", () => expect(do2Previous(instance,).nextIndex,).toBe(lastIndex,),)

                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).nextIndex,).toBeNull(),)
                        test("after 2 previous and 1 next", () => expect(do2PreviousAnd1Next(instance,).nextIndex,).toBeNull(),)
                        test("after 1 previous and 2 next", () => expect(do1PreviousAnd2Next(instance,).nextIndex,).toBeNull(),)
                        test("after 2 previous and 2 next", () => expect(do2PreviousAnd2Next(instance,).nextIndex,).toBeNull(),)

                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).nextIndex,).toBe(secondIndex,),)
                        test("after 2 next and 1 previous", () => expect(do2NextAnd1Previous(instance,).nextIndex,).toBe(secondIndex,),)
                        test("after 1 next and 2 previous", () => expect(do1NextAnd2Previous(instance,).nextIndex,).toBe(secondIndex,),)
                        test("after 2 next and 2 previous", () => expect(do2NextAnd2Previous(instance,).nextIndex,).toBe(secondIndex,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.nextIndex,).toBeNull(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).nextIndex,).toBeNull(),)
                            test("+ 2 next",     () => expect(do2Next(instance,).nextIndex,).toBeNull(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).nextIndex,).toBe(lastIndex,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).nextIndex,).toBe(secondLastIndex,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.nextIndex,).toBeNull(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).nextIndex,).toBeNull(),)
                            test("+ 2 next",     () => expect(do2Next(instance,).nextIndex,).toBeNull(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).nextIndex,).toBe(lastIndex,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).nextIndex,).toBe(secondLastIndex,),)
                        },)
                    },)
                    describe("previous", () => {
                        test("initial", () => expect(instance.previousIndex,).toBe(lastIndex,),)

                        test("after 1 next", () => expect(do1Next(instance,).previousIndex,).toBeNull(),)
                        test("after 2 next", () => expect(do2Next(instance,).previousIndex,).toBe(firstIndex,),)

                        test("after 1 previous", () => expect(do1Previous(instance,).previousIndex,).toBe(secondLastIndex,),)
                        test("after 2 previous", () => expect(do2Previous(instance,).previousIndex,).toBe(thirdLastIndex,),)

                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).previousIndex,).toBe(secondLastIndex,),)
                        test("after 2 previous and 1 next", () => expect(do2PreviousAnd1Next(instance,).previousIndex,).toBe(secondLastIndex,),)
                        test("after 1 previous and 2 next", () => expect(do1PreviousAnd2Next(instance,).previousIndex,).toBe(secondLastIndex,),)
                        test("after 2 previous and 2 next", () => expect(do2PreviousAnd2Next(instance,).previousIndex,).toBe(secondLastIndex,),)

                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).previousIndex,).toBeNull(),)
                        test("after 2 next and 1 previous", () => expect(do2NextAnd1Previous(instance,).previousIndex,).toBeNull(),)
                        test("after 1 next and 2 previous", () => expect(do1NextAnd2Previous(instance,).previousIndex,).toBeNull(),)
                        test("after 2 next and 2 previous", () => expect(do2NextAnd2Previous(instance,).previousIndex,).toBeNull(),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.previousIndex,).toBe(secondLastIndex,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).previousIndex,).toBe(secondLastIndex,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).previousIndex,).toBe(secondLastIndex,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).previousIndex,).toBe(thirdLastIndex,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).previousIndex,).toBe(fourthLastIndex,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.previousIndex,).toBe(secondLastIndex,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).previousIndex,).toBe(secondLastIndex,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).previousIndex,).toBe(secondLastIndex,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).previousIndex,).toBe(thirdLastIndex,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).previousIndex,).toBe(fourthLastIndex,),)
                        },)
                    },)
                },)
                describe("has", () => {
                    describe("next", () => {
                        test("initial", () => expect(instance.hasNext,).toBeTrue(),)

                        test("after 1 next", () => expect(do1Next(instance,).hasNext,).toBeTrue(),)
                        test("after 2 next", () => expect(do2Next(instance,).hasNext,).toBeTrue(),)

                        test("after 1 previous", () => expect(do1Previous(instance,).hasNext,).toBeFalse(),)
                        test("after 2 previous", () => expect(do2Previous(instance,).hasNext,).toBeTrue(),)

                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).hasNext,).toBeFalse(),)
                        test("after 2 previous and 1 next", () => expect(do2PreviousAnd1Next(instance,).hasNext,).toBeFalse(),)
                        test("after 1 previous and 2 next", () => expect(do1PreviousAnd2Next(instance,).hasNext,).toBeFalse(),)
                        test("after 2 previous and 2 next", () => expect(do2PreviousAnd2Next(instance,).hasNext,).toBeFalse(),)

                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).hasNext,).toBeTrue(),)
                        test("after 2 next and 1 previous", () => expect(do2NextAnd1Previous(instance,).hasNext,).toBeTrue(),)
                        test("after 1 next and 2 previous", () => expect(do1NextAnd2Previous(instance,).hasNext,).toBeTrue(),)
                        test("after 2 next and 2 previous", () => expect(do2NextAnd2Previous(instance,).hasNext,).toBeTrue(),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.hasNext,).toBeFalse(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).hasNext,).toBeFalse(),)
                            test("+ 2 next",     () => expect(do2Next(instance,).hasNext,).toBeFalse(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).hasNext,).toBeTrue(),)
                            test("+ 2 previous", () => expect(do1Previous(instance,).hasNext,).toBeTrue(),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.hasNext,).toBeFalse(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).hasNext,).toBeFalse(),)
                            test("+ 2 next",     () => expect(do2Next(instance,).hasNext,).toBeFalse(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).hasNext,).toBeTrue(),)
                            test("+ 2 previous", () => expect(do1Previous(instance,).hasNext,).toBeTrue(),)
                        },)
                    },)
                    describe("previous", () => {
                        test("initial", () => expect(instance.hasPrevious,).toBeTrue(),)

                        test("after 1 next", () => expect(do1Next(instance,).hasPrevious,).toBeFalse(),)
                        test("after 2 next", () => expect(do2Next(instance,).hasPrevious,).toBeTrue(),)

                        test("after 1 previous", () => expect(do1Previous(instance,).hasPrevious,).toBeTrue(),)
                        test("after 2 previous", () => expect(do2Previous(instance,).hasPrevious,).toBeTrue(),)

                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).hasPrevious,).toBeTrue(),)
                        test("after 2 previous and 1 next", () => expect(do2PreviousAnd1Next(instance,).hasPrevious,).toBeTrue(),)
                        test("after 1 previous and 2 next", () => expect(do1PreviousAnd2Next(instance,).hasPrevious,).toBeTrue(),)
                        test("after 2 previous and 2 next", () => expect(do2PreviousAnd2Next(instance,).hasPrevious,).toBeTrue(),)

                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).hasPrevious,).toBeFalse(),)
                        test("after 2 next and 1 previous", () => expect(do2NextAnd1Previous(instance,).hasPrevious,).toBeFalse(),)
                        test("after 1 next and 2 previous", () => expect(do1NextAnd2Previous(instance,).hasPrevious,).toBeFalse(),)
                        test("after 2 next and 2 previous", () => expect(do2NextAnd2Previous(instance,).hasPrevious,).toBeFalse(),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.hasPrevious,).toBeTrue(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).hasPrevious,).toBeTrue(),)
                            test("+ 2 next",     () => expect(do2Next(instance,).hasPrevious,).toBeTrue(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).hasPrevious,).toBeTrue(),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).hasPrevious,).toBeTrue(),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.hasPrevious,).toBeTrue(),)
                            test("+ 1 next",     () => expect(do1Next(instance,).hasPrevious,).toBeTrue(),)
                            test("+ 2 next",     () => expect(do2Next(instance,).hasPrevious,).toBeTrue(),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).hasPrevious,).toBeTrue(),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).hasPrevious,).toBeTrue(),)
                        },)
                    },)
                },)
                describe("value", () => {
                    describe("next", () => {
                        test("initial", () => expect(instance.nextValue,).toBe(firstValue,),)

                        test("after 1 next", () => expect(do1Next(instance,).nextValue,).toBe(secondValue,),)
                        test("after 2 next", () => expect(do2Next(instance,).nextValue,).toBe(thirdValue,),)

                        test("after 1 previous", () => expect(asCallback(do1Previous(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 2 previous", () => expect(do2Previous(instance,).nextValue,).toBe(lastValue,),)

                        test("after 1 previous and 1 next", () => expect(asCallback(do1PreviousAnd1Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 2 previous and 1 next", () => expect(asCallback(do2PreviousAnd1Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 1 previous and 2 next", () => expect(asCallback(do1PreviousAnd2Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 2 previous and 2 next", () => expect(asCallback(do2PreviousAnd2Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)

                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).nextValue,).toBe(secondValue,),)
                        test("after 2 next and 1 previous", () => expect(do2NextAnd1Previous(instance,).nextValue,).toBe(secondValue,),)
                        test("after 1 next and 2 previous", () => expect(do1NextAnd2Previous(instance,).nextValue,).toBe(secondValue,),)
                        test("after 2 next and 2 previous", () => expect(do2NextAnd2Previous(instance,).nextValue,).toBe(secondValue,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(() => instance.nextValue,).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 1 next",     () => expect(asCallback(do1Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 2 next",     () => expect(asCallback(do2Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).nextValue,).toBe(lastValue,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).nextValue,).toBe(secondLastValue,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(() => instance.nextValue,).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 1 next",     () => expect(asCallback(do1Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 2 next",     () => expect(asCallback(do2Next(instance,), it => it.nextValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).nextValue,).toBe(lastValue,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).nextValue,).toBe(secondLastValue,),)
                        },)
                    },)
                    describe("previous", () => {
                        test("initial", () => expect(instance.previousValue,).toBe(lastValue,),)

                        test("after 1 next", () => expect(asCallback(do1Next(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 2 next", () => expect(do2Next(instance,).previousValue,).toBe(firstValue,),)

                        test("after 1 previous", () => expect(do1Previous(instance,).previousValue,).toBe(secondLastValue,),)
                        test("after 2 previous", () => expect(do2Previous(instance,).previousValue,).toBe(thirdLastValue,),)

                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).previousValue,).toBe(secondLastValue),)
                        test("after 2 previous and 1 next", () => expect(do2PreviousAnd1Next(instance,).previousValue,).toBe(secondLastValue,),)
                        test("after 1 previous and 2 next", () => expect(do1PreviousAnd2Next(instance,).previousValue,).toBe(secondLastValue,),)
                        test("after 2 previous and 2 next", () => expect(do2PreviousAnd2Next(instance,).previousValue,).toBe(secondLastValue,),)

                        test("after 1 next and 1 previous", () => expect(asCallback(do1NextAnd1Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 2 next and 1 previous", () => expect(asCallback(do2NextAnd1Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 1 next and 2 previous", () => expect(asCallback(do1NextAnd2Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)
                        test("after 2 next and 2 previous", () => expect(asCallback(do2NextAnd2Previous(instance,), it => it.previousValue,),).toThrow(NoElementFoundInCollectionHolderException,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.previousValue,).toBe(secondLastValue,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).previousValue,).toBe(secondLastValue,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).previousValue,).toBe(secondLastValue,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).previousValue,).toBe(thirdLastValue,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).previousValue,).toBe(fourthLastValue,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.previousValue,).toBe(secondLastValue,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).previousValue,).toBe(secondLastValue,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).previousValue,).toBe(secondLastValue,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).previousValue,).toBe(thirdLastValue,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).previousValue,).toBe(fourthLastValue,),)
                        },)
                    },)
                },)
                describe("iterator result", () => {
                    describe("next", () => {
                        test("initial", () => expect(instance.next(),).toBeInstanceOf(GenericIteratorValue,),)

                        test("after 1 next", () => expect(do1Next(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)
                        test("after 2 next", () => expect(do2Next(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)

                        test("after 1 previous", () => expect(do1Previous(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                        test("after 2 previous", () => expect(do2Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)

                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                        test("after 2 previous and 1 next", () => expect(do2PreviousAnd1Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                        test("after 1 previous and 2 next", () => expect(do1PreviousAnd2Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                        test("after 2 previous and 2 next", () => expect(do2PreviousAnd2Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)

                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)
                        test("after 2 next and 1 previous", () => expect(do2NextAnd1Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)
                        test("after 1 next and 2 previous", () => expect(do1NextAnd2Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)
                        test("after 2 next and 2 previous", () => expect(do2NextAnd2Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).next(),).toBeInstanceOf(GenericAfterLastIteratorValue,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).next(),).toBeInstanceOf(GenericIteratorValue,),)
                        },)
                    },)
                    describe("previous", () => {
                        test("initial", () => expect(instance.previous(),).toBeInstanceOf(GenericIteratorValue,),)

                        test("after 1 next", () => expect(do1Next(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                        test("after 2 next", () => expect(do2Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)

                        test("after 1 previous", () => expect(do1Previous(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                        test("after 2 previous", () => expect(do2Previous(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)

                        test("after 1 previous and 1 next", () => expect(do1PreviousAnd1Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                        test("after 2 previous and 1 next", () => expect(do2PreviousAnd1Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                        test("after 1 previous and 2 next", () => expect(do1PreviousAnd2Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                        test("after 2 previous and 2 next", () => expect(do2PreviousAnd2Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)

                        test("after 1 next and 1 previous", () => expect(do1NextAnd1Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                        test("after 2 next and 1 previous", () => expect(do2NextAnd1Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                        test("after 1 next and 2 previous", () => expect(do1NextAnd2Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)
                        test("after 2 next and 2 previous", () => expect(do2NextAnd2Previous(instance,).previous(),).toBeInstanceOf(GenericBeforeFirstIteratorValue,),)

                        describe("after forEach", () => {
                            beforeEach(() => instance.forEach(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.previous(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                        },)
                        describe("after forEachIndexed", () => {
                            beforeEach(() => instance.forEachIndexed(EMPTY_CALLBACK,),)
                            test("direct",       () => expect(instance.previous(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 1 next",     () => expect(do1Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 2 next",     () => expect(do2Next(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 1 previous", () => expect(do1Previous(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                            test("+ 2 previous", () => expect(do2Previous(instance,).previous(),).toBeInstanceOf(GenericIteratorValue,),)
                        },)
                    },)
                },)
                test("for‥of", () => expect(() => { for (const _ of instance); },).not.toThrow(),)
            },)
        },)},)
    },)

},)

//#region -------------------- next / previous operation --------------------

function do1Next<const ITERATOR extends CollectionIterator, >(iterator: ITERATOR,) {
    iterator.next()
    return iterator
}

function do2Next<const ITERATOR extends CollectionIterator, >(iterator: ITERATOR,) {
    iterator.next()
    iterator.next()
    return iterator
}

function do1Previous<const ITERATOR extends CollectionIterator, >(iterator: ITERATOR,) {
    iterator.previous()
    return iterator
}

function do2Previous<const const ITERATOR extends CollectionIterator, >(iterator: ITERATOR,) {
    iterator.previous()
    iterator.previous()
    return iterator
}


function do1PreviousAnd1Next<const ITERATOR extends CollectionIterator, >(iterator: ITERATOR,) {
    iterator.previous()
    iterator.next()
    return iterator
}

function do1PreviousAnd2Next<const ITERATOR extends CollectionIterator, >(iterator: ITERATOR,) {
    iterator.previous()
    iterator.next()
    iterator.next()
    return iterator
}

function do2PreviousAnd1Next<const ITERATOR extends CollectionIterator, >(iterator: ITERATOR,) {
    iterator.previous()
    iterator.previous()
    iterator.next()
    return iterator
}

function do2PreviousAnd2Next<const ITERATOR extends CollectionIterator, >(iterator: ITERATOR,) {
    iterator.previous()
    iterator.previous()
    iterator.next()
    iterator.next()
    return iterator
}


function do1NextAnd1Previous<const ITERATOR extends CollectionIterator, >(iterator: ITERATOR,) {
    iterator.next()
    iterator.previous()
    return iterator
}

function do1NextAnd2Previous<const ITERATOR extends CollectionIterator, >(iterator: ITERATOR,) {
    iterator.next()
    iterator.previous()
    iterator.previous()
    return iterator
}

function do2NextAnd1Previous<const ITERATOR extends CollectionIterator, >(iterator: ITERATOR,) {
    iterator.next()
    iterator.next()
    iterator.previous()
    return iterator
}

function do2NextAnd2Previous<const ITERATOR extends CollectionIterator, >(iterator: ITERATOR,) {
    iterator.next()
    iterator.next()
    iterator.previous()
    iterator.previous()
    return iterator
}


function asCallback<const T, const ITERATOR extends CollectionIterator, >(iterator: ITERATOR, on: (iterator: ITERATOR,) => T,): () => T { return () => on(iterator,) }

//#endregion -------------------- next / previous operation --------------------
