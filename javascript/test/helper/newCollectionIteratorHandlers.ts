/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {CollectionHolder}                         from "../../src/CollectionHolder"
import {GenericCollectionHolder}                  from "../../src/GenericCollectionHolder"
import {CollectionHandlerByCollectionIterator}    from "../../src/handler/CollectionHandlerByCollectionIterator"
import {CollectionHandlerByCollectionIteratorOf1} from "../../src/handler/CollectionHandlerByCollectionIteratorOf1"
import {CollectionHandlerByCollectionIteratorOf2} from "../../src/handler/CollectionHandlerByCollectionIteratorOf2"
import {GenericCollectionIterator}                from "../../src/iterator/GenericCollectionIterator"

import {A, AB} from "../constantCollections"

export function newCollectionIteratorHandler<const T, >(array: readonly T[], collection: CollectionHolder<T> = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerByCollectionIterator<T>(collection, new GenericCollectionIterator(new GenericCollectionHolder(array,),),)
}

export function newCollectionIteratorOf1Handler(array: readonly unknown[] = A, collection: CollectionHolder = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerByCollectionIteratorOf1(collection, new GenericCollectionIterator(new GenericCollectionHolder(array,),), array.length,)
}

export function newCollectionIteratorOf2Handler(array: readonly unknown[] = AB, collection: CollectionHolder = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerByCollectionIteratorOf2(collection, new GenericCollectionIterator(new GenericCollectionHolder(array,),), array.length,)
}
