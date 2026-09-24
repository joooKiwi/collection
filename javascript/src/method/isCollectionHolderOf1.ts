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

import type {CollectionHolderOf1} from "../CollectionHolderOf1"

import {AbstractUnimplementedCollectionHolderOf1} from "../AbstractUnimplementedCollectionHolderOf1"

/**
 * Tell that the value is a {@link CollectionHolderOf1}
 * if it is an {@link AbstractUnimplementedCollectionHolderOf1}
 *
 * @param value The value to identify
 * @see isCollectionHolderOf1ByStructure
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isCollectionHolderOf1<const T, const INSTANCE extends CollectionHolderOf1<T> = CollectionHolderOf1<T>, >(value: unknown,): value is INSTANCE {
    if (value == null)
        return false
    if (value instanceof AbstractUnimplementedCollectionHolderOf1)
        return true
    return false
}
