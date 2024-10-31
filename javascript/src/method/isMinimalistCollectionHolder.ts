/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {AbstractMinimalistCollectionHolder} from "../AbstractMinimalistCollectionHolder"
import {EmptyCollectionHolder}              from "../EmptyCollectionHolder"

/**
 * Tell that the value is a {@link MinimalistCollectionHolder}
 * if it is an {@link AbstractMinimalistCollectionHolder} or an {@link EmptyCollectionHolder}
 *
 * @param value The value to identify
 * @see isMinimalistCollectionHolderByStructure
 */
export function isMinimalistCollectionHolder<const T, >(value: unknown,): value is MinimalistCollectionHolder<T> {
    if (value == null)
        return false
    if (value instanceof AbstractMinimalistCollectionHolder)
        return true
    if (value instanceof EmptyCollectionHolder)
        return true
    return false
}
