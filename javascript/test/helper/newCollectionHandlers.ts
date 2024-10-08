/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../../src/CollectionHolder"

import {CollectionHandlerByCollectionHolder}    from "../../src/handler/CollectionHandlerByCollectionHolder"
import {CollectionHandlerByCollectionHolderOf1} from "../../src/handler/CollectionHandlerByCollectionHolderOf1"
import {CollectionHandlerByCollectionHolderOf2} from "../../src/handler/CollectionHandlerByCollectionHolderOf2"
import {CollectionHolderFromArray}              from "../instance/CollectionHolderFromArray"
import {A, AB}                                  from "../value/arrays"

export function newCollectionHandler<const T, >(array: readonly T[],
                                                collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByCollectionHolder<T>(collection, new CollectionHolderFromArray(array,),)
}

export function newCollectionOf1Handler<const T = 'a', >(array: readonly T[] = A as unknown as readonly T[],
                                                         collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByCollectionHolderOf1(collection, new CollectionHolderFromArray(array,), array.length,)
}

export function newCollectionOf2Handler<const T = | 'a' | 'b', >(array: readonly T[] = AB as unknown as readonly T[],
                                                                 collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByCollectionHolderOf2(collection, new CollectionHolderFromArray(array,), array.length,)
}
