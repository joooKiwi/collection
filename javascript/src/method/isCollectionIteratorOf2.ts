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

import type {CollectionIteratorOf2} from "../iterator/CollectionIteratorOf2"

import {AbstractUnimplementedCollectionIteratorOf2} from "../iterator/AbstractUnimplementedCollectionIteratorOf2"

/**
 * Tell that the value is a {@link CollectionIteratorOf2}
 * if it is an {@link AbstractUnimplementedCollectionIteratorOf2}
 *
 * @param value The value to identify
 * @see isCollectionIteratorOf2ByStructure
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isCollectionIteratorOf2<const T1, const T2, const INSTANCE extends CollectionIteratorOf2<T1, T2> = CollectionIteratorOf2<T1, T2>, >(value: unknown,): value is INSTANCE {
    if (value == null)
        return false
    if (value instanceof AbstractUnimplementedCollectionIteratorOf2)
        return true
    return false
}
