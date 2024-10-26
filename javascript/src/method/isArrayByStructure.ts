/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {KeyOfArray} from "../CollectionConstants.types"

import {CollectionConstants} from "../CollectionConstants"

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
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in Javascript
 */
export function isArrayByStructure<const T, >(value: unknown,): value is ReadonlyArray<T>
export function isArrayByStructure(value: unknown,) {
    if (value == null)
        return false
    if (typeof value != "object")
        return false

    const members = CollectionConstants.ARRAY_MEMBERS
    const size = members.length
    let index = -1
    while (++index < size)
        if (!(members[index]! in value))
            return false
    return true
}
