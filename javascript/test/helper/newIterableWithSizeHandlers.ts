/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {CollectionHolder}                       from "../../src/CollectionHolder"
import {GenericCollectionHolder}                from "../../src/GenericCollectionHolder"
import {CollectionHandlerByIterableWithSize}    from "../../src/handler/CollectionHandlerByIterableWithSize"
import {CollectionHandlerByIterableWithSizeOf1} from "../../src/handler/CollectionHandlerByIterableWithSizeOf1"
import {CollectionHandlerByIterableWithSizeOf2} from "../../src/handler/CollectionHandlerByIterableWithSizeOf2"

import {A, AB}       from "../constantCollections"
import {newIterable} from "./newIterable"

export function newIterableWithSizeHandler<const T, >(array: readonly T[], collection: CollectionHolder<T> = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerByIterableWithSize<T>(collection, newIterable(array,), array.length,)
}

export function newIterableWithSizeOf1Handler(array: readonly unknown[] = A, collection: CollectionHolder = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerByIterableWithSizeOf1(collection, newIterable(array,), array.length,)
}

export function newIterableWithSizeOf2Handler(array: readonly unknown[] = AB, collection: CollectionHolder = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerByIterableWithSizeOf2(collection, newIterable(array,), array.length,)
}
