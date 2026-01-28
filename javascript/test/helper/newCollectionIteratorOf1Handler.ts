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

import type {CollectionHolder} from "../../src/CollectionHolder"

import {CollectionHandlerByCollectionIteratorOf1} from "../../src/handler/CollectionHandlerByCollectionIteratorOf1"
import {GenericCollectionIterator}                from "../../src/iterator/GenericCollectionIterator"
import {CollectionHolderFromArray}                from "../instance/CollectionHolderFromArray"
import {A}                                        from "../value/arrays"

export function newCollectionIteratorOf1Handler<const T = "a", >(array: readonly T[] = A as unknown as readonly T[],
                                                                 collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByCollectionIteratorOf1(collection, new GenericCollectionIterator(new CollectionHolderFromArray(array,),), array.length,)
}
