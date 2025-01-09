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

import type {KeyOfTypedArray} from "../type/keyOf"
import type {TypedArray}      from "../type/TypedArray"

import {CollectionConstants} from "../CollectionConstants"

/**
 * Tell that the value has the structure of an {@link TypedArray}
 *
 * @param value The value to identify
 * @see isTypedArray
 * @see CollectionConstants.TYPED_ARRAY_MEMBERS
 * @doesNotValidateTheTypes
 */
export function isTypedArrayByStructure(value: unknown,): value is (& object & Record<KeyOfTypedArray, unknown>)
/**
 * Tell that the value has the structure of an {@link TypedArray}
 *
 * @param value The value to identify
 * @see isTypedArray
 * @see CollectionConstants.TYPED_ARRAY_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isTypedArrayByStructure<const INSTANCE extends TypedArray, >(value: unknown,): value is INSTANCE
export function isTypedArrayByStructure(value: unknown,) {
    if (value == null)
        return false
    if (typeof value != "object")
        return false

    const members = CollectionConstants.TYPED_ARRAY_MEMBERS
    const size = members.length
    let index = -1
    while (++index < size)
        if (!(members[index]! in value))
            return false
    return true
}
