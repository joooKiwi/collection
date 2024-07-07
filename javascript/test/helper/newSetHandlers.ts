/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {CollectionHolder}          from "../../src/CollectionHolder"
import {GenericCollectionHolder}   from "../../src/GenericCollectionHolder"
import {CollectionHandlerBySet}    from "../../src/handler/CollectionHandlerBySet"
import {CollectionHandlerBySetOf1} from "../../src/handler/CollectionHandlerBySetOf1"
import {CollectionHandlerBySetOf2} from "../../src/handler/CollectionHandlerBySetOf2"

import {A, AB} from "../constantCollections"

export function newSetHandler<const T, >(array: readonly T[], collection: CollectionHolder<T> = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerBySet<T>(collection, new Set(array,),)
}

export function newSetOf1Handler(array: readonly unknown[] = A, collection: CollectionHolder = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerBySetOf1(collection, new Set(array,),)
}

export function newSetOf2Handler(array: readonly unknown[] = AB, collection: CollectionHolder = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerBySetOf2(collection, new Set(array,),)
}
