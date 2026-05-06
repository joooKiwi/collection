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

import {ArrayAsCollectionHolder}       from "../src/ArrayAsCollectionHolder"
import {ArrayOf1AsCollectionHolder}    from "../src/ArrayOf1AsCollectionHolder"
import {ArrayOf2AsCollectionHolder}    from "../src/ArrayOf2AsCollectionHolder"
import {CollectionHolderOf1}           from "../src/CollectionHolderOf1"
import {CollectionHolderOf2}           from "../src/CollectionHolderOf2"
import {GenericCollectionHolder}       from "../src/GenericCollectionHolder"
import {LazyCollectionHolder}          from "../src/LazyCollectionHolder"
import {LazyCollectionHolderOf0Or1}    from "../src/LazyCollectionHolderOf0Or1"
import {LazyCollectionHolderOf0Or1Or2} from "../src/LazyCollectionHolderOf0Or1Or2"
import {LazyCollectionHolderOf1}       from "../src/LazyCollectionHolderOf1"
import {LazyCollectionHolderOf1Or2}    from "../src/LazyCollectionHolderOf1Or2"
import {LazyCollectionHolderOf2}       from "../src/LazyCollectionHolderOf2"
import {SetAsCollectionHolder}         from "../src/SetAsCollectionHolder"
import {SetOf1AsCollectionHolder}      from "../src/SetOf1AsCollectionHolder"
import {SetOf2AsCollectionHolder}      from "../src/SetOf2AsCollectionHolder"
import {EmptyOptional}                 from "../src/optional/EmptyOptional"
import {Optional}                      from "../src/optional/Optional"
import {Couple}                        from "../src/tuple/Couple"

import {A, AB, ABC, ABCD, EMPTY} from "./value/arrays"
import {everyIterableInstances}  from "./value/instances"

