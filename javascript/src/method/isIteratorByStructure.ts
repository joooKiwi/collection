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

/**
 * Tell that the value has the structure of an {@link IteratorObject Iterator}
 *
 * @param value The value to identity
 * @see isIterator
 * @see MembersConstants.ITERATOR_MEMBERS
 * @doesNotValidateTheTypes
 */
export function isIteratorByStructure(value: unknown,): value is (& object & Record<KeyOfIterator, unknown>)
/**
 * Tell that the value has the structure of an {@link IteratorObject Iterator}
 *
 * @param value The value to identity
 * @see isIterator
 * @see MembersConstants.ITERATOR_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isIteratorByStructure<const T, const INSTANCE extends Iterator<T, unknown, unknown> = Iterator<T, unknown, unknown>, >(value: unknown,): value is INSTANCE
export function isIteratorByStructure(value: unknown,) {
    if (value == null)
        return false
    if (typeof value != "object")
        return false
    if ("next" in value)
    if ("every" in value)
    if ("some" in value)
    if ("find" in value)
    if ("filter" in value)
    if ("reduce" in value)
    if ("take" in value)
    if ("drop" in value)
    if ("forEach" in value)
    if ("map" in value)
    if ("flatMap" in value)
    if ("toArray" in value)
    if (Symbol.iterator in value)
    if (Symbol.toStringTag in value)
        return true
    return false
}
