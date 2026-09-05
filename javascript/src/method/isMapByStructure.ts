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

import type {Map} from "@joookiwi/type"

import type {KeyOfMap} from "../type/keyOf"

/**
 * Tell that the value has the structure of an {@link ReadonlyMap Map}
 *
 * @param value The value to identify
 * @see isMap
 * @see CollectionConstants.MAP_MEMBERS
 * @doesNotValidateTheTypes
 */
export function isMapByStructure(value: unknown,): value is (& object & Record<KeyOfMap, unknown>)
/**
 * Tell that the value has the structure of an {@link ReadonlyMap Map}
 *
 * @param value The value to identify
 * @see isMap
 * @see CollectionConstants.MAP_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isMapByStructure<K, const INSTANCE extends Map<K, unknown> = Map<K, unknown>, >(value: unknown,): value is INSTANCE
/**
 * Tell that the value has the structure of an {@link ReadonlyMap Map}
 *
 * @param value The value to identify
 * @see isMap
 * @see CollectionConstants.MAP_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isMapByStructure<const K, V, const INSTANCE extends Map<K, V> = Map<K, V>, >(value: unknown,): value is INSTANCE
export function isMapByStructure(value: unknown,) {
    if (value == null)
        return false
    if (typeof value != "object")
        return false
    if ("size" in value)
    if ("get" in value)
    if ("has" in value)
    if ("forEach" in value)
    if ("keys" in value)
    if ("values" in value)
    if ("entries" in value)
    if (Symbol.iterator in value)
        return true
    return false
}
