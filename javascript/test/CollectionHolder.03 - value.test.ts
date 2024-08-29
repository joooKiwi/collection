/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, ABCD, ABCD_NULL, ABCD_UNDEFINED, EMPTY, NULL_ABCD, UNDEFINED_ABCD} from "./constantCollections"
import {everyInstance}                                                         from "./constantValues"
import {CollectionHolderThatCountGetBeingCalled}                               from "./instance/CollectionHolderThatCountGetBeingCalled"
import {GenericCollectionHolder_GetAlias}                                      from "./instance/GenericCollectionHolder_GetAlias"
import {GenericCollectionHolder_GetOrElseAlias}                                from "./instance/GenericCollectionHolder_GetOrElseAlias"
import {GenericCollectionHolder_GetOrNullAlias}                                from "./instance/GenericCollectionHolder_GetOrNullAlias"
import {LazyGenericCollectionHolder_GetAlias}                                  from "./instance/LazyGenericCollectionHolder_GetAlias"
import {LazyGenericCollectionHolder_GetOrElseAlias}                            from "./instance/LazyGenericCollectionHolder_GetOrElseAlias"
import {LazyGenericCollectionHolder_GetOrNullAlias}                            from "./instance/LazyGenericCollectionHolder_GetOrNullAlias"

import {CollectionHolderIndexOutOfBoundsException} from "../src/exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "../src/exception/EmptyCollectionHolderException"
import {ForbiddenIndexException}                   from "../src/exception/ForbiddenIndexException"

