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

import {CollectionHolder_1Follower}                   from "./instance/CollectionHolder_1.follower"
import {CollectionHolder_2Follower}                   from "./instance/CollectionHolder_2.follower"
import {CollectionHolder_AdaptorOfArrayFollower}      from "./instance/CollectionHolder_AdaptorOfArray.follower"
import {CollectionHolder_AdaptorOfIteratorFollower}   from "./instance/CollectionHolder_AdaptorOfIterator.follower"
import {CollectionHolder_AdaptorOfJsIteratorFollower} from "./instance/CollectionHolder_AdaptorOfJsIterator.follower"
import {CollectionHolder_AdaptorOfJsIterableFollower} from "./instance/CollectionHolder_AdaptorOfJsIterable.follower"
import {CollectionHolder_AdaptorOfMinimalistFollower} from "./instance/CollectionHolder_AdaptorOfMinimalist.follower"
import {CollectionHolder_AdaptorOfSetFollower}        from "./instance/CollectionHolder_AdaptorOfSet.follower"
import {CollectionHolder_ArrayOf1Follower}            from "./instance/CollectionHolder_ArrayOf1.follower"
import {CollectionHolder_ArrayOf2Follower}            from "./instance/CollectionHolder_ArrayOf2.follower"
import {CollectionHolder_ByGenericCollectionFollower} from "./instance/CollectionHolder_ByGenericCollection.follower"
import {CollectionHolder_ByViewerFollower}            from "./instance/CollectionHolder_ByViewer.follower"
import {CollectionHolder_LazyFollower}                from "./instance/CollectionHolder_Lazy.follower"
import {CollectionHolder_LazyOf0Or1Follower}          from "./instance/CollectionHolder_LazyOf0Or1.follower"
import {CollectionHolder_LazyOf0Or1Or2Follower}       from "./instance/CollectionHolder_LazyOf0Or1Or2.follower"
import {CollectionHolder_LazyOf1Follower}             from "./instance/CollectionHolder_LazyOf1.follower"
import {CollectionHolder_LazyOf1Or2Follower}          from "./instance/CollectionHolder_LazyOf1Or2.follower"
import {CollectionHolder_LazyOf2Follower}             from "./instance/CollectionHolder_LazyOf2.follower"
import {CollectionHolder_SetOf1Follower}              from "./instance/CollectionHolder_SetOf1.follower"
import {CollectionHolder_SetOf2Follower}              from "./instance/CollectionHolder_SetOf2.follower"
import {CollectionHolderFromArray}                    from "./instance/CollectionHolderFromArray"
import {MinimalistCollectionHolderFromArray}          from "./instance/MinimalistCollectionHolderFromArray"
import {A}                                            from "./value/arrays"
import {callbackAsTrue0}                              from "./value/callbacks (boolean)"

