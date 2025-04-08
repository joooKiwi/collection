//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import {CollectionHolderFromArray}                                      from "./instance/CollectionHolderFromArray"
import {EmptyCollectionHolderForTest}                                   from "./instance/EmptyCollectionHolderForTest"
import {GenericCollectionHolder_GetAlias}                               from "./instance/GenericCollectionHolder_GetAlias"
import {GenericCollectionHolder_GetFirstAlias}                          from "./instance/GenericCollectionHolder_GetFirstAlias"
import {GenericCollectionHolder_GetFirstOrNullAlias}                    from "./instance/GenericCollectionHolder_GetFirstOrNullAlias"
import {GenericCollectionHolder_GetLastAlias}                           from "./instance/GenericCollectionHolder_GetLastAlias"
import {GenericCollectionHolder_GetLastOrNullAlias}                     from "./instance/GenericCollectionHolder_GetLastOrNullAlias"
import {GenericCollectionHolder_GetOrElseAlias}                         from "./instance/GenericCollectionHolder_GetOrElseAlias"
import {GenericCollectionHolder_GetOrNullAlias}                         from "./instance/GenericCollectionHolder_GetOrNullAlias"
import {LazyGenericCollectionHolder_GetAlias}                           from "./instance/LazyGenericCollectionHolder_GetAlias"
import {LazyGenericCollectionHolder_GetFirstAlias}                      from "./instance/LazyGenericCollectionHolder_GetFirstAlias"
import {LazyGenericCollectionHolder_GetFirstOrNullAlias}                from "./instance/LazyGenericCollectionHolder_GetFirstOrNullAlias"
import {LazyGenericCollectionHolder_GetLastAlias}                       from "./instance/LazyGenericCollectionHolder_GetLastAlias"
import {LazyGenericCollectionHolder_GetLastOrNullAlias}                 from "./instance/LazyGenericCollectionHolder_GetLastOrNullAlias"
import {LazyGenericCollectionHolder_GetOrElseAlias}                     from "./instance/LazyGenericCollectionHolder_GetOrElseAlias"
import {LazyGenericCollectionHolder_GetOrNullAlias}                     from "./instance/LazyGenericCollectionHolder_GetOrNullAlias"
import {A, AB, ABCD, EMPTY, NULL_UNDEFINED}                             from "./value/arrays"
import {callbackAsFail0}                                                from "./value/callbacks (fail)"
import {callbackAsNull0}                                                from "./value/callbacks (null)"
import {everyCollectionInstancesAndExtensionFunctionAsCollectionHolder} from "./value/instances"

