//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
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

import {CollectionHandlerByCollectionIteratorOf2} from "../../src/handler/CollectionHandlerByCollectionIteratorOf2"
import {GenericCollectionIterator}                from "../../src/iterator/GenericCollectionIterator"
import {CollectionHolderFromArray}                from "../instance/CollectionHolderFromArray"
import {AB}                                       from "../value/arrays"

export function newCollectionIteratorOf2Handler<const T = | "a" | "b", >(array: readonly T[] = AB as unknown as readonly T[],
                                                                         collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByCollectionIteratorOf2(collection, new GenericCollectionIterator(new CollectionHolderFromArray(array,),), array.length,)
}
