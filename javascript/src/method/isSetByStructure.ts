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

import type {Set} from "@joookiwi/type"

import type {KeyOfSet} from "../type/keyOf"

/**
 * Tell that the value has the structure of an {@link ReadonlySet Set}
 *
 * @param value The value to identify
 * @see isSet
 * @see MembersConstants.SET_MEMBERS
 * @doesNotValidateTheTypes
 */
export function isSetByStructure(value: unknown,): value is (& object & Record<KeyOfSet, unknown>)
/**
 * Tell that the value has the structure of an {@link ReadonlySet Set}
 *
 * @param value The value to identify
 * @see isSet
 * @see MembersConstants.SET_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isSetByStructure<const T, const INSTANCE extends Set<T> = Set<T>, >(value: unknown,): value is INSTANCE
export function isSetByStructure(value: unknown,) {
    if (value == null)
        return false
    if (typeof value != "object")
        return false
    if ("size" in value)
    if ("has" in value)
    if ("forEach" in value)
    if ("keys" in value)
    if ("values" in value)
    if ("entries" in value)
    if ("union" in value)
    if ("intersection" in value)
    if ("difference" in value)
    if ("symmetricDifference" in value)
    if ("isSubsetOf" in value)
    if ("isSupersetOf" in value)
    if ("isDisjointFrom" in value)
    if (Symbol.iterator in value)
        return true
    return false
}
