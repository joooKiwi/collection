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

import {CollectionHolder_1Follower}                                                                        from "./instance/CollectionHolder_1.follower"
import {CollectionHolder_2Follower}                                                                        from "./instance/CollectionHolder_2.follower"
import {CollectionHolder_AdaptorOfArrayFollower}                                                           from "./instance/CollectionHolder_AdaptorOfArray.follower"
import {CollectionHolder_AdaptorOfIteratorFollower}                                                        from "./instance/CollectionHolder_AdaptorOfIterator.follower"
import {CollectionHolder_AdaptorOfJsIteratorFollower}                                                      from "./instance/CollectionHolder_AdaptorOfJsIterator.follower"
import {CollectionHolder_AdaptorOfJsIterableFollower}                                                      from "./instance/CollectionHolder_AdaptorOfJsIterable.follower"
import {CollectionHolder_AdaptorOfMinimalistFollower}                                                      from "./instance/CollectionHolder_AdaptorOfMinimalist.follower"
import {CollectionHolder_AdaptorOfSetFollower}                                                             from "./instance/CollectionHolder_AdaptorOfSet.follower"
import {CollectionHolder_ArrayOf1Follower}                                                                 from "./instance/CollectionHolder_ArrayOf1.follower"
import {CollectionHolder_ArrayOf2Follower}                                                                 from "./instance/CollectionHolder_ArrayOf2.follower"
import {CollectionHolder_ByGenericCollection}                                                              from "./instance/CollectionHolder_ByGenericCollection"
import {CollectionHolder_ByGenericCollectionFollower}                                                      from "./instance/CollectionHolder_ByGenericCollection.follower"
import {CollectionHolder_ByMinimalistCollection}                                                           from "./instance/CollectionHolder_ByMinimalistCollection"
import {CollectionHolder_ByViewerFollower}                                                                 from "./instance/CollectionHolder_ByViewer.follower"
import {CollectionHolder_LazyFollower}                                                                     from "./instance/CollectionHolder_Lazy.follower"
import {CollectionHolder_LazyOf0Or1Follower}                                                               from "./instance/CollectionHolder_LazyOf0Or1.follower"
import {CollectionHolder_LazyOf0Or1Or2Follower}                                                            from "./instance/CollectionHolder_LazyOf0Or1Or2.follower"
import {CollectionHolder_LazyOf1Follower}                                                                  from "./instance/CollectionHolder_LazyOf1.follower"
import {CollectionHolder_LazyOf1Or2Follower}                                                               from "./instance/CollectionHolder_LazyOf1Or2.follower"
import {CollectionHolder_LazyOf2Follower}                                                                  from "./instance/CollectionHolder_LazyOf2.follower"
import {CollectionHolder_SetOf1Follower}                                                                   from "./instance/CollectionHolder_SetOf1.follower"
import {CollectionHolder_SetOf2Follower}                                                                   from "./instance/CollectionHolder_SetOf2.follower"
import {CollectionHolderFromArray}                                                                         from "./instance/CollectionHolderFromArray"
import {MinimalistCollectionHolderFromArray}                                                               from "./instance/MinimalistCollectionHolderFromArray"
import {A, AB, ABCD, EMPTY}                                                                                from "./value/arrays"
import {callbackAsFail0}                                                                                   from "./value/callbacks (fail)"
import {callbackAsNull0}                                                                                   from "./value/callbacks (null)"
import {every0Instances, every1Instances, every2Instances, everyExtensionMethodInstances, everyNInstances} from "./value/instances"

import {EmptyCollectionHolder}                                                                                                               from "../src/EmptyCollectionHolder"
import {EmptyCollectionException}                                                                                                            from "../src/exception/EmptyCollectionException"
import {ForbiddenIndexException}                                                                                                             from "../src/exception/ForbiddenIndexException"
import {IndexOutOfBoundsException}                                                                                                           from "../src/exception/IndexOutOfBoundsException"
import {atOrElse, atOrElseByArray, atOrElseByCollectionHolder, atOrElseByMinimalistCollectionHolder}                                         from "../src/method/atOrElse"
import {atOrNull, atOrNullByArray, atOrNullByCollectionHolder, atOrNullByMinimalistCollectionHolder}                                         from "../src/method/atOrNull"
import {elementAtOrElse, elementAtOrElseByArray, elementAtOrElseByCollectionHolder, elementAtOrElseByMinimalistCollectionHolder}             from "../src/method/elementAtOrElse"
import {elementAtOrNull, elementAtOrNullByArray, elementAtOrNullByCollectionHolder, elementAtOrNullByMinimalistCollectionHolder}             from "../src/method/elementAtOrNull"
import {first, firstByArray, firstByCollectionHolder, firstByMinimalistCollectionHolder}                                                     from "../src/method/first"
import {firstIndexed, firstIndexedByArray, firstIndexedByCollectionHolder, firstIndexedByMinimalistCollectionHolder}                         from "../src/method/firstIndexed"
import {firstIndexedOrNull, firstIndexedOrNullByArray, firstIndexedOrNullByCollectionHolder, firstIndexedOrNullByMinimalistCollectionHolder} from "../src/method/firstIndexedOrNull"
import {firstOrNull, firstOrNullByArray, firstOrNullByCollectionHolder, firstOrNullByMinimalistCollectionHolder}                             from "../src/method/firstOrNull"
import * as getFirstModule                                                                                                                   from "../src/method/getFirst"
import * as getFirstOrNullModule                                                                                                             from "../src/method/getFirstOrNull"
import * as getLastModule                                                                                                                    from "../src/method/getLast"
import * as getLastOrNullModule                                                                                                              from "../src/method/getLastOrNull"
import * as getOrElseModule                                                                                                                  from "../src/method/getOrElse"
import * as getOrNullModule                                                                                                                  from "../src/method/getOrNull"
import {last, lastByArray, lastByCollectionHolder, lastByMinimalistCollectionHolder}                                                         from "../src/method/last"
import {lastIndexed, lastIndexedByArray, lastIndexedByCollectionHolder, lastIndexedByMinimalistCollectionHolder}                             from "../src/method/lastIndexed"
import {lastIndexedOrNull, lastIndexedOrNullByArray, lastIndexedOrNullByCollectionHolder, lastIndexedOrNullByMinimalistCollectionHolder}     from "../src/method/lastIndexedOrNull"
import {lastOrNull, lastOrNullByArray, lastOrNullByCollectionHolder, lastOrNullByMinimalistCollectionHolder}                                 from "../src/method/lastOrNull"

