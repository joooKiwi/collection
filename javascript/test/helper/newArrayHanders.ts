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

import {CollectionHolderFromArray} from "../instance/CollectionHolderFromArray"
import {A, AB}                     from "../value/arrays"

import {CollectionHolder}            from "../../src/CollectionHolder"
import {CollectionHandlerByArray}    from "../../src/handler/CollectionHandlerByArray"
import {CollectionHandlerByArrayOf1} from "../../src/handler/CollectionHandlerByArrayOf1"
import {CollectionHandlerByArrayOf2} from "../../src/handler/CollectionHandlerByArrayOf2"

export function newArrayHandler<const T, >(array: readonly T[],
                                           collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByArray<T>(collection, array,)
}

export function newArrayOf1Handler<const T = 'a', >(array: readonly T[] = A as unknown as readonly T[],
                                                    collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByArrayOf1(collection, array,)
}

export function newArrayOf2Handler<const T = | 'a' | 'b', >(array: readonly T[] = AB as unknown as readonly T[],
                                                            collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByArrayOf2(collection, array,)
}
