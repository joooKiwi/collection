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

import {CollectionHolder_1Follower}                     from "./instance/CollectionHolder_1.follower"
import {CollectionHolder_2Follower}                     from "./instance/CollectionHolder_2.follower"
import {CollectionHolder_AdaptorOfArrayFollower}        from "./instance/CollectionHolder_AdaptorOfArray.follower"
import {CollectionHolder_AdaptorOfIteratorFollower}     from "./instance/CollectionHolder_AdaptorOfIterator.follower"
import {CollectionHolder_AdaptorOfJsIterableFollower}   from "./instance/CollectionHolder_AdaptorOfJsIterable.follower"
import {CollectionHolder_AdaptorOfJsIteratorFollower}   from "./instance/CollectionHolder_AdaptorOfJsIterator.follower"
import {CollectionHolder_AdaptorOfMinimalistFollower}   from "./instance/CollectionHolder_AdaptorOfMinimalist.follower"
import {CollectionHolder_AdaptorOfSetFollower}          from "./instance/CollectionHolder_AdaptorOfSet.follower"
import {CollectionHolder_ArrayOf1Follower}              from "./instance/CollectionHolder_ArrayOf1.follower"
import {CollectionHolder_ArrayOf2Follower}              from "./instance/CollectionHolder_ArrayOf2.follower"
import {CollectionHolder_ByGenericCollectionFollower}   from "./instance/CollectionHolder_ByGenericCollection.follower"
import {CollectionHolder_ByViewerFollower}              from "./instance/CollectionHolder_ByViewer.follower"
import {CollectionHolder_SetOf1Follower}                from "./instance/CollectionHolder_SetOf1.follower"
import {CollectionHolder_SetOf2Follower}                from "./instance/CollectionHolder_SetOf2.follower"
import {CollectionHolder_LazyFollower}                  from "./instance/CollectionHolder_Lazy.follower"
import {CollectionHolder_LazyOf0Or1Follower}            from "./instance/CollectionHolder_LazyOf0Or1.follower"
import {CollectionHolder_LazyOf0Or1Or2Follower}         from "./instance/CollectionHolder_LazyOf0Or1Or2.follower"
import {CollectionHolder_LazyOf1Follower}               from "./instance/CollectionHolder_LazyOf1.follower"
import {CollectionHolder_LazyOf1Or2Follower}            from "./instance/CollectionHolder_LazyOf1Or2.follower"
import {CollectionHolder_LazyOf2Follower}               from "./instance/CollectionHolder_LazyOf2.follower"
import {A, AB, EMPTY}                                   from "./value/arrays"
import {emptyCollectionHolder, emptyCollectionIterator} from "./value/instances"

import {CollectionConstants}           from "../src/CollectionConstants"
import {ArrayAsCollectionHolder}       from "../src/ArrayAsCollectionHolder"
import {ArrayOf1AsCollectionHolder}    from "../src/ArrayOf1AsCollectionHolder"
import {ArrayOf2AsCollectionHolder}    from "../src/ArrayOf2AsCollectionHolder"
import {CollectionHolderOf1}           from "../src/CollectionHolderOf1"
import {CollectionHolderOf2}           from "../src/CollectionHolderOf2"
import {CollectionViewer}              from "../src/CollectionViewer"
import {GenericCollectionHolder}       from "../src/GenericCollectionHolder"
import {IteratorAsCollectionHolder}    from "../src/IteratorAsCollectionHolder"
import {JsIteratorAsCollectionHolder}  from "../src/JsIteratorAsCollectionHolder"
import {JsIterableAsCollectionHolder}  from "../src/JsIterableAsCollectionHolder"
import {LazyCollectionHolder}          from "../src/LazyCollectionHolder"
import {LazyCollectionHolderOf0Or1}    from "../src/LazyCollectionHolderOf0Or1"
import {LazyCollectionHolderOf0Or1Or2} from "../src/LazyCollectionHolderOf0Or1Or2"
import {LazyCollectionHolderOf1}       from "../src/LazyCollectionHolderOf1"
import {LazyCollectionHolderOf1Or2}    from "../src/LazyCollectionHolderOf1Or2"
import {LazyCollectionHolderOf2}       from "../src/LazyCollectionHolderOf2"
import {MinimalistAsCollectionHolder}  from "../src/MinimalistAsCollectionHolder"
import {SetAsCollectionHolder}         from "../src/SetAsCollectionHolder"
import {SetOf1AsCollectionHolder}      from "../src/SetOf1AsCollectionHolder"
import {SetOf2AsCollectionHolder}      from "../src/SetOf2AsCollectionHolder"
import {EmptyCollectionHolder}         from "../src/EmptyCollectionHolder"
import {EmptyOptional}                 from "../src/optional/EmptyOptional"
import {Couple}                        from "../src/tuple/Couple"

