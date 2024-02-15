/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB}                                      from "./constantCollections"
import {everyInstance,}                          from "./constantValues"
import {CollectionHolderThatCountGetBeingCalled} from "./instance/CollectionHolderThatCountGetBeingCalled"

import {CollectionHolderIndexOutOfBoundsException} from "../src/exception/CollectionHolderIndexOutOfBoundsException"
import {ForbiddenIndexException}                   from "../src/exception/ForbiddenIndexException"

describe("CollectionHolderTest (join)", () => {
describe.each(everyInstance,)("%s", ({value: {newInstance,},},) => {
    describe("get() being called", () => {
        test("transform = 0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.join(null, null, null, null, null, () => '',),).amountOfCall,).toBe(0,),)
        test("transform = 1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.join(null, null, null, null, null, _ => '',),).amountOfCall,).toBe(2.),)
        test("transform = 2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.join(null, null, null, null, null, (_1, _2,) => '',),).amountOfCall,).toBe(2,),)
    },)

    test("nothing",                        () => expect(newInstance(AB,).join(),).toBe("[a, b]",),)
    test("separator = ;",                  () => expect(newInstance(AB,).join(";",),).toBe("[a;b]",),)
    test("prefix = <",                     () => expect(newInstance(AB,).join(null, "<",),).toBe("<a, b]",),)
    test("postfix = >",                    () => expect(newInstance(AB,).join(null, null, ">",),).toBe("[a, b>",),)
    test("limit = 1",                      () => expect(newInstance(AB,).join(null, null, null, 1,),).toBe("[a, …]",),)
    test("truncated = \"...\"",            () => expect(newInstance(AB,).join(null, null, null, null, "...",),).toBe("[a, b]",),)
    test("limit = 1, truncated = \"...\"", () => expect(newInstance(AB,).join(null, null, null, 1, "...",),).toBe("[a, ...]",),)
    test("transform = it => toUpperCase",  () => expect(newInstance(AB,).join(null, null, null, null, null, it => it.toUpperCase(),),).toBe("[A, B]",),)

    describe("invalid numbers", () => {
        test("limit = -3",  () => expect(() => newInstance(AB,).join(null, null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("limit = 3",   () => expect(() => newInstance(AB,).join(null, null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

        test("limit = NaN", () => expect(() => newInstance(AB,).join(null, null, null, NaN,),).toThrow(ForbiddenIndexException,),)
        test("limit = +∞",  () => expect(() => newInstance(AB,).join(null, null, null, Infinity,),).toThrow(ForbiddenIndexException,),)
        test("limit = -∞",  () => expect(() => newInstance(AB,).join(null, null, null, -Infinity,),).toThrow(ForbiddenIndexException,),)
    },)
},)},)
