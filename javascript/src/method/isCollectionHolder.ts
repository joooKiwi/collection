/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"

import {CollectionConstants}         from "../CollectionConstants"
import {GenericCollectionHolder}     from "../GenericCollectionHolder"
import {LazyGenericCollectionHolder} from "../LazyGenericCollectionHolder"

/**
 * Tell that the value is a {@link CollectionHolder}
 * (by either a {@link GenericCollectionHolder} or a {@link LazyGenericCollectionHolder})
 * or by its structure (from the {@link CollectionConstants.EVERY_COLLECTION_METHODS})
 *
 * @param value The value to validate if it is a {@link CollectionHolder}
 */
export function isCollectionHolder<const T, >(value: unknown,): value is CollectionHolder<T>
export function isCollectionHolder(value: unknown,): boolean {
    if (value == null)
        return false
    if (value instanceof GenericCollectionHolder || value instanceof LazyGenericCollectionHolder)
        return true

    if (typeof value != "object")
        return false

    const everyMethods = CollectionConstants.EVERY_COLLECTION_METHODS,
        size = everyMethods.length
    let index = -1
    while (++index < size)
        if (!(everyMethods[index]! in value))
            return false
    return true
}
