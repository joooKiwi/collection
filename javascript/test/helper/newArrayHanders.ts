/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {CollectionHolder}            from "../../src/CollectionHolder"
import {GenericCollectionHolder}     from "../../src/GenericCollectionHolder"
import {CollectionHandlerByArray}    from "../../src/handler/CollectionHandlerByArray"
import {CollectionHandlerByArrayOf1} from "../../src/handler/CollectionHandlerByArrayOf1"
import {CollectionHandlerByArrayOf2} from "../../src/handler/CollectionHandlerByArrayOf2"

import {A, AB} from "../constantCollections"

export function newArrayHandler<const T, >(array: readonly T[], collection: CollectionHolder<T> = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerByArray<T>(collection, array,)
}

export function newArrayOf1Handler(array: readonly unknown[] = A, collection: CollectionHolder = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerByArrayOf1(collection, array,)
}

export function newArrayOf2Handler(array: readonly unknown[] = AB, collection: CollectionHolder = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerByArrayOf2(collection, array,)
}