describe("CollectionHolderTest (value)", () => {
    //#region -------------------- Reusable values --------------------

    /** An index that exist in the alias tests */
    const existantIndex = 2
    /** An impossible index in the alias tests */
    const invalidIndex = NaN

    const value = Symbol()
    const callback = () => value

    //#endregion -------------------- Reusable values --------------------

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("get",                 () => expect(() => instance.get(),).toThrow(EmptyCollectionException,),)
        test("getFirst",            () => expect(() => instance.getFirst(),).toThrow(EmptyCollectionException,),)
        test("first",               () => expect(() => instance.first(),).toThrow(EmptyCollectionException,),)
        test("firstIndexed",        () => expect(() => instance.firstIndexed(),).toThrow(EmptyCollectionException,),)
        test("getLast",             () => expect(() => instance.getLast(),).toThrow(EmptyCollectionException,),)
        test("last",                () => expect(() => instance.last(),).toThrow(EmptyCollectionException,),)
        test("lastIndexed",         () => expect(() => instance.lastIndexed(),).toThrow(EmptyCollectionException,),)
        test("at",                  () => expect(() => instance.at(),).toThrow(EmptyCollectionException,),)
        test("elementAt",           () => expect(() => instance.elementAt(),).toThrow(EmptyCollectionException,),)
        test("getOrElse",           () => expect(instance.getOrElse(invalidIndex, it => it,),).toBeNaN(),)
        test("atOrElse",            () => expect(instance.atOrElse(invalidIndex, it => it,),).toBeNaN(),)
        test("elementAtOrElse",     () => expect(instance.elementAtOrElse(invalidIndex, it => it,),).toBeNaN(),)
        test("getOrNull",           () => expect(instance.getOrNull(),).toBeNull(),)
        test("getFirstOrNull",      () => expect(instance.getFirstOrNull(),).toBeNull(),)
        test("getFirstOrElse",      () => expect(instance.getFirstOrElse(callback,),).toBe(value,),)
        test("firstOrNull",         () => expect(instance.firstOrNull(),).toBeNull(),)
        test("firstIndexedOrNull",  () => expect(instance.firstIndexedOrNull(),).toBeNull(),)
        test("getLastOrNull",       () => expect(instance.getLastOrNull(),).toBeNull(),)
        test("getLastOrElse",       () => expect(instance.getLastOrElse(callback,),).toBe(value,),)
        test("lastOrNull",          () => expect(instance.lastOrNull(),).toBeNull(),)
        test("lastIndexedOrNull",   () => expect(instance.lastIndexedOrNull(),).toBeNull(),)
        test("atOrNull",            () => expect(instance.atOrNull(),).toBeNull(),)
        test("elementAtOrNull",     () => expect(instance.elementAtOrNull(),).toBeNull(),)
    },)

    describe("aliases", () => {
        describe("ArrayAsCollectionHolder", () => {
            test("first",              () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("ArrayOf1AsCollectionHolder", () => {
            test("first",              () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("ArrayOf2AsCollectionHolder", () => {
            test("first",              () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("CollectionHolderOf1", () => {
            test("first",              () => expect(new CollectionHolder_1Follower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_1Follower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_1Follower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_1Follower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_1Follower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_1Follower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_1Follower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_1Follower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_1Follower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_1Follower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_1Follower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_1Follower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_1Follower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_1Follower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("CollectionHolderOf2", () => {
            test("first",              () => expect(new CollectionHolder_2Follower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_2Follower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_2Follower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_2Follower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_2Follower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_2Follower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_2Follower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_2Follower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_2Follower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_2Follower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_2Follower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_2Follower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_2Follower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_2Follower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("CollectionViewer", () => {
            test("first",              () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("GenericCollectionHolder", () => {
            test("first",              () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("IteratorAsCollectionHolder", () => {
            test("first",              () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("JsIterableAsCollectionHolder", () => {
            test("first",              () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("JsIteratorAsCollectionHolder", () => {
            test("first",              () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("LazyCollectionHolder", () => {
            test("first",              () => expect(new CollectionHolder_LazyFollower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_LazyFollower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_LazyFollower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_LazyFollower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_LazyFollower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_LazyFollower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_LazyFollower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_LazyFollower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_LazyFollower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_LazyFollower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_LazyFollower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_LazyFollower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_LazyFollower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_LazyFollower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("LazyCollectionHolderOf0Or1", () => {
            test("first",              () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("LazyCollectionHolderOf0Or1Or2", () => {
            test("first",              () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("LazyCollectionHolderOf1", () => {
            test("first",              () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("LazyCollectionHolderOf1Or2", () => {
            test("first",              () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("LazyCollectionHolderOf2", () => {
            test("first",              () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("MinimalistAsCollectionHolder", () => {
            test("first",              () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("SetAsCollectionHolder", () => {
            test("first",              () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("SetOf1AsCollectionHolder", () => {
            test("first",              () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)
        describe("SetOf2AsCollectionHolder", () => {
            test("first",              () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.first(),)                                        .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstOrNull",        () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.firstOrNull(),)                                  .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.firstIndexed(),)                                 .getFirst_amountOfCall,)      .toBe(1,),)
            test("firstIndexedOrNull", () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.firstIndexedOrNull(),)                           .getFirstOrNull_amountOfCall,).toBe(1,),)
            test("last",               () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.last(),)                                         .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.lastOrNull(),)                                   .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("lastIndexed",        () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.lastIndexed(),)                                  .getLast_amountOfCall,)       .toBe(1,),)
            test("lastOrNull",         () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.lastIndexedOrNull(),)                            .getLastOrNull_amountOfCall,) .toBe(1,),)
            test("at",                 () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.at(existantIndex,),)                             .get_amountOfCall,)           .toBe(1,),)
            test("atOrElse",           () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .getOrElse_amountOfCall,)     .toBe(1,),)
            test("atOrNull",           () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.atOrNull(invalidIndex,),)                        .getOrNull_amountOfCall,)     .toBe(1,),)
            test("elementAt",          () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.elementAt(existantIndex,),)                      .get_amountOfCall,)           .toBe(1,),)
            test("elementAtOrElse",    () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).getOrElse_amountOfCall,)     .toBe(1,),)
            test("elementAtOrNull",    () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.elementAtOrNull(invalidIndex,),)                 .getOrNull_amountOfCall,)     .toBe(1,),)
        },)

        describe("first", () => {
            test("all", () => {
                const method = jest.spyOn(getFirstModule, "getFirst",)
                first(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getFirstModule, "getFirstByMinimalistCollectionHolder",)
                firstByMinimalistCollectionHolder(new MinimalistCollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getFirstModule, "getFirstByCollectionHolder",)
                firstByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getFirstModule, "getFirstByArray",)
                firstByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("firstOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNull",)
                firstOrNull(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByMinimalistCollectionHolder",)
                firstOrNullByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByCollectionHolder",)
                firstOrNullByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByArray",)
                firstOrNullByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("firstIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(getFirstModule, "getFirst",)
                firstIndexed(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getFirstModule, "getFirstByMinimalistCollectionHolder",)
                firstIndexedByMinimalistCollectionHolder(new MinimalistCollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getFirstModule, "getFirstByCollectionHolder",)
                firstIndexedByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getFirstModule, "getFirstByArray",)
                firstIndexedByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("firstIndexedOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNull",)
                firstIndexedOrNull(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByMinimalistCollectionHolder",)
                firstIndexedOrNullByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByCollectionHolder",)
                firstIndexedOrNullByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByArray",)
                firstIndexedOrNullByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("last", () => {
            test("all", () => {
                const method = jest.spyOn(getLastModule, "getLast",)
                last(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getLastModule, "getLastByMinimalistCollectionHolder",)
                lastByMinimalistCollectionHolder(new MinimalistCollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getLastModule, "getLastByCollectionHolder",)
                lastByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getLastModule, "getLastByArray",)
                lastByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("lastOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNull",)
                lastOrNull(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByMinimalistCollectionHolder",)
                lastOrNullByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByCollectionHolder",)
                lastOrNullByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByArray",)
                lastOrNullByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("lastIndexed", () => {
            test("all", () => {
                const method = jest.spyOn(getLastModule, "getLast",)
                lastIndexed(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getLastModule, "getLastByMinimalistCollectionHolder",)
                lastIndexedByMinimalistCollectionHolder(new MinimalistCollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getLastModule, "getLastByCollectionHolder",)
                lastIndexedByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getLastModule, "getLastByArray",)
                lastIndexedByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("lastIndexedOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNull",)
                lastIndexedOrNull(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByMinimalistCollectionHolder",)
                lastIndexedOrNullByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByCollectionHolder",)
                lastIndexedOrNullByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByArray",)
                lastIndexedOrNullByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("atOrElse", () => {
            test("all", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElse",)
                atOrElse(A, 0, callbackAsFail0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByMinimalistCollectionHolder",)
                atOrElseByMinimalistCollectionHolder(new MinimalistCollectionHolderFromArray(A,), 0, callbackAsFail0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByCollectionHolder",)
                atOrElseByCollectionHolder(new CollectionHolderFromArray(A,), 0, callbackAsFail0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByArray",)
                atOrElseByArray(A, 0, callbackAsFail0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("atOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNull",)
                atOrNull(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByMinimalistCollectionHolder",)
                atOrNullByMinimalistCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByCollectionHolder",)
                atOrNullByCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByArray",)
                atOrNullByArray(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("elementAtOrElse", () => {
            test("all", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElse",)
                elementAtOrElse(A, 0, callbackAsFail0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByMinimalistCollectionHolder",)
                elementAtOrElseByMinimalistCollectionHolder(new MinimalistCollectionHolderFromArray(A,), 0, callbackAsFail0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByCollectionHolder",)
                elementAtOrElseByCollectionHolder(new CollectionHolderFromArray(A,), 0, callbackAsFail0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByArray",)
                elementAtOrElseByArray(A, 0, callbackAsFail0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("elementAtOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNull",)
                elementAtOrNull(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByMinimalistCollectionHolder",)
                elementAtOrNullByMinimalistCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByCollectionHolder",)
                elementAtOrNullByCollectionHolder(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByArray",)
                elementAtOrNullByArray(null, 0,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance, emptyException,},},) => {
        describe("getOrElse", () => expect(instance.getOrElse(0, callback,) === value,).toBeTrue(),)
        describe("getOrNull", () => expect(instance.getOrNull(0,),).toBeNull(),)

        describe("getFirst", () => expect(() => instance.getFirst(),).toThrow(emptyException,),)
        describe("getFirstOrNull", () => expect(instance.getFirstOrNull(),).toBeNull(),)
        describe("getFirstOrElse", () => expect(instance.getFirstOrElse(callback,),).toBe(value,),)

        describe("getLast", () => expect(() => instance.getLast(),).toThrow(emptyException,),)
        describe("getLastOrNull", () => expect(instance.getLastOrNull(),).toBeNull(),)
        describe("getLastOrElse", () => expect(instance.getLastOrElse(callback,),).toBe(value,),)
    },)},)

    describe("get() being called", () => {
        //README: The adaptor classes are ignored since they rely on the apdated class instead.
        //        The lazy classes are ignored since they use inner class(es) instead.
        //        The viewer instances are ignored since they rely on the viewed class instead.
        //        The instances of 1 or 2 are ignored since they use "get value1|2" instead of get()

        describe("empty ~ collection (by minimalist)", () => {
            test("get",     () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileExpectingEmptyException(it => it.get(0,),).amountOfCall,).toBe(1,),)
            test("getFirst", () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileExpectingEmptyException(it => it.getFirst(),).amountOfCall,).toBe(0,),)
            test("getLast",  () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).executeWhileExpectingEmptyException(it => it.getLast(),).amountOfCall,).toBe(0,),)

            test("getOrElse",      () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).execute(it => it.getOrElse(0, callback,),).amountOfCall,).toBe(0,),)
            test("getFirstOrElse", () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).execute(it => it.getFirstOrElse(callback,),).amountOfCall,).toBe(0,),)
            test("getLastOrElse",  () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).execute(it => it.getLastOrElse(callback,),).amountOfCall,).toBe(0,),)

            test("getOrNull",      () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).execute(it => it.getOrNull(0,),).amountOfCall,).toBe(0,),)
            test("getFirstOrNull", () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).execute(it => it.getFirstOrNull(),).amountOfCall,).toBe(0,),)
            test("getLastOrNull",  () => expect(new CollectionHolder_ByMinimalistCollection(EMPTY,).execute(it => it.getLastOrNull(),).amountOfCall,).toBe(0,),)
        },)
        describe("empty ~ collection (by normal)", () => {
            test("get",      () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileExpectingEmptyException(it => it.get(0,),).amountOfCall,).toBe(0,),)
            test("getFirst", () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileExpectingEmptyException(it => it.getFirst(),).amountOfCall,).toBe(0,),)
            test("getLast",  () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).executeWhileExpectingEmptyException(it => it.getLast(),).amountOfCall,).toBe(0,),)

            test("getOrElse",      () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).execute(it => it.getOrElse(0, callback,),).amountOfCall,).toBe(0,),)
            test("getFirstOrElse", () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).execute(it => it.getFirstOrElse(callback,),).amountOfCall,).toBe(0,),)
            test("getLastOrElse",  () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).execute(it => it.getLastOrElse(callback,),).amountOfCall,).toBe(0,),)

            test("getOrNull",      () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).execute(it => it.getOrNull(0,),).amountOfCall,).toBe(0,),)
            test("getFirstOrNull", () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).execute(it => it.getFirstOrNull(),).amountOfCall,).toBe(0,),)
            test("getLastOrNull",  () => expect(new CollectionHolder_ByGenericCollection(EMPTY,).execute(it => it.getLastOrNull(),).amountOfCall,).toBe(0,),)
        },)

        describe("1 field ~ collection (by minimalist)", () => {
            test("get",      () => expect(new CollectionHolder_ByMinimalistCollection(A,).execute(it => it.get(0,),).amountOfCall,).toBe(1,),)
            test("getFirst", () => expect(new CollectionHolder_ByMinimalistCollection(A,).execute(it => it.getFirst(),).amountOfCall,).toBe(1,),)
            test("getLast",  () => expect(new CollectionHolder_ByMinimalistCollection(A,).execute(it => it.getLast(),).amountOfCall,).toBe(1,),)

            test("getOrElse",      () => expect(new CollectionHolder_ByMinimalistCollection(A,).execute(it => it.getOrElse(0, callbackAsFail0,),).amountOfCall,).toBe(1,),)
            test("getFirstOrElse", () => expect(new CollectionHolder_ByMinimalistCollection(A,).execute(it => it.getFirstOrElse(callbackAsFail0,),).amountOfCall,).toBe(1,),)
            test("getLastOrElse",  () => expect(new CollectionHolder_ByMinimalistCollection(A,).execute(it => it.getLastOrElse(callbackAsFail0,),).amountOfCall,).toBe(1,),)

            test("getOrNull",      () => expect(new CollectionHolder_ByMinimalistCollection(A,).execute(it => it.getOrNull(0,),).amountOfCall,).toBe(0,),)
            test("getFirstOrNull", () => expect(new CollectionHolder_ByMinimalistCollection(A,).execute(it => it.getFirstOrNull(),).amountOfCall,).toBe(1,),)
            test("getLastOrNull",  () => expect(new CollectionHolder_ByMinimalistCollection(A,).execute(it => it.getLastOrNull(),).amountOfCall,).toBe(1,),)
        },)
        describe("1 field ~ collection (by normal)", () => {
            test("get",      () => expect(new CollectionHolder_ByGenericCollection(A,).execute(it => it.get(0,),).amountOfCall,).toBe(1,),)
            test("getFirst", () => expect(new CollectionHolder_ByGenericCollection(A,).execute(it => it.getFirst(),).amountOfCall,).toBe(1,),)
            test("getLast",  () => expect(new CollectionHolder_ByGenericCollection(A,).execute(it => it.getLast(),).amountOfCall,).toBe(1,),)

            test("getOrElse",      () => expect(new CollectionHolder_ByGenericCollection(A,).execute(it => it.getOrElse(0, callbackAsFail0,),).amountOfCall,).toBe(1,),)
            test("getFirstOrElse", () => expect(new CollectionHolder_ByGenericCollection(A,).execute(it => it.getFirstOrElse(callbackAsFail0,),).amountOfCall,).toBe(1,),)
            test("getLastOrElse",  () => expect(new CollectionHolder_ByGenericCollection(A,).execute(it => it.getLastOrElse(callbackAsFail0,),).amountOfCall,).toBe(1,),)

            test("getOrNull",      () => expect(new CollectionHolder_ByGenericCollection(A,).execute(it => it.getOrNull(0,),).amountOfCall,).toBe(0,),)
            test("getFirstOrNull", () => expect(new CollectionHolder_ByGenericCollection(A,).execute(it => it.getFirstOrNull(),).amountOfCall,).toBe(1,),)
            test("getLastOrNull",  () => expect(new CollectionHolder_ByGenericCollection(A,).execute(it => it.getLastOrNull(),).amountOfCall,).toBe(1,),)
        },)

        describe("2 fields ~ collection (by minimalist)", () => {
            test("get",      () => expect(new CollectionHolder_ByMinimalistCollection(AB,).execute(it => it.get(0,),).amountOfCall,).toBe(1,),)
            test("getFirst", () => expect(new CollectionHolder_ByMinimalistCollection(AB,).execute(it => it.getFirst(),).amountOfCall,).toBe(1,),)
            test("getLast",  () => expect(new CollectionHolder_ByMinimalistCollection(AB,).execute(it => it.getLast(),).amountOfCall,).toBe(1,),)

            test("getOrElse",      () => expect(new CollectionHolder_ByMinimalistCollection(AB,).execute(it => it.getOrElse(0, callbackAsFail0,),).amountOfCall,).toBe(1,),)
            test("getFirstOrElse", () => expect(new CollectionHolder_ByMinimalistCollection(AB,).execute(it => it.getFirstOrElse(callbackAsFail0,),).amountOfCall,).toBe(1,),)
            test("getLastOrElse",  () => expect(new CollectionHolder_ByMinimalistCollection(AB,).execute(it => it.getLastOrElse(callbackAsFail0,),).amountOfCall,).toBe(1,),)

            test("getOrNull",      () => expect(new CollectionHolder_ByMinimalistCollection(AB,).execute(it => it.getOrNull(0,),).amountOfCall,).toBe(1,),)
            test("getFirstOrNull", () => expect(new CollectionHolder_ByMinimalistCollection(AB,).execute(it => it.getFirstOrNull(),).amountOfCall,).toBe(1,),)
            test("getLastOrNull",  () => expect(new CollectionHolder_ByMinimalistCollection(AB,).execute(it => it.getLastOrNull(),).amountOfCall,).toBe(1,),)
        },)
        describe("2 fields ~ collection (by normal)", () => {
            test("get",      () => expect(new CollectionHolder_ByGenericCollection(AB,).execute(it => it.get(0,),).amountOfCall,).toBe(1,),)
            test("getFirst", () => expect(new CollectionHolder_ByGenericCollection(AB,).execute(it => it.getFirst(),).amountOfCall,).toBe(1,),)
            test("getLast",  () => expect(new CollectionHolder_ByGenericCollection(AB,).execute(it => it.getLast(),).amountOfCall,).toBe(1,),)

            test("getOrElse",      () => expect(new CollectionHolder_ByGenericCollection(AB,).execute(it => it.getOrElse(0, callbackAsFail0,),).amountOfCall,).toBe(1,),)
            test("getFirstOrElse", () => expect(new CollectionHolder_ByGenericCollection(AB,).execute(it => it.getFirstOrElse(callbackAsFail0,),).amountOfCall,).toBe(1,),)
            test("getLastOrElse",  () => expect(new CollectionHolder_ByGenericCollection(AB,).execute(it => it.getLastOrElse(callbackAsFail0,),).amountOfCall,).toBe(1,),)

            test("getOrNull",      () => expect(new CollectionHolder_ByGenericCollection(AB,).execute(it => it.getOrNull(0,),).amountOfCall,).toBe(1,),)
            test("getFirstOrNull", () => expect(new CollectionHolder_ByGenericCollection(AB,).execute(it => it.getFirstOrNull(),).amountOfCall,).toBe(1,),)
            test("getLastOrNull",  () => expect(new CollectionHolder_ByGenericCollection(AB,).execute(it => it.getLastOrNull(),).amountOfCall,).toBe(1,),)
        },)

        describe("N fields ~ collection (by minimalist)", () => {
            test("get",      () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).execute(it => it.get(0,),).amountOfCall,).toBe(1,),)
            test("getFirst", () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).execute(it => it.getFirst(),).amountOfCall,).toBe(1,),)
            test("getLast",  () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).execute(it => it.getLast(),).amountOfCall,).toBe(1,),)

            test("getOrElse",      () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).execute(it => it.getOrElse(0, callbackAsFail0,),).amountOfCall,).toBe(1,),)
            test("getFirstOrElse", () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).execute(it => it.getFirstOrElse(callbackAsFail0,),).amountOfCall,).toBe(1,),)
            test("getLastOrElse",  () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).execute(it => it.getLastOrElse(callbackAsFail0,),).amountOfCall,).toBe(1,),)

            test("getOrNull",      () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).execute(it => it.getOrNull(0,),).amountOfCall,).toBe(1,),)
            test("getFirstOrNull", () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).execute(it => it.getFirstOrNull(),).amountOfCall,).toBe(1,),)
            test("getLastOrNull",  () => expect(new CollectionHolder_ByMinimalistCollection(ABCD,).execute(it => it.getLastOrNull(),).amountOfCall,).toBe(1,),)
        },)
        describe("N fields ~ collection (by normal)", () => {
            test("get",      () => expect(new CollectionHolder_ByGenericCollection(ABCD,).execute(it => it.get(0,),).amountOfCall,).toBe(1,),)
            test("getFirst", () => expect(new CollectionHolder_ByGenericCollection(ABCD,).execute(it => it.getFirst(),).amountOfCall,).toBe(1,),)
            test("getLast",  () => expect(new CollectionHolder_ByGenericCollection(ABCD,).execute(it => it.getLast(),).amountOfCall,).toBe(1,),)

            test("getOrElse",      () => expect(new CollectionHolder_ByGenericCollection(ABCD,).execute(it => it.getOrElse(0, callbackAsFail0,),).amountOfCall,).toBe(1,),)
            test("getFirstOrElse", () => expect(new CollectionHolder_ByGenericCollection(ABCD,).execute(it => it.getFirstOrElse(callbackAsFail0,),).amountOfCall,).toBe(1,),)
            test("getLastOrElse",  () => expect(new CollectionHolder_ByGenericCollection(ABCD,).execute(it => it.getLastOrElse(callbackAsFail0,),).amountOfCall,).toBe(1,),)

            test("getOrNull",      () => expect(new CollectionHolder_ByGenericCollection(ABCD,).execute(it => it.getOrNull(0,),).amountOfCall,).toBe(1,),)
            test("getFirstOrNull", () => expect(new CollectionHolder_ByGenericCollection(ABCD,).execute(it => it.getFirstOrNull(),).amountOfCall,).toBe(1,),)
            test("getLastOrNull",  () => expect(new CollectionHolder_ByGenericCollection(ABCD,).execute(it => it.getLastOrNull(),).amountOfCall,).toBe(1,),)
        },)
    },)

    describe("instances", () => {
        describe("empty", () => {
        describe.each(every0Instances,)("%s", ({value: {newInstance, type, isViewer,},},) => {
            /** The instance is a {@link MinimalistAsCollectionHolder} */
            const isMinimalistAdaptor = type === "minimalist adaptor";

            (isMinimalistAdaptor || isViewer ? describe.skip : describe)("get", () => {
                test("NaN", () => expect(() => newInstance().get(NaN,),)      .toThrow(EmptyCollectionException,),)
                test("-∞",  () => expect(() => newInstance().get(-Infinity,),).toThrow(EmptyCollectionException,),)
                test("-2",  () => expect(() => newInstance().get(-2,),)       .toThrow(EmptyCollectionException,),)
                test("-1",  () => expect(() => newInstance().get(-1,),)       .toThrow(EmptyCollectionException,),)
                test('0',   () => expect(() => newInstance().get(0,),)        .toThrow(EmptyCollectionException,),)
                test('1',   () => expect(() => newInstance().get(1,),)        .toThrow(EmptyCollectionException,),)
                test("+∞",  () => expect(() => newInstance().get(Infinity,),) .toThrow(EmptyCollectionException,),)
            },)
            test("getFirst", () => expect(() => newInstance().getFirst(),).toThrow(EmptyCollectionException,),)
            test("getLast", () => expect(() => newInstance().getLast(),).toThrow(EmptyCollectionException,),)

            describe("getOrElse", () => {
                test("NaN", () => expect(newInstance().getOrElse(NaN, callback,),)      .toBe(value,),)
                test("-∞",  () => expect(newInstance().getOrElse(-Infinity, callback,),).toBe(value,),)
                test("-2",  () => expect(newInstance().getOrElse(-2, callback,),)       .toBe(value,),)
                test("-1",  () => expect(newInstance().getOrElse(-1, callback,),)       .toBe(value,),)
                test('0',   () => expect(newInstance().getOrElse(0, callback,),)        .toBe(value,),)
                test('1',   () => expect(newInstance().getOrElse(1, callback,),)        .toBe(value,),)
                test("+∞",  () => expect(newInstance().getOrElse(Infinity, callback,),) .toBe(value,),)
            },)
            test("getFirstOrElse", () => expect(newInstance().getFirstOrElse(callback,),).toBe(value,),)
            test("getLastOrElse", () => expect(newInstance().getLastOrElse(callback,),).toBe(value,),)

            describe("getOrNull", () => {
                test("NaN", () => expect(newInstance().getOrNull(NaN,),)      .toBeNull(),)
                test("-∞",  () => expect(newInstance().getOrNull(-Infinity,),).toBeNull(),)
                test("-2",  () => expect(newInstance().getOrNull(-2,),)       .toBeNull(),)
                test("-1",  () => expect(newInstance().getOrNull(-1,),)       .toBeNull(),)
                test('0',   () => expect(newInstance().getOrNull(0,),)        .toBeNull(),)
                test('1',   () => expect(newInstance().getOrNull(1,),)        .toBeNull(),)
                test("+∞",  () => expect(newInstance().getOrNull(Infinity,),) .toBeNull(),)
            },)
            test("getFirstOrNull", () => expect(newInstance().getFirstOrNull(),).toBeNull(),)
            test("getLastOrNull", () => expect(newInstance().getLastOrNull(),).toBeNull(),)

        },)},)
        describe("1 field", () => {
        describe.each(every1Instances,)("%s", ({value: {newInstance, type, isViewer,},},) => {
            /** The instance is a {@link MinimalistAsCollectionHolder} */
            const isMinimalistAdaptor = type === "minimalist adaptor"

            if (!isMinimalistAdaptor && !isViewer)
                describe("get", () => {
                    test("NaN", () => expect(() => newInstance('a',).get(NaN,),)      .toThrow(ForbiddenIndexException,),)
                    test("-∞",  () => expect(() => newInstance('a',).get(-Infinity,),).toThrow(ForbiddenIndexException,),)
                    test("-3",  () => expect(() => newInstance('a',).get(-3,),)       .toThrow(IndexOutOfBoundsException,),)
                    test("-2",  () => expect(() => newInstance('a',).get(-2,),)       .toThrow(IndexOutOfBoundsException,),)
                    test("-1",  () => expect(      newInstance('a',).get(-1,),)       .toBe('a',),)
                    test('0',   () => expect(      newInstance('a',).get(0,),)        .toBe('a',),)
                    test('1',   () => expect(() => newInstance('a',).get(1,),)        .toThrow(IndexOutOfBoundsException,),)
                    test('2',   () => expect(() => newInstance('a',).get(2,),)        .toThrow(IndexOutOfBoundsException,),)
                    test("+∞",  () => expect(() => newInstance('a',).get(Infinity,),) .toThrow(ForbiddenIndexException,),)
                },)
            test("getFirst", () => expect(newInstance('a',).getFirst(),).toBe('a',),)
            test("getLast", () => expect(newInstance('a',).getLast(),).toBe('a',),)

            describe("getOrElse", () => {
                test("NaN", () => expect(newInstance('a',).getOrElse(NaN, callback,),)      .toBe(value,),)
                test("-∞",  () => expect(newInstance('a',).getOrElse(-Infinity, callback,),).toBe(value,),)
                test("-3",  () => expect(newInstance('a',).getOrElse(-3, callback,),)       .toBe(value,),)
                test("-2",  () => expect(newInstance('a',).getOrElse(-2, callback,),)       .toBe(value,),)
                test("-1",  () => expect(newInstance('a',).getOrElse(-1, callbackAsFail0,),).toBe('a',),)
                test('0',   () => expect(newInstance('a',).getOrElse(0, callbackAsFail0,),) .toBe('a',),)
                test('1',   () => expect(newInstance('a',).getOrElse(1, callback,),)        .toBe(value,),)
                test('2',   () => expect(newInstance('a',).getOrElse(2, callback,),)        .toBe(value,),)
                test("+∞",  () => expect(newInstance('a',).getOrElse(Infinity, callback,),) .toBe(value,),)
            },)
            test("getFirstOrElse", () => expect(newInstance('a',).getFirstOrElse(callbackAsFail0,),).toBe('a',),)
            test("getLastOrElse", () => expect(newInstance('a',).getLastOrElse(callbackAsFail0,),).toBe('a',),)

            describe("getOrNull", () => {
                test("NaN", () => expect(newInstance('a',).getOrNull(NaN,),).toBeNull(),)
                test("-∞",  () => expect(newInstance('a',).getOrNull(-Infinity,),).toBeNull(),)
                test("-3",  () => expect(newInstance('a',).getOrNull(-3,),).toBeNull(),)
                test("-2",  () => expect(newInstance('a',).getOrNull(-2,),).toBeNull(),)
                test("-1",  () => expect(newInstance('a',).getOrNull(-1,),).toBe('a',),)
                test('0',   () => expect(newInstance('a',).getOrNull(0,),).toBe('a',),)
                test('1',   () => expect(newInstance('a',).getOrNull(1,),).toBeNull(),)
                test('2',   () => expect(newInstance('a',).getOrNull(2,),).toBeNull(),)
                test("+∞",  () => expect(newInstance('a',).getOrNull(Infinity,),).toBeNull(),)
            },)
            test("getFirstOrNull", () => expect(newInstance('a',).getFirstOrNull(),).toBe('a',),)
            test("getLastOrNull", () => expect(newInstance('a',).getLastOrNull(),).toBe('a',),)
        },)},)
        describe("2 fields", () => {
        describe.each(every2Instances,)("%s", ({value: {newInstance, type, isViewer,},},) => {
            /** The instance is a {@link MinimalistAsCollectionHolder} */
            const isMinimalistAdaptor = type === "minimalist adaptor"

            if (!isMinimalistAdaptor && !isViewer)
                describe("get", () => {
                    test("NaN", () => expect(() => newInstance('a', 'b',).get(NaN,),)      .toThrow(ForbiddenIndexException,),)
                    test("-∞",  () => expect(() => newInstance('a', 'b',).get(-Infinity,),).toThrow(ForbiddenIndexException,),)
                    test("-4",  () => expect(() => newInstance('a', 'b',).get(-4,),)       .toThrow(IndexOutOfBoundsException,),)
                    test("-3",  () => expect(() => newInstance('a', 'b',).get(-3,),)       .toThrow(IndexOutOfBoundsException,),)
                    test("-2",  () => expect(      newInstance('a', 'b',).get(-2,),)       .toBe('a',),)
                    test("-1",  () => expect(      newInstance('a', 'b',).get(-1,),)       .toBe('b',),)
                    test('0',   () => expect(      newInstance('a', 'b',).get(0,),)        .toBe('a',),)
                    test('1',   () => expect(      newInstance('a', 'b',).get(1,),)        .toBe('b',),)
                    test('2',   () => expect(() => newInstance('a', 'b',).get(2,),)        .toThrow(IndexOutOfBoundsException,),)
                    test('3',   () => expect(() => newInstance('a', 'b',).get(3,),)        .toThrow(IndexOutOfBoundsException,),)
                    test("+∞",  () => expect(() => newInstance('a', 'b',).get(Infinity,),) .toThrow(ForbiddenIndexException,),)
                },)
            test("getFirst", () => expect(newInstance('a', 'b',).getFirst(),).toBe('a',),)
            test("getLast", () => expect(newInstance('a', 'b',).getLast(),).toBe('b',),)

            describe("getOrElse", () => {
                test("NaN", () => expect(newInstance('a', 'b',).getOrElse(NaN, callback,),)      .toBe(value,),)
                test("-∞",  () => expect(newInstance('a', 'b',).getOrElse(-Infinity, callback,),).toBe(value,),)
                test("-4",  () => expect(newInstance('a', 'b',).getOrElse(-4, callback,),)       .toBe(value,),)
                test("-3",  () => expect(newInstance('a', 'b',).getOrElse(-3, callback,),)       .toBe(value,),)
                test("-2",  () => expect(newInstance('a', 'b',).getOrElse(-2, callbackAsFail0,),).toBe('a',),)
                test("-1",  () => expect(newInstance('a', 'b',).getOrElse(-1, callbackAsFail0,),).toBe('b',),)
                test('0',   () => expect(newInstance('a', 'b',).getOrElse(0, callbackAsFail0,),) .toBe('a',),)
                test('1',   () => expect(newInstance('a', 'b',).getOrElse(1, callbackAsFail0,),) .toBe('b',),)
                test('2',   () => expect(newInstance('a', 'b',).getOrElse(2, callback,),)        .toBe(value,),)
                test('3',   () => expect(newInstance('a', 'b',).getOrElse(3, callback,),)        .toBe(value,),)
                test("+∞",  () => expect(newInstance('a', 'b',).getOrElse(Infinity, callback,),) .toBe(value,),)
            },)
            test("getFirstOrElse", () => expect(newInstance('a', 'b',).getFirstOrElse(callbackAsFail0,),).toBe('a',),)
            test("getLastOrElse", () => expect(newInstance('a', 'b',).getLastOrElse(callbackAsFail0,),).toBe('b',),)

            describe("getOrNull", () => {
                test("NaN", () => expect(newInstance('a', 'b',).getOrNull(NaN,),)      .toBeNull(),)
                test("-∞",  () => expect(newInstance('a', 'b',).getOrNull(-Infinity,),).toBeNull(),)
                test("-4",  () => expect(newInstance('a', 'b',).getOrNull(-4,),)       .toBeNull(),)
                test("-3",  () => expect(newInstance('a', 'b',).getOrNull(-3,),)       .toBeNull(),)
                test("-2",  () => expect(newInstance('a', 'b',).getOrNull(-2,),)       .toBe('a',),)
                test("-1",  () => expect(newInstance('a', 'b',).getOrNull(-1,),)       .toBe('b',),)
                test('0',   () => expect(newInstance('a', 'b',).getOrNull(0,),)        .toBe('a',),)
                test('1',   () => expect(newInstance('a', 'b',).getOrNull(1,),)        .toBe('b',),)
                test('2',   () => expect(newInstance('a', 'b',).getOrNull(2,),)        .toBeNull(),)
                test('3',   () => expect(newInstance('a', 'b',).getOrNull(3,),)        .toBeNull(),)
                test("+∞",  () => expect(newInstance('a', 'b',).getOrNull(Infinity,),) .toBeNull(),)
            },)
            test("getFirstOrNull", () => expect(newInstance('a', 'b',).getFirstOrNull(),).toBe('a',),)
            test("getLastOrNull", () => expect(newInstance('a', 'b',).getLastOrNull(),).toBe('b',),)
        },)},)
        describe("N fields", () => {
        describe.each(everyNInstances,)("%s", ({value: {instance, type, isViewer,},},) => {
            /** The instance is a {@link MinimalistAsCollectionHolder} */
            const isMinimalistAdaptor = type === "minimalist adaptor"

            if (!isMinimalistAdaptor && !isViewer)
                describe("get", () => {
                    test("NaN", () => expect(() => new instance(ABCD,).get(NaN,),)      .toThrow(ForbiddenIndexException,),)
                    test("-∞",  () => expect(() => new instance(ABCD,).get(-Infinity,),).toThrow(ForbiddenIndexException,),)
                    test("-6",  () => expect(() => new instance(ABCD,).get(-6,),)       .toThrow(IndexOutOfBoundsException,),)
                    test("-5",  () => expect(() => new instance(ABCD,).get(-5,),)       .toThrow(IndexOutOfBoundsException,),)
                    test("-4",  () => expect(      new instance(ABCD,).get(-4,),)       .toBe('a',),)
                    test("-3",  () => expect(      new instance(ABCD,).get(-3,),)       .toBe('b',),)
                    test("-2",  () => expect(      new instance(ABCD,).get(-2,),)       .toBe('c',),)
                    test("-1",  () => expect(      new instance(ABCD,).get(-1,),)       .toBe('d',),)
                    test('0',   () => expect(      new instance(ABCD,).get(0,),)        .toBe('a',),)
                    test('1',   () => expect(      new instance(ABCD,).get(1,),)        .toBe('b',),)
                    test('2',   () => expect(      new instance(ABCD,).get(2,),)        .toBe('c',),)
                    test('3',   () => expect(      new instance(ABCD,).get(3,),)        .toBe('d',),)
                    test('4',   () => expect(() => new instance(ABCD,).get(4,),)        .toThrow(IndexOutOfBoundsException,),)
                    test('5',   () => expect(() => new instance(ABCD,).get(5,),)        .toThrow(IndexOutOfBoundsException,),)
                    test("+∞",  () => expect(() => new instance(ABCD,).get(Infinity,),) .toThrow(ForbiddenIndexException,),)
                },)
            test("getFirst", () => expect(new instance(ABCD,).getFirst(),).toBe('a',),)
            test("getLast", () => expect(new instance(ABCD,).getLast(),).toBe('d',),)

            describe("getOrElse", () => {
                test("NaN", () => expect(new instance(ABCD,).getOrElse(NaN, callback,),)      .toBe(value,),)
                test("-∞",  () => expect(new instance(ABCD,).getOrElse(-Infinity, callback,),).toBe(value,),)
                test("-6",  () => expect(new instance(ABCD,).getOrElse(-6, callback,),)       .toBe(value,),)
                test("-5",  () => expect(new instance(ABCD,).getOrElse(-5, callback,),)       .toBe(value,),)
                test("-4",  () => expect(new instance(ABCD,).getOrElse(-4, callbackAsFail0,),).toBe('a',),)
                test("-3",  () => expect(new instance(ABCD,).getOrElse(-3, callbackAsFail0,),).toBe('b',),)
                test("-2",  () => expect(new instance(ABCD,).getOrElse(-2, callbackAsFail0,),).toBe('c',),)
                test("-1",  () => expect(new instance(ABCD,).getOrElse(-1, callbackAsFail0,),).toBe('d',),)
                test('0',   () => expect(new instance(ABCD,).getOrElse(0, callbackAsFail0,),) .toBe('a',),)
                test('1',   () => expect(new instance(ABCD,).getOrElse(1, callbackAsFail0,),) .toBe('b',),)
                test('2',   () => expect(new instance(ABCD,).getOrElse(2, callbackAsFail0,),) .toBe('c',),)
                test('3',   () => expect(new instance(ABCD,).getOrElse(3, callbackAsFail0,),) .toBe('d',),)
                test('4',   () => expect(new instance(ABCD,).getOrElse(4, callback,),)        .toBe(value,),)
                test('5',   () => expect(new instance(ABCD,).getOrElse(5, callback,),)        .toBe(value,),)
                test("+∞",  () => expect(new instance(ABCD,).getOrElse(Infinity, callback,),) .toBe(value,),)
            },)
            test("getFirstOrElse", () => expect(new instance(ABCD,).getFirstOrElse(callbackAsFail0,),).toBe('a',),)
            test("getLastOrElse", () => expect(new instance(ABCD,).getLastOrElse(callbackAsFail0,),).toBe('d',),)

            describe("getOrNull", () => {
                test("NaN", () => expect(new instance(ABCD,).getOrNull(NaN,),)      .toBeNull(),)
                test("-∞",  () => expect(new instance(ABCD,).getOrNull(-Infinity,),).toBeNull(),)
                test("-6",  () => expect(new instance(ABCD,).getOrNull(-6,),)       .toBeNull(),)
                test("-5",  () => expect(new instance(ABCD,).getOrNull(-5,),)       .toBeNull(),)
                test("-4",  () => expect(new instance(ABCD,).getOrNull(-4,),)       .toBe('a',),)
                test("-3",  () => expect(new instance(ABCD,).getOrNull(-3,),)       .toBe('b',),)
                test("-2",  () => expect(new instance(ABCD,).getOrNull(-2,),)       .toBe('c',),)
                test("-1",  () => expect(new instance(ABCD,).getOrNull(-1,),)       .toBe('d',),)
                test('0',   () => expect(new instance(ABCD,).getOrNull(0,),)        .toBe('a',),)
                test('1',   () => expect(new instance(ABCD,).getOrNull(1,),)        .toBe('b',),)
                test('2',   () => expect(new instance(ABCD,).getOrNull(2,),)        .toBe('c',),)
                test('3',   () => expect(new instance(ABCD,).getOrNull(3,),)        .toBe('d',),)
                test('4',   () => expect(new instance(ABCD,).getOrNull(4,),)        .toBeNull(),)
                test('5',   () => expect(new instance(ABCD,).getOrNull(5,),)        .toBeNull(),)
                test("+∞",  () => expect(new instance(ABCD,).getOrNull(Infinity,),) .toBeNull(),)
            },)
            test("getFirstOrNull", () => expect(new instance(ABCD,).getFirstOrNull(),).toBe('a',),)
            test("getLastOrNull", () => expect(new instance(ABCD,).getLastOrNull(),).toBe('d',),)
        },)},)
    },)

},)

// describe.skip("index", () => {
//     test("empty", () => expect(newInstance(EMPTY,)[0],).toBeUndefined(),)
//     test("0", () => expect(newInstance(AB,)[0],).toBe("a",),)
//     test("3", () => expect(newInstance(AB,)[3],).toBeUndefined(),)
//     test("1", () => expect(newInstance(ABCD,)[1],).toBe("b",),)
//     test("-1", () => expect(newInstance(ABCD,)[-1],).toBeUndefined(),)
//     test("-4", () => expect(newInstance(ABCD,)[-4],).toBeUndefined(),)
//     test("-5", () => expect(newInstance(ABCD,)[-5],).toBeUndefined(),)
//     test("NaN", () => expect(newInstance(AB,)[NaN],).toBeUndefined(),)
//     test("+∞", () => expect(newInstance(AB,)[Infinity],).toBeUndefined(),)
//     test("-∞", () => expect(newInstance(AB,)[-Infinity],).toBeUndefined(),)
// },)