import {findFirstIndex, findFirstIndexByArray, findFirstIndexByCollectionHolder, findFirstIndexByMinimalistCollectionHolder}                                                     from "../src/method/findFirstIndex"
import {findFirstIndexIndexed, findFirstIndexIndexedByArray, findFirstIndexIndexedByCollectionHolder, findFirstIndexIndexedByMinimalistCollectionHolder}                         from "../src/method/findFirstIndexIndexed"
import {findFirstIndexIndexedOrNull, findFirstIndexIndexedOrNullByArray, findFirstIndexIndexedOrNullByCollectionHolder, findFirstIndexIndexedOrNullByMinimalistCollectionHolder} from "../src/method/findFirstIndexIndexedOrNull"
import {findFirstIndexOrNull, findFirstIndexOrNullByArray, findFirstIndexOrNullByCollectionHolder, findFirstIndexOrNullByMinimalistCollectionHolder}                             from "../src/method/findFirstIndexOrNull"
import {findIndex, findIndexByArray, findIndexByCollectionHolder, findIndexByMinimalistCollectionHolder}                                                                         from "../src/method/findIndex"
import {findIndexIndexed, findIndexIndexedByArray, findIndexIndexedByCollectionHolder, findIndexIndexedByMinimalistCollectionHolder}                                             from "../src/method/findIndexIndexed"
import {findIndexIndexedOrNull, findIndexIndexedOrNullByArray, findIndexIndexedOrNullByCollectionHolder, findIndexIndexedOrNullByMinimalistCollectionHolder}                     from "../src/method/findIndexIndexedOrNull"
import {findIndexOrNull, findIndexOrNullByArray, findIndexOrNullByCollectionHolder, findIndexOrNullByMinimalistCollectionHolder}                                                 from "../src/method/findIndexOrNull"
import {findLastIndex, findLastIndexByArray, findLastIndexByCollectionHolder, findLastIndexByMinimalistCollectionHolder}                                                         from "../src/method/findLastIndex"
import {findLastIndexIndexed, findLastIndexIndexedByArray, findLastIndexIndexedByCollectionHolder, findLastIndexIndexedByMinimalistCollectionHolder}                             from "../src/method/findLastIndexIndexed"
import {findLastIndexIndexedOrNull, findLastIndexIndexedOrNullByArray, findLastIndexIndexedOrNullByCollectionHolder, findLastIndexIndexedOrNullByMinimalistCollectionHolder}     from "../src/method/findLastIndexIndexedOrNull"
import {findLastIndexOrNull, findLastIndexOrNullByArray, findLastIndexOrNullByCollectionHolder, findLastIndexOrNullByMinimalistCollectionHolder}                                 from "../src/method/findLastIndexOrNull"
import * as firstIndexOfModule                                                                                                                                                   from "../src/method/firstIndexOf"
import * as firstIndexOfOrNullModule                                                                                                                                             from "../src/method/firstIndexOfOrNull"
import {indexOf, indexOfByArray, indexOfByCollectionHolder, indexOfByMinimalistCollectionHolder}                                                                                 from "../src/method/indexOf"
import {indexOfOrNull, indexOfOrNullByArray, indexOfOrNullByCollectionHolder, indexOfOrNullByMinimalistCollectionHolder}                                                         from "../src/method/indexOfOrNull"
import * as indexOfFirstModule                                                                                                                                                   from "../src/method/indexOfFirst"
import * as indexOfFirstIndexedModule                                                                                                                                            from "../src/method/indexOfFirstIndexed"
import * as indexOfFirstIndexedOrNullModule                                                                                                                                      from "../src/method/indexOfFirstIndexedOrNull"
import * as indexOfFirstOrNullModule                                                                                                                                             from "../src/method/indexOfFirstOrNull"
import * as indexOfLastModule                                                                                                                                                    from "../src/method/indexOfLast"
import * as indexOfLastIndexedModule                                                                                                                                             from "../src/method/indexOfLastIndexed"
import * as indexOfLastIndexedOrNullModule                                                                                                                                       from "../src/method/indexOfLastIndexedOrNull"
import * as indexOfLastOrNullModule                                                                                                                                              from "../src/method/indexOfLastOrNull"

