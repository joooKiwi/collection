/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}      from "../CollectionHolder"
import type {KeyOfCollectionHolder} from "../CollectionConstants.types"

import {CollectionConstants} from "../CollectionConstants"

/**
 * Tell that the value has the structure of a {@link CollectionHolder}
 *
 * @param value The value to identify
 * @see isCollectionHolder
 * @see CollectionConstants.COLLECTION_MEMBERS
 * @doesNotValidateTheTypes
 */
export function isCollectionHolderByStructure(value: unknown,): value is (& object & Record<KeyOfCollectionHolder, unknown>)
/**
 * Tell that the value has the structure of a {@link CollectionHolder}
 *
 * @param value The value to identify
 * @see isCollectionHolder
 * @see CollectionConstants.COLLECTION_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in Javascript
 */
export function isCollectionHolderByStructure<const T, >(value: unknown,): value is CollectionHolder<T>
export function isCollectionHolderByStructure(value: unknown,) {
    if (value == null)
        return false
    if (typeof value != "object")
        return false

    const members = CollectionConstants.COLLECTION_MEMBERS
    const size = members.length
    let index = -1
    while (++index < size)
        if (!(members[index]! in value))
            return false
    return true
}
