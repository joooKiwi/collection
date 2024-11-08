/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {MinimalistCollectionHolder}      from "../MinimalistCollectionHolder"
import type {KeyOfMinimalistCollectionHolder} from "../type/keyOf"

import {CollectionConstants} from "../CollectionConstants"

/**
 * Tell that the value has the structure of a {@link MinimalistCollectionHolder}
 *
 * @param value The value to identify
 * @see isMinimalistCollectionHolder
 * @see CollectionConstants.MINIMALIST_COLLECTION_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isMinimalistCollectionHolderByStructure(value: unknown,): value is (& object & Record<KeyOfMinimalistCollectionHolder, unknown>)
/**
 * Tell that the value has the structure of a {@link MinimalistCollectionHolder}
 *
 * @param value The value to identify
 * @see isMinimalistCollectionHolder
 * @see CollectionConstants.MINIMALIST_COLLECTION_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isMinimalistCollectionHolderByStructure<const T, const INSTANCE extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >(value: unknown,): value is INSTANCE
export function isMinimalistCollectionHolderByStructure(value: unknown,) {
    if (value == null)
        return false

    if (typeof value != "object")
        return false

    const everyMethods = CollectionConstants.MINIMALIST_COLLECTION_MEMBERS
    const size = everyMethods.length
    let index = -1
    while (++index < size)
        if (!(everyMethods[index]! in value))
            return false
    return true
}