import {EmptyCollectionException}                                                                                                            from "../src/exception/EmptyCollectionException"
import {ForbiddenIndexException}                                                                                                             from "../src/exception/ForbiddenIndexException"
import {IndexOutOfBoundsException}                                                                                                           from "../src/exception/IndexOutOfBoundsException"
import {NullCollectionException}                                                                                                             from "../src/exception/NullCollectionException"
import {atOrElse, atOrElseByArray, atOrElseByCollectionHolder, atOrElseByMinimalistCollectionHolder}                                         from "../src/method/atOrElse"
import {atOrNull, atOrNullByArray, atOrNullByCollectionHolder, atOrNullByMinimalistCollectionHolder}                                         from "../src/method/atOrNull"
import {elementAtOrElse, elementAtOrElseByArray, elementAtOrElseByCollectionHolder, elementAtOrElseByMinimalistCollectionHolder}             from "../src/method/elementAtOrElse"
import {elementAtOrNull, elementAtOrNullByArray, elementAtOrNullByCollectionHolder, elementAtOrNullByMinimalistCollectionHolder}             from "../src/method/elementAtOrNull"
import {first, firstByArray, firstByCollectionHolder, firstByMinimalistCollectionHolder}                                                     from "../src/method/first"
import {firstIndexed, firstIndexedByArray, firstIndexedByCollectionHolder, firstIndexedByMinimalistCollectionHolder}                         from "../src/method/firstIndexed"
import {firstIndexedOrNull, firstIndexedOrNullByArray, firstIndexedOrNullByCollectionHolder, firstIndexedOrNullByMinimalistCollectionHolder} from "../src/method/firstIndexedOrNull"
import {firstOrNull, firstOrNullByArray, firstOrNullByCollectionHolder, firstOrNullByMinimalistCollectionHolder}                             from "../src/method/firstOrNull"
import * as getFirstModule                                                                                                                   from "../src/method/getFirst"
import {getFirst, getFirstByArray, getFirstByCollectionHolder, getFirstByMinimalistCollectionHolder}                                         from "../src/method/getFirst"
import * as getFirstOrNullModule                                                                                                             from "../src/method/getFirstOrNull"
import {getFirstOrElse, getFirstOrElseByArray, getFirstOrElseByCollectionHolder, getFirstOrElseByMinimalistCollectionHolder}                 from "../src/method/getFirstOrElse"
import {getFirstOrNull, getFirstOrNullByArray, getFirstOrNullByCollectionHolder, getFirstOrNullByMinimalistCollectionHolder}                 from "../src/method/getFirstOrNull"
import * as getLastModule                                                                                                                    from "../src/method/getLast"
import {getLast, getLastByArray, getLastByCollectionHolder, getLastByMinimalistCollectionHolder}                                             from "../src/method/getLast"
import * as getLastOrNullModule                                                                                                              from "../src/method/getLastOrNull"
import {getLastOrElse, getLastOrElseByArray, getLastOrElseByCollectionHolder, getLastOrElseByMinimalistCollectionHolder}                     from "../src/method/getLastOrElse"
import {getLastOrNull, getLastOrNullByArray, getLastOrNullByCollectionHolder, getLastOrNullByMinimalistCollectionHolder}                     from "../src/method/getLastOrNull"
import * as getOrElseModule                                                                                                                  from "../src/method/getOrElse"
import {getOrElse, getOrElseByArray, getOrElseByCollectionHolder, getOrElseByMinimalistCollectionHolder}                                     from "../src/method/getOrElse"
import * as getOrNullModule                                                                                                                  from "../src/method/getOrNull"
import {getOrNull, getOrNullByArray, getOrNullByCollectionHolder, getOrNullByMinimalistCollectionHolder}                                     from "../src/method/getOrNull"
import {last, lastByArray, lastByCollectionHolder, lastByMinimalistCollectionHolder}                                                         from "../src/method/last"
import {lastIndexed, lastIndexedByArray, lastIndexedByCollectionHolder, lastIndexedByMinimalistCollectionHolder}                             from "../src/method/lastIndexed"
import {lastIndexedOrNull, lastIndexedOrNullByArray, lastIndexedOrNullByCollectionHolder, lastIndexedOrNullByMinimalistCollectionHolder}     from "../src/method/lastIndexedOrNull"
import {lastOrNull, lastOrNullByArray, lastOrNullByCollectionHolder, lastOrNullByMinimalistCollectionHolder}                                 from "../src/method/lastOrNull"

