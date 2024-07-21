/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AB, ABCDEFGHIJ} from "./constantCollections"
import {everyInstance,} from "./constantValues"
import {CollectionHolderThatCountGetBeingCalled} from "./instance/CollectionHolderThatCountGetBeingCalled"

import {CollectionHolderIndexOutOfBoundsException} from "../src/exception/CollectionHolderIndexOutOfBoundsException"
import {ForbiddenIndexException}                   from "../src/exception/ForbiddenIndexException"

describe("CollectionHolderTest (joinToString)", () => {
describe.each(everyInstance,)("%s", ({value: {newInstance,},},) => {
    describe("get() being called", () => {
        test("transform = 0 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.joinToString(null, null, null, null, null, () => '',),).amountOfCall,).toBe(0,),)
        test("transform = 1 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.joinToString(null, null, null, null, null, _ => '',),).amountOfCall,).toBe(2.),)
        test("transform = 2 arguments", () => expect(new CollectionHolderThatCountGetBeingCalled(newInstance(AB,),).execute(it => it.joinToString(null, null, null, null, null, (_1, _2,) => '',),).amountOfCall,).toBe(2,),)
    },)

    test("nothing",                                       () => expect(newInstance(AB,).joinToString(),).toBe("[a, b]",),)
    test("separator = ;",                                 () => expect(newInstance(AB,).joinToString(";",),).toBe("[a;b]",),)
    test("prefix = <",                                    () => expect(newInstance(AB,).joinToString(null, "<",),).toBe("<a, b]",),)
    test("postfix = >",                                   () => expect(newInstance(AB,).joinToString(null, null, ">",),).toBe("[a, b>",),)
    test("limit = 1",                                     () => expect(newInstance(ABCDEFGHIJ,).joinToString(null, null, null, 1,),).toBe("[a, …]",),)
    test("limit = -2",                                    () => expect(newInstance(ABCDEFGHIJ,).joinToString(null, null, null, -2,),).toBe("[a, b, c, d, e, f, g, h, …]",),)
    test("limit = 10",                                    () => expect(newInstance(ABCDEFGHIJ,).joinToString(null, null, null, 10,),).toBe("[a, b, c, d, e, f, g, h, i, j]",),)
    test("truncated = \"...\"",                           () => expect(newInstance(ABCDEFGHIJ,).joinToString(null, null, null, null, "...",),).toBe("[a, b, c, d, e, f, g, h, i, j]",),)
    test("limit = 1, truncated = \"...\"",                () => expect(newInstance(ABCDEFGHIJ,).joinToString(null, null, null, 1, "...",),).toBe("[a, ...]",),)
    test("transform = () => C",                           () => expect(newInstance(AB,).joinToString(null, null, null, null, null, () => 'C',),).toBe("[C, C]",),)
    test("transform = it => toUpperCase",                 () => expect(newInstance(AB,).joinToString(null, null, null, null, null, it => it.toUpperCase(),),).toBe("[A, B]",),)
    test("transform = it,i => i:toUpperCase",             () => expect(newInstance(AB,).joinToString(null, null, null, null, null, (it, index,) => `${index}:${it.toUpperCase()}`,),).toBe("[0:A, 1:B]",),)
    test("limit = 3, transform = () => C",                () => expect(newInstance(ABCDEFGHIJ,).joinToString(null, null, null, 3, null, () => 'C',),).toBe("[C, C, C, …]",),)
    test("limit = 3, transform = it => toUpperCase",      () => expect(newInstance(ABCDEFGHIJ,).joinToString(null, null, null, 3, null, it => it.toUpperCase(),),).toBe("[A, B, C, …]",),)
    test("limit = 3, transform = it,i => i:toUpperCase",  () => expect(newInstance(ABCDEFGHIJ,).joinToString(null, null, null, 3, null, (it, index,) => `${index}:${it.toUpperCase()}`,),).toBe("[0:A, 1:B, 2:C, …]",),)
    test("limit = -2, transform = () => C",               () => expect(newInstance(ABCDEFGHIJ,).joinToString(null, null, null, -2, null, () => 'C',),).toBe("[C, C, C, C, C, C, C, C, …]",),)
    test("limit = -2, transform = it,i => i:toUpperCase", () => expect(newInstance(ABCDEFGHIJ,).joinToString(null, null, null, -2, null, (it, index,) => `${index}:${it.toUpperCase()}`,),).toBe("[0:A, 1:B, 2:C, 3:D, 4:E, 5:F, 6:G, 7:H, …]",),)
    test("limit = -2, transform = it => toUpperCase",     () => expect(newInstance(ABCDEFGHIJ,).joinToString(null, null, null, -2, null, it => it.toUpperCase(),),).toBe("[A, B, C, D, E, F, G, H, …]",),)
    test("limit = 10, transform = () => C",               () => expect(newInstance(ABCDEFGHIJ,).joinToString(null, null, null, 10, null, () => 'C',),).toBe("[C, C, C, C, C, C, C, C, C, C]",),)
    test("limit = 10, transform = it => toUpperCase",     () => expect(newInstance(ABCDEFGHIJ,).joinToString(null, null, null, 10, null, it => it.toUpperCase(),),).toBe("[A, B, C, D, E, F, G, H, I, J]",),)
    test("limit = 10, transform = it,i => i:toUpperCase", () => expect(newInstance(ABCDEFGHIJ,).joinToString(null, null, null, 10, null, (it, index,) => `${index}:${it.toUpperCase()}`,),).toBe("[0:A, 1:B, 2:C, 3:D, 4:E, 5:F, 6:G, 7:H, 8:I, 9:J]",),)

    describe("invalid numbers", () => {
        test("limit = -3",  () => expect(() => newInstance(AB,).joinToString(null, null, null, -3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)
        test("limit = 3",   () => expect(() => newInstance(AB,).joinToString(null, null, null, 3,),).toThrow(CollectionHolderIndexOutOfBoundsException,),)

        test("limit = NaN", () => expect(() => newInstance(AB,).joinToString(null, null, null, NaN,),).toThrow(ForbiddenIndexException,),)
        test("limit = +∞",  () => expect(() => newInstance(AB,).joinToString(null, null, null, Infinity,),).toThrow(ForbiddenIndexException,),)
        test("limit = -∞",  () => expect(() => newInstance(AB,).joinToString(null, null, null, -Infinity,),).toThrow(ForbiddenIndexException,),)
    },)
},)},)
