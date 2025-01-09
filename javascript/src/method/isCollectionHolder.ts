//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {CollectionHolder} from "../CollectionHolder"

import {AbstractCollectionHolder} from "../AbstractCollectionHolder"
import {EmptyCollectionHolder}    from "../EmptyCollectionHolder"

/**
 * Tell that the value is a {@link CollectionHolder}
 * if it is an {@link AbstractCollectionHolder} or an {@link EmptyCollectionHolder}
 *
 * @param value The value to identify
 * @see isCollectionHolderByStructure
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isCollectionHolder<const T, const INSTANCE extends CollectionHolder<T> = CollectionHolder<T>, >(value: unknown,): value is INSTANCE {
    if (value == null)
        return false
    if (value instanceof AbstractCollectionHolder)
        return true
    if (value instanceof EmptyCollectionHolder)
        return true
    return false
}
