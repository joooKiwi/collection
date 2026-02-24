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

import {CollectionHolderFromArray}                       from "./instance/CollectionHolderFromArray"
import {GenericCollectionHolder_GetAlias}                from "./instance/GenericCollectionHolder_GetAlias"
import {GenericCollectionHolder_GetFirstAlias}           from "./instance/GenericCollectionHolder_GetFirstAlias"
import {GenericCollectionHolder_GetFirstOrNullAlias}     from "./instance/GenericCollectionHolder_GetFirstOrNullAlias"
import {GenericCollectionHolder_GetLastAlias}            from "./instance/GenericCollectionHolder_GetLastAlias"
import {GenericCollectionHolder_GetLastOrNullAlias}      from "./instance/GenericCollectionHolder_GetLastOrNullAlias"
import {GenericCollectionHolder_GetOrElseAlias}          from "./instance/GenericCollectionHolder_GetOrElseAlias"
import {GenericCollectionHolder_GetOrNullAlias}          from "./instance/GenericCollectionHolder_GetOrNullAlias"
import {LazyGenericCollectionHolder_GetAlias}            from "./instance/LazyGenericCollectionHolder_GetAlias"
import {LazyGenericCollectionHolder_GetFirstAlias}       from "./instance/LazyGenericCollectionHolder_GetFirstAlias"
import {LazyGenericCollectionHolder_GetFirstOrNullAlias} from "./instance/LazyGenericCollectionHolder_GetFirstOrNullAlias"
import {LazyGenericCollectionHolder_GetLastAlias}        from "./instance/LazyGenericCollectionHolder_GetLastAlias"
import {LazyGenericCollectionHolder_GetLastOrNullAlias}  from "./instance/LazyGenericCollectionHolder_GetLastOrNullAlias"
import {LazyGenericCollectionHolder_GetOrElseAlias}      from "./instance/LazyGenericCollectionHolder_GetOrElseAlias"
import {LazyGenericCollectionHolder_GetOrNullAlias}      from "./instance/LazyGenericCollectionHolder_GetOrNullAlias"
import {MinimalistCollectionHolderFromArray}             from "./instance/MinimalistCollectionHolderFromArray"
import {A, AB, ABCD, EMPTY}                              from "./value/arrays"
import {callbackAsFail0}                                 from "./value/callbacks (fail)"
import {callbackAsNull0}                                 from "./value/callbacks (null)"
import {everyExtensionMethodInstances, everyInstances}   from "./value/instances"

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
        describe("GenericCollectionHolder", () => {
            test("first",              () => expect(new GenericCollectionHolder_GetFirstAlias()      .execute(it => it.first(),)                                        .amountOfCall,).toBe(1,),)
            test("firstOrNull",        () => expect(new GenericCollectionHolder_GetFirstOrNullAlias().execute(it => it.firstOrNull(),)                                  .amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new GenericCollectionHolder_GetFirstAlias()      .execute(it => it.firstIndexed(),)                                 .amountOfCall,).toBe(1,),)
            test("firstIndexedOrNull", () => expect(new GenericCollectionHolder_GetFirstOrNullAlias().execute(it => it.firstIndexedOrNull(),)                           .amountOfCall,).toBe(1,),)
            test("last",               () => expect(new GenericCollectionHolder_GetLastAlias()       .execute(it => it.last(),)                                         .amountOfCall,).toBe(1,),)
            test("lastOrNull",         () => expect(new GenericCollectionHolder_GetLastOrNullAlias() .execute(it => it.lastOrNull(),)                                   .amountOfCall,).toBe(1,),)
            test("lastIndexed",        () => expect(new GenericCollectionHolder_GetLastAlias()       .execute(it => it.lastIndexed(),)                                  .amountOfCall,).toBe(1,),)
            test("lastOrNull",         () => expect(new GenericCollectionHolder_GetLastOrNullAlias() .execute(it => it.lastIndexedOrNull(),)                            .amountOfCall,).toBe(1,),)
            test("at",                 () => expect(new GenericCollectionHolder_GetAlias()           .execute(it => it.at(existantIndex,),)                             .amountOfCall,).toBe(1,),)
            test("atOrElse",           () => expect(new GenericCollectionHolder_GetOrElseAlias()     .execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .amountOfCall,).toBe(1,),)
            test("atOrNull",           () => expect(new GenericCollectionHolder_GetOrNullAlias()     .execute(it => it.atOrNull(invalidIndex,),)                        .amountOfCall,).toBe(1,),)
            test("elementAt",          () => expect(new GenericCollectionHolder_GetAlias()           .execute(it => it.elementAt(existantIndex,),)                      .amountOfCall,).toBe(1,),)
            test("elementAtOrElse",    () => expect(new GenericCollectionHolder_GetOrElseAlias()     .execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).amountOfCall,).toBe(1,),)
            test("elementAtOrNull",    () => expect(new GenericCollectionHolder_GetOrNullAlias()     .execute(it => it.elementAtOrNull(invalidIndex,),)                 .amountOfCall,).toBe(1,),)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("first",              () => expect(new LazyGenericCollectionHolder_GetFirstAlias()      .execute(it => it.first(),)                                        .amountOfCall,).toBe(1,),)
            test("firstOrNull",        () => expect(new LazyGenericCollectionHolder_GetFirstOrNullAlias().execute(it => it.firstOrNull(),)                                  .amountOfCall,).toBe(1,),)
            test("firstIndexed",       () => expect(new LazyGenericCollectionHolder_GetFirstAlias()      .execute(it => it.firstIndexed(),)                                 .amountOfCall,).toBe(1,),)
            test("firstIndexedOrNull", () => expect(new LazyGenericCollectionHolder_GetFirstOrNullAlias().execute(it => it.firstIndexedOrNull(),)                           .amountOfCall,).toBe(1,),)
            test("last",               () => expect(new LazyGenericCollectionHolder_GetLastAlias()       .execute(it => it.last(),)                                         .amountOfCall,).toBe(1,),)
            test("lastOrNull",         () => expect(new LazyGenericCollectionHolder_GetLastOrNullAlias() .execute(it => it.lastOrNull(),)                                   .amountOfCall,).toBe(1,),)
            test("lastIndexed",        () => expect(new LazyGenericCollectionHolder_GetLastAlias()       .execute(it => it.lastIndexed(),)                                  .amountOfCall,).toBe(1,),)
            test("lastOrNull",         () => expect(new LazyGenericCollectionHolder_GetLastOrNullAlias() .execute(it => it.lastIndexedOrNull(),)                            .amountOfCall,).toBe(1,),)
            test("at",                 () => expect(new LazyGenericCollectionHolder_GetAlias()           .execute(it => it.at(existantIndex,),)                             .amountOfCall,).toBe(1,),)
            test("atOrElse",           () => expect(new LazyGenericCollectionHolder_GetOrElseAlias()     .execute(it => it.atOrElse(invalidIndex, callbackAsNull0,),)       .amountOfCall,).toBe(1,),)
            test("atOrNull",           () => expect(new LazyGenericCollectionHolder_GetOrNullAlias()     .execute(it => it.atOrNull(invalidIndex,),)                        .amountOfCall,).toBe(1,),)
            test("elementAt",          () => expect(new LazyGenericCollectionHolder_GetAlias()           .execute(it => it.elementAt(existantIndex,),)                      .amountOfCall,).toBe(1,),)
            test("elementAtOrElse",    () => expect(new LazyGenericCollectionHolder_GetOrElseAlias()     .execute(it => it.elementAtOrElse(invalidIndex, callbackAsNull0,),).amountOfCall,).toBe(1,),)
            test("elementAtOrNull",    () => expect(new LazyGenericCollectionHolder_GetOrNullAlias()     .execute(it => it.elementAtOrNull(invalidIndex,),)                 .amountOfCall,).toBe(1,),)
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
