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

import type {KeyOfWeakSet} from "../type/keyOf"

import {CollectionConstants} from "../CollectionConstants"

/**
 * Tell that the value has the structure of an {@link WeakSet}
 *
 * @param value The value to identify
 * @see isWeakSet
 * @see CollectionConstants.WEAK_SET_MEMBERS
 * @doesNotValidateTheTypes
 */
export function isWeakSetByStructure(value: unknown,): value is (& object & Record<KeyOfWeakSet, unknown>)
/**
 * Tell that the value has the structure of an {@link WeakSet}
 *
 * @param value The value to identify
 * @see isWeakSet
 * @see CollectionConstants.WEAK_SET_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isWeakSetByStructure<T extends WeakKey, const INSTANCE extends Readonly<WeakSet<T>> = Readonly<WeakSet<T>>, >(value: unknown,): value is INSTANCE
export function isWeakSetByStructure(value: unknown,) {
    if (value == null)
        return false
    if (typeof value != "object")
        return false

    const members = CollectionConstants.WEAK_SET_MEMBERS
    const size = members.length
    let index = -1
    while (++index < size)
        if (!(members[index]! in value))
            return false
    return true
}
