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

import type {CollectionIteratorOf1} from "../iterator/CollectionIteratorOf1"

import {AbstractUnimplementedCollectionIteratorOf1} from "../iterator/AbstractUnimplementedCollectionIteratorOf1"

/**
 * Tell that the value is a {@link CollectionIteratorOf1}
 * if it is an {@link AbstractUnimplementedCollectionIteratorOf1}
 *
 * @param value The value to identify
 * @see isCollectionIteratorOf1ByStructure
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isCollectionIteratorOf1<const T, const INSTANCE extends CollectionIteratorOf1<T> = CollectionIteratorOf1<T>, >(value: unknown,): value is INSTANCE {
    if (value == null)
        return false
    if (value instanceof AbstractUnimplementedCollectionIteratorOf1)
        return true
    return false
}
