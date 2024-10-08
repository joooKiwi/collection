/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionIterator} from "../iterator/CollectionIterator"

import {CollectionConstants} from "../CollectionConstants"

/**
 * Tell that the value has the structure of a {@link CollectionIterator}
 *
 * @param value The value to identity
 * @see isCollectionIterator
 * @see CollectionConstants.ITERATOR_MEMBERS
 * @doesNotValidateTheTypes
 */
export function isCollectionIteratorByStructure(value: unknown,): value is (& object & Record<keyof CollectionIterator, unknown>)
/**
 * Tell that the value has the structure of a {@link CollectionIterator}
 *
 * @param value The value to identity
 * @see isCollectionIterator
 * @see CollectionConstants.ITERATOR_MEMBERS
 * @doesNotValidateTheTypes
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in Javascript
 */
export function isCollectionIteratorByStructure<const T, >(value: unknown,): value is CollectionIterator<T>
export function isCollectionIteratorByStructure(value: unknown,): boolean {
    if (value == null)
        return false
    if (typeof value != "object")
        return false

    const members = CollectionConstants.COLLECTION_ITERATOR_MEMBERS
    const size = members.length
    let index = -1
    while (++index < size)
        if (!(members[index]! in value))
            return false
    return true
}