describe("CollectionHolderTest (value)", () => {

    describe("aliases", () => {
        describe("GenericCollectionHolder", () => {
            test("at", () => {
                const instance = new GenericCollectionHolder_GetAlias()
                instance.at(5,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("atOrElse", () => {
                const instance = new GenericCollectionHolder_GetOrElseAlias()
                instance.atOrElse(NaN, () => null,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("atOrNull", () => {
                const instance = new GenericCollectionHolder_GetOrNullAlias()
                instance.atOrNull(NaN,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("elementAt", () => {
                const instance = new GenericCollectionHolder_GetAlias()
                instance.elementAt(5,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("elementAtOrElse", () => {
                const instance = new GenericCollectionHolder_GetOrElseAlias()
                instance.elementAtOrElse(NaN, () => null,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("elementAtOrNull", () => {
                const instance = new GenericCollectionHolder_GetOrNullAlias()
                instance.elementAtOrNull(NaN,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
        describe("LazyGenericCollectionHolder", () => {
            test("at", () => {
                const instance = new LazyGenericCollectionHolder_GetAlias()
                instance.at(5,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("atOrElse", () => {
                const instance = new LazyGenericCollectionHolder_GetOrElseAlias()
                instance.atOrElse(NaN, () => null,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("atOrNull", () => {
                const instance = new LazyGenericCollectionHolder_GetOrNullAlias()
                instance.atOrNull(5,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("elementAt", () => {
                const instance = new LazyGenericCollectionHolder_GetAlias()
                instance.elementAt(5,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("elementAtOrElse", () => {
                const instance = new LazyGenericCollectionHolder_GetOrElseAlias()
                instance.elementAtOrElse(NaN, () => null,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
            test("elementAtOrNull", () => {
                const instance = new LazyGenericCollectionHolder_GetOrNullAlias()
                instance.elementAtOrNull(NaN,)
                expect(instance.amountOfCall,).toBe(1,)
            },)
        },)
    },)

    describe.each(everyInstance,)("%s", ({value: {newInstance, isMinimalist, isExtensionOnly,},},) => {
        if (!isExtensionOnly) {
            if (isMinimalist) {
                //README: Those tests are a copy on the lower tests
                describe("get", () => {
                    test("empty", () => expect(() => newInstance(EMPTY,).get(0,),).toThrow(EmptyCollectionHolderException,),)
                    test("0",     () => expect(newInstance(AB,).get(0,),).toEqual('a',),)
                    test("3",     () => expect(() => newInstance(AB,).get(3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("1",     () => expect(newInstance(ABCD,).get(1,),).toEqual('b',),)
                    test("-1",    () => expect(newInstance(ABCD,).get(-1,),).toEqual('d',),)
                    test("-4",    () => expect(newInstance(ABCD,).get(-4,),).toEqual('a',),)
                    test("-5",    () => expect(() => newInstance(ABCD,).get(-5,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("NaN",   () => expect(() => newInstance(AB,).get(NaN,),).toThrow(ForbiddenIndexException,),)
                    test("+∞",    () => expect(() => newInstance(AB,).get(Infinity,),).toThrow(ForbiddenIndexException,),)
                    test("-∞",    () => expect(() => newInstance(AB,).get(-Infinity,),).toThrow(ForbiddenIndexException,),)
                },)
                describe("or else", () => {
                    const value = Symbol()
                    const callback = () => value

                    test("empty", () => expect(newInstance(EMPTY,).getOrElse(0, callback,),).toEqual(value,),)
                    test("0",     () => expect(newInstance(AB,).getOrElse(0, callback,),).toEqual('a',),)
                    test("3",     () => expect(newInstance(AB,).getOrElse(3, callback,),).toEqual(value,),)
                    test("1",     () => expect(newInstance(ABCD,).getOrElse(1, callback,),).toEqual('b',),)
                    test("-1",    () => expect(newInstance(ABCD,).getOrElse(-1, callback,),).toEqual('d',),)
                    test("-5",    () => expect(newInstance(ABCD,).getOrElse(-5, callback,),).toEqual(value,),)
                    test("NaN",   () => expect(newInstance(AB,).getOrElse(NaN, callback,),).toEqual(value,),)
                    test("+∞",    () => expect(newInstance(AB,).getOrElse(Infinity, callback,),).toEqual(value,),)
                    test("-∞",    () => expect(newInstance(AB,).getOrElse(-Infinity, callback,),).toEqual(value,),)
                },)
                describe("or null", () => {
                    test("empty", () =>  expect(newInstance(EMPTY,).getOrNull(0,),).toBeNull(),)
                    test("0",     () => expect(newInstance(AB,).getOrNull(0,),).toEqual('a',),)
                    test("3",     () => expect(newInstance(AB,).getOrNull(3,),).toBeNull(),)
                    test("1",     () => expect(newInstance(ABCD,).getOrNull(1,),).toEqual('b',),)
                    test("-1",    () => expect(newInstance(ABCD,).getOrNull(-1,),).toEqual('d',),)
                    test("-5",    () => expect(newInstance(ABCD,).getOrNull(-5,),).toBeNull(),)
                    test("NaN",   () => expect(newInstance(AB,).getOrNull(NaN,),).toBeNull(),)
                    test("+∞",    () => expect(newInstance(AB,).getOrNull(Infinity,),).toBeNull(),)
                    test("-∞",    () => expect(newInstance(AB,).getOrNull(-Infinity,),).toBeNull(),)
                },)
                return
            }

            describe("get", () => {
                describe.skip("index", () => {
                    test("empty", () => expect(newInstance(EMPTY,)[0],).toBeUndefined(),)
                    test("0", () => expect(newInstance(AB,)[0],).toEqual("a",),)
                    test("3", () => expect(newInstance(AB,)[3],).toBeUndefined(),)
                    test("1", () => expect(newInstance(ABCD,)[1],).toEqual("b",),)
                    test("-1", () => expect(newInstance(ABCD,)[-1],).toBeUndefined(),)
                    test("-4", () => expect(newInstance(ABCD,)[-4],).toBeUndefined(),)
                    test("-5", () => expect(newInstance(ABCD,)[-5],).toBeUndefined(),)
                    test("NaN", () => expect(newInstance(AB,)[NaN],).toBeUndefined(),)
                    test("+∞", () => expect(newInstance(AB,)[Infinity],).toBeUndefined(),)
                    test("-∞", () => expect(newInstance(AB,)[-Infinity],).toBeUndefined(),)
                },)
                describe("get", () => {
                    test("empty", () => expect(() => newInstance(EMPTY,).get(0,),).toThrow(EmptyCollectionHolderException,),)
                    test("0",     () => expect(newInstance(AB,).get(0,),).toEqual('a',),)
                    test("3",     () => expect(() => newInstance(AB,).get(3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("1",     () => expect(newInstance(ABCD,).get(1,),).toEqual('b',),)
                    test("-1",    () => expect(newInstance(ABCD,).get(-1,),).toEqual('d',),)
                    test("-4",    () => expect(newInstance(ABCD,).get(-4,),).toEqual('a',),)
                    test("-5",    () => expect(() => newInstance(ABCD,).get(-5,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
                    test("NaN",   () => expect(() => newInstance(AB,).get(NaN,),).toThrow(ForbiddenIndexException,),)
                    test("+∞",    () => expect(() => newInstance(AB,).get(Infinity,),).toThrow(ForbiddenIndexException,),)
                    test("-∞",    () => expect(() => newInstance(AB,).get(-Infinity,),).toThrow(ForbiddenIndexException,),)
                },)
                describe("or else", () => {
                    const value = Symbol()
                    const callback = () => value

                    test("empty", () => expect(newInstance(EMPTY,).getOrElse(0, callback,),).toEqual(value,),)
                    test("0",     () => expect(newInstance(AB,).getOrElse(0, callback,),).toEqual('a',),)
                    test("3",     () => expect(newInstance(AB,).getOrElse(3, callback,),).toEqual(value,),)
                    test("1",     () => expect(newInstance(ABCD,).getOrElse(1, callback,),).toEqual('b',),)
                    test("-1",    () => expect(newInstance(ABCD,).getOrElse(-1, callback,),).toEqual('d',),)
                    test("-5",    () => expect(newInstance(ABCD,).getOrElse(-5, callback,),).toEqual(value,),)
                    test("NaN",   () => expect(newInstance(AB,).getOrElse(NaN, callback,),).toEqual(value,),)
                    test("+∞",    () => expect(newInstance(AB,).getOrElse(Infinity, callback,),).toEqual(value,),)
                    test("-∞",    () => expect(newInstance(AB,).getOrElse(-Infinity, callback,),).toEqual(value,),)
                },)
                describe("or null", () => {
                    test("empty", () =>  expect(newInstance(EMPTY,).getOrNull(0,),).toBeNull(),)
                    test("0",     () => expect(newInstance(AB,).getOrNull(0,),).toEqual('a',),)
                    test("3",     () => expect(newInstance(AB,).getOrNull(3,),).toBeNull(),)
                    test("1",     () => expect(newInstance(ABCD,).getOrNull(1,),).toEqual('b',),)
                    test("-1",    () => expect(newInstance(ABCD,).getOrNull(-1,),).toEqual('d',),)
                    test("-5",    () => expect(newInstance(ABCD,).getOrNull(-5,),).toBeNull(),)
                    test("NaN",   () => expect(newInstance(AB,).getOrNull(NaN,),).toBeNull(),)
                    test("+∞",    () => expect(newInstance(AB,).getOrNull(Infinity,),).toBeNull(),)
                    test("-∞",    () => expect(newInstance(AB,).getOrNull(-Infinity,),).toBeNull(),)
                },)
            },)
        }

        describe("get() being called", () => {
            function handleCollectionIndexOutOfBound(action: () => void,) {
                try {
                    action()
                } catch (exception) {
                    if (exception instanceof CollectionHolderIndexOutOfBoundsException)
                        return
                    throw exception
                }
            }

            describe("first", () => {
                test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => handleCollectionIndexOutOfBound(() => it.first(() => false,),),).amountOfCall,).toBe(0,),)
                test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => handleCollectionIndexOutOfBound(() => it.first(_ => false,),),).amountOfCall,).toBe(2,),)
                test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => handleCollectionIndexOutOfBound(() => it.first((_1, _2,) => false,),),).amountOfCall,).toBe(2,),)
            },)
            describe("first or null", () => {
                test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.firstOrNull(() => false,),).amountOfCall,).toBe(0,),)
                test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.firstOrNull(_ => false,),).amountOfCall,).toBe(2,),)
                test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.firstOrNull((_1, _2,) => false,),).amountOfCall,).toBe(2,),)
            },)
            describe("last", () => {
                test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => handleCollectionIndexOutOfBound(() => it.last(() => false,),),).amountOfCall,).toBe(0,),)
                test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => handleCollectionIndexOutOfBound(() => it.last(_ => false,),),).amountOfCall,).toBe(2,),)
                test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => handleCollectionIndexOutOfBound(() => it.last((_1, _2,) => false,),),).amountOfCall,).toBe(2,),)
            },)
            describe("last or null", () => {
                test("0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.lastOrNull(() => false,),).amountOfCall,).toBe(0,),)
                test("1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.lastOrNull(_ => false,),).amountOfCall,).toBe(2,),)
                test("2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.lastOrNull((_1, _2,) => false,),).amountOfCall,).toBe(2,),)
            },)
        },)

        describe("first", () => {
            describe("[]", () => {
                test("direct",  () => expect(() => newInstance(EMPTY,).first(),).toThrow(EmptyCollectionHolderException,),)
                test("or null", () => expect(newInstance(EMPTY,).firstOrNull(),).toBeNull(),)
            },)

            test("[a,b,c,d].first()", () => expect(newInstance(ABCD,).first(),).toBe('a',),)
            describe("[null,a,b,c,d].first()", () => {
                test("direct",  () => expect(newInstance(NULL_ABCD,).first(),).toBeNull(),)
                test("or null", () => expect(newInstance(NULL_ABCD,).firstOrNull(),).toBeNull(),)
            },)
            test("[a,b,c,d,null].first()", () => expect(newInstance(ABCD_NULL,).first(),).toBe('a',),)
            describe("[undefined,a,b,c,d].first()", () => {
                test("direct",  () => expect(newInstance(UNDEFINED_ABCD,).first(),).toBeUndefined(),)
                test("or null", () => expect(newInstance(UNDEFINED_ABCD,).firstOrNull(),).toBeUndefined(),)
            },)
            test("[a,b,c,d,undefined].first()", () => expect(newInstance(ABCD_UNDEFINED,).first(),).toBe('a',),)

            test("[a,b,c,d].first(!a)", () => expect(newInstance(ABCD,).first(it => it !== 'a',),).toBe('b',),)
            describe("[null,a,b,c,d].first(!a) ", () => {
                test("direct",  () => expect(newInstance(NULL_ABCD,).first(it => it !== 'a',),).toBeNull(),)
                test("or null", () => expect(newInstance(NULL_ABCD,).firstOrNull(it => it !== 'a',),).toBeNull(),)
            },)
            test("[a,b,c,d,null].first(!a)", () => expect(newInstance(ABCD_NULL,).first(it => it !== 'a',),).toBe('b',),)
            describe("[undefined,a,b,c,d].first(!a)", () => {
                test("direct",  () => expect(newInstance(UNDEFINED_ABCD,).first(it => it !== 'a',),).toBeUndefined(),)
                test("or null", () => expect(newInstance(UNDEFINED_ABCD,).firstOrNull(it => it !== 'a',),).toBeUndefined(),)
            },)
            test("[a,b,c,d,undefined].first(!a)", () => expect(newInstance(ABCD_UNDEFINED,).first(it => it !== 'a',),).toBe('b',),)
        },)
        describe("last", () => {
            describe("[]", () => {
                test("direct",  () => expect(() => newInstance(EMPTY,).last(),).toThrow(EmptyCollectionHolderException,),)
                test("or null", () => expect(newInstance(EMPTY,).lastOrNull(),).toBeNull(),)
            },)

            test("[a,b,c,d].last()",      () => expect(newInstance(ABCD,).last(),).toBe('d',),)
            test("[null,a,b,c,d].last()", () => expect(newInstance(NULL_ABCD,).last(),).toBe('d',),)
            describe("[a,b,c,d,null].last()", () => {
                test("direct",  () => expect(newInstance(ABCD_NULL,).last(),).toBeNull(),)
                test("or null", () => expect(newInstance(ABCD_NULL,).lastOrNull(),).toBeNull(),)
            },)
            test("[undefined,a,b,c,d].last()", () => expect(newInstance(UNDEFINED_ABCD,).last(),).toBe('d',),)
            describe("[a,b,c,d,undefined].last()", () => {
                test("direct",  () => expect(newInstance(ABCD_UNDEFINED,).last(),).toBeUndefined(),)
                test("or null", () => expect(newInstance(ABCD_UNDEFINED,).lastOrNull(),).toBeUndefined(),)
            },)

            test("[a,b,c,d].last(!d)",      () => expect(newInstance(ABCD,).last(it => it !== 'd',),).toBe('c',),)
            test("[null,a,b,c,d].last(!d)", () => expect(newInstance(NULL_ABCD,).last(it => it !== 'd',),).toBe('c',),)
            describe("[a,b,c,d,null].last(!d)", () => {
                test("direct",  () => expect(newInstance(ABCD_NULL,).last(it => it !== 'd',),).toBeNull(),)
                test("or null", () => expect(newInstance(ABCD_NULL,).lastOrNull(it => it !== 'd',),).toBeNull(),)
            },)
            test("[undefined,a,b,c,d].last(!d)", () => expect(newInstance(UNDEFINED_ABCD,).last(it => it !== 'd',),).toBe('c',),)
            describe("[a,b,c,d,undefined].last(!d)", () => {
                test("direct",  () => expect(newInstance(ABCD_UNDEFINED,).last(it => it !== 'd',),).toBeUndefined(),)
                test("or null", () => expect(newInstance(ABCD_UNDEFINED,).lastOrNull(it => it !== 'd',),).toBeUndefined(),)
            },)
        },)
    },)

},)
