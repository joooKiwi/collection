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

import {CollectionHolder_1Follower}                                                                                                                                                                                                                                                                                                                                                                 from "./instance/CollectionHolder_1.follower"
import {CollectionHolder_2Follower}                                                                                                                                                                                                                                                                                                                                                                 from "./instance/CollectionHolder_2.follower"
import {CollectionHolder_AdaptorOfArrayFollower}                                                                                                                                                                                                                                                                                                                                                    from "./instance/CollectionHolder_AdaptorOfArray.follower"
import {CollectionHolder_AdaptorOfIteratorFollower}                                                                                                                                                                                                                                                                                                                                                 from "./instance/CollectionHolder_AdaptorOfIterator.follower"
import {CollectionHolder_AdaptorOfJsIteratorFollower}                                                                                                                                                                                                                                                                                                                                               from "./instance/CollectionHolder_AdaptorOfJsIterator.follower"
import {CollectionHolder_AdaptorOfJsIterableFollower}                                                                                                                                                                                                                                                                                                                                               from "./instance/CollectionHolder_AdaptorOfJsIterable.follower"
import {CollectionHolder_AdaptorOfMinimalistFollower}                                                                                                                                                                                                                                                                                                                                               from "./instance/CollectionHolder_AdaptorOfMinimalist.follower"
import {CollectionHolder_AdaptorOfSetFollower}                                                                                                                                                                                                                                                                                                                                                      from "./instance/CollectionHolder_AdaptorOfSet.follower"
import {CollectionHolder_ArrayOf1Follower}                                                                                                                                                                                                                                                                                                                                                          from "./instance/CollectionHolder_ArrayOf1.follower"
import {CollectionHolder_ArrayOf2Follower}                                                                                                                                                                                                                                                                                                                                                          from "./instance/CollectionHolder_ArrayOf2.follower"
import {CollectionHolder_ByGenericCollectionFollower}                                                                                                                                                                                                                                                                                                                                               from "./instance/CollectionHolder_ByGenericCollection.follower"
import {CollectionHolder_ByGenericCollection}                                                                                                                                                                                                                                                                                                                                                       from "./instance/CollectionHolder_ByGenericCollection"
import {CollectionHolder_ByMinimalistCollection}                                                                                                                                                                                                                                                                                                                                                    from "./instance/CollectionHolder_ByMinimalistCollection"
import {CollectionHolder_ByViewerFollower}                                                                                                                                                                                                                                                                                                                                                          from "./instance/CollectionHolder_ByViewer.follower"
import {CollectionHolder_LazyFollower}                                                                                                                                                                                                                                                                                                                                                              from "./instance/CollectionHolder_Lazy.follower"
import {CollectionHolder_LazyOf0Or1Follower}                                                                                                                                                                                                                                                                                                                                                        from "./instance/CollectionHolder_LazyOf0Or1.follower"
import {CollectionHolder_LazyOf0Or1Or2Follower}                                                                                                                                                                                                                                                                                                                                                     from "./instance/CollectionHolder_LazyOf0Or1Or2.follower"
import {CollectionHolder_LazyOf1Follower}                                                                                                                                                                                                                                                                                                                                                           from "./instance/CollectionHolder_LazyOf1.follower"
import {CollectionHolder_LazyOf1Or2Follower}                                                                                                                                                                                                                                                                                                                                                        from "./instance/CollectionHolder_LazyOf1Or2.follower"
import {CollectionHolder_LazyOf2Follower}                                                                                                                                                                                                                                                                                                                                                           from "./instance/CollectionHolder_LazyOf2.follower"
import {CollectionHolder_SetOf1Follower}                                                                                                                                                                                                                                                                                                                                                            from "./instance/CollectionHolder_SetOf1.follower"
import {CollectionHolder_SetOf2Follower}                                                                                                                                                                                                                                                                                                                                                            from "./instance/CollectionHolder_SetOf2.follower"
import {A, AB, ABC, ABCD, B, BCD, CD, D, EMPTY}                                                                                                                                                                                                                                                                                                                                                     from "./value/arrays"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                                                                                                                                                                                                                                                                                          from "./value/callbacks (fail)"
import {callbackAsFalse0, callbackAsFalse1, callbackAsFalse2, callbackAsTrue0, callbackAsTrue1, callbackAsTrue2}                                                                                                                                                                                                                                                                                    from "./value/callbacks (boolean)"
import {callbackIsOver0, callbackIsOver0Alt, callbackIsOver1, callbackIsOver1Alt, callbackIsOver2, callbackIsOver2Alt, callbackIsOver3, callbackIsOver3Alt, callbackIsOver4, callbackIsOver4Alt, callbackIsUnder0, callbackIsUnder0Alt, callbackIsUnder1, callbackIsUnder1Alt, callbackIsUnder2, callbackIsUnder2Alt, callbackIsUnder3, callbackIsUnder3Alt, callbackIsUnder4, callbackIsUnder4Alt} from "./value/callbacks (number)"
import {callbackIsOverA, callbackIsOverAAlt, callbackIsOverB, callbackIsOverBAlt, callbackIsOverC, callbackIsOverCAlt, callbackIsOverD, callbackIsOverDAlt, callbackIsOverE, callbackIsOverEAlt, callbackIsUnderA, callbackIsUnderAAlt, callbackIsUnderB, callbackIsUnderBAlt, callbackIsUnderC, callbackIsUnderCAlt, callbackIsUnderD, callbackIsUnderDAlt, callbackIsUnderE, callbackIsUnderEAlt} from "./value/callbacks (string)"
import {emptyCollectionHolder, every0Instances, every1Instances, every2Instances, everyExtensionMethodInstances, everyNInstances}                                                                                                                                                                                                                                                                   from "./value/instances"

import {EmptyCollectionHolder}                                                                                                                       from "../src/EmptyCollectionHolder"
import {ForbiddenIndexException}                                                                                                                     from "../src/exception/ForbiddenIndexException"
import * as dropModule                                                                                                                               from "../src/method/drop"
import * as dropLastModule                                                                                                                           from "../src/method/dropLast"
import * as dropLastWhileModule                                                                                                                      from "../src/method/dropLastWhile"
import * as dropLastWhileIndexedModule                                                                                                               from "../src/method/dropLastWhileIndexed"
import * as dropWhileModule                                                                                                                          from "../src/method/dropWhile"
import * as dropWhileIndexedModule                                                                                                                   from "../src/method/dropWhileIndexed"
import {skip, skipByArray, skipByCollectionHolder, skipByMinimalistCollectionHolder}                                                                 from "../src/method/skip"
import {skipLast, skipLastByArray, skipLastByCollectionHolder, skipLastByMinimalistCollectionHolder}                                                 from "../src/method/skipLast"
import {skipLastWhile, skipLastWhileByArray, skipLastWhileByCollectionHolder, skipLastWhileByMinimalistCollectionHolder}                             from "../src/method/skipLastWhile"
import {skipLastWhileIndexed, skipLastWhileIndexedByArray, skipLastWhileIndexedByCollectionHolder, skipLastWhileIndexedByMinimalistCollectionHolder} from "../src/method/skipLastWhileIndexed"
import {skipWhile, skipWhileByArray, skipWhileByCollectionHolder, skipWhileByMinimalistCollectionHolder}                                             from "../src/method/skipWhile"
import {skipWhileIndexed, skipWhileIndexedByArray, skipWhileIndexedByCollectionHolder, skipWhileIndexedByMinimalistCollectionHolder}                 from "../src/method/skipWhileIndexed"

