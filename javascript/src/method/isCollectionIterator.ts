/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionIterator} from "../iterator/CollectionIterator"

import {AbstractCollectionIterator} from "../iterator/AbstractCollectionIterator"
import {EmptyCollectionIterator}    from "../iterator/EmptyCollectionIterator"

/**
 * Tell that the value is a {@link CollectionIterator}
 * if it is an {@link AbstractCollectionIterator} or an {@link EmptyCollectionIterator}
 *
 * @param value The value to identify
 * @see isCollectionIteratorByStructure
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isCollectionIterator<const T, const INSTANCE extends CollectionIterator<T> = CollectionIterator<T>, >(value: unknown,): value is INSTANCE {
    if (value == null)
        return false
    if (value instanceof AbstractCollectionIterator)
        return true
    if (value instanceof EmptyCollectionIterator)
        return true
    return false
}
