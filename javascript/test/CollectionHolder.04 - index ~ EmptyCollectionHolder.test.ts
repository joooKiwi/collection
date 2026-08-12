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

import {EmptyCollectionHolder}    from "../src/EmptyCollectionHolder"
import {EmptyCollectionException} from "../src/exception/EmptyCollectionException"

describe("CollectionHolderTest (index) ~ EmptyCollectionHolder", () => {
    const instance = EmptyCollectionHolder.get

    test("firstIndexOf",                () => expect(() => instance.firstIndexOf(),).toThrow(EmptyCollectionException,),)
    test("indexOf",                     () => expect(() => instance.indexOf(),).toThrow(EmptyCollectionException,),)
    test("firstIndexOfOrNull",          () => expect(instance.firstIndexOfOrNull(),).toBeNull(),)
    test("indexOfOrNull",               () => expect(instance.indexOfOrNull(),).toBeNull(),)
    test("lastIndexOf",                 () => expect(() => instance.lastIndexOf(),).toThrow(EmptyCollectionException,),)
    test("lastIndexOfOrNull",           () => expect(instance.lastIndexOfOrNull(),).toBeNull(),)

    test("indexOfFirst",                () => expect(() => instance.indexOfFirst(),).toThrow(EmptyCollectionException,),)
    test("findFirstIndex",              () => expect(() => instance.findFirstIndex(),).toThrow(EmptyCollectionException,),)
    test("findIndex",                   () => expect(() => instance.findIndex(),).toThrow(EmptyCollectionException,),)
    test("indexOfFirstOrNull",          () => expect(instance.indexOfFirstOrNull(),).toBeNull(),)
    test("findFirstIndexOrNull",        () => expect(instance.findFirstIndexOrNull(),).toBeNull(),)
    test("findIndexOrNull",             () => expect(instance.findIndexOrNull(),).toBeNull(),)
    test("indexOfFirstIndexed",         () => expect(() => instance.indexOfFirstIndexed(),).toThrow(EmptyCollectionException,),)
    test("findFirstIndexIndexed",       () => expect(() => instance.findFirstIndexIndexed(),).toThrow(EmptyCollectionException,),)
    test("findIndexIndexed",            () => expect(() => instance.findIndexIndexed(),).toThrow(EmptyCollectionException,),)
    test("indexOfFirstIndexedOrNull",   () => expect(instance.indexOfFirstIndexedOrNull(),).toBeNull(),)
    test("findFirstIndexIndexedOrNull", () => expect(instance.findFirstIndexIndexedOrNull(),).toBeNull(),)
    test("findIndexIndexedOrNull",      () => expect(instance.findIndexIndexedOrNull(),).toBeNull(),)

    test("indexOfLast",                 () => expect(() => instance.indexOfLast(),).toThrow(EmptyCollectionException,),)
    test("findLastIndex",               () => expect(() => instance.findLastIndex(),).toThrow(EmptyCollectionException,),)
    test("indexOfLastOrNull",           () => expect(instance.indexOfLastOrNull(),).toBeNull(),)
    test("findLastIndexOrNull",         () => expect(instance.findLastIndexOrNull(),).toBeNull(),)
    test("indexOfLastIndexed",          () => expect(() => instance.indexOfLastIndexed(),).toThrow(EmptyCollectionException,),)
    test("findLastIndexIndexed",        () => expect(() => instance.findLastIndexIndexed(),).toThrow(EmptyCollectionException,),)
    test("indexOfLastIndexedOrNull",    () => expect(instance.indexOfLastIndexedOrNull(),).toBeNull(),)
    test("findLastIndexIndexedOrNull",  () => expect(instance.findLastIndexIndexedOrNull(),).toBeNull(),)
},)
