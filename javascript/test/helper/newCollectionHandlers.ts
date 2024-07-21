/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {CollectionHolder}                       from "../../src/CollectionHolder"
import {GenericCollectionHolder}                from "../../src/GenericCollectionHolder"
import {CollectionHandlerByCollectionHolder}    from "../../src/handler/CollectionHandlerByCollectionHolder"
import {CollectionHandlerByCollectionHolderOf1} from "../../src/handler/CollectionHandlerByCollectionHolderOf1"
import {CollectionHandlerByCollectionHolderOf2} from "../../src/handler/CollectionHandlerByCollectionHolderOf2"

import {A, AB} from "../constantCollections"

export function newCollectionHandler<const T, >(array: readonly T[], collection: CollectionHolder<T> = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerByCollectionHolder<T>(collection, new GenericCollectionHolder(array,),)
}

export function newCollectionOf1Handler(array: readonly unknown[] = A, collection: CollectionHolder = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerByCollectionHolderOf1(collection, new GenericCollectionHolder(array,), array.length,)
}

export function newCollectionOf2Handler(array: readonly unknown[] = AB, collection: CollectionHolder = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerByCollectionHolderOf2(collection, new GenericCollectionHolder(array,), array.length,)
}
