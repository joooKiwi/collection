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

import {describe, expect, test} from "vitest"

import {CollectionHolder_ByViewer} from "./instance/CollectionHolder_ByViewer"
import {callbackAsTrue0}           from "./value/callbacks (boolean)"

describe("CollectionHolderTest (index) ~ viewer", () => {
    test("firstIndexOf",              () => expect(new CollectionHolder_ByViewer().execute(it => it.firstIndexOf('a',),)                         .firstIndexOf_amountOfCall,)             .toBe(1,),)
    test("firstIndexOfOrNull",        () => expect(new CollectionHolder_ByViewer().execute(it => it.firstIndexOfOrNull('a',),)                   .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
    test("lastIndexOf",               () => expect(new CollectionHolder_ByViewer().execute(it => it.lastIndexOf('a',),)                          .lastIndexOf_amountOfCall,)              .toBe(1,),)
    test("lastIndexOfOrNull",         () => expect(new CollectionHolder_ByViewer().execute(it => it.lastIndexOfOrNull('a',),)                    .lastIndexOfOrNull_amountOfCall,)        .toBe(1,),)
    test("indexOfFirst",              () => expect(new CollectionHolder_ByViewer().execute(it => it.indexOfFirst(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
    test("indexOfFirstOrNull",        () => expect(new CollectionHolder_ByViewer().execute(it => it.indexOfFirstOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
    test("indexOfFirstIndexed",       () => expect(new CollectionHolder_ByViewer().execute(it => it.indexOfFirstIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
    test("indexOfFirstIndexedOrNull", () => expect(new CollectionHolder_ByViewer().execute(it => it.indexOfFirstIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
    test("indexOfLast",               () => expect(new CollectionHolder_ByViewer().execute(it => it.indexOfLast(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
    test("indexOfLastOrNull",         () => expect(new CollectionHolder_ByViewer().execute(it => it.indexOfLastOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
    test("indexOfLastIndexed",        () => expect(new CollectionHolder_ByViewer().execute(it => it.indexOfLastIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
    test("indexOfLastIndexedOrNull",  () => expect(new CollectionHolder_ByViewer().execute(it => it.indexOfLastIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
},)
