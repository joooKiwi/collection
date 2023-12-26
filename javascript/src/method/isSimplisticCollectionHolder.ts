/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {SimplisticCollectionHolder} from "../SimplisticCollectionHolder"

import {AbstractSimplisticCollectionHolder} from "../AbstractSimplisticCollectionHolder"
import {CollectionConstants}                from "../CollectionConstants"
import {EmptyCollectionHolder}              from "../EmptyCollectionHolder"

/**
 * Tell that the value is a {@link SimplisticCollectionHolder}.
 *
 * It does validate that it is
 *  - a {@link GenericSimplisticCollectionHolder}
 *  - an {@link EmptyCollectionHolder}
 *  - has the structure from the {@link CollectionConstants.EVERY_SIMPLISTIC_COLLECTION_METHODS simplistic collection methods}
 *
 * @param value The value to validate if it is a {@link SimplisticCollectionHolder}
 */
export function isSimplisticCollectionHolder<const T, >(value: unknown,): value is SimplisticCollectionHolder<T>
export function isSimplisticCollectionHolder(value: unknown,): boolean {
    if (value == null)
        return false

    if (value instanceof AbstractSimplisticCollectionHolder)
        return true
    if (value instanceof EmptyCollectionHolder)
        return true

    if (typeof value != "object")
        return false

    const everyMethods = CollectionConstants.EVERY_SIMPLISTIC_COLLECTION_METHODS
    const size = everyMethods.length
    let index = -1
    while (++index < size)
        if (!(everyMethods[index]! in value))
            return false
    return true
}
