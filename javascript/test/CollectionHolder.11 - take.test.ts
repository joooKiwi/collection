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
import {CollectionHolder_ByGenericCollection}                                                                                                                                                                                                                                                                                                                                                       from "./instance/CollectionHolder_ByGenericCollection"
import {CollectionHolder_ByGenericCollectionFollower}                                                                                                                                                                                                                                                                                                                                               from "./instance/CollectionHolder_ByGenericCollection.follower"
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
import {callbackAsFalse0, callbackAsFalse1, callbackAsFalse2, callbackAsTrue0, callbackAsTrue1, callbackAsTrue2}                                                                                                                                                                                                                                                                                    from "./value/callbacks (boolean)"
import {callbackAsFail0, callbackAsFail1, callbackAsFail2}                                                                                                                                                                                                                                                                                                                                          from "./value/callbacks (fail)"
import {callbackIsOver0, callbackIsOver0Alt, callbackIsOver1, callbackIsOver1Alt, callbackIsOver2, callbackIsOver2Alt, callbackIsOver3, callbackIsOver3Alt, callbackIsOver4, callbackIsOver4Alt, callbackIsUnder0, callbackIsUnder0Alt, callbackIsUnder1, callbackIsUnder1Alt, callbackIsUnder2, callbackIsUnder2Alt, callbackIsUnder3, callbackIsUnder3Alt, callbackIsUnder4, callbackIsUnder4Alt} from "./value/callbacks (number)"
import {callbackIsOverA, callbackIsOverAAlt, callbackIsOverB, callbackIsOverBAlt, callbackIsOverC, callbackIsOverCAlt, callbackIsOverD, callbackIsOverDAlt, callbackIsOverE, callbackIsOverEAlt, callbackIsUnderA, callbackIsUnderAAlt, callbackIsUnderB, callbackIsUnderBAlt, callbackIsUnderC, callbackIsUnderCAlt, callbackIsUnderD, callbackIsUnderDAlt, callbackIsUnderE, callbackIsUnderEAlt} from "./value/callbacks (string)"
import {emptyCollectionHolder, every0Instances, every1Instances, every2Instances, everyExtensionMethodInstances, everyNInstances}                                                                                                                                                                                                                                                                   from "./value/instances"

import {EmptyCollectionHolder}                                                                                                                           from "../src/EmptyCollectionHolder"
import {ForbiddenIndexException}                                                                                                                         from "../src/exception/ForbiddenIndexException"
import {limit, limitByArray, limitByCollectionHolder, limitByMinimalistCollectionHolder}                                                                 from "../src/method/limit"
import {limitLast, limitLastByArray, limitLastByCollectionHolder, limitLastByMinimalistCollectionHolder}                                                 from "../src/method/limitLast"
import {limitLastWhile, limitLastWhileByArray, limitLastWhileByCollectionHolder, limitLastWhileByMinimalistCollectionHolder}                             from "../src/method/limitLastWhile"
import {limitLastWhileIndexed, limitLastWhileIndexedByArray, limitLastWhileIndexedByCollectionHolder, limitLastWhileIndexedByMinimalistCollectionHolder} from "../src/method/limitLastWhileIndexed"
import {limitWhile, limitWhileByArray, limitWhileByCollectionHolder, limitWhileByMinimalistCollectionHolder}                                             from "../src/method/limitWhile"
import {limitWhileIndexed, limitWhileIndexedByArray, limitWhileIndexedByCollectionHolder, limitWhileIndexedByMinimalistCollectionHolder}                 from "../src/method/limitWhileIndexed"
import * as takeModule                                                                                                                                   from "../src/method/take"
import * as takeLastModule                                                                                                                               from "../src/method/takeLast"
import * as takeLastWhileModule                                                                                                                          from "../src/method/takeLastWhile"
import * as takeLastWhileIndexedModule                                                                                                                   from "../src/method/takeLastWhileIndexed"
import * as takeWhileModule                                                                                                                              from "../src/method/takeWhile"
import * as takeWhileIndexedModule                                                                                                                       from "../src/method/takeWhileIndexed"

