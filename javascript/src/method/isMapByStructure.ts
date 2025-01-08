/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {KeyOfMap} from "../type/keyOf"

import {CollectionConstants} from "../CollectionConstants"

/**
 * Tell that the value has the structure of an {@link ReadonlyMap Map}
 *
 * @param value The value to identify
 * @see isMap
 * @see CollectionConstants.MAP_MEMBERS
 * @doesNotValidateTheTypes
 */
export function isWeakSetByStructure(value: unknown,): value is (& object & Record<KeyOfMap, unknown>)
/**
 * Tell that the value has the structure of an {@link ReadonlyMap Map}
 *
 * @param value The value to identify
 * @see isMap
 * @see CollectionConstants.MAP_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isWeakSetByStructure<K, const INSTANCE extends ReadonlyMap<K, unknown> = ReadonlyMap<K, unknown>, >(value: unknown,): value is INSTANCE
/**
 * Tell that the value has the structure of an {@link ReadonlyMap Map}
 *
 * @param value The value to identify
 * @see isMap
 * @see CollectionConstants.MAP_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isWeakSetByStructure<const K, V, const INSTANCE extends ReadonlyMap<K, V> = ReadonlyMap<K, V>, >(value: unknown,): value is INSTANCE
export function isWeakSetByStructure(value: unknown,) {
    if (value == null)
        return false
    if (typeof value != "object")
        return false

    const members = CollectionConstants.MAP_MEMBERS
    const size = members.length
    let index = -1
    while (++index < size)
        if (!(members[index]! in value))
            return false
    return true
}
