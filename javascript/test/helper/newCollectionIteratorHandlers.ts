/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../../src/CollectionHolder"

import {CollectionHandlerByCollectionIterator}    from "../../src/handler/CollectionHandlerByCollectionIterator"
import {CollectionHandlerByCollectionIteratorOf1} from "../../src/handler/CollectionHandlerByCollectionIteratorOf1"
import {CollectionHandlerByCollectionIteratorOf2} from "../../src/handler/CollectionHandlerByCollectionIteratorOf2"
import {GenericCollectionIterator}                from "../../src/iterator/GenericCollectionIterator"
import {CollectionHolderFromArray}                from "../instance/CollectionHolderFromArray"
import {A, AB}                                    from "../value/arrays"

export function newCollectionIteratorHandler<const T, >(array: readonly T[],
                                                        collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByCollectionIterator<T>(collection, new GenericCollectionIterator(new CollectionHolderFromArray(array,),),)
}

export function newCollectionIteratorOf1Handler<const T = 'a', >(array: readonly T[] = A as unknown as readonly T[],
                                                                 collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByCollectionIteratorOf1(collection, new GenericCollectionIterator(new CollectionHolderFromArray(array,),), array.length,)
}

export function newCollectionIteratorOf2Handler<const T = | 'a' | 'b', >(array: readonly T[] = AB as unknown as readonly T[],
                                                                 collection: CollectionHolder<T> = new CollectionHolderFromArray(array,),) {
    return new CollectionHandlerByCollectionIteratorOf2(collection, new GenericCollectionIterator(new CollectionHolderFromArray(array,),), array.length,)
}
