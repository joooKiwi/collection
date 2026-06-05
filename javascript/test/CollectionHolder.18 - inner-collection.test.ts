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

import {ArrayAsCollectionHolder}                           from "../src/ArrayAsCollectionHolder"
import {CollectionHolderOf1}                               from "../src/CollectionHolderOf1"
import {CollectionHolderOf2}                               from "../src/CollectionHolderOf2"
import {EmptyCollectionHolder}                             from "../src/EmptyCollectionHolder"
import {IteratorAsCollectionHolder}                        from "../src/IteratorAsCollectionHolder"
import {JsIterableAsCollectionHolder}                      from "../src/JsIterableAsCollectionHolder"
import {JsIteratorAsCollectionHolder}                      from "../src/JsIteratorAsCollectionHolder"
import {LazyCollectionHolderOf1}                           from "../src/LazyCollectionHolderOf1"
import {LazyCollectionHolderOf2}                           from "../src/LazyCollectionHolderOf2"
import {MinimalistAsCollectionHolder}                      from "../src/MinimalistAsCollectionHolder"
import {SetAsCollectionHolder}                             from "../src/SetAsCollectionHolder"
import {EmptyOptional}                                     from "../src/optional/EmptyOptional"
import {Optional}                                          from "../src/optional/Optional"
import {Couple}                                            from "../src/tuple/Couple"
import {ArrayByStructureForTest}                           from "./instance/ArrayByStructureForTest"
import {ArrayForTest}                                      from "./instance/ArrayForTest"
import {CollectionHolder_ByStructure}                      from "./instance/CollectionHolder_ByStructure"
import {CollectionHolderFromArray}                         from "./instance/CollectionHolderFromArray"
import {CollectionIterator_ByStructure}                    from "./instance/CollectionIterator_ByStructure"
import {CollectionIteratorFromArray}                       from "./instance/CollectionIteratorFromArray"
import {IteratorByStructureForTest}                        from "./instance/IteratorByStructureForTest"
import {IteratorForTest}                                   from "./instance/IteratorForTest"
import {IterableForTest}                                   from "./instance/IterableForTest"
import {LazyCollectionHolderOf0Or1_InnerCollectionTest}    from "./instance/LazyCollectionHolderOf0Or1_InnerCollectionTest"
import {LazyCollectionHolderOf0Or1Or2_InnerCollectionTest} from "./instance/LazyCollectionHolderOf0Or1Or2_InnerCollectionTest"
import {LazyCollectionHolderOf1Or2_InnerCollectionTest}    from "./instance/LazyCollectionHolderOf1Or2_InnerCollectionTest"
import {LazyCollectionHolder_InnerCollectionTest}          from "./instance/LazyCollectionHolder_InnerCollectionTest"
import {MinimalistCollectionHolder_ByStructure}            from "./instance/MinimalistCollectionHolder_ByStructure"
import {MinimalistCollectionHolderFromArray}               from "./instance/MinimalistCollectionHolderFromArray"
import {SetByStructureForTest}                             from "./instance/SetByStructureForTest"
import {SetForTest}                                        from "./instance/SetForTest"
import {A, AB, ABC, ABCD, EMPTY}                           from "./value/arrays"

