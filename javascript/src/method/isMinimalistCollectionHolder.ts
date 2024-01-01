/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {AbstractMinimalistCollectionHolder} from "../AbstractMinimalistCollectionHolder"
import {CollectionConstants}                from "../CollectionConstants"
import {EmptyCollectionHolder}              from "../EmptyCollectionHolder"

/**
 * Tell that the value is a {@link MinimalistCollectionHolder}.
 *
 * It does validate that it is
 *  - a {@link GenericMinimalistCollectionHolder}
 *  - an {@link EmptyCollectionHolder}
 *  - has the structure from the {@link CollectionConstants.EVERY_SIMPLISTIC_COLLECTION_METHODS simplistic collection methods}
 *
 * @param value The value to validate if it is a {@link MinimalistCollectionHolder}
 */
export function isMinimalistCollectionHolder<const T, >(value: unknown,): value is MinimalistCollectionHolder<T>
export function isMinimalistCollectionHolder(value: unknown,): boolean {
    if (value == null)
        return false

    if (value instanceof AbstractMinimalistCollectionHolder)
        return true
    if (value instanceof EmptyCollectionHolder)
        return true

    if (typeof value != "object")
        return false

    const everyMethods = CollectionConstants.EVERY_MINIMALIST_COLLECTION_METHODS
    const size = everyMethods.length
    let index = -1
    while (++index < size)
        if (!(everyMethods[index]! in value))
            return false
    return true
}
