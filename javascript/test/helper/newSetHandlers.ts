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

import {CollectionHandlerBySet}    from "../../src/handler/CollectionHandlerBySet"
import {CollectionHandlerBySetOf1} from "../../src/handler/CollectionHandlerBySetOf1"
import {CollectionHandlerBySetOf2} from "../../src/handler/CollectionHandlerBySetOf2"
import {CollectionHolderFromArray} from "../instance/CollectionHolderFromArray"
import {A, AB}                     from "../value/arrays"

export function newSetHandler<const T, >(array: readonly T[],
                                         collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerBySet<T>(collection, new Set(array,),)
}

export function newSetOf1Handler<const T = 'a', >(array: readonly T[] = A as unknown as readonly T[],
                                                  collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerBySetOf1(collection, new Set(array,),)
}

export function newSetOf2Handler<const T = | 'a' | 'b', >(array: readonly T[] = AB as unknown as readonly T[],
                                                          collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerBySetOf2(collection, new Set(array,),)
}
