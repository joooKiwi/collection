/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"

import {AbstractCollectionHolder} from "../AbstractCollectionHolder"
import {EmptyCollectionHolder}    from "../EmptyCollectionHolder"

/**
 * Tell that the value is a {@link CollectionHolder}
 * if it is an {@link AbstractCollectionHolder} or an {@link EmptyCollectionHolder}
 *
 * @param value The value to identify
 * @see isCollectionHolderByStructure
 */
export function isCollectionHolder<const T, >(value: unknown,): value is CollectionHolder<T>
export function isCollectionHolder(value: unknown,) {
    if (value == null)
        return false
    if (value instanceof AbstractCollectionHolder)
        return true
    if (value instanceof EmptyCollectionHolder)
        return true
    return false
}
