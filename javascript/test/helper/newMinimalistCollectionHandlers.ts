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

import {CollectionHandlerByMinimalistCollectionHolder}    from "../../src/handler/CollectionHandlerByMinimalistCollectionHolder"
import {CollectionHandlerByMinimalistCollectionHolderOf1} from "../../src/handler/CollectionHandlerByMinimalistCollectionHolderOf1"
import {CollectionHandlerByMinimalistCollectionHolderOf2} from "../../src/handler/CollectionHandlerByMinimalistCollectionHolderOf2"
import {MinimalistCollectionHolderFromArray}              from "../instance/MinimalistCollectionHolderFromArray"
import {CollectionHolderFromArray}                        from "../instance/CollectionHolderFromArray"
import {A, AB}                                            from "../value/arrays"

export function newMinimalistCollectionHandler<const T, >(array: readonly T[],
                                                          collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByMinimalistCollectionHolder<T>(collection, new MinimalistCollectionHolderFromArray(array,),)
}

export function newMinimalistCollectionOf1Handler<const T = 'a', >(array: readonly T[] = A as unknown as readonly T[],
                                                                   collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByMinimalistCollectionHolderOf1(collection, new MinimalistCollectionHolderFromArray(array,), array.length,)
}

export function newMinimalistCollectionOf2Handler<const T = | 'a' | 'b'>(array: readonly T[] = AB as unknown as readonly T[],
                                                                         collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByMinimalistCollectionHolderOf2(collection, new MinimalistCollectionHolderFromArray(array,), array.length,)
}
