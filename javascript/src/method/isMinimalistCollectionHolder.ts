//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"

import {AbstractMinimalistCollectionHolder} from "../AbstractMinimalistCollectionHolder"
import {EmptyCollectionHolder}              from "../EmptyCollectionHolder"

/**
 * Tell that the value is a {@link MinimalistCollectionHolder}
 * if it is an {@link AbstractMinimalistCollectionHolder} or an {@link EmptyCollectionHolder}
 *
 * @param value The value to identify
 * @see isMinimalistCollectionHolderByStructure
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isMinimalistCollectionHolder<const T, const INSTANCE extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(value: unknown,): value is INSTANCE {
    if (value == null)
        return false
    if (value instanceof AbstractMinimalistCollectionHolder)
        return true
    if (value instanceof EmptyCollectionHolder)
        return true
    return false
}