describe("CollectionHolderTest (take)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("take",                  () => expect(instance.take(),)                 .toBe(instance,),)
        test("limit",                 () => expect(instance.limit(),)                .toBe(instance,),)
        test("takeWhile",             () => expect(instance.takeWhile(),)            .toBe(instance,),)
        test("limitWhile",            () => expect(instance.limitWhile(),)           .toBe(instance,),)
        test("takeWhileIndexed",      () => expect(instance.takeWhileIndexed(),)     .toBe(instance,),)
        test("limitWhileIndexed",     () => expect(instance.limitWhileIndexed(),)    .toBe(instance,),)
        test("takeLast",              () => expect(instance.takeLast(),)             .toBe(instance,),)
        test("limitLast",             () => expect(instance.limitLast(),)            .toBe(instance,),)
        test("takeLastWhile",         () => expect(instance.takeLastWhile(),)        .toBe(instance,),)
        test("limitLastWhile",        () => expect(instance.limitLastWhile(),)       .toBe(instance,),)
        test("takeLastWhileIndexed",  () => expect(instance.takeLastWhileIndexed(),) .toBe(instance,),)
        test("limitLastWhileIndexed", () => expect(instance.limitLastWhileIndexed(),).toBe(instance,),)
    },)

    describe("aliases", () => {
        describe("ArrayAsCollectionHolder", () => {
            test("limit",                 () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("ArrayOf1AsCollectionHolder", () => {
            test("limit",                 () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("ArrayOf2AsCollectionHolder", () => {
            test("limit",                 () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("CollectionHolderOf1", () => {
            test("limit",                 () => expect(new CollectionHolder_1Follower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_1Follower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_1Follower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_1Follower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_1Follower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_1Follower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("CollectionHolderOf2", () => {
            test("limit",                 () => expect(new CollectionHolder_2Follower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_2Follower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_2Follower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_2Follower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_2Follower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_2Follower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("CollectionViewer", () => {
            test("limit",                 () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("GenericCollectionHolder", () => {
            test("limit",                 () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("IteratorAsCollectionHolder", () => {
            test("limit",                 () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("JsIterableAsCollectionHolder", () => {
            test("limit",                 () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("JsIteratorAsCollectionHolder", () => {
            test("limit",                 () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolder", () => {
            test("limit",                 () => expect(new CollectionHolder_LazyFollower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_LazyFollower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_LazyFollower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_LazyFollower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_LazyFollower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_LazyFollower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf0Or1", () => {
            test("limit",                 () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf0Or1Or2", () => {
            test("limit",                 () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf1", () => {
            test("limit",                 () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf1Or2", () => {
            test("limit",                 () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("LazyCollectionHolderOf2", () => {
            test("limit",                 () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("MinimalistAsCollectionHolder", () => {
            test("limit",                 () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("SetAsCollectionHolder", () => {
            test("limit",                 () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("SetOf1AsCollectionHolder", () => {
            test("limit",                 () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)
        describe("SetOf2AsCollectionHolder", () => {
            test("limit",                 () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.limit(0,),)                               .take_amountOfCall,)                .toBe(1,),)
            test("limitWhile",            () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.limitWhile(callbackAsFalse0,),)           .takeWhile_amountOfCall,)           .toBe(1,),)
            test("limitWhileIndexed",     () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.limitWhileIndexed(callbackAsFalse0,),)    .takeWhileIndexed_amountOfCall,)    .toBe(1,),)
            test("limitLast",             () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.limitLast(0,),)                           .takeLast_amountOfCall,)            .toBe(1,),)
            test("limitLastWhile",        () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.limitLastWhile(callbackAsFalse0,),)       .takeLastWhile_amountOfCall,)       .toBe(1,),)
            test("limitLastWhileIndexed", () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.limitLastWhileIndexed(callbackAsFalse0,),).takeLastWhileIndexed_amountOfCall,).toBe(1,),)
        },)

        describe("limit", () => {
            test("all", () => {
                const method = jest.spyOn(takeModule, "take",)
                limit(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeModule, "takeByMinimalistCollectionHolder",)
                limitByMinimalistCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeModule, "takeByCollectionHolder",)
                limitByCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeModule, "takeByArray",)
                limitByArray(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitWhile", () => {
            test("all", () => {
                const method = jest.spyOn(takeWhileModule, "takeWhile",)
                limitWhile(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeWhileModule, "takeWhileByMinimalistCollectionHolder",)
                limitWhileByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeWhileModule, "takeWhileByCollectionHolder",)
                limitWhileByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeWhileModule, "takeWhileByArray",)
                limitWhileByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitWhileIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(takeWhileIndexedModule, "takeWhileIndexed",)
                limitWhileIndexed(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeWhileIndexedModule, "takeWhileIndexedByMinimalistCollectionHolder",)
                limitWhileIndexedByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeWhileIndexedModule, "takeWhileIndexedByCollectionHolder",)
                limitWhileIndexedByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeWhileIndexedModule, "takeWhileIndexedByArray",)
                limitWhileIndexedByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("limitLast", () => {
            test("all", () => {
                const method = jest.spyOn(takeLastModule, "takeLast",)
                limitLast(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeLastModule, "takeLastByMinimalistCollectionHolder",)
                limitLastByMinimalistCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeLastModule, "takeLastByCollectionHolder",)
                limitLastByCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeLastModule, "takeLastByArray",)
                limitLastByArray(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitLastWhile", () => {
            test("all", () => {
                const method = jest.spyOn(takeLastWhileModule, "takeLastWhile",)
                limitLastWhile(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeLastWhileModule, "takeLastWhileByMinimalistCollectionHolder",)
                limitLastWhileByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeLastWhileModule, "takeLastWhileByCollectionHolder",)
                limitLastWhileByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeLastWhileModule, "takeLastWhileByArray",)
                limitLastWhileByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("limitLastWhileIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(takeLastWhileIndexedModule, "takeLastWhileIndexed",)
                limitLastWhileIndexed(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(takeLastWhileIndexedModule, "takeLastWhileIndexedByMinimalistCollectionHolder",)
                limitLastWhileIndexedByMinimalistCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(takeLastWhileIndexedModule, "takeLastWhileIndexedByCollectionHolder",)
                limitLastWhileIndexedByCollectionHolder(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(takeLastWhileIndexedModule, "takeLastWhileIndexedByArray",)
                limitLastWhileIndexedByArray(null, callbackAsTrue0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance,},},) => {
        describe("take", () => {
            test("NaN", () => expect(instance.take(NaN,),)      .toBe(emptyCollectionHolder,),)
            test("-∞",  () => expect(instance.take(-Infinity,),).toBe(emptyCollectionHolder,),)
            test("-1",  () => expect(instance.take(-1,),)       .toBe(emptyCollectionHolder,),)
            test('0',   () => expect(instance.take(0,),)        .toBe(emptyCollectionHolder,),)
            test('1',   () => expect(instance.take(1,),)        .toBe(emptyCollectionHolder,),)
            test("+∞",  () => expect(instance.take(Infinity,),) .toBe(emptyCollectionHolder,),)
        },)
        describe("takeWhile", () => {
            test("(T, number) → boolean", () => expect(instance.takeWhile(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
            test("(T) → boolean",         () => expect(instance.takeWhile(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
            test("() → boolean",          () => expect(instance.takeWhile(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
        },)
        describe("takeWhileIndexed", () => {
            test("(T, number) → boolean", () => expect(instance.takeWhileIndexed(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
            test("(T) → boolean",         () => expect(instance.takeWhileIndexed(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
            test("() → boolean",          () => expect(instance.takeWhileIndexed(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
        },)

        describe("takeLast", () => {
            test("NaN", () => expect(instance.takeLast(NaN,),)      .toBe(emptyCollectionHolder,),)
            test("-∞",  () => expect(instance.takeLast(-Infinity,),).toBe(emptyCollectionHolder,),)
            test("-1",  () => expect(instance.takeLast(-1,),)       .toBe(emptyCollectionHolder,),)
            test('0',   () => expect(instance.takeLast(0,),)        .toBe(emptyCollectionHolder,),)
            test('1',   () => expect(instance.takeLast(1,),)        .toBe(emptyCollectionHolder,),)
            test("+∞",  () => expect(instance.takeLast(Infinity,),) .toBe(emptyCollectionHolder,),)
        },)
        describe("takeLastWhile", () => {
            test("(T, number) → boolean", () => expect(instance.takeLastWhile(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
            test("(T) → boolean",         () => expect(instance.takeLastWhile(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
            test("() → boolean",          () => expect(instance.takeLastWhile(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
        },)
        describe("takeLastWhileIndexed", () => {
            test("(T, number) → boolean", () => expect(instance.takeLastWhileIndexed(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
            test("(T) → boolean",         () => expect(instance.takeLastWhileIndexed(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
            test("() → boolean",          () => expect(instance.takeLastWhileIndexed(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
        },)
    },)},)

    describe("get() being called", () => {
        //README: The adaptor classes are ignored since they rely on the apdated class instead.
        //        The lazy classes are ignored since they use inner class(es) instead.
        //        The viewer instances are ignored since they rely on the viewed class instead.
        //        The instances of 1 or 2 are ignored since they use "get value1|2" instead of get()

        describe("empty ~ collection (by minimalist)", () => {
            describe("take", () => {
                test('0', () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.take(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.take(1,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeWhile", () => {
                test("(T, number) → boolean", () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(T) → boolean",         () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)
            describe("takeWhileIndexed", () => {
                test("(number, T) → boolean", () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(number) → boolean",    () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)

            describe("takeLast", () => {
                test('0', () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLast(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLast(1,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeLastWhile", () => {
                test("(T, number) → boolean", () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(T) → boolean",         () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)
            describe("takeLastWhileIndexed", () => {
                test("(number, T) → boolean", () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(number) → boolean",    () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)
        },)
        describe("empty ~ collection (by normal)", () => {
            describe("take", () => {
                test('0', () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.take(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.take(1,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeWhile", () => {
                test("(T, number) → boolean", () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(T) → boolean",         () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)
            describe("takeWhileIndexed", () => {
                test("(number, T) → boolean", () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(number) → boolean",    () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)

            describe("takeLast", () => {
                test('0', () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLast(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLast(1,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeLastWhile", () => {
                test("(T, number) → boolean", () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(T) → boolean",         () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)
            describe("takeLastWhileIndexed", () => {
                test("(number, T) → boolean", () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFail2,),) .amountOfCall,).toBe(0,),)
                test("(number) → boolean",    () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFail1,),) .amountOfCall,).toBe(0,),)
                test("() → boolean",          () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFail0,),) .amountOfCall,).toBe(0,),)
            },)
        },)

        describe("1 field ~ collection (by minimalist)", () => {
            describe("take", () => {
                test('0',  () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.take(0,),).amountOfCall,).toBe(0,),)
                test('1',  () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.take(1,),).amountOfCall,).toBe(1,),)
                test('2',  () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.take(2,),).amountOfCall,).toBe(1,),)
            },)
            describe("takeWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue0,),) .amountOfCall,).toBe(1,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(1,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)

            describe("takeLast", () => {
                test('0', () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLast(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLast(1,),).amountOfCall,).toBe(1,),)
                test('2', () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLast(2,),).amountOfCall,).toBe(1,),)
            },)
            describe("takeLastWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue0,),) .amountOfCall,).toBe(1,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(1,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
        },)
        describe("1 field ~ collection (by normal)", () => {
            describe("take", () => {
                test('0', () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.take(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.take(1,),).amountOfCall,).toBe(1,),)
                test('2', () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.take(2,),).amountOfCall,).toBe(1,),)
            },)
            describe("takeWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue0,),) .amountOfCall,).toBe(1,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(1,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)

            describe("takeLast", () => {
                test('0', () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLast(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLast(1,),).amountOfCall,).toBe(1,),)
                test('2', () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLast(2,),).amountOfCall,).toBe(1,),)
            },)
            describe("takeLastWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue0,),) .amountOfCall,).toBe(1,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(1,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(1,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(1,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(A,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
        },)

        describe("2 fields ~ collection (by minimalist)", () => {
            describe("take", () => {
                test('0', () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.take(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.take(1,),).amountOfCall,).toBe(1,),)
                test('2', () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.take(2,),).amountOfCall,).toBe(2,),)
                test('3', () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.take(3,),).amountOfCall,).toBe(2,),)
            },)
            describe("takeWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)

            describe("takeLast", () => {
                test('0', () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(1,),).amountOfCall,).toBe(1,),)
                test('2', () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(2,),).amountOfCall,).toBe(2,),)
                test('3', () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(3,),).amountOfCall,).toBe(2,),)
            },)
            describe("takeLastWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
        },)
        describe("2 fields ~ collection (by normal)", () => {
            describe("take", () => {
                test('0', () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.take(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.take(1,),).amountOfCall,).toBe(1,),)
                test('2', () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.take(2,),).amountOfCall,).toBe(2,),)
                test('3', () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.take(3,),).amountOfCall,).toBe(2,),)
            },)
            describe("takeWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)

            describe("takeLast", () => {
                test('0', () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(1,),).amountOfCall,).toBe(1,),)
                test('2', () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(2,),).amountOfCall,).toBe(2,),)
                test('3', () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLast(3,),).amountOfCall,).toBe(2,),)
            },)
            describe("takeLastWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(2,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(2,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(2,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(AB,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
        },)

        describe("N fields ~ collection (by minimalist)", () => {
            describe("take", () => {
                test('0', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.take(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.take(1,),).amountOfCall,).toBe(1,),)
                test('2', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.take(2,),).amountOfCall,).toBe(2,),)
                test('3', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.take(3,),).amountOfCall,).toBe(3,),)
                test('4', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.take(4,),).amountOfCall,).toBe(4,),)
                test('5', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.take(5,),).amountOfCall,).toBe(4,),)
            },)
            describe("takeWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue0,),) .amountOfCall,).toBe(4,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(4,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)

            describe("takeLast", () => {
                test('0', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(1,),).amountOfCall,).toBe(1,),)
                test('2', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(2,),).amountOfCall,).toBe(2,),)
                test('3', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(3,),).amountOfCall,).toBe(3,),)
                test('4', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(4,),).amountOfCall,).toBe(4,),)
                test('5', () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(5,),).amountOfCall,).toBe(4,),)
            },)
            describe("takeLastWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue0,),) .amountOfCall,).toBe(4,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",           () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(4,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
        },)
        describe("N fields ~ collection (by normal)", () => {
            describe("take", () => {
                test('0', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.take(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.take(1,),).amountOfCall,).toBe(1,),)
                test('2', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.take(2,),).amountOfCall,).toBe(2,),)
                test('3', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.take(3,),).amountOfCall,).toBe(3,),)
                test('4', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.take(4,),).amountOfCall,).toBe(8,),)
                test('5', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.take(5,),).amountOfCall,).toBe(8,),)
            },)
            describe("takeWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsTrue0,),) .amountOfCall,).toBe(4,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhile(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(4,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)

            describe("takeLast", () => {
                test('0', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(0,),).amountOfCall,).toBe(0,),)
                test('1', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(1,),).amountOfCall,).toBe(1,),)
                test('2', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(2,),).amountOfCall,).toBe(2,),)
                test('3', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(3,),).amountOfCall,).toBe(3,),)
                test('4', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(4,),).amountOfCall,).toBe(8,),)
                test('5', () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLast(5,),).amountOfCall,).toBe(8,),)
            },)
            describe("takeLastWhile", () => {
                test("(T, number) → true",  () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(T) → true",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue1,),) .amountOfCall,).toBe(4,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsTrue0,),) .amountOfCall,).toBe(8,),)
                test("(T, number) → false", () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(T) → false",         () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse1,),).amountOfCall,).toBe(1,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhile(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
            describe("takeLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue2,),) .amountOfCall,).toBe(4,),)
                test("(number) → true",     () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue1,),) .amountOfCall,).toBe(8,),)
                test("() → true",           () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsTrue0,),) .amountOfCall,).toBe(8,),)
                test("(number, T) → false", () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse2,),).amountOfCall,).toBe(1,),)
                test("(number) → false",    () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse1,),).amountOfCall,).toBe(0,),)
                test("() → false",          () => expect(new CollectionHolder_ByGenericCollection(ABCD,).executeWhileHavingIndexesOnField(it => it.takeLastWhileIndexed(callbackAsFalse0,),).amountOfCall,).toBe(0,),)
            },)
        },)

    },)

    describe("instances", () => {
        describe("empty", () => {
        describe.each(every0Instances,)("%s", ({value: {newInstance,},},) => {

            describe("take", () => {
                test("NaN", () => expect(newInstance().take(NaN,),)      .toBe(emptyCollectionHolder,),)
                test("-∞",  () => expect(newInstance().take(-Infinity,),).toBe(emptyCollectionHolder,),)
                test("-2",  () => expect(newInstance().take(-2,),)       .toBe(emptyCollectionHolder,),)
                test("-1",  () => expect(newInstance().take(-1,),)       .toBe(emptyCollectionHolder,),)
                test('0',   () => expect(newInstance().take(0,),)        .toBe(emptyCollectionHolder,),)
                test('1',   () => expect(newInstance().take(1,),)        .toBe(emptyCollectionHolder,),)
                test("+∞",  () => expect(newInstance().take(Infinity,),) .toBe(emptyCollectionHolder,),)
            },)
            describe("takeWhile", () => {
                test("(T, number) → boolean", () => expect(newInstance().takeWhile(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
                test("(T) → boolean",         () => expect(newInstance().takeWhile(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
                test("() → boolean",          () => expect(newInstance().takeWhile(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
            },)
            describe("takeWhileIndexed", () => {
                test("(number, T) → boolean", () => expect(newInstance().takeWhileIndexed(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
                test("(number) → boolean",    () => expect(newInstance().takeWhileIndexed(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
                test("() → boolean",          () => expect(newInstance().takeWhileIndexed(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
            },)

            describe("takeLast", () => {
                test("NaN", () => expect(newInstance().takeLast(NaN,),)      .toBe(emptyCollectionHolder,),)
                test("-∞",  () => expect(newInstance().takeLast(-Infinity,),).toBe(emptyCollectionHolder,),)
                test("-2",  () => expect(newInstance().takeLast(-2,),)       .toBe(emptyCollectionHolder,),)
                test("-1",  () => expect(newInstance().takeLast(-1,),)       .toBe(emptyCollectionHolder,),)
                test('0',   () => expect(newInstance().takeLast(0,),)        .toBe(emptyCollectionHolder,),)
                test('1',   () => expect(newInstance().takeLast(1,),)        .toBe(emptyCollectionHolder,),)
                test("+∞",  () => expect(newInstance().takeLast(Infinity,),) .toBe(emptyCollectionHolder,),)
            },)
            describe("takeLastWhile", () => {
                test("(T, number) → boolean", () => expect(newInstance().takeLastWhile(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
                test("(T) → boolean",         () => expect(newInstance().takeLastWhile(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
                test("() → boolean",          () => expect(newInstance().takeLastWhile(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
            },)
            describe("takeLastWhileIndexed", () => {
                test("(number, T) → boolean", () => expect(newInstance().takeLastWhileIndexed(callbackAsFail2,),).toBe(emptyCollectionHolder,),)
                test("(number) → boolean",    () => expect(newInstance().takeLastWhileIndexed(callbackAsFail1,),).toBe(emptyCollectionHolder,),)
                test("() → boolean",          () => expect(newInstance().takeLastWhileIndexed(callbackAsFail0,),).toBe(emptyCollectionHolder,),)
            },)

        },)},)
        describe("1 field", () => {
        describe.each(every1Instances,)("%s", ({value: {newInstance,},},) => {

            describe("take", () => {
                test("NaN", () => expect(() => newInstance('a',).take(NaN,),)         .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(newInstance('a',).take(-Infinity,),)         .toBe(emptyCollectionHolder,),)
                test("-3",  () => expect(newInstance('a',).take(-3,),)                .toBe(emptyCollectionHolder,),)
                test("-2",  () => expect(newInstance('a',).take(-2,),)                .toBe(emptyCollectionHolder,),)
                test("-1",  () => expect(newInstance('a',).take(-1,),)                .toBe(emptyCollectionHolder,),)
                test('0',   () => expect(newInstance('a',).take(0,),)                 .toBe(emptyCollectionHolder,),)
                test('1',   () => expect(newInstance('a',).take(1,).toArray(),)       .toStrictEqual(A,),)
                test('2',   () => expect(newInstance('a',).take(2,).toArray(),)       .toStrictEqual(A,),)
                test("+∞",  () => expect(newInstance('a',).take(Infinity,).toArray(),).toStrictEqual(A,),)
            },)
            describe("takeWhile", () => {
                test("(T, number) → true",  () => expect(newInstance('a',).takeWhile(callbackAsTrue2,).toArray(),)    .toStrictEqual(A,),)
                test("(T) → true",          () => expect(newInstance('a',).takeWhile(callbackAsTrue1,).toArray(),)    .toStrictEqual(A,),)
                test("() → true",           () => expect(newInstance('a',).takeWhile(callbackAsTrue0,).toArray(),)    .toStrictEqual(A,),)
                test("(T, number) → false", () => expect(newInstance('a',).takeWhile(callbackAsFalse2,),)             .toBeEmpty(),)
                test("(T) → false",         () => expect(newInstance('a',).takeWhile(callbackAsFalse1,),)             .toBeEmpty(),)
                test("() → false",          () => expect(newInstance('a',).takeWhile(callbackAsFalse0,),)             .toBeEmpty(),)
                test("under a",             () => expect(newInstance('a',).takeWhile(callbackIsUnderA,),)             .toBeEmpty(),)
                test("under e",             () => expect(newInstance('a',).takeWhile(callbackIsUnderE,).toArray(),)   .toStrictEqual(A,),)
                test("under 0",             () => expect(newInstance('a',).takeWhile(callbackIsUnder0Alt,),)          .toBeEmpty(),)
                test("under 4",             () => expect(newInstance('a',).takeWhile(callbackIsUnder4Alt,).toArray(),).toStrictEqual(A,),)
            },)
            describe("takeWhileIndexed", () => {
                test("(number, T) → true",  () => expect(newInstance('a',).takeWhileIndexed(callbackAsTrue2,).toArray(),)    .toStrictEqual(A,),)
                test("(number) → true",     () => expect(newInstance('a',).takeWhileIndexed(callbackAsTrue1,).toArray(),)    .toStrictEqual(A,),)
                test("() → true",           () => expect(newInstance('a',).takeWhileIndexed(callbackAsTrue0,).toArray(),)    .toStrictEqual(A,),)
                test("(number, T) → false", () => expect(newInstance('a',).takeWhileIndexed(callbackAsFalse2,),)             .toBeEmpty(),)
                test("(number) → false",    () => expect(newInstance('a',).takeWhileIndexed(callbackAsFalse1,),)             .toBeEmpty(),)
                test("() → false",          () => expect(newInstance('a',).takeWhileIndexed(callbackAsFalse0,),)             .toBeEmpty(),)
                test("under a",             () => expect(newInstance('a',).takeWhileIndexed(callbackIsUnderAAlt,),)          .toBeEmpty(),)
                test("under e",             () => expect(newInstance('a',).takeWhileIndexed(callbackIsUnderEAlt,).toArray(),).toStrictEqual(A,),)
                test("under 0",             () => expect(newInstance('a',).takeWhileIndexed(callbackIsUnder0,),)             .toBeEmpty(),)
                test("under 4",             () => expect(newInstance('a',).takeWhileIndexed(callbackIsUnder4,).toArray(),)   .toStrictEqual(A,),)
            },)

            describe("takeLast", () => {
                test("NaN", () => expect(() => newInstance('a',).takeLast(NaN,),)         .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(newInstance('a',).takeLast(-Infinity,),)         .toBe(emptyCollectionHolder,),)
                test("-3",  () => expect(newInstance('a',).takeLast(-3,),)                .toBe(emptyCollectionHolder,),)
                test("-2",  () => expect(newInstance('a',).takeLast(-2,),)                .toBe(emptyCollectionHolder,),)
                test("-1",  () => expect(newInstance('a',).takeLast(-1,),)                .toBe(emptyCollectionHolder,),)
                test('0',   () => expect(newInstance('a',).takeLast(0,),)                 .toBe(emptyCollectionHolder,),)
                test('1',   () => expect(newInstance('a',).takeLast(1,).toArray(),)       .toStrictEqual(A,),)
                test('2',   () => expect(newInstance('a',).takeLast(2,).toArray(),)       .toStrictEqual(A,),)
                test("+∞",  () => expect(newInstance('a',).takeLast(Infinity,).toArray(),).toStrictEqual(A,),)
            },)
            describe("takeLastWhile", () => {
                test("(T, number) → true",  () => expect(newInstance('a',).takeLastWhile(callbackAsTrue2,).toArray(),).toStrictEqual(A,),)
                test("(T) → true",          () => expect(newInstance('a',).takeLastWhile(callbackAsTrue1,).toArray(),).toStrictEqual(A,),)
                test("() → true",           () => expect(newInstance('a',).takeLastWhile(callbackAsTrue0,).toArray(),).toStrictEqual(A,),)
                test("(T, number) → false", () => expect(newInstance('a',).takeLastWhile(callbackAsFalse2,),)         .toBeEmpty(),)
                test("(T) → false",         () => expect(newInstance('a',).takeLastWhile(callbackAsFalse1,),)         .toBeEmpty(),)
                test("() → false",          () => expect(newInstance('a',).takeLastWhile(callbackAsFalse0,),)         .toBeEmpty(),)
                test("over a",              () => expect(newInstance('a',).takeLastWhile(callbackIsOverA,),)          .toBeEmpty(),)
                test("over e",              () => expect(newInstance('a',).takeLastWhile(callbackIsOverE,),)          .toBeEmpty(),)
                test("over 0",              () => expect(newInstance('a',).takeLastWhile(callbackIsOver0Alt,),)       .toBeEmpty(),)
                test("over 4",              () => expect(newInstance('a',).takeLastWhile(callbackIsOver4Alt,),)       .toBeEmpty(),)
            },)
            describe("takeLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(newInstance('a',).takeLastWhileIndexed(callbackAsTrue2,).toArray(),).toStrictEqual(A,),)
                test("(number) → true",     () => expect(newInstance('a',).takeLastWhileIndexed(callbackAsTrue1,).toArray(),).toStrictEqual(A,),)
                test("() → true",           () => expect(newInstance('a',).takeLastWhileIndexed(callbackAsTrue0,).toArray(),).toStrictEqual(A,),)
                test("(number, T) → false", () => expect(newInstance('a',).takeLastWhileIndexed(callbackAsFalse2,),)         .toBeEmpty(),)
                test("(number) → false",    () => expect(newInstance('a',).takeLastWhileIndexed(callbackAsFalse1,),)         .toBeEmpty(),)
                test("() → false",          () => expect(newInstance('a',).takeLastWhileIndexed(callbackAsFalse0,),)         .toBeEmpty(),)
                test("over a",              () => expect(newInstance('a',).takeLastWhileIndexed(callbackIsOverAAlt,),)       .toBeEmpty(),)
                test("over e",              () => expect(newInstance('a',).takeLastWhileIndexed(callbackIsOverEAlt,),)       .toBeEmpty(),)
                test("over 0",              () => expect(newInstance('a',).takeLastWhileIndexed(callbackIsOver0,),)          .toBeEmpty(),)
                test("over 4",              () => expect(newInstance('a',).takeLastWhileIndexed(callbackIsOver4,),)          .toBeEmpty(),)
            },)

        },)},)
        describe("2 fields", () => {
        describe.each(every2Instances,)("%s", ({value: {newInstance,},},) => {

            describe("take", () => {
                test("NaN", () => expect(() => newInstance('a', 'b',).take(NaN,),)               .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(      newInstance('a', 'b',).take(-Infinity,),)         .toBe(emptyCollectionHolder,),)
                test("-4",  () => expect(      newInstance('a', 'b',).take(-4,),)                .toBe(emptyCollectionHolder,),)
                test("-3",  () => expect(      newInstance('a', 'b',).take(-3,),)                .toBe(emptyCollectionHolder,),)
                test("-2",  () => expect(      newInstance('a', 'b',).take(-2,),)                .toBe(emptyCollectionHolder,),)
                test("-1",  () => expect(      newInstance('a', 'b',).take(-1,).toArray(),)      .toStrictEqual(A,),)
                test('0',   () => expect(      newInstance('a', 'b',).take(0,),)                 .toBe(emptyCollectionHolder,),)
                test('1',   () => expect(      newInstance('a', 'b',).take(1,).toArray(),)       .toStrictEqual(A,),)
                test('2',   () => expect(      newInstance('a', 'b',).take(2,).toArray(),)       .toStrictEqual(AB,),)
                test('3',   () => expect(      newInstance('a', 'b',).take(3,).toArray(),)       .toStrictEqual(AB,),)
                test("+∞",  () => expect(      newInstance('a', 'b',).take(Infinity,).toArray(),).toStrictEqual(AB,),)
            },)
            describe("takeWhile", () => {
                test("(T, number) → true",  () => expect(newInstance('a', 'b',).takeWhile(callbackAsTrue2,).toArray(),)    .toStrictEqual(AB,),)
                test("(T) → true",          () => expect(newInstance('a', 'b',).takeWhile(callbackAsTrue1,).toArray(),)    .toStrictEqual(AB,),)
                test("() → true",           () => expect(newInstance('a', 'b',).takeWhile(callbackAsTrue0,).toArray(),)    .toStrictEqual(AB,),)
                test("(T, number) → false", () => expect(newInstance('a', 'b',).takeWhile(callbackAsFalse2,),)             .toBeEmpty(),)
                test("(T) → false",         () => expect(newInstance('a', 'b',).takeWhile(callbackAsFalse1,),)             .toBeEmpty(),)
                test("() → false",          () => expect(newInstance('a', 'b',).takeWhile(callbackAsFalse0,),)             .toBeEmpty(),)
                test("under a",             () => expect(newInstance('a', 'b',).takeWhile(callbackIsUnderA,),)             .toBeEmpty(),)
                test("under b",             () => expect(newInstance('a', 'b',).takeWhile(callbackIsUnderB,).toArray(),)   .toStrictEqual(A,),)
                test("under e",             () => expect(newInstance('a', 'b',).takeWhile(callbackIsUnderE,).toArray(),)   .toStrictEqual(AB,),)
                test("under 0",             () => expect(newInstance('a', 'b',).takeWhile(callbackIsUnder0Alt,),)          .toBeEmpty(),)
                test("under 1",             () => expect(newInstance('a', 'b',).takeWhile(callbackIsUnder1Alt,).toArray(),).toStrictEqual(A,),)
                test("under 4",             () => expect(newInstance('a', 'b',).takeWhile(callbackIsUnder4Alt,).toArray(),).toStrictEqual(AB,),)
            },)
            describe("takeWhileIndexed", () => {
                test("(number, T) → true",  () => expect(newInstance('a', 'b',).takeWhileIndexed(callbackAsTrue2,).toArray(),)    .toStrictEqual(AB,),)
                test("(number) → true",     () => expect(newInstance('a', 'b',).takeWhileIndexed(callbackAsTrue1,).toArray(),)    .toStrictEqual(AB,),)
                test("() → true",           () => expect(newInstance('a', 'b',).takeWhileIndexed(callbackAsTrue0,).toArray(),)    .toStrictEqual(AB,),)
                test("(number, T) → false", () => expect(newInstance('a', 'b',).takeWhileIndexed(callbackAsFalse2,),)             .toBeEmpty(),)
                test("(number) → false",    () => expect(newInstance('a', 'b',).takeWhileIndexed(callbackAsFalse1,),)             .toBeEmpty(),)
                test("() → false",          () => expect(newInstance('a', 'b',).takeWhileIndexed(callbackAsFalse0,),)             .toBeEmpty(),)
                test("under a",             () => expect(newInstance('a', 'b',).takeWhileIndexed(callbackIsUnderAAlt,),)          .toBeEmpty(),)
                test("under b",             () => expect(newInstance('a', 'b',).takeWhileIndexed(callbackIsUnderBAlt,).toArray(),).toStrictEqual(A,),)
                test("under e",             () => expect(newInstance('a', 'b',).takeWhileIndexed(callbackIsUnderEAlt,).toArray(),).toStrictEqual(AB,),)
                test("under 0",             () => expect(newInstance('a', 'b',).takeWhileIndexed(callbackIsUnder0,),)             .toBeEmpty(),)
                test("under 1",             () => expect(newInstance('a', 'b',).takeWhileIndexed(callbackIsUnder1,).toArray(),)   .toStrictEqual(A,),)
                test("under 4",             () => expect(newInstance('a', 'b',).takeWhileIndexed(callbackIsUnder4,).toArray(),)   .toStrictEqual(AB,),)
            },)

            describe("takeLast", () => {
                test("NaN", () => expect(() => newInstance('a', 'b',).takeLast(NaN,),)         .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(newInstance('a', 'b',).takeLast(-Infinity,),)         .toBe(emptyCollectionHolder,),)
                test("-4",  () => expect(newInstance('a', 'b',).takeLast(-4,),)                .toBe(emptyCollectionHolder,),)
                test("-3",  () => expect(newInstance('a', 'b',).takeLast(-3,),)                .toBe(emptyCollectionHolder,),)
                test("-2",  () => expect(newInstance('a', 'b',).takeLast(-2,),)                .toBe(emptyCollectionHolder,),)
                test("-1",  () => expect(newInstance('a', 'b',).takeLast(-1,).toArray(),)      .toStrictEqual(B,),)
                test('0',   () => expect(newInstance('a', 'b',).takeLast(0,),)                 .toBe(emptyCollectionHolder,),)
                test('1',   () => expect(newInstance('a', 'b',).takeLast(1,).toArray(),)       .toStrictEqual(B,),)
                test('2',   () => expect(newInstance('a', 'b',).takeLast(2,).toArray(),)       .toStrictEqual(AB,),)
                test('3',   () => expect(newInstance('a', 'b',).takeLast(3,).toArray(),)       .toStrictEqual(AB,),)
                test("+∞",  () => expect(newInstance('a', 'b',).takeLast(Infinity,).toArray(),).toStrictEqual(AB,),)
            },)
            describe("takeLastWhile", () => {
                test("(T, number) → true",  () => expect(newInstance('a', 'b',).takeLastWhile(callbackAsTrue2,).toArray(),)   .toStrictEqual(AB,),)
                test("(T) → true",          () => expect(newInstance('a', 'b',).takeLastWhile(callbackAsTrue1,).toArray(),)   .toStrictEqual(AB,),)
                test("() → true",           () => expect(newInstance('a', 'b',).takeLastWhile(callbackAsTrue0,).toArray(),)   .toStrictEqual(AB,),)
                test("(T, number) → false", () => expect(newInstance('a', 'b',).takeLastWhile(callbackAsFalse2,),)            .toBeEmpty(),)
                test("(T) → false",         () => expect(newInstance('a', 'b',).takeLastWhile(callbackAsFalse1,),)            .toBeEmpty(),)
                test("() → false",          () => expect(newInstance('a', 'b',).takeLastWhile(callbackAsFalse0,),)            .toBeEmpty(),)
                test("over a",              () => expect(newInstance('a', 'b',).takeLastWhile(callbackIsOverA,).toArray(),)   .toStrictEqual(B,),)
                test("over b",              () => expect(newInstance('a', 'b',).takeLastWhile(callbackIsOverB,),)             .toBeEmpty(),)
                test("over e",              () => expect(newInstance('a', 'b',).takeLastWhile(callbackIsOverE,),)             .toBeEmpty(),)
                test("over 0",              () => expect(newInstance('a', 'b',).takeLastWhile(callbackIsOver0Alt,).toArray(),).toStrictEqual(B,),)
                test("over 1",              () => expect(newInstance('a', 'b',).takeLastWhile(callbackIsOver1Alt,),)          .toBeEmpty(),)
                test("over 4",              () => expect(newInstance('a', 'b',).takeLastWhile(callbackIsOver4Alt,),)          .toBeEmpty(),)
            },)
            describe("takeLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(newInstance('a', 'b',).takeLastWhileIndexed(callbackAsTrue2,).toArray(),)   .toStrictEqual(AB,),)
                test("(number) → true",     () => expect(newInstance('a', 'b',).takeLastWhileIndexed(callbackAsTrue1,).toArray(),)   .toStrictEqual(AB,),)
                test("() → true",           () => expect(newInstance('a', 'b',).takeLastWhileIndexed(callbackAsTrue0,).toArray(),)   .toStrictEqual(AB,),)
                test("(number, T) → false", () => expect(newInstance('a', 'b',).takeLastWhileIndexed(callbackAsFalse2,),)            .toBeEmpty(),)
                test("(number) → false",    () => expect(newInstance('a', 'b',).takeLastWhileIndexed(callbackAsFalse1,),)            .toBeEmpty(),)
                test("() → false",          () => expect(newInstance('a', 'b',).takeLastWhileIndexed(callbackAsFalse0,),)            .toBeEmpty(),)
                test("over a",              () => expect(newInstance('a', 'b',).takeLastWhileIndexed(callbackIsOverAAlt,).toArray(),).toStrictEqual(B,),)
                test("over b",              () => expect(newInstance('a', 'b',).takeLastWhileIndexed(callbackIsOverBAlt,),)          .toBeEmpty(),)
                test("over e",              () => expect(newInstance('a', 'b',).takeLastWhileIndexed(callbackIsOverEAlt,),)          .toBeEmpty(),)
                test("over 0",              () => expect(newInstance('a', 'b',).takeLastWhileIndexed(callbackIsOver0,).toArray(),)   .toStrictEqual(B,),)
                test("over 1",              () => expect(newInstance('a', 'b',).takeLastWhileIndexed(callbackIsOver1,),)             .toBeEmpty(),)
                test("over 4",              () => expect(newInstance('a', 'b',).takeLastWhileIndexed(callbackIsOver4,),)             .toBeEmpty(),)
            },)

        },)},)
        describe("N fields", () => {
        describe.each(everyNInstances,)("%s", ({value: {instance,},},) => {

            describe("take", () => {
                test("NaN", () => expect(() => new instance(ABCD,).take(NaN,),)               .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(      new instance(ABCD,).take(-Infinity,),)         .toBe(emptyCollectionHolder,),)
                test("-6",  () => expect(      new instance(ABCD,).take(-6,),)                .toBe(emptyCollectionHolder,),)
                test("-5",  () => expect(      new instance(ABCD,).take(-5,),)                .toBe(emptyCollectionHolder,),)
                test("-4",  () => expect(      new instance(ABCD,).take(-4,),)                .toBe(emptyCollectionHolder,),)
                test("-3",  () => expect(      new instance(ABCD,).take(-3,).toArray(),)      .toStrictEqual(A,),)
                test("-2",  () => expect(      new instance(ABCD,).take(-2,).toArray(),)      .toStrictEqual(AB,),)
                test("-1",  () => expect(      new instance(ABCD,).take(-1,).toArray(),)      .toStrictEqual(ABC,),)
                test('0',   () => expect(      new instance(ABCD,).take(0,),)                 .toBe(emptyCollectionHolder,),)
                test('1',   () => expect(      new instance(ABCD,).take(1,).toArray(),)       .toStrictEqual(A,),)
                test('2',   () => expect(      new instance(ABCD,).take(2,).toArray(),)       .toStrictEqual(AB,),)
                test('3',   () => expect(      new instance(ABCD,).take(3,).toArray(),)       .toStrictEqual(ABC,),)
                test('4',   () => expect(      new instance(ABCD,).take(4,).toArray(),)       .toStrictEqual(ABCD,),)
                test('5',   () => expect(      new instance(ABCD,).take(5,).toArray(),)       .toStrictEqual(ABCD,),)
                test("+∞",  () => expect(      new instance(ABCD,).take(Infinity,).toArray(),).toStrictEqual(ABCD,),)
            },)
            describe("takeWhile", () => {
                test("(T, number) → true",  () => expect(new instance(ABCD,).takeWhile(callbackAsTrue2,).toArray(),)    .toStrictEqual(ABCD,),)
                test("(T) → true",          () => expect(new instance(ABCD,).takeWhile(callbackAsTrue1,).toArray(),)    .toStrictEqual(ABCD,),)
                test("() → true",           () => expect(new instance(ABCD,).takeWhile(callbackAsTrue0,).toArray(),)    .toStrictEqual(ABCD,),)
                test("(T, number) → false", () => expect(new instance(ABCD,).takeWhile(callbackAsFalse2,),)             .toBeEmpty(),)
                test("(T) → false",         () => expect(new instance(ABCD,).takeWhile(callbackAsFalse1,),)             .toBeEmpty(),)
                test("() → false",          () => expect(new instance(ABCD,).takeWhile(callbackAsFalse0,),)             .toBeEmpty(),)
                test("under a",             () => expect(new instance(ABCD,).takeWhile(callbackIsUnderA,),)             .toBeEmpty(),)
                test("under b",             () => expect(new instance(ABCD,).takeWhile(callbackIsUnderB,).toArray(),)   .toStrictEqual(A,),)
                test("under c",             () => expect(new instance(ABCD,).takeWhile(callbackIsUnderC,).toArray(),)   .toStrictEqual(AB,),)
                test("under d",             () => expect(new instance(ABCD,).takeWhile(callbackIsUnderD,).toArray(),)   .toStrictEqual(ABC,),)
                test("under e",             () => expect(new instance(ABCD,).takeWhile(callbackIsUnderE,).toArray(),)   .toStrictEqual(ABCD,),)
                test("under 0",             () => expect(new instance(ABCD,).takeWhile(callbackIsUnder0Alt,),)          .toBeEmpty(),)
                test("under 1",             () => expect(new instance(ABCD,).takeWhile(callbackIsUnder1Alt,).toArray(),).toStrictEqual(A,),)
                test("under 2",             () => expect(new instance(ABCD,).takeWhile(callbackIsUnder2Alt,).toArray(),).toStrictEqual(AB,),)
                test("under 3",             () => expect(new instance(ABCD,).takeWhile(callbackIsUnder3Alt,).toArray(),).toStrictEqual(ABC,),)
                test("under 4",             () => expect(new instance(ABCD,).takeWhile(callbackIsUnder4Alt,).toArray(),).toStrictEqual(ABCD,),)
            },)
            describe("takeWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new instance(ABCD,).takeWhileIndexed(callbackAsTrue2,).toArray(),)    .toStrictEqual(ABCD,),)
                test("(number) → true",     () => expect(new instance(ABCD,).takeWhileIndexed(callbackAsTrue1,).toArray(),)    .toStrictEqual(ABCD,),)
                test("() → true",           () => expect(new instance(ABCD,).takeWhileIndexed(callbackAsTrue0,).toArray(),)    .toStrictEqual(ABCD,),)
                test("(number, T) → false", () => expect(new instance(ABCD,).takeWhileIndexed(callbackAsFalse2,),)             .toBeEmpty(),)
                test("(number) → false",    () => expect(new instance(ABCD,).takeWhileIndexed(callbackAsFalse1,),)             .toBeEmpty(),)
                test("() → false",          () => expect(new instance(ABCD,).takeWhileIndexed(callbackAsFalse0,),)             .toBeEmpty(),)
                test("under a",             () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnderAAlt,),)          .toBeEmpty(),)
                test("under b",             () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnderBAlt,).toArray(),).toStrictEqual(A,),)
                test("under c",             () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnderCAlt,).toArray(),).toStrictEqual(AB,),)
                test("under d",             () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnderDAlt,).toArray(),).toStrictEqual(ABC,),)
                test("under e",             () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnderEAlt,).toArray(),).toStrictEqual(ABCD,),)
                test("under 0",             () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnder0,),)             .toBeEmpty(),)
                test("under 1",             () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnder1,).toArray(),)   .toStrictEqual(A,),)
                test("under 2",             () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnder2,).toArray(),)   .toStrictEqual(AB,),)
                test("under 3",             () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnder3,).toArray(),)   .toStrictEqual(ABC,),)
                test("under 4",             () => expect(new instance(ABCD,).takeWhileIndexed(callbackIsUnder4,).toArray(),)   .toStrictEqual(ABCD,),)
            },)

            describe("takeLast", () => {
                test("NaN", () => expect(() => new instance(ABCD,).takeLast(NaN,),)         .toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(new instance(ABCD,).takeLast(-Infinity,),)         .toBe(emptyCollectionHolder,),)
                test("-6",  () => expect(new instance(ABCD,).takeLast(-6,),)                .toBe(emptyCollectionHolder,),)
                test("-5",  () => expect(new instance(ABCD,).takeLast(-5,),)                .toBe(emptyCollectionHolder,),)
                test("-4",  () => expect(new instance(ABCD,).takeLast(-4,),)                .toBe(emptyCollectionHolder,),)
                test("-3",  () => expect(new instance(ABCD,).takeLast(-3,).toArray(),)      .toStrictEqual(D,),)
                test("-2",  () => expect(new instance(ABCD,).takeLast(-2,).toArray(),)      .toStrictEqual(CD,),)
                test("-1",  () => expect(new instance(ABCD,).takeLast(-1,).toArray(),)      .toStrictEqual(BCD,),)
                test('0',   () => expect(new instance(ABCD,).takeLast(0,),)                 .toBe(emptyCollectionHolder,),)
                test('1',   () => expect(new instance(ABCD,).takeLast(1,).toArray(),)       .toStrictEqual(D,),)
                test('2',   () => expect(new instance(ABCD,).takeLast(2,).toArray(),)       .toStrictEqual(CD,),)
                test('3',   () => expect(new instance(ABCD,).takeLast(3,).toArray(),)       .toStrictEqual(BCD,),)
                test('4',   () => expect(new instance(ABCD,).takeLast(4,).toArray(),)       .toStrictEqual(ABCD,),)
                test('5',   () => expect(new instance(ABCD,).takeLast(5,).toArray(),)       .toStrictEqual(ABCD,),)
                test("+∞",  () => expect(new instance(ABCD,).takeLast(Infinity,).toArray(),).toStrictEqual(ABCD,),)
            },)
            describe("takeLastWhile", () => {
                test("(T, number) → true",  () => expect(new instance(ABCD,).takeLastWhile(callbackAsTrue2,).toArray(),)   .toStrictEqual(ABCD,),)
                test("(T) → true",          () => expect(new instance(ABCD,).takeLastWhile(callbackAsTrue1,).toArray(),)   .toStrictEqual(ABCD,),)
                test("() → true",           () => expect(new instance(ABCD,).takeLastWhile(callbackAsTrue0,).toArray(),)   .toStrictEqual(ABCD,),)
                test("(T, number) → false", () => expect(new instance(ABCD,).takeLastWhile(callbackAsFalse2,),)            .toBeEmpty(),)
                test("(T) → false",         () => expect(new instance(ABCD,).takeLastWhile(callbackAsFalse1,),)            .toBeEmpty(),)
                test("() → false",          () => expect(new instance(ABCD,).takeLastWhile(callbackAsFalse0,),)            .toBeEmpty(),)
                test("over a",              () => expect(new instance(ABCD,).takeLastWhile(callbackIsOverA,).toArray(),)   .toStrictEqual(BCD),)
                test("over b",              () => expect(new instance(ABCD,).takeLastWhile(callbackIsOverB,).toArray(),)   .toStrictEqual(CD,),)
                test("over c",              () => expect(new instance(ABCD,).takeLastWhile(callbackIsOverC,).toArray(),)   .toStrictEqual(D,),)
                test("over d",              () => expect(new instance(ABCD,).takeLastWhile(callbackIsOverD,),)             .toBeEmpty(),)
                test("over e",              () => expect(new instance(ABCD,).takeLastWhile(callbackIsOverE,),)             .toBeEmpty(),)
                test("over 0",              () => expect(new instance(ABCD,).takeLastWhile(callbackIsOver0Alt,).toArray(),).toStrictEqual(BCD),)
                test("over 1",              () => expect(new instance(ABCD,).takeLastWhile(callbackIsOver1Alt,).toArray(),).toStrictEqual(CD,),)
                test("over 2",              () => expect(new instance(ABCD,).takeLastWhile(callbackIsOver2Alt,).toArray(),).toStrictEqual(D,),)
                test("over 3",              () => expect(new instance(ABCD,).takeLastWhile(callbackIsOver3Alt,),)          .toBeEmpty(),)
                test("over 4",              () => expect(new instance(ABCD,).takeLastWhile(callbackIsOver4Alt,),)          .toBeEmpty(),)
            },)
            describe("takeLastWhileIndexed", () => {
                test("(number, T) → true",  () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackAsTrue2,).toArray(),)   .toStrictEqual(ABCD,),)
                test("(number) → true",     () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackAsTrue1,).toArray(),)   .toStrictEqual(ABCD,),)
                test("() → true",           () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackAsTrue0,).toArray(),)   .toStrictEqual(ABCD,),)
                test("(number, T) → false", () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackAsFalse2,),)            .toBeEmpty(),)
                test("(number) → false",    () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackAsFalse1,),)            .toBeEmpty(),)
                test("() → false",          () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackAsFalse0,),)            .toBeEmpty(),)
                test("over a",              () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOverAAlt,).toArray(),).toStrictEqual(BCD,),)
                test("over b",              () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOverBAlt,).toArray(),).toStrictEqual(CD,),)
                test("over c",              () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOverCAlt,).toArray(),).toStrictEqual(D,),)
                test("over d",              () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOverDAlt,),)          .toBeEmpty(),)
                test("over e",              () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOverEAlt,),)          .toBeEmpty(),)
                test("over 0",              () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOver0,).toArray(),)   .toStrictEqual(BCD,),)
                test("over 1",              () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOver1,).toArray(),)   .toStrictEqual(CD,),)
                test("over 2",              () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOver2,).toArray(),)   .toStrictEqual(D,),)
                test("over 3",              () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOver3,),)             .toBeEmpty(),)
                test("over 4",              () => expect(new instance(ABCD,).takeLastWhileIndexed(callbackIsOver4,),)             .toBeEmpty(),)
            },)

        },)},)
    },)

},)
