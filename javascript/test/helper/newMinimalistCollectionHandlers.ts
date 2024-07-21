/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {CollectionHolder}                                 from "../../src/CollectionHolder"
import {GenericCollectionHolder}                          from "../../src/GenericCollectionHolder"
import {GenericMinimalistCollectionHolder}                from "../../src/GenericMinimalistCollectionHolder"
import {CollectionHandlerByMinimalistCollectionHolder}    from "../../src/handler/CollectionHandlerByMinimalistCollectionHolder"
import {CollectionHandlerByMinimalistCollectionHolderOf1} from "../../src/handler/CollectionHandlerByMinimalistCollectionHolderOf1"
import {CollectionHandlerByMinimalistCollectionHolderOf2} from "../../src/handler/CollectionHandlerByMinimalistCollectionHolderOf2"

import {A, AB} from "../constantCollections"

export function newMinimalistCollectionHandler<const T, >(array: readonly T[], collection: CollectionHolder<T> = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerByMinimalistCollectionHolder<T>(collection, new GenericMinimalistCollectionHolder(array,),)
}

export function newMinimalistCollectionOf1Handler(array: readonly unknown[] = A, collection: CollectionHolder = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerByMinimalistCollectionHolderOf1(collection, new GenericMinimalistCollectionHolder(array,), array.length,)
}

export function newMinimalistCollectionOf2Handler(array: readonly unknown[] = AB, collection: CollectionHolder = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerByMinimalistCollectionHolderOf2(collection, new GenericMinimalistCollectionHolder(array,), array.length,)
}