describe("CollectionHolderTest (index) ~ aliases", () => {
    describe("ArrayAsCollectionHolder", () => {
        test("indexOf",                     () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("ArrayOf1AsCollectionHolder", () => {
        test("indexOf",                     () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("ArrayOf2AsCollectionHolder", () => {
        test("indexOf",                     () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("CollectionHolderOf1", () => {
        test("indexOf",                     () => expect(new CollectionHolder_1Follower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_1Follower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_1Follower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_1Follower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_1Follower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_1Follower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_1Follower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_1Follower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_1Follower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_1Follower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_1Follower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_1Follower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_1Follower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_1Follower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("CollectionHolderOf2", () => {
        test("indexOf",                     () => expect(new CollectionHolder_2Follower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_2Follower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_2Follower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_2Follower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_2Follower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_2Follower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_2Follower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_2Follower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_2Follower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_2Follower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_2Follower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_2Follower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_2Follower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_2Follower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("CollectionViewer", () => {
        test("indexOf",                     () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("GenericCollectionHolder", () => {
        test("indexOf",                     () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("IteratorAsCollectionHolder", () => {
        test("indexOf",                     () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("JsIterableAsCollectionHolder", () => {
        test("indexOf",                     () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("JsIteratorAsCollectionHolder", () => {
        test("indexOf",                     () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("LazyCollectionHolder", () => {
        test("indexOf",                     () => expect(new CollectionHolder_LazyFollower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_LazyFollower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_LazyFollower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_LazyFollower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_LazyFollower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_LazyFollower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_LazyFollower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_LazyFollower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_LazyFollower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_LazyFollower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_LazyFollower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_LazyFollower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_LazyFollower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_LazyFollower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("LazyCollectionHolderOf0Or1", () => {
        test("indexOf",                     () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("LazyCollectionHolderOf0Or1Or2", () => {
        test("indexOf",                     () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("LazyCollectionHolderOf1", () => {
        test("indexOf",                     () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("LazyCollectionHolderOf1Or2", () => {
        test("indexOf",                     () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("LazyCollectionHolderOf2", () => {
        test("indexOf",                     () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("MinimalistAsCollectionHolder", () => {
        test("indexOf",                     () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("SetAsCollectionHolder", () => {
        test("indexOf",                     () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("SetOf1AsCollectionHolder", () => {
        test("indexOf",                     () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)
    describe("SetOf2AsCollectionHolder", () => {
        test("indexOf",                     () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.indexOf("a",),)                                .firstIndexOf_amountOfCall,)             .toBe(1,),)
        test("indexOfOrNull",               () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.indexOfOrNull("a",),)                          .firstIndexOfOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndex",              () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.findFirstIndex(callbackAsTrue0,),)             .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findIndex",                   () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.findIndex(callbackAsTrue0,),)                  .indexOfFirst_amountOfCall,)             .toBe(1,),)
        test("findFirstIndexOrNull",        () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.findFirstIndexOrNull(callbackAsTrue0,),)       .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findIndexOrNull",             () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.findIndexOrNull(callbackAsTrue0,),)            .indexOfFirstOrNull_amountOfCall,)       .toBe(1,),)
        test("findFirstIndexIndexed",       () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.findFirstIndexIndexed(callbackAsTrue0,),)      .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findIndexIndexed",            () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.findIndexIndexed(callbackAsTrue0,),)           .indexOfFirstIndexed_amountOfCall,)      .toBe(1,),)
        test("findFirstIndexIndexedOrNull", () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.findFirstIndexIndexedOrNull(callbackAsTrue0,),).indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findIndexIndexedOrNull",      () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.findIndexIndexedOrNull(callbackAsTrue0,),)     .indexOfFirstIndexedOrNull_amountOfCall,).toBe(1,),)
        test("findLastIndex",               () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.findLastIndex(callbackAsTrue0,),)              .indexOfLast_amountOfCall,)              .toBe(1,),)
        test("findLastIndexOrNull",         () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.findLastIndexOrNull(callbackAsTrue0,),)        .indexOfLastOrNull_amountOfCall,)        .toBe(1,),)
        test("findLastIndexIndexed",        () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.findLastIndexIndexed(callbackAsTrue0,),)       .indexOfLastIndexed_amountOfCall,)       .toBe(1,),)
        test("findLastIndexIndexedOrNull",  () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.findLastIndexIndexedOrNull(callbackAsTrue0,),) .indexOfLastIndexedOrNull_amountOfCall,) .toBe(1,),)
    },)

    describe("indexOf", () => {
        test("all", () => {
            const method = jest.spyOn(firstIndexOfModule, "firstIndexOf",)
            indexOf(A, "a",)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("minimalist collection holder", () => {
            const method = jest.spyOn(firstIndexOfModule, "firstIndexOfByMinimalistCollectionHolder",)
            indexOfByMinimalistCollectionHolder(new MinimalistCollectionHolderFromArray(A,), "a",)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("collection holder", () => {
            const method = jest.spyOn(firstIndexOfModule, "firstIndexOfByCollectionHolder",)
            indexOfByCollectionHolder(new CollectionHolderFromArray(A,), "a",)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("array", () => {
            const method = jest.spyOn(firstIndexOfModule, "firstIndexOfByArray",)
            indexOfByArray(A, "a",)
            expect(method,).toHaveBeenCalledOnce()
        },)
    },)
    describe("indexOfOrNull", () => {
        test("all", () => {
            const method = jest.spyOn(firstIndexOfOrNullModule, "firstIndexOfOrNull",)
            indexOfOrNull(null, null,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("minimalist collection holder", () => {
            const method = jest.spyOn(firstIndexOfOrNullModule, "firstIndexOfOrNullByMinimalistCollectionHolder",)
            indexOfOrNullByMinimalistCollectionHolder(null, null,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("collection holder", () => {
            const method = jest.spyOn(firstIndexOfOrNullModule, "firstIndexOfOrNullByCollectionHolder",)
            indexOfOrNullByCollectionHolder(null, null,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("array", () => {
            const method = jest.spyOn(firstIndexOfOrNullModule, "firstIndexOfOrNullByArray",)
            indexOfOrNullByArray(null, null,)
            expect(method,).toHaveBeenCalledOnce()
        },)
    },)

    describe("findFirstIndex", () => {
        test("all", () => {
            const method = jest.spyOn(indexOfFirstModule, "indexOfFirst",)
            findFirstIndex(A, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("minimalist collection holder", () => {
            const method = jest.spyOn(indexOfFirstModule, "indexOfFirstByMinimalistCollectionHolder",)
            findFirstIndexByMinimalistCollectionHolder(new MinimalistCollectionHolderFromArray(A,), callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("collection holder", () => {
            const method = jest.spyOn(indexOfFirstModule, "indexOfFirstByCollectionHolder",)
            findFirstIndexByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("array", () => {
            const method = jest.spyOn(indexOfFirstModule, "indexOfFirstByArray",)
            findFirstIndexByArray(A, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
    },)
    describe("findIndex", () => {
        test("all", () => {
            const method = jest.spyOn(indexOfFirstModule, "indexOfFirst",)
            findIndex(A, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("minimalist collection holder", () => {
            const method = jest.spyOn(indexOfFirstModule, "indexOfFirstByMinimalistCollectionHolder",)
            findIndexByMinimalistCollectionHolder(new MinimalistCollectionHolderFromArray(A,), callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("collection holder", () => {
            const method = jest.spyOn(indexOfFirstModule, "indexOfFirstByCollectionHolder",)
            findIndexByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("array", () => {
            const method = jest.spyOn(indexOfFirstModule, "indexOfFirstByArray",)
            findIndexByArray(A, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
    },)
    describe("findFirstIndexOrNull", () => {
        test("all", () => {
            const method = jest.spyOn(indexOfFirstOrNullModule, "indexOfFirstOrNull",)
            findFirstIndexOrNull(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("minimalist collection holder", () => {
            const method = jest.spyOn(indexOfFirstOrNullModule, "indexOfFirstOrNullByMinimalistCollectionHolder",)
            findFirstIndexOrNullByMinimalistCollectionHolder(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("collection holder", () => {
            const method = jest.spyOn(indexOfFirstOrNullModule, "indexOfFirstOrNullByCollectionHolder",)
            findFirstIndexOrNullByCollectionHolder(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("array", () => {
            const method = jest.spyOn(indexOfFirstOrNullModule, "indexOfFirstOrNullByArray",)
            findFirstIndexOrNullByArray(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
    },)
    describe("findIndexOrNull", () => {
        test("all", () => {
            const method = jest.spyOn(indexOfFirstOrNullModule, "indexOfFirstOrNull",)
            findIndexOrNull(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("minimalist collection holder", () => {
            const method = jest.spyOn(indexOfFirstOrNullModule, "indexOfFirstOrNullByMinimalistCollectionHolder",)
            findIndexOrNullByMinimalistCollectionHolder(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("collection holder", () => {
            const method = jest.spyOn(indexOfFirstOrNullModule, "indexOfFirstOrNullByCollectionHolder",)
            findIndexOrNullByCollectionHolder(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("array", () => {
            const method = jest.spyOn(indexOfFirstOrNullModule, "indexOfFirstOrNullByArray",)
            findIndexOrNullByArray(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
    },)
    describe("findFirstIndexIndexed", () => {
        test("all", () => {
            const method = jest.spyOn(indexOfFirstIndexedModule, "indexOfFirstIndexed",)
            findFirstIndexIndexed(A, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("minimalist collection holder", () => {
            const method = jest.spyOn(indexOfFirstIndexedModule, "indexOfFirstIndexedByMinimalistCollectionHolder",)
            findFirstIndexIndexedByMinimalistCollectionHolder(new MinimalistCollectionHolderFromArray(A,), callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("collection holder", () => {
            const method = jest.spyOn(indexOfFirstIndexedModule, "indexOfFirstIndexedByCollectionHolder",)
            findFirstIndexIndexedByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("array", () => {
            const method = jest.spyOn(indexOfFirstIndexedModule, "indexOfFirstIndexedByArray",)
            findFirstIndexIndexedByArray(A, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
    },)
    describe("findIndexIndexed", () => {
        test("all", () => {
            const method = jest.spyOn(indexOfFirstIndexedModule, "indexOfFirstIndexed",)
            findIndexIndexed(A, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("minimalist collection holder", () => {
            const method = jest.spyOn(indexOfFirstIndexedModule, "indexOfFirstIndexedByMinimalistCollectionHolder",)
            findIndexIndexedByMinimalistCollectionHolder(new MinimalistCollectionHolderFromArray(A,), callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("collection holder", () => {
            const method = jest.spyOn(indexOfFirstIndexedModule, "indexOfFirstIndexedByCollectionHolder",)
            findIndexIndexedByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("array", () => {
            const method = jest.spyOn(indexOfFirstIndexedModule, "indexOfFirstIndexedByArray",)
            findIndexIndexedByArray(A, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
    },)
    describe("findFirstIndexIndexedOrNull", () => {
        test("all", () => {
            const method = jest.spyOn(indexOfFirstIndexedOrNullModule, "indexOfFirstIndexedOrNull",)
            findFirstIndexIndexedOrNull(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("minimalist collection holder", () => {
            const method = jest.spyOn(indexOfFirstIndexedOrNullModule, "indexOfFirstIndexedOrNullByMinimalistCollectionHolder",)
            findFirstIndexIndexedOrNullByMinimalistCollectionHolder(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("collection holder", () => {
            const method = jest.spyOn(indexOfFirstIndexedOrNullModule, "indexOfFirstIndexedOrNullByCollectionHolder",)
            findFirstIndexIndexedOrNullByCollectionHolder(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("array", () => {
            const method = jest.spyOn(indexOfFirstIndexedOrNullModule, "indexOfFirstIndexedOrNullByArray",)
            findFirstIndexIndexedOrNullByArray(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
    },)
    describe("findIndexIndexed", () => {
        test("all", () => {
            const method = jest.spyOn(indexOfFirstIndexedOrNullModule, "indexOfFirstIndexedOrNull",)
            findIndexIndexedOrNull(A, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("minimalist collection holder", () => {
            const method = jest.spyOn(indexOfFirstIndexedOrNullModule, "indexOfFirstIndexedOrNullByMinimalistCollectionHolder",)
            findIndexIndexedOrNullByMinimalistCollectionHolder(new MinimalistCollectionHolderFromArray(A,), callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("collection holder", () => {
            const method = jest.spyOn(indexOfFirstIndexedOrNullModule, "indexOfFirstIndexedOrNullByCollectionHolder",)
            findIndexIndexedOrNullByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("array", () => {
            const method = jest.spyOn(indexOfFirstIndexedOrNullModule, "indexOfFirstIndexedOrNullByArray",)
            findIndexIndexedOrNullByArray(A, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
    },)

    describe("findLastIndex", () => {
        test("all", () => {
            const method = jest.spyOn(indexOfLastModule, "indexOfLast",)
            findLastIndex(A, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("minimalist collection holder", () => {
            const method = jest.spyOn(indexOfLastModule, "indexOfLastByMinimalistCollectionHolder",)
            findLastIndexByMinimalistCollectionHolder(new MinimalistCollectionHolderFromArray(A,), callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("collection holder", () => {
            const method = jest.spyOn(indexOfLastModule, "indexOfLastByCollectionHolder",)
            findLastIndexByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("array", () => {
            const method = jest.spyOn(indexOfLastModule, "indexOfLastByArray",)
            findLastIndexByArray(A, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
    },)
    describe("findLastIndexOrNull", () => {
        test("all", () => {
            const method = jest.spyOn(indexOfLastOrNullModule, "indexOfLastOrNull",)
            findLastIndexOrNull(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("minimalist collection holder", () => {
            const method = jest.spyOn(indexOfLastOrNullModule, "indexOfLastOrNullByMinimalistCollectionHolder",)
            findLastIndexOrNullByMinimalistCollectionHolder(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("collection holder", () => {
            const method = jest.spyOn(indexOfLastOrNullModule, "indexOfLastOrNullByCollectionHolder",)
            findLastIndexOrNullByCollectionHolder(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("array", () => {
            const method = jest.spyOn(indexOfLastOrNullModule, "indexOfLastOrNullByArray",)
            findLastIndexOrNullByArray(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
    },)
    describe("findLastIndexIndexed", () => {
        test("all", () => {
            const method = jest.spyOn(indexOfLastIndexedModule, "indexOfLastIndexed",)
            findLastIndexIndexed(A, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("minimalist collection holder", () => {
            const method = jest.spyOn(indexOfLastIndexedModule, "indexOfLastIndexedByMinimalistCollectionHolder",)
            findLastIndexIndexedByMinimalistCollectionHolder(new MinimalistCollectionHolderFromArray(A,), callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("collection holder", () => {
            const method = jest.spyOn(indexOfLastIndexedModule, "indexOfLastIndexedByCollectionHolder",)
            findLastIndexIndexedByCollectionHolder(new CollectionHolderFromArray(A,), callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("array", () => {
            const method = jest.spyOn(indexOfLastIndexedModule, "indexOfLastIndexedByArray",)
            findLastIndexIndexedByArray(A, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
    },)
    describe("findLastIndexIndexedOrNull", () => {
        test("all", () => {
            const method = jest.spyOn(indexOfLastIndexedOrNullModule, "indexOfLastIndexedOrNull",)
            findLastIndexIndexedOrNull(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("minimalist collection holder", () => {
            const method = jest.spyOn(indexOfLastIndexedOrNullModule, "indexOfLastIndexedOrNullByMinimalistCollectionHolder",)
            findLastIndexIndexedOrNullByMinimalistCollectionHolder(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("collection holder", () => {
            const method = jest.spyOn(indexOfLastIndexedOrNullModule, "indexOfLastIndexedOrNullByCollectionHolder",)
            findLastIndexIndexedOrNullByCollectionHolder(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
        test("array", () => {
            const method = jest.spyOn(indexOfLastIndexedOrNullModule, "indexOfLastIndexedOrNullByArray",)
            findLastIndexIndexedOrNullByArray(null, callbackAsTrue0,)
            expect(method,).toHaveBeenCalledOnce()
        },)
    },)
},)
