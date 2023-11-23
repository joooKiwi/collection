/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}         from "../CollectionHolder"
import type {NonEmptyCollectionHolder} from "../NonEmptyCollectionHolder"
import type {Nullable}                 from "../general type"

import {asLocaleString} from "./asString"

export function toLocaleString<const T, >(collection: Nullable<CollectionHolder<T>>, locale?: Nullable<string>,): string {
    if (collection == null)
        return "[]"
    if (collection.isEmpty)
        return "[]"

    if (locale == null)
        return __withNoLocale(collection as NonEmptyCollectionHolder<T>,)
    return __withLocale(collection as NonEmptyCollectionHolder<T>, locale,)
}


function __withNoLocale<const T, >(collection: NonEmptyCollectionHolder<T>,) {
    let string = ""
    const sizeMinus1 = collection.size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asLocaleString(collection.get(index,),)}, `
    return `[${string}${asLocaleString(collection.get(index,),)}]`
}

function __withLocale<const T, >(collection: NonEmptyCollectionHolder<T>, locale: string,) {
    let string = ""
    const sizeMinus1 = collection.size - 1
    let index = -1
    while (++index < sizeMinus1)
        string += `${asLocaleString(collection.get(index,), locale,)}, `
    return `[${string}${asLocaleString(collection.get(index,), locale,)}]`
}
