/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {CollectionHolder}            from "../../src/CollectionHolder"
import {GenericCollectionHolder}     from "../../src/GenericCollectionHolder"
import {CollectionHandlerByIterable} from "../../src/handler/CollectionHandlerByIterable"

import {newIterable} from "./newIterable"

export function newIterableHandler<const T, >(array: readonly T[], collection: CollectionHolder<T> = new GenericCollectionHolder(array,),) {
    return new CollectionHandlerByIterable<T>(collection, newIterable(array,),)
}