describe("CollectionHolderTest (constructor)", () => {

    describe("GenericCollectionHolder", () => {
    describe.each(everyIterableInstances,)("%s", ({value: iterable,},) => {
        test("empty",        () => expect(new GenericCollectionHolder(new iterable(EMPTY,),),)  .toBeEmpty(),)
        test("1 field [0]",  () => expect(new GenericCollectionHolder(new iterable(A,),)[0],)   .toBe('a',),)
        test("2 fields [0]", () => expect(new GenericCollectionHolder(new iterable(AB,),)[0],)  .toBe('a',),)
        test("2 fields [1]", () => expect(new GenericCollectionHolder(new iterable(AB,),)[1],)  .toBe('b',),)
        test("3 fields [0]", () => expect(new GenericCollectionHolder(new iterable(ABC,),)[0],) .toBe('a',),)
        test("3 fields [1]", () => expect(new GenericCollectionHolder(new iterable(ABC,),)[1],) .toBe('b',),)
        test("3 fields [2]", () => expect(new GenericCollectionHolder(new iterable(ABC,),)[2],) .toBe('c',),)
        test("4 fields [0]", () => expect(new GenericCollectionHolder(new iterable(ABCD,),)[0],).toBe('a',),)
        test("4 fields [1]", () => expect(new GenericCollectionHolder(new iterable(ABCD,),)[1],).toBe('b',),)
        test("4 fields [2]", () => expect(new GenericCollectionHolder(new iterable(ABCD,),)[2],).toBe('c',),)
        test("4 fields [3]", () => expect(new GenericCollectionHolder(new iterable(ABCD,),)[3],).toBe('d',),)
    },)},)

    test("CollectionHolderOf1", () => expect(new CollectionHolderOf1('a',)[0],).toBe('a',),)
    describe("CollectionHolderOf2", () => {
        test("[0]", () => expect(new CollectionHolderOf2("a", "b",)[0],).toBe('a',),)
        test("[1]", () => expect(new CollectionHolderOf2("a", "b",)[1],).toBe('b',),)
    },)

    describe("ArrayAsCollectionHolder", () => {
        test("empty",        () => expect(new ArrayAsCollectionHolder(EMPTY,),)  .toBeEmpty(),)
        test("1 field [0]",  () => expect(new ArrayAsCollectionHolder(A,)[0],)   .toBe('a',),)
        test("2 fields [0]", () => expect(new ArrayAsCollectionHolder(AB,)[0],)  .toBe('a',),)
        test("2 fields [1]", () => expect(new ArrayAsCollectionHolder(AB,)[1],)  .toBe('b',),)
        test("3 fields [0]", () => expect(new ArrayAsCollectionHolder(ABC,)[0],) .toBe('a',),)
        test("3 fields [1]", () => expect(new ArrayAsCollectionHolder(ABC,)[1],) .toBe('b',),)
        test("3 fields [2]", () => expect(new ArrayAsCollectionHolder(ABC,)[2],) .toBe('c',),)
        test("4 fields [0]", () => expect(new ArrayAsCollectionHolder(ABCD,)[0],).toBe('a',),)
        test("4 fields [1]", () => expect(new ArrayAsCollectionHolder(ABCD,)[1],).toBe('b',),)
        test("4 fields [2]", () => expect(new ArrayAsCollectionHolder(ABCD,)[2],).toBe('c',),)
        test("4 fields [3]", () => expect(new ArrayAsCollectionHolder(ABCD,)[3],).toBe('d',),)
    },)
    describe("ArrayOf1AsCollectionHolder", () => {
        // @ts-expect-error
        test("empty",    () => expect(() => new ArrayOf1AsCollectionHolder(EMPTY,),).toThrow(TypeError,),)
        test("1 field",  () => expect(      new ArrayOf1AsCollectionHolder(A,)[0],) .toBe('a',),)
        // @ts-expect-error
        test("2 fields", () => expect(() => new ArrayOf1AsCollectionHolder(AB,),)   .toThrow(TypeError,),)
        // @ts-expect-error
        test("3 fields", () => expect(() => new ArrayOf1AsCollectionHolder(ABC,),)  .toThrow(TypeError,),)
        // @ts-expect-error
        test("4 fields", () => expect(() => new ArrayOf1AsCollectionHolder(ABCD,),) .toThrow(TypeError,),)
    },)
    describe("ArrayOf2AsCollectionHolder", () => {
        // @ts-expect-error
        test("empty",        () => expect(() => new ArrayOf2AsCollectionHolder(EMPTY,),).toThrow(TypeError,),)
        // @ts-expect-error
        test("1 field",      () => expect(() => new ArrayOf2AsCollectionHolder(A,),)    .toThrow(TypeError,),)
        test("2 fields [0]", () => expect(      new ArrayOf2AsCollectionHolder(AB,)[0],).toBe('a',),)
        test("2 fields [1]", () => expect(      new ArrayOf2AsCollectionHolder(AB,)[1],).toBe('b',),)
        // @ts-expect-error
        test("3 fields",     () => expect(() => new ArrayOf2AsCollectionHolder(ABC,),)  .toThrow(TypeError,),)
        // @ts-expect-error
        test("4 fields",     () => expect(() => new ArrayOf2AsCollectionHolder(ABCD,),) .toThrow(TypeError,),)
    },)

    describe("SetAsCollectionHolder", () => {
        // README: We use onEach to initialize the instance fields
        test("empty",        () => expect(new SetAsCollectionHolder(new Set(),),)                         .toBeEmpty(),)
        test("1 field [0]",  () => expect(new SetAsCollectionHolder(new Set(A,),).onEach(_ => {},)[0],)   .toBe('a',),)
        test("2 fields [0]", () => expect(new SetAsCollectionHolder(new Set(AB,),).onEach(_ => {},)[0],)  .toBe('a',),)
        test("2 fields [1]", () => expect(new SetAsCollectionHolder(new Set(AB,),).onEach(_ => {},)[1],)  .toBe('b',),)
        test("3 fields [0]", () => expect(new SetAsCollectionHolder(new Set(ABC,),).onEach(_ => {},)[0],) .toBe('a',),)
        test("3 fields [1]", () => expect(new SetAsCollectionHolder(new Set(ABC,),).onEach(_ => {},)[1],) .toBe('b',),)
        test("3 fields [2]", () => expect(new SetAsCollectionHolder(new Set(ABC,),).onEach(_ => {},)[2],) .toBe('c',),)
        test("4 fields [0]", () => expect(new SetAsCollectionHolder(new Set(ABCD,),).onEach(_ => {},)[0],).toBe('a',),)
        test("4 fields [1]", () => expect(new SetAsCollectionHolder(new Set(ABCD,),).onEach(_ => {},)[1],).toBe('b',),)
        test("4 fields [2]", () => expect(new SetAsCollectionHolder(new Set(ABCD,),).onEach(_ => {},)[2],).toBe('c',),)
        test("4 fields [3]", () => expect(new SetAsCollectionHolder(new Set(ABCD,),).onEach(_ => {},)[3],).toBe('d',),)
    },)
    describe("SetOf1AsCollectionHolder", () => {
        test("empty",    () => expect(() => new SetOf1AsCollectionHolder(new Set(),),)     .toThrow(TypeError,),)
        test("1 field",  () => expect(      new SetOf1AsCollectionHolder(new Set(A,),)[0],).toBe('a',),)
        test("2 fields", () => expect(() => new SetOf1AsCollectionHolder(new Set(AB,),),)  .toThrow(TypeError,),)
        test("3 fields", () => expect(() => new SetOf1AsCollectionHolder(new Set(ABC,),),) .toThrow(TypeError,),)
        test("4 fields", () => expect(() => new SetOf1AsCollectionHolder(new Set(ABCD,),),).toThrow(TypeError,),)
    },)
    describe("SetOf2AsCollectionHolder", () => {
        test("empty",        () => expect(() => new SetOf2AsCollectionHolder(new Set(),),)     .toThrow(TypeError,),)
        test("1 field",      () => expect(() => new SetOf2AsCollectionHolder(new Set(A,),),)   .toThrow(TypeError,),)
        test("2 fields [0]", () => expect(new SetOf2AsCollectionHolder(new Set(AB,),)[0],)     .toBe('a',),)
        test("2 fields [1]", () => expect(new SetOf2AsCollectionHolder(new Set(AB,),)[1],)     .toBe('b',),)
        test("3 fields",     () => expect(() => new SetOf2AsCollectionHolder(new Set(ABC,),),) .toThrow(TypeError,),)
        test("4 fields",     () => expect(() => new SetOf2AsCollectionHolder(new Set(ABCD,),),).toThrow(TypeError,),)
    },)

    describe.skip("LazyCollectionHolder", () => {
        //TODO: implements the LazyCollectionHolder tests properly
    describe.each(everyIterableInstances,)("%s", ({value: iterable,},) => {
        test("empty",    () => expect(new LazyCollectionHolder(new iterable(EMPTY,),),).toBeEmpty(),)
        test("1 field",  () => expect(new LazyCollectionHolder(new iterable(A,),),)    .toContainAllValues(A,),)
        test("2 fields", () => expect(new LazyCollectionHolder(new iterable(AB,),),)   .toContainAllValues(AB,),)
        test("3 fields", () => expect(new LazyCollectionHolder(new iterable(ABC,),),)  .toContainAllValues(ABC,),)
        test("4 fields", () => expect(new LazyCollectionHolder(new iterable(ABCD,),),) .toContainAllValues(ABCD,),)
    },)},)
    test("LazyCollectionHolderOf1", () => expect(new LazyCollectionHolderOf1(() => 'a',)[0],).toBe('a',),)
    describe("LazyCollectionHolderOf2", () => {
        test("[0]", () => expect(new LazyCollectionHolderOf2(() => new Couple("a", "b",),)[0],).toBe('a',),)
        test("[1]", () => expect(new LazyCollectionHolderOf2(() => new Couple("a", "b",),)[1],).toBe('b',),)
    },)
    describe("LazyCollectionHolderOf0Or1", () => {
        test('0', () => expect(() => new LazyCollectionHolderOf0Or1(() => EmptyOptional.get,)[0],) .toThrow(TypeError,),)
        test('1', () => expect(      new LazyCollectionHolderOf0Or1(() => new Optional('a',),)[0],).toBe('a',),)
    },)
    describe("LazyCollectionHolderOf0Or1Or2", () => {
        test("null [0]",                         () => expect(() => new LazyCollectionHolderOf0Or1Or2(() => null,)[0],)                                                            .toThrow(TypeError,),)
        test("null [1]",                         () => expect(() => new LazyCollectionHolderOf0Or1Or2(() => null,)[1],)                                                            .toThrow(TypeError,),)
        test("undefined [0]",                    () => expect(() => new LazyCollectionHolderOf0Or1Or2(() => undefined,)[0],)                                                       .toThrow(TypeError,),)
        test("undefined [1]",                    () => expect(() => new LazyCollectionHolderOf0Or1Or2(() => undefined,)[1],)                                                       .toThrow(TypeError,),)
        test("empty optional [0]",               () => expect(() => new LazyCollectionHolderOf0Or1Or2(() => EmptyOptional.get,)[0],)                                               .toThrow(TypeError,),)
        test("empty optional [1]",               () => expect(() => new LazyCollectionHolderOf0Or1Or2(() => EmptyOptional.get,)[1],)                                               .toThrow(TypeError,),)
        test("couple (only empty) [0]",          () => expect(() => new LazyCollectionHolderOf0Or1Or2(() => new Couple(EmptyOptional.get, EmptyOptional.get,),)[0],)               .toThrow(TypeError,),)
        test("couple (only empty) [1]",          () => expect(() => new LazyCollectionHolderOf0Or1Or2(() => new Couple(EmptyOptional.get, EmptyOptional.get,),)[1],)               .toThrow(TypeError,),)
        test("optional couple (only empty) [0]", () => expect(() => new LazyCollectionHolderOf0Or1Or2(() => new Optional(new Couple(EmptyOptional.get, EmptyOptional.get,),),)[1],).toThrow(TypeError,),)
        test("optional couple (only empty) [1]", () => expect(() => new LazyCollectionHolderOf0Or1Or2(() => new Optional(new Couple(EmptyOptional.get, EmptyOptional.get,),),)[1],).toThrow(TypeError,),)

        test("couple (1 before) [0]",          () => expect(      new LazyCollectionHolderOf0Or1Or2(() => new Couple(new Optional("a",), EmptyOptional.get,),)[0],)               .toBe("a",),)
        test("couple (1 before) [1]",          () => expect(() => new LazyCollectionHolderOf0Or1Or2(() => new Couple(new Optional("a",), EmptyOptional.get,),)[1],)               .toThrow(TypeError,),)
        test("optional couple (1 before) [0]", () => expect(      new LazyCollectionHolderOf0Or1Or2(() => new Optional(new Couple(new Optional("a",), EmptyOptional.get,),),)[0],).toBe("a",),)
        test("optional couple (1 before) [1]", () => expect(() => new LazyCollectionHolderOf0Or1Or2(() => new Optional(new Couple(new Optional("a",), EmptyOptional.get,),),)[1],).toThrow(TypeError,),)
        test("couple (1 after) [0]",           () => expect(      new LazyCollectionHolderOf0Or1Or2(() => new Couple(EmptyOptional.get, new Optional("a",),),)[0],)               .toBe("a",),)
        test("couple (1 after) [1]",           () => expect(() => new LazyCollectionHolderOf0Or1Or2(() => new Couple(EmptyOptional.get, new Optional("a",),),)[1],)               .toThrow(TypeError,),)
        test("optional couple (1 after) [0]",  () => expect(      new LazyCollectionHolderOf0Or1Or2(() => new Optional(new Couple(EmptyOptional.get, new Optional("a",),),),)[0],).toBe("a",),)
        test("optional couple (1 after) [1]",  () => expect(() => new LazyCollectionHolderOf0Or1Or2(() => new Optional(new Couple(EmptyOptional.get, new Optional("a",),),),)[1],).toThrow(TypeError,),)

        test("couple (2) [0]",          () => expect(new LazyCollectionHolderOf0Or1Or2(() => new Couple(new Optional("a",), new Optional("b",),),)[0],)               .toBe("a",),)
        test("couple (2) [1]",          () => expect(new LazyCollectionHolderOf0Or1Or2(() => new Couple(new Optional("a",), new Optional("b",),),)[1],)               .toBe("b",),)
        test("optional couple (2) [0]", () => expect(new LazyCollectionHolderOf0Or1Or2(() => new Optional(new Couple(new Optional("a",), new Optional("b",),),),)[0],).toBe('a',),)
        test("optional couple (2) [1]", () => expect(new LazyCollectionHolderOf0Or1Or2(() => new Optional(new Couple(new Optional("a",), new Optional("b",),),),)[1],).toBe("b",),)
    },)
    describe("LazyCollectionHolderOf1Or2", () => {
        test("1 field [0]",  () => expect(      new LazyCollectionHolderOf1Or2(() => new Couple('a', EmptyOptional.get,),)[0],) .toBe('a',),)
        test("1 field [1]",  () => expect(() => new LazyCollectionHolderOf1Or2(() => new Couple('a', EmptyOptional.get,),)[1],) .toThrow(TypeError,),)
        test("2 fields [0]", () => expect(      new LazyCollectionHolderOf1Or2(() => new Couple("a", new Optional("b",),),)[0],).toBe('a',),)
        test("2 fields [1]", () => expect(      new LazyCollectionHolderOf1Or2(() => new Couple("a", new Optional("b",),),)[1],).toBe('b',),)
    },)

},)
