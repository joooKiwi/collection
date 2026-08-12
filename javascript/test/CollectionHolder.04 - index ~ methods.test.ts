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

import {callbackAsFail0}               from "./value/callbacks (fail)"
import {everyExtensionMethodInstances} from "./value/instances"

describe("CollectionHolderTest (index) ~ methods", () => {
describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance, emptyException,},},) => {
    //TODO: Add other kind of test for index → methods
    test("firstIndexOf", () => expect(() => instance.firstIndexOf(null,),).toThrow(emptyException,),)
    test("firstIndexOfOrNull", () => expect(instance.firstIndexOfOrNull(null,),).toBeNull(),)

    test("lastIndexOf", () => expect(() => instance.lastIndexOf(null,),).toThrow(emptyException,),)
    test("lastIndexOfOrNull", () => expect(instance.lastIndexOfOrNull(null,),).toBeNull(),)

    test("indexOfFirst", () => expect(() => instance.indexOfFirst(callbackAsFail0,),).toThrow(emptyException,),)
    test("indexOfFirstOrNull", () => expect(instance.indexOfFirstOrNull(callbackAsFail0,),).toBeNull(),)
    test("indexOfFirstIndexed", () => expect(() => instance.indexOfFirstIndexed(callbackAsFail0,),).toThrow(emptyException,),)
    test("indexOfFirstIndexedOrNull", () => expect(instance.indexOfFirstIndexedOrNull(callbackAsFail0,),).toBeNull(),)

    test("indexOfLast", () => expect(() => instance.indexOfLast(callbackAsFail0,),).toThrow(emptyException,),)
    test("indexOfLastOrNull", () => expect(instance.indexOfLastOrNull(callbackAsFail0,),).toBeNull(),)
    test("indexOfLastIndexed", () => expect(() => instance.indexOfLastIndexed(callbackAsFail0,),).toThrow(emptyException,),)
    test("indexOfLastIndexedOrNull", () => expect(instance.indexOfLastIndexedOrNull(callbackAsFail0,),).toBeNull(),)
},)},)
