/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {Nullable}         from "../general type"

import {asLowerCaseString} from "./asString"

export function toLowerCaseString<const T, >(collection: Nullable<CollectionHolder<T>>,): string {
    if (collection == null)
        return "[]"
    if (collection.isEmpty)
        return "[]"

    let string = ""
    const sizeMinus1 = collection.size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asLowerCaseString(collection.get(index,),)}, `
    return `[${string}${asLowerCaseString(collection.get(index,),)}]`
}
