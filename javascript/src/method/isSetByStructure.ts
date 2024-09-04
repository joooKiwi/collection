/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {CollectionConstants} from "../CollectionConstants"

/**
 * Tell that the value has the structure of an {@link ReadonlySet Set}
 *
 * @param value The value to identify
 * @see isArray
 * @see CollectionConstants.SET_MEMBERS
 * @doesNotValidateTheTypes
 */
export function isSetByStructure(value: unknown,): value is (& object & Record<keyof ReadonlySet<unknown>, unknown>)
/**
 * Tell that the value has the structure of an {@link ReadonlySet Set}
 *
 * @param value The value to identify
 * @see isArray
 * @see CollectionConstants.SET_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in Javascript
 */
export function isSetByStructure<const T, >(value: unknown,): value is ReadonlySet<T>
export function isSetByStructure(value: unknown,) {
    if (value == null)
        return false
    if (typeof value != "object")
        return false

    const members = CollectionConstants.SET_MEMBERS
    const size = members.length
    let index = -1
    while (++index < size)
        if (!(members[index]! in value))
            return false
    return true
}