describe("CollectionHolderTest (javascript exclusive)", () => {

    describe("EmptyCollectionHolder", () => {
        const instance = EmptyCollectionHolder.get

        test("Symbol.toStringTag", () => expect(instance[Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
        test("Symbol.iterator",    () => expect(instance[Symbol.iterator](),).toBe(emptyCollectionIterator,),)
    },)

    describe("instances", () => {
        describe("Symbol.toStringTag", () => {
            test("GenericCollectionHolder",       () => expect(new GenericCollectionHolder(EMPTY,)                                        [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("CollectionHolderOf1",           () => expect(new CollectionHolderOf1(null,)                                             [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("CollectionHolderOf2",           () => expect(new CollectionHolderOf2(null, null,)                                       [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("ArrayAsCollectionHolder",       () => expect(new ArrayAsCollectionHolder(EMPTY,)                                        [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("ArrayOf1AsCollectionHolder",    () => expect(new ArrayOf1AsCollectionHolder(A,)                                         [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("ArrayOf2AsCollectionHolder",    () => expect(new ArrayOf2AsCollectionHolder(AB,)                                        [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("SetAsCollectionHolder",         () => expect(new SetAsCollectionHolder(new Set(),)                                      [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("SetOf1AsCollectionHolder",      () => expect(new SetOf1AsCollectionHolder(new Set(A,),)                                 [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("SetOf2AsCollectionHolder",      () => expect(new SetOf2AsCollectionHolder(new Set(AB,),)                                [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("IteratorAsCollectionHolder",    () => expect(new IteratorAsCollectionHolder(emptyCollectionIterator,)                   [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("JsIteratorAsCollectionHolder",  () => expect(new JsIteratorAsCollectionHolder(emptyCollectionIterator,)                 [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("JsIterableAsCollectionHolder",  () => expect(new JsIterableAsCollectionHolder(emptyCollectionIterator,)                 [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("MinimalistAsCollectionHolder",  () => expect(new MinimalistAsCollectionHolder(emptyCollectionHolder,)                   [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("LazyCollectionHolder",          () => expect(new LazyCollectionHolder(EMPTY,)                                           [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("LazyCollectionHolderOf1",       () => expect(new LazyCollectionHolderOf1(() => null,)                                   [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("LazyCollectionHolderOf2",       () => expect(new LazyCollectionHolderOf2(() => new Couple(null, null,),)                [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("LazyCollectionHolderOf0Or1",    () => expect(new LazyCollectionHolderOf0Or1(() => EmptyOptional.get,)                   [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("LazyCollectionHolderOf0Or1Or2", () => expect(new LazyCollectionHolderOf0Or1Or2(() => null,)                             [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("LazyCollectionHolderOf1Or2",    () => expect(new LazyCollectionHolderOf1Or2(() => new Couple(null, EmptyOptional.get,),)[Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
            test("CollectionViewer",              () => expect(new CollectionViewer(emptyCollectionHolder,)                               [Symbol.toStringTag],).toBe(CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG,),)
        },)
        describe("Symbol.iterator", () => {
            test("GenericCollectionHolder",       () => expect(new CollectionHolder_ByGenericCollectionFollower().execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("CollectionHolderOf1",           () => expect(new CollectionHolder_1Follower()                  .execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("CollectionHolderOf2",           () => expect(new CollectionHolder_2Follower()                  .execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("ArrayAsCollectionHolder",       () => expect(new CollectionHolder_AdaptorOfArrayFollower()     .execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("ArrayOf1AsCollectionHolder",    () => expect(new CollectionHolder_ArrayOf1Follower()           .execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("ArrayOf2AsCollectionHolder",    () => expect(new CollectionHolder_ArrayOf2Follower()           .execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("SetAsCollectionHolder",         () => expect(new CollectionHolder_AdaptorOfSetFollower()       .execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("SetOf1AsCollectionHolder",      () => expect(new CollectionHolder_SetOf1Follower()             .execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("SetOf2AsCollectionHolder",      () => expect(new CollectionHolder_SetOf2Follower()             .execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("IteratorAsCollectionHolder",    () => expect(new CollectionHolder_AdaptorOfIteratorFollower()  .execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("JsIteratorAsCollectionHolder",  () => expect(new CollectionHolder_AdaptorOfJsIteratorFollower().execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("JsIterableAsCollectionHolder",  () => expect(new CollectionHolder_AdaptorOfJsIterableFollower().execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("MinimalistAsCollectionHolder",  () => expect(new CollectionHolder_AdaptorOfMinimalistFollower().execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("LazyCollectionHolder",          () => expect(new CollectionHolder_LazyFollower()               .execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("LazyCollectionHolderOf1",       () => expect(new CollectionHolder_LazyOf1Follower()            .execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("LazyCollectionHolderOf2",       () => expect(new CollectionHolder_LazyOf2Follower()            .execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("LazyCollectionHolderOf0Or1",    () => expect(new CollectionHolder_LazyOf0Or1Follower()         .execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("LazyCollectionHolderOf0Or1Or2", () => expect(new CollectionHolder_LazyOf0Or1Or2Follower()      .execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("LazyCollectionHolderOf1Or2",    () => expect(new CollectionHolder_LazyOf1Or2Follower()         .execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
            test("CollectionViewer",              () => expect(new CollectionHolder_ByViewerFollower()           .execute(it => it[Symbol.iterator](),).toIterator_amountOfCall,).toBe(1,),)
        },)
    },)

},)
