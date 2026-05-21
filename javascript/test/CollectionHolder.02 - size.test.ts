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
import {every0Instances, every1Instances, every2Instances, everyExtensionMethodInstances, everyNInstances} from "./value/instances"

import {EmptyCollectionHolder}                                                                                                                                       from "../src/EmptyCollectionHolder"
import {containsAtLeast1Element, containsAtLeast1ElementByArray, containsAtLeast1ElementByCollectionHolder, containsAtLeast1ElementByMinimalistCollectionHolder}     from "../src/method/containsAtLeast1Element"
import {containsAtLeast2Elements, containsAtLeast2ElementsByArray, containsAtLeast2ElementsByCollectionHolder, containsAtLeast2ElementsByMinimalistCollectionHolder} from "../src/method/containsAtLeast2Elements"
import {containsAtMost1Element, containsAtMost1ElementByArray, containsAtMost1ElementByCollectionHolder, containsAtMost1ElementByMinimalistCollectionHolder}         from "../src/method/containsAtMost1Element"
import {containsAtMost2Elements, containsAtMost2ElementsByArray, containsAtMost2ElementsByCollectionHolder, containsAtMost2ElementsByMinimalistCollectionHolder}     from "../src/method/containsAtMost2Elements"
import {containsExactly1Element, containsExactly1ElementByArray, containsExactly1ElementByCollectionHolder, containsExactly1ElementByMinimalistCollectionHolder}     from "../src/method/containsExactly1Element"
import {containsExactly2Elements, containsExactly2ElementsByArray, containsExactly2ElementsByCollectionHolder, containsExactly2ElementsByMinimalistCollectionHolder} from "../src/method/containsExactly2Elements"
import * as isNotEmptyModule                                                                                                                                         from "../src/method/isNotEmpty"
import {hasAtLeast1Element, hasAtLeast1ElementByArray, hasAtLeast1ElementByCollectionHolder, hasAtLeast1ElementByMinimalistCollectionHolder}                         from "../src/method/hasAtLeast1Element"
import * as hasAtLeast2ElementsModule                                                                                                                                from "../src/method/hasAtLeast2Elements"
import * as hasAtMost1ElementModule                                                                                                                                  from "../src/method/hasAtMost1Element"
import * as hasAtMost2ElementsModule                                                                                                                                 from "../src/method/hasAtMost2Elements"
import * as hasExactly1ElementModule                                                                                                                                 from "../src/method/hasExactly1Element"
import * as hasExactly2ElementsModule                                                                                                                                from "../src/method/hasExactly2Elements"
import {includesAtLeast1Element, includesAtLeast1ElementByArray, includesAtLeast1ElementByCollectionHolder, includesAtLeast1ElementByMinimalistCollectionHolder}     from "../src/method/includesAtLeast1Element"
import {includesAtLeast2Elements, includesAtLeast2ElementsByArray, includesAtLeast2ElementsByCollectionHolder, includesAtLeast2ElementsByMinimalistCollectionHolder} from "../src/method/includesAtLeast2Elements"
import {includesAtMost1Element, includesAtMost1ElementByArray, includesAtMost1ElementByCollectionHolder, includesAtMost1ElementByMinimalistCollectionHolder}         from "../src/method/includesAtMost1Element"
import {includesAtMost2Elements, includesAtMost2ElementsByArray, includesAtMost2ElementsByCollectionHolder, includesAtMost2ElementsByMinimalistCollectionHolder}     from "../src/method/includesAtMost2Elements"
import {includesExactly1Element, includesExactly1ElementByArray, includesExactly1ElementByCollectionHolder, includesExactly1ElementByMinimalistCollectionHolder}     from "../src/method/includesExactly1Element"
import {includesExactly2Elements, includesExactly2ElementsByArray, includesExactly2ElementsByCollectionHolder, includesExactly2ElementsByMinimalistCollectionHolder} from "../src/method/includesExactly2Elements"

