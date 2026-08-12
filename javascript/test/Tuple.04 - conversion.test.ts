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

import {A, AA, AB} from "./value/arrays"

import {CollectionConstants} from "../src/CollectionConstants"
import {Empty}               from "../src/tuple/Empty"
import {Tuple_1}             from "./instance/Tuple_1"
import {Tuple_2}             from "./instance/Tuple_2"

describe("TupleTest (conversion)", () => {

    describe("Empty", () => {
        const instance = Empty.get

        test("toArray",                  () => expect(instance.toArray(),).toBe(CollectionConstants.EMPTY_ARRAY,),)
        test("toArray: frozen",          () => expect(instance.toArray(),).toBeFrozen(),)
        test("toSet",                    () => expect(instance.toSet(),).toBe(CollectionConstants.EMPTY_SET,),)
        test("toSet: frozen",            () => expect(instance.toSet(),).toBeFrozen(),)
        test("toString",                 () => expect(instance.toString(),).toBe("Empty ()",),)
    },)

    describe("Monuple", () => {
        test("toArray",                 () => expect(new Tuple_1('a',).toArray(),)                .toStrictEqual(A,),)
        test("toArray: frozen",         () => expect(new Tuple_1('a',).toArray(),)                .toBeFrozen(),)
        test("toSet",                   () => expect(new Tuple_1('a',).toSet(),)                  .toEqual(new Set(A,),),)
        test("toSet: frozen",           () => expect(new Tuple_1('a',).toSet(),)                  .toBeFrozen(),)
        test("toString",                () => expect(new Tuple_1('a',).toString(),)               .toBe("Monuple (a)",),)
    },)

    describe("Couple", () => {
        test("toArray ~ unique",     () => expect(new Tuple_2('a', 'b',).toArray(),) .toStrictEqual(AB,),)
        test("toArray ~ duplicated", () => expect(new Tuple_2('a', 'a',).toArray(),) .toStrictEqual(AA,),)
        test("toArray: frozen",      () => expect(new Tuple_2('a', 'b',).toArray(),) .toBeFrozen(),)
        test("toSet ~ unique",       () => expect(new Tuple_2('a', 'b',).toSet(),)   .toEqual(new Set(AB,),),)
        test("toSet ~ duplicated",   () => expect(new Tuple_2('a', 'a',).toSet(),)   .toEqual(new Set(A,),),)
        test("toSet: frozen",        () => expect(new Tuple_2('a', 'b',).toSet(),)   .toBeFrozen(),)
        test("toString",             () => expect(new Tuple_2('a', 'A',).toString(),).toBe("Couple (a, A)",),)
    },)

},)
