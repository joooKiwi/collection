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

import {CollectionHandlerByIterableWithSize} from "../../src/handler/CollectionHandlerByIterableWithSize"
import {CollectionHolderFromArray}           from "../instance/CollectionHolderFromArray"
import {IterableForTest}                     from "../instance/IterableForTest"

export function newIterableWithSizeHandler<const T, >(array: readonly T[],
                                                      collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByIterableWithSize<T>(collection, new IterableForTest(array,), array.length,)
}
