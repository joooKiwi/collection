/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionIterator} from "../iterator/CollectionIterator"

import {GenericCollectionIterator}  from "../iterator/GenericCollectionIterator"
import {EmptyCollectionIterator}    from "../iterator/EmptyCollectionIterator"

/**
 * Tell that the value is a {@link CollectionIterator}
 * if it is an {@link AbstractCollectionIterator} or an {@link EmptyCollectionIterator}
 *
 * @param value The value to identify
 * @see isCollectionIteratorByStructure
 */
export function isCollectionIterator<const T, >(value: unknown,): value is CollectionIterator<T>
export function isCollectionIterator(value: unknown,): boolean {
    if (value == null)
        return false
    if (value instanceof GenericCollectionIterator)
        return true
    if (value instanceof EmptyCollectionIterator)
        return true
    return false
}