describe("CollectionHolderTest (drop)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("drop",                 () => expect(instance.drop(),)                .toBe(instance,),)
        test("skip",                 () => expect(instance.skip(),)                .toBe(instance,),)
        test("dropWhile",            () => expect(instance.dropWhile(),)           .toBe(instance,),)
        test("skipWhile",            () => expect(instance.skipWhile(),)           .toBe(instance,),)
        test("dropWhileIndexed",     () => expect(instance.dropWhileIndexed(),)    .toBe(instance,),)
        test("skipWhileIndexed",     () => expect(instance.skipWhileIndexed(),)    .toBe(instance,),)
        test("dropLast",             () => expect(instance.dropLast(),)            .toBe(instance,),)
        test("skipLast",             () => expect(instance.skipLast(),)            .toBe(instance,),)
        test("dropLastWhile",        () => expect(instance.dropLastWhile(),)       .toBe(instance,),)
        test("skipLastWhile",        () => expect(instance.skipLastWhile(),)       .toBe(instance,),)
        test("dropLastWhileIndexed", () => expect(instance.dropLastWhileIndexed(),).toBe(instance,),)
        test("skipLastWhileIndexed", () => expect(instance.skipLastWhileIndexed(),).toBe(instance,),)
    },)

    describe("aliases", () => {
        describe("ArrayAsCollectionHolder", () => {
            test("skip",                 () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("ArrayOf1AsCollectionHolder", () => {
            test("skip",                 () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("ArrayOf2AsCollectionHolder", () => {
            test("skip",                 () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("CollectionHolderOf1", () => {
            test("skip",                 () => expect(new CollectionHolder_1Follower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_1Follower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_1Follower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_1Follower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_1Follower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_1Follower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("CollectionHolderOf2", () => {
            test("skip",                 () => expect(new CollectionHolder_2Follower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_2Follower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_2Follower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_2Follower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_2Follower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_2Follower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("CollectionViewer", () => {
            test("skip",                 () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("GenericCollectionHolder", () => {
            test("skip",                 () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("IteratorAsCollectionHolder", () => {
            test("skip",                 () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("JsIterableAsCollectionHolder", () => {
            test("skip",                 () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("JsIteratorAsCollectionHolder", () => {
            test("skip",                 () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolder", () => {
            test("skip",                 () => expect(new CollectionHolder_LazyFollower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_LazyFollower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_LazyFollower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_LazyFollower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_LazyFollower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_LazyFollower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf0Or1", () => {
            test("skip",                 () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf0Or1Or2", () => {
            test("skip",                 () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf1", () => {
            test("skip",                 () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf1Or2", () => {
            test("skip",                 () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf2", () => {
            test("skip",                 () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("MinimalistAsCollectionHolder", () => {
            test("skip",                 () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("SetAsCollectionHolder", () => {
            test("skip",                 () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("SetOf1AsCollectionHolder", () => {
            test("skip",                 () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("SetOf2AsCollectionHolder", () => {
            test("skip",                 () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.skip(0,),)                               .drop_amountOfCall,)                .toBe(1,),)
            test("skipWhile",            () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.skipWhile(callbackAsFalse0,),)           .dropWhile_amountOfCall,)           .toBe(1,),)
            test("skipWhileIndexed",     () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.skipWhileIndexed(callbackAsFalse0,),)    .dropWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("skipLast",             () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.skipLast(0,),)                           .dropLast_amountOfCall,)            .toBe(1,),)
            test("skipLastWhile",        () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.skipLastWhile(callbackAsFalse0,),)       .dropLastWhile_amountOfCall,)       .toBe(1,),)
            test("skipLastWhileIndexed", () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.skipLastWhileIndexed(callbackAsFalse0,),).dropLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)

        describe("skip", () => {
            test("all", () => {
                const method = jest.spyOn(dropModule, "drop",)
                skip(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropModule, "dropByMinimalistCollectionHolder",)
                skipByMinimalistCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropModule, "dropByCollectionHolder",)
                skipByCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropModule, "dropByArray",)
                skipByArray(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("skipWhile", () => {
            test("all", () => {
                const method = jest.spyOn(dropWhileModule, "dropWhile",)
                skipWhile(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropWhileModule, "dropWhileByMinimalistCollectionHolder",)
                skipWhileByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropWhileModule, "dropWhileByCollectionHolder",)
                skipWhileByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropWhileModule, "dropWhileByArray",)
                skipWhileByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("skipWhileIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(dropWhileIndexedModule, "dropWhileIndexed",)
                skipWhileIndexed(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropWhileIndexedModule, "dropWhileIndexedByMinimalistCollectionHolder",)
                skipWhileIndexedByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropWhileIndexedModule, "dropWhileIndexedByCollectionHolder",)
                skipWhileIndexedByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropWhileIndexedModule, "dropWhileIndexedByArray",)
                skipWhileIndexedByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("skipLast", () => {
            test("all", () => {
                const method = jest.spyOn(dropLastModule, "dropLast",)
                skipLast(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropLastModule, "dropLastByMinimalistCollectionHolder",)
                skipLastByMinimalistCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropLastModule, "dropLastByCollectionHolder",)
                skipLastByCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropLastModule, "dropLastByArray",)
                skipLastByArray(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("skipLastWhile", () => {
            test("all", () => {
                const method = jest.spyOn(dropLastWhileModule, "dropLastWhile",)
                skipLastWhile(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropLastWhileModule, "dropLastWhileByMinimalistCollectionHolder",)
                skipLastWhileByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropLastWhileModule, "dropLastWhileByCollectionHolder",)
                skipLastWhileByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropLastWhileModule, "dropLastWhileByArray",)
                skipLastWhileByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("skipLastWhileIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(dropLastWhileIndexedModule, "dropLastWhileIndexed",)
                skipLastWhileIndexed(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(dropLastWhileIndexedModule, "dropLastWhileIndexedByMinimalistCollectionHolder",)
                skipLastWhileIndexedByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(dropLastWhileIndexedModule, "dropLastWhileIndexedByCollectionHolder",)
                skipLastWhileIndexedByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(dropLastWhileIndexedModule, "dropLastWhileIndexedByArray",)
                skipLastWhileIndexedByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance,},},) => {
        describe("drop", () => {
            test("NaN", () => expect(instance.drop(NaN,),)      .toBe(emptyCollectionHolder,),)
            test("-∞",  () => expect(instance.drop(-Infinity,),).toBe(emptyCollectionHolder,),)
            test("-1",  () => expect(instance.drop(-1,),)       .toBe(emptyCollectionHolder,),)
            test('0',   () => expect(instance.drop(0,),)        .toBe(emptyCollectionHolder,),)
            test('1',   () => expect(instance.drop(1,),)        .toBe(emptyCollectionHolder,),)
            test("+∞",  () => expect(instance.drop(Infinity,),) .toBe(emptyCollectionHolder,),)
        },)
        describe("dropWhile", () => {
            test("(T, number) → boolean", () => expect(instance.dropWhile(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
            test("(T) → boolean",         () => expect(instance.dropWhile(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
            test("() → boolean",          () => expect(instance.dropWhile(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
        },)
        describe("dropWhileIndexed", () => {
            test("(T, number) → boolean", () => expect(instance.dropWhileIndexed(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
            test("(T) → boolean",         () => expect(instance.dropWhileIndexed(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
            test("() → boolean",          () => expect(instance.dropWhileIndexed(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
        },)

        describe("dropLast", () => {
            test("NaN", () => expect(instance.dropLast(NaN,),)      .toBe(emptyCollectionHolder,),)
            test("-∞",  () => expect(instance.dropLast(-Infinity,),).toBe(emptyCollectionHolder,),)
            test("-1",  () => expect(instance.dropLast(-1,),)       .toBe(emptyCollectionHolder,),)
            test('0',   () => expect(instance.dropLast(0,),)        .toBe(emptyCollectionHolder,),)
            test('1',   () => expect(instance.dropLast(1,),)        .toBe(emptyCollectionHolder,),)
            test("+∞",  () => expect(instance.dropLast(Infinity,),) .toBe(emptyCollectionHolder,),)
        },)
        describe("dropLastWhile", () => {
            test("(T, number) → boolean", () => expect(instance.dropLastWhile(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
            test("(T) → boolean",         () => expect(instance.dropLastWhile(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
            test("() → boolean",          () => expect(instance.dropLastWhile(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
        },)
        describe("dropLastWhileIndexed", () => {
            test("(T, number) → boolean", () => expect(instance.dropLastWhileIndexed(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
            test("(T) → boolean",         () => expect(instance.dropLastWhileIndexed(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
            test("() → boolean",          () => expect(instance.dropLastWhileIndexed(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
        },)
    },)},)

    describe("get() being called", () => {
        //README: The adaptor classes are ignored since they rely on the apdated class instead.
        //        The lazy classes are ignored since they use inner class(es) instead.
        //        The viewer instances are ignored since they rely on the viewed class instead.
        //        The instances of 1 or 2 are ignored since they use "get value1|2" instead of get()

        describe("empty ~ collection (by minimalist)", () => {
            describe("drop", () => {
                test('0', () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.drop(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.drop(1,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropWhile", () => {
                test("(T, number) → boolean", () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(T) → boolean",         () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)
            describe("dropWhileIndexed", () => {
                test("(number, T) → boolean", () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(number) → boolean",    () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)

            describe("dropLast", () => {
                test('0', () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLast(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLast(1,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropLastWhile", () => {
                test("(T, number) → boolean", () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(T) → boolean",         () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)
            describe("dropLastWhileIndexed", () => {
                test("(number, T) → boolean", () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(number) → boolean",    () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)
        },)
        describe("empty ~ collection (by normal)", () => {
            describe("drop", () => {
                test('0', () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.drop(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.drop(1,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropWhile", () => {
                test("(T, number) → boolean", () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(T) → boolean",         () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)
            describe("dropWhileIndexed", () => {
                test("(number, T) → boolean", () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(number) → boolean",    () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)

            describe("dropLast", () => {
                test('0', () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLast(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLast(1,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropLastWhile", () => {
                test("(T, number) → boolean", () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(T) → boolean",         () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)
            describe("dropLastWhileIndexed", () => {
                test("(number, T) → boolean", () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(number) → boolean",    () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)
        },)

        describe("1 field ~ collection (by minimalist)", () => {
            describe("drop", () => {
                test('0', () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.drop(0,),).amountOfCall,).toBe(1,),)
                test('1', () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.drop(1,),).amountOfCall,).toBe(0,),)
                test('2', () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.drop(2,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            },)
            describe("dropWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            },)

            describe("dropLast", () => {
                test('0', () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLast(0,),).amountOfCall,).toBe(1,),)
                test('1', () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLast(1,),).amountOfCall,).toBe(0,),)
                test('2', () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLast(2,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropLastWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            },)
            describe("dropLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            },)
        },)
        describe("1 field ~ collection (by normal)", () => {
            describe("drop", () => {
                test('0', () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.drop(0,),).amountOfCall,).toBe(1,),)
                test('1', () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.drop(1,),).amountOfCall,).toBe(0,),)
                test('2', () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.drop(2,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            },)
            describe("dropWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            },)

            describe("dropLast", () => {
                test('0', () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLast(0,),).amountOfCall,).toBe(1,),)
                test('1', () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLast(1,),).amountOfCall,).toBe(0,),)
                test('2', () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLast(2,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropLastWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            },)
            describe("dropLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(1,),)
            },)
        },)

        describe("2 fields ~ collection (by minimalist)", () => {
            describe("drop", () => {
                test('0', () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.drop(0,),).amountOfCall,).toBe(2,),)
                test('1', () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.drop(1,),).amountOfCall,).toBe(1,),)
                test('2', () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.drop(2,),).amountOfCall,).toBe(0,),)
                test('3', () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.drop(3,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
            },)
            describe("dropWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
            },)

            describe("dropLast", () => {
                test('0', () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(0,),).amountOfCall,).toBe(2,),)
                test('1', () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(1,),).amountOfCall,).toBe(1,),)
                test('2', () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(2,),).amountOfCall,).toBe(0,),)
                test('3', () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(3,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropLastWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
            },)
            describe("dropLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
            },)
        },)
        describe("2 fields ~ collection (by normal)", () => {
            describe("drop", () => {
                test('0', () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.drop(0,),).amountOfCall,).toBe(2,),)
                test('1', () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.drop(1,),).amountOfCall,).toBe(1,),)
                test('2', () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.drop(2,),).amountOfCall,).toBe(0,),)
                test('3', () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.drop(3,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
            },)
            describe("dropWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
            },)

            describe("dropLast", () => {
                test('0', () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(0,),).amountOfCall,).toBe(2,),)
                test('1', () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(1,),).amountOfCall,).toBe(1,),)
                test('2', () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(2,),).amountOfCall,).toBe(0,),)
                test('3', () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLast(3,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropLastWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
            },)
            describe("dropLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(2,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(2,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(2,),)
            },)
        },)

        describe("N fields ~ collection (by minimalist)", () => {
            describe("drop", () => {
                test('0', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(0,),).amountOfCall,).toBe(4,),)
                test('1', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(1,),).amountOfCall,).toBe(3,),)
                test('2', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(2,),).amountOfCall,).toBe(2,),)
                test('3', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(3,),).amountOfCall,).toBe(1,),)
                test('4', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(4,),).amountOfCall,).toBe(0,),)
                test('5', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(5,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)
            describe("dropWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)

            describe("dropLast", () => {
                test('0', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(0,),).amountOfCall,).toBe(4,),)
                test('1', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(1,),).amountOfCall,).toBe(3,),)
                test('2', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(2,),).amountOfCall,).toBe(2,),)
                test('3', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(3,),).amountOfCall,).toBe(1,),)
                test('4', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(4,),).amountOfCall,).toBe(0,),)
                test('5', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(5,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropLastWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)
            describe("dropLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)
        },)
        describe("N fields ~ collection (by normal)", () => {
            describe("drop", () => {
                test('0', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(0,),).amountOfCall,).toBe(8,),)
                test('1', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(1,),).amountOfCall,).toBe(3,),)
                test('2', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(2,),).amountOfCall,).toBe(2,),)
                test('3', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(3,),).amountOfCall,).toBe(1,),)
                test('4', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(4,),).amountOfCall,).toBe(0,),)
                test('5', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.drop(5,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhile(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)
            describe("dropWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)

            describe("dropLast", () => {
                test('0', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(0,),).amountOfCall,).toBe(8,),)
                test('1', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(1,),).amountOfCall,).toBe(3,),)
                test('2', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(2,),).amountOfCall,).toBe(2,),)
                test('3', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(3,),).amountOfCall,).toBe(1,),)
                test('4', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(4,),).amountOfCall,).toBe(0,),)
                test('5', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLast(5,),).amountOfCall,).toBe(0,),)
            },)
            describe("dropLastWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)
            describe("dropLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(0,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(0,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(4,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(4,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.dropLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(4,),)
            },)
        },)

    },)

    describe("instances", () => {
        describe("empty", () => {
        describe.each(every0Instances,)("%s", ({value: {newInstance,},},) => {

            describe("drop", () => {
                test("NaN", () => expect(newInstance().drop(NaN,),)      .toBe(emptyCollectionHolder,),)
                test("-∞",  () => expect(newInstance().drop(-Infinity,),).toBe(emptyCollectionHolder,),)
                test("-2",  () => expect(newInstance().drop(-2,),)       .toBe(emptyCollectionHolder,),)
                test("-1",  () => expect(newInstance().drop(-1,),)       .toBe(emptyCollectionHolder,),)
                test('0',   () => expect(newInstance().drop(0,),)        .toBe(emptyCollectionHolder,),)
                test('1',   () => expect(newInstance().drop(1,),)        .toBe(emptyCollectionHolder,),)
                test("+∞",  () => expect(newInstance().drop(Infinity,),) .toBe(emptyCollectionHolder,),)
            },)
            describe("dropWhile", () => {
                test("(T, number) → boolean", () => expect(newInstance().dropWhile(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
                test("(T) → boolean",         () => expect(newInstance().dropWhile(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
                test("() → boolean",          () => expect(newInstance().dropWhile(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
            },)
            describe("dropWhileIndexed", () => {
                test("(number, T) → boolean", () => expect(newInstance().dropWhileIndexed(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
                test("(number) → boolean",    () => expect(newInstance().dropWhileIndexed(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
                test("() → boolean",          () => expect(newInstance().dropWhileIndexed(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
            },)

            describe("dropLast", () => {
                test("NaN", () => expect(newInstance().dropLast(NaN,),)      .toBe(emptyCollectionHolder,),)
                test("-∞",  () => expect(newInstance().dropLast(-Infinity,),).toBe(emptyCollectionHolder,),)
                test("-2",  () => expect(newInstance().dropLast(-2,),)       .toBe(emptyCollectionHolder,),)
                test("-1",  () => expect(newInstance().dropLast(-1,),)       .toBe(emptyCollectionHolder,),)
                test('0',   () => expect(newInstance().dropLast(0,),)        .toBe(emptyCollectionHolder,),)
                test('1',   () => expect(newInstance().dropLast(1,),)        .toBe(emptyCollectionHolder,),)
                test("+∞",  () => expect(newInstance().dropLast(Infinity,),) .toBe(emptyCollectionHolder,),)
            },)
            describe("dropLastWhile", () => {
                test("(T, number) → boolean", () => expect(newInstance().dropLastWhile(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
                test("(T) → boolean",         () => expect(newInstance().dropLastWhile(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
                test("() → boolean",          () => expect(newInstance().dropLastWhile(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
            },)
            describe("dropLastWhileIndexed", () => {
                test("(number, T) → boolean", () => expect(newInstance().dropLastWhileIndexed(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
                test("(number) → boolean",    () => expect(newInstance().dropLastWhileIndexed(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
                test("() → boolean",          () => expect(newInstance().dropLastWhileIndexed(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
            },)

        },)},)
        describe("1 field", () => {
        describe.each(every1Instances,)("%s", ({value: {newInstance,},},) => {

            describe("drop", () => {
                test("NaN", () => expect(() => newInstance('a',).drop(NaN,),)                .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(      newInstance('a',).drop(-Infinity,).toArray(),).toStrictEqual(A,),)
                test("-3",  () => expect(      newInstance('a',).drop(-3,).toArray(),)       .toStrictEqual(A,),)
                test("-2",  () => expect(      newInstance('a',).drop(-2,).toArray(),)       .toStrictEqual(A,),)
                test("-1",  () => expect(      newInstance('a',).drop(-1,).toArray(),)       .toStrictEqual(A,),)
                test('0',   () => expect(      newInstance('a',).drop(0,).toArray(),)        .toStrictEqual(A,),)
                test('1',   () => expect(      newInstance('a',).drop(1,),)                  .toBe(emptyCollectionHolder,),)
                test('2',   () => expect(      newInstance('a',).drop(2,),)                  .toBe(emptyCollectionHolder,),)
                test("+∞",  () => expect(      newInstance('a',).drop(Infinity,),)           .toBe(emptyCollectionHolder,),)
            },)
            describe("dropWhile", () => {
                test("(T, number) → true",  () => expect(newInstance('a',).dropWhile(callbackAsTrue2,),)              .toBeEmpty(),)
                test("(T) → true",          () => expect(newInstance('a',).dropWhile(callbackAsTrue1,),)              .toBeEmpty(),)
                test("() → true",           () => expect(newInstance('a',).dropWhile(callbackAsTrue0,),)              .toBeEmpty(),)
                test("(T, number) → false", () => expect(newInstance('a',).dropWhile(callbackAsFalse2,).toArray(),)   .toStrictEqual(A,),)
                test("(T) → false",         () => expect(newInstance('a',).dropWhile(callbackAsFalse1,).toArray(),)   .toStrictEqual(A,),)
                test("() → false",          () => expect(newInstance('a',).dropWhile(callbackAsFalse0,).toArray(),)   .toStrictEqual(A,),)
                test("under a",             () => expect(newInstance('a',).dropWhile(callbackIsUnderA,).toArray(),)   .toStrictEqual(A,),)
                test("under e",             () => expect(newInstance('a',).dropWhile(callbackIsUnderE,),)             .toBeEmpty(),)
                test("under 0",             () => expect(newInstance('a',).dropWhile(callbackIsUnder0Alt,).toArray(),).toStrictEqual(A,),)
                test("under 4",             () => expect(newInstance('a',).dropWhile(callbackIsUnder4Alt,),)          .toBeEmpty(),)
            },)
            describe("dropWhileIndexed", () => {
                test("(number, T) → true",  () => expect(newInstance('a',).dropWhileIndexed(callbackAsTrue2,),)              .toBeEmpty(),)
                test("(number) → true",     () => expect(newInstance('a',).dropWhileIndexed(callbackAsTrue1,),)              .toBeEmpty(),)
                test("() → true",           () => expect(newInstance('a',).dropWhileIndexed(callbackAsTrue0,),)              .toBeEmpty(),)
                test("(number, T) → false", () => expect(newInstance('a',).dropWhileIndexed(callbackAsFalse2,).toArray(),)   .toStrictEqual(A,),)
                test("(number) → false",    () => expect(newInstance('a',).dropWhileIndexed(callbackAsFalse1,).toArray(),)   .toStrictEqual(A,),)
                test("() → false",          () => expect(newInstance('a',).dropWhileIndexed(callbackAsFalse0,).toArray(),)   .toStrictEqual(A,),)
                test("under a",             () => expect(newInstance('a',).dropWhileIndexed(callbackIsUnderAAlt,).toArray(),).toStrictEqual(A,),)
                test("under e",             () => expect(newInstance('a',).dropWhileIndexed(callbackIsUnderEAlt,),)          .toBeEmpty(),)
                test("under 0",             () => expect(newInstance('a',).dropWhileIndexed(callbackIsUnder0,).toArray(),)   .toStrictEqual(A,),)
                test("under 4",             () => expect(newInstance('a',).dropWhileIndexed(callbackIsUnder4,),)             .toBeEmpty(),)
            },)

            describe("dropLast", () => {
                test("NaN", () => expect(() => newInstance('a',).dropLast(NaN,),)                .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(      newInstance('a',).dropLast(-Infinity,).toArray(),).toStrictEqual(A,),)
                test("-3",  () => expect(      newInstance('a',).dropLast(-3,).toArray(),)       .toStrictEqual(A,),)
                test("-2",  () => expect(      newInstance('a',).dropLast(-2,).toArray(),)       .toStrictEqual(A,),)
                test("-1",  () => expect(      newInstance('a',).dropLast(-1,).toArray(),)       .toStrictEqual(A,),)
                test('0',   () => expect(      newInstance('a',).dropLast(0,).toArray(),)        .toStrictEqual(A,),)
                test('1',   () => expect(      newInstance('a',).dropLast(1,),)                  .toBe(emptyCollectionHolder,),)
                test('2',   () => expect(      newInstance('a',).dropLast(2,),)                  .toBe(emptyCollectionHolder,),)
                test("+∞",  () => expect(      newInstance('a',).dropLast(Infinity,),)           .toBe(emptyCollectionHolder,),)
            },)
            describe("dropLastWhile", () => {
                test("(T, number) → true",  () => expect(newInstance('a',).dropLastWhile(callbackAsTrue2,),)             .toBeEmpty(),)
                test("(T) → true",          () => expect(newInstance('a',).dropLastWhile(callbackAsTrue1,),)             .toBeEmpty(),)
                test("() → true",           () => expect(newInstance('a',).dropLastWhile(callbackAsTrue0,),)             .toBeEmpty(),)
                test("(T, number) → false", () => expect(newInstance('a',).dropLastWhile(callbackAsFalse2,).toArray(),)  .toStrictEqual(A,),)
                test("(T) → false",         () => expect(newInstance('a',).dropLastWhile(callbackAsFalse1,).toArray(),)  .toStrictEqual(A,),)
                test("() → false",          () => expect(newInstance('a',).dropLastWhile(callbackAsFalse0,).toArray(),)  .toStrictEqual(A,),)
                test("over a",              () => expect(newInstance('a',).dropLastWhile(callbackIsOverA,).toArray(),)   .toStrictEqual(A,),)
                test("over e",              () => expect(newInstance('a',).dropLastWhile(callbackIsOverE,).toArray(),)   .toStrictEqual(A,),)
                test("over 0",              () => expect(newInstance('a',).dropLastWhile(callbackIsOver0Alt,).toArray(),).toStrictEqual(A,),)
                test("over 4",              () => expect(newInstance('a',).dropLastWhile(callbackIsOver4Alt,).toArray(),).toStrictEqual(A,),)
            },)
            describe("dropLastWhileIndexed", () => {
                test("(number, T) → true",   () => expect(newInstance('a',).dropLastWhileIndexed(callbackAsTrue2,),)           .toBeEmpty(),)
                test("(number) → true",      () => expect(newInstance('a',).dropLastWhileIndexed(callbackAsTrue1,),)           .toBeEmpty(),)
                test("() → true",            () => expect(newInstance('a',).dropLastWhileIndexed(callbackAsTrue0,),)           .toBeEmpty(),)
                test("(number, T) → false",  () => expect(newInstance('a',).dropLastWhileIndexed(callbackAsFalse2,).toArray(),).toStrictEqual(A,),)
                test("(number) → false",     () => expect(newInstance('a',).dropLastWhileIndexed(callbackAsFalse1,).toArray(),).toStrictEqual(A,),)
                test("() → false",           () => expect(newInstance('a',).dropLastWhileIndexed(callbackAsFalse0,).toArray(),).toStrictEqual(A,),)
                test("over a", () => expect(newInstance('a',).dropLastWhileIndexed(callbackIsOverAAlt,).toArray(),)            .toStrictEqual(A,),)
                test("over e", () => expect(newInstance('a',).dropLastWhileIndexed(callbackIsOverEAlt,).toArray(),)            .toStrictEqual(A,),)
                test("over 0", () => expect(newInstance('a',).dropLastWhileIndexed(callbackIsOver0,).toArray(),)               .toStrictEqual(A,),)
                test("over 4", () => expect(newInstance('a',).dropLastWhileIndexed(callbackIsOver4,).toArray(),)               .toStrictEqual(A,),)
            },)

        },)},)
        describe("2 fields", () => {
        describe.each(every2Instances,)("%s", ({value: {newInstance,},},) => {

            describe("drop", () => {
                test("NaN", () => expect(() => newInstance('a', 'b',).drop(NaN,),)                .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(      newInstance('a', 'b',).drop(-Infinity,).toArray(),).toStrictEqual(AB,),)
                test("-4",  () => expect(      newInstance('a', 'b',).drop(-4,).toArray(),)       .toStrictEqual(AB,),)
                test("-3",  () => expect(      newInstance('a', 'b',).drop(-3,).toArray(),)       .toStrictEqual(AB,),)
                test("-2",  () => expect(      newInstance('a', 'b',).drop(-2,).toArray(),)       .toStrictEqual(AB,),)
                test("-1",  () => expect(      newInstance('a', 'b',).drop(-1,).toArray(),)       .toStrictEqual(B,),)
                test('0',   () => expect(      newInstance('a', 'b',).drop(0,).toArray(),)        .toStrictEqual(AB,),)
                test('1',   () => expect(      newInstance('a', 'b',).drop(1,).toArray(),)        .toStrictEqual(B,),)
                test('2',   () => expect(      newInstance('a', 'b',).drop(2,),)                  .toBe(emptyCollectionHolder,),)
                test('3',   () => expect(      newInstance('a', 'b',).drop(3,),)                  .toBe(emptyCollectionHolder,),)
                test("+∞",  () => expect(      newInstance('a', 'b',).drop(Infinity,),)           .toBe(emptyCollectionHolder,),)
            },)
            describe("dropWhile", () => {
                test("(T, number) → true",  () => expect(newInstance('a', 'b',).dropWhile(callbackAsTrue2,),)              .toBeEmpty(),)
                test("(T) → true",          () => expect(newInstance('a', 'b',).dropWhile(callbackAsTrue1,),)              .toBeEmpty(),)
                test("() → true",           () => expect(newInstance('a', 'b',).dropWhile(callbackAsTrue0,),)              .toBeEmpty(),)
                test("(T, number) → false", () => expect(newInstance('a', 'b',).dropWhile(callbackAsFalse2,).toArray(),)   .toStrictEqual(AB,),)
                test("(T) → false",         () => expect(newInstance('a', 'b',).dropWhile(callbackAsFalse1,).toArray(),)   .toStrictEqual(AB,),)
                test("() → false",          () => expect(newInstance('a', 'b',).dropWhile(callbackAsFalse0,).toArray(),)   .toStrictEqual(AB,),)
                test("under a",             () => expect(newInstance('a', 'b',).dropWhile(callbackIsUnderA,).toArray(),)   .toStrictEqual(AB,),)
                test("under b",             () => expect(newInstance('a', 'b',).dropWhile(callbackIsUnderB,).toArray(),)   .toStrictEqual(B,),)
                test("under e",             () => expect(newInstance('a', 'b',).dropWhile(callbackIsUnderE,),)             .toBeEmpty(),)
                test("under 0",             () => expect(newInstance('a', 'b',).dropWhile(callbackIsUnder0Alt,).toArray(),).toStrictEqual(AB,),)
                test("under 1",             () => expect(newInstance('a', 'b',).dropWhile(callbackIsUnder1Alt,).toArray(),).toStrictEqual(B,),)
                test("under 4",             () => expect(newInstance('a', 'b',).dropWhile(callbackIsUnder4Alt,),)          .toBeEmpty(),)
            },)
            describe("dropWhileIndexed", () => {
                test("(number, T) → true",  () => expect(newInstance('a', 'b',).dropWhileIndexed(callbackAsTrue2,),)              .toBeEmpty(),)
                test("(number) → true",     () => expect(newInstance('a', 'b',).dropWhileIndexed(callbackAsTrue1,),)              .toBeEmpty(),)
                test("() → true",           () => expect(newInstance('a', 'b',).dropWhileIndexed(callbackAsTrue0,),)              .toBeEmpty(),)
                test("(number, T) → false", () => expect(newInstance('a', 'b',).dropWhileIndexed(callbackAsFalse2,).toArray(),)   .toStrictEqual(AB,),)
                test("(number) → false",    () => expect(newInstance('a', 'b',).dropWhileIndexed(callbackAsFalse1,).toArray(),)   .toStrictEqual(AB,),)
                test("() → false",          () => expect(newInstance('a', 'b',).dropWhileIndexed(callbackAsFalse0,).toArray(),)   .toStrictEqual(AB,),)
                test("under a",             () => expect(newInstance('a', 'b',).dropWhileIndexed(callbackIsUnderAAlt,).toArray(),).toStrictEqual(AB,),)
                test("under b",             () => expect(newInstance('a', 'b',).dropWhileIndexed(callbackIsUnderBAlt,).toArray(),).toStrictEqual(B,),)
                test("under e",             () => expect(newInstance('a', 'b',).dropWhileIndexed(callbackIsUnderEAlt,),)          .toBeEmpty(),)
                test("under 0",             () => expect(newInstance('a', 'b',).dropWhileIndexed(callbackIsUnder0,).toArray(),)   .toStrictEqual(AB,),)
                test("under 1",             () => expect(newInstance('a', 'b',).dropWhileIndexed(callbackIsUnder1,).toArray(),)   .toStrictEqual(B,),)
                test("under 4",             () => expect(newInstance('a', 'b',).dropWhileIndexed(callbackIsUnder4,),)             .toBeEmpty(),)
            },)

            describe("dropLast", () => {
                test("NaN", () => expect(() => newInstance('a', 'b',).dropLast(NaN,),)                .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(      newInstance('a', 'b',).dropLast(-Infinity,).toArray(),).toStrictEqual(AB,),)
                test("-4",  () => expect(      newInstance('a', 'b',).dropLast(-4,).toArray(),)       .toStrictEqual(AB,),)
                test("-3",  () => expect(      newInstance('a', 'b',).dropLast(-3,).toArray(),)       .toStrictEqual(AB,),)
                test("-2",  () => expect(      newInstance('a', 'b',).dropLast(-2,).toArray(),)       .toStrictEqual(AB,),)
                test("-1",  () => expect(      newInstance('a', 'b',).dropLast(-1,).toArray(),)       .toStrictEqual(A,),)
                test('0',   () => expect(      newInstance('a', 'b',).dropLast(0,).toArray(),)        .toStrictEqual(AB,),)
                test('1',   () => expect(      newInstance('a', 'b',).dropLast(1,).toArray(),)        .toStrictEqual(A,),)
                test('2',   () => expect(      newInstance('a', 'b',).dropLast(2,),)                  .toBe(emptyCollectionHolder,),)
                test('3',   () => expect(      newInstance('a', 'b',).dropLast(3,),)                  .toBe(emptyCollectionHolder,),)
                test("+∞",  () => expect(      newInstance('a', 'b',).dropLast(Infinity,),)           .toBe(emptyCollectionHolder,),)
            },)
            describe("dropLastWhile", () => {
                test("(T, number) → true",  () => expect(newInstance('a', 'b',).dropLastWhile(callbackAsTrue2,),)             .toBeEmpty(),)
                test("(T) → true",          () => expect(newInstance('a', 'b',).dropLastWhile(callbackAsTrue1,),)             .toBeEmpty(),)
                test("() → true",           () => expect(newInstance('a', 'b',).dropLastWhile(callbackAsTrue0,),)             .toBeEmpty(),)
                test("(T, number) → false", () => expect(newInstance('a', 'b',).dropLastWhile(callbackAsFalse2,).toArray(),)  .toStrictEqual(AB,),)
                test("(T) → false",         () => expect(newInstance('a', 'b',).dropLastWhile(callbackAsFalse1,).toArray(),)  .toStrictEqual(AB,),)
                test("() → false",          () => expect(newInstance('a', 'b',).dropLastWhile(callbackAsFalse0,).toArray(),)  .toStrictEqual(AB,),)
                test("over a",              () => expect(newInstance('a', 'b',).dropLastWhile(callbackIsOverA,).toArray(),)   .toStrictEqual(A,),)
                test("over b",              () => expect(newInstance('a', 'b',).dropLastWhile(callbackIsOverB,).toArray(),)   .toStrictEqual(AB,),)
                test("over e",              () => expect(newInstance('a', 'b',).dropLastWhile(callbackIsOverE,).toArray(),)   .toStrictEqual(AB,),)
                test("over 0",              () => expect(newInstance('a', 'b',).dropLastWhile(callbackIsOver0Alt,).toArray(),).toStrictEqual(A,),)
                test("over 1",              () => expect(newInstance('a', 'b',).dropLastWhile(callbackIsOver1Alt,).toArray(),).toStrictEqual(AB,),)
                test("over 4",              () => expect(newInstance('a', 'b',).dropLastWhile(callbackIsOver4Alt,).toArray(),).toStrictEqual(AB,),)
            },)
            describe("dropLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(newInstance('a', 'b',).dropLastWhileIndexed(callbackAsTrue2,),)             .toBeEmpty(),)
                test("(number) → true",     () => expect(newInstance('a', 'b',).dropLastWhileIndexed(callbackAsTrue1,),)             .toBeEmpty(),)
                test("() → true",           () => expect(newInstance('a', 'b',).dropLastWhileIndexed(callbackAsTrue0,),)             .toBeEmpty(),)
                test("(number, T) → false", () => expect(newInstance('a', 'b',).dropLastWhileIndexed(callbackAsFalse2,).toArray(),)  .toStrictEqual(AB,),)
                test("(number) → false",    () => expect(newInstance('a', 'b',).dropLastWhileIndexed(callbackAsFalse1,).toArray(),)  .toStrictEqual(AB,),)
                test("() → false",          () => expect(newInstance('a', 'b',).dropLastWhileIndexed(callbackAsFalse0,).toArray(),)  .toStrictEqual(AB,),)
                test("over a",              () => expect(newInstance('a', 'b',).dropLastWhileIndexed(callbackIsOverAAlt,).toArray(),).toStrictEqual(A,),)
                test("over b",              () => expect(newInstance('a', 'b',).dropLastWhileIndexed(callbackIsOverBAlt,).toArray(),).toStrictEqual(AB,),)
                test("over e",              () => expect(newInstance('a', 'b',).dropLastWhileIndexed(callbackIsOverEAlt,).toArray(),).toStrictEqual(AB,),)
                test("over 0",              () => expect(newInstance('a', 'b',).dropLastWhileIndexed(callbackIsOver0,).toArray(),)   .toStrictEqual(A,),)
                test("over 1",              () => expect(newInstance('a', 'b',).dropLastWhileIndexed(callbackIsOver1,).toArray(),)   .toStrictEqual(AB,),)
                test("over 4",              () => expect(newInstance('a', 'b',).dropLastWhileIndexed(callbackIsOver4,).toArray(),)   .toStrictEqual(AB,),)
            },)

        },)},)
        describe("N fields", () => {
        describe.each(everyNInstances,)("%s", ({value: {instance,},},) => {

            describe("drop", () => {
                test("NaN", () => expect(() => new instance(ABCD,).drop(NaN,),)                .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(      new instance(ABCD,).drop(-Infinity,).toArray(),).toStrictEqual(ABCD,),)
                test("-6",  () => expect(      new instance(ABCD,).drop(-6,).toArray(),)       .toStrictEqual(ABCD,),)
                test("-5",  () => expect(      new instance(ABCD,).drop(-5,).toArray(),)       .toStrictEqual(ABCD,),)
                test("-4",  () => expect(      new instance(ABCD,).drop(-4,).toArray(),)       .toStrictEqual(ABCD,),)
                test("-3",  () => expect(      new instance(ABCD,).drop(-3,).toArray(),)       .toStrictEqual(BCD,),)
                test("-2",  () => expect(      new instance(ABCD,).drop(-2,).toArray(),)       .toStrictEqual(CD,),)
                test("-1",  () => expect(      new instance(ABCD,).drop(-1,).toArray(),)       .toStrictEqual(D,),)
                test('0',   () => expect(      new instance(ABCD,).drop(0,).toArray(),)        .toStrictEqual(ABCD,),)
                test('1',   () => expect(      new instance(ABCD,).drop(1,).toArray(),)        .toStrictEqual(BCD,),)
                test('2',   () => expect(      new instance(ABCD,).drop(2,).toArray(),)        .toStrictEqual(CD,),)
                test('3',   () => expect(      new instance(ABCD,).drop(3,).toArray(),)        .toStrictEqual(D,),)
                test('4',   () => expect(      new instance(ABCD,).drop(4,),)                  .toBe(emptyCollectionHolder,),)
                test('5',   () => expect(      new instance(ABCD,).drop(5,),)                  .toBe(emptyCollectionHolder,),)
                test("+∞",  () => expect(      new instance(ABCD,).drop(Infinity,),)           .toBe(emptyCollectionHolder,),)
            },)
            describe("dropWhile", () => {
                test("(T, number) → true",  () => expect(new instance(ABCD,).dropWhile(callbackAsTrue2,),)              .toBeEmpty(),)
                test("(T) → true",          () => expect(new instance(ABCD,).dropWhile(callbackAsTrue1,),)              .toBeEmpty(),)
                test("() → true",           () => expect(new instance(ABCD,).dropWhile(callbackAsTrue0,),)              .toBeEmpty(),)
                test("(T, number) → false", () => expect(new instance(ABCD,).dropWhile(callbackAsFalse2,).toArray(),)   .toStrictEqual(ABCD,),)
                test("(T) → false",         () => expect(new instance(ABCD,).dropWhile(callbackAsFalse1,).toArray(),)   .toStrictEqual(ABCD,),)
                test("() → false",          () => expect(new instance(ABCD,).dropWhile(callbackAsFalse0,).toArray(),)   .toStrictEqual(ABCD,),)
                test("under a",             () => expect(new instance(ABCD,).dropWhile(callbackIsUnderA,).toArray(),)   .toStrictEqual(ABCD,),)
                test("under b",             () => expect(new instance(ABCD,).dropWhile(callbackIsUnderB,).toArray(),)   .toStrictEqual(BCD,),)
                test("under c",             () => expect(new instance(ABCD,).dropWhile(callbackIsUnderC,).toArray(),)   .toStrictEqual(CD,),)
                test("under d",             () => expect(new instance(ABCD,).dropWhile(callbackIsUnderD,).toArray(),)   .toStrictEqual(D,),)
                test("under e",             () => expect(new instance(ABCD,).dropWhile(callbackIsUnderE,),)             .toBeEmpty(),)
                test("under 0",             () => expect(new instance(ABCD,).dropWhile(callbackIsUnder0Alt,).toArray(),).toStrictEqual(ABCD,),)
                test("under 1",             () => expect(new instance(ABCD,).dropWhile(callbackIsUnder1Alt,).toArray(),).toStrictEqual(BCD,),)
                test("under 2",             () => expect(new instance(ABCD,).dropWhile(callbackIsUnder2Alt,).toArray(),).toStrictEqual(CD,),)
                test("under 3",             () => expect(new instance(ABCD,).dropWhile(callbackIsUnder3Alt,).toArray(),).toStrictEqual(D,),)
                test("under 4",             () => expect(new instance(ABCD,).dropWhile(callbackIsUnder4Alt,),)          .toBeEmpty(),)
            },)
            describe("dropWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new instance(ABCD,).dropWhileIndexed(callbackAsTrue2,),)              .toBeEmpty(),)
                test("(number) → true",     () => expect(new instance(ABCD,).dropWhileIndexed(callbackAsTrue1,),)              .toBeEmpty(),)
                test("() → true",           () => expect(new instance(ABCD,).dropWhileIndexed(callbackAsTrue0,),)              .toBeEmpty(),)
                test("(number, T) → false", () => expect(new instance(ABCD,).dropWhileIndexed(callbackAsFalse2,).toArray(),)   .toStrictEqual(ABCD,),)
                test("(number) → false",    () => expect(new instance(ABCD,).dropWhileIndexed(callbackAsFalse1,).toArray(),)   .toStrictEqual(ABCD,),)
                test("() → false",          () => expect(new instance(ABCD,).dropWhileIndexed(callbackAsFalse0,).toArray(),)   .toStrictEqual(ABCD,),)
                test("under a",             () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnderAAlt,).toArray(),).toStrictEqual(ABCD,),)
                test("under b",             () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnderBAlt,).toArray(),).toStrictEqual(BCD,),)
                test("under c",             () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnderCAlt,).toArray(),).toStrictEqual(CD,),)
                test("under d",             () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnderDAlt,).toArray(),).toStrictEqual(D,),)
                test("under e",             () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnderEAlt,),)          .toBeEmpty(),)
                test("under 0",             () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnder0,).toArray(),)   .toStrictEqual(ABCD,),)
                test("under 1",             () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnder1,).toArray(),)   .toStrictEqual(BCD,),)
                test("under 2",             () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnder2,).toArray(),)   .toStrictEqual(CD,),)
                test("under 3",             () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnder3,).toArray(),)   .toStrictEqual(D,),)
                test("under 4",             () => expect(new instance(ABCD,).dropWhileIndexed(callbackIsUnder4,),)             .toBeEmpty(),)
            },)

            describe("dropLast", () => {
                test("NaN", () => expect(() => new instance(ABCD,).dropLast(NaN,),)                .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(      new instance(ABCD,).dropLast(-Infinity,).toArray(),).toStrictEqual(ABCD,),)
                test("-6",  () => expect(      new instance(ABCD,).dropLast(-6,).toArray(),)       .toStrictEqual(ABCD,),)
                test("-5",  () => expect(      new instance(ABCD,).dropLast(-5,).toArray(),)       .toStrictEqual(ABCD,),)
                test("-4",  () => expect(      new instance(ABCD,).dropLast(-4,).toArray(),)       .toStrictEqual(ABCD,),)
                test("-3",  () => expect(      new instance(ABCD,).dropLast(-3,).toArray(),)       .toStrictEqual(ABC,),)
                test("-2",  () => expect(      new instance(ABCD,).dropLast(-2,).toArray(),)       .toStrictEqual(AB,),)
                test("-1",  () => expect(      new instance(ABCD,).dropLast(-1,).toArray(),)       .toStrictEqual(A,),)
                test('0',   () => expect(      new instance(ABCD,).dropLast(0,).toArray(),)        .toStrictEqual(ABCD,),)
                test('1',   () => expect(      new instance(ABCD,).dropLast(1,).toArray(),)        .toStrictEqual(ABC,),)
                test('2',   () => expect(      new instance(ABCD,).dropLast(2,).toArray(),)        .toStrictEqual(AB,),)
                test('3',   () => expect(      new instance(ABCD,).dropLast(3,).toArray(),)        .toStrictEqual(A,),)
                test('4',   () => expect(      new instance(ABCD,).dropLast(4,),)                  .toBe(emptyCollectionHolder,),)
                test('5',   () => expect(      new instance(ABCD,).dropLast(5,),)                  .toBe(emptyCollectionHolder,),)
                test("+∞",  () => expect(      new instance(ABCD,).dropLast(Infinity,),)           .toBe(emptyCollectionHolder,),)
            },)
            describe("dropLastWhile", () => {
                test("(T, number) → true",  () => expect(new instance(ABCD,).dropLastWhile(callbackAsTrue2,),)             .toBeEmpty(),)
                test("(T) → true",          () => expect(new instance(ABCD,).dropLastWhile(callbackAsTrue1,),)             .toBeEmpty(),)
                test("() → true",           () => expect(new instance(ABCD,).dropLastWhile(callbackAsTrue0,),)             .toBeEmpty(),)
                test("(T, number) → false", () => expect(new instance(ABCD,).dropLastWhile(callbackAsFalse2,).toArray(),)  .toStrictEqual(ABCD,),)
                test("(T) → false",         () => expect(new instance(ABCD,).dropLastWhile(callbackAsFalse1,).toArray(),)  .toStrictEqual(ABCD,),)
                test("() → false",          () => expect(new instance(ABCD,).dropLastWhile(callbackAsFalse0,).toArray(),)  .toStrictEqual(ABCD,),)
                test("over a",              () => expect(new instance(ABCD,).dropLastWhile(callbackIsOverA,).toArray(),)   .toStrictEqual(A,),)
                test("over b",              () => expect(new instance(ABCD,).dropLastWhile(callbackIsOverB,).toArray(),)   .toStrictEqual(AB,),)
                test("over c",              () => expect(new instance(ABCD,).dropLastWhile(callbackIsOverC,).toArray(),)   .toStrictEqual(ABC,),)
                test("over d",              () => expect(new instance(ABCD,).dropLastWhile(callbackIsOverD,).toArray(),)   .toStrictEqual(ABCD,),)
                test("over e",              () => expect(new instance(ABCD,).dropLastWhile(callbackIsOverE,).toArray(),)   .toStrictEqual(ABCD,),)
                test("over 0",              () => expect(new instance(ABCD,).dropLastWhile(callbackIsOver0Alt,).toArray(),).toStrictEqual(A,),)
                test("over 1",              () => expect(new instance(ABCD,).dropLastWhile(callbackIsOver1Alt,).toArray(),).toStrictEqual(AB,),)
                test("over 2",              () => expect(new instance(ABCD,).dropLastWhile(callbackIsOver2Alt,).toArray(),).toStrictEqual(ABC,),)
                test("over 3",              () => expect(new instance(ABCD,).dropLastWhile(callbackIsOver3Alt,).toArray(),).toStrictEqual(ABCD,),)
                test("over 4",              () => expect(new instance(ABCD,).dropLastWhile(callbackIsOver4Alt,).toArray(),).toStrictEqual(ABCD,),)
            },)
            describe("dropLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackAsTrue2,),)             .toBeEmpty(),)
                test("(number) → true",     () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackAsTrue1,),)             .toBeEmpty(),)
                test("() → true",           () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackAsTrue0,),)             .toBeEmpty(),)
                test("(number, T) → false", () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackAsFalse2,).toArray(),)  .toStrictEqual(ABCD,),)
                test("(number) → false",    () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackAsFalse1,).toArray(),)  .toStrictEqual(ABCD,),)
                test("() → false",          () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackAsFalse0,).toArray(),)  .toStrictEqual(ABCD,),)
                test("over a",              () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOverAAlt,).toArray(),).toStrictEqual(A,),)
                test("over b",              () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOverBAlt,).toArray(),).toStrictEqual(AB,),)
                test("over c",              () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOverCAlt,).toArray(),).toStrictEqual(ABC,),)
                test("over d",              () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOverDAlt,).toArray(),).toStrictEqual(ABCD,),)
                test("over e",              () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOverEAlt,).toArray(),).toStrictEqual(ABCD,),)
                test("over 0",              () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOver0,).toArray(),)   .toStrictEqual(A,),)
                test("over 1",              () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOver1,).toArray(),)   .toStrictEqual(AB,),)
                test("over 2",              () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOver2,).toArray(),)   .toStrictEqual(ABC,),)
                test("over 3",              () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOver3,).toArray(),)   .toStrictEqual(ABCD,),)
                test("over 4",              () => expect(new instance(ABCD,).dropLastWhileIndexed(callbackIsOver4,).toArray(),)   .toStrictEqual(ABCD,),)
            },)

        },)},)
    },)

},)