describe("CollectionHolderTest (inner-collection)", () => {

    describe("LazyCollectionHolder", () => {
        //TODO add iterator/iterable with size/length/count
        describe('0', () => {
            test("array",                                            () => expect(new LazyCollectionHolder_InnerCollectionTest(new ArrayForTest(EMPTY,),)                                .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("array (by structure)",                             () => expect(new LazyCollectionHolder_InnerCollectionTest(new ArrayByStructureForTest(EMPTY,),)                     .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("set",                                              () => expect(new LazyCollectionHolder_InnerCollectionTest(new SetForTest(EMPTY,),)                                  .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("set (by structure)",                               () => expect(new LazyCollectionHolder_InnerCollectionTest(new SetByStructureForTest(EMPTY,),)                       .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("collection holder",                                () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionHolderFromArray(EMPTY,),)                   .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("collection holder (by structure)",                 () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionHolder_ByStructure(EMPTY,),)                .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("minimalist collection holder",                     () => expect(new LazyCollectionHolder_InnerCollectionTest(new MinimalistCollectionHolderFromArray(EMPTY,),)         .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("minimalist collection holder (by structure)",      () => expect(new LazyCollectionHolder_InnerCollectionTest(new MinimalistCollectionHolder_ByStructure(EMPTY,),)      .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("collection iterator",                              () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionIteratorFromArray(EMPTY,),)                 .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("collection iterator (by structure)",               () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionIterator_ByStructure(EMPTY,),)              .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("iterator",                                         () => expect(new LazyCollectionHolder_InnerCollectionTest(new IteratorForTest(EMPTY,),)                             .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("iterator (by structure)",                          () => expect(new LazyCollectionHolder_InnerCollectionTest(new IteratorByStructureForTest(EMPTY,),)                  .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("iterable",                                         () => expect(new LazyCollectionHolder_InnerCollectionTest(new IterableForTest(EMPTY,),)                             .innerCollection,).toBeInstanceOf(JsIterableAsCollectionHolder,),)
            test("late array",                                       () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new ArrayForTest(EMPTY,),)                          .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("late array (by structure)",                        () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new ArrayByStructureForTest(EMPTY,),)               .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("late set",                                         () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new SetForTest(EMPTY,),)                            .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("late set (by structure)",                          () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new SetByStructureForTest(EMPTY,),)                 .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("late collection holder",                           () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionHolderFromArray(EMPTY,),)             .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("late collection holder (by structure)",            () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionHolder_ByStructure(EMPTY,),)          .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("late minimalist collection holder",                () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new MinimalistCollectionHolderFromArray(EMPTY,),)   .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("late minimalist collection holder (by structure)", () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new MinimalistCollectionHolder_ByStructure(EMPTY,),).innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("late collection iterator",                         () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionIteratorFromArray(EMPTY,),)           .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("late collection iterator (by structure)",          () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionIterator_ByStructure(EMPTY,),)        .innerCollection,).toBe(EmptyCollectionHolder.get,),)
            test("late iterator",                                    () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new IteratorForTest(EMPTY,),)                       .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("late iterator (by structure)",                     () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new IteratorByStructureForTest(EMPTY,),)            .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("late iterable",                                    () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new IterableForTest(EMPTY,),)                       .innerCollection,).toBeInstanceOf(JsIterableAsCollectionHolder,),)
        },)
        describe('1', () => {
            test("array",                                            () => expect(new LazyCollectionHolder_InnerCollectionTest(new ArrayForTest(A,),)                                .innerCollection,).toBeInstanceOf(CollectionHolderOf1,),)
            test("array (by structure)",                             () => expect(new LazyCollectionHolder_InnerCollectionTest(new ArrayByStructureForTest(A,),)                     .innerCollection,).toBeInstanceOf(CollectionHolderOf1,),)
            test("set",                                              () => expect(new LazyCollectionHolder_InnerCollectionTest(new SetForTest(A,),)                                  .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf1,),)
            test("set (by structure)",                               () => expect(new LazyCollectionHolder_InnerCollectionTest(new SetByStructureForTest(A,),)                       .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf1,),)
            test("collection holder",                                () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionHolderFromArray(A,),)                   .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf1,),)
            test("collection holder (by structure)",                 () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionHolder_ByStructure(A,),)                .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf1,),)
            test("minimalist collection holder",                     () => expect(new LazyCollectionHolder_InnerCollectionTest(new MinimalistCollectionHolderFromArray(A,),)         .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf1,),)
            test("minimalist collection holder (by structure)",      () => expect(new LazyCollectionHolder_InnerCollectionTest(new MinimalistCollectionHolder_ByStructure(A,),)      .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf1,),)
            test("collection iterator",                              () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionIteratorFromArray(A,),)                 .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf1,),)
            test("collection iterator (by structure)",               () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionIterator_ByStructure(A,),)              .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf1,),)
            test("iterator",                                         () => expect(new LazyCollectionHolder_InnerCollectionTest(new IteratorForTest(A,),)                             .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("iterator (by structure)",                          () => expect(new LazyCollectionHolder_InnerCollectionTest(new IteratorByStructureForTest(A,),)                  .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("iterable",                                         () => expect(new LazyCollectionHolder_InnerCollectionTest(new IterableForTest(A,),)                             .innerCollection,).toBeInstanceOf(JsIterableAsCollectionHolder,),)
            test("late array",                                       () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new ArrayForTest(A,),)                          .innerCollection,).toBeInstanceOf(CollectionHolderOf1,),)
            test("late array (by structure)",                        () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new ArrayByStructureForTest(A,),)               .innerCollection,).toBeInstanceOf(CollectionHolderOf1,),)
            test("late set",                                         () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new SetForTest(A,),)                            .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf1,),)
            test("late set (by structure)",                          () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new SetByStructureForTest(A,),)                 .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf1,),)
            test("late collection holder",                           () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionHolderFromArray(A,),)             .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf1,),)
            test("late collection holder (by structure)",            () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionHolder_ByStructure(A,),)          .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf1,),)
            test("late minimalist collection holder",                () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new MinimalistCollectionHolderFromArray(A,),)   .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf1,),)
            test("late minimalist collection holder (by structure)", () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new MinimalistCollectionHolder_ByStructure(A,),).innerCollection,).toBeInstanceOf(LazyCollectionHolderOf1,),)
            test("late collection iterator",                         () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionIteratorFromArray(A,),)           .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf1,),)
            test("late collection iterator (by structure)",          () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionIterator_ByStructure(A,),)        .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf1,),)
            test("late iterator",                                    () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new IteratorForTest(A,),)                       .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("late iterator (by structure)",                     () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new IteratorByStructureForTest(A,),)            .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("late iterable",                                    () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new IterableForTest(A,),)                       .innerCollection,).toBeInstanceOf(JsIterableAsCollectionHolder,),)
        },)
        describe('2', () => {
            test("array",                                            () => expect(new LazyCollectionHolder_InnerCollectionTest(new ArrayForTest(AB,),)                                .innerCollection,).toBeInstanceOf(CollectionHolderOf2,),)
            test("array (by structure)",                             () => expect(new LazyCollectionHolder_InnerCollectionTest(new ArrayByStructureForTest(AB,),)                     .innerCollection,).toBeInstanceOf(CollectionHolderOf2,),)
            test("set",                                              () => expect(new LazyCollectionHolder_InnerCollectionTest(new SetForTest(AB,),)                                  .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf2,),)
            test("set (by structure)",                               () => expect(new LazyCollectionHolder_InnerCollectionTest(new SetByStructureForTest(AB,),)                       .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf2,),)
            test("collection holder",                                () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionHolderFromArray(AB,),)                   .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf2,),)
            test("collection holder (by structure)",                 () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionHolder_ByStructure(AB,),)                .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf2,),)
            test("minimalist collection holder",                     () => expect(new LazyCollectionHolder_InnerCollectionTest(new MinimalistCollectionHolderFromArray(AB,),)         .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf2,),)
            test("minimalist collection holder (by structure)",      () => expect(new LazyCollectionHolder_InnerCollectionTest(new MinimalistCollectionHolder_ByStructure(AB,),)      .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf2,),)
            test("collection iterator",                              () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionIteratorFromArray(AB,),)                 .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf2,),)
            test("collection iterator (by structure)",               () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionIterator_ByStructure(AB,),)              .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf2,),)
            test("iterator",                                         () => expect(new LazyCollectionHolder_InnerCollectionTest(new IteratorForTest(AB,),)                             .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("iterator (by structure)",                          () => expect(new LazyCollectionHolder_InnerCollectionTest(new IteratorByStructureForTest(AB,),)                  .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("iterable",                                         () => expect(new LazyCollectionHolder_InnerCollectionTest(new IterableForTest(AB,),)                             .innerCollection,).toBeInstanceOf(JsIterableAsCollectionHolder,),)
            test("late array",                                       () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new ArrayForTest(AB,),)                          .innerCollection,).toBeInstanceOf(CollectionHolderOf2,),)
            test("late array (by structure)",                        () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new ArrayByStructureForTest(AB,),)               .innerCollection,).toBeInstanceOf(CollectionHolderOf2,),)
            test("late set",                                         () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new SetForTest(AB,),)                            .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf2,),)
            test("late set (by structure)",                          () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new SetByStructureForTest(AB,),)                 .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf2,),)
            test("late collection holder",                           () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionHolderFromArray(AB,),)             .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf2,),)
            test("late collection holder (by structure)",            () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionHolder_ByStructure(AB,),)          .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf2,),)
            test("late minimalist collection holder",                () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new MinimalistCollectionHolderFromArray(AB,),)   .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf2,),)
            test("late minimalist collection holder (by structure)", () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new MinimalistCollectionHolder_ByStructure(AB,),).innerCollection,).toBeInstanceOf(LazyCollectionHolderOf2,),)
            test("late collection iterator",                         () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionIteratorFromArray(AB,),)           .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf2,),)
            test("late collection iterator (by structure)",          () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionIterator_ByStructure(AB,),)        .innerCollection,).toBeInstanceOf(LazyCollectionHolderOf2,),)
            test("late iterator",                                    () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new IteratorForTest(AB,),)                       .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("late iterator (by structure)",                     () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new IteratorByStructureForTest(AB,),)            .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("late iterable",                                    () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new IterableForTest(AB,),)                       .innerCollection,).toBeInstanceOf(JsIterableAsCollectionHolder,),)
        },)
        describe('3', () => {
            test("array",                                            () => expect(new LazyCollectionHolder_InnerCollectionTest(new ArrayForTest(ABC,),)                                .innerCollection,).toBeInstanceOf(ArrayAsCollectionHolder,),)
            test("array (by structure)",                             () => expect(new LazyCollectionHolder_InnerCollectionTest(new ArrayByStructureForTest(ABC,),)                     .innerCollection,).toBeInstanceOf(ArrayAsCollectionHolder,),)
            test("set",                                              () => expect(new LazyCollectionHolder_InnerCollectionTest(new SetForTest(ABC,),)                                  .innerCollection,).toBeInstanceOf(SetAsCollectionHolder,),)
            test("set (by structure)",                               () => expect(new LazyCollectionHolder_InnerCollectionTest(new SetByStructureForTest(ABC,),)                       .innerCollection,).toBeInstanceOf(SetAsCollectionHolder,),)
            test("collection holder",                                () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionHolderFromArray(ABC,),)                   .innerCollection,).toBeInstanceOf(CollectionHolderFromArray,),)
            test("collection holder (by structure)",                 () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionHolder_ByStructure(ABC,),)                .innerCollection,).toBeInstanceOf(CollectionHolder_ByStructure,),)
            test("minimalist collection holder",                     () => expect(new LazyCollectionHolder_InnerCollectionTest(new MinimalistCollectionHolderFromArray(ABC,),)         .innerCollection,).toBeInstanceOf(MinimalistAsCollectionHolder,),)
            test("minimalist collection holder (by structure)",      () => expect(new LazyCollectionHolder_InnerCollectionTest(new MinimalistCollectionHolder_ByStructure(ABC,),)      .innerCollection,).toBeInstanceOf(MinimalistAsCollectionHolder,),)
            test("collection iterator",                              () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionIteratorFromArray(ABC,),)                 .innerCollection,).toBeInstanceOf(IteratorAsCollectionHolder,),)
            test("collection iterator (by structure)",               () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionIterator_ByStructure(ABC,),)              .innerCollection,).toBeInstanceOf(IteratorAsCollectionHolder,),)
            test("iterator",                                         () => expect(new LazyCollectionHolder_InnerCollectionTest(new IteratorForTest(ABC,),)                             .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("iterator (by structure)",                          () => expect(new LazyCollectionHolder_InnerCollectionTest(new IteratorByStructureForTest(ABC,),)                  .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("iterable",                                         () => expect(new LazyCollectionHolder_InnerCollectionTest(new IterableForTest(ABC,),)                             .innerCollection,).toBeInstanceOf(JsIterableAsCollectionHolder,),)
            test("late array",                                       () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new ArrayForTest(ABC,),)                          .innerCollection,).toBeInstanceOf(ArrayAsCollectionHolder,),)
            test("late array (by structure)",                        () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new ArrayByStructureForTest(ABC,),)               .innerCollection,).toBeInstanceOf(ArrayAsCollectionHolder,),)
            test("late set",                                         () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new SetForTest(ABC,),)                            .innerCollection,).toBeInstanceOf(SetAsCollectionHolder,),)
            test("late set (by structure)",                          () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new SetByStructureForTest(ABC,),)                 .innerCollection,).toBeInstanceOf(SetAsCollectionHolder,),)
            test("late collection holder",                           () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionHolderFromArray(ABC,),)             .innerCollection,).toBeInstanceOf(CollectionHolderFromArray,),)
            test("late collection holder (by structure)",            () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionHolder_ByStructure(ABC,),)          .innerCollection,).toBeInstanceOf(CollectionHolder_ByStructure,),)
            test("late minimalist collection holder",                () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new MinimalistCollectionHolderFromArray(ABC,),)   .innerCollection,).toBeInstanceOf(MinimalistAsCollectionHolder,),)
            test("late minimalist collection holder (by structure)", () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new MinimalistCollectionHolder_ByStructure(ABC,),).innerCollection,).toBeInstanceOf(MinimalistAsCollectionHolder,),)
            test("late collection iterator",                         () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionIteratorFromArray(ABC,),)           .innerCollection,).toBeInstanceOf(IteratorAsCollectionHolder,),)
            test("late collection iterator (by structure)",          () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionIterator_ByStructure(ABC,),)        .innerCollection,).toBeInstanceOf(IteratorAsCollectionHolder,),)
            test("late iterator",                                    () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new IteratorForTest(ABC,),)                       .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("late iterator (by structure)",                     () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new IteratorByStructureForTest(ABC,),)            .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("late iterable",                                    () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new IterableForTest(ABC,),)                       .innerCollection,).toBeInstanceOf(JsIterableAsCollectionHolder,),)
        },)
        describe('4', () => {
            test("array",                                            () => expect(new LazyCollectionHolder_InnerCollectionTest(new ArrayForTest(ABCD,),)                                .innerCollection,).toBeInstanceOf(ArrayAsCollectionHolder,),)
            test("array (by structure)",                             () => expect(new LazyCollectionHolder_InnerCollectionTest(new ArrayByStructureForTest(ABCD,),)                     .innerCollection,).toBeInstanceOf(ArrayAsCollectionHolder,),)
            test("set",                                              () => expect(new LazyCollectionHolder_InnerCollectionTest(new SetForTest(ABCD,),)                                  .innerCollection,).toBeInstanceOf(SetAsCollectionHolder,),)
            test("set (by structure)",                               () => expect(new LazyCollectionHolder_InnerCollectionTest(new SetByStructureForTest(ABCD,),)                       .innerCollection,).toBeInstanceOf(SetAsCollectionHolder,),)
            test("collection holder",                                () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionHolderFromArray(ABCD,),)                   .innerCollection,).toBeInstanceOf(CollectionHolderFromArray,),)
            test("collection holder (by structure)",                 () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionHolder_ByStructure(ABCD,),)                .innerCollection,).toBeInstanceOf(CollectionHolder_ByStructure,),)
            test("minimalist collection holder",                     () => expect(new LazyCollectionHolder_InnerCollectionTest(new MinimalistCollectionHolderFromArray(ABCD,),)         .innerCollection,).toBeInstanceOf(MinimalistAsCollectionHolder,),)
            test("minimalist collection holder (by structure)",      () => expect(new LazyCollectionHolder_InnerCollectionTest(new MinimalistCollectionHolder_ByStructure(ABCD,),)      .innerCollection,).toBeInstanceOf(MinimalistAsCollectionHolder,),)
            test("collection iterator",                              () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionIteratorFromArray(ABCD,),)                 .innerCollection,).toBeInstanceOf(IteratorAsCollectionHolder,),)
            test("collection iterator (by structure)",               () => expect(new LazyCollectionHolder_InnerCollectionTest(new CollectionIterator_ByStructure(ABCD,),)              .innerCollection,).toBeInstanceOf(IteratorAsCollectionHolder,),)
            test("iterator",                                         () => expect(new LazyCollectionHolder_InnerCollectionTest(new IteratorForTest(ABCD,),)                             .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("iterator (by structure)",                          () => expect(new LazyCollectionHolder_InnerCollectionTest(new IteratorByStructureForTest(ABCD,),)                  .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("iterable",                                         () => expect(new LazyCollectionHolder_InnerCollectionTest(new IterableForTest(ABCD,),)                             .innerCollection,).toBeInstanceOf(JsIterableAsCollectionHolder,),)
            test("late array",                                       () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new ArrayForTest(ABCD,),)                          .innerCollection,).toBeInstanceOf(ArrayAsCollectionHolder,),)
            test("late array (by structure)",                        () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new ArrayByStructureForTest(ABCD,),)               .innerCollection,).toBeInstanceOf(ArrayAsCollectionHolder,),)
            test("late set",                                         () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new SetForTest(ABCD,),)                            .innerCollection,).toBeInstanceOf(SetAsCollectionHolder,),)
            test("late set (by structure)",                          () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new SetByStructureForTest(ABCD,),)                 .innerCollection,).toBeInstanceOf(SetAsCollectionHolder,),)
            test("late collection holder",                           () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionHolderFromArray(ABCD,),)             .innerCollection,).toBeInstanceOf(CollectionHolderFromArray,),)
            test("late collection holder (by structure)",            () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionHolder_ByStructure(ABCD,),)          .innerCollection,).toBeInstanceOf(CollectionHolder_ByStructure,),)
            test("late minimalist collection holder",                () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new MinimalistCollectionHolderFromArray(ABCD,),)   .innerCollection,).toBeInstanceOf(MinimalistAsCollectionHolder,),)
            test("late minimalist collection holder (by structure)", () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new MinimalistCollectionHolder_ByStructure(ABCD,),).innerCollection,).toBeInstanceOf(MinimalistAsCollectionHolder,),)
            test("late collection iterator",                         () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionIteratorFromArray(ABCD,),)           .innerCollection,).toBeInstanceOf(IteratorAsCollectionHolder,),)
            test("late collection iterator (by structure)",          () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new CollectionIterator_ByStructure(ABCD,),)        .innerCollection,).toBeInstanceOf(IteratorAsCollectionHolder,),)
            test("late iterator",                                    () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new IteratorForTest(ABCD,),)                       .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("late iterator (by structure)",                     () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new IteratorByStructureForTest(ABCD,),)            .innerCollection,).toBeInstanceOf(JsIteratorAsCollectionHolder,),)
            test("late iterable",                                    () => expect(new LazyCollectionHolder_InnerCollectionTest(() => new IterableForTest(ABCD,),)                       .innerCollection,).toBeInstanceOf(JsIterableAsCollectionHolder,),)
        },)
    },)
    describe("LazyCollectionHolderOf0Or1", () => {
        test('0', () => expect(new LazyCollectionHolderOf0Or1_InnerCollectionTest(() => EmptyOptional.get,).innerCollection,) .toBe(EmptyCollectionHolder.get,),)
        test('1', () => expect(new LazyCollectionHolderOf0Or1_InnerCollectionTest(() => new Optional('a',),).innerCollection,).toBeInstanceOf(CollectionHolderOf1,),)
    },)
    describe("LazyCollectionHolderOf1Or2", () => {
        test('1', () => expect(new LazyCollectionHolderOf1Or2_InnerCollectionTest(() => new Couple('a', EmptyOptional.get,),) .innerCollection,).toBeInstanceOf(CollectionHolderOf1,),)
        test('2', () => expect(new LazyCollectionHolderOf1Or2_InnerCollectionTest(() => new Couple('a', new Optional('b',),),).innerCollection,).toBeInstanceOf(CollectionHolderOf2,),)
    },)
    describe("LazyCollectionHolderOf0Or1Or2", () => {
        test("null",                         () => expect(new LazyCollectionHolderOf0Or1Or2_InnerCollectionTest(() => null,)                                                              .innerCollection,).toBe(EmptyCollectionHolder.get,),)
        test("undefined",                    () => expect(new LazyCollectionHolderOf0Or1Or2_InnerCollectionTest(() => undefined,)                                                         .innerCollection,).toBe(EmptyCollectionHolder.get,),)
        test("empty optional",               () => expect(new LazyCollectionHolderOf0Or1Or2_InnerCollectionTest(() => EmptyOptional.get,)                                                 .innerCollection,).toBe(EmptyCollectionHolder.get,),)
        test("couple (only empty)",          () => expect(new LazyCollectionHolderOf0Or1Or2_InnerCollectionTest(() => new Couple(EmptyOptional.get, EmptyOptional.get,),)                 .innerCollection,).toBe(EmptyCollectionHolder.get,),)
        test("optional couple (only empty)", () => expect(new LazyCollectionHolderOf0Or1Or2_InnerCollectionTest(() => new Optional(new Couple(EmptyOptional.get, EmptyOptional.get,),),)  .innerCollection,).toBe(EmptyCollectionHolder.get,),)
        test("couple (1 before)",            () => expect(new LazyCollectionHolderOf0Or1Or2_InnerCollectionTest(() => new Couple(new Optional('a',), EmptyOptional.get,),)                .innerCollection,).toBeInstanceOf(CollectionHolderOf1,),)
        test("optional couple (1 before)",   () => expect(new LazyCollectionHolderOf0Or1Or2_InnerCollectionTest(() => new Optional(new Couple(new Optional('a',), EmptyOptional.get,),),) .innerCollection,).toBeInstanceOf(CollectionHolderOf1,),)
        test("couple (1 after)",             () => expect(new LazyCollectionHolderOf0Or1Or2_InnerCollectionTest(() => new Couple(EmptyOptional.get, new Optional('a',),),)                .innerCollection,).toBeInstanceOf(CollectionHolderOf1,),)
        test("optional couple (1 after)",    () => expect(new LazyCollectionHolderOf0Or1Or2_InnerCollectionTest(() => new Optional(new Couple(EmptyOptional.get, new Optional('a',),),),) .innerCollection,).toBeInstanceOf(CollectionHolderOf1,),)
        test("couple (2)",                   () => expect(new LazyCollectionHolderOf0Or1Or2_InnerCollectionTest(() => new Couple(new Optional('a',), new Optional('b',),),)               .innerCollection,).toBeInstanceOf(CollectionHolderOf2,),)
        test("optional couple (2)",          () => expect(new LazyCollectionHolderOf0Or1Or2_InnerCollectionTest(() => new Optional(new Couple(new Optional('a',), new Optional('b',),),),).innerCollection,).toBeInstanceOf(CollectionHolderOf2,),)
    },)

},)
