/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"

import {AbstractCollectionHolder}    from "../AbstractCollectionHolder"
import {CollectionConstants}         from "../CollectionConstants"
import {EmptyCollectionHolder}       from "../EmptyCollectionHolder"

/**
 * Tell that the value is a {@link CollectionHolder}.
 *
 * It does validate that it is
 *  - a {@link GenericCollectionHolder}
 *  - a {@link LazyGenericCollectionHolder}
 *  - an {@link EmptyCollectionHolder}
 *  - has the structure from the {@link CollectionConstants.EVERY_COLLECTION_METHODS collection methods}
 *
 * @param value The value to validate if it is a {@link CollectionHolder}
 */
export function isCollectionHolder<const T, >(value: unknown,): value is CollectionHolder<T>
export function isCollectionHolder(value: unknown,): boolean {
    if (value == null)
        return false

    if (value instanceof AbstractCollectionHolder)
        return true
    if (value instanceof EmptyCollectionHolder)
        return true

    if (typeof value != "object")
        return false

    const everyMethods = CollectionConstants.EVERY_COLLECTION_METHODS
    const size = everyMethods.length
    let index = -1
    while (++index < size)
        if (!(everyMethods[index]! in value))
            return false
    return true
}
