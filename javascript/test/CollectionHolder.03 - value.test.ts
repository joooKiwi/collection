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

import {CollectionHolder_AdaptorOfArrayFollower}                                                           from "./instance/CollectionHolder_AdaptorOfArray.follower"
import {CollectionHolder_ArrayOf1Follower}                                                                 from "./instance/CollectionHolder_ArrayOf1.follower"
import {CollectionHolder_ArrayOf2Follower}                                                                 from "./instance/CollectionHolder_ArrayOf2.follower"
import {CollectionHolder_1Follower}                                                                        from "./instance/CollectionHolder_1.follower"
import {CollectionHolder_2Follower}                                                                        from "./instance/CollectionHolder_2.follower"
import {CollectionHolder_ByViewerFollower}                                                                 from "./instance/CollectionHolder_ByViewer.follower"
import {CollectionHolder_ByGenericCollectionFollower}                                                      from "./instance/CollectionHolder_ByGenericCollection.follower"
import {CollectionHolder_AdaptorOfIteratorFollower}                                                        from "./instance/CollectionHolder_AdaptorOfIterator.follower"
import {CollectionHolder_AdaptorOfJsIteratorFollower}                                                      from "./instance/CollectionHolder_AdaptorOfJsIterator.follower"
import {CollectionHolder_AdaptorOfJsIterableFollower}                                                      from "./instance/CollectionHolder_AdaptorOfJsIterable.follower"
import {CollectionHolder_LazyFollower}                                                                     from "./instance/CollectionHolder_Lazy.follower"
import {CollectionHolder_LazyOf0Or1Follower}                                                               from "./instance/CollectionHolder_LazyOf0Or1.follower"
import {CollectionHolder_LazyOf0Or1Or2Follower}                                                            from "./instance/CollectionHolder_LazyOf0Or1Or2.follower"
import {CollectionHolder_LazyOf1Follower}                                                                  from "./instance/CollectionHolder_LazyOf1.follower"
import {CollectionHolder_LazyOf1Or2Follower}                                                               from "./instance/CollectionHolder_LazyOf1Or2.follower"
import {CollectionHolder_LazyOf2Follower}                                                                  from "./instance/CollectionHolder_LazyOf2.follower"
import {CollectionHolder_AdaptorOfMinimalistFollower}                                                      from "./instance/CollectionHolder_AdaptorOfMinimalist.follower"
import {CollectionHolder_AdaptorOfSetFollower}                                                             from "./instance/CollectionHolder_AdaptorOfSet.follower"
import {CollectionHolder_SetOf1Follower}                                                                   from "./instance/CollectionHolder_SetOf1.follower"
import {CollectionHolder_SetOf2Follower}                                                                   from "./instance/CollectionHolder_SetOf2.follower"
import {CollectionHolderFromArray}                                                                         from "./instance/CollectionHolderFromArray"
import {MinimalistCollectionHolderFromArray}                                                               from "./instance/MinimalistCollectionHolderFromArray"
import {A, ABCD}                                                                                           from "./value/arrays"
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

    describe("instances", () => {
    describe.each(everyInstances,)("%s", ({value: {instance, isMinimalist, type,},},) => {
        /** The instance is a {@link GenericCollectionHolder} */
        const isNormal = type === "normal"

        describe("get() being called", () => {
            describe("get", () => {
                test("empty",    () => expect(new instance(EMPTY,).executeWhileExpectingEmptyException(it => it.get(0,),).amountOfCall,).toBe(isNormal ? 0 : 1,),)
                test("1 field",  () => expect(new instance(A,).execute(it => it.get(0,),).amountOfCall,).toBe(1,),)
                test("2 fields", () => expect(new instance(AB,).execute(it => it.get(0,),).amountOfCall,).toBe(1,),)
                test("4 fields", () => expect(new instance(ABCD,).execute(it => it.get(0,),).amountOfCall,).toBe(1,),)
            },)
            describe("getFirst", () => {
                test("empty",    () => expect(new instance(EMPTY,).executeWhileExpectingEmptyException(it => it.getFirst(),).amountOfCall,).toBe(0,),)
                test("1 field",  () => expect(new instance(A,).execute(it => it.getFirst(),).amountOfCall,).toBe(1,),)
                test("2 fields", () => expect(new instance(AB,).execute(it => it.getFirst(),).amountOfCall,).toBe(1,),)
                test("4 fields", () => expect(new instance(ABCD,).execute(it => it.getFirst(),).amountOfCall,).toBe(1,),)
            },)
            describe("getLast", () => {
                test("empty",    () => expect(new instance(EMPTY,).executeWhileExpectingEmptyException(it => it.getLast(),).amountOfCall,).toBe(0,),)
                test("1 field",  () => expect(new instance(A,).execute(it => it.getLast(),).amountOfCall,).toBe(1,),)
                test("2 fields", () => expect(new instance(AB,).execute(it => it.getLast(),).amountOfCall,).toBe(1,),)
                test("4 fields", () => expect(new instance(ABCD,).execute(it => it.getLast(),).amountOfCall,).toBe(1,),)
            },)

            describe("getOrElse", () => {
                test("empty",    () => expect(new instance(EMPTY,).execute(it => it.getOrElse(0, callback,),).amountOfCall,).toBe(0,),)
                test("1 field",  () => expect(new instance(A,).execute(it => it.getOrElse(0, callbackAsFail0,),).amountOfCall,).toBe(isMinimalist || isNormal ? 1 : 0,),)
                test("2 fields", () => expect(new instance(AB,).execute(it => it.getOrElse(0, callbackAsFail0,),).amountOfCall,).toBe(isMinimalist || isNormal ? 1 : 0,),)
                test("4 fields", () => expect(new instance(ABCD,).execute(it => it.getOrElse(0, callbackAsFail0,),).amountOfCall,).toBe(isMinimalist || isNormal ? 1 : 0,),)
            },)
            describe("getFirstOrElse", () => {
                test("empty",    () => expect(new instance(EMPTY,).execute(it => it.getFirstOrElse(callback,),).amountOfCall,).toBe(0,),)
                test("1 field",  () => expect(new instance(A,).execute(it => it.getFirstOrElse(callbackAsFail0,),).amountOfCall,).toBe(1,),)
                test("2 fields", () => expect(new instance(AB,).execute(it => it.getFirstOrElse(callbackAsFail0,),).amountOfCall,).toBe(1,),)
                test("4 fields", () => expect(new instance(ABCD,).execute(it => it.getFirstOrElse( callbackAsFail0,),).amountOfCall,).toBe(1,),)
            },)
            describe("getLastOrElse", () => {
                test("empty",    () => expect(new instance(EMPTY,).execute(it => it.getLastOrElse(callback,),).amountOfCall,).toBe(0,),)
                test("1 field",  () => expect(new instance(A,).execute(it => it.getLastOrElse(callbackAsFail0,),).amountOfCall,).toBe(1,),)
                test("2 fields", () => expect(new instance(AB,).execute(it => it.getLastOrElse(callbackAsFail0,),).amountOfCall,).toBe(1,),)
                test("4 fields", () => expect(new instance(ABCD,).execute(it => it.getLastOrElse( callbackAsFail0,),).amountOfCall,).toBe(1,),)
            },)

            describe("getOrNull", () => {
                test("empty",    () => expect(new instance(EMPTY,).execute(it => it.getOrNull(0,),).amountOfCall,).toBe(0,),)
                test("1 field",  () => expect(new instance(A,).execute(it => it.getOrNull(0,),).amountOfCall,).toBe(isMinimalist || isNormal ? 1 : 0,),)
                test("2 fields", () => expect(new instance(AB,).execute(it => it.getOrNull(0,),).amountOfCall,).toBe(isMinimalist || isNormal ? 1 : 0,),)
                test("4 fields", () => expect(new instance(ABCD,).execute(it => it.getOrNull(0,),).amountOfCall,).toBe(isMinimalist || isNormal ? 1 : 0,),)
            },)
            describe("getFirstOrNull", () => {
                test("empty",    () => expect(new instance(EMPTY,).execute(it => it.getFirstOrNull(),).amountOfCall,).toBe(0,),)
                test("1 field",  () => expect(new instance(A,).execute(it => it.getFirstOrNull(),).amountOfCall,).toBe(1,),)
                test("2 fields", () => expect(new instance(AB,).execute(it => it.getFirstOrNull(),).amountOfCall,).toBe(1,),)
                test("4 fields", () => expect(new instance(ABCD,).execute(it => it.getFirstOrNull(),).amountOfCall,).toBe(1,),)
            },)
            describe("getLastOrNull", () => {
                test("empty",    () => expect(new instance(EMPTY,).execute(it => it.getLastOrNull(),).amountOfCall,).toBe(0,),)
                test("1 field",  () => expect(new instance(A,).execute(it => it.getLastOrNull(),).amountOfCall,).toBe(1,),)
                test("2 fields", () => expect(new instance(AB,).execute(it => it.getLastOrNull(),).amountOfCall,).toBe(1,),)
                test("4 fields", () => expect(new instance(ABCD,).execute(it => it.getLastOrNull(),).amountOfCall,).toBe(1,),)

            },)
        },)

        describe("get", () => {
            describe("empty", () => {
                test("NaN", () => expect(() => new instance(EMPTY,).get(NaN,),).toThrow(EmptyCollectionException,),)
                test("-∞",  () => expect(() => new instance(EMPTY,).get(-Infinity,),).toThrow(EmptyCollectionException,),)
                test("-2",  () => expect(() => new instance(EMPTY,).get(-2,),).toThrow(EmptyCollectionException,),)
                test("-1",  () => expect(() => new instance(EMPTY,).get(-1,),).toThrow(EmptyCollectionException,),)
                test('0',   () => expect(() => new instance(EMPTY,).get(0,),).toThrow(EmptyCollectionException,),)
                test('1',   () => expect(() => new instance(EMPTY,).get(1,),).toThrow(EmptyCollectionException,),)
                test("+∞",  () => expect(() => new instance(EMPTY,).get(Infinity,),).toThrow(EmptyCollectionException,),)
            },)
            describe("1 field", () => {
                test("NaN", () => expect(() => new instance(A,).get(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(() => new instance(A,).get(-Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-3",  () => expect(() => new instance(A,).get(-3,),).toThrow(IndexOutOfBoundsException,),)
                test("-2",  () => expect(() => new instance(A,).get(-2,),).toThrow(IndexOutOfBoundsException,),)
                test("-1",  () => expect(new instance(A,).get(-1,),).toBe('a',),)
                test('0',   () => expect(new instance(A,).get(0,),).toBe('a',),)
                test('1',   () => expect(() => new instance(A,).get(1,),).toThrow(IndexOutOfBoundsException,),)
                test('2',   () => expect(() => new instance(A,).get(2,),).toThrow(IndexOutOfBoundsException,),)
                test("+∞",  () => expect(() => new instance(A,).get(Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("2 fields", () => {
                test("NaN", () => expect(() => new instance(AB,).get(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(() => new instance(AB,).get(-Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-4",  () => expect(() => new instance(AB,).get(-4,),).toThrow(IndexOutOfBoundsException,),)
                test("-3",  () => expect(() => new instance(AB,).get(-3,),).toThrow(IndexOutOfBoundsException,),)
                test("-2",  () => expect(new instance(AB,).get(-2,),).toBe('a',),)
                test("-1",  () => expect(new instance(AB,).get(-1,),).toBe('b',),)
                test('0',   () => expect(new instance(AB,).get(0,),).toBe('a',),)
                test('1',   () => expect(new instance(AB,).get(1,),).toBe('b',),)
                test('2',   () => expect(() => new instance(AB,).get(2,),).toThrow(IndexOutOfBoundsException,),)
                test('3',   () => expect(() => new instance(AB,).get(3,),).toThrow(IndexOutOfBoundsException,),)
                test("+∞",  () => expect(() => new instance(AB,).get(Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
            describe("4 fields", () => {
                test("NaN", () => expect(() => new instance(ABCD,).get(NaN,),).toThrow(ForbiddenIndexException,),)
                test("-∞",  () => expect(() => new instance(ABCD,).get(-Infinity,),).toThrow(ForbiddenIndexException,),)
                test("-6",  () => expect(() => new instance(ABCD,).get(-6,),).toThrow(IndexOutOfBoundsException,),)
                test("-5",  () => expect(() => new instance(ABCD,).get(-5,),).toThrow(IndexOutOfBoundsException,),)
                test("-4",  () => expect(new instance(ABCD,).get(-4,),).toBe('a',),)
                test("-3",  () => expect(new instance(ABCD,).get(-3,),).toBe('b',),)
                test("-2",  () => expect(new instance(ABCD,).get(-2,),).toBe('c',),)
                test("-1",  () => expect(new instance(ABCD,).get(-1,),).toBe('d',),)
                test('0',   () => expect(new instance(ABCD,).get(0,),).toBe('a',),)
                test('1',   () => expect(new instance(ABCD,).get(1,),).toBe('b',),)
                test('2',   () => expect(new instance(ABCD,).get(2,),).toBe('c',),)
                test('3',   () => expect(new instance(ABCD,).get(3,),).toBe('d',),)
                test('4',   () => expect(() => new instance(ABCD,).get(4,),).toThrow(IndexOutOfBoundsException,),)
                test('5',   () => expect(() => new instance(ABCD,).get(5,),).toThrow(IndexOutOfBoundsException,),)
                test("+∞",  () => expect(() => new instance(ABCD,).get(Infinity,),).toThrow(ForbiddenIndexException,),)
            },)
        },)
        describe("getFirst", () => {
            test("empty",    () => expect(() => new instance(EMPTY,).getFirst(),).toThrow(EmptyCollectionException,),)
            test("1 field",  () => expect(new instance(A,).getFirst(),).toBe('a',),)
            test("2 fields", () => expect(new instance(AB,).getFirst(),).toBe('a',),)
            test("4 fields", () => expect(new instance(ABCD,).getFirst(),).toBe('a',),)
        },)
        describe("getLast", () => {
            test("empty",    () => expect(() => new instance(EMPTY,).getLast(),).toThrow(EmptyCollectionException,),)
            test("1 field",  () => expect(new instance(A,).getLast(),).toBe('a',),)
            test("2 fields", () => expect(new instance(AB,).getLast(),).toBe('b',),)
            test("4 fields", () => expect(new instance(ABCD,).getLast(),).toBe('d',),)
        },)

        describe("getOrElse", () => {
            describe("empty", () => {
                test("NaN", () => expect(new instance(EMPTY,).getOrElse(NaN, callback,),).toBe(value,),)
                test("-∞",  () => expect(new instance(EMPTY,).getOrElse(-Infinity, callback,),).toBe(value,),)
                test("-2",  () => expect(new instance(EMPTY,).getOrElse(-2, callback,),).toBe(value,),)
                test("-1",  () => expect(new instance(EMPTY,).getOrElse(-1, callback,),).toBe(value,),)
                test('0',   () => expect(new instance(EMPTY,).getOrElse(0, callback,),).toBe(value,),)
                test('1',   () => expect(new instance(EMPTY,).getOrElse(1, callback,),).toBe(value,),)
                test("+∞",  () => expect(new instance(EMPTY,).getOrElse(Infinity, callback,),).toBe(value,),)
            },)
            describe("1 field", () => {
                test("NaN", () => expect(new instance(A,).getOrElse(NaN, callback,),).toBe(value,),)
                test("-∞",  () => expect(new instance(A,).getOrElse(-Infinity, callback,),).toBe(value,),)
                test("-3",  () => expect(new instance(A,).getOrElse(-3, callback,),).toBe(value,),)
                test("-2",  () => expect(new instance(A,).getOrElse(-2, callback,),).toBe(value,),)
                test("-1",  () => expect(new instance(A,).getOrElse(-1, callbackAsFail0,),).toBe('a',),)
                test('0',   () => expect(new instance(A,).getOrElse(0, callbackAsFail0,),).toBe('a',),)
                test('1',   () => expect(new instance(A,).getOrElse(1, callback,),).toBe(value,),)
                test('2',   () => expect(new instance(A,).getOrElse(2, callback,),).toBe(value,),)
                test("+∞",  () => expect(new instance(A,).getOrElse(Infinity, callback,),).toBe(value,),)
            },)
            describe("2 fields", () => {
                test("NaN", () => expect(new instance(AB,).getOrElse(NaN, callback,),).toBe(value,),)
                test("-∞",  () => expect(new instance(AB,).getOrElse(-Infinity, callback,),).toBe(value,),)
                test("-4",  () => expect(new instance(AB,).getOrElse(-4, callback,),).toBe(value,),)
                test("-3",  () => expect(new instance(AB,).getOrElse(-3, callback,),).toBe(value,),)
                test("-2",  () => expect(new instance(AB,).getOrElse(-2, callbackAsFail0,),).toBe('a',),)
                test("-1",  () => expect(new instance(AB,).getOrElse(-1, callbackAsFail0,),).toBe('b',),)
                test('0',   () => expect(new instance(AB,).getOrElse(0, callbackAsFail0,),).toBe('a',),)
                test('1',   () => expect(new instance(AB,).getOrElse(1, callbackAsFail0,),).toBe('b',),)
                test('2',   () => expect(new instance(AB,).getOrElse(2, callback,),).toBe(value,),)
                test('3',   () => expect(new instance(AB,).getOrElse(3, callback,),).toBe(value,),)
                test("+∞",  () => expect(new instance(AB,).getOrElse(Infinity, callback,),).toBe(value,),)
            },)
            describe("4 fields", () => {
                test("NaN", () => expect(new instance(ABCD,).getOrElse(NaN, callback,),).toBe(value,),)
                test("-∞",  () => expect(new instance(ABCD,).getOrElse(-Infinity, callback,),).toBe(value,),)
                test("-6",  () => expect(new instance(ABCD,).getOrElse(-6, callback,),).toBe(value,),)
                test("-5",  () => expect(new instance(ABCD,).getOrElse(-5, callback,),).toBe(value,),)
                test("-4",  () => expect(new instance(ABCD,).getOrElse(-4, callbackAsFail0,),).toBe('a',),)
                test("-3",  () => expect(new instance(ABCD,).getOrElse(-3, callbackAsFail0,),).toBe('b',),)
                test("-2",  () => expect(new instance(ABCD,).getOrElse(-2, callbackAsFail0,),).toBe('c',),)
                test("-1",  () => expect(new instance(ABCD,).getOrElse(-1, callbackAsFail0,),).toBe('d',),)
                test('0',   () => expect(new instance(ABCD,).getOrElse(0, callbackAsFail0,),).toBe('a',),)
                test('1',   () => expect(new instance(ABCD,).getOrElse(1, callbackAsFail0,),).toBe('b',),)
                test('2',   () => expect(new instance(ABCD,).getOrElse(2, callbackAsFail0,),).toBe('c',),)
                test('3',   () => expect(new instance(ABCD,).getOrElse(3, callbackAsFail0,),).toBe('d',),)
                test('4',   () => expect(new instance(ABCD,).getOrElse(4, callback,),).toBe(value,),)
                test('5',   () => expect(new instance(ABCD,).getOrElse(5, callback,),).toBe(value,),)
                test("+∞",  () => expect(new instance(ABCD,).getOrElse(Infinity, callback,),).toBe(value,),)
            },)
        },)
        describe("getFirstOrElse", () => {
            test("empty",    () => expect(new instance(EMPTY,).getFirstOrElse(callback,),).toBe(value,),)
            test("1 field",  () => expect(new instance(A,).getFirstOrElse(callbackAsFail0,),).toBe('a',),)
            test("2 fields", () => expect(new instance(AB,).getFirstOrElse(callbackAsFail0,),).toBe('a',),)
            test("4 fields", () => expect(new instance(ABCD,).getFirstOrElse(callbackAsFail0,),).toBe('a',),)
        },)
        describe("getLastOrElse", () => {
            test("empty",    () => expect(new instance(EMPTY,).getLastOrElse(callback,),).toBe(value,),)
            test("1 field",  () => expect(new instance(A,).getLastOrElse(callbackAsFail0,),).toBe('a',),)
            test("2 fields", () => expect(new instance(AB,).getLastOrElse(callbackAsFail0,),).toBe('b',),)
            test("4 fields", () => expect(new instance(ABCD,).getLastOrElse(callbackAsFail0,),).toBe('d',),)
        },)

        describe("getOrNull", () => {
            describe("empty", () => {
                test("NaN", () => expect(new instance(EMPTY,).getOrNull(NaN,),).toBeNull(),)
                test("-∞",  () => expect(new instance(EMPTY,).getOrNull(-Infinity,),).toBeNull(),)
                test("-2",  () => expect(new instance(EMPTY,).getOrNull(-2,),).toBeNull(),)
                test("-1",  () => expect(new instance(EMPTY,).getOrNull(-1,),).toBeNull(),)
                test('0',   () => expect(new instance(EMPTY,).getOrNull(0,),).toBeNull(),)
                test('1',   () => expect(new instance(EMPTY,).getOrNull(1,),).toBeNull(),)
                test("+∞",  () => expect(new instance(EMPTY,).getOrNull(Infinity,),).toBeNull(),)
            },)
            describe("1 field", () => {
                test("NaN", () => expect(new instance(A,).getOrNull(NaN,),).toBeNull(),)
                test("-∞",  () => expect(new instance(A,).getOrNull(-Infinity,),).toBeNull(),)
                test("-3",  () => expect(new instance(A,).getOrNull(-3,),).toBeNull(),)
                test("-2",  () => expect(new instance(A,).getOrNull(-2,),).toBeNull(),)
                test("-1",  () => expect(new instance(A,).getOrNull(-1,),).toBe('a',),)
                test('0',   () => expect(new instance(A,).getOrNull(0,),).toBe('a',),)
                test('1',   () => expect(new instance(A,).getOrNull(1,),).toBeNull(),)
                test('2',   () => expect(new instance(A,).getOrNull(2,),).toBeNull(),)
                test("+∞",  () => expect(new instance(A,).getOrNull(Infinity,),).toBeNull(),)
            },)
            describe("2 fields", () => {
                test("NaN", () => expect(new instance(AB,).getOrNull(NaN,),).toBeNull(),)
                test("-∞",  () => expect(new instance(AB,).getOrNull(-Infinity,),).toBeNull(),)
                test("-4",  () => expect(new instance(AB,).getOrNull(-4,),).toBeNull(),)
                test("-3",  () => expect(new instance(AB,).getOrNull(-3,),).toBeNull(),)
                test("-2",  () => expect(new instance(AB,).getOrNull(-2,),).toBe('a',),)
                test("-1",  () => expect(new instance(AB,).getOrNull(-1,),).toBe('b',),)
                test('0',   () => expect(new instance(AB,).getOrNull(0,),).toBe('a',),)
                test('1',   () => expect(new instance(AB,).getOrNull(1,),).toBe('b',),)
                test('2',   () => expect(new instance(AB,).getOrNull(2,),).toBeNull(),)
                test('3',   () => expect(new instance(AB,).getOrNull(3,),).toBeNull(),)
                test("+∞",  () => expect(new instance(AB,).getOrNull(Infinity,),).toBeNull(),)
            },)
            describe("4 fields", () => {
                test("NaN", () => expect(new instance(ABCD,).getOrNull(NaN,),).toBeNull(),)
                test("-∞",  () => expect(new instance(ABCD,).getOrNull(-Infinity,),).toBeNull(),)
                test("-6",  () => expect(new instance(ABCD,).getOrNull(-6,),).toBeNull(),)
                test("-5",  () => expect(new instance(ABCD,).getOrNull(-5,),).toBeNull(),)
                test("-4",  () => expect(new instance(ABCD,).getOrNull(-4,),).toBe('a',),)
                test("-3",  () => expect(new instance(ABCD,).getOrNull(-3,),).toBe('b',),)
                test("-2",  () => expect(new instance(ABCD,).getOrNull(-2,),).toBe('c',),)
                test("-1",  () => expect(new instance(ABCD,).getOrNull(-1,),).toBe('d',),)
                test('0',   () => expect(new instance(ABCD,).getOrNull(0,),).toBe('a',),)
                test('1',   () => expect(new instance(ABCD,).getOrNull(1,),).toBe('b',),)
                test('2',   () => expect(new instance(ABCD,).getOrNull(2,),).toBe('c',),)
                test('3',   () => expect(new instance(ABCD,).getOrNull(3,),).toBe('d',),)
                test('4',   () => expect(new instance(ABCD,).getOrNull(4,),).toBeNull(),)
                test('5',   () => expect(new instance(ABCD,).getOrNull(5,),).toBeNull(),)
                test("+∞",  () => expect(new instance(ABCD,).getOrNull(Infinity,),).toBeNull(),)
            },)
        },)
        describe("getFirstOrNull", () => {
            test("empty",    () => expect(new instance(EMPTY,).getFirstOrNull(),).toBeNull(),)
            test("1 field",  () => expect(new instance(A,).getFirstOrNull(),).toBe('a',),)
            test("2 fields", () => expect(new instance(AB,).getFirstOrNull(),).toBe('a',),)
            test("4 fields", () => expect(new instance(ABCD,).getFirstOrNull(),).toBe('a',),)
        },)
        describe("getLastOrNull", () => {
            test("empty",    () => expect(new instance(EMPTY,).getLastOrNull(),).toBeNull(),)
            test("1 field",  () => expect(new instance(A,).getLastOrNull(),).toBe('a',),)
            test("2 fields", () => expect(new instance(AB,).getLastOrNull(),).toBe('b',),)
            test("4 fields", () => expect(new instance(ABCD,).getLastOrNull(),).toBe('d',),)
        },)
    },)},)

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