describe("CollectionHolderTest (value)", () => {
    //#region -------------------- Callbacks --------------------

    const value = Symbol()
    const callback = () => value

    //#endregion -------------------- Callbacks --------------------

    describe("EmptyCollectionHolder", () => {
        test("get",                 () => expect(() => new EmptyCollectionHolderForTest().get(),).toThrow(EmptyCollectionException,),)
        test("getFirst",            () => expect(() => new EmptyCollectionHolderForTest().getFirst(),).toThrow(EmptyCollectionException,),)
        test("first",               () => expect(() => new EmptyCollectionHolderForTest().first(),).toThrow(EmptyCollectionException,),)
        test("firstIndexed",        () => expect(() => new EmptyCollectionHolderForTest().firstIndexed(),).toThrow(EmptyCollectionException,),)
        test("getLast",             () => expect(() => new EmptyCollectionHolderForTest().getLast(),).toThrow(EmptyCollectionException,),)
        test("last",                () => expect(() => new EmptyCollectionHolderForTest().last(),).toThrow(EmptyCollectionException,),)
        test("lastIndexed",         () => expect(() => new EmptyCollectionHolderForTest().lastIndexed(),).toThrow(EmptyCollectionException,),)
        test("at",                  () => expect(() => new EmptyCollectionHolderForTest().at(),).toThrow(EmptyCollectionException,),)
        test("elementAt",           () => expect(() => new EmptyCollectionHolderForTest().elementAt(),).toThrow(EmptyCollectionException,),)
        test("getOrElse",           () => expect(new EmptyCollectionHolderForTest().getOrElse(NaN, it => it,),).toBeNaN(),)
        test("atOrElse",            () => expect(new EmptyCollectionHolderForTest().atOrElse(NaN, it => it,),).toBeNaN(),)
        test("elementAtOrElse",     () => expect(new EmptyCollectionHolderForTest().elementAtOrElse(NaN, it => it,),).toBeNaN(),)
        test("getOrNull",           () => expect(new EmptyCollectionHolderForTest().getOrNull(),).toBeNull(),)
        test("getFirstOrNull",      () => expect(new EmptyCollectionHolderForTest().getFirstOrNull(),).toBeNull(),)
        test("getFirstOrElse",      () => expect(new EmptyCollectionHolderForTest().getFirstOrElse(it => it,),).toBe(0,),)
        test("firstOrNull",         () => expect(new EmptyCollectionHolderForTest().firstOrNull(),).toBeNull(),)
        test("firstIndexedOrNull",  () => expect(new EmptyCollectionHolderForTest().firstIndexedOrNull(),).toBeNull(),)
        test("getLastOrNull",       () => expect(new EmptyCollectionHolderForTest().getLastOrNull(),).toBeNull(),)
        test("getLastOrElse",       () => expect(new EmptyCollectionHolderForTest().getLastOrElse(it => it,),).toBe(-1,),)
        test("lastOrNull",          () => expect(new EmptyCollectionHolderForTest().lastOrNull(),).toBeNull(),)
        test("lastIndexedOrNull",   () => expect(new EmptyCollectionHolderForTest().lastIndexedOrNull(),).toBeNull(),)
        test("atOrNull",            () => expect(new EmptyCollectionHolderForTest().atOrNull(),).toBeNull(),)
        test("elementAtOrNull",     () => expect(new EmptyCollectionHolderForTest().elementAtOrNull(),).toBeNull(),)
    },)

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("first",              () => expect(new GenericCollectionHolder_GetFirstAlias().execute(it => it.first(),).amountOfCall,).toBe(1,),)
            test("firstOrNull",        () => expect(new GenericCollectionHolder_GetFirstOrNullAlias().execute(it => it.firstOrNull(),).amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new GenericCollectionHolder_GetFirstAlias().execute(it => it.firstIndexed(),).amountOfCall,).toBe(1,),)
            test("firstIndexedOrNull", () => expect(new GenericCollectionHolder_GetFirstOrNullAlias().execute(it => it.firstIndexedOrNull(),).amountOfCall,).toBe(1,),)
            test("last",               () => expect(new GenericCollectionHolder_GetLastAlias().execute(it => it.last(),).amountOfCall,).toBe(1,),)
            test("lastOrNull",         () => expect(new GenericCollectionHolder_GetLastOrNullAlias().execute(it => it.lastOrNull(),).amountOfCall,).toBe(1,),)
            test("lastIndexed",        () => expect(new GenericCollectionHolder_GetLastAlias().execute(it => it.lastIndexed(),).amountOfCall,).toBe(1,),)
            test("lastOrNull",         () => expect(new GenericCollectionHolder_GetLastOrNullAlias().execute(it => it.lastIndexedOrNull(),).amountOfCall,).toBe(1,),)
            test("at",                 () => expect(new GenericCollectionHolder_GetAlias().execute(it => it.at(2,),).amountOfCall,).toBe(1,),)
            test("atOrElse",           () => expect(new GenericCollectionHolder_GetOrElseAlias().execute(it => it.atOrElse(NaN, callbackAsNull0,),).amountOfCall,).toBe(1,),)
            test("atOrNull",           () => expect(new GenericCollectionHolder_GetOrNullAlias().execute(it => it.atOrNull(NaN,),).amountOfCall,).toBe(1,),)
            test("elementAt",          () => expect(new GenericCollectionHolder_GetAlias().execute(it => it.elementAt(2,),).amountOfCall,).toBe(1,),)
            test("elementAtOrElse",    () => expect(new GenericCollectionHolder_GetOrElseAlias().execute(it => it.elementAtOrElse(NaN, callbackAsNull0,),).amountOfCall,).toBe(1,),)
            test("elementAtOrNull",    () => expect(new GenericCollectionHolder_GetOrNullAlias().execute(it => it.elementAtOrNull(NaN,),).amountOfCall,).toBe(1,),)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("first",              () => expect(new LazyGenericCollectionHolder_GetFirstAlias().execute(it => it.first(),).amountOfCall,).toBe(1,),)
            test("firstOrNull",        () => expect(new LazyGenericCollectionHolder_GetFirstOrNullAlias().execute(it => it.firstOrNull(),).amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new LazyGenericCollectionHolder_GetFirstAlias().execute(it => it.firstIndexed(),).amountOfCall,).toBe(1,),)
            test("firstIndexedOrNull", () => expect(new LazyGenericCollectionHolder_GetFirstOrNullAlias().execute(it => it.firstIndexedOrNull(),).amountOfCall,).toBe(1,),)
            test("last",               () => expect(new LazyGenericCollectionHolder_GetLastAlias().execute(it => it.last(),).amountOfCall,).toBe(1,),)
            test("lastOrNull",         () => expect(new LazyGenericCollectionHolder_GetLastOrNullAlias().execute(it => it.lastOrNull(),).amountOfCall,).toBe(1,),)
            test("lastIndexed",        () => expect(new LazyGenericCollectionHolder_GetLastAlias().execute(it => it.lastIndexed(),).amountOfCall,).toBe(1,),)
            test("lastOrNull",         () => expect(new LazyGenericCollectionHolder_GetLastOrNullAlias().execute(it => it.lastIndexedOrNull(),).amountOfCall,).toBe(1,),)
            test("at",                 () => expect(new LazyGenericCollectionHolder_GetAlias().execute(it => it.at(2,),).amountOfCall,).toBe(1,),)
            test("atOrElse",           () => expect(new LazyGenericCollectionHolder_GetOrElseAlias().execute(it => it.atOrElse(NaN, callbackAsNull0,),).amountOfCall,).toBe(1,),)
            test("atOrNull",           () => expect(new LazyGenericCollectionHolder_GetOrNullAlias().execute(it => it.atOrNull(NaN,),).amountOfCall,).toBe(1,),)
            test("elementAt",          () => expect(new LazyGenericCollectionHolder_GetAlias().execute(it => it.elementAt(2,),).amountOfCall,).toBe(1,),)
            test("elementAtOrElse",    () => expect(new LazyGenericCollectionHolder_GetOrElseAlias().execute(it => it.elementAtOrElse(NaN, callbackAsNull0,),).amountOfCall,).toBe(1,),)
            test("elementAtOrNull",    () => expect(new LazyGenericCollectionHolder_GetOrNullAlias().execute(it => it.elementAtOrNull(NaN,),).amountOfCall,).toBe(1,),)
        },)

        describe("first", () => {
            test("all", () => {
                const method = jest.spyOn(getFirstModule, "getFirst",)
                first(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getFirstModule, "getFirstByMinimalistCollectionHolder",)
                firstByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
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
                firstOrNull(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByMinimalistCollectionHolder",)
                firstOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByCollectionHolder",)
                firstOrNullByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByArray",)
                firstOrNullByArray(A,)
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
                firstIndexedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
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
                firstIndexedOrNull(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByMinimalistCollectionHolder",)
                firstIndexedOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByCollectionHolder",)
                firstIndexedOrNullByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getFirstOrNullModule, "getFirstOrNullByArray",)
                firstIndexedOrNullByArray(A,)
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
                lastByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
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
                lastOrNull(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByMinimalistCollectionHolder",)
                lastOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByCollectionHolder",)
                lastOrNullByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByArray",)
                lastOrNullByArray(A,)
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
                lastIndexedByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
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
                lastIndexedOrNull(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByMinimalistCollectionHolder",)
                lastIndexedOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByCollectionHolder",)
                lastIndexedOrNullByCollectionHolder(new CollectionHolderFromArray(A,),)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getLastOrNullModule, "getLastOrNullByArray",)
                lastIndexedOrNullByArray(A,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("atOrElse", () => {
            test("all", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElse",)
                atOrElse(A, NaN, callback,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByMinimalistCollectionHolder",)
                atOrElseByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), NaN, callback,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByCollectionHolder",)
                atOrElseByCollectionHolder(new CollectionHolderFromArray(A,), NaN, callback,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByArray",)
                atOrElseByArray(A, NaN, callback,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("atOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNull",)
                atOrNull(A, NaN,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByMinimalistCollectionHolder",)
                atOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), NaN,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByCollectionHolder",)
                atOrNullByCollectionHolder(new CollectionHolderFromArray(A,), NaN,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByArray",)
                atOrNullByArray(A, NaN,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("elementAtOrElse", () => {
            test("all", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElse",)
                elementAtOrElse(A, NaN, callback,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByMinimalistCollectionHolder",)
                elementAtOrElseByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), NaN, callback,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByCollectionHolder",)
                elementAtOrElseByCollectionHolder(new CollectionHolderFromArray(A,), NaN, callback,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getOrElseModule, "getOrElseByArray",)
                elementAtOrElseByArray(A, NaN, callback,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("elementAtOrNull", () => {
            test("all", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNull",)
                elementAtOrNull(A, NaN,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByMinimalistCollectionHolder",)
                elementAtOrNullByMinimalistCollectionHolder(new CollectionHolderFromArray(A,), NaN,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByCollectionHolder",)
                elementAtOrNullByCollectionHolder(new CollectionHolderFromArray(A,), NaN,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(getOrNullModule, "getOrNullByArray",)
                elementAtOrNullByArray(A, NaN,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
    },)

    describe.each(NULL_UNDEFINED,)("%s", it => {
        describe("getOrElse", () => {
            test("all",                          () => expect(getOrElse(it, NaN, callback,) === value,).toBeTrue(),)
            test("minimalist collection holder", () => expect(getOrElseByMinimalistCollectionHolder(it, NaN, callback,) === value,).toBeTrue(),)
            test("collection holder",            () => expect(getOrElseByCollectionHolder(it, NaN, callback,) === value,).toBeTrue(),)
            test("array",                        () => expect(getOrElseByArray(it, NaN, callback,) === value,).toBeTrue(),)
        },)
        describe("getOrNull", () => {
            test("all",                          () => expect(getOrNull(it, NaN,),).toBeNull(),)
            test("minimalist collection holder", () => expect(getOrNullByMinimalistCollectionHolder(it, NaN,),).toBeNull(),)
            test("collection holder",            () => expect(getOrNullByCollectionHolder(it, NaN,),).toBeNull(),)
            test("array",                        () => expect(getOrNullByArray(it, NaN,),).toBeNull(),)
        },)

        describe("getFirst", () => {
            test("all",                          () => expect(() => getFirst(it,),).toThrow(NullCollectionException,),)
            test("minimalist collection holder", () => expect(() => getFirstByMinimalistCollectionHolder(it,),).toThrow(NullCollectionException,),)
            test("collection holder",            () => expect(() => getFirstByCollectionHolder(it,),).toThrow(NullCollectionException,),)
            test("array",                        () => expect(() => getFirstByArray(it,),).toThrow(NullCollectionException,),)
        },)
        describe("getFirstOrNull", () => {
            test("all",                          () => expect(getFirstOrNull(it,),).toBeNull(),)
            test("minimalist collection holder", () => expect(getFirstOrNullByMinimalistCollectionHolder(it,),).toBeNull(),)
            test("collection holder",            () => expect(getFirstOrNullByCollectionHolder(it,),).toBeNull(),)
            test("array",                        () => expect(getFirstOrNullByArray(it,),).toBeNull(),)
        },)
        describe("getFirstOrElse", () => {
            test("all",                          () => expect(getFirstOrElse(it, it => it,),).toBe(0,),)
            test("minimalist collection holder", () => expect(getFirstOrElseByMinimalistCollectionHolder(it, it => it,),).toBe(0,),)
            test("collection holder",            () => expect(getFirstOrElseByCollectionHolder(it, it => it,),).toBe(0,),)
            test("array",                        () => expect(getFirstOrElseByArray(it, it => it,),).toBe(0,),)
        },)

        describe("getLast", () => {
            test("all",                          () => expect(() => getLast(it,),).toThrow(NullCollectionException,),)
            test("minimalist collection holder", () => expect(() => getLastByMinimalistCollectionHolder(it,),).toThrow(NullCollectionException,),)
            test("collection holder",            () => expect(() => getLastByCollectionHolder(it,),).toThrow(NullCollectionException,),)
            test("array",                        () => expect(() => getLastByArray(it,),).toThrow(NullCollectionException,),)
        },)
        describe("getLastOrNull", () => {
            test("all",                          () => expect(getLastOrNull(it,),).toBeNull(),)
            test("minimalist collection holder", () => expect(getLastOrNullByMinimalistCollectionHolder(it,),).toBeNull(),)
            test("collection holder",            () => expect(getLastOrNullByCollectionHolder(it,),).toBeNull(),)
            test("array",                        () => expect(getLastOrNullByArray(it,),).toBeNull(),)
        },)
        describe("getLastOrElse", () => {
            test("all",                          () => expect(getLastOrElse(it, it => it,),).toBe(-1,),)
            test("minimalist collection holder", () => expect(getLastOrElseByMinimalistCollectionHolder(it, it => it,),).toBe(-1,),)
            test("collection holder",            () => expect(getLastOrElseByCollectionHolder(it, it => it,),).toBe(-1,),)
            test("array",                        () => expect(getLastOrElseByArray(it, it => it,),).toBe(-1,),)
        },)
    },)

    describe.each(everyCollectionInstancesAndExtensionFunctionAsCollectionHolder,)("%s", ({value: {instance, isMinimalist, isExtension, type,},},) => {
        /** The instance is a {@link GenericCollectionHolder} */
        const isNormal = type === "normal"
        if (!isExtension)
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

        if (!isExtension)
            describe("get", () => {
                describe("empty", () => {
                    test("NaN", () => expect(() => new instance(EMPTY,).get(NaN,),).toThrow(EmptyCollectionException,),)
                    test("-∞",  () => expect(() => new instance(EMPTY,).get(-Infinity,),).toThrow(EmptyCollectionException,),)
                    test("-2",  () => expect(() => new instance(EMPTY,).get(-2,),).toThrow(EmptyCollectionException,),)
                    test("-1",  () => expect(() => new instance(EMPTY,).get(-1,),).toThrow(EmptyCollectionException,),)
                    test('0',   () => expect(() => new instance(EMPTY,).get(0,),).toThrow(EmptyCollectionException,),)
                    test('1',   () => expect(() => new instance(EMPTY,).get(1,),).toThrow(EmptyCollectionException,),)
                    test('2',   () => expect(() => new instance(EMPTY,).get(2,),).toThrow(EmptyCollectionException,),)
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
                test('2',   () => expect(new instance(EMPTY,).getOrElse(2, callback,),).toBe(value,),)
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
                test('2',   () => expect(new instance(EMPTY,).getOrNull(2,),).toBeNull(),)
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
    },)

},)

// describe.skip("index", () => {
//     test("empty", () => expect(newInstance(EMPTY,)[0],).toBeUndefined(),)
//     test("0", () => expect(newInstance(AB,)[0],).toEqual("a",),)
//     test("3", () => expect(newInstance(AB,)[3],).toBeUndefined(),)
//     test("1", () => expect(newInstance(ABCD,)[1],).toEqual("b",),)
//     test("-1", () => expect(newInstance(ABCD,)[-1],).toBeUndefined(),)
//     test("-4", () => expect(newInstance(ABCD,)[-4],).toBeUndefined(),)
//     test("-5", () => expect(newInstance(ABCD,)[-5],).toBeUndefined(),)
//     test("NaN", () => expect(newInstance(AB,)[NaN],).toBeUndefined(),)
//     test("+∞", () => expect(newInstance(AB,)[Infinity],).toBeUndefined(),)
//     test("-∞", () => expect(newInstance(AB,)[-Infinity],).toBeUndefined(),)
// },)
