/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionIterator} from "../iterator/CollectionIterator"

import {CollectionConstants}       from "../CollectionConstants"
import {EmptyCollectionIterator}   from "../iterator/EmptyCollectionIterator"
import {GenericCollectionIterator} from "../iterator/GenericCollectionIterator"

/**
 * Tell that the value is a {@link CollectionIterator}.
 *
 * It does validate that it is
 *  - a {@link GenericCollectionIterator}
 *  - an {@link EmptyCollectionIterator}
 *  - has the structure from the {@link CollectionConstants.EVERY_ITERATOR_METHODS iterator methods}
 *
 * @param value The value to validate if it is a {@link CollectionIterator}
 */
export function isCollectionIterator<const T, >(value: unknown,): value is CollectionIterator<T>
export function isCollectionIterator(value: unknown,): boolean {
    if (value == null)
        return false

    if (value instanceof GenericCollectionIterator)
        return true
    if (value instanceof EmptyCollectionIterator)
        return true

    if (typeof value != "object")
        return false

    const everyMethods = CollectionConstants.EVERY_ITERATOR_METHODS
    const size = everyMethods.length
    let index = -1
    while (++index < size)
        if (!(everyMethods[index]! in value))
            return false
    return true
}