describe("CollectionHolderTest (size)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("size",                      () => expect(instance.size,).toBe(0,),)
        test("length",                    () => expect(instance.length,).toBe(0,),)
        test("count",                     () => expect(instance.count,).toBe(0,),)
        test("isEmpty",                   () => expect(instance.isEmpty,).toBeTrue(),)
        test("isNotEmpty",                () => expect(instance.isNotEmpty,).toBeFalse(),)
        test("hasAtLeast1Element",        () => expect(instance.hasAtLeast1Element,).toBeFalse(),)
        test("containsAtLeast1Element",   () => expect(instance.containsAtLeast1Element,).toBeFalse(),)
        test("includesAtLeast1Element",   () => expect(instance.includesAtLeast1Element,).toBeFalse(),)
        test("hasExactly1Element",        () => expect(instance.hasExactly1Element,).toBeFalse(),)
        test("containsExactly1Element",   () => expect(instance.containsExactly1Element,).toBeFalse(),)
        test("includesExactly1Element",   () => expect(instance.includesExactly1Element,).toBeFalse(),)
        test("hasAtMost1Element",         () => expect(instance.hasAtMost1Element,).toBeTrue(),)
        test("containsAtMost1Element",    () => expect(instance.containsAtMost1Element,).toBeTrue(),)
        test("includesAtMost1Element",    () => expect(instance.includesAtMost1Element,).toBeTrue(),)
        test("hasAtLeast2Elements",       () => expect(instance.hasAtLeast2Elements,).toBeFalse(),)
        test("containsAtLeast2Elements",  () => expect(instance.containsAtLeast2Elements,).toBeFalse(),)
        test("includesAtLeast2Elements",  () => expect(instance.includesAtLeast2Elements,).toBeFalse(),)
        test("hasExactly2Elements",       () => expect(instance.hasExactly2Elements,).toBeFalse(),)
        test("containsExactly2Elements",  () => expect(instance.containsExactly2Elements,).toBeFalse(),)
        test("includesExactly2Elements",  () => expect(instance.includesExactly2Elements,).toBeFalse(),)
        test("hasAtMost2Elements",        () => expect(instance.hasAtMost2Elements,).toBeTrue(),)
        test("containsAtMost2Elements",   () => expect(instance.containsAtMost2Elements,).toBeTrue(),)
        test("includesAtMost2Elements",   () => expect(instance.includesAtMost2Elements,).toBeTrue(),)
    },)

    describe("aliases", () => {
        describe("ArrayAsCollectionHolder", () => {
            test("length",                   () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_AdaptorOfArrayFollower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("ArrayOf1AsCollectionHolder", () => {
            test("length",                   () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_ArrayOf1Follower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("ArrayOf2AsCollectionHolder", () => {
            test("length",                   () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_ArrayOf2Follower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("CollectionHolderOf1", () => {
            test("length",                   () => expect(new CollectionHolder_1Follower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_1Follower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_1Follower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_1Follower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_1Follower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_1Follower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_1Follower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_1Follower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_1Follower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_1Follower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_1Follower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_1Follower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_1Follower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_1Follower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_1Follower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("CollectionHolderOf2", () => {
            test("length",                   () => expect(new CollectionHolder_2Follower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_2Follower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_2Follower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_2Follower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_2Follower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_2Follower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_2Follower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_2Follower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_2Follower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_2Follower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_2Follower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_2Follower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_2Follower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_2Follower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_2Follower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("CollectionViewer", () => {
            test("length",                   () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_ByViewerFollower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("GenericCollectionHolder", () => {
            test("length",                   () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("IteratorAsCollectionHolder", () => {
            test("length",                   () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_AdaptorOfIteratorFollower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("JsIterableAsCollectionHolder", () => {
            test("length",                   () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("JsIteratorAsCollectionHolder", () => {
            test("length",                   () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("LazyCollectionHolder", () => {
            test("length",                   () => expect(new CollectionHolder_LazyFollower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_LazyFollower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_LazyFollower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_LazyFollower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_LazyFollower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_LazyFollower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_LazyFollower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_LazyFollower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_LazyFollower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_LazyFollower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_LazyFollower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_LazyFollower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_LazyFollower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_LazyFollower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_LazyFollower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("LazyCollectionHolderOf0Or1", () => {
            test("length",                   () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_LazyOf0Or1Follower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("LazyCollectionHolderOf0Or1Or2", () => {
            test("length",                   () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_LazyOf0Or1Or2Follower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("LazyCollectionHolderOf1", () => {
            test("length",                   () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_LazyOf1Follower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("LazyCollectionHolderOf1Or2", () => {
            test("length",                   () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_LazyOf1Or2Follower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("LazyCollectionHolderOf2", () => {
            test("length",                   () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_LazyOf2Follower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("MinimalistAsCollectionHolder", () => {
            test("length",                   () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("SetAsCollectionHolder", () => {
            test("length",                   () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_AdaptorOfSetFollower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("SetOf1AsCollectionHolder", () => {
            test("length",                   () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_SetOf1Follower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)
        describe("SetOf2AsCollectionHolder", () => {
            test("length",                   () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.length,)                  .size_amountOfCall,)               .toBe(1,),)
            test("count",                    () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.count,)                   .size_amountOfCall,)               .toBe(1,),)
            test("hasAtLeast1Element",       () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.hasAtLeast1Element,)      .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsAtLeast1Element",  () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.containsAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("includesAtLeast1Element",  () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.includesAtLeast1Element,) .isNotEmpty_amountOfCall,)         .toBe(1,),)
            test("containsExactly1Element",  () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.containsExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("includesExactly1Element",  () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.includesExactly1Element,) .hasExactly1Element_amountOfCall,) .toBe(1,),)
            test("containsAtMost1Element",   () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.containsAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("includesAtMost1Element",   () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.includesAtMost1Element,)  .hasAtMost1Element_amountOfCall,)  .toBe(1,),)
            test("containsAtLeast2Elements", () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.containsAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("includesAtLeast2Elements", () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.includesAtLeast2Elements,).hasAtLeast2Elements_amountOfCall,).toBe(1,),)
            test("containsExactly2Elements", () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.containsExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("includesExactly2Elements", () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.includesExactly2Elements,).hasExactly2Elements_amountOfCall,).toBe(1,),)
            test("containsAtMost2Elements",  () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.containsAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
            test("includesAtMost2Elements",  () => expect(new CollectionHolder_SetOf2Follower().execute(it => it.includesAtMost2Elements,) .hasAtMost2Elements_amountOfCall,) .toBe(1,),)
        },)

        describe("hasAtLeast1Element", () => {
            test("all", () => {
                const method = jest.spyOn(isNotEmptyModule, "isNotEmpty",)
                hasAtLeast1Element(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(isNotEmptyModule, "isNotEmptyByMinimalistCollectionHolder",)
                hasAtLeast1ElementByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(isNotEmptyModule, "isNotEmptyByCollectionHolder",)
                hasAtLeast1ElementByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(isNotEmptyModule, "isNotEmptyByArray",)
                hasAtLeast1ElementByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("containsAtLeast1Element", () => {
            test("all", () => {
                const method = jest.spyOn(isNotEmptyModule, "isNotEmpty",)
                containsAtLeast1Element(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(isNotEmptyModule, "isNotEmptyByMinimalistCollectionHolder",)
                containsAtLeast1ElementByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(isNotEmptyModule, "isNotEmptyByCollectionHolder",)
                containsAtLeast1ElementByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(isNotEmptyModule, "isNotEmptyByArray",)
                containsAtLeast1ElementByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAtLeast1Element", () => {
            test("all", () => {
                const method = jest.spyOn(isNotEmptyModule, "isNotEmpty",)
                includesAtLeast1Element(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(isNotEmptyModule, "isNotEmptyByMinimalistCollectionHolder",)
                includesAtLeast1ElementByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(isNotEmptyModule, "isNotEmptyByCollectionHolder",)
                includesAtLeast1ElementByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(isNotEmptyModule, "isNotEmptyByArray",)
                includesAtLeast1ElementByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("containsExactly1Element", () => {
            test("all", () => {
                const method = jest.spyOn(hasExactly1ElementModule, "hasExactly1Element",)
                containsExactly1Element(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasExactly1ElementModule, "hasExactly1ElementByMinimalistCollectionHolder",)
                containsExactly1ElementByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasExactly1ElementModule, "hasExactly1ElementByCollectionHolder",)
                containsExactly1ElementByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasExactly1ElementModule, "hasExactly1ElementByArray",)
                containsExactly1ElementByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesExactly1Element", () => {
            test("all", () => {
                const method = jest.spyOn(hasExactly1ElementModule, "hasExactly1Element",)
                includesExactly1Element(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasExactly1ElementModule, "hasExactly1ElementByMinimalistCollectionHolder",)
                includesExactly1ElementByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasExactly1ElementModule, "hasExactly1ElementByCollectionHolder",)
                includesExactly1ElementByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasExactly1ElementModule, "hasExactly1ElementByArray",)
                includesExactly1ElementByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("containsAtMost1Element", () => {
            test("all", () => {
                const method = jest.spyOn(hasAtMost1ElementModule, "hasAtMost1Element",)
                containsAtMost1Element(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAtMost1ElementModule, "hasAtMost1ElementByMinimalistCollectionHolder",)
                containsAtMost1ElementByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAtMost1ElementModule, "hasAtMost1ElementByCollectionHolder",)
                containsAtMost1ElementByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAtMost1ElementModule, "hasAtMost1ElementByArray",)
                containsAtMost1ElementByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAtMost1Element", () => {
            test("all", () => {
                const method = jest.spyOn(hasAtMost1ElementModule, "hasAtMost1Element",)
                includesAtMost1Element(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAtMost1ElementModule, "hasAtMost1ElementByMinimalistCollectionHolder",)
                includesAtMost1ElementByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAtMost1ElementModule, "hasAtMost1ElementByCollectionHolder",)
                includesAtMost1ElementByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAtMost1ElementModule, "hasAtMost1ElementByArray",)
                includesAtMost1ElementByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("containsAtLeast2Elements", () => {
            test("all", () => {
                const method = jest.spyOn(hasAtLeast2ElementsModule, "hasAtLeast2Elements",)
                containsAtLeast2Elements(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAtLeast2ElementsModule, "hasAtLeast2ElementsByMinimalistCollectionHolder",)
                containsAtLeast2ElementsByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAtLeast2ElementsModule, "hasAtLeast2ElementsByCollectionHolder",)
                containsAtLeast2ElementsByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAtLeast2ElementsModule, "hasAtLeast2ElementsByArray",)
                containsAtLeast2ElementsByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAtLeast2Elements", () => {
            test("all", () => {
                const method = jest.spyOn(hasAtLeast2ElementsModule, "hasAtLeast2Elements",)
                includesAtLeast2Elements(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAtLeast2ElementsModule, "hasAtLeast2ElementsByMinimalistCollectionHolder",)
                includesAtLeast2ElementsByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAtLeast2ElementsModule, "hasAtLeast2ElementsByCollectionHolder",)
                includesAtLeast2ElementsByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAtLeast2ElementsModule, "hasAtLeast2ElementsByArray",)
                includesAtLeast2ElementsByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("containsExactly2Elements", () => {
            test("all", () => {
                const method = jest.spyOn(hasExactly2ElementsModule, "hasExactly2Elements",)
                containsExactly2Elements(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasExactly2ElementsModule, "hasExactly2ElementsByMinimalistCollectionHolder",)
                containsExactly2ElementsByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasExactly2ElementsModule, "hasExactly2ElementsByCollectionHolder",)
                containsExactly2ElementsByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasExactly2ElementsModule, "hasExactly2ElementsByArray",)
                containsExactly2ElementsByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesExactly2Elements", () => {
            test("all", () => {
                const method = jest.spyOn(hasExactly2ElementsModule, "hasExactly2Elements",)
                includesExactly2Elements(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasExactly2ElementsModule, "hasExactly2ElementsByMinimalistCollectionHolder",)
                includesExactly2ElementsByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasExactly2ElementsModule, "hasExactly2ElementsByCollectionHolder",)
                includesExactly2ElementsByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasExactly2ElementsModule, "hasExactly2ElementsByArray",)
                includesExactly2ElementsByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)

        describe("containsAtMost2Elements", () => {
            test("all", () => {
                const method = jest.spyOn(hasAtMost2ElementsModule, "hasAtMost2Elements",)
                containsAtMost2Elements(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAtMost2ElementsModule, "hasAtMost2ElementsByMinimalistCollectionHolder",)
                containsAtMost2ElementsByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAtMost2ElementsModule, "hasAtMost2ElementsByCollectionHolder",)
                containsAtMost2ElementsByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAtMost2ElementsModule, "hasAtMost2ElementsByArray",)
                containsAtMost2ElementsByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
        describe("includesAtMost2Elements", () => {
            test("all", () => {
                const method = jest.spyOn(hasAtMost2ElementsModule, "hasAtMost2Elements",)
                includesAtMost2Elements(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("minimalist collection holder", () => {
                const method = jest.spyOn(hasAtMost2ElementsModule, "hasAtMost2ElementsByMinimalistCollectionHolder",)
                includesAtMost2ElementsByMinimalistCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("collection holder", () => {
                const method = jest.spyOn(hasAtMost2ElementsModule, "hasAtMost2ElementsByCollectionHolder",)
                includesAtMost2ElementsByCollectionHolder(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
            test("array", () => {
                const method = jest.spyOn(hasAtMost2ElementsModule, "hasAtMost2ElementsByArray",)
                includesAtMost2ElementsByArray(null,)
                expect(method,).toHaveBeenCalledOnce()
            },)
        },)
    },)

    describe("methods", () => {
    describe.each(everyExtensionMethodInstances,)("%s", ({value: {instance,},},) => {
        test("isEmpty",             () => expect(instance.isEmpty,)            .toBeTrue(),)
        test("isNotEmpty",          () => expect(instance.isNotEmpty,)         .toBeFalse(),)
        test("hasExactly1Element",  () => expect(instance.hasExactly1Element,) .toBeFalse(),)
        test("hasAtMost1Element",   () => expect(instance.hasAtMost1Element,)  .toBeTrue(),)
        test("hasAtLeast2Elements", () => expect(instance.hasAtLeast2Elements,).toBeFalse(),)
        test("hasExactly2Elements", () => expect(instance.hasExactly2Elements,).toBeFalse(),)
        test("hasAtMost2Elements",  () => expect(instance.hasAtMost2Elements,) .toBeTrue(),)
    },)},)

    describe("instances", () => {
        describe("empty", () => {
            describe.each(every0Instances,)("%s", ({value: {newInstance,},},) => {
                test("size",                () => expect(newInstance().size,)               .toBe(0,),)
                test("isEmpty",             () => expect(newInstance().isEmpty,)            .toBeTrue(),)
                test("isNotEmpty",          () => expect(newInstance().isNotEmpty,)         .toBeFalse(),)
                test("hasExactly1Element",  () => expect(newInstance().hasExactly1Element,) .toBeFalse(),)
                test("hasAtMost1Element",   () => expect(newInstance().hasAtMost1Element,)  .toBeTrue(),)
                test("hasAtLeast2Elements", () => expect(newInstance().hasAtLeast2Elements,).toBeFalse(),)
                test("hasExactly2Elements", () => expect(newInstance().hasExactly2Elements,).toBeFalse(),)
                test("hasAtMost2Elements",  () => expect(newInstance().hasAtMost2Elements,) .toBeTrue(),)
            },)
        },)
        describe("1 field", () => {
            const value = Symbol("1 field: value",)
            describe.each(every1Instances,)("%s", ({value: {newInstance,},},) => {
                test("size",                () => expect(newInstance(value,).size,)               .toBe(1,),)
                test("isEmpty",             () => expect(newInstance(value,).isEmpty,)            .toBeFalse(),)
                test("isNotEmpty",          () => expect(newInstance(value,).isNotEmpty,)         .toBeTrue(),)
                test("hasExactly1Element",  () => expect(newInstance(value,).hasExactly1Element,) .toBeTrue(),)
                test("hasAtMost1Element",   () => expect(newInstance(value,).hasAtMost1Element,)  .toBeTrue(),)
                test("hasAtLeast2Elements", () => expect(newInstance(value,).hasAtLeast2Elements,).toBeFalse(),)
                test("hasExactly2Elements", () => expect(newInstance(value,).hasExactly2Elements,).toBeFalse(),)
                test("hasAtMost2Elements",  () => expect(newInstance(value,).hasAtMost2Elements,) .toBeTrue(),)
            },)
        },)
        describe("2 fields", () => {
            const value2 = Symbol("2 fields: 1st value",)
            const value1 = Symbol("2 fields: 2nd value",)
            describe.each(every2Instances,)("%s", ({value: {newInstance,},},) => {
                test("size",                () => expect(newInstance(value1, value2,).size,)               .toBe(2,),)
                test("isEmpty",             () => expect(newInstance(value1, value2,).isEmpty,)            .toBeFalse(),)
                test("isNotEmpty",          () => expect(newInstance(value1, value2,).isNotEmpty,)         .toBeTrue(),)
                test("hasExactly1Element",  () => expect(newInstance(value1, value2,).hasExactly1Element,) .toBeFalse(),)
                test("hasAtMost1Element",   () => expect(newInstance(value1, value2,).hasAtMost1Element,)  .toBeFalse(),)
                test("hasAtLeast2Elements", () => expect(newInstance(value1, value2,).hasAtLeast2Elements,).toBeTrue(),)
                test("hasExactly2Elements", () => expect(newInstance(value1, value2,).hasExactly2Elements,).toBeTrue(),)
                test("hasAtMost2Elements",  () => expect(newInstance(value1, value2,).hasAtMost2Elements,) .toBeTrue(),)
            },)
        },)
        describe("N fields", () => {
            const values = [
                Symbol("4 fields: 1st value",),
                Symbol("4 fields: 2nd value",),
                Symbol("4 fields: 3rd value",),
                Symbol("4 fields: 4th value",),
            ]
            describe.each(everyNInstances,)("%s", ({value: {instance,},},) => {
                test("size",                () => expect(new instance(values,).size,)               .toBe(4,),)
                test("isEmpty",             () => expect(new instance(values,).isEmpty,)            .toBeFalse(),)
                test("isNotEmpty",          () => expect(new instance(values,).isNotEmpty,)         .toBeTrue(),)
                test("hasExactly1Element",  () => expect(new instance(values,).hasExactly1Element,) .toBeFalse(),)
                test("hasAtMost1Element",   () => expect(new instance(values,).hasAtMost1Element,)  .toBeFalse(),)
                test("hasAtLeast2Elements", () => expect(new instance(values,).hasAtLeast2Elements,).toBeTrue(),)
                test("hasExactly2Elements", () => expect(new instance(values,).hasExactly2Elements,).toBeFalse(),)
                test("hasAtMost2Elements",  () => expect(new instance(values,).hasAtMost2Elements,) .toBeFalse(),)
            },)
        },)
    },)

},)
