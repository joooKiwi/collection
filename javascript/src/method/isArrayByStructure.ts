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

import type {KeyOfArray} from "../type/keyOf"

/**
 * Tell that the value has the structure of an {@link ReadonlyArray Array}
 *
 * @param value The value to identify
 * @see isArray
 * @see CollectionConstants.ARRAY_MEMBERS
 * @doesNotValidateTheTypes
 */
export function isArrayByStructure(value: unknown,): value is (& object & Record<KeyOfArray, unknown>)
/**
 * Tell that the value has the structure of an {@link ReadonlyArray Array}
 *
 * @param value The value to identify
 * @see isArray
 * @see CollectionConstants.ARRAY_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isArrayByStructure<const T, const INSTANCE extends ReadonlyArray<T> = ReadonlyArray<T>, >(value: unknown,): value is INSTANCE
export function isArrayByStructure(value: unknown,) {
    if (value == null)
        return false
    if (typeof value != "object")
        return false
    if ("length" in value)
    if ("at" in value)
    if ("indexOf" in value)
    if ("lastIndexOf" in value)
    if ("every" in value)
    if ("some" in value)
    if ("with" in value)
    if ("join" in value)
    if ("filter" in value)
    if ("find" in value)
    if ("findLast" in value)
    if ("findIndex" in value)
    if ("findLastIndex" in value)
    if ("concat" in value)
    if ("reduce" in value)
    if ("reduceRight" in value)
    if ("flat" in value)
    if ("flatMap" in value)
    if ("map" in value)
    if ("forEach" in value)
    if ("keys" in value)
    if ("values" in value)
    if ("entries" in value)
    if (Symbol.iterator in value)
    if (Symbol.unscopables in value)
    if ("toReversed" in value)
    if ("toSorted" in value)
    if ("slice" in value)
    if ("toSpliced" in value)
    if ("toString" in value)
    if ("toLocaleString" in value)
        return true
    return false
}
