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

import type {KeyOfTypedArray} from "../type/keyOf"
import type {TypedArray}      from "../type/TypedArray"

/**
 * Tell that the value has the structure of an {@link TypedArray}
 *
 * @param value The value to identify
 * @see isTypedArray
 * @see MembersConstants.TYPED_ARRAY_MEMBERS
 * @doesNotValidateTheTypes
 */
export function isTypedArrayByStructure(value: unknown,): value is (& object & Record<KeyOfTypedArray, unknown>)
/**
 * Tell that the value has the structure of an {@link TypedArray}
 *
 * @param value The value to identify
 * @see isTypedArray
 * @see MembersConstants.TYPED_ARRAY_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isTypedArrayByStructure<const INSTANCE extends TypedArray, >(value: unknown,): value is INSTANCE
export function isTypedArrayByStructure(value: unknown,) {
    if (value == null)
        return false
    if (typeof value != "object")
        return false
    if ("length" in value)
    if ("at" in value)
    if ("set" in value)
    if ("buffer" in value)
    if ("BYTES_PER_ELEMENT" in value)
    if ("byteLength" in value)
    if ("byteOffset" in value)
    if ("indexOf" in value)
    if ("lastIndexOf" in value)
    if ("includes" in value)
    if ("every" in value)
    if ("some" in value)
    if ("with" in value)
    if ("join" in value)
    if ("filter" in value)
    if ("find" in value)
    if ("findLast" in value)
    if ("findIndex" in value)
    if ("findLastIndex" in value)
    if ("reduce" in value)
    if ("reduceRight" in value)
    if ("map" in value)
    if ("forEach" in value)
    if ("keys" in value)
    if ("values" in value)
    if ("entries" in value)
    if (Symbol.iterator in value)
    if ("copyWithin" in value)
    if ("fill" in value)
    if ("reverse" in value)
    if ("toReversed" in value)
    if ("sort" in value)
    if ("toSorted" in value)
    if ("slice" in value)
    if ("subarray" in value)
    if ("valueOf" in value)
    if ("toString" in value)
    if ("toLocaleString" in value)
        return true
    return false
}
