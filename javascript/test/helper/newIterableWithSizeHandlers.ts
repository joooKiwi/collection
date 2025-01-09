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

import {CollectionHandlerByIterableWithSize}    from "../../src/handler/CollectionHandlerByIterableWithSize"
import {CollectionHandlerByIterableWithSizeOf1} from "../../src/handler/CollectionHandlerByIterableWithSizeOf1"
import {CollectionHandlerByIterableWithSizeOf2} from "../../src/handler/CollectionHandlerByIterableWithSizeOf2"
import {CollectionHolderFromArray}              from "../instance/CollectionHolderFromArray"
import {IterableForTest}                        from "../instance/IterableForTest"
import {A, AB}                                  from "../value/arrays"

export function newIterableWithSizeHandler<const T, >(array: readonly T[],
                                                      collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByIterableWithSize<T>(collection, new IterableForTest(array,), array.length,)
}

export function newIterableWithSizeOf1Handler<const T = 'a', >(array: readonly T[] = A as unknown as readonly T[],
                                                               collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByIterableWithSizeOf1(collection, new IterableForTest(array,), array.length,)
}

export function newIterableWithSizeOf2Handler<const T = | 'a' | 'b', >(array: readonly T[] = AB as unknown as readonly T[],
                                                                       collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByIterableWithSizeOf2(collection, new IterableForTest(array,), array.length,)
}
