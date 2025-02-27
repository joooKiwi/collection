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

import {CollectionHandlerByCollectionHolderOf2} from "../../src/handler/CollectionHandlerByCollectionHolderOf2"
import {CollectionHolderFromArray}              from "../instance/CollectionHolderFromArray"
import {AB}                                     from "../value/arrays"

export function newCollectionOf2Handler<const T = | "a" | "b", >(array: readonly T[] = AB as unknown as readonly T[],
                                                                 collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByCollectionHolderOf2(collection, new CollectionHolderFromArray(array,), array.length,)
}
