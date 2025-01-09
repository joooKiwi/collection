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

import {CollectionHandlerByIterable} from "../../src/handler/CollectionHandlerByIterable"
import {CollectionHolderFromArray}   from "../instance/CollectionHolderFromArray"
import {IterableForTest}             from "../instance/IterableForTest"

export function newIterableHandler<const T, >(array: readonly T[],
                                              collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByIterable<T>(collection, new IterableForTest(array,),)
}
