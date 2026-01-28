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

import type {KeyOfIterator} from "../type/keyOf"

import {CollectionConstants} from "../CollectionConstants"

/**
 * Tell that the value has the structure of an {@link IteratorObject Iterator}
 *
 * @param value The value to identity
 * @see isIterator
 * @see CollectionConstants.ITERATOR_MEMBERS
 * @doesNotValidateTheTypes
 */
export function isIteratorByStructure(value: unknown,): value is (& object & Record<KeyOfIterator, unknown>)
/**
 * Tell that the value has the structure of an {@link IteratorObject Iterator}
 *
 * @param value The value to identity
 * @see isIterator
 * @see CollectionConstants.ITERATOR_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isIteratorByStructure<const T, const INSTANCE extends Iterator<T, unknown, unknown> = Iterator<T, unknown, unknown>, >(value: unknown,): value is INSTANCE
export function isIteratorByStructure(value: unknown,) {
    if (value == null)
        return false
    if (typeof value != "object")
        return false

    const members = CollectionConstants.ITERATOR_MEMBERS
    const size = members.length
    let index = -1
    while (++index < size)
        if (!(members[index]! in value))
            return false
    return true
}
